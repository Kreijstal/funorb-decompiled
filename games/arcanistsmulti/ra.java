/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra {
    static String field_b;
    static String field_g;
    static eh field_k;
    static String field_l;
    static String field_i;
    static ll[] field_j;
    static int field_m;
    static int field_h;
    static String field_n;
    static qb field_a;
    static String field_e;
    static String field_d;
    static ll[] field_c;
    static byte[] field_f;

    final static int a(int param0) {
        int var1 = -69 / ((53 - param0) / 62);
        return new Date().getYear() - -1900;
    }

    public static void b(int param0) {
        field_k = null;
        field_a = null;
        field_f = null;
        field_n = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_g = null;
        field_c = null;
        field_i = null;
        field_e = null;
        field_l = null;
    }

    final static void a(kc param0, int param1, kc param2) {
        try {
            if (!(null != param0.field_G)) {
                param0.field_G = new vn();
            }
            if (param2.field_G == null) {
                param2.field_G = new vn();
            }
            if (ie.field_Qb == null) {
                ie.field_Qb = new mo(64);
            }
            if (!(null != uc.field_c)) {
                uc.field_c = new mo(64);
            }
            vd.field_d = param0.field_G;
            if (param1 != 64) {
                field_e = null;
            }
            oo.field_B = param2.field_G;
            qn.i(65);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ra.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<shad><col=<%0>>STONE</col></shad>";
        field_g = "Only two targets left! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_i = "Spellbook not purchased";
        field_l = "Press F10 to open Quick Chat.";
        field_k = new eh();
        field_e = "<shad><col=<%0>>NATURE</col></shad>";
        field_n = "Offer rematch";
        field_d = "Loading fonts";
    }
}
