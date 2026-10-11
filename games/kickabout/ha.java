/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends i {
    static String field_J;
    static int[] field_F;
    static int field_G;
    static hd[] field_H;
    static int field_I;

    final static ki b(int param0, int param1, int param2) {
        if (param0 != 1) {
          return (ki) null;
        }
        return new ki(1, param1, param2, (byte) 0, (byte) 0);
    }

    ha() {
        super(23);
    }

    final static boolean a(boolean param0, byte param1) {
        if (param1 != -48) {
          ha.g(120);
        }
        return !param0 ? true : false;
    }

    final static void c(int param0, boolean param1) {
        if (param0 != 100) {
          ha.c(23, true);
        }
        vs.a(true, param1, (byte) 39);
    }

    final void a(int param0, int param1) {
        super.a(75, param1);
        if (param0 < 60) {
          return;
        }
        if (param1 == 1) {
          ql.a((byte) 29, true, dg.field_f);
        }
    }

    final static up a(long param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        up stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_3;
        up stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_3;
        up stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_3;
        long var6;
        Random var8;
        up var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var10Lifetime1;
        int var13Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var16 = Kickabout.field_G;
        param2 = param2 & 15;
        if (param3 > -37) {
          ha.a(-62L, -5, -19, -99, -27);
        }
        var6 = param0;
        var6 = var6 ^ (long)(2 + param4);
        var6 = ub.a(4, (byte) -80, var6);
        var6 = var6 ^ (long)(1 + param1);
        var6 = ub.a(4, (byte) 115, var6);
        var6 = var6 ^ (long)(1 + param2);
        var6 = ub.a(4, (byte) -119, var6);
        var8 = new Random(var6);
        var9 = new up();
        var9.field_c = true;
        if (param4 == -1) {
          var9.field_q = param1 / 2;
          if (var9.field_q == 2) {
            var9.field_q = 3;
          } else {
            if (var9.field_q == 3) {
              var9.field_q = 2;
            }
          }
          var10 = 50 + param1 % 2 * 50;
          var9.field_o = var10;
          var9.field_n = var10;
          var9.field_r = 0;
          var9.field_g = var10;
          var11 = 1;
          if (2 == var9.field_q) {
            var11 = 3;
          }
          var9.field_h = new int[var11];
          if (var9.field_q == 2) {
            var9.field_h[0] = 3;
            for (var12 = 1; var9.field_h.length > var12; var12++) {
              var9.field_h[var12] = dq.$cfr$intArgs$a$7f8aad568c81(-115, 4, var8);
            }
          } else {
            for (var12 = 0; var12 < var9.field_h.length; var12++) {
              if (2 == param1) {
                var9.field_h[var12] = 0;
              } else {
                if (param1 > 2 &&
                  5 > param1) {
                  var9.field_h[var12] = dq.$cfr$intArgs$a$7f8aad568c81(-118, 2, var8);
                } else {
                  var9.field_h[var12] = dq.$cfr$intArgs$a$7f8aad568c81(120, 3, var8);
                }
              }
            }
          }
        } else {
          stackIn_6_0 = (3 <= param4) ? 2 : 3;
          var10 = stackIn_6_0;
          var9.field_q = param1 / var10;
          if (var9.field_q == 2) {
            var9.field_q = 3;
          } else {
            if (var9.field_q == 3) {
              var9.field_q = 2;
            }
          }
          if (param4 < 2 &&
            var9.field_q == 2) {
            var9.field_q = 3;
          }
          var11 = 40 + dq.$cfr$intArgs$a$7f8aad568c81(-69, 4, var8) * 10;
          if (var9.field_q == 0) {
            stackIn_18_0 = var9;
            stackIn_18_1 = ng.field_d[param4];
            stackIn_18_2 = 86;
            if (param4 == 0) {
              stackIn_19_3 = 6;
            } else {
              stackIn_19_3 = 11;
            }
            stackIn_18_0.field_o = stackIn_18_1 + dq.$cfr$intArgs$a$7f8aad568c81(stackIn_18_2, stackIn_19_3, var8);
            var9.field_g = var11 * var9.field_o / 100;
            var9.field_n = (100 - var11) * var9.field_o / 100;
          }
          if (var9.field_q == 3) {
            stackIn_24_0 = var9;
            stackIn_24_1 = ng.field_d[param4];
            stackIn_24_2 = -60;
            if (param4 == 0) {
              stackIn_25_3 = 6;
            } else {
              stackIn_25_3 = 11;
            }
            stackIn_24_0.field_g = stackIn_24_1 + dq.$cfr$intArgs$a$7f8aad568c81(stackIn_24_2, stackIn_25_3, var8);
            var9.field_o = var11 * var9.field_g / 100;
            var9.field_n = (100 - var11) * var9.field_g / 100;
          }
          if (var9.field_q == 1) {
            stackIn_30_0 = var9;
            stackIn_30_1 = ng.field_d[param4];
            stackIn_30_2 = -66;
            if (param4 == 0) {
              stackIn_31_3 = 6;
            } else {
              stackIn_31_3 = 11;
            }
            stackIn_30_0.field_n = stackIn_30_1 + dq.$cfr$intArgs$a$7f8aad568c81(stackIn_30_2, stackIn_31_3, var8);
            var9.field_g = var9.field_n * var11 / 100;
            var9.field_o = (-var11 + 100) * var9.field_n / 100;
          }
          if (2 == var9.field_q) {
            var12 = ng.field_d[param4] + dq.$cfr$intArgs$a$7f8aad568c81(-41, 11, var8);
            var11 = dq.$cfr$intArgs$a$7f8aad568c81(81, 3, var8) * 10 + 60;
            var9.field_o = var12 * var11 / 100;
            var11 = 60 + dq.$cfr$intArgs$a$7f8aad568c81(-90, 3, var8) * 10;
            var9.field_g = var12 * var11 / 100;
            var11 = 60 + dq.$cfr$intArgs$a$7f8aad568c81(127, 3, var8) * 10;
            var9.field_n = var12 * var11 / 100;
          }
          var9.field_r = 0;
          if (var9.field_o > 80) {
            var9.field_o = 80;
          }
          if (var9.field_g > 80) {
            var9.field_g = 80;
          }
          if (var9.field_n > 80) {
            var9.field_n = 80;
          }
          var12 = 0;
          if (var9.field_q != 2) {
            var12++;
            if (param4 >= 4 &&
              dq.$cfr$intArgs$a$7f8aad568c81(89, 2, var8) == 0) {
              var12++;
            }
          } else {
            var12++;
            if (param4 >= 5) {
              var12++;
            }
            if (0 == dq.$cfr$intArgs$a$7f8aad568c81(-73, 2, var8)) {
              var12++;
            }
          }
          var9.field_h = new int[var12];
          if (2 == var9.field_q) {
            var9.field_h[0] = 3;
            for (var13 = 1; var9.field_h.length > var13; var13++) {
              var14 = dq.$cfr$intArgs$a$7f8aad568c81(-89, 100, var8);
              for (var15 = 0; var15 < vo.field_eb[param4].length; var15++) {
                if (var14 > vo.field_eb[param4][var15]) {
                  var14 = var14 - vo.field_eb[param4][var15];
                  continue;
                }
                var9.field_h[var13] = var15;
                break;
              }
            }
          } else {
            for (var13 = 0; var9.field_h.length > var13; var13++) {
              {
                if (param4 >= 2) {
                  var14 = dq.$cfr$intArgs$a$7f8aad568c81(122, 100, var8);
                  var17 = 0;
                  var15 = var17;
                  while (ct.field_v[param4].length > var17) {
                    if (var14 <= ct.field_v[param4][var17]) {
                      var9.field_h[var13] = var17;
                      break;
                    }
                    var14 = var14 - ct.field_v[param4][var17];
                    var17++;
                  }
                } else {
                  var9.field_h[var13] = 0;
                }
              }
            }
          }
        }
        var9.field_e = dq.$cfr$intArgs$a$7f8aad568c81(-67, td.field_a.length, var8);
        var9.field_l = dq.$cfr$intArgs$a$7f8aad568c81(-98, ce.field_G[var9.field_q].length - 1, var8) + 1;
        var10Lifetime1 = dq.$cfr$intArgs$a$7f8aad568c81(-62, 5, var8);
        var11Lifetime1 = dq.$cfr$intArgs$a$7f8aad568c81(-114, 3, var8);
        var12Lifetime1 = dq.$cfr$intArgs$a$7f8aad568c81(-41, 3, var8);
        var13Lifetime1 = var12Lifetime1;
        var13Lifetime1 = var13Lifetime1 | var11Lifetime1 << 4;
        var13Lifetime1 = var13Lifetime1 | var10Lifetime1 << 8;
        var9.field_j = var13Lifetime1;
        return var9;
    }

    public static void g(int param0) {
        field_H = null;
        field_F = null;
        if (param0 != 100) {
          ha.a(false, (byte) -43);
        }
        field_J = null;
    }

    static {
        field_J = "To server list";
        field_F = st.c(-23091);
        field_I = 0;
    }
}
