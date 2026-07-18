/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends pd {
    static boolean field_s;
    private gfa field_t;

    final static void a(int param0, int param1, byte param2, boolean param3, long param4, String param5) {
        ql.field_k.k(param1, -2988);
        ql.field_k.field_h = ql.field_k.field_h + 1;
        int var7_int = ql.field_k.field_h;
        ql.field_k.a(1736565456, param4);
        ql.field_k.a(param5, false);
        try {
            ql.field_k.i(param0, 0);
            ql.field_k.i(param3 ? 1 : 0, 0);
            ql.field_k.d(-var7_int + ql.field_k.field_h, (byte) 35);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ok.R(" + param0 + ',' + param1 + ',' + 87 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return 89;
        }
        return 6;
    }

    ok(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((ok) this).field_t = (gfa) (Object) lka.a(-25, param1, param0.field_E);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((ok) this).field_t.a(param1, -5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ok.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        if (param0 != 3) {
            Object var3 = null;
            ((ok) this).a(true, (kh) null);
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -114) {
                break L1;
              } else {
                var4 = null;
                ((ok) this).a(true, (kh) null);
                break L1;
              }
            }
            ((ok) this).b(true).b(-1).a((bs) (Object) ((ok) this).field_t, param1, true);
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ok.L(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
    }
}
