/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends CacheEntry {
    private Object value;
    static MeshAudioHelpers field_P;
    static String field_M;
    static NodeDeque pendingAchievementMaskRequests;
    static AccountMessageDialog field_I;
    static int[] field_E;
    static double packetDelayJitter;
    static String field_K;
    static int field_O;
    static RgbSprite[][] halloweenCapsSprites;
    static String field_H;

    final static void a(int param0, RgbSprite param1, int param2, int param3, int param4, RasterCacheSurface param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-53, param5.sprite);
          Rasterizer2D.fillVerticalGradient(param0, 0, param5.width, param5.height, ReflectionCheck.parisBackgroundColors[param4], 928072);
          param1.b(-(30 / param2) + (param5.width - param1.canvasWidth) / 2, -(66 / param2) + (-param1.canvasHeight + param3 + param5.height), 0, 208);
          sc.popRaster(-101);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ej.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isSoft(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return true;
        }
        return false;
    }

    public static void h(int param0) {
        field_I = null;
        field_M = null;
        halloweenCapsSprites = (RgbSprite[][]) null;
        field_P = null;
        pendingAchievementMaskRequests = null;
        if (param0 == 928072) {
          field_K = null;
          field_H = null;
          field_E = null;
          return;
        }
    }

    StrongCacheEntry(Object value, int weight) {
        super(weight);
        try {
          this.value = value;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ej.<init>(" + (value != null ? "{...}" : "null") + ',' + weight + ')');
        }
    }

    final Object getValue(int obfuscationGuard) {
        if (obfuscationGuard == 1) {
          return this.value;
        }
        RasterCacheSurface var3 = (RasterCacheSurface) null;
        StrongCacheEntry.a(-50, (RgbSprite) null, -35, 2, 119, (RasterCacheSurface) null);
        return this.value;
    }

    static {
        field_P = new MeshAudioHelpers();
        field_E = new int[29];
        field_M = "Day";
        field_E[7] = 3;
        field_E[8] = 6;
        field_E[18] = 1;
        field_E[17] = 3;
        field_E[15] = 5;
        field_E[5] = 4;
        field_E[12] = 7;
        field_E[4] = 5;
        field_E[10] = 2;
        packetDelayJitter = 0.0;
        pendingAchievementMaskRequests = new NodeDeque();
        field_K = "Only show game chat from my friends";
        field_O = 480;
        field_H = "Resign";
    }
}
