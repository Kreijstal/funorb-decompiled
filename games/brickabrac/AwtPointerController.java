/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtPointerController {
    private java.awt.Robot robot;
    private java.awt.Component hiddenCursorComponent;

    public final void movemouse(int x, int y) {
        this.robot.mouseMove(x, y);
    }

    public final void setcustomcursor(java.awt.Component component, int[] argbPixels, int width, int height, java.awt.Point hotspot) {
        java.awt.image.BufferedImage cursorImage = null;
        if (argbPixels == null) {
          component.setCursor((java.awt.Cursor) null);
        } else {
          cursorImage = new java.awt.image.BufferedImage(width, height, 2);
          cursorImage.setRGB(0, 0, width, height, argbPixels, 0, width);
          component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) cursorImage), hotspot, (String) null));
        }
    }

    public final void showcursor(java.awt.Component component, boolean visible) {
        try {
          if (visible) {
            component = null;
          } else {
            if (component == null) {
              throw new NullPointerException();
            }
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
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    public AwtPointerController() throws Exception {
        java.awt.Robot robot = new java.awt.Robot();
        this.robot = robot;
    }
}
