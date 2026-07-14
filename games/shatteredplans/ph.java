/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph implements jk {
    static String field_c;
    static int[] field_b;
    lp[] field_h;
    fe[] field_i;
    static String field_e;
    static String field_d;
    static String field_a;
    static boolean field_g;
    ff[][] field_f;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (bg.field_g) {
          return wi.field_c.a(oq.field_j, ho.field_h, true);
        } else {
          if (dp.field_t) {
            return dp.a(-85, param1, param3);
          } else {
            if (!ed.a(param0 ^ 5, param3, param1)) {
              if (ae.field_b) {
                return false;
              } else {
                if (param0 != 4) {
                  field_d = null;
                  return le.a(param1, param2, false);
                } else {
                  return le.a(param1, param2, false);
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(int param0) {
        hd var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == cb.field_h) {
          return;
        } else {
          var1 = (hd) (Object) cb.field_h.d(param0);
          L0: while (true) {
            if (var1 == null) {
              return;
            } else {
              L1: {
                if (0 <= var1.field_h) {
                  break L1;
                } else {
                  var1.b((byte) -70);
                  break L1;
                }
              }
              var1 = (hd) (Object) cb.field_h.a((byte) -71);
              continue L0;
            }
          }
        }
    }

    final static void a(bc param0, int param1) {
        tc.a((byte) 23, param0.a(true, "tutorial.txt", ""));
        int var2 = -90 / ((param1 - -9) / 32);
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -96 / ((param0 - 53) / 46);
    }

    ph(int param0) {
        ((ph) this).field_h = new lp[param0];
        ((ph) this).field_f = new ff[param0][-1 + param0];
        ((ph) this).field_i = new fe[param0 + -1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Invite players";
        field_e = "Login: ";
        field_b = new int[4];
        field_a = "Overview";
        field_d = "Fleets in motion";
    }
}
