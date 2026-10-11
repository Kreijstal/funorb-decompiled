/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    public final void exit() {
        if (this.field_a != null) {
          this.field_b.setDisplayMode(this.field_a);
          if (!this.field_b.getDisplayMode().equals(this.field_a)) {
            throw new RuntimeException("");
          }
          this.field_a = null;
        }
        this.a(true, (java.awt.Frame) null);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.field_b.getDisplayModes();
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

    private final void a(boolean param0, java.awt.Frame param1) {
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
            var4.setAccessible(param0);
            if (((Boolean) (var4.get(this.field_b))).booleanValue()) {
              var3 = 1;
              var4.set(this.field_b, Boolean.FALSE);
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = decompiledCaughtException;
          }
          try {
            this.field_b.setFullScreenWindow((java.awt.Window) ((Object) param1));
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
                var4.set(this.field_b, Boolean.TRUE);
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
              var7.set(this.field_b, Boolean.TRUE);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var7_ref = decompiledCaughtException;
            }
          }
          throw cu.<RuntimeException>$cfr$sneakyThrow(var6);
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
        this.field_a = this.field_b.getDisplayMode();
        if (null == this.field_a) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.a(true, param0);
        if (param4 == 0) {
          var6 = this.field_a.getRefreshRate();
          var7 = this.field_b.getDisplayModes();
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
        this.field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    public cu() throws Exception {
        int var4 = 0;
        java.awt.GraphicsEnvironment var1;
        java.awt.GraphicsDevice[] var2;
        java.awt.GraphicsDevice[] var3;
        java.awt.GraphicsDevice var5;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field_b = var1.getDefaultScreenDevice();
        if (this.field_b.isFullScreenSupported()) {
          return;
        }
        var2 = var1.getScreenDevices();
        var3 = var2;
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.field_b = var5;
            return;
          }
        }
        throw cu.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
