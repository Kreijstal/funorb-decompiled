/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NewAchievementsScreen extends AchievementBrowserScreen {
    static String field_F;
    static int field_H;
    static int[] viewFacePointThreeY;
    static int textChoiceCenterX;
    static boolean discardGameplayOnTransition;

    NewAchievementsScreen() {
        super(9, Widget.field_y);
        this.achievementMask = pl.pendingAchievementMask;
    }

    final static void f(int param0) {
        if (param0 != 967) {
          discardGameplayOnTransition = false;
          NinjaBackground.e((byte) -95);
          CheckboxWidgetRenderer.a(4, true);
          return;
        }
        NinjaBackground.e((byte) -95);
        CheckboxWidgetRenderer.a(4, true);
    }

    final boolean isAchievementExcluded(int achievementId, byte obfuscationGuard) {
        if (obfuscationGuard == 38) {
          return uo.isBitClear(achievementId, (byte) 47, this.achievementMask);
        }
        NewAchievementsScreen.a(-57, true, false, -49);
        return uo.isBitClear(achievementId, (byte) 47, this.achievementMask);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = IntrusiveHashTable.field_l + ContextActionController.field_g.measureText(ContextActionController.field_f);
        KeyboardInput.a(1, MultiValueSliderWidget.field_K, var4, 6, LevelSelectScreen.field_w, !param2 ? 196 : 256, -5 - LevelSelectScreen.field_w + param0);
        Rasterizer2D.saveClip(LevelPackSelectScreen.field_v);
        Rasterizer2D.intersectClip(MultiValueSliderWidget.field_K[0].width - 1, DualLinkDeque.field_d.screenY + (-LevelSelectScreen.field_w - MultiValueSliderWidget.field_K[0].height), 1 - (-var4 + MultiValueSliderWidget.field_K[0].width), -MultiValueSliderWidget.field_K[0].height + DualLinkDeque.field_d.screenY);
        ContextActionController.field_g.drawLeftAlpha(ContextActionController.field_f, MultiValueSliderWidget.field_K[0].width + 1, -5 - MultiValueSliderWidget.field_K[6].height + (DualLinkDeque.field_d.screenY + 2), !param1 ? 1 : 0, -1, !param2 ? 196 : 256);
        if (param3 > -105) {
          viewFacePointThreeY = (int[]) null;
        } else {
          Rasterizer2D.restoreClip(LevelPackSelectScreen.field_v);
          return;
        }
        Rasterizer2D.restoreClip(LevelPackSelectScreen.field_v);
    }

    public static void g(int param0) {
        viewFacePointThreeY = null;
        if (param0 != 6) {
          NewAchievementsScreen.g(49);
          field_F = null;
          return;
        }
        field_F = null;
    }

    static {
        field_F = "Find opponent";
        viewFacePointThreeY = new int[8192];
    }
}
