/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class NetworkSupport009 {
    static String stringState0387;
    static java.awt.Frame frameState0002;
    static String stringState0388;

    final static void performAction1356(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, byte byteArgument8, int integerArgument9, int integerArgument10, int integerArgument11, int integerArgument12, int[] integerArrayArgument13, int integerArgument14, int integerArgument15, int integerArgument16, int integerArgument17) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        RuntimeException stackRuntimeExceptionLocal22 = null;
        StringBuilder stackStringBuilderLocal23 = null;
        String stackStringLocal24 = null;
        RuntimeException caughtExceptionLocal25 = null;
        RuntimeException runtimeExceptionLocal26 = null;
        int integerLocal27 = 0;
        int integerLocal28 = 0;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32;
        int integerLocal33;
        int integerLocal34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        integerLocal21 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument15 >= 0 &&
            integerArgument12 < MixedSupport109.integerState0654) {
            if (0 > integerArgument11 &&
              integerArgument5 < 0 &&
              integerArgument6 < 0) {
              return;
            }
            if (MixedSupport109.integerState0653 <= integerArgument11 &&
              MixedSupport109.integerState0653 <= integerArgument5 &&
              MixedSupport109.integerState0653 <= integerArgument6) {
              return;
            }
            if (byteArgument8 >= -32) {
              NetworkSupport009.computeRenderingSupport0081357(false, 33);
            }
            integerLocal18 = integerArgument15 - integerArgument12;
            if (integerArgument12 == integerArgument4) {
              if (integerArgument12 != integerArgument15) {
                integerLocal19 = -integerArgument4 + integerArgument15;
                if (integerArgument5 <= integerArgument11) {
                  integerLocal12 = (integerArgument10 - integerArgument3 << 16) / integerLocal18;
                  integerLocal11 = (integerArgument10 - integerArgument7 << 16) / integerLocal19;
                  integerLocal15 = (-integerArgument2 + integerArgument14 << 16) / integerLocal19;
                  integerLocal5 = integerArgument9 << 16;
                  integerLocal13 = integerArgument2 << 16;
                  integerLocal6 = integerArgument16 << 16;
                  integerLocal8 = (integerArgument1 - integerArgument16 << 16) / integerLocal18;
                  integerLocal4 = (-integerArgument11 + integerArgument6 << 16) / integerLocal18;
                  integerLocal7 = (integerArgument1 - integerArgument9 << 16) / integerLocal19;
                  integerLocal10 = integerArgument3 << 16;
                  integerLocal16 = (integerArgument14 - integerArgument17 << 16) / integerLocal18;
                  integerLocal14 = integerArgument17 << 16;
                  integerLocal1 = integerArgument5 << 16;
                  integerLocal9 = integerArgument7 << 16;
                  integerLocal3 = (integerArgument6 - integerArgument5 << 16) / integerLocal19;
                  integerLocal2 = integerArgument11 << 16;
                } else {
                  integerLocal8 = (integerArgument1 - integerArgument9 << 16) / integerLocal19;
                  integerLocal9 = integerArgument3 << 16;
                  integerLocal2 = integerArgument5 << 16;
                  integerLocal6 = integerArgument9 << 16;
                  integerLocal15 = (-integerArgument17 + integerArgument14 << 16) / integerLocal18;
                  integerLocal11 = (integerArgument10 - integerArgument3 << 16) / integerLocal18;
                  integerLocal1 = integerArgument11 << 16;
                  integerLocal12 = (integerArgument10 - integerArgument7 << 16) / integerLocal19;
                  integerLocal7 = (integerArgument1 - integerArgument16 << 16) / integerLocal18;
                  integerLocal3 = (-integerArgument11 + integerArgument6 << 16) / integerLocal18;
                  integerLocal10 = integerArgument7 << 16;
                  integerLocal4 = (integerArgument6 - integerArgument5 << 16) / integerLocal19;
                  integerLocal5 = integerArgument16 << 16;
                  integerLocal14 = integerArgument2 << 16;
                  integerLocal16 = (-integerArgument2 + integerArgument14 << 16) / integerLocal19;
                  integerLocal13 = integerArgument17 << 16;
                }
              } else {
                integerLocal15 = 0;
                integerLocal16 = 0;
                integerLocal13 = integerArgument17;
                integerLocal14 = integerArgument2;
                integerLocal7 = 0;
                integerLocal10 = integerArgument7;
                integerLocal6 = integerArgument9;
                integerLocal2 = integerArgument5 << 16;
                integerLocal5 = integerArgument16;
                integerLocal9 = integerArgument3;
                integerLocal1 = integerArgument11 << 16;
                integerLocal8 = 0;
                integerLocal4 = 0;
                integerLocal11 = 0;
                integerLocal12 = 0;
                integerLocal3 = 0;
              }
              if (integerArgument12 < 0) {
                integerArgument12 = Math.min(-integerArgument12, integerArgument4 - integerArgument12);
                integerLocal10 = integerLocal10 + integerArgument12 * integerLocal12;
                integerLocal14 = integerLocal14 + integerArgument12 * integerLocal16;
                integerLocal2 = integerLocal2 + integerArgument12 * integerLocal4;
                integerLocal1 = integerLocal1 + integerArgument12 * integerLocal3;
                integerLocal5 = integerLocal5 + integerLocal7 * integerArgument12;
                integerLocal6 = integerLocal6 + integerLocal8 * integerArgument12;
                integerLocal13 = integerLocal13 + integerArgument12 * integerLocal15;
                integerLocal9 = integerLocal9 + integerArgument12 * integerLocal11;
                integerArgument12 = 0;
              }
              integerLocal17 = 0;
            } else {
              integerLocal2 = integerArgument11 << 16;
              integerLocal1 = integerArgument11 << 16;
              integerLocal14 = integerArgument17 << 16;
              integerLocal13 = integerArgument17 << 16;
              integerLocal6 = integerArgument16 << 16;
              integerLocal5 = integerArgument16 << 16;
              integerLocal10 = integerArgument3 << 16;
              integerLocal9 = integerArgument3 << 16;
              integerLocal19 = -integerArgument12 + integerArgument4;
              integerLocal3 = (integerArgument5 - integerArgument11 << 16) / integerLocal19;
              integerLocal4 = (integerArgument6 - integerArgument11 << 16) / integerLocal18;
              if (integerLocal4 > integerLocal3) {
                integerLocal17 = 0;
                integerLocal11 = (-integerArgument3 + integerArgument7 << 16) / integerLocal19;
                integerLocal16 = (integerArgument14 - integerArgument17 << 16) / integerLocal18;
                integerLocal8 = (-integerArgument16 + integerArgument1 << 16) / integerLocal18;
                integerLocal12 = (-integerArgument3 + integerArgument10 << 16) / integerLocal18;
                integerLocal15 = (-integerArgument17 + integerArgument2 << 16) / integerLocal19;
                integerLocal7 = (integerArgument9 - integerArgument16 << 16) / integerLocal19;
              } else {
                integerLocal20 = integerLocal3;
                integerLocal3 = integerLocal4;
                integerLocal4 = integerLocal20;
                integerLocal11 = (-integerArgument3 + integerArgument10 << 16) / integerLocal18;
                integerLocal16 = (-integerArgument17 + integerArgument2 << 16) / integerLocal19;
                integerLocal15 = (integerArgument14 - integerArgument17 << 16) / integerLocal18;
                integerLocal17 = 1;
                integerLocal12 = (integerArgument7 - integerArgument3 << 16) / integerLocal19;
                integerLocal7 = (integerArgument1 - integerArgument16 << 16) / integerLocal18;
                integerLocal8 = (-integerArgument16 + integerArgument9 << 16) / integerLocal19;
              }
              boolean frameRemainderLocal44 = true;
              if (integerArgument12 < 0) {
                if (integerArgument4 < 0) {
                  integerArgument12 = integerArgument4 - integerArgument12;
                  integerLocal10 = integerLocal10 + integerLocal12 * integerArgument12;
                  integerLocal1 = integerLocal1 + integerLocal3 * integerArgument12;
                  integerLocal13 = integerLocal13 + integerLocal15 * integerArgument12;
                  integerLocal14 = integerLocal14 + integerLocal16 * integerArgument12;
                  integerLocal5 = integerLocal5 + integerArgument12 * integerLocal7;
                  integerLocal6 = integerLocal6 + integerArgument12 * integerLocal8;
                  integerLocal9 = integerLocal9 + integerLocal11 * integerArgument12;
                  integerLocal2 = integerLocal2 + integerArgument12 * integerLocal4;
                  integerArgument12 = integerArgument4;
                  frameRemainderLocal44 = false;
                }
                else {
                  integerArgument12 = -integerArgument12;
                  integerLocal9 = integerLocal9 + integerArgument12 * integerLocal11;
                  integerLocal10 = integerLocal10 + integerLocal12 * integerArgument12;
                  integerLocal6 = integerLocal6 + integerLocal8 * integerArgument12;
                  integerLocal2 = integerLocal2 + integerLocal4 * integerArgument12;
                  integerLocal1 = integerLocal1 + integerArgument12 * integerLocal3;
                  integerLocal14 = integerLocal14 + integerArgument12 * integerLocal16;
                  integerLocal13 = integerLocal13 + integerArgument12 * integerLocal15;
                  integerLocal5 = integerLocal5 + integerLocal7 * integerArgument12;
                  integerArgument12 = 0;
                }
              }
              if (frameRemainderLocal44) {
                integerLocal38 = MixedSupport109.integerArrayState0197[integerArgument12];
                while (integerArgument4 > integerArgument12) {
                  integerLocal27 = integerLocal1 >> 16;
                  if (MixedSupport109.integerState0653 > integerLocal27) {
                    integerLocal28 = -(integerLocal1 >> 16) + (integerLocal2 >> 16);
                    if (integerLocal28 != 0) {
                      integerLocal29 = (integerLocal6 - integerLocal5) / integerLocal28;
                      integerLocal30 = (-integerLocal9 + integerLocal10) / integerLocal28;
                      integerLocal31 = (-integerLocal13 + integerLocal14) / integerLocal28;
                      if (integerLocal27 + integerLocal28 >= MixedSupport109.integerState0653) {
                        integerLocal28 = -1 + (MixedSupport109.integerState0653 - integerLocal27);
                      }
                      if (integerLocal27 >= 0) {
                        SceneWidgetPart013.performAction1934(integerLocal9, integerLocal27 + integerLocal38, integerLocal30, integerLocal29, integerLocal5, integerLocal28, 9, integerArrayArgument13, integerLocal13, integerLocal31);
                      } else {
                        SceneWidgetPart013.performAction1934(integerLocal9 - integerLocal27 * integerLocal30, integerLocal38, integerLocal30, integerLocal29, integerLocal5 - integerLocal27 * integerLocal29, integerLocal28 + integerLocal27, 9, integerArrayArgument13, integerLocal13 - integerLocal27 * integerLocal31, integerLocal31);
                      }
                    } else {
                      if (integerLocal27 >= 0 &&
                        integerLocal27 < MixedSupport109.integerState0653) {
                        SceneWidgetPart013.performAction1934(integerLocal9, integerLocal27 + integerLocal38, 0, 0, integerLocal5, integerLocal28, 9, integerArrayArgument13, integerLocal13, 0);
                      }
                    }
                  }
                  integerArgument12++;
                  if (integerArgument12 >= MixedSupport109.integerState0654) {
                    return;
                  }
                  integerLocal2 = integerLocal2 + integerLocal4;
                  integerLocal5 = integerLocal5 + integerLocal7;
                  integerLocal14 = integerLocal14 + integerLocal16;
                  integerLocal10 = integerLocal10 + integerLocal12;
                  integerLocal6 = integerLocal6 + integerLocal8;
                  integerLocal38 = integerLocal38 + SoftwareRaster.integerState0285;
                  integerLocal1 = integerLocal1 + integerLocal3;
                  integerLocal9 = integerLocal9 + integerLocal11;
                  integerLocal13 = integerLocal13 + integerLocal15;
                }
              }
              integerLocal39 = -integerArgument4 + integerArgument15;
              if (integerLocal39 == 0) {
                integerLocal7 = 0;
                integerLocal3 = 0;
                integerLocal16 = 0;
                integerLocal4 = 0;
                integerLocal15 = 0;
                integerLocal8 = 0;
                integerLocal11 = 0;
                integerLocal12 = 0;
              } else {
                integerLocal40 = integerArgument6 << 16;
                integerLocal41 = integerArgument1 << 16;
                integerLocal42 = integerArgument10 << 16;
                integerLocal43 = integerArgument14 << 16;
                if (integerLocal17 == 0) {
                  integerLocal5 = integerArgument9 << 16;
                  integerLocal9 = integerArgument7 << 16;
                  integerLocal13 = integerArgument2 << 16;
                  integerLocal1 = integerArgument5 << 16;
                } else {
                  integerLocal10 = integerArgument7 << 16;
                  integerLocal6 = integerArgument9 << 16;
                  integerLocal14 = integerArgument2 << 16;
                  integerLocal2 = integerArgument5 << 16;
                }
                integerLocal15 = (-integerLocal13 + integerLocal43) / integerLocal39;
                integerLocal7 = (integerLocal41 - integerLocal5) / integerLocal39;
                integerLocal11 = (-integerLocal9 + integerLocal42) / integerLocal39;
                integerLocal4 = (-integerLocal2 + integerLocal40) / integerLocal39;
                integerLocal8 = (-integerLocal6 + integerLocal41) / integerLocal39;
                integerLocal16 = (-integerLocal14 + integerLocal43) / integerLocal39;
                integerLocal3 = (integerLocal40 - integerLocal1) / integerLocal39;
                integerLocal12 = (integerLocal42 - integerLocal10) / integerLocal39;
              }
            }
            if (integerArgument12 < 0) {
              integerArgument12 = -integerArgument12;
              integerLocal9 = integerLocal9 + integerArgument12 * integerLocal11;
              integerLocal5 = integerLocal5 + integerArgument12 * integerLocal7;
              integerLocal2 = integerLocal2 + integerArgument12 * integerLocal4;
              integerLocal1 = integerLocal1 + integerArgument12 * integerLocal3;
              integerLocal14 = integerLocal14 + integerLocal16 * integerArgument12;
              integerLocal13 = integerLocal13 + integerLocal15 * integerArgument12;
              integerLocal10 = integerLocal10 + integerArgument12 * integerLocal12;
              integerLocal6 = integerLocal6 + integerLocal8 * integerArgument12;
              integerArgument12 = 0;
            }
            integerLocal32 = MixedSupport109.integerArrayState0197[integerArgument12];
            while (integerArgument12 < integerArgument15) {
              integerLocal33 = integerLocal1 >> 16;
              if (MixedSupport109.integerState0653 > integerLocal33) {
                integerLocal34 = (integerLocal2 >> 16) - (integerLocal1 >> 16);
                if (integerLocal34 == 0) {
                  if (integerLocal33 >= 0 &&
                    MixedSupport109.integerState0653 > integerLocal33) {
                    SceneWidgetPart013.performAction1934(integerLocal9, integerLocal33 + integerLocal32, 0, 0, integerLocal5, integerLocal34, 9, integerArrayArgument13, integerLocal13, 0);
                  }
                } else {
                  integerLocal35 = (-integerLocal5 + integerLocal6) / integerLocal34;
                  integerLocal36 = (integerLocal10 - integerLocal9) / integerLocal34;
                  integerLocal37 = (-integerLocal13 + integerLocal14) / integerLocal34;
                  if (MixedSupport109.integerState0653 <= integerLocal34 + integerLocal33) {
                    integerLocal34 = -integerLocal33 + MixedSupport109.integerState0653 - 1;
                  }
                  if (integerLocal33 >= 0) {
                    SceneWidgetPart013.performAction1934(integerLocal9, integerLocal32 + integerLocal33, integerLocal36, integerLocal35, integerLocal5, integerLocal34, 9, integerArrayArgument13, integerLocal13, integerLocal37);
                  } else {
                    SceneWidgetPart013.performAction1934(integerLocal9 - integerLocal36 * integerLocal33, integerLocal32, integerLocal36, integerLocal35, -(integerLocal33 * integerLocal35) + integerLocal5, integerLocal34 + integerLocal33, 9, integerArrayArgument13, integerLocal13 - integerLocal37 * integerLocal33, integerLocal37);
                  }
                }
              }
              integerArgument12++;
              if (integerArgument12 >= MixedSupport109.integerState0654) {
                return;
              }
              integerLocal13 = integerLocal13 + integerLocal15;
              integerLocal32 = integerLocal32 + SoftwareRaster.integerState0285;
              integerLocal10 = integerLocal10 + integerLocal12;
              integerLocal2 = integerLocal2 + integerLocal4;
              integerLocal9 = integerLocal9 + integerLocal11;
              integerLocal6 = integerLocal6 + integerLocal8;
              integerLocal14 = integerLocal14 + integerLocal16;
              integerLocal1 = integerLocal1 + integerLocal3;
              integerLocal5 = integerLocal5 + integerLocal7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal45) {
          caughtExceptionLocal25 = caughtParameterLocal45;
          runtimeExceptionLocal26 = caughtExceptionLocal25;
          stackRuntimeExceptionLocal22 = runtimeExceptionLocal26;
          stackStringBuilderLocal23 = new StringBuilder().append("oj.A(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(byteArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',').append(integerArgument11).append(',').append(integerArgument12).append(',');
          if (integerArrayArgument13 == null) {
            stackStringLocal24 = "null";
          } else {
            stackStringLocal24 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal22), ((StringBuilder) (Object) stackStringBuilderLocal23).append(stackStringLocal24).append(',').append(integerArgument14).append(',').append(integerArgument15).append(',').append(integerArgument16).append(',').append(integerArgument17).append(')').toString());
        }
    }

    final static int computeInteger1358(int integerArgument1) {
        try {
          int stackIntegerLocal1 = 0;
          int stackIntegerLocal2 = 0;
          int stackIntegerLocal3 = 0;
          int stackIntegerLocal4 = 0;
          int stackIntegerLocal5 = 0;
          Throwable caughtExceptionLocal6 = null;
          int integerLocal7 = 0;
          IOException iOExceptionLocal8 = null;
          PacketBuffer packetBufferLocal9 = null;
          if (4 <= MixedSupport124.networkSupport003State0003.integerState0132) {
            if (MixedSupport124.networkSupport003State0003.integerState0131 == -1) {
              return 3;
            }
            if (MixedSupport124.networkSupport003State0003.integerState0131 != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (integerArgument1 == MixedSupport053.integerState0273) {
              MixedSupport021.asyncTaskState0001 = UiComponentPart003.platformServiceState0001.computeAsyncTask0568(124, MixedSupport103.stringState0416, MixedSupport014.integerState0099);
              MixedSupport053.integerState0273 = MixedSupport053.integerState0273 + 1;
            }
            if (MixedSupport053.integerState0273 == 1) {
              if (2 == MixedSupport021.asyncTaskState0001.integerState0510) {
                stackIntegerLocal1 = InputAdapter002.computeInteger0076(0, -1);
                return stackIntegerLocal1;
              }
              if (MixedSupport021.asyncTaskState0001.integerState0510 == 1) {
                MixedSupport053.integerState0273 = MixedSupport053.integerState0273 + 1;
              }
            }
            if (MixedSupport053.integerState0273 == 2) {
              UiComponentPart028.bufferedSocketState0003 = new BufferedSocket((java.net.Socket) (MixedSupport021.asyncTaskState0001.objectState0004), UiComponentPart003.platformServiceState0001);
              packetBufferLocal9 = new PacketBuffer(13);
              MixedSupport049.performAction0649(GameDomainSupport003.integerState0278, MixedSupport039.integerState0233, 17, packetBufferLocal9, UiComponentPart005.integerState0122);
              packetBufferLocal9.performAction2073(true, 15);
              packetBufferLocal9.performAction2067(MixedSupport149.integerState0880, false);
              UiComponentPart028.bufferedSocketState0003.performAction1557(0, 13, integerArgument1 + 1, packetBufferLocal9.payload);
              MixedSupport053.integerState0273 = MixedSupport053.integerState0273 + 1;
              NetworkSupport007.longState0030 = 30000L + MixedSupport063.computeLong0827(integerArgument1 ^ 4);
            }
            if (MixedSupport053.integerState0273 == 3) {
              if (UiComponentPart028.bufferedSocketState0003.computeInteger1560(0) > 0) {
                integerLocal7 = UiComponentPart028.bufferedSocketState0003.computeInteger1561((byte) 8);
                if (integerLocal7 != 0) {
                  stackIntegerLocal3 = InputAdapter002.computeInteger0076(0, integerLocal7);
                  return stackIntegerLocal3;
                }
                MixedSupport053.integerState0273 = MixedSupport053.integerState0273 + 1;
              } else {
                if (NetworkSupport007.longState0030 < MixedSupport063.computeLong0827(integerArgument1 ^ 4)) {
                  stackIntegerLocal2 = InputAdapter002.computeInteger0076(0, -2);
                  return stackIntegerLocal2;
                }
              }
            }
            if (MixedSupport053.integerState0273 != 4) {
              stackIntegerLocal5 = -1;
              return stackIntegerLocal5;
            }
            MixedSupport124.networkSupport003State0003.performAction0376(UiComponentPart028.bufferedSocketState0003, (byte) -128, MixedSupport124.booleanState0182);
            UiComponentPart028.bufferedSocketState0003 = null;
            MixedSupport021.asyncTaskState0001 = null;
            MixedSupport053.integerState0273 = 0;
            stackIntegerLocal4 = 0;
            return stackIntegerLocal4;
          } catch (java.io.IOException caughtParameterLocal10) {
            caughtExceptionLocal6 = caughtParameterLocal10;
            iOExceptionLocal8 = (IOException) (Object) caughtExceptionLocal6;
            return InputAdapter002.computeInteger0076(0, -3);
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    public static void performAction1355(int integerArgument1) {
        stringState0388 = null;
        frameState0002 = null;
        stringState0387 = null;
        if (integerArgument1 != 3805) {
          stringState0388 = (String) null;
        }
    }

    final static RenderingSupport008 computeRenderingSupport0081357(boolean booleanArgument1, int integerArgument2) {
        GameDomainSupport002 gameDomainSupport002Local1 = null;
        GameDomainSupport002 gameDomainSupport002Local2 = null;
        GameDomainSupport002 gameDomainSupport002Local3 = null;
        RenderingSupport008 renderingSupport008Local4 = new RenderingSupport008(3);
        RenderingSupport008 renderingSupport008Local5 = renderingSupport008Local4;
        if (!UiComponentPart023.computeBoolean1421(-30146)) {
          renderingSupport008Local4.performAction0969(new GameDomainSupport002(23, MixedSupport146.stringArrayState0054[0], MixedSupport001.renderingSupport010State0001), 117);
          renderingSupport008Local4.performAction0969(new GameDomainSupport002(23, MixedSupport146.stringArrayState0054[1], MixedSupport001.renderingSupport010State0001), integerArgument2 - 299);
          renderingSupport008Local4.gameDomainSupport002ArrayState0001[1].integerState0176 = 200;
          gameDomainSupport002Local1 = renderingSupport008Local4.gameDomainSupport002ArrayState0001[0];
          GameDomainSupport002 gameDomainSupport002Local6 = gameDomainSupport002Local1;
          gameDomainSupport002Local1.integerState0176 = 200;
          renderingSupport008Local4.gameDomainSupport002ArrayState0001[0].integerState0174 = 320 + (-renderingSupport008Local4.gameDomainSupport002ArrayState0001[0].integerState0176 - 10);
          renderingSupport008Local4.gameDomainSupport002ArrayState0001[1].integerState0174 = 330;
          renderingSupport008Local4.gameDomainSupport002ArrayState0001[1].integerState0178 = 372;
          gameDomainSupport002Local2 = renderingSupport008Local4.gameDomainSupport002ArrayState0001[0];
          gameDomainSupport002Local2.integerState0178 = 372;
        } else {
          gameDomainSupport002Local3 = new GameDomainSupport002(20, UiComponentPart026.stringState0461, MixedSupport001.renderingSupport010State0001);
          gameDomainSupport002Local3.integerState0174 = 320 - gameDomainSupport002Local3.integerState0176 / 2;
          gameDomainSupport002Local3.integerState0178 = 372;
          renderingSupport008Local5.performAction0969(gameDomainSupport002Local3, 112);
        }
        GameDomainSupport002 gameDomainSupport002Local7 = new GameDomainSupport002(13, MixedSupport101.stringState0411, MixedSupport001.renderingSupport010State0001);
        gameDomainSupport002Local7.integerState0174 = -(gameDomainSupport002Local7.integerState0176 / 2) + 320;
        gameDomainSupport002Local7.integerState0178 = integerArgument2;
        renderingSupport008Local5.performAction0969(gameDomainSupport002Local7, 102);
        renderingSupport008Local5.integerState0374 = 70;
        renderingSupport008Local5.integerState0368 = 500;
        renderingSupport008Local5.integerState0375 = 76;
        renderingSupport008Local5.integerState0372 = 272;
        renderingSupport008Local5.performAction0968(MixedSupport019.integerState0114, booleanArgument1, -129);
        return renderingSupport008Local5;
    }

    static {
        stringState0387 = "Remove <%0> from ignore list";
        stringState0388 = "To <%0>: ";
    }
}
