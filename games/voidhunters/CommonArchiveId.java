/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommonArchiveId {
    int id;
    static String field_c;
    static String field_b;
    static int field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    CommonArchiveId(int param0) {
        this.id = param0;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_c = "Shields";
        field_b = "<%0> won the match by a mere <%1>!";
        field_d = 0;
    }
}
