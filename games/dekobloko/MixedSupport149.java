/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport149 extends HashNode {
    static String stringState0596;
    int integerState0876;
    static String stringState0597;
    static int integerState0877;
    int integerState0878;
    int integerState0879;
    static int integerState0880;
    int integerState0881;
    int integerState0882;
    static RenderingSupport015 renderingSupport015State0005;
    static int integerState0883;
    ReturnedShape returnedShapeState0001;

    final static boolean computeBoolean1989(int[] integerArrayArgument1, long longArgument2, String stringArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        SceneWidgetPart005 sceneWidgetPart005Local3 = null;
        CharSequence charSequenceLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (!MixedSupport101.computeBoolean1391(integerArgument5, 2, longArgument2, stringArgument3, integerArrayArgument1)) {
            return false;
          }
          if (integerArgument5 == 1) {
            integerArgument5 = 0;
          }
          MixedSupport029.stringState0149 = stringArgument3;
          NetworkSupport010.integerState0585 = integerArgument5;
          integerLocal1 = -49 / ((-60 - integerArgument4) / 43);
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument3);
          TextLayout.stringState0081 = ComponentContainer.computeString1011(charSequenceLocal4, (byte) 2);
          MixedSupport043.longState0017 = longArgument2;
          sceneWidgetPart005Local3 = MixedSupport150.computeSceneWidgetPart0052010(integerArrayArgument1, ResourceSupport001.sceneWidgetState0001, (byte) -127, MixedSupport040.sceneWidgetState0031, MixedSupport113.sceneWidgetState0103);
          DualNode.performAction0138((byte) 120, sceneWidgetPart005Local3);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("vm.D(");
          if (integerArrayArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(longArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction1988(MixedSupport015 mixedSupport015Argument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument4 != -11) {
            integerState0877 = -57;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "vm.E(" + (mixedSupport015Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final static boolean computeBoolean1986(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1;
        int integerLocal2;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        integerLocal1 = 104 % ((3 - integerArgument1) / 61);
        if (MixedSupport071.sceneWidgetPart001State0001 == null) {
          if (!LoginCredentials.booleanState0085) {
            if (!GameDomainSupport004.booleanState0087 &&
              MixedSupport153.integerState0931 != 9 &&
              MixedSupport153.integerState0931 != 10 &&
              MixedSupport153.integerState0931 != 11) {
              if (MixedSupport153.integerState0931 == 80 &&
                PlatformSupport006.computeBoolean1564(2)) {
                LoginCredentials.booleanState0085 = true;
                return true;
              }
              return false;
            }
            return MixedSupport129.computeBoolean1829(integerArgument2, 102, integerArgument4);
          }
          if (!PlatformSupport006.computeBoolean1564(2)) {
            return false;
          }
          stackIntegerLocal4 = (!SceneWidgetPart008.computeBoolean1288(integerArgument3, 1, integerArgument4)) ? 0 : 1;
          integerLocal2 = stackIntegerLocal4;
          if (MixedSupport153.integerState0931 == 80 ||
            MixedSupport153.integerState0931 == 84) {
            LoginCredentials.booleanState0085 = false;
            integerLocal2 = 1;
          }
        } else {
          if (13 == MixedSupport153.integerState0931) {
            MixedSupport071.sceneWidgetPart001State0001 = null;
            return true;
          }
          if (!LoginCredentials.booleanState0085) {
            if (GameDomainSupport004.booleanState0087) {
              return MixedSupport129.computeBoolean1829(integerArgument2, 102, integerArgument4);
            }
            if (MixedSupport153.integerState0931 == 9) {
              return MixedSupport129.computeBoolean1829(integerArgument2, 102, integerArgument4);
            }
            if (MixedSupport153.integerState0931 != 10 &&
              MixedSupport153.integerState0931 != 11) {
              if (MixedSupport153.integerState0931 == 80 &&
                PlatformSupport006.computeBoolean1564(2)) {
                LoginCredentials.booleanState0085 = true;
                return true;
              }
              return false;
            }
            return MixedSupport129.computeBoolean1829(integerArgument2, 102, integerArgument4);
          }
          if (!PlatformSupport006.computeBoolean1564(2)) {
            return false;
          }
          stackIntegerLocal3 = (!SceneWidgetPart008.computeBoolean1288(integerArgument3, 1, integerArgument4)) ? 0 : 1;
          integerLocal2 = stackIntegerLocal3;
          if (MixedSupport153.integerState0931 == 80) {
            LoginCredentials.booleanState0085 = false;
            integerLocal2 = 1;
          } else {
            if (MixedSupport153.integerState0931 == 84) {
              LoginCredentials.booleanState0085 = false;
              integerLocal2 = 1;
            }
          }
        }
        if (13 == MixedSupport153.integerState0931) {
          BufferedSocket.performAction1554((byte) 94);
          LoginCredentials.booleanState0085 = false;
          integerLocal2 = 1;
        }
        return integerLocal2 != 0;
    }

    public static void performAction1985(int integerArgument1) {
        renderingSupport015State0005 = null;
        stringState0596 = null;
        if (integerArgument1 < 120) {
          integerState0883 = -61;
          stringState0597 = null;
          return;
        }
        stringState0597 = null;
    }

    final static void performAction1987(int integerArgument1, SceneWidgetPart005 sceneWidgetPart005Argument2) {
        try {
          MixedSupport059.sceneWidgetState0055.performAction1998(sceneWidgetPart005Argument2, -16834);
          int integerLocal1 = 14 / ((55 - integerArgument1) / 49);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "vm.B(" + integerArgument1 + ',' + (sceneWidgetPart005Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String computeString1990(int integerArgument1) {
        if (integerArgument1 != -30185) {
          integerState0877 = 3;
          return MixedSupport056.stringState0242;
        }
        return MixedSupport056.stringState0242;
    }

    MixedSupport149() {
    }

    static {
        stringState0597 = "Name";
        stringState0596 = "Withdraw invitation to <%0> to join this game";
        renderingSupport015State0005 = new RenderingSupport015();
    }
}
