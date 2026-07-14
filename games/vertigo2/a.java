/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_a == null) {
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

    final void a(java.awt.Frame param0, int param1) {
        ((a) this).field_b.restoreDisplayMode();
        if (param1 != 0) {
            return;
        }
        ((a) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, java.awt.Frame param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param5.setVisible(true);
        if (param2 != -70) {
          field_c = -32;
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((a) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((a) this).field_b.setDisplayMode(param0, param4, param3, param1, 0);
          param5.setBounds(0, 0, param0, param4);
          param5.toFront();
          param5.requestFocus();
          return;
        } else {
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((a) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((a) this).field_b.setDisplayMode(param0, param4, param3, param1, 0);
          param5.setBounds(0, 0, param0, param4);
          param5.toFront();
          param5.requestFocus();
          return;
        }
    }

    final int[] a(byte param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((a) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_c];
        field_c = 0;
        if (param0 >= -25) {
          return null;
        } else {
          ((a) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_c = 0;
          field_a = null;
          return var3;
        }
    }

    public a() {
        ((a) this).field_b = new com.ms.directX.DirectDraw();
        ((a) this).field_b.initialize((com.ms.com._Guid) null);
    }
}
