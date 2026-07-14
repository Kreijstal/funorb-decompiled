/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    private java.awt.GraphicsDevice field_a;
    private java.awt.DisplayMode field_b;

    private final void a(java.awt.Frame param0, int param1) {
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((eo) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param0);
            if (param1 == 0) {
              break L0;
            } else {
              int[] discarded$2 = ((eo) this).listmodes();
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var3 = decompiledCaughtException;
        }
        throw (RuntimeException) (Object) var3;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((eo) this).field_b = ((eo) this).field_a.getDisplayMode();
            if (((eo) this).field_b == null) {
              throw new NullPointerException();
            } else {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(param0, 0);
                if (param4 != 0) {
                  break L0;
                } else {
                  var6 = ((eo) this).field_b.getRefreshRate();
                  var7 = ((eo) this).field_a.getDisplayModes();
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
                        if (var7[var9].getHeight() == param2) {
                          if (param3 == var7[var9].getBitDepth()) {
                            L2: {
                              var10 = var7[var9].getRefreshRate();
                              if (var8 == 0) {
                                break L2;
                              } else {
                                if (Math.abs(var10 - var6) < Math.abs(param4 + -var6)) {
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
              ((eo) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((eo) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 92334178];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << -1684690654] = var4[var3].getWidth();
            var2[(var3 << -32643646) + 1] = var4[var3].getHeight();
            var2[2 + (var3 << -56578430)] = var4[var3].getBitDepth();
            var2[(var3 << -1821655774) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (((eo) this).field_b != null) {
            ((eo) this).field_a.setDisplayMode(((eo) this).field_b);
            if (!(((eo) this).field_a.getDisplayMode().equals(((eo) this).field_b))) {
                throw new RuntimeException("");
            }
            ((eo) this).field_b = null;
        }
        this.a((java.awt.Frame) null, 0);
    }

    public eo() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((eo) this).field_a = var1.getDefaultScreenDevice();
        if (((eo) this).field_a.isFullScreenSupported()) {
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
                  ((eo) this).field_a = var5;
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
