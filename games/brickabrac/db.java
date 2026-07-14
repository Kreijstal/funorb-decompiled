/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    private java.awt.GraphicsDevice field_a;
    private java.awt.DisplayMode field_b;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((db) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 930410594];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << -1495297886] = var4[var3].getWidth();
            var2[(var3 << 1990511746) - -1] = var4[var3].getHeight();
            var2[(var3 << 1665528066) + 2] = var4[var3].getBitDepth();
            var2[(var3 << -1228558942) - -3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (!(((db) this).field_b == null)) {
            ((db) this).field_a.setDisplayMode(((db) this).field_b);
            if (!(((db) this).field_a.getDisplayMode().equals(((db) this).field_b))) {
                throw new RuntimeException("");
            }
            ((db) this).field_b = null;
        }
        this.a((byte) 25, (java.awt.Frame) null);
    }

    private final void a(byte param0, java.awt.Frame param1) {
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((db) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
            if (param0 > 7) {
              break L0;
            } else {
              int[] discarded$2 = ((db) this).listmodes();
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
            ((db) this).field_b = ((db) this).field_a.getDisplayMode();
            if (null == ((db) this).field_b) {
              throw new NullPointerException();
            } else {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a((byte) 9, param0);
                if (param4 == 0) {
                  var6 = ((db) this).field_b.getRefreshRate();
                  var7 = ((db) this).field_a.getDisplayModes();
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
                      if (var7[var9].getWidth() == param1) {
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
              ((db) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public db() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((db) this).field_a = var1.getDefaultScreenDevice();
        if (((db) this).field_a.isFullScreenSupported()) {
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw new Exception();
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((db) this).field_a = var5;
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
