/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl implements com.ms.directX.IEnumModesCallback {
    private static int[] field_b;
    private com.ms.directX.DirectDraw field_c;
    private static int field_a;

    final int[] a(byte param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((sl) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_b = new int[field_a];
        field_a = 0;
        ((sl) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        var3 = field_b;
        var2 = var3;
        if (param0 < 29) {
          return null;
        } else {
          field_b = null;
          field_a = 0;
          return var3;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_b == null) {
            field_a = field_a + 4;
        } else {
            field_a = field_a + 1;
            field_b[field_a] = param0.width;
            field_a = field_a + 1;
            field_b[field_a] = param0.height;
            field_a = field_a + 1;
            field_b[field_a] = param0.rgbBitCount;
            field_a = field_a + 1;
            field_b[field_a] = param0.refreshRate;
        }
    }

    final void a(java.awt.Frame param0, int param1) {
        ((sl) this).field_c.restoreDisplayMode();
        if (param1 != -7738) {
            return;
        }
        ((sl) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    public sl() {
        ((sl) this).field_c = new com.ms.directX.DirectDraw();
        ((sl) this).field_c.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, int param1, int param2, int param3, java.awt.Frame param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        param4.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((sl) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param4, 17);
        ((sl) this).field_c.setDisplayMode(param1, param0, param5, param3, 0);
        param4.setBounds(0, 0, param1, param0);
        param4.toFront();
        param4.requestFocus();
        if (param2 != -7018) {
          var9 = null;
          ((sl) this).a((java.awt.Frame) null, 125);
          return;
        } else {
          return;
        }
    }
}
