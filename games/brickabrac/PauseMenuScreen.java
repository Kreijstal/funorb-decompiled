/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PauseMenuScreen extends FramedMenuScreen {
    private int[] refreshedActionIds;
    static String field_u;
    static int field_x;
    static String field_w;
    static String field_v;

    public static void h(byte param0) {
        field_w = null;
        field_u = null;
        if (param0 != -34) {
          return;
        }
        field_v = null;
    }

    final void refreshMenu(int obfuscationGuard) {
        this.initializeButtons(this.refreshedActionIds, 0);
        if (obfuscationGuard > -60) {
          field_u = (String) null;
        }
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        int var3 = (this.buttonSpacing * 2 * this.selection.itemCount + this.buttonSpacing) / 2;
        int var4 = (480 - var3) / 2;
        if (buttonIndex != this.selection.itemCount - obfuscationGuard) {
          return var4 + buttonIndex * this.buttonSpacing;
        }
        return -this.buttonSpacing + (var3 + var4);
    }

    final int getParentScreenId(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_v = (String) null;
          return -1;
        }
        return -1;
    }

    PauseMenuScreen(int screenId, int[] initialActionIds, int[] refreshedActionIds) {
        super(screenId, 180, 460, 150, 35, initialActionIds);
        try {
          this.refreshedActionIds = refreshedActionIds;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oq.<init>(" + screenId + ',' + (initialActionIds != null ? "{...}" : "null") + ',' + (refreshedActionIds != null ? "{...}" : "null") + ')');
        }
    }

    void drawScreen(byte obfuscationGuard) {
        IntArrayRequest.gameplayScreen.drawScreen((byte) -116);
        Rasterizer2D.darkenRectangle(0, 0, 640, 480);
        this.drawMenuFrame(102);
        DelayedPacket.d(0);
        if (obfuscationGuard <= -14) {
          this.a(0);
          return;
        }
        field_v = (String) null;
        this.a(0);
    }

    static {
        field_u = "Next";
        field_w = "You are not currently logged in to the game.";
        field_v = "Accelerate: paddle increases the ball's velocity.";
    }
}
