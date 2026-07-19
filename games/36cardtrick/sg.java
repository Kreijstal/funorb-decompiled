/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static String field_e;
    static kc field_d;
    static boolean field_b;
    static qk field_a;
    static int[] field_c;
    static int[] field_g;
    static int[] field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(int param0) {
        if (null == ri.field_c) {
            return "";
        }
        int var1 = 38 / ((param0 - 55) / 46);
        return ri.field_c;
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 511) {
          field_g = (int[]) null;
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(byte param0) {
        ua.field_F = null;
        if (param0 != -12) {
            return;
        }
        hk.field_a = null;
    }

    static {
        field_e = "Difficulty: Hard";
        field_c = new int[4];
        field_g = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
