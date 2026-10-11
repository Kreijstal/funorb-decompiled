/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport011 {
    private MixedSupport090 mixedSupport090State0002;
    static String stringState0430;
    private ResourceArchive resourceArchiveState0017;
    static String stringState0431;
    static String stringState0432;
    private ResourceArchive resourceArchiveState0018;
    private MixedSupport090 mixedSupport090State0003;

    final RawSound computeRawSound1441(String stringArgument1, String stringArgument2, int integerArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        RawSound stackRawSoundLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (integerArgument3 != 0) {
            this.mixedSupport090State0002 = (MixedSupport090) null;
          }
          stackRawSoundLocal2 = this.computeRawSound1444(stringArgument1, (int[]) null, stringArgument2, true);
          return stackRawSoundLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal1 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("pl.D(");
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static void performAction1437(int integerArgument1) {
        if (integerArgument1 != 3970) {
          stringState0430 = (String) null;
          MixedSupport066.performAction0866((byte) 103);
          return;
        }
        MixedSupport066.performAction0866((byte) 103);
    }

    final RawSound computeRawSound1438(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = -17 % ((-2 - integerArgument1) / 57);
        return this.computeRawSound1439(121, integerArgument3, (int[]) null, integerArgument2);
    }

    final static java.net.URL computeURL1442(String stringArgument1, String stringArgument2, boolean booleanArgument3, java.net.URL uRLArgument4, int integerArgument5) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackURLLocal10 = null;
          java.net.URL stackURLLocal11 = null;
          java.net.URL stackURLLocal12 = null;
          RuntimeException stackRuntimeExceptionLocal13 = null;
          StringBuilder stackStringBuilderLocal14 = null;
          String stackStringLocal15 = null;
          StringBuilder stackStringBuilderLocal16 = null;
          String stackStringLocal17 = null;
          StringBuilder stackStringBuilderLocal18 = null;
          String stackStringLocal19 = null;
          Throwable caughtExceptionLocal20 = null;
          String stringLocal21 = null;
          RuntimeException runtimeExceptionLocal22 = null;
          int integerLocal23 = 0;
          int integerLocal24 = 0;
          StringBuilder stringBuilderLocal25 = null;
          Exception exceptionLocal26 = null;
          int integerLocal27 = 0;
          integerLocal27 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            stringLocal21 = uRLArgument4.getFile();
            integerLocal23 = 0;
            while (true) {
              if (stringLocal21.regionMatches(integerLocal23, "/l=", 0, 3)) {
                integerLocal24 = stringLocal21.indexOf('/', 1 + integerLocal23);
                if (integerLocal24 >= 0) {
                  if (0 <= integerArgument5) {
                    stringLocal21 = stringLocal21.substring(0, integerLocal23) + stringLocal21.substring(integerLocal24);
                    continue;
                  }
                  integerLocal23 = integerLocal24;
                  continue;
                }
              }
              boolean frameRemainderLocal28 = true;
              if (stringLocal21.regionMatches(integerLocal23, "/a=", 0, 3)) {
                integerLocal24 = stringLocal21.indexOf('/', integerLocal23 + 1);
                frameRemainderLocal28 = !(integerLocal24 >= 0);
              }
              if (frameRemainderLocal28) {
                if (stringLocal21.regionMatches(integerLocal23, "/p=", 0, 3)) {
                  integerLocal24 = stringLocal21.indexOf('/', 1 + integerLocal23);
                  if (0 <= integerLocal24) {
                    if (stringArgument2 != null) {
                      stringLocal21 = stringLocal21.substring(0, integerLocal23) + stringLocal21.substring(integerLocal24);
                      continue;
                    }
                    integerLocal23 = integerLocal24;
                    continue;
                  }
                }
                if (stringLocal21.regionMatches(integerLocal23, "/s=", 0, 3) ||
                  stringLocal21.regionMatches(integerLocal23, "/c=", 0, 3)) {
                  integerLocal24 = stringLocal21.indexOf('/', integerLocal23 + 1);
                  if ((0 <= integerLocal24) &&
                    (frameRemainderLocal28 = (stringArgument1 != null))) {
                    stringLocal21 = stringLocal21.substring(0, integerLocal23) + stringLocal21.substring(integerLocal24);
                    continue;
                  }
                }
                if (frameRemainderLocal28) {
                  stringBuilderLocal25 = new StringBuilder(integerLocal23);
                  if (booleanArgument3) {
                    stackURLLocal10 = (java.net.URL) null;
                    return stackURLLocal10;
                  }
                  discarded$0 = stringBuilderLocal25.append(stringLocal21.substring(0, integerLocal23));
                  if (integerArgument5 > 0) {
                    discarded$1 = stringBuilderLocal25.append("/l=");
                    discarded$2 = stringBuilderLocal25.append(Integer.toString(integerArgument5));
                  }
                  if (stringArgument2 != null &&
                    stringArgument2.length() > 0) {
                    discarded$3 = stringBuilderLocal25.append("/p=");
                    discarded$4 = stringBuilderLocal25.append(stringArgument2);
                  }
                  if (stringArgument1 != null &&
                    0 < stringArgument1.length()) {
                    discarded$5 = stringBuilderLocal25.append("/s=");
                    discarded$6 = stringBuilderLocal25.append(stringArgument1);
                  }
                  if (integerLocal23 >= stringLocal21.length()) {
                    discarded$7 = stringBuilderLocal25.append('/');
                  } else {
                    discarded$8 = stringBuilderLocal25.append(stringLocal21.substring(integerLocal23, stringLocal21.length()));
                  }
                  try {
                    stackURLLocal11 = new java.net.URL(uRLArgument4, stringBuilderLocal25.toString());
                    return stackURLLocal11;
                  } catch (java.lang.Exception caughtParameterLocal29) {
                    caughtExceptionLocal20 = caughtParameterLocal29;
                    exceptionLocal26 = (Exception) (Object) caughtExceptionLocal20;
                    exceptionLocal26.printStackTrace();
                    stackURLLocal12 = (java.net.URL) (uRLArgument4);
                    return stackURLLocal12;
                  }
                }
              }
              integerLocal23 = integerLocal24;
            }
          } catch (java.lang.RuntimeException caughtParameterLocal30) {
            caughtExceptionLocal20 = caughtParameterLocal30;
            runtimeExceptionLocal22 = (RuntimeException) (Object) caughtExceptionLocal20;
            stackRuntimeExceptionLocal13 = runtimeExceptionLocal22;
            stackStringBuilderLocal14 = new StringBuilder().append("pl.I(");
            if (stringArgument1 == null) {
              stackStringLocal15 = "null";
            } else {
              stackStringLocal15 = "{...}";
            }
            stackStringBuilderLocal16 = ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',');
            if (stringArgument2 == null) {
              stackStringLocal17 = "null";
            } else {
              stackStringLocal17 = "{...}";
            }
            stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',').append(booleanArgument3).append(',');
            if (uRLArgument4 == null) {
              stackStringLocal19 = "null";
            } else {
              stackStringLocal19 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',').append(integerArgument5).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal31) {
          throw uncheckedExceptionLocal31;
        } catch (Throwable checkedExceptionLocal32) {
          throw new RuntimeException(checkedExceptionLocal32);
        }
    }

    private final RawSound computeRawSound1443(String stringArgument1, int[] integerArrayArgument2, String stringArgument3, byte byteArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        String stringLocal4 = null;
        RawSound stackRawSoundLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          if (byteArgument4 > -17) {
            stringLocal4 = (String) null;
            this.computeRawSound1441((String) null, (String) null, 126);
          }
          integerLocal1 = this.resourceArchiveState0018.computeInteger0926(-1, stringArgument3);
          if (0 > integerLocal1) {
            return null;
          }
          integerLocal3 = this.resourceArchiveState0018.computeInteger0913(integerLocal1, 13030, stringArgument1);
          if (integerLocal3 < 0) {
            return null;
          }
          stackRawSoundLocal5 = this.computeRawSound1440(integerLocal3, integerArrayArgument2, integerLocal1, -15027);
          return stackRawSoundLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("pl.E(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(byteArgument4).append(')').toString());
        }
    }

    final RawSound computeRawSound1436(byte byteArgument1, String stringArgument2, String stringArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        RawSound stackRawSoundLocal2 = null;
        RawSound stackRawSoundLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (byteArgument1 == 101) {
            stackRawSoundLocal3 = this.computeRawSound1443(stringArgument3, (int[]) null, stringArgument2, (byte) -75);
            return stackRawSoundLocal3;
          }
          stackRawSoundLocal2 = (RawSound) null;
          return stackRawSoundLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal1 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("pl.J(").append(byteArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (stringArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    public static void performAction1445(int integerArgument1) {
        stringState0431 = null;
        stringState0430 = null;
        int integerLocal1 = 81 % ((integerArgument1 + 78) / 33);
        stringState0432 = null;
    }

    private final RawSound computeRawSound1444(String stringArgument1, int[] integerArrayArgument2, String stringArgument3, boolean booleanArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        Object stackObjectLocal4 = null;
        RawSound stackRawSoundLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        try {
          integerLocal1 = this.resourceArchiveState0017.computeInteger0926(-1, stringArgument1);
          if (!booleanArgument4) {
            this.mixedSupport090State0002 = (MixedSupport090) null;
          }
          if (0 > integerLocal1) {
            return null;
          }
          integerLocal3 = this.resourceArchiveState0017.computeInteger0913(integerLocal1, 13030, stringArgument3);
          if (integerLocal3 >= 0) {
            stackRawSoundLocal5 = this.computeRawSound1439(119, integerLocal1, integerArrayArgument2, integerLocal3);
            return stackRawSoundLocal5;
          }
          stackObjectLocal4 = null;
          return (RawSound) (stackObjectLocal4);
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal13 = caughtParameterLocal14;
          runtimeExceptionLocal2 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("pl.A(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',');
          if (stringArgument3 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(',').append(booleanArgument4).append(')').toString());
        }
    }

    private final RawSound computeRawSound1440(int integerArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4) {
        VorbisSample cachedVorbisSampleLocal1 = null;
        RawSound stackRawSoundLocal2 = null;
        Object stackObjectLocal3 = null;
        Object stackObjectLocal4 = null;
        RawSound stackRawSoundLocal5 = null;
        Object stackObjectLocal6 = null;
        RawSound stackRawSoundLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        int integerLocal12 = 0;
        RuntimeException runtimeExceptionLocal13 = null;
        long longLocal14 = 0L;
        RawSound rawSoundLocal15 = null;
        VorbisSample vorbisSampleLocal16 = null;
        VorbisSample vorbisSampleLocal17 = null;
        RawSound rawSoundLocal18;
        try {
          integerLocal12 = integerArgument1 ^ (65532 & integerArgument3 << 4 | integerArgument3 >>> 12);
          integerLocal12 = integerLocal12 | integerArgument3 << 16;
          longLocal14 = 4294967296L ^ (long)integerLocal12;
          rawSoundLocal15 = (RawSound) (this.mixedSupport090State0003.computeHashNode1260(longLocal14, 126));
          if (rawSoundLocal15 != null) {
            stackRawSoundLocal2 = rawSoundLocal15;
            return stackRawSoundLocal2;
          }
          if (integerArrayArgument2 != null &&
            integerArrayArgument2[0] <= 0) {
            stackObjectLocal3 = null;
            return (RawSound) (stackObjectLocal3);
          }
          cachedVorbisSampleLocal1 = (VorbisSample) (this.mixedSupport090State0002.computeHashNode1260(longLocal14, 55));
          vorbisSampleLocal17 = cachedVorbisSampleLocal1;
          vorbisSampleLocal16 = cachedVorbisSampleLocal1;
          if (vorbisSampleLocal17 == null) {
            vorbisSampleLocal16 = VorbisSample.computeVorbisSample1915(this.resourceArchiveState0018, integerArgument3, integerArgument1);
            if (vorbisSampleLocal16 == null) {
              stackObjectLocal4 = null;
              return (RawSound) (stackObjectLocal4);
            }
            this.mixedSupport090State0002.performAction1261(longLocal14, integerArgument4 ^ 15026, vorbisSampleLocal16);
          }
          if (integerArgument4 != -15027) {
            stackRawSoundLocal5 = (RawSound) null;
            return stackRawSoundLocal5;
          }
          rawSoundLocal18 = vorbisSampleLocal16.computeRawSound1919(integerArrayArgument2);
          if (rawSoundLocal18 == null) {
            stackObjectLocal6 = null;
            return (RawSound) (stackObjectLocal6);
          }
          vorbisSampleLocal16.performAction0161((byte) 101);
          this.mixedSupport090State0003.performAction1261(longLocal14, -1, rawSoundLocal18);
          stackRawSoundLocal7 = rawSoundLocal18;
          return stackRawSoundLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal11 = caughtParameterLocal19;
          runtimeExceptionLocal13 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal13;
          stackStringBuilderLocal9 = new StringBuilder().append("pl.C(").append(integerArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    private final RawSound computeRawSound1439(int integerArgument1, int integerArgument2, int[] integerArrayArgument3, int integerArgument4) {
        RawSound cachedRawSoundLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        long longLocal4 = 0L;
        RawSound rawSoundLocal5 = null;
        SoundEffect soundEffectLocal6 = null;
        RawSound rawSoundLocal7 = null;
        RawSound rawSoundLocal8 = null;
        RawSound stackRawSoundLocal9 = null;
        Object stackObjectLocal10 = null;
        RawSound stackRawSoundLocal11 = null;
        RuntimeException stackRuntimeExceptionLocal12 = null;
        StringBuilder stackStringBuilderLocal13 = null;
        String stackStringLocal14 = null;
        RuntimeException caughtExceptionLocal15 = null;
        RawSound rawSoundLocal16;
        try {
          integerLocal2 = integerArgument4 ^ (integerArgument2 << 4 & 65531 | integerArgument2 >>> 12);
          integerLocal2 = integerLocal2 | integerArgument2 << 16;
          if (integerArgument1 < 113) {
            stringState0432 = (String) null;
          }
          longLocal4 = (long)integerLocal2;
          cachedRawSoundLocal1 = (RawSound) (this.mixedSupport090State0003.computeHashNode1260(longLocal4, 106));
          rawSoundLocal8 = cachedRawSoundLocal1;
          rawSoundLocal5 = cachedRawSoundLocal1;
          if (rawSoundLocal8 != null) {
            stackRawSoundLocal9 = rawSoundLocal8;
            return stackRawSoundLocal9;
          }
          if (integerArrayArgument3 != null &&
            integerArrayArgument3[0] <= 0) {
            return null;
          }
          soundEffectLocal6 = SoundEffect.computeSoundEffect0164(this.resourceArchiveState0017, integerArgument2, integerArgument4);
          if (soundEffectLocal6 == null) {
            stackObjectLocal10 = null;
            return (RawSound) (stackObjectLocal10);
          }
          rawSoundLocal7 = soundEffectLocal6.computeRawSound0165();
          rawSoundLocal16 = rawSoundLocal7;
          this.mixedSupport090State0003.performAction1261(longLocal4, -1, rawSoundLocal16);
          if (integerArrayArgument3 != null) {
            integerArrayArgument3[0] = integerArrayArgument3[0] - rawSoundLocal7.byteArrayState0028.length;
          }
          stackRawSoundLocal11 = rawSoundLocal16;
          return stackRawSoundLocal11;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal15 = caughtParameterLocal17;
          runtimeExceptionLocal3 = caughtExceptionLocal15;
          stackRuntimeExceptionLocal12 = runtimeExceptionLocal3;
          stackStringBuilderLocal13 = new StringBuilder().append("pl.F(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal14 = "null";
          } else {
            stackStringLocal14 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal12), ((StringBuilder) (Object) stackStringBuilderLocal13).append(stackStringLocal14).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final RawSound computeRawSound1446(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument3 != -1) {
          return (RawSound) null;
        }
        return this.computeRawSound1440(integerArgument1, (int[]) null, integerArgument2, -15027);
    }

    NetworkSupport011(ResourceArchive resourceArchiveArgument1, ResourceArchive resourceArchiveArgument2) {
        this.mixedSupport090State0002 = new MixedSupport090(256);
        this.mixedSupport090State0003 = new MixedSupport090(256);
        try {
          this.resourceArchiveState0018 = resourceArchiveArgument2;
          this.resourceArchiveState0017 = resourceArchiveArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pl.<init>(" + (resourceArchiveArgument1 != null ? "{...}" : "null") + ',' + (resourceArchiveArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0430 = "New Game";
        stringState0432 = "You need to play 1 more rated game to unlock this option.";
        stringState0431 = "Add <%0> to friend list";
    }
}
