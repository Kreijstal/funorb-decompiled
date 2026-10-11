/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport152 {
    static RawSound rawSoundState0023;
    static String stringState0608;
    static boolean booleanState0222;
    static String stringState0609;
    static String stringState0610;

    public static void performAction2020(int integerArgument1) {
        rawSoundState0023 = null;
        if (integerArgument1 == 1) {
          stringState0608 = null;
          stringState0610 = null;
          stringState0609 = null;
          return;
        }
        MixedSupport152.computeRenderingSupport0082021(-30, false, false);
        stringState0608 = null;
        stringState0610 = null;
        stringState0609 = null;
    }

    final static String computeString2022(java.applet.Applet appletArgument1, byte byteArgument2, String stringArgument3) {
        try {
          int integerLocal1 = 0;
          String stringLocal2 = null;
          String[] stringArrayLocal3 = null;
          int integerLocal4 = 0;
          int integerLocal5 = 0;
          String stackStringLocal6 = null;
          Object stackObjectLocal7 = null;
          RuntimeException stackRuntimeExceptionLocal8 = null;
          StringBuilder stackStringBuilderLocal9 = null;
          String stackStringLocal10 = null;
          StringBuilder stackStringBuilderLocal11 = null;
          String stackStringLocal12 = null;
          Throwable caughtExceptionLocal13 = null;
          Throwable throwableLocal14 = null;
          RuntimeException runtimeExceptionLocal15 = null;
          integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            try {
              stringLocal2 = (String) (MixedSupport088.computeObject1242(true, "getcookies", appletArgument1));
              stringArrayLocal3 = ResourceArchive.computeStringArray0907(';', (byte) 66, stringLocal2);
              if (byteArgument2 != -1) {
                stringState0610 = (String) null;
              }
              for (integerLocal1 = 0; stringArrayLocal3.length > integerLocal1; integerLocal1++) {
                integerLocal4 = stringArrayLocal3[integerLocal1].indexOf('=');
                if (0 <= integerLocal4 &&
                  stringArrayLocal3[integerLocal1].substring(0, integerLocal4).trim().equals(stringArgument3)) {
                  stackStringLocal6 = stringArrayLocal3[integerLocal1].substring(integerLocal4 + 1).trim();
                  return stackStringLocal6;
                }
              }
            } catch (java.lang.Throwable caughtParameterLocal16) {
              caughtExceptionLocal13 = caughtParameterLocal16;
              throwableLocal14 = caughtExceptionLocal13;
            }
            stackObjectLocal7 = null;
            return (String) (stackObjectLocal7);
          } catch (java.lang.RuntimeException caughtParameterLocal17) {
            caughtExceptionLocal13 = caughtParameterLocal17;
            runtimeExceptionLocal15 = (RuntimeException) (Object) caughtExceptionLocal13;
            stackRuntimeExceptionLocal8 = runtimeExceptionLocal15;
            stackStringBuilderLocal9 = new StringBuilder().append("wd.C(");
            if (appletArgument1 == null) {
              stackStringLocal10 = "null";
            } else {
              stackStringLocal10 = "{...}";
            }
            stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(',');
            if (stringArgument3 == null) {
              stackStringLocal12 = "null";
            } else {
              stackStringLocal12 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal18) {
          throw uncheckedExceptionLocal18;
        } catch (Throwable checkedExceptionLocal19) {
          throw new RuntimeException(checkedExceptionLocal19);
        }
    }

    final static RenderingSupport008 computeRenderingSupport0082021(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RenderingSupport008 renderingSupport008Local3 = new RenderingSupport008(2);
        RenderingSupport008 renderingSupport008Local4 = renderingSupport008Local3;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        if (!booleanArgument3) {
          renderingSupport008Local4.performAction0969(new GameDomainSupport002(17), integerArgument1 + 10);
          integerLocal1 = MixedSupport001.renderingSupport010State0001.computeInteger1208(ResourceArchive.stringState0287);
          integerLocal2 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport063.stringState0261);
          if (integerLocal2 > integerLocal1) {
            integerLocal1 = integerLocal2;
          }
          integerLocal5 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport070.stringState0294);
          if (integerLocal1 < integerLocal5) {
            integerLocal1 = integerLocal5;
          }
          integerLocal6 = MixedSupport001.renderingSupport010State0001.computeInteger1208(UiComponentPart033.stringState0623);
          if (integerLocal6 > integerLocal1) {
            integerLocal1 = integerLocal6;
          }
          integerLocal7 = MixedSupport001.renderingSupport010State0001.computeInteger1208(ProxySocketFactory.stringState0493);
          if (integerLocal7 > integerLocal1) {
            integerLocal1 = integerLocal7;
          }
          integerLocal8 = MixedSupport001.renderingSupport010State0001.computeInteger1208(AudioSupport004.stringState0467);
          if (integerLocal1 < integerLocal8) {
            integerLocal1 = integerLocal8;
          }
          integerLocal9 = MixedSupport001.renderingSupport010State0001.computeInteger1208(SceneWidgetPart005.stringState0254);
          if (integerLocal1 < integerLocal9) {
            integerLocal1 = integerLocal9;
          }
          integerLocal10 = MixedSupport001.renderingSupport010State0001.computeInteger1208(MixedSupport024.stringState0117);
          if (integerLocal10 > integerLocal1) {
            integerLocal1 = integerLocal10;
          }
          renderingSupport008Local4.gameDomainSupport002ArrayState0001[-1 + renderingSupport008Local3.mixedSupport121State0002.integerState0756].integerState0176 = 46 + integerLocal1;
        }
        renderingSupport008Local4.performAction0969(new GameDomainSupport002(18, MixedSupport098.stringState0389, MixedSupport001.renderingSupport010State0001), 104);
        renderingSupport008Local4.performAction0968(-1, booleanArgument2, -129);
        renderingSupport008Local4.performAction0966(integerArgument1, 320, false, -117, 28);
        return renderingSupport008Local4;
    }

    static {
        stringState0608 = "You appear to be telling someone your password - please don't!";
        booleanState0222 = false;
        stringState0609 = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        stringState0610 = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
