/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    private int field_s;
    private int[] secondMixBuffer;
    static SpriteAsset field_A;
    private boolean field_w;
    MidiPcmStream firstStream;
    private int masterVolume;
    private int crossfadeStep;
    private int firstStreamWeight;
    private MusicTrack secondTrack;
    private MidiPcmStream field_p;
    static GameKeyHandler field_n;
    MidiPcmStream secondStream;
    private MusicTrack firstTrack;
    static String field_r;
    private boolean returnAfterTrackEnds;
    private MusicTrack field_t;
    private int[] firstMixBuffer;
    static SpriteAsset field_o;

    final synchronized void skip(int param0) {
        int var3;
        var3 = HoldTheLine.field_D;
        if (this.firstStreamWeight > 0 &&
          this.firstTrack != null) {
          this.firstStream.skip(param0);
        }
        if (1048576 > this.firstStreamWeight &&
          null != this.secondTrack) {
          this.secondStream.skip(param0);
        }
        if (this.field_s > 0 &&
          null != this.field_t) {
          this.field_p.skip(param0);
        }
        if (this.returnAfterTrackEnds) {
          if (0 < this.crossfadeStep &&
            !this.firstStream.isReady((byte) -128)) {
            this.returnAfterTrackEnds = false;
            this.firstTrack = null;
            this.crossfadeStep = -this.crossfadeStep;
          } else {
            if (this.crossfadeStep < 0 &&
              !this.secondStream.isReady((byte) 39)) {
              this.returnAfterTrackEnds = false;
              this.crossfadeStep = -this.crossfadeStep;
              this.secondTrack = null;
            }
          }
        }
        if (0 != this.crossfadeStep) {
          this.firstStreamWeight = this.firstStreamWeight + this.crossfadeStep * param0;
          if (this.firstStreamWeight >= 1048576) {
            this.firstStreamWeight = 1048576;
            if (!this.returnAfterTrackEnds) {
              this.crossfadeStep = 0;
              if (!this.field_w) {
                if (null != this.secondTrack) {
                  this.secondStream.stop(-127);
                }
                this.secondTrack = null;
              }
            }
          } else {
            if (0 >= this.firstStreamWeight) {
              this.firstStreamWeight = 0;
              if (!this.returnAfterTrackEnds) {
                this.crossfadeStep = 0;
                if (!this.field_w) {
                  if (null != this.firstTrack) {
                    this.firstStream.stop(-127);
                  }
                  this.firstTrack = null;
                }
              }
            }
          }
        }
    }

    final static Sprite[] loadSprites(int param0, ResourceArchive param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qg.decodeArchivedSpriteSheet(param2, param0, (byte) -27, param1)) {
            stackIn_2_0 = null;
            return (Sprite[]) (stackIn_2_0);
          }
          if (param3) {
            MusicCrossfadeStream.getGameContainer(-27);
          }
          stackIn_6_0 = DraggableWidget.buildDecodedSprites(-128);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean containsTrack(int param0, MusicTrack param1) {
        MusicTrack var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -11) {
            var4 = (MusicTrack) null;
            this.containsTrack(-93, (MusicTrack) null);
          }
          stackIn_7_0 = (param1 == this.firstTrack) || (this.secondTrack == param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    final synchronized int getActivityWeight() {
        return 2;
    }

    final void mix(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_30_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
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
        var11 = HoldTheLine.field_D;
        try {
          if (this.masterVolume <= 0) {
            this.skip(param2);
            return;
          }
          if (this.returnAfterTrackEnds) {
            if (0 < this.crossfadeStep &&
              !this.firstStream.isReady((byte) -127)) {
              this.crossfadeStep = -this.crossfadeStep;
              this.returnAfterTrackEnds = false;
              this.firstTrack = null;
            } else {
              if (this.crossfadeStep < 0 &&
                !this.secondStream.isReady((byte) 101)) {
                this.crossfadeStep = -this.crossfadeStep;
                this.returnAfterTrackEnds = false;
                this.secondTrack = null;
              }
            }
          }
          var4_int = (this.firstStreamWeight >> 12) * this.masterVolume / 256;
          var5 = this.masterVolume - var4_int;
          if (this.crossfadeStep != 0) {
            this.firstStreamWeight = this.firstStreamWeight + param2 * this.crossfadeStep;
            if (this.firstStreamWeight < 1048576) {
              if (0 >= this.firstStreamWeight) {
                this.firstStreamWeight = 0;
                if (!this.returnAfterTrackEnds) {
                  this.crossfadeStep = 0;
                  if (!this.field_w) {
                    if (this.firstTrack != null) {
                      this.firstStream.stop(-124);
                    }
                    this.firstTrack = null;
                  }
                }
              }
            } else {
              this.firstStreamWeight = 1048576;
              if (!this.returnAfterTrackEnds) {
                this.crossfadeStep = 0;
                if (!this.field_w) {
                  if (null != this.secondTrack) {
                    this.secondStream.stop(-127);
                  }
                  this.secondTrack = null;
                }
              }
            }
          }
          if (!AudioOutput.stereo) {
            stackIn_30_0 = param2;
          } else {
            stackIn_30_0 = param2 << 1;
          }
          var6 = stackIn_30_0;
          if (this.field_s < 256 && (this.firstTrack != null ||
            this.secondTrack != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.firstMixBuffer &&
                  var6 <= this.firstMixBuffer.length) {
                  ArrayOperations.clearInts(this.firstMixBuffer, 0, var6);
                  ArrayOperations.clearInts(this.secondMixBuffer, 0, var6);
                } else {
                  this.secondMixBuffer = new int[var6];
                  this.firstMixBuffer = new int[var6];
                }
                this.firstStream.mix(this.firstMixBuffer, 0, param2);
                this.secondStream.mix(this.secondMixBuffer, 0, param2);
                if (AudioOutput.stereo) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_44_0 = localTemp$0;
                } else {
                  stackIn_44_0 = param1;
                }
                var7 = stackIn_44_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.firstMixBuffer[var8] * var4_int + var5 * this.secondMixBuffer[var8] >> 8);
                }
              } else {
                this.secondStream.mix(param0, param1, param2);
              }
            } else {
              this.firstStream.mix(param0, param1, param2);
            }
          }
          if (this.field_t != null &&
            0 != this.field_s) {
            if (this.firstMixBuffer != null &&
              this.firstMixBuffer.length >= var6) {
              ArrayOperations.clearInts(this.firstMixBuffer, 0, var6);
            } else {
              this.secondMixBuffer = new int[var6];
              this.firstMixBuffer = new int[var6];
            }
            this.field_p.mix(this.firstMixBuffer, 0, param2);
            if (!AudioOutput.stereo) {
              stackIn_57_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_57_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_57_0;
            var8Lifetime1 = this.field_s * this.masterVolume / 256;
            var9 = -var8Lifetime1 + this.masterVolume;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = var9 * param0[var10 + var7Lifetime1] + var8Lifetime1 * this.firstMixBuffer[var10] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("tf.A(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static java.awt.Container getGameContainer(int param0) {
        if (param0 != 0) {
          field_o = (SpriteAsset) null;
        }
        if (null != StandaloneWindow.frame) {
          return (java.awt.Container) ((Object) StandaloneWindow.frame);
        }
        return (java.awt.Container) ((Object) GameKeyHandler.getApplet(111));
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final synchronized void setMasterVolume(int param0, int param1) {
        this.masterVolume = param0;
        if (param1 != -32284) {
          this.getActivityWeight();
        }
    }

    public static void clearSharedReferences(int param0) {
        field_r = null;
        int var1 = 38 / ((param0 + 51) / 59);
        field_n = null;
        field_A = null;
        field_o = null;
    }

    final static float distanceAlongCurves(byte param0, float param1, TrackCurve[] param2) {
        int var5 = 0;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        ResourceArchive var7 = null;
        float stackIn_9_0 = 0.0f;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var3_float = 0.0f;
          var4 = (int)param1;
          if (param0 <= 74) {
            var7 = (ResourceArchive) null;
            MusicCrossfadeStream.loadSprites(115, (ResourceArchive) null, 72, true);
          }
          for (var5 = 0; var5 < var4; var5++) {
            var3_float = var3_float + param2[var5].length(50);
          }
          if (param1 != (float)var4) {
            var3_float = var3_float + param2[var4].length(50) * ((float)(-var4) + param1);
          }
          stackIn_9_0 = var3_float;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void initializeStreams(MidiPcmStream param0, byte param1, MidiPcmStream param2) {
        try {
          this.firstStream = param0;
          this.firstStreamWeight = 1048576;
          int var4_int = 91 / ((param1 - 21) / 54);
          this.secondStream = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "tf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void configurePlayback(int param0, MidiPcmStream param1, int param2, int param3) {
        try {
          param1.setChannelGain((byte) 108, -1, param3);
          if (param2 != 17945) {
            this.firstStreamWeight = 96;
          }
          param1.setPlaybackTimeScale(param0, param2 - 17943);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "tf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void crossfadeToTrack(int param0, int param1, MusicTrack param2, byte param3, boolean param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_34_0 = 0;
        MidiPcmStream stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        MusicTrack stackIn_42_2 = null;
        boolean stackIn_43_3;
        MidiPcmStream stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        MusicTrack stackIn_52_2 = null;
        boolean stackIn_53_3;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        MusicTrack var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (this.returnAfterTrackEnds &&
            param4) {
            if (this.crossfadeStep > 0) {
              if (this.firstTrack != null) {
                this.firstStream.stop(-127);
              }
              this.firstTrack = param2;
              if (param2 != null) {
                this.firstStream.setMusicTrack(param3 - 2128026886, param2, false);
                this.configurePlayback(param1, this.firstStream, 17945, param5);
              }
            } else {
              if (this.secondTrack != null) {
                this.secondStream.stop(-125);
              }
              this.secondTrack = param2;
              if (param2 != null) {
                this.secondStream.setMusicTrack(-2128027000, param2, false);
                this.configurePlayback(param1, this.secondStream, 17945, param5);
              }
            }
            return;
          }
          stackIn_19_1 = (param4);
          this.returnAfterTrackEnds = stackIn_19_1;
          if (this.firstTrack == param2) {
            this.crossfadeStep = param0;
            this.configurePlayback(param1, this.firstStream, 17945, param5);
            return;
          }
          if (param2 == this.secondTrack) {
            this.crossfadeStep = -param0;
            this.configurePlayback(param1, this.secondStream, 17945, param5);
            return;
          }
          if (param3 != -114) {
            var9 = (MusicTrack) null;
            this.crossfadeToTrack(85, 112, (MusicTrack) null, (byte) -26, false, -91);
          }
          if (this.firstTrack == null) {
            var7_int = 1;
          } else {
            if (this.secondTrack != null) {
              stackIn_34_0 = (this.firstStreamWeight >= 524288) ? 0 : 1;
              var7_int = stackIn_34_0;
            } else {
              var7_int = 0;
            }
          }
          if (var7_int == 0) {
            if (this.secondTrack != null) {
              this.secondStream.stop(-125);
            }
            this.secondTrack = param2;
            if (param2 != null) {
              stackIn_52_0 = this.secondStream;
              stackIn_52_1 = -2128027000;
              stackIn_52_2 = (MusicTrack) (param2);
              stackIn_53_3 = !(param4);
              ((MidiPcmStream) (Object) stackIn_52_0).setMusicTrack(stackIn_52_1, stackIn_52_2, stackIn_53_3);
              this.configurePlayback(param1, this.secondStream, 17945, param5);
            }
            this.crossfadeStep = -param0;
          } else {
            if (null != this.firstTrack) {
              this.firstStream.stop(param3 ^ 13);
            }
            this.firstTrack = param2;
            if (param2 != null) {
              stackIn_42_0 = this.firstStream;
              stackIn_42_1 = -2128027000;
              stackIn_42_2 = (MusicTrack) (param2);
              stackIn_43_3 = !(param4);
              ((MidiPcmStream) (Object) stackIn_42_0).setMusicTrack(stackIn_42_1, stackIn_42_2, stackIn_43_3);
              this.configurePlayback(param1, this.firstStream, param3 ^ -18025, param5);
            }
            this.crossfadeStep = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_58_0 = var7;
          stackIn_58_1 = new StringBuilder().append("tf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public MusicCrossfadeStream() {
        this.field_s = 0;
        this.masterVolume = 256;
        this.field_w = false;
        MidiPcmStream var1 = new MidiPcmStream();
        this.initializeStreams(var1, (byte) 126, new MidiPcmStream(var1));
    }

    static {
        field_r = "1P";
        field_n = new GameKeyHandler();
    }
}
