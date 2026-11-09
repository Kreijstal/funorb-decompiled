/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtFullscreenController {
    private java.awt.GraphicsDevice device;
    private java.awt.DisplayMode previousMode;

    public final void exit() {
        if (this.previousMode != null) {
          this.device.setDisplayMode(this.previousMode);
          if (!this.device.getDisplayMode().equals(this.previousMode)) {
            throw new RuntimeException("");
          }
          this.previousMode = null;
        }
        this.setFullscreenWindow(true, (java.awt.Frame) null);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.device.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var4.length > var3; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[(var3 << 2) + 1] = var4[var3].getHeight();
          var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
          var2[(var3 << 2) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    private final void setFullscreenWindow(boolean accessible, java.awt.Frame frame) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var3 = 0;
          java.lang.reflect.Field var4 = null;
          Throwable var4_ref = null;
          Throwable var6 = null;
          java.lang.reflect.Field var7 = null;
          Throwable var7_ref = null;
          var3 = 0;
          try {
            var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(accessible);
            if (((Boolean) (var4.get(this.device))).booleanValue()) {
              var3 = 1;
              var4.set(this.device, Boolean.FALSE);
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = decompiledCaughtException;
          }
          try {
            this.device.setFullScreenWindow((java.awt.Window) ((Object) frame));
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6 = decompiledCaughtException;
            if (var3 != 0) {
              decompiledRegionSelector0 = 1;
            } else {
              decompiledRegionSelector0 = 2;
            }
          }
          if (decompiledRegionSelector0 == 0) {
            if (var3 != 0) {
              try {
                var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                var4.set(this.device, Boolean.TRUE);
              } catch (java.lang.Throwable decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var4_ref = decompiledCaughtException;
              }
            }
            return;
          }
          if (decompiledRegionSelector0 == 1) {
            try {
              var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
              var7.set(this.device, Boolean.TRUE);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var7_ref = decompiledCaughtException;
            }
          }
          throw AwtFullscreenController.<RuntimeException>rethrowUnchecked(var6);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var6;
        java.awt.DisplayMode[] var7;
        int var8;
        int var10;
        this.previousMode = this.device.getDisplayMode();
        if (null == this.previousMode) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.setFullscreenWindow(true, param0);
        if (param4 == 0) {
          var6 = this.previousMode.getRefreshRate();
          var7 = this.device.getDisplayModes();
          var8 = 0;
          for (var9 = 0; var9 < var7.length; var9++) {
            if (var7[var9].getWidth() == param1 &&
              var7[var9].getHeight() == param2 &&
              var7[var9].getBitDepth() == param3) {
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
        this.device.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    public AwtFullscreenController() throws Exception {
        int var4 = 0;
        java.awt.GraphicsEnvironment var1;
        java.awt.GraphicsDevice[] var2;
        java.awt.GraphicsDevice[] var3;
        java.awt.GraphicsDevice var5;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.device = var1.getDefaultScreenDevice();
        if (this.device.isFullScreenSupported()) {
          return;
        }
        var2 = var1.getScreenDevices();
        var3 = var2;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.device = var5;
            return;
          }
        }
        throw AwtFullscreenController.<RuntimeException>rethrowUnchecked(new Exception());
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
