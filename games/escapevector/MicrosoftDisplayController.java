/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftDisplayController implements com.ms.directX.IEnumModesCallback {
    private static int[] enumeratedModes;
    private com.ms.directX.DirectDraw directDraw;
    private static int modeWordCount;

    final void restoreDisplay(int cooperativeLevel, java.awt.Frame frame) {
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), cooperativeLevel);
    }

    public MicrosoftDisplayController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (enumeratedModes != null) {
          int fieldTemp$1 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$1] = param0.width;
          int fieldTemp$2 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$2] = param0.height;
          int fieldTemp$3 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$3] = param0.rgbBitCount;
          int fieldTemp$4 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$4] = param0.refreshRate;
        } else {
          modeWordCount = modeWordCount + 4;
        }
    }

    final void enterFullscreen(java.awt.Frame frame, int height, int refreshRate, int width, int guard, int bitDepth) {
        frame.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 17);
        if (guard == -7976) {
          this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
          frame.setBounds(0, 0, width, height);
          frame.toFront();
          frame.requestFocus();
          return;
        }
    }

    final int[] enumerateModes(int guard) {
        if (guard == -2147483648) {
          this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          enumeratedModes = new int[modeWordCount];
          modeWordCount = 0;
          this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          int[] var3 = enumeratedModes;
          int[] var2 = var3;
          enumeratedModes = null;
          modeWordCount = 0;
          return var3;
        }
        enumeratedModes = (int[]) null;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        enumeratedModes = new int[modeWordCount];
        modeWordCount = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3Lifetime1 = enumeratedModes;
        int[] var2Lifetime1 = var3Lifetime1;
        enumeratedModes = null;
        modeWordCount = 0;
        return var3Lifetime1;
    }
}
