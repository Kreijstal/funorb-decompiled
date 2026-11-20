/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends NineSlicePanel {
    static int[] field_j;
    static MusicTrack[] field_k;
    static int[] field_l;
    static java.awt.Image field_i;
    static MidiPcmStream field_m;

    final static void a(boolean param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = HoldTheLine.field_D;
        int var8Lifetime1;
        RaceVehicle.field_Db = StandardContentTransitionDialog.a(param3, 33, "commonui", "frame_top");
        te.field_b = StandardContentTransitionDialog.a(param3, 33, "commonui", "frame_bottom");
        SpriteState.field_t = UrlPacketDownloader.a(param3, "commonui", false, "jagex_logo_grey");
        NameCheckProgressDialog.field_Ab = StandardContentTransitionDialog.a(param3, 33, "commonui", "button");
        FullscreenFocusCanvas.field_i = OutlinedRoadStripRenderer.loadNamedSprites("validation", 17870, "commonui", param3);
        SpriteButtonRenderer.field_w = (BitmapFont) ((Object) UiTheme.loadNamedCoverageFont("commonui", "arezzo12", param1, (byte) 35, param3));
        IntrusiveNode.field_g = (BitmapFont) ((Object) UiTheme.loadNamedCoverageFont("commonui", "arezzo14", param1, (byte) 35, param3));
        DisplayNameForm.field_I = (BitmapFont) ((Object) UiTheme.loadNamedCoverageFont("commonui", "arezzo14bold", param1, (byte) 35, param3));
        Sprite var17 = new Sprite(param2.getNamedFile("", !param0 ? true : false, "button.gif"), (java.awt.Component) ((Object) MouseInputHandler.field_b));
        hc.a("dropdown", param3, -120, "commonui");
        IndexedSprite[] var5 = oc.a("screen_options", param3, (byte) 32, "commonui");
        FullscreenFocusCanvas.field_g = new IndexedSprite[4];
        FullscreenFocusCanvas.field_d = new IndexedSprite[4];
        MarkerSliderRenderer.field_d = new IndexedSprite[4];
        IndexedSprite[][] var6 = new IndexedSprite[][]{FullscreenFocusCanvas.field_d, FullscreenFocusCanvas.field_g, MarkerSliderRenderer.field_d};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_n;
        for (var8 = 1; var19.length > var8; var8++) {
          var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8Lifetime1 = var5[0].field_m[0];
        var19[2][var8Lifetime1] = 16777215;
        var19[1][var8Lifetime1] = 2394342;
        var19[3][var8Lifetime1] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
          var14 = var6[var9];
          IndexedSprite[] var10 = var14;
          for (var11_int = 0; var14.length > var11_int; var11_int++) {
            var14[var11_int] = FadingDialog.a(var19[var11_int], -116, var5[var9]);
          }
        }
        var9 = var17.height;
        lj.a((byte) -124);
        var17.bindRaster();
        SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
        Sprite var15 = new Sprite(var9, var9);
        Sprite var18 = var15;
        var18.bindRaster();
        if (!param0) {
          return;
        }
        try {
          var17.drawUnkeyed(0, 0);
          var11 = new Sprite(var9, var9);
          var11.bindRaster();
          var17.drawUnkeyed(-var17.width + var9, 0);
          var12 = new Sprite(var17.width - 2 * var9, var9);
          var12.bindRaster();
          var17.drawUnkeyed(-var9, 0);
          dm.b((byte) -10);
          NameCheckProgressDialog.field_Ab = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "i.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(ArcTrackBoundary param0, ArcTrackBoundary param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        Vector2f var6 = null;
        Vector2f var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        Point2i var11 = null;
        Point2i var12 = null;
        int var13 = 0;
        Vector2i var14 = null;
        try {
          var14 = new Vector2i(param1.center, param0.center);
          var4 = var14.lengthSquared(-113);
          var5 = (float)Math.sqrt((double)var4);
          var6 = var14.divideToFloat(var5, (byte) 121);
          if (param2 != -6218) {
            i.a((byte) -15, true);
          }
          var7 = var6.perpendicular((byte) -41);
          var8 = (float)(-(param0.radius * param0.radius) + (var4 + param1.radius * param1.radius));
          var8 = var8 / (var5 * 2.0f);
          var9 = -(var8 * var8) + (float)(param1.radius * param1.radius);
          if (0.0f > var9) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var10 = (float)Math.sqrt((double)var9);
          var6.scale(var8, param2 ^ 6217);
          var7.scale(var10, -1);
          var11 = new Point2i(param1.center);
          var11.translate(var6, (byte) 109);
          if (0.0010000000474974513f > var9) {
            RasterBuffer.field_d = BoundaryIntersection.angleBetweenPoints(param1.center, var11, false);
            IterableSecondaryNodeDeque.field_b = BoundaryIntersection.angleBetweenPoints(param0.center, var11, false);
            if (param1.containsAngle(RasterBuffer.field_d, param2 ^ -10910) &&
              param0.containsAngle(IterableSecondaryNodeDeque.field_b, param2 ^ -10910)) {
              stackIn_19_0 = 1;
              return stackIn_19_0;
            }
            stackIn_21_0 = 0;
            return stackIn_21_0;
          }
          var12 = new Point2i(var11);
          var11.translate(var7, (byte) 122);
          var12.subtractVector(var7, -13201);
          RasterBuffer.field_d = BoundaryIntersection.angleBetweenPoints(param1.center, var11, false);
          var13 = 0;
          IterableSecondaryNodeDeque.field_b = BoundaryIntersection.angleBetweenPoints(param0.center, var11, false);
          if (param1.containsAngle(RasterBuffer.field_d, 13012) &&
            param0.containsAngle(IterableSecondaryNodeDeque.field_b, 13012)) {
            var13++;
          }
          CachedArchiveProvider.field_g = BoundaryIntersection.angleBetweenPoints(param1.center, var12, false);
          TextHotspotWidget.field_G = BoundaryIntersection.angleBetweenPoints(param0.center, var12, false);
          if (param1.containsAngle(CachedArchiveProvider.field_g, param2 + 19230) &&
            param0.containsAngle(TextHotspotWidget.field_G, 13012)) {
            var13++;
            if (var13 == 1) {
              RasterBuffer.field_d = CachedArchiveProvider.field_g;
              IterableSecondaryNodeDeque.field_b = TextHotspotWidget.field_G;
            }
          }
          stackIn_15_0 = var13;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("i.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        ByteStorage.field_b = dg.field_c;
        if (param0 <= 43) {
          String var3 = (String) null;
          i.a(100, -42, -85, (String) null, -48);
        }
        if (dg.field_c == 13) {
          ((RaceSetupMenu) (l.field_a[dg.field_c])).beginExit((byte) -120);
        } else {
          if (dg.field_c != -1) {
            ((GameMenu) (l.field_a[dg.field_c])).beginExit(105);
          }
        }
        ValidationIndicator.field_L = param1;
        LoginForm.field_G = 1;
    }

    final static tk a(int param0, int param1, int param2, String param3, int param4) {
        String var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        NamedSoundEffect var7 = null;
        NamedSoundEffect var8 = null;
        tk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3 + "_accelerate+loop";
          if (param0 >= -104) {
            field_i = (java.awt.Image) null;
          }
          var6 = param3 + "_decelerate";
          var7 = new NamedSoundEffect(var5, param2);
          var8 = new NamedSoundEffect(var6, param4);
          var7.field_m = NetworkGameClient.sampleFramesForMillis(var7, param1, 89);
          var7.field_l = var7.field_n.length;
          stackIn_3_0 = new tk(var7, var8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        TutorialAction.a(param4, param0, param3, (byte) 41, param1);
        if (param2 != -51) {
          ResourceArchive var7 = (ResourceArchive) null;
          i.a(true, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_m = null;
        if (param0 != -3) {
          i.a((byte) -104, true);
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_l = null;
    }

    i() {
    }

    static {
        field_j = fc.a(-45, 5, 36);
        field_l = new int[]{4, 4, 4};
    }
}
