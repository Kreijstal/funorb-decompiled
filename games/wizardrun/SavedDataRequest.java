/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataRequest extends IntrusiveNode {
    static boolean field_j;
    static LevelData level;
    static int field_k;
    static MouseInputHandler mouseHandler;
    static String field_n;
    static int field_i;

    private SavedDataRequest() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(byte param0) {
        level = null;
        field_n = null;
        mouseHandler = null;
        if (param0 >= -90) {
          SavedDataRequest.releaseStatics((byte) 125);
        }
    }

    static {
        field_k = 0;
        level = new LevelData();
        mouseHandler = new MouseInputHandler();
        field_n = "Try again";
    }
}
