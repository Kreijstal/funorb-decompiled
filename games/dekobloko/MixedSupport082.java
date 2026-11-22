/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport082 {
    static SceneWidget sceneWidgetState0076;
    static String stringState0334;
    static java.awt.Image imageState0002;

    public static void performAction0983(int integerArgument1) {
        int integerLocal1 = 67 % ((integerArgument1 + 1) / 55);
        stringState0334 = null;
        imageState0002 = null;
        sceneWidgetState0076 = null;
    }

    final static void performAction0984(int integerArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4) {
        MixedSupport122.performAction1575(integerArgument2, -67, integerArgument3, integerArgument1);
        MixedSupport095.performAction1178(integerArgument3, -299374302, integerArgument1, integerArgument2);
        MixedSupport039.performAction0534(integerArgument2, integerArgument1, booleanArgument4, integerArgument3);
        if (ComponentContainer.renderingSupport008State0006 != null) {
          GameDomainSupport005.performAction1243(true);
        }
    }

    static {
        stringState0334 = "Invite <%0> to this game";
    }
}
