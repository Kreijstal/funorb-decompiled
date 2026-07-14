/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    private java.awt.Robot field_b;
    private java.awt.Component field_a;

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
        ((cc) this).field_b.mouseMove(param0, param1);
    }

    public final void showcursor(java.awt.Component param0, boolean param1) {
        try {
            if (!param1) {
                // ifnonnull L18
                throw new NullPointerException();
            }
            param0 = null;
            if (!(((cc) this).field_a != param0)) {
                return;
            }
            if (!(null == ((cc) this).field_a)) {
                ((cc) this).field_a.setCursor((java.awt.Cursor) null);
                ((cc) this).field_a = null;
            }
            if (!(param0 == null)) {
                param0.setCursor(param0.getToolkit().createCustomCursor((java.awt.Image) (Object) new java.awt.image.BufferedImage(1, 1, 2), new java.awt.Point(0, 0), (String) null));
                ((cc) this).field_a = param0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public cc() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        ((cc) this).field_b = var2;
    }
}
