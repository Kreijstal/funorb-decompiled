/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleEvaluationException extends Exception {
    static String field_a;
    static IndexedSprite[] field_d;
    static String field_f;
    static UiLayoutNode field_e;
    String field_c;
    static String field_b;

    public static void releaseStatics(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
        field_f = (String) null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + ColorQuantizationBox.field_a) / 2;
        int var3 = TextPromptDialog.field_Bb * TextPromptDialog.field_Bb;
        int var4 = -(param1 * param1) + var3;
        TrinketIcon.field_Cb.setBounds(true, 199, var2 - var4 * 199 / var3, 90, -210 + (SoftwareRasterizer.field_f - 4));
        AuctionItem.field_p.setBounds(true, 438, var4 * 438 / var3 + (202 + var2), 0, -124 + SoftwareRasterizer.field_f);
        int var5 = 66 % ((73 - param0) / 52);
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (param1 == 0) {
          if (WeightedLruCache.field_d <= 0) {
            if (!PlayArea.a(100)) {
              var2 = 1;
            } else {
              var2 = 0;
            }
          } else {
            if (ArchiveIndex.field_h == null) {
              SplashScreen.field_m = ModelMaterial.createFullscreenCanvas(oo.field_c, param1 + 0, 480, 0, 640, 0);
              if (null == SplashScreen.field_m) {
                var2 = 3;
              } else {
                var2 = 2;
                CanvasInputBindings.attachInputHandlers(SplashScreen.field_m, (byte) -64);
              }
              if (ArchiveIndex.field_h == null &&
                MeshObject.field_e) {
                TrinketCountSortCriterion.a(param0, param1 + 6, var2);
              }
              return;
            }
            SplashScreen.field_m = ArchiveIndex.field_h.enterFullscreen(30182);
            BrowserUiSupport.notifyBrowserResize(500, 2);
            if (null != SplashScreen.field_m) {
              var2 = 2;
              CanvasInputBindings.attachInputHandlers(SplashScreen.field_m, (byte) -64);
              if (ArchiveIndex.field_h == null &&
                MeshObject.field_e) {
                TrinketCountSortCriterion.a(param0, param1 + 6, var2);
              }
              return;
            }
            var2 = 3;
          }
        } else {
          ConsoleEvaluationException.releaseStatics(-109);
          if (WeightedLruCache.field_d <= 0) {
            if (!PlayArea.a(100)) {
              var2 = 1;
              if (ArchiveIndex.field_h == null &&
                MeshObject.field_e) {
                TrinketCountSortCriterion.a(param0, param1 + 6, var2);
                return;
              }
              return;
            }
            var2 = 0;
            if (ArchiveIndex.field_h == null &&
              MeshObject.field_e) {
              TrinketCountSortCriterion.a(param0, param1 + 6, var2);
              return;
            }
            return;
          }
          if (ArchiveIndex.field_h == null) {
            SplashScreen.field_m = ModelMaterial.createFullscreenCanvas(oo.field_c, param1 + 0, 480, 0, 640, 0);
          } else {
            SplashScreen.field_m = ArchiveIndex.field_h.enterFullscreen(30182);
            BrowserUiSupport.notifyBrowserResize(500, 2);
          }
          if (null == SplashScreen.field_m) {
            var2 = 3;
          } else {
            var2 = 2;
            CanvasInputBindings.attachInputHandlers(SplashScreen.field_m, (byte) -64);
          }
        }
        if (ArchiveIndex.field_h != null) {
          return;
        }
        if (!MeshObject.field_e) {
          return;
        }
        TrinketCountSortCriterion.a(param0, param1 + 6, var2);
    }

    ConsoleEvaluationException(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "dw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Menu";
        field_f = "Create a free Account";
        field_b = "posession";
    }
}
