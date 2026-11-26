/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport078 {
    static SceneWidget sceneWidgetState0076;
    static String stringState0334;
    static java.awt.Image imageState0002;

    public static void clearStaticReferences(int integerArgument1) {
        int integerLocal1 = 67 % ((integerArgument1 + 1) / 55);
        stringState0334 = null;
        imageState0002 = null;
        sceneWidgetState0076 = null;
    }

    final static void performAction0960(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4) {
        MixedSupport117.performAction1529(integerArgument2, -67, integerArgument3, integerArgument1);
        MixedSupport090.performAction1146(integerArgument3, -299374302, integerArgument1, integerArgument2);
        MixedSupport039.performAction0527(integerArgument2, integerArgument1, booleanArgument4, integerArgument3);
        if (ComponentContainer.renderingSupport007State0006 != null) {
          GameDomainSupport005.performAction1211(true);
        }
    }

    static {
        stringState0334 = "Invite <%0> to this game";
    }
}
