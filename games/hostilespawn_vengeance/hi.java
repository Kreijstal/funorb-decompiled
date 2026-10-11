/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi extends bj implements cd {
    static java.security.SecureRandom field_k;
    private ig field_l;
    static String field_m;
    static int[] field_n;

    final static void a(boolean param0, byte param1) {
        if (param1 <= 55) {
          field_k = (java.security.SecureRandom) null;
        }
        cf.a(true, param0, (byte) 111);
    }

    abstract String a(byte param0, String param1);

    abstract bm a(String param0, byte param1);

    public final void a(ig param0, byte param1) {
        try {
          this.a(true);
          int var3_int = 31 % ((-76 - param1) / 41);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hi.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bm d(int param0) {
        if (param0 != 11269) {
          return (bm) null;
        }
        return this.a(this.field_l.field_n, (byte) 120);
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        p var6 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var7 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var4 = uj.field_p.field_e + 24;
          var5 = uj.field_p.field_g;
          for (var1_int = 0; var1_int < ib.field_c; var1_int++) {
            var6 = jn.field_F[var1_int];
            var3 = -var5 + (int)(((double)var6.field_j.field_g + var6.field_l.field_a) * 24.0);
            var2 = (int)(24.0 * ((double)var6.field_j.field_e + var6.field_l.field_f)) - var4;
            if (var2 >= -96 &&
              -96 <= var3 &&
              var2 <= 736 &&
              var3 <= 576 ||
              (var6.field_i == 5 ||
              var6.field_i == 24)) {
              var7 = var6.field_i;
              if (var7 == 36) {
                fg.a(var2, var3, 25, var6);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "hi.P(" + param0 + ')');
        }
    }

    hi(ig param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 67 % ((param0 + 4) / 59);
        stackIn_5_0 = (null == this.field_l.field_n) || (0 == this.field_l.field_n.length());
        return stackIn_5_0;
    }

    public final void a(ig param0, int param1) {
        try {
          int var3_int = 12 / ((param1 - 0) / 41);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "hi.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        if (param0 != 24) {
          CharSequence var2 = (CharSequence) null;
          hi.a(27, (CharSequence) null);
        }
        field_k = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -110 / ((27 - param0) / 54);
          stackIn_1_0 = ik.a(10, true, -6514, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("hi.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final String b(byte param0) {
        int var2 = -73 % ((param0 + 51) / 49);
        return this.a((byte) 31, this.field_l.field_n);
    }

    static {
        field_m = "Damn! The rest of my weaponry and ammo are in the wreck. I'll have to make do with my trusty auto gun instead.";
    }
}
