/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        this.field_b = this.field_a.getDisplayMode();
        if (null == this.field_b) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.a((byte) -105, param0);
        if (param4 == 0) {
          int var6 = this.field_b.getRefreshRate();
          java.awt.DisplayMode[] var7 = this.field_a.getDisplayModes();
          boolean var8 = false;
          for (int var9 = 0; var7.length > var9; var9++) {
            if (param1 == var7[var9].getWidth() &&
              param2 == var7[var9].getHeight() &&
              var7[var9].getBitDepth() == param3) {
              int var10 = var7[var9].getRefreshRate();
              if (!var8 ||
                !(Math.abs(-var6 + var10) >= Math.abs(param4 - var6))) {
                param4 = var10;
                var8 = true;
              }
            }
          }
          if (!var8) {
            param4 = var6;
          }
        }
        this.field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    public final int[] listmodes() {
        java.awt.DisplayMode[] var4 = this.field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (int var3 = 0; var4.length > var3; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[1 + (var3 << 2)] = var4[var3].getHeight();
          var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
          var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (null != this.field_b) {
          this.field_a.setDisplayMode(this.field_b);
          if (!this.field_a.getDisplayMode().equals(this.field_b)) {
            throw new RuntimeException("");
          }
          this.field_b = null;
        }
        this.a((byte) -104, (java.awt.Frame) null);
    }

    private final void a(byte param0, java.awt.Frame param1) {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Field var4 = null;
          Throwable var4_ref = null;
          Throwable var6 = null;
          boolean var3 = false;
          if (param0 >= -91) {
            this.listmodes();
          }
          try {
            var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            if (((Boolean) (var4.get(this.field_a))).booleanValue()) {
              var4.set(this.field_a, Boolean.FALSE);
              var3 = true;
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = decompiledCaughtException;
          }
          try {
            this.field_a.setFullScreenWindow((java.awt.Window) ((Object) param1));
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6 = decompiledCaughtException;
            decompiledRegionSelector0 = ((var3)) ? (1) : (2);
          }
          if (decompiledRegionSelector0 == 0) {
            if (var3) {
              try {
                var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                var4.set(this.field_a, Boolean.TRUE);
              } catch (java.lang.Throwable decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var4_ref = decompiledCaughtException;
              }
            }
            return;
          }
          if (decompiledRegionSelector0 == 1) {
            try {
              java.lang.reflect.Field var7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
              var7.set(this.field_a, Boolean.TRUE);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              Throwable var7_ref = decompiledCaughtException;
            }
          }
          throw il.<RuntimeException>$cfr$sneakyThrow(var6);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public il() throws Exception {
        java.awt.GraphicsEnvironment var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field_a = var1.getDefaultScreenDevice();
        if (this.field_a.isFullScreenSupported()) {
          return;
        }
        java.awt.GraphicsDevice[] var2 = var1.getScreenDevices();
        java.awt.GraphicsDevice[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
          java.awt.GraphicsDevice var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.field_a = var5;
            return;
          }
        }
        throw il.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
