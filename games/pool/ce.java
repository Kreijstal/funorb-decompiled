/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int field_b;
    private static int[] field_c;

    final int[] a(boolean param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((ce) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((ce) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (!param0) {
          int[] discarded$2 = ((ce) this).a(false);
          var3 = field_c;
          var2 = var3;
          field_b = 0;
          field_c = null;
          return var3;
        } else {
          var3 = field_c;
          var2 = var3;
          field_b = 0;
          field_c = null;
          return var3;
        }
    }

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        param0.setVisible(true);
        if (param2 <= 59) {
          var9 = null;
          ((ce) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((ce) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 17);
          ((ce) this).field_a.setDisplayMode(param3, param1, param4, param5, 0);
          param0.setBounds(0, 0, param3, param1);
          param0.toFront();
          param0.requestFocus();
          return;
        } else {
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((ce) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 17);
          ((ce) this).field_a.setDisplayMode(param3, param1, param4, param5, 0);
          param0.setBounds(0, 0, param3, param1);
          param0.toFront();
          param0.requestFocus();
          return;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        ((ce) this).field_a.restoreDisplayMode();
        ((ce) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0 != 0) {
            int[] discarded$0 = ((ce) this).a(true);
        }
    }

    public ce() {
        ((ce) this).field_a = new com.ms.directX.DirectDraw();
        ((ce) this).field_a.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_c == null) {
            field_b = field_b + 4;
        } else {
            field_b = field_b + 1;
            field_c[field_b] = param0.width;
            field_b = field_b + 1;
            field_c[field_b] = param0.height;
            field_b = field_b + 1;
            field_c[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_c[field_b] = param0.refreshRate;
        }
    }
}
