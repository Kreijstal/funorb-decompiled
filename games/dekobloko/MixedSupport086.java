/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport086 {
    static int integerState0514;
    static int[] integerArrayState0157;
    static MixedSupport091 mixedSupport091State0004;
    static int[] integerArrayState0158;
    static String stringState0351;

    public static void performAction1202(boolean booleanArgument1) {
        integerArrayState0158 = null;
        mixedSupport091State0004 = null;
        stringState0351 = null;
        integerArrayState0157 = null;
        if (booleanArgument1) {
          stringState0351 = (String) null;
        }
    }

    abstract byte[] computeByteArray0605(int integerArgument1);

    final static void performAction1201(int integerArgument1, int integerArgument2, byte byteArgument3, MixedSupport015 mixedSupport015Argument4, int integerArgument5, MixedSupport015 mixedSupport015Argument6) {
        try {
          if (byteArgument3 >= 0) {
            MixedSupport086.performAction1200((byte) 1);
          }
          MixedSupport080.integerState0433 = integerArgument1;
          AudioSupport002.integerState0344 = integerArgument2;
          PlatformSupport006.mixedSupport015State0004 = mixedSupport015Argument6;
          ResourceSupport002.integerState0050 = integerArgument5;
          MixedSupport047.mixedSupport015State0002 = mixedSupport015Argument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "mk.C(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ',' + (mixedSupport015Argument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + (mixedSupport015Argument6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1200(byte byteArgument1) {
        MixedSupport151 mixedSupport151Local1 = null;
        if (byteArgument1 != -5) {
          MixedSupport015 mixedSupport015Local2 = (MixedSupport015) null;
          MixedSupport086.performAction1201(-94, -9, (byte) -115, (MixedSupport015) null, -10, (MixedSupport015) null);
          mixedSupport151Local1 = (MixedSupport151) (MixedSupport018.nodeDequeState0005.computeHashNode1973(byteArgument1 ^ 113));
          if (mixedSupport151Local1 == null) {
            throw new IllegalStateException();
          }
          SoftwareRaster.performAction0724(mixedSupport151Local1.integerArrayState0258, mixedSupport151Local1.integerState0926, mixedSupport151Local1.integerState0924);
          SoftwareRaster.performAction0728(mixedSupport151Local1.integerState0922, mixedSupport151Local1.integerState0921, mixedSupport151Local1.integerState0925, mixedSupport151Local1.integerState0923);
          mixedSupport151Local1.integerArrayState0258 = null;
          MixedSupport123.nodeDequeState0032.performAction1963(mixedSupport151Local1, byteArgument1 ^ -2782);
          return;
        }
        MixedSupport151 mixedSupport151Local3 = (MixedSupport151) (MixedSupport018.nodeDequeState0005.computeHashNode1973(byteArgument1 ^ 113));
        if (mixedSupport151Local3 == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.performAction0724(mixedSupport151Local3.integerArrayState0258, mixedSupport151Local3.integerState0926, mixedSupport151Local3.integerState0924);
        SoftwareRaster.performAction0728(mixedSupport151Local3.integerState0922, mixedSupport151Local3.integerState0921, mixedSupport151Local3.integerState0925, mixedSupport151Local3.integerState0923);
        mixedSupport151Local3.integerArrayState0258 = null;
        MixedSupport123.nodeDequeState0032.performAction1963(mixedSupport151Local3, byteArgument1 ^ -2782);
    }

    abstract void performAction0607(byte[] byteArrayArgument1, boolean booleanArgument2);

    static {
        stringState0351 = "Match by...";
        integerArrayState0158 = new int[256];
    }
}
