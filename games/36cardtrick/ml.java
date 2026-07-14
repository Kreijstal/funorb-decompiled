/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static int[] field_b;
    static int field_a;

    final static short a(bb param0, int param1, int param2, int param3, byte param4) {
        if (param4 >= -41) {
          return (short) -3;
        } else {
          return (short)param0.a((-64 + 128 * param1) / 2, (128 * param3 + -64) / 2, param2 * 4);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        var4 = -1;
        var5 = param1;
        L0: while (true) {
          if (param2 <= var5) {
            if (param3 != 12011) {
              field_a = 58;
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 ^ -1;
              return var4;
            }
          } else {
            var4 = pc.field_b[(param0[var5] ^ var4) & 255] ^ var4 >>> -651646456;
            var5++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 69) {
            field_b = (int[]) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
