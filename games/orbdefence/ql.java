/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_b;
    static String field_a;
    static String field_f;
    static int field_e;
    static String field_d;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 256) {
            ql.a(58, (byte) -83);
        }
        int var3 = 1;
        while (param2 > 1) {
            if (!((1 & param2) == 0)) {
                var3 = var3 * param1;
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
        }
        if ((param2 ^ -1) == -2) {
            return param1 * var3;
        }
        return var3;
    }

    final static void a(int param0, byte param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        qf var5 = (qf) (Object) vb.field_h.b((byte) 119);
        while (var5 != null) {
            ol.a(-30329, var5, param0);
            var5 = (qf) (Object) vb.field_h.d(853);
        }
        int var2 = -104 / ((param1 - -19) / 32);
        fb var3 = (fb) (Object) mg.field_l.b((byte) 122);
        while (var3 != null) {
            ia.a(-86, param0, var3);
            var3 = (fb) (Object) mg.field_l.d(853);
        }
    }

    final static String a(ki param0, String param1, String param2, byte param3) {
        int var4 = 82 % ((-20 - param3) / 32);
        if (!param0.b(-1)) {
            return param2;
        }
        return param1 + " - " + param0.a(20147) + "%";
    }

    final static aa a(int param0) {
        if (param0 != 65280) {
            return null;
        }
        return (aa) (Object) new g();
    }

    public static void a(byte param0) {
        if (param0 != 50) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        field_b = new int[128];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -65) {
            var0 = 0;
            L1: while (true) {
              if (64 <= var0) {
                var0 = field_b[63] & 16711935;
                var1 = field_b[63] & 65280;
                var2 = 0;
                L2: while (true) {
                  if ((var2 ^ -1) <= -3) {
                    field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
                    field_f = "Please wait...";
                    field_d = "Warning: if you quit, you will lose any game you are in the middle of!";
                    field_e = 0;
                  } else {
                    var3 = field_b[64 + var2];
                    var4 = -(var2 * 256 / 2) + 256;
                    var5 = 16711935 & var3;
                    var6 = 65280 & var3;
                    var5 = var5 * (256 + -var4);
                    var5 = var5 + var0 * var4;
                    var6 = var6 * (256 - var4);
                    var6 = var6 + var1 * var4;
                    var3 = (var5 & -16711936 | var6 & 16711680) >>> 1407628424;
                    field_b[64 - -var2] = var3;
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var1 = 96 * (var0 * var0) / 4096;
                var2 = 32 * (var0 * (var0 * var0)) / 262144;
                var3 = 128 * var0 * var0 / 4096;
                field_b[-var0 + 127] = var3 + ((var2 << 770669352) + (var1 << 994449488));
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = var0 * var0 * 192 / 4096;
            var2 = var0 * (var0 * (var0 * var0) * 128) / 16777216;
            var3 = var0 * var0 * (var0 * 255) / 262144;
            field_b[var0] = (var2 << 1799206696) + ((var1 << 840283408) + var3);
            var0++;
            continue L0;
          }
        }
    }
}
