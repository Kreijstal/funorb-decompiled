/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wdb extends Widget {
    static Widget field_Ab;
    Widget field_zb;
    static int field_vb;
    soa field_xb;
    Widget field_wb;
    Widget field_yb;

    wdb(long param0, wdb param1, String param2, String param3) {
        this(param0, param1, param1.field_xb.field_xb, param1.field_xb.field_vb, param1.field_wb, param2, param3);
    }

    wdb(long param0, Widget param1, Widget param2, pjb param3, Widget param4, String param5, String param6) {
        super(param0, param1);
        try {
          this.field_yb = new Widget(0L, (Widget) null);
          this.field_xb = new soa(0L, this.field_yb, param2, param3);
          this.field_wb = new Widget(0L, param4);
          this.field_zb = new Widget(0L, param4);
          this.field_wb.text = param5;
          this.field_zb.text = param6;
          this.addChild(-561, this.field_xb);
          this.addChild(-561, this.field_wb);
          this.addChild(-561, this.field_zb);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "wdb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_Ab = null;
        if (param0 < 126) {
          field_vb = 24;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = (this.width + param0) / 2;
        int var6 = -param1 + this.height;
        this.field_xb.a(this.width, param0, -1, -param0 + var6, 0, 0, param2);
        this.field_wb.y = var6;
        this.field_wb.x = 0;
        this.field_wb.width = -param0 + var5;
        if (param3 == 63) {
          this.field_wb.height = param1;
          this.field_zb.y = var6;
          this.field_zb.x = var5;
          this.field_zb.width = this.width - var5;
          this.field_zb.height = param1;
          return;
        }
        this.a(84, -31, 113, -108, 43, -89, 51, 115);
        this.field_wb.height = param1;
        this.field_zb.y = var6;
        this.field_zb.x = var5;
        this.field_zb.width = this.width - var5;
        this.field_zb.height = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.height = param4;
        this.y = param1;
        this.width = param5;
        if (param6 == 0) {
          this.x = param0;
          this.a(param7, param2, param3, (byte) 63);
          return;
        }
        this.a(-108, 59, -20, (byte) -43);
        this.x = param0;
        this.a(param7, param2, param3, (byte) 63);
    }

    static {
        field_vb = 0;
    }
}
