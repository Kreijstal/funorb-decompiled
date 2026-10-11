/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vua extends qr {
    static jpa field_y;
    static String field_z;
    static String field_C;
    static int field_B;
    static String[] field_D;
    static nh field_A;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 70) {
            return true;
          }
          stackIn_7_0 = (this.a(param6, param1, -123, param3, param2)) && (super.a(119, param1, param2, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("vua.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          if (param2 != 0) {
            return;
          }
          if (this.field_m == 0) {
            return;
          }
          if (this.field_p != 0) {
            afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
            this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
            afa.field_c.a((byte) 38);
            return;
          }
          return;
        }
        if (null == this.field_r) {
          if (param2 != 0) {
            return;
          }
          if (this.field_m == 0) {
            return;
          }
          if (this.field_p == 0) {
            return;
          }
          afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
          this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
          afa.field_c.a((byte) 38);
          return;
        }
        this.field_r.a((ae) (this), param0, 16777215, param1, true);
        if (param2 != 0) {
          return;
        }
        if (this.field_m == 0) {
          return;
        }
        if (this.field_p == 0) {
          return;
        }
        afa.field_c.a((byte) 125, this.field_p + this.field_n + param1, param0 + this.field_i, this.field_n + param1, this.field_i + (param0 + this.field_m));
        this.field_x.a(param0 + this.field_i, this.field_n + param1, param2 ^ 0, param3);
        afa.field_c.a((byte) 38);
    }

    public static void a(byte param0) {
        field_A = null;
        field_D = null;
        field_y = null;
        field_z = null;
        if (param0 == -4) {
          field_C = null;
          return;
        }
        vua.a((byte) -41);
        field_C = null;
    }

    final void c(int param0) {
        this.field_x.c((byte) -47);
        if (param0 <= 91) {
          this.c(75);
        }
    }

    final static boolean e(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_20_0 = false;
        if (!we.b(param0, param1, 2048)) {
          return false;
        }
        if (param2 == 13650) {
          stackIn_15_0 = o.a(-1, param1, param0);
          stackIn_16_1 = ((45056 & param0) == 0) ? false : true;
          if (stackIn_15_0 | stackIn_16_1 | mpa.a(false, param1, param0)) {
            return true;
          }
          stackIn_20_0 = ((param1 & 55) == 0);
          return stackIn_20_0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
        }
        field_A = (nh) null;
        stackIn_5_0 = o.a(-1, param1, param0);
        stackIn_6_1 = ((45056 & param0) == 0) ? false : true;
        if (stackIn_5_0 | stackIn_6_1 | mpa.a(false, param1, param0)) {
          return true;
        }
        stackIn_10_0 = ((param1 & 55) == 0);
        return stackIn_10_0 & (cra.a(param1, param2 ^ -13642, param0) | wq.b(param1, param0, 8000));
    }

    vua(int param0, int param1, int param2, int param3, isa param4, ae param5) {
        super(param0, param1, param2, param3, param4, (qc) null);
        try {
          this.field_x = param5;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vua.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "If you can't take the heat, don't practise your backstroke in the lagoons of lava. I heard Arnie met his end here.";
        field_B = -1;
        field_D = new String[]{"<%0> was punctured", "<%0> was popped", "<%0> got the point", "<%0> served as an impromptu dartboard", "<%0> didn't judge the timings correctly"};
        field_z = "Spectate";
    }
}
