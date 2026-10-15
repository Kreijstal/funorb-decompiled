/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFailureKind {
    static String[] field_f;
    static boolean field_h;
    static RgbSprite[] trackHeads;
    static byte[] cacheSectorScratch;
    static RgbSprite[] activePaddleCapSprites;
    static int[] javaKeyCodeMap;
    static SecondaryHashTable ignoreIndex;
    static String[] field_e;
    static boolean field_i;

    final static void a(String param0, byte param1, int param2) {
        int var3_int = 0;
        try {
          CanvasInputCleanup.field_g = false;
          InteractiveGameClient.field_E = false;
          if (param1 >= -43) {
            activePaddleCapSprites = (RgbSprite[]) null;
          }
          if (null != StrongCacheEntry.field_I) {
            if (!StrongCacheEntry.field_I.visible) {
              return;
            }
            var3_int = 1;
            if (param2 == 8) {
              if (NanoGameClock.field_l) {
                param0 = TooltipSprite.field_n;
              } else {
                param0 = DesertBackground.field_u;
              }
              param2 = 2;
              DirectByteStorage.field_k.setAccountAndClearPassword(70, GameScreen.field_d);
            }
            if (param2 == 10) {
              RectangleBody.c(116);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (InteractiveGameClient.field_E) {
                param0 = GamePresentationHelpers.formatIndexedText(ProxySocketConnector.field_h, new String[]{param0}, (byte) 103);
              }
              if (BytePayloadSubmission.field_l) {
                param0 = GameCanvas.field_b;
              }
              StrongCacheEntry.field_I.showResponseMessage(param2, false, param0);
            }
            if (param2 != 256) {
              if (10 == param2) {
                return;
              }
              if (!NanoGameClock.field_l) {
                DirectByteStorage.field_k.clearCredentials(-113);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "tf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 == 6) {
          javaKeyCodeMap = null;
          cacheSectorScratch = null;
          field_f = null;
          trackHeads = null;
          field_e = null;
          ignoreIndex = null;
          activePaddleCapSprites = null;
          return;
        }
        String var2 = (String) null;
        FullscreenFailureKind.a((LobbyGame) null, false, (byte) -54, (String) null);
        javaKeyCodeMap = null;
        cacheSectorScratch = null;
        field_f = null;
        trackHeads = null;
        field_e = null;
        ignoreIndex = null;
        activePaddleCapSprites = null;
    }

    final static void a(LobbyGame param0, boolean param1, byte param2, String param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        ContextActionController var9 = null;
        String var10 = null;
        ContextActionController var11 = null;
        String var12 = null;
        ContextActionController var13 = null;
        String var14 = null;
        ContextActionController var15 = null;
        try {
          var4_int = 47 / ((param2 + 13) / 51);
          SpriteGeometry.a(-1, param0, rl.field_e, (int[]) null, (String) null, param0.getGameId((byte) -14), (byte) -58, 0L, (String) null);
          if (param0.started && (param0.spectatorMode == 2 ||
            !(QuickChatHelpDialog.field_Yb < 2))) {
            var9 = GameRenderAudioHelpers.contextActions;
            var10 = GamePresentationHelpers.formatIndexedText(LevelResultSubmission.field_s, new String[]{param3}, (byte) 103);
            var9.contextMenu.addAction(var10, 10, (byte) 91);
          }
          GameRenderAudioHelpers.contextActions.addGameActions(true);
          if (param1) {
            if (GameRenderAudioHelpers.contextActions.gameId == MenuSelection.previewGameId) {
              var13 = GameRenderAudioHelpers.contextActions;
              var14 = GamePresentationHelpers.formatIndexedText(ArchiveSourceManager.field_d, new String[]{param3}, (byte) 103);
              var13.contextMenu.addAction(var14, 16, (byte) 90);
            } else {
              var11 = GameRenderAudioHelpers.contextActions;
              var12 = GamePresentationHelpers.formatIndexedText(Paddle.field_G, new String[]{param3}, (byte) 103);
              var11.contextMenu.addAction(var12, 15, (byte) 116);
            }
          }
          var15 = GameRenderAudioHelpers.contextActions;
          var6 = LoadingProgressDialog.pressX;
          var7 = PlayerNameChooserPanel.pressY;
          var15.contextMenu.layoutAtAnchor(var7, -102, 0, 0, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("tf.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, RasterCacheSurface param2, int param3, int param4, RgbSprite param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-68, param2.sprite);
          Rasterizer2D.fillRectangle(0, 0, param2.width, param2.height, 16777215);
          int var6_int = -110 / ((param4 - 62) / 39);
          param5.drawTransparent((-param5.canvasWidth + param2.width) / 2, param2.height + (param0 - (param5.canvasHeight - 5 / param3)));
          RasterEffectHelpers.fillVerticalGradientAlpha255(0, 0, param2.width, param2.height, IntrusiveNode.field_h[param1], 11970969, 152);
          sc.popRaster(-112);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "tf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = false;
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        cacheSectorScratch = new byte[520];
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        javaKeyCodeMap = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
