/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends ip {
    static String field_m;
    static String field_q;
    private rm field_n;
    static String field_o;
    static int field_r;
    private rm field_p;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        if (param0 < 44) {
            return;
        }
        je.a((byte) -96, param1, param2, bf.field_d, param4, param3);
        int var5 = param4 + gf.field_i * param2;
        int var6 = -param3 + gf.field_i;
        for (var7 = -param1; -1 < (var7 ^ -1); var7++) {
            for (var8 = -param3; var8 < 0; var8++) {
                gf.field_b[var5] = mp.a(gf.field_b[var5], -2147483648);
                var5++;
            }
            var5 = var5 + var6;
        }
        qe.b(param4, param2, param3, param1, 2105376, 192, 80);
        for (var7 = 0; var7 < 4; var7++) {
            qe.a(param4 + var7, param2 + var7, param3 - var7 * 2, param1 + -(2 * var7), 16777215, -(var7 * 16) + 64, 80 - var7 * 20);
        }
    }

    final String a(byte param0, String param1) {
        if (param0 <= 44) {
            ((vo) this).field_n = null;
        }
        String var6 = ((vo) this).field_n.field_w.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (sm.a(1, var5)) {
            return fm.field_j;
        }
        if (dj.a(6623, var5)) {
            return ad.field_c;
        }
        if (!(!j.a(var5, (byte) -124))) {
            return di.field_k;
        }
        if (!(!this.a(param1, (byte) -106))) {
            return tp.field_x;
        }
        if (var6.length() <= 0) {
            return dl.field_a;
        }
        if (!(!gk.a(var6, var5, 16777215))) {
            return qd.field_b;
        }
        if (gl.a(var6, 0, var5)) {
            return mf.field_a;
        }
        if (uo.a((byte) -69, var6, var5)) {
            return qd.field_b;
        }
        return fm.field_j;
    }

    vo(rm param0, rm param1, rm param2) {
        super(param0);
        ((vo) this).field_p = param2;
        ((vo) this).field_n = param1;
    }

    final od a(String param0, int param1) {
        int var3 = 113 % ((param1 - 5) / 44);
        String var4 = ((vo) this).field_n.field_w.toLowerCase();
        String var5 = param0.toLowerCase();
        if (!(var5.length() != 0)) {
            return pd.field_J;
        }
        if (!(wm.a(var4, var5, (byte) -83))) {
            return pd.field_J;
        }
        if (!(!this.a(param0, (byte) -117))) {
            return pd.field_J;
        }
        return c.field_d;
    }

    public static void e(int param0) {
        field_q = null;
        field_m = null;
        field_o = null;
        if (param0 != 1) {
            vo.e(-81);
        }
    }

    private final boolean a(String param0, byte param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param1 >= -95) {
            field_r = -102;
        }
        String var3 = ((vo) this).field_p.field_w.toLowerCase();
        String var4 = param0.toLowerCase();
        if (-1 > (var3.length() ^ -1)) {
            if (var4.length() < -1) {
                var5 = var3.lastIndexOf("@");
                if (-1 <= var5) {
                    if (var5 < var3.length() + -1) {
                        var6 = var3.substring(0, var5);
                        var7 = var3.substring(var5 + 1);
                        if (!(var4.indexOf(var6) < 0)) {
                            return true;
                        }
                        if (0 > var4.indexOf(var7)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_m = "<col=178B8B>Use skill - <%0></col>";
        field_o = "<col=8B1717>Disarm</col>";
    }
}
