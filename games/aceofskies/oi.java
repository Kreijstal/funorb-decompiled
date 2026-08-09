/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static gk field_d;
    static String field_b;
    static hc field_c;
    static gk field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2801) {
          oi.a(-40);
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static oe a(java.awt.Canvas param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            oe var5 = null;
            br var5_ref = null;
            oe stackIn_3_0 = null;
            br stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("c");
                      if (param1 <= -12) {
                        break L2;
                      } else {
                        field_a = (gk) null;
                        break L2;
                      }
                    }
                    var5 = (oe) (var4.newInstance());
                    var5.a(-12189, param2, param0, param3);
                    stackIn_3_0 = (oe) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new br();
                  ((oe) ((Object) var5_ref)).a(-12189, param2, param0, param3);
                  stackIn_5_0 = (br) (var5_ref);
                  return (oe) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("oi.A(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 20665) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            oi.a((java.awt.Canvas) null, 77, -52, -1);
            dh.field_c = param0;
            return;
        }
        dh.field_c = param0;
    }

    static {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
