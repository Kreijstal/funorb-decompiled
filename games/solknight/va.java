/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class va {
    static nc field_f;
    static o field_g;
    hl field_m;
    hl field_i;
    hl field_d;
    hl field_k;
    long field_b;
    int field_j;
    gb field_e;
    byte field_n;
    volatile int field_c;
    gb field_h;
    volatile int field_l;
    ic field_a;

    abstract void c(byte param0);

    abstract void a(boolean param0, byte param1, Object param2);

    abstract void a(byte param0);

    final int c(int param0) {
        int var2 = -5 % ((param0 + 88) / 37);
        return this.field_d.a(-29749) + this.field_k.a(-29749);
    }

    final static String a(boolean param0) {
        if (!param0) {
          field_g = (o) null;
          if (ab.field_u) {
            return null;
          }
          if (kk.field_d < kg.field_e) {
            return null;
          }
          if (kk.field_d < kg.field_e + wi.field_l) {
            return s.field_ib;
          }
          return null;
        }
        if (ab.field_u) {
          return null;
        }
        if (kk.field_d < kg.field_e) {
          return null;
        }
        if (kk.field_d < kg.field_e + wi.field_l) {
          return s.field_ib;
        }
        return null;
    }

    abstract boolean d(byte param0);

    final ic a(int param0, boolean param1, int param2, int param3, byte param4) {
        ic stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        long var6;
        ic var8;
        var6 = (long)param2 + ((long)param0 << 32);
        var8 = new ic();
        var8.field_l = var6;
        stackIn_2_0 = var8;
        stackIn_3_1 = (!param1) ? false : true;
        stackIn_2_0.field_r = stackIn_3_1;
        var8.field_y = param4;
        if (param3 != 437409504) {
          this.d((byte) -77);
        }
        if (!param1) {
          if (this.c(125) >= 20) {
            throw new RuntimeException();
          }
          this.field_d.a(var8, param3 - 437409504);
          return var8;
        }
        if (this.b(false) >= 20) {
          throw new RuntimeException();
        }
        this.field_m.a(var8, 0);
        return var8;
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 != 0) {
          field_g = (o) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final boolean a(int param0) {
        if (param0 != -5868) {
          return true;
        }
        return this.c(-49) >= 20 ? true : false;
    }

    final boolean b(int param0) {
        if (param0 == -21) {
          return 20 <= this.b(false) ? true : false;
        }
        this.field_m = (hl) null;
        return 20 <= this.b(false) ? true : false;
    }

    final int b(boolean param0) {
        if (!param0) {
          return this.field_m.a(-29749) + this.field_i.a(-29749);
        }
        this.a((byte) -33);
        return this.field_m.a(-29749) + this.field_i.a(-29749);
    }

    va() {
        this.field_m = new hl();
        this.field_i = new hl();
        this.field_d = new hl();
        this.field_k = new hl();
        this.field_e = new gb(6);
        this.field_n = (byte) 0;
        this.field_l = 0;
        this.field_c = 0;
        this.field_h = new gb(10);
    }

    static {
    }
}
