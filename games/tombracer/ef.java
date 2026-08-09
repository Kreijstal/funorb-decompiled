/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends pd {
    private roa field_t;
    static float field_s;

    final void g(byte param0) {
        this.field_t = this.field_t.e(-1);
        if (param0 != 3) {
            roa var3 = (roa) null;
            this.a((roa) null, 81);
        }
    }

    final boolean a(int param0, hca param1) {
        RuntimeException var3 = null;
        hca var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param1.g(62, 106);
            param1.a(this.field_t, true);
            if (param0 < -114) {
              stackIn_3_0 = 1;
              break L0;
            } else {
              var4 = (hca) null;
              this.a(66, (hca) null);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ef.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    ef(la param0, boolean param1) {
        super(param0, param1);
        try {
            this.field_t = ci.a(4, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            if (param0) {
                field_s = 2.416393518447876f;
            }
            super.a(param0, param1);
            this.field_t.a(param1, (byte) 7);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ef.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_s = 0.07193703204393387f;
            return 5;
        }
        return 5;
    }

    final void a(roa param0, int param1) {
        if (param1 != 5) {
            return;
        }
        try {
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ef.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ef(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_t = jl.a(param0, true, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
