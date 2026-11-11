/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nea {
    static MonochromeRowCacheEntry field_a;
    static PlatformTaskDispatcher field_c;
    static String field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_z = "nea.A(";
        field_b = "Disc of death vending machines";
        field_a = new MonochromeRowCacheEntry(0, 0);
    }
}
