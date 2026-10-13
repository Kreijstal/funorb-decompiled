/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends lp implements en {
    private boolean field_Db;
    private dk field_Eb;
    static int tableSubmissionSequence;
    private boolean field_Fb;

    final static void a(int param0, RasterCacheSurface param1, int param2, RgbSprite param3, int param4, boolean param5) {
        try {
          if (param5) {
            tableSubmissionSequence = -58;
          }
          IndexedSpriteGeometry.pushSpriteRaster(-77, param1.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param1.width, param1.height, rm.farmBackgroundColors[param0], 22953);
          param3.b((-param3.canvasWidth + param1.width) / 2 - 80 / param2, -param3.canvasHeight + (param1.height + param4 - 201 / param2), 41, 110);
          sc.popRaster(-107);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean h(int param0) {
        if (param0 != 0) {
          return true;
        }
        if (!this.field_N) {
          return super.h(0);
        }
        if (this.field_Db) {
          return super.h(0);
        }
        oh var2 = SoundPlayback.a(106);
        if (var2 != null) {
          this.a(-7, var2, false);
          return super.h(0);
        }
        return super.h(0);
    }

    final static int p(int param0) {
        if (param0 == 248) {
          return to.field_a + ((InstructionsScreen.field_v << 2) + (InstructionsScreen.field_r << 4));
        }
        tableSubmissionSequence = 19;
        return to.field_a + ((InstructionsScreen.field_v << 2) + (InstructionsScreen.field_r << 4));
    }

    qf(cp param0, dk param1) {
        super(param0, wm.field_a, ie.field_o, false, false);
        try {
          this.field_Eb = param1;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(boolean param0) {
        this.a(-7, AchievementIcon.a(248, -85, CircleBody.field_q), param0);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (this.field_Fb) {
          ag.a((byte) -16, true, false);
          return;
        }
        if (param2 >= -22) {
          return;
        }
        try {
          ek.l(64);
          this.m(17);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qf.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, oh param1, boolean param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ec var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_Db = true;
          if (param1.field_c) {
            var4 = FramedMenuScreen.field_r;
          } else {
            if (null != param1.field_e) {
              var4 = ng.field_f;
              if (null != this.field_Eb) {
                this.field_Eb.a((byte) 124);
              }
            } else {
              var4 = param1.field_g;
              if (param1.field_d == 248) {
                if (!param2) {
                  CachedArchiveSource.e(-77);
                }
                this.field_Fb = true;
                var4 = CircleBody.field_q;
              }
            }
          }
          var5 = new ec((lp) (this), wm.field_a, var4);
          if (param1.field_c) {
            if (param1.field_a) {
              this.b((byte) 118, new ig(this));
              return;
            }
            var5.a((byte) 126, ri.field_L, (uh) (this));
          } else {
            if (this.field_Fb) {
              var5.a((byte) -37, ri.field_L, (uh) (this));
            } else {
              if (param1.field_d != 5) {
                var5.a(false, HalloweenBackground.field_s, -1);
              } else {
                var5.a(false, ec.field_L, 11);
                var5.a(false, wc.field_a, 17);
              }
            }
            if (3 == param1.field_d) {
              var5.a(false, Ball.field_H, 7);
            } else {
              if (param1.field_d == 6) {
                var5.a(false, cb.field_p, 9);
              }
            }
          }
          this.b((byte) 106, var5);
          if (param0 == -7) {
            return;
          }
          this.field_Eb = (dk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("qf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
