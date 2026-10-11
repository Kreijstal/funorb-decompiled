/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pc {
    static oi field_k;
    ra field_a;
    ra field_l;
    ra field_f;
    ra field_m;
    long field_g;
    de field_b;
    int field_i;
    volatile int field_e;
    volatile int field_h;
    byte field_c;
    de field_j;
    og field_d;

    final int a(boolean param0) {
        if (param0) {
          return this.field_f.a(false) + this.field_m.a(false);
        }
        this.a(true);
        return this.field_f.a(false) + this.field_m.a(false);
    }

    abstract void a(int param0);

    abstract void d(int param0);

    final og a(byte param0, boolean param1, int param2, byte param3, int param4) {
        int var6 = 31 % ((-29 - param3) / 53);
        long var7 = (long)param4 + ((long)param2 << 32);
        og var9 = new og();
        var9.field_C = param0;
        var9.field_r = param1 ? true : false;
        var9.field_n = var7;
        if (!param1) {
          if (this.a(true) >= 20) {
            throw new RuntimeException();
          }
          this.field_f.a(var9, (byte) -99);
        } else {
          if (!(20 > this.e(-1216122784))) {
            throw new RuntimeException();
          }
          this.field_a.a(var9, (byte) -124);
        }
        return var9;
    }

    final static void a(int param0, byte param1) {
        ki.field_V = em.field_K[param0];
        if (param1 == -66) {
          cj.field_e = te.field_Q[param0];
          l.field_g = vj.field_p[param0];
          return;
        }
        pc.b(true);
        cj.field_e = te.field_Q[param0];
        l.field_g = vj.field_p[param0];
    }

    abstract void a(boolean param0, Object param1, int param2);

    final boolean a(byte param0) {
        if (param0 > 118) {
          return this.a(true) >= 20 ? true : false;
        }
        this.field_l = (ra) null;
        return this.a(true) >= 20 ? true : false;
    }

    final static void a(byte param0, fn param1) {
        try {
          t.field_i.a(param1);
          if (param0 != 13) {
            pc.b(false);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 >= 96) {
          return this.e(-1216122784) >= 20 ? true : false;
        }
        this.field_l = (ra) null;
        return this.e(-1216122784) >= 20 ? true : false;
    }

    public static void b(boolean param0) {
        field_k = null;
        if (!param0) {
          field_k = (oi) null;
        }
    }

    abstract boolean c(int param0);

    final int e(int param0) {
        if (param0 == -1216122784) {
          return this.field_a.a(false) + this.field_l.a(false);
        }
        this.field_g = 8L;
        return this.field_a.a(false) + this.field_l.a(false);
    }

    pc() {
        this.field_a = new ra();
        this.field_l = new ra();
        this.field_f = new ra();
        this.field_m = new ra();
        this.field_b = new de(6);
        this.field_h = 0;
        this.field_c = (byte) 0;
        this.field_e = 0;
        this.field_j = new de(10);
    }

    static {
    }
}
