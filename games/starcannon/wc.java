/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_h;
    static int field_f;
    static String field_g;
    static int field_i;
    static boolean[] field_c;
    static String field_e;
    static int field_a;
    static ge field_d;
    static int[] field_b;

    final static int a(int param0) {
        int var1 = 78 % ((19 - param0) / 44);
        return (int)(1000000000L / fd.field_c);
    }

    final static int d(int param0) {
        if (param0 != 20) {
            boolean discarded$0 = wc.a(-3, 'E');
            return ef.field_b;
        }
        return ef.field_b;
    }

    final static boolean a(int param0, char param1) {
        if (param0 == 48) {
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = -6;
          if (48 <= param1) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void c(int param0) {
        field_g = null;
        if (param0 != -1) {
            return;
        }
        field_c = null;
        field_b = null;
        field_d = null;
        field_h = null;
        field_e = null;
    }

    final static gj b(int param0) {
        try {
            Throwable var1 = null;
            gj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            gj stackOut_2_0 = null;
            try {
              L0: {
                if (param0 == 5220) {
                  break L0;
                } else {
                  boolean discarded$2 = wc.a(14, '￉');
                  break L0;
                }
              }
              stackOut_2_0 = (gj) Class.forName("me").newInstance();
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_i = -1;
        field_c = new boolean[112];
        field_g = "Star Cannon";
        field_e = "Passwords can only contain letters and numbers";
        field_b = new int[4];
        field_a = 20;
        field_d = new ge();
    }
}
