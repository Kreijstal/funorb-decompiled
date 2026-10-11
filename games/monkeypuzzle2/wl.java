/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl {
    dl field_n;
    static le[] field_f;
    dl field_j;
    static pj field_d;
    dl field_i;
    dl field_c;
    long field_e;
    int field_h;
    gk field_l;
    volatile int field_a;
    gk field_g;
    byte field_m;
    volatile int field_b;
    ob field_k;

    final boolean a(int param0) {
        if (param0 != 20) {
          return false;
        }
        return 20 <= this.d((byte) -25) ? true : false;
    }

    final int c(int param0) {
        if (param0 == 24547) {
          return this.field_n.a(-110) + this.field_j.a(-108);
        }
        this.d(-103);
        return this.field_n.a(-110) + this.field_j.a(-108);
    }

    abstract void a(int param0, boolean param1, Object param2);

    abstract void b(byte param0);

    abstract void b(int param0);

    final int d(byte param0) {
        if (param0 == -25) {
          return this.field_i.a(param0 - 82) + this.field_c.a(-112);
        }
        this.a(63, 40, 75, true, (byte) 12);
        return this.field_i.a(param0 - 82) + this.field_c.a(-112);
    }

    final ob a(int param0, int param1, int param2, boolean param3, byte param4) {
        ob stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        ob stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        long var6;
        ob var8;
        ob var8Lifetime1;
        var6 = (long)param1 + ((long)param0 << 32);
        if (param2 >= 74) {
          var8 = new ob();
          var8.field_q = param4;
          stackIn_15_0 = var8;
          stackIn_16_1 = (!param3) ? false : true;
          stackIn_15_0.field_m = stackIn_16_1;
          var8.field_f = var6;
          if (param3) {
            if (20 <= this.c(24547)) {
              throw new RuntimeException();
            }
            this.field_n.a(var8, (byte) -73);
            return var8;
          }
          if (this.d((byte) -25) >= 20) {
            throw new RuntimeException();
          }
          this.field_i.a(var8, (byte) -105);
          return var8;
        }
        field_d = (pj) null;
        var8Lifetime1 = new ob();
        var8Lifetime1.field_q = param4;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param3) ? false : true;
        stackIn_3_0.field_m = stackIn_4_1;
        var8Lifetime1.field_f = var6;
        if (param3) {
          if (20 <= this.c(24547)) {
            throw new RuntimeException();
          }
          this.field_n.a(var8Lifetime1, (byte) -73);
          return var8Lifetime1;
        }
        if (this.d((byte) -25) >= 20) {
          throw new RuntimeException();
        }
        this.field_i.a(var8Lifetime1, (byte) -105);
        return var8Lifetime1;
    }

    abstract boolean a(byte param0);

    public static void c(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 < 99) {
          field_d = (pj) null;
        }
    }

    final static tb a(ad param0, int param1, ad param2, int param3, int param4) {
        RuntimeException var5 = null;
        tb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param4, param3, param2, -3)) {
            return null;
          }
          if (param1 != -26348) {
            field_f = (le[]) null;
          }
          stackIn_6_0 = rl.a(param1 - 6118, param0.b(255, param3, param4));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wl.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 == 20) {
          return 20 <= this.c(param0 + 24527) ? true : false;
        }
        this.field_n = (dl) null;
        return 20 <= this.c(param0 + 24527) ? true : false;
    }

    final static void e(byte param0) {
        if (ba.field_f == null) {
          return;
        }
        vh.a(ba.field_f, (byte) 9);
        ba.field_f.a((byte) -107, rc.field_k);
        ba.field_f = null;
        if (ci.field_a != null) {
          ci.field_a.e(0);
        }
        if (param0 > 98) {
          ie.field_e.requestFocus();
          return;
        }
    }

    wl() {
        this.field_n = new dl();
        this.field_j = new dl();
        this.field_i = new dl();
        this.field_c = new dl();
        this.field_l = new gk(6);
        this.field_b = 0;
        this.field_a = 0;
        this.field_m = (byte) 0;
        this.field_g = new gk(10);
    }

    static {
    }
}
