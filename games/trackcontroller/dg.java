/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends al {
    private qj[] field_Q;
    private qj field_G;
    private int field_F;
    private int field_K;
    static be field_H;
    private qj field_R;
    private int field_P;
    boolean field_C;
    private qj field_O;
    private int field_D;
    private int field_I;
    private int field_M;
    int field_J;
    static java.awt.Color field_E;
    static boolean field_B;

    final void a(int param0, int param1, byte param2) {
        ((dg) this).field_F = (16711422 & param0) >> 1;
        ((dg) this).field_I = param1;
        ((dg) this).field_D = param0;
        if (param2 != -33) {
          return;
        } else {
          ((dg) this).field_P = (16711422 & param1) >> 1;
          this.i(param2 + -22471);
          return;
        }
    }

    private final qj b() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TrackController.field_F ? 1 : 0;
        int var2 = ((dg) this).field_u >> 1;
        qj var3 = new qj(var2, ((dg) this).field_u);
        mb.a((byte) -18, var3);
        for (var4 = 0; ((dg) this).field_u > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((dg) this).field_u - var4) * var4);
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                ll.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
        }
        ch.m(96);
        return var3;
    }

    public static void a() {
        int var1 = -59;
        field_H = null;
        field_E = null;
    }

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, param6 >> 1 & 8355711);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param3 == 29221) {
            break L0;
          } else {
            ((dg) this).a(-117, 48, 62, -30);
            break L0;
          }
        }
        if (param0 != 0) {
          return;
        } else {
          L1: {
            var5 = ((dg) this).field_p + param1;
            var6 = ((dg) this).field_m + param2;
            this.a(((dg) this).field_Q[0], -86, var5, var6);
            if (((dg) this).field_J < 65536) {
              mb.a(var5 + (((dg) this).field_x * ((dg) this).field_J >> 16), var6, var6 - -((dg) this).field_u, (byte) -41, ((dg) this).field_x + var5);
              this.a(((dg) this).field_Q[1], -70, var5, var6);
              ch.m(param3 ^ -29281);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(-22504);
    }

    private final void a(qj param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 < -41) {
              var5_int = ((dg) this).field_x + param2;
              mb.a(param2 + ((dg) this).field_O.field_t, param3, param3 - -((dg) this).field_u, (byte) -103, var5_int - ((dg) this).field_O.field_t);
              var6 = -((dg) this).field_M + param2;
              L1: while (true) {
                if (var5_int <= var6) {
                  L2: {
                    ch.m(40);
                    if (ll.field_a <= param2 - -((dg) this).field_O.field_t) {
                      mb.a((byte) -72, ((dg) this).field_G);
                      param0.e(-((dg) this).field_M, 0);
                      param0.e(2 * ((dg) this).field_K - ((dg) this).field_M, 0);
                      ((dg) this).field_R.c(0, 0);
                      ch.m(53);
                      ((dg) this).field_G.e(param2, param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (var5_int + -((dg) this).field_O.field_t <= ll.field_e) {
                    mb.a((byte) -57, ((dg) this).field_G);
                    var7 = ((dg) this).field_x + -((dg) this).field_O.field_t + ((dg) this).field_M;
                    L3: while (true) {
                      if (var7 <= ((dg) this).field_K * 2) {
                        param0.e(-var7, 0);
                        param0.e(-var7 + ((dg) this).field_K * 2, 0);
                        ((dg) this).field_O.c(0, 0);
                        ch.m(-122);
                        ((dg) this).field_G.e(var5_int - ((dg) this).field_O.field_t, param3);
                        break L0;
                      } else {
                        var7 = var7 - ((dg) this).field_K * 2;
                        continue L3;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  param0.e(var6, param3);
                  var6 = var6 + param0.field_t;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("dg.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final qj a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qj var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = TrackController.field_F ? 1 : 0;
        var14 = new qj(2 * ((dg) this).field_K, ((dg) this).field_u);
        mb.a((byte) -72, var14);
        var5 = ((dg) this).field_u >> 1;
        var6 = 0;
        L0: while (true) {
          if (((dg) this).field_u <= var6) {
            ch.m(-88);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (-1 + 2 * ((dg) this).field_K) % (((dg) this).field_K * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = var6 + -var5;
              var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
              if (var11 >= 256) {
                stackOut_4_0 = var8 | var9;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              ll.a(var7, var6, ((dg) this).field_K, var12);
              var8 = 16711935 & param0;
              ll.a(var7 - ((dg) this).field_K * 2, var6, ((dg) this).field_K, var12);
              var9 = param0 & 65280;
              if (var11 < 256) {
                stackOut_7_0 = (16711680 & var9 * var11 | var11 * var8 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            ll.a(var7 + ((dg) this).field_K, var6, ((dg) this).field_K, var12);
            ll.a(-((dg) this).field_K + var7, var6, ((dg) this).field_K, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1, byte param2, al param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((dg) this).field_C) {
                break L1;
              } else {
                ((dg) this).field_M = ((dg) this).field_M + 1;
                if (2 * ((dg) this).field_K >= ((dg) this).field_M) {
                  break L1;
                } else {
                  ((dg) this).field_M = ((dg) this).field_M - 2 * ((dg) this).field_K;
                  break L1;
                }
              }
            }
            if (param2 == -124) {
              break L0;
            } else {
              this.i(-65);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("dg.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void i(int param0) {
        if (param0 != -22504) {
          return;
        } else {
          ((dg) this).field_Q = new qj[]{this.a(((dg) this).field_D, true, ((dg) this).field_I), this.a(((dg) this).field_F, true, ((dg) this).field_P)};
          int discarded$1 = 1;
          ((dg) this).field_O = this.b();
          ((dg) this).field_R = ((dg) this).field_O.c();
          ((dg) this).field_G = new qj(((dg) this).field_u >> 1, ((dg) this).field_u);
          return;
        }
    }

    final static qj[] a(boolean param0, int param1, int param2, kk param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        qj[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (sk.a(param2, param3, 1, param1)) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  var5 = null;
                  qj[] discarded$2 = dg.a(true, 90, -7, (kk) null);
                  break L1;
                }
              }
              stackOut_5_0 = nb.a((byte) -100);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("dg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((dg) this).field_P = param7;
        ((dg) this).field_F = param8;
        ((dg) this).field_D = param6;
        ((dg) this).field_I = param5;
        ((dg) this).field_K = param4;
        ((dg) this).a(param3, -3050, param1, param2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new java.awt.Color(10040319);
        field_B = false;
    }
}
