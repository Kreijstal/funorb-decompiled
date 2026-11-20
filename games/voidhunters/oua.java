/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oua {
    static GameStateFactory field_b;
    static boolean field_a;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_b = null;
        if (!param0) {
          oua.clearSharedReferences(false);
        }
    }

    static {
        field_z = "oua.A(";
        field_b = (GameStateFactory) ((Object) new BodyDestroyedConditionFactory());
        field_a = false;
    }
}
