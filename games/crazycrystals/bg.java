/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private java.awt.DisplayMode field_a;
    private java.awt.GraphicsDevice field_b;

    private final void a(java.awt.Frame param0, int param1) {
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((bg) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3 = caughtException;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 3: {
                    throw (RuntimeException) (Object) var3;
                }
                case 4: {
                    if (param1 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = null;
                    this.a((java.awt.Frame) null, 75);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((bg) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 43142082];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << -645401246] = var4[var3].getWidth();
            var2[1 + (var3 << 126073442)] = var4[var3].getHeight();
            var2[2 + (var3 << -89143422)] = var4[var3].getBitDepth();
            var2[3 + (var3 << 258036066)] = var4[var3].getRefreshRate();
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
            ((bg) this).field_a = ((bg) this).field_b.getDisplayMode();
            if (null != ((bg) this).field_a) {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(param0, 0);
                if (0 != param4) {
                  break L0;
                } else {
                  var6 = ((bg) this).field_a.getRefreshRate();
                  var7 = ((bg) this).field_b.getDisplayModes();
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
              ((bg) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
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

    public bg() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((bg) this).field_b = var1.getDefaultScreenDevice();
        if (((bg) this).field_b.isFullScreenSupported()) {
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
                  ((bg) this).field_b = var5;
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
        if (!(null == ((bg) this).field_a)) {
            ((bg) this).field_b.setDisplayMode(((bg) this).field_a);
            if (!((bg) this).field_b.getDisplayMode().equals(((bg) this).field_a)) {
                throw new RuntimeException("");
            }
            ((bg) this).field_a = null;
        }
        this.a((java.awt.Frame) null, 0);
    }
}
