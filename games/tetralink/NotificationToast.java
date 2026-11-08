/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NotificationToast extends IntrusiveNode {
    int field_q;
    static String field_t;
    static hl field_o;
    static String field_r;
    static hl field_n;
    static Sprite field_p;
    static String field_s;

    NotificationToast(int param0) {
        this.field_q = param0;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= -21) {
          field_s = null;
          field_r = null;
          field_o = null;
          field_t = null;
          field_n = null;
          field_p = null;
          return;
        }
        NotificationToast.releaseStatics((byte) -76);
        field_s = null;
        field_r = null;
        field_o = null;
        field_t = null;
        field_n = null;
        field_p = null;
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
