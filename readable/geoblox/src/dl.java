/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static boolean field_b;
    static UsernameAvailabilityQuery field_a;
    static volatile boolean field_c;

    public static void a(boolean param0) {
        if (!param0) {
            dl.a(false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 == 11560) {
            TextHotspotBounds.field_l = false;
            LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            return;
        }
        field_b = false;
        TextHotspotBounds.field_l = false;
        LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
    }

    static {
        field_b = true;
        field_c = true;
    }
}
