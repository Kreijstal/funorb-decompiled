/*
 * Decompiled by CFR-JS 0.4.0.
 */
class VisualPropertyNode extends DualLinkNode {
    static int previousPacketOpcode;
    static boolean field_o;
    static java.applet.Applet loaderApplet;
    private static String field_z;

    VisualPropertyNode() {
    }

    public static void e(byte param0) {
        loaderApplet = null;
        if (param0 < 54) {
            loaderApplet = (java.applet.Applet) null;
        }
    }

    static {
        field_z = "kg.C(";
        previousPacketOpcode = -1;
        field_o = false;
    }
}
