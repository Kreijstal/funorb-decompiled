/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport022 {
    static byte[] byteArrayState0005;
    static MixedSupport057 mixedSupport057State0002;
    static MixedSupport015 mixedSupport015State0001;
    static boolean[] booleanArrayState0004;
    static UiComponentPart031 uiComponentPart031State0001;

    final static MixedSupport066 computeMixedSupport0660359(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        String[] stringArrayLocal4 = null;
        String[] stringArrayLocal5 = null;
        String stringLocal6 = null;
        MixedSupport066 mixedSupport066Local7 = null;
        int integerLocal8 = 0;
        MixedSupport066 stackMixedSupport066Local9 = null;
        MixedSupport066 stackMixedSupport066Local10 = null;
        MixedSupport066 stackMixedSupport066Local11 = null;
        MixedSupport066 stackMixedSupport066Local12 = null;
        MixedSupport066 stackMixedSupport066Local13 = null;
        RuntimeException stackRuntimeExceptionLocal14 = null;
        StringBuilder stackStringBuilderLocal15 = null;
        String stackStringLocal16 = null;
        RuntimeException caughtExceptionLocal17 = null;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = stringArgument1.length();
          if (0 == integerLocal2) {
            stackMixedSupport066Local9 = InputAdapter003.mixedSupport066State0004;
            return stackMixedSupport066Local9;
          }
          if (integerLocal2 > 255) {
            stackMixedSupport066Local10 = MixedSupport045.mixedSupport066State0003;
            return stackMixedSupport066Local10;
          }
          stringArrayLocal4 = ResourceArchive.computeStringArray0907('.', (byte) 66, stringArgument1);
          if (2 > stringArrayLocal4.length) {
            stackMixedSupport066Local11 = InputAdapter003.mixedSupport066State0004;
            return stackMixedSupport066Local11;
          }
          stringArrayLocal5 = stringArrayLocal4;
          for (integerLocal1 = 0; stringArrayLocal5.length > integerLocal1; integerLocal1++) {
            stringLocal6 = stringArrayLocal5[integerLocal1];
            mixedSupport066Local7 = MixedSupport045.computeMixedSupport0660613(integerArgument2 ^ -4549, stringLocal6);
            if (mixedSupport066Local7 != null) {
              stackMixedSupport066Local12 = mixedSupport066Local7;
              return stackMixedSupport066Local12;
            }
          }
          if (integerArgument2 != -2734) {
            MixedSupport022.performAction0355((byte) 4);
          }
          stackMixedSupport066Local13 = UiComponentPart020.computeMixedSupport0661321((byte) 86, stringArrayLocal4[stringArrayLocal4.length - 1]);
          return stackMixedSupport066Local13;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal17 = caughtParameterLocal18;
          runtimeExceptionLocal3 = caughtExceptionLocal17;
          stackRuntimeExceptionLocal14 = runtimeExceptionLocal3;
          stackStringBuilderLocal15 = new StringBuilder().append("da.F(");
          if (stringArgument1 == null) {
            stackStringLocal16 = "null";
          } else {
            stackStringLocal16 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal14), ((StringBuilder) (Object) stackStringBuilderLocal15).append(stackStringLocal16).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public static void performAction0355(byte byteArgument1) {
        mixedSupport015State0001 = null;
        uiComponentPart031State0001 = null;
        mixedSupport057State0002 = null;
        byteArrayState0005 = null;
        if (byteArgument1 != -121) {
          booleanArrayState0004 = (boolean[]) null;
        }
        booleanArrayState0004 = null;
    }

    final static void performAction0358(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1;
        MixedSupport042.performAction0595(130, 256, 16694016, MixedSupport072.stringState0302, 82 + integerArgument1, SceneWidget.renderingSupport010State0007);
        int integerLocal2 = 145;
        MixedSupport035.rgbSpriteArrayArrayState0006[0][0].performAction0302(82 + integerArgument1, integerLocal2, 18, 18);
        integerLocal2 = integerLocal2 + (MixedSupport045.computeInteger0612(188, 0, integerLocal2, MixedSupport015.stringState0072, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -124, 0, 110 + integerArgument1) * 16 + 16);
        MixedSupport035.rgbSpriteArrayArrayState0006[1][3].performAction0302(integerArgument1 + 82, integerLocal2, 18, 18);
        integerLocal2 = integerLocal2 + (16 + MixedSupport045.computeInteger0612(188, 0, integerLocal2, MixedSupport026.stringState0129, 16, 64, 16777215, UiComponentPart029.renderingSupport010State0005, (byte) -125, 0, 110 + integerArgument1) * 16);
        CodecSupport004.performAction1634(integerLocal2, MixedSupport074.integerState0396, MixedSupport049.integerState0264, -115, 190 + integerArgument1, TextLineMetrics.integerState0534, 0);
        SoftwareRaster.performAction0744(309 + integerArgument1, 117, 242, 263172);
        integerLocal1 = 116;
        SoftwareRaster.performAction0744(integerArgument1 + 310, 117, 242, 6316128);
        MixedSupport042.performAction0595(integerLocal1 + 14, 256, 16694016, MixedSupport136.stringState0559, 322 + integerArgument1, SceneWidget.renderingSupport010State0007);
        integerLocal1 += 29;
        MixedSupport042.performAction0595(13 + integerLocal1, 256, 16777215, GameplayControls.stringArrayState0056[0], integerArgument1 + 322, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[0].performAction0300(integerArgument1 + 480, integerLocal1 + 1);
        integerLocal1 += 18;
        MixedSupport042.performAction0595(13 + integerLocal1, 256, 16777215, GameplayControls.stringArrayState0056[1], 322 + integerArgument1, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[1].performAction0300(integerArgument1 + 480, integerLocal1 + 1);
        integerLocal1 += 34;
        MixedSupport042.performAction0595(integerLocal1 + 13, 256, 16777215, GameplayControls.stringArrayState0056[2], integerArgument1 + 322, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[3].performAction0300(480 + integerArgument1, integerLocal1 + 1);
        integerLocal1 += 18;
        MixedSupport042.performAction0595(integerLocal1 + 13, 256, 16777215, GameplayControls.stringArrayState0056[3], integerArgument1 + 322, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[4].performAction0300(integerArgument1 + 480, integerLocal1 + 1);
        MixedSupport029.performAction0447(16777215, 506 + integerArgument1, GameplayControls.stringArrayState0056[4], integerLocal1 + 13, (byte) 75, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[2].performAction0300(516 + integerArgument1, integerLocal1 + 1);
        integerLocal1 += 34;
        MixedSupport042.performAction0595(integerLocal1 + 13, 256, 16777215, GameplayControls.stringArrayState0056[5], 322 + integerArgument1, UiComponentPart029.renderingSupport010State0005);
        if (!booleanArgument2) {
          return;
        }
        UiComponentPart023.rgbSpriteArrayState0021[5].performAction0300(integerArgument1 + 480, integerLocal1 + 1);
        integerLocal1 += 34;
        MixedSupport042.performAction0595(14 + integerLocal1, 256, 16694016, MixedSupport072.stringState0303, integerArgument1 + 322, SceneWidget.renderingSupport010State0007);
        integerLocal1 += 29;
        MixedSupport042.performAction0595(13 + integerLocal1, 256, 16777215, GameplayControls.stringArrayState0056[6], 322 + integerArgument1, UiComponentPart029.renderingSupport010State0005);
        UiComponentPart023.rgbSpriteArrayState0021[6].performAction0300(480 + integerArgument1, 1 + integerLocal1);
    }

    final static void performAction0356(byte byteArgument1, String stringArgument2, String stringArgument3) {
        try {
          if (byteArgument1 != -109) {
            MixedSupport022.performAction0355((byte) -7);
          }
          DiagnosticSupport001.performAction0363(-127, stringArgument2, stringArgument3, false);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "da.A(" + byteArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0357(int integerArgument1, int integerArgument2, int integerArgument3, CharSequence charSequenceArgument4, byte[] byteArrayArgument5, int integerArgument6) {
        int stackIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal8 = -integerArgument6 + integerArgument1;
          integerLocal10 = 0;
          if (integerArgument3 != -8218) {
            MixedSupport022.performAction0360(true, false);
          }
          while (integerLocal10 < integerLocal8) {
            {
              integerLocal11 = charSequenceArgument4.charAt(integerArgument6 + integerLocal10);
              if ((0 >= integerLocal11 ||
                integerLocal11 >= 128) && (integerLocal11 < 160 ||
                integerLocal11 > 255)) {
                switch (integerLocal11) {
                  case 8364:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-128;
                    break;
                  case 8218:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-126;
                    break;
                  case 402:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-125;
                    break;
                  case 8222:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-124;
                    break;
                  case 8230:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-123;
                    break;
                  case 8224:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-122;
                    break;
                  case 8225:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-121;
                    break;
                  case 710:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-120;
                    break;
                  case 8240:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-119;
                    break;
                  case 352:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-118;
                    break;
                  case 8249:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-117;
                    break;
                  case 338:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-116;
                    break;
                  case 381:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-114;
                    break;
                  case 8216:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-111;
                    break;
                  case 8217:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-110;
                    break;
                  case 8220:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-109;
                    break;
                  case 8221:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-108;
                    break;
                  case 8226:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-107;
                    break;
                  case 8211:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-106;
                    break;
                  case 8212:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-105;
                    break;
                  case 732:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-104;
                    break;
                  case 8482:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-103;
                    break;
                  case 353:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-102;
                    break;
                  case 8250:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-101;
                    break;
                  case 339:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-100;
                    break;
                  case 382:
                    byteArrayArgument5[integerArgument2 + integerLocal10] = (byte)-98;
                    break;
                  case 376:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)-97;
                    break;
                  default:
                    byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)63;
                    break;
                }
              } else {
                byteArrayArgument5[integerLocal10 + integerArgument2] = (byte)integerLocal11;
              }
            }
            integerLocal10++;
          }
          stackIntegerLocal1 = integerLocal8;
          return stackIntegerLocal1;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal7 = caughtParameterLocal13;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal9;
          stackStringBuilderLocal3 = new StringBuilder().append("da.D(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (charSequenceArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (byteArrayArgument5 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static void performAction0360(boolean booleanArgument1, boolean booleanArgument2) {
        UiComponentPart013.performAction0693(booleanArgument2, -95);
        if (booleanArgument1) {
          return;
        }
        if (null != MixedSupport122.stringState0515) {
          SceneWidgetPart009.performAction1516(MixedSupport122.stringState0515, -2);
        }
    }

    static {
        mixedSupport057State0002 = new MixedSupport057();
    }
}
