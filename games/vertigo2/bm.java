/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends ji {
    private int field_F;
    private int field_C;
    static tj field_I;
    private int field_z;
    static String field_A;
    static long field_H;
    static String field_D;
    static String field_B;
    static int[][] field_G;
    static int[] field_E;
    static String field_y;

    final void a(int param0) {
        if (param0 >= -98) {
          field_D = (String) null;
        }
        this.field_z = this.field_F - this.field_C;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param0 == param4) {
          gh.a(param5, param1, param2, 11, param4);
          return;
        }
        if (-param4 + param5 >= ap.field_e &&
          ib.field_a >= param5 + param4 &&
          ua.field_e <= param1 - param0 &&
          param1 + param0 <= cj.field_D) {
          rc.a(param4, param2, param0, param1, param5, (byte) -126);
        } else {
          mq.a(false, param0, param2, param4, param1, param5);
        }
        if (param3 <= 85) {
          field_y = (String) null;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_F = param2.a((byte) -11);
            } else {
              if (var4_int == 2) {
                stackIn_11_1 = (param2.h(-11) == 1);
                this.field_o = stackIn_11_1;
              }
            }
          } else {
            this.field_C = param2.a((byte) -11);
          }
          if (param0 != 110) {
            field_H = 55L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("bm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public bm() {
        super(1, false);
        this.field_F = 3072;
        this.field_C = 1024;
        this.field_z = 2048;
    }

    final int[][] b(int param0, int param1) {
        int[][] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          return (int[][]) null;
        }
        int[][] var20 = this.field_v.a(param1, -2);
        int[][] var15 = var20;
        int[][] var13 = var15;
        int[][] var3 = var13;
        if (this.field_v.field_c) {
          var28 = this.c(0, 3, param1);
          var29 = var28[0];
          var30 = var28[1];
          var31 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          for (var11 = 0; var11 < we.field_M; var11++) {
            var8[var11] = (var29[var11] * this.field_z >> 12) + this.field_C;
            var9[var11] = (this.field_z * var30[var11] >> 12) + this.field_C;
            var10[var11] = this.field_C + (this.field_z * var31[var11] >> 12);
          }
        }
        return var13;
    }

    final int[] c(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          return (int[]) null;
        }
        int[] var7 = this.field_x.a(param0, (byte) 73);
        int[] var3 = var7;
        if (this.field_x.field_i) {
          var4 = this.a(0, -1, param0);
          for (var5 = 0; we.field_M > var5; var5++) {
            var7[var5] = (this.field_z * var4[var5] >> 12) + this.field_C;
          }
        }
        return var3;
    }

    final static void g(int param0) {
        pm.field_a = false;
        if (null != ji.field_n) {
          ji.field_n.a((byte) 34);
        }
        if (ui.field_g != param0) {
          fb.h(0);
        }
        gr.field_Y = 0;
    }

    final static void a(si param0, boolean param1, int param2) {
        try {
          gh.a(param0, (byte) -123, param1, 256);
          if (param2 != 4) {
            field_B = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "bm.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_G = (int[][]) null;
        if (!param0) {
          return;
        }
        field_A = null;
        field_D = null;
        field_E = null;
        field_B = null;
        field_y = null;
        field_I = null;
    }

    static {
        field_I = new tj();
        field_A = "You are offering a rematch.";
        field_D = "Loading levels";
        field_G = new int[12][65536];
        field_B = "Private";
        field_E = new int[4];
        field_y = "OK";
    }
}
