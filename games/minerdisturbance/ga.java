/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private static int[] field_b;
    private com.ms.directX.DirectDraw field_a;

    final int[] a(int param0) {
        ((ga) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_b = new int[field_c];
        field_c = 0;
        ((ga) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_b;
        int[] var2 = var3;
        field_c = param0;
        field_b = null;
        return var3;
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_b == null) {
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

    final void a(byte param0, java.awt.Frame param1) {
        ((ga) this).field_a.restoreDisplayMode();
        ((ga) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0 >= -83) {
            ((ga) this).field_a = null;
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Frame param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        if (param2 <= 112) {
          var9 = null;
          ((ga) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          param3.setVisible(true);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((ga) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
          ((ga) this).field_a.setDisplayMode(param1, param4, param5, param0, 0);
          param3.setBounds(0, 0, param1, param4);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          param3.setVisible(true);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((ga) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
          ((ga) this).field_a.setDisplayMode(param1, param4, param5, param0, 0);
          param3.setBounds(0, 0, param1, param4);
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    public ga() {
        ((ga) this).field_a = new com.ms.directX.DirectDraw();
        ((ga) this).field_a.initialize((com.ms.com._Guid) null);
    }
}
