/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class or {
    static ml field_d;
    static int[] field_a;
    static int field_c;
    static String[][] field_b;

    final static int a(boolean param0) {
        return fj.field_c;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var1_int = qe.field_b[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= qe.field_b.length) {
                break L0;
              } else {
                var3 = qe.field_b[var2];
                dv.a(nb.field_e, var2 << 4, nb.field_e, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "or.B(" + false + ')');
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 1) {
            return;
        }
        System.out.println("Error: " + aj.a(-1, "%0a", "\n", param0));
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(nu param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][][] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        nl var30 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var29 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var30 = param0.field_P[param2][param1];
              var5 = var30.f(-110);
              var6 = var30.a(true);
              var7 = param0.field_r[param2];
              var8 = ws.field_c[var7][-1 + param1][2];
              var9 = ws.field_c[var7][-1 + param1][3];
              var10 = ws.field_c[var7][param1 + -1][0];
              var11 = ws.field_c[var7][-1 + param1][1];
              gl.a(6711, param0);
              if (param2 != 1) {
                break L1;
              } else {
                var11 = -var9 + 1344 - var11;
                var10 = -var8 + 896 + -var10;
                break L1;
              }
            }
            L2: {
              gt.a(param1, param2, (byte) 112, param0.field_r[param2]);
              var12 = ug.a(0, var5);
              var13 = lf.a((byte) -96, var6);
              var14 = ug.a(0, ge.field_m[0]);
              var15 = lf.a((byte) -76, ge.field_m[1]);
              var16 = hw.field_i * 10 >> 8;
              var17 = (-1 + (1 << var30.field_I) & (1 + param1) * ((1 + param2) * 19) + param0.field_J) * hw.field_i >> 8;
              var18 = (1 << var30.field_I) * hw.field_i >> 8;
              if (param2 != 1) {
                if (ih.field_c == 2) {
                  stackOut_7_0 = 16777215;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 65793;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              } else {
                stackOut_4_0 = 13369344;
                stackIn_8_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var19 = stackIn_8_0;
              var20 = 24;
              var21 = 24;
              if ((10 & var30.field_G) == 0) {
                var20 = var20 << 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((5 & var30.field_G) != 0) {
                break L4;
              } else {
                var21 = var21 << 1;
                break L4;
              }
            }
            var20 = hw.field_i * (var20 << 1) >> 8;
            var21 = hw.field_i * (var21 << 1) >> 8;
            eo.a(ug.a(0, var10), lf.a((byte) -126, var11), hw.field_i * var8 >> 8, hw.field_i * var9 >> 8, var19, 100);
            var22 = in.field_c[param2][-1 + param1];
            var23 = 0;
            L5: while (true) {
              if (4 <= var23) {
                eo.b(var14, var15, var16, 16777045);
                on.e(var12, var13, var14, var15, 16776960, 160);
                on.h(var12 - (var20 >> 1), var13 - (var21 >> 1), var20, var21, 16776960, 160);
                on.a(var12 + -(var18 >> 1), 10 + var13, var18, 6, 65793);
                on.a(-(var18 >> 1) + var12 - -1, var13 - -11, -2 + var18 - var17, 4, 13369344);
                on.c(1 + (var12 + -(var18 >> 1)), var13 - -12, -2 + (var18 + -var17), 16777215, 220);
                on.c(-(var18 >> 1) + var12 - -1, var13 + 13, var18 - var17 - 2, 16777215, 120);
                break L0;
              } else {
                var24 = 0;
                L6: while (true) {
                  if (var24 >= -1 + var22[var23].length) {
                    var23++;
                    continue L5;
                  } else {
                    var25 = ug.a(0, var22[var23][var24][0]);
                    var26 = lf.a((byte) -79, var22[var23][var24][1]);
                    var27 = ug.a(0, var22[var23][var24 - -1][0]);
                    var28 = lf.a((byte) -99, var22[var23][var24 - -1][1]);
                    on.e(var25, var26, var27, var28, var19, 128);
                    var24++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("or.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + 99 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
        field_b = new String[][]{new String[3], new String[2], new String[2], new String[2]};
    }
}
