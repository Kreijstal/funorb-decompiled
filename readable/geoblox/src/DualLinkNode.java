/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    DualLinkNode nextSecondaryNode;
    static String invalidPasswordText;
    static float rotationStepRadians;
    static int[] field_j;
    static String js5ConnectFullErrorText;
    DualLinkNode previousSecondaryNode;
    long field_i;

    final static void c(int param0) {
        int var1 = -62 / ((-75 - param0) / 49);
    }

    public static void c(byte param0) {
        invalidPasswordText = null;
        field_j = null;
        int var1 = -128 / ((param0 - -33) / 50);
        js5ConnectFullErrorText = null;
    }

    final static String d(byte param0) {
        if (param0 > -43) {
            return (String) null;
        }
        if (!(null != SecondaryDeque.field_f)) {
            return "";
        }
        return SecondaryDeque.field_f;
    }

    final static void b(int param0) {
        SecondaryDeque.field_f = eh.field_d.e((byte) 113);
        CharSequence var2 = (CharSequence) ((Object) SecondaryDeque.field_f);
        vg.field_b = oe.a(var2, 12);
        if (param0 != 1) {
            DualLinkNode.b(83);
        }
    }

    final void unlinkSecondaryNode(byte param0) {
        if (!(this.previousSecondaryNode != null)) {
            return;
        }
        this.previousSecondaryNode.nextSecondaryNode = this.nextSecondaryNode;
        if (param0 > 39) {
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

    final static int d(int param0) {
        if (param0 < 101) {
            DualLinkNode.c((byte) 20);
            return 1;
        }
        return 1;
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -58) {
            return false;
        }
        if (48 > param1) {
            return false;
        }
        if (param1 > 57) {
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
