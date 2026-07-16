/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((eg) this).field_b = ((eg) this).field_a.getDisplayMode();
        if (null == ((eg) this).field_b) {
          throw new NullPointerException();
        } else {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a((byte) 105, param0);
            if (param4 != 0) {
              break L0;
            } else {
              var6 = ((eg) this).field_b.getRefreshRate();
              var7 = ((eg) this).field_a.getDisplayModes();
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
                    if (var7[var9].getHeight() == param2) {
                      if (var7[var9].getBitDepth() == param3) {
                        L2: {
                          var10 = var7[var9].getRefreshRate();
                          if (var8 == 0) {
                            break L2;
                          } else {
                            if (Math.abs(var10 - var6) < Math.abs(-var6 + param4)) {
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
          ((eg) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((eg) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 783899458];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 874069250] = var4[var3].getWidth();
            var2[1 + (var3 << -2116823294)] = var4[var3].getHeight();
            var2[2 + (var3 << -1294678142)] = var4[var3].getBitDepth();
            var2[(var3 << -450509214) - -3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (!(((eg) this).field_b == null)) {
            ((eg) this).field_a.setDisplayMode(((eg) this).field_b);
            if (!((eg) this).field_a.getDisplayMode().equals(((eg) this).field_b)) {
                throw new RuntimeException("");
            }
            ((eg) this).field_b = null;
        }
        this.a((byte) 106, (java.awt.Frame) null);
    }

    private final void a(byte param0, java.awt.Frame param1) {
        Object var4 = null;
        ((eg) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
        L0: {
          if (param0 >= 97) {
            break L0;
          } else {
            var4 = null;
            this.a((byte) -95, (java.awt.Frame) null);
            break L0;
          }
        }
    }

    public eg() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((eg) this).field_a = var1.getDefaultScreenDevice();
        if (((eg) this).field_a.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw eg.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((eg) this).field_a = var5;
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
