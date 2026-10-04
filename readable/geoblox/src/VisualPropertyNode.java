/*
 * Decompiled by CFR-JS 0.4.0.
 */
class VisualPropertyNode extends DualLinkNode {
    static int previousPacketOpcode;
    static boolean highUpdateRateModeActive;
    static java.applet.Applet loaderApplet;
    private static String retainedFailureContextPrefix;

    VisualPropertyNode() {
    }

    public static void releaseStaticReferences(byte methodGuard) {
        loaderApplet = null;
        if (methodGuard < 54) {
            loaderApplet = (java.applet.Applet) null;
        }
    }

    static {
        retainedFailureContextPrefix = "kg.C(";
        previousPacketOpcode = -1;
        highUpdateRateModeActive = false;
    }
}
