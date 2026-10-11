/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport143 extends HashNode {
    static int integerState0836;
    static SceneWidget sceneWidgetState0128;
    static String stringState0582;
    static String stringState0583;
    static String stringState0584;
    int integerState0837;

    final static int computeInteger1932(int integerArgument1) {
        if (integerArgument1 != 480) {
          return 53;
        }
        return CodecSupport004.integerState0700 - RenderingSupport003.integerState0251;
    }

    public static void performAction1933(byte byteArgument1) {
        int integerLocal1 = 9 % ((byteArgument1 - 10) / 59);
        stringState0584 = null;
        stringState0583 = null;
        sceneWidgetState0128 = null;
        stringState0582 = null;
    }

    MixedSupport143(int integerArgument1) {
        this.integerState0837 = integerArgument1;
    }

    static {
        integerState0836 = 480;
        stringState0582 = "Unpacking graphics";
        stringState0583 = "Lost";
    }
}
