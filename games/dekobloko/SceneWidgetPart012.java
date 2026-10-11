/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart012 extends SceneWidget {
    long longState0047;
    static String stringState0531;
    boolean booleanState0186;
    int integerState0780;
    SceneWidget sceneWidgetState0120;
    boolean booleanState0187;
    static boolean booleanState0188;
    static int[][] integerArrayArrayState0020;
    String stringState0532;
    SceneWidget sceneWidgetState0121;
    int integerState0781;
    int integerState0782;
    static int integerState0783;
    boolean booleanState0189;
    SceneWidget sceneWidgetState0122;
    long longState0048;
    int integerState0784;
    int integerState0785;
    SceneWidget sceneWidgetState0123;
    SceneWidget sceneWidgetState0124;
    static String stringState0533;
    String stringState0534;
    int integerState0786;

    final static int computeInteger1821(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument2 == 0) {
            stackIntegerLocal3 = MixedSupport103.computeInteger1396(byteArrayArgument3, integerArgument1, integerArgument2 - 112, 0);
            return stackIntegerLocal3;
          }
          stackIntegerLocal2 = -27;
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("tj.A(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final boolean computeBoolean1822(int integerArgument1, SceneWidgetPart012 sceneWidgetPart012Argument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        int stackIntegerLocal5 = 0;
        boolean stackBooleanLocal6 = false;
        boolean stackBooleanLocal7 = false;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          stackIntegerLocal2 = (sceneWidgetPart012Argument2.booleanState0187) ? 0 : 1;
          if (stackIntegerLocal2 == (this.booleanState0187 ? 1 : 0)) {
            stackBooleanLocal3 = this.booleanState0187;
            return stackBooleanLocal3;
          }
          if (integerArgument1 != -985) {
            this.booleanState0187 = false;
          }
          stackBooleanLocal4 = sceneWidgetPart012Argument2.booleanState0189;
          if (this.booleanState0189) {
            stackIntegerLocal5 = 0;
          } else {
            stackIntegerLocal5 = 1;
          }
          if ((stackBooleanLocal4 ? 1 : 0) != stackIntegerLocal5) {
            stackBooleanLocal7 = !(this.longState0047 >= sceneWidgetPart012Argument2.longState0047);
            return stackBooleanLocal7;
          }
          stackBooleanLocal6 = this.booleanState0189;
          return stackBooleanLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal1 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal1;
          stackStringBuilderLocal9 = new StringBuilder().append("tj.D(").append(integerArgument1).append(',');
          if (sceneWidgetPart012Argument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final static void performAction1823(boolean booleanArgument1, int integerArgument2) {
        ProxySocketFactory.integerState0732 = 0;
        if (integerArgument2 >= 97) {
          MixedSupport112.integerState0682 = 0;
          MixedSupport003.integerState0019 = PlatformSupport002.integerState0147;
          MixedSupport153.integerState0930 = 0;
          MixedSupport114.mixedSupport121State0003 = new MixedSupport121(2);
          MixedSupport114.mixedSupport121State0003.performAction1722(-1, 0, MixedSupport006.computeInteger0072(HashNode.integerState0069, MixedSupport106.integerState0590, (byte) 7), booleanArgument1);
          return;
        }
        SceneWidgetPart012.performAction1825(-61);
        MixedSupport112.integerState0682 = 0;
        MixedSupport003.integerState0019 = PlatformSupport002.integerState0147;
        MixedSupport153.integerState0930 = 0;
        MixedSupport114.mixedSupport121State0003 = new MixedSupport121(2);
        MixedSupport114.mixedSupport121State0003.performAction1722(-1, 0, MixedSupport006.computeInteger0072(HashNode.integerState0069, MixedSupport106.integerState0590, (byte) 7), booleanArgument1);
    }

    final boolean computeBoolean1826(byte byteArgument1) {
        if (byteArgument1 > 29) {
          return !this.computeBoolean0144((byte) -68) ? true : false;
        }
        this.integerState0784 = 50;
        return !this.computeBoolean0144((byte) -68) ? true : false;
    }

    final static void performAction1824(boolean booleanArgument1, java.awt.Canvas canvasArgument2) {
        ReturnedShape.performAction1623(12, (java.awt.Component) ((Object) canvasArgument2));
        if (booleanArgument1) {
          return;
        }
        try {
          InputAdapter005.performAction1529((byte) -35, (java.awt.Component) ((Object) canvasArgument2));
          if (MixedSupport134.inputAdapter003State0001 != null) {
            MixedSupport134.inputAdapter003State0001.performAction0057(68, (java.awt.Component) ((Object) canvasArgument2));
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "tj.C(" + booleanArgument1 + ',' + (canvasArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1825(int integerArgument1) {
        integerArrayArrayState0020 = (int[][]) null;
        if (integerArgument1 != -18263) {
          return;
        }
        stringState0533 = null;
        stringState0531 = null;
    }

    final static void performAction1827(byte byteArgument1) {
        if (byteArgument1 > -22) {
          return;
        }
        NetworkSupport001.sceneWidgetState0003 = new SceneWidget(0L, (SceneWidget) null);
        if (!MixedSupport102.booleanState0133) {
          NetworkSupport001.sceneWidgetState0003.performAction1998(RenderingSupport004.sceneWidgetState0039, -16834);
          MixedSupport023.mixedSupport006State0001 = new MixedSupport006(MixedSupport134.stringState0554, NetworkSupport001.sceneWidgetState0003);
          UiComponentPart011.sceneWidgetState0035 = new SceneWidget(0L, (SceneWidget) null);
          UiComponentPart011.sceneWidgetState0035.performAction1998(MixedSupport023.mixedSupport006State0001.sceneWidgetPart011State0001, -16834);
          UiComponentPart011.sceneWidgetState0035.performAction1998(IterableNodeCollection.sceneWidgetState0126, -16834);
          UiComponentPart019.performAction1177(5);
          return;
        }
        NetworkSupport001.sceneWidgetState0003.performAction1998(MixedSupport044.sceneWidgetState0034, -16834);
        NetworkSupport001.sceneWidgetState0003.performAction1998(RenderingSupport004.sceneWidgetState0039, -16834);
        MixedSupport023.mixedSupport006State0001 = new MixedSupport006(MixedSupport134.stringState0554, NetworkSupport001.sceneWidgetState0003);
        UiComponentPart011.sceneWidgetState0035 = new SceneWidget(0L, (SceneWidget) null);
        UiComponentPart011.sceneWidgetState0035.performAction1998(MixedSupport023.mixedSupport006State0001.sceneWidgetPart011State0001, -16834);
        UiComponentPart011.sceneWidgetState0035.performAction1998(IterableNodeCollection.sceneWidgetState0126, -16834);
        UiComponentPart019.performAction1177(5);
    }

    SceneWidgetPart012(String stringArgument1, String stringArgument2, long longArgument3) {
        super(0L, (SceneWidget) null);
        CharSequence charSequenceLocal1 = null;
        try {
          this.stringState0532 = stringArgument1;
          this.stringState0534 = stringArgument2;
          this.longState0048 = longArgument3;
          charSequenceLocal1 = (CharSequence) ((Object) this.stringState0532);
          ComponentContainer.computeString1011(charSequenceLocal1, (byte) 2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "tj.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + longArgument3 + ')');
        }
    }

    final void performAction1820(byte byteArgument1, String stringArgument2, String stringArgument3) {
        CharSequence charSequenceLocal1 = null;
        try {
          this.stringState0532 = stringArgument3;
          if (byteArgument1 < 10) {
            this.sceneWidgetState0124 = (SceneWidget) null;
          }
          this.stringState0534 = stringArgument2;
          charSequenceLocal1 = (CharSequence) ((Object) this.stringState0532);
          ComponentContainer.computeString1011(charSequenceLocal1, (byte) 2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "tj.K(" + byteArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0531 = "Show chat";
        stringState0533 = "Unfortunately we are unable to create an account for you at this time.";
    }
}
