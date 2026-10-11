/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport138 {
    static String stringState0567;
    static int integerState0819;
    static MixedSupport111 mixedSupport111State0012;
    static long longState0051;
    static RawSound rawSoundState0021;
    static String stringState0568;
    static String stringState0569;
    static int integerState0820;
    static int[] integerArrayState0234;

    final static void performAction1893(byte byteArgument1) {
        String[][] cachedStringArrayArrayLocal1 = null;
        int[][] cachedIntegerArrayArrayLocal2 = null;
        RuntimeException caughtExceptionLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        MixedSupport020 mixedSupport020Local6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        String[][] stringArrayArrayLocal10 = null;
        int[][] integerArrayArrayLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        CipherPacketBuffer cipherPacketBufferLocal18 = null;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          cipherPacketBufferLocal18 = UiComponentPart006.cipherPacketBufferState0001;
          integerLocal5 = cipherPacketBufferLocal18.computeInteger2085((byte) -110);
          mixedSupport020Local6 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1970((byte) -54));
          while (mixedSupport020Local6 != null) {
            if (integerLocal5 != mixedSupport020Local6.integerState0115) {
              mixedSupport020Local6 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1974(true));
              continue;
            }
            break;
          }
          if (mixedSupport020Local6 == null) {
            NodeHashTable.performAction1703(122);
            return;
          }
          integerLocal7 = cipherPacketBufferLocal18.computeInteger2085((byte) -125);
          if (integerLocal7 != 0) {
            integerLocal8 = mixedSupport020Local6.integerState0116;
            UiComponentPart030.stringArrayState0046[0] = MixedSupport094.stringState0372;
            for (integerLocal9 = 1; integerLocal7 > integerLocal9; integerLocal9++) {
              UiComponentPart030.stringArrayState0046[integerLocal9] = cipherPacketBufferLocal18.computeString2082((byte) -38);
            }
            ResourceSupport002.performAction0094(2147483647, integerLocal7, integerLocal8);
            for (integerLocal19 = 0; integerLocal19 < integerLocal7; integerLocal19++) {
              UiComponentPart024.performAction1453(63, cipherPacketBufferLocal18);
              if (integerLocal19 == 0) {
                mixedSupport020Local6.integerState0119 = MixedSupport096.integerState0549;
                mixedSupport020Local6.integerState0120 = UiComponentPart008.integerState0144;
                mixedSupport020Local6.integerState0118 = SceneWidgetPart012.integerState0783;
                mixedSupport020Local6.integerState0117 = MixedSupport149.integerState0877;
                CodecSupport004.performAction1633(integerLocal19, UiComponentPart008.integerState0144, -1, MixedSupport149.integerState0877, SceneWidgetPart012.integerState0783, MixedSupport096.integerState0549);
              } else {
                CodecSupport004.performAction1633(integerLocal19, UiComponentPart008.integerState0144, -1, MixedSupport149.integerState0877, SceneWidgetPart012.integerState0783, MixedSupport096.integerState0549);
              }
            }
            MixedSupport102.performAction1393(integerLocal8, (byte) 6);
            cachedStringArrayArrayLocal1 = new String[2][integerLocal8];
            mixedSupport020Local6.stringArrayArrayState0001 = cachedStringArrayArrayLocal1;
            stringArrayArrayLocal10 = cachedStringArrayArrayLocal1;
            cachedIntegerArrayArrayLocal2 = new int[2][integerLocal8 * 4];
            mixedSupport020Local6.integerArrayArrayState0005 = cachedIntegerArrayArrayLocal2;
            integerArrayArrayLocal11 = cachedIntegerArrayArrayLocal2;
            integerLocal12 = UiComponentPart021.integerState0556;
            integerLocal13 = 0;
            integerLocal14 = 0;
            while (integerLocal12 > integerLocal13) {
              integerLocal15 = MixedSupport017.integerArrayState0022[integerLocal13];
              stringArrayArrayLocal10[0][integerLocal14] = UiComponentPart030.stringArrayState0046[integerLocal15];
              integerArrayArrayLocal11[0][integerLocal14 * 4] = ResourceSupport001.integerArrayState0012[integerLocal15];
              integerArrayArrayLocal11[0][1 + integerLocal14 * 4] = MixedSupport094.integerArrayState0173[integerLocal15];
              integerArrayArrayLocal11[0][2 + 4 * integerLocal14] = MixedSupport084.integerArrayState0150[integerLocal15];
              integerArrayArrayLocal11[0][3 + integerLocal14 * 4] = MixedSupport086.integerArrayState0157[integerLocal15];
              if (MixedSupport070.computeBoolean0943(UiComponentPart030.stringArrayState0046[integerLocal15], true) &&
                MixedSupport094.integerArrayState0173[integerLocal15] + (MixedSupport084.integerArrayState0150[integerLocal15] + MixedSupport086.integerArrayState0157[integerLocal15]) == 0) {
                stringArrayArrayLocal10[0][integerLocal14] = null;
                integerLocal14--;
              }
              integerLocal13++;
              integerLocal14++;
            }
            integerLocal20 = 0;
            integerLocal17 = 0;
            integerLocal21 = integerLocal17;
            while (integerLocal12 > integerLocal20) {
              integerLocal22 = MixedSupport017.integerArrayState0022[integerLocal20 + integerLocal8];
              stringArrayArrayLocal10[1][integerLocal17] = UiComponentPart030.stringArrayState0046[integerLocal22];
              integerArrayArrayLocal11[1][integerLocal17 * 4] = ResourceSupport001.integerArrayState0012[integerLocal22];
              integerArrayArrayLocal11[1][1 + 4 * integerLocal17] = MixedSupport094.integerArrayState0173[integerLocal22];
              integerArrayArrayLocal11[1][4 * integerLocal17 + 2] = MixedSupport084.integerArrayState0150[integerLocal22];
              integerArrayArrayLocal11[1][4 * integerLocal17 + 3] = MixedSupport086.integerArrayState0157[integerLocal22];
              if (MixedSupport070.computeBoolean0943(UiComponentPart030.stringArrayState0046[integerLocal22], true) &&
                MixedSupport084.integerArrayState0150[integerLocal22] + MixedSupport094.integerArrayState0173[integerLocal22] + MixedSupport086.integerArrayState0157[integerLocal22] == 0) {
                stringArrayArrayLocal10[1][integerLocal17] = null;
                integerLocal17--;
              }
              integerLocal17++;
              integerLocal20++;
            }
          }
          if (byteArgument1 <= 107) {
            MixedSupport138.computeInteger1895(-19, 9, -103);
          }
          mixedSupport020Local6.booleanState0022 = true;
          mixedSupport020Local6.performAction0161((byte) 104);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal3 = caughtParameterLocal23;
          runtimeExceptionLocal4 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "ul.A(" + byteArgument1 + ')');
        }
    }

    public static void performAction1896(byte byteArgument1) {
        stringState0569 = null;
        stringState0567 = null;
        stringState0568 = null;
        if (byteArgument1 != -75) {
          integerState0819 = -77;
        }
        mixedSupport111State0012 = null;
        integerArrayState0234 = null;
        rawSoundState0021 = null;
    }

    final static int computeInteger1895(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument3 != -28705) {
          MixedSupport138.performAction1894(55, 34);
        }
        if (integerArgument2 < 2) {
          if (5 > integerArgument1) {
            return 0;
          }
          return 1;
        }
        return 2;
    }

    final static void performAction1894(int integerArgument1, int integerArgument2) {
        if (integerArgument2 != 4) {
          mixedSupport111State0012 = (MixedSupport111) null;
        }
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument1, -4);
        cipherPacketBufferLocal1.performAction2073(true, 1);
        cipherPacketBufferLocal1.performAction2073(true, 1);
    }

    static {
        stringState0567 = "Challenge Highscores";
        mixedSupport111State0012 = new MixedSupport111(6, 0, 4, 2);
        longState0051 = 20000000L;
        stringState0568 = "Respect";
        stringState0569 = "Clan";
        integerArrayState0234 = new int[5];
        integerState0820 = 3;
    }
}
