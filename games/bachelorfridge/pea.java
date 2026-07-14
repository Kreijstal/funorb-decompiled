/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea extends pp {
    static kv field_k;
    static String field_l;
    private int field_j;
    private int field_i;

    final void a(aga param0, op param1, int param2) {
        aga var4 = null;
        L0: {
          var4 = null;
          if (null == ((pea) this).field_h) {
            break L0;
          } else {
            var4 = ((pea) this).field_h.a(116, param1);
            break L0;
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            var4 = param1.c(((pea) this).field_j, ((pea) this).field_i, 112);
            break L1;
          }
        }
        if (var4 != null) {
          if (param2 != 12) {
            return;
          } else {
            var4.field_A = false;
            return;
          }
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_l = null;
        if (param0 != 116) {
            pea.e((byte) -2);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(lu param0, byte param1) {
        int var3 = 23 % ((param1 - 34) / 58);
        this.a(param0, (byte) 113);
        er.a(((pea) this).field_h, 115, param0);
        param0.d(((pea) this).field_j, 0);
        param0.d(((pea) this).field_i, 0);
    }

    pea(nq param0, int param1, int param2) {
        ((pea) this).field_i = param2;
        ((pea) this).field_h = param0;
        ((pea) this).field_j = param1;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        var1 = 0;
        L0: while (true) {
          if (rn.field_s.field_g.field_m.length <= var1) {
            if (param0 <= 113) {
              pea.e((byte) 34);
              return;
            } else {
              return;
            }
          } else {
            rn.field_s.field_g.field_m[var1] = -1;
            var1++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Drag and drop some food into the fridge.";
    }
}
