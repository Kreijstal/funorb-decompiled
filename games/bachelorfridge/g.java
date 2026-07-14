/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends bw {
    static fea field_g;
    byte[] field_h;
    static po field_f;

    public static void c(byte param0) {
        int var1 = 8 % ((-41 - param0) / 53);
        field_f = null;
        field_g = null;
    }

    final static void a(String param0, String param1, byte param2) {
        wi.a(false, param1, param0, (byte) -68);
        if (param2 <= 55) {
            g.c((byte) 93);
        }
    }

    final static boolean a(int param0, int param1, int param2, vr param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param3.b(108, param0, param1);
        var4 = var5;
        if (param2 == -30744) {
          if (var5 == null) {
            return false;
          } else {
            hia.a(-42, var5);
            return true;
          }
        } else {
          g.c((byte) 41);
          if (var5 == null) {
            return false;
          } else {
            hia.a(-42, var5);
            return true;
          }
        }
    }

    g(byte[] param0) {
        ((g) this).field_h = param0;
    }

    static {
    }
}
