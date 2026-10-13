/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NewAchievementsScreen extends AchievementBrowserScreen {
    static String field_F;
    static int field_H;
    static int[] field_I;
    static int field_J;
    static boolean field_G;

    NewAchievementsScreen() {
        super(9, oc.field_y);
        this.achievementMask = pl.pendingAchievementMask;
    }

    final static void f(int param0) {
        if (param0 != 967) {
          field_G = false;
          qa.e((byte) -95);
          bd.a(4, true);
          return;
        }
        qa.e((byte) -95);
        bd.a(4, true);
    }

    final boolean isAchievementExcluded(int achievementId, byte obfuscationGuard) {
        if (obfuscationGuard == 38) {
          return uo.isBitClear(achievementId, (byte) 47, this.achievementMask);
        }
        NewAchievementsScreen.a(-57, true, false, -49);
        return uo.isBitClear(achievementId, (byte) 47, this.achievementMask);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = si.field_l + nn.field_g.c(nn.field_f);
        KeyboardInput.a(1, qi.field_K, var4, 6, LevelSelectScreen.field_w, !param2 ? 196 : 256, -5 - LevelSelectScreen.field_w + param0);
        Rasterizer2D.saveClip(LevelPackSelectScreen.field_v);
        Rasterizer2D.intersectClip(qi.field_K[0].width - 1, DualLinkDeque.field_d.field_db + (-LevelSelectScreen.field_w - qi.field_K[0].height), 1 - (-var4 + qi.field_K[0].width), -qi.field_K[0].height + DualLinkDeque.field_d.field_db);
        nn.field_g.c(nn.field_f, qi.field_K[0].width + 1, -5 - qi.field_K[6].height + (DualLinkDeque.field_d.field_db + 2), !param1 ? 1 : 0, -1, !param2 ? 196 : 256);
        if (param3 > -105) {
          field_I = (int[]) null;
        } else {
          Rasterizer2D.restoreClip(LevelPackSelectScreen.field_v);
          return;
        }
        Rasterizer2D.restoreClip(LevelPackSelectScreen.field_v);
    }

    public static void g(int param0) {
        field_I = null;
        if (param0 != 6) {
          NewAchievementsScreen.g(49);
          field_F = null;
          return;
        }
        field_F = null;
    }

    static {
        field_F = "Find opponent";
        field_I = new int[8192];
    }
}
