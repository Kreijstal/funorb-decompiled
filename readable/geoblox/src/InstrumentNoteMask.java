/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstrumentNoteMask extends IntrusiveNode {
    byte[] notesUsed;
    static TextValidationFailure missingTextComponentFailure;
    static int[] meshFaceOrder;
    static TextTemplateArgumentType textTemplateArgumentTypeZero;

    InstrumentNoteMask(byte[] notesUsed) {
        try {
            this.notesUsed = notesUsed;
        } catch (RuntimeException caughtFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caughtFailure), "pj.<init>(" + (notesUsed != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStaticReferences(boolean recursiveCleanup) {
        meshFaceOrder = null;
        textTemplateArgumentTypeZero = null;
        if (recursiveCleanup) {
            InstrumentNoteMask.releaseStaticReferences(false);
            missingTextComponentFailure = null;
            return;
        }
        missingTextComponentFailure = null;
    }

    static {
        missingTextComponentFailure = new TextValidationFailure();
        meshFaceOrder = new int[16384];
        textTemplateArgumentTypeZero = new TextTemplateArgumentType(0, 2, 2, 1);
    }
}
