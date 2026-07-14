/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    private java.awt.DisplayMode field_a;
    private java.awt.GraphicsDevice field_b;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((rj) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 515217922];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 149936738] = var4[var3].getWidth();
            var2[1 + (var3 << 1261628962)] = var4[var3].getHeight();
            var2[(var3 << 1930934018) + 2] = var4[var3].getBitDepth();
            var2[3 + (var3 << -1850671806)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((rj) this).field_a = ((rj) this).field_b.getDisplayMode();
            if (null == ((rj) this).field_a) {
              throw new NullPointerException();
            } else {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(1261628962, param0);
                if (0 != param4) {
                  break L0;
                } else {
                  var6 = ((rj) this).field_a.getRefreshRate();
                  var7 = ((rj) this).field_b.getDisplayModes();
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
              ((rj) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, java.awt.Frame param1) {
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((rj) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param1);
            if (param0 == 1261628962) {
              break L0;
            } else {
              ((rj) this).field_b = null;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var3 = decompiledCaughtException;
        }
        throw (RuntimeException) (Object) var3;
    }

    public final void exit() {
        if (null != ((rj) this).field_a) {
            ((rj) this).field_b.setDisplayMode(((rj) this).field_a);
            if (!((rj) this).field_b.getDisplayMode().equals(((rj) this).field_a)) {
                throw new RuntimeException("");
            }
            ((rj) this).field_a = null;
        }
        this.a(1261628962, (java.awt.Frame) null);
    }

    public rj() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((rj) this).field_b = var1.getDefaultScreenDevice();
        if (((rj) this).field_b.isFullScreenSupported()) {
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw new Exception();
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((rj) this).field_b = var5;
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
}
