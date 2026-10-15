/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectDrawFullscreenController implements com.ms.directX.IEnumModesCallback {
    private static int enumeratedIntCount;
    private com.ms.directX.DirectDraw directDraw;
    private static int[] modeBuffer;

    final void enterFullscreen(java.awt.Frame window, int height, int width, int y, int refreshRate, int bitDepth) {
        window.setVisible(true);
        com.ms.awt.WComponentPeer unsupportedPeer = (com.ms.awt.WComponentPeer) null;
        int windowHandle = unsupportedPeer.getHwnd();
        com.ms.win32.User32.SetWindowLong(windowHandle, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(windowHandle, -20, 8);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) window), 17);
        this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
        window.setBounds(0, y, width, height);
        window.toFront();
        window.requestFocus();
    }

    final int[] listDisplayModes(byte obfuscationGuard) {
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        modeBuffer = new int[enumeratedIntCount];
        enumeratedIntCount = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] packedModes = modeBuffer;
        int[] packedModesAlias = packedModes;
        enumeratedIntCount = 0;
        modeBuffer = null;
        if (obfuscationGuard == -48) {
          return packedModes;
        }
        com.ms.com.IUnknown unusedContext = (com.ms.com.IUnknown) null;
        this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
        return packedModes;
    }

    public DirectDrawFullscreenController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc surface, com.ms.com.IUnknown context) {
        int widthOffset = 0;
        int heightOffset = 0;
        int bitDepthOffset = 0;
        int refreshRateOffset = 0;
        if (modeBuffer != null) {
          widthOffset = enumeratedIntCount;
          enumeratedIntCount = enumeratedIntCount + 1;
          modeBuffer[widthOffset] = surface.width;
          heightOffset = enumeratedIntCount;
          enumeratedIntCount = enumeratedIntCount + 1;
          modeBuffer[heightOffset] = surface.height;
          bitDepthOffset = enumeratedIntCount;
          enumeratedIntCount = enumeratedIntCount + 1;
          modeBuffer[bitDepthOffset] = surface.rgbBitCount;
          refreshRateOffset = enumeratedIntCount;
          enumeratedIntCount = enumeratedIntCount + 1;
          modeBuffer[refreshRateOffset] = surface.refreshRate;
        } else {
          enumeratedIntCount = enumeratedIntCount + 4;
        }
    }

    final void restoreFullscreen(int obfuscationGuard, java.awt.Frame window) {
        if (obfuscationGuard == -3887) {
          this.directDraw.restoreDisplayMode();
          this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) window), 8);
          return;
        }
        modeBuffer = (int[]) null;
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) window), 8);
    }
}
