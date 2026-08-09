/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eq implements sk {
    private long field_e;
    static String field_c;
    static double field_a;
    static int field_b;
    static long field_d;

    public final String a(int param0) {
        if (param0 >= 115) {
          if (!this.b(true)) {
            if (350L + this.field_e > km.b(-1)) {
              return null;
            } else {
              return this.b(0);
            }
          } else {
            return null;
          }
        } else {
          this.field_e = 37L;
          if (!this.b(true)) {
            if (350L + this.field_e > km.b(-1)) {
              return null;
            } else {
              return this.b(0);
            }
          } else {
            return null;
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 86 / ((param0 - -24) / 46);
    }

    public final void a(boolean param0) {
        if (!param0) {
            eq.b((byte) 82);
            this.field_e = km.b(-1);
            return;
        }
        this.field_e = km.b(-1);
    }

    abstract String b(int param0);

    abstract cd c(int param0);

    public final cd a(byte param0) {
        if (!this.b(true)) {
          if (this.field_e + 350L <= km.b(-1)) {
            if (param0 >= -74) {
              this.a(true);
              return this.c(0);
            } else {
              return this.c(0);
            }
          } else {
            return q.field_a;
          }
        } else {
          return df.field_r;
        }
    }

    final static void a(t param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            var9_int = -param1 + (param4 + param0.field_v) + param3;
            var10 = param8 + param3 + (param4 + param0.field_v);
            var11 = (param0.field_t >> 1607424321) + (param0.field_r + param5);
            ph.f(var9_int, 0, var10, param7 + var11);
            param0.a(-1 + param4, param5 + -1, param6);
            param0.a(param4 - 1, 1 + param5, param6);
            ph.a(mo.field_w);
            ph.f(1 + var9_int, 0, var10 - -1, var11 + param7);
            param0.a(1 + param4, param5 - 1, param6);
            param0.a(1 + param4, 1 + param5, param6);
            ph.a(mo.field_w);
            var9_int = -param8 + (param0.field_s + param0.field_v) - (-param4 + param3);
            var10 = param0.field_v + (param0.field_s + (param4 - param3) + -param1);
            ph.f(var9_int, var11 - param7, var10, 480);
            param0.a(param4 + -1, -1 + param5, param6);
            param0.a(param4 - 1, 1 + param5, param6);
            ph.a(mo.field_w);
            ph.f(var9_int + param2, var11 + -param7, var10 + 1, 480);
            param0.a(1 + param4, param5 - 1, param6);
            param0.a(param4 - -1, 1 + param5, param6);
            ph.a(mo.field_w);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "eq.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_c = "<col=2>Look out for:</col>";
        field_a = -1.0;
        field_d = 0L;
    }
}
