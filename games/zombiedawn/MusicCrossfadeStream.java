/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    private boolean field_w;
    private MusicTrack field_n;
    private boolean field_x;
    private MusicTrack field_r;
    private int[] field_z;
    private MidiPcmStream field_s;
    private MidiPcmStream field_v;
    static IntrusiveDeque field_m;
    static long field_p;
    private int[] field_q;
    private MusicTrack field_l;
    private int field_o;
    private int field_u;
    private MidiPcmStream field_t;
    private int field_y;
    private int field_A;

    final synchronized void switchTrack(int param0, boolean param1, int param2, int param3, int param4, MusicTrack param5) {
        boolean stackIn_16_1 = false;
        int stackIn_29_0 = 0;
        MidiPcmStream stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        MusicTrack stackIn_40_2 = null;
        boolean stackIn_41_3;
        MidiPcmStream stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        MusicTrack stackIn_49_2 = null;
        boolean stackIn_50_3;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          if (this.field_x &&
            param1) {
            if (this.field_A <= 0) {
              if (null != this.field_r) {
                this.field_t.stop(28013);
              }
              this.field_r = param5;
              if (param5 != null) {
                this.field_t.playTrack((byte) -22, param5, false);
                this.configureSynthesizer(param2, param3, this.field_t, -1);
              }
            } else {
              if (this.field_l != null) {
                this.field_v.stop(28013);
              }
              this.field_l = param5;
              if (param5 != null) {
                this.field_v.playTrack((byte) -22, param5, false);
                this.configureSynthesizer(param2, param3, this.field_v, -1);
              }
            }
            return;
          }
          stackIn_16_1 = (param1);
          this.field_x = stackIn_16_1;
          if (param5 == this.field_l) {
            this.field_A = param0;
            this.configureSynthesizer(param2, param3, this.field_v, -1);
            return;
          }
          if (param5 == this.field_r) {
            this.field_A = -param0;
            this.configureSynthesizer(param2, param3, this.field_t, -1);
            return;
          }
          if (param4 >= -46) {
            return;
          }
          if (this.field_l == null) {
            var7_int = 1;
          } else {
            if (null == this.field_r) {
              var7_int = 0;
            } else {
              stackIn_29_0 = (this.field_u >= 524288) ? 0 : 1;
              var7_int = stackIn_29_0;
            }
          }
          if (var7_int != 0) {
            if (this.field_l != null) {
              this.field_v.stop(28013);
            }
            this.field_l = param5;
            if (param5 != null) {
              stackIn_49_0 = this.field_v;
              stackIn_49_1 = -22;
              stackIn_49_2 = (MusicTrack) (param5);
              stackIn_50_3 = !(param1);
              ((MidiPcmStream) (Object) stackIn_49_0).playTrack((byte) stackIn_49_1, stackIn_49_2, stackIn_50_3);
              this.configureSynthesizer(param2, param3, this.field_v, -1);
            }
            this.field_A = param0;
          } else {
            if (this.field_r != null) {
              this.field_t.stop(28013);
            }
            this.field_r = param5;
            if (param5 != null) {
              stackIn_40_0 = this.field_t;
              stackIn_40_1 = -22;
              stackIn_40_2 = (MusicTrack) (param5);
              stackIn_41_3 = !(param1);
              ((MidiPcmStream) (Object) stackIn_40_0).playTrack((byte) stackIn_40_1, stackIn_40_2, stackIn_41_3);
              this.configureSynthesizer(param2, param3, this.field_t, -1);
            }
            this.field_A = -param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_55_0 = var7;
          stackIn_55_1 = new StringBuilder().append("tp.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    final void fill(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
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
        var11 = ZombieDawn.field_J;
        try {
          if (this.field_y <= 0) {
            this.skip(param2);
            return;
          }
          if (this.field_x) {
            if (this.field_A > 0 &&
              !this.field_v.isReady((byte) -34)) {
              this.field_l = null;
              this.field_A = -this.field_A;
              this.field_x = false;
            } else {
              if (this.field_A < 0 &&
                !this.field_t.isReady((byte) -34)) {
                this.field_r = null;
                this.field_A = -this.field_A;
                this.field_x = false;
              }
            }
          }
          var4_int = this.field_y * (this.field_u >> 12) / 256;
          var5 = this.field_y - var4_int;
          if (this.field_A != 0) {
            this.field_u = this.field_u + param2 * this.field_A;
            if (this.field_u >= 1048576) {
              this.field_u = 1048576;
              if (!this.field_x) {
                this.field_A = 0;
                if (!this.field_w) {
                  if (null != this.field_r) {
                    this.field_t.stop(28013);
                  }
                  this.field_r = null;
                }
              }
            } else {
              if (this.field_u <= 0) {
                this.field_u = 0;
                if (!this.field_x) {
                  this.field_A = 0;
                  if (!this.field_w) {
                    if (this.field_l != null) {
                      this.field_v.stop(28013);
                    }
                    this.field_l = null;
                  }
                }
              }
            }
          }
          if (AudioOutput.field_l) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_o < 256 && (this.field_l != null ||
            this.field_r != null)) {
            if (var4_int == 256) {
              this.field_v.fill(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_z != null &&
                  var6 <= this.field_z.length) {
                  ArraySupport.clearInts(this.field_z, 0, var6);
                  ArraySupport.clearInts(this.field_q, 0, var6);
                } else {
                  this.field_q = new int[var6];
                  this.field_z = new int[var6];
                }
                this.field_v.fill(this.field_z, 0, param2);
                this.field_t.fill(this.field_q, 0, param2);
                if (AudioOutput.field_l) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_49_0 = localTemp$0;
                } else {
                  stackIn_49_0 = param1;
                }
                var7 = stackIn_49_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_q[var8] * var5 + var4_int * this.field_z[var8] >> 8);
                }
              } else {
                this.field_t.fill(param0, param1, param2);
              }
            }
          }
          if (null != this.field_n) {
            if (this.field_o == 0) {
              return;
            }
            if (null != this.field_z &&
              var6 <= this.field_z.length) {
              ArraySupport.clearInts(this.field_z, 0, var6);
            } else {
              this.field_z = new int[var6];
              this.field_q = new int[var6];
            }
            this.field_s.fill(this.field_z, 0, param2);
            if (AudioOutput.field_l) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_64_0 = localTemp$1;
            } else {
              stackIn_64_0 = param1;
            }
            var7Lifetime1 = stackIn_64_0;
            var8Lifetime1 = this.field_o * this.field_y / 256;
            var9 = -var8Lifetime1 + this.field_y;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = param0[var7Lifetime1 + var10] * var9 + var8Lifetime1 * this.field_z[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_70_0 = var4;
          stackIn_70_1 = new StringBuilder().append("tp.J(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void loadLogoSound(byte param0, Js5Archive param1) {
        VorbisSample var2 = null;
        if (param0 <= 120) {
          return;
        }
        try {
          VorbisSample.decodeSetup(param1.getFileByName("", -121, "headers.packvorbis"));
          var2 = VorbisSample.load(param1, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final PcmStream firstSubstream() {
        return null;
    }

    final static LoginNameValue createActiveEmailLookupValue(byte param0) {
        if (param0 != 0) {
          field_p = -26L;
        }
        return new LoginNameValue(DualLinkDeque.getCurrentAccountName((byte) -16), PendingFlagRequest.isNameCheckPending(1));
    }

    final static PcmSampleStream playSoundEffect(byte param0, int param1) {
        if (4 <= DelegatingCanvas.field_e.size(-56)) {
          return null;
        }
        if (param0 < 20) {
          field_m = (IntrusiveDeque) null;
        }
        SoundEffectNode var2 = new SoundEffectNode(param1);
        DelegatingCanvas.field_e.addFirst(0, var2);
        return var2.field_j;
    }

    private final void configureSynthesizer(int param0, int param1, MidiPcmStream param2, int param3) {
        try {
          param2.setChannelVolume(param0, true, param3);
          param2.setTempoScale(param1, false);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tp.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static TextWidgetPainter getDefaultTextPainter(int param0) {
        if (null == PatrollingGuard.field_Ob) {
          PatrollingGuard.field_Ob = new TextWidgetPainter(SecondaryNodeDeque.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, SecondaryNodeDeque.field_a.field_I, -1, 2147483647, true);
        }
        int var1 = -78 / ((param0 - 59) / 48);
        return PatrollingGuard.field_Ob;
    }

    final static void playMusicTrack(int param0, boolean param1, MusicTrack param2) {
        try {
          FullscreenErrorDialog.playMusicTrack(256, param1, (byte) -115, param2);
          int var3_int = -119 / ((-38 - param0) / 47);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tp.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_m = null;
    }

    final synchronized int activity() {
        return 2;
    }

    final static void createHudPanelSprites(Sprite[] param0, int param1) {
        try {
          HunterHuman.field_Ub = new Sprite[7];
          SpriteFadeHelpers.field_e = new Sprite[7];
          LevelSelectScreen.field_p = new Sprite(300, 200);
          HunterHuman.field_Ub[0] = param0[0];
          SpriteFadeHelpers.field_e[0] = new Sprite(param0[0].field_w + 20, param0[0].field_t - param1);
          HunterHuman.field_Ub[1] = param0[1];
          SpriteFadeHelpers.field_e[1] = new Sprite(10 + param0[1].field_w, 10 + param0[1].field_t);
          HunterHuman.field_Ub[2] = new Sprite(150, 100);
          SpriteFadeHelpers.field_e[2] = new Sprite(150, 100);
          HunterHuman.field_Ub[3] = new Sprite(120, 50);
          SpriteFadeHelpers.field_e[3] = new Sprite(120, 50);
          HunterHuman.field_Ub[4] = new Sprite(300, 50);
          SpriteFadeHelpers.field_e[4] = new Sprite(300, 50);
          HunterHuman.field_Ub[5] = new Sprite(200, 90);
          SpriteFadeHelpers.field_e[5] = new Sprite(200, 90);
          HunterHuman.field_Ub[6] = new Sprite(200, 50);
          SpriteFadeHelpers.field_e[6] = new Sprite(200, 50);
          SpriteFadeHelpers.field_e[0].setAsRenderTarget();
          HunterHuman.field_Ub[0].drawSilhouette(5, 5, 16777215);
          ScreenBlurHelpers.blurScreen((byte) 70);
          HunterHuman.field_Ub[0].drawSilhouette(5, 5, 0);
          SpriteFadeHelpers.field_e[1].setAsRenderTarget();
          HunterHuman.field_Ub[1].drawSilhouette(-35, 5, 16777215);
          SpriteEffectHelpers.drawRasterOutline(16777215);
          ScreenBlurHelpers.blurScreen((byte) -115);
          HunterHuman.field_Ub[1].drawSilhouette(-35, 5, 0);
          DisplayState.field_f.makeRasterTarget(89);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "tp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final PcmStream nextSubstream() {
        return null;
    }

    final synchronized void setVolume(byte param0, int param1) {
        this.field_y = param1;
        if (param0 != 122) {
          this.field_y = -6;
        }
    }

    final synchronized void skip(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = ZombieDawn.field_J;
        if (0 < this.field_u) {
          if (this.field_l != null) {
            this.field_v.skip(param0);
            if (1048576 <= this.field_u) {
              if ((!(0 >= this.field_o)) &&
                ((null != this.field_n))) {
                this.field_s.skip(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_r == null) {
                if ((!(0 >= this.field_o)) &&
                  ((null != this.field_n))) {
                  this.field_s.skip(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_t.skip(param0);
              }
            }
          } else {
            if (1048576 <= this.field_u) {
              if ((!(0 >= this.field_o)) &&
                ((null != this.field_n))) {
                this.field_s.skip(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_r == null) {
                if ((!(0 >= this.field_o)) &&
                  ((null != this.field_n))) {
                  this.field_s.skip(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_t.skip(param0);
              }
            }
          }
        } else {
          if (1048576 <= this.field_u) {
            if ((!(0 >= this.field_o)) &&
              ((null != this.field_n))) {
              this.field_s.skip(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_r == null) {
              if ((!(0 >= this.field_o)) &&
                ((null != this.field_n))) {
                this.field_s.skip(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_t.skip(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (0 < this.field_o &&
          null != this.field_n)) {
          this.field_s.skip(param0);
        }
        if (this.field_x) {
          if (0 < this.field_A &&
            !this.field_v.isReady((byte) -34)) {
            this.field_l = null;
            this.field_x = false;
            this.field_A = -this.field_A;
          } else {
            if (this.field_A < 0 &&
              !this.field_t.isReady((byte) -34)) {
              this.field_x = false;
              this.field_A = -this.field_A;
              this.field_r = null;
            }
          }
        }
        if (this.field_A != 0) {
          this.field_u = this.field_u + this.field_A * param0;
          if (1048576 <= this.field_u) {
            this.field_u = 1048576;
            if (!this.field_x) {
              this.field_A = 0;
              if (!this.field_w) {
                if (null != this.field_r) {
                  this.field_t.stop(28013);
                }
                this.field_r = null;
              }
            }
          } else {
            if (this.field_u <= 0) {
              this.field_u = 0;
              if (!this.field_x) {
                this.field_A = 0;
                if (!this.field_w) {
                  if (this.field_l != null) {
                    this.field_v.stop(28013);
                  }
                  this.field_l = null;
                }
              }
            }
          }
        }
    }

    private MusicCrossfadeStream() throws Throwable {
        throw new Error();
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static PcmSampleStream playSoundEffect(int param0, int param1) {
        if (4 <= DelegatingCanvas.field_e.size(-56)) {
          return null;
        }
        if (param0 < 20) {
          field_m = (IntrusiveDeque) null;
        }
        SoundEffectNode var2 = new SoundEffectNode(param1);
        DelegatingCanvas.field_e.addFirst(0, var2);
        return var2.field_j;
    }
}
