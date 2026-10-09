/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectDrawFullscreenController implements com.ms.directX.IEnumModesCallback {
    private static int modeValueIndex;
    private com.ms.directX.DirectDraw directDraw;
    private static int[] modeValues;

    final int[] listDisplayModes(int methodGuard) {
        int[] enumeratedModeValues = null;
        int[] unusedModeValuesAlias = null;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        if (methodGuard == 8) {
            modeValues = new int[modeValueIndex];
            modeValueIndex = 0;
            this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
            enumeratedModeValues = modeValues;
            unusedModeValuesAlias = enumeratedModeValues;
            modeValueIndex = 0;
            modeValues = null;
            return enumeratedModeValues;
        }
        this.listDisplayModes(-65);
        modeValues = new int[modeValueIndex];
        modeValueIndex = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        enumeratedModeValues = modeValues;
        unusedModeValuesAlias = enumeratedModeValues;
        modeValueIndex = 0;
        modeValues = null;
        return enumeratedModeValues;
    }

    final void enterFullscreen(int extendedWindowStyle, int width, java.awt.Frame frame, int bitDepth, int height, int refreshRate) {
        frame.setVisible(true);
        com.ms.awt.WComponentPeer nullWindowPeer = (com.ms.awt.WComponentPeer) null;
        int windowHandle = nullWindowPeer.getHwnd();
        com.ms.win32.User32.SetWindowLong(windowHandle, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(windowHandle, -20, extendedWindowStyle);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 17);
        this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
        frame.setBounds(0, 0, width, height);
        frame.toFront();
        frame.requestFocus();
    }

    final void exitFullscreen(int methodGuard, java.awt.Frame frame) {
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 8);
        int exitGuardRemainder = 64 % ((methodGuard - 40) / 63);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc mode, com.ms.com.IUnknown unusedContext) {
        int widthWriteIndex = 0;
        int heightWriteIndex = 0;
        int bitDepthWriteIndex = 0;
        int refreshRateWriteIndex = 0;
        if (modeValues != null) {
            widthWriteIndex = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[widthWriteIndex] = mode.width;
            heightWriteIndex = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[heightWriteIndex] = mode.height;
            bitDepthWriteIndex = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[bitDepthWriteIndex] = mode.rgbBitCount;
            refreshRateWriteIndex = modeValueIndex;
            modeValueIndex = modeValueIndex + 1;
            modeValues[refreshRateWriteIndex] = mode.refreshRate;
        } else {
            modeValueIndex = modeValueIndex + 4;
        }
    }

    public DirectDrawFullscreenController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }
}
