/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QueuedKeyedRequest extends IntrusiveNode {
    int field_l;
    static boolean field_j;
    static String field_f;
    int field_g;
    int field_k;
    int field_h;
    int field_i;
    int field_m;

    final static int getPendingRegistrationAge(boolean param0) {
        if (param0) {
          return -128;
        }
        return QuickChatPhraseDefinition.field_n;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3402) {
          QueuedKeyedRequest.getPendingRegistrationAge(false);
          field_f = null;
          return;
        }
        field_f = null;
    }

    private QueuedKeyedRequest() throws Throwable {
        throw new Error();
    }

    static {
    }
}
