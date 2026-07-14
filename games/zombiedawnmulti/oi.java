/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_f;
    boolean field_g;
    static ja[] field_h;
    static String field_b;
    static ak field_j;
    static ri field_k;
    String field_c;
    static String field_a;
    static int field_i;
    String field_d;
    static String field_e;

    final static void a(int param0) {
        int var1 = 21 % ((27 - param0) / 47);
        fb.a(17, 115);
    }

    final static void a(String param0, boolean param1, byte param2, boolean param3) {
        al.j(-1);
        nb.field_a.h(-92);
        b.field_c = new qm(fa.field_Ib, (String) null, ch.field_e, param1, param3);
        wj.field_i = new ub(nb.field_a, (cf) (Object) b.field_c);
        int var4 = 120 / ((64 - param2) / 61);
        nb.field_a.b(3016, (cf) (Object) wj.field_i);
    }

    public static void b(int param0) {
        field_j = null;
        field_a = null;
        field_e = null;
        field_h = null;
        field_b = null;
        field_k = null;
        if (param0 != 5378) {
          field_h = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0> wants to join";
        field_f = "Passwords must be between 5 and 20 letters and numbers";
        field_j = new ak();
        field_a = "You need a rating of <%1> to play with the current options.";
        field_i = (int)(8.0 * Math.sqrt(2.0)) - -1;
        field_e = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
