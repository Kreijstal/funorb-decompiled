/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static GameStateFactory field_b;
    static String field_a;

    public static void clearSharedReferences(int param0) {
        int var1 = -116 % ((param0 - 62) / 49);
        field_b = null;
        field_a = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return SetSalvoaim.field_r > 250 ? true : false;
    }

    static {
        field_b = (GameStateFactory) ((Object) new RoundResultFactory());
        field_a = "Armour plate";
    }
}
