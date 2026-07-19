/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends gi {
    static he field_m;
    int field_o;
    int field_s;
    fk field_k;
    static qb field_q;
    static he field_l;
    int field_n;
    static String field_p;
    static int[] field_t;
    static vj field_h;
    int field_j;
    int field_i;
    static String field_r;

    public static void a(byte param0) {
        field_m = null;
        if (param0 != 111) {
          field_r = (String) null;
          field_p = null;
          field_r = null;
          field_q = null;
          field_t = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_p = null;
          field_r = null;
          field_q = null;
          field_t = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    final static nh a(int param0, vj param1, int param2, int param3) {
        nh discarded$2 = null;
        RuntimeException var4 = null;
        vj var5 = null;
        nh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nh stackOut_5_0 = null;
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
            L1: {
              if (param3 == 16711680) {
                break L1;
              } else {
                var5 = (vj) null;
                discarded$2 = fk.a(-100, (vj) null, -21, -59);
                break L1;
              }
            }
            if (fl.a(param2, param1, param0, (byte) -98)) {
              stackOut_5_0 = ta.a(param3 ^ 16732209);
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
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("fk.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 >= wj.field_g) {
                break L1;
              } else {
                param1 = param1 - (wj.field_g + -param5);
                param5 = wj.field_g;
                break L1;
              }
            }
            L2: {
              if (param2 >= wj.field_e) {
                break L2;
              } else {
                param0 = param0 - (wj.field_e - param2);
                param2 = wj.field_e;
                break L2;
              }
            }
            L3: {
              if (wj.field_b >= param5 - -param1) {
                break L3;
              } else {
                param1 = -param5 + wj.field_b;
                break L3;
              }
            }
            L4: {
              if (param0 + param2 <= wj.field_j) {
                break L4;
              } else {
                param0 = -param2 + wj.field_j;
                break L4;
              }
            }
            L5: {
              if (param1 <= 0) {
                break L5;
              } else {
                if (-1 > (param0 ^ -1)) {
                  var6_int = param5 + wj.field_k * param2;
                  var8 = 9 % ((22 - param4) / 43);
                  var7 = wj.field_k - param1;
                  param2 = -param0;
                  L6: while (true) {
                    if (-1 >= (param2 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5 = -param1;
                      L7: while (true) {
                        if (-1 >= (param5 ^ -1)) {
                          var6_int = var6_int + var7;
                          param2++;
                          continue L6;
                        } else {
                          L8: {
                            var9 = wj.field_l[var6_int];
                            if (param3 >= (255 & var9 >> 946325544)) {
                              break L8;
                            } else {
                              if ((255 & var9 >> -1670962096) > (255 & var9 >> -547912536)) {
                                break L8;
                              } else {
                                L9: {
                                  var10 = (510 & var9 >> -2084989105) + -60;
                                  if (-256 > (var10 ^ -1)) {
                                    var10 = 255;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var11 = 65280 & var9;
                                var11 = 65280 & (var11 >> -1217331039) - (var11 >> -2050321339);
                                var12 = (255 & var9) >> 894859075;
                                wj.field_l[var6_int] = li.a(li.a(var10 << 1462927920, var11), var12);
                                break L8;
                              }
                            }
                          }
                          var6_int++;
                          param5++;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var6), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    fk(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param4;
        this.field_n = param3;
        this.field_s = param0;
        this.field_i = param2;
        this.field_o = param1;
    }

    static {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_t = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680, 16711680};
        field_r = "Name is available";
    }
}
