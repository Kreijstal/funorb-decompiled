/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends si {
    static int field_I;
    static int field_J;
    static int field_K;
    static o field_H;
    static String field_L;

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              f.a(0, (java.awt.Component) ((Object) param1));
              ch.a((java.awt.Component) ((Object) param1), 122);
              if (null != ah.field_d) {
                ah.field_d.a((java.awt.Component) ((Object) param1), true);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 < -33) {
              break L0;
            } else {
              var3 = (java.awt.Canvas) null;
              th.a((byte) 120, (java.awt.Canvas) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("th.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        bc var7 = null;
        try {
            super.a(param0, param1 ^ param1, param2, param3, param4, param5);
            var7 = jf.field_a;
            if (var7 != null) {
                if (!this.a(param0, param4, param5, param3, -110)) {
                    return;
                }
                if (this.field_n instanceof gk) {
                    ((gk) ((Object) this.field_n)).a((th) (this), -7935, var7);
                    jf.field_a = null;
                    return;
                }
                if (!(var7.field_n instanceof gk)) {
                    return;
                }
                ((gk) ((Object) var7.field_n)).a((th) (this), -7935, var7);
                jf.field_a = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "th.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private th(int param0, int param1, int param2, int param3, j param4, dg param5, rc param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            this.field_G = param6;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "th.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(int param0) {
        field_L = null;
        if (param0 <= 105) {
            th.j(-122);
            field_H = null;
            return;
        }
        field_H = null;
    }

    static {
        field_L = "Loading music";
    }
}
