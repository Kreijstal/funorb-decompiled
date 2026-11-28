/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_b;
    static String field_a;
    static String field_c;
    static boolean field_d;

    final static void sleepMillis(long param0, byte param1) {
        if (param0 <= 0L) {
          return;
        }
        int var3 = 19 % ((-39 - param1) / 53);
        if (param0 % 10L != 0L) {
          SoundCache.sleepIgnoringInterrupts(param0, -74);
          return;
        }
        SoundCache.sleepIgnoringInterrupts(-1L + param0, -95);
        SoundCache.sleepIgnoringInterrupts(1L, -120);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 10) {
          bc.sleepMillis(-47L, (byte) -116);
        }
    }

    static {
        field_b = 80;
        field_a = "Full";
        field_c = "Send private message to <%0>";
    }
}
