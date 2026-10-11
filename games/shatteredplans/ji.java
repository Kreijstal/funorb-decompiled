/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ji extends f implements ki {
    static ns field_G;
    static ub field_I;
    static String field_F;
    private ja field_H;
    static bi[] field_E;
    static int[][] field_D;

    abstract int d(boolean param0);

    public static void g(byte param0) {
        field_E = null;
        field_G = null;
        field_F = null;
        field_I = null;
        int var1 = 50 / ((param0 - 71) / 37);
        field_D = (int[][]) null;
    }

    ji(int param0, int param1, int param2, int param3, iq param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int f(byte param0);

    public final gk a(byte param0) {
        if (param0 < 58) {
          field_I = (ub) null;
        }
        return (gk) ((Object) this.field_H);
    }

    void a(ja param0, int param1) {
        try {
          this.field_H = param0;
          this.field_H.field_m = this;
          if (param1 > -47) {
            String[] var4 = (String[]) null;
            ji.a((String[]) null, 46);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ji.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract boolean k(int param0);

    abstract int l(int param0);

    final static int a(int param0) {
        if (param0 > -115) {
          return -24;
        }
        return kl.field_t;
    }

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (tc.a(param0.charAt(var2_int), 2)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (tc.a(param0.charAt(-1 + var3), 2)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          var6 = var2_int;
          if (!param1) {
            ji.a(22);
          }
          while (var6 < var3) {
            var7 = param0.charAt(var6);
            if (ne.a(0, (char) var7)) {
              var8 = os.a((char) var7, -31024);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
            var6++;
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("ji.K(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var8 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = -1;
          var3 = 0;
          if (param1 != 62) {
            return;
          }
          while (var3 < args.length) {
            var4 = args[var3];
            if (var2_int != -1) {
              args[var3] = re.a("<col=<%0>>", nc.a(param1, 4397), new String[]{Integer.toString(var2_int, 16)}) + var4;
            }
            var5 = ua.a(var4, "<col=", 0);
            var6 = ua.a(var4, "</col>", param1 - 62);
            if (var5 <= var6) {
              if (var6 != -1) {
                var2_int = -1;
              }
            } else {
              var7 = var4.indexOf('>', var5);
              if (var7 != -1) {
                var8 = var4.substring(5 + var5, var7);
                var2_int = wm.a((CharSequence) ((Object) var8), 16, (byte) 11);
              }
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("ji.F(");
          if (args == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kj a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        kj stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -7416) {
            ji.a(7);
          }
          if (ue.field_a == fj.field_s) {
            stackIn_4_0 = null;
            return (kj) (stackIn_4_0);
          }
          if (rh.field_g == fj.field_s &&
            param1.equals(gp.field_b)) {
            fj.field_s = oj.field_Fb;
            stackIn_8_0 = ij.field_a;
            return stackIn_8_0;
          }
          gp.field_b = param1;
          ij.field_a = null;
          fj.field_s = ue.field_a;
          stackIn_10_0 = null;
          return (kj) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ji.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_F = "Please try changing the following settings:  ";
    }
}
