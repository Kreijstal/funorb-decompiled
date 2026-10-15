/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelPack {
    static RgbSprite field_e;
    int levelCount;
    byte[][] levelData;
    static int field_g;
    LevelMetadata[] metadata;
    static int textChoiceLeft;
    static String field_f;
    int completionWord;
    int packId;
    int scoreOffset;
    static int[] field_a;

    final void appendLevelData(LevelPack extra, boolean obfuscationGuard) {
        int var7 = 0;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var4Lifetime1;
        if (!(extra.packId < 0)) {
          throw new RuntimeException();
        }
        byte[][] var6 = new byte[this.levelCount + extra.levelCount][];
        byte[][] var3 = var6;
        if (obfuscationGuard) {
          return;
        }
        try {
          for (var4 = 0; var4 < this.levelCount; var4++) {
            var6[var4] = this.levelData[var4];
          }
          var7 = 0;
          var4Lifetime1 = var7;
          while (extra.levelCount > var7) {
            var3[var7 + this.levelCount] = extra.levelData[var7];
            var7++;
          }
          this.levelCount = this.levelCount + extra.levelCount;
          this.levelData = var3;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nc.D(" + (extra != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static void b(int param0) {
        if (null == GameplayRenderHelpers.fullscreenCanvas) {
          return;
        }
        CanvasInputCleanup.detachCanvasInput(false, GameplayRenderHelpers.fullscreenCanvas);
        GameplayRenderHelpers.fullscreenCanvas.a(AccountMessageDialog.field_ub, 121);
        GameplayRenderHelpers.fullscreenCanvas = null;
        if (param0 <= 49) {
          field_f = (String) null;
        }
        if (null != jj.canvasResizeController) {
          jj.canvasResizeController.restoreSavedCanvasSize(-33);
        }
        CacheIoRequest.windowCanvas.requestFocus();
    }

    final static UiComponent c(int param0) {
        int var1 = -61 / ((param0 + 36) / 63);
        return TimedSplashScreen.field_u.content;
    }

    LevelPack(int packId, int scoreOffset, int completionWord) {
        this.scoreOffset = scoreOffset;
        this.packId = packId;
        this.completionWord = completionWord;
    }

    final static boolean isFriend(int obfuscationGuard, String name) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            LevelPack.b(-40);
          }
          stackIn_5_0 = (RadialSelectorRenderer.findFriend(false, name) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("nc.B(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_g = 360;
        field_f = "<%0> has been removed.";
        field_a = new int[]{8, 23};
    }
}
