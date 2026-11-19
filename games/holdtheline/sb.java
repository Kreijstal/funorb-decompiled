/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static kb field_d;
    static AccountProgressDialog field_c;
    static RoadSegment[] field_a;
    float field_b;

    final static void a(byte param0) {
        DualNodeHashTable.b(95);
        int var1 = -29 % ((17 - param0) / 45);
    }

    public static void clearSharedReferences(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 <= 65) {
          field_c = (AccountProgressDialog) null;
        }
    }

    static {
        field_d = new kb(3);
    }
}
