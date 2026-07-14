/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private static int[] field_c;
    private com.ms.directX.DirectDraw field_a;

    final void a(java.awt.Frame param0, byte param1) {
        ((t) this).field_a.restoreDisplayMode();
        ((t) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
        if (param1 != 6) {
            field_c = null;
        }
    }

    final int[] a(int param0) {
        ((t) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = param0;
        ((t) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_c;
        int[] var2 = var3;
        field_c = null;
        field_b = 0;
        return var3;
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        param3.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        if (param0 <= 17) {
          var9 = null;
          ((t) this).a((java.awt.Frame) null, (byte) 119);
          int discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((t) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
          ((t) this).field_a.setDisplayMode(param4, param2, param1, param5, 0);
          param3.setBounds(0, 0, param4, param2);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((t) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
          ((t) this).field_a.setDisplayMode(param4, param2, param1, param5, 0);
          param3.setBounds(0, 0, param4, param2);
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_c != null) {
            field_b = field_b + 1;
            field_c[field_b] = param0.width;
            field_b = field_b + 1;
            field_c[field_b] = param0.height;
            field_b = field_b + 1;
            field_c[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_c[field_b] = param0.refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    public t() {
        ((t) this).field_a = new com.ms.directX.DirectDraw();
        ((t) this).field_a.initialize((com.ms.com._Guid) null);
    }
}
