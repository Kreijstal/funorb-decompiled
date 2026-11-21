/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Sprite {
    static String[][] stringArrayArrayState0005;
    int integerState0422;
    int integerState0423;
    static volatile int integerState0424;
    int integerState0425;
    int integerState0426;
    int integerState0427;
    static long longState0027;
    int integerState0428;
    static ResourceArchive resourceArchiveState0010;

    abstract void performAction1024(int integerArgument1, int integerArgument2);

    final static ReturnedShape computeReturnedShape1027(int integerArgument1, int integerArgument2, int integerArgument3) {
        ReturnedShape returnedShapeLocal1 = new ReturnedShape(integerArgument1);
        returnedShapeLocal1.packedCells = new byte[2];
        returnedShapeLocal1.width = 2;
        returnedShapeLocal1.height = 1;
        returnedShapeLocal1.packedCells[integerArgument2] = (byte)((MixedSupport079.computeInteger1022(8, integerArgument3) != 0 ? 24 : 16) + MixedSupport079.computeInteger1022(integerArgument3, 7));
        integerArgument3 = integerArgument3 >> 4;
        returnedShapeLocal1.packedCells[1] = (byte)(MixedSupport079.computeInteger1022(7, integerArgument3) + (MixedSupport079.computeInteger1022(8, integerArgument3) == 0 ? 16 : 24));
        return returnedShapeLocal1;
    }

    final static void performAction1026(int integerArgument1, boolean booleanArgument2) {
        if (!booleanArgument2) {
          return;
        }
        UiComponentPart010.stringState0150 = InputAdapter003.stringArrayState0042[integerArgument1];
        MixedSupport037.stringState0174 = MixedSupport087.stringArrayState0024[integerArgument1];
        MixedSupport028.stringState0137 = GameSession.stringArrayState0033[integerArgument1];
    }

    abstract void performAction1025(int integerArgument1, int integerArgument2, int integerArgument3);

    public static void performAction1023(int integerArgument1) {
        resourceArchiveState0010 = null;
        stringArrayArrayState0005 = (String[][]) null;
        if (integerArgument1 != -27983) {
          Sprite.performAction1026(40, false);
        }
    }

    static {
        integerState0424 = -1;
    }
}
