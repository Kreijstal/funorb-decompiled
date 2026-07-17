/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af extends cj implements ik {
    private df field_K;
    static String field_L;
    static int field_E;
    static String field_G;
    static String field_H;
    static String field_J;
    static String field_I;
    static char[] field_F;

    void a(int param0, df param1) {
        try {
            if (param0 != -11808) {
                int discarded$0 = ((af) this).a(10);
            }
            ((af) this).field_K = param1;
            ((af) this).field_K.field_h = (af) this;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "af.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (jm.a(param1, 0, param0)) {
              var3_int = 0;
              L1: while (true) {
                if (param1.length() <= var3_int) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (wb.a(param1.charAt(var3_int), (byte) 115)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("af.W(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -99 + 41);
        }
        return stackIn_11_0 != 0;
    }

    abstract int c(boolean param0);

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_G = null;
        field_H = null;
        field_F = null;
        field_L = null;
        field_J = null;
        field_I = null;
    }

    public final of a(byte param0) {
        if (param0 != -5) {
            ((af) this).field_K = null;
            return (of) (Object) ((af) this).field_K;
        }
        return (of) (Object) ((af) this).field_K;
    }

    abstract int i(int param0);

    abstract int a(int param0);

    af(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void a(int param0, int param1, byte param2) {
        kf.field_b = param1;
        ni.field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "From <%0>: ";
        field_G = "Accept invitation to <%0>'s game";
        field_J = "Unfortunately you are not eligible to create an account.";
        field_F = new char[128];
        field_I = "Close";
    }
}
