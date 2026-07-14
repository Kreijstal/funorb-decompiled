/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    static int field_e;
    static String field_c;
    static java.math.BigInteger field_d;
    static String field_f;
    static int[] field_a;
    static wk field_g;
    static String field_b;

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != -30418) {
            field_f = null;
        }
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) wc.field_i);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) wc.field_i);
        qj.field_h = -1;
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        if (param3 != 3) {
            int discarded$0 = qe.a(16, 30, -14);
        }
        tk.field_p = param0;
        on.field_n = param2;
        ug.field_I = param1;
    }

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_g = null;
        field_a = null;
        field_c = null;
        if (param0 != -31914) {
            Object var2 = null;
            gk discarded$0 = qe.a((wk) null, (byte) 27, (String) null);
        }
        field_b = null;
    }

    final static gk a(wk param0, byte param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        gk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        var3 = 0;
        L0: while (true) {
          if (param0.field_E.length <= var3) {
            L1: {
              param0.d();
              ff.field_lb.a(param2, param0.field_z / 2, param0.field_B + -10, 10790052, -1);
              sb.field_bb.b((byte) 125);
              var3 = param0.field_z;
              var4 = param0.field_B;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              if (param1 == -93) {
                break L1;
              } else {
                int discarded$1 = qe.a(-36, 56, 41);
                break L1;
              }
            }
            var8_int = 0;
            L2: while (true) {
              if (param0.field_B <= var8_int) {
                var6++;
                var5++;
                var8 = new gk(8 + (var6 + -var3), 8 + var5 - var4, 3);
                var8.field_o[0] = 0;
                var8.field_o[2] = 5789784;
                var8.field_o[1] = 10790052;
                var7 = var3 + param0.field_z * var4;
                var9 = 4 + var8.field_g * 4;
                var10 = 0;
                L3: while (true) {
                  if (-var4 + var5 <= var10) {
                    var9 = var8.field_g * (var8.field_d + -1);
                    var10 = 0;
                    L4: while (true) {
                      if (var8.field_g <= var10) {
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var10 >= var8.field_d) {
                            return var8;
                          } else {
                            var8.field_p[0 + var9] = (byte)2;
                            var8.field_p[-1 + var9 + (0 - -var8.field_g)] = (byte)2;
                            var9 = var9 + var8.field_g;
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        var8.field_p[var10] = (byte)2;
                        var8.field_p[var10 + var9] = (byte)2;
                        var10++;
                        continue L4;
                      }
                    }
                  } else {
                    var11 = 0;
                    L6: while (true) {
                      if (var11 >= -var3 + var6) {
                        var9 = var9 + var8.field_g;
                        var7 = var7 + param0.field_z;
                        var10++;
                        continue L3;
                      } else {
                        if (0 != param0.field_E[var7 + var11]) {
                          var8.field_p[var9 + var11] = (byte) 1;
                          var11++;
                          continue L6;
                        } else {
                          var11++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                var9 = 0;
                L7: while (true) {
                  if (param0.field_z <= var9) {
                    var7 = var7 + param0.field_z;
                    var8_int++;
                    continue L2;
                  } else {
                    if (param0.field_E[var9 - -var7] != 0) {
                      L8: {
                        if (var3 > var9) {
                          var3 = var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (var9 <= var6) {
                          break L9;
                        } else {
                          var6 = var9;
                          break L9;
                        }
                      }
                      L10: {
                        if (var8_int < var4) {
                          var4 = var8_int;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if (var8_int > var5) {
                        var5 = var8_int;
                        var9++;
                        continue L7;
                      } else {
                        var9++;
                        continue L7;
                      }
                    } else {
                      var9++;
                      continue L7;
                    }
                  }
                }
              }
            }
          } else {
            param0.field_E[var3] = 0;
            var3++;
            continue L0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 >= -66) {
            return 55;
        }
        if (param1 < 2) {
            if (-6 >= (param0 ^ -1)) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 3;
        field_c = "Login: ";
        field_a = new int[128];
        field_f = "w";
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Quit to website";
    }
}
