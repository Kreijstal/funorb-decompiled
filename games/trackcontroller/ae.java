/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ae {
    mb field_f;
    mb field_c;
    mb field_h;
    mb field_k;
    int field_d;
    long field_j;
    be field_g;
    volatile int field_b;
    byte field_i;
    be field_a;
    volatile int field_e;
    hi field_l;

    final static int a(byte param0, int param1) {
        int var2 = -94 / ((55 - param0) / 54);
        int var3 = 0;
        if ((param1 & 7) != 0) {
          var3 = 8 - (7 & param1);
        }
        int var4 = param1 + var3;
        return var4;
    }

    abstract void b(byte param0);

    final int a(byte param0) {
        if (param0 == 105) {
          return this.field_f.c((byte) -117) + this.field_c.c((byte) -79);
        }
        this.field_f = (mb) null;
        return this.field_f.c((byte) -117) + this.field_c.c((byte) -79);
    }

    abstract void c(byte param0);

    final int a(int param0) {
        if (param0 == 7) {
          return this.field_h.c((byte) -127) + this.field_k.c((byte) -57);
        }
        this.a((byte) -121);
        return this.field_h.c((byte) -127) + this.field_k.c((byte) -57);
    }

    final boolean d(int param0) {
        if (param0 != -18316) {
          return false;
        }
        return this.a((byte) 105) >= 20 ? true : false;
    }

    abstract void a(byte param0, boolean param1, Object param2);

    abstract boolean b(int param0);

    final hi a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        hi stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        hi stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        long var6;
        hi var8;
        long var6Lifetime1;
        hi var8Lifetime1;
        if (!param2) {
          var6 = (long)param3 + ((long)param0 << 32);
          var8 = new hi();
          var8.field_m = var6;
          stackIn_16_0 = var8;
          stackIn_17_1 = (!param1) ? false : true;
          stackIn_16_0.field_q = stackIn_17_1;
          var8.field_B = param4;
          if (!param1) {
            if (20 <= this.a(7)) {
              throw new RuntimeException();
            }
            this.field_h.a(var8, true);
            return var8;
          }
          if (this.a((byte) 105) >= 20) {
            throw new RuntimeException();
          }
          this.field_f.a(var8, true);
          return var8;
        }
        this.field_i = (byte) -39;
        var6Lifetime1 = (long)param3 + ((long)param0 << 32);
        var8Lifetime1 = new hi();
        var8Lifetime1.field_m = var6Lifetime1;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param1) ? false : true;
        stackIn_3_0.field_q = stackIn_4_1;
        var8Lifetime1.field_B = param4;
        if (!param1) {
          if (20 <= this.a(7)) {
            throw new RuntimeException();
          }
          this.field_h.a(var8Lifetime1, true);
          return var8Lifetime1;
        }
        if (this.a((byte) 105) >= 20) {
          throw new RuntimeException();
        }
        this.field_f.a(var8Lifetime1, true);
        return var8Lifetime1;
    }

    final boolean c(int param0) {
        if (param0 == -28419) {
          return this.a(7) >= 20 ? true : false;
        }
        this.field_b = 112;
        return this.a(7) >= 20 ? true : false;
    }

    ae() {
        this.field_f = new mb();
        this.field_c = new mb();
        this.field_h = new mb();
        this.field_k = new mb();
        this.field_g = new be(6);
        this.field_e = 0;
        this.field_i = (byte) 0;
        this.field_b = 0;
        this.field_a = new be(10);
    }

    static {
    }
}
