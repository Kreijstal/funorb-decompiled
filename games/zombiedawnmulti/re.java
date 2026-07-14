/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static cj field_a;
    static boolean field_b;

    final static void a(boolean param0) {
        CharSequence var2 = null;
        CharSequence var3 = null;
        ta.field_lb = s.field_e.f((byte) -107);
        if (param0) {
          field_a = null;
          var2 = (CharSequence) (Object) ta.field_lb;
          kf.field_k = tg.a(var2, param0);
          return;
        } else {
          var3 = (CharSequence) (Object) ta.field_lb;
          kf.field_k = tg.a(var3, param0);
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 > -110) {
            Object var2 = null;
            int discarded$0 = re.a((byte[]) null, 41, (byte) -96);
            return true;
        }
        return true;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param1.length;
        if (param0 != 255) {
          re.a(80);
          var3 = new byte[var2];
          d.a(param1, 0, var3, 0, var2);
          return var3;
        } else {
          var3 = new byte[var2];
          d.a(param1, 0, var3, 0, var2);
          return var3;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte[] param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = 0;
        var4 = 255;
        if (param2 < 47) {
          return 63;
        } else {
          var3 = var3 | (var4 & param0[param1 * 4]) << -2128226600;
          var3 = var3 | (var4 & param0[1 + 4 * param1]) << 550961680;
          var3 = var3 | (var4 & param0[4 * param1 + 2]) << -337687576;
          var3 = var3 | var4 & param0[3 + 4 * param1];
          return var3;
        }
    }

    public static void a(int param0) {
        int var1 = 102 % ((param0 - -29) / 54);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
