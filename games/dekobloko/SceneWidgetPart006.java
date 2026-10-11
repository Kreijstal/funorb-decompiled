/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SceneWidgetPart006 extends SceneWidget {
    private int integerState0342;
    private SceneWidget sceneWidgetState0061;
    private SceneWidget sceneWidgetState0062;
    static long[] longArrayState0003;
    private SceneWidget sceneWidgetState0063;
    static String stringState0275;
    static boolean booleanState0083;
    private SceneWidget sceneWidgetState0064;
    static String stringState0276;
    static String stringState0277;
    private SceneWidget sceneWidgetState0065;
    private SceneWidget sceneWidgetState0066;
    static int integerState0343;

    final int computeInteger0874(boolean booleanArgument1, byte byteArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        if (byteArgument2 != 88) {
          return -14;
        }
        int integerLocal3 = 0;
        int integerLocal4 = -this.sceneWidgetState0066.integerState0915 + this.sceneWidgetState0065.integerState0915;
        if (0 < integerLocal4) {
          integerLocal1 = this.sceneWidgetState0066.integerState0903;
          integerLocal2 = -integerArgument3 + integerArgument4;
          integerLocal3 = (integerLocal1 * integerLocal2 + integerLocal4 / 2) / integerLocal4;
        }
        if (booleanArgument1) {
          if (integerLocal3 < 0) {
            integerLocal3 = 0;
          }
          if (integerLocal3 > -integerArgument3 + integerArgument4) {
            integerLocal3 = -integerArgument3 + integerArgument4;
            return integerLocal3;
          }
          return integerLocal3;
        }
        if (integerLocal3 > integerArgument4 - integerArgument3) {
          integerLocal3 = integerArgument4 - integerArgument3;
        }
        if (integerLocal3 < 0) {
          integerLocal3 = 0;
          return integerLocal3;
        }
        return integerLocal3;
    }

    final static byte[] computeByteArray0873(int integerArgument1, byte[] byteArrayArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        byte[] byteArrayLocal3 = null;
        byte[] stackByteArrayLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          integerLocal1 = byteArrayArgument2.length;
          byteArrayLocal3 = new byte[integerLocal1];
          MixedSupport008.performAction0082(byteArrayArgument2, 0, byteArrayLocal3, integerArgument1, integerLocal1);
          stackByteArrayLocal4 = byteArrayLocal3;
          return stackByteArrayLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("jd.C(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final boolean computeBoolean0880(byte byteArgument1) {
        if (this.sceneWidgetState0061.integerState0891 != 0) {
          this.integerState0342 = 20;
          return true;
        }
        if (this.sceneWidgetState0061.integerState0888 != 0) {
          if (this.integerState0342 > 0) {
            this.integerState0342 = this.integerState0342 - 1;
          }
          if (this.integerState0342 == 0) {
            this.integerState0342 = 3;
            return true;
          }
          if (byteArgument1 != 7) {
            this.computeBoolean0877((byte) -98);
            return false;
          }
          return false;
        }
        if (byteArgument1 == 7) {
          return false;
        }
        this.computeBoolean0877((byte) -98);
        return false;
    }

    final boolean computeBoolean0877(byte byteArgument1) {
        if (byteArgument1 >= -59) {
          this.sceneWidgetState0066 = (SceneWidget) null;
        }
        if (this.sceneWidgetState0063.integerState0891 != 0) {
          this.integerState0342 = 20;
          return true;
        }
        if (this.sceneWidgetState0063.integerState0888 == 0) {
          return false;
        }
        if (0 < this.integerState0342) {
          this.integerState0342 = this.integerState0342 - 1;
        }
        if (this.integerState0342 != 0) {
          return false;
        }
        if (this.sceneWidgetState0066.integerState0886 + this.sceneWidgetState0066.integerState0904 <= MixedSupport106.integerState0590) {
          return false;
        }
        this.integerState0342 = 3;
        return true;
    }

    final void performAction0871(int integerArgument1, byte byteArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        this.integerState0896 = integerArgument5;
        this.integerState0903 = integerArgument8;
        this.integerState0890 = integerArgument1;
        this.integerState0915 = integerArgument3;
        int integerLocal1 = 91 / ((73 - byteArgument2) / 40);
        this.performAction0872(integerArgument7, integerArgument4, -91, integerArgument6);
    }

    final static void performAction0878(int integerArgument1) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        SceneWidgetPart012 sceneWidgetPart012Local3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 <= 4) {
            return;
          }
          MixedSupport040.booleanState0047 = false;
          MixedSupport016.sceneWidgetPart013State0001 = null;
          UiComponentPart011.sceneWidgetPart013State0002 = null;
          if (null != MixedSupport057.nodeDequeState0010) {
            MixedSupport057.nodeDequeState0010.performAction1971(120);
            MixedSupport057.nodeDequeState0010 = null;
          }
          MixedSupport095.collectionSupport003State0004 = null;
          if (null != MixedSupport051.nodeDequeState0009) {
            MixedSupport051.nodeDequeState0009.performAction1971(118);
            MixedSupport051.nodeDequeState0009 = null;
          }
          MixedSupport127.collectionSupport003State0005 = null;
          if (MixedSupport096.nodeDequeState0021 != null) {
            MixedSupport096.nodeDequeState0021.performAction1971(113);
            MixedSupport096.nodeDequeState0021 = null;
          }
          GameApplet.collectionSupport003State0002 = null;
          if (MixedSupport095.collectionSupport003State0004 == null) {
            return;
          }
          sceneWidgetPart012Local3 = (SceneWidgetPart012) (MixedSupport095.collectionSupport003State0004.computeDualNode1285(-9443));
          while (sceneWidgetPart012Local3 != null) {
            sceneWidgetPart012Local3.performAction0145((byte) 69);
            sceneWidgetPart012Local3 = (SceneWidgetPart012) (MixedSupport095.collectionSupport003State0004.computeDualNode1284(-123));
          }
          MixedSupport095.collectionSupport003State0004 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal5) {
          caughtExceptionLocal4 = caughtParameterLocal5;
          runtimeExceptionLocal1 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "jd.K(" + integerArgument1 + ')');
        }
    }

    final boolean computeBoolean0879(byte byteArgument1) {
        if (0 != this.sceneWidgetState0062.integerState0891) {
          this.integerState0342 = 20;
          return true;
        }
        if (this.sceneWidgetState0062.integerState0888 == 0) {
          if (byteArgument1 >= 67) {
            return false;
          }
          this.sceneWidgetState0063 = (SceneWidget) null;
          return false;
        }
        if (this.integerState0342 > 0) {
          this.integerState0342 = this.integerState0342 - 1;
        }
        if (this.integerState0342 == 0) {
          this.integerState0342 = 3;
          return true;
        }
        if (byteArgument1 >= 67) {
          return false;
        }
        this.sceneWidgetState0063 = (SceneWidget) null;
        return false;
    }

    public static void performAction0875(int integerArgument1) {
        if (integerArgument1 != 32) {
          return;
        }
        stringState0277 = null;
        longArrayState0003 = null;
        stringState0276 = null;
        stringState0275 = null;
    }

    SceneWidgetPart006(long longArgument1, SceneWidget sceneWidgetArgument2, SceneWidget sceneWidgetArgument3, SceneWidget sceneWidgetArgument4, SceneWidget sceneWidgetArgument5) {
        super(longArgument1, (SceneWidget) null);
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        RuntimeException runtimeExceptionLocal11 = null;
        SceneWidget sceneWidgetLocal12 = null;
        SceneWidget sceneWidgetLocal13 = null;
        try {
          this.sceneWidgetState0061 = new SceneWidget(0L, sceneWidgetArgument2);
          this.sceneWidgetState0062 = new SceneWidget(0L, sceneWidgetArgument3);
          this.performAction1998(this.sceneWidgetState0061, -16834);
          this.performAction1998(this.sceneWidgetState0062, -16834);
          this.sceneWidgetState0065 = new SceneWidget(0L, (SceneWidget) null);
          this.performAction1998(this.sceneWidgetState0065, -16834);
          this.sceneWidgetState0063 = new SceneWidget(0L, sceneWidgetArgument4);
          this.sceneWidgetState0064 = new SceneWidget(0L, sceneWidgetArgument4);
          sceneWidgetLocal12 = this.sceneWidgetState0063;
          sceneWidgetLocal13 = sceneWidgetLocal12;
          this.sceneWidgetState0064.booleanState0214 = true;
          sceneWidgetLocal13.booleanState0214 = true;
          this.sceneWidgetState0065.performAction1998(this.sceneWidgetState0063, -16834);
          this.sceneWidgetState0065.performAction1998(this.sceneWidgetState0064, -16834);
          this.sceneWidgetState0066 = new SceneWidget(0L, sceneWidgetArgument5);
          this.sceneWidgetState0066.booleanState0219 = true;
          this.sceneWidgetState0065.performAction1998(this.sceneWidgetState0066, -16834);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal10 = caughtParameterLocal14;
          runtimeExceptionLocal11 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal11;
          stackStringBuilderLocal2 = new StringBuilder().append("jd.<init>(").append(longArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (sceneWidgetArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (sceneWidgetArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (sceneWidgetArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(')').toString());
        }
    }

    final void performAction0872(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        SceneWidget sceneWidgetLocal7 = null;
        int integerLocal8 = 0;
        SceneWidget sceneWidgetLocal9 = null;
        SceneWidget sceneWidgetLocal10 = null;
        SceneWidget sceneWidgetLocal11 = null;
        SceneWidget sceneWidgetLocal12 = null;
        SceneWidget sceneWidgetLocal13 = null;
        SceneWidget sceneWidgetLocal14;
        SceneWidget sceneWidgetLocal15;
        SceneWidget sceneWidgetLocal16;
        SceneWidget sceneWidgetLocal17;
        SceneWidget sceneWidgetLocal18;
        SceneWidget sceneWidgetLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        if (this.integerState0915 >= 2 * this.integerState0896) {
          integerLocal1 = -this.integerState0896 + this.integerState0915;
          integerLocal2 = this.integerState0896;
        } else {
          integerLocal1 = this.integerState0915 / 2;
          integerLocal2 = this.integerState0915 / 2;
        }
        int integerLocal25 = integerLocal1 - integerLocal2;
        int integerLocal26 = integerLocal25;
        if (0 < integerArgument2) {
          integerLocal26 = integerLocal26 * integerArgument1 / integerArgument2;
          if (!(this.integerState0896 <= integerLocal26)) {
            integerLocal26 = this.integerState0896;
          }
          if (integerLocal25 < integerLocal26) {
            integerLocal26 = integerLocal25;
          }
          integerLocal3 = integerArgument2 - integerArgument1;
          integerLocal4 = -integerLocal26 + integerLocal25;
          integerLocal5 = 0;
          if (integerLocal3 > 0) {
            integerLocal5 = (integerArgument4 * integerLocal4 + integerLocal3 / 2) / integerLocal3;
          }
          integerLocal6 = integerLocal5 + integerLocal26 / 2;
          sceneWidgetLocal7 = this.sceneWidgetState0061;
          sceneWidgetLocal7.integerState0896 = this.integerState0896;
          integerLocal8 = 103 % ((integerArgument3 + 29) / 46);
          sceneWidgetLocal7.integerState0915 = integerLocal2;
          sceneWidgetLocal7.integerState0903 = 0;
          sceneWidgetLocal7.integerState0890 = 0;
          sceneWidgetLocal9 = this.sceneWidgetState0062;
          sceneWidgetLocal9.integerState0903 = integerLocal1;
          sceneWidgetLocal9.integerState0896 = this.integerState0896;
          sceneWidgetLocal9.integerState0915 = this.integerState0915 - integerLocal1;
          sceneWidgetLocal9.integerState0890 = 0;
          sceneWidgetLocal10 = this.sceneWidgetState0065;
          sceneWidgetLocal10.integerState0915 = integerLocal25;
          sceneWidgetLocal10.integerState0896 = this.integerState0896;
          sceneWidgetLocal10.integerState0890 = 0;
          sceneWidgetLocal10.integerState0903 = integerLocal2;
          sceneWidgetLocal11 = this.sceneWidgetState0063;
          sceneWidgetLocal11.integerState0890 = 0;
          sceneWidgetLocal11.integerState0915 = integerLocal6;
          sceneWidgetLocal11.integerState0903 = 0;
          sceneWidgetLocal11.integerState0896 = this.integerState0896;
          sceneWidgetLocal12 = this.sceneWidgetState0064;
          sceneWidgetLocal12.integerState0903 = integerLocal6;
          sceneWidgetLocal12.integerState0890 = 0;
          sceneWidgetLocal12.integerState0915 = -integerLocal6 + integerLocal25;
          sceneWidgetLocal12.integerState0896 = this.integerState0896;
          sceneWidgetLocal13 = this.sceneWidgetState0066;
          sceneWidgetLocal13.integerState0896 = this.integerState0896;
          sceneWidgetLocal13.integerState0915 = integerLocal26;
          sceneWidgetLocal13.integerState0903 = integerLocal5;
          this.sceneWidgetState0065.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
          this.sceneWidgetState0062.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
          this.sceneWidgetState0061.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
          sceneWidgetLocal13.integerState0890 = 0;
          return;
        }
        integerLocal20 = integerArgument2 - integerArgument1;
        integerLocal21 = -integerLocal26 + integerLocal25;
        integerLocal22 = 0;
        if (integerLocal20 > 0) {
          integerLocal22 = (integerArgument4 * integerLocal21 + integerLocal20 / 2) / integerLocal20;
        }
        integerLocal23 = integerLocal22 + integerLocal26 / 2;
        sceneWidgetLocal14 = this.sceneWidgetState0061;
        sceneWidgetLocal14.integerState0896 = this.integerState0896;
        integerLocal24 = 103 % ((integerArgument3 + 29) / 46);
        sceneWidgetLocal14.integerState0915 = integerLocal2;
        sceneWidgetLocal14.integerState0903 = 0;
        sceneWidgetLocal14.integerState0890 = 0;
        sceneWidgetLocal15 = this.sceneWidgetState0062;
        sceneWidgetLocal15.integerState0903 = integerLocal1;
        sceneWidgetLocal15.integerState0896 = this.integerState0896;
        sceneWidgetLocal15.integerState0915 = this.integerState0915 - integerLocal1;
        sceneWidgetLocal15.integerState0890 = 0;
        sceneWidgetLocal16 = this.sceneWidgetState0065;
        sceneWidgetLocal16.integerState0915 = integerLocal25;
        sceneWidgetLocal16.integerState0896 = this.integerState0896;
        sceneWidgetLocal16.integerState0890 = 0;
        sceneWidgetLocal16.integerState0903 = integerLocal2;
        sceneWidgetLocal17 = this.sceneWidgetState0063;
        sceneWidgetLocal17.integerState0890 = 0;
        sceneWidgetLocal17.integerState0915 = integerLocal23;
        sceneWidgetLocal17.integerState0903 = 0;
        sceneWidgetLocal17.integerState0896 = this.integerState0896;
        sceneWidgetLocal18 = this.sceneWidgetState0064;
        sceneWidgetLocal18.integerState0903 = integerLocal23;
        sceneWidgetLocal18.integerState0890 = 0;
        sceneWidgetLocal18.integerState0915 = -integerLocal23 + integerLocal25;
        sceneWidgetLocal18.integerState0896 = this.integerState0896;
        sceneWidgetLocal19 = this.sceneWidgetState0066;
        sceneWidgetLocal19.integerState0896 = this.integerState0896;
        sceneWidgetLocal19.integerState0915 = integerLocal26;
        sceneWidgetLocal19.integerState0903 = integerLocal22;
        this.sceneWidgetState0065.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
        this.sceneWidgetState0062.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
        this.sceneWidgetState0061.booleanState0212 = integerArgument2 > integerArgument1 ? true : false;
        sceneWidgetLocal19.integerState0890 = 0;
    }

    SceneWidgetPart006(long longArgument1, SceneWidgetPart006 sceneWidgetPart006Argument2) {
        this(longArgument1, sceneWidgetPart006Argument2.sceneWidgetState0061, sceneWidgetPart006Argument2.sceneWidgetState0062, sceneWidgetPart006Argument2.sceneWidgetState0063, sceneWidgetPart006Argument2.sceneWidgetState0066);
    }

    final boolean computeBoolean0876(int integerArgument1) {
        if (this.sceneWidgetState0064.integerState0891 != integerArgument1) {
          this.integerState0342 = 20;
          return true;
        }
        if (this.sceneWidgetState0064.integerState0888 == 0) {
          return false;
        }
        if (this.integerState0342 > 0) {
          this.integerState0342 = this.integerState0342 - 1;
        }
        if (this.integerState0342 != 0) {
          return false;
        }
        if (MixedSupport106.integerState0590 >= this.sceneWidgetState0066.integerState0895 + (this.sceneWidgetState0066.integerState0915 + this.sceneWidgetState0066.integerState0904 + this.sceneWidgetState0066.integerState0886)) {
          this.integerState0342 = 3;
          return true;
        }
        return false;
    }

    final boolean computeBoolean0881(byte byteArgument1) {
        if (byteArgument1 == -2) {
          return this.sceneWidgetState0066.integerState0888 != 0 ? true : false;
        }
        this.performAction0872(58, -105, -107, 34);
        return this.sceneWidgetState0066.integerState0888 != 0 ? true : false;
    }

    static {
        stringState0277 = "Buying or selling an account";
        longArrayState0003 = new long[32];
        stringState0275 = "Orb points: ";
        stringState0276 = "To Highscores";
    }
}
