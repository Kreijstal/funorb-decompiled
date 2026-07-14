/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb implements com.ms.directX.IEnumModesCallback {
    private static int[] field_b;
    private com.ms.directX.DirectDraw field_a;
    private static int field_c;

    final void a(int param0, java.awt.Frame param1) {
        ((mb) this).field_a.restoreDisplayMode();
        ((mb) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0 != 7537) {
            Object var4 = null;
            ((mb) this).a(-77, (java.awt.Frame) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, param3, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((mb) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((mb) this).field_a.setDisplayMode(param1, param4, param2, param0, 0);
        param5.setBounds(0, 0, param1, param4);
        param5.toFront();
        param5.requestFocus();
    }

    final int[] a(int param0) {
        ((mb) this).field_a.enumDisplayModes(param0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_b = new int[field_c];
        field_c = 0;
        ((mb) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_b;
        int[] var2 = var3;
        field_c = 0;
        field_b = null;
        return var3;
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_b) {
            field_c = field_c + 4;
        } else {
            field_c = field_c + 1;
            field_b[field_c] = param0.width;
            field_c = field_c + 1;
            field_b[field_c] = param0.height;
            field_c = field_c + 1;
            field_b[field_c] = param0.rgbBitCount;
            field_c = field_c + 1;
            field_b[field_c] = param0.refreshRate;
        }
    }

    public mb() {
        ((mb) this).field_a = new com.ms.directX.DirectDraw();
        ((mb) this).field_a.initialize((com.ms.com._Guid) null);
    }
}
