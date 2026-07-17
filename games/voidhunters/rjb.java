/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rjb extends kt {
    private byte[] field_t;
    static int field_u;

    final byte[] b(int param0, byte param1, int param2, int param3) {
        ((rjb) this).field_t = new byte[param2 * param0 * (param3 * 2)];
        if (param1 > -36) {
          byte[] discarded$2 = ((rjb) this).b(-114, (byte) -82, -98, -124);
          ((rjb) this).a(param2, (byte) -10, param0, param3);
          return ((rjb) this).field_t;
        } else {
          ((rjb) this).a(param2, (byte) -10, param0, param3);
          return ((rjb) this).field_t;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2 * 2;
        var5 = 255 & param1;
        int incrementValue$2 = var4;
        var4++;
        ((rjb) this).field_t[incrementValue$2] = (byte)(3 * var5 >> 5);
        if (param0 != 0) {
          field_u = 17;
          ((rjb) this).field_t[var4] = (byte)(var5 * 3 >> 5);
          return;
        } else {
          ((rjb) this).field_t[var4] = (byte)(var5 * 3 >> 5);
          return;
        }
    }

    rjb() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 32768;
    }
}
