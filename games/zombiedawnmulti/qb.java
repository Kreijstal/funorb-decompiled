/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb {
    static ip field_e;
    static int[] field_a;
    static String field_o;
    lq field_g;
    lq field_j;
    static ri field_h;
    lq field_c;
    lq field_l;
    k field_b;
    long field_f;
    int field_d;
    k field_k;
    volatile int field_p;
    byte field_i;
    volatile int field_n;
    tn field_m;

    abstract void a(boolean param0, Object param1, int param2);

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 31) {
          qb.c((byte) -24);
        }
        if (on.field_Z == null) {
          return;
        }
        var1 = on.field_Z;
        synchronized (var1) {
          on.field_Z = null;
        }
    }

    final int d(int param0) {
        if (param0 == 20) {
          return this.field_c.a((byte) 98) + this.field_l.a((byte) 98);
        }
        this.field_d = 116;
        return this.field_c.a((byte) 98) + this.field_l.a((byte) 98);
    }

    final static void a(int param0, byte param1, pd param2, int param3) {
        try {
          if (param1 > -101) {
            qb.c((byte) 57);
          }
          po.field_l = param2;
          la.field_m = param0;
          um.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_e = null;
        if (param0 == -7) {
          field_o = null;
          field_h = null;
          field_a = null;
          return;
        }
        pd var2 = (pd) null;
        qb.a(36, (byte) -107, (pd) null, 47);
        field_o = null;
        field_h = null;
        field_a = null;
    }

    final tn a(int param0, int param1, boolean param2, int param3, byte param4) {
        long var6 = ((long)param3 << 32) + (long)param1;
        tn var8 = new tn();
        var8.field_B = param4;
        var8.field_l = var6;
        var8.field_r = param2 ? true : false;
        if (param2) {
          if (20 <= this.a(0)) {
            throw new RuntimeException();
          }
          this.field_g.a(param0 ^ 488002304, var8);
        } else {
          if (!(20 > this.d(20))) {
            throw new RuntimeException();
          }
          this.field_c.a(29664, var8);
        }
        if (param0 == 487989472) {
          return var8;
        }
        Object var9 = (Object) null;
        this.a(false, (Object) null, 52);
        return var8;
    }

    abstract void f(int param0);

    abstract void a(byte param0);

    final boolean e(int param0) {
        if (param0 > 13) {
          return this.a(0) >= 20 ? true : false;
        }
        this.field_d = -46;
        return this.a(0) >= 20 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= -32) {
          return this.d(20) >= 20 ? true : false;
        }
        this.field_b = (k) null;
        return this.d(20) >= 20 ? true : false;
    }

    abstract boolean b(byte param0);

    final int a(int param0) {
        if (param0 != 0) {
          return 31;
        }
        return this.field_g.a((byte) 98) + this.field_j.a((byte) 98);
    }

    qb() {
        this.field_g = new lq();
        this.field_j = new lq();
        this.field_c = new lq();
        this.field_l = new lq();
        this.field_b = new k(6);
        this.field_i = (byte) 0;
        this.field_n = 0;
        this.field_p = 0;
        this.field_k = new k(10);
    }

    static {
        field_o = "<%0> has joined your game.";
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_e = new ip();
    }
}
