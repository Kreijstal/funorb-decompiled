/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static int field_a;
    static int field_d;
    static int field_j;
    static String[] field_c;
    static String field_b;
    private int field_k;
    private ht field_e;
    private int field_f;
    static String field_g;
    static ot field_h;
    private ci field_i;

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -32) {
          return;
        }
        field_b = null;
        field_c = null;
        field_h = null;
    }

    eq(int param0) {
        this(param0, param0);
    }

    final static void a(int param0) {
        int var1 = rb.field_Bb * rb.field_Bb;
        int var2 = -(pg.field_b * pg.field_b) + var1;
        int var3 = c.field_c + var2 * (-c.field_c + na.field_Ab) / var1;
        g.field_a.a(true, 640, df.field_H, var3, 120);
        cf.a(124, mj.field_b, 640, 5, eb.field_b, na.field_Ab - 24, param0);
    }

    final static boolean a(boolean param0) {
        if (param0) {
          eq.a(21);
          if (null != wi.field_v) {
            return true;
          }
          if (ne.k((byte) -55)) {
            return true;
          }
          if (ck.field_b != null) {
            return true;
          }
          if (!in.a((byte) 79)) {
            return false;
          }
          return true;
        }
        if (null != wi.field_v) {
          return true;
        }
        if (ne.k((byte) -55)) {
          return true;
        }
        if (ck.field_b != null) {
          return true;
        }
        if (!in.a((byte) 79)) {
          return false;
        }
        return true;
    }

    private final void a(byte param0, long param1) {
        ij var4 = (ij) (this.field_e.a(param1, (byte) 111));
        if (param0 == 90) {
          this.a(var4, -64);
          return;
        }
        Object var5 = (Object) null;
        this.a(-116L, (Object) null, (byte) 82);
        this.a(var4, -64);
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 1) {
          nq.field_I = 0;
          ig.field_g = vp.field_c;
          ps.field_e = 0;
          fp.field_l = new ko(2);
          fp.field_l.a(vp.a(n.field_m, el.field_A, (byte) 42), 0, -1, param1);
          return;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        ij var6 = null;
        pn var6_ref = null;
        int var7 = Kickabout.field_G;
        try {
          if (param0 > this.field_k) {
            throw new IllegalStateException();
          }
          this.a((byte) 90, param3);
          this.field_f = this.field_f - param0;
          while (this.field_f < 0) {
            var6 = (ij) (this.field_i.a((byte) -120));
            this.a(var6, param2 - 126);
          }
          var6_ref = new pn(param1, param0);
          this.field_e.a(var6_ref, -78, param3);
          this.field_i.a(-8545, var6_ref);
          ((ij) ((Object) var6_ref)).field_l = (long)param2;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "eq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, Object param1, byte param2) {
        try {
          this.a(1, param1, 0, param0);
          if (param2 > -56) {
            this.a((byte) -83, -58L);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "eq.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Object a(long param0, byte param1) {
        pn var6;
        ij var7;
        Object var8;
        Object var9;
        pn var6Lifetime1;
        var7 = (ij) (this.field_e.a(param0, (byte) 69));
        if (param1 == 43) {
          if (var7 == null) {
            return null;
          }
          var9 = var7.a(-91);
          if (var9 == null) {
            var7.c((byte) -109);
            var7.f(62);
            this.field_f = this.field_f + var7.field_o;
            return null;
          }
          if (var7.h((byte) 113)) {
            var6 = new pn(var9, var7.field_o);
            this.field_e.a(var6, param1 ^ -27, var7.field_a);
            this.field_i.a(-8545, var6);
            ((ij) ((Object) var6)).field_l = 0L;
            var7.c((byte) -109);
            var7.f(53);
          } else {
            this.field_i.a(param1 ^ -8524, var7);
            var7.field_l = 0L;
          }
          return var9;
        }
        this.a(75L, (byte) -114);
        if (var7 == null) {
          return null;
        }
        var8 = var7.a(-91);
        if (var8 == null) {
          var7.c((byte) -109);
          var7.f(62);
          this.field_f = this.field_f + var7.field_o;
          return null;
        }
        if (var7.h((byte) 113)) {
          var6Lifetime1 = new pn(var8, var7.field_o);
          this.field_e.a(var6Lifetime1, param1 ^ -27, var7.field_a);
          this.field_i.a(-8545, var6Lifetime1);
          ((ij) ((Object) var6Lifetime1)).field_l = 0L;
          var7.c((byte) -109);
          var7.f(53);
        } else {
          this.field_i.a(param1 ^ -8524, var7);
          var7.field_l = 0L;
        }
        return var8;
    }

    private final void a(ij param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -25 % ((-5 - param1) / 54);
          if (param0 == null) {
            return;
          }
          param0.c((byte) -109);
          param0.f(-113);
          this.field_f = this.field_f + param0.field_o;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eq.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private eq(int param0, int param1) {
        int var3;
        this.field_i = new ci();
        this.field_f = param0;
        this.field_k = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_e = new ht(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_e = new ht(var3);
        return;
    }

    static {
        field_j = 0;
        field_a = field_j;
        field_g = "winner";
        field_b = "New!";
    }
}
