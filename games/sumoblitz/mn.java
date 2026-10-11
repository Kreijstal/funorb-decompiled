/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    String field_f;
    float field_d;
    static String[] field_g;
    private int field_a;
    static hr field_j;
    private int field_e;
    static ri field_c;
    private int field_h;
    private gn[] field_l;
    static String field_k;
    static int field_i;
    static ri[] field_b;

    final static void b(byte param0) {
        if (null != rf.field_a) {
          rf.field_a.e(false);
          if (null != he.field_n) {
            he.field_n.k(-43);
          }
          aw.j((byte) 89);
          if (param0 != -116) {
            field_g = (String[]) null;
            return;
          }
          return;
        }
        if (null != he.field_n) {
          he.field_n.k(-43);
        }
        aw.j((byte) 89);
        if (param0 != -116) {
          field_g = (String[]) null;
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, boolean param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param8) {
            mn.a((byte) 51);
          }
          while (true) {
            param3--;
            if (param3 < 0) {
              return;
            }
            var17 = param2;
            var10 = var17;
            var11 = param7;
            var12 = param6;
            var13 = param5;
            var14 = param9;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = eb.a(var12 >> 1, 16711680) + eb.a(65280, var13 >> 9) - (-eb.a(255, var14 >> 17) - var15);
            param9 = param9 + param4;
            param5 = param5 + param0;
            param7++;
            param6 = param6 + param1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("mn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(db param0, int param1, int param2) {
        pl var5 = as.field_v;
        pl var3 = var5;
        var5.g(param2, 8);
        var5.field_p = var5.field_p + 1;
        int var4 = var5.field_p;
        if (param1 > -5) {
          return;
        }
        try {
          var5.b((byte) 53, 1);
          if (null != param0.field_k) {
            var5.b((byte) 72, param0.field_k.length);
            var5.a(param0.field_k, (byte) -123, param0.field_k.length, 0);
          } else {
            var5.b((byte) 52, 0);
          }
          var5.a(var4, false);
          var5.field_p = var5.field_p - 4;
          param0.field_m = var5.c(true);
          var5.c(-var4 + var5.field_p, -13745);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "mn.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0) {
        int var3;
        gn var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        while (this.field_e < this.field_h) {
          var4 = this.field_l[this.field_e];
          if (!var4.field_a.b((byte) 127)) {
            this.a(0, -111, var4);
            return false;
          }
          if (var4.field_e >= 0 &&
            !var4.field_a.b((byte) -110, var4.field_e)) {
            this.a(var4.field_a.a(var4.field_e, (byte) 67), -75, var4);
            return false;
          }
          if (null != var4.field_h &&
            !var4.field_a.a(var4.field_h, 100)) {
            this.a(var4.field_a.a(var4.field_h, (byte) 33), -18, var4);
            return false;
          }
          if (0 > var4.field_e &&
            var4.field_h == null &&
            null != var4.field_c &&
            !var4.field_a.a(true)) {
            this.a(var4.field_a.a(0), -113, var4);
            return false;
          }
          this.field_e = this.field_e + 1;
        }
        if (param0 == 100) {
          return true;
        }
        this.field_a = 103;
        return true;
    }

    private final void a(int param0, int param1, gn param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -10) {
            mn.b((byte) -42);
          }
          var4_float = (float)(1 + this.field_e) + (float)param0 / 100.0f;
          this.field_d = var4_float * (float)this.field_a / (float)(1 + this.field_h);
          if (0 != param0) {
            this.field_f = param2.field_c + " - " + param0 + "%";
            return;
          }
          this.field_f = param2.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("mn.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
        field_c = null;
        field_k = null;
        if (param0 == 17) {
          return;
        }
        field_b = (ri[]) null;
    }

    private mn() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "High";
        field_i = 0;
    }
}
