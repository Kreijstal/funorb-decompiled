/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends ji {
    static int field_z;
    static String field_E;
    private int field_C;
    private int field_D;
    static int field_B;
    static int field_y;
    static byte[] field_A;

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var8;
        int var7Lifetime1;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 < 91) {
          return (int[]) null;
        }
        var3 = this.field_x.a(param0, (byte) 60);
        if (this.field_x.field_i) {
          var5 = we.field_M / this.field_C;
          var6 = aa.field_Vb / this.field_D;
          if (0 < var6) {
            var7 = param0 % var6;
            var4 = this.a(0, -1, var7 * aa.field_Vb / var6);
          } else {
            var4 = this.a(0, -1, 0);
          }
          var10 = 0;
          var7Lifetime1 = var10;
          while (var10 < we.field_M) {
            if (var5 > 0) {
              var8 = var10 % var5;
              var3[var10] = var4[we.field_M * var8 / var5];
            } else {
              var3[var10] = var4[0];
            }
            var10++;
          }
        }
        return var3;
    }

    final static boolean a(byte param0, long param1, String param2) {
        tp var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = vo.a(param2, 0);
          if (var4 != null &&
            null != var4.field_Lb) {
            return true;
          }
          if (param0 >= -122) {
            field_E = (String) null;
          }
          stackIn_11_0 = (null != gd.field_j) && (null != eq.a(param1, (byte) 102));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("rm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener(kb.field_a);
        if (param0 >= -73) {
          return;
        }
        try {
          param1.removeFocusListener(kb.field_a);
          fh.field_w = -1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_A = null;
        field_E = null;
        if (param0 != 16145) {
          rm.g(-113);
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        ed var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            var6 = (ed) null;
            this.a((byte) 114, 100, (ed) null);
          }
          var4_int = param1;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_D = param2.h(-11);
            }
          } else {
            this.field_C = param2.h(param0 - 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("rm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int[][] b(int param0, int param1) {
        int var13 = 0;
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        var16 = Vertigo2.field_L ? 1 : 0;
        var19 = this.field_v.a(param1, -2);
        var18 = var19;
        var17 = var18;
        var3 = var17;
        if (this.field_v.field_c) {
          var5 = we.field_M / this.field_C;
          var6 = aa.field_Vb / this.field_D;
          if (0 < var6) {
            var7_int = param1 % var6;
            var4 = this.c(0, 3, var7_int * aa.field_Vb / var6);
          } else {
            var4 = this.c(0, param0 + 3783, 0);
          }
          var7 = var4[0];
          var8 = var4[1];
          var9 = var4[2];
          var10 = var19[0];
          var11 = var19[1];
          var12 = var19[2];
          for (var13 = 0; var13 < we.field_M; var13++) {
            if (var5 <= 0) {
              var14 = 0;
            } else {
              var15 = var13 % var5;
              var14 = var15 * we.field_M / var5;
            }
            var10[var13] = var7[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }
        if (param0 == -3780) {
          return var17;
        }
        return (int[][]) null;
    }

    public rm() {
        super(1, false);
        this.field_D = 4;
        this.field_C = 4;
    }

    final static void b(byte param0) {
        int var1 = -81 % ((47 - param0) / 34);
        if (lo.field_k != null) {
          lo.field_k.b(0);
          lo.field_k = null;
        }
    }

    static {
        field_A = new byte[]{(byte)2, (byte)8, (byte)4};
        field_E = "You can join this game";
    }
}
