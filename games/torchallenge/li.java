/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends kj implements sg {
    static boolean field_N;
    static int field_K;
    static String[] field_J;
    private ng[] field_L;
    private String[] field_M;
    private tb field_P;
    static java.applet.Applet field_O;

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        me var4 = null;
        int var6 = 0;
        String var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          this.field_F.a(param0 ^ 8671);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_M = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_M[var4_int] = jl.a(TorChallenge.a(param0, 6625), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new me(oe.field_g, 0, 1);
            this.field_L = new ng[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_L[var5] = new ng(this.field_M[var5], (gg) (this));
              this.field_L[var5].field_q = (j) ((Object) var4);
              this.field_L[var5].field_r = aa.field_c;
              this.field_L[var5].a((byte) 116, 0, 15, 80, 20 + var5 * 16);
              this.a(param0 ^ -6620, this.field_L[var5]);
            }
            if (param0 != -6620) {
              var7 = (String) null;
              li.a((byte) -109, (String) null);
            }
            this.field_L[var3_int] = new ng(ee.field_y, (gg) (this));
            this.field_L[var3_int].field_q = (j) ((Object) var4);
            this.field_L[var3_int].a((byte) 118, 0, 15, 100, 16 + var3_int * 16 + 20);
            this.a(param0 + 6620, this.field_L[var3_int]);
            return;
          }
          this.field_M = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("li.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 != -82) {
            return true;
          }
          while (var2_int < param1.length()) {
            var3 = param1.charAt(var2_int);
            if (!bk.a(32191, (char) var3) &&
              !qb.a((char) var3, true)) {
              return true;
            }
            var2_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("li.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param4) {
            this.field_L = (ng[]) null;
          }
          for (var6_int = 0; this.field_M.length > var6_int; var6_int++) {
            if (this.field_L[var6_int] == param0) {
              this.field_P.a(this.field_M[var6_int], -95);
            }
          }
          if (param0 == this.field_L[this.field_M.length]) {
            this.field_P.a(-23128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("li.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          li.a((byte) -66, (String) null);
        }
        field_O = null;
        field_J = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        eg var5 = oe.field_g;
        if (this.field_M != null) {
          var5.a(dg.field_Y, this.field_m + param1, this.field_i + param0, this.field_p, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_x);
        }
    }

    li(tb param0) {
        super(0, 0, 0, 0, (j) null);
        try {
          this.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            return true;
          }
          if (super.a(param0, param1, (byte) 38, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_9_0 = this.a(param3, (byte) -16);
            return stackIn_9_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_13_0 = this.b(95, param3);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("li.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_J = new String[]{"Master 1", "Master 2", "Master 3"};
    }
}
