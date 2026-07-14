/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static String field_b;
    static mh field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = jd.a((byte) -52, true, (CharSequence) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        eq var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 == -14970) {
          if (0 >= param1) {
            var4 = param0;
            var5 = new eq();
            var5.b((byte) 99);
            var5.a(var4, 540, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(var6, param2 ^ -14860, 0);
            return var6;
          } else {
            var8 = new byte[param3];
            var4 = var8;
            var5_int = 0;
            L0: while (true) {
              if (param3 <= var5_int) {
                var5 = new eq();
                var5.b((byte) 99);
                var5.a(var4, 540, (long)(param3 * 8));
                var6 = new byte[64];
                var5.a(var6, param2 ^ -14860, 0);
                return var6;
              } else {
                var8[var5_int] = param0[param1 + var5_int];
                var5_int++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (bd.a(param2, 0, param1)) {
          var3 = 0;
          L0: while (true) {
            if (param2.length() <= var3) {
              if (param0 < 111) {
                field_b = null;
                return true;
              } else {
                return true;
              }
            } else {
              if (!mh.a(true, param2.charAt(var3))) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    static {
    }
}
