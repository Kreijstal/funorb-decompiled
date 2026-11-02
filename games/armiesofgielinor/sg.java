/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static ClientConnectionState field_a;
    static IndexedSprite[] field_b;
    static NineSliceFrame field_c;
    private static String field_z;

    public static void releaseStatics(byte obfuscationGuard) {
        if (obfuscationGuard < 83) {
          return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_z = "sg.A(";
        field_a = new ClientConnectionState();
    }
}
