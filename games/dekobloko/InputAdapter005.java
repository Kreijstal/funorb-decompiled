/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputAdapter005 extends ResourceSupport002 implements CallbackContract013, CallbackContract018 {
    static String stringState0445;
    static RgbSprite[] rgbSpriteArrayState0022;
    static String stringState0446;
    static String stringState0447;
    static String stringState0448;
    UiComponentPart032 uiComponentPart032State0001;
    static int[] integerArrayState0192;

    final RenderingSupport015 computeRenderingSupport0150098(int integerArgument1) {
        int integerLocal1 = 0;
        NumberFormatException numberFormatExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        RenderingSupport015 stackRenderingSupport015Local6 = null;
        RenderingSupport015 stackRenderingSupport015Local7 = null;
        RenderingSupport015 stackRenderingSupport015Local8 = null;
        RenderingSupport015 stackRenderingSupport015Local9 = null;
        Throwable caughtExceptionLocal10 = null;
        try {
          integerLocal1 = this.uiComponentPart032State0001.computeInteger1459(-22079);
          integerLocal3 = this.uiComponentPart032State0001.computeInteger1457(false);
          integerLocal4 = this.uiComponentPart032State0001.computeInteger1458((byte) 48);
          integerLocal5 = ThemeTips.computeInteger0928(-110);
          if (integerLocal4 < 1890) {
            stackRenderingSupport015Local6 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local6;
          }
          if (integerLocal4 > integerLocal5 - 3) {
            stackRenderingSupport015Local7 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local7;
          }
          if (integerArgument1 != -5520) {
            stackRenderingSupport015Local8 = (RenderingSupport015) null;
            return stackRenderingSupport015Local8;
          }
          if (!MixedSupport140.computeBoolean1903(integerLocal4, integerLocal3, integerLocal1, (byte) 52)) {
            stackRenderingSupport015Local9 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local9;
          }
        } catch (java.lang.NumberFormatException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          numberFormatExceptionLocal2 = (NumberFormatException) (Object) caughtExceptionLocal10;
          return MixedSupport149.renderingSupport015State0005;
        }
        return MixedSupport023.renderingSupport015State0001;
    }

    final String computeString0101(byte byteArgument1) {
        int integerLocal1 = 0;
        NumberFormatException numberFormatExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        ResourceArchive resourceArchiveLocal6 = null;
        String stackStringLocal7 = null;
        Object stackObjectLocal8 = null;
        Throwable caughtExceptionLocal9 = null;
        try {
          if (byteArgument1 <= 2) {
            resourceArchiveLocal6 = (ResourceArchive) null;
            InputAdapter005.performAction1534((ResourceArchive) null, (ResourceArchive) null, -5);
          }
          integerLocal1 = this.uiComponentPart032State0001.computeInteger1459(-22079);
          integerLocal3 = this.uiComponentPart032State0001.computeInteger1457(false);
          integerLocal4 = this.uiComponentPart032State0001.computeInteger1458((byte) 48);
          integerLocal5 = ThemeTips.computeInteger0928(-125);
          if (integerLocal4 >= 1890 &&
            integerLocal4 <= integerLocal5 - 3) {
            if (MixedSupport140.computeBoolean1903(integerLocal4, integerLocal3, integerLocal1, (byte) 52)) {
              stackObjectLocal8 = null;
              return (String) (stackObjectLocal8);
            }
          } else {
            stackStringLocal7 = CollectionSupport001.computeString0336(99, ResourceSupport001.stringState0009, new String[]{"1890", Integer.toString(integerLocal5 - 3)});
            return stackStringLocal7;
          }
        } catch (java.lang.NumberFormatException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          numberFormatExceptionLocal2 = (NumberFormatException) (Object) caughtExceptionLocal9;
        }
        return RenderingSupport001.stringState0045;
    }

    public final void performAction0690(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (integerArgument1 != 16737894) {
            stringState0448 = (String) null;
            this.performAction0099((byte) -51);
          } else {
            this.performAction0099((byte) -51);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("qf.N(").append(integerArgument1).append(',');
          if (uiComponentPart028Argument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    final static void performAction1532(String stringArgument1, int integerArgument2, String stringArgument3) {
        try {
          if (MixedSupport020.uiComponentPart012State0001 != null) {
            MixedSupport020.uiComponentPart012State0001.performAction0655(-120);
          }
          if (integerArgument2 >= -10) {
            stringState0445 = (String) null;
          }
          MixedSupport025.uiComponentPart013State0001 = new UiComponentPart013(stringArgument1, stringArgument3, false, true, true);
          UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport025.uiComponentPart013State0001, (byte) 91);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qf.I(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void performAction0695(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        try {
          if (integerArgument1 != -2569) {
            integerArrayState0192 = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qf.K(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1529(byte byteArgument1, java.awt.Component componentArgument2) {
        try {
          componentArgument2.removeMouseListener(MixedSupport063.mouseInputState0001);
          componentArgument2.removeMouseMotionListener(MixedSupport063.mouseInputState0001);
          componentArgument2.removeFocusListener(MixedSupport063.mouseInputState0001);
          if (byteArgument1 != -35) {
            stringState0446 = (String) null;
          }
          UiComponentPart022.integerState0572 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qf.L(" + byteArgument1 + ',' + (componentArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1530(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = (UiComponentPart033.integerState0934 - 640) / 2;
        int integerLocal4;
        int integerLocal5;
        if (integerArgument2 > 95) {
          integerLocal1 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
          integerLocal2 = integerLocal1 - integerArgument1 * integerArgument1;
          MixedSupport030.sceneWidgetState0023.performAction1994(199, 0, 90, -4 + SoftwareRaster.integerState0284 - 210, integerLocal3 - 199 * integerLocal2 / integerLocal1);
          NetworkSupport008.sceneWidgetState0093.performAction1994(438, 0, 0, SoftwareRaster.integerState0284 - 124, integerLocal3 + 202 + integerLocal2 * 438 / integerLocal1);
          return;
        }
        stringState0446 = (String) null;
        integerLocal4 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
        integerLocal5 = integerLocal4 - integerArgument1 * integerArgument1;
        MixedSupport030.sceneWidgetState0023.performAction1994(199, 0, 90, -4 + SoftwareRaster.integerState0284 - 210, integerLocal3 - 199 * integerLocal5 / integerLocal4);
        NetworkSupport008.sceneWidgetState0093.performAction1994(438, 0, 0, SoftwareRaster.integerState0284 - 124, integerLocal3 + 202 + integerLocal5 * 438 / integerLocal4);
    }

    final static boolean computeBoolean1531(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          for (integerLocal1 = integerArgument2; stringArgument1.length() > integerLocal1; integerLocal1++) {
            integerLocal3 = stringArgument1.charAt(integerLocal1);
            if (!MixedSupport141.computeBoolean1908((char) integerLocal3, -24380) &&
              !MixedSupport042.computeBoolean0591((char) integerLocal3, (byte) 23)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("qf.T(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static void performAction1535(boolean booleanArgument1) {
        String stringLocal1 = null;
        if (UiComponentPart032.booleanState0198) {
          if (MixedSupport020.uiComponentPart012State0001 != null) {
            MixedSupport020.uiComponentPart012State0001.performAction0655(8);
          }
          stringLocal1 = RenderingSupport013.computeString1520((byte) 103);
          MixedSupport025.uiComponentPart013State0001 = new UiComponentPart013(stringLocal1, (String) null, booleanArgument1, false, false);
          MixedSupport005.uiComponentPart016State0001.performAction0945((byte) -107, UiComponentPart006.uiComponentPart023State0001);
          UiComponentPart006.uiComponentPart023State0001.performAction0201(MixedSupport025.uiComponentPart013State0001, (byte) 101);
          UiComponentPart006.uiComponentPart023State0001.performAction0203(100);
          return;
        }
        throw new IllegalStateException();
    }

    public final boolean computeBoolean1239(byte byteArgument1) {
        int integerLocal1 = -5 / ((72 - byteArgument1) / 40);
        return this.uiComponentPart032State0001.computeBoolean1460(111);
    }

    final static void performAction1534(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2, int integerArgument3) {
        try {
          MixedSupport028.resourceArchiveState0004 = resourceArchiveArgument2;
          if (integerArgument3 >= -46) {
            InputAdapter005.performAction1536(8);
          }
          MixedSupport080.resourceArchiveState0011 = resourceArchiveArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qf.G(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ')');
        }
    }

    final static void performAction1533(String stringArgument1, String[] stringArrayArgument2, int integerArgument3, int integerArgument4) {
        String[] stringArrayLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        String[] stringArrayLocal4 = null;
        boolean stackBooleanLocal5 = false;
        boolean stackBooleanLocal6 = false;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          UiComponentPart016.mixedSupport004State0001 = MixedSupport075.mixedSupport004State0002;
          if (integerArgument4 != -677) {
            InputAdapter005.performAction1535(false);
          }
          if (integerArgument3 != 255) {
            if (integerArgument3 >= 100 &&
              105 >= integerArgument3) {
              stringArrayLocal1 = stringArrayArgument2;
              MixedSupport047.performAction0639(stringArrayLocal1, false);
              AudioSupport002.mixedSupport016State0002 = MixedSupport154.computeMixedSupport0162045(stringArrayArgument2, integerArgument4 + 674);
              return;
            }
            AudioSupport002.mixedSupport016State0002 = MixedSupport140.computeMixedSupport0161904(integerArgument3, stringArgument1, integerArgument4 + 780);
            return;
          }
          stackBooleanLocal5 = false;
          stackBooleanLocal6 = !(13 <= MixedSupport068.integerState0352);
          AudioSupport002.mixedSupport016State0002 = MixedSupport013.computeMixedSupport0160188(stackBooleanLocal5, stackBooleanLocal6);
          stringArrayLocal4 = (String[]) null;
          MixedSupport047.performAction0639((String[]) null, false);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("qf.S(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArrayArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public static void performAction1536(int integerArgument1) {
        stringState0445 = null;
        stringState0446 = null;
        rgbSpriteArrayState0022 = null;
        if (integerArgument1 < 110) {
          return;
        }
        integerArrayState0192 = null;
        stringState0447 = null;
        stringState0448 = null;
    }

    public InputAdapter005() {
    }

    static {
        stringState0445 = "Show chat (<%0> unread messages)";
        stringState0447 = "Achievements This Game";
        stringState0448 = "<%0> must play 1 more rated game before playing with the current options.";
        stringState0446 = "Names cannot start or end with space or underscore";
    }
}
