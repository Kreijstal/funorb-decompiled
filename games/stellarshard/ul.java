/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends g implements oi {
    static int field_G;
    static pb field_B;
    private String[] field_E;
    static String field_H;
    private rf field_F;
    private ig[] field_C;
    static int field_D;

    ul(rf param0) {
        super(0, 0, 0, 0, (uk) null);
        try {
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        bd var5 = si.field_V;
        if (null != this.field_E) {
          var5.a(ic.field_b, param3 + this.field_w, this.field_k + param2, this.field_p, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_N);
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = stellarshard.field_B;
        try {
          for (var6_int = 0; this.field_E.length > var6_int; var6_int++) {
            if (param2 == this.field_C[var6_int]) {
              this.field_F.a((byte) -121, this.field_E[var6_int]);
            }
          }
          if (param3) {
            field_G = -28;
          }
          if (this.field_C[this.field_E.length] == param2) {
            this.field_F.a(-103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ul.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.a(param3, -8666);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_8_0 = this.a(param3, (byte) 100);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ul.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ll var4 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          this.field_y.a((byte) -8);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_E = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_E[var4_int] = jf.b((CharSequence) ((Object) param1[var4_int]), true).replace(' ', ' ');
            }
            if (param0 != 2178) {
              field_G = 43;
            }
            var4 = new ll(si.field_V, 0, 1);
            this.field_C = new ig[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_C[var5] = new ig(this.field_E[var5], (lf) (this));
              this.field_C[var5].field_u = (uk) ((Object) var4);
              this.field_C[var5].field_x = bl.field_c;
              this.field_C[var5].b(80, 0, 20 + var5 * 16, 15, 23987);
              this.b(param0 - 2174, this.field_C[var5]);
            }
            this.field_C[var3_int] = new ig(ch.field_b, (lf) (this));
            this.field_C[var3_int].field_u = (uk) ((Object) var4);
            this.field_C[var3_int].b(100, 0, 16 * (1 + var3_int) + 20, 15, param0 ^ 21809);
            this.b(4, this.field_C[var3_int]);
            return;
          }
          this.field_E = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_B = null;
        if (param0 != 160) {
          ul.a(117);
        }
    }

    static {
        field_H = "Logging in...";
        field_D = 250;
    }
}
