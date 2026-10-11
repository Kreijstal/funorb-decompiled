/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class na {
    static String field_l;
    static int field_e;
    th field_b;
    th field_a;
    th field_j;
    th field_m;
    va field_i;
    long field_d;
    int field_f;
    volatile int field_n;
    va field_g;
    byte field_h;
    volatile int field_k;
    fi field_c;

    final boolean a(int param0) {
        if (param0 == 3473) {
          return this.d(param0 ^ -14914) >= 20 ? true : false;
        }
        this.c(23);
        return this.d(param0 ^ -14914) >= 20 ? true : false;
    }

    abstract void a(boolean param0, Object param1, int param2);

    final boolean c(int param0) {
        if (param0 == -21) {
          return this.c((byte) -120) >= 20 ? true : false;
        }
        this.field_j = (th) null;
        return this.c((byte) -120) >= 20 ? true : false;
    }

    abstract void a(byte param0);

    abstract boolean b(byte param0);

    final int d(int param0) {
        if (param0 == -14289) {
          return this.field_b.c(4) + this.field_a.c(param0 + 14293);
        }
        this.field_k = -124;
        return this.field_b.c(4) + this.field_a.c(param0 + 14293);
    }

    final int c(byte param0) {
        if (param0 < -16) {
          return this.field_j.c(4) + this.field_m.c(4);
        }
        this.a(120);
        return this.field_j.c(4) + this.field_m.c(4);
    }

    abstract void a(boolean param0);

    public static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        field_l = null;
    }

    final fi a(int param0, int param1, byte param2, byte param3, boolean param4) {
        long var6 = ((long)param0 << 32) + (long)param1;
        fi var8 = new fi();
        var8.field_r = param4 ? true : false;
        var8.field_o = var6;
        var8.field_D = param3;
        if (param4) {
          if (this.d(-14289) >= 20) {
            throw new RuntimeException();
          }
          this.field_b.a(var8, 14);
        } else {
          if (!(20 > this.c((byte) -76))) {
            throw new RuntimeException();
          }
          this.field_j.a(var8, 14);
        }
        if (param2 < -64) {
          return var8;
        }
        return (fi) null;
    }

    na() {
        this.field_b = new th();
        this.field_a = new th();
        this.field_j = new th();
        this.field_m = new th();
        this.field_i = new va(6);
        this.field_h = (byte) 0;
        this.field_k = 0;
        this.field_n = 0;
        this.field_g = new va(10);
    }

    static {
    }
}
