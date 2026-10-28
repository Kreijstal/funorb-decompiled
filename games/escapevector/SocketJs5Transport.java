/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    static String[] field_q;
    static sf field_r;
    static int field_s;
    private BufferedSocket socket;

    final void attachConnection(Object connection, boolean loggedIn, byte guard) {
        try {
          String stackIn_40_2 = null;
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var6 = EscapeVector.obfuscationControl;
          try {
            if (null != this.socket) {
              try {
                this.socket.close(12497);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Exception var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
            if (guard >= -80) {
              return;
            }
            this.socket = (BufferedSocket) (connection);
            this.sendControlHandshake(78);
            this.sendLoginState(loggedIn, false);
            this.currentRequest = null;
            this.incomingHeader.position = 0;
            scanLoop1: while (true) {
              boolean decompiledFrameRemainder0 = true;
              Js5NetworkRequest var4_ref = (Js5NetworkRequest) (this.urgentInFlight.removeFirst((byte) -75));
              if (var4_ref != null) {
                this.urgentPending.addLast(-1, var4_ref);
                if (var6 != 0) {
                  if (var4_ref != null) {
                    this.prefetchPending.addLast(-1, var4_ref);
                    break scanLoop1;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                while (true) {
                  Js5NetworkRequest var4_refLifetime1 = (Js5NetworkRequest) (this.prefetchInFlight.removeFirst((byte) -75));
                  if (var4_refLifetime1 == null) {
                    break;
                  }
                  this.prefetchPending.addLast(-1, var4_refLifetime1);
                  if (var6 != 0) {
                    break scanLoop1;
                  }
                }
              }
              if (this.xorKey != 0) {
                try {
                  this.outgoingControl.position = 0;
                  this.outgoingControl.writeByte(4, -123);
                  this.outgoingControl.writeByte((int) this.xorKey, -123);
                  this.outgoingControl.writeInt((byte) 125, 0);
                  this.socket.write(this.outgoingControl.payload.length, 0, this.outgoingControl.payload, 5000);
                  decompiledRegionSelector0 = false;
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  IOException var4_ref2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    this.socket.close(12497);
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    Exception var5 = (Exception) (Object) decompiledCaughtException;
                  }
                  this.failureCount = this.failureCount + 1;
                  this.lastErrorCode = -2;
                  this.socket = null;
                  decompiledRegionSelector0 = true;
                }
                if (decompiledRegionSelector0) {
                }
              }
              break;
            }
            this.idleMillis = 0;
            this.lastServiceMillis = td.b(128);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            RuntimeException var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_39_0 = var4_ref3;
            StringBuilder stackIn_39_1 = new StringBuilder().append("bk.F(");
            if (connection == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(loggedIn).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_q = null;
          if (guard != -24811) {
            field_q = (String[]) null;
          }
          field_r = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "bk.Q(" + guard + ')');
        }
    }

    private final void sendLoginState(boolean loggedIn, boolean guard) {
        try {
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          try {
            if (null == this.socket) {
              return;
            }
            try {
              this.outgoingControl.position = 0;
              PacketBuffer stackIn_5_0 = this.outgoingControl;
              stackIn_6_1 = (!loggedIn) ? (3) : (2);
              ((PacketBuffer) (Object) stackIn_5_0).writeByte(stackIn_6_1, -123);
              this.outgoingControl.writeLong40(0L, 125);
              if (guard) {
                SocketJs5Transport.readContactUpdate(90);
              }
              this.socket.write(this.outgoingControl.payload.length, 0, this.outgoingControl.payload, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.socket.close(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                Exception var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
              this.lastErrorCode = -2;
              this.failureCount = this.failureCount + 1;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var3_ref), "bk.N(" + loggedIn + ',' + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static HighscoreQuery requestHighscores(int boardId, boolean guard, int queryKind, int opcode, int rowLimit) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int var6 = EscapeVector.obfuscationControl;
        try {
          HighscoreQuery var5 = (HighscoreQuery) (AchievementRecord.field_n.first(false));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5))) {
            stackIn_11_0 = ~boardId;
            stackIn_11_1 = ~var5.boardId;
            if (var6 == 0) {
              if (stackIn_11_0 == stackIn_11_1) {
                HighscoreQuery stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var5 = (HighscoreQuery) (AchievementRecord.field_n.next((byte) 70));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = guard ? 1 : 0;
            stackIn_11_1 = 1;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            field_q = (String[]) null;
          }
          HighscoreQuery var5Lifetime1 = new HighscoreQuery();
          var5Lifetime1.field_j = rowLimit;
          var5Lifetime1.boardId = boardId;
          var5Lifetime1.field_h = queryKind;
          AchievementRecord.field_n.addLast(-12328, var5Lifetime1);
          AccountSessionSupport.writeHighscoreQuery(124, opcode, var5Lifetime1);
          HighscoreQuery stackIn_15_0 = var5Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5_ref), "bk.K(" + boardId + ',' + guard + ',' + queryKind + ',' + opcode + ',' + rowLimit + ')');
        }
    }

    final void resetAfterIntegrityFailure(byte guard) {
        Throwable decompiledCaughtException = null;
        try {
          try {
            this.socket.close(12497);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var2 = (Exception) (Object) decompiledCaughtException;
          }
          this.failureCount = this.failureCount + 1;
          if (guard >= -108) {
            SocketJs5Transport.releaseStatics(-33);
          }
          this.lastErrorCode = -1;
          this.socket = null;
          this.xorKey = (byte)(int)(1.0 + 255.0 * Math.random());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "bk.B(" + guard + ')');
        }
    }

    final void close(int guard) {
        try {
          if (guard != 0) {
            this.close(-28);
          }
          if (this.socket != null) {
            this.socket.close(12497);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "bk.E(" + guard + ')');
        }
    }

    final static int floorDivideByPositive(int divisor, boolean guard, int value) {
        try {
          if (guard) {
            int stackIn_2_0 = 36;
            return stackIn_2_0;
          }
          int var3_int = value >>> 31;
          int stackIn_4_0 = (value + var3_int) / divisor - var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "bk.P(" + divisor + ',' + guard + ',' + value + ')');
        }
    }

    final static void readContactUpdate(int guard) {
        ContactEntry stackIn_63_0 = null;
        ContactEntry stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int var8 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var1 = QuickChatDynamicCommand.incomingPackets;
          int var2 = var1.readUnsignedByte(guard ^ 0);
          if (guard == var2) {
            if (null == ml.field_a) {
              ml.field_a = new SecondaryNodeHashTable(128);
              RegistrationRequestDialog.field_Ab = 0;
            }
            boolean stackIn_12_0 = !(var1.readUnsignedByte(0) != 1);
            boolean var3_int = stackIn_12_0;
            String var4_ref_String = var1.readString(false);
            if (var3_int) {
              var1.readString(false);
            }
            ContactEntry var5 = AnimatedPanelFrame.findContactByName(var4_ref_String, (byte) -125);
            String var6 = var1.readString(false);
            String var7 = sf.a(-123, (CharSequence) ((Object) var4_ref_String));
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = AnimatedPanelFrame.findContactByName(var6, (byte) 114);
              if (null != var5) {
                ml.field_a.put((long)var7.hashCode(), var5, 26);
              }
            }
            if (null == var5) {
              var5 = new ContactEntry();
              ml.field_a.put((long)var7.hashCode(), var5, 37);
              int fieldTemp$0 = RegistrationRequestDialog.field_Ab;
              RegistrationRequestDialog.field_Ab = RegistrationRequestDialog.field_Ab + 1;
              var5.insertionOrder = fieldTemp$0;
              jd.field_a.addLast(-12328, var5);
            }
            var5.displayName = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (RasterSnapshot.field_g == 1) {
                RasterSnapshot.field_g = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (RasterSnapshot.field_g == 2) {
                RasterSnapshot.field_g = 1;
              }
              return;
            }
            if (4 != var2) {
              pf.a(false, "F1: " + LoginStage.formatPacketDiagnostic((byte) -76), (Throwable) null);
              nm.a(16);
              return;
            }
            RasterSnapshot.field_g = 1;
            Object var3 = var1.readString(false);
            di.field_f = ((String) (var3)).intern();
            int var4 = var1.readUnsignedByte(0);
            ii.a((byte) 16, var4);
            return;
          }
          if (NameAvailabilityResultSupport.field_b == null) {
            NameAvailabilityResultSupport.field_b = new SecondaryNodeHashTable(128);
            ua.field_a = 0;
          }
          Object var3Lifetime1 = var1.readString(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          String var4_ref_StringLifetime1 = var1.readString(false);
          String var5_ref = var1.readString(false);
          ContactEntry var6_ref = LoginCredentialType.findFriendByName(guard ^ -1465, var4_ref_StringLifetime1);
          if (var6_ref == null) {
            var6_ref = LoginCredentialType.findFriendByName(-1465, var5_ref);
            if (var6_ref != null) {
              NameAvailabilityResultSupport.field_b.put((long)sf.a(-88, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, 25);
            }
          }
          if (null == var6_ref) {
            var6_ref = new ContactEntry();
            NameAvailabilityResultSupport.field_b.put((long)sf.a(-109, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, guard ^ 123);
            int fieldTemp$1 = ua.field_a;
            ua.field_a = ua.field_a + 1;
            var6_ref.insertionOrder = fieldTemp$1;
            ji.field_c.addLast(-12328, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.displayName = var4_ref_StringLifetime1;
          var6_ref.location = (String) (var3Lifetime1);
          var6_ref.unlink((byte) -14);
          ContactEntry var7_ref = (ContactEntry) (ji.field_c.first(false));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7457;
              decompiledFrameRemainder0 = (var8 == 0);
              if (decompiledFrameRemainder0 &&
                EscapeVector.isContactAfter(stackIn_63_0, stackIn_63_1, stackIn_63_2)) {
                var7_ref = (ContactEntry) (ji.field_c.next((byte) 70));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break scanLoop1;
              }
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7;
            }
            EscapeVector.insertNodeBeforeWithIntGuard((IntrusiveNode) (stackIn_63_0), (IntrusiveNode) (stackIn_63_1), stackIn_63_2);
            if (var8 == 0) {
              return;
            }
            break;
          }
          ji.field_c.addLast(guard ^ -12328, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "bk.M(" + guard + ')');
        }
    }

    private final void sendControlHandshake(int guard) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (null == this.socket) {
              return;
            }
            try {
              this.outgoingControl.position = 0;
              this.outgoingControl.writeByte(6, -123);
              int var2_int = 45 % ((-48 - guard) / 39);
              this.outgoingControl.writeMedium(1743120456, 3);
              this.outgoingControl.writeShort(82, 0);
              this.socket.write(this.outgoingControl.payload.length, 0, this.outgoingControl.payload, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var2 = (IOException) (Object) decompiledCaughtException;
              try {
                this.socket.close(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.failureCount = this.failureCount + 1;
              this.lastErrorCode = -2;
              this.socket = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref), "bk.L(" + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean processNetwork(int guard) {
        try {
          int stackIn_122_0 = 0;
          int stackIn_143_0 = 0;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          Js5NetworkRequest var14_ref = null;
          int var16 = EscapeVector.obfuscationControl;
          try {
            if (null != this.socket) {
              long var2_long = td.b(guard + 4122);
              var4 = (int)(-this.lastServiceMillis + var2_long);
              this.lastServiceMillis = var2_long;
              if (var4 > 200) {
                var4 = 200;
              }
              this.idleMillis = this.idleMillis + var4;
              if (30000 < this.idleMillis) {
                try {
                  this.socket.close(guard + 16491);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  Exception var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.socket = null;
              }
            }
            if (null == this.socket) {
              if (0 == this.urgentCount(true) &&
                this.prefetchCount((byte) 88) == 0) {
                return true;
              }
              return false;
            }
            try {
              this.socket.checkWriteError((byte) 123);
              Js5NetworkRequest var2 = (Js5NetworkRequest) (this.urgentPending.first(0));
              scanLoop1: while (true) {
                if (var2 != null) {
                  this.outgoingControl.position = 0;
                  this.outgoingControl.writeByte(1, -123);
                  this.outgoingControl.writeLong40(var2.secondaryKey, -118);
                  this.socket.write(this.outgoingControl.payload.length, 0, this.outgoingControl.payload, 5000);
                  this.urgentInFlight.addLast(guard + 3993, var2);
                  var2 = (Js5NetworkRequest) (this.urgentPending.next((byte) -101));
                  if (var16 != 0) {
                    break scanLoop1;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                var2 = (Js5NetworkRequest) (this.prefetchPending.first(guard ^ guard));
                break;
              }
              while (var2 != null) {
                this.outgoingControl.position = 0;
                this.outgoingControl.writeByte(0, -123);
                this.outgoingControl.writeLong40(var2.secondaryKey, -3);
                this.socket.write(this.outgoingControl.payload.length, 0, this.outgoingControl.payload, 5000);
                this.prefetchInFlight.addLast(-1, var2);
                var2 = (Js5NetworkRequest) (this.prefetchPending.next((byte) -43));
                if (var16 == 0) {
                  continue;
                }
                break;
              }
              int var2_int = 0;
              scanLoop2: while (true) {
                if (var2_int < 100) {
                  int var3_int = this.socket.available(guard + 3876);
                  stackIn_143_0 = var3_int;
                  if (var16 != 0) {
                    break scanLoop2;
                  }
                  if (stackIn_143_0 < 0) {
                    throw new IOException();
                  }
                  if (var3_int != 0) {
                    this.idleMillis = 0;
                    var4 = 0;
                    if (this.currentRequest == null) {
                      var4 = 10;
                      if (var16 != 0 &&
                        this.currentRequest.blockOffset == 0) {
                        var4 = 1;
                      }
                    } else if (this.currentRequest.blockOffset == 0) {
                      var4 = 1;
                    }
                    boolean decompiledFrameRemainder1 = true;
                    if (var4 <= 0) {
                      int var5 = this.currentRequest.responseBuffer.payload.length - this.currentRequest.paddingBytes;
                      int var6 = -this.currentRequest.blockOffset + 512;
                      if ((-this.currentRequest.responseBuffer.position + var5) < var6) {
                        var6 = var5 - this.currentRequest.responseBuffer.position;
                      }
                      if (var6 > var3_int) {
                        var6 = var3_int;
                      }
                      boolean decompiledFrameCompleted4 = true;
                      this.socket.readFully(this.currentRequest.responseBuffer.position, var6, this.currentRequest.responseBuffer.payload, (byte) -49);
                      if (this.xorKey != 0) {
                        int var7 = 0;
                        while (var6 > var7) {
                          this.currentRequest.responseBuffer.payload[var7 + this.currentRequest.responseBuffer.position] = (byte)PacketBuffer.xor((int) this.currentRequest.responseBuffer.payload[var7 + this.currentRequest.responseBuffer.position], (int) this.xorKey);
                          var7++;
                          if (var16 != 0) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted4) {
                        this.currentRequest.blockOffset = this.currentRequest.blockOffset + var6;
                        this.currentRequest.responseBuffer.position = this.currentRequest.responseBuffer.position + var6;
                      }
                      if (~var5 == ~this.currentRequest.responseBuffer.position) {
                        this.currentRequest.unlinkSecondary(-110);
                        this.currentRequest.field_u = false;
                        this.currentRequest = null;
                        decompiledFrameRemainder1 = (var16 != 0);
                      }
                      if (decompiledFrameRemainder1 &&
                        (decompiledFrameRemainder1 = (this.currentRequest.blockOffset == 512))) {
                        this.currentRequest.blockOffset = 0;
                      }
                    }
                    if (decompiledFrameRemainder1 &&
                      (!(var4 <= 0) ||
                      var16 != 0)) {
                      int var5Lifetime1 = var4 - this.incomingHeader.position;
                      if (var3_int < var5Lifetime1) {
                        var5Lifetime1 = var3_int;
                      }
                      boolean decompiledFrameCompleted3 = true;
                      this.socket.readFully(this.incomingHeader.position, var5Lifetime1, this.incomingHeader.payload, (byte) -49);
                      if (this.xorKey != 0) {
                        int var6Lifetime1 = 0;
                        while (var6Lifetime1 < var5Lifetime1) {
                          this.incomingHeader.payload[var6Lifetime1 + this.incomingHeader.position] = (byte)PacketBuffer.xor((int) this.incomingHeader.payload[var6Lifetime1 + this.incomingHeader.position], (int) this.xorKey);
                          var6Lifetime1++;
                          if (var16 != 0) {
                            decompiledFrameCompleted3 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted3) {
                        this.incomingHeader.position = this.incomingHeader.position + var5Lifetime1;
                      }
                      if (this.incomingHeader.position >= var4) {
                        if (this.currentRequest == null) {
                          this.incomingHeader.position = 0;
                          int var6Lifetime1Lifetime1 = this.incomingHeader.readUnsignedByte(0);
                          int var7Lifetime1 = this.incomingHeader.readInt(-5053);
                          int var8 = this.incomingHeader.readUnsignedByte(0);
                          int var9 = this.incomingHeader.readInt(-5053);
                          int var10 = var8 & 127;
                          boolean stackIn_95_0 = !(0 == (128 & var8));
                          boolean decompiledFrameCompleted2 = true;
                          boolean decompiledFrameCompleted0 = true;
                          boolean decompiledFrameRemainder0 = true;
                          boolean decompiledFrameCompleted1 = true;
                          boolean var11 = stackIn_95_0;
                          long var12 = (long)var7Lifetime1 + ((long)var6Lifetime1Lifetime1 << 32);
                          Object var14 = null;
                          if (var11) {
                            var14_ref = (Js5NetworkRequest) (this.prefetchInFlight.first(0));
                            while (var14_ref != null) {
                              stackIn_122_0 = compareLongs(var12, var14_ref.secondaryKey);
                              if (var16 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              var14_ref = (Js5NetworkRequest) (this.prefetchInFlight.next((byte) 106));
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                            }
                          }
                          if (decompiledFrameRemainder0 &&
                            decompiledFrameCompleted2 &&
                            decompiledFrameCompleted1) {
                            var14_ref = (Js5NetworkRequest) (this.urgentInFlight.first(0));
                            while (null != var14_ref) {
                              stackIn_122_0 = compareLongs(~var12, ~var14_ref.secondaryKey);
                              if (var16 != 0) {
                                decompiledFrameCompleted0 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                break;
                              }
                              var14_ref = (Js5NetworkRequest) (this.urgentInFlight.next((byte) -52));
                              if (var16 == 0) {
                                continue;
                              }
                              break;
                            }
                          }
                          if (decompiledFrameCompleted2 &&
                            decompiledFrameCompleted0) {
                            if (null == var14_ref) {
                              throw new IOException();
                            }
                            this.currentRequest = var14_ref;
                            stackIn_122_0 = -1;
                          }
                          int stackIn_126_0 = (stackIn_122_0 != ~var10) ? 9 : 5;
                          int var15 = stackIn_126_0;
                          this.currentRequest.responseBuffer = new PacketBuffer(var15 + (var9 + this.currentRequest.paddingBytes));
                          this.currentRequest.responseBuffer.writeByte(var10, -123);
                          this.currentRequest.responseBuffer.writeInt((byte) 125, var9);
                          this.currentRequest.blockOffset = 10;
                          this.incomingHeader.position = 0;
                          decompiledFrameRemainder1 = (var16 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (0 == this.currentRequest.blockOffset) {
                            if (this.incomingHeader.payload[0] != -1) {
                              this.currentRequest = null;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              this.incomingHeader.position = 0;
                              this.currentRequest.blockOffset = 1;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            throw new IOException();
                          }
                        }
                      }
                    }
                    var2_int++;
                    if (var16 == 0) {
                      continue;
                    }
                  }
                }
                stackIn_143_0 = 1;
                break;
              }
              return stackIn_143_0 != 0;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              IOException var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.socket.close(12497);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
              this.lastErrorCode = -2;
              this.failureCount = this.failureCount + 1;
              if (this.urgentCount(true) == 0 &&
                this.prefetchCount((byte) 88) == 0) {
                return true;
              }
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref2), "bk.I(" + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Object storeBytes(boolean copy, byte[] bytes, int guard) {
        String stackIn_18_2 = null;
        try {
          if (guard != 9) {
            Object stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (null == bytes) {
            Object stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (bytes.length > 136) {
            DirectByteStorage var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).setBytes(true, bytes);
            DirectByteStorage stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (copy) {
            byte[] stackIn_13_0 = AccountRequestDialog.copyByteArray(guard - 9, bytes);
            return stackIn_13_0;
          }
          byte[] stackIn_11_0 = (byte[]) (bytes);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("bk.O(").append(copy).append(',');
          if (bytes == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    public SocketJs5Transport() {
    }

    static {
        field_q = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.<delay><br>Your mission is complete."};
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
