/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[(var3 << 2) + 1] = var4[var3].getHeight();
          var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
          var2[(var3 << 2) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var6;
        java.awt.DisplayMode[] var7;
        int var8;
        int var10;
        this.field_b = this.field_a.getDisplayMode();
        if (null == this.field_b) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.a(83, param0);
        if (0 == param4) {
          var6 = this.field_b.getRefreshRate();
          var7 = this.field_a.getDisplayModes();
          var8 = 0;
          for (var9 = 0; var9 < var7.length; var9++) {
            if (var7[var9].getWidth() == param1 &&
              param2 == var7[var9].getHeight() &&
              param3 == var7[var9].getBitDepth()) {
              var10 = var7[var9].getRefreshRate();
              if (var8 == 0 ||
                !(Math.abs(var10 - var6) >= Math.abs(param4 - var6))) {
                param4 = var10;
                var8 = 1;
              }
            }
          }
          if (var8 == 0) {
            param4 = var6;
          }
        }
        this.field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    public final void exit() {
        if (this.field_b != null) {
          this.field_a.setDisplayMode(this.field_b);
          if (!this.field_a.getDisplayMode().equals(this.field_b)) {
            throw new RuntimeException("");
          }
          this.field_b = null;
        }
        this.a(-127, (java.awt.Frame) null);
    }

    private final void a(int param0, java.awt.Frame param1) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var3 = 0;
          int var4 = 0;
          java.lang.reflect.Field var5 = null;
          Throwable var5_ref = null;
          Throwable var7 = null;
          java.lang.reflect.Field var8 = null;
          Throwable var8_ref = null;
          var3 = -105 % ((param0 + 73) / 53);
          var4 = 0;
          try {
            var5 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var5.setAccessible(true);
            if (((Boolean) (var5.get(this.field_a))).booleanValue()) {
              var5.set(this.field_a, Boolean.FALSE);
              var4 = 1;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5_ref = decompiledCaughtException;
          }
          try {
            this.field_a.setFullScreenWindow((java.awt.Window) ((Object) param1));
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7 = decompiledCaughtException;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 != 0) {
            try {
              var8 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
              var8.set(this.field_a, Boolean.TRUE);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var8_ref = decompiledCaughtException;
            }
            throw rk.<RuntimeException>$cfr$sneakyThrow(var7);
          }
          if (var4 != 0) {
            try {
              var5 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
              var5.set(this.field_a, Boolean.TRUE);
            } catch (java.lang.Throwable decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var5_ref = decompiledCaughtException;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public rk() throws Exception {
        int var4 = 0;
        java.awt.GraphicsEnvironment var1;
        java.awt.GraphicsDevice[] var2;
        java.awt.GraphicsDevice[] var3;
        java.awt.GraphicsDevice var5;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field_a = var1.getDefaultScreenDevice();
        if (this.field_a.isFullScreenSupported()) {
          return;
        }
        var2 = var1.getScreenDevices();
        var3 = var2;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.field_a = var5;
            return;
          }
        }
        throw rk.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
