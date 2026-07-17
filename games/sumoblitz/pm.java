/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    private int[] field_b;
    private bl field_a;
    private bl field_e;
    private hr field_d;
    private ha field_c;

    final static void a(int param0, int param1, hg param2) {
        pl var5 = null;
        int var4 = 0;
        try {
            var5 = as.field_v;
            var5.g(param0, 8);
            var5.field_p = var5.field_p + 1;
            var4 = var5.field_p;
            var5.b((byte) 39, 1);
            var5.b((byte) 99, param2.field_u);
            var5.b((byte) 63, param2.field_q);
            var5.e(48, param2.field_r);
            var5.e(48, param2.field_s);
            var5.e(48, param2.field_n);
            var5.e(48, param2.field_p);
            int discarded$0 = var5.a(var4, false);
            var5.c(var5.field_p + -var4, -13745);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pm.C(" + param0 + 44 + 1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(byte param0) {
        bl var2 = null;
        ((pm) this).field_c.K(((pm) this).field_b);
        if (param0 >= -40) {
          L0: {
            ((pm) this).field_e = null;
            if (((pm) this).field_a == null) {
              var2 = new bl();
              break L0;
            } else {
              var2 = ((pm) this).field_a;
              ((pm) this).field_a = ((pm) this).field_a.field_f;
              break L0;
            }
          }
          var2.a(((pm) this).field_e, ((pm) this).field_b[1], ((pm) this).field_b[2], ((pm) this).field_d, -1, ((pm) this).field_b[3], ((pm) this).field_b[0]);
          ((pm) this).field_e = var2;
          return;
        } else {
          L1: {
            if (((pm) this).field_a == null) {
              var2 = new bl();
              break L1;
            } else {
              var2 = ((pm) this).field_a;
              ((pm) this).field_a = ((pm) this).field_a.field_f;
              break L1;
            }
          }
          var2.a(((pm) this).field_e, ((pm) this).field_b[1], ((pm) this).field_b[2], ((pm) this).field_d, -1, ((pm) this).field_b[3], ((pm) this).field_b[0]);
          ((pm) this).field_e = var2;
          return;
        }
    }

    final void a(int param0) {
        bl var2 = null;
        bl var3 = null;
        if (((pm) this).field_d == ((pm) this).field_e.field_h) {
          ((pm) this).field_c.KA(((pm) this).field_e.field_c, ((pm) this).field_e.field_b, ((pm) this).field_e.field_d, ((pm) this).field_e.field_g);
          var3 = ((pm) this).field_e;
          var2 = var3;
          ((pm) this).field_e = ((pm) this).field_e.field_f;
          if (param0 == 29709) {
            var3.field_f = ((pm) this).field_a;
            ((pm) this).field_a = var3;
            var3.field_h = null;
            return;
          } else {
            this.a((byte) 28);
            var3.field_f = ((pm) this).field_a;
            ((pm) this).field_a = var3;
            var3.field_h = null;
            return;
          }
        } else {
          ((pm) this).field_c.b();
          if (null == ((pm) this).field_e.field_h) {
            ((pm) this).field_d = ((pm) this).field_e.field_h;
            ((pm) this).field_c.KA(((pm) this).field_e.field_c, ((pm) this).field_e.field_b, ((pm) this).field_e.field_d, ((pm) this).field_e.field_g);
            var3 = ((pm) this).field_e;
            var2 = var3;
            ((pm) this).field_e = ((pm) this).field_e.field_f;
            if (param0 == 29709) {
              var3.field_f = ((pm) this).field_a;
              ((pm) this).field_a = var3;
              var3.field_h = null;
              return;
            } else {
              this.a((byte) 28);
              var3.field_f = ((pm) this).field_a;
              ((pm) this).field_a = var3;
              var3.field_h = null;
              return;
            }
          } else {
            ((pm) this).field_c.a(((pm) this).field_e.field_h, true);
            ((pm) this).field_d = ((pm) this).field_e.field_h;
            ((pm) this).field_c.KA(((pm) this).field_e.field_c, ((pm) this).field_e.field_b, ((pm) this).field_e.field_d, ((pm) this).field_e.field_g);
            var3 = ((pm) this).field_e;
            var2 = var3;
            ((pm) this).field_e = ((pm) this).field_e.field_f;
            if (param0 == 29709) {
              var3.field_f = ((pm) this).field_a;
              ((pm) this).field_a = var3;
              var3.field_h = null;
              return;
            } else {
              this.a((byte) 28);
              var3.field_f = ((pm) this).field_a;
              ((pm) this).field_a = var3;
              var3.field_h = null;
              return;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        this.a((byte) -50);
        ((pm) this).field_c.T(param3, param1, param4, param2);
        int var6 = -53 / ((param0 - -29) / 57);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = ic.b(param2, -431);
        int var4 = cn.c(0, param2);
        int var5 = ic.b(param1, -431);
        int var6 = cn.c(0, param1);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    pm(ha param0) {
        ((pm) this).field_b = new int[4];
        ((pm) this).field_d = null;
        try {
            ((pm) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
