/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    public final void exit() {
        if (!(((cu) this).field_a == null)) {
            ((cu) this).field_b.setDisplayMode(((cu) this).field_a);
            if (!((cu) this).field_b.getDisplayMode().equals(((cu) this).field_a)) {
                throw new RuntimeException("");
            }
            ((cu) this).field_a = null;
        }
        this.a(true, (java.awt.Frame) null);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((cu) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << -1344578654];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << -476628606] = var4[var3].getWidth();
            var2[(var3 << -1191933566) + 1] = var4[var3].getHeight();
            var2[2 + (var3 << -1489953438)] = var4[var3].getBitDepth();
            var2[(var3 << -294987614) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    private final void a(boolean param0, java.awt.Frame param1) {
        try {
            int var3 = 0;
            Throwable var4 = null;
            java.lang.reflect.Field var4_ref = null;
            Throwable var6 = null;
            Throwable var7 = null;
            java.lang.reflect.Field var7_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var4_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var4_ref.setAccessible(param0);
                            if (((Boolean) var4_ref.get((Object) (Object) ((cu) this).field_b)).booleanValue()) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = 1;
                            var4_ref.set((Object) (Object) ((cu) this).field_b, (Object) (Object) Boolean.FALSE);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        var4 = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((cu) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param1);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        if (var3 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            var4_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var4_ref.set((Object) (Object) ((cu) this).field_b, (Object) (Object) Boolean.TRUE);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var4 = caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            var6 = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        if (var3 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            var7_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var7_ref.set((Object) (Object) ((cu) this).field_b, (Object) (Object) Boolean.TRUE);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var7 = caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw (RuntimeException) (Object) var6;
                    }
                    case 19: {
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

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((cu) this).field_a = ((cu) this).field_b.getDisplayMode();
            if (null == ((cu) this).field_a) {
              throw new NullPointerException();
            } else {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(true, param0);
                if (param4 != 0) {
                  break L0;
                } else {
                  var6 = ((cu) this).field_a.getRefreshRate();
                  var7 = ((cu) this).field_b.getDisplayModes();
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
                }
              }
              ((cu) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public cu() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((cu) this).field_b = var1.getDefaultScreenDevice();
        if (((cu) this).field_b.isFullScreenSupported()) {
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
                  ((cu) this).field_b = var5;
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
