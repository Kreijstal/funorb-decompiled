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
        this.b(param0 << -1634941624, param1 << -121719675, 1529956675, param4, param2);
    }

    final static void d(byte param0) {
        int var2 = 0;
        var2 = stellarshard.field_B;
        if (!sf.b(false)) {
          if (pd.field_f != null) {
            if (!pd.field_f.field_c) {
              return;
            } else {
              ih.b((byte) -25);
              dg.field_z.a((byte) -111, (rj) (Object) new ia(dg.field_z, nb.field_K));
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$11 = dg.field_z.a(true, (byte) -128, li.field_d, af.field_q);
          if (param0 >= -33) {
            return;
          } else {
            dg.field_z.f((byte) -127);
            L0: while (true) {
              if (!qh.c(119)) {
                return;
              } else {
                boolean discarded$12 = dg.field_z.a(gi.field_f, uc.field_b, true);
                continue L0;
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_u = null;
        if (param0 != -28692) {
            field_r = false;
        }
    }

    ie() {
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param2 != 1529956675) {
          field_u = null;
          var6 = ((ie) this).field_w << 1674417859;
          var7 = ((ie) this).field_x << 1529956675;
          param4 = (15 & var6) + (param4 << -1807559964);
          param3 = (param3 << -648468668) - -(15 & var7);
          ((ie) this).a(var6, var7, param4, param3, param0, param1);
          return;
        } else {
          var6 = ((ie) this).field_w << 1674417859;
          var7 = ((ie) this).field_x << 1529956675;
          param4 = (15 & var6) + (param4 << -1807559964);
          param3 = (param3 << -648468668) - -(15 & var7);
          ((ie) this).a(var6, var7, param4, param3, param0, param1);
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    static {
    }
}
