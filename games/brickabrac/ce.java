/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static String field_g;
    static ContextMenu field_b;
    static RgbSprite desertSmallSprite;
    static int[][] field_a;
    static char[] nameCharacterExtensions;
    static int field_d;
    static PaletteFont field_e;

    final static void a(int param0) {
        if (ResourceArchive.field_f != null) {
          ResourceArchive.field_f.i((byte) -36);
          if (param0 != 224) {
            field_d = -126;
            if (null != sj.field_b) {
              sj.field_b.l(6457);
            }
            fl.f((byte) -83);
            return;
          }
          if (null != sj.field_b) {
            sj.field_b.l(6457);
          }
          fl.f((byte) -83);
          return;
        }
        if (param0 == 224) {
          if (null != sj.field_b) {
            sj.field_b.l(6457);
          }
          fl.f((byte) -83);
          return;
        }
        field_d = -126;
        if (null != sj.field_b) {
          sj.field_b.l(6457);
        }
        fl.f((byte) -83);
    }

    final static void a(boolean param0, int param1, byte param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (!TooltipSprite.field_p) {
          return;
        }
        wd.field_w.updateRoot(param0, -15211);
        var4 = hd.field_a.i(28) ? 1 : 0;
        if (0 != BackgroundScene.pressedButton) {
          if (var4 != 0) {
            if (!param0) {
              wd.field_w.updateRoot(param0, -15211);
              if (param2 < 89) {
                field_e = (PaletteFont) null;
              }
              var5 = hd.field_a.e((byte) -92) + hd.field_a.screenX;
              if (var5 > 640) {
                HighscoresScreen.field_v = HighscoresScreen.field_v + 5;
                return;
              }
              if (635 <= var5) {
                return;
              }
              if (HighscoresScreen.field_v <= 0) {
                return;
              }
              HighscoresScreen.field_v = HighscoresScreen.field_v - 5;
              return;
            }
            hd.field_a.a(38, param3, param1);
            wd.field_w.updateRoot(param0, -15211);
            if (param2 >= 89) {
              var5Lifetime2 = hd.field_a.e((byte) -92) + hd.field_a.screenX;
              if (var5Lifetime2 > 640) {
                HighscoresScreen.field_v = HighscoresScreen.field_v + 5;
                return;
              }
              if (635 <= var5Lifetime2) {
                return;
              }
              if (HighscoresScreen.field_v <= 0) {
                return;
              }
              HighscoresScreen.field_v = HighscoresScreen.field_v - 5;
              return;
            }
            field_e = (PaletteFont) null;
            var5Lifetime3 = hd.field_a.e((byte) -92) + hd.field_a.screenX;
            if (var5Lifetime3 <= 640) {
              if (635 <= var5Lifetime3) {
                return;
              }
              if (HighscoresScreen.field_v <= 0) {
                return;
              }
              HighscoresScreen.field_v = HighscoresScreen.field_v - 5;
            } else {
              HighscoresScreen.field_v = HighscoresScreen.field_v + 5;
            }
            return;
          }
          th.b(1);
          param0 = false;
        }
        if (param0) {
          hd.field_a.a(38, param3, param1);
        }
        if (var4 != 0) {
          wd.field_w.updateRoot(param0, -15211);
        }
        if (param2 < 89) {
          field_e = (PaletteFont) null;
        }
        var5Lifetime1 = hd.field_a.e((byte) -92) + hd.field_a.screenX;
        if (var5Lifetime1 > 640) {
          HighscoresScreen.field_v = HighscoresScreen.field_v + 5;
          return;
        }
        if (635 > var5Lifetime1) {
          if (HighscoresScreen.field_v <= 0) {
            return;
          }
          HighscoresScreen.field_v = HighscoresScreen.field_v - 5;
        }
        return;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 < 16) {
          return;
        }
        nameCharacterExtensions = null;
        field_b = null;
        desertSmallSprite = null;
        field_a = (int[][]) null;
        field_g = null;
    }

    static {
        field_g = "<%0> wants to join";
        nameCharacterExtensions = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_d = 65;
    }
}
