/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private com.ms.directX.DirectDraw field_b;
    private static int[] field_a;

    public cj() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, boolean param1, int param2, java.awt.Frame param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        param3.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
        this.field_b.setDisplayMode(param2, param4, param5, param0, 0);
        param3.setBounds(0, 0, param2, param4);
        if (param1) {
          var9 = (java.awt.Frame) null;
          this.a(-57, (java.awt.Frame) null);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    final int[] a(boolean param0) {
        int[] var2 = null;
        int[] var3 = null;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_c];
        field_c = 0;
        if (!param0) {
          return (int[]) null;
        } else {
          this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          var3 = field_a;
          var2 = var3;
          field_a = null;
          field_c = 0;
          return var3;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (field_a != null) {
            fieldTemp$1 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$1] = param0.width;
            fieldTemp$2 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$2] = param0.height;
            fieldTemp$3 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$3] = param0.rgbBitCount;
            fieldTemp$4 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$4] = param0.refreshRate;
        } else {
            field_c = field_c + 4;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        com.ms.com.IUnknown var4 = null;
        this.field_b.restoreDisplayMode();
        if (param0 <= 54) {
          var4 = (com.ms.com.IUnknown) null;
          this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        } else {
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
    }
}
