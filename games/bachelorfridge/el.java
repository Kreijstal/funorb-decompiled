/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends aba {
    static int field_h;
    static String field_g;

    el(lka param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        var10 = -(param0 >> 975867714);
        param0 = -(3 & param0);
        var11 = 90 % ((37 - param4) / 50);
        var12 = -param9;
        L0: while (true) {
          if ((var12 ^ -1) <= -1) {
            return;
          } else {
            var13 = var10;
            L1: while (true) {
              if (0 <= var13) {
                var13 = param0;
                L2: while (true) {
                  if (-1 >= (var13 ^ -1)) {
                    param1 = param1 + param8;
                    param3 = param3 + param2;
                    var12++;
                    continue L0;
                  } else {
                    param1++;
                    if ((-16777216 & param7[param1]) != -16777216) {
                      param3++;
                      var13++;
                      continue L2;
                    } else {
                      param3++;
                      param6[param3] = param5;
                      var13++;
                      continue L2;
                    }
                  }
                }
              } else {
                L3: {
                  param1++;
                  if ((-16777216 & param7[param1] ^ -1) == 16777215) {
                    param3++;
                    param6[param3] = param5;
                    break L3;
                  } else {
                    param3++;
                    break L3;
                  }
                }
                L4: {
                  param1++;
                  if ((-16777216 & param7[param1]) != -16777216) {
                    param3++;
                    break L4;
                  } else {
                    param3++;
                    param6[param3] = param5;
                    break L4;
                  }
                }
                L5: {
                  param1++;
                  if ((-16777216 & param7[param1] ^ -1) == 16777215) {
                    param3++;
                    param6[param3] = param5;
                    break L5;
                  } else {
                    param3++;
                    break L5;
                  }
                }
                param1++;
                if ((param7[param1] & -16777216) != -16777216) {
                  param3++;
                  var13++;
                  continue L1;
                } else {
                  param3++;
                  param6[param3] = param5;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final String a(byte param0, String param1) {
        if (((el) this).a(param1, false) == jt.field_f) {
            return bu.field_g;
        }
        int var3 = 87 % ((param0 - -8) / 45);
        return bv.field_j;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param2 > param4) {
            if (param7 <= param2) {
              if (param7 <= param4) {
                lca.a(param2, param6, (byte) -79, dg.field_e, param7, param4, param3, param5, param1);
                break L0;
              } else {
                lca.a(param2, param5, (byte) -99, dg.field_e, param4, param7, param3, param6, param1);
                break L0;
              }
            } else {
              lca.a(param7, param5, (byte) -73, dg.field_e, param4, param2, param3, param1, param6);
              break L0;
            }
          } else {
            if (param7 > param4) {
              lca.a(param7, param1, (byte) -115, dg.field_e, param2, param4, param3, param5, param6);
              break L0;
            } else {
              if (param7 > param2) {
                lca.a(param4, param1, (byte) -93, dg.field_e, param2, param7, param3, param6, param5);
                break L0;
              } else {
                lca.a(param4, param6, (byte) -105, dg.field_e, param7, param2, param3, param1, param5);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param0 == 29322) {
            break L1;
          } else {
            field_h = -114;
            break L1;
          }
        }
    }

    public static void f(byte param0) {
        field_g = null;
        if (param0 != -24) {
            el.e((byte) -102);
        }
    }

    final static void e(byte param0) {
        if (param0 < 20) {
            field_g = null;
        }
        int var1 = te.d((byte) 89);
        int var2 = nka.a((byte) -74);
        raa.field_I.a((ge.field_I << -9956095) + var2, 9, -wo.field_j + rs.field_a, vka.field_q - ge.field_I, (wo.field_j << -990382015) + var1);
        w.a(true);
    }

    final jg a(String param0, boolean param1) {
        int var3 = null == qq.a(107, param0) ? 1 : 0;
        if (param1) {
            return null;
        }
        if (var3 == 0) {
            return jt.field_f;
        }
        return cm.field_u;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Select your team by clicking on the creatures, note the team limit at the bottom left. For this match, you are allowed two creatures. Examine creatures with right click. Click START when you are ready.";
    }
}
