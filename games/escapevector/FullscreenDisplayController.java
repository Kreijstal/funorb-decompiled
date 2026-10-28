/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenDisplayController {
    private java.awt.GraphicsDevice device;
    private java.awt.DisplayMode originalMode;

    private final void setFullscreenWindow(int guard, java.awt.Frame frame) {
        if (guard != 265181602) {
          return;
        }
        this.device.setFullScreenWindow((java.awt.Window) ((Object) frame));
    }

    public final int[] listmodes() {
        java.awt.DisplayMode[] var4 = this.device.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (int var3 = 0; var3 < var4.length; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[1 + (var3 << 2)] = var4[var3].getHeight();
          var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
          var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        this.originalMode = this.device.getDisplayMode();
        if (null == this.originalMode) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.setFullscreenWindow(265181602, param0);
        if (param4 == 0) {
          int var6 = this.originalMode.getRefreshRate();
          java.awt.DisplayMode[] var7 = this.device.getDisplayModes();
          boolean var8 = false;
          for (int var9 = 0; var7.length > var9; var9++) {
            if (var7[var9].getWidth() == param1 &&
              var7[var9].getHeight() == param2 &&
              var7[var9].getBitDepth() == param3) {
              int var10 = var7[var9].getRefreshRate();
              if (!var8 ||
                !(Math.abs(-var6 + var10) >= Math.abs(-var6 + param4))) {
                var8 = true;
                param4 = var10;
              }
            }
          }
          if (!var8) {
            param4 = var6;
          }
        }
        this.device.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    public final void exit() {
        if (null != this.originalMode) {
          this.device.setDisplayMode(this.originalMode);
          if (!this.device.getDisplayMode().equals(this.originalMode)) {
            throw new RuntimeException("");
          }
          this.originalMode = null;
        }
        this.setFullscreenWindow(265181602, (java.awt.Frame) null);
    }

    public FullscreenDisplayController() throws Exception {
        java.awt.GraphicsEnvironment var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.device = var1.getDefaultScreenDevice();
        if (this.device.isFullScreenSupported()) {
          return;
        }
        java.awt.GraphicsDevice[] var2 = var1.getScreenDevices();
        java.awt.GraphicsDevice[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
          java.awt.GraphicsDevice var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.device = var5;
            return;
          }
        }
        throw FullscreenDisplayController.<RuntimeException>rethrowUnchecked(new Exception());
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
