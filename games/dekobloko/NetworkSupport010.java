/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport010 extends HashNode {
    int integerState0583;
    int integerState0584;
    static int integerState0585;
    static UiComponentPart026 uiComponentPart026State0001;
    int integerState0586;
    NetworkSupport010 networkSupport010State0001;
    static RawSound rawSoundState0017;
    int integerState0587;
    int integerState0588;

    public static void performAction1434(int integerArgument1) {
        int integerLocal1 = 86 % ((52 - integerArgument1) / 35);
        uiComponentPart026State0001 = null;
        rawSoundState0017 = null;
    }

    final static boolean computeBoolean1435(int integerArgument1) {
        CodecSupport001.booleanState0102 = true;
        if (integerArgument1 >= 55) {
          MixedSupport079.longState0026 = 15000L + MixedSupport063.computeLong0827(4);
          return MixedSupport052.integerState0269 == 11 ? true : false;
        }
        NetworkSupport010.performAction1433(false, true);
        MixedSupport079.longState0026 = 15000L + MixedSupport063.computeLong0827(4);
        return MixedSupport052.integerState0269 == 11 ? true : false;
    }

    final static void performAction1433(boolean booleanArgument1, boolean booleanArgument2) {
        if (booleanArgument2) {
          return;
        }
        ThemeTips.mixedSupport124State0001.performAction1768(-21, booleanArgument1);
    }

    final static void performAction1431(byte byteArgument1, java.applet.Applet appletArgument2) {
        try {
          java.net.URL uRLLocal1 = null;
          Exception exceptionLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          RuntimeException stackRuntimeExceptionLocal4 = null;
          StringBuilder stackStringBuilderLocal5 = null;
          String stackStringLocal6 = null;
          Throwable caughtExceptionLocal7 = null;
          try {
            try {
              uRLLocal1 = new java.net.URL(appletArgument2.getCodeBase(), "quit.ws");
              if (byteArgument1 != -17) {
                NetworkSupport010.computePcmStreamMixer1432(-74);
              }
              appletArgument2.getAppletContext().showDocument(NetworkSupport004.computeURL0662(uRLLocal1, -1, appletArgument2), "_top");
              return;
            } catch (java.lang.Exception caughtParameterLocal8) {
              caughtExceptionLocal7 = caughtParameterLocal8;
              exceptionLocal2 = (Exception) (Object) caughtExceptionLocal7;
              exceptionLocal2.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal9) {
            caughtExceptionLocal7 = caughtParameterLocal9;
            runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal7;
            stackRuntimeExceptionLocal4 = runtimeExceptionLocal3;
            stackStringBuilderLocal5 = new StringBuilder().append("pk.B(").append(byteArgument1).append(',');
            if (appletArgument2 == null) {
              stackStringLocal6 = "null";
            } else {
              stackStringLocal6 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal10) {
          throw uncheckedExceptionLocal10;
        } catch (Throwable checkedExceptionLocal11) {
          throw new RuntimeException(checkedExceptionLocal11);
        }
    }

    final static PcmStreamMixer computePcmStreamMixer1432(int integerArgument1) {
        if (integerArgument1 != 15000) {
          return (PcmStreamMixer) null;
        }
        return MixedSupport146.pcmStreamMixerState0005;
    }

    NetworkSupport010(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        this.integerState0586 = integerArgument3;
        this.integerState0584 = integerArgument4;
        this.integerState0583 = integerArgument5;
        this.integerState0587 = integerArgument1;
        this.integerState0588 = integerArgument2;
    }

    static {
        integerState0585 = 0;
    }
}
