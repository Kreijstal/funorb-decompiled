/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestDefaults {
    static AccountRequestState IDLE;
    private static String field_z;

    public static void releaseStatics(int param0) {
        if (param0 != -11418) {
          return;
        }
        IDLE = null;
    }

    static {
        field_z = "hm.A(";
        IDLE = new AccountRequestState();
    }
}
