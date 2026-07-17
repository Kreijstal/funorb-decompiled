/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    private final void a(java.awt.Frame param0, int param1) {
        int var3 = 0;
        ((pa) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
        var3 = 81 % ((-10 - param1) / 44);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((pa) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[1 + (var3 << 2)] = var4[var3].getHeight();
            var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((pa) this).field_a = ((pa) this).field_b.getDisplayMode();
        if (((pa) this).field_a != null) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(param0, 115);
            if (param4 == 0) {
              var6 = ((pa) this).field_a.getRefreshRate();
              var7 = ((pa) this).field_b.getDisplayModes();
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
                  if (param1 == var7[var9].getWidth()) {
                    if (param2 == var7[var9].getHeight()) {
                      if (param3 == var7[var9].getBitDepth()) {
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
            } else {
              break L0;
            }
          }
          ((pa) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    public final void exit() {
        if (null != ((pa) this).field_a) {
            ((pa) this).field_b.setDisplayMode(((pa) this).field_a);
            if (!((pa) this).field_b.getDisplayMode().equals(((pa) this).field_a)) {
                throw new RuntimeException("");
            }
            ((pa) this).field_a = null;
        }
        this.a((java.awt.Frame) null, -75);
    }

    public pa() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((pa) this).field_b = var1.getDefaultScreenDevice();
        if (((pa) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw pa.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((pa) this).field_b = var5;
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

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
