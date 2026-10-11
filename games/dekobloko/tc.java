/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends w {
    static byte[][] field_Nb;
    private w field_Vb;
    static w field_Ub;
    private w[] field_Rb;
    static ck field_Tb;
    static String field_Qb;
    int field_Pb;
    private w[] field_Sb;
    static w field_Ob;

    final void b(boolean param0) {
        int var2 = 0;
        w dupTemp$0 = null;
        w dupTemp$1 = null;
        int var3;
        var3 = client.field_A ? 1 : 0;
        for (var2 = 0; this.field_Rb.length > var2; var2++) {
          if (var2 != this.field_Pb &&
            0 != this.field_Rb[var2].field_ob) {
            this.field_Rb[this.field_Pb].field_ab = false;
            dupTemp$0 = this.field_Sb[this.field_Pb];
            dupTemp$0.field_vb = dupTemp$0.field_vb + 10000;
            this.field_Pb = var2;
            this.field_Rb[var2].field_ab = true;
            dupTemp$1 = this.field_Sb[var2];
            dupTemp$1.field_vb = dupTemp$1.field_vb - 10000;
          }
        }
        if (param0) {
          this.a(-26, true, -12);
        }
    }

    public static void h(byte param0) {
        if (param0 <= 83) {
          return;
        }
        field_Nb = (byte[][]) null;
        field_Ob = null;
        field_Tb = null;
        field_Qb = null;
        field_Ub = null;
    }

    tc(long param0, w param1, String[] param2, w param3, w[] param4, int param5) {
        super(param0, (w) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        w var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Rb = new w[param2.length];
          this.field_Vb = new w(0L, param3);
          this.field_Sb = param4;
          for (var8_int = 0; param2.length > var8_int; var8_int++) {
            var9 = new w(0L, param1);
            var9.field_Y = param2[var8_int];
            this.field_Rb[var8_int] = var9;
            this.a(var9, -16834);
          }
          this.a(this.field_Vb, -16834);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_Vb.a(param4[var11], -16834);
            var11++;
          }
          this.field_Pb = param5;
          this.field_Rb[param5].field_ab = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("tc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        w dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = client.field_A ? 1 : 0;
        if (!param1) {
          this.a(-2, -35, 12, -28, 52, 1, -110);
        }
        for (var4 = 0; var4 < this.field_Rb.length; var4++) {
          var5 = var4 * this.field_mb / this.field_Rb.length;
          var6 = this.field_mb * (var4 + 1) / this.field_Rb.length;
          this.field_Rb[var4].field_vb = var5;
          this.field_Rb[var4].field_Ib = 0;
          this.field_Rb[var4].field_mb = var6 - var5;
          this.field_Rb[var4].field_N = param2;
        }
        this.field_Vb.a(this.field_mb, 0, param2, -param2 + this.field_N, 0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Sb.length) {
          this.field_Sb[var8].a(this.field_Vb.field_mb - 2 * param0, 0, param0, -(2 * param0) + this.field_Vb.field_N, param0);
          if (var8 != this.field_Pb) {
            dupTemp$0 = this.field_Sb[var8];
            dupTemp$0.field_vb = dupTemp$0.field_vb + 10000;
          }
          var8++;
        }
    }

    final static w g(byte param0) {
        if (param0 != 98) {
          return (w) null;
        }
        return dm.a((byte) 108);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= -44) {
          this.a(4, true, -41);
        }
        this.field_N = param0;
        this.field_mb = param2;
        this.field_vb = param5;
        this.field_Ib = param1;
        this.a(param3, true, param4);
    }

    final static int a(int param0, hl param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var3 = client.field_A ? 1 : 0;
        try {
          var2_int = ij.field_c;
          if (param1.field_m == 2) {
            if (!param1.field_j) {
              if (param1.field_i == 0 &&
                param1.field_n == 0) {
                var2_intLifetime1 = tl.field_q[param1.field_m];
              } else {
                var2_intLifetime1 = ul.field_c[param1.field_m];
              }
            } else {
              var2_intLifetime1 = ij.field_c;
            }
          } else {
            if (4 != param1.field_m) {
              if (param1.field_r != uc.field_g) {
                var2_intLifetime1 = ul.field_c[param1.field_m];
              } else {
                var2_intLifetime1 = tl.field_q[param1.field_m];
              }
            } else {
              var2_intLifetime1 = ul.field_c[param1.field_m];
            }
          }
          if (param0 != 4636) {
            tc.g((byte) 85);
          }
          stackIn_17_0 = var2_intLifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("tc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
