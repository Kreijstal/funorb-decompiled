/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static ff field_a;
    static dl field_c;
    static boolean field_b;

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (qk.a(param1, param0, -2)) {
          if (param2 <= -30) {
            var3 = 0;
            L0: while (true) {
              if (param1.length() > var3) {
                if (!wg.a(param1.charAt(var3), (byte) -128)) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            field_a = null;
            var3 = 0;
            L1: while (true) {
              if (param1.length() > var3) {
                if (!wg.a(param1.charAt(var3), (byte) -128)) {
                  return false;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 25817) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ff(12, 0, 1, 0);
    }
}
