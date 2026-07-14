/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((rk) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << -1723248286];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << -211861630] = var4[var3].getWidth();
            var2[(var3 << -899692670) - -1] = var4[var3].getHeight();
            var2[2 + (var3 << -1449058942)] = var4[var3].getBitDepth();
            var2[(var3 << 1392035842) - -3] = var4[var3].getRefreshRate();
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
            ((rk) this).field_b = ((rk) this).field_a.getDisplayMode();
            if (null != ((rk) this).field_b) {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(83, param0);
                if (0 == param4) {
                  var6 = ((rk) this).field_b.getRefreshRate();
                  var7 = ((rk) this).field_a.getDisplayModes();
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
                                if (Math.abs(var10 + -var6) < Math.abs(param4 - var6)) {
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
              ((rk) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
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
        if (!(((rk) this).field_b == null)) {
            ((rk) this).field_a.setDisplayMode(((rk) this).field_b);
            if (!((rk) this).field_a.getDisplayMode().equals(((rk) this).field_b)) {
                throw new RuntimeException("");
            }
            ((rk) this).field_b = null;
        }
        this.a(-127, (java.awt.Frame) null);
    }

    private final void a(int param0, java.awt.Frame param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            Throwable var5 = null;
            java.lang.reflect.Field var5_ref = null;
            Throwable var7 = null;
            Throwable var8 = null;
            java.lang.reflect.Field var8_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = -105 % ((param0 - -73) / 53);
                        var4 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var5_ref.setAccessible(true);
                            if (!((Boolean) var5_ref.get((Object) (Object) ((rk) this).field_a)).booleanValue()) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5_ref.set((Object) (Object) ((rk) this).field_a, (Object) (Object) Boolean.FALSE);
                            var4 = 1;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var5 = caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            ((rk) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        if (var4 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            var5_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var5_ref.set((Object) (Object) ((rk) this).field_a, (Object) (Object) Boolean.TRUE);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var5 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            var7 = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var8_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var8_ref.set((Object) (Object) ((rk) this).field_a, (Object) (Object) Boolean.TRUE);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var8 = caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        throw (RuntimeException) (Object) var7;
                    }
                    case 16: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public rk() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((rk) this).field_a = var1.getDefaultScreenDevice();
        if (((rk) this).field_a.isFullScreenSupported()) {
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
                  ((rk) this).field_a = var5;
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

    static {
    }
}
