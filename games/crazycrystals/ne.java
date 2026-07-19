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
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int decompiledRegionSelector0 = 0;
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
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param4 = -param1;
                      L7: while (true) {
                        if ((param4 ^ -1) <= -1) {
                          var7 = var7 + var8;
                          param0++;
                          continue L6;
                        } else {
                          var9 = kh.field_i[var7];
                          if ((65280 & var9) >> -1085804632 > param3) {
                            if ((var9 & 65280) >> 1925298792 >= (var9 & 16711680) >> -665233648) {
                              L8: {
                                var10 = -60 + ((16711680 & var9) >> -1722393361);
                                if ((var10 ^ -1) >= -256) {
                                  break L8;
                                } else {
                                  var10 = 255;
                                  break L8;
                                }
                              }
                              var11 = var9 & 65280;
                              var11 = -(var11 >> -1785288507) + (var11 >> -1440958495) & 65280;
                              var12 = var9 >> -1126478877 & 31;
                              kh.field_i[var7] = hm.a(hm.a(var10 << -653829136, var11), var12);
                              var7++;
                              param4++;
                              continue L7;
                            } else {
                              var7++;
                              param4++;
                              continue L7;
                            }
                          } else {
                            var7++;
                            param4++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var6), "ne.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            field_h = (String) null;
        }
        field_g = null;
        field_i = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_a = null;
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = true;
        field_g = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
            var4 = (long)(-1 + (var0 << -472607359));
            var6 = (long)(1 + (var0 << -1967480703));
            var3 = (int)((var6 * var6 >> 1250116626) + -32768L);
            var2 = (int)((var4 * var4 >> 1607390034) + -32768L);
            if (!(field_g.length > var3)) {
                var3 = -1 + field_g.length;
            }
            for (var1 = (var2 ^ -1) <= -1 ? var2 : 0; var3 >= var1; var1++) {
                field_g[var1] = var0;
            }
        }
        field_f = null;
    }
}
