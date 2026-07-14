/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ch extends hl {
    private long field_m;
    static sm[] field_n;
    static String field_l;
    private String field_o;

    fd b(int param0) {
        int var2 = 33 / ((-56 - param0) / 41);
        return ug.field_w;
    }

    final void a(ec param0, byte param1) {
        param0.a(71, ((ch) this).field_m);
        param0.a(((ch) this).field_o, (byte) 122);
        if (param1 >= -5) {
            ((ch) this).field_m = -95L;
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_n = null;
    }

    final static void a(byte param0) {
        int var1 = -28 % ((param0 - 28) / 55);
    }

    final static void a(byte param0, fn param1, int param2) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        wj var7 = ac.field_B;
        wj var8 = var7;
        var8.d((byte) -93, param2);
        var8.field_o = var8.field_o + 1;
        int var4 = var8.field_o;
        if (param0 != -16) {
            field_l = null;
        }
        var8.a(param0 ^ -10, 1);
        var8.i(param1.field_r, -102);
        var8.i(param1.field_s, -115);
        var8.i(param1.field_l, param0 + -105);
        var8.a((byte) 63, param1.field_i);
        var8.a((byte) 63, param1.field_n);
        var8.a((byte) 63, param1.field_m);
        var8.a((byte) 63, param1.field_k);
        var8.a(6, param1.field_p.length);
        for (var5 = 0; var5 < param1.field_p.length; var5++) {
            var7.a((byte) 63, param1.field_p[var5]);
        }
        int discarded$0 = var8.c((byte) -106, var4);
        var8.c(var8.field_o - var4, -1);
    }

    ch(long param0, String param1) {
        ((ch) this).field_o = param1;
        ((ch) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Your raider snuck past trap and disarmed it.";
    }
}
