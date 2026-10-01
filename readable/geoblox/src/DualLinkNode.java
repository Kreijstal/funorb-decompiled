/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    DualLinkNode nextSecondaryNode;
    static String field_f;
    static float rotationStepRadians;
    static int[] field_j;
    static String field_g;
    DualLinkNode previousSecondaryNode;
    long field_i;

    final static void c(int param0) {
        int var1 = -62 / ((-75 - param0) / 49);
    }

    public static void c(byte param0) {
        field_f = null;
        field_j = null;
        int var1 = -128 / ((param0 - -33) / 50);
        field_g = null;
    }

    final static String d(byte param0) {
        if (param0 > -43) {
            return (String) null;
        }
        if (!(null != wd.field_f)) {
            return "";
        }
        return wd.field_f;
    }

    final static void b(int param0) {
        wd.field_f = eh.field_d.e((byte) 113);
        CharSequence var2 = (CharSequence) ((Object) wd.field_f);
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
        field_g = (String) null;
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
        field_f = "Invalid password.";
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
