/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int offsetY;
    int fullWidth;
    int width;
    static IntrusiveDeque field_w;
    int height;
    int offsetX;
    static NameAvailabilityResult field_y;
    int fullHeight;
    static boolean field_u;
    static boolean field_r;
    static int[] field_t;

    abstract void drawRotatedScaled(int pivotXQ4, int pivotYQ4, int destinationXQ4, int destinationYQ4, int angle65536, int scaleQ12);

    final static void b(int param0, int param1) {
        LoginMethod.field_a = cb.field_b[param0];
        if (param1 == 15) {
          AlphaContainer.field_H = SpriteStrip.field_i[param0];
          gj.field_g = jj.field_c[param0];
          return;
        }
        field_y = (NameAvailabilityResult) null;
        AlphaContainer.field_H = SpriteStrip.field_i[param0];
        gj.field_g = jj.field_c[param0];
    }

    final static void pollMouseState(int guard) {
        Throwable decompiledCaughtException = null;
        Object var1 = QuickChatDynamicCommand.mouseHandler;
        synchronized (var1) {
          AlphaContainer.mouseIdleTicks = AlphaContainer.mouseIdleTicks + 1;
          DialWidget.field_K = LoginCredentials.heldMouseButton;
          GzipDecoder.field_d = IterableDualLinkDeque.pendingMouseX;
          UiContainer.field_y = AchievementGrantRule.pendingMouseY;
          TextFieldValidator.field_h = ke.mouseInputChanged;
          ke.mouseInputChanged = false;
          AccountMessagePanel.field_N = SocketConnector.pendingClickButton;
          sf.field_c = LoginCredentialType.pendingClickX;
          LoginDialog.field_ob = PcmResampler.pendingClickY;
          if (guard != -3657) {
            SpriteState.b(30, 39);
          }
          SocketConnector.pendingClickButton = 0;
        }
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        if (guard != -363232252) {
          field_y = (NameAvailabilityResult) null;
          field_y = null;
          field_w = null;
          return;
        }
        field_y = null;
        field_w = null;
    }

    final static void a(int param0, boolean param1) {
        e.field_a = true;
        da.field_b = new ta();
        int var2 = -121 / ((param0 + 63) / 34);
        int var3 = da.field_b.d((byte) -73);
        di.field_d = new wc(var3);
        int var4 = da.field_b.c(5201);
        int var5 = da.field_b.a(-3, GzipDecoder.field_d, UiContainer.field_y);
        di.field_d.a(95, param1, var5, var4);
    }

    final void drawCenteredRotatedScaled(int centerX, byte guard, int scaleQ12, int angle65536, int centerY) {
        if (guard == 34) {
          int var6 = this.fullWidth << 3;
          int var7 = this.fullHeight << 3;
          centerX = (centerX << 4) + (15 & var6);
          centerY = (centerY << 4) + (15 & var7);
          this.drawRotatedScaled(var6, var7, centerX, centerY, angle65536, scaleQ12);
          return;
        }
        this.offsetY = 118;
        int var6Lifetime1 = this.fullWidth << 3;
        int var7Lifetime1 = this.fullHeight << 3;
        centerX = (centerX << 4) + (15 & var6Lifetime1);
        centerY = (centerY << 4) + (15 & var7Lifetime1);
        this.drawRotatedScaled(var6Lifetime1, var7Lifetime1, centerX, centerY, angle65536, scaleQ12);
    }

    SpriteState() {
    }

    static {
        field_w = new IntrusiveDeque();
        field_t = new int[8192];
        field_u = true;
    }
}
