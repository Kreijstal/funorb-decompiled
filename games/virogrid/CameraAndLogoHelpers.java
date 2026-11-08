/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CameraAndLogoHelpers {
    static boolean field_e;
    static String textEndgameBoardfilledYou;
    static String field_b;
    static BirthDateEntryPanel field_c;
    static String field_d;

    final static void compactFaceDepthBuckets(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = QueuedResultSubmission.field_g[0];
          for (var2 = 1; var2 < QueuedResultSubmission.field_g.length; var2++) {
            var3 = QueuedResultSubmission.field_g[var2];
            ArraySupport.copy(ReflectionCheck.field_m, var2 << 4, ReflectionCheck.field_m, var1_int, var3);
            var1_int = var1_int + var3;
          }
          if (param0 != -80) {
            CameraAndLogoHelpers.releaseStatics(-100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "fh.A(" + param0 + ')');
        }
    }

    final static void drawLogoAnimation(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        if (DualLinkHashTable.field_e < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = param0 - 35;
        var5 = 256;
        if (DualLinkHashTable.field_e < 75) {
          var5 = (DualLinkHashTable.field_e << 8) / 75;
        }
        if (DualLinkHashTable.field_e > 200) {
          var5 = (250 - DualLinkHashTable.field_e << 8) / 50;
        }
        ChatPanelSetupHelpers.setRenderTargetSprite(DelegatingCanvas.field_g, 16865);
        TriangleRasterizer.useRasterClip();
        Rasterizer.clear();
        LogoRenderHelpers.buildLogoModelFrame(11);
        if (var5 < 256) {
          Rasterizer.fillRectangleAlpha(0, 0, Rasterizer.field_e, Rasterizer.field_f, 0, 256 - var5);
        }
        ContextMenuHelpers.popRasterTarget(true);
        if (DualLinkHashTable.field_e < 150) {
          DelegatingCanvas.field_g.drawHalfSize(var3, var4);
        } else {
          GrowableIntList.field_d.drawWithOpacity(15 + var3, var4 + 10, var5);
        }
        var6 = DualLinkHashTable.field_e - 125;
        if (var6 > 0 &&
          var6 < 50) {
          if (20 > var6) {
            var7 = 256 * var6 / 20;
            TextFieldPainter.field_u.drawAdditive(var3, var4, var7);
          } else {
            if (var6 >= 30) {
              var7 = 256 * (50 - var6) / 20;
              TextFieldPainter.field_u.drawAdditive(var3, var4, var7);
            } else {
              TextFieldPainter.field_u.drawAdditive(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = DualLinkHashTable.field_e - 140;
        if (var6Lifetime1 > param1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          InputDetachHelpers.field_c.drawWithOpacity(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final static void resetCameraDefaults(byte param0) {
        ScrollPaneWithFooter.field_Hb = 52.5f;
        StrongCacheReference.field_D = 262144;
        PatchNoteUsage.field_i = 128.0f;
        ArchiveIndex.field_o = 3.1415927410125732f;
        LoginMethod.field_h = 0;
        CheckboxPainter.field_r = 128.0f;
        CommonUiHelpers.field_c = 3.1415927410125732f;
        ClientEnvironmentHelpers.field_k = 50.0f;
        QuickChatPhraseRegistry.field_g[2] = 0.0;
        QuickChatPhraseRegistry.field_g[0] = 1.0;
        UiTheme.field_r = 0;
        BitCountAndDialogHelpers.field_c = 2;
        CheckboxPainter.field_r = 80.0f;
        TooltipAndOptionsHelpers.field_c = 80.0f;
        if (param0 > -83) {
          field_e = true;
        }
        SoundPlaybackHelpers.field_d[0] = (double)CheckboxPainter.field_r * Math.sin((double)CommonUiHelpers.field_c);
        SoundPlaybackHelpers.field_d[2] = (double)CheckboxPainter.field_r * Math.cos((double)CommonUiHelpers.field_c);
        MarkerSlider.updateCameraMatrix((byte) -44);
    }

    public static void releaseStatics(int param0) {
        textEndgameBoardfilledYou = null;
        field_d = null;
        field_c = null;
        if (param0 != 10061) {
          field_e = true;
        }
        field_b = null;
    }

    static {
        textEndgameBoardfilledYou = "You have the most pieces";
        field_b = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_d = "Options";
    }
}
