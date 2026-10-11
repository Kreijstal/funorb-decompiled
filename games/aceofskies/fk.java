/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String[] field_b;
    static byte[][] field_a;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(byte param0) {
        if (param0 == 28) {
          field_b = null;
          field_a = (byte[][]) null;
          return;
        }
        fk.a(-27, -84);
        field_b = null;
        field_a = (byte[][]) null;
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        if (param1 > 19) {
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 + 1;
        }
        field_a = (byte[][]) null;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    static {
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
