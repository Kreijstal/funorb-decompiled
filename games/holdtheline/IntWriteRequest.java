/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntWriteRequest extends IntrusiveNode {
    static NamedSoundEffect field_m;
    static int field_i;
    static int field_l;
    int category;
    int id;

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          IntWriteRequest.clearSharedReferences(true);
          field_m = null;
          return;
        }
        field_m = null;
    }

    private IntWriteRequest() throws Throwable {
        throw new Error();
    }

    static {
    }
}
