/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob {
    static int field_g;
    static int field_l;
    static boolean field_o;
    km field_m;
    static int[] field_b;
    km field_f;
    km field_k;
    km field_a;
    ng field_n;
    int field_c;
    long field_e;
    ng field_i;
    volatile int field_j;
    byte field_d;
    volatile int field_p;
    ld field_h;

    abstract void a(boolean param0, Object param1, boolean param2);

    final int d(int param0) {
        if (param0 != 20) {
          return -98;
        }
        return this.field_k.c(0) + this.field_a.c(param0 ^ 20);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 12554) {
          field_l = -115;
        }
    }

    abstract void e(int param0);

    abstract boolean b(byte param0);

    final boolean c(byte param0) {
        if (param0 < -34) {
          return 20 <= this.b(20) ? true : false;
        }
        this.b(123);
        return 20 <= this.b(20) ? true : false;
    }

    final int b(int param0) {
        if (param0 == 20) {
          return this.field_m.c(param0 - 20) + this.field_f.c(0);
        }
        Object var3 = (Object) null;
        this.a(true, (Object) null, false);
        return this.field_m.c(param0 - 20) + this.field_f.c(0);
    }

    final ld a(boolean param0, int param1, int param2, int param3, byte param4) {
        ld stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        ld stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        long var6;
        ld var8;
        Object var9;
        long var6Lifetime1;
        ld var8Lifetime1;
        if (param1 == 18303) {
          var6 = (long)param2 + ((long)param3 << 32);
          var8 = new ld();
          var8.field_u = param4;
          var8.field_k = var6;
          stackIn_16_0 = var8;
          stackIn_17_1 = (!param0) ? false : true;
          stackIn_16_0.field_q = stackIn_17_1;
          if (param0) {
            if (20 <= this.b(param1 ^ 18283)) {
              throw new RuntimeException();
            }
            this.field_m.a((byte) 110, var8);
          } else {
            if (this.d(20) >= 20) {
              throw new RuntimeException();
            }
            this.field_k.a((byte) 100, var8);
          }
          return var8;
        }
        var9 = (Object) null;
        this.a(true, (Object) null, false);
        var6Lifetime1 = (long)param2 + ((long)param3 << 32);
        var8Lifetime1 = new ld();
        var8Lifetime1.field_u = param4;
        var8Lifetime1.field_k = var6Lifetime1;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param0) ? false : true;
        stackIn_3_0.field_q = stackIn_4_1;
        if (param0) {
          if (20 <= this.b(param1 ^ 18283)) {
            throw new RuntimeException();
          }
          this.field_m.a((byte) 110, var8Lifetime1);
        } else {
          if (this.d(20) >= 20) {
            throw new RuntimeException();
          }
          this.field_k.a((byte) 100, var8Lifetime1);
        }
        return var8Lifetime1;
    }

    abstract void a(byte param0);

    final boolean c(int param0) {
        if (param0 == -21) {
          return this.d(20) >= 20 ? true : false;
        }
        this.field_i = (ng) null;
        return this.d(20) >= 20 ? true : false;
    }

    ob() {
        this.field_m = new km();
        this.field_f = new km();
        this.field_k = new km();
        this.field_a = new km();
        this.field_n = new ng(6);
        this.field_j = 0;
        this.field_d = (byte) 0;
        this.field_p = 0;
        this.field_i = new ng(10);
    }

    static {
        field_b = new int[4];
    }
}
