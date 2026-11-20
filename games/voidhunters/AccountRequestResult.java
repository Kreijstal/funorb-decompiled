/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestResult {
    static QuickChatDynamicCommand field_a;
    String[] suggestedNames;
    int responseCode;
    boolean success;
    boolean under13;
    static int field_b;
    String message;

    public static void clearSharedReferences(int param0) {
        if (param0 != 2) {
          AccountRequestResult.clearSharedReferences(-52);
          field_a = null;
          return;
        }
        field_a = null;
    }

    AccountRequestResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_a = new QuickChatDynamicCommand(10, 2, 2, 0);
    }
}
