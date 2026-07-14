/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private String field_e;
    static wk field_b;
    static ci field_a;
    static String field_d;
    private boolean field_c;

    final static void c(int param0) {
        ta.field_f = new wl();
        l.field_d.b(96, (qg) (Object) ta.field_f);
        if (param0 != 0) {
            int discarded$0 = hg.b(3);
        }
    }

    hg(String param0) {
        this(param0, false);
    }

    public static void b(byte param0) {
        int var1 = 103 / ((67 - param0) / 36);
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static int b(int param0) {
        if (param0 != 0) {
            return 124;
        }
        return pc.field_b;
    }

    final String a(boolean param0) {
        if (param0) {
            hg.a(60);
            return ((hg) this).field_e;
        }
        return ((hg) this).field_e;
    }

    final static void a(int param0) {
        int var2 = 0;
        sj var3 = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        var3 = (sj) (Object) ch.field_e.a((byte) -95);
        L0: while (true) {
          if (var3 == null) {
            if (param0 <= 40) {
              field_a = null;
              return;
            } else {
              return;
            }
          } else {
            var3.a((byte) 75);
            var3 = (sj) (Object) ch.field_e.a(true);
            continue L0;
          }
        }
    }

    hg(String param0, boolean param1) {
        ((hg) this).field_e = param0;
        if (((hg) this).field_e == null) {
            ((hg) this).field_e = "";
        }
        ((hg) this).field_c = param1 ? true : false;
        if (0 == ((hg) this).field_e.length()) {
            ((hg) this).field_c = false;
        }
    }

    final boolean a(byte param0) {
        if (param0 != -121) {
            return true;
        }
        return ((hg) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You have 1 unread message!";
        field_b = new wk();
    }
}
