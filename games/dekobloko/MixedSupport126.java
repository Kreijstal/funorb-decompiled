/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport126 {
    static String stringState0549;
    static String stringState0550;
    static int[] integerArrayState0210;
    static String stringState0551;
    static int integerState0792;
    static String stringState0552;

    final static int computeInteger1627(int integerArgument1, byte byteArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        int stackIntegerLocal9 = 0;
        RuntimeException caughtExceptionLocal10 = null;
        RuntimeException runtimeExceptionLocal11 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 0;
          integerLocal2 = MixedSupport036.integerState0221;
          while (UiComponentPart028.stringArrayState0039.length > integerLocal1) {
            integerLocal3 = MixedSupport066.integerArrayState0119[integerLocal1];
            if (integerLocal3 >= 0) {
              integerLocal4 = NodeHashTable.computeInteger1504(false, UiComponentPart028.stringArrayState0039[integerLocal1], true);
              integerLocal5 = BufferedSocket.integerState0661 - (integerLocal4 >> 1);
              integerLocal2 = integerLocal2 + BufferedSocket.integerState0665;
              if (MixedSupport049.computeBoolean0586(17, integerArgument3, integerArgument1, integerLocal4 + (NetworkSupport006.integerState0499 << 1), integerLocal2, (UiComponentPart022.integerState0575 << 1) + MixedSupport015.integerState0100, integerLocal5 - NetworkSupport006.integerState0499)) {
                stackIntegerLocal7 = integerLocal3;
                return stackIntegerLocal7;
              }
              integerLocal2 = integerLocal2 + (BufferedSocket.integerState0665 + ((UiComponentPart022.integerState0575 << 1) + MixedSupport015.integerState0100));
            } else {
              integerLocal2 = integerLocal2 + RenderingSupport007.integerState0362;
            }
            integerLocal1++;
          }
          if (byteArgument2 == -81) {
            stackIntegerLocal9 = -1;
            return stackIntegerLocal9;
          }
          stackIntegerLocal8 = -50;
          return stackIntegerLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal10 = caughtParameterLocal12;
          runtimeExceptionLocal11 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal11), "ub.C(" + integerArgument1 + ',' + byteArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final static void performAction1626(byte byteArgument1) {
        if (GameDomainSupport004.booleanState0087) {
          SoftwareRaster.darkenRectangleHalf(SoftwareRaster.integerState0282, SoftwareRaster.integerState0280, SoftwareRaster.integerState0281 - SoftwareRaster.integerState0282, SoftwareRaster.integerState0283 - SoftwareRaster.integerState0280);
          MixedSupport059.sceneWidgetState0055.performAction1767(1141039778, false);
          if (byteArgument1 != 54) {
            MixedSupport126.computeInteger1627(-56, (byte) 45, 35);
            return;
          }
          return;
        }
        if (byteArgument1 == 54) {
          return;
        }
        MixedSupport126.computeInteger1627(-56, (byte) 45, 35);
    }

    final static MixedSupport113 computeMixedSupport1131628(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        MixedSupport113 mixedSupport113Local1 = new MixedSupport113();
        if (integerArgument4 > 95) {
          mixedSupport113Local1.integerArrayState0202 = new int[integerArgument1];
          mixedSupport113Local1.integerState0731 = integerArgument3;
          UiComponentPart010.nodeDequeState0008.addFirst(mixedSupport113Local1, 2777);
          ReturnedShapeCache.performAction1177(-102, integerArgument2, mixedSupport113Local1);
          return mixedSupport113Local1;
        }
        stringState0549 = (String) null;
        mixedSupport113Local1.integerArrayState0202 = new int[integerArgument1];
        mixedSupport113Local1.integerState0731 = integerArgument3;
        UiComponentPart010.nodeDequeState0008.addFirst(mixedSupport113Local1, 2777);
        ReturnedShapeCache.performAction1177(-102, integerArgument2, mixedSupport113Local1);
        return mixedSupport113Local1;
    }

    public static void clearStaticReferences(byte byteArgument1) {
        if (byteArgument1 <= -17) {
          stringState0549 = null;
          stringState0550 = null;
          stringState0552 = null;
          integerArrayState0210 = null;
          stringState0551 = null;
          return;
        }
        stringState0550 = (String) null;
        stringState0549 = null;
        stringState0550 = null;
        stringState0552 = null;
        integerArrayState0210 = null;
        stringState0551 = null;
    }

    static {
        stringState0549 = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        stringState0550 = "Player";
        integerArrayState0210 = new int[36];
        integerState0792 = 0;
        stringState0551 = "Ready...";
    }
}
