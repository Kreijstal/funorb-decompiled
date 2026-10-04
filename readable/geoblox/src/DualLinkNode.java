/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    DualLinkNode nextSecondaryNode;
    static String invalidPasswordText;
    static float rotationStepRadians;
    static int[] decodedSpriteWidths;
    static String js5ConnectFullErrorText;
    DualLinkNode previousSecondaryNode;
    long secondaryKey;

    final static void evaluateGuardResidue(int methodGuard) {
        int guardResidue = -62 / ((-75 - methodGuard) / 49);
    }

    public static void releaseDualLinkResources(byte methodGuard) {
        invalidPasswordText = null;
        decodedSpriteWidths = null;
        int guardResidue = -128 / ((methodGuard + 33) / 50);
        js5ConnectFullErrorText = null;
    }

    final static String getSessionTextOrEmpty(byte methodGuard) {
        if (methodGuard > -43) {
            return (String) null;
        }
        if (!(null != SecondaryDeque.field_f)) {
            return "";
        }
        return SecondaryDeque.field_f;
    }

    final static void readSessionTextAndHash(int methodGuard) {
        SecondaryDeque.field_f = LogoCompositor.sessionPacketBuffer.readNullTerminatedText((byte) 113);
        CharSequence textForHash = (CharSequence) ((Object) SecondaryDeque.field_f);
        SecondaryNodeHashTable.field_b = ResizableDialog.a(textForHash, 12);
        if (methodGuard != 1) {
            DualLinkNode.readSessionTextAndHash(83);
        }
    }

    final void unlinkSecondaryNode(byte methodGuard) {
        if (!(this.previousSecondaryNode != null)) {
            return;
        }
        this.previousSecondaryNode.nextSecondaryNode = this.nextSecondaryNode;
        if (methodGuard > 39) {
            this.nextSecondaryNode.previousSecondaryNode = this.previousSecondaryNode;
            this.previousSecondaryNode = null;
            this.nextSecondaryNode = null;
            return;
        }
        js5ConnectFullErrorText = (String) null;
        this.nextSecondaryNode.previousSecondaryNode = this.previousSecondaryNode;
        this.previousSecondaryNode = null;
        this.nextSecondaryNode = null;
    }

    final static int getLoginBooleanReplyLength(int methodGuard) {
        if (methodGuard < 101) {
            DualLinkNode.releaseDualLinkResources((byte) 20);
            return 1;
        }
        return 1;
    }

    final static boolean isAsciiDigit(int methodGuard, char character) {
        if (methodGuard != -58) {
            return false;
        }
        if (48 > character) {
            return false;
        }
        if (character > 57) {
            return false;
        }
        return true;
    }

    protected DualLinkNode() {
    }

    static {
        rotationStepRadians = 0.01666666753590107f;
        invalidPasswordText = "Invalid password.";
        js5ConnectFullErrorText = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
