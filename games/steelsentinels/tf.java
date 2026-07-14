/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static StringBuilder field_g;
    static gh field_a;
    static boolean field_b;
    static String field_f;
    static int field_c;
    static wk field_e;
    static String[] field_d;

    final static void a(na param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= uc.field_a) {
                uf.field_a[param0.a((byte) 58)] = uf.field_a[param0.a((byte) 58)] + 1;
                if (param1 < -103) {
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (uc.field_a <= var3) {
                      uc.field_a = var2;
                      uc.field_a = uc.field_a + 1;
                      ph.field_e[uc.field_a] = param0;
                      return;
                    } else {
                      L3: {
                        if (ph.field_e[var3].field_k == param0.field_k) {
                          var4 = ph.field_e[var3].a((byte) 58);
                          if (cj.field_h >= uf.field_a[var4]) {
                            break L3;
                          } else {
                            uf.field_a[var4] = uf.field_a[var4] - 1;
                            var3++;
                            continue L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var2++;
                      ph.field_e[var2] = ph.field_e[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                if (param0.field_k == ph.field_e[var2].field_k) {
                  uf.field_a[ph.field_e[var2].a((byte) 58)] = uf.field_a[ph.field_e[var2].a((byte) 58)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            uf.field_a[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (null != qf.field_e) {
            pb.f(pb.field_i, pb.field_l, -pb.field_i + pb.field_b, pb.field_d - pb.field_l);
            qf.field_e.a(param1, (byte) 127);
        }
        if (param0 != 0) {
            field_a = null;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != 26) {
            return;
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static boolean a(int param0, char param1) {
        if (param1 >= 32) {
            if (!(param1 > 126)) {
                return true;
            }
        }
        if (param0 != 2459) {
            return false;
        }
        if (param1 >= 160) {
            if (param1 <= 255) {
                return true;
            }
        }
        if (param1 != 8364) {
            if (338 != param1) {
                if (8212 != param1) {
                    if (param1 != 339) {
                        if (param1 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new StringBuilder(80);
        field_f = "Loading music";
        field_d = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
