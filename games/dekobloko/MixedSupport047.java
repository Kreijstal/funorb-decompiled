/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport047 {
    static boolean booleanState0057;
    static RgbSprite rgbSpriteState0018;
    static MixedSupport048 mixedSupport048State0001;
    static MixedSupport111 mixedSupport111State0002;
    static MixedSupport015 mixedSupport015State0002;
    static IndexedSprite[] indexedSpriteArrayState0003;
    static SceneWidget sceneWidgetState0038;
    static SceneWidgetPart008 sceneWidgetPart008State0003;
    static String stringState0200;
    static String stringState0201;

    final static boolean computeBoolean0637(int integerArgument1, String stringArgument2, String stringArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument1 > -94) {
            MixedSupport047.performAction0636(-99);
          }
          if (InputAdapter005.computeBoolean1531(stringArgument3, 0)) {
            return false;
          }
          if (MixedSupport085.computeBoolean1157(stringArgument3, (byte) -111)) {
            return false;
          }
          if (DekoBlokoClient.computeBoolean0325(92, stringArgument3)) {
            return false;
          }
          if (stringArgument2.length() == 0) {
            return true;
          }
          if (MixedSupport092.computeBoolean1302(false, stringArgument2, stringArgument3)) {
            return false;
          }
          if (MixedSupport062.computeBoolean0825(stringArgument3, stringArgument2, (byte) -117)) {
            return false;
          }
          if (!UiComponentPart013.computeBoolean0691(stringArgument2, (byte) 126, stringArgument3)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("gf.C(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (stringArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static String computeString0638(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4) {
        int integerLocal1 = 0;
        if (integerArgument1 <= -124) {
          integerLocal1 = 0;
          if (booleanArgument4) {
            integerLocal1 += 4;
          }
          if (booleanArgument3) {
            integerLocal1 += 2;
          }
          if (booleanArgument2) {
            integerLocal1++;
          }
          return NetworkSupport005.stringArrayState0019[integerLocal1];
        }
        return (String) null;
    }

    final static void performAction0639(String[] args, boolean booleanArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (booleanArgument2) {
            return;
          }
          if (MixedSupport022.uiComponentPart031State0001 != null) {
            MixedSupport022.uiComponentPart031State0001.uiComponentPart007State0002.performAction0393(32, args);
          }
          if (null == MixedSupport123.uiComponentPart005State0001) {
            return;
          }
          MixedSupport123.uiComponentPart005State0001.uiComponentPart007State0001.performAction0393(32, args);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("gf.B(");
          if (args == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    final static void performAction0635(byte byteArgument1) {
        if (!MixedSupport141.booleanState0194) {
          throw new IllegalStateException();
        }
        if (byteArgument1 == -126) {
          UiComponentPart025.booleanState0152 = true;
          GameplayControls.performAction1982(false, 841566312);
          MixedSupport052.integerState0269 = 0;
          return;
        }
        String[] stringArrayLocal1 = (String[]) null;
        MixedSupport047.performAction0639((String[]) null, true);
        UiComponentPart025.booleanState0152 = true;
        GameplayControls.performAction1982(false, 841566312);
        MixedSupport052.integerState0269 = 0;
    }

    public static void performAction0636(int integerArgument1) {
        indexedSpriteArrayState0003 = null;
        stringState0201 = null;
        stringState0200 = null;
        sceneWidgetState0038 = null;
        mixedSupport015State0002 = null;
        mixedSupport048State0001 = null;
        if (integerArgument1 == 2) {
          rgbSpriteState0018 = null;
          sceneWidgetPart008State0003 = null;
          mixedSupport111State0002 = null;
          return;
        }
        MixedSupport047.computeString0638(46, true, false, false);
        rgbSpriteState0018 = null;
        sceneWidgetPart008State0003 = null;
        mixedSupport111State0002 = null;
    }

    static {
        mixedSupport048State0001 = new MixedSupport048(0);
        mixedSupport111State0002 = new MixedSupport111(4, 1, 1, 1);
        stringState0200 = "<%0> has declined the invitation.";
        stringState0201 = "Hide lobby chat";
    }
}
