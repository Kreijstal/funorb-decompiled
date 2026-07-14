/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af {
    static ka[] field_a;
    static ka[] field_b;
    static java.security.SecureRandom field_d;
    static String[] field_c;
    static int[][][] field_e;
    static int[] field_f;

    final static void b(int param0, int param1) {
        pa var2 = null;
        var2 = dk.field_s;
        var2.d(25, param1);
        if (param0 != 9245) {
          af.b(-81, -34);
          var2.d(1, (byte) 122);
          var2.d(2, (byte) 122);
          return;
        } else {
          var2.d(1, (byte) 122);
          var2.d(2, (byte) 122);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_d = null;
        if (param0 != -7604) {
            boolean discarded$0 = af.a(1, -16);
        }
    }

    final static boolean a(int param0, int param1) {
        if ((param1 ^ -1) == -4) {
          return true;
        } else {
          if (4 == param1) {
            return true;
          } else {
            if (param1 != -6) {
              if (param0 == -4275) {
                if (-9 != param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_e = new int[][][]{new int[3][], new int[2][], new int[4][], new int[6][], new int[3][], new int[1][], new int[6][]};
        field_f = new int[]{6, 6, 180, 39};
    }
}
