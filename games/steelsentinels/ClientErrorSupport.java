/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientErrorSupport {
    static String field_d;
    static int field_g;
    static LoginDialog field_a;
    static int[] field_c;
    static String field_h;
    static NodeDeque field_e;
    static String field_f;
    static String[] field_b;

    final static String describePacketHistory(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = SteelSentinels.obfuscationControl;
        var6 = "(" + OptionMaskHelpers.field_d + " " + TextHotspotWidget.field_W + " " + RasterSnapshot.field_u + ") " + ArrayWidgetContainer.field_N;
        var1 = var6;
        if (param0 != 94) {
          return (String) null;
        }
        if (ViewportController.field_f > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < ViewportController.field_f; var2++) {
            var7 = var1 + ' ';
            var3 = LoginConnectionStage.field_d.payload[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          ClientErrorSupport.describePacketHistory((byte) -76);
        }
        field_f = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
    }

    final static void loadCommonUiResources(ResourceArchive param0, byte param1, ResourceArchive param2, ResourceArchive param3) {
        RgbSprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        RgbSprite var15 = null;
        RgbSprite var18 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = SteelSentinels.obfuscationControl;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          MeshMaterial.field_k = StatSubmission.loadSpritesByName("frame_top", "commonui", (byte) -95, param0);
          Explosion.field_J = StatSubmission.loadSpritesByName("frame_bottom", "commonui", (byte) -94, param0);
          Explosion.field_L = PacketLoopHelpers.loadRgbSpriteByName(param0, "commonui", "jagex_logo_grey", false);
          ChatHistoryAllocator.field_m = StatSubmission.loadSpritesByName("button", "commonui", (byte) -54, param0);
          NameTable.field_i = ClientUiHelpers.loadRgbSpritesByName((byte) -62, "validation", param0, "commonui");
          SectorCacheStore.field_m = (BitmapFont) ((Object) UrlAndReplyHelpers.loadCoverageFontByName(param0, param2, (byte) -48, "arezzo12", "commonui"));
          HighscoreSubmissionFactory.field_e = (BitmapFont) ((Object) UrlAndReplyHelpers.loadCoverageFontByName(param0, param2, (byte) -62, "arezzo14", "commonui"));
          GeneratedSpriteHelpers.field_d = (BitmapFont) ((Object) UrlAndReplyHelpers.loadCoverageFontByName(param0, param2, (byte) -57, "arezzo14bold", "commonui"));
          var17 = new RgbSprite(param3.getFileByName("", -742, "button.gif"), (java.awt.Component) ((Object) ArchiveLoadStep.field_n));
          if (param1 < 63) {
            ClientErrorSupport.releaseStatics(true);
          }
          NanoTickClock.loadIndexedSprite(param0, (byte) 85, "commonui", "dropdown");
          var5 = ArchiveLoadSequence.loadIndexedSpritesByName(45, "commonui", param0, "screen_options");
          UiComponent.field_q = new IndexedSprite[4];
          ce.field_q = new IndexedSprite[4];
          PasswordValidator.field_r = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{UiComponent.field_q, ce.field_q, PasswordValidator.field_r};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_o;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_p[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = NodeHashTable.createRepalettedSprite(var5[var9], var19[var11_int], false);
            }
          }
          var9Lifetime1 = var17.field_F;
          ArchiveIndex.pushRasterState(false);
          var17.bindRasterTarget();
          SoftwareRaster.desaturateRectangle(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
          var15 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.bindRasterTarget();
          var17.drawOpaque(0, 0);
          var11 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var11.bindRasterTarget();
          var17.drawOpaque(var9Lifetime1 - var17.field_A, 0);
          var12 = new RgbSprite(var17.field_A - var9Lifetime1 * 2, var9Lifetime1);
          var12.bindRasterTarget();
          var17.drawOpaque(-var9Lifetime1, 0);
          MatchingTextValidator.popRasterStateWithIntGuard(122);
          ChatHistoryAllocator.field_m = new RgbSprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ci.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String formatArchiveGroupProgress(ResourceArchive param0, byte param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.ensureIndex(true)) {
            stackIn_2_0 = (String) (param4);
            return stackIn_2_0;
          }
          if (param1 < 86) {
            field_g = -116;
          }
          stackIn_6_0 = param3 + " - " + param0.getGroupProgressByName((byte) 94, param2) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ci.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static ClientException addExceptionContext(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    final static void updateOverlays(boolean param0, byte param1) {
        if (null != UiTheme.field_i) {
          ViewportController.drawPointerTooltip(UiTheme.field_i, 1);
        }
        if (null != AudioService.field_i) {
          AudioService.field_i.updateMenu(param0, (byte) -114);
        }
        SentinelCommandSimulator.drawAccountNamePrompt((byte) -115, param0);
        int var2 = 40 % ((param1 - 49) / 45);
        if (FunOrbClient.field_x != null) {
          FunOrbClient.field_x.drawFullScreen(param0, (byte) 127);
        }
        ChatHistoryHelpers.drawQuickChatHelpOverlay(0, param0);
    }

    static {
        field_d = "Show chat";
        field_h = "Players: <%0>/<%1>";
        field_c = new int[8192];
        field_f = "Enemy wave - ";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
