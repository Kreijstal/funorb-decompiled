/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    private java.awt.DisplayMode field_a;
    private java.awt.GraphicsDevice field_b;

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((ak) this).field_a = ((ak) this).field_b.getDisplayMode();
        if (((ak) this).field_a == null) {
          throw new NullPointerException();
        } else {
          param0.setUndecorated(true);
          param0.enableInputMethods(false);
          this.a(param0, false);
          if (0 != param4) {
            ((ak) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
            return;
          } else {
            var6 = ((ak) this).field_a.getRefreshRate();
            var7 = ((ak) this).field_b.getDisplayModes();
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
                ((ak) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
                return;
              } else {
                if (var7[var9].getWidth() == param1) {
                  if (var7[var9].getHeight() == param2) {
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
                            continue L0;
                          }
                        }
                      }
                      param4 = var10;
                      var8 = 1;
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
    }

    private final void a(java.awt.Frame param0, boolean param1) {
        ((ak) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
    }

    public final void exit() {
        if (!(((ak) this).field_a == null)) {
            ((ak) this).field_b.setDisplayMode(((ak) this).field_a);
            if (((ak) this).field_b.getDisplayMode().equals(((ak) this).field_a)) {
                ((ak) this).field_a = null;
                this.a((java.awt.Frame) null, false);
                return;
            }
            throw new RuntimeException("");
        }
        this.a((java.awt.Frame) null, false);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((ak) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[1 + (var3 << 2)] = var4[var3].getHeight();
            var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public ak() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((ak) this).field_b = var1.getDefaultScreenDevice();
        if (((ak) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var3.length <= var4) {
              throw ak.<RuntimeException>$cfr$sneakyThrow(new Exception());
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
                  ((ak) this).field_b = var5;
                  return;
                }
              }
            }
          }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
