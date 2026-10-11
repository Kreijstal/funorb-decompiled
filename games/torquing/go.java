/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends am {
    private int field_t;
    private int field_u;
    static String field_v;
    static boolean[] field_s;
    static int field_x;
    static double[] field_w;

    final int[][] a(int param0, int param1) {
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
        var16 = Torquing.field_u;
        if (param0 != -29116) {
          this.a((byte) 7, -3);
        }
        var19 = this.field_r.a(15142, param1);
        var18 = var19;
        var17 = var18;
        var3 = var17;
        if (this.field_r.field_b) {
          var5 = ci.field_c / this.field_u;
          var6 = um.field_o / this.field_t;
          if (0 >= var6) {
            var4 = this.c(24066, 0, 0);
          } else {
            var7_int = param1 % var6;
            var4 = this.c(param0 + 53182, var7_int * um.field_o / var6, 0);
          }
          var7 = var4[0];
          var8 = var4[1];
          var9 = var4[2];
          var10 = var19[0];
          var11 = var19[1];
          var12 = var19[2];
          for (var13 = 0; var13 < ci.field_c; var13++) {
            if (0 >= var5) {
              var14 = 0;
            } else {
              var15 = var13 % var5;
              var14 = ci.field_c * var15 / var5;
            }
            var10[var13] = var7[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }
        return var17;
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 <= 59) {
          field_v = (String) null;
        }
        field_v = null;
        field_s = null;
    }

    final static void b(int param0) {
        na.field_G = null;
        if (param0 != 0) {
          return;
        }
        vo.field_b = null;
        cq.field_y = null;
        pn.field_b = (byte[][]) null;
        fj.field_o = null;
        ij.field_o = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_t = param0.i((byte) -101);
            }
          } else {
            this.field_u = param0.i((byte) -101);
          }
          if (param1 != 35) {
            field_v = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("go.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public go() {
        super(1, false);
        this.field_u = 4;
        this.field_t = 4;
    }

    final int[] a(byte param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var8;
        int var7Lifetime1;
        var9 = Torquing.field_u;
        if (param0 < 86) {
          this.field_u = 7;
        }
        var3 = this.field_l.a(param1, 25657);
        if (this.field_l.field_b) {
          var5 = ci.field_c / this.field_u;
          var6 = um.field_o / this.field_t;
          if (var6 <= 0) {
            var4 = this.b(0, 0, 0);
          } else {
            var7 = param1 % var6;
            var4 = this.b(0, 0, var7 * um.field_o / var6);
          }
          var10 = 0;
          var7Lifetime1 = var10;
          while (var10 < ci.field_c) {
            if (var5 > 0) {
              var8 = var10 % var5;
              var3[var10] = var4[ci.field_c * var8 / var5];
            } else {
              var3[var10] = var4[0];
            }
            var10++;
          }
        }
        return var3;
    }

    final static he a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        he[] var3 = null;
        int var4 = 0;
        he var5 = null;
        int var6 = 0;
        he stackIn_4_0 = null;
        he stackIn_9_0 = null;
        he stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          var2 = nb.a("jagex-last-login-method", param1, (byte) -118);
          if (var2 == null) {
            stackIn_4_0 = jf.field_c;
            return stackIn_4_0;
          }
          var3 = ji.b(21169);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              if (param0) {
                go.b(104);
              }
              stackIn_14_0 = jf.field_c;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.b(0, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("go.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_v = "Email: ";
        field_w = new double[8];
    }
}
