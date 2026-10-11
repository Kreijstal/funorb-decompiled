/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport118 extends HashNode {
    static String stringState0490;
    int integerState0731;
    static MusicTrack[][] musicTrackArrayArrayState0001;
    static int[] integerArrayState0201;
    boolean booleanState0168;
    int[] integerArrayState0202;
    static String stringState0491;
    static String stringState0492;

    public static void performAction1674(int integerArgument1) {
        musicTrackArrayArrayState0001 = (MusicTrack[][]) null;
        stringState0492 = null;
        stringState0490 = null;
        integerArrayState0201 = null;
        stringState0491 = null;
        if (integerArgument1 != 13820388) {
          musicTrackArrayArrayState0001 = (MusicTrack[][]) null;
        }
    }

    final static void performAction1676(byte byteArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        SceneWidgetPart012 sceneWidgetPart012Local2 = null;
        SceneWidgetPart013 sceneWidgetPart013Local3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        String stringLocal6 = null;
        SceneWidgetPart012 sceneWidgetPart012Local7;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          sceneWidgetPart012Local2 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.computeHashNode1970((byte) -53));
          while (sceneWidgetPart012Local2 != null) {
            if (sceneWidgetPart012Local2.integerState0785 > 0) {
              sceneWidgetPart012Local2.integerState0785 = sceneWidgetPart012Local2.integerState0785 - 1;
              if (sceneWidgetPart012Local2.integerState0785 == 0) {
                sceneWidgetPart012Local2.integerState0786 = 0;
                if (sceneWidgetPart012Local2.computeBoolean1826((byte) 111)) {
                  sceneWidgetPart012Local2.performAction0161((byte) 112);
                }
              }
            }
            sceneWidgetPart012Local2 = (SceneWidgetPart012) (MixedSupport057.nodeDequeState0010.computeHashNode1974(true));
          }
          sceneWidgetPart013Local3 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.computeHashNode1970((byte) 26));
          while (sceneWidgetPart013Local3 != null) {
            if (sceneWidgetPart013Local3.integerState0846 > 0) {
              sceneWidgetPart013Local3.integerState0846 = sceneWidgetPart013Local3.integerState0846 - 1;
              if (sceneWidgetPart013Local3.integerState0846 == 0) {
                sceneWidgetPart013Local3.integerState0844 = 0;
                if (sceneWidgetPart013Local3.computeBoolean1940((byte) 115)) {
                  sceneWidgetPart013Local3.performAction0161((byte) 113);
                }
              }
            }
            sceneWidgetPart013Local3 = (SceneWidgetPart013) (MixedSupport051.nodeDequeState0009.computeHashNode1974(true));
          }
          sceneWidgetPart012Local7 = (SceneWidgetPart012) (MixedSupport096.nodeDequeState0021.computeHashNode1970((byte) 50));
          while (sceneWidgetPart012Local7 != null) {
            if (0 < sceneWidgetPart012Local7.integerState0785) {
              sceneWidgetPart012Local7.integerState0785 = sceneWidgetPart012Local7.integerState0785 - 1;
              if (sceneWidgetPart012Local7.integerState0785 == 0) {
                sceneWidgetPart012Local7.integerState0786 = 0;
                if (sceneWidgetPart012Local7.computeBoolean1826((byte) 59)) {
                  sceneWidgetPart012Local7.performAction0161((byte) 101);
                }
              }
            }
            sceneWidgetPart012Local7 = (SceneWidgetPart012) (MixedSupport096.nodeDequeState0021.computeHashNode1974(true));
          }
          if (byteArgument1 == 123) {
            return;
          }
          stringLocal6 = (String) null;
          MixedSupport118.computeMixedSupport0431675(-113L, (String) null, false, (String) null, 29);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal1 = caughtParameterLocal8;
          runtimeExceptionLocal4 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "sb.B(" + byteArgument1 + ')');
        }
    }

    final static MixedSupport043 computeMixedSupport0431675(long longArgument1, String stringArgument2, boolean booleanArgument3, String stringArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        MixedSupport108 stackMixedSupport108Local2 = null;
        MixedSupport095 stackMixedSupport095Local3 = null;
        GameDomainSupport006 stackGameDomainSupport006Local4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if ((long)integerArgument5 == longArgument1 &&
            stringArgument4 != null) {
            stackMixedSupport095Local3 = new MixedSupport095(stringArgument4, stringArgument2);
            return (MixedSupport043) ((Object) stackMixedSupport095Local3);
          }
          if (!booleanArgument3) {
            stackGameDomainSupport006Local4 = new GameDomainSupport006(longArgument1, stringArgument2);
            return (MixedSupport043) ((Object) stackGameDomainSupport006Local4);
          }
          stackMixedSupport108Local2 = new MixedSupport108(longArgument1, stringArgument2);
          return (MixedSupport043) ((Object) stackMixedSupport108Local2);
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("sb.C(").append(longArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument5).append(')').toString());
        }
    }

    MixedSupport118() {
    }

    static {
        stringState0490 = "Secret achievement";
        integerArrayState0201 = new int[]{10076391, 4944180, 14961707, 16178128, 13820388};
        musicTrackArrayArrayState0001 = new MusicTrack[8][4];
        stringState0491 = "Players: <%0>/<%1>";
        stringState0492 = "Show players in <%0>'s game";
    }
}
