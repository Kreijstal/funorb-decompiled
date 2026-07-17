/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private java.awt.GraphicsDevice field_b;
    private java.awt.DisplayMode field_a;

    public final int[] listmodes() {
        int var3 = 0;
        java.awt.DisplayMode[] var4 = ((te) this).field_b.getDisplayModes();
        java.awt.DisplayMode[] var1 = var4;
        int[] var2 = new int[var4.length << 2];
        for (var3 = 0; var4.length > var3; var3++) {
            var2[var3 << 2] = var4[var3].getWidth();
            var2[1 + (var3 << 2)] = var4[var3].getHeight();
            var2[(var3 << 2) + 2] = var4[var3].getBitDepth();
            var2[3 + (var3 << 2)] = var4[var3].getRefreshRate();
        }
        return var2;
    }

    public final void enter(java.awt.Frame param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        java.awt.DisplayMode[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ((te) this).field_a = ((te) this).field_b.getDisplayMode();
        if (null != ((te) this).field_a) {
          L0: {
            param0.setUndecorated(true);
            param0.enableInputMethods(false);
            this.a((byte) 54, param0);
            if (0 == param4) {
              var6 = ((te) this).field_a.getRefreshRate();
              var7 = ((te) this).field_b.getDisplayModes();
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
                            if (Math.abs(-var6 + var10) < Math.abs(param4 + -var6)) {
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
          ((te) this).field_b.setDisplayMode(new java.awt.DisplayMode(param1, param2, param3, param4));
          return;
        } else {
          throw new NullPointerException();
        }
    }

    private final void a(byte param0, java.awt.Frame param1) {
        L0: {
          if (param0 >= 36) {
            break L0;
          } else {
            int[] discarded$2 = ((te) this).listmodes();
            break L0;
          }
        }
        ((te) this).field_b.setFullScreenWindow((java.awt.Window) (Object) param1);
    }

    public final void exit() {
        if (!(null == ((te) this).field_a)) {
            ((te) this).field_b.setDisplayMode(((te) this).field_a);
            if (!(((te) this).field_b.getDisplayMode().equals(((te) this).field_a))) {
                throw new RuntimeException("");
            }
            ((te) this).field_a = null;
        }
        this.a((byte) 87, (java.awt.Frame) null);
    }

    public te() throws Exception {
        java.awt.GraphicsEnvironment var1 = null;
        java.awt.GraphicsDevice[] var2 = null;
        java.awt.GraphicsDevice[] var3 = null;
        int var4 = 0;
        java.awt.GraphicsDevice var5 = null;
        var1 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        ((te) this).field_b = var1.getDefaultScreenDevice();
        if (((te) this).field_b.isFullScreenSupported()) {
          return;
        } else {
          var2 = var1.getScreenDevices();
          var3 = var2;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              throw te.<RuntimeException>$cfr$sneakyThrow(new Exception());
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                if (var5.isFullScreenSupported()) {
                  ((te) this).field_b = var5;
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

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
