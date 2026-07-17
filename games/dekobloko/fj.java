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
        RuntimeException runtimeException = null;
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
            L1: {
              ai.a(103, 0, param2, 128, param0);
              if (param1 == -89) {
                break L1;
              } else {
                field_e = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
        dk.field_h.e(param0, param3, param1);
        jh.field_d.e(param0 + 35, param3, param1);
        sk.field_g.e(param0 + 605, param3, param1);
        fl.field_f.e(param0, param3 + 35, param1);
        wm.field_n.e(param0 + 605, param3 - -35, param1);
        if (param2 > -7) {
          return;
        } else {
          vg.field_x.e(param0, 445 + param3, param1);
          pg.field_f.e(param0 - -35, param3 + 445, param1);
          wc.field_r.e(param0 + 605, param3 + 445, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Withdraw request to join <%0>'s game";
        field_e = false;
        field_f = "Music: ";
        field_b = "Enter name of friend to delete from list";
        field_c = "Try again";
        field_i = "The '<%0>' setting needs to be changed.";
    }
}
