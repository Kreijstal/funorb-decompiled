/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_e;
    static fe field_c;
    static nh field_b;
    static int field_f;
    static int[] field_a;
    static jb field_d;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static double a(int param0, double param1) {
        if (param0 != 65535) {
          field_c = null;
          return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
        } else {
          return oj.field_a[(int)(param1 * 32768.0 / 3.141592653589793) & 65535];
        }
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        bh var4 = null;
        if (param1 != null) {
          if (!(param1 instanceof byte[])) {
            if (param1 instanceof bh) {
              var4 = (bh) param1;
              return var4.c(19707);
            } else {
              if (param0 != 23436) {
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            var3 = (byte[]) param1;
            if (param2) {
              return qd.a((byte) 111, var3);
            } else {
              return var3;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_c = new fe();
        field_a = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
