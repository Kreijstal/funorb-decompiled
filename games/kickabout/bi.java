/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bi {
    static int field_i;
    static int field_m;
    static String field_e;
    static String field_a;
    o field_h;
    o field_b;
    o field_c;
    o field_j;
    iw field_d;
    int field_f;
    long field_p;
    volatile int field_l;
    volatile int field_o;
    byte field_g;
    iw field_n;
    ui field_k;

    final int b(int param0) {
        if (param0 == -21) {
          return this.field_c.c(-1976587888) + this.field_j.c(-1976587888);
        }
        this.e(124);
        return this.field_c.c(-1976587888) + this.field_j.c(-1976587888);
    }

    final boolean d(int param0) {
        if (param0 == 10770) {
          return this.b(param0 ^ -10759) >= 20 ? true : false;
        }
        this.field_f = -107;
        return this.b(param0 ^ -10759) >= 20 ? true : false;
    }

    abstract void a(Object param0, int param1, boolean param2);

    final boolean a(int param0) {
        if (param0 == 25533) {
          return this.e(0) >= 20 ? true : false;
        }
        this.field_g = (byte) -15;
        return this.e(0) >= 20 ? true : false;
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hf.a(param0, -3)) {
            return false;
          }
          if (qe.a(true, param0)) {
            return false;
          }
          if (lg.a(param0, (byte) 79)) {
            return false;
          }
          if (param1 != -32341) {
            return true;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (j.a((byte) -125, param2, param0)) {
            return false;
          }
          if (uj.a(63, param0, param2)) {
            return false;
          }
          if (!lj.a((byte) -120, param2, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("bi.P(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
        field_e = null;
    }

    final ui a(int param0, int param1, byte param2, byte param3, boolean param4) {
        ui stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        ui stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        long var6;
        ui var8;
        var6 = ((long)param0 << 32) + (long)param1;
        var8 = new ui();
        if (param3 == 89) {
          var8.field_l = var6;
          stackIn_16_0 = var8;
          stackIn_17_1 = (!param4) ? false : true;
          stackIn_16_0.field_q = stackIn_17_1;
        } else {
          bi.a(14, -40, 39, -92);
          var8.field_l = var6;
          stackIn_3_0 = var8;
          stackIn_4_1 = (!param4) ? false : true;
          stackIn_3_0.field_q = stackIn_4_1;
        }
        var8.field_x = param2;
        if (!param4) {
          if (this.b(-21) >= 20) {
            throw new RuntimeException();
          }
          this.field_c.a(param3 + 38, var8);
          return var8;
        }
        if (this.e(0) >= 20) {
          throw new RuntimeException();
        }
        this.field_h.a(127, var8);
        return var8;
    }

    abstract void c(int param0);

    abstract void b(byte param0);

    final static void a(int param0, int param1, int param2, int param3) {
        fb.field_R = param2;
        if (param3 != 20) {
          return;
        }
        wt.field_v = param0;
        du.field_k = param1;
    }

    abstract boolean a(byte param0);

    final int e(int param0) {
        if (param0 == 0) {
          return this.field_h.c(-1976587888) + this.field_b.c(-1976587888);
        }
        Object var3 = (Object) null;
        this.a((Object) null, -67, false);
        return this.field_h.c(-1976587888) + this.field_b.c(-1976587888);
    }

    bi() {
        this.field_h = new o();
        this.field_b = new o();
        this.field_c = new o();
        this.field_j = new o();
        this.field_d = new iw(6);
        this.field_g = (byte) 0;
        this.field_o = 0;
        this.field_l = 0;
        this.field_n = new iw(10);
    }

    static {
        field_i = 10;
        field_a = "Filter Auctions";
        field_e = "search for a user: ";
    }
}
