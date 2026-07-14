/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aoa implements bo {
    private ufa field_a;
    static apa field_b;

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        ((aoa) this).field_a.a(-2016804080, param1);
    }

    final static void a(int param0, int param1) {
        if (param0 < 38) {
            return;
        }
        if (!(null != fna.field_j)) {
            return;
        }
        int var2 = (int)(qk.field_w[param1] * 20000.0);
        if (!(var2 != 0)) {
            var2 = 1;
        }
        ((psa) (Object) ab.field_n.field_n).c(-30515, 0, var2, param1);
    }

    final static void b(boolean param0) {
        wt.a((byte) 126);
        jsa.a(false, 4);
        if (!param0) {
            aoa.b(false);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 20 % ((-9 - param0) / 59);
    }

    final ufa a(boolean param0) {
        if (param0) {
            ((aoa) this).field_a = null;
            return ((aoa) this).field_a;
        }
        return ((aoa) this).field_a;
    }

    public final void a(kh param0, byte param1) {
        ((aoa) this).field_a = new ufa();
        ((aoa) this).field_a.a(param0, (byte) 122);
        if (param1 != -19) {
            field_b = null;
        }
    }

    static {
    }
}
