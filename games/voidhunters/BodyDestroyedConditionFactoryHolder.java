/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BodyDestroyedConditionFactoryHolder {
    static GameStateFactory factory;
    static boolean field_a;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        factory = null;
        if (!param0) {
          BodyDestroyedConditionFactoryHolder.clearSharedReferences(false);
        }
    }

    static {
        field_z = "oua.A(";
        factory = (GameStateFactory) ((Object) new BodyDestroyedConditionFactory());
        field_a = false;
    }
}
