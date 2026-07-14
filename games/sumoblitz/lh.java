/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends ms {
    static il field_n;
    byte[] field_m;
    static ri field_k;
    boolean field_o;
    static ji field_l;
    static String field_p;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
        field_p = null;
        int var1 = -90 / ((param0 - 71) / 51);
    }

    final static dk a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        dk var7 = null;
        int var8 = Sumoblitz.field_L ? 1 : 0;
        int var2 = param0.length();
        if (param1 == (var2 ^ -1)) {
            return qo.field_a;
        }
        if (!(255 >= var2)) {
            return cn.field_ib;
        }
        String[] var3 = cn.a('.', param0, -27224);
        if (!(var3.length >= 2)) {
            return qo.field_a;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = fh.a(var6, -1);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return cp.a(param1 ^ -26, var3[var3.length + -1]);
    }

    lh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new il();
        field_l = new ji();
        field_p = "reset stats";
    }
}
