/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static int field_i;
    static String field_d;
    static wk[] field_m;
    static qh[][] field_h;
    static String field_g;
    static int field_n;
    static wk field_o;
    static String[] field_l;
    static int[] field_j;
    static ul field_b;
    static String[] field_k;
    static String field_f;
    static String field_c;
    static String field_a;
    static String field_e;

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_m = null;
        field_c = null;
        field_e = null;
        field_j = null;
        field_o = null;
        field_d = null;
        field_k = null;
        field_a = null;
        field_h = null;
        field_l = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        cj.field_h = 200;
        uc.field_a = 0;
        uf.field_a = new int[3];
        ph.field_e = new na[3000];
        int var2 = 0;
    }

    final static void a() {
        int var1 = 0;
        if (224 > ll.field_q) {
          var1 = ll.field_q % 32;
          ef.a(1, -var1 + (ll.field_q + 32));
          return;
        } else {
          ef.a(1, 256);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_l = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_d = "Pause Menu";
        field_k = new String[]{"<%1> was shocked to see <%0>'s blade", "<%1> was caught in <%0>'s mighty shockwave", "<%1> was destroyed in <%0>'s mighty shockwave", "<%1> was eviscerated by <%0>'s fusion lance"};
        field_f = "Use this alternative as your account name";
        field_c = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_b = new ul();
        field_a = "Player";
        field_e = "Control options";
    }
}
