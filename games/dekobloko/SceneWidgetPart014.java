/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart014 extends SceneWidget {
    String stringState0603;
    SceneWidget sceneWidgetState0147;
    static int integerState0919;
    SceneWidget sceneWidgetState0148;
    String stringState0604;
    static int[] integerArrayState0257;
    int integerState0920;
    static Boolean booleanState0220;
    static MixedSupport043 mixedSupport043State0001;
    SceneWidget sceneWidgetState0149;
    String stringState0605;
    String stringState0606;
    static String[] stringArrayState0057;

    final static void performAction2013(MixedSupport072 mixedSupport072Argument1, int integerArgument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument2, integerArgument3 - 64);
          if (integerArgument3 != 60) {
            mixedSupport043State0001 = (MixedSupport043) null;
          }
          cipherPacketBufferLocal1.performAction2073(true, 5);
          cipherPacketBufferLocal1.performAction2073(true, 0);
          cipherPacketBufferLocal1.performAction2087(integerArgument3 ^ -61, mixedSupport072Argument1.integerState0358);
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport072Argument1.integerState0359);
          cipherPacketBufferLocal1.performAction2073(true, mixedSupport072Argument1.integerState0357);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wb.B(" + (mixedSupport072Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final static void performAction2012(java.applet.Applet appletArgument1, int integerArgument2) {
        try {
          String stringLocal1 = null;
          Exception exceptionLocal2 = null;
          RuntimeException runtimeExceptionLocal3 = null;
          int integerLocal4 = 0;
          String stringLocal5 = null;
          java.net.URL uRLLocal6 = null;
          RuntimeException stackRuntimeExceptionLocal7 = null;
          StringBuilder stackStringBuilderLocal8 = null;
          String stackStringLocal9 = null;
          Throwable caughtExceptionLocal10 = null;
          String stringLocal11;
          String stringLocal12;
          try {
            try {
              stringLocal1 = appletArgument1.getDocumentBase().getFile();
              stringLocal5 = stringLocal1;
              stringLocal11 = stringLocal1;
              if (integerArgument2 != 30307) {
                integerState0919 = 64;
              }
              integerLocal4 = stringLocal1.indexOf('?');
              stringLocal12 = "reload.ws";
              if (0 <= integerLocal4) {
                stringLocal12 = stringLocal12 + stringLocal1.substring(integerLocal4);
              }
              uRLLocal6 = new java.net.URL(appletArgument1.getCodeBase(), stringLocal12);
              appletArgument1.getAppletContext().showDocument(NetworkSupport004.computeURL0662(uRLLocal6, -1, appletArgument1), "_self");
              return;
            } catch (java.lang.Exception caughtParameterLocal13) {
              caughtExceptionLocal10 = caughtParameterLocal13;
              exceptionLocal2 = (Exception) (Object) caughtExceptionLocal10;
              exceptionLocal2.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal14) {
            caughtExceptionLocal10 = caughtParameterLocal14;
            runtimeExceptionLocal3 = (RuntimeException) (Object) caughtExceptionLocal10;
            stackRuntimeExceptionLocal7 = runtimeExceptionLocal3;
            stackStringBuilderLocal8 = new StringBuilder().append("wb.C(");
            if (appletArgument1 == null) {
              stackStringLocal9 = "null";
            } else {
              stackStringLocal9 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal15) {
          throw uncheckedExceptionLocal15;
        } catch (Throwable checkedExceptionLocal16) {
          throw new RuntimeException(checkedExceptionLocal16);
        }
    }

    final static void performAction2011(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException caughtExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (SoftwareRaster.integerState0282 > integerArgument2) {
            integerArgument6 = integerArgument6 - (-integerArgument2 + SoftwareRaster.integerState0282);
            integerArgument2 = SoftwareRaster.integerState0282;
          }
          if (integerArgument2 + integerArgument6 > SoftwareRaster.integerState0281) {
            integerArgument6 = SoftwareRaster.integerState0281 - integerArgument2;
          }
          if (SoftwareRaster.integerState0280 > integerArgument4) {
            integerArgument3 = integerArgument3 - (-integerArgument4 + SoftwareRaster.integerState0280);
            integerArgument4 = SoftwareRaster.integerState0280;
          }
          if (integerArgument4 + integerArgument3 > SoftwareRaster.integerState0283) {
            integerArgument3 = -integerArgument4 + SoftwareRaster.integerState0283;
          }
          if (0 < integerArgument6 &&
            integerArgument3 > 0) {
            integerLocal2 = integerArgument4 * SoftwareRaster.integerState0285 + integerArgument2;
            if (integerArgument1 != 31) {
              stringArrayState0057 = (String[]) null;
            }
            integerLocal4 = -integerArgument6 + SoftwareRaster.integerState0285;
            for (integerArgument4 = -integerArgument3; integerArgument4 < 0; integerArgument4++) {
              for (integerArgument2 = -integerArgument6; integerArgument2 < 0; integerArgument2++) {
                integerLocal5 = SoftwareRaster.integerArrayState0063[integerLocal2];
                if ((65280 & integerLocal5) >> 8 > integerArgument5 &&
                  (255 & integerLocal5 >> 16) <= (integerLocal5 >> 8 & 255)) {
                  integerLocal6 = ((16711680 & integerLocal5) >> 15) - 60;
                  if (integerLocal6 > 255) {
                    integerLocal6 = 255;
                  }
                  integerLocal7 = integerLocal5 & 65280;
                  integerLocal7 = (integerLocal7 >> 1) - (integerLocal7 >> 5) & 65280;
                  integerLocal8 = 31 & integerLocal5 >> 3;
                  SoftwareRaster.integerArrayState0063[integerLocal2] = UiComponentPart006.computeInteger0388(integerLocal8, UiComponentPart006.computeInteger0388(integerLocal6 << 16, integerLocal7));
                }
                integerLocal2++;
              }
              integerLocal2 = integerLocal2 + integerLocal4;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal1 = caughtParameterLocal10;
          runtimeExceptionLocal3 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "wb.A(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    public static void performAction2015(int integerArgument1) {
        if (integerArgument1 < -73) {
          stringArrayState0057 = null;
          integerArrayState0257 = null;
          mixedSupport043State0001 = null;
          booleanState0220 = null;
          return;
        }
        integerArrayState0257 = (int[]) null;
        stringArrayState0057 = null;
        integerArrayState0257 = null;
        mixedSupport043State0001 = null;
        booleanState0220 = null;
    }

    final static int computeInteger2014(byte byteArgument1, int integerArgument2) {
        int integerLocal1 = integerArgument2 >>> 1;
        integerLocal1 = integerLocal1 | integerLocal1 >>> 1;
        if (byteArgument1 <= -77) {
          integerLocal1 = integerLocal1 | integerLocal1 >>> 2;
          integerLocal1 = integerLocal1 | integerLocal1 >>> 4;
          integerLocal1 = integerLocal1 | integerLocal1 >>> 8;
          integerLocal1 = integerLocal1 | integerLocal1 >>> 16;
          return integerArgument2 & ~integerLocal1;
        }
        MixedSupport072 mixedSupport072Local2 = (MixedSupport072) null;
        SceneWidgetPart014.performAction2013((MixedSupport072) null, -48, 106);
        integerLocal1 = integerLocal1 | integerLocal1 >>> 2;
        integerLocal1 = integerLocal1 | integerLocal1 >>> 4;
        integerLocal1 = integerLocal1 | integerLocal1 >>> 8;
        integerLocal1 = integerLocal1 | integerLocal1 >>> 16;
        return integerArgument2 & ~integerLocal1;
    }

    SceneWidgetPart014() {
        super(0L, (SceneWidget) null);
    }

    static {
        mixedSupport043State0001 = null;
    }
}
