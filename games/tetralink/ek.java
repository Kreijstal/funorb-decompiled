/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends mc {
    int field_q;
    static String field_t;
    static hl field_o;
    static String field_r;
    static hl field_n;
    static oh field_p;
    static String field_s;

    ek(int param0) {
        this.field_q = param0;
    }

    public static void b(byte param0) {
        if (param0 > -21) {
          ek.b((byte) -76);
          field_s = null;
          field_r = null;
          field_o = null;
          field_t = null;
          field_n = null;
          field_p = null;
          return;
        } else {
          field_s = null;
          field_r = null;
          field_o = null;
          field_t = null;
          field_n = null;
          field_p = null;
          return;
        }
    }

    final static hl a(boolean param0) {
        if (!param0) {
            return (hl) null;
        }
        return v.field_x.field_Pb;
    }

    static {
        field_r = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_t = "white";
    }
}
