/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends mc {
    static String field_p;
    static String field_o;
    static hl field_r;
    int field_q;
    static String field_n;

    private o() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_p = null;
        field_r = null;
        field_o = null;
        field_n = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        om.field_Rb = mk.field_b.b(cd.field_c[14]);
        var1 = mk.field_b.b(cd.field_c[15]);
        if (om.field_Rb < var1) {
          om.field_Rb = var1;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has not yet unlocked this option for use.";
        field_n = "Click";
        field_p = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
