/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class op {
    int field_J;
    static String field_q;
    static kv[] field_I;
    int field_G;
    int field_m;
    static kv field_u;
    Random field_w;
    int field_Q;
    boolean field_R;
    int field_s;
    int field_F;
    private eaa field_P;
    int field_E;
    int field_A;
    private eaa[] field_t;
    wia[][] field_a;
    int field_e;
    int field_f;
    private nq[] field_n;
    boolean field_l;
    boolean field_r;
    int[][] field_c;
    int field_h;
    tk[] field_H;
    paa field_T;
    private int field_D;
    int field_O;
    String[] field_y;
    private int[] field_g;
    lr field_L;
    boolean field_N;
    eaa field_U;
    int field_B;
    int field_k;
    int[] field_C;
    ib[] field_S;
    int field_v;
    int field_b;
    int field_z;
    boolean field_x;
    sfa[][] field_j;
    int[][] field_i;
    int field_o;
    int field_K;
    vg field_p;
    int field_d;
    int field_M;

    final void g(int param0) {
        if (param0 < 126) {
          rk[] var3 = (rk[]) null;
          this.a(42, (rk[]) null, -43);
        }
    }

    final void a(int param0, aga param1, int param2) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_a[param1.field_x][param1.field_J].field_n != 20) {
            this.b((byte) 123, param2, param1.field_x, param1.field_J);
          }
          if (0 <= -1 + param1.field_x &&
            this.field_a[-1 + param1.field_x][param1.field_J].field_n != 20) {
            this.b((byte) -63, param2, -1 + param1.field_x, param1.field_J);
          }
          if (1 + param1.field_x < this.field_z &&
            20 != this.field_a[1 + param1.field_x][param1.field_J].field_n) {
            this.b((byte) 91, param2, param1.field_x + 1, param1.field_J);
          }
          if (param0 != -25) {
            this.a((byte) 64, -97);
          }
          if (-1 + param1.field_J >= 0 &&
            this.field_a[param1.field_x][param1.field_J - 1].field_n != 20) {
            this.b((byte) -82, param2, param1.field_x, -1 + param1.field_J);
          }
          if (this.field_B > param1.field_J + 1 &&
            this.field_a[param1.field_x][param1.field_J + 1].field_n != 20) {
            this.b((byte) 119, param2, param1.field_x, param1.field_J + 1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("op.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0, aga param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wia var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          if (param3 != -1) {
            this.field_B = -3;
          }
          var5_int = 0;
          var6 = 1;
          while (true) {
            if (param0 < var6) {
              stackIn_33_0 = var5_int;
              return stackIn_33_0;
            }
            var7 = param1.field_x;
            var8 = param1.field_J;
            if (param2 != 2) {
              if (param2 == 4) {
                var7 = var7 + var6;
              } else {
                if (param2 != 1) {
                  if (3 == param2) {
                    var8 = var8 + var6;
                  }
                } else {
                  var8 = var8 - var6;
                }
              }
            } else {
              var7 = var7 - var6;
            }
            if (var7 >= 0 &&
              var7 < this.field_z &&
              0 <= var8 &&
              this.field_B > var8) {
              var9 = this.field_a[var7][var8];
              var10 = var9.field_n;
              if (var10 == 21) {
                stackIn_24_0 = var6;
                return stackIn_24_0;
              }
              if (!param1.a(var10, false)) {
                stackIn_27_0 = var6 - 1;
                return stackIn_27_0;
              }
              if (null == var9.field_l) {
                var5_int = var6;
              }
              var6++;
              continue;
            }
            break;
          }
          stackIn_20_0 = -1 + var6;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_36_0 = var5;
          stackIn_36_1 = new StringBuilder().append("op.HC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var6 = 0;
        int var2;
        int[] var2_ref_int__;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int[] var11;
        int[] var14;
        int[][] var17;
        int[] var18;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var8 = BachelorFridge.field_y;
        if (param0 <= 92) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_o == 2) {
          var14 = new int[this.field_d];
          var11 = var14;
          var2_ref_int__ = var11;
          var3 = 0;
          var17 = this.field_i;
          for (var5 = 0; var17.length > var5; var5++) {
            var18 = var17[var5];
            var7 = var18[2];
            if (-1 == var7) {
              var3++;
            } else {
              var2_ref_int__[var7] = var2_ref_int__[var7] + 1;
            }
          }
          var4 = -1;
          var5Lifetime1 = var3;
          for (var6 = 0; var14.length > var6; var6++) {
            var7Lifetime1 = var14[var6];
            if (var7Lifetime1 > var5Lifetime1) {
              var4 = var6;
              var5Lifetime1 = var7Lifetime1;
            } else {
              if (var7Lifetime1 == var5Lifetime1) {
                var4 = -1;
              }
            }
          }
          if (var4 <= -1) {
            this.field_M = var4;
            this.field_Q = -1;
          } else {
            if (var4 == this.field_M) {
              this.field_Q = this.field_Q - 1;
            } else {
              this.field_M = var4;
              this.field_Q = 3;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.field_o == 3) {
            var2 = -1;
            var3Lifetime1 = 0;
            for (var4Lifetime1 = 0; this.field_d > var4Lifetime1; var4Lifetime1++) {
              if (this.field_C[var4Lifetime1] > var3Lifetime1) {
                var2 = var4Lifetime1;
                var3Lifetime1 = this.field_C[var4Lifetime1];
              }
            }
            if (var3Lifetime1 > 3) {
              this.field_M = var2;
              this.field_Q = 0;
            }
          }
        }

    }

    final void b(lu param0, byte param1) {
        try {
          param0.b(this.field_A, -126);
          param0.d(this.field_N ? 1 : 0, 0);
          int var3_int = -55 / ((param1 - 85) / 37);
          param0.d(this.field_M, 0);
          param0.d(this.field_Q, 0);
          this.c(param0, (byte) 92);
          this.d(param0, (byte) -115);
          this.a(param0, (byte) 113);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "op.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int b(aga param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 0) {
            param2 = ov.b(param2, 60);
            param3 = -param3;
          }
          if (param1 >= 68) {
            stackIn_6_0 = this.a(param2, param3, param0, (byte) -44);
            return stackIn_6_0;
          }
          stackIn_4_0 = 9;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("op.GA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, lu param1) {
        int var3_int = 0;
        int var4 = 0;
        aga var5 = null;
        ib dupTemp$0 = null;
        int var6 = BachelorFridge.field_y;
        try {
          this.field_A = param1.e((byte) 91);
          this.field_N = ~param1.b(16711935) != param0 ? false : true;
          this.field_M = param1.b(true);
          this.field_Q = param1.b(16711935);
          this.b(-1, param1);
          this.b(param1, 68);
          this.field_S = new ib[this.field_d];
          for (var3_int = 0; this.field_d > var3_int; var3_int++) {
            this.field_S[var3_int] = new ib(var3_int);
            for (var4 = 0; var4 < 7; var4++) {
              var5 = ng.a(this, -51, param1);
              if (var5 != null) {
                this.field_S[var3_int].field_b[var4] = var5;
                dupTemp$0 = this.field_S[var3_int];
                dupTemp$0.field_a = dupTemp$0.field_a + 1;
              }
            }
          }
          this.j(-1);
          this.g(127);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "op.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_I = null;
        field_q = null;
        field_u = null;
        if (param0 < 34) {
          op.e((byte) 67);
        }
    }

    final void i(byte param0) {
        int var3 = 0;
        int var2;
        aga var4;
        int var6;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        var6 = BachelorFridge.field_y;
        for (var2 = 0; var2 < 7; var2++) {
          this.field_t[var2] = new eaa();
        }
        this.field_n = new nq[7 * this.field_d];
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_d; var2Lifetime1++) {
          for (var3 = 0; var3 < 7; var3++) {
            var4 = this.field_S[var2Lifetime1].field_b[var3];
            if (var4 != null &&
              !var4.i(-118)) {
              var5 = var4.field_k[1];
              if (!var4.field_z) {
                var5++;
              }
              this.field_t[var5].a(new nq(var4.field_D, var4.field_u), true);
            }
          }
        }
        var2Lifetime2 = 89 / ((-14 - param0) / 32);
    }

    final void a(int[][] param0, byte param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        wia var10 = null;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          if (param1 < 4) {
            this.field_o = -87;
          }
          for (var7_int = 0; param2 > var7_int; var7_int++) {
            var8 = param0[var7_int][0];
            var9 = param0[var7_int][1];
            if (var8 >= 0 &&
              this.field_z > var8 &&
              var9 >= 0 &&
              this.field_B > var9) {
              var10 = this.field_a[var8][var9];
              if (var10.field_n != 20 &&
                22 != var10.field_n &&
                var10.field_n != 21 &&
                23 != var10.field_n &&
                var10.field_n != 24 &&
                25 != var10.field_n &&
                var10.field_n != 26) {
                this.b((byte) -73, param3, var8, var9);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("op.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, aga param2, byte param3) {
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          var5_int = 1;
          while (true) {
            if (var5_int > param1) {
              if (param3 != -44) {
                this.a(-49, -74, false);
              }
              stackIn_29_0 = param1;
              return stackIn_29_0;
            }
            var6 = param2.field_x;
            var7 = param2.field_J;
            if (param0 == 2) {
              var6 = var6 - var5_int;
            } else {
              if (4 == param0) {
                var6 = var6 + var5_int;
              } else {
                if (param0 != 1) {
                  if (3 == param0) {
                    var7 = var7 + var5_int;
                  }
                } else {
                  var7 = var7 - var5_int;
                }
              }
            }
            if (var6 >= 0 &&
              this.field_z > var6 &&
              var7 >= 0 &&
              this.field_B > var7) {
              if (this.field_a[var6][var7].field_n == 21) {
                stackIn_20_0 = var5_int;
                return stackIn_20_0;
              }
              if (!this.a(param2, var7, var6, (byte) 54)) {
                stackIn_24_0 = var5_int - 1;
                return stackIn_24_0;
              }
              var5_int++;
              continue;
            }
            break;
          }
          stackIn_17_0 = -1 + var5_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("op.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, aj[] param1, int param2, byte param3) {
        int discarded$0 = 0;
        int var5_int = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        wia var8 = null;
        int var9 = 0;
        aga var10 = null;
        var9 = BachelorFridge.field_y;
        try {
          if (param3 != -36) {
            var10 = (aga) null;
            discarded$0 = this.a(-106, -64, (aga) null, (byte) 29);
          }
          for (var5_int = 0; var5_int < param0; var5_int++) {
            var6 = param1[var5_int].field_c;
            var7 = param1[var5_int].field_a;
            if (var6 >= 0 &&
              this.field_z > var6 &&
              0 <= var7 &&
              this.field_B > var7) {
              var8 = this.field_a[var6][var7];
              if (var8.field_n != 20 &&
                var8.field_n != 22 &&
                var8.field_n != 21 &&
                var8.field_n != 23 &&
                24 != var8.field_n &&
                25 != var8.field_n &&
                var8.field_n != 26) {
                this.b((byte) 111, param2, var6, var7);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("op.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(aga param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            param1 >= 0 &&
            this.field_z > param2 &&
            param1 < this.field_B) {
            if (!param0.a(this.field_a[param2][param1].field_n, false)) {
              return false;
            }
            if (param3 != 54) {
              this.field_l = true;
            }
            if (param2 == param0.field_x &&
              param0.field_J == param1) {
              return true;
            }
            if (this.field_a[param2][param1].field_l == null) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("op.UB(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final cj a(sfa param0, byte param1) {
        RuntimeException var3 = null;
        ii var4 = null;
        int var5 = 0;
        aga var6 = null;
        aga var7 = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ii stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var6 = param0.field_h.a(29, this);
          var7 = var6;
          if (var7 == null) {
            stackIn_5_0 = null;
            return (cj) (stackIn_5_0);
          }
          if (var7.i(125)) {
            stackIn_8_0 = null;
            return (cj) (stackIn_8_0);
          }
          var4 = param0.a(this, 3);
          var7.field_z = true;
          var5 = this.field_T.field_w[var6.field_D];
          if (param1 != 91) {
            this.e(-72, 2, 10);
          }
          ((cj) ((Object) var4)).a(this, false);
          if (3 <= -var5 + this.field_T.field_w[var6.field_D]) {
            this.field_T.field_a[var6.field_D] = true;
          }
          this.field_U.a(var4, true);
          stackIn_14_0 = var4;
          return (cj) ((Object) stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("op.CC(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(sfa[] param0, boolean param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        oha var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1) {
            this.b(-125);
          }
          var3_int = 0;
          for (var4 = 0; var4 < param0.length; var4++) {
            if (null != param0[var4]) {
              var5 = ur.field_e[param0[var4].field_g];
              if (var5 instanceof hd) {
                var3_int++;
              }
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("op.KB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void i(int param0) {
        int var3 = 0;
        int var2;
        eaa var4;
        int var9;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        nq var5;
        int var6;
        int var7;
        int var8;
        var9 = BachelorFridge.field_y;
        var2 = param0;
        for (var3 = 6; var3 >= 0; var3--) {
          var4 = this.field_t[var3];
          if (var4 != null) {
            stackIn_6_0 = ~var4.g(0);
            stackIn_6_1 = -1;
            if (stackIn_6_0 != stackIn_6_1) {
              var5 = (nq) (var4.b((byte) 90));
              var6 = this.field_A / 2 % var4.g(0);
              var7 = 0;
              var8 = 0;
              while (var7 < var4.g(0)) {
                if (var6 > var8) {
                  var5 = (nq) (var4.c(0));
                  var8++;
                  continue;
                }
                this.field_n[var2] = var5;
                var2++;
                var5 = (nq) (var4.c(0));
                if (var5 == null) {
                  var5 = (nq) (var4.b((byte) 90));
                }
                var7++;
              }
            }
          }
        }
    }

    final void a(int param0) {
        wia dupTemp$1 = null;
        wia dupTemp$2 = null;
        wia dupTemp$0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = BachelorFridge.field_y;
        if (param0 != 23189) {
          this.field_P = (eaa) null;
        }
        for (var2 = 0; var2 < this.field_a.length; var2++) {
          for (var3 = 0; this.field_a[0].length > var3; var3++) {
            if (this.field_a[var2][var3].field_l != null) {
              this.field_a[var2][var3].field_l.a(this.field_a[var2][var3].field_m, (byte) -82, this.field_a[var2][var3].field_n);
            }
            if (this.field_a[var2][var3].a(false, this)) {
              dupTemp$1 = this.field_a[var2][var3];
              dupTemp$1.field_j = dupTemp$1.field_j - 1;
            }
            if (od.field_w[this.field_a[var2][var3].field_n].field_b &&
              !this.field_a[var2][var3].field_m) {
              dupTemp$2 = this.field_a[var2][var3];
              dupTemp$2.field_j = dupTemp$2.field_j - 1;
            }
          }
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_a.length; var2Lifetime1++) {
          var5 = 0;
          var3Lifetime1 = var5;
          while (var5 < this.field_a[0].length) {
            if (this.field_a[var2Lifetime1][var5].field_n == 35 ||
              this.field_a[var2Lifetime1][var5].field_n == 37 ||
              this.field_a[var2Lifetime1][var5].field_n == 33) {
              dupTemp$0 = this.field_a[var2Lifetime1][var5];
              dupTemp$0.field_j = dupTemp$0.field_j - 1;
            }
            var5++;
          }
        }
        if (this.field_l) {
          this.field_F = this.field_F + 1;
        }
        if (this.field_x) {
          this.field_K = this.field_K + 1;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        aga var9;
        int var10;
        int var11;
        int var12;
        int var13;
        rv var14;
        var13 = BachelorFridge.field_y;
        var14 = new rv();
        if (param2 != -1) {
          this.field_t = (eaa[]) null;
        }
        for (var7 = 0; this.field_d > var7; var7++) {
          if (!this.field_S[var7].field_c) {
            for (var8 = 0; 7 > var8; var8++) {
              var9 = this.field_S[var7].field_b[var8];
              if (var9 != null &&
                !var9.i(101)) {
                if (var9.field_x > param4) {
                  stackIn_19_0 = var9.field_x - param4;
                } else {
                  stackIn_19_0 = param4 - var9.field_x;
                }
                var10 = stackIn_19_0;
                if (var9.field_J > param0) {
                  stackIn_22_0 = -param0 + var9.field_J;
                } else {
                  stackIn_22_0 = param0 - var9.field_J;
                }
                var11 = stackIn_22_0;
                stackIn_25_0 = (var11 < var10) ? var10 : var11;
                var12 = stackIn_25_0;
                if (param1 >= var12) {
                  var14.a(true, new lia(new nq(var9), param3, -1));
                }
              }
            }
          }
        }
        if (!var14.field_m.e(12917)) {
          var14.a(this, false);
          this.field_U.a(var14, true);
        }
    }

    final boolean a(int param0, aga param1, int param2, aga param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~param2 > param4) {
            param2 = -param2;
            param0 = ov.b(param0, 60);
          }
          var6_int = this.a(param0, param2, param1, (byte) -44);
          param1.a(false, var6_int, param0);
          if (!param1.a(32, (byte) 103) &&
            this.field_a[param1.field_x][param1.field_J].field_n == 21) {
            this.field_T.field_l[param3.field_D] = this.field_T.field_l[param3.field_D] + 1;
          }
          return !(var6_int < param2);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("op.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void h(byte param0) {
        this.field_j = new sfa[this.field_d][7];
        int var2 = -34 % ((-46 - param0) / 53);
    }

    private final String a(byte param0) {
        if (param0 > -46) {
          this.c((byte) 75);
        }
        return pn.a((byte) 48, this.field_E, new String[]{"Pizza", "Dessert", "Curry"});
    }

    final void a(int param0, int param1, int param2, int[][] param3, int param4) {
        int var10 = 0;
        int var11 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var14 = BachelorFridge.field_y;
        try {
          var6_int = 17;
          var7 = 17;
          var8 = -1 + var6_int >> 1;
          var9 = -1 + var7 >> 1;
          for (var10 = 0; var6_int > var10; var10++) {
            for (var11 = 0; var7 > var11; var11++) {
              if (1 == param3[var10][var11]) {
                var12 = param2 + (var10 - var8);
                var13 = param1 - (-var11 + var9);
                if (var12 >= 0 &&
                  var12 < this.field_z &&
                  0 <= var13 &&
                  this.field_B > var13) {
                  this.d(-1, var13, var12);
                }
              }
            }
          }
          if (param0 != 878) {
            this.k((byte) -48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("op.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        this.field_A = param0;
        this.field_N = param2 ? true : false;
        if (param1 != -16292) {
          this.e(-69, 112, 35);
        }
    }

    private final void b(lu param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = BachelorFridge.field_y;
        try {
          var4 = 71 / ((-28 - param1) / 35);
          this.field_n = new nq[this.field_d * 7];
          var3_int = param0.b(16711935);
          for (var5 = 0; var5 < var3_int; var5++) {
            this.field_n[var5] = qi.a(param0, (byte) 48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("op.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6_int;
        aga var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6_intLifetime1;
        var8 = BachelorFridge.field_y;
        var3 = -115 % ((43 - param0) / 32);
        var2 = 45853 * this.field_E + (3611 * this.field_o + 2585 * this.field_d);
        var2 = var2 ^ 668347 * (this.field_A + 1 >> 1);
        if (this.field_o == 2) {
          for (var4 = 0; this.field_i.length > var4; var4++) {
            var5 = this.field_i[var4][0];
            var6_int = this.field_i[var4][1];
            var7 = this.field_i[var4][2];
            var2 = var2 ^ (317 * var4 + 33919) * (var6_int * var7 + var5 * var6_int);
          }
        }
        if (this.field_o == 3) {
          for (var4Lifetime1 = 0; this.field_d > var4Lifetime1; var4Lifetime1++) {
            var2 = var2 ^ 5935 * var4Lifetime1 * this.field_C[var4Lifetime1];
            var5Lifetime1 = this.field_c[var4Lifetime1][0];
            var6_intLifetime1 = this.field_c[var4Lifetime1][1];
            var2 = var2 ^ (585 + var4Lifetime1) * 291 * (var5Lifetime1 * var6_intLifetime1 + var6_intLifetime1);
          }
        }
        if (this.field_M != -1) {
          var2 = var2 ^ 667 * (this.field_Q + 487 * this.field_M);
        }
        var2 = var2 ^ 87 * this.field_z + (this.field_D * 599 + this.field_B * 713);
        for (var4Lifetime2 = 0; this.field_z > var4Lifetime2; var4Lifetime2++) {
          for (var5Lifetime2 = 0; this.field_B > var5Lifetime2; var5Lifetime2++) {
            var2 = var2 ^ this.field_a[var4Lifetime2][var5Lifetime2].d(1446291025) * (var5Lifetime2 * (var4Lifetime2 + 13) + 37 + var4Lifetime2);
          }
        }
        for (var4Lifetime3 = 0; var4Lifetime3 < this.field_d; var4Lifetime3++) {
          for (var5Lifetime3 = 0; var5Lifetime3 < 7; var5Lifetime3++) {
            var6 = this.field_S[var4Lifetime3].field_b[var5Lifetime3];
            if (var6 != null) {
              var2 = var2 ^ var6.g(94) * (31 + (var4Lifetime3 * 59 + 53 * var5Lifetime3));
            }
          }
        }
        return var2;
    }

    private final void f(int param0) {
        cj discarded$0 = null;
        int var3 = BachelorFridge.field_y;
        this.h(param0 ^ -26126);
        if (param0 != 26125) {
          aga var4 = (aga) null;
          this.a(-25, (aga) null, 68);
        }
        sfa var5 = (sfa) (this.field_P.b((byte) 90));
        while (var5 != null) {
          discarded$0 = this.a(var5, (byte) 91);
          var5 = (sfa) (this.field_P.c(param0 - 26125));
        }
    }

    final boolean a(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 > -11) {
          this.field_H = (tk[]) null;
        }
        stackIn_6_0 = (param1 >= 0) && ((this.field_h & 1 << param1) != 0);
        return stackIn_6_0;
    }

    final aga c(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        aga var6;
        int var7;
        int var4Lifetime1;
        var7 = BachelorFridge.field_y;
        for (var4 = 0; this.field_d > var4; var4++) {
          for (var5 = 0; var5 < 7; var5++) {
            var6 = this.field_S[var4].field_b[var5];
            if (var6 != null &&
              param0 == var6.field_x &&
              param1 == var6.field_J) {
              return var6;
            }
          }
        }
        var4Lifetime1 = -89 / ((param2 - 69) / 33);
        return null;
    }

    final int g(byte param0) {
        int var4 = 0;
        ib var5 = null;
        int var6 = BachelorFridge.field_y;
        int var2 = 0;
        ib[] var3 = this.field_S;
        if (param0 != 79) {
          this.field_r = false;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          var2 = var2 + var5.b((byte) 84);
        }
        return var2;
    }

    private final void d(lu param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        nq[] var5_ref_nq__ = null;
        int var6 = 0;
        nq var7 = null;
        int var5 = 0;
        int var8 = BachelorFridge.field_y;
        try {
          this.j(-1);
          var3_int = param0.field_g;
          var4 = 0;
          if (param1 > -80) {
            this.field_y = (String[]) null;
          }
          param0.field_g = param0.field_g + 1;
          var5_ref_nq__ = this.field_n;
          for (var6 = 0; var5_ref_nq__.length > var6; var6++) {
            var7 = var5_ref_nq__[var6];
            if (var7 != null) {
              var4++;
              er.a(var7, 110, param0);
            }
          }
          var5 = param0.field_g;
          param0.field_g = var3_int;
          param0.d(var4, 0);
          param0.field_g = var5;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "op.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, aga param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var8 = BachelorFridge.field_y;
        try {
          var6 = 5 / ((55 - param0) / 37);
          var5_int = param3.field_x;
          var7 = param3.field_J;
          if (param2 == 2) {
            var5_int = var5_int - param1;
          } else {
            if (param2 != 4) {
              if (param2 != 1) {
                if (param2 != 3) {
                  return this.a(param3, var7, var5_int, (byte) 54);
                }
                var7 = var7 + param1;
              } else {
                var7 = var7 - param1;
              }
            } else {
              var5_int = var5_int + param1;
            }
          }
          stackIn_11_0 = this.a(param3, var7, var5_int, (byte) 54);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("op.CB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final sfa b(int param0, int param1) {
        int var3 = -48 / ((param0 + 60) / 52);
        if (param1 < 0) {
          return null;
        }
        if (param1 > this.field_n.length) {
          return null;
        }
        if (null == this.field_n[param1]) {
          return null;
        }
        return this.field_j[this.field_n[param1].field_g][this.field_n[param1].field_f];
    }

    final void b(byte param0, int param1, int param2, int param3) {
        int var5;
        var5 = -64 / ((0 - param0) / 39);
        if (20 != this.field_a[param2][param3].field_n &&
          this.field_a[param2][param3].field_n != 22 &&
          21 != this.field_a[param2][param3].field_n &&
          23 != this.field_a[param2][param3].field_n &&
          this.field_a[param2][param3].field_n != 24 &&
          this.field_a[param2][param3].field_n != 25 &&
          this.field_a[param2][param3].field_n != 26) {
          if (param1 == 1) {
            this.field_a[param2][param3].field_i = true;
            param1 = 0;
          }
          this.field_a[param2][param3].field_n = param1;
          this.field_a[param2][param3].field_a = -1;
          this.field_a[param2][param3].field_j = 0;
          if (!od.field_w[param1].field_c) {
            this.field_a[param2][param3].field_m = false;
          } else {
            this.field_a[param2][param3].field_a = param1 - 6;
            this.field_a[param2][param3].field_m = true;
          }
          if (35 == param1) {
            this.field_a[param2][param3].field_j = (param2 * 11 + this.field_A * param3) % 3 + 3;
          }
          if (27 == param1) {
            this.field_a[param2][param3].field_j = 0;
          }
          if (37 == param1) {
            this.field_a[param2][param3].field_j = (this.field_A * param3 + 37 * param2) % 3 + 2;
          }
          if (33 == param1) {
            this.field_a[param2][param3].field_j = 4;
          }
          this.field_a[param2][param3].field_h = od.field_w[param1].field_e;
        }
    }

    final boolean b(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 < 5) {
          this.field_d = 78;
        }
        stackIn_6_0 = (param1 >= 0) && ((this.field_v & 1 << param1) != 0);
        return stackIn_6_0;
    }

    private final void h(int param0) {
        int var3;
        sfa var4;
        int var6;
        eaa var7;
        oha var5;
        int var3Lifetime1;
        sfa var4Lifetime1;
        var6 = BachelorFridge.field_y;
        if (~(this.field_A & 1) == param0) {
          this.d((byte) -74);
        }
        this.field_P = new eaa();
        this.field_U = new eaa();
        var7 = new eaa();
        for (var3 = 0; this.field_n.length > var3; var3++) {
          var4 = this.b(param0 - 112, var3);
          if (var4 != null) {
            var7.a(var4, true);
          }
        }
        for (var3Lifetime1 = 3; var3Lifetime1 >= 1; var3Lifetime1--) {
          var4Lifetime1 = (sfa) (var7.b((byte) 90));
          while (var4Lifetime1 != null) {
            var5 = al.a(120, var4Lifetime1.field_g);
            if (2 == var5.field_a &&
              hl.a((byte) 121, var5.field_j) &&
              var5.field_l == var3Lifetime1) {
              this.field_P.a(var4Lifetime1, true);
            }
            var4Lifetime1 = (sfa) (var7.c(~param0));
          }
        }
        var7.a(this.field_P, 12632256);
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        if (param0 != 1845) {
          this.c(80);
        }
        for (var4 = 0; this.field_d > var4; var4++) {
          if (param2 == this.field_c[var4][0] &&
            param1 == this.field_c[var4][1]) {
            return var4;
          }
        }
        return -1;
    }

    final boolean e(int param0, int param1, int param2) {
        if (this.field_a[param0][param1].field_l != null) {
          return false;
        }
        if (20 != this.field_a[param0][param1].field_n &&
          this.field_a[param0][param1].field_n != 22 &&
          this.field_a[param0][param1].field_n != 21 &&
          this.field_a[param0][param1].field_n != 23 &&
          this.field_a[param0][param1].field_n != 24 &&
          this.field_a[param0][param1].field_n != 25 &&
          this.field_a[param0][param1].field_n != 26) {
          return true;
        }
        if (param2 == -11066) {
          return false;
        }
        this.field_f = -16;
        return false;
    }

    private final void c(lu param0, byte param1) {
        int var5 = 0;
        lu stackIn_10_0 = null;
        int stackIn_11_1 = 0;
        lu stackIn_13_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        wia var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime2Lifetime1;
        var8 = BachelorFridge.field_y;
        try {
          param0.d(this.field_D, 0);
          param0.d(this.field_o, 0);
          param0.d(this.field_E, 0);
          param0.d(this.field_z, 0);
          var3_int = -73 / ((param1 + 9) / 63);
          param0.d(this.field_B, 0);
          for (var4 = 0; var4 < this.field_B; var4++) {
            for (var5 = 0; this.field_z > var5; var5++) {
              var6 = this.field_a[var5][var4];
              var7 = var6.field_n;
              if (var6.field_i) {
                var7 = var7 | 128;
              }
              param0.d(var7, 0);
              param0.d(var6.field_j, 0);
              param0.d(var6.field_a, 0);
              stackIn_10_0 = (lu) (param0);
              if (var6.field_m) {
                stackIn_11_1 = 1;
              } else {
                stackIn_11_1 = 0;
              }
              ((lu) (Object) stackIn_10_0).d(stackIn_11_1, 0);
              param0.d(var6.field_h, 0);
              stackIn_13_0 = (lu) (param0);
              if (var6.field_d) {
                stackIn_14_1 = 1;
              } else {
                stackIn_14_1 = 0;
              }
              ((lu) (Object) stackIn_13_0).d(stackIn_14_1, 0);
            }
          }
          if (2 == this.field_o) {
            for (var4Lifetime1 = 0; this.field_i.length > var4Lifetime1; var4Lifetime1++) {
              param0.d(this.field_i[var4Lifetime1][0], 0);
              param0.d(this.field_i[var4Lifetime1][1], 0);
              param0.d(this.field_i[var4Lifetime1][2], 0);
            }
          }
          if (3 == this.field_o) {
            for (var4Lifetime2 = 0; this.field_d > var4Lifetime2; var4Lifetime2++) {
              param0.d(this.field_c[var4Lifetime2][0], 0);
              param0.d(this.field_c[var4Lifetime2][1], 0);
            }
            for (var4Lifetime2Lifetime1 = 0; var4Lifetime2Lifetime1 < this.field_d; var4Lifetime2Lifetime1++) {
              param0.d(this.field_C[var4Lifetime2Lifetime1], 0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("op.N(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(int param0, int param1, int param2) {
        if (~param2 > param0) {
          return;
        }
        if (param1 >= 0 &&
          this.field_z > param2 &&
          this.field_B > param1) {
          this.field_a[param2][param1].field_d = true;
          return;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4;
        var4 = -126 % ((3 - param2) / 37);
        if (param0 >= 0 &&
          param1 >= 0 &&
          param0 < this.field_z &&
          param1 < this.field_B) {
          return ju.c(23745, this.field_a[param0][param1].field_n);
        }
        return false;
    }

    private final boolean b(byte param0) {
        int var3 = 0;
        int var2;
        aga var4;
        int var5;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 != 10) {
          this.field_d = 84;
        }
        while (var2 < this.field_d) {
          for (var3 = 0; var3 < 7; var3++) {
            var4 = this.field_S[var2].field_b[var3];
            if (var4 != null) {
              if (var4 == this.field_a[var4.field_x][var4.field_J].field_l &&
                var4.i(69)) {
                return false;
              }
              if (!var4.i(-115) &&
                this.field_a[var4.field_x][var4.field_J].field_l != var4) {
                return false;
              }
            }
          }
          var2++;
        }
        return true;
    }

    private final void a(aga param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (!param1) {
            return;
          }
          while (true) {
            if (this.field_n.length <= var3_int) {
              return;
            }
            if (this.field_n[var3_int] != null) {
              var3_int++;
              continue;
            }
            break;
          }
          this.field_n[var3_int] = new nq(param0);
          param0.field_v = var3_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("op.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0) {
        lc discarded$0 = null;
        if (this.field_r) {
          throw new IllegalStateException();
        }
        if (this.field_A > 0) {
          this.field_N = !this.field_N ? true : false;
          this.field_A = this.field_A + 1;
          this.f((byte) 103);
          this.f(param0 + 26125);
        }
        if (param0 != 0) {
          return;
        }
        if (!this.field_N) {
          discarded$0 = this.e(0);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int var5;
        var5 = -8 / ((50 - param1) / 63);
        if (!this.a((byte) -113, param2, param0 + 1, param3) &&
          !this.a((byte) -115, param2, param0 - 1, param3)) {
          if (this.a((byte) -105, param2, param0, param3 + 1)) {
            return true;
          }
          if (!this.a((byte) -126, param2, param0, -1 + param3)) {
            return false;
          }
          return true;
        }
        return true;
    }

    final void a(sfa[] param0, int param1, byte param2) {
        int var4_int = 0;
        Object stackIn_27_0 = null;
        aga stackIn_27_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        aga[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        sfa var5_ref_sfa = null;
        aga var6 = null;
        hia var7 = null;
        gm var7_ref = null;
        int var9 = 0;
        aga var10 = null;
        aga[] var13 = null;
        aga var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        aga[] var4Lifetime1;
        aga var6Lifetime1;
        aga var6Lifetime2;
        aga var6Lifetime3;
        int var5Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          for (var4_int = 0; var4_int < 7; var4_int++) {
            var5_ref_sfa = param0[var4_int];
            if (var5_ref_sfa != null) {
              this.field_j[param1][var5_ref_sfa.field_h.field_f] = var5_ref_sfa;
            }
          }
          if (this.field_N &&
            this.field_S[param1].a((byte) -52, 42)) {
            var13 = this.field_S[param1].field_b;
            var4 = var13;
            for (var5 = 0; var13.length > var5; var5++) {
              var14 = var13[var5];
              var6 = var14;
              var6Lifetime2 = var14;
              var6Lifetime3 = var14;
              if (null != var14 &&
                !var14.i(115) &&
                var14.field_y == 42) {
                var7 = new hia(24, var14);
                var17 = this.a(var14, 0);
                var7.field_k = var17[1];
                var7.field_j = var17[0];
                this.field_j[param1][var14.field_u] = (sfa) ((Object) var7);
              }
            }
          }
          if (param2 != -31) {
            var10 = (aga) null;
            this.b((aga) null, (byte) -16);
          }
          if (!this.field_N &&
            this.field_S[param1].a((byte) -49, 40)) {
            var4Lifetime1 = this.field_S[param1].field_b;
            for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime1.length; var5Lifetime1++) {
              var6Lifetime1 = var4Lifetime1[var5Lifetime1];
              stackIn_27_0 = null;
              stackIn_27_1 = var6Lifetime1;
              if (stackIn_27_0 != stackIn_27_1 &&
                !var6Lifetime1.i(124) &&
                var6Lifetime1.field_y == 40) {
                var7_ref = new gm(0, var6Lifetime1);
                var18 = this.a(true, var6Lifetime1);
                var7_ref.field_i = var18[0];
                var7_ref.field_l = var18[1];
                this.field_j[param1][var6Lifetime1.field_u] = (sfa) ((Object) var7_ref);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_39_0 = var4_ref;
          stackIn_39_1 = new StringBuilder().append("op.TA(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int[][] param4, int param5) {
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        wia var15 = null;
        int var16 = 0;
        var16 = BachelorFridge.field_y;
        try {
          var7_int = 17;
          var8 = 17;
          var9 = var7_int - 1 >> 1;
          var10 = var8 - 1 >> 1;
          for (var11 = param0; var11 < var7_int; var11++) {
            for (var12 = 0; var8 > var12; var12++) {
              if (param4[var11][var12] == 1) {
                var13 = param1 - (-var11 + var9);
                var14 = -var10 + (var12 + param2);
                if (var13 >= 0 &&
                  var13 < this.field_z &&
                  var14 >= 0 &&
                  var14 < this.field_B) {
                  var15 = this.field_a[var13][var14];
                  if (ju.c(23745, var15.field_n) &&
                    20 != var15.field_n &&
                    var15.field_n != 23 &&
                    var15.field_n != 24 &&
                    var15.field_n != 25 &&
                    var15.field_n != 26 && (param3 ||
                    var15.field_l == null)) {
                    this.b((byte) -66, param5, var13, var14);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("op.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        aga var5;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 != -74) {
          var5 = (aga) null;
          this.a((aga) null, -119, 102, (byte) 43);
        }
        while (this.field_d > var2) {
          for (var3 = 0; 7 > var3; var3++) {
            if (this.field_S[var2].field_b[var3] != null) {
              this.field_S[var2].field_b[var3].field_z = false;
            }
          }
          var2++;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (param1 != 26) {
          return true;
        }
        int var4 = this.field_L.field_o[param2][param0].field_n + 19;
        if (23 == var4) {
          return true;
        }
        if (var4 != 24) {
          if (25 == var4) {
            return true;
          }
          if (26 != var4) {
            return false;
          }
        }
        return true;
    }

    private final int[] a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        for (var3 = param0; var3 < this.field_z; var3++) {
          for (var4 = 0; var4 < this.field_B; var4++) {
            if (param1 == 0 &&
              23 == this.field_a[var3][var4].field_n) {
              return new int[]{var3, var4};
            }
            if (param1 == 1 &&
              24 == this.field_a[var3][var4].field_n) {
              return new int[]{var3, var4};
            }
            if (param1 == 2 &&
              this.field_a[var3][var4].field_n == 25) {
              return new int[]{var3, var4};
            }
            if (param1 == 3 &&
              26 == this.field_a[var3][var4].field_n) {
              return new int[]{var3, var4};
            }
          }
        }
        return new int[]{-1, -1};
    }

    final void a(boolean param0, int param1) {
        boolean stackIn_3_1 = false;
        int var3;
        int var4;
        int var6;
        int var7;
        aga var8;
        aga var9;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        var6 = BachelorFridge.field_y;
        stackIn_3_1 = (param0);
        this.field_r = stackIn_3_1;
        this.field_b = param1;
        if (-1 != this.field_b) {
          this.field_g[this.field_b] = this.field_g[this.field_b] + 300;
        }
        for (var3 = 0; this.field_d > var3; var3++) {
          for (var4 = 0; var4 < 7; var4++) {
            var8 = this.field_S[var3].field_b[var4];
            if (var8 != null) {
              if (var3 != this.field_b) {
                this.field_p.a((byte) -28, new dla(new nq(var8.field_D, var8.field_u)));
              } else {
                this.field_p.a((byte) -28, new qja(new nq(var8.field_D, var8.field_u)));
              }
            }
          }
        }
        for (var3Lifetime1 = 0; this.field_d > var3Lifetime1; var3Lifetime1++) {
          var7 = 0;
          var4Lifetime1 = var7;
          while (var7 < 7) {
            var9 = this.field_S[var3Lifetime1].field_b[var7];
            if (var9 != null) {
              this.field_T.field_C[var3Lifetime1] = sr.a(this.field_T.field_C[var3Lifetime1], 1L << var9.field_o.field_b);
            }
            var7++;
          }
        }
        this.field_H = new tk[this.field_d];
        for (var3Lifetime2 = 0; var3Lifetime2 < this.field_d; var3Lifetime2++) {
          this.field_H[var3Lifetime2] = this.field_T.a((byte) 9, var3Lifetime2);
        }
    }

    final void a(aga param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          return;
        }
        try {
          this.field_S[param2].field_b[param3] = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "op.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final aga a(byte param0, aga param1) {
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        aga var5 = null;
        aga var6 = null;
        aga var7 = null;
        aga var8 = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (this.field_S[param1.field_D].field_a == 7) {
            return null;
          }
          var3_int = -21 / ((16 - param0) / 55);
          var4 = null;
          if (param1.field_x > 0 &&
            null == this.field_a[-1 + param1.field_x][param1.field_J].field_l &&
            this.field_a[param1.field_x - 1][param1.field_J].e(-35)) {
            var5 = param1.b(true);
            var4 = var5;
            var5.field_s = 2;
            var5.field_x = var5.field_x - 1;
          } else if (-1 + this.field_z > param1.field_x &&
            this.field_a[param1.field_x + 1][param1.field_J].field_l == null &&
            this.field_a[param1.field_x + 1][param1.field_J].e(-126)) {
            var8 = param1.b(true);
            var4 = var8;
            var8.field_x = var8.field_x + 1;
            var8.field_s = 4;
          } else if (param1.field_J > 0 &&
            null == this.field_a[param1.field_x][-1 + param1.field_J].field_l &&
            this.field_a[param1.field_x][-1 + param1.field_J].e(-120)) {
            var7 = param1.b(true);
            var4 = var7;
            var7.field_s = 1;
            var7.field_J = var7.field_J - 1;
          } else {
            if (param1.field_J < -1 + this.field_B &&
              null == this.field_a[param1.field_x][1 + param1.field_J].field_l &&
              this.field_a[param1.field_x][1 + param1.field_J].e(-36)) {
              var6 = param1.b(true);
              var4 = var6;
              var6.field_J = var6.field_J + 1;
              var6.field_s = 3;
            }
          }
          if (var4 == null) {
            stackIn_26_0 = null;
            return (aga) (stackIn_26_0);
          }
          this.field_S[param1.field_D].a(-20836, (aga) (var4));
          this.field_a[((aga) (var4)).field_x][((aga) (var4)).field_J].field_l = (aga) (var4);
          param1.d(-107);
          ((aga) (var4)).d(3);
          stackIn_28_0 = var4;
          return (aga) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("op.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void j(int param0) {
        int var2 = 0;
        nq var3;
        int var4;
        var4 = BachelorFridge.field_y;
        for (var2 = 0; this.field_n.length > var2; var2++) {
          var3 = this.field_n[var2];
          if (var3 != null) {
            this.field_S[var3.field_g].field_b[var3.field_f].field_v = var2 + 1;
          }
        }
        if (param0 != -1) {
          this.a((int[][]) null, (byte) -21, -84, -59, 6, 41);
        }
    }

    final boolean a(aga param0, aga param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          if (!param1.a(this.field_a[param0.field_x][param0.field_J].field_n, false)) {
            return false;
          }
          if (!param0.a(this.field_a[param1.field_x][param1.field_J].field_n, false)) {
            return false;
          }
          if (param2 != 4) {
            return true;
          }
          var4_int = param1.field_x;
          var5 = param1.field_J;
          param1.a(param0.field_J, param0.field_x, true);
          param0.a(var5, var4_int, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("op.GB(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, lu param1, int param2) {
        int discarded$1 = 0;
        int var4_int = 0;
        aga var5 = null;
        int var6 = 0;
        aga var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param2 >= -111) {
            var7 = (aga) null;
            discarded$1 = this.a(-84, 118, (aga) null, (byte) 51);
          }
          for (var4_int = 0; var4_int < 7; var4_int++) {
            var5 = this.field_S[param0].field_b[var4_int];
            rha.a(var5, param1, (byte) -118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("op.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = BachelorFridge.field_y;
        if (this.field_o != 3) {
          return false;
        }
        if (param1 <= 114) {
          this.field_K = -110;
        }
        for (var4 = 0; var4 < this.field_d; var4++) {
          if (param2 == this.field_c[var4][0] &&
            param0 == this.field_c[var4][1]) {
            return true;
          }
        }
        return false;
    }

    private final int[] a(aga param0, int param1) {
        int[] stackIn_3_0 = null;
        int[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          if (param1 != 0) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var3_int = param0.field_x;
          var4 = param0.field_J;
          var5 = ((t) (al.a(-97, 24))).field_t;
          var6 = 1 + kla.a(4, this.field_w, -2147483648);
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = var5;
          while (4 > var8) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted9 = true;
            boolean decompiledFrameCompleted8 = true;
            boolean decompiledFrameCompleted7 = true;
            boolean decompiledFrameCompleted6 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var7 == 2) {
              for (var11 = 1; var11 < var5; var11++) {
                if (-var11 + var3_int < 0) {
                  decompiledFrameCompleted9 = false;
                  break;
                }
                if (!this.field_a[-var11 + var3_int][var4].e(-84)) {
                  decompiledFrameCompleted8 = false;
                  break;
                }
                if (-var11 + var3_int >= 0 &&
                  this.field_a[-var11 + var3_int][var4].field_l != null &&
                  var10 > var11) {
                  var10 = var11;
                  var9 = 2;
                  decompiledFrameCompleted7 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted9) &&
                (decompiledFrameCompleted8)) {
                decompiledFrameRemainder0 = !(decompiledFrameCompleted7);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted9) &&
              (decompiledFrameCompleted8) &&
              (decompiledFrameCompleted7)) {
              if (var7 == 4) {
                for (var11Lifetime1 = 1; var5 > var11Lifetime1; var11Lifetime1++) {
                  if ((-1 + this.field_z) < (var3_int + var11Lifetime1)) {
                    decompiledFrameCompleted6 = false;
                    break;
                  }
                  if (!this.field_a[var11Lifetime1 + var3_int][var4].e(-121)) {
                    var7++;
                    if (var7 == 5) {
                      decompiledFrameCompleted5 = false;
                      break;
                    }
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (this.field_z > var11Lifetime1 + var3_int &&
                    null != this.field_a[var3_int + var11Lifetime1][var4].field_l &&
                    var11Lifetime1 < var10) {
                    var9 = 4;
                    var10 = var11Lifetime1;
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                }
                if ((decompiledFrameCompleted6) &&
                  (decompiledFrameCompleted5) &&
                  (decompiledFrameCompleted4)) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted3);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted6) &&
                (decompiledFrameCompleted5) &&
                (decompiledFrameCompleted4) &&
                (decompiledFrameCompleted3)) {
                if (var7 == 1) {
                  for (var11Lifetime1Lifetime1 = 1; var11Lifetime1Lifetime1 < var5; var11Lifetime1Lifetime1++) {
                    if (0 > var4 - var11Lifetime1Lifetime1) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    if (!this.field_a[var3_int][var4 - var11Lifetime1Lifetime1].e(-106)) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (-var11Lifetime1Lifetime1 + var4 >= 0 &&
                      this.field_a[var3_int][-var11Lifetime1Lifetime1 + var4].field_l != null &&
                      var11Lifetime1Lifetime1 < var10) {
                      var10 = var11Lifetime1Lifetime1;
                      var9 = 1;
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted2) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0) &&
                  (var7 == 3)) {
                  for (var11Lifetime1Lifetime1 = 1; var5 > var11Lifetime1Lifetime1; var11Lifetime1Lifetime1++) {
                    if ((-1 + this.field_B) < (var11Lifetime1Lifetime1 + var4)) {
                      break;
                    }
                    if (!this.field_a[var3_int][var4 + var11Lifetime1Lifetime1].e(-31)) {
                      break;
                    }
                    if (this.field_B > var4 + var11Lifetime1Lifetime1 &&
                      null != this.field_a[var3_int][var11Lifetime1Lifetime1 + var4].field_l &&
                      var11Lifetime1Lifetime1 < var10) {
                      var9 = 3;
                      var10 = var11Lifetime1Lifetime1;
                      break;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameCompleted5) &&
              (decompiledFrameCompleted4)) {
              var7++;
              decompiledFrameRemainder1 = (var7 == 5);
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted4)) {
              var7 = 1;
            }
            var8++;
          }
          if (0 == var9) {
            var9 = 1 + kla.a(4, this.field_w, -2147483648);
          }
          if (var10 == 0) {
            var10 = kla.a(var5, this.field_w, param1 ^ -2147483648);
          }
          stackIn_70_0 = new int[]{var9, -1 + var10};
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("op.P(");
          if (param0 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        int var7 = 0;
        int var2;
        int var4;
        int var5;
        int var6;
        aga var6_ref_aga;
        aga var8;
        int var9;
        rv var10;
        int var11;
        int var5Lifetime1;
        aga var8Lifetime1;
        aga var8Lifetime2;
        var11 = BachelorFridge.field_y;
        if (param0 <= 97) {
          this.field_G = -71;
        }
        var2 = 50 + 25 * (this.field_A - this.field_J >> 1);
        for (var3 = 0; var3 < this.field_d; var3++) {
          var4 = 0;
          for (var5 = 0; var5 < 7; var5++) {
            var6_ref_aga = this.field_S[var3].field_b[var5];
            var8 = var6_ref_aga;
            var8Lifetime2 = var6_ref_aga;
            if (var6_ref_aga != null &&
              !var6_ref_aga.i(68)) {
              var4++;
            }
          }
          if (var4 != 0) {
            var5Lifetime1 = var2 / var4;
            var6 = var2 % var4;
            for (var7 = 0; var7 < 7; var7++) {
              var8Lifetime1 = this.field_S[var3].field_b[var7];
              if (var8Lifetime1 != null &&
                !var8Lifetime1.i(-120)) {
                var9 = var5Lifetime1;
                var6--;
                if (var6 >= 0) {
                  var9++;
                }
                var10 = new rv();
                var10.a(true, new qq(new nq(var8Lifetime1), -1, var9));
                var10.a(this, false);
                this.field_U.a(var10, true);
              }
            }
          }
        }
    }

    final void a(int param0, byte param1) {
        wia var3;
        aga var4;
        this.field_c[param0] = this.a(0, param0);
        var3 = this.field_a[this.field_c[param0][0]][this.field_c[param0][1]];
        var3.field_m = true;
        if (param1 <= 43) {
          this.a(38, -108, -127, (int[][]) null, 91);
        }
        var4 = var3.field_l;
        if (var4 != null &&
          param0 != var4.field_D &&
          !var4.g((byte) 85)) {
          var4.b((byte) 124, 24 + param0);
        }
    }

    final void a(int param0, aga param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param4 > -70) {
            this.field_w = (Random) null;
          }
          if (param3 == 2) {
            this.b((byte) -65, param2, -param0 + param1.field_x, param1.field_J);
          } else {
            if (param3 != 4) {
              if (param3 != 1) {
                if (param3 == 3) {
                  this.b((byte) -45, param2, param1.field_x, param0 + param1.field_J);
                }
              } else {
                this.b((byte) 62, param2, param1.field_x, param1.field_J - param0);
              }
            } else {
              this.b((byte) 50, param2, param1.field_x + param0, param1.field_J);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("op.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        int[] var5;
        aga var6;
        int[] var7;
        boolean stackIn_6_0 = false;
        var7 = this.a(0, param1);
        var5 = var7;
        if (param0 >= -95) {
          var6 = (aga) null;
          discarded$1 = this.a(-117, 19, (aga) null, (byte) -1);
        }
        stackIn_6_0 = (var7[0] == param2) && (var7[1] == param3);
        return stackIn_6_0;
    }

    private final void f(byte param0) {
        if (param0 != 103) {
          this.field_t = (eaa[]) null;
        }
    }

    private final void b(int param0, lu param1) {
        int var6 = 0;
        wia stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        wia stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        wia stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime2Lifetime1;
        var8 = BachelorFridge.field_y;
        try {
          this.field_D = param1.b(16711935);
          this.field_L = rs.field_g[this.field_D];
          this.field_o = param1.b(16711935);
          this.field_E = param1.b(param0 + 16711936);
          this.field_z = param1.b(16711935);
          this.field_B = param1.b(16711935);
          this.field_a = new wia[this.field_z][this.field_B];
          this.field_i = new int[this.field_L.field_m][3];
          if (param0 != -1) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_i.length; var3_int++) {
            this.field_i[var3_int] = new int[]{-1, -1, -1};
          }
          var3_intLifetime1 = 3 + this.field_d;
          if (var3_intLifetime1 > 9) {
            var3_intLifetime1 = 9;
          }
          var4 = 0;
          for (var5 = 0; this.field_B > var5; var5++) {
            for (var6 = 0; this.field_z > var6; var6++) {
              var7 = param1.b(16711935);
              this.field_a[var6][var5] = new wia(dda.a(var7, 127));
              stackIn_15_0 = this.field_a[var6][var5];
              stackIn_16_1 = ((var7 & 128) != 0);
              stackIn_15_0.field_i = stackIn_16_1;
              this.field_a[var6][var5].field_j = param1.b(16711935);
              if (this.field_a[var6][var5].field_j == 255) {
                this.field_a[var6][var5].field_j = -1;
              }
              this.field_a[var6][var5].field_a = param1.b(true);
              stackIn_20_0 = this.field_a[var6][var5];
              stackIn_21_1 = (1 == param1.b(16711935));
              stackIn_20_0.field_m = stackIn_21_1;
              if (this.field_a[var6][var5].field_n == 20) {
                this.field_i[var4][0] = var6;
                this.field_i[var4][1] = var5;
                this.field_i[var4][2] = -1;
                var4++;
              }
              this.field_a[var6][var5].field_h = param1.b(param0 + 16711936);
              stackIn_26_0 = this.field_a[var6][var5];
              stackIn_27_1 = (1 == param1.b(16711935));
              stackIn_26_0.field_d = stackIn_27_1;
            }
          }
          if (this.field_o == 2) {
            this.field_i = new int[this.field_L.field_m][3];
            for (var5Lifetime1 = 0; this.field_i.length > var5Lifetime1; var5Lifetime1++) {
              this.field_i[var5Lifetime1] = new int[]{param1.b(true), param1.b(true), param1.b(true)};
            }
          }
          if (this.field_o == 3) {
            this.field_c = new int[this.field_d][0];
            for (var5Lifetime2 = 0; this.field_d > var5Lifetime2; var5Lifetime2++) {
              this.field_c[var5Lifetime2] = new int[]{param1.b(16711935), param1.b(param0 + 16711936)};
            }
            this.field_C = new int[this.field_d];
            for (var5Lifetime2Lifetime1 = 0; this.field_d > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              this.field_C[var5Lifetime2Lifetime1] = param1.b(16711935);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("op.IB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final boolean b(aga param0, byte param1) {
        RuntimeException var3 = null;
        aj[] var4 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 113) {
            var4 = (aj[]) null;
            this.a(2, (aj[]) null, 108, (byte) -104);
          }
          if (param0.field_D == 0) {
            stackIn_14_0 = param0.i(23, 116);
            return stackIn_14_0;
          }
          if (1 == param0.field_D) {
            stackIn_12_0 = param0.i(24, 126);
            return stackIn_12_0;
          }
          if (param0.field_D == 2) {
            stackIn_6_0 = param0.i(25, 124);
            return stackIn_6_0;
          }
          if (3 != param0.field_D) {
            return false;
          }
          stackIn_10_0 = param0.i(26, 122);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("op.SB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, lu param2) {
        int var4_int = 0;
        cj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          var4_int = param2.field_g + param0;
          this.b(param2, -69);
          this.field_O = param2.b(16711935);
          this.field_U = new eaa();
          while (var4_int > param2.field_g) {
            var5 = tma.a(param2, (byte) -50);
            var5.field_j = param2.f(-98);
            this.field_U.a(var5, true);
          }
          if (!param1) {
            this.field_m = -104;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("op.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int b(boolean param0, int param1) {
        if (23 == param1) {
          return 0;
        }
        if (param1 == 24) {
          return 1;
        }
        if (25 == param1) {
          return 2;
        }
        if (param1 == 26) {
          return 3;
        }
        if (param0) {
          this.field_S = (ib[]) null;
        }
        return -1;
    }

    private final int[] a(boolean param0, aga param1) {
        int[] stackIn_3_0 = null;
        int[] stackIn_84_0 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          var3_int = param1.field_x;
          var4 = param1.field_J;
          var5 = param1.f((byte) 123);
          var6 = kla.a(4, this.field_w, -2147483648) + 1;
          if (!param0) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var7 = var6;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          while (var8 < 4) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted5 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var7 == 2) {
              for (var11 = 1; var11 < var5; var11++) {
                if (var3_int - var11 < 0) {
                  decompiledFrameCompleted5 = false;
                  break;
                }
                if (!this.field_a[-var11 + var3_int][var4].e(-110)) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
                if (-var11 + var3_int >= 0 &&
                  this.field_a[-var11 + var3_int][var4].field_l == null &&
                  var11 > var10) {
                  var10 = var11;
                  var9 = 2;
                }
              }
              if (decompiledFrameCompleted5) {
                decompiledFrameRemainder0 = !(decompiledFrameCompleted4);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted5) &&
              (decompiledFrameCompleted4)) {
              if (var7 == 4) {
                for (var11Lifetime1 = 1; var11Lifetime1 < var5; var11Lifetime1++) {
                  if (var3_int + var11Lifetime1 > this.field_z - 1) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (!this.field_a[var11Lifetime1 + var3_int][var4].e(-80)) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                  if (var3_int + var11Lifetime1 < this.field_z &&
                    null == this.field_a[var11Lifetime1 + var3_int][var4].field_l &&
                    var10 < var11Lifetime1) {
                    var10 = var11Lifetime1;
                    var9 = 4;
                  }
                }
                if (decompiledFrameCompleted3) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted2);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                if (1 == var7) {
                  for (var11Lifetime1Lifetime1 = 1; var11Lifetime1Lifetime1 < var5; var11Lifetime1Lifetime1++) {
                    if (0 > var4 - var11Lifetime1Lifetime1) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (!this.field_a[var3_int][var4 - var11Lifetime1Lifetime1].e(-88)) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (var4 - var11Lifetime1Lifetime1 >= 0 &&
                      this.field_a[var3_int][var4 - var11Lifetime1Lifetime1].field_l == null &&
                      var10 < var11Lifetime1Lifetime1) {
                      var9 = 1;
                      var10 = var11Lifetime1Lifetime1;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0) &&
                  (var7 == 3)) {
                  for (var11Lifetime1Lifetime1 = 1; var5 > var11Lifetime1Lifetime1; var11Lifetime1Lifetime1++) {
                    if ((this.field_B - 1) < (var11Lifetime1Lifetime1 + var4)) {
                      break;
                    }
                    if (!this.field_a[var3_int][var11Lifetime1Lifetime1 + var4].e(-35)) {
                      break;
                    }
                    if (this.field_B > var11Lifetime1Lifetime1 + var4 &&
                      null == this.field_a[var3_int][var11Lifetime1Lifetime1 + var4].field_l &&
                      var10 < var11Lifetime1Lifetime1) {
                      var9 = 3;
                      var10 = var11Lifetime1Lifetime1;
                    }
                  }
                }
              }
            }
            var7++;
            if (var7 == 5) {
              var7 = 1;
            }
            var8++;
          }
          if (var9 == 0) {
            var9 = 1 + kla.a(4, this.field_w, -2147483648);
          }
          if (var10 == 0) {
            var10 = kla.a(var5, this.field_w, -2147483648);
          }
          stackIn_84_0 = new int[]{var9, var10};
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_87_0 = var3;
          stackIn_87_1 = new StringBuilder().append("op.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_87_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    final void a(lu param0, int param1) {
        cj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param1 != -1) {
            this.d(52, -96, -42);
          }
          this.d(param0, (byte) -116);
          param0.d(this.field_O, 0);
          var3 = (cj) (this.field_U.b((byte) 90));
          while (var3 != null) {
            nca.a(101, param0, var3);
            param0.e(var3.field_j, -1615464796);
            var3 = (cj) (this.field_U.c(~param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("op.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(byte param0, aga param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            this.field_n = (nq[]) null;
          }
          if (param1.g((byte) 85)) {
            if (param1.field_y == 24) {
              stackIn_15_0 = 0;
              return stackIn_15_0;
            }
            if (param1.field_y == 25) {
              stackIn_6_0 = 1;
              return stackIn_6_0;
            }
            if (26 == param1.field_y) {
              stackIn_13_0 = 2;
              return stackIn_13_0;
            }
            if (param1.field_y == 27) {
              stackIn_11_0 = 3;
              return stackIn_11_0;
            }
          }
          stackIn_17_0 = -1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("op.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final lc e(int param0) {
        int var5 = 0;
        int incrementValue$1 = 0;
        int stackIn_38_0 = 0;
        int var3;
        int var4;
        ej var4_ref_ej;
        wia var5_ref_wia;
        int var6;
        int var7;
        lc var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        int var3Lifetime7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var7 = BachelorFridge.field_y;
        boolean discarded$0 = this.b((byte) 10);
        this.i((byte) 56);
        this.i(0);
        this.j(-1);
        var8 = new lc();
        this.a(23189);
        for (var3 = param0; var3 < this.field_z; var3++) {
          for (var4 = 0; this.field_B > var4; var4++) {
            if (null != this.field_a[var3][var4].field_l) {
              this.field_a[var3][var4].field_l.a(this.field_a[var3][var4], var8, this.field_U, (byte) 121);
            }
            if (this.field_a[var3][var4].field_n == 27 &&
              this.field_a[var3][var4].field_j <= 3) {
              var8.a(new fi(var3, var4), (byte) 113);
            }
            if (od.field_w[this.field_a[var3][var4].field_n].field_b &&
              !this.field_a[var3][var4].field_m &&
              this.field_a[var3][var4].field_j == 0) {
              var8.a(new oca(var3, var4), (byte) 60);
            }
          }
        }
        for (var3Lifetime1 = 0; this.field_z > var3Lifetime1; var3Lifetime1++) {
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_B; var4Lifetime1++) {
            var5_ref_wia = this.field_a[var3Lifetime1][var4Lifetime1];
            if (var5_ref_wia.field_n == 33) {
              if (var5_ref_wia.field_j != 3) {
                if (var5_ref_wia.field_j == 2) {
                  stackIn_38_0 = 60;
                } else {
                  if (1 != var5_ref_wia.field_j) {
                    stackIn_38_0 = (var5_ref_wia.field_j != 0) ? 15 : 30;
                  } else {
                    stackIn_38_0 = 45;
                  }
                }
              } else {
                stackIn_38_0 = 75;
              }
              var6 = stackIn_38_0;
              this.a(var4Lifetime1, 3 - var5_ref_wia.field_j, -1, var6, var3Lifetime1);
            }
          }
        }
        for (var3Lifetime2 = 0; this.field_z > var3Lifetime2; var3Lifetime2++) {
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_B; var4Lifetime2++) {
            if (this.field_a[var3Lifetime2][var4Lifetime2].field_j == 0 && (this.field_a[var3Lifetime2][var4Lifetime2].field_n == 37 ||
              35 == this.field_a[var3Lifetime2][var4Lifetime2].field_n)) {
              var8.a(new wp(var3Lifetime2, var4Lifetime2), (byte) 93);
            }
            if (this.field_a[var3Lifetime2][var4Lifetime2].field_j == -1 &&
              this.field_a[var3Lifetime2][var4Lifetime2].field_n == 33) {
              var8.a(new tga(var3Lifetime2, var4Lifetime2), (byte) 51);
            }
          }
        }
        if (this.field_E == 2) {
          if (sh.field_C == null ||
            !(this.field_z * this.field_B <= sh.field_C.length)) {
            sh.field_C = new aj[this.field_z * this.field_B];
          }
          var3Lifetime3 = 0;
          for (var4Lifetime3 = 0; var4Lifetime3 < this.field_z; var4Lifetime3++) {
            for (var5 = 0; this.field_B > var5; var5++) {
              if (this.field_a[var4Lifetime3][var5].a((byte) -63) &&
                this.field_a[var4Lifetime3][var5].field_j == -1) {
                incrementValue$1 = var3Lifetime3;
                var3Lifetime3++;
                sh.field_C[incrementValue$1] = new aj(var4Lifetime3, var5);
              }
            }
          }
          if (var3Lifetime3 != 0) {
            var8.a(new ow(sh.field_C, var3Lifetime3), (byte) 93);
          }
        }
        if (this.field_x &&
          this.field_K >= 4) {
          for (var3Lifetime4 = 0; var3Lifetime4 < this.field_z; var3Lifetime4++) {
            for (var4Lifetime4 = 0; this.field_B > var4Lifetime4; var4Lifetime4++) {
              if (27 == this.field_a[var3Lifetime4][var4Lifetime4].field_n) {
                var8.a(new tga(var3Lifetime4, var4Lifetime4), (byte) 117);
              }
            }
          }
          var8.a(new bg(), (byte) 39);
        }
        if (this.field_l &&
          this.field_F >= 3) {
          var8.a(new bja(), (byte) 114);
        }
        var8.a(this, false);
        this.field_U.a(var8, true);
        this.a(var8, (byte) 73);
        for (var3Lifetime5 = 0; var3Lifetime5 < this.field_d; var3Lifetime5++) {
          if (!this.field_S[var3Lifetime5].field_c &&
            this.b((byte) 53, var3Lifetime5)) {
            var4_ref_ej = new ej(var3Lifetime5);
            var8.a(var4_ref_ej, (byte) 112);
            var4_ref_ej.a(false, this);
          }
        }
        if (this.field_A > this.field_J) {
          var3Lifetime6 = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < this.field_d; var4Lifetime5++) {
            if (!this.field_S[var4Lifetime5].field_c) {
              var3Lifetime6++;
            }
          }
          if (var3Lifetime6 >= 2 ||
            1 == this.field_d) {
            this.c(param0 ^ 101);
            this.a(var8, (byte) 73);
          }
        }
        for (var3Lifetime7 = 0; this.field_d > var3Lifetime7; var3Lifetime7++) {
          if (this.field_T.field_n[var3Lifetime7] > this.field_T.field_o[var3Lifetime7]) {
            this.field_T.field_o[var3Lifetime7] = this.field_T.field_n[var3Lifetime7];
          }
          this.field_T.field_n[var3Lifetime7] = 0;
          if (this.field_T.field_q[var3Lifetime7] < this.field_T.field_y[var3Lifetime7]) {
            this.field_T.field_q[var3Lifetime7] = this.field_T.field_y[var3Lifetime7];
          }
          this.field_T.field_y[var3Lifetime7] = 0;
        }
        this.d(98);
        return var8;
    }

    private final void a(lc param0, byte param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        aga var6 = null;
        int var7 = 0;
        ib stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (param1 != 73) {
            this.field_Q = 29;
          }
          while (this.field_d > var3_int) {
            var4 = 1;
            for (var5 = 0; var5 < 7; var5++) {
              var6 = this.field_S[var3_int].field_b[var5];
              if (var6 != null &&
                !var6.i(75)) {
                var4 = 0;
              }
            }
            stackIn_14_0 = this.field_S[var3_int];
            stackIn_15_1 = (var4 != 0);
            stackIn_14_0.field_c = stackIn_15_1;
            if (var4 != 0) {
              param0.a(new iia(var3_int), (byte) 116);
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("op.VA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String j(byte param0) {
        if (param0 != 42) {
          return (String) null;
        }
        return pn.a((byte) -122, this.field_o, new String[]{null, "Annihilation", "Take & Hold", "CTF"});
    }

    final void a(int param0, rk[] param1, int param2) {
        int var5 = 0;
        int var7 = 0;
        ib dupTemp$0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        aga[] var6 = null;
        rk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var14 = null;
        int[][] var17 = null;
        var11 = BachelorFridge.field_y;
        try {
          this.field_S[param2] = new ib(param2);
          var14 = new int[7];
          var12 = var14;
          var4 = var12;
          for (var5 = 0; 7 > var5; var5++) {
            if (param1[var5] != null) {
              var4[var5] = -param1[var5].field_k[1];
            } else {
              var4[var5] = 2147483646;
            }
          }
          dk.$cfr$intArgs$a$e46325ef0b7e(param1, 96, var14);
          var17 = this.field_L.b(param2, -36);
          var6 = this.field_S[param2].field_b;
          for (var7 = 0; var17.length > var7; var7++) {
            if (var7 < param1.length) {
              var8 = param1[var7];
              if (var8 != null) {
                var9 = var17[var7][0];
                var10 = var17[var7][1];
                var6[var7] = new aga(var8, this, param2, var7);
                var6[var7].field_x = var9;
                var6[var7].field_J = var10;
                this.field_a[var9][var10].field_l = var6[var7];
                dupTemp$0 = this.field_S[param2];
                dupTemp$0.field_a = dupTemp$0.field_a + 1;
                continue;
              }
            }
            break;
          }
          if (param0 != 1) {
            this.field_y = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("op.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final String k(byte param0) {
        int var3;
        int var4;
        aga var5;
        int var5_int;
        int var6;
        int var7;
        rha var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        var6 = BachelorFridge.field_y;
        var8 = new rha();
        var8.a("gametype: " + this.j((byte) 42), 4819);
        var8.a("players: " + this.field_d, 4819);
        var8.a(99, 2);
        for (var3 = 0; var3 < this.field_d; var3++) {
          if (this.field_o == 3) {
            var8.a(this.field_y[var3] + ": " + this.field_C[var3], 4819);
          } else {
            var8.a(this.field_y[var3], 4819);
          }
        }
        var8.a(102, -2);
        var8.a("boardtype: " + this.a((byte) -83), 4819);
        var8.a("turnid: " + this.field_A, 4819);
        if (this.field_o == 3) {
          var8.a("flags:", 4819);
          var8.a(119, 2);
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_d; var3Lifetime1++) {
            var8.a(this.field_c[var3Lifetime1][0] + ", " + this.field_c[var3Lifetime1][1], 4819);
          }
          var8.a(120, -2);
        }
        if (this.field_M != -1) {
          var8.a("winning: " + this.field_M + ": " + this.field_Q + " turns", 4819);
        }
        var8.a("map: " + this.field_D + " - " + this.field_z + "x" + this.field_B, 4819);
        for (var3Lifetime2 = 0; this.field_z > var3Lifetime2; var3Lifetime2++) {
          for (var4 = 0; this.field_B > var4; var4++) {
            var5_int = this.field_E * 2 + this.field_L.field_o[var3Lifetime2][var4].field_n;
            if (this.field_a[var3Lifetime2][var4].a(-27864, this, var5_int)) {
              this.field_a[var3Lifetime2][var4].a(-128, var3Lifetime2, var8, this, var4);
            }
          }
        }
        var3Lifetime3 = 0;
        if (param0 > -60) {
          this.field_U = (eaa) null;
        }
        while (var3Lifetime3 < this.field_d) {
          var8.a("player: " + this.field_y[var3Lifetime3], 4819);
          var8.a(-17, 2);
          var7 = 0;
          var4Lifetime1 = var7;
          while (var7 < 7) {
            var5 = this.field_S[var3Lifetime3].field_b[var7];
            if (var5 != null) {
              var5.a(var8, (byte) 73);
            } else {
              var8.a(var7 + ": (empty)", 4819);
            }
            var7++;
          }
          var8.a(101, -2);
          var3Lifetime3++;
        }
        var8.a("Resultant checksum: " + Integer.toHexString(this.c((byte) -87)), 4819);
        return var8.a((byte) -128);
    }

    final boolean a(int param0, int param1, int param2, byte param3) {
        int var5;
        boolean stackIn_6_0 = false;
        if (3 != this.field_o) {
          return false;
        }
        var5 = 81 / ((38 - param3) / 53);
        stackIn_6_0 = (param1 == this.field_c[param0][0]) && (param2 == this.field_c[param0][1]);
        return stackIn_6_0;
    }

    private final void a(lu param0, byte param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 40 % ((61 - param1) / 45);
          for (var4 = 0; var4 < this.field_d; var4++) {
            this.a(var4, param0, -123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("op.K(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final aga a(aga param0, byte param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a((byte) 112, param0);
          if (param1 >= -39) {
            this.k((byte) -50);
          }
          if (var3 != null) {
            var3.f(32);
            this.a(var3, true);
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("op.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    op(int param0, int param1, int param2, int param3, int param4, String[] param5) {
        wia stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[][] var21 = null;
        int[] var22 = null;
        int var9Lifetime1;
        this.field_w = new Random();
        this.field_Q = -1;
        this.field_M = -1;
        try {
          this.field_G = param0;
          this.field_d = param5.length;
          this.field_k = param2;
          this.field_o = param3;
          this.field_m = param4;
          this.field_J = st.field_d[this.field_m];
          this.field_y = param5;
          this.field_L = ww.a(0, this.field_d, this.field_o, this.field_k, af.field_a);
          this.field_D = this.field_L.field_g;
          if (null == this.field_L) {
            throw new RuntimeException();
          }
          var7_int = 3 + this.field_d;
          if (var7_int > 9) {
            var7_int = 9;
          }
          this.field_B = this.field_L.field_q;
          this.field_E = param1;
          this.field_z = this.field_L.field_f;
          this.field_a = new wia[this.field_z][this.field_B];
          for (var8 = 0; this.field_B > var8; var8++) {
            for (var9 = 0; var9 < this.field_z; var9++) {
              var10 = this.field_L.field_o[var9][var8].field_n;
              if (var10 < 2) {
                var10 = 0;
              } else {
                var10 += 19;
              }
              this.field_a[var9][var8] = new wia(var10);
              stackIn_14_0 = this.field_a[var9][var8];
              stackIn_15_1 = (this.field_L.field_o[var9][var8].field_n == 1);
              stackIn_14_0.field_i = stackIn_15_1;
              if (this.field_a[var9][var8].a(false, this)) {
                this.field_a[var9][var8].field_j = kla.a(3, this.field_w, -2147483648);
              }
              if (-1 != this.field_L.field_o[var9][var8].field_a &&
                this.field_L.field_o[var9][var8].field_a < 13) {
                if (!this.b(var8, 26, var9)) {
                  this.field_a[var9][var8].field_n = this.field_L.field_o[var9][var8].field_a;
                  this.field_a[var9][var8].field_a = this.field_L.field_o[var9][var8].field_a;
                  this.field_a[var9][var8].field_m = true;
                } else {
                  this.field_a[var9][var8].field_a = -1;
                }
              }
            }
          }
          this.field_i = new int[this.field_L.field_m][3];
          for (var8 = 0; var8 < this.field_L.field_m; var8++) {
            if (this.field_o == 2) {
              this.field_i[var8] = new int[]{this.field_L.field_h[var8][0], this.field_L.field_h[var8][1], -1};
            } else {
              this.field_i[var8] = new int[]{-1, -1, -1};
            }
          }
          if (this.field_o == 2) {
            var21 = this.field_i;
            var14 = 0;
            var9Lifetime1 = var14;
            while (var14 < var21.length) {
              var22 = var21[var14];
              var11 = var22[0];
              var12 = var22[1];
              if (var11 != -1 ||
                -1 != var12) {
                this.field_a[var11][var12].field_n = 20;
                this.field_a[var11][var12].field_a = 8;
                var22[2] = -1;
              }
              var14++;
            }
          }
          this.field_S = new ib[this.field_d];
          for (var8 = 0; var8 < this.field_d; var8++) {
            this.field_S[var8] = new ib(var8);
          }
          if (3 == this.field_o) {
            this.field_c = new int[this.field_d][2];
            for (var8 = 0; var8 < this.field_d; var8++) {
              this.field_c[var8] = this.a(0, var8);
              if (this.field_c[var8][0] != -1 &&
                this.field_c[var8][1] != -1) {
                this.field_a[this.field_c[var8][0]][this.field_c[var8][1]].field_n = var8 + 23;
                this.field_a[this.field_c[var8][0]][this.field_c[var8][1]].field_m = true;
              }
            }
            this.field_C = new int[this.field_d];
          }
          this.field_j = new sfa[this.field_d][7];
          this.field_t = new eaa[7];
          this.field_n = new nq[7 * this.field_d];
          this.field_g = new int[this.field_d];
          this.field_p = new vg();
          this.field_T = new paa(this);
          if (af.field_a) {
            this.field_a[3][6].field_n = 39;
            this.field_a[3][6].field_h = 20;
            this.field_a[4][5].field_h = 20;
            this.field_a[4][5].field_n = 39;
            this.field_a[0][2].field_n = 39;
            this.field_e = 3;
            this.field_a[0][2].field_h = 20;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_53_0 = var7;
          stackIn_53_1 = new StringBuilder().append("op.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
        field_q = "Accept <%0> into this game";
    }
}
