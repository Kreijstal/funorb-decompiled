/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static String field_d;
    static int field_c;
    static dl[] field_h;
    static volatile boolean field_f;
    int field_e;
    int field_b;
    static dl field_a;
    int field_g;
    int field_i;

    final static boolean a(byte param0) {
        if (param0 != 2) {
            al.a(-100);
            return ph.field_E == null ? mb.field_d : true;
        }
        return ph.field_E == null ? mb.field_d : true;
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_d = null;
        field_h = null;
        field_a = null;
        if (param0 != 31753) {
            discarded$0 = al.a(false);
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            return -37;
        }
        return aq.field_s;
    }

    static {
        field_d = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_f = true;
    }
}
