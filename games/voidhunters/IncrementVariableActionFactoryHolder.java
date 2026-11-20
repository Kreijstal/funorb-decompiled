/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncrementVariableActionFactoryHolder {
    static GameStateFactory factory;
    static String field_b;
    static Widget field_c;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 74) {
          return;
        }
        factory = null;
        field_c = null;
        field_b = null;
    }

    static {
        field_z = "cwa.A(";
        factory = (GameStateFactory) ((Object) new IncrementVariableActionFactory());
    }
}
