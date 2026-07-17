/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ib {
    static String field_p;
    static boolean field_q;
    private Object field_o;
    static int field_r;

    public static void i() {
        field_p = null;
    }

    final static void a(int param0, int param1) {
        h.field_c = 400 * param1 / 150;
        h.field_a = (param1 << 16) / 150;
        if (param0 >= -71) {
          qd.a(-106, -80);
          h.field_b = 100 * param1 / 150;
          return;
        } else {
          h.field_b = 100 * param1 / 150;
          return;
        }
    }

    qd(Object param0, int param1) {
        super(param1);
        try {
            ((qd) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "qd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean h(int param0) {
        if (param0 != -964) {
            field_q = true;
            return false;
        }
        return false;
    }

    final Object f(int param0) {
        if (param0 != -18088) {
            return null;
        }
        return ((qd) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "This is a key.<br><br>When you collect a key,<br>all the safes of the same<br>colour will open. The<br>safes usually contain crystals, so you'll probably need to open them to complete the level.";
        field_r = 64;
    }
}
