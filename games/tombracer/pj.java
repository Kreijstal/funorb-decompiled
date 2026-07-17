/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    private final void a(java.awt.Frame param0, int param1) {
        try {
            int var3 = 0;
            Throwable var4 = null;
            java.lang.reflect.Field var4_ref = null;
            Throwable var6 = null;
            Throwable var7 = null;
            java.lang.reflect.Field var7_ref = null;
            Object var8 = null;
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
                            var4_ref.setAccessible(true);
                            if (!((Boolean) var4_ref.get((Object) (Object) ((pj) this).field_b)).booleanValue()) {
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
                            var3 = 1;
                            var4_ref.set((Object) (Object) ((pj) this).field_b, (Object) (Object) Boolean.FALSE);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        var4 = caughtException;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (param1 > 3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var8 = null;
                        this.a((java.awt.Frame) null, -8);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((pj) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            var4_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var4_ref.set((Object) (Object) ((pj) this).field_b, (Object) (Object) Boolean.TRUE);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var4 = caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            var6 = caughtException;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        if (var3 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            var7_ref = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                            var7_ref.set((Object) (Object) ((pj) this).field_b, (Object) (Object) Boolean.TRUE);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var7 = caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        throw pj.<RuntimeException>$cfr$sneakyThrow(var6);
                    }
                    case 20: {
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
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((pj) this).field_a = ((pj) this).field_b.getDisplayMode();
        if (null != ((pj) this).field_a) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(param0, 29);
            if (0 == param4) {
              var6 = ((pj) this).field_a.getRefreshRate();
              var7 = ((pj) this).field_b.getDisplayModes();
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
                  if (var7[var9].getWidth() == param1) {
                    if (var7[var9].getHeight() == param2) {
                      if (param3 == var7[var9].getBitDepth()) {
                        L2: {
                          var10 = var7[var9].getRefreshRate();
                          if (var8 == 0) {
                            break L2;
                          } else {
                            if (Math.abs(var10 - var6) < Math.abs(-var6 + param4)) {
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
            } else {
              break L0;
            }
          }
          ((pj) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    public final void exit() {
        if (null != ((pj) this).field_a) {
            ((pj) this).field_b.setDisplayMode(((pj) this).field_a);
            if (!(((pj) this).field_b.getDisplayMode().equals(((pj) this).field_a))) {
                throw new RuntimeException("");
            }
            ((pj) this).field_a = null;
        }
        this.a((java.awt.Frame) null, 84);
    }

    public pj() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((pj) this).field_b = var1.getDefaultScreenDevice();
        if (((pj) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw pj.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((pj) this).field_b = var5;
                  return;
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

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((pj) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[1 + (var3 << 2)] = var4[var3].getHeight();
            var2[(var3 << 2) - -2] = var4[var3].getBitDepth();
            var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
