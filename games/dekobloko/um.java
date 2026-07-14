/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static String field_b;
    static int field_d;
    static String field_e;
    static int field_a;
    static w[] field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        qe var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = client.field_A ? 1 : 0;
          if (-1 <= (param2 ^ -1)) {
            var4 = param1;
            break L0;
          } else {
            var8 = new byte[param3];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                var8[var5_int] = param1[param2 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new qe();
        var5.b((byte) -44);
        var5.a(255, var4, (long)(8 * param3));
        var6 = new byte[64];
        var5.a(64767752, param0, var6);
        return var6;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param1 >> 143976848;
        if (param2 != 11469) {
          return 84;
        } else {
          var4 = param1 & 65535;
          var5 = param0 >> -1527702128;
          var6 = param0 & 65535;
          return param0 * var3 - -(var4 * var5) + (var4 * var6 >> -1278714480);
        }
    }

    final boolean b(int param0) {
        if (param0 == 22277) {
          if (this != (Object) (Object) nn.field_c) {
            if (this != (Object) (Object) of.field_a) {
              if (this == (Object) (Object) wf.field_u) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            field_e = null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please enter your age in years";
        field_d = 65;
        field_a = 4;
        field_e = "If you are not, please change your password to something more obscure!";
    }
}
