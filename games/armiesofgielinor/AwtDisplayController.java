/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtDisplayController {
    private java.awt.DisplayMode previousDisplayMode;
    private java.awt.GraphicsDevice graphicsDevice;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.graphicsDevice.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var4.length > var3; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[1 + (var3 << 2)] = var4[var3].getHeight();
          var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
          var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var6;
        java.awt.DisplayMode[] var7;
        int var8;
        int var10;
        this.previousDisplayMode = this.graphicsDevice.getDisplayMode();
        if (this.previousDisplayMode == null) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.setFullScreenWindow(-48, param0);
        if (param4 == 0) {
          var6 = this.previousDisplayMode.getRefreshRate();
          var7 = this.graphicsDevice.getDisplayModes();
          var8 = 0;
          for (var9 = 0; var7.length > var9; var9++) {
            if (var7[var9].getWidth() == param1 &&
              var7[var9].getHeight() == param2 &&
              param3 == var7[var9].getBitDepth()) {
              var10 = var7[var9].getRefreshRate();
              if (var8 == 0 ||
                !(Math.abs(var10 - var6) >= Math.abs(-var6 + param4))) {
                param4 = var10;
                var8 = 1;
              }
            }
          }
          if (var8 == 0) {
            param4 = var6;
          }
        }
        this.graphicsDevice.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    private final void setFullScreenWindow(int obfuscationGuard, java.awt.Frame frame) {
        java.awt.Frame var4;
        if (obfuscationGuard > -43) {
          var4 = (java.awt.Frame) null;
          this.setFullScreenWindow(95, (java.awt.Frame) null);
        }
        this.graphicsDevice.setFullScreenWindow((java.awt.Window) ((Object) frame));
    }

    public AwtDisplayController() throws Exception {
        int var4 = 0;
        java.awt.GraphicsEnvironment var1;
        java.awt.GraphicsDevice[] var2;
        java.awt.GraphicsDevice[] var3;
        java.awt.GraphicsDevice var5;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.graphicsDevice = var1.getDefaultScreenDevice();
        if (this.graphicsDevice.isFullScreenSupported()) {
          return;
        }
        var2 = var1.getScreenDevices();
        var3 = var2;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.graphicsDevice = var5;
            return;
          }
        }
        throw AwtDisplayController.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    public final void exit() {
        if (this.previousDisplayMode != null) {
          this.graphicsDevice.setDisplayMode(this.previousDisplayMode);
          if (!this.graphicsDevice.getDisplayMode().equals(this.previousDisplayMode)) {
            throw new RuntimeException("");
          }
          this.previousDisplayMode = null;
        }
        this.setFullScreenWindow(-96, (java.awt.Frame) null);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
