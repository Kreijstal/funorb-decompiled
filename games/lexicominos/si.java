/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class si extends ca {
    boolean field_p;
    static jb[] field_u;
    static int field_s;
    static String field_q;
    static hh field_t;
    volatile boolean field_v;
    boolean field_r;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (0 >= param0) {
            var4 = param1;
        } else {
            var8 = new byte[param3];
            var4 = var8;
            for (var5_int = 0; var5_int < param3; var5_int++) {
                var8[var5_int] = param1[var5_int + param0];
            }
        }
        kc var5 = new kc();
        var5.a((byte) 119);
        if (param2 > -42) {
            si.e((byte) -111);
        }
        var5.a((long)(param3 * 8), var4, -24893);
        byte[] var6 = new byte[64];
        var5.a(0, false, var6);
        return var6;
    }

    final static void e(byte param0) {
        if (param0 < 5) {
            field_t = null;
        }
        kb.field_b.field_p = 0;
        kb.field_b.field_j = 0;
    }

    abstract int c(byte param0);

    abstract byte[] d(byte param0);

    final static int a(byte param0, CharSequence param1) {
        if (param0 < 111) {
            field_t = null;
        }
        return ti.a(10, param1, 113, true);
    }

    public static void e(boolean param0) {
        if (param0) {
            field_q = null;
        }
        field_q = null;
        field_t = null;
        field_u = null;
    }

    si() {
        ((si) this).field_v = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = null;
    }
}
