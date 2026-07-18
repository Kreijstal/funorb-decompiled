/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;

    final void a(int param0, boolean param1, int param2, int param3, int param4, java.awt.Frame param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param5.setVisible(true);
        var7 = null;
        if (param1) {
          field_c = -20;
          var8 = var7.getHwnd();
          int discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((fg) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((fg) this).field_b.setDisplayMode(param2, param3, param0, param4, 0);
          param5.setBounds(0, 0, param2, param3);
          param5.toFront();
          param5.requestFocus();
          return;
        } else {
          var8 = var7.getHwnd();
          int discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((fg) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
          ((fg) this).field_b.setDisplayMode(param2, param3, param0, param4, 0);
          param5.setBounds(0, 0, param2, param3);
          param5.toFront();
          param5.requestFocus();
          return;
        }
    }

    final void a(java.awt.Frame param0, byte param1) {
        Object var4 = null;
        ((fg) this).field_b.restoreDisplayMode();
        if (param1 < 121) {
          var4 = null;
          ((fg) this).a((java.awt.Frame) null, (byte) 18);
          ((fg) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
          return;
        } else {
          ((fg) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
          return;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_a) {
            field_c = field_c + 4;
        } else {
            int fieldTemp$0 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$0] = param0.width;
            int fieldTemp$1 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$1] = param0.height;
            int fieldTemp$2 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$2] = param0.rgbBitCount;
            int fieldTemp$3 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$3] = param0.refreshRate;
        }
    }

    public fg() {
        ((fg) this).field_b = new com.ms.directX.DirectDraw();
        ((fg) this).field_b.initialize((com.ms.com._Guid) null);
    }

    final int[] a(int param0) {
        ((fg) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_c];
        field_c = 0;
        ((fg) this).field_b.enumDisplayModes(param0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_a;
        int[] var2 = var3;
        field_a = null;
        field_c = 0;
        return var3;
    }
}
