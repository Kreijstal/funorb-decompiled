/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlatformSupport003 implements com.ms.directX.IEnumModesCallback {
    private static int[] integerArrayState0046;
    private com.ms.directX.DirectDraw directDrawState0001;
    private static int integerState0231;

    final void performAction0578(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4, int integerArgument5, java.awt.Frame frameArgument6) {
        int integerLocal1 = 0;
        int integerLocal2;
        frameArgument6.setVisible(true);
        com.ms.awt.WComponentPeer wComponentPeerLocal3 = (com.ms.awt.WComponentPeer) null;
        if (!booleanArgument2) {
          integerLocal1 = wComponentPeerLocal3.getHwnd();
          com.ms.win32.User32.SetWindowLong(integerLocal1, -16, -2147483648);
          com.ms.win32.User32.SetWindowLong(integerLocal1, -20, 8);
          this.directDrawState0001.setCooperativeLevel((java.awt.Component) ((Object) frameArgument6), 17);
          this.directDrawState0001.setDisplayMode(integerArgument3, integerArgument4, integerArgument1, integerArgument5, 0);
          frameArgument6.setBounds(0, 0, integerArgument3, integerArgument4);
          frameArgument6.toFront();
          frameArgument6.requestFocus();
          return;
        }
        integerState0231 = -20;
        integerLocal2 = wComponentPeerLocal3.getHwnd();
        com.ms.win32.User32.SetWindowLong(integerLocal2, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(integerLocal2, -20, 8);
        this.directDrawState0001.setCooperativeLevel((java.awt.Component) ((Object) frameArgument6), 17);
        this.directDrawState0001.setDisplayMode(integerArgument3, integerArgument4, integerArgument1, integerArgument5, 0);
        frameArgument6.setBounds(0, 0, integerArgument3, integerArgument4);
        frameArgument6.toFront();
        frameArgument6.requestFocus();
    }

    final void performAction0579(java.awt.Frame frameArgument1, byte byteArgument2) {
        this.directDrawState0001.restoreDisplayMode();
        if (byteArgument2 >= 121) {
          this.directDrawState0001.setCooperativeLevel((java.awt.Component) ((Object) frameArgument1), 8);
          return;
        }
        java.awt.Frame frameLocal1 = (java.awt.Frame) null;
        this.performAction0579((java.awt.Frame) null, (byte) 18);
        this.directDrawState0001.setCooperativeLevel((java.awt.Component) ((Object) frameArgument1), 8);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc dDSurfaceDescArgument1, com.ms.com.IUnknown iUnknownArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        if (null == integerArrayState0046) {
          integerState0231 = integerState0231 + 4;
        } else {
          integerLocal1 = integerState0231;
          integerState0231 = integerState0231 + 1;
          integerArrayState0046[integerLocal1] = dDSurfaceDescArgument1.width;
          integerLocal2 = integerState0231;
          integerState0231 = integerState0231 + 1;
          integerArrayState0046[integerLocal2] = dDSurfaceDescArgument1.height;
          integerLocal3 = integerState0231;
          integerState0231 = integerState0231 + 1;
          integerArrayState0046[integerLocal3] = dDSurfaceDescArgument1.rgbBitCount;
          integerLocal4 = integerState0231;
          integerState0231 = integerState0231 + 1;
          integerArrayState0046[integerLocal4] = dDSurfaceDescArgument1.refreshRate;
        }
    }

    public PlatformSupport003() {
        this.directDrawState0001 = new com.ms.directX.DirectDraw();
        this.directDrawState0001.initialize((com.ms.com._Guid) null);
    }

    final int[] computeIntegerArray0577(int integerArgument1) {
        this.directDrawState0001.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        integerArrayState0046 = new int[integerState0231];
        integerState0231 = 0;
        this.directDrawState0001.enumDisplayModes(integerArgument1, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] integerArrayLocal1 = integerArrayState0046;
        int[] integerArrayLocal2 = integerArrayLocal1;
        integerArrayState0046 = null;
        integerState0231 = 0;
        return integerArrayLocal1;
    }
}
