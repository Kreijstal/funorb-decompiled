/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiCrossfadeStream extends PcmStream {
    private MusicTrack firstTrack;
    MidiPcmStream selectedStream;
    private int overlayBlend;
    static Sprite[] buttonFrameSprites;
    private boolean temporaryTrackActive;
    private int crossfadePosition;
    private MidiPcmStream secondStream;
    private MusicTrack secondTrack;
    private int[] firstScratch;
    private MusicTrack overlayTrack;
    private int masterGain;
    private int[] secondScratch;
    MidiPcmStream firstStream;
    private boolean retainFadedTracks;
    private MidiPcmStream overlayStream;
    private int crossfadeStep;

    final void mix(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (this.masterGain <= 0) {
            this.skip(param2);
            return;
          }
          if (this.temporaryTrackActive) {
            if (this.crossfadeStep > 0 &&
              !this.firstStream.isPlaying(-93)) {
              this.firstTrack = null;
              this.temporaryTrackActive = false;
              this.crossfadeStep = -this.crossfadeStep;
            } else {
              if (this.crossfadeStep < 0 &&
                !this.secondStream.isPlaying(-123)) {
                this.temporaryTrackActive = false;
                this.secondTrack = null;
                this.crossfadeStep = -this.crossfadeStep;
              }
            }
          }
          var4_int = this.masterGain * (this.crossfadePosition >> 12) / 256;
          var5 = this.masterGain - var4_int;
          if (this.crossfadeStep != 0) {
            this.crossfadePosition = this.crossfadePosition + param2 * this.crossfadeStep;
            if (this.crossfadePosition < 1048576) {
              if (this.crossfadePosition <= 0) {
                this.crossfadePosition = 0;
                if (!this.temporaryTrackActive) {
                  this.crossfadeStep = 0;
                  if (!this.retainFadedTracks) {
                    if (null != this.firstTrack) {
                      this.firstStream.stop(true);
                    }
                    this.firstTrack = null;
                  }
                }
              }
            } else {
              this.crossfadePosition = 1048576;
              if (!this.temporaryTrackActive) {
                this.crossfadeStep = 0;
                if (!this.retainFadedTracks) {
                  if (null != this.secondTrack) {
                    this.secondStream.stop(true);
                  }
                  this.secondTrack = null;
                }
              }
            }
          }
          if (AudioOutput.stereo) {
            stackIn_34_0 = param2 << 1;
          } else {
            stackIn_34_0 = param2;
          }
          var6 = stackIn_34_0;
          if (this.overlayBlend < 256 && (this.firstTrack != null ||
            this.secondTrack != null)) {
            if (var4_int == 256) {
              this.firstStream.mix(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.firstScratch != null &&
                  var6 <= this.firstScratch.length) {
                  ArrayOperations.clear(this.firstScratch, 0, var6);
                  ArrayOperations.clear(this.secondScratch, 0, var6);
                } else {
                  this.secondScratch = new int[var6];
                  this.firstScratch = new int[var6];
                }
                this.firstStream.mix(this.firstScratch, 0, param2);
                this.secondStream.mix(this.secondScratch, 0, param2);
                if (AudioOutput.stereo) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                } else {
                  stackIn_48_0 = param1;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.secondScratch[var8] + this.firstScratch[var8] * var4_int >> 8);
                }
              } else {
                this.secondStream.mix(param0, param1, param2);
              }
            }
          }
          if (this.overlayTrack != null) {
            if (0 == this.overlayBlend) {
              return;
            }
            if (null != this.firstScratch &&
              this.firstScratch.length >= var6) {
              ArrayOperations.clear(this.firstScratch, 0, var6);
            } else {
              this.secondScratch = new int[var6];
              this.firstScratch = new int[var6];
            }
            this.overlayStream.mix(this.firstScratch, 0, param2);
            if (AudioOutput.stereo) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.masterGain * this.overlayBlend / 256;
            var9 = -var8Lifetime1 + this.masterGain;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.firstScratch[var10] + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("dra.E(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void skip(int param0) {
        int var3;
        var3 = VoidHunters.field_G;
        if (this.crossfadePosition > 0 &&
          null != this.firstTrack) {
          this.firstStream.skip(param0);
        }
        if (this.crossfadePosition < 1048576 &&
          null != this.secondTrack) {
          this.secondStream.skip(param0);
        }
        if (0 < this.overlayBlend &&
          null != this.overlayTrack) {
          this.overlayStream.skip(param0);
        }
        if (this.temporaryTrackActive) {
          if (this.crossfadeStep > 0 &&
            !this.firstStream.isPlaying(-110)) {
            this.firstTrack = null;
            this.temporaryTrackActive = false;
            this.crossfadeStep = -this.crossfadeStep;
          } else {
            if (0 > this.crossfadeStep &&
              !this.secondStream.isPlaying(-102)) {
              this.temporaryTrackActive = false;
              this.crossfadeStep = -this.crossfadeStep;
              this.secondTrack = null;
            }
          }
        }
        if (this.crossfadeStep != 0) {
          this.crossfadePosition = this.crossfadePosition + param0 * this.crossfadeStep;
          if (1048576 <= this.crossfadePosition) {
            this.crossfadePosition = 1048576;
            if (!this.temporaryTrackActive) {
              this.crossfadeStep = 0;
              if (!this.retainFadedTracks) {
                if (null != this.secondTrack) {
                  this.secondStream.stop(true);
                }
                this.secondTrack = null;
              }
            }
          } else {
            if (this.crossfadePosition <= 0) {
              this.crossfadePosition = 0;
              if (!this.temporaryTrackActive) {
                this.crossfadeStep = 0;
                if (!this.retainFadedTracks) {
                  if (this.firstTrack != null) {
                    this.firstStream.stop(true);
                  }
                  this.firstTrack = null;
                }
              }
            }
          }
        }
    }

    private final void configureStreamPlayback(MidiPcmStream param0, int param1, int param2, int param3) {
        try {
          if (param2 >= -112) {
            this.firstStream = (MidiPcmStream) null;
          }
          this.selectedStream = param0;
          param0.setChannelGain(param1, (byte) 18, -1);
          param0.setPlaybackTimeScale((byte) 30, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "dra.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void setAlternateHistoryLength(byte param0, int param1) {
        if (param0 <= 67) {
          return;
        }
        GzipCodec.alternateHistoryLength = param1;
        GzipCodec.alternateChecksumDelay = GzipCodec.alternateHistoryLength / 2;
    }

    final synchronized void crossfadeToTrack(int param0, MusicTrack param1, int param2, int param3) {
        try {
          int var5_int = -83 % ((-81 - param0) / 45);
          this.crossfadeToTrack(256, param2, false, param1, -123, param3);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "dra.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final synchronized void setMasterGain(byte param0, int param1) {
        this.masterGain = param1;
        if (param0 != -108) {
          MidiCrossfadeStream.clearSharedReferences(72);
        }
    }

    final synchronized int getActivityWeight() {
        return 2;
    }

    private final void initializePrimaryStreams(int param0, MidiPcmStream param1, MidiPcmStream param2) {
        try {
          this.firstStream = param1;
          this.secondStream = param2;
          int var4_int = 88 % ((73 - param0) / 51);
          this.crossfadePosition = 1048576;
          this.selectedStream = this.firstStream;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "dra.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    final synchronized void crossfadeToTrack(int param0, int param1, boolean param2, MusicTrack param3, int param4, int param5) {
        boolean stackIn_18_1 = false;
        int stackIn_29_0 = 0;
        MidiPcmStream stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        MidiPcmStream stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (this.temporaryTrackActive &&
            param2) {
            if (this.crossfadeStep > 0) {
              if (null != this.firstTrack) {
                this.firstStream.stop(true);
              }
              this.firstTrack = param3;
              if (param3 != null) {
                this.firstStream.playTrack(false, param3, -1);
                this.configureStreamPlayback(this.firstStream, param0, -125, param5);
              }
            } else {
              if (null != this.secondTrack) {
                this.secondStream.stop(true);
              }
              this.secondTrack = param3;
              if (param3 != null) {
                this.secondStream.playTrack(false, param3, -1);
                this.configureStreamPlayback(this.secondStream, param0, -118, param5);
              }
            }
            return;
          }
          stackIn_18_1 = (param2);
          this.temporaryTrackActive = stackIn_18_1;
          var7_int = -19 / ((param4 + 81) / 32);
          if (this.firstTrack == param3) {
            this.crossfadeStep = param1;
            this.configureStreamPlayback(this.firstStream, param0, -116, param5);
            return;
          }
          if (param3 == this.secondTrack) {
            this.crossfadeStep = -param1;
            this.configureStreamPlayback(this.secondStream, param0, -128, param5);
            return;
          }
          if (null == this.firstTrack) {
            var8 = 1;
          } else {
            if (this.secondTrack == null) {
              var8 = 0;
            } else {
              stackIn_29_0 = (524288 <= this.crossfadePosition) ? 0 : 1;
              var8 = stackIn_29_0;
            }
          }
          if (var8 != 0) {
            if (null != this.firstTrack) {
              this.firstStream.stop(true);
            }
            this.firstTrack = param3;
            if (param3 != null) {
              stackIn_48_0 = this.firstStream;
              stackIn_49_1 = !(param2);
              ((MidiPcmStream) (Object) stackIn_48_0).playTrack(stackIn_49_1, param3, -1);
              this.configureStreamPlayback(this.firstStream, param0, -122, param5);
            }
            this.crossfadeStep = param1;
          } else {
            if (null != this.secondTrack) {
              this.secondStream.stop(true);
            }
            this.secondTrack = param3;
            if (param3 != null) {
              stackIn_39_0 = this.secondStream;
              stackIn_40_1 = !(param2);
              ((MidiPcmStream) (Object) stackIn_39_0).playTrack(stackIn_40_1, param3, -1);
              this.configureStreamPlayback(this.secondStream, param0, -117, param5);
            }
            this.crossfadeStep = -param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_54_0 = var7;
          stackIn_54_1 = new StringBuilder().append("dra.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        buttonFrameSprites = null;
        if (param0 <= 37) {
          buttonFrameSprites = (Sprite[]) null;
        }
    }

    MidiCrossfadeStream(MidiPcmStream param0, MidiPcmStream param1, MidiPcmStream param2) {
        this.overlayBlend = 0;
        this.masterGain = 256;
        this.retainFadedTracks = false;
        try {
          this.initializePrimaryStreams(-93, param0, param1);
          this.overlayStream = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "dra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
