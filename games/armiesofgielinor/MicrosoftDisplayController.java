/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MicrosoftDisplayController implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw directDraw;
    private static int[] enumeratedModes;
    private static int modeWordCount;

    final int[] enumerateDisplayModes(int obfuscationGuard) {
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        enumeratedModes = new int[modeWordCount];
        modeWordCount = 0;
        this.directDraw.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = enumeratedModes;
        int[] var2 = var3;
        modeWordCount = obfuscationGuard;
        enumeratedModes = null;
        return var3;
    }

    final void enterFullscreen(int height, int refreshRate, java.awt.Frame frame, int bitDepth, int width, boolean unsupportedPeerGuard) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        if (!unsupportedPeerGuard) {
          frame.setVisible(true);
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 17);
          this.directDraw.setDisplayMode(width, height, bitDepth, refreshRate, 0);
          frame.setBounds(0, 0, width, height);
          frame.toFront();
          frame.requestFocus();
          return;
        }
    }

    final void exitFullscreen(int obfuscationGuard, java.awt.Frame frame) {
        this.directDraw.restoreDisplayMode();
        this.directDraw.setCooperativeLevel((java.awt.Component) ((Object) frame), 8);
        int var3 = -66 % ((59 - obfuscationGuard) / 46);
    }

    public MicrosoftDisplayController() {
        this.directDraw = new com.ms.directX.DirectDraw();
        this.directDraw.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (enumeratedModes == null) {
          modeWordCount = modeWordCount + 4;
        } else {
          fieldTemp$0 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$0] = param0.width;
          fieldTemp$1 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$1] = param0.height;
          fieldTemp$2 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$2] = param0.rgbBitCount;
          fieldTemp$3 = modeWordCount;
          modeWordCount = modeWordCount + 1;
          enumeratedModes[fieldTemp$3] = param0.refreshRate;
        }
    }
}
