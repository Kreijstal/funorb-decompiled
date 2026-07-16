/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    private java.awt.DisplayMode field_a;
    private java.awt.GraphicsDevice field_b;

    private final void a(java.awt.Frame param0, byte param1) {
        L0: {
          if (param1 <= -112) {
            break L0;
          } else {
            ((hg) this).field_b = null;
            break L0;
          }
        }
        ((hg) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param0);
    }

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((hg) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 718772226];
        for (var3 = 0; var3 < var4.length; var3++) {
            var2[var3 << 609165282] = var4[var3].getWidth();
            var2[(var3 << -1441497246) + 1] = var4[var3].getHeight();
            var2[(var3 << -1500719070) - -2] = var4[var3].getBitDepth();
            var2[3 + (var3 << 48201538)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public hg() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((hg) this).field_b = var1.getDefaultScreenDevice();
        if (((hg) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw hg.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((hg) this).field_b = var5;
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

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((hg) this).field_a = ((hg) this).field_b.getDisplayMode();
        if (null != ((hg) this).field_a) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a(param0, (byte) -116);
            if (-1 == (param4 ^ -1)) {
              var6 = ((hg) this).field_a.getRefreshRate();
              var7 = ((hg) this).field_b.getDisplayModes();
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
                    if (param2 == var7[var9].getHeight()) {
                      if (var7[var9].getBitDepth() == param3) {
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
          ((hg) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    public final void exit() {
        if (!(((hg) this).field_a == null)) {
            ((hg) this).field_b.setDisplayMode(((hg) this).field_a);
            if (!(((hg) this).field_b.getDisplayMode().equals(((hg) this).field_a))) {
                throw new RuntimeException("");
            }
            ((hg) this).field_a = null;
        }
        this.a((java.awt.Frame) null, (byte) -128);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
