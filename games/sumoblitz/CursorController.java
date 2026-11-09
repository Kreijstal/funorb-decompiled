/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CursorController {
    private java.awt.Component hiddenCursorComponent;
    private java.awt.Robot robot;

    public final void setcustomcursor(java.awt.Component component, int[] pixels, int width, int height, java.awt.Point hotspot) {
        java.awt.image.BufferedImage var6 = null;
        if (pixels == null) {
          component.setCursor((java.awt.Cursor) null);
        } else {
          var6 = new java.awt.image.BufferedImage(width, height, 2);
          var6.setRGB(0, 0, width, height, pixels, 0, width);
          component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) var6), hotspot, (String) null));
        }
    }

    public final void showcursor(java.awt.Component component, boolean show) {
        try {
          if (show) {
            component = null;
          } else {
            if (component == null) {
              throw new NullPointerException();
            }
          }
          if (component == this.hiddenCursorComponent) {
            return;
          }
          if (null != this.hiddenCursorComponent) {
            this.hiddenCursorComponent.setCursor((java.awt.Cursor) null);
            this.hiddenCursorComponent = null;
          }
          if (component == null) {
            return;
          }
          component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
          this.hiddenCursorComponent = component;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public CursorController() throws Exception {
        java.awt.Robot var2 = new java.awt.Robot();
        this.robot = var2;
    }

    public final void movemouse(int x, int y) {
        this.robot.mouseMove(x, y);
    }
}
