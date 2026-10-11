/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport039 {
    static String stringState0176;
    static int[] integerArrayState0047;
    static int integerState0232;
    static MixedSupport057 mixedSupport057State0003;
    static int integerState0233;
    static SceneWidget sceneWidgetState0029;
    static RawSound rawSoundState0007;
    static SceneWidget sceneWidgetState0030;

    final static void performAction0583(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int[] integerArrayLocal13 = null;
        int integerLocal14 = 0;
        RuntimeException caughtExceptionLocal15 = null;
        RuntimeException runtimeExceptionLocal16 = null;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!booleanArgument3) {
            return;
          }
          integerLocal2 = 320;
          integerLocal3 = 490;
          for (integerLocal1 = 0; integerLocal1 < MixedSupport112.integerArrayState0199.length; integerLocal1++) {
            integerLocal4 = MixedSupport112.integerArrayState0199[integerLocal1] >> 8 & 255;
            integerLocal5 = 255 & MixedSupport112.integerArrayState0199[integerLocal1] >> 24;
            integerLocal6 = (2048 * integerLocal4 >> 8) + (GameDomainSupport001.integerState0053 * (1 + integerLocal5) >> 6);
            integerLocal7 = MixedSupport112.integerArrayState0199[integerLocal1] >> 16 & 255;
            integerLocal8 = 255 & MixedSupport112.integerArrayState0199[integerLocal1];
            integerLocal9 = RenderingSupport008.computeInteger0963(2047, integerLocal6) >> 6;
            integerLocal10 = MixedSupport051.computeInteger0666(integerLocal6, (byte) -122) >> 6;
            integerLocal11 = RenderingSupport008.computeInteger0963(2047, integerLocal8 + integerLocal6) >> 6;
            integerLocal12 = MixedSupport051.computeInteger0666(integerLocal6 + integerLocal8, (byte) -122) >> 6;
            integerArrayLocal13 = new int[]{integerLocal2 + integerArgument4, integerArgument1 + integerLocal3, integerLocal9 + integerArgument4, integerArgument1 + integerLocal10, integerArgument4 + integerLocal11, integerLocal12 + integerArgument1};
            if (256 == integerArgument2) {
              MixedSupport097.performAction1364(integerArrayLocal13, 16777215, integerLocal7);
            } else {
              MixedSupport097.performAction1364(integerArrayLocal13, 16777215, integerLocal7 * 256 >> 9);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal15 = caughtParameterLocal17;
          runtimeExceptionLocal16 = caughtExceptionLocal15;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal16), "fh.F(" + integerArgument1 + ',' + integerArgument2 + ',' + booleanArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final static void performAction0584(byte byteArgument1) {
        SceneWidgetPart010.performAction1669((byte) -115);
        if (byteArgument1 > -122) {
          MixedSupport039.performAction0582(-67);
        }
    }

    final static void performAction0581(byte byteArgument1, MixedSupport020 mixedSupport020Argument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          int integerLocal2 = -58 / ((byteArgument1 - 59) / 33);
          cipherPacketBufferLocal1.performAction1861(integerArgument3, -4);
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport020Argument2.integerState0115);
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport020Argument2.integerState0116);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fh.D(" + byteArgument1 + ',' + (mixedSupport020Argument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    final static boolean computeBoolean0580(byte byteArgument1) {
        int integerLocal1 = 114 % ((byteArgument1 - 70) / 46);
        if (NetworkSupport012.integerState0759 == -1) {
          if (!MixedSupport103.computeBoolean1398(25973, 1)) {
            return false;
          }
          NetworkSupport012.integerState0759 = UiComponentPart006.cipherPacketBufferState0001.computeInteger2085((byte) -64);
          UiComponentPart006.cipherPacketBufferState0001.position = 0;
        }
        if (NetworkSupport012.integerState0759 == -2) {
          if (!MixedSupport103.computeBoolean1398(25973, 2)) {
            return false;
          }
          NetworkSupport012.integerState0759 = UiComponentPart006.cipherPacketBufferState0001.computeInteger2089(3);
          UiComponentPart006.cipherPacketBufferState0001.position = 0;
        }
        return MixedSupport103.computeBoolean1398(25973, NetworkSupport012.integerState0759);
    }

    public static void performAction0585(int integerArgument1) {
        rawSoundState0007 = null;
        sceneWidgetState0030 = null;
        mixedSupport057State0003 = null;
        stringState0176 = null;
        integerArrayState0047 = null;
        if (integerArgument1 != 0) {
          return;
        }
        sceneWidgetState0029 = null;
    }

    final static void performAction0582(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException caughtExceptionLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!AnimatedTileRegion.computeBoolean1888(-22802)) {
            if (MixedSupport020.platformSupport006State0001 != null &&
              MixedSupport020.platformSupport006State0001.booleanState0156) {
              MixedSupport123.performAction1754(false);
              MixedSupport131.uiComponentPart016State0003.performAction0945((byte) -105, new UiComponentPart014(MixedSupport131.uiComponentPart016State0003, MixedSupport075.mixedSupport084State0002));
            }
            return;
          }
          integerLocal1 = -26 % ((integerArgument1 - 37) / 58);
          MixedSupport131.uiComponentPart016State0003.computeBoolean0236(SceneWidgetPart006.integerState0343, true, DualNodeDeque.integerState0016, 29166);
          MixedSupport131.uiComponentPart016State0003.performAction0951(0);
          while (DualNodeDeque.computeBoolean0028(50)) {
            MixedSupport131.uiComponentPart016State0003.computeBoolean0228(MixedSupport153.integerState0931, ArchiveRequestManager.characterState0002, (byte) 121);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal5) {
          caughtExceptionLocal3 = caughtParameterLocal5;
          runtimeExceptionLocal4 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "fh.E(" + integerArgument1 + ')');
        }
    }

    static {
        stringState0176 = "<%0> WINS!";
        mixedSupport057State0003 = new MixedSupport057();
    }
}
