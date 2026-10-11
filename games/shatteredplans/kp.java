/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends ms {
    static int field_n;
    private String field_l;
    static String[] field_o;
    static int field_j;
    static int field_i;
    private long field_p;
    static int[] field_k;
    static bi field_m;

    public static void b(byte param0) {
        field_o = null;
        field_k = null;
        if (param0 > -44) {
          return;
        }
        field_m = null;
    }

    final static boolean a(byte param0, ln param1, ln param2, int param3, ln param4) {
        boolean stackIn_13_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_25_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        ln var11 = null;
        try {
          if ((!(param1.field_A - param3 > param4.field_A) ||
            !(param2.field_A < param1.field_A - param3)) &&
            (!(param4.field_A > param3 + param1.field_A) ||
            !(param1.field_A + param3 < param2.field_A))) {
            var5_int = param2.field_A - param4.field_A;
            var6 = param2.field_S - param4.field_S;
            if (var5_int == 0) {
              stackIn_13_0 = !(-param4.field_A + param1.field_A <= param3);
              return stackIn_13_0;
            }
            if (0 == var6) {
              stackIn_19_0 = !(param3 >= param1.field_S - param4.field_S);
              return stackIn_19_0;
            }
            if (param0 < 88) {
              var11 = (ln) null;
              kp.a((byte) 115, (ln) null, (ln) null, -109, (ln) null);
            }
            var7 = Math.sqrt((double)(var6 * var6 + var5_int * var5_int));
            var9 = (double)(-((param1.field_S - param4.field_S) * var5_int) + (param1.field_A - param4.field_A) * var6) / var7;
            stackIn_25_0 = !(param3 >= (int)var9);
            return stackIn_25_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("kp.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        ce.a(kq.f((byte) 126), true);
        if (param0 != -1) {
          field_n = 16;
        }
    }

    ds a(byte param0) {
        int var2 = 46 % ((param0 + 7) / 41);
        return oi.field_b;
    }

    final void a(ob param0, byte param1) {
        try {
          param0.b(-16426, this.field_p);
          param0.b((byte) -120, this.field_l);
          if (param1 <= 67) {
            kp.b((byte) -120);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kp.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    kp(long param0, String param1) {
        try {
          this.field_l = param1;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = -1;
    }
}
