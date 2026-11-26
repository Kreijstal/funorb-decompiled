/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart023 extends UiComponentPart004 {
    static String stringState0422;
    static String[] stringArrayState0030;
    static ResourceArchive resourceArchiveState0015;
    static String stringState0423;
    static ResourceArchive resourceArchiveState0016;
    static RgbSprite[] rgbSpriteArrayState0021;
    static String stringState0424;
    static MixedSupport132 mixedSupport132State0009;
    static boolean booleanState0134;
    static String stringState0425;
    static String stringState0426;

    final void performAction0185(UiComponent uiComponentArgument1, byte byteArgument2) {
        try {
          super.performAction0185(uiComponentArgument1, (byte) 31);
          if (byteArgument2 < 10) {
            UiComponentPart023.computeBoolean1242(39);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "ph.T(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    final static boolean computeBoolean1242(int integerArgument1) {
        if (integerArgument1 != -30146) {
          UiComponentPart023.performAction1240(false, -84, 71, true, false, false, false, -53, -127, 124);
          return MixedSupport134.booleanState0194;
        }
        return MixedSupport134.booleanState0194;
    }

    UiComponentPart023(UiComponentPart016 uiComponentPart016Argument1, UiComponent uiComponentArgument2) {
        super(uiComponentPart016Argument1, uiComponentArgument2, 33, 20, 30);
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0422 = null;
        resourceArchiveState0015 = null;
        stringState0426 = null;
        stringState0425 = null;
        mixedSupport132State0009 = null;
        resourceArchiveState0016 = null;
        stringArrayState0030 = null;
        int integerLocal1 = -79 / ((-72 - byteArgument1) / 41);
        rgbSpriteArrayState0021 = null;
        stringState0423 = null;
        stringState0424 = null;
    }

    final static void performAction1239(int integerArgument1, int integerArgument2, boolean booleanArgument3, boolean booleanArgument4) {
        MixedSupport127.performAction1630(integerArgument1, true, booleanArgument4, integerArgument2);
        if (booleanArgument3) {
          stringState0425 = (String) null;
        }
    }

    final static void performAction1240(boolean booleanArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4, boolean booleanArgument5, boolean booleanArgument6, boolean booleanArgument7, int integerArgument8, int integerArgument9, int integerArgument10) {
        int integerLocal1;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (booleanArgument6) {
          MixedSupport139.integerState0857 = RichTextLayout.integerState0162;
          MixedSupport054.performAction0636(booleanArgument6, -1843);
          if (integerArgument8 > ~UiComponentPart017.integerState0437) {
            MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
          }
          MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
          MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
          if (RenderingSupport001.integerState0064 > 0) {
            MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
          }
          if (0 < MixedSupport121.integerState0778) {
            MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
          }
          if (MixedSupport026.booleanState0028 &&
            MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
            RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
            GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
            UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
          } else {
            RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
            GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
            MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
          }
        } else {
          if (UiComponentPart033.integerState0934 == SoftwareRaster.integerState0285 &&
            GameplayControls.integerState0859 == SoftwareRaster.integerState0284) {
            if (!booleanArgument6) {
              MixedSupport139.integerState0857 = (-640 + UiComponentPart033.integerState0934) / 2;
              MixedSupport054.performAction0636(booleanArgument6, -1843);
              if (integerArgument8 > ~UiComponentPart017.integerState0437) {
                MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
              }
              MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
              MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
              if (RenderingSupport001.integerState0064 > 0) {
                MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
              }
              if (0 < MixedSupport121.integerState0778) {
                MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
              }
              if (MixedSupport026.booleanState0028 &&
                MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
                UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
              } else {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
              }
            } else {
              MixedSupport139.integerState0857 = RichTextLayout.integerState0162;
              MixedSupport054.performAction0636(booleanArgument6, -1843);
              if (integerArgument8 > ~UiComponentPart017.integerState0437) {
                MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
              }
              MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
              MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
              if (RenderingSupport001.integerState0064 > 0) {
                MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
              }
              if (0 < MixedSupport121.integerState0778) {
                MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
              }
              if (MixedSupport026.booleanState0028 &&
                MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
                UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
              } else {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
              }
            }
            DekoBlokoClient.performAction0301(integerArgument2, integerArgument3, booleanArgument1, integerArgument9, booleanArgument4, integerArgument10, (byte) -119);
            MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, ValidationStatus.sceneWidgetPart008State0006, booleanArgument1);
            UiComponentPart020.integerState0552 = UiComponentPart020.integerState0552 + 1;
            return;
          }
          if (SoftwareRaster.integerState0284 == MixedSupport076.framebufferState0001.integerState0191 &&
            MixedSupport076.framebufferState0001.integerState0190 == SoftwareRaster.integerState0285) {
            if (MixedSupport016.sceneWidgetPart013State0001 == null) {
              if (UiComponentPart011.sceneWidgetPart013State0002 != null) {
                UiComponentPart032.performAction1700(true, -2);
                if (booleanArgument6) {
                  MixedSupport139.integerState0857 = RichTextLayout.integerState0162;
                } else {
                  MixedSupport139.integerState0857 = (-640 + UiComponentPart033.integerState0934) / 2;
                }
                MixedSupport054.performAction0636(booleanArgument6, -1843);
                if (integerArgument8 > ~UiComponentPart017.integerState0437) {
                  MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
                }
                MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
                MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
                if (RenderingSupport001.integerState0064 > 0) {
                  MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
                }
                if (0 < MixedSupport121.integerState0778) {
                  MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
                }
                if (MixedSupport026.booleanState0028 &&
                  MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                  RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
                  GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
                  UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
                } else {
                  RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                  GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                  MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
                }
                DekoBlokoClient.performAction0301(integerArgument2, integerArgument3, booleanArgument1, integerArgument9, booleanArgument4, integerArgument10, (byte) -119);
                MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, ValidationStatus.sceneWidgetPart008State0006, booleanArgument1);
                UiComponentPart020.integerState0552 = UiComponentPart020.integerState0552 + 1;
                return;
              }
              UiComponentPart019.performAction1048(5);
            } else {
              UiComponentPart032.performAction1700(false, -2);
            }
          }
          if (!booleanArgument6) {
            MixedSupport139.integerState0857 = (-640 + UiComponentPart033.integerState0934) / 2;
            MixedSupport054.performAction0636(booleanArgument6, -1843);
            if (integerArgument8 > ~UiComponentPart017.integerState0437) {
              MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
            }
            MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
            MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
            if (RenderingSupport001.integerState0064 > 0) {
              MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
            }
            if (0 < MixedSupport121.integerState0778) {
              MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
            }
            if (MixedSupport026.booleanState0028 &&
              MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
              RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
              GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
              UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
            } else {
              RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
              GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
              MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
            }
          } else {
            MixedSupport139.integerState0857 = RichTextLayout.integerState0162;
            MixedSupport054.performAction0636(booleanArgument6, -1843);
            if (integerArgument8 > ~UiComponentPart017.integerState0437) {
              MixedSupport106.performAction1386(booleanArgument5, integerArgument10, booleanArgument6, (byte) -8);
              MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
              MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
              if (RenderingSupport001.integerState0064 > 0) {
                MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
              }
              if (0 < MixedSupport121.integerState0778) {
                MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
              }
              if (MixedSupport026.booleanState0028 &&
                MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
                UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
              } else {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
              }
            } else {
              MixedSupport121.sceneWidgetState0117.integerState0916 = 1;
              MixedSupport121.sceneWidgetState0117.integerState0893 = MixedSupport036.sceneWidgetState0028.integerState0893;
              if (RenderingSupport001.integerState0064 > 0) {
                MixedSupport138.performAction1722(integerArgument10, booleanArgument5, booleanArgument6, 48);
              }
              if (0 < MixedSupport121.integerState0778) {
                MixedSupport083.performAction1088(0, booleanArgument7, booleanArgument5, booleanArgument6, integerArgument10);
              }
              if (!MixedSupport026.booleanState0028) {
                RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
              } else {
                if (MixedSupport016.sceneWidgetPart013State0001.integerState0840 <= MixedSupport016.sceneWidgetPart013State0001.integerState0843) {
                  RenderingSupport004.sceneWidgetState0039.booleanState0212 = false;
                  GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = MixedSupport014.stringState0066;
                  UiComponentPart012.performAction0591(GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090, true);
                } else {
                  RenderingSupport004.sceneWidgetState0039.booleanState0212 = true;
                  GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0089.stringState0598 = null;
                  MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, GameDomainSupport002.sceneWidgetPart008State0002, booleanArgument1);
                }
              }
            }
          }
        }
        DekoBlokoClient.performAction0301(integerArgument2, integerArgument3, booleanArgument1, integerArgument9, booleanArgument4, integerArgument10, (byte) -119);
        MixedSupport020.performAction0296(integerArgument2, -17339, integerArgument10, ValidationStatus.sceneWidgetPart008State0006, booleanArgument1);
        UiComponentPart020.integerState0552 = UiComponentPart020.integerState0552 + 1;
    }

    static {
        stringState0423 = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        stringState0422 = "<%0> is already on your ignore list.";
        booleanState0134 = false;
        stringState0424 = "\"I think it's shaping up quite nicely!\" - Ian T";
        stringState0425 = "Deko Bloko";
        stringState0426 = "No adverts";
    }
}
