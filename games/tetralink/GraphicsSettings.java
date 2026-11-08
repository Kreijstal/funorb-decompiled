/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GraphicsSettings {
    boolean field_d;
    int field_h;
    int field_p;
    int field_e;
    static LoginCredentials field_a;
    boolean field_j;
    boolean field_g;
    int field_i;
    static GameRoomPanelHelpers field_o;
    boolean field_c;
    boolean field_n;
    static String field_k;
    static int[] field_m;
    int field_l;
    static int field_f;
    static UiComponent field_b;

    final static void initializeLobbyUi(Sprite[][] param0, byte[] param1, Archive param2, byte param3, byte[] param4, String[][] param5, int[] param6, int param7, String[][] param8, int[] param9, String[] param10, Archive param11, Archive param12, IndexedSprite[] param13, boolean param14, int param15, Sprite[][] param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          LobbyStartupHelpers.initializeLobbyUi(param11, param9, param6, param13, param5, param8, param16, param15, param0, param7, param10, 125, param12, 1, param14, param4, param2, param1, (String[]) null);
          if (param3 != -35) {
            GraphicsSettings.initializeLobbyUi((Sprite[][]) null, (byte[]) null, (Archive) null, (byte) 1, (byte[]) null, (String[][]) null, (int[]) null, -121, (String[][]) null, (int[]) null, (String[]) null, (Archive) null, (Archive) null, (IndexedSprite[]) null, false, -92, (Sprite[][]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("c.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param10 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param11 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param12 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param13 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        field_o = null;
        if (param0 < 61) {
          GraphicsSettings.initializeLobbyUi((Sprite[][]) null, (byte[]) null, (Archive) null, (byte) -117, (byte[]) null, (String[][]) null, (int[]) null, 89, (String[][]) null, (int[]) null, (String[]) null, (Archive) null, (Archive) null, (IndexedSprite[]) null, true, -57, (Sprite[][]) null);
          field_m = null;
          field_a = null;
          field_b = null;
          return;
        }
        field_m = null;
        field_a = null;
        field_b = null;
    }

    final static void renderScreenToSprites(int param0, boolean param1, boolean param2, int param3, int param4) {
        GameSession stackIn_9_0;
        int stackIn_9_1;
        Sprite stackIn_9_2;
        Sprite stackIn_9_3;
        boolean stackIn_10_4 = false;
        GameSession stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        Sprite stackIn_17_2 = null;
        boolean stackIn_18_3 = false;
        GameSession stackIn_26_0;
        int stackIn_26_1;
        Sprite stackIn_26_2;
        Sprite stackIn_26_3;
        boolean stackIn_27_4 = false;
        GameSession stackIn_31_0 = null;
        boolean stackIn_32_1 = false;
        MenuScreen stackIn_36_0 = null;
        boolean stackIn_36_1 = false;
        int stackIn_36_2 = 0;
        int stackIn_37_3 = 0;
        GameSession stackIn_55_0;
        int stackIn_55_1;
        Sprite stackIn_55_2;
        Sprite stackIn_55_3;
        boolean stackIn_56_4 = false;
        GameSession stackIn_59_0 = null;
        boolean stackIn_60_1 = false;
        Sprite stackIn_62_2 = null;
        boolean stackIn_63_3 = false;
        GameSession stackIn_69_0;
        int stackIn_69_1;
        Sprite stackIn_69_2;
        Sprite stackIn_69_3;
        boolean stackIn_70_4 = false;
        GameSession stackIn_73_0 = null;
        boolean stackIn_74_1 = false;
        MenuScreen stackIn_78_0 = null;
        boolean stackIn_78_1 = false;
        int stackIn_78_2 = 0;
        int stackIn_79_3 = 0;
        int var6;
        var6 = TetraLink.field_J;
        if (param1) {
          DisplayMode.fillSprite(VerticalScrollbar.field_Lb, (byte) -127, 0);
          if (!WidgetTheme.field_i.field_n) {
            DisplayMode.fillSprite(NetworkArchiveRequest.field_M, (byte) -122, 0);
          }
          if (param4 != -1) {
            if (-2 == param4) {
              throw new RuntimeException();
            }
            RasterTargetHelpers.setSpriteRasterTarget(VerticalScrollbar.field_Lb, 6);
            stackIn_78_0 = MarkerSlider.field_X[param4];
            stackIn_78_1 = false;
            stackIn_78_2 = param0;
            stackIn_79_3 = (!WidgetTheme.field_i.field_n) ? 2 : 0;
            ((MenuScreen) (Object) stackIn_78_0).drawScreen(stackIn_78_1, stackIn_78_2, stackIn_79_3);
            if (param3 != -1) {
              PixelBlockEffect.pixelate(param3, 256, 16769381, false, false);
            }
            if (!WidgetTheme.field_i.field_n) {
              NetworkArchiveRequest.field_M.makeRasterTarget();
              MarkerSlider.field_X[param4].drawScreen(false, param0, 1);
              if (-1 != param3) {
                PixelBlockEffect.pixelate(param3, 256, 16769381, false, false);
              }
            }
            HuffmanCodec.popRasterTarget(param1);
            return;
          }
          if (null != ContextMenu.field_bc) {
            if (!WidgetTheme.field_i.field_n) {
              stackIn_55_0 = ContextMenu.field_bc;
              stackIn_55_1 = 2509;
              stackIn_55_2 = NetworkArchiveRequest.field_M;
              stackIn_55_3 = VerticalScrollbar.field_Lb;
              stackIn_56_4 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
              ((GameSession) (Object) stackIn_55_0).renderBoardLayers(stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_56_4);
            } else {
              stackIn_59_0 = ContextMenu.field_bc;
              stackIn_60_1 = (!(LongAndTextCredentials.field_h[11] < 0.0)) ? false : true;
              stackIn_62_2 = VerticalScrollbar.field_Lb;
              stackIn_63_3 = (param1) ? false : true;
              ((GameSession) (Object) stackIn_59_0).renderBoardTexture(stackIn_60_1, stackIn_62_2, stackIn_63_3);
            }
            return;
          }
          if (SocialListEntry.field_Qb == null) {
            return;
          }
          if (WidgetTheme.field_i.field_n) {
            stackIn_73_0 = SocialListEntry.field_Qb;
            stackIn_74_1 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
            ((GameSession) (Object) stackIn_73_0).renderBoardTexture(stackIn_74_1, VerticalScrollbar.field_Lb, false);
          } else {
            stackIn_69_0 = SocialListEntry.field_Qb;
            stackIn_69_1 = 2509;
            stackIn_69_2 = NetworkArchiveRequest.field_M;
            stackIn_69_3 = VerticalScrollbar.field_Lb;
            stackIn_70_4 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
            ((GameSession) (Object) stackIn_69_0).renderBoardLayers(stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_70_4);
          }
          return;
        }
        GraphicsSettings.initializeLobbyUi((Sprite[][]) null, (byte[]) null, (Archive) null, (byte) -80, (byte[]) null, (String[][]) null, (int[]) null, -47, (String[][]) null, (int[]) null, (String[]) null, (Archive) null, (Archive) null, (IndexedSprite[]) null, false, 92, (Sprite[][]) null);
        DisplayMode.fillSprite(VerticalScrollbar.field_Lb, (byte) -127, 0);
        if (!WidgetTheme.field_i.field_n) {
          DisplayMode.fillSprite(NetworkArchiveRequest.field_M, (byte) -122, 0);
        }
        if (param4 != -1) {
          if (-2 == param4) {
            throw new RuntimeException();
          }
          RasterTargetHelpers.setSpriteRasterTarget(VerticalScrollbar.field_Lb, 6);
          stackIn_36_0 = MarkerSlider.field_X[param4];
          stackIn_36_1 = false;
          stackIn_36_2 = param0;
          stackIn_37_3 = (!WidgetTheme.field_i.field_n) ? 2 : 0;
          ((MenuScreen) (Object) stackIn_36_0).drawScreen(stackIn_36_1, stackIn_36_2, stackIn_37_3);
          if (param3 != -1) {
            PixelBlockEffect.pixelate(param3, 256, 16769381, false, false);
          }
          if (!WidgetTheme.field_i.field_n) {
            NetworkArchiveRequest.field_M.makeRasterTarget();
            MarkerSlider.field_X[param4].drawScreen(false, param0, 1);
            if (-1 != param3) {
              PixelBlockEffect.pixelate(param3, 256, 16769381, false, false);
            }
          }
          HuffmanCodec.popRasterTarget(param1);
          return;
        }
        if (null != ContextMenu.field_bc) {
          if (!WidgetTheme.field_i.field_n) {
            stackIn_9_0 = ContextMenu.field_bc;
            stackIn_9_1 = 2509;
            stackIn_9_2 = NetworkArchiveRequest.field_M;
            stackIn_9_3 = VerticalScrollbar.field_Lb;
            stackIn_10_4 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
            ((GameSession) (Object) stackIn_9_0).renderBoardLayers(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_10_4);
          } else {
            stackIn_14_0 = ContextMenu.field_bc;
            stackIn_15_1 = (!(LongAndTextCredentials.field_h[11] < 0.0)) ? false : true;
            stackIn_17_2 = VerticalScrollbar.field_Lb;
            stackIn_18_3 = (param1) ? false : true;
            ((GameSession) (Object) stackIn_14_0).renderBoardTexture(stackIn_15_1, stackIn_17_2, stackIn_18_3);
          }
          return;
        }
        if (SocialListEntry.field_Qb == null) {
          return;
        }
        if (WidgetTheme.field_i.field_n) {
          stackIn_31_0 = SocialListEntry.field_Qb;
          stackIn_32_1 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
          ((GameSession) (Object) stackIn_31_0).renderBoardTexture(stackIn_32_1, VerticalScrollbar.field_Lb, false);
        } else {
          stackIn_26_0 = SocialListEntry.field_Qb;
          stackIn_26_1 = 2509;
          stackIn_26_2 = NetworkArchiveRequest.field_M;
          stackIn_26_3 = VerticalScrollbar.field_Lb;
          stackIn_27_4 = (!(0.0 > LongAndTextCredentials.field_h[11])) ? false : true;
          ((GameSession) (Object) stackIn_26_0).renderBoardLayers(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4);
        }
    }

    GraphicsSettings() {
        this(3);
    }

    GraphicsSettings(int param0) {
        int var2;
        var2 = param0;
        if (var2 == 0) {
          this.field_n = true;
          this.field_c = false;
          this.field_j = false;
          this.field_g = false;
          this.field_d = false;
          this.field_l = 0;
          this.field_e = -1;
          return;
        }
        if (var2 == 1) {
          this.field_c = false;
          this.field_j = true;
          this.field_i = 20;
          this.field_d = true;
          this.field_p = 1;
          this.field_l = 48;
          this.field_g = false;
          this.field_h = 50;
          this.field_e = 1;
          this.field_n = false;
          return;
        }
        if (var2 == 2) {
          this.field_l = 0;
          this.field_d = false;
          this.field_e = -1;
          this.field_n = true;
          this.field_g = false;
          this.field_c = true;
          this.field_j = false;
          return;
        }
        if (var2 == 3) {
          this.field_d = false;
          this.field_l = 48;
          this.field_c = true;
          this.field_e = 5;
          this.field_j = true;
          this.field_n = false;
          this.field_g = false;
          return;
        }
        if (var2 != 4) {
          return;
        }
        this.field_p = 1;
        this.field_i = 20;
        this.field_d = true;
        this.field_h = 50;
        this.field_l = 48;
        this.field_j = true;
        this.field_n = false;
        this.field_e = 1;
        this.field_c = true;
        this.field_g = true;
    }

    static {
        field_a = null;
        field_k = "Invite only";
        field_m = new int[128];
        field_o = new GameRoomPanelHelpers();
    }
}
