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
        bn.c(0);
        vf.a((byte) -117, 4);
        if (param0 != 1849965346) {
            bd.b(51);
        }
    }

    final static void a(kg param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            qg.field_h = param0.a((byte) 25) << 877770405;
            var2_int = param0.c(32);
            eh.field_R = (7 & var2_int) << -332183886;
            qg.field_h = qg.field_h + (var2_int >> 32047843);
            eh.field_R = eh.field_R + (param0.a((byte) 25) << 1849965346);
            var2_int = param0.c(32);
            eh.field_R = eh.field_R + (var2_int >> -1336201530);
            ll.field_d = var2_int << 497640463 & 2064384;
            ll.field_d = ll.field_d + (param0.c(32) << -96225913);
            var2_int = param0.c(32);
            ll.field_d = ll.field_d + (var2_int >> -1753590527);
            dj.field_gb = var2_int << -1199372112 & 65536;
            dj.field_gb = dj.field_gb + param0.a((byte) 25);
            if (param1 == -45) {
              break L0;
            } else {
              bd.b(112);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2);
            stackOut_3_1 = new StringBuilder().append("bd.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        if (!param0) {
            field_c = (String) null;
        }
    }

    bd(int param0, String param1, ok param2) {
        try {
            this.field_d = param0;
            this.field_a = param1;
            this.field_f = 100 + param2.c(this.field_a);
            this.field_i = 30;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        field_c = "Loading extra data";
        field_g = new int[128];
    }
}
