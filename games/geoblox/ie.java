/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((ie) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (param0 != 8) {
          int[] discarded$1 = ((ie) this).a(-65);
          field_a = new int[field_b];
          field_b = 0;
          ((ie) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_b = 0;
          field_a = null;
          return var3;
        } else {
          field_a = new int[field_b];
          field_b = 0;
          ((ie) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_b = 0;
          field_a = null;
          return var3;
        }
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, int param5) {
        param2.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, param0);
        ((ie) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param2, 17);
        ((ie) this).field_c.setDisplayMode(param1, param4, param3, param5, 0);
        param2.setBounds(0, 0, param1, param4);
        param2.toFront();
        param2.requestFocus();
    }

    final void a(int param0, java.awt.Frame param1) {
        ((ie) this).field_c.restoreDisplayMode();
        ((ie) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        int var3 = 64 % ((param0 - 40) / 63);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_a != null) {
            field_b = field_b + 1;
            field_a[field_b] = param0.width;
            field_b = field_b + 1;
            field_a[field_b] = param0.height;
            field_b = field_b + 1;
            field_a[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_a[field_b] = param0.refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    public ie() {
        ((ie) this).field_c = new com.ms.directX.DirectDraw();
        ((ie) this).field_c.initialize((com.ms.com._Guid) null);
    }
}
