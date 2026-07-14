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
            oe var5 = null;
            br var5_ref = null;
            oe stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            oe stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("c");
                if (param1 <= -12) {
                  break L0;
                } else {
                  field_a = (gk) null;
                  break L0;
                }
              }
              var5 = (oe) var4.newInstance();
              var5.a(-12189, param2, param0, param3);
              stackOut_2_0 = (oe) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (oe) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static void a(int param0, int param1) {
        if (param1 != 20665) {
            java.awt.Canvas var3 = (java.awt.Canvas) null;
            oe discarded$0 = oi.a((java.awt.Canvas) null, 77, -52, -1);
            dh.field_c = param0;
            return;
        }
        dh.field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
