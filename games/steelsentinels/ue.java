/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static wk[] field_g;
    static String field_a;
    static int[][] field_c;
    static boolean field_b;
    static tg field_e;
    static String field_d;
    static gh field_f;

    final static void a(int param0, int param1, int param2) {
        ne.field_y.field_p = 0;
        ne.field_y.a((byte) 122, 12);
        ne.field_y.b(true, rb.field_g.nextInt());
        ne.field_y.b(true, rb.field_g.nextInt());
        ne.field_y.a((byte) 121, param0);
        ne.field_y.a((byte) 109, param2);
        ne.field_y.d(param1, 59);
        ne.field_y.a(qe.field_d, jd.field_ib, -10048);
        mm.field_g.a(18, (byte) -117);
        int fieldTemp$0 = mm.field_g.field_p + 1;
        mm.field_g.field_p = mm.field_g.field_p + 1;
        int var4 = fieldTemp$0;
        mm.field_g.a(ne.field_y.field_p, (byte) -122, 0, ne.field_y.field_t);
        mm.field_g.b((byte) 89, -var4 + mm.field_g.field_p);
    }

    final static int a() {
        return ej.field_B;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        nn.a(-1604006872, param1, param3, param2);
        if (param0 != 38) {
            Object var5 = null;
            String discarded$0 = ue.a((CharSequence[]) null, -124);
        }
    }

    final static void a(int param0, gh param1) {
        gh var4 = null;
        gh var5 = null;
        int var3 = SteelSentinels.field_G;
        try {
            var4 = (gh) (Object) param1.field_M.e(13058);
            gh var2 = var4;
            while (var4 != null) {
                var4.field_Lb = 0;
                var4.field_lb = 0;
                var4.field_eb = 0;
                var4.field_gb = 0;
                var5 = (gh) (Object) param1.field_M.a((byte) -34);
                var5 = var5;
            }
            param1.field_Lb = 0;
            param1.field_eb = 0;
            param1.field_lb = 0;
            param1.field_gb = 0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ue.C(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = bf.a(param0.length, 0, (byte) 50, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ue.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b() {
        field_d = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_e = null;
        int var1 = 0;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for sound effects";
        field_c = new int[][]{null, null, null};
        field_g = new wk[field_c.length];
        field_d = "<col=00ffff>You are reading a past message, and your training schedule has been paused.<br>To continue your training, press <img=20> until you return to your current objective.</col>";
        field_b = false;
    }
}
