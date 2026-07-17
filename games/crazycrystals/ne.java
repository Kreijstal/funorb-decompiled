/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private static int[] field_g;
    static boolean field_b;
    static String field_h;
    static int field_c;
    static String[] field_a;
    static oa field_f;
    static dl field_e;
    static dl field_i;
    static boolean field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (kh.field_c > param4) {
                param1 = param1 - (-param4 + kh.field_c);
                param4 = kh.field_c;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (kh.field_b <= param0) {
                break L2;
              } else {
                param5 = param5 - (-param0 + kh.field_b);
                param0 = kh.field_b;
                break L2;
              }
            }
            L3: {
              if (kh.field_g >= param1 + param4) {
                break L3;
              } else {
                param1 = kh.field_g + -param4;
                break L3;
              }
            }
            L4: {
              var6_int = 121 / ((-55 - param2) / 41);
              if (kh.field_j >= param5 + param0) {
                break L4;
              } else {
                param5 = kh.field_j + -param0;
                break L4;
              }
            }
            L5: {
              if (0 >= param1) {
                break L5;
              } else {
                if (param5 > 0) {
                  var7 = kh.field_l * param0 + param4;
                  var8 = -param1 + kh.field_l;
                  param0 = -param5;
                  L6: while (true) {
                    if (0 <= param0) {
                      break L0;
                    } else {
                      param4 = -param1;
                      L7: while (true) {
                        if (param4 >= 0) {
                          var7 = var7 + var8;
                          param0++;
                          continue L6;
                        } else {
                          L8: {
                            var9 = kh.field_i[var7];
                            if ((65280 & var9) >> 8 <= param3) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var7++;
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
          var6 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var6, "ne.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = true;
        field_g = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)(1 + (var0 << 1));
            var3 = (int)((var6 * var6 >> 18) + -32768L);
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            if (!(field_g.length > var3)) {
                var3 = -1 + field_g.length;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_g[var1] = var0;
            }
        }
        field_f = null;
    }
}
