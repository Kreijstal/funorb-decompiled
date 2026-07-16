/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    private java.awt.DisplayMode field_a;
    private java.awt.GraphicsDevice field_b;

    private final void a(boolean param0, java.awt.Frame param1) {
        L0: {
          ((gl) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param1);
          if (!param0) {
            break L0;
          } else {
            ((gl) this).field_a = null;
            break L0;
          }
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((gl) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 1320354114];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 1825941826] = var4[var3].getWidth();
            var2[(var3 << -1180357726) + 1] = var4[var3].getHeight();
            var2[2 + (var3 << -1685950334)] = var4[var3].getBitDepth();
            var2[(var3 << -1082101342) - -3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((gl) this).field_a = ((gl) this).field_b.getDisplayMode();
        if (null == ((gl) this).field_a) {
          throw new NullPointerException();
        } else {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(false, param0);
            if (0 == param4) {
              var6 = ((gl) this).field_a.getRefreshRate();
              var7 = ((gl) this).field_b.getDisplayModes();
              var8 = 0;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var7.length) {
                  if (var8 != 0) {
                    break L0;
                  } else {
                    param4 = var6;
                    break L0;
                  }
                } else {
                  if (param1 == var7[var9].getWidth()) {
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
            } else {
              break L0;
            }
          }
          ((gl) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        }
    }

    public gl() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((gl) this).field_b = var1.getDefaultScreenDevice();
        if (((gl) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw gl.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((gl) this).field_b = var5;
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

    public final void exit() {
        if (!(null == ((gl) this).field_a)) {
            ((gl) this).field_b.setDisplayMode(((gl) this).field_a);
            if (!((gl) this).field_b.getDisplayMode().equals(((gl) this).field_a)) {
                throw new RuntimeException("");
            }
            ((gl) this).field_a = null;
        }
        this.a(false, (java.awt.Frame) null);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
