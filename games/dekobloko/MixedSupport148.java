/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport148 {
    int[] integerArrayState0251;
    int integerState0860;
    int[][] integerArrayArrayState0026;
    byte byteState0005;
    int integerState0861;
    static int[] integerArrayState0252;
    int integerState0862;
    byte[] byteArrayState0034;
    int integerState0863;
    int integerState0864;
    int integerState0865;
    int integerState0866;
    byte[] byteArrayState0035;
    int integerState0867;
    int integerState0868;
    int integerState0869;
    int integerState0870;
    int integerState0871;
    byte[] byteArrayState0036;
    byte[][] byteArrayArrayState0012;
    int[][] integerArrayArrayState0027;
    byte[] byteArrayState0037;
    byte[] byteArrayState0038;
    int integerState0872;
    byte[] byteArrayState0039;
    static int integerState0873;
    int[] integerArrayState0253;
    int integerState0874;
    int[] integerArrayState0254;
    static byte[] byteArrayState0040;
    boolean[] booleanArrayState0012;
    int[] integerArrayState0255;
    int integerState0875;
    int[][] integerArrayArrayState0028;
    boolean[] booleanArrayState0013;

    final static int computeInteger1983(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = integerArgument3 >>> 31;
        if (integerArgument1 == 23841) {
          return (integerArgument3 + integerLocal1) / integerArgument2 - integerLocal1;
        }
        integerState0873 = -119;
        return (integerArgument3 + integerLocal1) / integerArgument2 - integerLocal1;
    }

    public static void performAction1984(boolean booleanArgument1) {
        byteArrayState0040 = null;
        integerArrayState0252 = null;
        if (!booleanArgument1) {
          integerArrayState0252 = (int[]) null;
        }
    }

    MixedSupport148() {
        this.integerArrayState0251 = new int[6];
        this.integerState0863 = 0;
        this.byteArrayArrayState0012 = new byte[6][258];
        this.byteArrayState0038 = new byte[18002];
        this.integerArrayArrayState0026 = new int[6][258];
        this.byteArrayState0039 = new byte[4096];
        this.integerArrayState0253 = new int[257];
        this.byteArrayState0035 = new byte[256];
        this.integerArrayState0254 = new int[16];
        this.integerArrayState0255 = new int[256];
        this.integerState0869 = 0;
        this.booleanArrayState0012 = new boolean[16];
        this.integerArrayArrayState0027 = new int[6][258];
        this.integerArrayArrayState0028 = new int[6][258];
        this.booleanArrayState0013 = new boolean[256];
        this.byteArrayState0036 = new byte[18002];
    }

    static {
        byteArrayState0040 = new byte[]{(byte)2, (byte)5, (byte)5, (byte)5, (byte)3};
    }
}
