/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null != field_c) {
            field_b = field_b + 1;
            field_c[field_b] = ((com.ms.directX.DDSurfaceDesc) param0).width;
            field_b = field_b + 1;
            field_c[field_b] = ((com.ms.directX.DDSurfaceDesc) param0).height;
            field_b = field_b + 1;
            field_c[field_b] = ((com.ms.directX.DDSurfaceDesc) param0).rgbBitCount;
            field_b = field_b + 1;
            field_c[field_b] = ((com.ms.directX.DDSurfaceDesc) param0).refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    final int[] a(int param0) {
        ((l) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((l) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_c;
        int[] var2 = var3;
        field_b = param0;
        field_c = null;
        return var3;
    }

    final void a(java.awt.Frame param0, int param1) {
        ((l) this).field_a.restoreDisplayMode();
        int var3 = -30 / ((param1 - 35) / 50);
        ((l) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int var9 = 99 % ((param0 - 57) / 53);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((l) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((l) this).field_a.setDisplayMode(param2, param1, param3, param4, 0);
        param5.setBounds(0, 0, param2, param1);
        param5.toFront();
        param5.requestFocus();
    }

    public l() {
        ((l) this).field_a = new com.ms.directX.DirectDraw();
        ((l) this).field_a.initialize((com.ms.com._Guid) null);
    }
}
