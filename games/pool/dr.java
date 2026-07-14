/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dr {
    static int field_f;
    static int field_b;
    static int field_c;
    static nl field_a;
    static dd field_d;
    static String field_e;

    final static void a(byte param0, di param1) {
        dd var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new dd(param1.a(false, "", "final_frame.jpg"), (java.awt.Component) (Object) pa.field_K);
        var3 = var2.field_z;
        var4 = var2.field_A;
        uc.a((byte) -6);
        qf.field_k = new dd(var3, 3 * var4 / 4);
        qf.field_k.e();
        var2.a(0, 0);
        we.field_k = new dd(var3, -qf.field_k.field_A + var4);
        we.field_k.e();
        var2.a(0, -qf.field_k.field_A);
        we.field_k.field_B = qf.field_k.field_A;
        oc.a(125);
        if (param0 > -48) {
          field_e = null;
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, long param2, int param3, of param4, String param5, int param6, vh param7, int[] param8) {
        pf.field_c = param4;
        if (param6 != 32540) {
          field_e = null;
          vl.field_m = new kn(param7, param2, param5, param0, param3, param1, param8);
          return;
        } else {
          vl.field_m = new kn(param7, param2, param5, param0, param3, param1, param8);
          return;
        }
    }

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        pa.field_J.field_gb = pa.field_J.field_gb + fj.field_j.field_gb;
        if (param1 != 11468) {
          return;
        } else {
          pa.field_J.field_N = param2;
          pa.field_J.field_nb = param4;
          pa.field_J.field_kb = param0;
          fj.field_j.field_qb = fj.field_j.field_qb + fj.field_j.field_gb;
          fj.field_j.field_gb = param3;
          pa.field_J.field_gb = pa.field_J.field_gb - fj.field_j.field_gb;
          fj.field_j.field_qb = fj.field_j.field_qb - fj.field_j.field_gb;
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 11468) {
            return;
        }
        field_d = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 11468;
        field_f = aj.a(6429081, false, field_b);
        field_a = new nl();
        field_e = "Now let's \"break\": Shoot the cue ball at the rack (the triangle of balls) now.";
    }
}
