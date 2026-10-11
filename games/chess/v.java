/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private cn field_l;
    private bl field_f;
    static String field_h;
    private int field_c;
    static String field_b;
    static gm field_e;
    static c field_k;
    static int field_m;
    static int field_d;
    private int field_g;
    static km field_i;
    static c field_j;
    static long field_a;

    private final void a(int param0, Object param1, int param2, long param3) {
        cm var6 = null;
        el var6_ref = null;
        int var7 = Chess.field_G;
        if (param0 > this.field_g) {
          throw new IllegalStateException();
        }
        this.a(param3, (byte) 91);
        this.field_c = this.field_c - param0;
        if (param2 != -10043) {
          return;
        }
        try {
          while (this.field_c < 0) {
            var6 = (cm) (this.field_l.c(-14336));
            this.a(1, var6);
          }
          var6_ref = new el(param1, param0);
          this.field_f.a(var6_ref, param3, 31313);
          this.field_l.a(var6_ref, false);
          ((cm) ((Object) var6_ref)).field_l = 0L;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "v.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, cm param1) {
        RuntimeException var3 = null;
        cm var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            param1.c(-2193);
            param1.d(param0 - 2);
            this.field_c = this.field_c + param1.field_q;
          }
          if (param0 == 1) {
            return;
          }
          var4 = (cm) null;
          this.a(-33, (cm) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("v.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    v(int param0) {
        this(param0, param0);
    }

    final Object a(byte param0, long param1) {
        el var6 = null;
        cm var7 = (cm) (this.field_f.a(param1, (byte) -127));
        if (var7 == null) {
          return null;
        }
        Object var5 = var7.f(param0 + 67);
        if (var5 == null) {
          var7.c(param0 - 2116);
          var7.d(-1);
          this.field_c = this.field_c + var7.field_q;
          return null;
        }
        if (param0 == -77) {
          if (!var7.g(-113)) {
            this.field_l.a(var7, false);
            var7.field_l = 0L;
          } else {
            var6 = new el(var5, var7.field_q);
            this.field_f.a(var6, var7.field_e, 31313);
            this.field_l.a(var6, false);
            ((cm) ((Object) var6)).field_l = 0L;
            var7.c(-2193);
            var7.d(-1);
          }
          return var5;
        }
        return (Object) null;
    }

    public static void a(byte param0) {
        field_b = null;
        field_i = null;
        field_e = null;
        field_h = null;
        field_j = null;
        if (param0 >= -87) {
          return;
        }
        field_k = null;
    }

    private v(int param0, int param1) {
        int var3;
        this.field_l = new cn();
        this.field_g = param0;
        this.field_c = param0;
        var3 = 1;
        while (true) {
          if (var3 + var3 >= param0) {
            this.field_f = new bl(var3);
            return;
          }
          if (var3 < param1) {
            var3 = var3 + var3;
            continue;
          }
          break;
        }
        this.field_f = new bl(var3);
        return;
    }

    private final void a(long param0, byte param1) {
        cm var6 = null;
        Object var4 = null;
        cm var6Lifetime1;
        if (param1 > 55) {
          var6 = (cm) (this.field_f.a(param0, (byte) 112));
          this.a(1, var6);
          return;
        }
        cm var5 = (cm) null;
        this.a(-68, (cm) null);
        var6Lifetime1 = (cm) (this.field_f.a(param0, (byte) 112));
        this.a(1, var6Lifetime1);
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          vl.field_A = kn.field_D;
          if (param0 != 31689) {
            field_e = (gm) null;
          }
          if (param1 != 255) {
            if (100 > param1) {
              kf.field_j = sc.a(param2, param1, (byte) 113);
              return;
            }
            if (param1 > 105) {
              kf.field_j = sc.a(param2, param1, (byte) 113);
              return;
            }
            var7 = param3;
            jc.a((byte) 111, var7);
            kf.field_j = a.a(param3, -101);
            return;
          }
          stackIn_11_0 = param0 ^ 13172;
          stackIn_12_1 = !(cn.field_f >= 13);
          kf.field_j = cf.b(stackIn_11_0, stackIn_12_1);
          var6 = (String[]) null;
          jc.a((byte) 98, (String[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("v.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(long param0, int param1, Object param2) {
        try {
          this.a(param1, param2, -10043, param0);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "v.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = 0;
        field_d = 2;
        field_h = "Email address is unavailable";
    }
}
