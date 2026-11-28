/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport056 {
    int integerState0286;
    int integerState0287;
    static int[] integerArrayState0064;
    int integerState0288;
    String stringState0238;
    static int integerState0289;
    int integerState0290;
    SceneWidget sceneWidgetState0049;
    boolean booleanState0070;
    int integerState0291;
    static String stringState0239;
    int[] integerArrayState0065;
    static String stringState0240;
    String stringState0241;
    static String stringState0242;
    String stringState0243;
    String stringState0244;
    long longState0021;

    final int computeInteger0669(byte byteArgument1) {
        if (!this.booleanState0070 && (2 != this.integerState0290 ||
          this.integerState0288 <= 0)) {
          if (~MixedSupport127.longState0050 == ~this.longState0021) {
            return 1;
          }
          if (2 == ThemeTips.integerState0351 &&
            RenderingSupport012.computeBoolean1345(this.stringState0238, 3)) {
            return 1;
          }
          if (byteArgument1 == 94) {
            return 0;
          }
          this.stringState0243 = (String) null;
          return 0;
        }
        return 2;
    }

    final static boolean computeBoolean0666(byte byteArgument1) {
        if (byteArgument1 != -53) {
          return false;
        }
        return InputAdapter003.computeBoolean1490(TextLayout.stringState0081, 113, MixedSupport043.longState0017);
    }

    final static void performAction0668(java.awt.Canvas canvasArgument1, byte byteArgument2) {
        java.awt.Canvas canvasLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          ProxyAuthenticationRequiredException.attachKeyboardListeners((java.awt.Component) ((Object) canvasArgument1), false);
          if (byteArgument2 >= -29) {
            canvasLocal1 = (java.awt.Canvas) null;
            MixedSupport056.performAction0668((java.awt.Canvas) null, (byte) -79);
          }
          InputAdapter001.attachMouseListeners(-2204, (java.awt.Component) ((Object) canvasArgument1));
          if (MixedSupport127.mouseWheelInputState0001 != null) {
            MixedSupport127.mouseWheelInputState0001.attachToComponent((java.awt.Component) ((Object) canvasArgument1), -63);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("hl.C(");
          if (canvasArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(byteArgument2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        stringState0240 = null;
        if (integerArgument1 != -21128) {
          MixedSupport056.clearStaticReferences(-128);
        }
        integerArrayState0064 = null;
        stringState0242 = null;
        stringState0239 = null;
    }

    MixedSupport056(boolean booleanArgument1) {
        this.integerState0291 = Bzip2State.integerState0873;
        this.longState0021 = MixedSupport036.longState0015;
        this.stringState0244 = MixedSupport106.stringState0456;
        this.stringState0243 = ResourceSupport001.stringState0012;
        this.integerState0286 = MixedSupport058.integerState0318;
        this.integerState0288 = MixedSupport121.integerState0777;
        if (!booleanArgument1) {
          this.integerArrayState0065 = null;
        } else {
          this.integerArrayState0065 = MixedSupport034.integerArrayState0043;
        }
        this.integerState0290 = BirthDateChatEnableForm.integerState0505;
        this.booleanState0070 = MixedSupport043.booleanState0050;
        this.integerState0287 = ClientException.integerState0141;
        this.stringState0241 = FullscreenStatusDialog.stringState0248;
        this.stringState0238 = MixedSupport112.stringState0489;
    }

    MixedSupport056(int integerArgument1, String stringArgument2, int integerArgument3, String stringArgument4, String stringArgument5) {
        try {
          this.integerState0291 = 0;
          this.integerState0286 = 0;
          this.integerState0290 = integerArgument1;
          this.stringState0244 = stringArgument4;
          this.integerState0288 = 0;
          this.integerState0287 = integerArgument3;
          this.integerArrayState0065 = null;
          this.longState0021 = 0L;
          this.stringState0238 = stringArgument2;
          this.stringState0241 = stringArgument5;
          this.booleanState0070 = true;
          this.stringState0243 = stringArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "hl.<init>(" + integerArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + (stringArgument4 != null ? "{...}" : "null") + ',' + (stringArgument5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        integerArrayState0064 = new int[4];
        stringState0239 = "Decline invitation to <%0>'s game";
        stringState0240 = "Who can join";
        stringState0242 = null;
    }
}
