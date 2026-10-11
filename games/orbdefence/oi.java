/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var9 = 0;
        int var6;
        java.awt.DisplayMode[] var7;
        int var8;
        int var10;
        this.field_a = this.field_b.getDisplayMode();
        if (this.field_a == null) {
          throw new NullPointerException();
        }
        param0.setUndecorated(true);
        param0.enableInputMethods(false);
        this.a(param0, -1);
        if (param4 == 0) {
          var6 = this.field_a.getRefreshRate();
          var7 = this.field_b.getDisplayModes();
          var8 = 0;
          for (var9 = 0; var7.length > var9; var9++) {
            if (param1 == var7[var9].getWidth() &&
              var7[var9].getHeight() == param2 &&
              param3 == var7[var9].getBitDepth()) {
              var10 = var7[var9].getRefreshRate();
              if (var8 == 0 ||
                !(Math.abs(-var6 + var10) >= Math.abs(param4 - var6))) {
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

    private final void a(java.awt.Frame param0, int param1) {
        this.field_b.setFullScreenWindow((java.awt.Window) ((Object) param0));
        if (param1 != -1) {
          this.listmodes();
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[1 + (var3 << 2)] = var4[var3].getHeight();
          var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
          var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public oi() throws Exception {
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
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.field_b = var5;
            return;
          }
        }
        throw oi.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    public final void exit() {
        if (this.field_a != null) {
          this.field_b.setDisplayMode(this.field_a);
          if (!this.field_b.getDisplayMode().equals(this.field_a)) {
            throw new RuntimeException("");
          }
          this.field_a = null;
        }
        this.a((java.awt.Frame) null, -1);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
