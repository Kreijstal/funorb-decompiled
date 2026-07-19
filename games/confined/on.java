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
            RuntimeException var4_ref2 = null;
            rb var5 = null;
            cd var5_ref = null;
            rb stackIn_3_0 = null;
            cd stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            rb stackOut_2_0 = null;
            cd stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("gn");
                      if (param3 == 1359) {
                        break L2;
                      } else {
                        field_d = (java.security.SecureRandom) null;
                        break L2;
                      }
                    }
                    var5 = (rb) (var4.newInstance());
                    var5.a(param0, param2, param3 + -1477, param1);
                    stackOut_2_0 = (rb) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new cd();
                  ((rb) ((Object) var5_ref)).a(param0, param2, -68, param1);
                  stackOut_4_0 = (cd) (var5_ref);
                  stackIn_5_0 = stackOut_4_0;
                  return (rb) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("on.N(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
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
        field_b = "<col=FFFFFF>Lightning cannon:</col> gives your ship a powerful electric charge, resulting in everything nearby being zapped by lightning! Hold <col=FFFFFF><%0></col> to operate, and remember to manage your ready energy.";
        field_f = new int[128];
        field_c = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_a = 0;
    }
}
