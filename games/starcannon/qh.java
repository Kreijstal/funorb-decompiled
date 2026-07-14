/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private static int field_c;
    private com.ms.directX.DirectDraw field_b;

    final void a(java.awt.Frame param0, int param1) {
        ((qh) this).field_b.restoreDisplayMode();
        ((qh) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, param1);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_a) {
            field_c = field_c + 4;
        } else {
            field_c = field_c + 1;
            field_a[field_c] = param0.width;
            field_c = field_c + 1;
            field_a[field_c] = param0.height;
            field_c = field_c + 1;
            field_a[field_c] = param0.rgbBitCount;
            field_c = field_c + 1;
            field_a[field_c] = param0.refreshRate;
        }
    }

    final int[] a(int param0) {
        ((qh) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_c];
        field_c = 0;
        ((qh) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_a;
        int[] var2 = var3;
        field_c = param0;
        field_a = null;
        return var3;
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, byte param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        param3.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((qh) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
        ((qh) this).field_b.setDisplayMode(param4, param1, param0, param2, 0);
        param3.setBounds(0, 0, param4, param1);
        if (param5 != -70) {
          var9 = null;
          ((qh) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    public qh() {
        ((qh) this).field_b = new com.ms.directX.DirectDraw();
        ((qh) this).field_b.initialize((com.ms.com._Guid) null);
    }
}
