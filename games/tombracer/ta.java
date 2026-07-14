/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends jea {
    static int[] field_vb;
    static ka[] field_ub;
    private jea field_wb;
    private jea field_tb;

    ta(long param0, iu param1, iu param2, int param3, jea param4, String param5) {
        this(param0, (jea) null, param4, param5);
        ((ta) this).field_wb.field_bb = param3;
        ((ta) this).field_wb.field_R = param2;
        ((ta) this).field_wb.field_lb = param1;
    }

    final int a(byte param0, int param1) {
        if (param0 != 95) {
          ((ta) this).field_tb = null;
          return ((ta) this).field_wb.b((byte) 69) - (-param1 - ((ta) this).field_tb.b((byte) 69));
        } else {
          return ((ta) this).field_wb.b((byte) 69) - (-param1 - ((ta) this).field_tb.b((byte) 69));
        }
    }

    ta(long param0, ta param1, String param2) {
        this(param0, param1.field_wb, param1.field_tb, param2);
    }

    private final void b(byte param0, int param1) {
        int var3 = 0;
        if (param0 <= 109) {
          field_ub = null;
          ((ta) this).field_wb.a(((ta) this).field_wb.b((byte) 69), ((ta) this).field_t, -23776, 0, 0);
          var3 = param1 + ((ta) this).field_wb.field_G;
          ((ta) this).field_tb.a(((ta) this).field_G - var3, ((ta) this).field_t, -23776, 0, var3);
          return;
        } else {
          ((ta) this).field_wb.a(((ta) this).field_wb.b((byte) 69), ((ta) this).field_t, -23776, 0, 0);
          var3 = param1 + ((ta) this).field_wb.field_G;
          ((ta) this).field_tb.a(((ta) this).field_G - var3, ((ta) this).field_t, -23776, 0, var3);
          return;
        }
    }

    private ta(long param0, jea param1, jea param2, String param3) {
        super(param0, (jea) null);
        ((ta) this).field_wb = new jea(0L, param1);
        ((ta) this).field_tb = new jea(0L, param2);
        ((ta) this).field_tb.field_r = param3;
        ((ta) this).b(-124, ((ta) this).field_wb);
        ((ta) this).b(-124, ((ta) this).field_tb);
        ((ta) this).a(-10966);
    }

    public static void d(byte param0) {
        field_vb = null;
        if (param0 != -17) {
            field_ub = null;
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    final static g d(int param0, boolean param1) {
        g[] var2 = null;
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        g[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = qg.field_a;
        var2 = var6;
        if (!param1) {
          var3 = 0;
          L0: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (param0 == var4.field_a) {
                return var4;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          g discarded$4 = ta.d(32, false);
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (param0 == var4.field_a) {
                return var4;
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 > -85) {
            return;
        }
        ((ta) this).a(param0, param4, -23776, param1, param5);
        this.b((byte) 123, param3);
    }

    final static void a(iu[][] param0, String[][] param1, int[] param2, int param3, cn param4, int param5, hja[] param6, byte[] param7, byte[] param8, String[][] param9, String[] param10, cn param11, byte param12, int[] param13, iu[][] param14, cn param15, boolean param16) {
        Object var18 = null;
        lba.a(param5, 1, param4, param16, param0, param13, param1, param11, param2, param10, param6, param9, (String[]) null, param14, param15, param3, 1, param7, param8);
        int var17 = -112 / ((66 - param12) / 41);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = new int[]{190, 280, 400, 440, 490, 246};
    }
}
