/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TeleportAction extends PreparedAction {
    private Unit unit;
    static RgbSprite[] field_w;
    static String field_x;
    private int targetDeltaY;
    static String field_u;
    static byte[] field_B;
    static tv field_v;
    private boolean skipDestinationPlacement;
    static String field_C;
    static int pointerPressY;
    private int targetDeltaX;

    final static BattlefieldTheme[] createThemeCatalog(int obfuscationGuard) {
        BattlefieldTheme[] var4 = new BattlefieldTheme[5];
        BattlefieldTheme[] var1 = var4;
        BattlefieldTheme var3 = new BattlefieldTheme();
        var3.foliageSpriteFile = "foliage_green";
        var3.terrainSpriteFile = "terrain_plains";
        var3.structureSpriteFile = "structures_green";
        var3.themeId = 0;
        var3.musicTrackName = "principality";
        var3.terrainPreviewColours = new int[]{4495633, 8943462, 5592422, 30464, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var3.backgroundImageFile = "plains_openground.jpg";
        var3.ambientSoundNames = new String[]{"runewars_atmospheric_countryside_river", "runewars_atmospheric_countryside_bird", "runewars_atmospheric_countryside_breeze"};
        var3.foliageShadowFile = var3.foliageSpriteFile + "_shadows";
        var3.structureShadowFile = var3.structureSpriteFile + "_shadows";
        BestScoreStrategy.registerTheme(var3, var4, obfuscationGuard + 4287);
        BattlefieldTheme var5 = new BattlefieldTheme();
        var5.themeId = 1;
        var5.terrainSpriteFile = "terrain_desert";
        var5.structureSpriteFile = "structures_desert";
        var5.foliageSpriteFile = "foliage_desert";
        var5.backgroundImageFile = "desert_openground.jpg";
        var5.structureShadowFile = var5.structureSpriteFile + "_shadows";
        var5.foliageShadowFile = var5.foliageSpriteFile + "_shadows";
        var5.ambientSoundNames = new String[]{"runewars_atmospheric_desert_wind", "runewars_atmospheric_desert_vulture", "runewars_atmospheric_desert_vulture_2"};
        var5.musicTrackName = "Tzhaar";
        if (obfuscationGuard != -10128) {
          return (BattlefieldTheme[]) null;
        }
        var5.terrainPreviewColours = new int[]{13408580, 8943462, 7820612, 5609779, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        BestScoreStrategy.registerTheme(var5, var4, -5841);
        BattlefieldTheme var6 = new BattlefieldTheme();
        var6.themeId = 2;
        var6.terrainSpriteFile = "terrain_ice";
        var6.foliageSpriteFile = "foliage_ice";
        var6.structureSpriteFile = "structures_ice";
        var6.backgroundImageFile = "winter_openground.jpg";
        var6.foliageShadowFile = var6.foliageSpriteFile + "_shadows";
        var6.ambientSoundNames = new String[]{"runewars_atmospheric_ice_wind", "runewars_atmospheric_ice_wind_2", "runewars_atmospheric_ice_wind_3"};
        var6.terrainPreviewColours = new int[]{14540287, 7833753, 5592422, 4495735, 7829503, 4482645, 5592541, 6710886, 6710886, 6710886, 7833753, 6710886, 11184810, 11184810, 6710886, 11184810};
        var6.musicTrackName = "poles apart";
        var6.structureShadowFile = var6.structureSpriteFile + "_shadows";
        BestScoreStrategy.registerTheme(var6, var4, obfuscationGuard ^ 12639);
        BattlefieldTheme var7 = new BattlefieldTheme();
        var7.terrainSpriteFile = "terrain_swamp";
        var7.foliageSpriteFile = "foliage_swamp";
        var7.backgroundImageFile = "swamp_openground.jpg";
        var7.structureSpriteFile = "structures_swamp";
        var7.themeId = 3;
        var7.terrainPreviewColours = new int[]{4741426, 4340530, 6381908, 5602610, 2703412, 3702888, 1844000, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var7.musicTrackName = "dead quiet";
        var7.structureShadowFile = var7.structureSpriteFile + "_shadows";
        var7.foliageShadowFile = var7.foliageSpriteFile + "_shadows";
        var7.ambientSoundNames = new String[]{"runewars_atmospheric_swamp_wind1", "runewars_atmospheric_swamp_wind2", "runewars_atmospheric_swamp_creature2", "runewars_atmospheric_swamp_creature3"};
        BestScoreStrategy.registerTheme(var7, var4, -5841);
        BattlefieldTheme var8 = new BattlefieldTheme();
        var8.foliageSpriteFile = "foliage_burnt";
        var8.structureSpriteFile = "structures_burnt";
        var8.terrainSpriteFile = "terrain_burnt";
        var8.backgroundImageFile = "burnt_openground.jpg";
        var8.themeId = 4;
        var8.structureShadowFile = var8.structureSpriteFile + "_shadows";
        var8.musicTrackName = "dead quiet";
        var8.terrainPreviewColours = new int[]{4541241, 6965824, 2693658, 3026214, 4864561, 3422244, 15432192, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var8.ambientSoundNames = new String[]{"runewars_atmospheric_burnt_wind1", "runewars_atmospheric_burnt_wind2", "runewars_atmospheric_burnt_lava_rumble_1", "runewars_atmospheric_burnt_lava_rumble_2"};
        var8.foliageShadowFile = var8.foliageSpriteFile + "_shadows";
        BestScoreStrategy.registerTheme(var8, var4, -5841);
        return var1;
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        try {
          battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TeleportEvent(this.unit.tileX, this.unit.tileY, this.targetDeltaX, this.targetDeltaY, this.skipDestinationPlacement)));
          if (obfuscationGuard != 64) {
            pointerPressY = 2;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ur.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_C = null;
        field_x = null;
        field_u = null;
        field_B = null;
        if (param0) {
          return;
        }
        field_v = null;
        field_w = null;
    }

    TeleportAction(int suppliedSourceX, int suppliedSourceY, int targetDeltaX, int targetDeltaY, int actingPlayer, Unit unit, boolean skipDestinationPlacement) {
        try {
          this.skipDestinationPlacement = skipDestinationPlacement ? true : false;
          this.targetDeltaY = targetDeltaY;
          this.unit = unit;
          this.actingPlayer = actingPlayer;
          this.targetDeltaX = targetDeltaX;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ur.<init>(" + suppliedSourceX + ',' + suppliedSourceY + ',' + targetDeltaX + ',' + targetDeltaY + ',' + actingPlayer + ',' + (unit != null ? "{...}" : "null") + ',' + skipDestinationPlacement + ')');
        }
    }

    static {
        field_x = "Tips";
        field_u = "Connecting to<br>friend server...";
        field_v = new tv();
        pointerPressY = 0;
    }
}
