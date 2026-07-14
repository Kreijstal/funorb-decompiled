/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vka extends td {
    static String[] field_p;
    static String field_r;
    static int field_q;

    final static void c(byte param0) {
        bg.a(param0 ^ 51);
        if (param0 != 73) {
            vka.c((byte) -18);
        }
    }

    vka(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((vka) this).field_n = param3;
        ((vka) this).field_k = param2;
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        if (param0 >= -91) {
            vka.d((byte) -36);
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        lp var4 = null;
        if (param1 != 3) {
          return null;
        } else {
          var3 = ((vka) this).field_h.a(22, param0);
          var4 = new lp(((vka) this).field_g, new nq(var3));
          var4.field_r = var3.field_x;
          var4.field_s = var3.field_J;
          return (ii) (Object) var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Not enough money!";
    }
}
