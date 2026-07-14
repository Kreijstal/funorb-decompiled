/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends sa {
    static String field_Z;
    static nf[] field_U;
    static nf[] field_db;
    static mn field_bb;
    static int[] field_ab;
    static String field_cb;

    final static vj a(int param0, String param1) {
        int var2 = 0;
        if (!fb.field_a.c(17237)) {
            var2 = -64 % ((38 - param0) / 61);
            return fb.field_a;
        }
        if (param1.equals((Object) (Object) fb.field_a.a(55))) {
            var2 = -64 % ((38 - param0) / 61);
            return fb.field_a;
        }
        fb.field_a = a.a(param1, -6728);
        var2 = -64 % ((38 - param0) / 61);
        return fb.field_a;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 == 26402) {
          ka discarded$4 = ((uc) this).a((byte) 112, ji.field_a, 1.5);
          ((uc) this).a(qg.field_k, false);
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -6) {
              return;
            } else {
              ri.a((rk) this, 0, (rk) (Object) new mm(((uc) this).field_A, (ee) this, ((uc) this).field_S, qg.field_k[var2]));
              var2++;
              continue L0;
            }
          }
        } else {
          uc.l(103);
          ka discarded$5 = ((uc) this).a((byte) 112, ji.field_a, 1.5);
          ((uc) this).a(qg.field_k, false);
          var2 = 0;
          L1: while (true) {
            if ((var2 ^ -1) <= -6) {
              return;
            } else {
              ri.a((rk) this, 0, (rk) (Object) new mm(((uc) this).field_A, (ee) this, ((uc) this).field_S, qg.field_k[var2]));
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (!(!((uc) this).field_N)) {
            return;
        }
        ((uc) this).a(sm.field_A, ((uc) this).field_S, param4, (byte) 64, param1, param0, param3, 128);
        if (param2 >= -5) {
            ((uc) this).g(118);
        }
    }

    uc(hn param0, ee param1, da param2) {
        super(param0, param1, param2, 0.2, 0.03, 16.0);
        kj.a(gi.field_eb, 96, (pm) (Object) param1);
    }

    public static void l(int param0) {
        field_ab = null;
        field_U = null;
        field_db = null;
        field_cb = null;
        field_Z = null;
        field_bb = null;
        if (param0 >= -124) {
            field_db = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = "NORMAL";
        field_bb = new mn();
        field_cb = "Waiting for music";
    }
}
