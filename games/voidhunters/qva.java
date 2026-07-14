/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qva extends kva implements hdb {
    static gj field_k;
    static oib field_j;

    public final void b(int param0) {
        super.b(param0);
    }

    qva(jp param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, qua.field_d, mj.field_f, 6 * param1 * param1, param2);
        int var5 = 0;
        int var7 = 0;
        ((qva) this).field_h.a((ura) this, -110);
        if (!param2) {
          var7 = 0;
          var5 = var7;
          L0: while (true) {
            if ((var7 ^ -1) > -7) {
              jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, ((qva) this).e((byte) -31), param1, param1, 0, una.a(-29328, ((qva) this).field_f), ((qva) this).field_h.field_Nc, param3[var7], 0);
              var7++;
              continue L0;
            } else {
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (-7 < (var5 ^ -1)) {
              ((qva) this).a((byte) 14, 34069 - -var5, param1, param1, param3[var5]);
              var5++;
              continue L1;
            } else {
            }
          }
        }
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 6) {
            qva.a(-55);
            field_k = null;
            return;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new gj();
        field_j = null;
    }
}
