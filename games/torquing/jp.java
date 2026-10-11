/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp {
    static String[] field_n;
    gb field_a;
    gb field_h;
    static k field_p;
    static int field_i;
    static String field_e;
    gb field_m;
    gb field_b;
    fj field_d;
    int field_l;
    long field_o;
    volatile int field_g;
    byte field_f;
    fj field_c;
    volatile int field_k;
    ac field_j;

    abstract boolean b(int param0);

    final int c(byte param0) {
        if (param0 == 0) {
          return this.field_a.b(param0 ^ -24088) + this.field_h.b(param0 ^ -24088);
        }
        this.a(23);
        return this.field_a.b(param0 ^ -24088) + this.field_h.b(param0 ^ -24088);
    }

    abstract void a(Object param0, boolean param1, byte param2);

    public static void d(byte param0) {
        field_p = null;
        int var1 = 10 / ((-1 - param0) / 37);
        field_n = null;
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 == 20) {
          return 20 <= this.c((byte) 0) ? true : false;
        }
        this.field_a = (gb) null;
        return 20 <= this.c((byte) 0) ? true : false;
    }

    final ac a(byte param0, int param1, boolean param2, byte param3, int param4) {
        ac stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        ac stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        long var6;
        ac var8;
        var6 = ((long)param1 << 32) + (long)param4;
        var8 = new ac();
        var8.field_l = var6;
        var8.field_y = param0;
        if (param3 == -51) {
          stackIn_15_0 = var8;
          stackIn_16_1 = (!param2) ? false : true;
          stackIn_15_0.field_w = stackIn_16_1;
        } else {
          this.e((byte) -94);
          stackIn_3_0 = var8;
          stackIn_4_1 = (!param2) ? false : true;
          stackIn_3_0.field_w = stackIn_4_1;
        }
        if (param2) {
          if (this.c((byte) 0) >= 20) {
            throw new RuntimeException();
          }
          this.field_a.a((byte) 119, var8);
          return var8;
        }
        if (this.c(-6292) >= 20) {
          throw new RuntimeException();
        }
        this.field_m.a((byte) 121, var8);
        return var8;
    }

    abstract void e(byte param0);

    final boolean a(byte param0) {
        if (param0 > 100) {
          return this.c(-6292) >= 20 ? true : false;
        }
        this.b((byte) 57);
        return this.c(-6292) >= 20 ? true : false;
    }

    final int c(int param0) {
        if (param0 != -6292) {
          return -67;
        }
        return this.field_m.b(param0 ^ 18052) + this.field_b.b(-24088);
    }

    abstract void b(byte param0);

    jp() {
        this.field_a = new gb();
        this.field_h = new gb();
        this.field_m = new gb();
        this.field_b = new gb();
        this.field_d = new fj(6);
        this.field_g = 0;
        this.field_k = 0;
        this.field_f = (byte) 0;
        this.field_c = new fj(10);
    }

    static {
        field_e = "Open in popup window";
        field_i = 20;
        field_p = new k(4, 1, 1, 1);
    }
}
