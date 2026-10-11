/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioSupport002 {
    static int integerState0344;
    static MixedSupport006 mixedSupport006State0002;
    static MixedSupport016 mixedSupport016State0002;
    private int integerState0345;
    private int integerState0346;
    private int[][] integerArrayArrayState0013;

    final static MixedSupport111 computeMixedSupport1110883(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport111[] mixedSupport111ArrayLocal2;
        int integerLocal3;
        int integerLocal4;
        MixedSupport111[] mixedSupport111ArrayLocal5;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal3 = -128 / ((integerArgument1 + 53) / 58);
        mixedSupport111ArrayLocal5 = NodeDeque.computeMixedSupport111Array1975(-23521);
        mixedSupport111ArrayLocal2 = mixedSupport111ArrayLocal5;
        for (integerLocal1 = 0; integerLocal1 < mixedSupport111ArrayLocal5.length; integerLocal1++) {
          if (mixedSupport111ArrayLocal5[integerLocal1].integerState0671 == integerArgument2) {
            return mixedSupport111ArrayLocal5[integerLocal1];
          }
        }
        return null;
    }

    final byte[] computeByteArray0884(int integerArgument1, byte[] byteArrayArgument2) {
        byte[] stackByteArrayLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int[] integerArrayLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int[] integerArrayLocal16 = null;
        int[] integerArrayLocal17 = null;
        int[] integerArrayLocal18 = null;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (null != this.integerArrayArrayState0013) {
            integerLocal6 = (int)((long)this.integerState0346 * (long)byteArrayArgument2.length / (long)this.integerState0345) + 14;
            integerArrayLocal17 = new int[integerLocal6];
            integerArrayLocal16 = integerArrayLocal17;
            integerArrayLocal8 = integerArrayLocal16;
            integerLocal9 = 0;
            integerLocal10 = 0;
            for (integerLocal11 = 0; integerLocal11 < byteArrayArgument2.length; integerLocal11++) {
              integerLocal12 = byteArrayArgument2[integerLocal11];
              integerArrayLocal18 = this.integerArrayArrayState0013[integerLocal10];
              for (integerLocal13 = 0; 14 > integerLocal13; integerLocal13++) {
                integerArrayLocal8[integerLocal13 + integerLocal9] = integerArrayLocal8[integerLocal13 + integerLocal9] + integerLocal12 * integerArrayLocal18[integerLocal13];
              }
              integerLocal10 = integerLocal10 + this.integerState0346;
              integerLocal21 = integerLocal10 / this.integerState0345;
              integerLocal9 = integerLocal9 + integerLocal21;
              integerLocal10 = integerLocal10 - integerLocal21 * this.integerState0345;
            }
            byteArrayArgument2 = new byte[integerLocal6];
            integerLocal15 = 0;
            integerLocal19 = integerLocal15;
            while (integerLocal15 < integerLocal6) {
              integerLocal20 = integerArrayLocal17[integerLocal15] + 32768 >> 16;
              if (integerLocal20 >= -128) {
                if (integerLocal20 > 127) {
                  byteArrayArgument2[integerLocal15] = (byte)127;
                } else {
                  byteArrayArgument2[integerLocal15] = (byte)integerLocal20;
                }
              } else {
                byteArrayArgument2[integerLocal15] = (byte)-128;
              }
              integerLocal15++;
            }
          }
          if (integerArgument1 != 14) {
            mixedSupport006State0002 = (MixedSupport006) null;
          }
          stackByteArrayLocal1 = (byte[]) (byteArrayArgument2);
          return stackByteArrayLocal1;
        } catch (java.lang.RuntimeException caughtParameterLocal22) {
          caughtExceptionLocal5 = caughtParameterLocal22;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("je.G(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static MixedSupport016 computeMixedSupport0160882(int integerArgument1) {
        if (GameAssets.mixedSupport004State0004 == MixedSupport134.mixedSupport004State0005) {
          throw new IllegalStateException();
        }
        if (MixedSupport075.mixedSupport004State0002 == GameAssets.mixedSupport004State0004) {
          GameAssets.mixedSupport004State0004 = MixedSupport134.mixedSupport004State0005;
          return RichTextLayout.mixedSupport016State0001;
        }
        if (integerArgument1 == 13) {
          return null;
        }
        AudioSupport002.computeMixedSupport0160882(-1);
        return null;
    }

    final int computeInteger0888(int integerArgument1, int integerArgument2) {
        if (integerArgument2 < 17) {
          this.integerState0346 = 12;
        }
        if (this.integerArrayArrayState0013 != null) {
          integerArgument1 = 6 + (int)((long)this.integerState0346 * (long)integerArgument1 / (long)this.integerState0345);
        }
        return integerArgument1;
    }

    final static String computeString0885(String stringArgument1, int integerArgument2, byte byteArgument3) {
        String stackStringLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        String stackStringLocal8 = null;
        String stackStringLocal9 = null;
        String stackStringLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        RuntimeException runtimeExceptionLocal16 = null;
        String stringLocal17 = null;
        try {
          if (1 == integerArgument2) {
            stackStringLocal1 = CollectionSupport001.computeString0336(121, GameDomainSupport006.stringState0627, new String[]{stringArgument1});
            return stackStringLocal1;
          }
          if (2 == integerArgument2) {
            stackStringLocal2 = CollectionSupport001.computeString0336(121, PlatformSupport004.stringState0229, new String[]{stringArgument1});
            return stackStringLocal2;
          }
          if (byteArgument3 != -128) {
            stringLocal17 = (String) null;
            AudioSupport002.computeString0885((String) null, 71, (byte) -56);
          }
          if (3 == integerArgument2) {
            stackStringLocal3 = CollectionSupport001.computeString0336(83, MixedSupport010.stringState0046, new String[]{stringArgument1});
            return stackStringLocal3;
          }
          if (integerArgument2 == 4) {
            stackStringLocal4 = CollectionSupport001.computeString0336(106, NetworkSupport001.stringState0026, new String[]{stringArgument1});
            return stackStringLocal4;
          }
          if (integerArgument2 == 5) {
            stackStringLocal5 = CollectionSupport001.computeString0336(96, MixedSupport084.stringState0337, new String[]{stringArgument1});
            return stackStringLocal5;
          }
          if (integerArgument2 == 6) {
            stackStringLocal6 = CollectionSupport001.computeString0336(121, MixedSupport011.stringState0055, new String[]{stringArgument1});
            return stackStringLocal6;
          }
          if (integerArgument2 == 7) {
            stackStringLocal7 = CollectionSupport001.computeString0336(123, MixedSupport033.stringState0160, new String[]{stringArgument1});
            return stackStringLocal7;
          }
          if (integerArgument2 == 8) {
            stackStringLocal8 = CollectionSupport001.computeString0336(83, MixedSupport047.stringState0200, new String[]{stringArgument1});
            return stackStringLocal8;
          }
          if (integerArgument2 == 11) {
            stackStringLocal9 = CollectionSupport001.computeString0336(123, MixedSupport032.stringState0157, new String[]{stringArgument1});
            return stackStringLocal9;
          }
          if (integerArgument2 == 12) {
            stackStringLocal10 = CollectionSupport001.computeString0336(100, UiComponentPart018.stringState0343, new String[]{stringArgument1});
            return stackStringLocal10;
          }
          if (13 != integerArgument2) {
            return null;
          }
          stackStringLocal11 = CollectionSupport001.computeString0336(127, GameAssets.stringState0502, new String[]{stringArgument1});
          return stackStringLocal11;
        } catch (java.lang.RuntimeException caughtParameterLocal18) {
          caughtExceptionLocal15 = caughtParameterLocal18;
          runtimeExceptionLocal16 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal16;
          stackStringBuilderLocal13 = new StringBuilder().append("je.B(");
          if (stringArgument1 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(integerArgument2).append(',').append(byteArgument3).append(')').toString());
        }
    }

    public static void performAction0887(int integerArgument1) {
        mixedSupport006State0002 = null;
        mixedSupport016State0002 = null;
        if (integerArgument1 != 23369) {
          mixedSupport016State0002 = (MixedSupport016) null;
        }
    }

    final int computeInteger0886(boolean booleanArgument1, int integerArgument2) {
        if (booleanArgument1) {
          return -86;
        }
        if (this.integerArrayArrayState0013 != null) {
          integerArgument2 = (int)((long)this.integerState0346 * (long)integerArgument2 / (long)this.integerState0345);
        }
        return integerArgument2;
    }

    AudioSupport002(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int[] integerArrayLocal3;
        double doubleLocal4;
        int integerLocal5;
        int integerLocal6;
        double doubleLocal7;
        double doubleLocal8;
        double doubleLocal9;
        if (integerArgument2 == integerArgument1) {
          return;
        }
        integerLocal2 = InputAdapter004.computeInteger1235(43, integerArgument1, integerArgument2);
        integerArgument2 = integerArgument2 / integerLocal2;
        integerArgument1 = integerArgument1 / integerLocal2;
        this.integerState0345 = integerArgument1;
        this.integerState0346 = integerArgument2;
        this.integerArrayArrayState0013 = new int[integerArgument1][14];
        for (integerLocal1 = 0; integerLocal1 < integerArgument1; integerLocal1++) {
          integerArrayLocal3 = this.integerArrayArrayState0013[integerLocal1];
          doubleLocal4 = (double)integerLocal1 / (double)integerArgument1 + 6.0;
          integerLocal5 = (int)Math.floor(-7.0 + doubleLocal4 + 1.0);
          if (0 > integerLocal5) {
            integerLocal5 = 0;
          }
          integerLocal6 = (int)Math.ceil(doubleLocal4 + 7.0);
          if (integerLocal6 > 14) {
            integerLocal6 = 14;
          }
          doubleLocal7 = (double)integerArgument2 / (double)integerArgument1;
          while (integerLocal6 > integerLocal5) {
            doubleLocal8 = 3.141592653589793 * ((double)integerLocal5 - doubleLocal4);
            doubleLocal9 = doubleLocal7;
            if (-0.0001 > doubleLocal8 ||
              doubleLocal8 > 0.0001) {
              doubleLocal9 = doubleLocal9 * (Math.sin(doubleLocal8) / doubleLocal8);
            }
            doubleLocal9 = doubleLocal9 * (Math.cos(((double)integerLocal5 - doubleLocal4) * 0.2243994752564138) * 0.46 + 0.54);
            integerArrayLocal3[integerLocal5] = (int)Math.floor(0.5 + doubleLocal9 * 65536.0);
            integerLocal5++;
          }
        }
        return;
    }

    static {
    }
}
