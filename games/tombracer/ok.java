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
        if (param2 <= 70) {
            return;
        }
        try {
            ql.field_k.i(param0, 0);
            ql.field_k.i(param3 ? 1 : 0, 0);
            ql.field_k.d(-var7_int + ql.field_k.field_h, (byte) 35);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ok.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
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
            this.field_t = (gfa) ((Object) lka.a(-25, param1, param0.field_E));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            this.field_t.a(param1, -5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ok.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        if (param0 != 3) {
            kh var3 = (kh) null;
            this.a(true, (kh) null);
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        kh var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -114) {
                break L1;
              } else {
                var4 = (kh) null;
                this.a(true, (kh) null);
                break L1;
              }
            }
            this.b(true).b(-1).a(this.field_t, param1, true);
            stackIn_3_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ok.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
    }
}
