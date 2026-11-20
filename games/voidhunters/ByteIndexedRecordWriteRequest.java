/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteIndexedRecordWriteRequest extends IntrusiveNode {
    int field_f;
    static int field_j;
    static int field_d;
    static String[] field_k;
    int field_h;
    int field_i;
    int recordId;
    int recordType;
    int field_l;

    public static void clearSharedReferences(int param0) {
        field_k = null;
        if (param0 != 10) {
          ByteIndexedRecordWriteRequest.clearSharedReferences(-25);
        }
    }

    private ByteIndexedRecordWriteRequest() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 10;
    }
}
