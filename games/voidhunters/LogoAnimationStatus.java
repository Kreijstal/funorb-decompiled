/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoAnimationStatus {
    static GameStateFactory roundResultFactory;
    static String field_a;

    public static void clearSharedReferences(int param0) {
        int var1 = -116 % ((param0 - 62) / 49);
        roundResultFactory = null;
        field_a = null;
    }

    final static boolean hasLogoAnimationFinished(boolean param0) {
        if (!param0) {
          return false;
        }
        return SetSalvoaim.logoAnimationTick > 250 ? true : false;
    }

    static {
        roundResultFactory = (GameStateFactory) ((Object) new RoundResultFactory());
        field_a = "Armour plate";
    }
}
