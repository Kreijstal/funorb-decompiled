/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hpb extends le {
    static String field_j;
    static boolean field_i;
    static volatile long field_k;

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = VoidHunters.field_G;
        if (param0 != 255) {
          this.a(-39, false);
        }
        int[][] var10 = this.field_d.a(param1, (byte) -126);
        int[][] var3 = var10;
        if (this.field_d.field_g) {
          var4 = var10[0];
          var5 = var10[1];
          var6 = var10[2];
          for (var7 = 0; var7 < hob.field_d; var7++) {
            this.c(-117, var7, param1);
            var8 = this.a((byte) 95, 0, cg.field_q);
            var4[var7] = var8[0][rab.field_n];
            var5[var7] = var8[1][rab.field_n];
            var6[var7] = var8[2][rab.field_n];
          }
        }
        return var10;
    }

    public static void d(int param0) {
        field_j = null;
        if (param0 != -6200) {
          field_k = -61L;
        }
    }

    final void a(int param0, int param1, ds param2) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 == 0) {
            stackIn_4_1 = (param2.e((byte) -97) == 1);
            this.field_g = stackIn_4_1;
          }
          if (param1 > -60) {
            this.a(-4, 51);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("hpb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = VoidHunters.field_G;
        int[] var7 = this.field_f.a((byte) -44, param0);
        int[] var3 = var7;
        if (!param1) {
          field_j = (String) null;
        }
        if (this.field_f.field_e) {
          for (var4 = 0; hob.field_d > var4; var4++) {
            this.c(-95, var4, param0);
            var5 = this.a(0, cg.field_q, 255);
            var7[var4] = var5[rab.field_n];
          }
        }
        return var3;
    }

    private final void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        float var6;
        int var7;
        var7 = VoidHunters.field_G;
        var4 = grb.field_l[param1];
        if (param0 > -54) {
          this.a(-48, true);
        }
        var5 = sj.field_p[param2];
        var6 = (float)Math.atan2((double)(var4 - 2048), (double)(var5 - 2048));
        if (-3.141592653589793 <= (double)var6 &&
          -2.356194490192345 >= (double)var6) {
          cg.field_q = param2;
          rab.field_n = param1;
        } else if (-1.5707963267948966 >= (double)var6 &&
          -2.356194490192345 <= (double)var6) {
          rab.field_n = param2;
          cg.field_q = param1;
        } else if (-0.7853981633974483 >= (double)var6 &&
          -1.5707963267948966 <= (double)var6) {
          cg.field_q = param1;
          rab.field_n = hob.field_d - param2;
        } else if (var6 <= 0.0f &&
          (double)var6 >= -0.7853981633974483) {
          rab.field_n = param1;
          cg.field_q = -param2 + noa.field_o;
        } else if (0.0f <= var6 &&
          (double)var6 <= 0.7853981633974483) {
          cg.field_q = noa.field_o - param2;
          rab.field_n = -param1 + hob.field_d;
        } else if (0.7853981633974483 <= (double)var6 &&
          1.5707963267948966 >= (double)var6) {
          cg.field_q = noa.field_o - param1;
          rab.field_n = hob.field_d - param2;
        } else if (1.5707963267948966 <= (double)var6 &&
          2.356194490192345 >= (double)var6) {
          cg.field_q = -param1 + noa.field_o;
          rab.field_n = param2;
        } else {
          if ((double)var6 >= 2.356194490192345 &&
            3.141592653589793 >= (double)var6) {
            cg.field_q = param2;
            rab.field_n = hob.field_d - param1;
          }
        }
        cg.field_q = cg.field_q & wf.field_d;
        rab.field_n = rab.field_n & gbb.field_q;
    }

    public hpb() {
        super(1, false);
    }

    static {
        field_j = "Report abuse";
        field_k = 0L;
    }
}
