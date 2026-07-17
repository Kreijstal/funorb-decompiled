/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    private java.awt.GraphicsDevice field_a;
    private java.awt.DisplayMode field_b;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((pd) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[(var3 << 2) - -1] = var4[var3].getHeight();
            var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
            var2[(var3 << 2) - -3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (((pd) this).field_b != null) {
            ((pd) this).field_a.setDisplayMode(((pd) this).field_b);
            if (!(((pd) this).field_a.getDisplayMode().equals(((pd) this).field_b))) {
                throw new RuntimeException("");
            }
            ((pd) this).field_b = null;
        }
        this.a(-779675038, (java.awt.Frame) null);
    }

    private final void a(int param0, java.awt.Frame param1) {
        ((pd) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
    }

    public pd() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((pd) this).field_a = var1.getDefaultScreenDevice();
        if (((pd) this).field_a.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw pd.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((pd) this).field_a = var5;
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

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((pd) this).field_b = ((pd) this).field_a.getDisplayMode();
        if (((pd) this).field_b != null) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(-779675038, param0);
            if (param4 != 0) {
              break L0;
            } else {
              var6 = ((pd) this).field_b.getRefreshRate();
              var7 = ((pd) this).field_a.getDisplayModes();
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var7.length <= var9) {
                  if (var8 != 0) {
                    break L0;
                  } else {
                    param4 = var6;
                    break L0;
                  }
                } else {
                  if (var7[var9].getWidth() == param1) {
                    if (param2 == var7[var9].getHeight()) {
                      if (var7[var9].getBitDepth() == param3) {
                        L2: {
                          var10 = var7[var9].getRefreshRate();
                          if (var8 == 0) {
                            break L2;
                          } else {
                            if (Math.abs(-var6 + var10) < Math.abs(-var6 + param4)) {
                              break L2;
                            } else {
                              var9++;
                              continue L1;
                            }
                          }
                        }
                        param4 = var10;
                        var8 = 1;
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
          ((pd) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
