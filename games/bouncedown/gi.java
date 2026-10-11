/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private int field_a;
    private lh[] field_f;
    float field_g;
    String field_d;
    private int field_c;
    static String field_b;
    static int field_e;
    private int field_h;

    public static void b(int param0) {
        int var1 = -89 % ((param0 - 27) / 45);
        field_b = null;
    }

    private final void a(int param0, lh param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        lh var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -126) {
            var5 = (lh) null;
            this.a(91, (lh) null, 26);
          }
          var4_float = (float)(1 + this.field_a) + (float)param2 / 100.0f;
          this.field_g = var4_float * (float)this.field_c / (float)(this.field_h + 1);
          if (param2 != 0) {
            this.field_d = param1.field_d + " - " + param2 + "%";
            return;
          }
          this.field_d = param1.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        lh var2;
        int var3;
        lh var4;
        var3 = Bounce.field_N;
        if (param0 != 0) {
          this.a(10);
        }
        while (this.field_a < this.field_h) {
          var4 = this.field_f[this.field_a];
          var2 = var4;
          if (!var4.field_c.c(44)) {
            this.a(-127, var4, 0);
            return false;
          }
          if (0 <= var4.field_a &&
            !var4.field_c.d(var4.field_a, 84)) {
            this.a(-128, var2, var4.field_c.a(var4.field_a, 0));
            return false;
          }
          if (null != var4.field_e &&
            !var4.field_c.b(var4.field_e, false)) {
            this.a(-127, var2, var4.field_c.b(var4.field_e, (byte) -100));
            return false;
          }
          if (var4.field_a < 0 &&
            var4.field_e == null &&
            var4.field_d != null &&
            !var4.field_c.a((byte) -73)) {
            this.a(-128, var2, var4.field_c.a(100));
            return false;
          }
          this.field_a = this.field_a + 1;
        }
        return true;
    }

    final static o a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        o var3 = null;
        Object stackIn_2_0 = null;
        o stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (o) (stackIn_2_0);
          }
          var2_int = -90 % ((param1 + 48) / 34);
          var3 = new o(param0, cl.field_n, ae.field_c, ih.field_V, qh.field_i, he.field_k, ph.field_c);
          vb.a((byte) 122);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gi.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8;
        int var9;
        var9 = Bounce.field_N;
        var8 = 115 % ((param0 + 65) / 38);
        if (param2 > param1) {
          if (param4 > param2) {
            kg.a(param7, param2, param1, param4, param3, na.field_d, param5, 92, param6);
          } else {
            if (param4 <= param1) {
              kg.a(param6, param1, param4, param2, param7, na.field_d, param5, 118, param3);
            } else {
              kg.a(param3, param4, param1, param2, param7, na.field_d, param5, 111, param6);
            }
          }
        } else {
          if (param4 > param1) {
            kg.a(param6, param1, param2, param4, param3, na.field_d, param5, 97, param7);
          } else {
            if (param4 <= param2) {
              kg.a(param7, param2, param4, param1, param6, na.field_d, param5, 126, param3);
            } else {
              kg.a(param3, param4, param2, param1, param6, na.field_d, param5, 105, param7);
            }
          }
        }
    }

    private gi() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 480;
    }
}
