/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pm extends IOException {
    static int field_c;
    static String field_b;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        int var1 = 85 % ((9 - param0) / 37);
        field_b = null;
        field_d = null;
    }

    final static bg[] b(int param0) {
        if (param0 != -5596) {
          field_c = -6;
          return new bg[]{gk.field_s, kb.field_e, ff.field_a, ab.field_b, tl.field_l, jk.field_jb, qc.field_a, oc.field_i, sj.field_a, qm.field_h, dl.field_e, hd.field_i, dg.field_a, jg.field_l};
        } else {
          return new bg[]{gk.field_s, kb.field_e, ff.field_a, ab.field_b, tl.field_l, jk.field_jb, qc.field_a, oc.field_i, sj.field_a, qm.field_h, dl.field_e, hd.field_i, dg.field_a, jg.field_l};
        }
    }

    pm(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, int param3, ea[] param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = MinerDisturbance.field_ab;
        if (param4 == null || -1 <= (param3 ^ -1)) {
            return;
        }
        try {
            var5_int = param4[0].field_x;
            var6 = param4[2].field_x;
            var7 = param4[param1].field_x;
            param4[0].f(param2, param0);
            param4[2].f(param3 + param2 + -var6, param0);
            eh.b(en.field_b);
            eh.f(param2 - -var5_int, param0, param2 - (-param3 + var6), param0 - -param4[1].field_A);
            var8 = param2 + var5_int;
            var9 = param3 + param2 - var6;
            for (param2 = var8; var9 > param2; param2 = param2 + var7) {
                param4[1].f(param2, param0);
            }
            eh.a(en.field_b);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "pm.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = 37;
        field_d = "Members' Expansion";
        field_b = null;
    }
}
