/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtFullscreenBridge {
    private java.awt.GraphicsDevice graphicsDevice;
    private java.awt.DisplayMode savedDisplayMode;

    public final int[] listmodes() {
        int modeIndex = 0;
        java.awt.DisplayMode[] displayModes = this.graphicsDevice.getDisplayModes();
        java.awt.DisplayMode[] unusedModesAlias = displayModes;
        int[] packedModeTuples = new int[displayModes.length << 2];
        for (modeIndex = 0; modeIndex < displayModes.length; modeIndex++) {
            packedModeTuples[modeIndex << 2] = displayModes[modeIndex].getWidth();
            packedModeTuples[(modeIndex << 2) + 1] = displayModes[modeIndex].getHeight();
            packedModeTuples[2 + (modeIndex << 2)] = displayModes[modeIndex].getBitDepth();
            packedModeTuples[(modeIndex << 2) + 3] = displayModes[modeIndex].getRefreshRate();
        }
        return packedModeTuples;
    }

    public final void exit() {
        if (this.savedDisplayMode != null) {
            this.graphicsDevice.setDisplayMode(this.savedDisplayMode);
            if (!this.graphicsDevice.getDisplayMode().equals(this.savedDisplayMode)) {
                throw new RuntimeException("");
            }
            this.savedDisplayMode = null;
        }
        this.setFullscreenWindow(-779675038, (java.awt.Frame) null);
    }

    private final void setFullscreenWindow(int methodGuard, java.awt.Frame fullscreenFrame) {
        this.graphicsDevice.setFullScreenWindow((java.awt.Window) ((Object) fullscreenFrame));
        if (methodGuard != -779675038) {
          this.graphicsDevice = (java.awt.GraphicsDevice) null;
        }
    }

    public AwtFullscreenBridge() throws Exception {
        int deviceIndex = 0;
        java.awt.GraphicsEnvironment graphicsEnvironment;
        java.awt.GraphicsDevice[] screenDevices;
        java.awt.GraphicsDevice[] screenDevicesSnapshot;
        java.awt.GraphicsDevice candidateDevice;
        graphicsEnvironment = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
        if (this.graphicsDevice.isFullScreenSupported()) {
          return;
        }
        screenDevices = graphicsEnvironment.getScreenDevices();
        screenDevicesSnapshot = screenDevices;
        for (deviceIndex = 0; deviceIndex < screenDevicesSnapshot.length; deviceIndex++) {
          candidateDevice = screenDevicesSnapshot[deviceIndex];
          if (candidateDevice == null) {
            continue;
          }
          if (candidateDevice.isFullScreenSupported()) {
            this.graphicsDevice = candidateDevice;
            return;
          }
        }
        throw AwtFullscreenBridge.<RuntimeException>throwUnchecked(new Exception());
    }

    public final void enter(java.awt.Frame fullscreenFrame, int width, int height, int bitDepth, int refreshRate) {
        int savedRefreshRate;
        java.awt.DisplayMode[] supportedModes;
        int matchingModeFoundInt;
        int modeIndex;
        int candidateRefreshRate;
        this.savedDisplayMode = this.graphicsDevice.getDisplayMode();
        if (this.savedDisplayMode == null) {
          throw new NullPointerException();
        }
        fullscreenFrame.setUndecorated(true);
        fullscreenFrame.enableInputMethods(false);
        this.setFullscreenWindow(-779675038, fullscreenFrame);
        if (refreshRate == 0) {
          savedRefreshRate = this.savedDisplayMode.getRefreshRate();
          supportedModes = this.graphicsDevice.getDisplayModes();
          matchingModeFoundInt = 0;
          modeIndex = 0;
          while (true) {
            if (supportedModes.length <= modeIndex) {
              if (matchingModeFoundInt != 0) {
                break;
              }
              refreshRate = savedRefreshRate;
              break;
            }
            if (supportedModes[modeIndex].getWidth() != width) {
              modeIndex++;
              continue;
            }
            if (height != supportedModes[modeIndex].getHeight()) {
              modeIndex++;
              continue;
            }
            if (supportedModes[modeIndex].getBitDepth() != bitDepth) {
              modeIndex++;
              continue;
            }
            candidateRefreshRate = supportedModes[modeIndex].getRefreshRate();
            if (matchingModeFoundInt != 0 &&
                Math.abs(-savedRefreshRate + candidateRefreshRate) >= Math.abs(-savedRefreshRate + refreshRate)) {
              modeIndex++;
              continue;
            }
            refreshRate = candidateRefreshRate;
            matchingModeFoundInt = 1;
            modeIndex++;
          }
        }
        this.graphicsDevice.setDisplayMode(new java.awt.DisplayMode(width, height, bitDepth, refreshRate));
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
