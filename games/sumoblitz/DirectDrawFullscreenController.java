/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectDrawFullscreenController implements com.ms.directX.IEnumModesCallback {
    private static int modeOffset;
    private com.ms.directX.DirectDraw directDraw;
    private static int[] modes;

    final int[] displayModes(byte guard) {
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        modes = new int[modeOffset];
        modeOffset = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var4 = modes;
        int[] var2 = var4;
        int var3 = 49 / ((-45 - guard) / 43);
        modeOffset = 0;
        modes = null;
        return var4;
    }

    final void restoreDisplayMode(java.awt.Frame frame, int cooperativeLevel) {
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), cooperativeLevel);
    }

    final void enterFullscreen(int height, byte guard, int width, int refreshRate, int bitDepth, java.awt.Frame frame) {
        int var7 = 40 % ((guard - 26) / 61);
        frame.setVisible(true);
        com.ms.awt.WComponentPeer var8 = (com.ms.awt.WComponentPeer) null;
        int var9 = var8.getHwnd();
        com.ms.win32.User32.SetWindowLong(var9, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(var9, -20, 8);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 17);
        this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
        frame.setBounds(0, 0, width, height);
        frame.toFront();
        frame.requestFocus();
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc description, com.ms.com.IUnknown context) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (modes != null) {
          fieldTemp$1 = modeOffset;
          modeOffset = modeOffset + 1;
          modes[fieldTemp$1] = description.width;
          fieldTemp$2 = modeOffset;
          modeOffset = modeOffset + 1;
          modes[fieldTemp$2] = description.height;
          fieldTemp$3 = modeOffset;
          modeOffset = modeOffset + 1;
          modes[fieldTemp$3] = description.rgbBitCount;
          fieldTemp$4 = modeOffset;
          modeOffset = modeOffset + 1;
          modes[fieldTemp$4] = description.refreshRate;
        } else {
          modeOffset = modeOffset + 4;
        }
    }

    public DirectDrawFullscreenController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }
}
