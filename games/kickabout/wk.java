/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk {
    static vd field_f;
    static String field_a;
    static String field_e;
    static String field_b;
    static ut[] field_d;
    static la[] field_g;
    static up field_c;

    final static short a(int param0, int param1) {
        RuntimeException var2 = null;
        float var2_float = 0.0f;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float stackIn_8_0 = 0.0f;
        float stackIn_15_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        short stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        float stackOut_7_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_4_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_14_0 = 0.0f;
        float stackOut_13_0 = 0.0f;
        float stackOut_11_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_31_0 = 0.0f;
        float stackOut_30_0 = 0.0f;
        float stackOut_32_0 = 0.0f;
        short stackOut_33_0 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_float = (float)((param0 & 16711680) >> 16) / 255.0f;
              var3 = (float)((param0 & 65280) >> 8) / 255.0f;
              var4 = (float)(param0 & 255) / 255.0f;
              if (var2_float > var3) {
                if (var2_float <= var4) {
                  stackOut_7_0 = var4;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = var2_float;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              } else {
                if (var3 > var4) {
                  stackOut_4_0 = var3;
                  stackIn_8_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = var4;
                  stackIn_8_0 = stackOut_3_0;
                  break L1;
                }
              }
            }
            L2: {
              var5 = stackIn_8_0;
              if (var2_float < var3) {
                if (var2_float < var4) {
                  stackOut_14_0 = var2_float;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = var4;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              } else {
                if (var3 >= var4) {
                  stackOut_11_0 = var4;
                  stackIn_15_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = var3;
                  stackIn_15_0 = stackOut_10_0;
                  break L2;
                }
              }
            }
            L3: {
              var6 = stackIn_15_0;
              if (var6 == var5) {
                var7 = 0.0f;
                break L3;
              } else {
                if (var2_float != var5) {
                  if (var5 != var3) {
                    var7 = (-var3 + var2_float) / (-var6 + var5) + 4.0f;
                    break L3;
                  } else {
                    var7 = (var4 - var2_float) / (-var6 + var5) + 2.0f;
                    break L3;
                  }
                } else {
                  var7 = (-var4 + var3) / (var5 - var6);
                  break L3;
                }
              }
            }
            var7 = var7 / 6.0f;
            L4: while (true) {
              if (0.0f <= var7) {
                L5: while (true) {
                  if (var7 <= 1.0f) {
                    L6: {
                      L7: {
                        var9 = (var5 + var6) / 2.0f;
                        if (0.0f == var9) {
                          break L7;
                        } else {
                          if (var6 == var5) {
                            break L7;
                          } else {
                            if (0.5f <= var9) {
                              stackOut_31_0 = (var5 - var6) / (-(2.0f * var9) + 2.0f);
                              stackIn_33_0 = stackOut_31_0;
                              break L6;
                            } else {
                              stackOut_30_0 = (var5 - var6) / (var9 * 2.0f);
                              stackIn_33_0 = stackOut_30_0;
                              break L6;
                            }
                          }
                        }
                      }
                      stackOut_32_0 = 0.0f;
                      stackIn_33_0 = stackOut_32_0;
                      break L6;
                    }
                    var8 = stackIn_33_0;
                    var10 = (int)(0.5f + var7 * (float)param1);
                    var11 = (int)(7.0f * var8 + 0.5f);
                    var12 = (int)(0.5f + var9 * 127.0f);
                    stackOut_33_0 = ks.a(var12, var10, -87, var11);
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    var7 = var7 - 1.0f;
                    continue L5;
                  }
                }
              } else {
                var7 = var7 + 1.0f;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "wk.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_34_0;
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = 14;
        field_g = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        hn var3 = null;
        int var2 = Kickabout.field_G;
        try {
            var3 = (hn) (Object) da.field_h.g(24009);
            while (var3 != null) {
                tu.field_E.a(var3, false, 0);
                var3 = (hn) (Object) da.field_h.c(33);
            }
            da.field_h.b(22997);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wk.E(" + 50 + 41);
        }
    }

    final static gr a(boolean param0, boolean param1) {
        Random var3 = null;
        int var4 = 0;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        gr var11 = null;
        var10 = Kickabout.field_G;
        var11 = new gr();
        var3 = new Random();
        var4 = 0;
        L0: while (true) {
          if (var4 >= 5) {
            return var11;
          } else {
            L1: {
              var5 = new up();
              var5.field_q = 0;
              if (var4 == 0) {
                var5.field_q = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var4 == 2) {
                var5.field_q = 3;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4 != 3) {
                break L3;
              } else {
                var5.field_q = 1;
                break L3;
              }
            }
            L4: {
              if (param0) {
                var5.field_q = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              L6: {
                var5.field_e = dq.a((byte) -126, td.field_a.length, var3);
                var5.field_l = 1 + dq.a((byte) -62, -1 + ce.field_G[var5.field_q].length, var3);
                var5.field_r = 0;
                if (!param0) {
                  break L6;
                } else {
                  if (var4 != 3) {
                    var5.field_g = 10;
                    var5.field_o = 10;
                    var5.field_n = 10;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              var5.field_o = 50;
              var5.field_g = 50;
              var5.field_n = 50;
              break L5;
            }
            var5.field_h = new int[]{};
            var6 = dq.a((byte) -48, 5, var3);
            var7 = dq.a((byte) -40, 3, var3);
            var8 = dq.a((byte) 107, 3, var3);
            var9 = var8;
            var9 = var9 | var7 << 4;
            var9 = var9 | var6 << 8;
            var5.field_j = var9;
            var11.field_i[var4] = var5;
            var4++;
            continue L0;
          }
        }
    }

    final static void a(long param0, int param1) {
        oa.field_a.setTime(new Date(param0));
        if (param1 != 0) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "games in progress (<%0>)";
        field_a = "Kick";
        field_g = new la[]{new la(0, 0, 896, 1344)};
    }
}
