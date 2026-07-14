/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((ve) this).field_b = ((ve) this).field_a.getDisplayMode();
            if (null == ((ve) this).field_b) {
              throw new NullPointerException();
            } else {
              param0.setUndecorated(true);
              param0.enableInputMethods(false);
              this.a((byte) 51, param0);
              if (param4 != 0) {
                ((ve) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
                return;
              } else {
                var6 = ((ve) this).field_b.getRefreshRate();
                var7 = ((ve) this).field_a.getDisplayModes();
                var8 = 0;
                var9 = 0;
                L0: while (true) {
                  if (var7.length <= var9) {
                    L1: {
                      if (var8 != 0) {
                        break L1;
                      } else {
                        param4 = var6;
                        break L1;
                      }
                    }
                    ((ve) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
                    return;
                  } else {
                    if (var7[var9].getWidth() == param1) {
                      if (param2 == var7[var9].getHeight()) {
                        if (var7[var9].getBitDepth() == param3) {
                          L2: {
                            var10 = var7[var9].getRefreshRate();
                            if (var8 == 0) {
                              break L2;
                            } else {
                              if (Math.abs(-var6 + var10) < Math.abs(param4 - var6)) {
                                break L2;
                              } else {
                                var9++;
                                continue L0;
                              }
                            }
                          }
                          var8 = 1;
                          param4 = var10;
                          var9++;
                          continue L0;
                        } else {
                          var9++;
                          var9++;
                          continue L0;
                        }
                      } else {
                        var9++;
                        var9++;
                        continue L0;
                      }
                    } else {
                      var9++;
                      var9++;
                      continue L0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, java.awt.Frame param1) {
        int var3 = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = -59 % ((param0 - 9) / 33);
          ((ve) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
        } catch (java.lang.Throwable decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var4 = decompiledCaughtException;
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((ve) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << -820594014];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << -1559829662] = var4[var3].getWidth();
            var2[(var3 << 1381185378) + 1] = var4[var3].getHeight();
            var2[2 + (var3 << -1653237022)] = var4[var3].getBitDepth();
            var2[3 + (var3 << -1318137630)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public ve() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((ve) this).field_a = var1.getDefaultScreenDevice();
        if (((ve) this).field_a.isFullScreenSupported()) {
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw new Exception();
            } else {
              var5 = var3[var4];
              if (var5 == null) {
                var4++;
                var4++;
                var4++;
                continue L0;
              } else {
                if (!var5.isFullScreenSupported()) {
                  var4++;
                  var4++;
                  continue L0;
                } else {
                  ((ve) this).field_a = var5;
                }
              }
            }
          }
        }
    }

    public final void exit() {
        if (!(null == ((ve) this).field_b)) {
            ((ve) this).field_a.setDisplayMode(((ve) this).field_b);
            if (((ve) this).field_a.getDisplayMode().equals(((ve) this).field_b)) {
                ((ve) this).field_b = null;
                this.a((byte) 127, (java.awt.Frame) null);
                return;
            }
            throw new RuntimeException("");
        }
        this.a((byte) 127, (java.awt.Frame) null);
    }
}
