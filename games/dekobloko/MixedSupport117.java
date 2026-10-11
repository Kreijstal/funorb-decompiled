/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport117 extends HashNode {
    int integerState0723;
    static String stringState0486;
    int integerState0724;
    RgbSprite rgbSpriteState0053;
    int integerState0725;
    static int integerState0726;
    static String stringState0487;
    String stringState0488;
    int integerState0727;
    static RawSound rawSoundState0020;
    int integerState0728;
    int integerState0729;
    static boolean booleanState0166;
    boolean booleanState0167;
    static NodeDeque nodeDequeState0030;
    static String stringState0489;
    int integerState0730;

    public static void performAction1673(byte byteArgument1) {
        stringState0486 = null;
        nodeDequeState0030 = null;
        stringState0487 = null;
        rawSoundState0020 = null;
        stringState0489 = null;
        if (byteArgument1 >= -65) {
          MixedSupport117.performAction1673((byte) -48);
        }
    }

    final static void performAction1672(String stringArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport066.integerState0341 = MixedSupport066.integerState0341 + 1;
          if (integerState0726 == -1 &&
            MixedSupport131.integerState0790 == -1) {
            MixedSupport131.integerState0790 = MixedSupport106.integerState0590;
            integerState0726 = HashNode.integerState0069;
          }
          boolean frameRemainderLocal9 = true;
          if (stringArgument1 != null) {
            frameRemainderLocal9 = !(stringArgument1.equals(MixedSupport070.stringState0295));
          } else {
            frameRemainderLocal9 = (null == MixedSupport070.stringState0295);
          }
          if (frameRemainderLocal9) {
            if (!MixedSupport152.booleanState0222) {
              if (MixedSupport066.integerState0341 >= MixedSupport093.integerState0545) {
                stackIntegerLocal1 = (MixedSupport093.integerState0545 + UiComponentPart013.integerState0274 > MixedSupport066.integerState0341) ? 1 : 0;
              } else {
                stackIntegerLocal1 = 0;
              }
            } else {
              stackIntegerLocal1 = 0;
            }
            integerLocal6 = stackIntegerLocal1;
            if (stringArgument1 == null) {
              MixedSupport066.integerState0341 = 0;
            } else {
              if (MixedSupport152.booleanState0222) {
                MixedSupport066.integerState0341 = MixedSupport093.integerState0545;
              } else {
                if (integerLocal6 == 0) {
                  MixedSupport066.integerState0341 = 0;
                } else {
                  MixedSupport066.integerState0341 = MixedSupport093.integerState0545;
                }
              }
            }
            if (stringArgument1 != null) {
              MixedSupport152.booleanState0222 = false;
            } else {
              if (integerLocal6 != 0) {
                MixedSupport152.booleanState0222 = true;
              }
            }
            ClientException.integerState0142 = MixedSupport131.integerState0790;
            UiComponentPart022.integerState0573 = integerState0726;
          }
          MixedSupport070.stringState0295 = stringArgument1;
          if (!MixedSupport152.booleanState0222 &&
            MixedSupport093.integerState0545 > MixedSupport066.integerState0341 &&
            MixedSupport106.booleanState0135) {
            ClientException.integerState0142 = MixedSupport131.integerState0790;
            UiComponentPart022.integerState0573 = integerState0726;
            MixedSupport066.integerState0341 = 0;
          }
          integerState0726 = integerArgument2;
          MixedSupport131.integerState0790 = -1;
          if (MixedSupport152.booleanState0222) {
            if (SceneWidgetPart013.integerState0839 != MixedSupport066.integerState0341) {
              return;
            }
            MixedSupport066.integerState0341 = 0;
            MixedSupport152.booleanState0222 = false;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal5 = caughtParameterLocal10;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("sa.B(");
          if (stringArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(')').toString());
        }
    }

    MixedSupport117(boolean booleanArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int[] integerArrayArgument5, int integerArgument6, int integerArgument7, String[] stringArrayArgument8) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          this.integerState0730 = integerArgument4;
          this.integerState0728 = integerArgument2;
          this.integerState0729 = integerArgument7;
          stackBooleanLocal2 = (booleanArgument1);
          this.booleanState0167 = stackBooleanLocal2;
          this.integerState0725 = integerArgument3;
          this.stringState0488 = PlatformSupport004.computeString0701(stringArrayArgument8.length, 0, (CharSequence[]) ((Object) stringArrayArgument8), (byte) 74);
          if (integerArrayArgument5 == null) {
            this.integerState0724 = integerArgument6;
            return;
          }
          if (integerArgument6 >= integerArrayArgument5.length) {
            integerArgument6 = integerArrayArgument5.length - 1;
          }
          this.integerState0724 = integerArrayArgument5[integerArgument6];
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("sa.<init>(").append(booleanArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (integerArrayArgument5 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (stringArrayArgument8 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    static {
        stringState0486 = "OVER <%0>";
        integerState0726 = -1;
        stringState0487 = "members-only content";
        nodeDequeState0030 = new NodeDeque();
    }
}
