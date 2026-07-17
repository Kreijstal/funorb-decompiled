/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void exit() {
        if (!(null == ((fl) this).field_b)) {
            ((fl) this).field_a.setDisplayMode(((fl) this).field_b);
            if (!((fl) this).field_a.getDisplayMode().equals(((fl) this).field_b)) {
                throw new RuntimeException("");
            }
            ((fl) this).field_b = null;
        }
        int discarded$0 = 1;
        this.a((java.awt.Frame) null);
    }

    private final void a(java.awt.Frame param0) {
        ((fl) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param0);
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((fl) this).field_b = ((fl) this).field_a.getDisplayMode();
        if (null != ((fl) this).field_b) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            int discarded$2 = 1;
            this.a(param0);
            if (param4 != 0) {
              break L0;
            } else {
              var6 = ((fl) this).field_b.getRefreshRate();
              var7 = ((fl) this).field_a.getDisplayModes();
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var7.length <= var9) {
                  if (var8 == 0) {
                    param4 = var6;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (var7[var9].getWidth() == param1) {
                    if (var7[var9].getHeight() == param2) {
                      if (var7[var9].getBitDepth() == param3) {
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
          ((fl) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    public fl() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((fl) this).field_a = var1.getDefaultScreenDevice();
        if (((fl) this).field_a.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw fl.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((fl) this).field_a = var5;
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
        java.awt.DisplayMode[] var4 = ((fl) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[(var3 << 2) - -1] = var4[var3].getHeight();
            var2[2 + (var3 << 2)] = var4[var3].getBitDepth();
            var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
