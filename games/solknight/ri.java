/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri implements j {
    static int field_f;
    private int field_b;
    static String field_d;
    static String field_a;
    private int field_c;
    private mg field_e;

    final static boolean a(int param0, int param1) {
        if (param0 != -6873) {
            field_f = -71;
        }
        return (-param1 & param1) == param1 ? true : false;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            field_f = 91;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var11 = SolKnight.field_L ? 1 : 0;
            if (param4.field_v) {
              break L1;
            } else {
              if (!param4.b(true)) {
                stackOut_4_0 = 2188450;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 3249872;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        var6 = stackIn_5_0;
        int discarded$1 = ((ri) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6, -1, ((ri) this).field_b, ((ri) this).field_c, ((ri) this).field_e.field_s + ((ri) this).field_e.field_F);
        if (param0 >= 113) {
          L2: {
            if (!param4.b(true)) {
              break L2;
            } else {
              L3: {
                var7 = ((ri) this).field_e.b(param4.field_i);
                var8 = ((ri) this).field_e.field_s + ((ri) this).field_e.field_F;
                var9 = param3 - -param4.field_m;
                if (((ri) this).field_b != 2) {
                  if (-2 == (((ri) this).field_b ^ -1)) {
                    var9 = var9 + (-var7 + param4.field_t >> 1051701537);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var9 = var9 + (param4.field_t - var7);
                  break L3;
                }
              }
              L4: {
                var10 = param4.field_j + param1;
                if (-3 != ((ri) this).field_c) {
                  if (-2 != ((ri) this).field_c) {
                    break L4;
                  } else {
                    var10 = var10 + (param4.field_x + -var8 >> -854277343);
                    break L4;
                  }
                } else {
                  var10 = var10 + (-var8 + param4.field_x);
                  break L4;
                }
              }
              ci.a(var7 - -4, 2 + var10, var8, var9 - 2, (byte) 125);
              break L2;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = SolKnight.field_L ? 1 : 0;
        if (param1 <= param6) {
          return;
        } else {
          if (param6 - -1 < param3) {
            L0: {
              if (param6 - -5 >= param3) {
                break L0;
              } else {
                if (param0 == param5) {
                  break L0;
                } else {
                  var7 = (1 & (param5 & param0)) + ((param0 >> -643157535) + (param5 >> -1524157823));
                  var8 = param6;
                  var9 = param0;
                  var10 = param5;
                  var11 = param6;
                  L1: while (true) {
                    if (var11 >= param3) {
                      ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
                      ri.a(var10, param1, param2, param3, param4, param5, var8);
                      return;
                    } else {
                      L2: {
                        var12 = pd.field_e[var11];
                        if (!param2) {
                          stackOut_21_0 = l.field_a[var12];
                          stackIn_22_0 = stackOut_21_0;
                          break L2;
                        } else {
                          stackOut_20_0 = qg.field_c[var12];
                          stackIn_22_0 = stackOut_20_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_22_0;
                      if (var13 > var7) {
                        L3: {
                          pd.field_e[var11] = pd.field_e[var8];
                          if (var13 < var9) {
                            var9 = var13;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        int incrementValue$1 = var8;
                        var8++;
                        pd.field_e[incrementValue$1] = var12;
                        var11++;
                        continue L1;
                      } else {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param3;
            L4: while (true) {
              if (param6 >= var7) {
                return;
              } else {
                var8 = param6;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = pd.field_e[var8];
                    var10 = pd.field_e[1 + var8];
                    if (ec.a(var9, -66, param2, var10)) {
                      pd.field_e[var8] = var10;
                      pd.field_e[1 + var8] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public ri() {
        ((ri) this).field_e = ua.field_G;
        ((ri) this).field_b = 1;
        ((ri) this).field_c = 1;
    }

    ri(mg param0, int param1, int param2) {
        ((ri) this).field_e = param0;
        ((ri) this).field_b = param1;
        ((ri) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for fonts";
    }
}
