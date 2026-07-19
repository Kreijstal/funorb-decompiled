/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tgb extends abb {
    static int[] field_c;
    static String field_d;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -58) {
            tgb.b((byte) 51);
        }
    }

    final long a(byte param0) {
        if (param0 != -110) {
            return 75L;
        }
        return System.nanoTime();
    }

    tgb() {
    }

    static {
        field_c = new int[1000];
        field_d = "Add condition (Body in map zone)";
    }
}
