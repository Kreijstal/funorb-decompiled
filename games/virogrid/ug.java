/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static dl field_a;
    static int field_b;

    final static byte[] a(byte[] param0, int param1, int param2, boolean param3) {
        byte[] var4 = null;
        int var5_int = 0;
        fm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if ((param2 ^ -1) >= -1) {
            var4 = param0;
            break L0;
          } else {
            var8 = new byte[param1];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                var8[var5_int] = param0[param2 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new fm();
        var5.a(-44);
        var5.a((long)(param1 * 8), param3, var4);
        var6 = new byte[64];
        var5.a(0, var6, 8);
        return var6;
    }

    public static void a(int param0) {
        if (param0 > -4) {
            ug.a(81);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return la.field_n;
    }

    static {
    }
}
