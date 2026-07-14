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
        if (param0 != -11808) {
          int discarded$2 = ((af) this).a(10);
          ((af) this).field_K = param1;
          ((af) this).field_K.field_h = (af) this;
          return;
        } else {
          ((af) this).field_K = param1;
          ((af) this).field_K.field_h = (af) this;
          return;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (jm.a(param1, param2 ^ -99, param0)) {
          if (param2 == -99) {
            var3 = 0;
            L0: while (true) {
              if (param1.length() > var3) {
                if (wb.a(param1.charAt(var3), (byte) 115)) {
                  var3++;
                  continue L0;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            af.d(false);
            var3 = 0;
            L1: while (true) {
              if (param1.length() > var3) {
                if (wb.a(param1.charAt(var3), (byte) 115)) {
                  var3++;
                  continue L1;
                } else {
                  return false;
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

    abstract int c(boolean param0);

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_G = null;
        field_H = null;
        field_F = null;
        field_L = null;
        if (param0) {
            return;
        }
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
        if (param2 != 122) {
            return;
        }
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
