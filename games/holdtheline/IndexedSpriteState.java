/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_d;
    static String field_f;
    int field_k;
    static QuickChatDynamicCommand field_h;
    int field_i;
    static float[] field_g;
    int field_l;
    int field_c;
    int field_e;
    static String field_b;
    static int field_j;
    static int[] field_a;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    public static void clearSharedReferences(boolean param0) {
        field_f = null;
        field_b = null;
        if (!param0) {
          IndexedSpriteState.a(-114);
        }
        field_g = null;
        field_a = null;
        field_h = null;
    }

    final static Sprite a(int param0, byte param1, int param2) {
        int var3;
        Sprite var4;
        int var5;
        int var6;
        int var3Lifetime1;
        var5 = HoldTheLine.field_D;
        if (null == LoadProgressDialog.field_X) {
          if (!fb.field_i.tryLoadNamedGroup("world_images", -128)) {
            return hi.a(111, (byte) -112, 84);
          }
          LoadProgressDialog.field_X = StandardContentTransitionDialog.a(fb.field_i, 33, "world_images", "");
          TutorialTransition.a(32381);
          DelegatingCanvas.field_c = new Sprite[4];
          for (var3 = 0; var3 < 4; var3++) {
            DelegatingCanvas.field_c[var3] = LoadProgressDialog.field_X[var3].copy();
            Point2i.scaleSpriteIntensity(DelegatingCanvas.field_c[var3], 64, -1);
            DelegatingCanvas.field_c[var3].bindRaster();
            FullscreenErrorDialog.field_ab.draw(-FullscreenErrorDialog.field_ab.width + DelegatingCanvas.field_c[var3].width >> 1, -FullscreenErrorDialog.field_ab.height + DelegatingCanvas.field_c[var3].height >> 1);
          }
          ih.field_t = new Sprite[4];
          var6 = 0;
          var3Lifetime1 = var6;
          while (var6 < 4) {
            ih.field_t[var6] = LoadProgressDialog.field_X[var6].copy();
            Point2i.scaleSpriteIntensity(ih.field_t[var6], 128, -1);
            var4 = ih.field_t[var6].copy();
            var4.bindRaster();
            SolidRoadStripRenderer.field_q.drawDownscaledBlended(17, 0, 84, 84);
            ih.field_t[var6].bindRaster();
            var4.drawAlpha(0, 0, 64);
            var6++;
          }
          MarkerSliderRenderer.restoreRasterTarget(-1);
        }
        if (param1 >= -31) {
          return (Sprite) null;
        }
        if (param0 == 1) {
          return DelegatingCanvas.field_c[param2];
        }
        if (param0 != 2) {
          return LoadProgressDialog.field_X[param2];
        }
        return ih.field_t[param2];
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HoldTheLine.field_D;
        try {
          var5 = qg.field_d;
          var1 = var5;
          var2 = 0;
          if (param0 < 76) {
            IndexedSpriteState.clearSharedReferences(false);
          }
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1_ref), "p.H(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        Sprite var3 = tn.field_b.field_i[SolidRoadStripRenderer.b(2, 6)];
        if (param0 != -61) {
          return;
        }
        var3.drawScaledAlpha(param1, param2, var3.canvasWidth >> 1, var3.canvasHeight >> 1, 64);
    }

    static {
        field_f = "<img=11>";
        field_g = new float[]{0.0f, 0.5f, 1.0f, 100.0f, 800.0f, 80.0f, 0.0f, 10.0f};
        field_h = new QuickChatDynamicCommand(8, 0, 4, 1);
        field_b = "Mouse over an icon for details";
        field_a = new int[128];
    }
}
