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
        float var2 = 0.0f;
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
        float stackIn_7_0 = 0.0f;
        float stackIn_14_0 = 0.0f;
        float stackIn_32_0 = 0.0f;
        float stackOut_6_0 = 0.0f;
        float stackOut_5_0 = 0.0f;
        float stackOut_3_0 = 0.0f;
        float stackOut_2_0 = 0.0f;
        float stackOut_13_0 = 0.0f;
        float stackOut_12_0 = 0.0f;
        float stackOut_10_0 = 0.0f;
        float stackOut_9_0 = 0.0f;
        float stackOut_30_0 = 0.0f;
        float stackOut_29_0 = 0.0f;
        float stackOut_31_0 = 0.0f;
        L0: {
          var13 = Kickabout.field_G;
          var2 = (float)((param0 & 16711680) >> -425703856) / 255.0f;
          var3 = (float)((param0 & 65280) >> 528660040) / 255.0f;
          var4 = (float)(param0 & 255) / 255.0f;
          if (var2 > var3) {
            if (var2 <= var4) {
              stackOut_6_0 = var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = var2;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          } else {
            if (var3 > var4) {
              stackOut_3_0 = var3;
              stackIn_7_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = var4;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var5 = stackIn_7_0;
          if (var2 < var3) {
            if (var2 < var4) {
              stackOut_13_0 = var2;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = var4;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          } else {
            if (var3 >= var4) {
              stackOut_10_0 = var4;
              stackIn_14_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = var3;
              stackIn_14_0 = stackOut_9_0;
              break L1;
            }
          }
        }
        L2: {
          var6 = stackIn_14_0;
          if (var6 == var5) {
            var7 = 0.0f;
            break L2;
          } else {
            if (var2 != var5) {
              if (var5 != var3) {
                var7 = (-var3 + var2) / (-var6 + var5) + 4.0f;
                break L2;
              } else {
                var7 = (var4 - var2) / (-var6 + var5) + 2.0f;
                break L2;
              }
            } else {
              var7 = (-var4 + var3) / (var5 - var6);
              break L2;
            }
          }
        }
        var7 = var7 / 6.0f;
        L3: while (true) {
          if (0.0f <= var7) {
            L4: while (true) {
              if (var7 <= 1.0f) {
                L5: {
                  L6: {
                    var9 = (var5 + var6) / 2.0f;
                    if (0.0f == var9) {
                      break L6;
                    } else {
                      if (var6 == var5) {
                        break L6;
                      } else {
                        if (0.5f <= var9) {
                          stackOut_30_0 = (var5 - var6) / (-(2.0f * var9) + 2.0f);
                          stackIn_32_0 = stackOut_30_0;
                          break L5;
                        } else {
                          stackOut_29_0 = (var5 - var6) / (var9 * 2.0f);
                          stackIn_32_0 = stackOut_29_0;
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_31_0 = 0.0f;
                  stackIn_32_0 = stackOut_31_0;
                  break L5;
                }
                var8 = stackIn_32_0;
                var10 = (int)(0.5f + var7 * (float)param1);
                var11 = (int)(7.0f * var8 + 0.5f);
                var12 = (int)(0.5f + var9 * 127.0f);
                return ks.a(var12, var10, -87, var11);
              } else {
                var7 = var7 - 1.0f;
                continue L4;
              }
            }
          } else {
            var7 = var7 + 1.0f;
            continue L3;
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = 14 / ((-6 - param0) / 57);
        field_g = null;
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var2 = Kickabout.field_G;
        if (param0 != 50) {
            field_a = null;
        }
        hn var3 = (hn) (Object) da.field_h.g(24009);
        while (var3 != null) {
            tu.field_E.a(var3, false, 0);
            var3 = (hn) (Object) da.field_h.c(param0 ^ 19);
        }
        da.field_h.b(22997);
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
        L0: {
          var10 = Kickabout.field_G;
          var11 = new gr();
          var3 = new Random();
          var4 = 0;
          if (param1) {
            break L0;
          } else {
            wk.a(-87L, -8);
            break L0;
          }
        }
        L1: while (true) {
          if (var4 <= -6) {
            return var11;
          } else {
            L2: {
              var5 = new up();
              var5.field_q = 0;
              if (-1 == var4) {
                var5.field_q = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (-3 == var4) {
                var5.field_q = 3;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-4 != var4) {
                break L4;
              } else {
                var5.field_q = 1;
                break L4;
              }
            }
            L5: {
              if (param0) {
                var5.field_q = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                var5.field_e = dq.a((byte) -126, td.field_a.length, var3);
                var5.field_l = 1 + dq.a((byte) -62, -1 + ce.field_G[var5.field_q].length, var3);
                var5.field_r = 0;
                if (!param0) {
                  break L7;
                } else {
                  if (-4 != (var4 ^ -1)) {
                    var5.field_g = 10;
                    var5.field_o = 10;
                    var5.field_n = 10;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var5.field_o = 50;
              var5.field_g = 50;
              var5.field_n = 50;
              break L6;
            }
            var5.field_h = new int[]{};
            var6 = dq.a((byte) -48, 5, var3);
            var7 = dq.a((byte) -40, 3, var3);
            var8 = dq.a((byte) 107, 3, var3);
            var9 = var8;
            var9 = var9 | var7 << 193520100;
            var9 = var9 | var6 << 768241160;
            var5.field_j = var9;
            var11.field_i[var4] = var5;
            var4++;
            continue L1;
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
