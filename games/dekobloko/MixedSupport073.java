/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport073 {
    private MixedSupport091 mixedSupport091State0002;
    static String stringState0310;
    static String stringState0311;
    static int[] integerArrayState0123;
    private MixedSupport091 mixedSupport091State0003;
    private int integerState0380;
    private int integerState0381;
    static String stringState0312;

    final static void performAction1017(int integerArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = MixedSupport001.integerArrayState0001[0];
          if (integerArgument1 != 2) {
            integerArrayState0123 = (int[]) null;
          }
          for (integerLocal1 = 1; MixedSupport001.integerArrayState0001.length > integerLocal1; integerLocal1++) {
            integerLocal3 = MixedSupport001.integerArrayState0001[integerLocal1];
            MixedSupport008.performAction0085(SceneWidgetPart004.integerArrayState0053, integerLocal1 << 4, SceneWidgetPart004.integerArrayState0053, integerLocal2, integerLocal3);
            integerLocal2 = integerLocal2 + integerLocal3;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "kh.B(" + integerArgument1 + ')');
        }
    }

    final static void performAction1019(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        MixedSupport147.packetBufferState0008.position = 0;
        MixedSupport147.packetBufferState0008.performAction2073(true, 12);
        MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
        if (integerArgument1 < -17) {
          MixedSupport147.packetBufferState0008.performAction2067(RenderingSupport004.randomState0002.nextInt(), false);
          MixedSupport147.packetBufferState0008.performAction2073(true, integerArgument2);
          MixedSupport147.packetBufferState0008.performAction2073(true, integerArgument4);
          MixedSupport147.packetBufferState0008.performAction2087(-1, integerArgument3);
          MixedSupport147.packetBufferState0008.performAction2071(RichTextLayout.bigIntegerState0001, AnimatedTileRegion.bigIntegerState0004, true);
          SocketFactory.cipherPacketBufferState0002.performAction1861(18, -4);
          integerLocal1 = SocketFactory.cipherPacketBufferState0002.position + 1;
          SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 1;
          integerLocal2 = integerLocal1;
          SocketFactory.cipherPacketBufferState0002.performAction2074(false, MixedSupport147.packetBufferState0008.position, MixedSupport147.packetBufferState0008.payload, 0);
          SocketFactory.cipherPacketBufferState0002.performAction2079(SocketFactory.cipherPacketBufferState0002.position - integerLocal2, true);
          return;
        }
    }

    public final String toString() {
        return "" + this.integerState0380;
    }

    final boolean computeBoolean1015(byte byteArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4) {
        Object objectLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        Throwable throwableLocal4 = null;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        Throwable caughtExceptionLocal9 = null;
        try {
          objectLocal1 = this.mixedSupport091State0003;
          synchronized (objectLocal1) {
            if (integerArgument4 >= 0 &&
              integerArgument4 <= this.integerState0381) {
              if (byteArgument1 != 43) {
                MixedSupport073.computeBoolean1016(')', -33);
              }
              integerLocal3 = this.computeBoolean1021(true, (byte) -108, integerArgument3, integerArgument4, byteArrayArgument2) ? 1 : 0;
              if (integerLocal3 == 0) {
                integerLocal3 = this.computeBoolean1021(false, (byte) -43, integerArgument3, integerArgument4, byteArrayArgument2) ? 1 : 0;
              }
              stackIntegerLocal5 = integerLocal3;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIntegerLocal5 != 0;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = (RuntimeException) (Object) caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("kh.D(").append(byteArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    private final boolean computeBoolean1021(boolean booleanArgument1, byte byteArgument2, int integerArgument3, int integerArgument4, byte[] byteArrayArgument5) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          int regionSelectorLocal4 = 0;
          int regionSelectorLocal5 = 0;
          Throwable caughtExceptionLocal6 = null;
          Object objectLocal7 = null;
          RuntimeException runtimeExceptionLocal8 = null;
          int integerLocal9 = 0;
          IOException iOExceptionLocal10 = null;
          int integerLocal11 = 0;
          int integerLocal12 = 0;
          int integerLocal13 = 0;
          int integerLocal14 = 0;
          int integerLocal15 = 0;
          int integerLocal16 = 0;
          EOFException eOFExceptionLocal17 = null;
          int integerLocal18 = 0;
          integerLocal18 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            objectLocal7 = this.mixedSupport091State0003;
            synchronized (objectLocal7) {
              try {
                if (byteArgument2 > -39) {
                  return false;
                }
                if (booleanArgument1) {
                  if (this.mixedSupport091State0002.computeLong1272(37) < (long)(6 + integerArgument3 * 6)) {
                    return false;
                  }
                  this.mixedSupport091State0002.performAction1268((long)(6 * integerArgument3), (byte) -109);
                  this.mixedSupport091State0002.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, 6);
                  integerLocal9 = (255 & DiagnosticSupport002.byteArrayState0008[5]) + (((255 & DiagnosticSupport002.byteArrayState0008[3]) << 16) + (DiagnosticSupport002.byteArrayState0008[4] << 8 & 65280));
                  if (0 >= integerLocal9 ||
                    !((this.mixedSupport091State0003.computeLong1272(-94) / 520L) >= (long)integerLocal9)) {
                    return false;
                  }
                } else {
                  integerLocal9 = (int)((this.mixedSupport091State0003.computeLong1272(74) + 519L) / 520L);
                  if (integerLocal9 == 0) {
                    integerLocal9 = 1;
                  }
                }
                DiagnosticSupport002.byteArrayState0008[0] = (byte)(integerArgument4 >> 16);
                DiagnosticSupport002.byteArrayState0008[2] = (byte)integerArgument4;
                DiagnosticSupport002.byteArrayState0008[5] = (byte)integerLocal9;
                DiagnosticSupport002.byteArrayState0008[1] = (byte)(integerArgument4 >> 8);
                DiagnosticSupport002.byteArrayState0008[3] = (byte)(integerLocal9 >> 16);
                DiagnosticSupport002.byteArrayState0008[4] = (byte)(integerLocal9 >> 8);
                this.mixedSupport091State0002.performAction1268((long)(6 * integerArgument3), (byte) -109);
                this.mixedSupport091State0002.performAction1270(DiagnosticSupport002.byteArrayState0008, (byte) 118, 0, 6);
                integerLocal11 = 0;
                integerLocal12 = 0;
                scanLoop1: while (true) {
                  if (integerLocal11 < integerArgument4) {
                    boolean frameRemainderLocal19 = true;
                    integerLocal13 = 0;
                    if (booleanArgument1) {
                      this.mixedSupport091State0003.performAction1268((long)(520 * integerLocal9), (byte) -109);
                      if (integerArgument3 <= 65535) {
                        try {
                          this.mixedSupport091State0003.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, 8);
                          regionSelectorLocal4 = 0;
                        } catch (java.io.EOFException caughtParameterLocal20) {
                          caughtExceptionLocal6 = caughtParameterLocal20;
                          eOFExceptionLocal17 = (EOFException) (Object) caughtExceptionLocal6;
                          regionSelectorLocal4 = 1;
                        }
                        if (regionSelectorLocal4 != 0) {
                          break scanLoop1;
                        }
                        integerLocal13 = (255 & DiagnosticSupport002.byteArrayState0008[6]) + (16711680 & DiagnosticSupport002.byteArrayState0008[4] << 16) + ((255 & DiagnosticSupport002.byteArrayState0008[5]) << 8);
                        integerLocal16 = 255 & DiagnosticSupport002.byteArrayState0008[7];
                        integerLocal15 = (255 & DiagnosticSupport002.byteArrayState0008[3]) + ((DiagnosticSupport002.byteArrayState0008[2] & 255) << 8);
                        integerLocal14 = (255 & DiagnosticSupport002.byteArrayState0008[1]) + ((255 & DiagnosticSupport002.byteArrayState0008[0]) << 8);
                      } else {
                        try {
                          this.mixedSupport091State0003.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, 10);
                          regionSelectorLocal5 = 0;
                        } catch (java.io.EOFException caughtParameterLocal21) {
                          caughtExceptionLocal6 = caughtParameterLocal21;
                          eOFExceptionLocal17 = (EOFException) (Object) caughtExceptionLocal6;
                          regionSelectorLocal5 = 1;
                        }
                        if (regionSelectorLocal5 != 0) {
                          break scanLoop1;
                        }
                        integerLocal15 = ((DiagnosticSupport002.byteArrayState0008[4] & 255) << 8) + (DiagnosticSupport002.byteArrayState0008[5] & 255);
                        integerLocal16 = 255 & DiagnosticSupport002.byteArrayState0008[9];
                        integerLocal14 = (255 & DiagnosticSupport002.byteArrayState0008[3]) + (-16777216 & DiagnosticSupport002.byteArrayState0008[0] << 24) + ((DiagnosticSupport002.byteArrayState0008[1] & 255) << 16) + ((DiagnosticSupport002.byteArrayState0008[2] & 255) << 8);
                        integerLocal13 = ((255 & DiagnosticSupport002.byteArrayState0008[6]) << 16) + (65280 & DiagnosticSupport002.byteArrayState0008[7] << 8) + (DiagnosticSupport002.byteArrayState0008[8] & 255);
                      }
                      if ((integerLocal14 == integerArgument3 &&
                        integerLocal12 == integerLocal15 &&
                        integerLocal16 == this.integerState0380) &&
                        (frameRemainderLocal19 = (!(integerLocal13 >= 0) ||
                        !((long)integerLocal13 <= this.mixedSupport091State0003.computeLong1272(-103) / 520L)))) {
                        return false;
                      }
                      if (frameRemainderLocal19) {
                        return false;
                      }
                    }
                    if (integerLocal13 == 0) {
                      booleanArgument1 = false;
                      integerLocal13 = (int)((this.mixedSupport091State0003.computeLong1272(-121) + 519L) / 520L);
                      if (integerLocal13 == 0) {
                        integerLocal13++;
                      }
                      if (integerLocal9 == integerLocal13) {
                        integerLocal13++;
                      }
                    }
                    if (-integerLocal11 + integerArgument4 <= 512) {
                      integerLocal13 = 0;
                    }
                    if (integerArgument3 > 65535) {
                      DiagnosticSupport002.byteArrayState0008[3] = (byte)integerArgument3;
                      DiagnosticSupport002.byteArrayState0008[1] = (byte)(integerArgument3 >> 16);
                      DiagnosticSupport002.byteArrayState0008[8] = (byte)integerLocal13;
                      DiagnosticSupport002.byteArrayState0008[6] = (byte)(integerLocal13 >> 16);
                      DiagnosticSupport002.byteArrayState0008[4] = (byte)(integerLocal12 >> 8);
                      DiagnosticSupport002.byteArrayState0008[9] = (byte)this.integerState0380;
                      DiagnosticSupport002.byteArrayState0008[0] = (byte)(integerArgument3 >> 24);
                      DiagnosticSupport002.byteArrayState0008[5] = (byte)integerLocal12;
                      DiagnosticSupport002.byteArrayState0008[7] = (byte)(integerLocal13 >> 8);
                      DiagnosticSupport002.byteArrayState0008[2] = (byte)(integerArgument3 >> 8);
                      this.mixedSupport091State0003.performAction1268((long)(integerLocal9 * 520), (byte) -109);
                      this.mixedSupport091State0003.performAction1270(DiagnosticSupport002.byteArrayState0008, (byte) 96, 0, 10);
                      integerLocal14 = integerArgument4 - integerLocal11;
                      if (integerLocal14 > 510) {
                        integerLocal14 = 510;
                      }
                      this.mixedSupport091State0003.performAction1270(byteArrayArgument5, (byte) 126, integerLocal11, integerLocal14);
                      integerLocal11 = integerLocal11 + integerLocal14;
                    } else {
                      DiagnosticSupport002.byteArrayState0008[0] = (byte)(integerArgument3 >> 8);
                      DiagnosticSupport002.byteArrayState0008[7] = (byte)this.integerState0380;
                      DiagnosticSupport002.byteArrayState0008[3] = (byte)integerLocal12;
                      DiagnosticSupport002.byteArrayState0008[5] = (byte)(integerLocal13 >> 8);
                      DiagnosticSupport002.byteArrayState0008[4] = (byte)(integerLocal13 >> 16);
                      DiagnosticSupport002.byteArrayState0008[1] = (byte)integerArgument3;
                      DiagnosticSupport002.byteArrayState0008[2] = (byte)(integerLocal12 >> 8);
                      DiagnosticSupport002.byteArrayState0008[6] = (byte)integerLocal13;
                      this.mixedSupport091State0003.performAction1268((long)(integerLocal9 * 520), (byte) -109);
                      this.mixedSupport091State0003.performAction1270(DiagnosticSupport002.byteArrayState0008, (byte) 124, 0, 8);
                      integerLocal14 = integerArgument4 - integerLocal11;
                      if (integerLocal14 > 512) {
                        integerLocal14 = 512;
                      }
                      this.mixedSupport091State0003.performAction1270(byteArrayArgument5, (byte) 126, integerLocal11, integerLocal14);
                      integerLocal11 = integerLocal11 + integerLocal14;
                    }
                    integerLocal9 = integerLocal13;
                    integerLocal12++;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException caughtParameterLocal22) {
                caughtExceptionLocal6 = caughtParameterLocal22;
                iOExceptionLocal10 = (IOException) (Object) caughtExceptionLocal6;
                return false;
              }
            }
          } catch (java.lang.RuntimeException caughtParameterLocal23) {
            caughtExceptionLocal6 = caughtParameterLocal23;
            runtimeExceptionLocal8 = (RuntimeException) (Object) caughtExceptionLocal6;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal8;
            stackStringBuilderLocal2 = new StringBuilder().append("kh.C(").append(booleanArgument1).append(',').append(byteArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
            if (byteArrayArgument5 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal24) {
          throw uncheckedExceptionLocal24;
        } catch (Throwable checkedExceptionLocal25) {
          throw new RuntimeException(checkedExceptionLocal25);
        }
    }

    public static void performAction1022(int integerArgument1) {
        stringState0310 = null;
        stringState0312 = null;
        integerArrayState0123 = null;
        stringState0311 = null;
        if (integerArgument1 != -1643605936) {
          MixedSupport073.performAction1022(15);
        }
    }

    final static boolean computeBoolean1016(char characterArgument1, int integerArgument2) {
        if (characterArgument1 >= 32 &&
          characterArgument1 <= 126) {
          return true;
        }
        if (characterArgument1 >= 160 &&
          255 >= characterArgument1) {
          return true;
        }
        if (8364 == characterArgument1) {
          return true;
        }
        if (characterArgument1 == 338) {
          return true;
        }
        if (characterArgument1 == 8212) {
          return true;
        }
        if (339 == characterArgument1) {
          return true;
        }
        if (characterArgument1 == 376) {
          return true;
        }
        if (integerArgument2 == 8212) {
          return false;
        }
        return true;
    }

    final static void performAction1020(boolean booleanArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 0;
          if (!booleanArgument1) {
            stringState0311 = (String) null;
          }
          while (MixedSupport058.integerState0317 > integerLocal1) {
            MixedSupport102.mixedSupport056ArrayState0001[integerLocal1] = null;
            integerLocal1++;
          }
          MixedSupport058.integerState0317 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kh.E(" + booleanArgument1 + ')');
        }
    }

    final byte[] computeByteArray1018(int integerArgument1, byte byteArgument2) {
        try {
          int integerLocal1 = 0;
          int previousIntegerLocal2 = 0;
          Object objectLocal3 = null;
          Object objectLocal4 = null;
          int integerLocal5 = 0;
          IOException iOExceptionLocal6 = null;
          int integerLocal7 = 0;
          byte[] byteArrayLocal8 = null;
          int integerLocal9 = 0;
          int integerLocal10 = 0;
          int integerLocal11 = 0;
          int integerLocal12 = 0;
          int integerLocal13 = 0;
          int integerLocal14 = 0;
          int integerLocal15 = 0;
          int integerLocal16 = 0;
          int integerLocal17 = 0;
          Throwable throwableLocal18 = null;
          int integerLocal19 = 0;
          byte[] stackByteArrayLocal20 = null;
          Object stackObjectLocal21 = null;
          Object stackObjectLocal22 = null;
          byte[] stackByteArrayLocal23 = null;
          Object stackObjectLocal24 = null;
          Throwable caughtExceptionLocal25 = null;
          integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          objectLocal4 = this.mixedSupport091State0003;
          synchronized (objectLocal4) {
            try {
              if ((long)(6 + integerArgument1 * 6) > this.mixedSupport091State0002.computeLong1272(103)) {
                return null;
              }
              this.mixedSupport091State0002.performAction1268((long)(6 * integerArgument1), (byte) -109);
              this.mixedSupport091State0002.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, 6);
              integerLocal5 = (DiagnosticSupport002.byteArrayState0008[2] & 255) + (DiagnosticSupport002.byteArrayState0008[1] << 8 & 65280) + (DiagnosticSupport002.byteArrayState0008[0] << 16 & 16711680);
              if (byteArgument2 <= 38) {
                stackByteArrayLocal20 = (byte[]) null;
                return stackByteArrayLocal20;
              }
              integerLocal7 = (16711680 & DiagnosticSupport002.byteArrayState0008[3] << 16) - (-((DiagnosticSupport002.byteArrayState0008[4] & 255) << 8) - (255 & DiagnosticSupport002.byteArrayState0008[5]));
              if (integerLocal5 < 0) {
                return null;
              }
              if (this.integerState0381 < integerLocal5) {
                stackObjectLocal21 = null;
                return (byte[]) (stackObjectLocal21);
              }
              if (0 >= integerLocal7) {
                return null;
              }
              if ((long)integerLocal7 > this.mixedSupport091State0003.computeLong1272(-128) / 520L) {
                return null;
              }
              byteArrayLocal8 = new byte[integerLocal5];
              integerLocal9 = 0;
              integerLocal10 = 0;
              while (integerLocal9 < integerLocal5) {
                if (0 == integerLocal7) {
                  stackObjectLocal22 = null;
                  return (byte[]) (stackObjectLocal22);
                }
                this.mixedSupport091State0003.performAction1268((long)(integerLocal7 * 520), (byte) -109);
                integerLocal11 = -integerLocal9 + integerLocal5;
                if (integerArgument1 > 65535) {
                  if (integerLocal11 > 510) {
                    integerLocal11 = 510;
                  }
                  integerLocal16 = 10;
                  this.mixedSupport091State0003.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, integerLocal11 + integerLocal16);
                  integerLocal13 = ((255 & DiagnosticSupport002.byteArrayState0008[4]) << 8) + (DiagnosticSupport002.byteArrayState0008[5] & 255);
                  integerLocal14 = ((DiagnosticSupport002.byteArrayState0008[6] & 255) << 16) + (DiagnosticSupport002.byteArrayState0008[7] << 8 & 65280) + (DiagnosticSupport002.byteArrayState0008[8] & 255);
                  integerLocal15 = DiagnosticSupport002.byteArrayState0008[9] & 255;
                  integerLocal12 = (-16777216 & DiagnosticSupport002.byteArrayState0008[0] << 24) + ((DiagnosticSupport002.byteArrayState0008[1] & 255) << 16) + ((DiagnosticSupport002.byteArrayState0008[2] & 255) << 8) + (255 & DiagnosticSupport002.byteArrayState0008[3]);
                } else {
                  integerLocal16 = 8;
                  if (512 < integerLocal11) {
                    integerLocal11 = 512;
                  }
                  this.mixedSupport091State0003.performAction1267(0, DiagnosticSupport002.byteArrayState0008, 741, integerLocal16 + integerLocal11);
                  integerLocal14 = (DiagnosticSupport002.byteArrayState0008[4] << 16 & 16711680) + (DiagnosticSupport002.byteArrayState0008[5] << 8 & 65280) + (255 & DiagnosticSupport002.byteArrayState0008[6]);
                  integerLocal13 = (255 & DiagnosticSupport002.byteArrayState0008[3]) + ((DiagnosticSupport002.byteArrayState0008[2] & 255) << 8);
                  integerLocal15 = DiagnosticSupport002.byteArrayState0008[7] & 255;
                  integerLocal12 = (DiagnosticSupport002.byteArrayState0008[1] & 255) + (65280 & DiagnosticSupport002.byteArrayState0008[0] << 8);
                }
                if (integerLocal12 != integerArgument1) {
                  return null;
                }
                if (integerLocal10 != integerLocal13) {
                  return null;
                }
                if (this.integerState0380 != integerLocal15) {
                  return null;
                }
                if (integerLocal14 < 0) {
                  return null;
                }
                if (this.mixedSupport091State0003.computeLong1272(55) / 520L < (long)integerLocal14) {
                  return null;
                }
                integerLocal17 = integerLocal16 + integerLocal11;
                for (integerLocal1 = integerLocal16; integerLocal17 > integerLocal1; integerLocal1++) {
                  previousIntegerLocal2 = integerLocal9;
                  integerLocal9++;
                  byteArrayLocal8[previousIntegerLocal2] = DiagnosticSupport002.byteArrayState0008[integerLocal1];
                }
                integerLocal10++;
                integerLocal7 = integerLocal14;
              }
              stackByteArrayLocal23 = byteArrayLocal8;
              return stackByteArrayLocal23;
            } catch (java.io.IOException caughtParameterLocal26) {
              caughtExceptionLocal25 = caughtParameterLocal26;
              iOExceptionLocal6 = (IOException) (Object) caughtExceptionLocal25;
              stackObjectLocal24 = null;
              return (byte[]) (stackObjectLocal24);
            }
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal27) {
          throw uncheckedExceptionLocal27;
        } catch (Throwable checkedExceptionLocal28) {
          throw new RuntimeException(checkedExceptionLocal28);
        }
    }

    MixedSupport073(int integerArgument1, MixedSupport091 mixedSupport091Argument2, MixedSupport091 mixedSupport091Argument3, int integerArgument4) {
        this.mixedSupport091State0002 = null;
        this.mixedSupport091State0003 = null;
        this.integerState0381 = 65000;
        try {
          this.mixedSupport091State0002 = mixedSupport091Argument3;
          this.mixedSupport091State0003 = mixedSupport091Argument2;
          this.integerState0381 = integerArgument4;
          this.integerState0380 = integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "kh.<init>(" + integerArgument1 + ',' + (mixedSupport091Argument2 != null ? "{...}" : "null") + ',' + (mixedSupport091Argument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ')');
        }
    }

    static {
        stringState0311 = "Connection timed out. Please try using a different server.";
        stringState0310 = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        integerArrayState0123 = new int[4];
        stringState0312 = "Play the game without logging in just yet";
    }
}
