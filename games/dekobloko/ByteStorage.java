/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static int integerState0514;
    static int[] integerArrayState0157;
    static BufferedFile bufferedFileState0004;
    static int[] integerArrayState0158;
    static String stringState0351;

    public static void clearStaticReferences(boolean booleanArgument1) {
        integerArrayState0158 = null;
        bufferedFileState0004 = null;
        stringState0351 = null;
        integerArrayState0157 = null;
        if (booleanArgument1) {
          stringState0351 = (String) null;
        }
    }

    abstract byte[] getBytes(int integerArgument1);

    final static void performAction1061(int integerArgument1, int integerArgument2, byte byteArgument3, MixedSupport015 mixedSupport015Argument4, int integerArgument5, MixedSupport015 mixedSupport015Argument6) {
        try {
          if (byteArgument3 >= 0) {
            ByteStorage.performAction1060((byte) 1);
          }
          MixedSupport076.integerState0433 = integerArgument1;
          PcmResampler.integerState0344 = integerArgument2;
          FullscreenCanvas.mixedSupport015State0004 = mixedSupport015Argument6;
          ResourceSupport002.integerState0050 = integerArgument5;
          MixedSupport047.mixedSupport015State0002 = mixedSupport015Argument4;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "mk.C(" + integerArgument1 + ',' + integerArgument2 + ',' + byteArgument3 + ',' + (mixedSupport015Argument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + (mixedSupport015Argument6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1060(byte byteArgument1) {
        MixedSupport144 mixedSupport144Local1 = null;
        if (byteArgument1 != -5) {
          MixedSupport015 mixedSupport015Local2 = (MixedSupport015) null;
          ByteStorage.performAction1061(-94, -9, (byte) -115, (MixedSupport015) null, -10, (MixedSupport015) null);
          mixedSupport144Local1 = (MixedSupport144) (MixedSupport018.nodeDequeState0005.computeHashNode1744(byteArgument1 ^ 113));
          if (mixedSupport144Local1 == null) {
            throw new IllegalStateException();
          }
          SoftwareRaster.performAction0645(mixedSupport144Local1.integerArrayState0258, mixedSupport144Local1.integerState0926, mixedSupport144Local1.integerState0924);
          SoftwareRaster.performAction0649(mixedSupport144Local1.integerState0922, mixedSupport144Local1.integerState0921, mixedSupport144Local1.integerState0925, mixedSupport144Local1.integerState0923);
          mixedSupport144Local1.integerArrayState0258 = null;
          MixedSupport118.nodeDequeState0032.performAction1735(mixedSupport144Local1, byteArgument1 ^ -2782);
          return;
        }
        MixedSupport144 mixedSupport144Local3 = (MixedSupport144) (MixedSupport018.nodeDequeState0005.computeHashNode1744(byteArgument1 ^ 113));
        if (mixedSupport144Local3 == null) {
          throw new IllegalStateException();
        }
        SoftwareRaster.performAction0645(mixedSupport144Local3.integerArrayState0258, mixedSupport144Local3.integerState0926, mixedSupport144Local3.integerState0924);
        SoftwareRaster.performAction0649(mixedSupport144Local3.integerState0922, mixedSupport144Local3.integerState0921, mixedSupport144Local3.integerState0925, mixedSupport144Local3.integerState0923);
        mixedSupport144Local3.integerArrayState0258 = null;
        MixedSupport118.nodeDequeState0032.performAction1735(mixedSupport144Local3, byteArgument1 ^ -2782);
    }

    abstract void setBytes(byte[] byteArrayArgument1, boolean booleanArgument2);

    static {
        stringState0351 = "Match by...";
        integerArrayState0158 = new int[256];
    }
}
