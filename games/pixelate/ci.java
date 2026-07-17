/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends jj {
    private li field_q;
    static boolean field_n;
    static int[] field_m;
    static String field_r;
    private li field_p;
    static int field_o;

    final void c(int param0) {
        super.c(param0);
        ((ci) this).field_p.a(440, 100, (byte) 116, 120, 0);
        ((ci) this).field_q.a(440, 100, (byte) 116, 120, 0);
        lg.field_a = lg.field_a - 4;
        if (!(0 <= lg.field_a)) {
            lg.field_a = 0;
        }
    }

    final void a(boolean param0) {
        qa.field_g.f(0, 0);
        int var2 = lg.field_a >> 3;
        t.f(0, 0, 640, 480, 17, (var2 << 8) + (var2 * 2 + 34) - -(var2 << 16));
        ((ci) this).field_p.b((byte) -123);
        ((ci) this).field_q.b((byte) -123);
        Pixelate.field_E.b(0, -Pixelate.field_E.field_B + 480);
        if (param0) {
            return;
        }
        u.field_f.b(0, -u.field_f.field_B + 480, lg.field_a);
    }

    ci(String param0, tf[] param1) {
        super(param0, param1);
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var18 = new int[255];
            var16 = var18;
            var14 = var16;
            var12 = var14;
            var11 = var12;
            var3_array = var11;
            var4 = 0;
            L1: while (true) {
              if (~var4 <= ~var18.length) {
                var19 = new int[255];
                var5 = 0;
                L2: while (true) {
                  if (var19.length <= var5) {
                    ((ci) this).field_p = new li(2, 47, var18);
                    ((ci) this).field_q = new li(1, 47, var19);
                    break L0;
                  } else {
                    L3: {
                      var6 = 257 * var5;
                      var8 = (int)((double)var5 * 0.6);
                      var7 = (int)((double)var5 * 0.6);
                      var7 = var7 >> 1;
                      var9 = var5;
                      var8 = var8 >> 1;
                      if (var8 <= 255) {
                        break L3;
                      } else {
                        var8 = 255;
                        break L3;
                      }
                    }
                    L4: {
                      var9 = var9 >> 1;
                      if (var9 <= 255) {
                        break L4;
                      } else {
                        var9 = 255;
                        break L4;
                      }
                    }
                    L5: {
                      if (0 <= var8) {
                        break L5;
                      } else {
                        var8 = 0;
                        break L5;
                      }
                    }
                    L6: {
                      if (var7 >= 0) {
                        break L6;
                      } else {
                        var7 = 0;
                        break L6;
                      }
                    }
                    L7: {
                      var7 = var7 << 16;
                      var8 = var8 << 8;
                      if (var9 >= 0) {
                        break L7;
                      } else {
                        var9 = 0;
                        break L7;
                      }
                    }
                    var6 = var8 | var7 | var9;
                    var19[var5] = var6;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  var5 = var4 * 257;
                  var6 = var4;
                  var7 = var4;
                  var6 = var6 >> 1;
                  var8 = (int)(0.5 * (double)var4);
                  var7 = var7 >> 1;
                  var8 = var8 >> 1;
                  if (var7 <= 255) {
                    break L8;
                  } else {
                    var7 = 255;
                    break L8;
                  }
                }
                L9: {
                  if (var7 >= 0) {
                    break L9;
                  } else {
                    var7 = 0;
                    break L9;
                  }
                }
                L10: {
                  if (var6 >= 0) {
                    break L10;
                  } else {
                    var6 = 0;
                    break L10;
                  }
                }
                L11: {
                  if (var8 <= 255) {
                    break L11;
                  } else {
                    var8 = 255;
                    break L11;
                  }
                }
                L12: {
                  var6 = var6 << 16;
                  var7 = var7 << 8;
                  if (var8 >= 0) {
                    break L12;
                  } else {
                    var8 = 0;
                    break L12;
                  }
                }
                var5 = var7 | var6 | var8;
                var18[var4] = var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("ci.<init>(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L13;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L13;
            }
          }
          L14: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L14;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    public static void d() {
        field_m = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_m = new int[132];
        field_r = "Create unrated game";
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = 256;
        }
        field_m[118] = 200;
        field_m[57] = 180;
        field_m[7] = 141;
        field_m[113] = 146;
        field_m[62] = 103;
        field_m[79] = 200;
        field_m[59] = 180;
        field_m[112] = 146;
        field_m[126] = 211;
        field_m[115] = 205;
        field_m[6] = 150;
        field_m[124] = 201;
        field_m[61] = 190;
        field_m[119] = 200;
        field_m[117] = 146;
        field_m[58] = 180;
        field_m[39] = 213;
        field_m[114] = 146;
        field_m[63] = 180;
        field_m[60] = 180;
        field_m[38] = 213;
        field_m[56] = 180;
        field_m[78] = 200;
        field_m[131] = 238;
    }
}
