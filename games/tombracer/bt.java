/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt implements fo {
    private boolean field_g;
    static int field_b;
    oo field_a;
    private boolean field_f;
    private bua field_d;
    aia field_e;
    static jea[] field_c;
    static int[] field_h;

    public final int c(byte param0) {
        if (param0 <= 91) {
            return 125;
        }
        return ((bt) this).field_a.c((byte) 112) - -((bt) this).field_e.f(0);
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_c = null;
    }

    public final void a(int param0, iq param1) {
        int var3_int = 0;
        int var4 = 0;
        ka var5 = null;
        try {
            var3_int = ((bt) this).field_e.d(2);
            var4 = dfa.a(-(im.a(ne.field_f[var3_int][1], ne.field_f[var3_int][0], 1) >> 2) + 512, 2048, 73);
            if (param0 < 103) {
                int discarded$0 = bt.a((byte) 44, -55, -63, 37);
            }
            var5 = ((bt) this).field_d.b((byte) 74);
            gqa.a(var4, -83584144, ((bt) this).c((byte) 120), ((bt) this).b((byte) -89), var5, ((bt) this).e((byte) -95));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bt.DB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void f(int param0) {
        if (((bt) this).field_e.b(180)) {
            if (!(((bt) this).field_g)) {
                ((bt) this).field_d.a(1, false, (byte) -85, 9);
                ((bt) this).field_d.a(6, ((bt) this).field_d.c((byte) 50), 1, -1);
            }
            ((bt) this).field_f = false;
            ((bt) this).field_g = true;
        } else {
            if (!(((bt) this).field_f)) {
                ((bt) this).field_d.a(1, false, (byte) 120, 8);
                ((bt) this).field_d.a(7, ((bt) this).field_d.c((byte) -97), 1, -1);
            }
            ((bt) this).field_f = true;
            ((bt) this).field_g = false;
        }
        if (param0 != -4366) {
            field_h = null;
        } else {
            ((bt) this).field_d.a(0);
            return;
        }
        ((bt) this).field_d.a(0);
    }

    public final int b(byte param0) {
        int var2 = -13 / ((-23 - param0) / 53);
        return ((bt) this).field_a.b((byte) 101) + ((bt) this).field_e.a((byte) 84);
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (bea.field_g < param3 + param1) {
          if (param0 == -8) {
            if (-param1 + param3 + param2 >= 0) {
              return -param1 + param2 + param3;
            } else {
              return -param1 + bea.field_g;
            }
          } else {
            int discarded$8 = bt.a((byte) 51, -70, 71, 100);
            if (-param1 + param3 + param2 >= 0) {
              return -param1 + param2 + param3;
            } else {
              return -param1 + bea.field_g;
            }
          }
        } else {
          return param3;
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            ((bt) this).field_e = null;
            return ((bt) this).field_a.d((byte) 48);
        }
        return ((bt) this).field_a.d((byte) 48);
    }

    bt() {
        ((bt) this).field_d = new bua(6, 4, 1);
        ((bt) this).field_d.a(1, true, (byte) -102, 7);
        ((bt) this).field_f = true;
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            bt.a(-6);
            return ((bt) this).field_a.e((byte) -94);
        }
        return ((bt) this).field_a.e((byte) -94);
    }

    static {
    }
}
