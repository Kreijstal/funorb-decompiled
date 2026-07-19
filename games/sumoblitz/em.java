/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em extends pt {
    static jn field_d;

    abstract ef b(int param0);

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
            field_d = (jn) null;
            return false;
        }
        return false;
    }

    private em() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_d = (jn) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_d = new jn();
    }
}
