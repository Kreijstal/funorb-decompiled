/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa extends UiComponent {
    private UiComponent field_xb;
    private UiComponent field_wb;
    static volatile boolean field_vb;

    final static vr c(int param0, int param1) {
        int var2 = 62 % ((-2 - param0) / 55);
        return qma.a(true, 2097152, false, 1, false, param1);
    }

    private daa(long param0, UiComponent param1, UiComponent param2, String param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_wb = new UiComponent(0L, param1);
          this.field_xb = new UiComponent(0L, param2);
          this.field_xb.field_Z = param3;
          this.a(-1, this.field_wb);
          this.a(-1, this.field_xb);
          this.d((byte) 116);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "daa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(param1, 31407, param4, param2, param5);
        this.a(param3, (byte) -108);
        if (param0 != -42) {
          field_vb = true;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 < -101) {
          return param1 + (this.field_wb.e(-1) + this.field_xb.e(-1));
        }
        this.field_wb = (UiComponent) null;
        return param1 + (this.field_wb.e(-1) + this.field_xb.e(-1));
    }

    daa(long param0, daa param1, String param2) {
        this(param0, param1.field_wb, param1.field_xb, param2);
    }

    daa(long param0, Sprite param1, Sprite param2, int param3, UiComponent param4, String param5) {
        this(param0, (UiComponent) null, param4, param5);
        try {
          this.field_wb.field_v = param2;
          this.field_wb.field_Y = param3;
          this.field_wb.field_J = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "daa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var3Lifetime1;
        this.field_wb.a(this.field_p, 31407, this.field_wb.e(-1), 0, 0);
        if (param1 <= -9) {
          var3 = param0 + this.field_wb.field_sb;
          this.field_xb.a(this.field_p, 31407, -var3 + this.field_sb, var3, 0);
          return;
        }
        this.a((byte) -67, -74, -46, -17, -10, -3);
        var3Lifetime1 = param0 + this.field_wb.field_sb;
        this.field_xb.a(this.field_p, 31407, -var3Lifetime1 + this.field_sb, var3Lifetime1, 0);
    }

    static {
        field_vb = false;
    }
}
