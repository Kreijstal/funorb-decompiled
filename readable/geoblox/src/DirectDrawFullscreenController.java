/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectDrawFullscreenController implements com.ms.directX.IEnumModesCallback {
    private static int modeValueIndex;
    private com.ms.directX.DirectDraw directDraw;
    private static int[] modeValues;

    final int[] listDisplayModes(int methodGuard) {
        int[] var3 = null;
        int[] var2 = null;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        if (methodGuard == 8) {
            modeValues = new int[modeValueIndex];
            modeValueIndex = 0;
            this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
            var3 = modeValues;
            var2 = var3;
            modeValueIndex = 0;
            modeValues = null;
            return var3;
        }
        this.listDisplayModes(-65);
        modeValues = new int[modeValueIndex];
        modeValueIndex = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        var3 = modeValues;
        var2 = var3;
        modeValueIndex = 0;
        modeValues = null;
        return var3;
    }

    final void enterFullscreen(int extendedWindowStyle, int width, java.awt.Frame frame, int bitDepth, int height, int refreshRate) {
        frame.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(var8, -20, extendedWindowStyle);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 17);
        this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
        frame.setBounds(0, 0, width, height);
        frame.toFront();
        frame.requestFocus();
    }

    final void exitFullscreen(int methodGuard, java.awt.Frame frame) {
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 8);
        int var3 = 64 % ((methodGuard - 40) / 63);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc mode, com.ms.com.IUnknown unusedContext) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (modeValues != null) {
            fieldTemp$1 = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[fieldTemp$1] = mode.width;
            fieldTemp$2 = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[fieldTemp$2] = mode.height;
            fieldTemp$3 = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[fieldTemp$3] = mode.rgbBitCount;
            fieldTemp$4 = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[fieldTemp$4] = mode.refreshRate;
        } else {
            modeValueIndex = modeValueIndex + 4;
        }
    }

    public DirectDrawFullscreenController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }
}
