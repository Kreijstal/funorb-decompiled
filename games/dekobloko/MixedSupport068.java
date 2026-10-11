/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport068 {
    static String stringState0288;
    static int integerState0352;
    private int[] integerArrayState0117;
    static String stringState0289;
    static int integerState0353;
    private int[] integerArrayState0118;
    private byte[] byteArrayState0009;

    final static void performAction0933(int integerArgument1, boolean booleanArgument2) {
        int integerLocal1;
        int integerLocal2;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (Framebuffer.integerState0192 > 0) {
          if (MixedSupport081.codecSupport004State0001 == null) {
            MixedSupport020.platformSupport006State0001 = InputAdapter006.computePlatformSupport0061694(640, CodecSupport001.platformServiceState0003, 0, 0, 82, 480);
          } else {
            MixedSupport020.platformSupport006State0001 = MixedSupport081.codecSupport004State0001.computePlatformSupport0061640(27134);
            MixedSupport100.performAction1381(2, (byte) -30);
          }
          if (null == MixedSupport020.platformSupport006State0001) {
            integerLocal1 = 3;
          } else {
            MixedSupport056.performAction0747(MixedSupport020.platformSupport006State0001, (byte) -42);
            integerLocal1 = 2;
          }
        } else {
          integerLocal1 = (UiComponentPart023.computeBoolean1421(-30146)) ? 0 : 1;
        }
        if (integerArgument1 != 2) {
          integerState0352 = -30;
        }
        if (MixedSupport081.codecSupport004State0001 == null &&
          MixedSupport062.booleanState0078) {
          UiComponentPart003.performAction0176(integerArgument1 - 73, integerLocal1, booleanArgument2);
        }
    }

    public static void performAction0931(byte byteArgument1) {
        int integerLocal1 = -5 % ((-29 - byteArgument1) / 55);
        stringState0289 = null;
        stringState0288 = null;
    }

    final int computeInteger0932(int integerArgument1, byte byteArgument2, int integerArgument3, byte[] byteArrayArgument4, byte[] byteArrayArgument5, int integerArgument6) {
        int cachedIntegerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int cachedIntegerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int cachedIntegerLocal5 = 0;
        int previousIntegerLocal6 = 0;
        int cachedIntegerLocal7 = 0;
        int previousIntegerLocal8 = 0;
        int cachedIntegerLocal9 = 0;
        int previousIntegerLocal10 = 0;
        int cachedIntegerLocal11 = 0;
        int previousIntegerLocal12 = 0;
        int cachedIntegerLocal13 = 0;
        int previousIntegerLocal14 = 0;
        int cachedIntegerLocal15 = 0;
        int previousIntegerLocal16 = 0;
        int stackIntegerLocal17 = 0;
        int stackIntegerLocal18 = 0;
        RuntimeException stackRuntimeExceptionLocal19 = null;
        StringBuilder stackStringBuilderLocal20 = null;
        String stackStringLocal21 = null;
        StringBuilder stackStringBuilderLocal22 = null;
        String stackStringLocal23 = null;
        RuntimeException caughtExceptionLocal24 = null;
        int integerLocal25 = 0;
        RuntimeException runtimeExceptionLocal26 = null;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        integerLocal30 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument6 == 0) {
            stackIntegerLocal17 = 0;
            return stackIntegerLocal17;
          }
          if (byteArgument2 <= 86) {
            MixedSupport068.performAction0933(-83, true);
          }
          integerArgument6 = integerArgument6 + integerArgument3;
          integerLocal25 = 0;
          integerLocal27 = integerArgument1;
          scanLoop1: while (true) {
            integerLocal28 = byteArrayArgument5[integerLocal27];
            if (0 <= integerLocal28) {
              integerLocal25++;
            } else {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            }
            cachedIntegerLocal1 = this.integerArrayState0118[integerLocal25];
            integerLocal29 = cachedIntegerLocal1;
            if (cachedIntegerLocal1 < 0) {
              previousIntegerLocal2 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal2] = (byte)(~integerLocal29);
              if (integerArgument6 <= integerArgument3) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if ((integerLocal28 & 64) != 0) {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            } else {
              integerLocal25++;
            }
            cachedIntegerLocal3 = this.integerArrayState0118[integerLocal25];
            integerLocal31 = cachedIntegerLocal3;
            if (cachedIntegerLocal3 < 0) {
              previousIntegerLocal4 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal4] = (byte)(~integerLocal31);
              if (integerArgument3 >= integerArgument6) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if ((32 & integerLocal28) != 0) {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            } else {
              integerLocal25++;
            }
            cachedIntegerLocal5 = this.integerArrayState0118[integerLocal25];
            integerLocal32 = cachedIntegerLocal5;
            if (cachedIntegerLocal5 < 0) {
              previousIntegerLocal6 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal6] = (byte)(~integerLocal32);
              if (integerArgument6 <= integerArgument3) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if ((16 & integerLocal28) == 0) {
              integerLocal25++;
            } else {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            }
            cachedIntegerLocal7 = this.integerArrayState0118[integerLocal25];
            integerLocal33 = cachedIntegerLocal7;
            if (cachedIntegerLocal7 < 0) {
              previousIntegerLocal8 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal8] = (byte)(~integerLocal33);
              if (integerArgument6 <= integerArgument3) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if (0 != (8 & integerLocal28)) {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            } else {
              integerLocal25++;
            }
            cachedIntegerLocal9 = this.integerArrayState0118[integerLocal25];
            integerLocal34 = cachedIntegerLocal9;
            if (cachedIntegerLocal9 < 0) {
              previousIntegerLocal10 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal10] = (byte)(~integerLocal34);
              if (integerArgument6 <= integerArgument3) {
                return integerLocal27 - (-1 + integerArgument1);
              }
              integerLocal25 = 0;
            }
            if ((4 & integerLocal28) == 0) {
              integerLocal25++;
            } else {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            }
            cachedIntegerLocal11 = this.integerArrayState0118[integerLocal25];
            integerLocal35 = cachedIntegerLocal11;
            if (cachedIntegerLocal11 < 0) {
              previousIntegerLocal12 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal12] = (byte)(~integerLocal35);
              if (integerArgument6 <= integerArgument3) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if ((2 & integerLocal28) == 0) {
              integerLocal25++;
            } else {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            }
            cachedIntegerLocal13 = this.integerArrayState0118[integerLocal25];
            integerLocal36 = cachedIntegerLocal13;
            if (0 > cachedIntegerLocal13) {
              previousIntegerLocal14 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal14] = (byte)(~integerLocal36);
              if (integerArgument3 >= integerArgument6) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            if ((1 & integerLocal28) != 0) {
              integerLocal25 = this.integerArrayState0118[integerLocal25];
            } else {
              integerLocal25++;
            }
            cachedIntegerLocal15 = this.integerArrayState0118[integerLocal25];
            integerLocal37 = cachedIntegerLocal15;
            if (cachedIntegerLocal15 < 0) {
              previousIntegerLocal16 = integerArgument3;
              integerArgument3++;
              byteArrayArgument4[previousIntegerLocal16] = (byte)(~integerLocal37);
              if (integerArgument6 <= integerArgument3) {
                break scanLoop1;
              }
              integerLocal25 = 0;
            }
            integerLocal27++;
            continue;

          }
          stackIntegerLocal18 = integerLocal27 - (-1 + integerArgument1);
          return stackIntegerLocal18;
        } catch (java.lang.RuntimeException caughtParameterLocal38) {
          caughtExceptionLocal24 = caughtParameterLocal38;
          runtimeExceptionLocal26 = caughtExceptionLocal24;
          stackRuntimeExceptionLocal19 = runtimeExceptionLocal26;
          stackStringBuilderLocal20 = new StringBuilder().append("jk.C(").append(integerArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',');
          if (byteArrayArgument4 == null) {
            stackStringLocal21 = "null";
          } else {
            stackStringLocal21 = "{...}";
          }
          stackStringBuilderLocal22 = ((StringBuilder) (Object) stackStringBuilderLocal20).append(stackStringLocal21).append(',');
          if (byteArrayArgument5 == null) {
            stackStringLocal23 = "null";
          } else {
            stackStringLocal23 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal19), ((StringBuilder) (Object) stackStringBuilderLocal22).append(stackStringLocal23).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final int computeInteger0934(byte[] byteArrayArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int cachedIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        int integerLocal9 = 0;
        RuntimeException runtimeExceptionLocal10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        integerLocal18 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument6 != 8) {
            integerState0353 = -58;
          }
          integerLocal9 = 0;
          integerLocal11 = integerArgument4 << 3;
          integerArgument3 = integerArgument3 + integerArgument5;
          while (true) {
            if (integerArgument3 <= integerArgument5) {
              stackIntegerLocal2 = -integerArgument4 + (integerLocal11 + 7 >> 3);
              return stackIntegerLocal2;
            }
            integerLocal12 = 255 & byteArrayArgument2[integerArgument5];
            integerLocal13 = this.integerArrayState0117[integerLocal12];
            integerLocal14 = this.byteArrayState0009[integerLocal12];
            if (integerLocal14 == 0) {
              throw new RuntimeException("" + integerLocal12);
            }
            integerLocal15 = integerLocal11 >> 3;
            integerLocal16 = integerLocal11 & 7;
            integerLocal9 = integerLocal9 & -integerLocal16 >> 31;
            integerLocal17 = integerLocal15 + (integerLocal16 + (integerLocal14 - 1) >> 3);
            integerLocal16 += 24;
            cachedIntegerLocal1 = UiComponentPart006.computeInteger0388(integerLocal9, integerLocal13 >>> integerLocal16);
            integerLocal9 = cachedIntegerLocal1;
            byteArrayArgument1[integerLocal15] = (byte)cachedIntegerLocal1;
            if (integerLocal17 > integerLocal15) {
              integerLocal15++;
              integerLocal16 -= 8;
              integerLocal9 = integerLocal13 >>> integerLocal16;
              byteArrayArgument1[integerLocal15] = (byte)(integerLocal13 >>> integerLocal16);
              if (integerLocal15 < integerLocal17) {
                integerLocal16 -= 8;
                integerLocal15++;
                integerLocal9 = integerLocal13 >>> integerLocal16;
                byteArrayArgument1[integerLocal15] = (byte)(integerLocal13 >>> integerLocal16);
                if (integerLocal15 < integerLocal17) {
                  integerLocal15++;
                  integerLocal16 -= 8;
                  integerLocal9 = integerLocal13 >>> integerLocal16;
                  byteArrayArgument1[integerLocal15] = (byte)(integerLocal13 >>> integerLocal16);
                  if (integerLocal17 > integerLocal15) {
                    integerLocal15++;
                    integerLocal16 -= 8;
                    integerLocal9 = integerLocal13 << -integerLocal16;
                    byteArrayArgument1[integerLocal15] = (byte)(integerLocal13 << -integerLocal16);
                  }
                }
              }
            }
            integerLocal11 = integerLocal11 + integerLocal14;
            integerArgument5++;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal8 = caughtParameterLocal19;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal10;
          stackStringBuilderLocal4 = new StringBuilder().append("jk.B(");
          if (byteArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    MixedSupport068(byte[] byteArrayArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int[] integerArrayLocal9 = null;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int[] integerArrayLocal18 = null;
        int[] integerArrayLocal19 = null;
        int[] integerArrayLocal20 = null;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        try {
          integerLocal7 = byteArrayArgument1.length;
          this.byteArrayState0009 = byteArrayArgument1;
          this.integerArrayState0117 = new int[integerLocal7];
          this.integerArrayState0118 = new int[8];
          integerArrayLocal20 = new int[33];
          integerArrayLocal19 = integerArrayLocal20;
          integerArrayLocal9 = integerArrayLocal19;
          integerLocal10 = 0;
          for (integerLocal1 = 0; integerLocal1 < integerLocal7; integerLocal1++) {
            integerLocal11 = byteArrayArgument1[integerLocal1];
            if (0 != integerLocal11) {
              boolean frameRemainderLocal25 = true;
              boolean frameCompletedLocal26 = true;
              boolean frameCompletedLocal27 = true;
              integerLocal12 = 1 << -integerLocal11 + 32;
              integerLocal13 = integerArrayLocal20[integerLocal11];
              this.integerArrayState0117[integerLocal1] = integerLocal13;
              if ((integerLocal13 & integerLocal12) == 0) {
                integerLocal14 = integerLocal13 | integerLocal12;
                integerLocal15 = -1 + integerLocal11;
                while (integerLocal15 >= 1) {
                  integerLocal16 = integerArrayLocal20[integerLocal15];
                  if (~integerLocal13 != ~integerLocal16) {
                    frameCompletedLocal26 = false;
                    break;
                  }
                  integerLocal17 = 1 << 32 - integerLocal15;
                  if ((integerLocal17 & integerLocal16) != 0) {
                    integerArrayLocal9[integerLocal15] = integerArrayLocal9[integerLocal15 - 1];
                    frameCompletedLocal27 = false;
                    break;
                  }
                  integerArrayLocal9[integerLocal15] = UiComponentPart006.computeInteger0388(integerLocal16, integerLocal17);
                  integerLocal15--;
                }
                if (frameCompletedLocal26) {
                  frameRemainderLocal25 = !(frameCompletedLocal27);
                }
              }
              if ((frameRemainderLocal25) &&
                (frameCompletedLocal26) &&
                (frameCompletedLocal27)) {
                integerLocal14 = integerArrayLocal9[integerLocal11 - 1];
              }
              integerArrayLocal20[integerLocal11] = integerLocal14;
              for (integerLocal21 = integerLocal11 + 1; integerLocal21 <= 32; integerLocal21++) {
                if (integerLocal13 == integerArrayLocal20[integerLocal21]) {
                  integerArrayLocal20[integerLocal21] = integerLocal14;
                }
              }
              integerLocal22 = 0;
              for (integerLocal23 = 0; integerLocal11 > integerLocal23; integerLocal23++) {
                integerLocal24 = -2147483648 >>> integerLocal23;
                if ((integerLocal24 & integerLocal13) == 0) {
                  integerLocal22++;
                } else {
                  if (this.integerArrayState0118[integerLocal22] == 0) {
                    this.integerArrayState0118[integerLocal22] = integerLocal10;
                  }
                  integerLocal22 = this.integerArrayState0118[integerLocal22];
                }
                integerLocal24 = integerLocal24 >>> 1;
                if (this.integerArrayState0118.length <= integerLocal22) {
                  integerArrayLocal18 = new int[2 * this.integerArrayState0118.length];
                  for (integerLocal2 = 0; integerLocal2 < this.integerArrayState0118.length; integerLocal2++) {
                    integerArrayLocal18[integerLocal2] = this.integerArrayState0118[integerLocal2];
                  }
                  this.integerArrayState0118 = integerArrayLocal18;
                }
              }
              if (integerLocal22 >= integerLocal10) {
                integerLocal10 = 1 + integerLocal22;
              }
              this.integerArrayState0118[integerLocal22] = ~integerLocal1;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal28) {
          caughtExceptionLocal6 = caughtParameterLocal28;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("jk.<init>(");
          if (byteArrayArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    static {
        stringState0289 = "Names can only contain letters, numbers, spaces and underscores";
    }
}
