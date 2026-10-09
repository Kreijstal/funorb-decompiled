/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasResizeController {
    private int fallbackWidth;
    private int fallbackHeight;
    private int maximumHeight;
    private int resizeCountdownTicks;
    static String createPasswordConfirmationText;
    private int requestedHeight;
    private int restoreHeight;
    private int minimumHeapMiB;
    private int requestedWidth;
    private int maximumWidth;
    private int minimumWidth;
    private int restoreWidth;
    private float aspectRatio;
    static java.awt.Color bootstrapProgressColor;
    private int minimumHeight;
    static String pendingNavigationTarget;
    private CanvasResizeListener resizeListener;
    private int resizeIntervalTicks;
    static String tutorialSkipMessage;
    private boolean resizePending;
    static ClientProtocolStage awaitingUsernameSuggestionsStage;
    static long lastSessionSocketWriteMillis;

    public static void releaseStaticReferences(boolean methodGuard) {
        tutorialSkipMessage = null;
        createPasswordConfirmationText = null;
        awaitingUsernameSuggestionsStage = null;
        if (methodGuard) {
            bootstrapProgressColor = null;
            pendingNavigationTarget = null;
            return;
        }
        byte[] unusedNullArchiveBytesSnapshot = (byte[]) null;
        CanvasResizeController.decompressArchive((byte[]) null, -18);
        bootstrapProgressColor = null;
        pendingNavigationTarget = null;
    }

    final void setRequestedSize(byte methodGuard, int height, int width) {
        this.requestedWidth = width;
        if (methodGuard < 125) {
            this.updateResize((byte) 31);
            this.requestedHeight = height;
            return;
        }
        this.requestedHeight = height;
    }

    final static byte[] decompressArchive(byte[] packedBytes, int uncompressedTypeComplement) {
        byte[] uncompressedBytesBeforeReturn = null;
        byte[] decompressedBytesBeforeReturn = null;
        RuntimeException unpackFailureBeforeContext = null;
        StringBuilder unpackMessagePrefix = null;
        String packedBytesDescription = null;
        Throwable caughtUnpackFailure = null;
        RuntimeException unpackFailureForContext = null;
        int compressionType = 0;
        int packedLength = 0;
        int unpackedLength = 0;
        byte[] uncompressedBytes = null;
        byte[] decompressedBytes = null;
        Object gzipInflaterMonitor = null;
        ByteArrayBuffer buffer = null;
        byte[] uncompressedBytesAlias = null;
        byte[] decompressedBytesAlias = null;
        byte[] allocatedUncompressedBytes = null;
        byte[] allocatedDecompressedBytes = null;
        try {
          buffer = new ByteArrayBuffer(packedBytes);
          compressionType = buffer.readUnsignedByte((byte) 34);
          packedLength = buffer.readIntBE((byte) -97);
          if ((packedLength >= 0) && (FullscreenFailureReason.maximumArchiveLength == 0 ||
              !(packedLength > FullscreenFailureReason.maximumArchiveLength))) {
            if (uncompressedTypeComplement == ~compressionType) {
              allocatedUncompressedBytes = new byte[packedLength];
              uncompressedBytesAlias = allocatedUncompressedBytes;
              uncompressedBytes = uncompressedBytesAlias;
              buffer.readBytes(29915, packedLength, allocatedUncompressedBytes, 0);
              uncompressedBytesBeforeReturn = uncompressedBytes;
              return uncompressedBytesBeforeReturn;
            }
            unpackedLength = buffer.readIntBE((byte) -49);
            if ((unpackedLength >= 0) && (FullscreenFailureReason.maximumArchiveLength == 0 ||
                !(FullscreenFailureReason.maximumArchiveLength < unpackedLength))) {
              allocatedDecompressedBytes = new byte[unpackedLength];
              decompressedBytesAlias = allocatedDecompressedBytes;
              decompressedBytes = decompressedBytesAlias;
              if (compressionType == 1) {
                Bzip2Decoder.decompressInto(allocatedDecompressedBytes, unpackedLength, packedBytes, packedLength, 9);
              } else {
                gzipInflaterMonitor = AwtRasterBuffer.archiveGzipInflater;
                synchronized (gzipInflaterMonitor) {
                  AwtRasterBuffer.archiveGzipInflater.inflateInto(uncompressedTypeComplement + 0, buffer, allocatedDecompressedBytes);
                }
              }
              decompressedBytesBeforeReturn = decompressedBytes;
              return decompressedBytesBeforeReturn;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException unpackFailure) {
          caughtUnpackFailure = unpackFailure;
          unpackFailureForContext = (RuntimeException) (Object) caughtUnpackFailure;
          unpackFailureBeforeContext = unpackFailureForContext;
          unpackMessagePrefix = new StringBuilder().append("v.C(");
          if (packedBytes == null) {
            packedBytesDescription = "null";
          } else {
            packedBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) unpackFailureBeforeContext), ((StringBuilder) (Object) unpackMessagePrefix).append(packedBytesDescription).append(',').append(uncompressedTypeComplement).append(')').toString());
        }
    }

    final void restoreSize(byte methodGuard) {
        this.resizeListener.onCanvasResize(-2964, this.restoreWidth, this.restoreHeight);
        if (methodGuard > -5) {
            this.applyConstrainedSize(false);
        }
    }

    final void updateResize(byte methodGuard) {
        int blockedMembershipCountdownAfterDecrement = 0;
        int allowedMembershipCountdownAfterDecrement = 0;
        int invalidGuardAllowedCountdownAfterDecrement = 0;
        int invalidGuardBlockedCountdownAfterDecrement = 0;
        if (null != InstrumentPatch.activeFullscreenCanvas) {
          return;
        }
        if (methodGuard < -108) {
          if (TextTemplateDefinition.loginMembershipGateValue <= 0) {
            this.resizePending = false;
            if (this.resizePending) {
              blockedMembershipCountdownAfterDecrement = this.resizeCountdownTicks - 1;
              this.resizeCountdownTicks = this.resizeCountdownTicks - 1;
              if (0 < blockedMembershipCountdownAfterDecrement) {
                return;
              }
              this.resizeCountdownTicks = this.resizeIntervalTicks;
              if (this.minimumHeapMiB > ArchiveHandshakeState.heapCapacityEstimateMiB) {
                this.resizePending = false;
              } else {
                this.applyConstrainedSize(true);
              }
              return;
            }
            if (this.requestedWidth <= AudioService.canvasWidth) {
              if (this.requestedWidth > 0) {
                PrefixCodeDecoder.canvasOffsetX = 0;
              }
            } else {
              PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
            }
          } else {
            if (this.resizePending) {
              allowedMembershipCountdownAfterDecrement = this.resizeCountdownTicks - 1;
              this.resizeCountdownTicks = this.resizeCountdownTicks - 1;
              if (0 < allowedMembershipCountdownAfterDecrement) {
                return;
              }
              this.resizeCountdownTicks = this.resizeIntervalTicks;
              if (this.minimumHeapMiB > ArchiveHandshakeState.heapCapacityEstimateMiB) {
                this.resizePending = false;
              } else {
                this.applyConstrainedSize(true);
              }
              return;
            }
            if (this.requestedWidth > AudioService.canvasWidth) {
              PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
            } else {
              if (this.requestedWidth > 0) {
                PrefixCodeDecoder.canvasOffsetX = 0;
              }
            }
          }
          if (AudioService.canvasWidth == this.fallbackWidth &&
              ClientRenderingState.canvasHeight == this.fallbackHeight) {
            return;
          }
          this.resizeListener.onCanvasResize(-2964, this.fallbackWidth, this.fallbackHeight);
          return;
        }
        this.fallbackWidth = -79;
        if (TextTemplateDefinition.loginMembershipGateValue > 0) {
          if (this.resizePending) {
            invalidGuardAllowedCountdownAfterDecrement = this.resizeCountdownTicks - 1;
            this.resizeCountdownTicks = this.resizeCountdownTicks - 1;
            if (0 < invalidGuardAllowedCountdownAfterDecrement) {
              return;
            }
            this.resizeCountdownTicks = this.resizeIntervalTicks;
            if (this.minimumHeapMiB > ArchiveHandshakeState.heapCapacityEstimateMiB) {
              this.resizePending = false;
            } else {
              this.applyConstrainedSize(true);
            }
            return;
          }
          if (this.requestedWidth <= AudioService.canvasWidth) {
            if (this.requestedWidth > 0) {
              PrefixCodeDecoder.canvasOffsetX = 0;
            }
          } else {
            PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
          }
        } else {
          this.resizePending = false;
          if (this.resizePending) {
            invalidGuardBlockedCountdownAfterDecrement = this.resizeCountdownTicks - 1;
            this.resizeCountdownTicks = this.resizeCountdownTicks - 1;
            if (0 < invalidGuardBlockedCountdownAfterDecrement) {
              return;
            }
            this.resizeCountdownTicks = this.resizeIntervalTicks;
            if (this.minimumHeapMiB > ArchiveHandshakeState.heapCapacityEstimateMiB) {
              this.resizePending = false;
            } else {
              this.applyConstrainedSize(true);
            }
            return;
          }
          if (this.requestedWidth > AudioService.canvasWidth) {
            PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
          } else {
            if (this.requestedWidth > 0) {
              PrefixCodeDecoder.canvasOffsetX = 0;
            }
          }
        }
        if (AudioService.canvasWidth != this.fallbackWidth) {
          this.resizeListener.onCanvasResize(-2964, this.fallbackWidth, this.fallbackHeight);
        } else {
          if (ClientRenderingState.canvasHeight != this.fallbackHeight) {
            this.resizeListener.onCanvasResize(-2964, this.fallbackWidth, this.fallbackHeight);
          }
        }
    }

    private final void applyConstrainedSize(boolean applyResize) {
        int constrainedWidth;
        int constrainedHeight;
        int aspectAdjustedWidth;
        int clientControlFlowSnapshot;
        int aspectAdjustedWidthPhase2;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        constrainedWidth = this.requestedWidth;
        constrainedHeight = this.requestedHeight;
        if (!this.isResizeAllowed(-123)) {
          this.resizePending = false;
          return;
        }
        if (this.maximumWidth >= constrainedWidth) {
          if (constrainedWidth < this.minimumWidth) {
            constrainedWidth = this.minimumWidth;
          }
        } else {
          constrainedWidth = this.maximumWidth;
        }
        if (constrainedHeight > this.maximumHeight) {
          constrainedHeight = this.maximumHeight;
          if (!(0.0f < this.aspectRatio)) {
            if (!applyResize) {
              return;
            }
            if (AudioService.canvasWidth != constrainedWidth) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
            } else {
              if (constrainedHeight != ClientRenderingState.canvasHeight) {
                this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
              }
            }
            if (this.requestedWidth > 0) {
              PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
            }
            return;
          }
          aspectAdjustedWidth = (int)(0.5f + (float)constrainedHeight * this.aspectRatio);
          if (aspectAdjustedWidth > constrainedWidth) {
            constrainedHeight = (int)((float)constrainedWidth / this.aspectRatio);
          } else {
            if (aspectAdjustedWidth >= constrainedWidth) {
              if (!applyResize) {
                return;
              }
              if (AudioService.canvasWidth != constrainedWidth) {
                this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
              } else {
                if (constrainedHeight != ClientRenderingState.canvasHeight) {
                  this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
                }
              }
              if (this.requestedWidth > 0) {
                PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
              }
              return;
            }
            constrainedWidth = aspectAdjustedWidth;
          }
          if (!applyResize) {
            return;
          }
          if (AudioService.canvasWidth != constrainedWidth) {
            this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
          } else {
            if (constrainedHeight != ClientRenderingState.canvasHeight) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
            }
          }
          if (this.requestedWidth <= 0) {
            return;
          }
          PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
          return;
        }
        if (constrainedHeight < this.minimumHeight) {
          constrainedHeight = this.minimumHeight;
        }
        if (!(0.0f < this.aspectRatio)) {
          if (!applyResize) {
            return;
          }
          if (AudioService.canvasWidth != constrainedWidth) {
            this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
          } else {
            if (constrainedHeight != ClientRenderingState.canvasHeight) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
            }
          }
          if (this.requestedWidth <= 0) {
            return;
          }
          PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
          return;
        }
        aspectAdjustedWidthPhase2 = (int)(0.5f + (float)constrainedHeight * this.aspectRatio);
        if (aspectAdjustedWidthPhase2 > constrainedWidth) {
          constrainedHeight = (int)((float)constrainedWidth / this.aspectRatio);
          if (!applyResize) {
            return;
          }
          if (AudioService.canvasWidth != constrainedWidth) {
            this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
          } else {
            if (constrainedHeight != ClientRenderingState.canvasHeight) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
            }
          }
        } else {
          if (aspectAdjustedWidthPhase2 < constrainedWidth) {
            constrainedWidth = aspectAdjustedWidthPhase2;
            if (!applyResize) {
              return;
            }
            if (AudioService.canvasWidth != constrainedWidth) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
              if (this.requestedWidth > 0) {
                PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
              }
              return;
            }
            if (constrainedHeight != ClientRenderingState.canvasHeight) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
              if (this.requestedWidth > 0) {
                PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
              }
              return;
            }
          } else {
            if (!applyResize) {
              return;
            }
            if (AudioService.canvasWidth != constrainedWidth) {
              this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
            } else {
              if (constrainedHeight != ClientRenderingState.canvasHeight) {
                this.resizeListener.onCanvasResize(-2964, constrainedWidth, constrainedHeight);
              }
            }
          }
        }
        if (this.requestedWidth <= 0) {
          return;
        }
        PrefixCodeDecoder.canvasOffsetX = (-AudioService.canvasWidth + this.requestedWidth) / 2;
        return;
    }

    final boolean isResizeAllowed(int methodGuard) {
        if (methodGuard > -91) {
            createPasswordConfirmationText = (String) null;
            if (ArchiveHandshakeState.heapCapacityEstimateMiB < this.minimumHeapMiB) {
                return false;
            }
            if (TextTemplateDefinition.loginMembershipGateValue > 0) {
                return true;
            }
            return false;
        }
        if (ArchiveHandshakeState.heapCapacityEstimateMiB < this.minimumHeapMiB) {
            return false;
        }
        if (TextTemplateDefinition.loginMembershipGateValue > 0) {
            return true;
        }
        return false;
    }

    private CanvasResizeController() throws Throwable {
        throw new Error();
    }

    final static boolean hasPrimarySocialEntry(String displayName, byte methodGuard) {
        RuntimeException lookupFailureForContext = null;
        boolean hasEntryResult = false;
        RuntimeException lookupFailureBeforeContext = null;
        StringBuilder lookupMessagePrefix = null;
        String nameDescription = null;
        RuntimeException caughtLookupFailure = null;
        try {
          if (methodGuard <= 12) {
            pendingNavigationTarget = (String) null;
          }
          hasEntryResult = !(SocketConnector.findSocialEntry((byte) -62, displayName) == null);
          return hasEntryResult;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeContext = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("v.B(");
          if (displayName == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeContext), ((StringBuilder) (Object) lookupMessagePrefix).append(nameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createPasswordConfirmationText = "Confirm Password: ";
        pendingNavigationTarget = null;
        tutorialSkipMessage = "To skip this tutorial, press <img=3> at any point.";
        bootstrapProgressColor = new java.awt.Color(10040319);
        awaitingUsernameSuggestionsStage = new ClientProtocolStage();
    }
}
