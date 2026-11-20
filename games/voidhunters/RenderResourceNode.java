/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RenderResourceNode extends DualLinkNode {
    static String field_m;
    static double field_l;
    static int field_k;
    private static String field_z;

    protected RenderResourceNode() {
    }

    public static void clearSharedReferences(byte param0) {
        field_m = null;
        if (param0 != -123) {
          RenderResourceNode.clearSharedReferences((byte) -19);
        }
    }

    static {
        field_z = "r.A(";
        field_m = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_k = 1;
        field_l = -1.0;
    }
}
