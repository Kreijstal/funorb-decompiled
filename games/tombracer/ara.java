/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ara extends jea {
    static jea field_ub;
    static int field_xb;
    static boolean field_wb;
    static String field_yb;
    private jea field_tb;
    static jpa field_vb;

    final boolean a(boolean param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param1 >= 7) {
            break L0;
          } else {
            field_yb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ((ara) this).c(42, true);
              if (-1 == (hf.field_b ^ -1)) {
                break L3;
              } else {
                if (0 == ((ara) this).field_y) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((ara) this).field_tb.field_y == 0) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
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
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        var6 = param5 + -param4;
        var7 = -param2 + param3;
        if (var7 != 0) {
          if (var6 == 0) {
            uea.a(param3, param1, param4, param2, false);
            return;
          } else {
            L0: {
              if ((var6 ^ -1) <= -1) {
                break L0;
              } else {
                var6 = -var6;
                break L0;
              }
            }
            L1: {
              if ((var7 ^ -1) > -1) {
                var7 = -var7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var7 >= var6) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_16_0;
              if (var8 != 0) {
                var9 = param2;
                var10 = param3;
                param2 = param4;
                param3 = param5;
                param4 = var9;
                param5 = var10;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 == 0) {
                break L4;
              } else {
                field_xb = 36;
                break L4;
              }
            }
            L5: {
              if (param3 < param2) {
                var9 = param2;
                param2 = param3;
                var10 = param4;
                param3 = var9;
                param4 = param5;
                param5 = var10;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = param4;
              var10 = param3 + -param2;
              var11 = param5 + -param4;
              var12 = -(var10 >> -108411583);
              if (param4 < param5) {
                stackOut_26_0 = 1;
                stackIn_27_0 = stackOut_26_0;
                break L6;
              } else {
                stackOut_25_0 = -1;
                stackIn_27_0 = stackOut_25_0;
                break L6;
              }
            }
            L7: {
              var13 = stackIn_27_0;
              if (-1 < (var11 ^ -1)) {
                var11 = -var11;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var8 == 0) {
                var16 = param2;
                var14 = var16;
                L9: while (true) {
                  if (param3 < var16) {
                    break L8;
                  } else {
                    var12 = var12 + var11;
                    vaa.field_a[var9][var16] = param1;
                    if (-1 > (var12 ^ -1)) {
                      var12 = var12 - var10;
                      var9 = var9 + var13;
                      var16++;
                      continue L9;
                    } else {
                      var16++;
                      continue L9;
                    }
                  }
                }
              } else {
                var14 = param2;
                L10: while (true) {
                  if (var14 > param3) {
                    break L8;
                  } else {
                    vaa.field_a[var14][var9] = param1;
                    var12 = var12 + var11;
                    if ((var12 ^ -1) < -1) {
                      var12 = var12 - var10;
                      var9 = var9 + var13;
                      var14++;
                      continue L10;
                    } else {
                      var14++;
                      continue L10;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          L11: {
            if (0 != var6) {
              dfa.a(param2, param5, param4, param1, param0 + 0);
              break L11;
            } else {
              break L11;
            }
          }
          return;
        }
    }

    ara(jea param0, jea param1, jea param2, jea param3, jea param4, jea param5) {
        int var12 = 0;
        jea var13 = null;
        jea var14 = null;
        int var15 = 0;
        jea var17 = new jea(0L, param1, iw.field_a.toUpperCase());
        var17.field_z = 1;
        ((ara) this).field_tb = new jea(0L, param2);
        jea var8 = new jea(0L, param3);
        jea var9 = new jea(0L, param3, kpa.field_b);
        var9.field_z = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; ufa.field_q.length > var12; var12++) {
            var13 = new jea(0L, param3, s.field_b[var12]);
            var14 = new jea(0L, param3, ufa.field_q[var12]);
            var15 = param3.field_H.b(ufa.field_q[var12]);
            if (var11 < var15) {
                var11 = var15;
            }
            var13.a(65, 15, -23776, var10, 20);
            var14.a(640, 15, -23776, var10, 90);
            var8.b(-127, var13);
            var10 += 30;
            var8.b(-126, var14);
        }
        var17.a(20 + var11 - -90, 24, -23776, 0, 0);
        var10 += 15;
        ((ara) this).a(var17.field_G, var17.field_t + var10, -23776, 100, 100);
        ((ara) this).field_tb.a(15, 15, -23776, 5, -20 + var17.field_G);
        var8.a(((ara) this).field_G, ((ara) this).field_t + -var17.field_t, -23776, var17.field_t, 0);
        var9.a(((ara) this).field_G, 15, -23776, 20, 0);
        var8.field_w = hca.c(var8.field_t, 2105376, 3, 11579568, -125, 8421504);
        var17.b(-125, ((ara) this).field_tb);
        var8.b(-128, var9);
        ((ara) this).b(-123, var17);
        ((ara) this).b(-128, var8);
        var10 = -(((ara) this).field_t >> 9238561) + 240;
        ((ara) this).field_qb = -(((ara) this).field_G >> 48600193) + 320;
    }

    public static void a(boolean param0) {
        field_yb = null;
        field_ub = null;
        field_vb = null;
        if (param0) {
            ara.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = "<%0> finished";
    }
}
