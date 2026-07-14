/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci extends td {
    static String field_p;
    static int[] field_q;

    public static void b(int param0) {
        field_q = null;
        field_p = null;
        int var1 = 114 % ((-67 - param0) / 47);
    }

    final ii a(op param0, int param1) {
        naa var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        int var15 = 0;
        aga var16 = null;
        int[][] var20 = null;
        var15 = BachelorFridge.field_y;
        var16 = ((ci) this).field_h.a(param1 + 9, param0);
        var4 = new naa(((ci) this).field_g, new nq(var16));
        var4.field_t = ((ci) this).field_n;
        var4.field_q = ((ci) this).field_k;
        var20 = var4.d(9268);
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> 1719895905;
        var9 = -1 + var7 >> 849890977;
        var4.field_u = 0;
        if (param1 == 3) {
          var10 = 0;
          L0: while (true) {
            if (var6 <= var10) {
              L1: {
                if (-1 <= (var4.field_u ^ -1)) {
                  break L1;
                } else {
                  var4.field_r = kla.a(var4.field_u, param0.field_w, -2147483648);
                  break L1;
                }
              }
              return (ii) (Object) var4;
            } else {
              var11 = 0;
              L2: while (true) {
                if (var11 >= var7) {
                  var10++;
                  continue L0;
                } else {
                  if (-2 == (var20[var10][var11] ^ -1)) {
                    var12 = -var8 + (var10 + ((ci) this).field_k);
                    var13 = ((ci) this).field_n + var11 + -var9;
                    if (0 <= var12) {
                      if (var12 < param0.field_z) {
                        if (var13 >= 0) {
                          if (param0.field_B > var13) {
                            var14 = param0.field_a[var12][var13];
                            if (0 == var14.field_n) {
                              if (var14.field_l == null) {
                                if (6 > var4.field_u) {
                                  if (kla.a(10, param0.field_w, -2147483648) <= 3) {
                                    var4.field_u = var4.field_u + 1;
                                    var4.field_s[var4.field_u] = new aj(var12, var13);
                                    var11++;
                                    continue L2;
                                  } else {
                                    var11++;
                                    continue L2;
                                  }
                                } else {
                                  var11++;
                                  continue L2;
                                }
                              } else {
                                var11++;
                                continue L2;
                              }
                            } else {
                              var11++;
                              continue L2;
                            }
                          } else {
                            var11++;
                            continue L2;
                          }
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    ci(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((ci) this).field_n = param3;
        ((ci) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[16384];
        field_p = "Quick Chat Help";
    }
}
