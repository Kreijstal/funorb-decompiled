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
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        if (param1 <= 19) {
          field_a = null;
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 - -1;
        } else {
          param0 = param0 | param0 >>> 4;
          param0 = param0 | param0 >>> 8;
          param0 = param0 | param0 >>> 16;
          return param0 - -1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
