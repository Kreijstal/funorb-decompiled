/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;
    private static int field_b;

    final void a(java.awt.Frame param0, int param1) {
        ((go) this).field_a.restoreDisplayMode();
        if (param1 != 6411) {
            return;
        }
        ((go) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, java.awt.Frame param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        if (param4 < 64) {
          int[] discarded$5 = ((go) this).a(-19);
          param5.setVisible(true);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((go) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((go) this).field_a.setDisplayMode(param1, param3, param0, param2, 0);
          param5.setBounds(0, 0, param1, param3);
          param5.toFront();
          param5.requestFocus();
          return;
        } else {
          param5.setVisible(true);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$8 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$9 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((go) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((go) this).field_a.setDisplayMode(param1, param3, param0, param2, 0);
          param5.setBounds(0, 0, param1, param3);
          param5.toFront();
          param5.requestFocus();
          return;
        }
    }

    public go() {
        ((go) this).field_a = new com.ms.directX.DirectDraw();
        ((go) this).field_a.initialize((com.ms.com._Guid) null);
    }

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((go) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((go) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        var3 = field_c;
        var2 = var3;
        field_c = null;
        if (param0 != 8) {
          return null;
        } else {
          field_b = 0;
          return var3;
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
}
