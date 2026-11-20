/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SystemNanoClock extends NanosecondClock {
    static int[] field_c;
    static String field_d;

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != -58) {
          SystemNanoClock.clearSharedReferences((byte) 51);
        }
    }

    final long nanoTime(byte param0) {
        if (param0 != -110) {
          return 75L;
        }
        return System.nanoTime();
    }

    SystemNanoClock() {
        System.nanoTime();
    }

    static {
        field_c = new int[1000];
        field_d = "Add condition (Body in map zone)";
    }
}
