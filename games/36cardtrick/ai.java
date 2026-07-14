/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends cg {
    static bk field_k;
    static String field_l;
    static int[] field_j;
    static int field_m;

    public static void g(int param0) {
        field_l = null;
        int var1 = -115 % ((-60 - param0) / 37);
        field_k = null;
        field_j = null;
    }

    final String a(String param0, boolean param1) {
        if (!(((ai) this).a(param0, -64) != pe.field_b)) {
            return d.field_j;
        }
        if (!param1) {
            return null;
        }
        field_m = -2;
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Main.field_T;
        if (param1 <= param3) {
          return;
        } else {
          if (param3 + 1 < param2) {
            L0: {
              if (5 + param3 >= param2) {
                break L0;
              } else {
                if (param5 != param0) {
                  var7 = (param5 >> 1433856705) + ((param0 >> -929939551) - -(param0 & param5 & 1));
                  var8 = param3;
                  var9 = param0;
                  var10 = param5;
                  var11 = param3;
                  L1: while (true) {
                    if (var11 >= param2) {
                      ai.a(param0, param1, var8, param3, param4, var9, 8192);
                      ai.a(var10, param1, param2, var8, param4, param5, param6);
                      return;
                    } else {
                      L2: {
                        var12 = re.field_c[var11];
                        if (param4) {
                          stackOut_22_0 = p.field_n[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = db.field_l[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var7 < var13) {
                        re.field_c[var11] = re.field_c[var8];
                        var8++;
                        re.field_c[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        if (var13 > var10) {
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
                } else {
                  break L0;
                }
              }
            }
            var7 = -1 + param2;
            L3: while (true) {
              if (var7 <= param3) {
                return;
              } else {
                var8 = param3;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = re.field_c[var8];
                    var10 = re.field_c[1 + var8];
                    if (oa.a(-29680, var9, param4, var10)) {
                      re.field_c[var8] = var10;
                      re.field_c[1 + var8] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
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

    ai(hf param0) {
        super(param0);
    }

    final sg a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) param0;
        if (!pg.a(false, var4)) {
          return pe.field_b;
        } else {
          var5 = (CharSequence) param0;
          var3 = ie.a(false, var5);
          if (param1 <= -58) {
            L0: {
              if (var3 <= 0) {
                break L0;
              } else {
                if ((var3 ^ -1) >= -131) {
                  return ii.field_e;
                } else {
                  break L0;
                }
              }
            }
            return pe.field_b;
          } else {
            return (sg) null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "to keep fullscreen or";
        field_k = new bk();
        field_j = new int[8192];
    }
}
