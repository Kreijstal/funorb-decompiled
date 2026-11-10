/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static boolean field_a;

    final static void releaseLevelSpriteSet(int param0, int param1) {
        if (LevelNavigation.field_o == MenuSpriteGlobals.field_b[param0]) {
          LevelNavigation.field_o = null;
        }
        if (SoundEffectNode.field_h == Zombie.field_Fb[param0]) {
          SoundEffectNode.field_h = null;
        }
        if (param1 != 4767999) {
          return;
        }
        Sprite[][] var4 = MenuSpriteGlobals.field_b;
        Sprite[][] var2 = var4;
        Zombie.field_Fb[param0] = null;
        int var3 = param0;
        var4[var3] = null;
    }

    final static void loadCommonUiResources(Js5Archive param0, Js5Archive param1, Js5Archive param2, int param3) {
        int var11_int = 0;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite[] var10 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var13 = 0;
        IndexedSprite[] var14 = null;
        Sprite var15 = null;
        int[][] var16 = null;
        Sprite var17 = null;
        Sprite var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = ZombieDawn.field_J;
        try {
          BitmapTextLayout.field_f = ThreeSliceButtonPainter.loadSpritesByName((byte) 117, "frame_top", "commonui", param1);
          LinkTextPainter.field_b = ThreeSliceButtonPainter.loadSpritesByName((byte) -44, "frame_bottom", "commonui", param1);
          ArmySoldier.field_Tb = LoginAndPacketHelpers.loadSpriteByName(param1, "jagex_logo_grey", 8, "commonui");
          MenuFontGlobals.field_d = ThreeSliceButtonPainter.loadSpritesByName((byte) -83, "button", "commonui", param1);
          Js5Archive.field_k = PendingFlagRequest.loadSpritesByName((byte) 24, "commonui", "validation", param1);
          SecondaryNodeDeque.field_a = (Font) ((Object) DualLinkDeque.loadCoverageFont(param0, "commonui", "arezzo12", param3 + 19041, param1));
          MenuFontGlobals.field_e = (Font) ((Object) DualLinkDeque.loadCoverageFont(param0, "commonui", "arezzo14", param3 + 19041, param1));
          LoginPacketHelpers.field_b = (Font) ((Object) DualLinkDeque.loadCoverageFont(param0, "commonui", "arezzo14bold", 0, param1));
          var17 = new Sprite(param2.getFileByName("", param3 ^ 19000, "button.gif"), (java.awt.Component) ((Object) IntrusiveDequeCursor.field_d));
          HighscoresScreen.loadIndexedSprite(param1, "dropdown", "commonui", 4424743);
          var5 = HighscoreSubmissionHelpers.loadIndexedSpritesByName("commonui", "screen_options", -1864, param1);
          ClientProtocolStage.field_c = new IndexedSprite[4];
          PopupMenuBuilder.field_e = new IndexedSprite[4];
          JaggrabDownloader.field_h = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{PopupMenuBuilder.field_e, JaggrabDownloader.field_h, ClientProtocolStage.field_c};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_k[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = DropdownSelectorPainter.createRepalettedSprite(var5[var9], var19[var11_int], -27837);
            }
          }
          var9Lifetime1 = var17.field_t;
          TrafficVehicle.pushRasterState(1584);
          var17.setAsRenderTarget();
          Rasterizer.desaturateRectangle(0, 0, Rasterizer.width, Rasterizer.height);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.setAsRenderTarget();
          var17.drawWithOffsets(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.setAsRenderTarget();
          var17.drawWithOffsets(var9Lifetime1 - var17.field_w, 0);
          var12 = new Sprite(var17.field_w - 2 * var9Lifetime1, var9Lifetime1);
          var12.setAsRenderTarget();
          var17.drawWithOffsets(-var9Lifetime1, 0);
          SingleChildWidget.popRasterState(-21189);
          MenuFontGlobals.field_d = new Sprite[]{var15, var12, var11};
          if (param3 != -19041) {
            LoginCredentials.releaseLevelSpriteSet(110, -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ll.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void writePayload(boolean param0, PacketBuffer param1);

    abstract LoginPayloadKind payloadKind(byte param0);

    final static void drawMenuItems(int param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        NineSliceFrame stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSliceFrame var9 = null;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          var1_int = DropdownArrowPainter.field_a - DropdownArrowPainter.field_c;
          DropdownArrowPainter.field_c = -(var1_int >> 1) + TileableNoiseGenerator.field_d;
          DropdownArrowPainter.field_a = DropdownArrowPainter.field_c + var1_int;
          MarkerSliderPainter.field_k = MasterIndexHelpers.field_b - (ArmedHuman.field_Mb >> 1);
          var2 = MarkerSliderPainter.field_k;
          if (param0 > -45) {
            return;
          }
          for (var3 = 0; ReflectionCheckRequest.field_r.length > var3; var3++) {
            var4 = FullscreenFocusCanvas.field_b[var3];
            if (var4 >= 0) {
              if (var4 == Point.field_m.field_d) {
                var5 = LevelNavigation.field_s;
              } else {
                var5 = ScrollContainer.field_E;
              }
            } else {
              var5 = SocketConnector.field_f;
            }
            var6 = ReflectionCheckRequest.field_r[var3];
            stackIn_12_0 = 32564;
            stackIn_13_1 = !(0 > var4);
            var7 = FullscreenErrorReason.measureMenuText(stackIn_12_0, stackIn_13_1, var6);
            var8 = -(var7 >> 1) + TileableNoiseGenerator.field_d;
            if (var4 >= 0) {
              if (Point.field_m.field_d != var4) {
                stackIn_17_0 = HighscoreSubmissionHelpers.field_b;
              } else {
                stackIn_17_0 = ScrollContainer.field_G;
              }
              var9 = stackIn_17_0;
              var2 = var2 + AbstractSprite.field_i;
              if (var9 != null) {
                var9.drawFrame((DualLinkNode.field_m << 1) + var7, var2, -DualLinkNode.field_m + var8, (byte) -118, MusicPatch.field_k + (DisplaySettingsDialog.field_Y << 1));
              }
              var2 = var2 + DisplaySettingsDialog.field_Y;
            }
            if (var4 >= 0) {
              FunOrbApplet.field_m.drawString(var6, var8, DualLinkNodeHashTable.field_g + var2, var5, -1);
              var2 = var2 + (MusicPatch.field_k + DisplaySettingsDialog.field_Y + AbstractSprite.field_i);
            } else {
              FullscreenExitHelpers.field_g.drawString(var6, var8, SpatialObject.field_p + var2, var5, -1);
              var2 = var2 + WidgetContainer.field_G;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "ll.A(" + param0 + ')');
        }
    }

    static {
        field_a = false;
    }
}
