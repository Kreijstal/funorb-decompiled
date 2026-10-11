/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sb {
    static wl field_a;
    static int field_h;
    va field_p;
    static int field_b;
    va field_l;
    static String field_i;
    va field_j;
    va field_n;
    long field_k;
    n field_e;
    int field_f;
    volatile int field_d;
    byte field_m;
    volatile int field_g;
    n field_o;
    s field_c;

    final boolean c(int param0) {
        if (param0 == 20) {
          return 20 <= this.a(true) ? true : false;
        }
        this.field_n = (va) null;
        return 20 <= this.a(true) ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
          return this.field_p.c(0) + this.field_l.c(0);
        }
        this.a(-59);
        return this.field_p.c(0) + this.field_l.c(0);
    }

    abstract void a(int param0);

    final int a(byte param0) {
        if (param0 == 88) {
          return this.field_j.c(0) + this.field_n.c(0);
        }
        this.field_e = (n) null;
        return this.field_j.c(0) + this.field_n.c(0);
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -4470) {
          field_b = 100;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean b(int param0) {
        if (param0 == 20) {
          return 20 <= this.a((byte) 88) ? true : false;
        }
        this.field_n = (va) null;
        return 20 <= this.a((byte) 88) ? true : false;
    }

    abstract void b(byte param0);

    abstract void a(Object param0, boolean param1, byte param2);

    abstract boolean d(int param0);

    final s a(int param0, boolean param1, byte param2, int param3, byte param4) {
        s stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        s stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        long var6;
        s var8;
        s var8Lifetime1;
        var6 = (long)param3 + ((long)param0 << 32);
        if (param2 == 0) {
          var8 = new s();
          var8.field_y = param4;
          stackIn_16_0 = var8;
          stackIn_17_1 = (!param1) ? false : true;
          stackIn_16_0.field_r = stackIn_17_1;
          var8.field_p = var6;
          if (param1) {
            if (this.a(true) >= 20) {
              throw new RuntimeException();
            }
            this.field_p.a(-1, var8);
          } else {
            if (this.a((byte) 88) >= 20) {
              throw new RuntimeException();
            }
            this.field_j.a(~param2, var8);
          }
          return var8;
        }
        this.field_f = -16;
        var8Lifetime1 = new s();
        var8Lifetime1.field_y = param4;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param1) ? false : true;
        stackIn_3_0.field_r = stackIn_4_1;
        var8Lifetime1.field_p = var6;
        if (param1) {
          if (this.a(true) >= 20) {
            throw new RuntimeException();
          }
          this.field_p.a(-1, var8Lifetime1);
        } else {
          if (this.a((byte) 88) >= 20) {
            throw new RuntimeException();
          }
          this.field_j.a(~param2, var8Lifetime1);
        }
        return var8Lifetime1;
    }

    sb() {
        this.field_p = new va();
        this.field_l = new va();
        this.field_j = new va();
        this.field_n = new va();
        this.field_e = new n(6);
        this.field_g = 0;
        this.field_m = (byte) 0;
        this.field_d = 0;
        this.field_o = new n(10);
    }

    static {
        field_b = 0;
        field_i = "";
    }
}
