/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mna extends bca {
    static String field_r;
    int field_q;

    final void a(byte param0, lu param1) {
        this.a((byte) -20, param1);
        if (param0 > -12) {
            return;
        }
        param1.d(((mna) this).field_q, 0);
    }

    public static void d(byte param0) {
        field_r = null;
        int var1 = 9 % ((55 - param0) / 43);
    }

    mna(lu param0) {
        super(param0);
        ((mna) this).field_k = param0.e((byte) 110);
        ((mna) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if ((var2 ^ -1) > -1) {
                break;
            }
            ((mna) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
        ((mna) this).field_q = param0.b(16711935);
    }

    final void a(op param0, int param1) {
        ((mna) this).a(param0, (byte) -2);
        int var3 = -5 % ((param1 - 12) / 35);
    }

    mna(int param0, nq param1) {
        super(param0, param1);
    }

    final static void a(int param0, int[] param1, long param2, String param3, String param4, int param5, int param6, sga param7, sna param8) {
        if (param6 > -63) {
            return;
        }
        bga.field_m = param7;
        ms.field_u = new ik(param8, param2, param4, param3, param0, param5, param1);
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            ((mna) this).field_q = -12;
            return (at) (Object) new hha(param1, (mna) this);
        }
        return (at) (Object) new hha(param1, (mna) this);
    }

    final int[][] a(int param0, byte param1, aga param2, op param3) {
        if (param1 != 106) {
            Object var6 = null;
            ((mna) this).a((byte) 34, (lu) null);
            return null;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Remove name";
    }
}
