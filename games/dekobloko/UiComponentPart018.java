/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart018 extends ComponentContainer implements CallbackContract015, CallbackContract019 {
    static String stringState0343;
    static String[] stringArrayState0021;
    static int integerState0502;
    private UiComponentPart025 uiComponentPart025State0001;
    private InteractiveComponent interactiveComponentState0010;
    private UiComponentPart033 uiComponentPart033State0001;
    static String stringState0344;
    static SceneWidget sceneWidgetState0079;

    public final void performAction1162(UiComponentPart025 uiComponentPart025Argument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument3 >= -87) {
            return;
          }
          if (0 == integerArgument4) {
            LoginCredentials.performAction0896(true, "terms.ws");
            return;
          }
          if (integerArgument4 == 1) {
            LoginCredentials.performAction0896(true, "privacy.ws");
            return;
          }
          if (integerArgument4 != 2) {
            return;
          }
          LoginCredentials.performAction0896(true, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("md.PA(");
          if (uiComponentPart025Argument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    UiComponentPart018(UiComponentPart033 uiComponentPart033Argument1) {
        super(0, 0, 288, 0, (CallbackContract004) null);
        String stringLocal1 = null;
        int integerLocal2 = 0;
        MixedSupport001 mixedSupport001Local3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        try {
          this.uiComponentPart033State0001 = uiComponentPart033Argument1;
          this.interactiveComponentState0010 = new InteractiveComponent(MixedSupport034.stringState0163, (CallbackContract006) null);
          this.interactiveComponentState0010.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport041());
          stringLocal1 = CollectionSupport001.computeString0336(118, MixedSupport057.stringState0247, new String[]{this.computeString1165((byte) 60), this.computeString1164((byte) 57)});
          integerLocal2 = 20;
          mixedSupport001Local3 = new MixedSupport001(GameDomainSupport003.bitmapFontState0015, 0, 0, 0, 0, 16777215, -1, 3, 0, GameDomainSupport003.bitmapFontState0015.integerState0518, -1, 2147483647, true);
          this.uiComponentPart025State0001 = new UiComponentPart025(stringLocal1, mixedSupport001Local3);
          this.uiComponentPart025State0001.stringState0080 = "";
          this.uiComponentPart025State0001.performAction1544(MixedSupport112.stringState0464, 0, 1);
          this.uiComponentPart025State0001.performAction1544(MixedSupport112.stringState0464, 1, 1);
          this.uiComponentPart025State0001.integerState0107 = -40 + this.integerState0107;
          this.uiComponentPart025State0001.callbackContract006State0001 = (CallbackContract006) (this);
          this.uiComponentPart025State0001.performAction1546(15, 26, integerLocal2, this.integerState0107 - 40);
          integerLocal2 = integerLocal2 + (this.uiComponentPart025State0001.integerState0108 + 15);
          this.performAction1012(this.uiComponentPart025State0001, (byte) -55);
          integerLocal4 = 4;
          integerLocal5 = 200;
          this.interactiveComponentState0010.performAction0241(40, integerLocal5, 300 - integerLocal5 >> 1, integerLocal2, -16555);
          this.interactiveComponentState0010.callbackContract006State0001 = (CallbackContract006) (this);
          this.performAction1012(this.interactiveComponentState0010, (byte) -55);
          this.performAction0241(integerLocal4 + 55 + integerLocal2, 300, 0, 0, -16555);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "md.<init>(" + (uiComponentPart033Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String computeString1161(int integerArgument1, String stringArgument2, boolean booleanArgument3) {
        String stackStringLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        CipherPacketBuffer stackCipherPacketBufferLocal4 = null;
        int stackIntegerLocal5 = 0;
        boolean stackBooleanLocal6 = false;
        Object stackObjectLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        String stringLocal15 = null;
        SceneWidgetPart014 sceneWidgetPart014Local16 = null;
        SceneWidgetPart014 sceneWidgetPart014Local17 = null;
        CipherPacketBuffer cipherPacketBufferLocal18 = null;
        CharSequence charSequenceLocal19 = null;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          charSequenceLocal19 = (CharSequence) ((Object) stringArgument2);
          if (!MixedSupport023.computeBoolean0371(charSequenceLocal19, (byte) -70)) {
            stackStringLocal1 = RenderingSupport003.stringState0199;
            return stackStringLocal1;
          }
          if (2 != ThemeTips.integerState0351) {
            stackStringLocal2 = MixedSupport075.stringState0316;
            return stackStringLocal2;
          }
          sceneWidgetPart014Local17 = MixedSupport029.computeSceneWidgetPart0140448(stringArgument2, (byte) -94);
          if (sceneWidgetPart014Local17 == null) {
            stackStringLocal3 = CollectionSupport001.computeString0336(94, MixedSupport151.stringState0607, new String[]{stringArgument2});
            return stackStringLocal3;
          }
          UiComponentPart025.nodeDequeState0027.computeHashNode1961(64, sceneWidgetPart014Local17);
          while (true) {
            sceneWidgetPart014Local16 = (SceneWidgetPart014) (UiComponentPart025.nodeDequeState0027.computeHashNode1974(true));
            if (sceneWidgetPart014Local16 != null) {
              sceneWidgetPart014Local16.integerState0920 = sceneWidgetPart014Local16.integerState0920 - 1;
              continue;
            }
            break;
          }
          sceneWidgetPart014Local17.performAction0161((byte) 119);
          sceneWidgetPart014Local17.performAction0145((byte) 121);
          integerState0502 = integerState0502 - 1;
          cipherPacketBufferLocal18 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal18.performAction1861(integerArgument1, -4);
          cipherPacketBufferLocal18.position = cipherPacketBufferLocal18.position + 1;
          integerLocal13 = cipherPacketBufferLocal18.position;
          cipherPacketBufferLocal18.performAction2073(true, 1);
          cipherPacketBufferLocal18.performAction2066(0, stringArgument2);
          if (booleanArgument3) {
            stringLocal15 = (String) null;
            UiComponentPart018.computeString1161(-20, (String) null, false);
          }
          stackCipherPacketBufferLocal4 = cipherPacketBufferLocal18;
          stackIntegerLocal5 = cipherPacketBufferLocal18.position - integerLocal13;
          stackBooleanLocal6 = !(booleanArgument3);
          ((CipherPacketBuffer) (Object) stackCipherPacketBufferLocal4).performAction2079(stackIntegerLocal5, stackBooleanLocal6);
          stackObjectLocal7 = null;
          return (String) (stackObjectLocal7);
        } catch (java.lang.RuntimeException caughtParameterLocal20) {
          caughtExceptionLocal11 = caughtParameterLocal20;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal12;
          stackStringBuilderLocal9 = new StringBuilder().append("md.E(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    private final String computeString1164(byte byteArgument1) {
        if (byteArgument1 != 57) {
          UiComponentPart025 uiComponentPart025Local1 = (UiComponentPart025) null;
          this.performAction1162((UiComponentPart025) null, -92, 49, 97);
          return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (super.computeBoolean0198(-119, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          if (integerArgument2 == 98) {
            stackBooleanLocal3 = this.computeBoolean1010(uiComponentArgument3, (byte) -57);
            return stackBooleanLocal3;
          }
          if (integerArgument2 == 99) {
            stackBooleanLocal4 = this.computeBoolean1009(32, uiComponentArgument3);
            return stackBooleanLocal4;
          }
          integerLocal1 = -29 / ((-22 - integerArgument1) / 49);
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("md.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (byteArgument1 != 67) {
            stringState0343 = (String) null;
          }
          if (interactiveComponentArgument3 != this.interactiveComponentState0010) {
            return;
          }
          RenderingSupport006.performAction0846((byte) -51);
          this.uiComponentPart033State0001.performAction0655(69);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("md.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction1160(int integerArgument1, int integerArgument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
        cipherPacketBufferLocal1.performAction2073(true, 3);
        cipherPacketBufferLocal1.performAction2073(true, integerArgument1);
        cipherPacketBufferLocal1.performAction2087(integerArgument1 ^ -10, integerArgument3);
    }

    private final String computeString1165(byte byteArgument1) {
        if (byteArgument1 != 60) {
          this.uiComponentPart033State0001 = (UiComponentPart033) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void performAction1163(byte byteArgument1) {
        if (byteArgument1 > 62) {
          stringState0343 = null;
          stringArrayState0021 = null;
          sceneWidgetState0079 = null;
          stringState0344 = null;
          return;
        }
        stringState0343 = (String) null;
        stringState0343 = null;
        stringArrayState0021 = null;
        sceneWidgetState0079 = null;
        stringState0344 = null;
    }

    static {
        stringArrayState0021 = new String[8];
        stringState0343 = "<%0> has been removed.";
        stringState0344 = "Specials enabled:";
    }
}
