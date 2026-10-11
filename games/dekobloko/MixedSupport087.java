/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport087 {
    static boolean booleanState0118;
    static String stringState0355;
    static SceneWidget sceneWidgetState0087;
    static int[] integerArrayState0165;
    static String[] stringArrayState0024;

    final static void performAction1231(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, boolean booleanArgument4, int integerArgument5) {
        SceneWidget stackSceneWidgetLocal1 = null;
        boolean stackBooleanLocal2 = false;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        int stackIntegerLocal9 = 0;
        boolean stackBooleanLocal10 = false;
        int stackIntegerLocal11 = 0;
        boolean stackBooleanLocal12 = false;
        int stackIntegerLocal13 = 0;
        SceneWidget stackSceneWidgetLocal14 = null;
        boolean stackBooleanLocal15 = false;
        boolean stackBooleanLocal16 = false;
        SceneWidget stackSceneWidgetLocal17 = null;
        boolean stackBooleanLocal18 = false;
        boolean stackBooleanLocal19 = false;
        SceneWidget stackSceneWidgetLocal20 = null;
        boolean stackBooleanLocal21 = false;
        boolean stackBooleanLocal22 = false;
        RuntimeException caughtExceptionLocal23 = null;
        boolean stackOut_80_0;
        boolean stackOut_134_0;
        RuntimeException runtimeExceptionLocal26 = null;
        SceneWidget sceneWidgetLocal27 = null;
        SceneWidget sceneWidgetLocal28 = null;
        SceneWidget sceneWidgetLocal29 = null;
        int integerLocal30 = 0;
        String stringLocal31 = null;
        String stringLocal32 = null;
        int integerLocal33 = 0;
        int integerLocal34 = 0;
        Object objectLocal35 = null;
        int integerLocal36 = 0;
        int[] integerArrayLocal37 = null;
        int integerLocal38 = 0;
        String stringLocal39 = null;
        int integerLocal40 = 0;
        String stringLocal41 = null;
        int integerLocal42 = 0;
        int integerLocal43 = 0;
        int integerLocal44 = 0;
        NodeDeque nodeDequeLocal45 = null;
        Object objectLocal46 = null;
        int integerLocal47 = 0;
        SceneWidgetPart012 sceneWidgetPart012Local48 = null;
        int integerLocal49 = 0;
        int[] integerArrayLocal50 = null;
        SceneWidget sceneWidgetLocal51 = null;
        int[] integerArrayLocal52 = null;
        String stringLocal53 = null;
        int[] integerArrayLocal54 = null;
        SceneWidget sceneWidgetLocal55 = null;
        int stackIntegerLocal56;
        int stackIntegerLocal57;
        int stackIntegerLocal58;
        int integerLocal59;
        int integerLocal60;
        objectLocal46 = null;
        integerLocal49 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != 0) {
            MixedSupport087.performAction1230(-82);
          }
          InputAdapter005.performAction1530(MixedSupport127.integerState0778, integerArgument1 + 101);
          if (MixedSupport016.sceneWidgetPart013State0001 != null) {
            ComponentDecorator.sceneWidgetState0078.booleanState0212 = true;
            sceneWidgetLocal51 = MixedSupport039.sceneWidgetState0030;
            sceneWidgetLocal55 = sceneWidgetLocal51;
            MixedSupport039.sceneWidgetState0030.integerState0915 = 0;
            sceneWidgetLocal55.integerState0896 = 0;
            sceneWidgetLocal27 = MixedSupport092.sceneWidgetState0091;
            MixedSupport092.sceneWidgetState0091.integerState0915 = 0;
            sceneWidgetLocal27.integerState0896 = 0;
            sceneWidgetLocal28 = MixedSupport127.sceneWidgetState0117;
            MixedSupport127.sceneWidgetState0117.integerState0915 = 0;
            sceneWidgetLocal28.integerState0896 = 0;
            if (SceneWidgetPart005.computeBoolean0803(true)) {
              MixedSupport042.sceneWidgetState0033.stringState0598 = MixedSupport067.stringState0278.toUpperCase();
              integerLocal30 = (2 + NetworkSupport008.sceneWidgetState0093.integerState0896) / 2;
              MixedSupport039.sceneWidgetState0030.performAction1994(-2 + integerLocal30, 0, NetworkSupport008.sceneWidgetState0093.integerState0915 - 40, 40, 0);
              if (MixedSupport016.sceneWidgetPart013State0001.integerState0840 > MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                MixedSupport039.sceneWidgetState0030.stringState0598 = RichTextLayout.stringState0133.toUpperCase();
                MixedSupport039.sceneWidgetState0030.booleanState0212 = true;
                if (integerLocal49 != 0) {
                  MixedSupport039.sceneWidgetState0030.stringState0598 = MixedSupport014.stringState0066.toUpperCase();
                  MixedSupport039.sceneWidgetState0030.booleanState0212 = false;
                }
              } else {
                MixedSupport039.sceneWidgetState0030.stringState0598 = MixedSupport014.stringState0066.toUpperCase();
                MixedSupport039.sceneWidgetState0030.booleanState0212 = false;
              }
              MixedSupport039.sceneWidgetState0030.rgbSpriteArrayState0033 = MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0033;
              if (MixedSupport019.integerState0113 > 0) {
                if (MixedSupport019.integerState0113 != 1) {
                  stringLocal32 = CollectionSupport001.computeString0336(122, MixedSupport042.stringState0183, new String[]{Integer.toString(MixedSupport019.integerState0113)});
                  if (integerLocal49 != 0) {
                    stringLocal32 = GameDomainSupport002.stringState0141;
                  }
                } else {
                  stringLocal32 = GameDomainSupport002.stringState0141;
                }
                MixedSupport039.sceneWidgetState0030.stringState0598 = MixedSupport039.sceneWidgetState0030.stringState0598 + "<br>" + stringLocal32;
                if ((UiComponentPart020.integerState0552 & 16) == 0 &&
                  !MixedSupport026.booleanState0028) {
                  MixedSupport039.sceneWidgetState0030.rgbSpriteArrayState0033 = MixedSupport021.sceneWidgetState0015.rgbSpriteArrayState0035;
                }
              }
              MixedSupport092.sceneWidgetState0091.performAction1994(-integerLocal30 + NetworkSupport008.sceneWidgetState0093.integerState0896, 0, -40 + NetworkSupport008.sceneWidgetState0093.integerState0915, 40, integerLocal30);
              MixedSupport092.sceneWidgetState0091.stringState0598 = MixedSupport085.stringState0342.toUpperCase();
              stackSceneWidgetLocal1 = MixedSupport092.sceneWidgetState0091;
              stackBooleanLocal2 = (booleanArgument2) && (SceneWidgetNode.longState0023 == 0L);
              stackSceneWidgetLocal1.booleanState0212 = stackBooleanLocal2;
              sceneWidgetLocal29 = MixedSupport092.sceneWidgetState0091;
              integerLocal33 = 2;
              if (null != MixedSupport009.integerArrayArrayState0004) {
                if (null == SceneWidgetNode.byteArrayState0012) {
                  MixedSupport113.booleanArrayState0009 = new boolean[MixedSupport064.integerState0336];
                  SceneWidgetNode.byteArrayState0012 = new byte[MixedSupport064.integerState0336];
                }
                integerLocal34 = 0;
                do {
                  if (!(MixedSupport064.integerState0336 > integerLocal34)) {
                    integerLocal33 = 0;
                    break;
                  }
                  MixedSupport113.booleanArrayState0009[integerLocal34] = false;
                  integerLocal34++;
                } while (integerLocal49 == 0);
                scanLoop1: while (true) {
                  if (2 > integerLocal33) {
                    integerLocal34 = 0;
                    stackIntegerLocal9 = 0;
                    if (integerLocal49 != 0) {
                      break scanLoop1;
                    }
                    integerLocal36 = stackIntegerLocal9;
                    while (true) {
                      stackIntegerLocal3 = integerLocal36;
                      stackIntegerLocal4 = MixedSupport009.integerArrayArrayState0004.length;
                      if (stackIntegerLocal3 < stackIntegerLocal4) {
                        integerArrayLocal54 = MixedSupport009.integerArrayArrayState0004[integerLocal36];
                        integerArrayLocal52 = integerArrayLocal54;
                        integerArrayLocal50 = integerArrayLocal52;
                        integerArrayLocal37 = integerArrayLocal50;
                        stackIntegerLocal8 = 0;
                        integerLocal40 = stackIntegerLocal8;
                        scanLoop2: while (true) {
                          if (integerArrayLocal54.length > integerLocal40) {
                            integerLocal42 = integerArrayLocal54[integerLocal40];
                            integerLocal43 = integerArrayLocal50[1 + integerLocal40];
                            stackIntegerLocal6 = integerLocal42;
                            stackIntegerLocal7 = -1;
                            if (stackIntegerLocal6 == stackIntegerLocal7) {
                              if (integerLocal33 == 0) {
                                stackIntegerLocal5 = MixedSupport016.sceneWidgetPart013State0001.integerState0840;
                              } else {
                                stackIntegerLocal5 = MixedSupport016.sceneWidgetPart013State0001.integerState0843;
                              }
                              integerLocal44 = stackIntegerLocal5;
                              if (integerLocal43 != integerLocal44 &&
                                integerLocal49 == 0) {
                                break scanLoop2;
                              }
                            } else {
                              if (integerLocal43 != (255 & MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032[integerLocal42]) &&
                                integerLocal49 == 0) {
                                break scanLoop2;
                              }
                            }
                            integerLocal40 += 2;
                            continue;
                          }
                          integerLocal34 = 1;
                          integerLocal40 = -1;
                          integerLocal42 = 0;
                          while (true) {
                            stackIntegerLocal56 = ~integerLocal42;
                            stackIntegerLocal57 = ~integerArrayLocal54.length;
                            if (stackIntegerLocal56 <= stackIntegerLocal57) {
                              break;
                            }
                            integerLocal43 = integerArrayLocal54[integerLocal42];
                            stackIntegerLocal3 = ~integerLocal40;
                            stackIntegerLocal4 = ~integerLocal43;
                            if (stackIntegerLocal3 > stackIntegerLocal4) {
                              integerLocal40 = integerLocal43;
                            }
                            integerLocal42 += 2;
                          }
                          MixedSupport113.booleanArrayState0009[integerLocal40] = true;
                          break;
                        }
                        integerLocal36++;
                        continue;
                      }
                      break;
                    }
                    stackIntegerLocal58 = integerLocal34;
                    if (stackIntegerLocal58 == 0 ||
                      integerLocal49 != 0) {
                      integerLocal33++;
                      continue;
                    }
                  }
                  stackIntegerLocal9 = MixedSupport126.integerState0776;
                  break;
                }
                if (stackIntegerLocal9 >= 2 &&
                  MixedSupport011.booleanArrayState0002[12]) {
                  integerLocal33 = 2;
                }
              }
              boolean frameRemainderLocal61 = true;
              if (integerLocal33 < 2) {
                MixedSupport092.sceneWidgetState0091.booleanState0212 = false;
                frameRemainderLocal61 = !(!MixedSupport092.sceneWidgetState0091.booleanState0211);
                if (frameRemainderLocal61) {
                  objectLocal35 = null;
                  integerLocal36 = 0;
                  integerLocal38 = 0;
                  while (true) {
                    if (MixedSupport064.integerState0336 > integerLocal38) {
                      stackOut_80_0 = MixedSupport113.booleanArrayState0009[integerLocal38];
                      stackIntegerLocal11 = stackOut_80_0 ? 1 : 0;
                      stackBooleanLocal10 = stackOut_80_0;
                      if (integerLocal49 == 0) {
                        if (stackBooleanLocal10) {
                          stringLocal53 = "<col=A00000>" + UiComponentPart022.stringArrayState0026[integerLocal38] + "</col>";
                          if (objectLocal35 == null) {
                            objectLocal35 = stringLocal53;
                          } else {
                            integerLocal36 = 1;
                            objectLocal35 = (String) (objectLocal35) + ", " + stringLocal53;
                          }
                        }
                        integerLocal38++;
                        continue;
                      }
                    } else {
                      stackIntegerLocal11 = integerLocal33;
                    }
                    break;
                  }
                  if (stackIntegerLocal11 != 0) {
                    stringLocal39 = MixedSupport010.stringState0047;
                    boolean sharedTailLocal62 = (integerLocal36 == 0);
                    if (!sharedTailLocal62) {
                      stringLocal41 = MixedSupport067.stringState0280 + (String) (objectLocal35);
                      sharedTailLocal62 = (integerLocal49 != 0);
                    }
                    if (sharedTailLocal62) {
                      stringLocal41 = CollectionSupport001.computeString0336(119, MixedSupport044.stringState0187, new String[]{(String) (objectLocal35)});
                    }
                  } else {
                    stringLocal39 = GameDomainSupport003.stringState0235;
                    if (integerLocal36 == 0) {
                      stringLocal41 = CollectionSupport001.computeString0336(82, MixedSupport018.stringState0090, new String[]{(String) (objectLocal35)});
                      if (integerLocal49 != 0) {
                        stringLocal41 = UiComponentPart019.stringState0348 + (String) (objectLocal35);
                      }
                    } else {
                      stringLocal41 = UiComponentPart019.stringState0348 + (String) (objectLocal35);
                    }
                  }
                  MixedSupport122.stringState0515 = "<col=A00000>" + stringLocal39 + "<br>" + stringLocal41;
                }
              }
              if ((frameRemainderLocal61) && (!(integerLocal33 < 2) || integerLocal49 != 0) && (null != MixedSupport014.booleanArrayArrayState0001 ||
                SceneWidgetPart007.integerArrayArrayState0017 != null ||
                MixedSupport063.integerArrayArrayState0012 != null ||
                MixedSupport004.integerArrayArrayState0003 != null)) {
                integerLocal34 = 0;
                integerLocal36 = 0;
                integerLocal59 = 0;
                integerLocal40 = 0;
                integerLocal42 = 0;
                integerLocal43 = 0;
                boolean naturalLoopExitLocal63 = false;
                while (!(naturalLoopExitLocal63 = (!(integerLocal43 < MixedSupport064.integerState0336)))) {
                  integerLocal44 = MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032[integerLocal43] & 255;
                  if (integerLocal49 == 0) {
                    if (MixedSupport014.booleanArrayArrayState0001 != null &&
                      MixedSupport014.booleanArrayArrayState0001[integerLocal43] != null &&
                      MixedSupport014.booleanArrayArrayState0001[integerLocal43][integerLocal44]) {
                      integerLocal34 = 1;
                    }
                    if (null != SceneWidgetPart007.integerArrayArrayState0017 &&
                      null != SceneWidgetPart007.integerArrayArrayState0017[integerLocal43]) {
                      integerLocal47 = SceneWidgetPart007.integerArrayArrayState0017[integerLocal43][integerLocal44];
                      if (integerLocal47 > integerLocal59) {
                        integerLocal59 = integerLocal47;
                      }
                      if (integerLocal47 != 0 &&
                        !MixedSupport134.booleanState0191) {
                        integerLocal34 = 1;
                      }
                    }
                    if (MixedSupport063.integerArrayArrayState0012 != null &&
                      MixedSupport063.integerArrayArrayState0012[integerLocal43] != null) {
                      integerLocal60 = MixedSupport063.integerArrayArrayState0012[integerLocal43][integerLocal44];
                      if (integerLocal60 != 0 &&
                        !MixedSupport134.booleanState0191) {
                        integerLocal34 = 1;
                      }
                      if (integerLocal60 > integerLocal40) {
                        integerLocal40 = integerLocal60;
                      }
                    }
                    if (null != MixedSupport004.integerArrayArrayState0003 &&
                      MixedSupport004.integerArrayArrayState0003[integerLocal43] != null) {
                      integerLocal42 = integerLocal42 | MixedSupport004.integerArrayArrayState0003[integerLocal43][integerLocal44];
                    }
                    integerLocal43++;
                    continue;
                  }
                  break;
                }
                if (naturalLoopExitLocal63) {
                  integerLocal43 = 0;
                }
                nodeDequeLocal45 = RenderingSupport015.sceneWidgetPart008State0006.sceneWidgetState0090.nodeDequeState0034;
                sceneWidgetPart012Local48 = (SceneWidgetPart012) (nodeDequeLocal45.computeHashNode1970((byte) 83));
                scanLoop3: while (true) {
                  boolean frameRemainderLocal64 = true;
                  if (sceneWidgetPart012Local48 != null) {
                    stackOut_134_0 = sceneWidgetPart012Local48.computeBoolean1826((byte) 68);
                    stackIntegerLocal13 = stackOut_134_0 ? 1 : 0;
                    stackBooleanLocal12 = stackOut_134_0;
                    if (integerLocal49 != 0) {
                      break scanLoop3;
                    }
                    if (!stackBooleanLocal12 ||
                      integerLocal49 != 0) {
                      if (integerLocal34 != 0 &&
                        !sceneWidgetPart012Local48.booleanState0186) {
                        integerLocal43 = 1;
                        frameRemainderLocal64 = false;
                      }
                      else {
                        if (sceneWidgetPart012Local48.integerState0781 < integerLocal59) {
                          integerLocal43 = 1;
                          frameRemainderLocal64 = false;
                        }
                        else {
                          if (sceneWidgetPart012Local48.integerState0784 < integerLocal40) {
                            integerLocal43 = 1;
                            frameRemainderLocal64 = false;
                          }
                          else {
                            if ((integerLocal42 & ~sceneWidgetPart012Local48.integerState0782) > 0) {
                              integerLocal43 = 1;
                              frameRemainderLocal64 = false;
                            }
                            else {
                              if (integerLocal36 != 0) {
                                integerLocal43 = 1;
                                frameRemainderLocal64 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (frameRemainderLocal64) {
                      sceneWidgetPart012Local48 = (SceneWidgetPart012) (nodeDequeLocal45.computeHashNode1974(true));
                      continue;
                    }
                  }
                  stackIntegerLocal13 = MixedSupport126.integerState0776;
                  break;
                }
                if (stackIntegerLocal13 >= 2 &&
                  MixedSupport011.booleanArrayState0002[12]) {
                  integerLocal43 = 0;
                }
                if (integerLocal43 != 0) {
                  MixedSupport092.sceneWidgetState0091.booleanState0212 = false;
                  if (MixedSupport092.sceneWidgetState0091.booleanState0211) {
                    if (0 != AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.integerState0773) {
                      MixedSupport122.stringState0515 = CollectionSupport001.computeString0336(94, MixedSupport061.stringState0257, new String[]{MixedSupport031.stringState0152});
                      if (integerLocal49 != 0) {
                        MixedSupport122.stringState0515 = MusicTrack.stringState0561;
                      }
                    } else {
                      MixedSupport122.stringState0515 = MusicTrack.stringState0561;
                    }
                  }
                }
              }
              if (integerLocal49 != 0) {
                stringLocal31 = MixedSupport016.sceneWidgetPart013State0001.stringState0585;
                MixedSupport042.sceneWidgetState0033.stringState0598 = CollectionSupport001.computeString0336(101, PlatformSupport004.stringState0232, new String[]{stringLocal31}).toUpperCase();
                MixedSupport127.sceneWidgetState0117.performAction1994(NetworkSupport008.sceneWidgetState0093.integerState0896, integerArgument1 ^ 0, NetworkSupport008.sceneWidgetState0093.integerState0915 - 40, 40, 0);
                MixedSupport127.sceneWidgetState0117.stringState0598 = CollectionSupport001.computeString0336(116, MixedSupport051.stringState0210, new String[]{stringLocal31});
                sceneWidgetLocal29 = MixedSupport127.sceneWidgetState0117;
              }
            } else {
              stringLocal31 = MixedSupport016.sceneWidgetPart013State0001.stringState0585;
              MixedSupport042.sceneWidgetState0033.stringState0598 = CollectionSupport001.computeString0336(101, PlatformSupport004.stringState0232, new String[]{stringLocal31}).toUpperCase();
              MixedSupport127.sceneWidgetState0117.performAction1994(NetworkSupport008.sceneWidgetState0093.integerState0896, integerArgument1 ^ 0, NetworkSupport008.sceneWidgetState0093.integerState0915 - 40, 40, 0);
              MixedSupport127.sceneWidgetState0117.stringState0598 = CollectionSupport001.computeString0336(116, MixedSupport051.stringState0210, new String[]{stringLocal31});
              sceneWidgetLocal29 = MixedSupport127.sceneWidgetState0117;
            }
            if (SceneWidgetNode.longState0023 != 0L) {
              integerLocal30 = (int)(SceneWidgetNode.longState0023 - MixedSupport063.computeLong0827(4));
              integerLocal30 = (999 + integerLocal30) / 1000;
              if (integerLocal30 < 1) {
                integerLocal30 = 1;
              }
              sceneWidgetLocal29.stringState0598 = CollectionSupport001.computeString0336(119, TextLayout.stringState0082, new String[]{Integer.toString(integerLocal30)});
            }
            UiComponentPart013.sceneWidgetState0048.stringState0598 = CollectionSupport001.computeString0336(101, MixedSupport118.stringState0491, new String[]{Integer.toString(MixedSupport016.sceneWidgetPart013State0001.integerState0843), Integer.toString(MixedSupport016.sceneWidgetPart013State0001.integerState0840)});
          }
          stackSceneWidgetLocal14 = MixedSupport030.sceneWidgetState0023;
          stackBooleanLocal15 = false;
          stackBooleanLocal16 = (booleanArgument3) && (!booleanArgument4) && (!MixedSupport026.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal14).performAction2002(stackBooleanLocal15, stackBooleanLocal16);
          stackSceneWidgetLocal17 = NetworkSupport008.sceneWidgetState0093;
          stackBooleanLocal18 = false;
          stackBooleanLocal19 = (booleanArgument3) && (!booleanArgument4) && (!MixedSupport026.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal17).performAction2002(stackBooleanLocal18, stackBooleanLocal19);
          stackSceneWidgetLocal20 = (SceneWidget) (sceneWidgetState0087);
          stackBooleanLocal21 = false;
          stackBooleanLocal22 = (booleanArgument3) && (!booleanArgument4) && (MixedSupport026.booleanState0028);
          ((SceneWidget) (Object) stackSceneWidgetLocal20).performAction2002(stackBooleanLocal21, stackBooleanLocal22);
          AudioSupport002.mixedSupport006State0002.sceneWidgetPart011State0001.performAction1782(false);
          if (MixedSupport016.sceneWidgetPart013State0001 != null) {
            if (ComponentDecorator.sceneWidgetState0078.integerState0891 != 0) {
              UiComponentPart018.performAction1160(integerArgument1 ^ 9, integerArgument5, MixedSupport016.sceneWidgetPart013State0001.computeInteger1937(-76));
            }
            if (MixedSupport092.sceneWidgetState0091.integerState0891 != 0) {
              MixedSupport050.booleanState0064 = true;
            }
            if (MixedSupport039.sceneWidgetState0030.integerState0891 != 0) {
              MixedSupport026.booleanState0028 = true;
            }
            if (GameSession.sceneWidgetState0099.integerState0891 != 0) {
              MixedSupport026.booleanState0028 = false;
            }
            MixedSupport085.performAction1158(MixedSupport016.sceneWidgetPart013State0001, false, integerArgument5, (byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal65) {
          caughtExceptionLocal23 = caughtParameterLocal65;
          runtimeExceptionLocal26 = caughtExceptionLocal23;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal26), "mn.C(" + integerArgument1 + ',' + booleanArgument2 + ',' + booleanArgument3 + ',' + booleanArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final static void performAction1232(boolean booleanArgument1, long longArgument2, int integerArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument3, -4);
        cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
        int integerLocal2 = cipherPacketBufferLocal1.position;
        cipherPacketBufferLocal1.performAction2073(true, 7);
        cipherPacketBufferLocal1.performAction2068(longArgument2, (byte) 0);
        cipherPacketBufferLocal1.performAction2079(-integerLocal2 + cipherPacketBufferLocal1.position, booleanArgument1);
    }

    public static void performAction1230(int integerArgument1) {
        sceneWidgetState0087 = null;
        if (integerArgument1 >= -113) {
          return;
        }
        integerArrayState0165 = null;
        stringArrayState0024 = null;
        stringState0355 = null;
    }

    static {
        stringState0355 = "Return to game";
        stringArrayState0024 = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        integerArrayState0165 = new int[]{40, 30, 24, 19, 15, 12, 9, 6, 4, 2, 0};
    }
}
