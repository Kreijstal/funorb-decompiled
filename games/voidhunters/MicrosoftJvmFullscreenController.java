/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftJvmFullscreenController implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw directDraw;
    private static int modeValueIndex;
    private static int[] modeValues;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (modeValues != null) {
          fieldTemp$1 = modeValueIndex;
          modeValueIndex = modeValueIndex + 1;
          modeValues[fieldTemp$1] = param0.width;
          fieldTemp$2 = modeValueIndex;
          modeValueIndex = modeValueIndex + 1;
          modeValues[fieldTemp$2] = param0.height;
          fieldTemp$3 = modeValueIndex;
          modeValueIndex = modeValueIndex + 1;
          modeValues[fieldTemp$3] = param0.rgbBitCount;
          fieldTemp$4 = modeValueIndex;
          modeValueIndex = modeValueIndex + 1;
          modeValues[fieldTemp$4] = param0.refreshRate;
        } else {
          modeValueIndex = modeValueIndex + 4;
        }
    }

    final void enterFullscreen(int param0, java.awt.Frame param1, int param2, int param3, int param4, int param5) {
        param1.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        if (param0 < -60) {
          this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
          this.directDraw.setDisplayMode(param3, param5, param2, param4, 0);
          param1.setBounds(0, 0, param3, param5);
          param1.toFront();
          param1.requestFocus();
          return;
        }
    }

    public MicrosoftJvmFullscreenController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }

    final void exitFullscreen(int param0, java.awt.Frame param1) {
        this.directDraw.restoreDisplayMode();
        if (param0 <= -53) {
          this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
        java.awt.Frame var4 = (java.awt.Frame) null;
        this.exitFullscreen(114, (java.awt.Frame) null);
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
    }

    final int[] listDisplayModes(boolean param0) {
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        modeValues = new int[modeValueIndex];
        modeValueIndex = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = modeValues;
        int[] var2 = var3;
        modeValueIndex = 0;
        modeValues = null;
        if (!param0) {
          return var3;
        }
        this.directDraw = (com.ms.directX.DirectDraw) null;
        return var3;
    }
}
