/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends td {
    static String field_p;
    static String field_q;

    uba(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((uba) this).field_k = param2;
        ((uba) this).field_n = param3;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_q = null;
            field_q = null;
            field_p = null;
            return;
        }
        field_q = null;
        field_p = null;
    }

    final static void a(int param0, kv[] param1) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        for (var2 = param0; var2 < param1.length; var2++) {
            kv discarded$0 = lka.a((byte) 54, param1[var2]);
        }
    }

    final ii a(op param0, int param1) {
        aga var5 = null;
        ima var6 = null;
        if (param1 != 3) {
            uba.b(45);
            var5 = ((uba) this).field_h.a(94, param0);
            var6 = new ima(((uba) this).field_g, new nq(var5));
            var6.field_t = ((uba) this).field_n;
            var6.field_q = ((uba) this).field_k;
            if (!(!param0.a(var5, ((uba) this).field_n, ((uba) this).field_k, (byte) 54))) {
                var6.field_o.a((bw) (Object) new bj(new nq(var5), ((uba) this).field_k, ((uba) this).field_n), true);
            }
            return (ii) (Object) var6;
        }
        aga var7 = ((uba) this).field_h.a(94, param0);
        ima var8 = new ima(((uba) this).field_g, new nq(var7));
        var8.field_t = ((uba) this).field_n;
        var8.field_q = ((uba) this).field_k;
        if (!(!param0.a(var7, ((uba) this).field_n, ((uba) this).field_k, (byte) 54))) {
            var8.field_o.a((bw) (Object) new bj(new nq(var7), ((uba) this).field_k, ((uba) this).field_n), true);
        }
        return (ii) (Object) var8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "This is the portal to the arena! Here you fight to win cash for more food.";
        field_q = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
