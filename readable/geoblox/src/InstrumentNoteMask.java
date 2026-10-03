/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentNoteMask extends IntrusiveNode {
    byte[] notesUsed;
    static TextValidationFailure field_f;
    static int[] meshFaceOrder;
    static TextTemplateArgumentType field_g;

    InstrumentNoteMask(byte[] notesUsed) {
        try {
            this.notesUsed = notesUsed;
        } catch (RuntimeException caughtFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caughtFailure), "pj.<init>(" + (notesUsed != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        meshFaceOrder = null;
        field_g = null;
        if (param0) {
            InstrumentNoteMask.b(false);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        field_f = new TextValidationFailure();
        meshFaceOrder = new int[16384];
        field_g = new TextTemplateArgumentType(0, 2, 2, 1);
    }
}
