/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static boolean field_e;
    static String field_i;
    static String field_c;
    static w field_d;
    static w field_g;
    static ck[] field_a;
    static String field_f;
    static ud field_k;
    static String field_b;
    static String field_j;
    static boolean field_h;

    final static void a(int param0, byte param1, ud param2) {
        RuntimeException var3 = null;
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
          ai.a(103, 0, param2, 128, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("fj.A(").append(param0).append(',').append(-89).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 != 25988) {
          fj.a(-61);
          field_f = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_k = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_i = null;
          field_c = null;
          field_k = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        dk.field_h.e(0, param3, param1);
        jh.field_d.e(35, param3, param1);
        sk.field_g.e(605, param3, param1);
        fl.field_f.e(0, param3 + 35, param1);
        wm.field_n.e(605, param3 - -35, param1);
        vg.field_x.e(0, 445 + param3, param1);
        pg.field_f.e(35, param3 + 445, param1);
        wc.field_r.e(605, param3 + 445, param1);
    }

    static {
        field_j = "Withdraw request to join <%0>'s game";
        field_e = false;
        field_f = "Music: ";
        field_b = "Enter name of friend to delete from list";
        field_c = "Try again";
        field_i = "The '<%0>' setting needs to be changed.";
    }
}
