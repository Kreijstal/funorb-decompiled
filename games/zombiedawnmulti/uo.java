/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends ae {
    static String field_j;
    private int field_l;
    private int field_k;
    private int field_m;
    static ri field_n;
    private int field_i;

    public static void c() {
        field_n = null;
        field_j = null;
    }

    final static void b(boolean param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, 11);
        var2.field_j = var2.field_j + 1;
        int var3 = var2.field_j;
        var2.a(-116, 2);
        var2.a(fg.field_k, fg.field_k.length, 0, 123);
        var2.a(123, pb.field_h);
        var2.a(125, sc.field_f);
        var2.a(tg.field_a, tg.field_a.length, 0, 119);
        var2.e(113, var2.field_j - var3);
    }

    final void a(byte param0) {
        Object var3 = null;
        if (param0 > -47) {
          var3 = null;
          ((uo) this).a(70, (qd) null);
          super.a((byte) -82);
          ic.field_c.a((br) this, false);
          return;
        } else {
          super.a((byte) -82);
          ic.field_c.a((br) this, false);
          return;
        }
    }

    final void a(int param0, qd param1) {
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
              param1.a(-1181, ((uo) this).field_l, ((uo) this).field_m, ((uo) this).field_i, ((uo) this).field_k);
              if (param0 == 0) {
                break L1;
              } else {
                ((uo) this).field_k = 117;
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
            stackOut_3_1 = new StringBuilder().append("uo.D(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            ((uo) this).field_l = 93;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        super.a(param4 + -14, param0);
        ((uo) this).field_m = param3;
        if (param4 != 14) {
          ((uo) this).field_i = -59;
          ((uo) this).field_k = param2;
          ((uo) this).field_i = param1;
          ((uo) this).field_l = param5;
          return;
        } else {
          ((uo) this).field_k = param2;
          ((uo) this).field_i = param1;
          ((uo) this).field_l = param5;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        am.field_c = param1;
        bp.field_r = param0;
    }

    uo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "All games";
    }
}
