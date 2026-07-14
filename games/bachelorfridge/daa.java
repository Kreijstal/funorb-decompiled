/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class daa extends sna {
    private sna field_xb;
    private sna field_wb;
    static volatile boolean field_vb;

    final static vr c(int param0, int param1) {
        int var2 = 62 % ((-2 - param0) / 55);
        return qma.a(true, 2097152, false, 1, false, param1);
    }

    private daa(long param0, sna param1, sna param2, String param3) {
        super(param0, (sna) null);
        ((daa) this).field_wb = new sna(0L, param1);
        ((daa) this).field_xb = new sna(0L, param2);
        ((daa) this).field_xb.field_Z = param3;
        ((daa) this).a(-1, ((daa) this).field_wb);
        ((daa) this).a(-1, ((daa) this).field_xb);
        ((daa) this).d((byte) 116);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        ((daa) this).a(param1, 31407, param4, param2, param5);
        this.a(param3, (byte) -108);
        if (param0 != -42) {
            field_vb = true;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -101) {
          ((daa) this).field_wb = null;
          return param1 + (((daa) this).field_wb.e(-1) + ((daa) this).field_xb.e(-1));
        } else {
          return param1 + (((daa) this).field_wb.e(-1) + ((daa) this).field_xb.e(-1));
        }
    }

    daa(long param0, daa param1, String param2) {
        this(param0, param1.field_wb, param1.field_xb, param2);
    }

    daa(long param0, kv param1, kv param2, int param3, sna param4, String param5) {
        this(param0, (sna) null, param4, param5);
        ((daa) this).field_wb.field_v = param2;
        ((daa) this).field_wb.field_Y = param3;
        ((daa) this).field_wb.field_J = param1;
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        ((daa) this).field_wb.a(((daa) this).field_p, 31407, ((daa) this).field_wb.e(-1), 0, 0);
        if (param1 > -9) {
          ((daa) this).a((byte) -67, -74, -46, -17, -10, -3);
          var3 = param0 + ((daa) this).field_wb.field_sb;
          ((daa) this).field_xb.a(((daa) this).field_p, 31407, -var3 + ((daa) this).field_sb, var3, 0);
          return;
        } else {
          var3 = param0 + ((daa) this).field_wb.field_sb;
          ((daa) this).field_xb.a(((daa) this).field_p, 31407, -var3 + ((daa) this).field_sb, var3, 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = false;
    }
}
