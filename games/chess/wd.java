/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    private final void a(java.awt.Frame param0, int param1) {
        L0: {
          if (param1 == -16442) {
            break L0;
          } else {
            this.field_b = (java.awt.DisplayMode) null;
            break L0;
          }
        }
        this.field_a.setFullScreenWindow((java.awt.Window) ((Object) param0));
    }

    public final void exit() {
        if (!(this.field_b == null)) {
            this.field_a.setDisplayMode(this.field_b);
            if (!(this.field_a.getDisplayMode().equals(this.field_b))) {
                throw new RuntimeException("");
            }
            this.field_b = null;
        }
        this.a((java.awt.Frame) null, -16442);
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        this.field_b = this.field_a.getDisplayMode();
        if (this.field_b == null) {
          throw new NullPointerException();
        } else {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(param0, -16442);
            if (0 != param4) {
              break L0;
            } else {
              var6 = this.field_b.getRefreshRate();
              var7 = this.field_a.getDisplayModes();
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var7.length) {
                  if (var8 == 0) {
                    param4 = var6;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (param1 == var7[var9].getWidth()) {
                    if (param2 == var7[var9].getHeight()) {
                      if (param3 == var7[var9].getBitDepth()) {
                        L2: {
                          var10 = var7[var9].getRefreshRate();
                          if (var8 == 0) {
                            break L2;
                          } else {
                            if (Math.abs(var10 + -var6) < Math.abs(-var6 + param4)) {
                              break L2;
                            } else {
                              var9++;
                              continue L1;
                            }
                          }
                        }
                        var8 = 1;
                        param4 = var10;
                        var9++;
                        continue L1;
                      } else {
                        var9++;
                        continue L1;
                      }
                    } else {
                      var9++;
                      continue L1;
                    }
                  } else {
                    var9++;
                    continue L1;
                  }
                }
              }
            }
          }
          this.field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        }
    }

    public wd() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field_a = var1.getDefaultScreenDevice();
        if (this.field_a.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw wd.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  this.field_a = var5;
                  return;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = this.field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 1089563714];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << -1057917470] = var4[var3].getWidth();
            var2[1 + (var3 << -1442348542)] = var4[var3].getHeight();
            var2[2 + (var3 << -156771902)] = var4[var3].getBitDepth();
            var2[(var3 << -1312691998) - -3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
