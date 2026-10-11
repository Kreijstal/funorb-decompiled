/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport054 {
    static java.awt.Frame frameState0001;
    static CollectionSupport003 collectionSupport003State0001;
    static int integerState0277;
    static String stringState0233;
    static RgbSprite rgbSpriteState0019;

    final static void performAction0708(boolean booleanArgument1, int integerArgument2) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (booleanArgument1 ||
            null == MixedSupport016.sceneWidgetPart013State0001) {
            MixedSupport026.booleanState0028 = false;
          }
          if (booleanArgument1) {
            if (0 < UiComponentPart017.integerState0437) {
              UiComponentPart017.integerState0437 = UiComponentPart017.integerState0437 - 1;
            } else {
              if (RenderingSupport001.integerState0064 > 0) {
                RenderingSupport001.integerState0064 = RenderingSupport001.integerState0064 - 1;
              } else {
                if (MixedSupport127.integerState0778 > 0) {
                  MixedSupport127.integerState0778 = MixedSupport127.integerState0778 - 1;
                }
              }
            }
          } else {
            if (null == MixedSupport016.sceneWidgetPart013State0001) {
              if (null == UiComponentPart011.sceneWidgetPart013State0002) {
                MixedSupport026.booleanState0028 = false;
                if (RenderingSupport001.integerState0064 > 0) {
                  RenderingSupport001.integerState0064 = RenderingSupport001.integerState0064 - 1;
                } else {
                  if (MixedSupport127.integerState0778 > 0) {
                    MixedSupport127.integerState0778 = MixedSupport127.integerState0778 - 1;
                  } else {
                    if (UiComponentPart009.integerState0149 > UiComponentPart017.integerState0437) {
                      if (UiComponentPart017.integerState0437 == 0) {
                        SceneWidgetPart012.performAction1827((byte) -40);
                      }
                      UiComponentPart017.integerState0437 = UiComponentPart017.integerState0437 + 1;
                    }
                  }
                }
              } else {
                if (UiComponentPart017.integerState0437 > 0) {
                  UiComponentPart017.integerState0437 = UiComponentPart017.integerState0437 - 1;
                } else {
                  if (MixedSupport127.integerState0778 > 0) {
                    MixedSupport127.integerState0778 = MixedSupport127.integerState0778 - 1;
                  } else {
                    if (UiComponentPart009.integerState0149 > RenderingSupport001.integerState0064) {
                      if (0 == RenderingSupport001.integerState0064) {
                        SceneWidgetPart007.performAction1183(integerArgument2 + 1843, true);
                      }
                      RenderingSupport001.integerState0064 = RenderingSupport001.integerState0064 + 1;
                    }
                  }
                }
              }
            } else {
              if (0 < UiComponentPart017.integerState0437) {
                UiComponentPart017.integerState0437 = UiComponentPart017.integerState0437 - 1;
              } else {
                if (0 < RenderingSupport001.integerState0064) {
                  RenderingSupport001.integerState0064 = RenderingSupport001.integerState0064 - 1;
                } else {
                  if (MixedSupport127.integerState0778 < UiComponentPart009.integerState0149) {
                    if (MixedSupport127.integerState0778 == 0) {
                      SceneWidgetPart007.performAction1183(0, false);
                    }
                    MixedSupport127.integerState0778 = MixedSupport127.integerState0778 + 1;
                  }
                }
              }
            }
          }
          if (integerArgument2 == -1843) {
            return;
          }
          integerState0277 = -111;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal4) {
          caughtExceptionLocal1 = caughtParameterLocal4;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "hg.B(" + booleanArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction0707(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        RuntimeException caughtExceptionLocal7 = null;
        int integerLocal8 = 0;
        RuntimeException runtimeExceptionLocal9 = null;
        int[] integerArrayLocal10 = null;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 < 59) {
            MixedSupport054.performAction0708(true, -112);
          }
          if (null == NetworkSupport004.integerArrayState0052 ||
            !(NetworkSupport004.integerArrayState0052.length > MixedSupport126.integerState0774)) {
            integerLocal8 = MixedSupport126.integerState0774 * 2;
            if (integerLocal8 == 0) {
              integerLocal8 = 80;
            }
            integerArrayLocal10 = new int[integerLocal8];
            for (integerLocal1 = 0; MixedSupport126.integerState0774 > integerLocal1; integerLocal1++) {
              integerArrayLocal10[integerLocal1] = NetworkSupport004.integerArrayState0052[integerLocal1];
            }
            NetworkSupport004.integerArrayState0052 = integerArrayLocal10;
          }
          integerLocal2 = MixedSupport126.integerState0774;
          MixedSupport126.integerState0774 = MixedSupport126.integerState0774 + 1;
          NetworkSupport004.integerArrayState0052[integerLocal2] = integerArgument3;
          integerLocal3 = MixedSupport126.integerState0774;
          MixedSupport126.integerState0774 = MixedSupport126.integerState0774 + 1;
          NetworkSupport004.integerArrayState0052[integerLocal3] = integerArgument2;
          integerLocal4 = MixedSupport126.integerState0774;
          MixedSupport126.integerState0774 = MixedSupport126.integerState0774 + 1;
          NetworkSupport004.integerArrayState0052[integerLocal4] = integerArgument6;
          integerLocal5 = MixedSupport126.integerState0774;
          MixedSupport126.integerState0774 = MixedSupport126.integerState0774 + 1;
          NetworkSupport004.integerArrayState0052[integerLocal5] = integerArgument5;
          integerLocal6 = MixedSupport126.integerState0774;
          MixedSupport126.integerState0774 = MixedSupport126.integerState0774 + 1;
          NetworkSupport004.integerArrayState0052[integerLocal6] = integerArgument4;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal7 = caughtParameterLocal12;
          runtimeExceptionLocal9 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal9), "hg.C(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    public static void performAction0706(byte byteArgument1) {
        collectionSupport003State0001 = null;
        if (byteArgument1 <= 87) {
          return;
        }
        try {
          stringState0233 = null;
          frameState0001 = null;
          rgbSpriteState0019 = null;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "hg.A(" + byteArgument1 + ')');
        }
    }

    static {
        stringState0233 = "Activating Special Items";
    }
}
