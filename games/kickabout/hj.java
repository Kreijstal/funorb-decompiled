/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends js {
    static String field_g;
    static hd field_h;

    final void a(int param0, boolean param1) {
        on.a(0, 0, 640, 480, 65793);
        if (param0 != -5) {
            field_h = null;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = -97 % ((38 - param0) / 60);
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 > -5) {
            hj.a(114);
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -28) {
                break L1;
              } else {
                hj.a(-50);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hj.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 <= 32) {
            return;
        }
        field_g = null;
    }

    hj() {
        super(-4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Start Game";
    }
}
