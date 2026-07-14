/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_c;
    String field_o;
    static String field_j;
    static int[] field_f;
    int field_l;
    int field_r;
    int field_n;
    static String[] field_e;
    static nm field_k;
    static int field_g;
    int field_m;
    static String field_b;
    static mm field_p;
    static String field_a;
    int field_d;
    static String field_q;
    static w field_i;
    static int field_h;

    public static void a(byte param0) {
        field_k = null;
        field_p = null;
        field_i = null;
        if (param0 < 78) {
          return;
        } else {
          field_c = null;
          field_f = null;
          field_j = null;
          field_a = null;
          field_q = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        uf var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        var1 = we.field_b;
        L0: while (true) {
          if (!sc.c((byte) -104)) {
            if (param0 > -91) {
              ec.a(-123);
              return;
            } else {
              return;
            }
          } else {
            var1.f(8, -4);
            var1.field_n = var1.field_n + 1;
            var2 = var1.field_n + 1;
            ba.a(-32141, var1);
            we.field_b.b(var1.field_n - var2, true);
            continue L0;
          }
        }
    }

    ec(int param0, String param1, mm param2) {
        ((ec) this).field_d = param0;
        ((ec) this).field_o = param1;
        ((ec) this).field_n = param2.a(((ec) this).field_o) + 46;
        ((ec) this).field_r = 30;
    }

    ec(int param0) {
        ((ec) this).field_r = 30;
        ((ec) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "(1 player wants to join)";
        field_j = "Only show private chat from my friends and opponents";
        field_f = new int[8192];
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_a = "Spectate <%0>'s game";
        field_b = "You cannot join this game - it is in progress";
        field_q = "Go Back";
    }
}
