/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class th {
    static java.awt.Color field_e;
    jo field_k;
    static hl field_i;
    static kh[] field_p;
    static int field_g;
    static int field_l;
    jo field_j;
    jo field_o;
    jo field_c;
    int field_a;
    long field_f;
    bh field_b;
    bh field_m;
    volatile int field_h;
    byte field_n;
    volatile int field_d;
    rh field_q;

    final int c(byte param0) {
        if (param0 >= -33) {
          return -43;
        }
        return this.field_k.d(0) + this.field_j.d(0);
    }

    abstract void b(int param0);

    final int d(int param0) {
        if (param0 != 20) {
          return 22;
        }
        return this.field_o.d(param0 ^ 20) + this.field_c.d(0);
    }

    abstract boolean a(boolean param0);

    final boolean c(int param0) {
        if (param0 == -7614) {
          return this.d(20) >= 20 ? true : false;
        }
        this.field_a = -74;
        return this.d(20) >= 20 ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
        field_i = null;
        if (param0 <= 110) {
          field_l = -119;
          field_e = null;
          return;
        }
        field_e = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static mh a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        mh var5 = null;
        String var6 = null;
        mh stackIn_4_0 = null;
        mh stackIn_7_0 = null;
        mh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_7_0 = c.field_o;
              return stackIn_7_0;
            }
            var3 = param1.substring(0, var2_int);
            if (param0 > -98) {
              var6 = (String) null;
              th.a(-51, (String) null);
            }
            var4 = param1.substring(1 + var2_int);
            var5 = cf.a(var3, (byte) -124);
            if (var5 == null) {
              return rh.b(2, var4);
            }
            stackIn_13_0 = var5;
            return stackIn_13_0;
          }
          stackIn_4_0 = ec.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("th.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 == 119) {
          return 20 <= this.c((byte) -47) ? true : false;
        }
        this.field_b = (bh) null;
        return 20 <= this.c((byte) -47) ? true : false;
    }

    abstract void a(byte param0);

    final rh a(boolean param0, int param1, byte param2, int param3, boolean param4) {
        rh var8 = null;
        long var6 = (long)param3 + ((long)param1 << 32);
        rh var8Lifetime1;
        if (param0) {
          field_l = -80;
          var8 = new rh();
          var8.field_D = param4 ? true : false;
          var8.field_n = var6;
          var8.field_H = param2;
          if (!param4) {
            if (!(this.d(20) < 20)) {
              throw new RuntimeException();
            }
            this.field_o.a(var8, 0);
          } else {
            if (!(this.c((byte) -100) < 20)) {
              throw new RuntimeException();
            }
            this.field_k.a(var8, 0);
          }
          return var8;
        }
        var8Lifetime1 = new rh();
        var8Lifetime1.field_D = param4 ? true : false;
        var8Lifetime1.field_n = var6;
        var8Lifetime1.field_H = param2;
        if (!param4) {
          if (!(this.d(20) < 20)) {
            throw new RuntimeException();
          }
          this.field_o.a(var8Lifetime1, 0);
        } else {
          if (!(this.c((byte) -100) < 20)) {
            throw new RuntimeException();
          }
          this.field_k.a(var8Lifetime1, 0);
        }
        return var8Lifetime1;
    }

    th() {
        this.field_k = new jo();
        this.field_j = new jo();
        this.field_o = new jo();
        this.field_c = new jo();
        this.field_b = new bh(6);
        this.field_h = 0;
        this.field_d = 0;
        this.field_n = (byte) 0;
        this.field_m = new bh(10);
    }

    static {
        field_e = new java.awt.Color(10040319);
    }
}
