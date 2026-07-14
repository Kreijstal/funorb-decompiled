/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((il) this).field_b = ((il) this).field_a.getDisplayMode();
            if (null != ((il) this).field_b) {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a((byte) -105, param0);
                if (param4 == 0) {
                  var6 = ((il) this).field_b.getRefreshRate();
                  var7 = ((il) this).field_a.getDisplayModes();
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
                          if (var7[var9].getBitDepth() == param3) {
                            L2: {
                              var10 = var7[var9].getRefreshRate();
                              if (var8 == 0) {
                                break L2;
                              } else {
                                if (Math.abs(-var6 + var10) < Math.abs(param4 + -var6)) {
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
              ((il) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
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

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((il) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << -207409598];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << -910811262] = var4[var3].getWidth();
            var2[1 + (var3 << -683139710)] = var4[var3].getHeight();
            var2[(var3 << -427484254) - -2] = var4[var3].getBitDepth();
            var2[3 + (var3 << -1399967582)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void exit() {
        if (!(null == ((il) this).field_b)) {
            ((il) this).field_a.setDisplayMode(((il) this).field_b);
            if (!((il) this).field_a.getDisplayMode().equals(((il) this).field_b)) {
                throw new RuntimeException("");
            }
            ((il) this).field_b = null;
        }
        this.a((byte) -104, (java.awt.Frame) null);
    }

    private final void a(byte param0, java.awt.Frame param1) {
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
                        if (param0 < -91) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        int[] discarded$1 = ((il) this).listmodes();
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            var4_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var4_ref.setAccessible(true);
                            if (!((Boolean) var4_ref.get((Object) (Object) ((il) this).field_a)).booleanValue()) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var4_ref.set((Object) (Object) ((il) this).field_a, (Object) (Object) Boolean.FALSE);
                            var3 = 1;
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
                            ((il) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
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
                            var4_ref.set((Object) (Object) ((il) this).field_a, (Object) (Object) Boolean.TRUE);
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
                            var7_ref.set((Object) (Object) ((il) this).field_a, (Object) (Object) Boolean.TRUE);
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

    public il() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((il) this).field_a = var1.getDefaultScreenDevice();
        if (((il) this).field_a.isFullScreenSupported()) {
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
                  ((il) this).field_a = var5;
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
