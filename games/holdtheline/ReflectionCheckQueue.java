/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckQueue {
    static IntrusiveDeque pendingChecks;
    static float[] field_c;
    static float[] field_d;
    static int field_a;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_d = null;
        pendingChecks = null;
        field_c = null;
        if (param0 != 18668) {
          ReflectionCheckQueue.clearSharedReferences(18);
        }
    }

    static {
        field_z = "sl.A(";
        pendingChecks = new IntrusiveDeque();
        field_d = new float[]{1.0f, 2.0f, 4.0f, 500.0f, 2500.0f, 250.0f, 20.0f, 10.0f};
        field_c = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    }
}
