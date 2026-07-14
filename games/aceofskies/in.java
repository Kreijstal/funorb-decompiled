/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_b;
    long field_d;
    static pa[] field_c;
    private wl field_a;

    public static void a(boolean param0) {
        if (!param0) {
            field_b = (int[]) null;
        }
        field_b = null;
        field_c = null;
    }

    protected final void finalize() throws Throwable {
        ((in) this).field_a.a(((in) this).field_d, 3);
        this.finalize();
    }

    final static fr a(byte param0, boolean param1) {
        fr var2 = new fr(true);
        var2.field_d = param1 ? true : false;
        if (param0 != 111) {
            field_b = (int[]) null;
        }
        return var2;
    }

    in(wl param0, long param1, aq[] param2) {
        ((in) this).field_a = param0;
        ((in) this).field_d = param1;
    }

    final static w a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        w var7 = null;
        int var8 = AceOfSkies.field_G ? 1 : 0;
        int var2 = param1.length();
        if (!(var2 != 0)) {
            return nh.field_f;
        }
        if (!(255 >= var2)) {
            return ei.field_d;
        }
        String[] var3 = ee.a((byte) 10, '.', param1);
        if (!(-3 >= (var3.length ^ -1))) {
            return nh.field_f;
        }
        if (param0 < 124) {
            field_c = (pa[]) null;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ic.a(var6, false);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return we.a(var3[-1 + var3.length], -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1000];
    }
}
