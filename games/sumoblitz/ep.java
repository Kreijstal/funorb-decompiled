/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep implements com.ms.directX.IEnumModesCallback {
    private static int field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int[] field_c;

    final int[] a(byte param0) {
        ((ep) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_a];
        field_a = 0;
        ((ep) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var4 = field_c;
        int[] var2 = var4;
        int var3 = 49 / ((-45 - param0) / 43);
        field_a = 0;
        field_c = null;
        return var4;
    }

    final void a(java.awt.Frame param0, int param1) {
        ((ep) this).field_b.restoreDisplayMode();
        ((ep) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, param1);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, java.awt.Frame param5) {
        int var7 = 40 % ((param1 - 26) / 61);
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var8 = null;
        int var9 = var8.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var9, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var9, -20, 8);
        ((ep) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((ep) this).field_b.setDisplayMode(param2, param0, param4, param3, 0);
        param5.setBounds(0, 0, param2, param0);
        param5.toFront();
        param5.requestFocus();
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_c != null) {
            field_a = field_a + 1;
            field_c[field_a] = param0.width;
            field_a = field_a + 1;
            field_c[field_a] = param0.height;
            field_a = field_a + 1;
            field_c[field_a] = param0.rgbBitCount;
            field_a = field_a + 1;
            field_c[field_a] = param0.refreshRate;
        } else {
            field_a = field_a + 4;
        }
    }

    public ep() {
        ((ep) this).field_b = new com.ms.directX.DirectDraw();
        ((ep) this).field_b.initialize((com.ms.com._Guid) null);
    }
}
