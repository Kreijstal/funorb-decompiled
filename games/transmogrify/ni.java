/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ni extends h {
    static sh field_o;

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        sj[] var9 = null;
        int var4 = 0;
        sj var5 = null;
        String var7 = null;
        int var8 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        of.field_e.setLength(0);
        if (param0 >= -107) {
            return 87;
        }
        if (null != od.field_g.field_e[0]) {
            if (qi.field_c.a(-1, od.field_g.field_e)) {
                var1 = 0;
                var2 = 0;
                var9 = od.field_g.field_e;
                for (var4 = 0; var4 < var9.length; var4++) {
                    var5 = var9[var4];
                    if (var5 == null) {
                        break;
                    }
                    StringBuilder discarded$0 = of.field_e.append((char)(255 & var5.field_i));
                    var2 = var2 != 0 | var5.field_x ? 1 : 0;
                    var1 = var1 + (var5.field_v + (var5.field_h << -207909247));
                }
                var7 = of.field_e.toString();
                var8 = 0;
                var4 = var8;
                while (var8 < n.field_a) {
                    if (var7.equalsIgnoreCase(vi.field_g[var8].toString())) {
                        return -1;
                    }
                    var8++;
                }
                if (!(var2 == 0)) {
                    return var1 << 1366194081;
                }
                return var1;
            }
            return -1;
        }
        return 0;
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var6 = -104 / ((param3 - 51) / 47);
        if (!(!param2)) {
            jl.a(param0 + param4.field_p, param4.field_n + param1, 13612, param4.field_l, param4.field_h);
        }
        super.a(param0, param1, param2, (byte) 107, param4);
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 255) {
            field_o = null;
        }
    }

    ni(kg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_y, -1, 2147483647, false);
    }

    ni(int param0) {
        this(vd.field_h, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new sh();
    }
}
