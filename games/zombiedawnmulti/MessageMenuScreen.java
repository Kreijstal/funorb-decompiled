/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageMenuScreen extends MenuScreen {
    private int field_p;
    static DualLinkNodeHashTable field_o;
    private int field_m;
    static String[][] field_n;
    static int field_l;

    final static void setChatFilter(int param0, int param1, int param2, boolean param3) {
        if (param3) {
          if (param0 == 0 &&
            DiskArchiveRequest.field_C != param2) {
            LevelFileListHolder.field_b = true;
            DiskArchiveRequest.field_C = param2;
            RasterBuffer.sendChatFilterSettings(param1, (byte) -122);
          }
          if (param0 == 1 &&
            param2 != GameHud.field_g) {
            GameHud.field_g = param2;
            LevelFileListHolder.field_b = true;
            RasterBuffer.sendChatFilterSettings(param1, (byte) -74);
          }
        } else {
          MessageMenuScreen.releaseStatics(-1);
          if (param0 != 0) {
            if (param0 == 1) {
              if (param2 == GameHud.field_g) {
                if (param0 == 2 &&
                  param2 != MusicPatchPcmStream.field_q) {
                  MusicPatchPcmStream.field_q = param2;
                  LevelFileListHolder.field_b = true;
                  RasterBuffer.sendChatFilterSettings(param1, (byte) -51);
                }
                return;
              }
              GameHud.field_g = param2;
              LevelFileListHolder.field_b = true;
              RasterBuffer.sendChatFilterSettings(param1, (byte) -74);
            }
          } else {
            if (DiskArchiveRequest.field_C == param2) {
              if (param0 == 1) {
                if (param2 == GameHud.field_g) {
                  if (param0 == 2 &&
                    param2 != MusicPatchPcmStream.field_q) {
                    MusicPatchPcmStream.field_q = param2;
                    LevelFileListHolder.field_b = true;
                    RasterBuffer.sendChatFilterSettings(param1, (byte) -51);
                  }
                  return;
                }
                GameHud.field_g = param2;
                LevelFileListHolder.field_b = true;
                RasterBuffer.sendChatFilterSettings(param1, (byte) -74);
              }
            } else {
              LevelFileListHolder.field_b = true;
              DiskArchiveRequest.field_C = param2;
              RasterBuffer.sendChatFilterSettings(param1, (byte) -122);
              if (param0 == 1 &&
                param2 != GameHud.field_g) {
                GameHud.field_g = param2;
                LevelFileListHolder.field_b = true;
                RasterBuffer.sendChatFilterSettings(param1, (byte) -74);
              }
            }
          }
        }
        if (param0 != 2) {
          return;
        }
        if (param2 == MusicPatchPcmStream.field_q) {
          return;
        }
        MusicPatchPcmStream.field_q = param2;
        LevelFileListHolder.field_b = true;
        RasterBuffer.sendChatFilterSettings(param1, (byte) -51);
    }

    MessageMenuScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_p = 1;
        this.field_m = 3;
    }

    final void drawScreen(boolean param0) {
        int var4Lifetime1;
        super.drawScreen(param0);
        PaletteBitmapFont var2 = TranslatedUiText.field_e;
        int var3 = 500;
        int var4 = 200;
        int var5 = 320 - var3 / 2;
        int var6 = 240 - var4 / 2;
        var4Lifetime1 = ((BitmapFont) ((Object) var2)).measureWrappedHeight(ColourPickerWidget.field_Fb, var3, 0);
        StatusAndMeshHelpers.drawNineSliceFrame(var6 - 10, 0, AccountCreationHelpers.field_b, -10 + var5, var4Lifetime1 + 20, 20 + var3);
        ((BitmapFont) ((Object) var2)).drawParagraph(ColourPickerWidget.field_Fb, var5, var6, var3, var4Lifetime1, this.field_m, this.field_p, 1, 1, 0);
    }

    public static void releaseStatics(int param0) {
        if (param0 == -29690) {
          field_o = null;
          field_n = (String[][]) null;
          return;
        }
        MessageMenuScreen.setChatFilter(69, 103, 7, true);
        field_o = null;
        field_n = (String[][]) null;
    }

    static {
    }
}
