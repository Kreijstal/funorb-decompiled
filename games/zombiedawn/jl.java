/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends bj {
    static int[] field_s;
    private Object field_t;
    static cg field_v;
    static uc field_u;

    final Object d(byte param0) {
        if (param0 < 49) {
            field_s = null;
            return ((jl) this).field_t;
        }
        return ((jl) this).field_t;
    }

    public static void e(byte param0) {
        int var1 = -65 / ((-62 - param0) / 44);
        field_u = null;
        field_v = null;
        field_s = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            byte[] discarded$0 = jl.a((byte[]) null, (byte) 35);
            return false;
        }
        return false;
    }

    jl(Object param0, int param1) {
        super(param1);
        ((jl) this).field_t = param0;
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param0.length;
        var3 = new byte[var2];
        if (param1 != 45) {
          field_u = null;
          gp.a(param0, 0, var3, 0, var2);
          return var3;
        } else {
          gp.a(param0, 0, var3, 0, var2);
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[8192];
        field_v = new cg(13, 0, 1, 0);
    }
}
