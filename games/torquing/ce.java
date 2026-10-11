/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_a;
    static boolean field_b;

    public static void a(byte param0) {
        if (param0 != -55) {
          return;
        }
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0) {
        if (param0 <= 98) {
          return true;
        }
        if (qi.field_a == this) {
          return true;
        }
        if (p.field_t == this) {
          return true;
        }
        if (this != w.field_cb) {
          return false;
        }
        return true;
    }

    static {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_b = false;
    }
}
