/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static int field_b;
    static int field_f;
    static int field_c;
    static int field_e;
    static nc field_j;
    static String field_d;
    static mg field_g;
    static nc field_a;
    static int field_i;
    static String[] field_h;
    static String field_k;

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param0 > -54) {
            uc.a(49);
        }
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        var4 = th.field_J;
        L0: while (true) {
          if (vc.field_d.length <= var3) {
            L1: {
              if (param1 == 1691746689) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            return -1;
          } else {
            var5 = oa.field_l[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = fa.a(vc.field_d[var3], true, (byte) 99);
              var4 = var4 + vg.field_N;
              var7 = sb.field_d + -(var6 >> -264232799);
              if (!gh.a(var4, we.field_c + (g.field_l << -1045777439), param0, var6 + (bl.field_i << 1691746689), 16777215, param2, -bl.field_i + var7)) {
                var4 = var4 + (we.field_c + vg.field_N + (g.field_l << 984967105));
                var3++;
                continue L0;
              } else {
                return var5;
              }
            } else {
              var4 = var4 + field_i;
              var3++;
              continue L0;
            }
          }
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param1 != null) {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (12 >= var3) {
                L1: {
                  var4 = jg.a(param1, -2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if (1 <= var4.length()) {
                      L2: {
                        if (ck.a(var4.charAt(0), true)) {
                          break L2;
                        } else {
                          if (!ck.a(var4.charAt(var4.length() + -1), true)) {
                            var5 = 0;
                            var6 = param2;
                            L3: while (true) {
                              if (param1.length() <= var6) {
                                if ((var5 ^ -1) < -1) {
                                  return qf.field_f;
                                } else {
                                  return null;
                                }
                              } else {
                                L4: {
                                  var7 = param1.charAt(var6);
                                  if (ck.a((char) var7, true)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if (var5 >= 2) {
                                  if (!param0) {
                                    return td.field_n;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      return qf.field_f;
                    } else {
                      break L1;
                    }
                  }
                }
                return rk.field_b;
              } else {
                break L0;
              }
            }
          }
          return rk.field_b;
        } else {
          return rk.field_b;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        int var1 = 7 / ((param0 - -35) / 46);
        field_d = null;
        field_j = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pg.a(50, 1);
        field_j = new nc();
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new nc();
        field_k = "Player names can be up to 12 letters, numbers and underscores";
        field_h = new String[]{"Defender of Humanity", "Warrior of the Void", "Heavenly Guardian", "Astral Avenger", "Rock Crusher", "Lord of the System", "Earth's Last Hope", "Revenge of the Rock Scum"};
    }
}
