/*
 * Decompiled by CFR-JS 0.4.0.
 */
class GameDomainSupport006 extends MixedSupport043 {
    static String stringState0624;
    static String stringState0625;
    static String stringState0626;
    static String stringState0627;
    static ResourceArchive resourceArchiveState0027;
    private String stringState0628;
    static boolean booleanState0227;
    private long longState0055;
    static String stringState0629;
    static RgbSprite rgbSpriteState0075;
    static String stringState0630;

    final static void performAction2056(byte byteArgument1, SceneWidgetPart012 sceneWidgetPart012Argument2) {
        SceneWidgetPart012 sceneWidgetPart012Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          sceneWidgetPart012Argument2.performAction0161((byte) 111);
          sceneWidgetPart012Local1 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.computeHashNode1970((byte) -61));
          while (sceneWidgetPart012Local1 != null) {
            if (sceneWidgetPart012Local1.computeBoolean1822(-985, sceneWidgetPart012Argument2)) {
              sceneWidgetPart012Local1 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.computeHashNode1974(true));
              continue;
            }
            break;
          }
          if (byteArgument1 <= 3) {
            GameDomainSupport006.performAction2060(31);
          }
          if (sceneWidgetPart012Local1 != null) {
            MixedSupport043.performAction0598(114, sceneWidgetPart012Argument2, sceneWidgetPart012Local1);
            return;
          }
          MixedSupport057.nodeDequeState0010.performAction1963(sceneWidgetPart012Argument2, 2777);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("wk.H(").append(byteArgument1).append(',');
          if (sceneWidgetPart012Argument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static int computeInteger2059(int integerArgument1) {
        if (integerArgument1 != 3) {
          stringState0624 = (String) null;
          return -ResourceSupport001.integerState0021 + MixedSupport035.integerState0219;
        }
        return -ResourceSupport001.integerState0021 + MixedSupport035.integerState0219;
    }

    MixedSupport048 computeMixedSupport0480601(int integerArgument1) {
        if (integerArgument1 != 18) {
          MixedSupport038 mixedSupport038Local1 = (MixedSupport038) null;
          GameDomainSupport006.performAction2058(124, -86, (MixedSupport038) null);
          return MusicTrack.mixedSupport048State0003;
        }
        return MusicTrack.mixedSupport048State0003;
    }

    final static void performAction2058(int integerArgument1, int integerArgument2, MixedSupport038 mixedSupport038Argument3) {
        try {
          if (integerArgument1 != 3) {
            booleanState0227 = false;
          }
          MixedSupport016.nodeDequeState0003.performAction1963(mixedSupport038Argument3, 2777);
          MixedSupport085.performAction1159(true, mixedSupport038Argument3, integerArgument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wk.M(" + integerArgument1 + ',' + integerArgument2 + ',' + (mixedSupport038Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction2057(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = -84 / ((integerArgument1 - 5) / 54);
        integerLocal2 = integerArgument2;
        if (0 == integerLocal2) {
          MixedSupport022.performAction0358(integerArgument3, true);
          return;
        }
        if (integerLocal2 == 1) {
          MixedSupport051.performAction0668(integerArgument3, false);
          return;
        }
        if (integerLocal2 == 2) {
          UiComponentPart003.performAction0177(integerArgument3, 12618);
          return;
        }
        if (3 != integerLocal2) {
          return;
        }
        CipherPacketBuffer.performAction1862(integerArgument3, -2093);
    }

    final void performAction0603(PacketBuffer packetBufferArgument1, byte byteArgument2) {
        packetBufferArgument1.performAction2068(this.longState0055, (byte) 0);
        if (byteArgument2 < 34) {
          return;
        }
        try {
          packetBufferArgument1.performAction2070(this.stringState0628, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wk.D(" + (packetBufferArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    public static void performAction2060(int integerArgument1) {
        stringState0630 = null;
        stringState0627 = null;
        if (integerArgument1 == 7751) {
          resourceArchiveState0027 = null;
          stringState0629 = null;
          stringState0626 = null;
          stringState0624 = null;
          rgbSpriteState0075 = null;
          stringState0625 = null;
          return;
        }
        MixedSupport038 mixedSupport038Local1 = (MixedSupport038) null;
        GameDomainSupport006.performAction2058(12, -125, (MixedSupport038) null);
        resourceArchiveState0027 = null;
        stringState0629 = null;
        stringState0626 = null;
        stringState0624 = null;
        rgbSpriteState0075 = null;
        stringState0625 = null;
    }

    GameDomainSupport006(long longArgument1, String stringArgument2) {
        try {
          this.longState0055 = longArgument1;
          this.stringState0628 = stringArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wk.<init>(" + longArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0627 = "<%0> has entered a game.";
        stringState0625 = "Send private message";
        stringState0630 = "Remove name";
        stringState0624 = "Offensive account name";
        stringState0626 = "Searching for an opponent";
        stringState0629 = "Message lobby";
    }
}
