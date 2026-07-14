/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static qj field_c;
    static String field_i;
    static fh field_j;
    static rj field_h;
    static int[] field_f;
    static int field_e;
    static String field_a;
    static int field_d;
    static String field_g;
    static int[] field_k;
    static int field_b;

    final static gk a(int param0, cm param1, boolean param2, int param3) {
        if (param2) {
          if (!wa.a((byte) 30, param3, param0, param1)) {
            return null;
          } else {
            return ul.d((byte) 51);
          }
        } else {
          field_k = null;
          if (!wa.a((byte) 30, param3, param0, param1)) {
            return null;
          } else {
            return ul.d((byte) 51);
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        field_h = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_k = null;
        field_c = null;
        field_g = null;
        if (param0) {
            field_d = -118;
        }
    }

    final static void a(int param0) {
        ql.j(-29713);
        rg.field_e = true;
        if (param0 != 29) {
          return;
        } else {
          de.field_d = true;
          ag.field_p.h(param0 + 95);
          bf.a((byte) -83, false, pf.field_f);
          return;
        }
    }

    final static String a(CharSequence param0, int param1) {
        if (param1 != -1) {
            va.a(false);
            return ln.a(param0, false, -16121);
        }
        return ln.a(param0, false, -16121);
    }

    final static void a(int param0, int param1, mi param2, int param3, int param4, int param5, wk[] param6, wk[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, wk[] param16, int param17, mi param18, int param19) {
        ia.a(new ak(param7), new ak(param16), new ak(param6), param2, param17, param13, param8, param4, param9, param5, param19, param11, param10, param3, param12, param1, param0, param14, param18, param15);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "The <%0> module has already been engineered.";
        field_f = new int[]{107, 29, -1, -1, -1, -1, -1, -1, -1, -1};
        field_g = "Enter name of player to delete from list";
        field_a = "Withdraw invitation to <%0> to join this game";
        field_k = new int[4];
        field_d = -1;
        field_b = 360;
    }
}
