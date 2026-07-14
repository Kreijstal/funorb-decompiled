/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dp {
    static int[] field_a;
    static t field_b;

    abstract byte[] a(int param0);

    final static af a(String param0, String param1, la param2, byte param3) {
        if (param3 != 4) {
          field_b = null;
          return bi.a(md.a(param0, 31094, param2, param1), param3 ^ -108);
        } else {
          return bi.a(md.a(param0, 31094, param2, param1), param3 ^ -108);
        }
    }

    public static void b(int param0) {
        int var1 = 119 % ((param0 - -49) / 50);
        field_a = null;
        field_b = null;
    }

    abstract void a(byte param0, byte[] param1);

    static {
    }
}
