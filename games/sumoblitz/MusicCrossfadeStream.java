/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    private MusicTrack field_t;
    private int crossfadeStep;
    static ToolkitSprite[] field_q;
    private int[] field_s;
    private MusicTrack secondTrack;
    private int[] field_A;
    private boolean field_u;
    static SpriteData field_p;
    private MusicTrack firstTrack;
    private int field_z;
    private int volume;
    private MidiPcmStream field_D;
    private boolean field_w;
    MidiPcmStream secondSynthesizer;
    MidiPcmStream firstSynthesizer;
    private int crossfadePosition;

    public static void releaseStatics(int param0) {
        field_p = null;
        int var1 = -38 / ((-89 - param0) / 33);
        field_q = null;
    }

    final synchronized void transitionToTrack(int param0, int param1, MusicTrack param2, boolean param3, int param4, int param5) {
        boolean stackIn_22_1 = false;
        int stackIn_34_0 = 0;
        MidiPcmStream stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        MidiPcmStream stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        Sprite[] var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_u &&
            param3) {
            if (this.crossfadeStep <= 0) {
              if (null != this.secondTrack) {
                this.secondSynthesizer.stop(0);
              }
              this.secondTrack = param2;
              if (param2 != null) {
                this.secondSynthesizer.playTrack(false, param2, 60);
                this.configureSynthesizer(param1, (byte) 24, this.secondSynthesizer, param5);
              }
            } else {
              if (this.firstTrack != null) {
                this.firstSynthesizer.stop(0);
              }
              this.firstTrack = param2;
              if (param2 != null) {
                this.firstSynthesizer.playTrack(false, param2, 117);
                this.configureSynthesizer(param1, (byte) 39, this.firstSynthesizer, param5);
              }
            }
            return;
          }
          if (param0 != 1) {
            var9 = (Sprite[]) null;
            MusicCrossfadeStream.drawHorizontalSpriteStrip(57, -30, 8, 30, (Sprite[]) null);
          }
          stackIn_22_1 = (param3);
          this.field_u = stackIn_22_1;
          if (param2 == this.firstTrack) {
            this.crossfadeStep = param4;
            this.configureSynthesizer(param1, (byte) -114, this.firstSynthesizer, param5);
            return;
          }
          if (param2 == this.secondTrack) {
            this.crossfadeStep = -param4;
            this.configureSynthesizer(param1, (byte) -82, this.secondSynthesizer, param5);
            return;
          }
          if (this.firstTrack != null) {
            if (this.secondTrack == null) {
              var7_int = 0;
            } else {
              stackIn_34_0 = (524288 <= this.crossfadePosition) ? 0 : 1;
              var7_int = stackIn_34_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (null != this.secondTrack) {
              this.secondSynthesizer.stop(0);
            }
            this.secondTrack = param2;
            if (param2 != null) {
              stackIn_53_0 = this.secondSynthesizer;
              stackIn_54_1 = !(param3);
              ((MidiPcmStream) (Object) stackIn_53_0).playTrack(stackIn_54_1, param2, param0 + 67);
              this.configureSynthesizer(param1, (byte) 45, this.secondSynthesizer, param5);
            }
            this.crossfadeStep = -param4;
          } else {
            if (null != this.firstTrack) {
              this.firstSynthesizer.stop(param0 - 1);
            }
            this.firstTrack = param2;
            if (param2 != null) {
              stackIn_43_0 = this.firstSynthesizer;
              stackIn_44_1 = !(param3);
              ((MidiPcmStream) (Object) stackIn_43_0).playTrack(stackIn_44_1, param2, 121);
              this.configureSynthesizer(param1, (byte) -114, this.firstSynthesizer, param5);
            }
            this.crossfadeStep = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("ud.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void drawHorizontalSpriteStrip(int param0, int param1, int param2, int param3, Sprite[] param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param4 != null &&
            param1 > 0) {
            var5_int = param4[0].field_z;
            var6 = param4[2].field_z;
            var7 = param4[1].field_z;
            param4[0].draw(param3, param0);
            param4[param2].draw(-var6 + (param1 + param3), param0);
            SoftwareRasterizer.saveClip(PerlinNoise2D.field_t);
            SoftwareRasterizer.intersectClip(param3 + var5_int, param0, -var6 + param3 + param1, param4[1].field_w + param0);
            var8 = param3 + var5_int;
            var9 = param1 + param3 - var6;
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param4[1].draw(param3, param0);
            }
            SoftwareRasterizer.restoreClip(PerlinNoise2D.field_t);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ud.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void configureSynthesizer(int param0, byte param1, MidiPcmStream param2, int param3) {
        try {
          param2.setChannelVolumeScale((byte) -86, -1, param3);
          param2.setTimeScale(param0, 0);
          int var5_int = -21 / ((param1 + 28) / 47);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ud.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized void setVolume(byte guard, int volume) {
        if (guard != -43) {
          return;
        }
        this.volume = volume;
    }

    private final void setSynthesizers(MidiPcmStream param0, int param1, MidiPcmStream param2) {
        try {
          if (param1 > -55) {
            this.activityWeight();
          }
          this.crossfadePosition = 1048576;
          this.secondSynthesizer = param0;
          this.firstSynthesizer = param2;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ud.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void skip(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.crossfadePosition > 0) {
          if (null != this.firstTrack) {
            this.firstSynthesizer.skip(param0);
          }
          if (this.crossfadePosition >= 1048576) {
            if ((!(0 >= this.field_z)) &&
              ((this.field_t != null))) {
              this.field_D.skip(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.secondTrack) {
              if ((!(0 >= this.field_z)) &&
                ((this.field_t != null))) {
                this.field_D.skip(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.secondSynthesizer.skip(param0);
            }
          }
        } else {
          if (this.crossfadePosition >= 1048576) {
            if ((!(0 >= this.field_z)) &&
              ((this.field_t != null))) {
              this.field_D.skip(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.secondTrack) {
              if ((!(0 >= this.field_z)) &&
                ((this.field_t != null))) {
                this.field_D.skip(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.secondSynthesizer.skip(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (0 < this.field_z &&
          this.field_t != null)) {
          this.field_D.skip(param0);
        }
        if (this.field_u) {
          if (this.crossfadeStep > 0 &&
            !this.firstSynthesizer.isPlaying(-8192)) {
            this.crossfadeStep = -this.crossfadeStep;
            this.field_u = false;
            this.firstTrack = null;
          } else {
            if (0 > this.crossfadeStep &&
              !this.secondSynthesizer.isPlaying(-8192)) {
              this.crossfadeStep = -this.crossfadeStep;
              this.secondTrack = null;
              this.field_u = false;
            }
          }
        }
        if (this.crossfadeStep != 0) {
          this.crossfadePosition = this.crossfadePosition + this.crossfadeStep * param0;
          if (this.crossfadePosition < 1048576) {
            if (0 >= this.crossfadePosition) {
              this.crossfadePosition = 0;
              if (!this.field_u) {
                this.crossfadeStep = 0;
                if (!this.field_w) {
                  if (this.firstTrack != null) {
                    this.firstSynthesizer.stop(0);
                  }
                  this.firstTrack = null;
                }
              }
            }
          } else {
            this.crossfadePosition = 1048576;
            if (!this.field_u) {
              this.crossfadeStep = 0;
              if (!this.field_w) {
                if (this.secondTrack != null) {
                  this.secondSynthesizer.stop(0);
                }
                this.secondTrack = null;
              }
            }
          }
        }
    }

    final synchronized int activityWeight() {
        return 2;
    }

    final PcmStream firstSubstream() {
        return null;
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
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
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.volume <= 0) {
            this.skip(param2);
            return;
          }
          if (this.field_u) {
            if (0 < this.crossfadeStep &&
              !this.firstSynthesizer.isPlaying(-8192)) {
              this.field_u = false;
              this.crossfadeStep = -this.crossfadeStep;
              this.firstTrack = null;
            } else {
              if (0 > this.crossfadeStep &&
                !this.secondSynthesizer.isPlaying(-8192)) {
                this.secondTrack = null;
                this.crossfadeStep = -this.crossfadeStep;
                this.field_u = false;
              }
            }
          }
          var4_int = (this.crossfadePosition >> 12) * this.volume / 256;
          var5 = this.volume - var4_int;
          if (this.crossfadeStep != 0) {
            this.crossfadePosition = this.crossfadePosition + this.crossfadeStep * param2;
            if (this.crossfadePosition < 1048576) {
              if (0 >= this.crossfadePosition) {
                this.crossfadePosition = 0;
                if (!this.field_u) {
                  this.crossfadeStep = 0;
                  if (!this.field_w) {
                    if (null != this.firstTrack) {
                      this.firstSynthesizer.stop(0);
                    }
                    this.firstTrack = null;
                  }
                }
              }
            } else {
              this.crossfadePosition = 1048576;
              if (!this.field_u) {
                this.crossfadeStep = 0;
                if (!this.field_w) {
                  if (null != this.secondTrack) {
                    this.secondSynthesizer.stop(0);
                  }
                  this.secondTrack = null;
                }
              }
            }
          }
          if (AudioOutput.stereo) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_z < 256 && (this.firstTrack != null ||
            this.secondTrack != null)) {
            if (var4_int == 256) {
              this.firstSynthesizer.mixInto(param0, param1, param2);
            } else {
              if (256 != var5) {
                if (this.field_s != null &&
                  var6 <= this.field_s.length) {
                  ArrayUtils.clear(this.field_s, 0, var6);
                  ArrayUtils.clear(this.field_A, 0, var6);
                } else {
                  this.field_s = new int[var6];
                  this.field_A = new int[var6];
                }
                this.firstSynthesizer.mixInto(this.field_s, 0, param2);
                this.secondSynthesizer.mixInto(this.field_A, 0, param2);
                if (!AudioOutput.stereo) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_A[var8] + var4_int * this.field_s[var8] >> 8);
                }
              } else {
                this.secondSynthesizer.mixInto(param0, param1, param2);
              }
            }
          }
          if (null != this.field_t &&
            this.field_z != 0) {
            if (this.field_s != null &&
              var6 <= this.field_s.length) {
              ArrayUtils.clear(this.field_s, 0, var6);
            } else {
              this.field_A = new int[var6];
              this.field_s = new int[var6];
            }
            this.field_D.mixInto(this.field_s, 0, param2);
            if (AudioOutput.stereo) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_61_0 = localTemp$1;
            } else {
              stackIn_61_0 = param1;
            }
            var7Lifetime1 = stackIn_61_0;
            var8Lifetime1 = this.field_z * this.volume / 256;
            var9 = this.volume - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = this.field_s[var10] * var8Lifetime1 + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("ud.J(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    MusicCrossfadeStream(MidiPcmStream param0, MidiPcmStream param1) {
        this.volume = 256;
        this.field_w = false;
        this.field_z = 0;
        try {
          this.setSynthesizers(param1, -79, param0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
