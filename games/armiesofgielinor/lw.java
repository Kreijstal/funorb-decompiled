/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw extends pt {
    static wk field_ob;
    static String field_nb;
    static String field_lb;
    static int field_mb;
    static String field_pb;
    static String field_kb;

    final static void a(byte param0, mq param1) {
        as.field_E.a((je) (Object) param1, 80);
        if (param0 != 79) {
            field_nb = null;
        }
    }

    lw(gk param0, kb param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(kb param0, byte param1) {
        int var3 = -61 % ((-27 - param1) / 44);
        this.a(param0, (byte) 87);
    }

    public static void j(byte param0) {
        field_ob = null;
        if (param0 != 49) {
            return;
        }
        field_kb = null;
        field_pb = null;
        field_nb = null;
        field_lb = null;
    }

    final static nv n(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          lw.a((byte) -16, (mq) null);
          return new nv(0, 0, t.field_c.field_a, 0, (kh) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
        } else {
          return new nv(0, 0, t.field_c.field_a, 0, (kh) null, t.field_c.field_k, t.field_c.field_p, t.field_c.field_a, t.field_c.field_a, t.field_c.field_b, t.field_c.field_n, false, true, 32768, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = "Highscores";
        field_nb = "You have <%0> unread messages!";
        field_pb = "Show chat";
        field_kb = "Enter name of player to delete from list";
    }
}
