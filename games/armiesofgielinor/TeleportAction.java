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
    static int field_z;
    private int targetDeltaX;

    final static co[] e(int param0) {
        co[] var4 = new co[5];
        co[] var1 = var4;
        co var3 = new co();
        var3.field_v = "foliage_green";
        var3.field_a = "terrain_plains";
        var3.field_q = "structures_green";
        var3.field_d = 0;
        var3.field_l = "principality";
        var3.field_i = new int[]{4495633, 8943462, 5592422, 30464, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var3.field_x = "plains_openground.jpg";
        var3.field_o = new String[]{"runewars_atmospheric_countryside_river", "runewars_atmospheric_countryside_bird", "runewars_atmospheric_countryside_breeze"};
        var3.field_e = var3.field_v + "_shadows";
        var3.field_c = var3.field_q + "_shadows";
        BestScoreStrategy.a(var3, var4, param0 + 4287);
        co var5 = new co();
        var5.field_d = 1;
        var5.field_a = "terrain_desert";
        var5.field_q = "structures_desert";
        var5.field_v = "foliage_desert";
        var5.field_x = "desert_openground.jpg";
        var5.field_c = var5.field_q + "_shadows";
        var5.field_e = var5.field_v + "_shadows";
        var5.field_o = new String[]{"runewars_atmospheric_desert_wind", "runewars_atmospheric_desert_vulture", "runewars_atmospheric_desert_vulture_2"};
        var5.field_l = "Tzhaar";
        if (param0 != -10128) {
          return (co[]) null;
        }
        var5.field_i = new int[]{13408580, 8943462, 7820612, 5609779, 7829503, 5596740, 5592541, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        BestScoreStrategy.a(var5, var4, -5841);
        co var6 = new co();
        var6.field_d = 2;
        var6.field_a = "terrain_ice";
        var6.field_v = "foliage_ice";
        var6.field_q = "structures_ice";
        var6.field_x = "winter_openground.jpg";
        var6.field_e = var6.field_v + "_shadows";
        var6.field_o = new String[]{"runewars_atmospheric_ice_wind", "runewars_atmospheric_ice_wind_2", "runewars_atmospheric_ice_wind_3"};
        var6.field_i = new int[]{14540287, 7833753, 5592422, 4495735, 7829503, 4482645, 5592541, 6710886, 6710886, 6710886, 7833753, 6710886, 11184810, 11184810, 6710886, 11184810};
        var6.field_l = "poles apart";
        var6.field_c = var6.field_q + "_shadows";
        BestScoreStrategy.a(var6, var4, param0 ^ 12639);
        co var7 = new co();
        var7.field_a = "terrain_swamp";
        var7.field_v = "foliage_swamp";
        var7.field_x = "swamp_openground.jpg";
        var7.field_q = "structures_swamp";
        var7.field_d = 3;
        var7.field_i = new int[]{4741426, 4340530, 6381908, 5602610, 2703412, 3702888, 1844000, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var7.field_l = "dead quiet";
        var7.field_c = var7.field_q + "_shadows";
        var7.field_e = var7.field_v + "_shadows";
        var7.field_o = new String[]{"runewars_atmospheric_swamp_wind1", "runewars_atmospheric_swamp_wind2", "runewars_atmospheric_swamp_creature2", "runewars_atmospheric_swamp_creature3"};
        BestScoreStrategy.a(var7, var4, -5841);
        co var8 = new co();
        var8.field_v = "foliage_burnt";
        var8.field_q = "structures_burnt";
        var8.field_a = "terrain_burnt";
        var8.field_x = "burnt_openground.jpg";
        var8.field_d = 4;
        var8.field_c = var8.field_q + "_shadows";
        var8.field_l = "dead quiet";
        var8.field_i = new int[]{4541241, 6965824, 2693658, 3026214, 4864561, 3422244, 15432192, 6710886, 6710886, 6710886, 8943462, 6710886, 11184810, 11184810, 6710886, 11184810};
        var8.field_o = new String[]{"runewars_atmospheric_burnt_wind1", "runewars_atmospheric_burnt_wind2", "runewars_atmospheric_burnt_lava_rumble_1", "runewars_atmospheric_burnt_lava_rumble_2"};
        var8.field_e = var8.field_v + "_shadows";
        BestScoreStrategy.a(var8, var4, -5841);
        return var1;
    }

    final void applyToBattlefield(int obfuscationGuard, Battlefield battlefield) {
        try {
          battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TeleportEvent(this.unit.tileX, this.unit.tileY, this.targetDeltaX, this.targetDeltaY, this.skipDestinationPlacement)));
          if (obfuscationGuard != 64) {
            field_z = 2;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ur.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
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
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ur.<init>(" + suppliedSourceX + ',' + suppliedSourceY + ',' + targetDeltaX + ',' + targetDeltaY + ',' + actingPlayer + ',' + (unit != null ? "{...}" : "null") + ',' + skipDestinationPlacement + ')');
        }
    }

    static {
        field_x = "Tips";
        field_u = "Connecting to<br>friend server...";
        field_v = new tv();
        field_z = 0;
    }
}
