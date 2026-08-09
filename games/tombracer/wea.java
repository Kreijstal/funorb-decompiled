/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wea implements dv {
    static int field_a;
    private int[] field_e;
    static String field_c;
    static gqa[] field_d;
    private boolean[] field_b;

    public final void a(kh param0, boolean param1) {
        this.field_b = c.a(8, this.field_b, (byte) -84, param0);
        if (param1) {
            return;
        }
        try {
            this.field_e = fa.a(0, param0, 8, this.field_e);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wea.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            wea.a(105);
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final void a(int param0, int param1, boolean param2, byte param3) {
        if (param3 > -35) {
          this.a(-48, 98, false, (byte) -57);
          this.field_b[param0] = param2;
          this.field_e[param0] = param1;
          return;
        } else {
          this.field_b[param0] = param2;
          this.field_e[param0] = param1;
          return;
        }
    }

    final static void a(int param0, int param1, sq param2, boolean param3, java.awt.Component param4, fia param5) {
        try {
            nba.a(param5, param2, param1, param0, param0, param4, -45, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wea.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final la a(int param0, int param1, int param2, dt param3) {
        RuntimeException var5 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1024) {
                break L1;
              } else {
                field_a = 4;
                break L1;
              }
            }
            stackIn_3_0 = tp.a(this.field_e[param1], this.field_b[param1], param3, param2, (byte) -125);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("wea.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
        return stackIn_3_0;
    }

    wea() {
    }

    wea(int param0) {
        this.field_b = new boolean[param0];
        this.field_e = new int[param0];
    }

    static {
        field_c = "Asking for or providing contact information";
    }
}
