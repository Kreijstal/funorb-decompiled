/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static rh field_b;
    static qc field_a;
    static long[] field_c;

    final static wc a(int param0, byte param1, rh param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param2.a(param0, 0);
        var3 = var4;
        if (param1 <= -84) {
          if (var4 == null) {
            return null;
          } else {
            return new wc(var4);
          }
        } else {
          ub.a(82);
          if (var4 == null) {
            return null;
          } else {
            return new wc(var4);
          }
        }
    }

    final static jh a(String param0, rh param1, String param2, rh param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != 32) {
          return null;
        } else {
          var5 = param1.a(param0, (byte) -100);
          var6 = param1.a(param2, (byte) -15, var5);
          return lb.a(param1, 5592405, var5, var6, param3);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 17077) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
    }
}
