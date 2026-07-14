/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends bca {
    static String field_r;
    static gda field_q;
    static int field_s;

    vk(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        ((vk) this).a(param0, (byte) -2);
        int var3 = 46 / ((param1 - 12) / 35);
    }

    vk(lu param0) {
        super(param0);
        ((vk) this).field_k = param0.e((byte) 116);
        ((vk) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (-1 < (var2 ^ -1)) {
                break;
            }
            ((vk) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    public static void d(byte param0) {
        field_r = null;
        if (param0 < 62) {
            return;
        }
        field_q = null;
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new wf(param1, (vk) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Selected:";
        field_s = 50;
    }
}
