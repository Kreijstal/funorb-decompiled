/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((oi) this).field_a = ((oi) this).field_b.getDisplayMode();
            if (((oi) this).field_a == null) {
              throw new NullPointerException();
            } else {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(param0, -1);
                if (param4 == 0) {
                  var6 = ((oi) this).field_a.getRefreshRate();
                  var7 = ((oi) this).field_b.getDisplayModes();
                  var8 = 0;
                  var9 = 0;
                  L1: while (true) {
                    if (var7.length <= var9) {
                      if (var8 != 0) {
                        break L0;
                      } else {
                        param4 = var6;
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
                                if (Math.abs(-var6 + var10) < Math.abs(param4 - var6)) {
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
              ((oi) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(java.awt.Frame param0, int param1) {
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((oi) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
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
                    if (param1 == -1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    int[] discarded$2 = ((oi) this).listmodes();
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
        java.awt.DisplayMode[] var4 = ((oi) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 969199010];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 686450594] = var4[var3].getWidth();
            var2[1 + (var3 << -475208542)] = var4[var3].getHeight();
            var2[(var3 << -1416303838) + 2] = var4[var3].getBitDepth();
            var2[3 + (var3 << -527455678)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public oi() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((oi) this).field_b = var1.getDefaultScreenDevice();
        if (((oi) this).field_b.isFullScreenSupported()) {
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
                  ((oi) this).field_b = var5;
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
        if (((oi) this).field_a != null) {
            ((oi) this).field_b.setDisplayMode(((oi) this).field_a);
            if (!(((oi) this).field_b.getDisplayMode().equals(((oi) this).field_a))) {
                throw new RuntimeException("");
            }
            ((oi) this).field_a = null;
        }
        this.a((java.awt.Frame) null, -1);
    }
}
