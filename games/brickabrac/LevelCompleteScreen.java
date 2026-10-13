/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelCompleteScreen extends PauseMenuScreen {
    static int field_H;
    static int field_A;
    static int[] field_D;
    static RgbSprite field_F;
    static String field_z;
    static String[] field_E;
    static String[] field_B;
    static String field_J;
    static boolean field_C;
    static RgbSprite field_I;
    static int[] field_G;

    public static void h(int param0) {
        if (param0 != -257) {
          LevelCompleteScreen.h(-94);
        }
        field_D = null;
        field_F = null;
        field_G = null;
        field_J = null;
        field_B = null;
        field_z = null;
        field_I = null;
        field_E = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 1273378209) {
          field_E = (String[]) null;
        }
        int var3 = 4 + JungleBackground.field_r.nextBoundedInt(-37880252, -4 + param0);
        int var4 = JungleBackground.field_r.nextBoundedInt(-37880252, -8 + param2) + 8;
        ob.field_E.addLast(new nj(var3, var4, PauseMenuScreen.field_x + JungleBackground.field_r.nextBoundedInt(-37880252, FarmBackground.field_w), fr.field_k + JungleBackground.field_r.nextBoundedInt(-37880252, ag.field_E)), (byte) 3);
        dl.field_f = dl.field_f + 1;
    }

    final void drawScreen(byte obfuscationGuard) {
        IntArrayRequest.gameplayScreen.drawScreen((byte) -19);
        if (obfuscationGuard > -14) {
          field_J = (String) null;
        }
        Rasterizer2D.darkenRectangle(0, 0, 640, 480);
        this.drawMenuFrame(124);
        DelayedPacket.d(0);
        this.a(0);
    }

    LevelCompleteScreen() {
        super(18, gb.field_i, gb.field_i);
    }

    final void navigateBack(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          this.drawScreen((byte) 35);
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_D = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_D[var1] = var0;
        }
        field_E = new String[]{"By rating", "By win percentage"};
        field_z = "Please send me news and updates (I can unsubscribe at any time)";
        field_J = null;
        field_B = new String[255];
        field_G = new int[8192];
    }
}
