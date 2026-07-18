/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static int field_h;
    int field_b;
    static String field_c;
    int field_f;
    static int[] field_g;
    int field_d;
    int field_j;
    static int[] field_e;
    int field_i;
    String field_a;

    final static void a(int param0) {
        int discarded$3 = 0;
        bn.c();
        vf.a((byte) -117, 4);
        if (param0 != 1849965346) {
            bd.b(51);
        }
    }

    final static void a(kg param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
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
          qg.field_h = param0.a((byte) 25) << 5;
          var2_int = param0.c(32);
          eh.field_R = (7 & var2_int) << 18;
          qg.field_h = qg.field_h + (var2_int >> 3);
          eh.field_R = eh.field_R + (param0.a((byte) 25) << 2);
          var2_int = param0.c(32);
          eh.field_R = eh.field_R + (var2_int >> 6);
          ll.field_d = var2_int << 15 & 2064384;
          ll.field_d = ll.field_d + (param0.c(32) << 7);
          var2_int = param0.c(32);
          ll.field_d = ll.field_d + (var2_int >> 1);
          dj.field_gb = var2_int << 16 & 65536;
          dj.field_gb = dj.field_gb + param0.a((byte) 25);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bd.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + -45 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_e = null;
        field_c = null;
    }

    bd(int param0, String param1, ok param2) {
        try {
            ((bd) this).field_d = param0;
            ((bd) this).field_a = param1;
            ((bd) this).field_f = 100 + param2.c(((bd) this).field_a);
            ((bd) this).field_i = 30;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "bd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        qm.field_z = null;
        if (param0 != -4487) {
            return;
        }
        gh.field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading extra data";
        field_g = new int[128];
    }
}
