/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends IntrusiveNode {
    static String field_h;
    int[] field_g;
    static String field_j;
    static String field_i;

    final static void loadCommonUiSprites(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = ArcanistsMulti.field_G ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          fk.field_g = qe.loadSpriteSheet(param3, "frame_top", "commonui", 87);
          FadingModalPanel.field_E = qe.loadSpriteSheet(param3, "frame_bottom", "commonui", 118);
          ci.field_e = fj.loadSprite("commonui", -22612, param3, "jagex_logo_grey");
          af.field_Jb = qe.loadSpriteSheet(param3, "button", "commonui", 86);
          ContentTransitionDialog.field_lb = IconTextSceneWidget.loadSpritesByName((byte) 31, param3, "validation", "commonui");
          WidgetStyleLayer.field_e = (BitmapFont) ((Object) WhirlpoolHasher.loadCoverageFont("arezzo12", param1, "commonui", -119, param3));
          ia.field_c = (BitmapFont) ((Object) WhirlpoolHasher.loadCoverageFont("arezzo14", param1, "commonui", -120, param3));
          SocketConnector.field_k = (BitmapFont) ((Object) WhirlpoolHasher.loadCoverageFont("arezzo14bold", param1, "commonui", -123, param3));
          var17 = new Sprite(param2.getNamedFile("", "button.gif", -1), (java.awt.Component) ((Object) on.field_c));
          af.loadIndexedSpriteByName("dropdown", "commonui", 19412, param3);
          var5 = IterableNodeHashTable.loadIndexedSpritesByName("commonui", 0, "screen_options", param3);
          MusicPatch.field_k = new IndexedSprite[4];
          oa.field_d = new IndexedSprite[4];
          qj.field_j = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{oa.field_d, MusicPatch.field_k, qj.field_j};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_m[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          if (param0 < 71) {
            aa.releaseStatics(false);
          }
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = SocketJs5Transport.withPalette(var19[var11_int], (byte) -59, var5[var9]);
            }
          }
          var9Lifetime1 = var17.field_y;
          ec.pushClipState(65280);
          var17.makeRasterTarget();
          SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.makeRasterTarget();
          var17.drawOpaque(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.makeRasterTarget();
          var17.drawOpaque(-var17.field_q + var9Lifetime1, 0);
          var12 = new Sprite(-(var9Lifetime1 * 2) + var17.field_q, var9Lifetime1);
          var12.makeRasterTarget();
          var17.drawOpaque(-var9Lifetime1, 0);
          oo.popClipState(-15405);
          af.field_Jb = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static ClientException wrapException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (!(param0 instanceof ClientException)) {
          var2 = new ClientException(param0, param1);
        } else {
          var2 = (ClientException) ((Object) param0);
          var2.context = var2.context + ' ' + param1;
        }
        return var2;
    }

    public static void releaseStatics(boolean param0) {
        field_j = null;
        if (param0) {
          field_i = (String) null;
        }
        field_i = null;
        field_h = null;
    }

    final static ScreenDisplayMode[] queryDisplayModes(PlatformTaskDispatcher param0, byte param1) {
        int var5 = 0;
        ScreenDisplayMode[] stackIn_4_0 = null;
        ScreenDisplayMode[] stackIn_10_0 = null;
        ScreenDisplayMode[] stackIn_13_0 = null;
        ScreenDisplayMode[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ScreenDisplayMode[] var4 = null;
        ScreenDisplayMode var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!param0.isFullscreenSupported((byte) 46)) {
            stackIn_4_0 = new ScreenDisplayMode[]{};
            return stackIn_4_0;
          }
          var8 = param0.queueDisplayModeQuery(-27886);
          while (var8.field_e == 0) {
            ao.sleepMillis(10L, 1);
          }
          if (var8.field_e == 2) {
            stackIn_10_0 = new ScreenDisplayMode[]{};
            return stackIn_10_0;
          }
          var10 = (int[]) (var8.field_g);
          var9 = var10;
          var3 = var9;
          if (param1 < 59) {
            stackIn_13_0 = (ScreenDisplayMode[]) null;
            return stackIn_13_0;
          }
          var4 = new ScreenDisplayMode[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new ScreenDisplayMode();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 2];
            var6.field_e = var3[1 + (var5 << 2)];
            var6.field_a = var3[(var5 << 2) + 2];
            var6.field_d = var3[(var5 << 2) + 3];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("aa.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private aa() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Account created successfully!";
        field_j = "You have no wands available.";
        field_i = "Staff impersonation";
    }
}
