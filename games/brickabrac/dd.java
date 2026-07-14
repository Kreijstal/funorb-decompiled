/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private java.awt.Robot field_a;
    private java.awt.Component field_b;

    public final void movemouse(int param0, int param1) {
        ((dd) this).field_a.mouseMove(param0, param1);
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

    public final void showcursor(java.awt.Component param0, boolean param1) {
        try {
            L0: {
              if (param1) {
                param0 = null;
                break L0;
              } else {
                if (param0 != null) {
                  break L0;
                } else {
                  throw new NullPointerException();
                }
              }
            }
            if (((dd) this).field_b != param0) {
              L1: {
                if (((dd) this).field_b != null) {
                  ((dd) this).field_b.setCursor((java.awt.Cursor) null);
                  ((dd) this).field_b = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0 != null) {
                param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                ((dd) this).field_b = param0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public dd() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        ((dd) this).field_a = var2;
    }
}
