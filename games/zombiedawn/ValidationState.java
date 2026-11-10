/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationState {
    static int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void onConnectionLost(int param0) {
        if (param0 >= -3) {
          field_a = 45;
        }
    }

    static {
        field_a = 348;
    }
}
