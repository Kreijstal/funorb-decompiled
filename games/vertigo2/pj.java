/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    private java.awt.Component field_a;
    private java.awt.Robot field_b;

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
        ((pj) this).field_b.mouseMove(param0, param1);
    }

    public final void showcursor(java.awt.Component param0, boolean param1) {
        try {
            if (!param1) {
              if (param0 != null) {
                if (((pj) this).field_a != param0) {
                  if (null == ((pj) this).field_a) {
                    if (param0 != null) {
                      param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                      ((pj) this).field_a = param0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((pj) this).field_a.setCursor((java.awt.Cursor) null);
                    ((pj) this).field_a = null;
                    if (param0 != null) {
                      param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                      ((pj) this).field_a = param0;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                throw new NullPointerException();
              }
            } else {
              param0 = null;
              if (((pj) this).field_a != param0) {
                if (null != ((pj) this).field_a) {
                  ((pj) this).field_a.setCursor((java.awt.Cursor) null);
                  ((pj) this).field_a = null;
                  if (param0 == null) {
                    return;
                  } else {
                    param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                    ((pj) this).field_a = param0;
                    return;
                  }
                } else {
                  if (param0 != null) {
                    param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                    ((pj) this).field_a = param0;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public pj() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        ((pj) this).field_b = var2;
    }
}
