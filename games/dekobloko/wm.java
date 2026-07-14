/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wm extends ba implements qh {
    private rk field_j;
    static int field_l;
    static ck field_n;
    static String field_k;
    static ck field_o;
    static String field_g;
    static String field_m;
    static String field_i;
    static w field_h;

    abstract tb b(String param0, byte param1);

    final String e(byte param0) {
        if (param0 <= 2) {
          field_n = null;
          return ((wm) this).a(((wm) this).field_j.field_E, (byte) -11);
        } else {
          return ((wm) this).a(((wm) this).field_j.field_E, (byte) -11);
        }
    }

    final static void d(int param0) {
        oa.field_f = de.field_V.c((byte) -38);
        CharSequence var2 = (CharSequence) (Object) oa.field_f;
        h.field_c = kf.a(var2, (byte) 2);
        if (param0 != 140) {
            java.awt.Container discarded$0 = wm.f((byte) 98);
        }
    }

    final tb b(int param0) {
        if (param0 != -5520) {
          ((wm) this).field_j = null;
          return ((wm) this).b(((wm) this).field_j.field_E, (byte) -40);
        } else {
          return ((wm) this).b(((wm) this).field_j.field_E, (byte) -40);
        }
    }

    abstract String a(String param0, byte param1);

    public final void a(int param0, rk param1) {
        if (param0 != 16737894) {
            return;
        }
        ((wm) this).c((byte) -51);
    }

    final static java.awt.Container f(byte param0) {
        if (!(hg.field_c == null)) {
            return (java.awt.Container) (Object) hg.field_c;
        }
        if (param0 <= 123) {
            wm.d(74);
            return (java.awt.Container) (Object) se.h(25144);
        }
        return (java.awt.Container) (Object) se.h(25144);
    }

    public final void b(int param0, rk param1) {
        if (param0 != -2569) {
            field_n = null;
        }
    }

    public final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = 112 / ((param0 - 72) / 40);
        if (null != ((wm) this).field_j.field_E) {
          if (0 == ((wm) this).field_j.field_E.length()) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    wm(rk param0) {
        ((wm) this).field_j = param0;
    }

    public static void c(int param0) {
        field_k = null;
        field_h = null;
        field_i = null;
        if (param0 != 18966) {
          java.awt.Container discarded$2 = wm.f((byte) 42);
          field_n = null;
          field_o = null;
          field_m = null;
          field_g = null;
          return;
        } else {
          field_n = null;
          field_o = null;
          field_m = null;
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Please wait...";
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_o = new ck(540, 140);
        field_m = "Chain Bonus: ";
        field_i = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
