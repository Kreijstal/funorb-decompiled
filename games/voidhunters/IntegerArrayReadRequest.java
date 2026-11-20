/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerArrayReadRequest extends IntrusiveNode {
    int recordType;
    static EmailValidationError incompleteEmailError;
    int[] values;

    private IntegerArrayReadRequest() throws Throwable {
        throw new Error();
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          IntegerArrayReadRequest.clearSharedReferences(true);
          incompleteEmailError = null;
          return;
        }
        incompleteEmailError = null;
    }

    static {
        incompleteEmailError = new EmailValidationError();
    }
}
