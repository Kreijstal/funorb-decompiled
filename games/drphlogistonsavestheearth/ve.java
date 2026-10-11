/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

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
        this.a((byte) 51, param0);
        if (param4 == 0) {
          var6 = this.field_b.getRefreshRate();
          var7 = this.field_a.getDisplayModes();
          var8 = 0;
          for (var9 = 0; var7.length > var9; var9++) {
            if (var7[var9].getWidth() == param1 &&
              param2 == var7[var9].getHeight() &&
              var7[var9].getBitDepth() == param3) {
              var10 = var7[var9].getRefreshRate();
              if (var8 == 0 ||
                !(Math.abs(-var6 + var10) >= Math.abs(param4 - var6))) {
                var8 = 1;
                param4 = var10;
              }
            }
          }
          if (var8 == 0) {
            param4 = var6;
          }
        }
        this.field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
    }

    private final void a(byte param0, java.awt.Frame param1) {
        int var3;
        var3 = -59 % ((param0 - 9) / 33);
        this.field_a.setFullScreenWindow((java.awt.Window) ((Object) param1));
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var4.length > var3; var3++) {
          var2[var3 << 2] = var4[var3].getWidth();
          var2[(var3 << 2) + 1] = var4[var3].getHeight();
          var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
          var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public ve() throws Exception {
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
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            var5.isFullScreenSupported()) {
            this.field_a = var5;
            return;
          }
        }
        throw ve.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    public final void exit() {
        if (null != this.field_b) {
          this.field_a.setDisplayMode(this.field_b);
          if (this.field_a.getDisplayMode().equals(this.field_b)) {
            this.field_b = null;
            this.a((byte) 127, (java.awt.Frame) null);
            return;
          }
          throw new RuntimeException("");
        }
        this.a((byte) 127, (java.awt.Frame) null);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
