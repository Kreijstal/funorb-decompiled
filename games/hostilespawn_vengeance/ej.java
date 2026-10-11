/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej {
    static vl field_g;
    bh field_b;
    bh field_j;
    static String field_o;
    static String field_n;
    static ub field_q;
    bh field_l;
    static gb field_h;
    bh field_a;
    int field_f;
    long field_c;
    vi field_m;
    volatile int field_k;
    volatile int field_e;
    byte field_r;
    static bd field_d;
    vi field_i;
    lm field_p;

    final lm a(byte param0, int param1, int param2, int param3, boolean param4) {
        long var6 = 0L;
        lm var8 = null;
        lm var8Lifetime1;
        long var6Lifetime1;
        if (param3 != -18986) {
          ej.d((byte) -61);
          var6 = (long)param2 + ((long)param1 << 32);
          var8 = new lm();
          var8.field_h = var6;
          var8.field_w = param4 ? true : false;
          var8.field_B = param0;
          if (!param4) {
            if (!(this.b((byte) -34) < 20)) {
              throw new RuntimeException();
            }
            this.field_l.a(var8, -128);
          } else {
            if (!(this.c((byte) 122) < 20)) {
              throw new RuntimeException();
            }
            this.field_b.a(var8, 90);
          }
          return var8;
        }
        var6Lifetime1 = (long)param2 + ((long)param1 << 32);
        var8Lifetime1 = new lm();
        var8Lifetime1.field_h = var6Lifetime1;
        var8Lifetime1.field_w = param4 ? true : false;
        var8Lifetime1.field_B = param0;
        if (!param4) {
          if (!(this.b((byte) -34) < 20)) {
            throw new RuntimeException();
          }
          this.field_l.a(var8Lifetime1, -128);
        } else {
          if (!(this.c((byte) 122) < 20)) {
            throw new RuntimeException();
          }
          this.field_b.a(var8Lifetime1, 90);
        }
        return var8Lifetime1;
    }

    final int c(byte param0) {
        if (param0 != 122) {
          return -95;
        }
        return this.field_b.c((byte) 66) + this.field_j.c((byte) 74);
    }

    abstract void a(boolean param0, byte param1, Object param2);

    final boolean b(int param0) {
        if (param0 == 5) {
          return this.b((byte) -34) >= 20 ? true : false;
        }
        this.b(-16);
        return this.b((byte) -34) >= 20 ? true : false;
    }

    abstract void c(int param0);

    final static Object a(boolean param0, byte[] param1, int param2) {
        md var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        md stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param1.length > 136) {
            var3 = new md();
            ((nj) ((Object) var3)).a(24, param1);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param2 <= 104) {
            stackIn_8_0 = (Object) null;
            return stackIn_8_0;
          }
          if (param0) {
            stackIn_13_0 = dc.a(109, param1);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ej.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(byte param0);

    public static void d(int param0) {
        field_g = null;
        field_o = null;
        field_n = null;
        field_q = null;
        field_h = null;
        if (param0 != -21742) {
          return;
        }
        field_d = null;
    }

    final static boolean d(byte param0) {
        if (!(qh.field_u < 20)) {
          return false;
        }
        qh.field_u = qh.field_u + ((int)(5.0 * Math.random()) + 20);
        if (param0 >= 46) {
          return true;
        }
        field_d = (bd) null;
        return true;
    }

    final int b(byte param0) {
        if (param0 == -34) {
          return this.field_l.c((byte) 93) + this.field_a.c((byte) 39);
        }
        ej.d((byte) -13);
        return this.field_l.c((byte) 93) + this.field_a.c((byte) 39);
    }

    abstract boolean e(int param0);

    final boolean a(int param0) {
        if (param0 != 20) {
          return true;
        }
        return 20 <= this.c((byte) 122) ? true : false;
    }

    ej() {
        this.field_b = new bh();
        this.field_j = new bh();
        this.field_l = new bh();
        this.field_a = new bh();
        this.field_m = new vi(6);
        this.field_k = 0;
        this.field_e = 0;
        this.field_r = (byte) 0;
        this.field_i = new vi(10);
    }

    static {
        field_g = null;
        field_o = "Menu";
        field_n = "Just play";
        field_q = new ub();
    }
}
