/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int field_c;
    private StringBuilder field_a;
    private boolean field_b;

    final static void a(int param0, wj param1, int param2) {
        bv var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, 5);
        var3.b(param2 + 1, param2);
        var3.b(true, param1.field_r);
        var3.b(1, param1.field_k);
        var3.b(1, param1.field_p);
    }

    final void a(int param0, int param1) {
        if (!(((gn) this).field_b)) {
            this.b(param0 ^ 125);
        }
        ((gn) this).field_c = ((gn) this).field_c + param1;
        if (param0 != 0) {
            this.b(123);
        }
    }

    final void a(byte param0, String param1) {
        this.a(param1, 0);
        this.b(124);
        if (param0 != 19) {
            ((gn) this).field_c = 9;
        }
    }

    private final void b(int param0) {
        if (param0 < 119) {
            ((gn) this).field_a = null;
        }
        StringBuilder discarded$0 = ((gn) this).field_a.append("\n");
        ((gn) this).field_b = true;
    }

    private final void a(String param0, int param1) {
        if (!(!((gn) this).field_b)) {
            this.a(0);
        }
        StringBuilder discarded$6 = ((gn) this).field_a.append(param0);
        if (param1 != 0) {
            Object var4 = null;
            gn.a(-82, (wj) null, 123);
        }
    }

    final void a(String[] param0, byte param1) {
        if (param1 >= -45) {
            Object var4 = null;
            ((gn) this).a((byte) 62, (String) null);
        }
        ((gn) this).a((byte) 19, pj.a(593277313, (CharSequence[]) (Object) param0));
    }

    final static void d(int param0) {
        ik.field_d = new hk(jm.field_b, hr.field_m, uc.field_b, eq.field_h, (je) (Object) hs.field_H, ms.field_k);
        if (param0 != 5) {
            gn.d(-31);
        }
    }

    gn() {
        ((gn) this).field_a = new StringBuilder(1024);
        ((gn) this).field_b = true;
    }

    final String c(int param0) {
        if (param0 != 1024) {
            return null;
        }
        return ((gn) this).field_a.toString();
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = param0; var2 < ((gn) this).field_c; var2++) {
            StringBuilder discarded$0 = ((gn) this).field_a.append(" ");
        }
        ((gn) this).field_b = false;
    }

    static {
    }
}
