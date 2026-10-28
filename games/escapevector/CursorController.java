/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CursorController {
    private java.awt.Component hiddenCursorComponent;
    private java.awt.Robot robot;

    public final void showcursor(java.awt.Component component, boolean visible) {
        try {
          if (visible) {
            component = null;
          } else if (component == null) {
            throw new NullPointerException();
          }
          if (this.hiddenCursorComponent == component) {
            return;
          }
          if (this.hiddenCursorComponent != null) {
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

    public final void setcustomcursor(java.awt.Component component, int[] pixels, int width, int height, java.awt.Point hotspot) {
        if (pixels != null) {
          java.awt.image.BufferedImage var6 = new java.awt.image.BufferedImage(width, height, 2);
          var6.setRGB(0, 0, width, height, pixels, 0, width);
          component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) var6), hotspot, (String) null));
        } else {
          component.setCursor((java.awt.Cursor) null);
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
