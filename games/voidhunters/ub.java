/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ub extends ksa implements tv {
    static String field_g;
    static int[] field_f;
    static String[] field_d;
    static clb field_e;
    static String field_h;

    ub() {
    }

    public void a(faa param0, boolean param1) {
        try {
            if (param1) {
                field_g = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ub.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        try {
            if (param0 <= 54) {
                faa var4 = (faa) null;
                this.a((faa) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                tv var4 = (tv) null;
                this.a((byte) -11, (tv) null);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ub.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(tv param0, int param1) {
        try {
            if (param1 > -19) {
                field_e = (clb) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ub.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_d = null;
        field_h = null;
        if (param0 <= 37) {
            return;
        }
        field_e = null;
        field_f = null;
        field_g = null;
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 103 / ((22 - param0) / 59);
            stackIn_1_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ub.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0 != 0;
    }

    static {
        field_g = "<%0> has entered a game.";
        field_f = new int[]{1, 0};
        field_h = "Waiting for <%0> to start the game...";
        field_d = new String[]{"Game type"};
        field_e = new clb();
    }
}
