/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport142 {
    private java.awt.GraphicsDevice graphicsDeviceState0001;
    private java.awt.DisplayMode displayModeState0001;

    private final void performAction1931(java.awt.Frame frameArgument1, int integerArgument2) {
        int integerLocal1;
        integerLocal1 = -31 % ((1 - integerArgument2) / 51);
        this.graphicsDeviceState0001.setFullScreenWindow((java.awt.Window) ((Object) frameArgument1));
    }

    public final int[] listmodes() {
        int integerLocal1 = 0;
        java.awt.DisplayMode[] displayModeArrayLocal2 = this.graphicsDeviceState0001.getDisplayModes();
        java.awt.DisplayMode[] displayModeArrayLocal3 = displayModeArrayLocal2;
        int[] integerArrayLocal4 = new int[displayModeArrayLocal2.length << 2];
        for (integerLocal1 = 0; integerLocal1 < displayModeArrayLocal2.length; integerLocal1++) {
          integerArrayLocal4[integerLocal1 << 2] = displayModeArrayLocal2[integerLocal1].getWidth();
          integerArrayLocal4[(integerLocal1 << 2) + 1] = displayModeArrayLocal2[integerLocal1].getHeight();
          integerArrayLocal4[2 + (integerLocal1 << 2)] = displayModeArrayLocal2[integerLocal1].getBitDepth();
          integerArrayLocal4[3 + (integerLocal1 << 2)] = displayModeArrayLocal2[integerLocal1].getRefreshRate();
        }
        return integerArrayLocal4;
    }

    public final void enter(java.awt.Frame frameArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2;
        java.awt.DisplayMode[] displayModeArrayLocal3;
        int integerLocal4;
        int integerLocal5;
        this.displayModeState0001 = this.graphicsDeviceState0001.getDisplayMode();
        if (this.displayModeState0001 == null) {
          throw new NullPointerException();
        }
        frameArgument1.setUndecorated(true);
        frameArgument1.enableInputMethods(false);
        this.performAction1931(frameArgument1, 127);
        if (integerArgument5 == 0) {
          integerLocal2 = this.displayModeState0001.getRefreshRate();
          displayModeArrayLocal3 = this.graphicsDeviceState0001.getDisplayModes();
          integerLocal4 = 0;
          for (integerLocal1 = 0; integerLocal1 < displayModeArrayLocal3.length; integerLocal1++) {
            if (displayModeArrayLocal3[integerLocal1].getWidth() == integerArgument2 &&
              displayModeArrayLocal3[integerLocal1].getHeight() == integerArgument3 &&
              integerArgument4 == displayModeArrayLocal3[integerLocal1].getBitDepth()) {
              integerLocal5 = displayModeArrayLocal3[integerLocal1].getRefreshRate();
              if (integerLocal4 == 0 ||
                !(Math.abs(integerLocal5 - integerLocal2) >= Math.abs(-integerLocal2 + integerArgument5))) {
                integerLocal4 = 1;
                integerArgument5 = integerLocal5;
              }
            }
          }
          if (integerLocal4 == 0) {
            integerArgument5 = integerLocal2;
          }
        }
        this.graphicsDeviceState0001.setDisplayMode(new java.awt.DisplayMode(integerArgument2, integerArgument3, integerArgument4, integerArgument5));
    }

    public final void exit() {
        if (this.displayModeState0001 != null) {
          this.graphicsDeviceState0001.setDisplayMode(this.displayModeState0001);
          if (!this.graphicsDeviceState0001.getDisplayMode().equals(this.displayModeState0001)) {
            throw new RuntimeException("");
          }
          this.displayModeState0001 = null;
        }
        this.performAction1931((java.awt.Frame) null, 121);
    }

    public MixedSupport142() throws Exception {
        int integerLocal1 = 0;
        java.awt.GraphicsEnvironment graphicsEnvironmentLocal2;
        java.awt.GraphicsDevice[] graphicsDeviceArrayLocal3;
        java.awt.GraphicsDevice[] graphicsDeviceArrayLocal4;
        java.awt.GraphicsDevice graphicsDeviceLocal5;
        graphicsEnvironmentLocal2 = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.graphicsDeviceState0001 = graphicsEnvironmentLocal2.getDefaultScreenDevice();
        if (this.graphicsDeviceState0001.isFullScreenSupported()) {
          return;
        }
        graphicsDeviceArrayLocal3 = graphicsEnvironmentLocal2.getScreenDevices();
        graphicsDeviceArrayLocal4 = graphicsDeviceArrayLocal3;
        for (integerLocal1 = 0; graphicsDeviceArrayLocal4.length > integerLocal1; integerLocal1++) {
          graphicsDeviceLocal5 = graphicsDeviceArrayLocal4[integerLocal1];
          if (graphicsDeviceLocal5 != null &&
            graphicsDeviceLocal5.isFullScreenSupported()) {
            this.graphicsDeviceState0001 = graphicsDeviceLocal5;
            return;
          }
        }
        throw MixedSupport142.<RuntimeException>computeRuntimeException1930(new Exception());
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException computeRuntimeException1930(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
