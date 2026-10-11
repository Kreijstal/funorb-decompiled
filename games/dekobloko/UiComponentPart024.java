/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart024 extends UiComponentPart032 {
    static String stringState0435;
    private UiComponentPart028 uiComponentPart028State0003;
    static String[] stringArrayState0032;
    static int integerState0592;
    private UiComponentPart028 uiComponentPart028State0004;
    private boolean booleanState0136;
    static boolean booleanState0137;
    static int[] integerArrayState0184;
    private UiComponentPart028 uiComponentPart028State0005;

    final static void performAction1451(int integerArgument1, long longArgument2, String stringArgument3) {
        CharSequence charSequenceLocal1 = null;
        try {
          MixedSupport029.stringState0149 = stringArgument3;
          NetworkSupport010.integerState0585 = 2;
          charSequenceLocal1 = (CharSequence) ((Object) stringArgument3);
          TextLayout.stringState0081 = ComponentContainer.computeString1011(charSequenceLocal1, (byte) 2);
          int integerLocal2 = -54 / ((-27 - integerArgument1) / 54);
          MixedSupport043.longState0017 = longArgument2;
          MixedSupport141.performAction1911(0);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.M(" + integerArgument1 + ',' + longArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument2 > -103) {
          return;
        }
        super.performAction0175(integerArgument1, -120, integerArgument3, integerArgument4);
        if (integerArgument3 != 0) {
          return;
        }
        integerArgument1 = integerArgument1 + this.integerState0110;
        integerArgument4 = integerArgument4 + this.integerState0104;
        this.performAction1452(integerArgument1, InputAdapter004.stringState0356, integerArgument4, this.uiComponentPart028State0003, 0);
        this.performAction1452(integerArgument1, PlatformSupport006.stringState0454, integerArgument4, this.uiComponentPart028State0004, 0);
        this.performAction1452(integerArgument1, MixedSupport104.stringState0419, integerArgument4, this.uiComponentPart028State0005, 0);
    }

    final static void performAction1450(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, String stringArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (integerArgument6 < 126) {
            UiComponentPart024.performAction1456(false, true, false);
          }
          if (0 != MixedSupport121.sceneWidgetState0111.integerState0891 &&
            !MixedSupport151.booleanState0221) {
            if (PacketBuffer.booleanState0228) {
              NetworkSupport001.performAction0067(-1045);
            } else {
              LoginCredentials.booleanState0085 = true;
            }
          }
          if (LoginCredentials.booleanState0085) {
            DiagnosticSupport002.performAction0862(20, integerArgument4, 113, integerArgument2, integerArgument8, integerArgument7, integerArgument7, stringArgument5, integerArgument1);
            UiComponentPart031.sceneWidgetState0116.performAction2002(false, booleanArgument3);
            if (!booleanArgument3) {
              return;
            }
            if (SceneWidgetPart013.sceneWidgetState0139.integerState0891 != 0) {
              LoginCredentials.booleanState0085 = false;
            }
            if (RenderingSupport001.sceneWidgetState0004.integerState0891 != 0) {
              BufferedSocket.performAction1554((byte) 94);
              LoginCredentials.booleanState0085 = false;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("pn.N(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(',').append(integerArgument4).append(',');
          if (stringArgument5 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    private UiComponentPart024(CallbackContract004 callbackContract004Argument1, boolean booleanArgument2) {
        super(0, 0, 0, 0, (CallbackContract004) null);
        try {
          this.uiComponentPart028State0003 = (UiComponentPart028) ((Object) new UiComponentPart021("", (CallbackContract006) null, 2));
          this.uiComponentPart028State0004 = (UiComponentPart028) ((Object) new UiComponentPart021("", (CallbackContract006) null, 2));
          this.uiComponentPart028State0005 = (UiComponentPart028) ((Object) new UiComponentPart021("", (CallbackContract006) null, 4));
          this.uiComponentPart028State0005.callbackContract004State0006 = callbackContract004Argument1;
          this.uiComponentPart028State0004.callbackContract004State0006 = callbackContract004Argument1;
          this.uiComponentPart028State0003.callbackContract004State0006 = callbackContract004Argument1;
          this.booleanState0136 = booleanArgument2 ? true : false;
          if (!this.booleanState0136) {
            this.performAction1012(this.uiComponentPart028State0003, (byte) -55);
            this.performAction1012(this.uiComponentPart028State0004, (byte) -55);
          } else {
            this.performAction1012(this.uiComponentPart028State0004, (byte) -55);
            this.performAction1012(this.uiComponentPart028State0003, (byte) -55);
          }
          this.performAction1012(this.uiComponentPart028State0005, (byte) -55);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.<init>(" + (callbackContract004Argument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ')');
        }
    }

    final int computeInteger1457(boolean booleanArgument1) {
        NumberFormatException numberFormatExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        Throwable caughtExceptionLocal4 = null;
        try {
          if (!booleanArgument1) {
            stackIntegerLocal3 = -1 + Integer.parseInt(this.uiComponentPart028State0004.stringState0078);
            return stackIntegerLocal3;
          }
          stackIntegerLocal2 = 6;
          return stackIntegerLocal2;
        } catch (java.lang.NumberFormatException caughtParameterLocal5) {
          caughtExceptionLocal4 = caughtParameterLocal5;
          numberFormatExceptionLocal1 = (NumberFormatException) (Object) caughtExceptionLocal4;
          return -1;
        }
    }

    final static void performAction1453(int integerArgument1, PacketBuffer packetBufferArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        try {
          UiComponentPart008.integerState0144 = packetBufferArgument2.computeInteger2089(3) << 5;
          integerLocal1 = packetBufferArgument2.computeInteger2085((byte) -39);
          SceneWidgetPart012.integerState0783 = integerLocal1 << 18 & 1835008;
          UiComponentPart008.integerState0144 = UiComponentPart008.integerState0144 + (integerLocal1 >> 3);
          SceneWidgetPart012.integerState0783 = SceneWidgetPart012.integerState0783 + (packetBufferArgument2.computeInteger2089(3) << 2);
          integerLocal2 = packetBufferArgument2.computeInteger2085((byte) -59);
          MixedSupport096.integerState0549 = (integerLocal2 & integerArgument1) << 15;
          SceneWidgetPart012.integerState0783 = SceneWidgetPart012.integerState0783 + (integerLocal2 >> 6);
          MixedSupport096.integerState0549 = MixedSupport096.integerState0549 + (packetBufferArgument2.computeInteger2085((byte) -105) << 7);
          integerLocal3 = packetBufferArgument2.computeInteger2085((byte) -81);
          MixedSupport149.integerState0877 = (1 & integerLocal3) << 16;
          MixedSupport096.integerState0549 = MixedSupport096.integerState0549 + (integerLocal3 >> 1);
          MixedSupport149.integerState0877 = MixedSupport149.integerState0877 + packetBufferArgument2.computeInteger2089(integerArgument1 - 60);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.P(" + integerArgument1 + ',' + (packetBufferArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    UiComponentPart024(CallbackContract004 callbackContract004Argument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        this(callbackContract004Argument1, booleanArgument2);
        try {
          this.performAction0241(integerArgument6, integerArgument5, integerArgument3, integerArgument4, -16555);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.<init>(" + (callbackContract004Argument1 != null ? "{...}" : "null") + ',' + booleanArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    final String computeString0242(byte byteArgument1) {
        String stringLocal1 = this.uiComponentPart028State0004.computeString0242(byteArgument1);
        if (stringLocal1 != null) {
          return stringLocal1;
        }
        if (!this.booleanState0018) {
          return null;
        }
        return null == this.stringState0080 ? this.stringState0078 : this.stringState0080;
    }

    final int computeInteger1459(int integerArgument1) {
        NumberFormatException numberFormatExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        Throwable caughtExceptionLocal3 = null;
        if (integerArgument1 != -22079) {
          this.uiComponentPart028State0005 = (UiComponentPart028) null;
        }
        try {
          stackIntegerLocal2 = Integer.parseInt(this.uiComponentPart028State0003.stringState0078);
          return stackIntegerLocal2;
        } catch (java.lang.NumberFormatException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          numberFormatExceptionLocal1 = (NumberFormatException) (Object) caughtExceptionLocal3;
          return -1;
        }
    }

    final void performAction1449(byte byteArgument1, InputAdapter005 inputAdapter005Argument2) {
        try {
          super.performAction1449((byte) 88, inputAdapter005Argument2);
          if (byteArgument1 < 74) {
            SceneWidgetPart014 sceneWidgetPart014Local1 = (SceneWidgetPart014) null;
            UiComponentPart024.computeBoolean1455((SceneWidgetPart014) null, (SceneWidgetPart014) null, true);
          }
          this.uiComponentPart028State0003.callbackContract006State0001 = (CallbackContract006) ((Object) inputAdapter005Argument2);
          this.uiComponentPart028State0004.callbackContract006State0001 = (CallbackContract006) ((Object) inputAdapter005Argument2);
          this.uiComponentPart028State0005.callbackContract006State0001 = (CallbackContract006) ((Object) inputAdapter005Argument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.H(" + byteArgument1 + ',' + (inputAdapter005Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean computeBoolean1455(SceneWidgetPart014 sceneWidgetPart014Argument1, SceneWidgetPart014 sceneWidgetPart014Argument2, boolean booleanArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        SceneWidgetPart014 sceneWidgetPart014Local4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument3) {
            sceneWidgetPart014Local4 = (SceneWidgetPart014) null;
            UiComponentPart024.computeBoolean1455((SceneWidgetPart014) null, (SceneWidgetPart014) null, true);
          }
          integerLocal1 = -sceneWidgetPart014Argument1.integerState0920 + sceneWidgetPart014Argument2.integerState0920;
          if (MixedSupport033.stringState0159 != sceneWidgetPart014Argument2.stringState0604) {
            if (sceneWidgetPart014Argument2.stringState0604 == null) {
              integerLocal1 += 200;
            }
          } else {
            integerLocal1 -= 200;
          }
          if (MixedSupport033.stringState0159 == sceneWidgetPart014Argument1.stringState0604) {
            integerLocal1 += 200;
          } else {
            if (sceneWidgetPart014Argument1.stringState0604 == null) {
              integerLocal1 -= 200;
            }
          }
          return !(integerLocal1 <= 0);
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("pn.U(");
          if (sceneWidgetPart014Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (sceneWidgetPart014Argument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    public static void performAction1461(int integerArgument1) {
        stringArrayState0032 = null;
        integerArrayState0184 = null;
        stringState0435 = null;
        if (integerArgument1 != 33) {
          integerState0592 = 39;
        }
    }

    private final void performAction1452(int integerArgument1, String stringArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5) {
        try {
          if (integerArgument5 != 0) {
            this.uiComponentPart028State0005 = (UiComponentPart028) null;
          }
          MixedSupport011.bitmapFontState0006.performAction1224(stringArgument2, (uiComponentArgument4.integerState0107 >> 1) + uiComponentArgument4.integerState0110 + integerArgument1, integerArgument3 + (uiComponentArgument4.integerState0104 - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.S(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + (uiComponentArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ')');
        }
    }

    final void performAction0241(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        super.performAction0241(integerArgument1, integerArgument2, integerArgument3, integerArgument4, -16555);
        int integerLocal1 = integerArgument2 - 130 >> 1;
        if (this.booleanState0136) {
          this.uiComponentPart028State0004.performAction0241(integerArgument1, 25, integerLocal1, 0, -16555);
          this.uiComponentPart028State0003.performAction0241(integerArgument1, 25, 45 + integerLocal1, 0, -16555);
        } else {
          this.uiComponentPart028State0003.performAction0241(integerArgument1, 25, integerLocal1, 0, -16555);
          this.uiComponentPart028State0004.performAction0241(integerArgument1, 25, 45 + integerLocal1, 0, integerArgument5 + 0);
        }
        this.uiComponentPart028State0005.performAction0241(integerArgument1, 40, integerLocal1 + 90, 0, integerArgument5);
    }

    final int computeInteger1458(byte byteArgument1) {
        NumberFormatException numberFormatExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        Throwable caughtExceptionLocal3 = null;
        if (byteArgument1 != 48) {
          booleanState0137 = false;
        }
        try {
          stackIntegerLocal2 = Integer.parseInt(this.uiComponentPart028State0005.stringState0078);
          return stackIntegerLocal2;
        } catch (java.lang.NumberFormatException caughtParameterLocal4) {
          caughtExceptionLocal3 = caughtParameterLocal4;
          numberFormatExceptionLocal1 = (NumberFormatException) (Object) caughtExceptionLocal3;
          return -1;
        }
    }

    final boolean computeBoolean1460(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (this.uiComponentPart028State0003.stringState0078 == null) {
          return true;
        }
        if (0 == this.uiComponentPart028State0003.stringState0078.length()) {
          return true;
        }
        if (integerArgument1 <= 64) {
          return true;
        }
        if (null != this.uiComponentPart028State0004.stringState0078 &&
          0 != this.uiComponentPart028State0004.stringState0078.length()) {
          stackBooleanLocal1 = (this.uiComponentPart028State0005.stringState0078 == null) || (this.uiComponentPart028State0005.stringState0078.length() == 0);
          return stackBooleanLocal1;
        }
        return true;
    }

    final static SocketFactory computeSocketFactory1454(String stringArgument1, int integerArgument2, int integerArgument3) {
        ProxySocketFactory proxySocketFactoryLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        ProxySocketFactory stackProxySocketFactoryLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          proxySocketFactoryLocal1 = new ProxySocketFactory();
          ((SocketFactory) ((Object) proxySocketFactoryLocal1)).stringState0614 = stringArgument1;
          if (integerArgument3 != 23155) {
            UiComponentPart024.performAction1461(-1);
          }
          ((SocketFactory) ((Object) proxySocketFactoryLocal1)).integerState0927 = integerArgument2;
          stackProxySocketFactoryLocal3 = proxySocketFactoryLocal1;
          return (SocketFactory) ((Object) stackProxySocketFactoryLocal3);
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("pn.Q(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static void performAction1456(boolean booleanArgument1, boolean booleanArgument2, boolean booleanArgument3) {
        int[] integerArrayLocal1 = null;
        int[] integerArrayLocal2 = null;
        int[] integerArrayLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          MixedSupport016.performAction0224(true);
          MixedSupport048.mixedSupport076State0001 = null;
          ComponentContainer.gameSessionState0002 = new GameSession(false, 0, false, 0, 0, 3, 0, (String[]) null, 0, false, booleanArgument2, booleanArgument1);
          if (!booleanArgument2) {
            ComponentContainer.gameSessionState0002.nodeDequeState0024.performAction1963(new RenderingSupport006(MixedSupport121.stringState0511, 10, false), 2777);
          } else {
            ComponentContainer.gameSessionState0002.nodeDequeState0024.performAction1963(new RenderingSupport006(UiComponentPart016.stringState0296, 10, false), 2777);
          }
          MixedSupport007.booleanState0005 = booleanArgument3;
          UiComponentPart012.booleanState0059 = false;
          integerArrayLocal1 = MixedSupport064.integerArrayState0111;
          integerArrayLocal2 = integerArrayLocal1;
          integerArrayLocal3 = integerArrayLocal2;
          int[] integerArrayLocal6 = integerArrayLocal3;
          for (integerLocal4 = 0; integerLocal4 < 8; integerLocal4++) {
            integerArrayLocal1[integerLocal4] = 0;
          }
          MixedSupport092.performAction1301(ComponentContainer.gameSessionState0002.computeInteger1502(booleanArgument3), MixedSupport118.musicTrackArrayArrayState0001[0][0], true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pn.V(" + booleanArgument1 + ',' + booleanArgument2 + ',' + booleanArgument3 + ')');
        }
    }

    static {
        integerState0592 = 0;
        integerArrayState0184 = new int[]{40, 33, 27, 22, 18, 15, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    }
}
