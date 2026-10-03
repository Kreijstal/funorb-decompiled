/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketArchiveNetworkClient extends ArchiveNetworkClient {
    static ValidationState field_w;
    private BufferedSocket socket;
    static int field_t;
    static float field_x;
    static String loginUsernameTooltipText;
    static int[] field_s;

    public static void i(int param0) {
        field_s = null;
        if (param0 > -69) {
            return;
        }
        loginUsernameTooltipText = null;
        field_w = null;
    }

    final boolean pollResponses(byte methodGuard) {
        try {
            int receiveIteration = 0;
            int backgroundFlagBeforeMatch = 0;
            int archiveHeaderSizeBeforeAllocation = 0;
            Throwable caughtTransportFailure = null;
            long currentTimeMillis = 0L;
            NetworkArchiveRequest requestToSend = null;
            IOException pollIoFailure = null;
            int availableBytes = 0;
            Exception closeFailureAfterPollError = null;
            int elapsedMillisOrHeaderTargetBytes = 0;
            Exception timeoutCloseFailure = null;
            int responseLimitOrHeaderReadLength = 0;
            int bodyReadLengthOrHeaderXorIndexOrArchiveId = 0;
            int bodyXorStartSnapshotOrGroupId = 0;
            int compressionAndQueueFlags = 0;
            int packedLength = 0;
            int compressionType = 0;
            int backgroundResponseFlag = 0;
            long responseKey = 0L;
            Object unusedResponseMatchSnapshot = null;
            NetworkArchiveRequest matchedRequest = null;
            int archiveHeaderSize = 0;
            int unusedClientGuardSnapshot = 0;
            int bodyXorByteIndex = 0;
            unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
            if (this.socket != null) {
              currentTimeMillis = oa.a(-12520);
              elapsedMillisOrHeaderTargetBytes = (int)(-this.lastPollMillis + currentTimeMillis);
              if (elapsedMillisOrHeaderTargetBytes > 200) {
                elapsedMillisOrHeaderTargetBytes = 200;
              }
              this.lastPollMillis = currentTimeMillis;
              this.responseIdleMillis = this.responseIdleMillis + elapsedMillisOrHeaderTargetBytes;
              if (this.responseIdleMillis > 30000) {
                try {
                  this.socket.close(methodGuard ^ -43);
                } catch (java.lang.Exception timeoutCloseException) {
                  caughtTransportFailure = timeoutCloseException;
                  timeoutCloseFailure = (Exception) (Object) caughtTransportFailure;
                }
                this.socket = null;
              }
            }
            if (this.socket == null) {
              if ((this.countPriorityRequests(-78) == 0) &&
                  (0 == this.countBackgroundRequests(false))) {
                return true;
              }
              return false;
            }
            try {
              this.socket.checkWriteFailure(-108);
              requestToSend = (NetworkArchiveRequest) ((Object) this.pendingPriorityRequests.firstForIteration((byte) 121));
              while (requestToSend != null) {
                this.outboundPacketBuffer.position = 0;
                this.outboundPacketBuffer.writeByte((byte) -54, 1);
                this.outboundPacketBuffer.writeLong40BE((byte) -127, requestToSend.secondaryKey);
                this.socket.enqueueWrite(100, 0, this.outboundPacketBuffer.bytes.length, this.outboundPacketBuffer.bytes);
                this.sentPriorityRequests.addLast(-93, requestToSend);
                requestToSend = (NetworkArchiveRequest) ((Object) this.pendingPriorityRequests.nextForIteration(methodGuard ^ 41));
              }
              requestToSend = (NetworkArchiveRequest) ((Object) this.pendingBackgroundRequests.firstForIteration((byte) 121));
              if (methodGuard != 95) {
                this.resetAfterValidationFailure(-90);
              }
              while (requestToSend != null) {
                this.outboundPacketBuffer.position = 0;
                this.outboundPacketBuffer.writeByte((byte) 8, 0);
                this.outboundPacketBuffer.writeLong40BE((byte) -127, requestToSend.secondaryKey);
                this.socket.enqueueWrite(100, 0, this.outboundPacketBuffer.bytes.length, this.outboundPacketBuffer.bytes);
                this.sentBackgroundRequests.addLast(112, requestToSend);
                requestToSend = (NetworkArchiveRequest) ((Object) this.pendingBackgroundRequests.nextForIteration(54));
              }
              for (receiveIteration = 0; receiveIteration < 100; receiveIteration++) {
                availableBytes = this.socket.available((byte) 82);
                if (availableBytes < 0) {
                  throw new IOException();
                }
                if (availableBytes == 0) {
                  return true;
                }
                this.responseIdleMillis = 0;
                elapsedMillisOrHeaderTargetBytes = 0;
                if (this.currentResponseRequest != null) {
                  if (this.currentResponseRequest.blockPosition == 0) {
                    elapsedMillisOrHeaderTargetBytes = 1;
                  }
                } else {
                  elapsedMillisOrHeaderTargetBytes = 10;
                }
                if (0 >= elapsedMillisOrHeaderTargetBytes) {
                  responseLimitOrHeaderReadLength = this.currentResponseRequest.responseBuffer.bytes.length - this.currentResponseRequest.reservedTailBytes;
                  bodyReadLengthOrHeaderXorIndexOrArchiveId = 512 - this.currentResponseRequest.blockPosition;
                  if (-this.currentResponseRequest.responseBuffer.position + responseLimitOrHeaderReadLength < bodyReadLengthOrHeaderXorIndexOrArchiveId) {
                    bodyReadLengthOrHeaderXorIndexOrArchiveId = -this.currentResponseRequest.responseBuffer.position + responseLimitOrHeaderReadLength;
                  }
                  if (bodyReadLengthOrHeaderXorIndexOrArchiveId > availableBytes) {
                    bodyReadLengthOrHeaderXorIndexOrArchiveId = availableBytes;
                  }
                  this.socket.readFully(this.currentResponseRequest.responseBuffer.bytes, (byte) -97, this.currentResponseRequest.responseBuffer.position, bodyReadLengthOrHeaderXorIndexOrArchiveId);
                  if (this.responseXorKey != 0) {
                    bodyXorByteIndex = 0;
                    bodyXorStartSnapshotOrGroupId = bodyXorByteIndex;
                    while (bodyReadLengthOrHeaderXorIndexOrArchiveId > bodyXorByteIndex) {
                      this.currentResponseRequest.responseBuffer.bytes[this.currentResponseRequest.responseBuffer.position + bodyXorByteIndex] = (byte)EmailAvailabilityQuery.xorInt((int) this.currentResponseRequest.responseBuffer.bytes[this.currentResponseRequest.responseBuffer.position + bodyXorByteIndex], (int) this.responseXorKey);
                      bodyXorByteIndex++;
                    }
                  }
                  this.currentResponseRequest.blockPosition = this.currentResponseRequest.blockPosition + bodyReadLengthOrHeaderXorIndexOrArchiveId;
                  this.currentResponseRequest.responseBuffer.position = this.currentResponseRequest.responseBuffer.position + bodyReadLengthOrHeaderXorIndexOrArchiveId;
                  if (responseLimitOrHeaderReadLength == this.currentResponseRequest.responseBuffer.position) {
                    this.currentResponseRequest.unlinkSecondaryNode((byte) 57);
                    this.currentResponseRequest.pending = false;
                    this.currentResponseRequest = null;
                  } else {
                    if (this.currentResponseRequest.blockPosition == 512) {
                      this.currentResponseRequest.blockPosition = 0;
                    }
                  }
                } else {
                  responseLimitOrHeaderReadLength = -this.responseHeaderBuffer.position + elapsedMillisOrHeaderTargetBytes;
                  if (responseLimitOrHeaderReadLength > availableBytes) {
                    responseLimitOrHeaderReadLength = availableBytes;
                  }
                  this.socket.readFully(this.responseHeaderBuffer.bytes, (byte) -97, this.responseHeaderBuffer.position, responseLimitOrHeaderReadLength);
                  if (this.responseXorKey != 0) {
                    for (bodyReadLengthOrHeaderXorIndexOrArchiveId = 0; bodyReadLengthOrHeaderXorIndexOrArchiveId < responseLimitOrHeaderReadLength; bodyReadLengthOrHeaderXorIndexOrArchiveId++) {
                      this.responseHeaderBuffer.bytes[this.responseHeaderBuffer.position + bodyReadLengthOrHeaderXorIndexOrArchiveId] = (byte)EmailAvailabilityQuery.xorInt((int) this.responseHeaderBuffer.bytes[this.responseHeaderBuffer.position + bodyReadLengthOrHeaderXorIndexOrArchiveId], (int) this.responseXorKey);
                    }
                  }
                  this.responseHeaderBuffer.position = this.responseHeaderBuffer.position + responseLimitOrHeaderReadLength;
                  if (this.responseHeaderBuffer.position >= elapsedMillisOrHeaderTargetBytes) {
                    if (null == this.currentResponseRequest) {
                      this.responseHeaderBuffer.position = 0;
                      bodyReadLengthOrHeaderXorIndexOrArchiveId = this.responseHeaderBuffer.readUnsignedByte((byte) 34);
                      bodyXorStartSnapshotOrGroupId = this.responseHeaderBuffer.readIntBE((byte) -90);
                      compressionAndQueueFlags = this.responseHeaderBuffer.readUnsignedByte((byte) 34);
                      packedLength = this.responseHeaderBuffer.readIntBE((byte) -61);
                      compressionType = compressionAndQueueFlags & 127;
                      backgroundFlagBeforeMatch = ((128 & compressionAndQueueFlags) == 0) ? 0 : 1;
                      L18: {
                        backgroundResponseFlag = backgroundFlagBeforeMatch;
                        responseKey = (long)bodyXorStartSnapshotOrGroupId + ((long)bodyReadLengthOrHeaderXorIndexOrArchiveId << 32);
                        unusedResponseMatchSnapshot = null;
                        if (backgroundResponseFlag != 0) {
                          matchedRequest = (NetworkArchiveRequest) ((Object) this.sentBackgroundRequests.firstForIteration((byte) 121));
                          while (matchedRequest != null) {
                            if (responseKey == matchedRequest.secondaryKey) {
                              break L18;
                            }
                            matchedRequest = (NetworkArchiveRequest) ((Object) this.sentBackgroundRequests.nextForIteration(-30));
                          }
                          break L18;
                        }
                        matchedRequest = (NetworkArchiveRequest) ((Object) this.sentPriorityRequests.firstForIteration((byte) 121));
                        while (matchedRequest != null) {
                          if (~responseKey == ~matchedRequest.secondaryKey) {
                            break;
                          }
                          matchedRequest = (NetworkArchiveRequest) ((Object) this.sentPriorityRequests.nextForIteration(72));
                        }
                      }
                      if (matchedRequest == null) {
                        throw new IOException();
                      }
                      this.currentResponseRequest = matchedRequest;
                      archiveHeaderSizeBeforeAllocation = (0 != compressionType) ? 9 : 5;
                      archiveHeaderSize = archiveHeaderSizeBeforeAllocation;
                      this.currentResponseRequest.responseBuffer = new ByteArrayBuffer(packedLength + archiveHeaderSize + this.currentResponseRequest.reservedTailBytes);
                      this.currentResponseRequest.responseBuffer.writeByte((byte) -26, compressionType);
                      this.currentResponseRequest.responseBuffer.writeIntBE((byte) 95, packedLength);
                      this.responseHeaderBuffer.position = 0;
                      this.currentResponseRequest.blockPosition = 10;
                    } else {
                      if (0 != this.currentResponseRequest.blockPosition) {
                        throw new IOException();
                      }
                      if (-1 == this.responseHeaderBuffer.bytes[0]) {
                        this.responseHeaderBuffer.position = 0;
                        this.currentResponseRequest.blockPosition = 1;
                      } else {
                        this.currentResponseRequest = null;
                      }
                    }
                  }
                }
              }
              return true;
            } catch (java.io.IOException pollIOException) {
              caughtTransportFailure = pollIOException;
              pollIoFailure = (IOException) (Object) caughtTransportFailure;
              try {
                this.socket.close(-122);
              } catch (java.lang.Exception pollErrorCloseException) {
                caughtTransportFailure = pollErrorCloseException;
                closeFailureAfterPollError = (Exception) (Object) caughtTransportFailure;
              }
              this.failureCount = this.failureCount + 1;
              this.failureCode = -2;
              this.socket = null;
              if ((0 == this.countPriorityRequests(methodGuard - 216)) &&
                  (this.countBackgroundRequests(false) == 0)) {
                return true;
              }
              return false;
            }
        } catch (RuntimeException | Error uncheckedPollFailure) {
            throw uncheckedPollFailure;
        } catch (Throwable checkedPollFailure) {
            throw new RuntimeException(checkedPollFailure);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if ((var3_int >= 1) &&
              (12 >= var3_int)) {
            var4 = ResizableDialog.a(param1, param2 ^ 122);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if ((!gg.a((byte) -62, var4.charAt(0))) &&
                (!gg.a((byte) -98, var4.charAt(-1 + var4.length())))) {
              var5 = 0;
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (!gg.a((byte) -93, (char) var7)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if ((var5 >= 2) &&
                    (!param0)) {
                  return false;
                }
              }
              if (param2 != 118) {
                return false;
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("kk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    final static ResourceArchive createResourceArchive(int archiveId, byte methodGuard) {
        if (methodGuard != -62) {
            SocketArchiveNetworkClient.i(118);
        }
        return IntKeyLookup.createResourceArchive(methodGuard - 10, archiveId, false, 1, true, false);
    }

    public SocketArchiveNetworkClient() {
    }

    final void attachSocket(Object socketObject, boolean methodGuard, boolean useControlOpcode2) {
        try {
            RuntimeException attachmentFailureBeforeContext = null;
            StringBuilder attachmentMessagePrefix = null;
            String socketDescription = null;
            Throwable caughtAttachmentFailure = null;
            Exception oldSocketCloseFailure = null;
            NetworkArchiveRequest requestToRequeue = null;
            IOException xorSetupIoFailure = null;
            RuntimeException attachmentFailureForContext = null;
            Exception xorSetupCloseFailure = null;
            int unusedClientGuardSnapshot = 0;
            unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
            try {
              if (null != this.socket) {
                try {
                  this.socket.close(-120);
                } catch (java.lang.Exception oldSocketCloseException) {
                  caughtAttachmentFailure = oldSocketCloseException;
                  oldSocketCloseFailure = (Exception) (Object) caughtAttachmentFailure;
                }
                this.socket = null;
              }
              this.socket = (BufferedSocket) (socketObject);
              this.sendSetupPacket((byte) -113);
              this.sendControlPacket(methodGuard, useControlOpcode2);
              this.responseHeaderBuffer.position = 0;
              this.currentResponseRequest = null;
              while (true) {
                requestToRequeue = (NetworkArchiveRequest) ((Object) this.sentPriorityRequests.removeFirst(true));
                if (requestToRequeue != null) {
                  this.pendingPriorityRequests.addLast(-74, requestToRequeue);
                  continue;
                }
                if (methodGuard) {
                  field_t = 110;
                }
                while (true) {
                  requestToRequeue = (NetworkArchiveRequest) ((Object) this.sentBackgroundRequests.removeFirst(true));
                  if (requestToRequeue != null) {
                    this.pendingBackgroundRequests.addLast(116, requestToRequeue);
                    continue;
                  }
                  if (this.responseXorKey != 0) {
                    try {
                      this.outboundPacketBuffer.position = 0;
                      this.outboundPacketBuffer.writeByte((byte) -62, 4);
                      this.outboundPacketBuffer.writeByte((byte) 122, (int) this.responseXorKey);
                      this.outboundPacketBuffer.writeIntBE((byte) 95, 0);
                      this.socket.enqueueWrite(100, 0, this.outboundPacketBuffer.bytes.length, this.outboundPacketBuffer.bytes);
                    } catch (java.io.IOException xorSetupIOException) {
                      caughtAttachmentFailure = xorSetupIOException;
                      xorSetupIoFailure = (IOException) (Object) caughtAttachmentFailure;
                      try {
                        this.socket.close(-126);
                      } catch (java.lang.Exception xorSetupCloseException) {
                        caughtAttachmentFailure = xorSetupCloseException;
                        xorSetupCloseFailure = (Exception) (Object) caughtAttachmentFailure;
                      }
                      this.failureCode = -2;
                      this.failureCount = this.failureCount + 1;
                      this.socket = null;
                    }
                  }
                  this.responseIdleMillis = 0;
                  this.lastPollMillis = oa.a(-12520);
                  return;
                }
              }
            } catch (java.lang.RuntimeException attachmentRuntimeException) {
              caughtAttachmentFailure = attachmentRuntimeException;
              attachmentFailureForContext = (RuntimeException) (Object) caughtAttachmentFailure;
              attachmentFailureBeforeContext = attachmentFailureForContext;
              attachmentMessagePrefix = new StringBuilder().append("kk.C(");
              if (socketObject == null) {
                socketDescription = "null";
              } else {
                socketDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) attachmentFailureBeforeContext), ((StringBuilder) (Object) attachmentMessagePrefix).append(socketDescription).append(',').append(methodGuard).append(',').append(useControlOpcode2).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedAttachmentFailure) {
            throw uncheckedAttachmentFailure;
        } catch (Throwable checkedAttachmentFailure) {
            throw new RuntimeException(checkedAttachmentFailure);
        }
    }

    final void closeSocket(int methodGuard) {
        if (methodGuard > -50) {
            field_w = (ValidationState) null;
        }
        if (!(this.socket == null)) {
            this.socket.close(-123);
        }
    }

    private final void sendSetupPacket(byte methodGuard) {
        try {
            Throwable caughtSetupFailure = null;
            IOException setupIoFailure = null;
            Exception setupCloseFailure = null;
            if (this.socket == null) {
              return;
            }
            try {
              this.outboundPacketBuffer.position = 0;
              this.outboundPacketBuffer.writeByte((byte) 126, 6);
              this.outboundPacketBuffer.writeMediumBE(-12, 3);
              this.outboundPacketBuffer.writeShortBE(0, 28695);
              this.socket.enqueueWrite(100, 0, this.outboundPacketBuffer.bytes.length, this.outboundPacketBuffer.bytes);
              if (methodGuard > -56) {
                SocketArchiveNetworkClient.createResourceArchive(-8, (byte) 62);
              }
            } catch (java.io.IOException setupIOException) {
              caughtSetupFailure = setupIOException;
              setupIoFailure = (IOException) (Object) caughtSetupFailure;
              try {
                this.socket.close(-121);
              } catch (java.lang.Exception setupCloseException) {
                caughtSetupFailure = setupCloseException;
                setupCloseFailure = (Exception) (Object) caughtSetupFailure;
              }
              this.socket = null;
              this.failureCode = -2;
              this.failureCount = this.failureCount + 1;
            }
        } catch (RuntimeException | Error uncheckedSetupFailure) {
            throw uncheckedSetupFailure;
        } catch (Throwable checkedSetupFailure) {
            throw new RuntimeException(checkedSetupFailure);
        }
    }

    final void resetAfterValidationFailure(int methodGuard) {
        try {
            this.socket.close(methodGuard ^ -106);
        } catch (Exception ignoredCloseFailure) {
        }
        if (methodGuard != 20) {
            return;
        }
        this.failureCount = this.failureCount + 1;
        this.failureCode = -1;
        this.socket = null;
        this.responseXorKey = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void sendControlPacket(boolean methodGuard, boolean useControlOpcode2) {
        try {
            ByteArrayBuffer controlBufferBeforeOpcode = null;
            int opcodeWriterGuard = 0;
            int controlOpcode = 0;
            Throwable caughtControlFailure = null;
            IOException controlIoFailure = null;
            Exception controlCloseFailure = null;
            if (null == this.socket) {
              return;
            }
            try {
              this.outboundPacketBuffer.position = 0;
              controlBufferBeforeOpcode = this.outboundPacketBuffer;
              opcodeWriterGuard = 124;
              if (useControlOpcode2) {
                controlOpcode = 2;
              } else {
                controlOpcode = 3;
              }
              ((ByteArrayBuffer) (Object) controlBufferBeforeOpcode).writeByte((byte) opcodeWriterGuard, controlOpcode);
              this.outboundPacketBuffer.writeLong40BE((byte) -127, 0L);
              this.socket.enqueueWrite(100, 0, this.outboundPacketBuffer.bytes.length, this.outboundPacketBuffer.bytes);
              if (methodGuard) {
                this.sendControlPacket(false, false);
              }
            } catch (java.io.IOException controlIOException) {
              caughtControlFailure = controlIOException;
              controlIoFailure = (IOException) (Object) caughtControlFailure;
              try {
                this.socket.close(-126);
              } catch (java.lang.Exception controlCloseException) {
                caughtControlFailure = controlCloseException;
                controlCloseFailure = (Exception) (Object) caughtControlFailure;
              }
              this.socket = null;
              this.failureCode = -2;
              this.failureCount = this.failureCount + 1;
            }
        } catch (RuntimeException | Error uncheckedControlFailure) {
            throw uncheckedControlFailure;
        } catch (Throwable checkedControlFailure) {
            throw new RuntimeException(checkedControlFailure);
        }
    }

    static {
        field_w = new ValidationState();
        loginUsernameTooltipText = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new int[]{1, 2, 5, 3, 3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 3, 10, 3};
    }
}
