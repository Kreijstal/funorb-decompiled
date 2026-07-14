/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    private java.awt.Component field_b;
    private java.awt.Robot field_a;

    public final void movemouse(int param0, int param1) {
        ((jn) this).field_a.mouseMove(param0, param1);
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

    public jn() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        ((jn) this).field_a = var2;
    }

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
            if (((jn) this).field_b == param0) {
              return;
            } else {
              if (null == ((jn) this).field_b) {
                if (param0 != null) {
                  param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                  ((jn) this).field_b = param0;
                  return;
                } else {
                  return;
                }
              } else {
                ((jn) this).field_b.setCursor((java.awt.Cursor) null);
                ((jn) this).field_b = null;
                if (param0 == null) {
                  return;
                } else {
                  param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                  ((jn) this).field_b = param0;
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }
}
