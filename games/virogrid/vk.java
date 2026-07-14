/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    private java.awt.DisplayMode field_b;
    private java.awt.GraphicsDevice field_a;

    public final void exit() {
        if (null != ((vk) this).field_b) {
            ((vk) this).field_a.setDisplayMode(((vk) this).field_b);
            if (!((vk) this).field_a.getDisplayMode().equals(((vk) this).field_b)) {
                throw new RuntimeException("");
            }
            ((vk) this).field_b = null;
        }
        this.a(-543583998, (java.awt.Frame) null);
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        try {
            int var6 = 0;
            java.awt.DisplayMode[] var7 = null;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            ((vk) this).field_b = ((vk) this).field_a.getDisplayMode();
            if (null != ((vk) this).field_b) {
              L0: {
                param0.setUndecorated(true);
                param0.enableInputMethods(false);
                this.a(-543583998, param0);
                if (param4 != 0) {
                  break L0;
                } else {
                  var6 = ((vk) this).field_b.getRefreshRate();
                  var7 = ((vk) this).field_a.getDisplayModes();
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
              ((vk) this).field_a.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
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

    private final void a(int param0, java.awt.Frame param1) {
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -543583998) {
            break L0;
          } else {
            var4 = null;
            ((vk) this).enter((java.awt.Frame) null, -64, -22, 80, -92);
            break L0;
          }
        }
        try {
          ((vk) this).field_a.setFullScreenWindow((java.awt.Window) (Object) param1);
        } catch (java.lang.Throwable decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = decompiledCaughtException;
    }

    public vk() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((vk) this).field_a = var1.getDefaultScreenDevice();
        if (((vk) this).field_a.isFullScreenSupported()) {
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
                  ((vk) this).field_a = var5;
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
        java.awt.DisplayMode[] var4 = ((vk) this).field_a.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 929239010];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << -179878590] = var4[var3].getWidth();
            var2[1 + (var3 << -543583998)] = var4[var3].getHeight();
            var2[(var3 << 1015621986) - -2] = var4[var3].getBitDepth();
            var2[3 + (var3 << -210688286)] = var4[var3].getRefreshRate();
        }
        return var2;
    }
}
