/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport005 {
    private java.awt.Robot robotState0001;
    private java.awt.Component componentState0002;

    public final void showcursor(java.awt.Component componentArgument1, boolean booleanArgument2) {
        try {
          if (booleanArgument2) {
            componentArgument1 = null;
            if (componentArgument1 == this.componentState0002) {
              return;
            }
            if (null == this.componentState0002) {
              if (componentArgument1 == null) {
                return;
              }
              componentArgument1.setCursor(componentArgument1.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
              this.componentState0002 = componentArgument1;
              return;
            }
            this.componentState0002.setCursor((java.awt.Cursor) null);
            this.componentState0002 = null;
            if (componentArgument1 != null) {
              componentArgument1.setCursor(componentArgument1.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
              this.componentState0002 = componentArgument1;
              return;
            }
            return;
          }
          if (componentArgument1 == null) {
            throw new NullPointerException();
          }
          if (componentArgument1 == this.componentState0002) {
            return;
          }
          if (null != this.componentState0002) {
            this.componentState0002.setCursor((java.awt.Cursor) null);
            this.componentState0002 = null;
            if (componentArgument1 == null) {
              return;
            }
            componentArgument1.setCursor(componentArgument1.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
            this.componentState0002 = componentArgument1;
            return;
          }
          if (componentArgument1 == null) {
            return;
          }
          componentArgument1.setCursor(componentArgument1.getToolkit().createCustomCursor((java.awt.Image) ((Object) new java.awt.image.BufferedImage(1, 1, 2)), new java.awt.Point(0, 0), (String) null));
          this.componentState0002 = componentArgument1;
        } catch (RuntimeException | Error uncheckedExceptionLocal1) {
          throw uncheckedExceptionLocal1;
        } catch (Throwable checkedExceptionLocal2) {
          throw new RuntimeException(checkedExceptionLocal2);
        }
    }

    public final void movemouse(int integerArgument1, int integerArgument2) {
        this.robotState0001.mouseMove(integerArgument1, integerArgument2);
    }

    public RenderingSupport005() throws Exception {
        java.awt.Robot robotLocal1 = new java.awt.Robot();
        this.robotState0001 = robotLocal1;
    }

    public final void setcustomcursor(java.awt.Component componentArgument1, int[] integerArrayArgument2, int integerArgument3, int integerArgument4, java.awt.Point pointArgument5) {
        java.awt.image.BufferedImage bufferedImageLocal1 = null;
        if (integerArrayArgument2 == null) {
          componentArgument1.setCursor((java.awt.Cursor) null);
        } else {
          bufferedImageLocal1 = new java.awt.image.BufferedImage(integerArgument3, integerArgument4, 2);
          bufferedImageLocal1.setRGB(0, 0, integerArgument3, integerArgument4, integerArrayArgument2, 0, integerArgument3);
          componentArgument1.setCursor(componentArgument1.getToolkit().createCustomCursor((java.awt.Image) ((Object) bufferedImageLocal1), pointArgument5, (String) null));
        }
    }
}
