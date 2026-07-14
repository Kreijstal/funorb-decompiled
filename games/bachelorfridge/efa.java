/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class efa extends td {
    static boolean field_p;

    final static sna c(boolean param0) {
        if (!param0) {
            sna discarded$0 = efa.c(false);
        }
        return ok.f((byte) -15);
    }

    final static void a(int param0, int param1, int param2, boolean param3, ht param4, int param5, java.awt.Component param6, jp param7) {
        pb.a(param0, param3, 10);
        lc.field_l = pb.a(param4, param6, 0, param1);
        nia.field_m = pb.a(param4, param6, 1, param2);
        saa.field_a = new hn();
        ud.field_p = 1000 * param2 / param0;
        nia.field_m.a((tda) (Object) saa.field_a);
        uf.field_c = param7;
        uf.field_c.a(23679, bs.field_k);
        lc.field_l.a((tda) (Object) uf.field_c);
        if (param5 != 19299) {
            field_p = true;
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        int var2 = param0.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = -var3 + (var3 << -206700987) + aca.a(param0.charAt(var4), 8220);
        }
        if (!param1) {
            field_p = true;
        }
        return var3;
    }

    efa(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((efa) this).field_k = param2;
        ((efa) this).field_n = param3;
    }

    final ii a(op param0, int param1) {
        aga var3 = ((efa) this).field_h.a(107, param0);
        u var4 = new u(((efa) this).field_g, new nq(var3));
        var4.field_q = ((efa) this).field_n;
        var4.field_r = ((efa) this).field_k;
        if (param1 != 3) {
            return null;
        }
        return (ii) (Object) var4;
    }

    static {
    }
}
