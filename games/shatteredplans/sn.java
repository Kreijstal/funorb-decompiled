/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 6) {
            sn.a(-121, 89, 108, 123, 4, -128);
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 < (js.field_j ^ -1)) {
          return;
        } else {
          L0: {
            var3 = param2 - 135;
            var4 = -35 + param0;
            var5 = 256;
            if ((js.field_j ^ -1) > -76) {
              var5 = (js.field_j << 376531848) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (js.field_j <= 200) {
              break L1;
            } else {
              var5 = (-js.field_j + 250 << 1193959720) / 50;
              break L1;
            }
          }
          L2: {
            aq.a((byte) -40, in.field_i);
            wn.c();
            gf.b();
            gq.e(-70);
            if (var5 < 256) {
              gf.c(0, 0, gf.field_b, gf.field_k, 0, 256 - var5);
              break L2;
            } else {
              break L2;
            }
          }
          ln.f((byte) -47);
          if (param1 == 28318) {
            L3: {
              if ((js.field_j ^ -1) <= -151) {
                qa.field_q.a(15 + var3, var4 - -10, var5);
                break L3;
              } else {
                in.field_i.d(var3, var4);
                break L3;
              }
            }
            L4: {
              var6 = -125 + js.field_j;
              if (var6 <= 0) {
                break L4;
              } else {
                if (-51 >= (var6 ^ -1)) {
                  break L4;
                } else {
                  if ((var6 ^ -1) <= -21) {
                    if ((var6 ^ -1) > -31) {
                      rf.field_h.c(var3, var4, 256);
                      break L4;
                    } else {
                      var7 = 256 * (50 - var6) / 20;
                      rf.field_h.c(var3, var4, var7);
                      break L4;
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    rf.field_h.c(var3, var4, var7);
                    break L4;
                  }
                }
              }
            }
            L5: {
              var6 = js.field_j + -140;
              if (var6 <= 0) {
                break L5;
              } else {
                L6: {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = var6 * 256 / 20;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ak.field_z.a(15 + var3, 10 + var4, var7 * var5 >> 1966291144);
                break L5;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final static String a(char param0, byte param1) {
        if (param1 >= -25) {
            return null;
        }
        return String.valueOf(param0);
    }

    final static void a(int[] param0, byte param1, sd param2) {
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -76) {
            sn.a(72);
        }
        ln var4 = param2.j(18229);
        while (var4 != null) {
            for (var3 = 0; 4 > var3; var3++) {
                param0[var3] = param0[var3] + var4.field_G[var3];
            }
            var4 = param2.h(-23410);
        }
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
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param3 != 256) {
          if (param3 != 0) {
            if ((param3 ^ -1) != -129) {
              L0: {
                if ((param4 ^ -1) <= -1) {
                  break L0;
                } else {
                  param0 = param0 + param4;
                  param4 = 0;
                  break L0;
                }
              }
              L1: {
                if (0 > param5) {
                  param2 = param2 + param5;
                  param5 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param4 - -param0 <= gf.field_b) {
                  break L2;
                } else {
                  param0 = gf.field_b - param4;
                  break L2;
                }
              }
              L3: {
                var6 = 49 / ((param1 - 38) / 61);
                if (param2 + param5 > gf.field_k) {
                  param2 = gf.field_k + -param5;
                  break L3;
                } else {
                  break L3;
                }
              }
              param4--;
              var7 = param5 + param2;
              var8 = param5;
              L4: while (true) {
                if (var8 >= var7) {
                  return;
                } else {
                  var9 = param4 + var8 * gf.field_b;
                  var10 = param0;
                  L5: while (true) {
                    if (0 >= var10) {
                      var8++;
                      continue L4;
                    } else {
                      var9++;
                      var11 = gf.field_h[var9];
                      var12 = var11 & 16711935;
                      var13 = var11 & 65280;
                      var12 = var12 * param3;
                      var12 = var12 & -16711936;
                      var13 = var13 * param3;
                      var13 = var13 & 16711680;
                      var11 = (var13 | var12) >> -1667479320;
                      gf.field_h[var9] = var11;
                      var10--;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              gf.h(param4, param5, param0, param2);
              return;
            }
          } else {
            gf.d(param4, param5, param0, param2, 0);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Quick Chat game";
        field_b = "Fullscreen";
    }
}
