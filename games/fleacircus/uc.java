/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uc {
    int[] field_g;
    java.awt.Image field_b;
    int field_f;
    static StringBuilder field_a;
    int field_h;
    static dd field_d;
    static ve field_c;
    static nf field_e;

    final void a(byte param0) {
        gb.a(((uc) this).field_g, ((uc) this).field_h, ((uc) this).field_f);
        if (param0 <= 56) {
            ((uc) this).a((byte) -122);
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    final static void a(byte param0, boolean param1, wk param2) {
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
          L0: {
            mi.a((byte) 12, 256, true, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("uc.B(").append(5).append(',').append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final static void b() {
        int var1_int = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        try {
            ml.field_O = ia.field_m[fleas.field_E][tj.field_a].field_f;
            for (var1_int = 0; var1_int < 40; var1_int++) {
                for (var2 = 0; var2 < 21; var2++) {
                    fl.field_c[var1_int][var2] = ia.field_m[fleas.field_E][tj.field_a].field_c[var1_int][var2];
                }
            }
            int discarded$0 = 13;
            fg.a();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "uc.F(" + 84 + ')');
        }
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    public static void c() {
        field_e = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new StringBuilder(12);
        field_d = new dd(270, 70);
    }
}
