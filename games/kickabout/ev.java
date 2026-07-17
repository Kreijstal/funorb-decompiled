/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ev extends tm {
    static int[] field_B;
    static hd field_D;
    static String field_A;

    public static void g() {
        field_B = null;
        field_A = null;
        field_D = null;
    }

    final static String h(int param0) {
        if (nr.field_f == wk.field_f) {
            return wn.field_i;
        }
        if (param0 != 10326) {
            String discarded$0 = ev.h(113);
            return ma.field_y;
        }
        return ma.field_y;
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 84) {
              int discarded$2 = -126;
              stackOut_3_0 = new li(wq.a(param1[0].a(true)));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (li) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ev.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    ev(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(nu param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            gg.a(param2, 0, param0.field_V);
            var3_int = ug.a(0, param0.field_V.a(true));
            var4 = lf.a((byte) -110, param0.field_V.c(879306160));
            on.e(var3_int, var4, ug.a(0, kk.field_B[0]), lf.a((byte) -70, or.field_a[0]), 16777215, 64);
            on.e(var3_int, var4, ug.a(0, kk.field_B[1]), lf.a((byte) -68, or.field_a[1]), 16777215, 64);
            on.b(ug.a(0, kk.field_B[0]), lf.a((byte) -92, or.field_a[0]), ug.a(0, kk.field_B[1]), lf.a((byte) -98, or.field_a[1]), 16777215);
            if (param1 > 22) {
              L1: {
                var5 = ug.a(0, pu.field_zb[0]);
                var6 = lf.a((byte) -102, pu.field_zb[1]);
                on.b(ug.a(0, kk.field_B[0] + kk.field_B[1] >> 1), lf.a((byte) -86, or.field_a[0] + or.field_a[1] >> 1), var5, var6, 16777215);
                on.b(-4 + var5, var6 - 4, var5 - -4, 4 + var6, 16776960);
                on.b(var5 + -4, var6 - -4, var5 - -4, var6 + -4, 16776960);
                var7 = param0.field_P[param2][0];
                on.c(ug.a(0, 372), lf.a((byte) -110, var7.a(true)), ug.a(0, 523) + -ug.a(0, 372), 16776960, 128);
                var8 = 4474111;
                var9 = var7.f(-105) + -param0.field_V.a(true);
                var10 = var7.a(true) + -param0.field_V.c(879306160);
                int discarded$1 = 170;
                var11 = nb.a(var7);
                if (var11 * var11 <= var10 * var10 + var9 * var9) {
                  break L1;
                } else {
                  var8 = 16711680;
                  break L1;
                }
              }
              L2: {
                var12 = var11 * hw.field_i >> 8;
                on.c(ug.a(0, var7.f(-101)), lf.a((byte) -125, var7.a(true)), var12, var8);
                var12 = 28 * hw.field_i >> 8;
                on.c(ug.a(0, var7.f(-120)), lf.a((byte) -64, var7.a(true)), var12, 16777215);
                var12 = 250 * hw.field_i >> 8;
                if (0 != param2) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1344;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              L3: {
                var13 = stackIn_8_0;
                var9 = -param0.field_V.a(true) + 448;
                var10 = -param0.field_V.c(879306160) + var13;
                var14 = 3407616;
                if (var9 * var9 + var10 * var10 < 62500) {
                  var14 = 16711680;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                on.c(ug.a(0, 448), lf.a((byte) -65, var13), var12, var14);
                if (-1 != param0.field_V.field_m) {
                  break L4;
                } else {
                  if (param0.field_V.field_h != 0) {
                    L5: {
                      if (param2 == 1) {
                        var15 = -param0.field_V.field_p / param0.field_V.field_h;
                        break L5;
                      } else {
                        var15 = (-param0.field_V.field_p + 88080384) / param0.field_V.field_h;
                        break L5;
                      }
                    }
                    if (var15 <= 0) {
                      break L4;
                    } else {
                      if (20 <= var15) {
                        break L4;
                      } else {
                        var16 = param0.field_V.field_t - -(var15 * param0.field_V.field_q) >> 16;
                        if (param2 == 1) {
                          on.a(-10 + ug.a(0, var16), lf.a((byte) -118, 0), 20, 16711935);
                          break L4;
                        } else {
                          on.a(ug.a(0, var16) - 10, lf.a((byte) -126, 1344), 20, 16776960);
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var15 = ug.a(0, var7.f(-116));
              var16 = lf.a((byte) -82, var7.a(true));
              on.a(var15 + -50, -6 + var16, 100, 12, 65793, 208);
              q.field_d.d("DMG=" + var7.field_o + "  A=" + var7.field_u + "  T=" + var7.field_L, var15, var16 - -4, 16777215, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ev.B(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        field_B = new int[32];
        for (var0 = 0; var0 < 16; var0++) {
            for (var1 = 0; var1 < 2; var1++) {
                var2 = var0 << 2;
                var3 = 7;
                var4 = 0 == var1 ? 10 : 50;
                if (var0 == 15) {
                    var3 = 0;
                    var4 = var1 * 123 + 1;
                    var2 = 0;
                }
                if (var0 == 14) {
                    var2 = 0;
                    var4 = 20 + 20 * var1;
                    var3 = 0;
                }
                field_B[var0 - -(16 * var1)] = hf.a(hf.a(var3 << 7, var2 << 10), var4);
            }
        }
        field_A = "Passwords must be between 5 and 20 letters and numbers";
    }
}
