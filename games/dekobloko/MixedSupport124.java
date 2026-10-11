/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport124 {
    static MixedSupport111 mixedSupport111State0011;
    static boolean booleanState0182;
    private String stringState0521;
    private boolean booleanState0183;
    private boolean booleanState0184;
    static GameApplet gameAppletState0001;
    static String stringState0522;
    static int integerState0771;
    static NetworkSupport003 networkSupport003State0003;
    static int integerState0772;
    static String stringState0523;

    public static void performAction1771(boolean booleanArgument1) {
        mixedSupport111State0011 = null;
        if (booleanArgument1) {
          return;
        }
        stringState0523 = null;
        networkSupport003State0003 = null;
        stringState0522 = null;
    }

    final static int computeInteger1769(CharSequence charSequenceArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = -43 / ((integerArgument2 + 74) / 38);
          integerLocal4 = charSequenceArgument1.length();
          integerLocal5 = 0;
          for (integerLocal1 = 0; integerLocal1 < integerLocal4; integerLocal1++) {
            integerLocal5 = (integerLocal5 << 5) + (-integerLocal5 + MixedSupport064.computeByte0848(charSequenceArgument1.charAt(integerLocal1), (byte) 28));
          }
          stackIntegerLocal7 = integerLocal5;
          return stackIntegerLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal3 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal3;
          stackStringBuilderLocal9 = new StringBuilder().append("ta.A(");
          if (charSequenceArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final static boolean computeBoolean1766(byte byteArgument1) {
        boolean stackBooleanLocal1 = false;
        if (byteArgument1 > -22) {
          MixedSupport124.performAction1771(false);
        }
        boolean frameRemainderLocal2 = true;
        if (UiComponentPart004.integerState0091 >= 20 &&
          UiComponentPart030.computeBoolean1762((byte) 124) && (!(GameDomainSupport001.integerState0052 > 0) ||
          FunOrbClient.computeBoolean0126((byte) 31))) {
          stackBooleanLocal1 = false;
          frameRemainderLocal2 = false;
        }
        else {
          stackBooleanLocal1 = true;
        }
        return stackBooleanLocal1;
    }

    final static boolean computeBoolean1770(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2, int integerArgument3, ResourceArchive resourceArchiveArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (!resourceArchiveArgument1.computeBoolean0904((byte) 121)) {
            return false;
          }
          if (!resourceArchiveArgument1.computeBoolean0918("commonui", (byte) -101)) {
            return false;
          }
          if (resourceArchiveArgument2.computeBoolean0904((byte) 121) &&
            resourceArchiveArgument2.computeBoolean0918("commonui", (byte) -117)) {
            if (resourceArchiveArgument4.computeBoolean0904((byte) 121) &&
              resourceArchiveArgument4.computeBoolean0918("button.gif", (byte) -34)) {
              if (integerArgument3 != -21) {
                stringState0523 = (String) null;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("ta.I(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',');
          if (resourceArchiveArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument3).append(',');
          if (resourceArchiveArgument4 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    final static RgbSprite[] computeRgbSpriteArray1772(boolean booleanArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        if (booleanArgument1) {
          MixedSupport124.computeRgbSpriteArray1772(false, 17, -88, -29, -62);
        }
        return UiComponentPart004.computeRgbSpriteArray0197(integerArgument4, 1, integerArgument5, 1, 1, false, integerArgument3, integerArgument2, 3);
    }

    final void performAction1768(int integerArgument1, boolean booleanArgument2) {
        this.booleanState0183 = true;
        this.booleanState0184 = booleanArgument2 ? true : false;
        if (integerArgument1 != -21) {
          MixedSupport124.performAction1771(false);
        }
    }

    final boolean computeBoolean1774(int integerArgument1) {
        if (integerArgument1 != -3348) {
          return false;
        }
        return this.booleanState0184;
    }

    final boolean computeBoolean1767(int integerArgument1) {
        if (integerArgument1 < 49) {
          return false;
        }
        return this.booleanState0183;
    }

    MixedSupport124(String stringArgument1) {
        this.booleanState0183 = false;
        this.booleanState0184 = false;
        try {
          this.stringState0521 = stringArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ta.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final String computeString1773(byte byteArgument1) {
        if (byteArgument1 < 59) {
          this.booleanState0183 = true;
        }
        return this.stringState0521;
    }

    static {
        gameAppletState0001 = null;
        stringState0522 = "Fullscreen mode";
        integerState0771 = 0;
        mixedSupport111State0011 = new MixedSupport111(1, 2, 2, 0);
        stringState0523 = "Auto-respond to <%0>";
    }
}
