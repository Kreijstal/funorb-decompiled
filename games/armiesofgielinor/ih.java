/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends hn {
    private dw field_q;
    private int[] field_u;
    static int[] field_E;
    static nj field_H;
    private mi[][] field_I;
    int[] field_s;
    private int[] field_F;
    private NodeHashTable field_T;
    private int[] field_P;
    private mi[][] field_M;
    private int[] field_C;
    private int field_v;
    private int field_U;
    private int[] field_A;
    static SpellMenuGroup field_p;
    private int[] field_V;
    private static byte[] field_G;
    private int[] field_r;
    private int[] field_D;
    private int[] field_x;
    int[] field_o;
    int[] field_W;
    private int[] field_N;
    private int[] field_O;
    static String field_R;
    private int[] field_w;
    private int[] field_J;
    static int field_ab;
    static String field_X;
    private long field_z;
    private int field_K;
    private int field_t;
    private boolean field_Z;
    private long field_Y;
    private os field_Q;
    private boolean field_y;
    private um field_B;
    private int field_L;

    private final void a(byte param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.field_K;
        var3 = this.field_t;
        var4 = this.field_Y;
        if (null != this.field_B &&
          var3 == this.field_L) {
          this.a(this.field_Z, (byte) -90, this.field_y, this.field_B);
          this.a((byte) 36);
          return;
        }
        if (param0 != 36) {
          this.field_Y = -103L;
        }
        while (true) {
          if (var3 != this.field_t) {
            this.field_Y = var4;
            this.field_K = var2;
            this.field_t = var3;
            if (this.field_B != null) {
              stackIn_23_0 = ~this.field_L;
              stackIn_23_1 = ~var3;
              if (stackIn_23_0 > stackIn_23_1) {
                this.field_t = this.field_L;
                this.field_K = -1;
                this.field_Y = this.field_q.b(this.field_t);
              }
            }
            return;
          }
          while (var3 == this.field_q.field_i[var2]) {
            this.field_q.d(var2);
            var6 = this.field_q.c(var2);
            if (var6 != 1) {
              if (0 != (var6 & 128)) {
                this.a((byte) 127, var6);
              }
              this.field_q.f(var2);
              this.field_q.a(var2);
              continue;
            }
            this.field_q.a();
            this.field_q.a(var2);
            if (this.field_q.b()) {
              if (null != this.field_B) {
                this.a(param0 - 34, this.field_Z, this.field_B);
                this.a((byte) 36);
                return;
              }
              if (this.field_Z &&
                var3 != 0) {
                this.field_q.a(var4);
              } else {
                this.a(true, true);
                this.field_q.f();
                return;
              }
            }
            break;
          }
          var2 = this.field_q.e();
          var3 = this.field_q.field_i[var2];
          var4 = this.field_q.b(var3);
        }
    }

    private final int a(byte param0, mi param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fq var9 = null;
        fq var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_w[param1.field_m] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param1.field_v;
          var10 = var9;
          var4 = this.field_A[param1.field_m] * this.field_N[param1.field_m] + 4096 >> 13;
          if (param0 != -110) {
            this.a(102, (byte) -86);
          }
          var4 = 16384 + var4 * var4 >> 15;
          var4 = param1.field_u * var4 + 16384 >> 15;
          var4 = 128 + var4 * this.field_v >> 8;
          var4 = var4 * this.field_w[param1.field_m] + 128 >> 8;
          if (0 < var10.field_d) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_o * (double)var10.field_d) * (double)var4);
          }
          if (var10.field_l != null) {
            var5 = param1.field_s;
            var6 = var10.field_l[param1.field_A + 1];
            if (param1.field_A < -2 + var10.field_l.length) {
              var7 = (var9.field_l[param1.field_A] & 255) << 8;
              var8 = var10.field_l[2 + param1.field_A] << 8 & 65280;
              var6 = var6 + (-var6 + var10.field_l[3 + param1.field_A]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (0 < param1.field_x &&
            var10.field_g != null) {
            var5Lifetime1 = param1.field_x;
            var6Lifetime1 = var10.field_g[param1.field_p + 1];
            if (var10.field_g.length - 2 > param1.field_p) {
              var7Lifetime1 = var9.field_g[param1.field_p] << 8 & 65280;
              var8Lifetime1 = (var10.field_g[param1.field_p + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_g[param1.field_p + 3]) * (-var7Lifetime1 + var5Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ih.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param2 > -13) {
          return;
        }
        if (0 > param1) {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_w[var4] = param0;
          }
        } else {
          this.field_w[param1] = param0;
        }
    }

    final void a(boolean param0, mi param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != 16) {
            this.a(-101, 56, -32, -116);
          }
          var4_int = param1.field_q.field_o.length;
          if (param0 &&
            param1.field_q.field_l) {
            var6 = -param1.field_q.field_m + var4_int + var4_int;
            var5 = (int)((long)this.field_W[param1.field_m] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param1.field_K.a(true);
              var5 = -var5 + var4_int + (var4_int - 1);
            }
          } else {
            var5 = (int)((long)this.field_W[param1.field_m] * (long)var4_int >> 6);
          }
          param1.field_K.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ih.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized hn b() {
        return null;
    }

    synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a(param2, -128);
        if (param1 > -78) {
          return;
        }
        try {
          this.field_q.a(param3.field_k);
          this.field_z = 0L;
          this.field_Z = param0 ? true : false;
          var5_int = this.field_q.d();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_q.d(var6);
            this.field_q.f(var6);
            this.field_q.a(var6);
          }
          this.field_K = this.field_q.e();
          this.field_t = this.field_q.field_i[this.field_K];
          this.field_Y = this.field_q.b(this.field_t);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ih.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void f(int param0, int param1) {
        if (param0 >= -49) {
          return;
        }
        this.field_v = param1;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.field_P[param1] = param0;
        this.field_D[param1] = rn.a(-128, param0);
        this.a(param1, (byte) 114, param0);
        if (!param2) {
          this.field_z = -32L;
        }
    }

    final synchronized boolean a(p param0, kl param1, int param2, um param3, byte param4) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        vc var8 = null;
        int var9 = 0;
        int var11 = 0;
        io var12 = null;
        io var13 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param3.b();
          var6_int = 1;
          var7 = null;
          if (param2 > 0) {
            var7 = new int[]{param2};
          }
          if (param4 != 86) {
            return true;
          }
          var8 = (vc) (param3.field_l.first(1));
          while (var8 != null) {
            var9 = (int)var8.key;
            var12 = (io) (this.field_T.get(-27, (long)var9));
            if (var12 == null) {
              var13 = wl.a(param1, var9, true);
              if (var13 != null) {
                this.field_T.put(var13, (long)var9, 24);
                if (!var13.a(param4 + 10922, var8.field_n, (int[]) (var7), param0)) {
                  var6_int = 0;
                }
              } else {
                var6_int = 0;
              }
            } else {
              if (!var12.a(param4 + 10922, var8.field_n, (int[]) (var7), param0)) {
                var6_int = 0;
                var8 = (vc) (param3.field_l.next((byte) 115));
                continue;
              }
            }
            var8 = (vc) (param3.field_l.next((byte) 115));
          }
          if (var6_int != 0) {
            param3.a();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ih.SA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param2 != this.field_O[param0]) {
          this.field_O[param0] = param2;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_I[param0][var4] = null;
          }
        }
        if (param1 < 111) {
          field_E = (int[]) null;
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_q.g()) {
            var4_int = this.field_U * this.field_q.field_c / rc.field_d;
            while (true) {
              var5 = this.field_z + (long)param2 * (long)var4_int;
              if (0L <= -var5 + this.field_Y) {
                this.field_z = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (this.field_Y - (this.field_z + 1L))) / (long)var4_int);
              this.field_z = this.field_z + (long)var4_int * (long)var7;
              this.field_Q.b(param0, param1, var7);
              this.a((byte) 36);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (this.field_q.g()) {
                continue;
              }
              this.field_Q.b(param0, param1, param2);
              return;
            }
          }
          this.field_Q.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ih.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean c(byte param0, mi param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -76) {
            this.field_C = (int[]) null;
          }
          if (param1.field_K != null) {
            return false;
          }
          if (param1.field_x >= 0) {
            param1.unlink(56);
            if (param1.field_F > 0) {
              if (this.field_I[param1.field_m][param1.field_F] != param1) {
                return true;
              }
              this.field_I[param1.field_m][param1.field_F] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ih.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final synchronized void h(int param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        io var5 = (io) (this.field_T.first(1));
        int var3 = -125 % ((-68 - param0) / 49);
        while (var5 != null) {
          var5.a(126);
          var5 = (io) (this.field_T.next((byte) 55));
        }
    }

    private final void b(boolean param0, int param1) {
        mi var3;
        int var4;
        um var5;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 != (2 & this.field_o[param1])) {
          var3 = (mi) (this.field_Q.field_p.first((byte) 89));
          while (var3 != null) {
            if (var3.field_m == param1) {
              if (null != this.field_M[param1][var3.field_D]) {
                var3 = (mi) (this.field_Q.field_p.next((byte) 123));
                continue;
              }
              if (0 > var3.field_x) {
                var3.field_x = 0;
              }
            }
            var3 = (mi) (this.field_Q.field_p.next((byte) 123));
          }
        }
        if (param0) {
          var5 = (um) null;
          this.a((p) null, (kl) null, -24, (um) null, (byte) 111);
        }
    }

    public static void f(int param0) {
        field_G = null;
        if (param0 != -128) {
          field_X = (String) null;
        }
        field_H = null;
        field_X = null;
        field_p = null;
        field_E = null;
        field_R = null;
    }

    final int i(int param0) {
        if (param0 != 4096) {
          this.field_W = (int[]) null;
        }
        return this.field_v;
    }

    final static String e(int param0) {
        int var3 = 0;
        NodeDeque var4 = null;
        Unit var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        GameplayController var1 = rd.field_j;
        if (var1 == null) {
          return "No game in progress.";
        }
        NodeDeque[] var2 = var1.battlefield.unitsByPlayer;
        if (param0 <= 10) {
          return (String) null;
        }
        for (var3 = 0; var3 < var2.length; var3++) {
          var4 = var2[var3];
          var5 = (Unit) (var4.first((byte) 99));
          while (var5 != null) {
            var5.field_u = false;
            var5 = (Unit) (var4.next((byte) 123));
          }
        }
        return "Did that work?";
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        mi var6 = null;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        mi var8 = this.field_M[param3][param1];
        if (var8 == null) {
          return;
        }
        this.field_M[param3][param1] = null;
        if (param2 != -44) {
          ih.e(-77);
        }
        if ((this.field_o[param3] & 2) == 0) {
          var8.field_x = 0;
        } else {
          var6 = (mi) (this.field_Q.field_p.first((byte) 87));
          while (var6 != null) {
            if (var6.field_m == var8.field_m &&
              var6.field_x < 0 &&
              var8 != var6) {
              var8.field_x = 0;
              break;
            }
            var6 = (mi) (this.field_Q.field_p.next((byte) 123));
          }
        }
    }

    final synchronized void j(int param0) {
        this.a(true, -128);
        if (param0 != 7) {
          this.field_I = (mi[][]) null;
        }
    }

    private final int a(int param0, mi param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        fq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          if (param0 != 1370206316) {
            this.field_T = (NodeHashTable) null;
          }
          var3_int = param1.field_t + (param1.field_n * param1.field_J >> 12);
          var3_int = var3_int + (this.field_x[param1.field_m] * (-8192 + this.field_r[param1.field_m]) >> 12);
          var4 = param1.field_v;
          if (var4.field_b > 0 && (!(var4.field_j <= 0) ||
            this.field_u[param1.field_m] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_e << 1;
            if (var6 > param1.field_I) {
              var5 = param1.field_I * var5 / var6;
            }
            var5 = var5 + (this.field_u[param1.field_m] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_y & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_q.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)rc.field_d);
          stackIn_12_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ih.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized hn a() {
        return (hn) ((Object) this.field_Q);
    }

    final boolean a(int param0, int param1, mi param2, byte param3, int[] param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        fq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param2.field_w = rc.field_d / 100;
          if (0 <= param2.field_x && (param2.field_K == null ||
            param2.field_K.i())) {
            param2.e(13301);
            param2.unlink(-119);
            if (param2.field_F > 0 &&
              param2 == this.field_I[param2.field_m][param2.field_F]) {
              this.field_I[param2.field_m][param2.field_F] = null;
              return true;
            }
            return true;
          }
          var6_int = param2.field_n;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_F[param2.field_m] * 0.0004921259842519685));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param2.field_n = var6_int;
          }
          param2.field_K.e(this.a(1370206316, param2));
          var7 = param2.field_v;
          param2.field_y = param2.field_y + var7.field_b;
          param2.field_I = param2.field_I + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param2.field_J * param2.field_n >> 12) + (-60 + param2.field_D << 8));
          if (0 < var7.field_d) {
            if (var7.field_i > 0) {
              param2.field_o = param2.field_o + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
            } else {
              param2.field_o = param2.field_o + 128;
            }
            if (var7.field_d * param2.field_o >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_l != null) {
            if (var7.field_m <= 0) {
              param2.field_s = param2.field_s + 128;
            } else {
              param2.field_s = param2.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_m) * 128.0);
            }
            while (param2.field_A < var7.field_l.length - 2) {
              if ((255 & var7.field_l[param2.field_A + 2]) << 8 < param2.field_s) {
                param2.field_A = param2.field_A + 2;
                continue;
              }
              break;
            }
            if (param2.field_A == var7.field_l.length - 2 &&
              var7.field_l[1 + param2.field_A] == 0) {
              var8 = 1;
            }
          }
          if (param3 <= 34) {
            this.b(-100, -5, -59);
          }
          if (param2.field_x >= 0 &&
            var7.field_g != null &&
            0 == (1 & this.field_o[param2.field_m]) && (!(param2.field_F >= 0) ||
            param2 != this.field_I[param2.field_m][param2.field_F])) {
            if (var7.field_c <= 0) {
              param2.field_x = param2.field_x + 128;
            } else {
              param2.field_x = param2.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
            }
            while (param2.field_p < var7.field_g.length - 2) {
              if (((255 & var7.field_g[2 + param2.field_p]) << 8) < param2.field_x) {
                param2.field_p = param2.field_p + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_g.length == param2.field_p) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param2.field_K.a(param2.field_w, this.a((byte) -110, param2), this.b((byte) 112, param2));
            return false;
          }
          param2.field_K.h(param2.field_w);
          if (param4 == null) {
            param2.field_K.a(param0);
          } else {
            param2.field_K.b(param4, param1, param0);
          }
          if (param2.field_K.e()) {
            this.field_Q.field_s.a(param2.field_K);
          }
          param2.e(13301);
          if (param2.field_x >= 0) {
            param2.unlink(93);
            if (0 < param2.field_F &&
              this.field_I[param2.field_m][param2.field_F] == param2) {
              this.field_I[param2.field_m][param2.field_F] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("ih.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        mi var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 0) {
          this.f(81, -106);
        }
        var3 = (mi) (this.field_Q.field_p.first((byte) 105));
        while (var3 != null) {
          if ((0 > param0 ||
            var3.field_m == param0) &&
            var3.field_x < 0) {
            this.field_M[var3.field_m][var3.field_D] = null;
            var3.field_x = 0;
          }
          var3 = (mi) (this.field_Q.field_p.next((byte) 123));
        }
    }

    private final void e(int param0, int param1) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        mi var3 = (mi) (this.field_Q.field_p.first((byte) 121));
        if (param0 != -23024) {
          this.field_W = (int[]) null;
        }
        while (var3 != null) {
          if (param1 < 0 ||
            param1 == var3.field_m) {
            if (null != var3.field_K) {
              var3.field_K.h(rc.field_d / 100);
              if (var3.field_K.e()) {
                this.field_Q.field_s.a(var3.field_K);
              }
              var3.e(13301);
            }
            if (var3.field_x < 0) {
              this.field_M[var3.field_m][var3.field_D] = null;
            }
            var3.unlink(-118);
          }
          var3 = (mi) (this.field_Q.field_p.next((byte) 123));
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 != -1) {
          this.a(true, false);
        }
        this.a(param1, param2, true);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != 2) {
          this.f(-56, 47);
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_r[param0] = param1;
        if (param2 < 117) {
          this.field_I = (mi[][]) null;
        }
    }

    private final void d(int param0, int param1) {
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.d(59, param1);
          }
        } else {
          this.field_N[param1] = 12800;
          this.field_V[param1] = 8192;
          this.field_A[param1] = 16383;
          this.field_r[param1] = 8192;
          this.field_u[param1] = 0;
          this.field_F[param1] = 8192;
          this.b(false, param1);
          if (param0 <= 31) {
            this.a(-1, (byte) -1, 112, 0);
          }
          this.a(param1, (byte) 83);
          this.field_o[param1] = 0;
          this.field_J[param1] = 32767;
          this.field_x[param1] = 256;
          this.field_W[param1] = 0;
          this.d(10287, param1, 8192);
        }
    }

    private final void a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = 240 & param1;
        if (param0 < 102) {
          return;
        }
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = (32625 & param1) >> 8;
          var6 = (8335388 & param1) >> 16;
          this.a(var6, var5, -44, var4);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = param1 >> 16 & 127;
          if (0 < var6Lifetime1) {
            this.b(64, var5Lifetime1, var6Lifetime1, var4Lifetime1);
          } else {
            this.a(64, var5Lifetime1, -44, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param1;
          var5Lifetime2 = param1 >> 8 & 127;
          var6Lifetime2 = (param1 & 8346101) >> 16;
          this.a(var4Lifetime2, (byte) 79, var5Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param1 & 15;
            var5Lifetime3 = param1 >> 8 & 127;
            this.a(var4Lifetime3, (byte) 112, var5Lifetime3 + this.field_D[var4Lifetime3]);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param1 & 15;
            var5Lifetime3Lifetime1 = 127 & param1 >> 8;
            this.b(var5Lifetime3Lifetime1, 2, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param1;
            var5Lifetime3Lifetime2 = (param1 >> 8 & 127) + (param1 >> 9 & 16256);
            this.c(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 124);
            return;
          }
          var3 = 255 & param1;
          if (var3 != 255) {
            return;
          }
          this.a(true, true);
          return;
        }
        var4Lifetime4 = 15 & param1;
        var5Lifetime4 = (param1 & 32599) >> 8;
        var6Lifetime3 = 127 & param1 >> 16;
        if (0 == var5Lifetime4) {
          this.field_D[var4Lifetime4] = rn.a(-2080769, this.field_D[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_D[var4Lifetime4] = (var6Lifetime3 << 7) + rn.a(this.field_D[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_u[var4Lifetime4] = rn.a(this.field_u[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_u[var4Lifetime4] = rn.a(this.field_u[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (5 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = rn.a(-16257, this.field_F[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (37 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = var6Lifetime3 + rn.a(this.field_F[var4Lifetime4], -128);
        }
        if (7 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + rn.a(-16257, this.field_N[var4Lifetime4]);
        }
        if (var5Lifetime4 == 39) {
          this.field_N[var4Lifetime4] = var6Lifetime3 + rn.a(-128, this.field_N[var4Lifetime4]);
        }
        if (10 == var5Lifetime4) {
          this.field_V[var4Lifetime4] = rn.a(-16257, this.field_V[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 42) {
          this.field_V[var4Lifetime4] = var6Lifetime3 + rn.a(this.field_V[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 11) {
          this.field_A[var4Lifetime4] = rn.a(this.field_A[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_A[var4Lifetime4] = rn.a(-128, this.field_A[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_o[var4Lifetime4] = oe.c(this.field_o[var4Lifetime4], 1);
          } else {
            this.field_o[var4Lifetime4] = rn.a(this.field_o[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 < 64) {
            this.b(false, var4Lifetime4);
            this.field_o[var4Lifetime4] = rn.a(this.field_o[var4Lifetime4], -3);
          } else {
            this.field_o[var4Lifetime4] = oe.c(this.field_o[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_J[var4Lifetime4] = rn.a(127, this.field_J[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_J[var4Lifetime4] = rn.a(16256, this.field_J[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_J[var4Lifetime4] = 16384 - (-rn.a(127, this.field_J[var4Lifetime4]) - (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_J[var4Lifetime4] = var6Lifetime3 + (rn.a(this.field_J[var4Lifetime4], 16256) + 16384);
        }
        if (var5Lifetime4 == 120) {
          this.e(-23024, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.d(107, var4Lifetime4);
        }
        if (123 == var5Lifetime4) {
          this.b(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_J[var4Lifetime4];
          if (16384 == var7) {
            this.field_x[var4Lifetime4] = rn.a(-16257, this.field_x[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_J[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_x[var4Lifetime4] = var6Lifetime3 + rn.a(-128, this.field_x[var4Lifetime4]);
          }
        }
        if (16 == var5Lifetime4) {
          this.field_W[var4Lifetime4] = rn.a(-16257, this.field_W[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_W[var4Lifetime4] = var6Lifetime3 + rn.a(this.field_W[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, (byte) -66);
            this.field_o[var4Lifetime4] = rn.a(this.field_o[var4Lifetime4], -5);
          } else {
            this.field_o[var4Lifetime4] = oe.c(this.field_o[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.d(10287, var4Lifetime4, (-16257 & this.field_C[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 49) {
          this.d(10287, var4Lifetime4, var6Lifetime3 + (this.field_C[var4Lifetime4] & -128));
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_q.g()) {
          var2 = this.field_q.field_c * this.field_U / rc.field_d;
          while (true) {
            var3 = this.field_z + (long)param0 * (long)var2;
            if (-var3 + this.field_Y >= 0L) {
              this.field_z = var3;
              break;
            }
            var5 = (int)((-1L + ((long)var2 - this.field_z) + this.field_Y) / (long)var2);
            this.field_z = this.field_z + (long)var2 * (long)var5;
            this.field_Q.a(var5);
            param0 = param0 - var5;
            this.a((byte) 36);
            if (this.field_q.g()) {
              continue;
            }
            this.field_Q.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_Q.a(param0);
        }

    }

    private final void b(int param0, int param1, int param2, int param3) {
        boolean stackIn_16_1 = false;
        mi var5;
        int var6_int;
        sn var6;
        mi var7;
        mi var8;
        int var9;
        io var10;
        io var11;
        io var12;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.a(param0, param1, -44, param3);
        if ((2 & this.field_o[param3]) != 0) {
          var5 = (mi) (this.field_Q.field_p.d((byte) -83));
          while (var5 != null) {
            if (var5.field_m == param3 &&
              var5.field_x < 0) {
              this.field_M[param3][var5.field_D] = null;
              this.field_M[param3][param1] = var5;
              var6_int = var5.field_t + (var5.field_J * var5.field_n >> 12);
              var5.field_t = var5.field_t + (param1 - var5.field_D << 8);
              var5.field_J = -var5.field_t + var6_int;
              var5.field_D = param1;
              var5.field_n = 4096;
              return;
            }
            var5 = (mi) (this.field_Q.field_p.b((byte) 60));
          }
        }
        var10 = (io) (this.field_T.get(-22, (long)this.field_O[param3]));
        var11 = var10;
        var12 = var11;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_y[param1];
        if (var6 == null) {
          return;
        }
        var7 = new mi();
        var7.field_q = var6;
        var7.field_H = var11;
        var7.field_m = param3;
        var7.field_v = var10.field_v[param1];
        var7.field_F = var10.field_k[param1];
        var7.field_D = param1;
        var7.field_u = 1024 + param2 * param2 * (var10.field_s * var10.field_l[param1]) >> 11;
        var7.field_E = 255 & var10.field_x[param1];
        var7.field_t = (param1 << 8) - (32767 & var10.field_r[param1]);
        var7.field_o = 0;
        var7.field_p = 0;
        var7.field_x = -1;
        var7.field_A = 0;
        var7.field_s = 0;
        if (this.field_W[param3] != 0) {
          var7.field_K = aa.b(var6, this.a(1370206316, var7), 0, this.b((byte) -119, var7));
          stackIn_16_1 = !(0 <= var12.field_r[param1]);
          this.a(stackIn_16_1, var7, param0 - 48);
        } else {
          var7.field_K = aa.b(var6, this.a(1370206316, var7), this.a((byte) -110, var7), this.b((byte) -117, var7));
        }
        if (0 > var12.field_r[param1]) {
          var7.field_K.f(-1);
        }
        if (var7.field_F >= 0) {
          var8 = this.field_I[param3][var7.field_F];
          if (var8 != null &&
            var8.field_x < 0) {
            this.field_M[param3][var8.field_D] = null;
            var8.field_x = 0;
          }
          this.field_I[param3][var7.field_F] = var7;
        }
        this.field_Q.field_p.addLast((byte) -119, (IntrusiveNode) (var7));
        this.field_M[param3][param1] = var7;
        return;
    }

    final synchronized void a(int param0, boolean param1, um param2) {
        try {
          this.a(param1, (byte) -113, true, param2);
          if (param0 != 2) {
            this.a(-44);
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ih.S(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_q.f();
        this.field_B = null;
        if (param1 != -128) {
          um var4 = (um) null;
          this.a(-112, true, (um) null);
        }
        this.a(true, param0);
    }

    final synchronized boolean g(int param0) {
        if (param0 != 11899) {
          this.field_C = (int[]) null;
        }
        return this.field_q.g();
    }

    private final void a(int param0, byte param1) {
        mi var4 = null;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3 = -88 / ((param1 - 1) / 57);
        if ((4 & this.field_o[param0]) != 0) {
          var4 = (mi) (this.field_Q.field_p.first((byte) 107));
          while (var4 != null) {
            if (var4.field_m == param0) {
              var4.field_B = 0;
            }
            var4 = (mi) (this.field_Q.field_p.next((byte) 123));
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RgbSprite var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param2 = param2 << 8 | param2;
          var4_int = param2 ^ param2 >> 1;
          if (param0 >= -119) {
            field_R = (String) null;
          }
          for (var7 = 0; var7 < 4; var7++) {
            var6 = -64 + (param3 + (bm.field_y[var7][1] + (param2 & 3)));
            var5 = (var4_int & 7) + (bm.field_y[var7][0] + param1) - 44;
            var8 = tn.field_eb[0 + param2 % 6];
            fe.a(var8, var5, var6);
            var4_int = var4_int >> 1;
            param2 = param2 >> 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var4), "ih.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_C[param1] = param2;
        this.field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 10287) {
          this.a(60, -113, 122, -42);
        }
    }

    private final int b(byte param0, mi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_V[param1.field_m];
          var4 = 78 / ((param0 - 63) / 40);
          if (var3_int >= 8192) {
            stackIn_4_0 = 16384 - ((-var3_int + 16384) * (128 - param1.field_E) + 32 >> 6);
            return stackIn_4_0;
          }
          stackIn_2_0 = 32 + var3_int * param1.field_E >> 6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ih.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 33) {
          this.a(-79, 59, false);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var3Lifetime1;
        if (!param0) {
          return;
        }
        if (!param1) {
          this.b(-1, 0);
        } else {
          this.e(-23024, -1);
        }
        this.d(89, -1);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_O[var3] = this.field_P[var3];
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_D[var5] = rn.a(this.field_P[var5], -128);
          var5++;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 >= -13) {
          this.field_C = (int[]) null;
        }
        this.field_U = param0;
    }

    protected ih() {
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_P = new int[16];
        this.field_M = new mi[16][128];
        this.field_C = new int[16];
        this.field_o = new int[16];
        this.field_x = new int[16];
        this.field_U = 1000000;
        this.field_A = new int[16];
        this.field_v = 256;
        this.field_W = new int[16];
        this.field_O = new int[16];
        this.field_N = new int[16];
        this.field_I = new mi[16][128];
        this.field_s = new int[16];
        this.field_r = new int[16];
        this.field_w = new int[16];
        this.field_D = new int[16];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_q = new dw();
        this.field_Q = new os(this);
        this.field_T = new NodeHashTable(128);
        this.a(256, -1, (byte) -116);
        this.a(true, true);
    }

    ih(ih param0) {
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_P = new int[16];
        this.field_M = new mi[16][128];
        this.field_C = new int[16];
        this.field_o = new int[16];
        this.field_x = new int[16];
        this.field_U = 1000000;
        this.field_A = new int[16];
        this.field_v = 256;
        this.field_W = new int[16];
        this.field_O = new int[16];
        this.field_N = new int[16];
        this.field_I = new mi[16][128];
        this.field_s = new int[16];
        this.field_r = new int[16];
        this.field_w = new int[16];
        this.field_D = new int[16];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_q = new dw();
        this.field_Q = new os(this);
        try {
          this.field_T = param0.field_T;
          this.a(256, -1, (byte) -70);
          this.a(true, true);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ih.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_E = new int[4096];
        field_p = null;
        field_G = new byte[4096];
        for (var0 = 0; var0 < 4096; var0++) {
          field_E[var0] = 1;
          field_G[var0] = (byte)-128;
        }
        field_X = "Offensive account name";
        field_R = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
