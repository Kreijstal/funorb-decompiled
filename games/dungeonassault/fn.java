/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ne {
    int field_n;
    int field_r;
    static String field_j;
    int[] field_p;
    static cn field_o;
    static String field_q;
    int field_k;
    int field_s;
    int field_m;
    int field_i;
    int field_l;

    final static cn a(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (param0 != 2) {
            return null;
        }
        cn var1 = new cn(11, 11);
        jh.a(var1);
        for (var2 = 0; -7 < (var2 ^ -1); var2++) {
            gf.c(var2, -var2 + 5, 2 * var2 + 1, 65793);
        }
        for (var2 = 6; var2 < 11; var2++) {
            gf.c(var2, 4, 3, 65793);
        }
        jh.b();
        return var1;
    }

    public static void d(int param0) {
        field_q = null;
        field_j = null;
        if (param0 != 1) {
            fn.d(-32);
        }
        field_o = null;
    }

    private fn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "The path between the nails on the floor of this room is difficult and treacherous. A misstep could cause severe injury.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_q = "You have earned a total of <%0> Treasure";
    }
}
