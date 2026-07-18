/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int[] field_e;
    static String field_g;
    static boolean field_b;
    int field_h;
    static ek[] field_c;
    static qd field_i;
    static int field_d;
    static li field_a;
    static String field_f;

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        field_c = null;
        field_g = null;
        field_e = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ua(int param0) {
        ((ua) this).field_h = param0;
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var20 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var6_int = (param0 + -param1 << 8) / param2.field_w;
              param4 = param4 + param2.field_t;
              param5 = param5 + param2.field_s;
              var7 = (param1 << 8) - -(var6_int * param2.field_t);
              var8 = param4 - -(param5 * ti.field_i);
              var9 = 0;
              var10 = param2.field_y;
              var11 = param2.field_v;
              var12 = ti.field_i + -var11;
              var13 = 0;
              if (param5 >= ti.field_f) {
                break L1;
              } else {
                var14 = ti.field_f + -param5;
                param5 = ti.field_f;
                var8 = var8 + ti.field_i * var14;
                var10 = var10 - var14;
                var9 = var9 + var14 * var11;
                break L1;
              }
            }
            L2: {
              if (param4 >= ti.field_e) {
                break L2;
              } else {
                var14 = ti.field_e + -param4;
                var9 = var9 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var8 = var8 + var14;
                var12 = var12 + var14;
                param4 = ti.field_e;
                var7 = var7 + var14 * var6_int;
                break L2;
              }
            }
            L3: {
              if (var10 + param5 > ti.field_l) {
                var10 = var10 - (param5 + var10 - ti.field_l);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ti.field_c < var11 + param4) {
                var14 = -ti.field_c + param4 - -var11;
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 > 0) {
                  param5 = -var10;
                  L6: while (true) {
                    if (param5 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param4 = -var11;
                      L7: while (true) {
                        if (param4 >= 0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param5++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (0 <= var15) {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param2.field_z[incrementValue$1];
                                if (0 != var17) {
                                  if (var15 > 255) {
                                    ti.field_a[var8] = var17;
                                    break L9;
                                  } else {
                                    var18 = ti.field_a[var8];
                                    var19 = var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8 & 16711935;
                                    ti.field_a[var8] = (sa.a(16711841, var15 * sa.a(65280, var17) + var16 * sa.a(65280, var18)) >> 8) + var19;
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            } else {
                              var9++;
                              var8++;
                              break L8;
                            }
                          }
                          param4++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 0 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_g = "Unpacking graphics";
        field_i = new qd(1);
        field_a = new li(0, 2, 2, 1);
        field_f = "Play the game without logging in just yet";
    }
}
