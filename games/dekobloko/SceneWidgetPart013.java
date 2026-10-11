/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart013 extends SceneWidget {
    int integerState0838;
    String stringState0585;
    SceneWidget sceneWidgetState0129;
    SceneWidget sceneWidgetState0130;
    static RgbSprite[][] rgbSpriteArrayArrayState0013;
    static String stringState0586;
    boolean booleanState0199;
    static int[] integerArrayState0239;
    static int integerState0839;
    boolean booleanState0200;
    int integerState0840;
    SceneWidget sceneWidgetState0131;
    long longState0052;
    SceneWidget sceneWidgetState0132;
    int integerState0841;
    SceneWidget sceneWidgetState0133;
    SceneWidget sceneWidgetState0134;
    boolean booleanState0201;
    int integerState0842;
    SceneWidget sceneWidgetState0135;
    SceneWidget sceneWidgetState0136;
    static boolean booleanState0202;
    static boolean booleanState0203;
    int integerState0843;
    boolean booleanState0204;
    SceneWidget sceneWidgetState0137;
    SceneWidget sceneWidgetState0138;
    boolean booleanState0205;
    boolean booleanState0206;
    static SceneWidget sceneWidgetState0139;
    String[] stringArrayState0052;
    SceneWidget sceneWidgetState0140;
    int integerState0844;
    SceneWidget sceneWidgetState0141;
    SceneWidget sceneWidgetState0142;
    SceneWidget sceneWidgetState0143;
    static String stringState0587;
    static boolean booleanState0207;
    boolean booleanState0208;
    SceneWidget[] sceneWidgetArrayState0009;
    SceneWidget sceneWidgetState0144;
    int integerState0845;
    long longState0053;
    static RgbSprite rgbSpriteState0062;
    int integerState0846;
    byte[] byteArrayState0032;
    SceneWidget sceneWidgetState0145;
    static int integerState0847;

    public static void performAction1939(byte byteArgument1) {
        rgbSpriteArrayArrayState0013 = (RgbSprite[][]) null;
        if (byteArgument1 == 116) {
          stringState0587 = null;
          stringState0586 = null;
          sceneWidgetState0139 = null;
          rgbSpriteState0062 = null;
          integerArrayState0239 = null;
          return;
        }
        SceneWidgetPart013.computeBoolean1938((byte) 54);
        stringState0587 = null;
        stringState0586 = null;
        sceneWidgetState0139 = null;
        rgbSpriteState0062 = null;
        integerArrayState0239 = null;
    }

    final static boolean computeBoolean1938(byte byteArgument1) {
        int integerLocal1 = -89 % ((76 - byteArgument1) / 36);
        if (MixedSupport146.sceneWidgetPart004State0001 == null) {
          return false;
        }
        if (MixedSupport146.sceneWidgetPart004State0001.computeBoolean0681(261)) {
          return true;
        }
        return false;
    }

    final boolean computeBoolean1940(byte byteArgument1) {
        if (byteArgument1 > 98) {
          return !this.computeBoolean0144((byte) -68) ? true : false;
        }
        SceneWidgetPart013.computeBoolean1938((byte) 106);
        return !this.computeBoolean0144((byte) -68) ? true : false;
    }

    final int computeInteger1937(int integerArgument1) {
        int integerLocal1 = 113 / ((integerArgument1 - 24) / 54);
        return (int)this.computeLong0143((byte) 57);
    }

    final static void performAction1934(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int[] integerArrayArgument8, int integerArgument9, int integerArgument10) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int[] integerArrayLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int[] integerArrayLocal13 = null;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument7 != 9) {
            SceneWidgetPart013.performAction1939((byte) 90);
          }
          integerArgument6--;
          while (integerArgument6 >= 0) {
            integerArrayLocal13 = integerArrayArgument8;
            integerArrayLocal5 = integerArrayLocal13;
            integerLocal7 = integerArgument2;
            integerLocal8 = integerArgument5;
            integerLocal9 = integerArgument1;
            integerLocal10 = integerArgument9;
            integerLocal11 = 8355711 & integerArrayLocal13[integerLocal7] >> 1;
            integerArrayLocal5[integerLocal7] = integerLocal11 + MixedSupport079.computeInteger1051(65280, integerLocal9 >> 9) + (MixedSupport079.computeInteger1051(integerLocal8 >> 1, 16711680) + MixedSupport079.computeInteger1051(integerLocal10 >> 17, 255));
            integerArgument5 = integerArgument5 + integerArgument4;
            integerArgument2++;
            integerArgument9 = integerArgument9 + integerArgument10;
            integerArgument1 = integerArgument1 + integerArgument3;
            integerArgument6--;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal4 = caughtParameterLocal14;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("ve.E(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (integerArrayArgument8 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument9).append(',').append(integerArgument10).append(')').toString());
        }
    }

    SceneWidgetPart013(int integerArgument1) {
        super(0L, (SceneWidget) null);
        this.byteArrayState0032 = new byte[integerArgument1];
    }

    final static String computeString1936(int integerArgument1, int integerArgument2) {
        if (integerArgument2 == 26135) {
          return integerArgument1 + 1 + "/" + 4;
        }
        return (String) null;
    }

    final boolean computeBoolean1935(SceneWidgetPart013 sceneWidgetPart013Argument1, boolean booleanArgument2) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        boolean stackBooleanLocal5 = false;
        boolean stackBooleanLocal6 = false;
        boolean stackBooleanLocal7 = false;
        int stackIntegerLocal8 = 0;
        boolean stackBooleanLocal9 = false;
        boolean stackBooleanLocal10 = false;
        int stackIntegerLocal11 = 0;
        int stackIntegerLocal12 = 0;
        int stackIntegerLocal13 = 0;
        int stackIntegerLocal14 = 0;
        boolean stackBooleanLocal15 = false;
        RuntimeException stackRuntimeExceptionLocal16 = null;
        StringBuilder stackStringBuilderLocal17 = null;
        String stackStringLocal18 = null;
        RuntimeException caughtExceptionLocal19 = null;
        int integerLocal20 = 0;
        RuntimeException runtimeExceptionLocal21 = null;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        int integerLocal24 = 0;
        try {
          if (booleanArgument2) {
            return true;
          }
          if (!this.booleanState0200) {
            stackIntegerLocal1 = (this.integerState0844 == 6) ? 1 : 0;
          } else {
            stackIntegerLocal1 = 1;
          }
          integerLocal20 = stackIntegerLocal1;
          if (!sceneWidgetPart013Argument1.booleanState0200) {
            stackIntegerLocal2 = (sceneWidgetPart013Argument1.integerState0844 == 6) ? 1 : 0;
          } else {
            stackIntegerLocal2 = 1;
          }
          integerLocal22 = stackIntegerLocal2;
          if (integerLocal22 != integerLocal20) {
            stackIntegerLocal3 = integerLocal20;
            return stackIntegerLocal3 != 0;
          }
          if (integerLocal20 == 0) {
            stackIntegerLocal4 = (sceneWidgetPart013Argument1.booleanState0205) ? 0 : 1;
            if (stackIntegerLocal4 == (this.booleanState0205 ? 1 : 0)) {
              stackBooleanLocal5 = this.booleanState0205;
              return stackBooleanLocal5;
            }
            if (this.booleanState0205 &&
              sceneWidgetPart013Argument1.integerState0842 != this.integerState0842) {
              stackBooleanLocal6 = !(this.integerState0842 >= sceneWidgetPart013Argument1.integerState0842);
              return stackBooleanLocal6;
            }
          }
          stackBooleanLocal7 = this.booleanState0204;
          if (sceneWidgetPart013Argument1.booleanState0204) {
            stackIntegerLocal8 = 0;
          } else {
            stackIntegerLocal8 = 1;
          }
          if ((stackBooleanLocal7 ? 1 : 0) == stackIntegerLocal8) {
            stackBooleanLocal9 = !(this.booleanState0204);
            return stackBooleanLocal9;
          }
          if (!this.booleanState0204) {
            stackBooleanLocal10 = !(sceneWidgetPart013Argument1.longState0052 <= this.longState0052);
            return stackBooleanLocal10;
          }
          if (this.booleanState0201) {
            stackIntegerLocal11 = 1;
          } else {
            stackIntegerLocal11 = (this.integerState0845 == 2) ? 1 : 0;
          }
          integerLocal23 = stackIntegerLocal11;
          if (!sceneWidgetPart013Argument1.booleanState0201) {
            stackIntegerLocal12 = (sceneWidgetPart013Argument1.integerState0845 == 2) ? 1 : 0;
          } else {
            stackIntegerLocal12 = 1;
          }
          integerLocal24 = stackIntegerLocal12;
          stackIntegerLocal13 = (integerLocal23 != 0) ? 0 : 1;
          if (stackIntegerLocal13 == integerLocal24) {
            stackIntegerLocal14 = integerLocal23;
            return stackIntegerLocal14 != 0;
          }
          stackBooleanLocal15 = !(sceneWidgetPart013Argument1.longState0052 >= this.longState0052);
          return stackBooleanLocal15;
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal19 = caughtParameterLocal25;
          runtimeExceptionLocal21 = caughtExceptionLocal19;
          stackRuntimeExceptionLocal16 = runtimeExceptionLocal21;
          stackStringBuilderLocal17 = new StringBuilder().append("ve.D(");
          if (sceneWidgetPart013Argument1 == null) {
            stackStringLocal18 = "null";
          } else {
            stackStringLocal18 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal16), ((StringBuilder) (Object) stackStringBuilderLocal17).append(stackStringLocal18).append(',').append(booleanArgument2).append(')').toString());
        }
    }

    static {
        integerState0839 = 10;
        rgbSpriteArrayArrayState0013 = new RgbSprite[8][];
        stringState0587 = "You are on <%0>";
        integerArrayState0239 = new int[]{0, 0, 5, 9, 12, 14, 15, 15, 14, 12, 8, 4, 2, 1};
        integerState0847 = 1;
    }
}
