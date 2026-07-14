/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static boolean field_e;
    private String field_b;
    private boolean field_c;
    static tf field_f;
    static String field_d;
    static String field_a;
    static String field_g;

    final boolean c(int param0) {
        int var2 = -5 / ((-31 - param0) / 58);
        return ((ec) this).field_c;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        Object var8 = null;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param3 == -124) {
            break L0;
          } else {
            var8 = null;
            int discarded$2 = ec.a(true, (String) null, -17);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param2 < param0) {
              break L2;
            } else {
              if (param0 - -param5 <= param2) {
                break L2;
              } else {
                if (param1 < param4) {
                  break L2;
                } else {
                  if (param6 + param4 <= param1) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(boolean param0, tv param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (vb.field_j <= var2) {
                pj.field_C[param1.b(80)] = pj.field_C[param1.b(80)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (vb.field_j <= var3) {
                    if (param0) {
                      vb.field_j = var2;
                      vb.field_j = vb.field_j + 1;
                      fu.field_b[vb.field_j] = param1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L3: {
                      if (param1.field_c == fu.field_b[var3].field_c) {
                        var4 = fu.field_b[var3].b(80);
                        if (at.field_Hb < pj.field_C[var4]) {
                          pj.field_C[var4] = pj.field_C[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    fu.field_b[var2] = fu.field_b[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (fu.field_b[var2].field_c == param1.field_c) {
                  pj.field_C[fu.field_b[var2].b(80)] = pj.field_C[fu.field_b[var2].b(80)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            pj.field_C[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        if (param2 != -23044) {
            return -20;
        }
        if (param0) {
            return sn.field_a.a(param1);
        }
        return sn.field_i.a(param1);
    }

    ec(String param0, boolean param1) {
        ((ec) this).field_b = param0;
        ((ec) this).field_c = param1 ? true : false;
        if (null == ((ec) this).field_b) {
            ((ec) this).field_b = "";
        }
        if (0 == ((ec) this).field_b.length()) {
            ((ec) this).field_c = false;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_g = null;
    }

    ec(String param0) {
        this(param0, false);
    }

    final String b(int param0) {
        if (param0 != 27939) {
            Object var3 = null;
            int discarded$0 = ec.a(true, (String) null, 58);
        }
        return ((ec) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Day";
        field_a = "Click";
        field_f = new tf();
        field_g = "You cannot add yourself!";
    }
}
