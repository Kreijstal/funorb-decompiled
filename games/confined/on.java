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

    final static rb a(java.awt.Component param0, int param1, int param2) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            rb var5 = null;
            cd var5_ref = null;
            rb stackIn_1_0 = null;
            cd stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            rb stackOut_0_0 = null;
            cd stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("gn");
                var5 = (rb) var4.newInstance();
                var5.a(param0, param2, -118, param1);
                stackOut_0_0 = (rb) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new cd();
                ((rb) (Object) var5_ref).a(param0, param2, -68, param1);
                stackOut_2_0 = (cd) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (rb) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("on.N(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + 1359 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
