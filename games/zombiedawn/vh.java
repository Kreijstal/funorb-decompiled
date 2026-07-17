/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static ec field_a;
    static vn[] field_e;
    static nk field_d;
    static int field_b;
    static sd field_c;

    final static void a(v param0, int param1, int param2, int param3, int param4, byte param5) {
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
        Object var21 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var6_int = (param1 + -param2 << 8) / param0.field_a;
              param3 = param3 + param0.field_g;
              param4 = param4 + param0.field_h;
              var7 = (param2 << 8) + var6_int * param0.field_g;
              var8 = bi.field_f * param4 + param3;
              var9 = 0;
              var10 = param0.field_d;
              var11 = param0.field_j;
              var12 = -var11 + bi.field_f;
              var13 = 0;
              if (~param4 <= ~bi.field_l) {
                break L1;
              } else {
                var14 = bi.field_l + -param4;
                param4 = bi.field_l;
                var10 = var10 - var14;
                var9 = var9 + var11 * var14;
                var8 = var8 + bi.field_f * var14;
                break L1;
              }
            }
            L2: {
              if (~bi.field_d <= ~(var10 + param4)) {
                break L2;
              } else {
                var10 = var10 - (param4 + (var10 + -bi.field_d));
                break L2;
              }
            }
            L3: {
              if (~bi.field_g >= ~param3) {
                break L3;
              } else {
                var14 = bi.field_g - param3;
                var7 = var7 + var14 * var6_int;
                param3 = bi.field_g;
                var8 = var8 + var14;
                var9 = var9 + var14;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L3;
              }
            }
            L4: {
              if (param3 - -var11 > bi.field_b) {
                var14 = var11 + param3 - bi.field_b;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param5 == 84) {
                break L5;
              } else {
                var21 = null;
                vh.a((v) null, -118, 46, -65, -1, (byte) -59);
                break L5;
              }
            }
            L6: {
              if (var11 <= 0) {
                break L6;
              } else {
                if (var10 > 0) {
                  param4 = -var10;
                  L7: while (true) {
                    if (param4 >= 0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param3 = -var11;
                      L8: while (true) {
                        if (param3 >= 0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param4++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> 8;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L9;
                            } else {
                              L10: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param0.field_l[param0.field_k[incrementValue$1] & 255];
                                if (0 == var17) {
                                  break L10;
                                } else {
                                  if (var15 <= 255) {
                                    var18 = bi.field_c[var8];
                                    var19 = 16711935 & (16711935 & var17) * var15 + var16 * (var18 & 16711935) >> 8;
                                    bi.field_c[var8] = (eg.a(eg.a(var17, 65280) * var15 + var16 * eg.a(65280, var18), 16711732) >> 8) + var19;
                                    break L10;
                                  } else {
                                    bi.field_c[var8] = var17;
                                    break L10;
                                  }
                                }
                              }
                              var8++;
                              break L9;
                            }
                          }
                          param3++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("vh.A(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_d = null;
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new nk(2);
        field_b = 0;
        field_c = new sd();
    }
}
