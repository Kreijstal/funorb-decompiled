/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hma {
    private java.awt.GraphicsDevice field_a;
    private java.awt.DisplayMode field_b;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((hma) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 1455166370];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 1351882946] = var4[var3].getWidth();
            var2[(var3 << -1091874430) - -1] = var4[var3].getHeight();
            var2[(var3 << 1202278978) - -2] = var4[var3].getBitDepth();
            var2[3 + (var3 << 265425858)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    private final void a(int param0, java.awt.Frame param1) {
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((hma) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
            if (param0 == 265425858) {
              break L0;
            } else {
              var4 = null;
              ((hma) this).enter((java.awt.Frame) null, 70, -42, 21, 21);
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = decompiledCaughtException;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((hma) this).field_b = ((hma) this).field_a.getDisplayMode();
            if (((hma) this).field_b != null) {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(265425858, param0);
                if (param4 != 0) {
                  break L0;
                } else {
                  var6 = ((hma) this).field_b.getRefreshRate();
                  var7 = ((hma) this).field_a.getDisplayModes();
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
              ((hma) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            } else {
              throw new NullPointerException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void exit() {
        if (!(null == ((hma) this).field_b)) {
            ((hma) this).field_a.setDisplayMode(((hma) this).field_b);
            if (!(((hma) this).field_a.getDisplayMode().equals(((hma) this).field_b))) {
                throw new RuntimeException("");
            }
            ((hma) this).field_b = null;
        }
        this.a(265425858, (java.awt.Frame) null);
    }

    public hma() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((hma) this).field_a = var1.getDefaultScreenDevice();
        if (((hma) this).field_a.isFullScreenSupported()) {
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
                  ((hma) this).field_a = var5;
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
