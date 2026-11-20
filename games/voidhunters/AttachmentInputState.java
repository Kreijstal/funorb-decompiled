/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttachmentInputState {
    int aimTargetX;
    int triggers;
    int aimTargetY;
    int previousTriggers;
    static ScrollableActionPanel field_b;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        field_b = null;
        if (param0 != -66) {
          AttachmentInputState.clearSharedReferences((byte) -20);
        }
    }

    static {
        field_z = "vra.A(";
    }
}
