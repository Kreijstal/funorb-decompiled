/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ie extends ah {
    int field_t;
    int field_x;
    static pf field_u;
    int field_w;
    int field_v;
    int field_s;
    int field_y;
    static boolean field_r;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = -72 / ((param3 - -46) / 58);
        this.b(param0 << 8, param1 << 5, 1529956675, param4, param2);
    }

    final static void d(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = stellarshard.field_B;
        try {
          L0: {
            if (!sf.b(false)) {
              L1: {
                if (pd.field_f == null) {
                  break L1;
                } else {
                  if (pd.field_f.field_c) {
                    ih.b((byte) -25);
                    dg.field_z.a((byte) -111, (rj) (Object) new ia(dg.field_z, nb.field_K));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$7 = dg.field_z.a(true, (byte) -128, li.field_d, af.field_q);
              dg.field_z.f((byte) -127);
              L2: while (true) {
                if (!qh.c(119)) {
                  break L0;
                } else {
                  boolean discarded$8 = dg.field_z.a(gi.field_f, uc.field_b, true);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "ie.VA(" + -56 + 41);
        }
    }

    public static void e(int param0) {
        field_u = null;
    }

    ie() {
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param2 != 1529956675) {
          field_u = null;
          var6 = ((ie) this).field_w << 3;
          var7 = ((ie) this).field_x << 3;
          param4 = (15 & var6) + (param4 << 4);
          param3 = (param3 << 4) - -(15 & var7);
          ((ie) this).a(var6, var7, param4, param3, param0, param1);
          return;
        } else {
          var6 = ((ie) this).field_w << 3;
          var7 = ((ie) this).field_x << 3;
          param4 = (15 & var6) + (param4 << 4);
          param3 = (param3 << 4) - -(15 & var7);
          ((ie) this).a(var6, var7, param4, param3, param0, param1);
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    static {
    }
}
