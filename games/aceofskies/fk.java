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
        if (param0 != 28) {
          int discarded$2 = fk.a(-27, -84);
          field_b = null;
          field_a = (byte[][]) null;
          return;
        } else {
          field_b = null;
          field_a = (byte[][]) null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 922163841;
        param0 = param0 | param0 >>> -2125692414;
        if (param1 <= 19) {
          field_a = (byte[][]) (byte[][]) null;
          param0 = param0 | param0 >>> 490007556;
          param0 = param0 | param0 >>> 1996053256;
          param0 = param0 | param0 >>> 633756304;
          return param0 - -1;
        } else {
          param0 = param0 | param0 >>> 490007556;
          param0 = param0 | param0 >>> 1996053256;
          param0 = param0 | param0 >>> 633756304;
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
