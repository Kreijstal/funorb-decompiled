/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class on {
    static int[] field_f;
    static java.security.SecureRandom field_d;
    static String field_b;
    static boolean field_e;
    static String[] field_c;
    static int field_a;

    final static rb a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            rb var5 = null;
            cd var5_ref = null;
            rb stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            rb stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("gn");
                if (param3 == 1359) {
                  break L0;
                } else {
                  field_d = null;
                  break L0;
                }
              }
              var5 = (rb) var4.newInstance();
              var5.a(param0, param2, param3 + -1477, param1);
              stackOut_2_0 = (rb) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        if (param0 != -14330) {
          on.a(-91);
          field_f = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=FFFFFF>Lightning cannon:</col> gives your ship a powerful electric charge, resulting in everything nearby being zapped by lightning! Hold <col=FFFFFF><%0></col> to operate, and remember to manage your ready energy.";
        field_f = new int[128];
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_a = 0;
    }
}
