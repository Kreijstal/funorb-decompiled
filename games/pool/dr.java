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
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
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
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("dr.A(").append(-65).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final static void a(String param0, int param1, long param2, int param3, of param4, String param5, int param6, vh param7, int[] param8) {
        try {
            pf.field_c = param4;
            vl.field_m = new kn(param7, param2, param5, param0, param3, param1, param8);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + 32540 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, int param2, int param3, String param4) {
        pa.field_J.field_gb = pa.field_J.field_gb + fj.field_j.field_gb;
        try {
            pa.field_J.field_N = param2;
            pa.field_J.field_nb = param4;
            pa.field_J.field_kb = param0;
            fj.field_j.field_qb = fj.field_j.field_qb + fj.field_j.field_gb;
            fj.field_j.field_gb = param3;
            pa.field_J.field_gb = pa.field_J.field_gb - fj.field_j.field_gb;
            fj.field_j.field_qb = fj.field_j.field_qb - fj.field_j.field_gb;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "dr.D(" + (param0 != null ? "{...}" : "null") + ',' + 11468 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
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
