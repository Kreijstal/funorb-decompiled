/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MasterIndexHelpers {
    static String field_d;
    static PendingRecordRequest field_c;
    static boolean field_a;
    static int field_b;

    final static boolean loadMasterIndex(byte param0) {
        if (param0 > -127) {
          MasterIndexHelpers.loadMasterIndex((byte) 91);
          return PendingBytePayloadRequest.field_l.loadMasterIndex((byte) 0);
        }
        return PendingBytePayloadRequest.field_l.loadMasterIndex((byte) 0);
    }

    public static void releaseStatics(int param0) {
        if (param0 < 63) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    static {
        field_c = null;
    }
}
