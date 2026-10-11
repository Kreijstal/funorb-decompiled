/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends kf implements vn {
    static String field_Z;
    static pi[] field_Y;
    static w field_ab;
    private String[] field_V;
    private ek[] field_bb;
    private fi field_W;
    static int[][] field_U;
    static String field_X;
    static String field_T;
    static String field_S;

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          var6_int = 0;
          if (param0 != 67) {
            df.a(123, -2, -15);
          }
          while (var6_int < this.field_V.length) {
            if (this.field_bb[var6_int] == param2) {
              this.field_W.a(this.field_V[var6_int], param0 - 28531);
            }
            var6_int++;
          }
          if (param2 == this.field_bb[this.field_V.length]) {
            this.field_W.a(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("df.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(86, param1, param2, param3)) {
            return true;
          }
          var5_int = 11 / ((-22 - param0) / 49);
          if (param1 == 98) {
            stackIn_7_0 = this.a(param2, (byte) -121);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(32, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("df.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    df(fi param0) {
        super(0, 0, 0, 0, (gl) null);
        try {
          this.field_W = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -124, param2, param3);
        if (param2 != 0) {
          return;
        }
        if (param1 > -103) {
          this.a(-127, -2, -30, -66);
        }
        mm var5 = hh.field_e;
        if (this.field_V != null) {
          var5.a(g.field_K, param0 + this.field_u, param3 + this.field_D, this.field_t, 20, 16777215, -1, 0, 0, var5.field_R + var5.field_K);
        }
    }

    public static void a(int param0) {
        field_ab = null;
        field_Y = null;
        field_X = null;
        field_U = (int[][]) null;
        field_T = null;
        if (param0 != 1) {
          df.a(-31);
        }
        field_Z = null;
        field_S = null;
    }

    final static w i(int param0) {
        int var1 = -96 / ((45 - param0) / 63);
        return ec.field_k.field_Ob;
    }

    final static ck[] a(int param0, int param1, int param2) {
        if (param1 != 0) {
          df.a(10);
        }
        return ob.a(param2, param0, -3932, 1);
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
        on var4 = null;
        int var6 = 0;
        var6 = client.field_A ? 1 : 0;
        try {
          this.field_H.c(126);
          if (param1 != null &&
            param1.length != 0) {
            if (param0 != 32) {
              df.a(-125, -89, -29);
            }
            var3_int = param1.length;
            this.field_V = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_V[var4_int] = ua.a((CharSequence) ((Object) param1[var4_int]), true).replace(' ', ' ');
            }
            var4 = new on(hh.field_e, 0, 1);
            this.field_bb = new ek[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_bb[var5] = new ek(this.field_V[var5], (kg) (this));
              this.field_bb[var5].field_p = (gl) ((Object) var4);
              this.field_bb[var5].field_B = client.field_B;
              this.field_bb[var5].b(15, 80, 0, var5 * 16 + 20, -16555);
              this.b(this.field_bb[var5], (byte) -55);
            }
            this.field_bb[var3_int] = new ek(cc.field_e, (kg) (this));
            this.field_bb[var3_int].field_p = (gl) ((Object) var4);
            this.field_bb[var3_int].b(15, 100, 0, 20 + 16 * (1 + var3_int), -16555);
            this.b(this.field_bb[var3_int], (byte) -55);
            return;
          }
          this.field_V = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("df.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_Z = "(Including <%0>)";
        field_X = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_S = "Press TAB to chat or F10 to open Quick Chat.";
        field_T = "Reject <%0> from this game";
    }
}
