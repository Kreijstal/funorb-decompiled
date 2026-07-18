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
        ((wea) this).field_b = c.a(8, ((wea) this).field_b, (byte) -84, param0);
        if (param1) {
            return;
        }
        try {
            ((wea) this).field_e = fa.a(0, param0, 8, ((wea) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wea.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          ((wea) this).a(-48, 98, false, (byte) -57);
          ((wea) this).field_b[param0] = param2;
          ((wea) this).field_e[param0] = param1;
          return;
        } else {
          ((wea) this).field_b[param0] = param2;
          ((wea) this).field_e[param0] = param1;
          return;
        }
    }

    final static void a(int param0, int param1, sq param2, boolean param3, java.awt.Component param4, fia param5) {
        try {
            nba.a(param5, param2, 1024, 22050, 22050, param4, -45, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wea.D(" + 22050 + ',' + 1024 + ',' + (param2 != null ? "{...}" : "null") + ',' + true + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final la a(int param0, int param1, int param2, dt param3) {
        RuntimeException var5 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_2_0 = null;
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
              if (param0 == 1024) {
                break L1;
              } else {
                field_a = 4;
                break L1;
              }
            }
            stackOut_2_0 = tp.a(((wea) this).field_e[param1], ((wea) this).field_b[param1], param3, param2, (byte) -125);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("wea.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
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
        return stackIn_3_0;
    }

    wea() {
    }

    wea(int param0) {
        ((wea) this).field_b = new boolean[param0];
        ((wea) this).field_e = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Asking for or providing contact information";
    }
}
