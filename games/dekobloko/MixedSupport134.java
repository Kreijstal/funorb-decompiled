/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport134 {
    static InputAdapter003 inputAdapter003State0001;
    static boolean booleanState0191;
    static long longState0050;
    static MixedSupport004 mixedSupport004State0005;
    static int integerState0793;
    static String stringState0553;
    static String stringState0554;

    public static void performAction1850(boolean booleanArgument1) {
        inputAdapter003State0001 = null;
        if (!booleanArgument1) {
          return;
        }
        stringState0554 = null;
        mixedSupport004State0005 = null;
        stringState0553 = null;
    }

    final static void performAction1851(boolean booleanArgument1, boolean booleanArgument2, int integerArgument3) {
        if (!booleanArgument1) {
          SoftwareRaster.performAction0727();
        } else {
          SoftwareRaster.performAction0720(0, 0, SoftwareRaster.integerState0285, SoftwareRaster.integerState0284, 0, 192);
        }
        if (integerArgument3 <= 39) {
          return;
        }
        RenderingSupport002.performAction0268(booleanArgument1, 91);
    }

    final static void performAction1849(int integerArgument1, boolean booleanArgument2, boolean booleanArgument3, int integerArgument4) {
        if (!booleanArgument2) {
          stringState0554 = (String) null;
        }
        NodeHashTable.performAction1705(ComponentContainer.integerState0377, booleanArgument3, CollectionSupport003.integerState0540, GameApplet.integerState0292, integerArgument1, (byte) -41, integerArgument4);
    }

    final static void performAction1848(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, SceneWidgetPart013 sceneWidgetPart013Argument7, boolean booleanArgument8) {
        SceneWidgetPart009[][] stackSceneWidgetPart009ArrayArrayLocal1 = null;
        int stackIntegerLocal2 = 0;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        int integerLocal11 = 0;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        int integerLocal14 = 0;
        int[] integerArrayLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        SceneWidgetPart009 sceneWidgetPart009Local20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal23 = null;
        SceneWidgetPart009[] sceneWidgetPart009ArrayLocal24 = null;
        int[] integerArrayLocal25 = null;
        int[] integerArrayLocal26 = null;
        int integerLocal27;
        int integerLocal28;
        integerLocal22 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          boolean frameCompletedLocal29 = true;
          boolean frameCompletedLocal30 = true;
          if (integerArgument6 <= integerArgument3) {
            integerLocal11 = 1;
            integerLocal14 = 0;
            while (true) {
              if (MixedSupport009.integerArrayArrayState0004.length <= integerLocal14) {
                if (integerLocal11 == 0) {
                  frameCompletedLocal29 = false;
                  break;
                }
                SceneWidgetPart013.booleanState0207 = true;
                frameCompletedLocal30 = false;
                break;
              }
              integerArrayLocal26 = MixedSupport009.integerArrayArrayState0004[integerLocal14];
              integerArrayLocal25 = integerArrayLocal26;
              integerArrayLocal15 = integerArrayLocal25;
              integerLocal17 = 0;
              integerLocal18 = 0;
              scanLoop1: while (true) {
                if (integerLocal18 >= integerArrayLocal26.length) {
                  if (integerLocal17 == 0 &&
                    integerArgument3 != MixedSupport064.integerState0336) {
                    break scanLoop1;
                  }
                  integerLocal11 = 0;
                  for (integerLocal18 = 0; integerLocal18 < integerArrayLocal26.length; integerLocal18 += 2) {
                    integerLocal19 = integerArrayLocal26[integerLocal18];
                    if (integerLocal19 == -1) {
                      MixedSupport046.booleanState0052 = true;
                    } else {
                      if (integerLocal19 < integerArgument3) {
                        MixedSupport113.booleanArrayState0009[integerLocal19] = true;
                      }
                    }
                  }
                  break scanLoop1;
                }
                integerLocal28 = integerArrayLocal26[integerLocal18];
                integerLocal21 = integerArrayLocal15[1 + integerLocal18];
                if (integerLocal28 == -1) {
                  if (UiComponentPart002.integerArrayState0014[integerArgument1] != integerLocal21) {
                    break scanLoop1;
                  }
                } else {
                  if (integerArgument3 == integerLocal28 &&
                    integerArgument5 == integerLocal21) {
                    integerLocal17 = 1;
                  } else {
                    if (integerArgument3 <= integerLocal28) {
                      break scanLoop1;
                    }
                    if ((SceneWidgetNode.byteArrayState0012[integerLocal28] & 255) != integerLocal21) {
                      break scanLoop1;
                    }
                  }
                }
                integerLocal18 += 2;
                continue;

              }
              integerLocal14++;
            }
          }
          if ((frameCompletedLocal29) &&
            (frameCompletedLocal30)) {
            stackSceneWidgetPart009ArrayArrayLocal1 = MixedSupport108.sceneWidgetPart009ArrayArrayState0001;
            if (integerArgument3 != -1) {
              stackIntegerLocal2 = integerArgument3 + 4;
            } else {
              stackIntegerLocal2 = 1;
            }
            sceneWidgetPart009ArrayLocal23 = stackSceneWidgetPart009ArrayArrayLocal1[stackIntegerLocal2];
            sceneWidgetPart009ArrayLocal24 = sceneWidgetPart009ArrayLocal23;
            sceneWidgetPart009ArrayLocal12 = sceneWidgetPart009ArrayLocal24;
            integerLocal14 = 1;
            if (booleanArgument2) {
              if (integerArgument3 != -1) {
                for (integerLocal16 = 0; sceneWidgetPart009ArrayLocal23.length - 1 > integerLocal16; integerLocal16++) {
                  if (0 == (MixedSupport141.byteArrayState0029[(integerArgument4 + integerLocal16) / 8] & 1 << (7 & integerArgument4 + integerLocal16))) {
                    continue;
                  }
                  integerLocal14 = 0;
                  break;
                }
                integerArgument4 = integerArgument4 + (255 & MixedSupport112.byteArrayState0026[integerArgument3]);
              } else {
                integerLocal16 = 0;
                while (!(UiComponentPart002.integerArrayState0014.length <= integerLocal16)) {
                  if ((MixedSupport074.byteArrayState0011[integerLocal16 / 8] & 1 << (7 & integerLocal16)) == 0) {
                    integerLocal16++;
                    continue;
                  }
                  integerLocal14 = 0;
                  break;
                }
              }
            }
            integerLocal27 = 0;
            integerLocal17 = 0;
            while (true) {
              stackIntegerLocal3 = integerLocal17;
              if (integerArgument3 != -1) {
                stackIntegerLocal4 = -1 + sceneWidgetPart009ArrayLocal24.length;
              } else {
                stackIntegerLocal4 = UiComponentPart002.integerArrayState0014.length;
              }
              if (stackIntegerLocal3 >= stackIntegerLocal4) {
                if (integerLocal27 != 0) {
                  break;
                }
                for (integerLocal17 = 0; integerLocal17 < -1 + sceneWidgetPart009ArrayLocal24.length; integerLocal17++) {
                  if (-1 == integerArgument3) {
                    integerArgument1 = integerLocal17;
                  } else {
                    SceneWidgetNode.byteArrayState0012[integerArgument3] = (byte)integerLocal17;
                  }
                  MixedSupport134.performAction1848(integerArgument1, booleanArgument2, 1 + integerArgument3, integerArgument4, integerArgument5, integerArgument6, sceneWidgetPart013Argument7, false);
                  if (SceneWidgetPart013.booleanState0207) {
                    return;
                  }
                }
                break;
              }
              if (integerArgument3 != -1) {
                SceneWidgetNode.byteArrayState0012[integerArgument3] = (byte)integerLocal17;
              } else {
                integerArgument1 = integerLocal17;
              }
              if (integerArgument3 == -1 &&
                UiComponentPart002.integerArrayState0014.length == 1) {
                integerLocal18 = 1;
              } else {
                sceneWidgetPart009Local20 = sceneWidgetPart009ArrayLocal12[1 + integerLocal17];
                if (booleanArgument2) {
                  if (!sceneWidgetPart009Local20.booleanState0217) {
                    if (integerLocal14 != 0) {
                      stackIntegerLocal6 = (sceneWidgetPart009Local20.booleanState0212) ? 1 : 0;
                    } else {
                      stackIntegerLocal6 = 0;
                    }
                  } else {
                    stackIntegerLocal6 = 1;
                  }
                  integerLocal18 = stackIntegerLocal6;
                } else {
                  if (integerArgument3 != -1) {
                    stackIntegerLocal5 = (integerLocal17 != (255 & MixedSupport016.sceneWidgetPart013State0001.byteArrayState0032[integerArgument3])) ? 0 : 1;
                  } else {
                    stackIntegerLocal5 = (MixedSupport016.sceneWidgetPart013State0001.integerState0840 != UiComponentPart002.integerArrayState0014[integerLocal17]) ? 0 : 1;
                  }
                  integerLocal18 = stackIntegerLocal5;
                }
              }
              if (integerLocal18 != 0) {
                MixedSupport134.performAction1848(integerArgument1, booleanArgument2, integerArgument3 + 1, integerArgument4, integerArgument5, integerArgument6, sceneWidgetPart013Argument7, false);
                integerLocal27 = 1;
              }
              if (SceneWidgetPart013.booleanState0207) {
                return;
              }
              integerLocal17++;
            }
          }
          if (booleanArgument8) {
            stringState0554 = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal31) {
          caughtExceptionLocal10 = caughtParameterLocal31;
          runtimeExceptionLocal13 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal13;
          stackStringBuilderLocal8 = new StringBuilder().append("uc.A(").append(integerArgument1).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',');
          if (sceneWidgetPart013Argument7 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(booleanArgument8).append(')').toString());
        }
    }

    static {
        booleanState0191 = true;
        mixedSupport004State0005 = new MixedSupport004();
        stringState0553 = "Accept";
        stringState0554 = "Lobby";
    }
}
