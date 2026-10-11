/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MixedSupport064 {
    static int integerState0335;
    static int[] integerArrayState0111;
    static String stringState0269;
    static int integerState0336;

    final static void performAction0849(int integerArgument1) {
        DiagnosticSupport002.performAction0865(MixedSupport127.sceneWidgetState0119, MixedSupport132.sceneWidgetState0125, MixedSupport047.sceneWidgetState0038, -47, MusicTrack.sceneWidgetState0127);
        if (integerArgument1 != 8225) {
          stringState0269 = (String) null;
        }
    }

    final static void performAction0851(int integerArgument1, int integerArgument2, PlatformService platformServiceArgument3, int integerArgument4, int integerArgument5, long longArgument6, int integerArgument7, boolean booleanArgument8, int integerArgument9, int integerArgument10, boolean booleanArgument11, boolean booleanArgument12, int integerArgument13, String stringArgument14) {
        try {
          RuntimeException stackRuntimeExceptionLocal1 = null;
          StringBuilder stackStringBuilderLocal2 = null;
          String stackStringLocal3 = null;
          StringBuilder stackStringBuilderLocal4 = null;
          String stackStringLocal5 = null;
          Throwable caughtExceptionLocal6 = null;
          IOException iOExceptionLocal7 = null;
          RuntimeException runtimeExceptionLocal8 = null;
          try {
            UiComponentPart006.cipherPacketBufferState0001 = new CipherPacketBuffer(integerArgument4);
            SocketFactory.cipherPacketBufferState0002 = new CipherPacketBuffer(integerArgument5);
            MixedSupport085.stringState0340 = stringArgument14;
            CodecSupport001.platformServiceState0002 = platformServiceArgument3;
            if (!booleanArgument12) {
              return;
            }
            MixedSupport071.integerState0356 = integerArgument9;
            MixedSupport077.integerState0415 = integerArgument7;
            BufferedSocket.integerState0662 = integerArgument1;
            UiComponent.booleanState0017 = booleanArgument11;
            MixedSupport115.longState0045 = longArgument6;
            UiComponentPart010.integerState0189 = integerArgument10;
            MixedSupport052.integerState0270 = integerArgument13;
            MixedSupport018.booleanState0021 = booleanArgument8;
            CodecSupport003.integerState0686 = integerArgument2;
            if (null != CodecSupport001.platformServiceState0002.platformSupport004State0002) {
              try {
                UiComponentPart008.mixedSupport091State0001 = new MixedSupport091(CodecSupport001.platformServiceState0002.platformSupport004State0002, 64, 0);
              } catch (java.io.IOException caughtParameterLocal9) {
                caughtExceptionLocal6 = caughtParameterLocal9;
                iOExceptionLocal7 = (IOException) (Object) caughtExceptionLocal6;
                throw new RuntimeException(iOExceptionLocal7.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal10) {
            caughtExceptionLocal6 = caughtParameterLocal10;
            runtimeExceptionLocal8 = (RuntimeException) (Object) caughtExceptionLocal6;
            stackRuntimeExceptionLocal1 = runtimeExceptionLocal8;
            stackStringBuilderLocal2 = new StringBuilder().append("j.C(").append(integerArgument1).append(',').append(integerArgument2).append(',');
            if (platformServiceArgument3 == null) {
              stackStringLocal3 = "null";
            } else {
              stackStringLocal3 = "{...}";
            }
            stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(longArgument6).append(',').append(integerArgument7).append(',').append(booleanArgument8).append(',').append(integerArgument9).append(',').append(integerArgument10).append(',').append(booleanArgument11).append(',').append(booleanArgument12).append(',').append(integerArgument13).append(',');
            if (stringArgument14 == null) {
              stackStringLocal5 = "null";
            } else {
              stackStringLocal5 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal11) {
          throw uncheckedExceptionLocal11;
        } catch (Throwable checkedExceptionLocal12) {
          throw new RuntimeException(checkedExceptionLocal12);
        }
    }

    final static void performAction0847(byte byteArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        int integerLocal1 = 0;
        int previousIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument5 <= integerArgument7) {
            return;
          }
          if (1 + integerArgument7 >= integerArgument3) {
            return;
          }
          if (integerArgument3 > 5 + integerArgument7 &&
            integerArgument4 != integerArgument6) {
            integerLocal5 = (integerArgument4 >> 1) + ((integerArgument6 >> 1) + (integerArgument6 & integerArgument4 & 1));
            integerLocal7 = integerArgument7;
            integerLocal8 = integerArgument4;
            integerLocal9 = integerArgument6;
            for (integerLocal1 = integerArgument7; integerArgument3 > integerLocal1; integerLocal1++) {
              integerLocal10 = MixedSupport017.integerArrayState0022[integerLocal1];
              if (!booleanArgument2) {
                stackIntegerLocal3 = MixedSupport015.integerArrayState0020[integerLocal10];
              } else {
                stackIntegerLocal3 = ResourceSupport001.integerArrayState0012[integerLocal10];
              }
              integerLocal11 = stackIntegerLocal3;
              if (integerLocal5 >= integerLocal11) {
                if (integerLocal11 > integerLocal9) {
                  integerLocal9 = integerLocal11;
                }
              } else {
                MixedSupport017.integerArrayState0022[integerLocal1] = MixedSupport017.integerArrayState0022[integerLocal7];
                previousIntegerLocal2 = integerLocal7;
                integerLocal7++;
                MixedSupport017.integerArrayState0022[previousIntegerLocal2] = integerLocal10;
                if (integerLocal8 > integerLocal11) {
                  integerLocal8 = integerLocal11;
                }
              }
            }
            MixedSupport064.performAction0847((byte) -33, booleanArgument2, integerLocal7, integerArgument4, integerArgument5, integerLocal8, integerArgument7);
            MixedSupport064.performAction0847(byteArgument1, booleanArgument2, integerArgument3, integerLocal9, integerArgument5, integerArgument6, integerLocal7);
            return;
          }
          for (integerLocal13 = -1 + integerArgument3; integerLocal13 > integerArgument7; integerLocal13--) {
            for (integerLocal14 = integerArgument7; integerLocal13 > integerLocal14; integerLocal14++) {
              integerLocal15 = MixedSupport017.integerArrayState0022[integerLocal14];
              integerLocal16 = MixedSupport017.integerArrayState0022[1 + integerLocal14];
              if (MixedSupport030.computeBoolean0452((byte) 100, booleanArgument2, integerLocal16, integerLocal15)) {
                MixedSupport017.integerArrayState0022[integerLocal14] = integerLocal16;
                MixedSupport017.integerArrayState0022[1 + integerLocal14] = integerLocal15;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal4 = caughtParameterLocal17;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal6), "j.A(" + byteArgument1 + ',' + booleanArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ')');
        }
    }

    final static String computeString0853(Throwable throwableArgument1, byte byteArgument2) throws IOException {
        String stringLocal1;
        PrintWriter printWriterLocal2;
        String stringLocal3;
        int integerLocal4;
        int integerLocal5;
        String stringLocal6;
        int integerLocal7;
        int integerLocal8;
        DiagnosticSupport002 diagnosticSupport002Local9;
        StringWriter stringWriterLocal10;
        BufferedReader bufferedReaderLocal11;
        String stringLocal12;
        String stringLocal13;
        String stringLocal14;
        String stringLocal15;
        String stringLocal16;
        String stringLocal17;
        BufferedReader bufferedReaderLocal18;
        String stringLocal19;
        BufferedReader bufferedReaderLocal20;
        String stringLocal21;
        String stringLocal22;
        String stringLocal23;
        String stringLocal24;
        String stringLocal25;
        String stringLocal26;
        String stringLocal27;
        int integerLocal28;
        int integerLocal29;
        int integerLocal30;
        String stringLocal31;
        String stringLocal32;
        String stringLocal33;
        String stringLocal34;
        String stringLocal35;
        String stringLocal36;
        String stringLocal37;
        String stringLocal38;
        String stringLocal39;
        String stringLocal40;
        String stringLocal41;
        String stringLocal42;
        String stringLocal43;
        String stringLocal44;
        String stringLocal45;
        String stringLocal46;
        String stringLocal47;
        String stringLocal48;
        String stringLocal49;
        String stringLocal50;
        String stringLocal51;
        String stringLocal52;
        String stringLocal53;
        String stringLocal54;
        String stringLocal55;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (throwableArgument1 instanceof DiagnosticSupport002) {
          diagnosticSupport002Local9 = (DiagnosticSupport002) ((Object) throwableArgument1);
          stringLocal1 = diagnosticSupport002Local9.stringState0270 + " | ";
          stringLocal6 = stringLocal1;
          throwableArgument1 = diagnosticSupport002Local9.throwableState0001;
        } else {
          stringLocal1 = "";
        }
        stringWriterLocal10 = new StringWriter();
        printWriterLocal2 = new PrintWriter((Writer) ((Object) stringWriterLocal10));
        throwableArgument1.printStackTrace(printWriterLocal2);
        printWriterLocal2.close();
        stringLocal3 = stringWriterLocal10.toString();
        stringLocal31 = stringLocal3;
        stringLocal36 = stringLocal3;
        if (byteArgument2 == 37) {
          bufferedReaderLocal11 = new BufferedReader((Reader) ((Object) new StringReader(stringLocal3)));
          stringLocal17 = bufferedReaderLocal11.readLine();
          stringLocal32 = stringLocal17;
          stringLocal37 = stringLocal17;
          while (true) {
            stringLocal12 = bufferedReaderLocal11.readLine();
            stringLocal41 = stringLocal12;
            stringLocal54 = stringLocal12;
            stringLocal41 = stringLocal54;
            if (stringLocal12 == null) {
              stringLocal41 = stringLocal54;
              stringLocal54 = stringLocal41;
              stringLocal41 = stringLocal54;
              stringLocal41 = stringLocal41 + "| " + stringLocal17;
              stringLocal54 = stringLocal41;
              return stringLocal41;
            }
            integerLocal4 = stringLocal12.indexOf('(');
            integerLocal5 = stringLocal12.indexOf(')', integerLocal4 + 1);
            if (integerLocal4 == -1) {
              stringLocal54 = stringLocal12;
              stringLocal41 = stringLocal54;
              stringLocal41 = stringLocal54;
            } else {
              stringLocal54 = stringLocal12.substring(0, integerLocal4);
            }
            stringLocal13 = stringLocal54.trim();
            stringLocal41 = stringLocal13;
            stringLocal41 = stringLocal13;
            stringLocal14 = stringLocal13.substring(stringLocal13.lastIndexOf(' ') + 1);
            stringLocal41 = stringLocal14;
            stringLocal41 = stringLocal14;
            stringLocal15 = stringLocal14.substring(1 + stringLocal14.lastIndexOf('\t'));
            stringLocal41 = stringLocal15;
            stringLocal41 = stringLocal15;
            stringLocal16 = stringLocal41 + stringLocal15;
            stringLocal41 = stringLocal16;
            stringLocal41 = stringLocal16;
            stringLocal41 = stringLocal16;
            if (integerLocal4 != -1 &&
              integerLocal5 != -1) {
              integerLocal7 = stringLocal12.indexOf(".java:", integerLocal4);
              if (integerLocal7 >= 0) {
                stringLocal41 = stringLocal16 + stringLocal12.substring(integerLocal7 + 5, integerLocal5);
              }
            }
            stringLocal41 = stringLocal41 + ' ';
          }
        }
        integerState0335 = 30;
        bufferedReaderLocal20 = new BufferedReader((Reader) ((Object) new StringReader(stringLocal3)));
        bufferedReaderLocal18 = bufferedReaderLocal20;
        stringLocal26 = bufferedReaderLocal20.readLine();
        stringLocal33 = stringLocal26;
        stringLocal38 = stringLocal26;
        stringLocal19 = stringLocal26;
        stringLocal34 = stringLocal19;
        stringLocal39 = stringLocal19;
        while (true) {
          stringLocal21 = bufferedReaderLocal20.readLine();
          stringLocal35 = stringLocal21;
          stringLocal40 = stringLocal21;
          stringLocal42 = stringLocal40;
          if (stringLocal21 == null) {
            stringLocal43 = stringLocal40;
            stringLocal40 = stringLocal43;
            stringLocal43 = stringLocal40;
            stringLocal43 = stringLocal43 + "| " + stringLocal26;
            stringLocal27 = stringLocal43;
            stringLocal40 = stringLocal43;
            return stringLocal43;
          }
          integerLocal28 = stringLocal21.indexOf('(');
          integerLocal29 = stringLocal21.indexOf(')', integerLocal28 + 1);
          if (integerLocal28 == -1) {
            stringLocal55 = stringLocal21;
            stringLocal44 = stringLocal55;
            stringLocal44 = stringLocal55;
          } else {
            stringLocal55 = stringLocal21.substring(0, integerLocal28);
          }
          stringLocal22 = stringLocal55.trim();
          stringLocal45 = stringLocal22;
          stringLocal46 = stringLocal22;
          stringLocal23 = stringLocal22.substring(stringLocal22.lastIndexOf(' ') + 1);
          stringLocal47 = stringLocal23;
          stringLocal48 = stringLocal23;
          stringLocal24 = stringLocal23.substring(1 + stringLocal23.lastIndexOf('\t'));
          stringLocal49 = stringLocal24;
          stringLocal50 = stringLocal24;
          stringLocal25 = stringLocal50 + stringLocal24;
          stringLocal51 = stringLocal25;
          stringLocal52 = stringLocal25;
          stringLocal53 = stringLocal25;
          if (integerLocal28 != -1 &&
            integerLocal29 != -1) {
            integerLocal30 = stringLocal21.indexOf(".java:", integerLocal28);
            if (integerLocal30 >= 0) {
              stringLocal53 = stringLocal25 + stringLocal21.substring(integerLocal30 + 5, integerLocal29);
            }
          }
          stringLocal53 = stringLocal53 + ' ';
        }
    }

    final static boolean computeBoolean0850(int integerArgument1, char characterArgument2) {
        boolean stackBooleanLocal1 = false;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        if (integerArgument1 != -8241) {
          integerArrayState0111 = (int[]) null;
          if (characterArgument2 < 48) {
            if (characterArgument2 < 65) {
              if (characterArgument2 < 97) {
                return false;
              }
              if (characterArgument2 > 122) {
                return false;
              }
              return true;
            }
            if (characterArgument2 <= 90) {
              return true;
            }
            stackBooleanLocal1 = (characterArgument2 >= 97) && (characterArgument2 <= 122);
            return stackBooleanLocal1;
          }
          if (57 >= characterArgument2) {
            return true;
          }
          if (characterArgument2 < 65) {
            if (characterArgument2 < 97) {
              return false;
            }
            if (characterArgument2 <= 122) {
              return true;
            }
            return false;
          }
          if (characterArgument2 <= 90) {
            return true;
          }
          stackBooleanLocal2 = (characterArgument2 >= 97) && (characterArgument2 <= 122);
          return stackBooleanLocal2;
        }
        if (characterArgument2 < 48) {
          if (characterArgument2 < 65) {
            if (characterArgument2 < 97) {
              return false;
            }
            if (characterArgument2 <= 122) {
              return true;
            }
            return false;
          }
          if (characterArgument2 <= 90) {
            return true;
          }
          stackBooleanLocal4 = (characterArgument2 >= 97) && (characterArgument2 <= 122);
          return stackBooleanLocal4;
        }
        if (57 >= characterArgument2) {
          return true;
        }
        if (characterArgument2 < 65) {
          if (characterArgument2 < 97) {
            return false;
          }
          if (characterArgument2 > 122) {
            return false;
          }
          return true;
        }
        if (characterArgument2 <= 90) {
          return true;
        }
        stackBooleanLocal3 = (characterArgument2 >= 97) && (characterArgument2 <= 122);
        return stackBooleanLocal3;
    }

    public static void performAction0854(boolean booleanArgument1) {
        if (!booleanArgument1) {
          integerArrayState0111 = (int[]) null;
          stringState0269 = null;
          integerArrayState0111 = null;
          return;
        }
        stringState0269 = null;
        integerArrayState0111 = null;
    }

    final static byte computeByte0848(char characterArgument1, byte byteArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument2 != 28) {
          return (byte) 85;
        }
        if (characterArgument1 <= 0) {
          if (characterArgument1 < 160) {
            if (characterArgument1 == 8364) {
              integerLocal1 = -128;
            } else {
              if (characterArgument1 != 8218) {
                if (402 == characterArgument1) {
                  integerLocal1 = -125;
                } else {
                  if (characterArgument1 == 8222) {
                    integerLocal1 = -124;
                  } else {
                    if (characterArgument1 != 8230) {
                      if (characterArgument1 != 8224) {
                        if (8225 == characterArgument1) {
                          integerLocal1 = -121;
                        } else {
                          if (characterArgument1 != 710) {
                            if (characterArgument1 == 8240) {
                              integerLocal1 = -119;
                            } else {
                              if (characterArgument1 == 352) {
                                integerLocal1 = -118;
                              } else {
                                if (characterArgument1 != 8249) {
                                  if (characterArgument1 == 338) {
                                    integerLocal1 = -116;
                                  } else {
                                    if (381 != characterArgument1) {
                                      if (characterArgument1 != 8216) {
                                        if (characterArgument1 == 8217) {
                                          integerLocal1 = -110;
                                        } else {
                                          if (characterArgument1 == 8220) {
                                            integerLocal1 = -109;
                                          } else {
                                            if (characterArgument1 != 8221) {
                                              if (8226 == characterArgument1) {
                                                integerLocal1 = -107;
                                              } else {
                                                if (8211 != characterArgument1) {
                                                  if (8212 == characterArgument1) {
                                                    integerLocal1 = -105;
                                                  } else {
                                                    if (characterArgument1 != 732) {
                                                      if (characterArgument1 == 8482) {
                                                        integerLocal1 = -103;
                                                      } else {
                                                        if (characterArgument1 == 353) {
                                                          integerLocal1 = -102;
                                                        } else {
                                                          if (8250 != characterArgument1) {
                                                            if (characterArgument1 != 339) {
                                                              if (characterArgument1 != 382) {
                                                                integerLocal1 = (characterArgument1 == 376) ? -97 : 63;
                                                              } else {
                                                                integerLocal1 = -98;
                                                              }
                                                            } else {
                                                              integerLocal1 = -100;
                                                            }
                                                          } else {
                                                            integerLocal1 = -101;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      integerLocal1 = -104;
                                                    }
                                                  }
                                                } else {
                                                  integerLocal1 = -106;
                                                }
                                              }
                                            } else {
                                              integerLocal1 = -108;
                                            }
                                          }
                                        }
                                      } else {
                                        integerLocal1 = -111;
                                      }
                                    } else {
                                      integerLocal1 = -114;
                                    }
                                  }
                                } else {
                                  integerLocal1 = -117;
                                }
                              }
                            }
                          } else {
                            integerLocal1 = -120;
                          }
                        }
                      } else {
                        integerLocal1 = -122;
                      }
                    } else {
                      integerLocal1 = -123;
                    }
                  }
                }
              } else {
                integerLocal1 = -126;
              }
            }
          } else {
            if (255 >= characterArgument1) {
              integerLocal1 = (byte)characterArgument1;
            } else {
              if (characterArgument1 == 8364) {
                integerLocal1 = -128;
              } else {
                if (characterArgument1 != 8218) {
                  if (402 == characterArgument1) {
                    integerLocal1 = -125;
                  } else {
                    if (characterArgument1 == 8222) {
                      integerLocal1 = -124;
                    } else {
                      if (characterArgument1 != 8230) {
                        if (characterArgument1 != 8224) {
                          if (8225 == characterArgument1) {
                            integerLocal1 = -121;
                          } else {
                            if (characterArgument1 != 710) {
                              if (characterArgument1 == 8240) {
                                integerLocal1 = -119;
                              } else {
                                if (characterArgument1 == 352) {
                                  integerLocal1 = -118;
                                } else {
                                  if (characterArgument1 != 8249) {
                                    if (characterArgument1 == 338) {
                                      integerLocal1 = -116;
                                    } else {
                                      if (381 != characterArgument1) {
                                        if (characterArgument1 != 8216) {
                                          if (characterArgument1 == 8217) {
                                            integerLocal1 = -110;
                                          } else {
                                            if (characterArgument1 == 8220) {
                                              integerLocal1 = -109;
                                            } else {
                                              if (characterArgument1 != 8221) {
                                                if (8226 == characterArgument1) {
                                                  integerLocal1 = -107;
                                                } else {
                                                  if (8211 != characterArgument1) {
                                                    if (8212 == characterArgument1) {
                                                      integerLocal1 = -105;
                                                    } else {
                                                      if (characterArgument1 != 732) {
                                                        if (characterArgument1 == 8482) {
                                                          integerLocal1 = -103;
                                                        } else {
                                                          if (characterArgument1 == 353) {
                                                            integerLocal1 = -102;
                                                          } else {
                                                            if (8250 != characterArgument1) {
                                                              if (characterArgument1 != 339) {
                                                                if (characterArgument1 != 382) {
                                                                  integerLocal1 = (characterArgument1 == 376) ? -97 : 63;
                                                                } else {
                                                                  integerLocal1 = -98;
                                                                }
                                                              } else {
                                                                integerLocal1 = -100;
                                                              }
                                                            } else {
                                                              integerLocal1 = -101;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        integerLocal1 = -104;
                                                      }
                                                    }
                                                  } else {
                                                    integerLocal1 = -106;
                                                  }
                                                }
                                              } else {
                                                integerLocal1 = -108;
                                              }
                                            }
                                          }
                                        } else {
                                          integerLocal1 = -111;
                                        }
                                      } else {
                                        integerLocal1 = -114;
                                      }
                                    }
                                  } else {
                                    integerLocal1 = -117;
                                  }
                                }
                              }
                            } else {
                              integerLocal1 = -120;
                            }
                          }
                        } else {
                          integerLocal1 = -122;
                        }
                      } else {
                        integerLocal1 = -123;
                      }
                    }
                  }
                } else {
                  integerLocal1 = -126;
                }
              }
            }
          }
          return (byte) integerLocal1;
        }
        if (characterArgument1 < 128) {
          integerLocal3 = (byte)characterArgument1;
          return (byte) integerLocal3;
        }
        if (characterArgument1 < 160) {
          if (characterArgument1 == 8364) {
            integerLocal4 = -128;
          } else {
            if (characterArgument1 != 8218) {
              if (402 == characterArgument1) {
                integerLocal4 = -125;
              } else {
                if (characterArgument1 == 8222) {
                  integerLocal4 = -124;
                } else {
                  if (characterArgument1 != 8230) {
                    if (characterArgument1 != 8224) {
                      if (8225 == characterArgument1) {
                        integerLocal4 = -121;
                      } else {
                        if (characterArgument1 != 710) {
                          if (characterArgument1 == 8240) {
                            integerLocal4 = -119;
                          } else {
                            if (characterArgument1 == 352) {
                              integerLocal4 = -118;
                            } else {
                              if (characterArgument1 != 8249) {
                                if (characterArgument1 == 338) {
                                  integerLocal4 = -116;
                                } else {
                                  if (381 != characterArgument1) {
                                    if (characterArgument1 != 8216) {
                                      if (characterArgument1 == 8217) {
                                        integerLocal4 = -110;
                                      } else {
                                        if (characterArgument1 == 8220) {
                                          integerLocal4 = -109;
                                        } else {
                                          if (characterArgument1 != 8221) {
                                            if (8226 == characterArgument1) {
                                              integerLocal4 = -107;
                                            } else {
                                              if (8211 != characterArgument1) {
                                                if (8212 == characterArgument1) {
                                                  integerLocal4 = -105;
                                                } else {
                                                  if (characterArgument1 != 732) {
                                                    if (characterArgument1 == 8482) {
                                                      integerLocal4 = -103;
                                                    } else {
                                                      if (characterArgument1 == 353) {
                                                        integerLocal4 = -102;
                                                      } else {
                                                        if (8250 != characterArgument1) {
                                                          if (characterArgument1 != 339) {
                                                            if (characterArgument1 != 382) {
                                                              integerLocal4 = (characterArgument1 == 376) ? -97 : 63;
                                                            } else {
                                                              integerLocal4 = -98;
                                                            }
                                                          } else {
                                                            integerLocal4 = -100;
                                                          }
                                                        } else {
                                                          integerLocal4 = -101;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    integerLocal4 = -104;
                                                  }
                                                }
                                              } else {
                                                integerLocal4 = -106;
                                              }
                                            }
                                          } else {
                                            integerLocal4 = -108;
                                          }
                                        }
                                      }
                                    } else {
                                      integerLocal4 = -111;
                                    }
                                  } else {
                                    integerLocal4 = -114;
                                  }
                                }
                              } else {
                                integerLocal4 = -117;
                              }
                            }
                          }
                        } else {
                          integerLocal4 = -120;
                        }
                      }
                    } else {
                      integerLocal4 = -122;
                    }
                  } else {
                    integerLocal4 = -123;
                  }
                }
              }
            } else {
              integerLocal4 = -126;
            }
          }
          return (byte) integerLocal4;
        }
        if (255 >= characterArgument1) {
          integerLocal5 = (byte)characterArgument1;
          return (byte) integerLocal5;
        }
        if (characterArgument1 == 8364) {
          integerLocal6 = -128;
          return (byte) integerLocal6;
        }
        if (characterArgument1 != 8218) {
          if (402 == characterArgument1) {
            integerLocal7 = -125;
          } else {
            if (characterArgument1 == 8222) {
              integerLocal7 = -124;
            } else {
              if (characterArgument1 != 8230) {
                if (characterArgument1 != 8224) {
                  if (8225 == characterArgument1) {
                    integerLocal7 = -121;
                  } else {
                    if (characterArgument1 != 710) {
                      if (characterArgument1 == 8240) {
                        integerLocal7 = -119;
                      } else {
                        if (characterArgument1 == 352) {
                          integerLocal7 = -118;
                        } else {
                          if (characterArgument1 != 8249) {
                            if (characterArgument1 == 338) {
                              integerLocal7 = -116;
                            } else {
                              if (381 != characterArgument1) {
                                if (characterArgument1 != 8216) {
                                  if (characterArgument1 == 8217) {
                                    integerLocal7 = -110;
                                  } else {
                                    if (characterArgument1 == 8220) {
                                      integerLocal7 = -109;
                                    } else {
                                      if (characterArgument1 != 8221) {
                                        if (8226 == characterArgument1) {
                                          integerLocal7 = -107;
                                        } else {
                                          if (8211 != characterArgument1) {
                                            if (8212 == characterArgument1) {
                                              integerLocal7 = -105;
                                            } else {
                                              if (characterArgument1 != 732) {
                                                if (characterArgument1 == 8482) {
                                                  integerLocal7 = -103;
                                                } else {
                                                  if (characterArgument1 == 353) {
                                                    integerLocal7 = -102;
                                                  } else {
                                                    if (8250 == characterArgument1) {
                                                      integerLocal7 = -101;
                                                    } else {
                                                      if (characterArgument1 == 339) {
                                                        integerLocal7 = -100;
                                                      } else {
                                                        if (characterArgument1 == 382) {
                                                          integerLocal7 = -98;
                                                        } else {
                                                          if (characterArgument1 == 376) {
                                                            integerLocal7 = -97;
                                                          } else {
                                                            integerLocal7 = 63;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                integerLocal7 = -104;
                                              }
                                            }
                                          } else {
                                            integerLocal7 = -106;
                                          }
                                        }
                                      } else {
                                        integerLocal7 = -108;
                                      }
                                    }
                                  }
                                } else {
                                  integerLocal7 = -111;
                                }
                              } else {
                                integerLocal7 = -114;
                              }
                            }
                          } else {
                            integerLocal7 = -117;
                          }
                        }
                      }
                    } else {
                      integerLocal7 = -120;
                    }
                  }
                } else {
                  integerLocal7 = -122;
                }
              } else {
                integerLocal7 = -123;
              }
            }
          }
        } else {
          integerLocal7 = -126;
        }
        return (byte) integerLocal7;
    }

    final static String computeString0852(String stringArgument1, String stringArgument2, String stringArgument3, int integerArgument4) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        StringBuilder stringBuilderLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal13 = stringArgument2.length();
          integerLocal15 = stringArgument1.length();
          integerLocal16 = stringArgument3.length();
          if (integerArgument4 == integerLocal15) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          integerLocal17 = integerLocal13;
          integerLocal18 = -integerLocal15 + integerLocal16;
          if (0 != integerLocal18) {
            integerLocal19 = 0;
            while (true) {
              integerLocal19 = stringArgument2.indexOf(stringArgument1, integerLocal19);
              if (integerLocal19 < 0) {
                break;
              }
              integerLocal17 = integerLocal17 + integerLocal18;
              integerLocal19 = integerLocal19 + integerLocal15;
            }
          }
          stringBuilderLocal20 = new StringBuilder(integerLocal17);
          integerLocal21 = 0;
          while (true) {
            integerLocal22 = stringArgument2.indexOf(stringArgument1, integerLocal21);
            if (0 > integerLocal22) {
              discarded$2 = stringBuilderLocal20.append(stringArgument2.substring(integerLocal21));
              stackStringLocal4 = stringBuilderLocal20.toString();
              return stackStringLocal4;
            }
            discarded$0 = stringBuilderLocal20.append(stringArgument2.substring(integerLocal21, integerLocal22));
            discarded$1 = stringBuilderLocal20.append(stringArgument3);
            integerLocal21 = integerLocal22 + integerLocal15;
          }
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal12 = caughtParameterLocal24;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal14;
          stackStringBuilderLocal6 = new StringBuilder().append("j.F(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument2 == null) {
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument4).append(')').toString());
        }
    }

    static {
        stringState0269 = "Not yet achieved";
        integerArrayState0111 = UiComponentPart002.computeIntegerArray0091(26);
    }
}
