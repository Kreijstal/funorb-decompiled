/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj {
    static String[] field_e;
    int field_d;
    static ci field_c;
    static q field_b;
    int[] field_a;
    java.awt.Image field_f;
    int field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    final static void a(boolean param0, int param1) {
        if (param1 != 793) {
            return;
        }
        ec.a(true, param0, 106);
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(int param0) {
        sb.a(((cj) this).field_a, ((cj) this).field_d, ((cj) this).field_g);
        if (param0 <= 102) {
            Object var3 = null;
            ((cj) this).a(-68, -104, (java.awt.Graphics) null, 18);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 13861) {
                break L1;
              } else {
                var3 = null;
                cj.a((java.awt.Canvas) null, -52);
                break L1;
              }
            }
            hj.a((java.awt.Component) (Object) param0, param1 + -13863);
            jl.a((java.awt.Component) (Object) param0, 0);
            if (null == ga.field_a) {
              break L0;
            } else {
              ga.field_a.a(false, (java.awt.Component) (Object) param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("cj.L(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = new q();
    }
}
