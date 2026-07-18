/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sk extends ph {
    static Random field_n;
    static boolean field_p;
    static String field_o;
    static String field_s;
    static String field_u;
    static int[] field_r;
    static String field_q;
    static ci field_v;
    static int field_t;

    sk(long param0, String param1) {
        super(param0, param1);
    }

    public static void c(int param0) {
        field_u = null;
        field_v = null;
        field_n = null;
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
    }

    final ug b(byte param0) {
        if (param0 <= 27) {
            field_s = null;
            return ei.field_t;
        }
        return ei.field_t;
    }

    final static String a(int param0, long param1) {
        mi.field_u.setTime(new Date(param1));
        int var3 = mi.field_u.get(7);
        int var4 = mi.field_u.get(5);
        int var5 = mi.field_u.get(2);
        int var6 = mi.field_u.get(1);
        int var7 = mi.field_u.get(11);
        int var8 = mi.field_u.get(12);
        int var9 = mi.field_u.get(13);
        return sn.field_f[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ij.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has withdrawn the request to join.";
        field_n = new Random();
        field_s = "Accept";
        field_r = new int[256];
        field_q = "There are no valid types of game that match your preferences.";
        field_u = "Waiting for instruments";
    }
}
