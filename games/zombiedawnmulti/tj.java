/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static String field_d;
    static int field_c;
    static eq field_a;
    static cj field_b;
    static boolean field_f;
    static String[][] field_e;

    final static void a(int param0, int param1) {
        we var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        db.field_c = param1;
        var2 = (we) (Object) gb.field_e.c(72);
        L0: while (true) {
          if (var2 == null) {
            if (param0 == 3273) {
              if (null == wc.field_K) {
                return;
              } else {
                var2 = (we) (Object) wc.field_K.c(119);
                L1: while (true) {
                  if (var2 == null) {
                    return;
                  } else {
                    L2: {
                      if (var2.field_h.b(param0 ^ 3277)) {
                        var2.field_f.d(128 + db.field_c * var2.field_m >> 22700296);
                        break L2;
                      } else {
                        var2.a(true);
                        break L2;
                      }
                    }
                    var2 = (we) (Object) wc.field_K.b(6);
                    continue L1;
                  }
                }
              }
            } else {
              tj.a(30, 48);
              if (null != wc.field_K) {
                var2 = (we) (Object) wc.field_K.c(119);
                L3: while (true) {
                  if (var2 != null) {
                    L4: {
                      if (var2.field_h.b(param0 ^ 3277)) {
                        var2.field_f.d(128 + db.field_c * var2.field_m >> 22700296);
                        break L4;
                      } else {
                        var2.a(true);
                        break L4;
                      }
                    }
                    var2 = (we) (Object) wc.field_K.b(6);
                    continue L3;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L5: {
              if (!var2.field_h.b(param0 ^ 3277)) {
                var2.a(true);
                break L5;
              } else {
                var2.field_f.d(128 + var2.field_m * db.field_c >> -256714680);
                break L5;
              }
            }
            var2 = (we) (Object) gb.field_e.b(6);
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0) {
            tj.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Solicitation";
        field_c = -1;
        field_e = new String[][]{new String[5], new String[0]};
    }
}
