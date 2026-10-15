/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AwtFullscreenController {
    private java.awt.GraphicsDevice graphicsDevice;
    private java.awt.DisplayMode savedDisplayMode;

    public final int[] listmodes() {
        int modeIndex = 0;
        java.awt.DisplayMode[] deviceModes = this.graphicsDevice.getDisplayModes();
        java.awt.DisplayMode[] modesAlias = deviceModes;
        int[] packedModes = new int[deviceModes.length << 2];
        for (modeIndex = 0; deviceModes.length > modeIndex; modeIndex++) {
          packedModes[modeIndex << 2] = deviceModes[modeIndex].getWidth();
          packedModes[(modeIndex << 2) + 1] = deviceModes[modeIndex].getHeight();
          packedModes[(modeIndex << 2) + 2] = deviceModes[modeIndex].getBitDepth();
          packedModes[(modeIndex << 2) + 3] = deviceModes[modeIndex].getRefreshRate();
        }
        return packedModes;
    }

    public final void exit() {
        if (this.savedDisplayMode != null) {
          this.graphicsDevice.setDisplayMode(this.savedDisplayMode);
          if (!this.graphicsDevice.getDisplayMode().equals(this.savedDisplayMode)) {
            throw new RuntimeException("");
          }
          this.savedDisplayMode = null;
        }
        this.setFullscreenWindow((byte) 25, (java.awt.Frame) null);
    }

    private final void setFullscreenWindow(byte obfuscationGuard, java.awt.Frame window) {
        this.graphicsDevice.setFullScreenWindow((java.awt.Window) ((Object) window));
        if (obfuscationGuard <= 7) {
          this.listmodes();
        }
    }

    public final void enter(java.awt.Frame window, int width, int height, int bitDepth, int refreshRate) {
        int modeIndex = 0;
        int previousRefreshRate;
        java.awt.DisplayMode[] availableModes;
        int foundRefreshRate;
        int candidateRefreshRate;
        this.savedDisplayMode = this.graphicsDevice.getDisplayMode();
        if (null == this.savedDisplayMode) {
          throw new NullPointerException();
        }
        window.setUndecorated(true);
        window.enableInputMethods(false);
        this.setFullscreenWindow((byte) 9, window);
        if (refreshRate == 0) {
          previousRefreshRate = this.savedDisplayMode.getRefreshRate();
          availableModes = this.graphicsDevice.getDisplayModes();
          foundRefreshRate = 0;
          for (modeIndex = 0; modeIndex < availableModes.length; modeIndex++) {
            if (availableModes[modeIndex].getWidth() == width &&
              height == availableModes[modeIndex].getHeight() &&
              bitDepth == availableModes[modeIndex].getBitDepth()) {
              candidateRefreshRate = availableModes[modeIndex].getRefreshRate();
              if (foundRefreshRate == 0 ||
                !(Math.abs(-previousRefreshRate + candidateRefreshRate) >= Math.abs(-previousRefreshRate + refreshRate))) {
                refreshRate = candidateRefreshRate;
                foundRefreshRate = 1;
              }
            }
          }
          if (foundRefreshRate == 0) {
            refreshRate = previousRefreshRate;
          }
        }
        this.graphicsDevice.setDisplayMode(new java.awt.DisplayMode(width, height, bitDepth, refreshRate));
    }

    public AwtFullscreenController() throws Exception {
        int deviceIndex = 0;
        java.awt.GraphicsEnvironment environment;
        java.awt.GraphicsDevice[] devices;
        java.awt.GraphicsDevice[] devicesAlias;
        java.awt.GraphicsDevice candidateDevice;
        environment = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.graphicsDevice = environment.getDefaultScreenDevice();
        if (this.graphicsDevice.isFullScreenSupported()) {
          return;
        }
        devices = environment.getScreenDevices();
        devicesAlias = devices;
        for (deviceIndex = 0; deviceIndex < devicesAlias.length; deviceIndex++) {
          candidateDevice = devicesAlias[deviceIndex];
          if (candidateDevice != null &&
            candidateDevice.isFullScreenSupported()) {
            this.graphicsDevice = candidateDevice;
            return;
          }
        }
        throw AwtFullscreenController.<RuntimeException>$cfr$sneakyThrow(new Exception());
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
