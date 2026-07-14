/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    private java.awt.Robot field_b;
    private java.awt.Component field_a;

    public final void showcursor(java.awt.Component param0, boolean param1) {
        try {
            L0: {
              if (param1) {
                param0 = null;
                break L0;
              } else {
                if (param0 == null) {
                  throw new NullPointerException();
                } else {
                  break L0;
                }
              }
            }
            if (param0 == ((dm) this).field_a) {
              return;
            } else {
              L1: {
                if (null != ((dm) this).field_a) {
                  ((dm) this).field_a.setCursor((java.awt.Cursor) null);
                  ((dm) this).field_a = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 != null) {
                  param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                  ((dm) this).field_a = param0;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void setcustomcursor(java.awt.Component param0, int[] param1, int param2, int param3, java.awt.Point param4) {
        java.awt.image.BufferedImage var6 = null;
        if (param1 == null) {
            param0.setCursor((java.awt.Cursor) null);
        } else {
            var6 = new java.awt.image.BufferedImage(param2, param3, 2);
            var6.setRGB(0, 0, param2, param3, param1, 0, param2);
            param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) var6, param4, (String) null));
        }
    }

    public final void movemouse(int param0, int param1) {
        ((dm) this).field_b.mouseMove(param0, param1);
    }

    public dm() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        ((dm) this).field_b = var2;
    }
}
