/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    int field_c;
    static la field_a;
    static la field_j;
    static la field_e;
    static la field_h;
    static la field_b;
    static la field_f;
    static la field_d;
    static la field_i;
    static vd[] field_g;
    static int field_k;

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = -114 % ((-75 - param2) / 38);
        return 0 != (param1 & 2048) ? true : false;
    }

    public static void a(byte param0) {
        String discarded$2 = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_e = null;
        field_b = null;
        if (param0 != -86) {
          discarded$2 = la.a(119);
          field_a = null;
          field_j = null;
          field_h = null;
          return;
        } else {
          field_a = null;
          field_j = null;
          field_h = null;
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            rr.a("", (byte) -112, param1);
            if (!param0) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                la.a(true, (java.applet.Applet) null);
            }
            jn.a((byte) 120, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "la.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private la(int param0) {
        this.field_c = param0;
    }

    final static String a(int param0) {
        if (!(jq.field_fb != ht.field_k)) {
            return fs.field_g;
        }
        if (nb.field_c == jq.field_fb) {
            return ua.field_j;
        }
        if (param0 != 4) {
            field_h = (la) null;
            if (!(gm.field_x.a(false))) {
                return ua.field_j;
            }
            return se.field_a;
        }
        if (!(gm.field_x.a(false))) {
            return ua.field_j;
        }
        return se.field_a;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = new la(1);
        field_j = new la(2);
        field_e = new la(4);
        field_h = new la(1);
        field_b = new la(2);
        field_f = new la(4);
        field_d = new la(2);
        field_i = new la(4);
    }
}
