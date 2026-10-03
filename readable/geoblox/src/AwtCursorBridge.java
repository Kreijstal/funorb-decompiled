/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtCursorBridge {
    private java.awt.Robot mouseRobot;
    private java.awt.Component cursorHiddenComponent;

    public final void movemouse(int screenX, int screenY) {
        this.mouseRobot.mouseMove(screenX, screenY);
    }

    public final void showcursor(java.awt.Component component, boolean showDefaultCursor) {
        try {
            if (showDefaultCursor) {
              component = null;
            } else {
              if (component == null) {
                throw new NullPointerException();
              }
            }
            if (this.cursorHiddenComponent == component) {
              return;
            }
            if (this.cursorHiddenComponent != null) {
              this.cursorHiddenComponent.setCursor((java.awt.Cursor) null);
              this.cursorHiddenComponent = null;
            }
            if (component == null) {
              return;
            }
            component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
            this.cursorHiddenComponent = component;
        } catch (RuntimeException | Error uncheckedCursorFailure) {
            throw uncheckedCursorFailure;
        } catch (Throwable checkedCursorFailure) {
            throw new RuntimeException(checkedCursorFailure);
        }
    }

    public final void setcustomcursor(java.awt.Component component, int[] argbPixels, int width, int height, java.awt.Point hotspot) {
        java.awt.image.BufferedImage cursorImage = null;
        if (argbPixels != null) {
            cursorImage = new java.awt.image.BufferedImage(width, height, 2);
            cursorImage.setRGB(0, 0, width, height, argbPixels, 0, width);
            component.setCursor(component.getToolkit().createCustomCursor((java.awt.Image) ((Object) cursorImage), hotspot, (String) null));
        } else {
            component.setCursor((java.awt.Cursor) null);
        }
    }

    public AwtCursorBridge() throws Exception {
        java.awt.Robot robotBeforeAssignment = new java.awt.Robot();
        this.mouseRobot = robotBeforeAssignment;
    }
}
