/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static q[] field_a;
    static boolean field_c;
    static dn field_e;
    static int field_g;
    static String field_f;
    static String field_h;
    static String field_d;
    static int field_b;

    final static cn a(int param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var8 = 0;
        int var10 = DungeonAssault.field_K;
        int var5 = -1 + 2 * param3;
        int var6 = param3 - -param2;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        for (var8 = 0; var8 < param3; var8++) {
            gf.b(-1 + (param3 + -var8), var8, 1 + 2 * var8, param4);
        }
        var8 = -param0 + var5 >> 1081006369;
        if (param1 != 1) {
            return (cn) null;
        }
        for (var9 = 0; param2 > var9; var9++) {
            gf.b(var8, param3 + var9, param0, param4);
        }
        jh.b();
        return var7;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 95) {
            field_e = (dn) null;
        }
        field_f = null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    static {
        field_h = "Waiting for sound effects";
        field_f = "Monsters";
        field_c = true;
        field_d = "Menu";
    }
}
