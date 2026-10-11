/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport062 {
    static boolean booleanState0078;
    private String stringState0259;
    static RgbSprite rgbSpriteState0021;
    static int integerState0332;
    static String stringState0260;

    final boolean computeBoolean0824(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          integerLocal1 = -19 % ((42 - integerArgument2) / 60);
          stackBooleanLocal3 = this.stringState0259.equals(stringArgument1);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("ij.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final void performAction0821(int integerArgument1, java.applet.Applet appletArgument2) {
        try {
          if (integerArgument1 >= -40) {
            booleanState0078 = true;
          }
          MixedSupport104.performAction1408(appletArgument2, "jagex-last-login-method", 31536000L, (byte) 96, this.stringState0259);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ij.C(" + integerArgument1 + ',' + (appletArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0823(int integerArgument1, PacketBuffer packetBufferArgument2, String stringArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        byte[] byteArrayLocal3 = null;
        String stringLocal4 = null;
        CharSequence charSequenceLocal5 = null;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          integerLocal1 = packetBufferArgument2.position;
          charSequenceLocal5 = (CharSequence) ((Object) stringArgument3);
          byteArrayLocal3 = SceneWidgetNode.computeByteArray1035(integerArgument1 ^ -18547, charSequenceLocal5);
          packetBufferArgument2.performAction2084(byteArrayLocal3.length, 57);
          packetBufferArgument2.position = packetBufferArgument2.position + NetworkSupport007.mixedSupport068State0001.computeInteger0934(packetBufferArgument2.payload, byteArrayLocal3, byteArrayLocal3.length, packetBufferArgument2.position, 0, 8);
          if (integerArgument1 != -20539) {
            stringLocal4 = (String) null;
            MixedSupport062.computeBoolean0825((String) null, (String) null, (byte) -115);
          }
          stackIntegerLocal6 = -integerLocal1 + packetBufferArgument2.position;
          return stackIntegerLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal2;
          stackStringBuilderLocal8 = new StringBuilder().append("ij.D(").append(integerArgument1).append(',');
          if (packetBufferArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    public static void performAction0819(int integerArgument1) {
        if (integerArgument1 < -38) {
          rgbSpriteState0021 = null;
          stringState0260 = null;
          return;
        }
        String stringLocal1 = (String) null;
        MixedSupport062.computeBoolean0825((String) null, (String) null, (byte) -11);
        rgbSpriteState0021 = null;
        stringState0260 = null;
    }

    final static String computeString0822(int integerArgument1, CharSequence charSequenceArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (integerArgument1 == 5) {
            stackStringLocal3 = MixedSupport151.computeString2019(false, charSequenceArgument2, integerArgument1 - 5);
            return stackStringLocal3;
          }
          stackStringLocal2 = (String) null;
          return stackStringLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ij.E(").append(integerArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean computeBoolean0825(String stringArgument1, String stringArgument2, byte byteArgument3) {
        String stringLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        try {
          stringArgument2 = MixedSupport069.computeString0936('_', stringArgument2, "", -1);
          if (byteArgument3 > -101) {
            MixedSupport062.performAction0820(-68, -120);
          }
          stringLocal1 = MixedSupport094.computeString1307(stringArgument1, -1);
          stackBooleanLocal2 = (stringArgument2.indexOf(stringArgument1) != -1) || (-1 != stringArgument2.indexOf(stringLocal1));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("ij.G(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument3).append(')').toString());
        }
    }

    final static void performAction0820(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        GameSession.integerState0618 = integerArgument1;
        if (UiComponentPart003.integerState0073 != UiComponentPart009.integerState0149) {
          integerLocal1 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
          integerLocal2 = integerLocal1 - UiComponentPart003.integerState0073 * UiComponentPart003.integerState0073;
          integerArgument1 = integerArgument1 + integerLocal2 * (MixedSupport003.integerState0017 - integerArgument1) / integerLocal1;
        }
        if (integerArgument2 <= -24) {
          RichTextLayout.sceneWidgetState0021.performAction1994(640, 0, integerArgument1, 120, MixedSupport146.integerState0857);
          MixedSupport049.performAction0647(-24 + MixedSupport003.integerState0017, MixedSupport064.integerState0335, 640, CollectionSupport003.integerState0540, 0, 5, (byte) -113);
          return;
        }
        MixedSupport062.performAction0819(105);
        RichTextLayout.sceneWidgetState0021.performAction1994(640, 0, integerArgument1, 120, MixedSupport146.integerState0857);
        MixedSupport049.performAction0647(-24 + MixedSupport003.integerState0017, MixedSupport064.integerState0335, 640, CollectionSupport003.integerState0540, 0, 5, (byte) -113);
    }

    MixedSupport062(String stringArgument1) {
        try {
          this.stringState0259 = stringArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ij.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        booleanState0078 = true;
        stringState0260 = "Player Name: ";
    }
}
