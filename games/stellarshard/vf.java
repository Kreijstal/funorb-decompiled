/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends g implements oi {
    private String field_C;
    private int[] field_K;
    static pf field_E;
    static d field_L;
    static String field_D;
    private ck field_I;
    static int field_F;
    private bd field_G;
    private int field_B;
    private ig[] field_J;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        if (param0 <= this.field_B) {
          return;
        }
        if (param1 <= 31) {
          return;
        }
        ig[] var7 = new ig[param0];
        ig[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < this.field_B; var5++) {
          var7[var5] = this.field_J[var5];
          var4[var5] = this.field_K[var5];
        }
        this.field_K = var4;
        this.field_B = param0;
        this.field_J = var3;
    }

    final static pb[] a(pf param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        pb[] stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -78) {
            stackIn_2_0 = (pb[]) null;
            return stackIn_2_0;
          }
          if (tl.a(param0, (byte) -5, param3, param2)) {
            return dl.d((byte) 116);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vf.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_G.a(this.field_C, 14 + (param3 + this.field_w), 10 + param2 + this.field_k, this.field_p - 28, this.field_t, 16777215, -1, 0, 0, this.field_G.field_N);
    }

    final static void a(int param0, int param1, int param2, int param3, pb[] param4, int param5, bd param6, int param7, pb[] param8, int param9, int param10, int param11, int param12, boolean param13, int param14, bd param15) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        try {
          cg.a(param5, eh.field_a, param1, param14, param2, param11, sa.field_h, new qc(param4), param15, (byte) 45, param10, param9, param0, new qc(param8), kl.field_k, lg.field_b, ka.field_q, 480, ul.field_G, param6, param7);
          qc.a(param3, param13, 0);
          if (param12 != 260) {
            field_F = -126;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_5_0 = var16;
          stackIn_5_1 = new StringBuilder().append("vf.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final ig a(lf param0, String param1, byte param2) {
        ig var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ig stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ig(param1, param0);
          var4.field_u = (uk) ((Object) new b());
          var5 = -2 + this.field_t;
          var6 = -121 / ((15 - param2) / 46);
          this.b(this.field_p, 0, 0, this.field_t + 34, 23987);
          var4.b(-14 + this.field_p, 7, var5, 30, 23987);
          this.b(4, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("vf.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_B;
          this.a(var4_int + 1, 73);
          this.field_J[var4_int] = this.a((lf) (this), param2, (byte) -96);
          if (param0 != -31805) {
            String var5 = (String) null;
            this.a((lf) null, (String) null, (byte) -31);
          }
          this.field_K[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vf.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = stellarshard.field_B;
        try {
          var6_int = 0;
          if (param3) {
            return;
          }
          while (var6_int < this.field_B) {
            if (param2 != this.field_J[var6_int]) {
              var6_int++;
              continue;
            }
            var7 = this.field_K[var6_int];
            if (var7 == -1) {
              this.field_I.o(3);
            } else {
              rh.a(this.field_K[var6_int], (byte) -72);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("vf.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static id a(int param0) {
        if (param0 != 0) {
          vf.d(true);
        }
        if (null == mk.field_l) {
          mk.field_l = new id(de.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, de.field_c.field_N, -1, 2147483647, true);
        }
        return mk.field_l;
    }

    vf(ck param0, bd param1, String param2) {
        super(0, 0, 288, 0, (uk) null);
        int var4_int = 0;
        this.field_B = 0;
        try {
          this.field_C = param2;
          this.field_G = param1;
          this.field_I = param0;
          var4_int = null != this.field_C ? this.field_G.b(this.field_C, 260, this.field_G.field_N) : 0;
          this.b(288, 0, 0, var4_int + 22, 23987);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_L = null;
        field_E = null;
        if (param0) {
          field_D = (String) null;
        }
        field_D = null;
    }

    static {
        field_D = "This password contains your Player Name, and would be easy to guess";
        field_F = 480;
    }
}
