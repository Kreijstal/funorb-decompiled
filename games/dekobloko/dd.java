/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    ab field_d;
    static w field_k;
    ab field_g;
    static String field_m;
    static int[] field_a;
    ab field_n;
    ab field_l;
    wl field_i;
    int field_b;
    long field_e;
    volatile int field_o;
    volatile int field_j;
    wl field_c;
    byte field_f;
    pj field_h;

    final static String b(String param0, int param1, int param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        uf var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param0);
          if (!dc.a(var7, (byte) -70)) {
            stackIn_2_0 = ge.field_d;
            return stackIn_2_0;
          }
          if (k.a(param0, true)) {
            stackIn_5_0 = si.field_i;
            return stackIn_5_0;
          }
          if (jj.field_b != 2) {
            stackIn_9_0 = qe.field_h;
            return stackIn_9_0;
          }
          if (ik.a(param0, (byte) -118)) {
            stackIn_13_0 = cm.$cfr$intArgs$a$53ce4ab4c593(114, ph.field_Bb, new String[]{param0});
            return stackIn_13_0;
          }
          if (ed.field_g >= 100) {
            stackIn_16_0 = ca.field_ob;
            return stackIn_16_0;
          }
          if (qe.a(param0, 3)) {
            stackIn_20_0 = cm.$cfr$intArgs$a$53ce4ab4c593(116, nn.field_b, new String[]{param0});
            return stackIn_20_0;
          }
          var6 = we.field_b;
          var6.f(param2, -4);
          var6.field_n = var6.field_n + 1;
          var4 = -88 % ((param1 - 84) / 41);
          var5 = var6.field_n;
          var6.a(true, 2);
          var6.a(0, param0);
          var6.b(var6.field_n - var5, true);
          stackIn_22_0 = null;
          return (String) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("dd.R(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(Object param0, byte param1, boolean param2);

    final int c(byte param0) {
        if (param0 < -73) {
          return this.field_d.a(0) + this.field_g.a(0);
        }
        field_a = (int[]) null;
        return this.field_d.a(0) + this.field_g.a(0);
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          tj.field_Vb = false;
          mg.field_Nb = false;
          if (cl.field_r != null &&
            cl.field_r.field_S) {
            var3_int = 1;
            if (param2 == 8) {
              param2 = 2;
              if (vb.field_Z) {
                param0 = wa.field_b;
              } else {
                param0 = di.field_A;
              }
              dm.field_c.a(hb.field_Ob, 30534);
            }
            if (param2 == 10) {
              var3_int = 0;
              si.d(-31842);
            }
            if (var3_int != 0) {
              if (tj.field_Vb) {
                param0 = cm.$cfr$intArgs$a$53ce4ab4c593(103, cm.field_d, new String[]{param0});
              }
              if (dc.field_d) {
                param0 = rg.field_d;
              }
              cl.field_r.a((byte) 48, param0, param2);
            }
            if (param2 != 256 &&
              param2 != 10 &&
              !vb.field_Z) {
              dm.field_c.a(51);
            }
          }
          if (param1 == 0) {
            return;
          }
          var4 = (String) null;
          dd.b((String) null, 52, 86);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("dd.T(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract void d(byte param0);

    final boolean b(int param0) {
        if (param0 == 0) {
          return this.c(0) >= 20 ? true : false;
        }
        this.field_j = -70;
        return this.c(0) >= 20 ? true : false;
    }

    final pj a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        long var6 = ((long)param3 << 32) + (long)param4;
        if (!param2) {
          return (pj) null;
        }
        pj var8 = new pj();
        var8.field_r = var6;
        var8.field_D = param0 ? true : false;
        var8.field_M = param1;
        if (param0) {
          if (!(this.c((byte) -109) < 20)) {
            throw new RuntimeException();
          }
          this.field_d.a(var8, -7267);
        } else {
          if (!(20 > this.c(0))) {
            throw new RuntimeException();
          }
          this.field_n.a(var8, -7267);
        }
        return var8;
    }

    abstract boolean a(byte param0);

    final int c(int param0) {
        if (param0 == 0) {
          return this.field_n.a(0) + this.field_l.a(0);
        }
        this.field_h = (pj) null;
        return this.field_n.a(0) + this.field_l.a(0);
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        String var4 = null;
        String var4Lifetime1;
        if (param2 == 66) {
          var4 = (String) null;
          rb.$cfr$intArgs$a$87b210a2f664(param0, -85, (String) null, param1);
          return;
        }
        field_k = (w) null;
        var4Lifetime1 = (String) null;
        rb.$cfr$intArgs$a$87b210a2f664(param0, -85, (String) null, param1);
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_a = null;
        int var1 = -6 % ((-1 - param0) / 47);
    }

    final boolean a(boolean param0) {
        if (param0) {
          return this.c((byte) -95) >= 20 ? true : false;
        }
        this.field_i = (wl) null;
        return this.c((byte) -95) >= 20 ? true : false;
    }

    abstract void a(int param0);

    dd() {
        this.field_d = new ab();
        this.field_g = new ab();
        this.field_n = new ab();
        this.field_l = new ab();
        this.field_i = new wl(6);
        this.field_j = 0;
        this.field_o = 0;
        this.field_f = (byte) 0;
        this.field_c = new wl(10);
    }

    static {
        field_m = "Email address is unavailable";
        field_a = new int[8192];
    }
}
