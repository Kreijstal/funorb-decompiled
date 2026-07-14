/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hp extends br {
    static int[] field_s;
    int field_v;
    int field_n;
    int field_r;
    static int[][] field_j;
    int field_f;
    static int[] field_g;
    int field_u;
    int field_q;
    static int[] field_l;
    static String field_i;
    static String field_o;
    static String field_m;
    static String[] field_p;
    static ri field_t;
    static String field_h;
    static int field_k;

    public static void a(int param0) {
        field_i = null;
        field_p = null;
        field_g = null;
        field_s = null;
        field_m = null;
        field_t = null;
        field_l = null;
        field_o = null;
        if (param0 != 120) {
            field_i = null;
        }
        field_j = null;
        field_h = null;
    }

    final static int a(byte param0, Random param1, int param2) {
        int var5 = 0;
        if (!(0 < param2)) {
            throw new IllegalArgumentException();
        }
        if (!(!l.a(param2, -62))) {
            return (int)((long)param2 * (4294967295L & (long)param1.nextInt()) >> -33536928);
        }
        int var4 = 32 / ((param0 - -31) / 34);
        int var3 = -2147483648 - (int)(4294967296L % (long)param2);
        while (true) {
            var5 = param1.nextInt();
            if (var5 < var3) {
                break;
            }
        }
        return gd.a(var5, (byte) -87, param2);
    }

    final static boolean a(String param0, int param1) {
        if (param1 != 1020) {
            hp.a(-13);
        }
        return md.a((byte) -11, param0) != null ? true : false;
    }

    private hp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var3 = 0;
        field_s = new int[8192];
        field_l = new int[120];
        field_g = new int[120];
        field_j = new int[8][16];
        double var0 = 0.05235987755982988;
        for (var2 = 0; var2 < 120; var2++) {
            field_l[var2] = (int)(24.0 * Math.cos(var0 * (double)var2));
            field_g[var2] = (int)(24.0 * Math.sin(var0 * (double)var2));
        }
        int var4 = 0;
        var2 = var4;
        while (field_j[0].length > var4) {
            var3 = 16 * var4;
            field_j[0][var4] = cr.b(tq.b(var3, 255), tq.b(-1174404865, var3) << -2032090264);
            field_j[1][var4] = cr.b(var3 << 439995216, var3 << -1097930392);
            field_j[2][var4] = cr.b(tq.b(255, var3 / 2), tq.b(var3, -234880769) << 328002696);
            field_j[3][var4] = var3 * 65793;
            field_j[4][var4] = cr.b(tq.b(1744830974, var3) << 472535687, var3 << -796533744);
            field_j[5][var4] = var3 << 102725008;
            field_j[6][var4] = var3 << -159380176;
            field_j[7][var4] = cr.b(cr.b(tq.b(var3, 1020) << -503876826, tq.b(var3 << -1776550898, 16718971)), var3);
            var4++;
        }
        field_i = "You can ask to join this game";
        field_p = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", ""};
        field_h = "Exploiting a bug";
        field_m = "Unrated game";
        field_o = "Ask to join <%0>'s game";
    }
}
