/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iga {
    static vr field_d;
    static DualLinkNodeHashTable field_c;
    static String field_b;
    static Sprite[] field_a;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    abstract wba a(byte param0);

    abstract void a(PacketBuffer param0, boolean param1);

    static {
        field_z = "iga.E(";
        field_b = "Options";
    }
}
