/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends qd {
    private int[] field_z;
    int[] field_y;
    private int[] field_P;
    int[] field_n;
    private int[] field_V;
    static String field_o;
    int[] field_U;
    private int field_E;
    private ka[][] field_r;
    private int[] field_W;
    static NodeDeque field_v;
    private int[] field_S;
    private int[] field_Q;
    private hr field_K;
    private int[] field_m;
    private si field_w;
    private int[] field_p;
    private int[] field_G;
    private ka[][] field_A;
    static String field_u;
    private int[] field_D;
    private int field_t;
    private int[] field_R;
    private int[] field_J;
    static String field_q;
    private int[] field_s;
    private long field_B;
    private int field_x;
    private long field_F;
    private int field_O;
    private boolean field_N;
    private lk field_C;
    private boolean field_L;
    private vm field_I;
    private int field_M;

    private final int b(int param0, ka param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            field_u = (String) null;
          }
          var3_int = this.field_W[param1.field_u];
          if (var3_int < 8192) {
            stackIn_6_0 = 32 + param1.field_t * var3_int >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - ((-param1.field_t + 128) * (-var3_int + 16384) + 32 >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ie.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0, int[] param1, int param2, ka param3, int param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        jm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          param3.field_z = tj.field_q / 100;
          if (0 <= param3.field_x && (null == param3.field_y ||
            param3.field_y.l())) {
            param3.a(param0 ^ -23346);
            param3.unlink((byte) 111);
            if (param3.field_q > 0) {
              if (this.field_r[param3.field_u][param3.field_q] != param3) {
                return true;
              }
              this.field_r[param3.field_u][param3.field_q] = null;
            }
            return true;
          }
          var6_int = param3.field_o;
          if (param0 != 23300) {
            return false;
          }
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_D[param3.field_u]));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param3.field_o = var6_int;
          }
          param3.field_y.c(this.a(-11, param3));
          var7 = param3.field_G;
          param3.field_v = param3.field_v + 1;
          var8 = 0;
          param3.field_i = param3.field_i + var7.field_d;
          var9 = 0.000005086263020833333 * (double)((param3.field_B - 60 << 8) + (param3.field_o * param3.field_r >> 12));
          if (var7.field_j > 0) {
            if (var7.field_k <= 0) {
              param3.field_w = param3.field_w + 128;
            } else {
              param3.field_w = param3.field_w + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
            }
            if (param3.field_w * var7.field_j >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_g) {
            if (var7.field_h > 0) {
              param3.field_s = param3.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_h) * 128.0);
            } else {
              param3.field_s = param3.field_s + 128;
            }
            while (param3.field_A < -2 + var7.field_g.length) {
              if (param3.field_s > (255 & var7.field_g[param3.field_A + 2]) << 8) {
                param3.field_A = param3.field_A + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_g.length == param3.field_A &&
              var7.field_g[param3.field_A + 1] == 0) {
              var8 = 1;
            }
          }
          if (param3.field_x >= 0 &&
            var7.field_c != null &&
            0 == (1 & this.field_n[param3.field_u]) && (!(param3.field_q >= 0) ||
            param3 != this.field_r[param3.field_u][param3.field_q])) {
            if (var7.field_b <= 0) {
              param3.field_x = param3.field_x + 128;
            } else {
              param3.field_x = param3.field_x + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
            }
            while (var7.field_c.length - 2 > param3.field_D) {
              if (param3.field_x > (var7.field_c[2 + param3.field_D] << 8 & 65280)) {
                param3.field_D = param3.field_D + 2;
                continue;
              }
              break;
            }
            if (param3.field_D == -2 + var7.field_c.length) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param3.field_y.a(param3.field_z, this.b(param3, param0 - 29023), this.b(2, param3));
            return false;
          }
          param3.field_y.g(param3.field_z);
          if (param1 != null) {
            param3.field_y.b(param1, param4, param2);
          } else {
            param3.field_y.a(param2);
          }
          if (param3.field_y.k()) {
            this.field_C.field_m.b(param3.field_y);
          }
          param3.a(-94);
          if (param3.field_x >= 0) {
            param3.unlink((byte) 111);
            if (param3.field_q > 0 &&
              param3 == this.field_r[param3.field_u][param3.field_q]) {
              this.field_r[param3.field_u][param3.field_q] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("ie.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        ka var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if ((4 & this.field_n[param0]) != 0) {
          var3 = (ka) (this.field_C.field_v.first(-117));
          while (var3 != null) {
            if (var3.field_u == param0) {
              var3.field_j = 0;
            }
            var3 = (ka) (this.field_C.field_v.next((byte) 116));
          }
        }
        if (param1 != 0) {
          this.field_L = false;
        }
    }

    private final void f(int param0, int param1, int param2) {
        if (param2 != 2) {
          ka var5 = (ka) null;
          this.a((ka) null, 102);
        }
        this.field_V[param0] = param1;
    }

    final synchronized qd d() {
        return null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        fa var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -46) {
            return;
          }
          var4 = (fa) (wp.field_f.first(-33));
          while (var4 != null) {
            hq.a(var4, param0, 49);
            var4 = (fa) (wp.field_f.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "ie.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1) {
        if (param1) {
          return;
        }
        this.field_E = param0;
    }

    private final void a(int param0, int param1) {
        ka var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if ((this.field_n[param1] & 2) != 0) {
          var3 = (ka) (this.field_C.field_v.first(-70));
          while (var3 != null) {
            if (param1 == var3.field_u &&
              this.field_A[param1][var3.field_B] == null &&
              var3.field_x < 0) {
              var3.field_x = 0;
            }
            var3 = (ka) (this.field_C.field_v.next((byte) 116));
          }
        }
        if (param0 != 0) {
          field_v = (NodeDeque) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_R[param1] = param0;
        this.field_p[param1] = ik.a(param2, param0);
        this.a(param2 ^ 203445448, param0, param1);
    }

    final synchronized void a(byte param0) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        int var2 = -47 / ((param0 + 49) / 33);
        pq var3 = (pq) (this.field_w.b(-15519));
        while (var3 != null) {
          var3.c((byte) 81);
          var3 = (pq) (this.field_w.a(true));
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != 23) {
          this.field_z = (int[]) null;
        }
    }

    private final void g(int param0, int param1, int param2) {
        this.field_z[param2] = param0;
        this.field_U[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0 + 0.5);
        if (param1 != 1010) {
          field_o = (String) null;
        }
    }

    final synchronized int b() {
        return 0;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          try {
            if (!tg.field_b.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (var3 < param0.length()) {
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              return false;
            }
            if (param1) {
              var5 = (String) null;
              ie.a((String) null, true);
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("ie.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = BrickABrac.field_J ? 1 : 0;
        var2 = this.field_x;
        var3 = this.field_O;
        var4 = this.field_B;
        if (null != this.field_I &&
          this.field_M == var3) {
          this.a(this.field_L, true, this.field_N, this.field_I);
          this.e(-2);
          return;
        }
        while (true) {
          if (var3 != this.field_O) {
            this.field_x = var2;
            this.field_O = var3;
            if (param0 != -2) {
              field_o = (String) null;
            }
            this.field_B = var4;
            if (null != this.field_I &&
              this.field_M < var3) {
              this.field_x = -1;
              this.field_O = this.field_M;
              this.field_B = this.field_K.c(this.field_O);
            }
            return;
          }
          while (var3 == this.field_K.field_f[var2]) {
            this.field_K.a(var2);
            var6 = this.field_K.e(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.e(-123, var6);
              }
              this.field_K.f(var2);
              this.field_K.b(var2);
              continue;
            }
            this.field_K.b();
            this.field_K.b(var2);
            if (this.field_K.f()) {
              if (this.field_I != null) {
                this.a(this.field_I, 126, this.field_N);
                this.e(param0 ^ 0);
                return;
              }
              if (this.field_N &&
                var3 != 0) {
                this.field_K.a(var4);
              } else {
                this.b(-108, true);
                this.field_K.d();
                return;
              }
            }
            break;
          }
          var2 = this.field_K.a();
          var3 = this.field_K.field_f[var2];
          var4 = this.field_K.c(var3);
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        boolean stackIn_20_1 = false;
        ka stackIn_20_2 = null;
        Object stackIn_21_0;
        boolean stackIn_21_3;
        ka var5;
        int var6_int;
        oe var6;
        ka var7;
        ka var8;
        int var9;
        pq var10;
        pq var11;
        var9 = BrickABrac.field_J ? 1 : 0;
        this.a(115, param2, param0, 64);
        if ((this.field_n[param0] & 2) != 0) {
          var5 = (ka) (this.field_C.field_v.last(0));
          while (var5 != null) {
            if (var5.field_u == param0 &&
              var5.field_x < 0) {
              this.field_A[param0][var5.field_B] = null;
              this.field_A[param0][param2] = var5;
              var6_int = (var5.field_o * var5.field_r >> 12) + var5.field_p;
              var5.field_p = var5.field_p + (-var5.field_B + param2 << 8);
              var5.field_r = -var5.field_p + var6_int;
              var5.field_o = 4096;
              var5.field_B = param2;
              return;
            }
            var5 = (ka) (this.field_C.field_v.previous(-111));
          }
        }
        var10 = (pq) (this.field_w.a(-81, (long)this.field_J[param0]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_t[param2];
        if (var6 == null) {
          return;
        }
        var7 = new ka();
        var7.field_u = param0;
        var7.field_F = var6;
        var7.field_k = var10;
        var7.field_G = var10.field_l[param2];
        var7.field_q = var10.field_i[param2];
        var7.field_B = param2;
        var7.field_m = param3 * param3 * (var10.field_u * var10.field_p[param2]) + 1024 >> 11;
        var7.field_t = 255 & var10.field_r[param2];
        var7.field_p = -(32767 & var10.field_j[param2]) + (param2 << 8);
        var7.field_D = 0;
        var7.field_w = 0;
        if (!param1) {
          this.field_A = (ka[][]) null;
        }
        var7.field_s = 0;
        var7.field_A = 0;
        var7.field_x = -1;
        if (this.field_y[param0] != 0) {
          var7.field_y = kl.a(var6, this.a(-11, var7), 0, this.b(2, var7));
          stackIn_20_1 = false;
          stackIn_20_2 = var7;
          if (var11.field_j[param2] >= 0) {
            stackIn_21_0 = this;
            stackIn_21_3 = false;
          } else {
            stackIn_21_0 = this;
            stackIn_21_3 = true;
          }
          this.a(stackIn_20_1, stackIn_20_2, stackIn_21_3);
        } else {
          var7.field_y = kl.a(var6, this.a(-11, var7), this.b(var7, -5723), this.b(2, var7));
        }
        if (var11.field_j[param2] < 0) {
          var7.field_y.f(-1);
        }
        if (var7.field_q >= 0) {
          var8 = this.field_r[param0][var7.field_q];
          if (var8 != null &&
            var8.field_x < 0) {
            this.field_A[param0][var8.field_B] = null;
            var8.field_x = 0;
          }
          this.field_r[param0][var7.field_q] = var7;
        }
        this.field_C.field_v.addLast(var7, (byte) 3);
        this.field_A[param0][param2] = var7;
        return;
    }

    final synchronized void a(vm param0, int param1, boolean param2) {
        try {
          int var4_int = -17 / ((param1 - 74) / 51);
          this.a(true, true, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ie.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void f(int param0, int param1) {
        int var4;
        int var3;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.f(param0, -100);
          }
          return;
        }
        this.field_s[param0] = 12800;
        this.field_W[param0] = 8192;
        this.field_Q[param0] = 16383;
        this.field_V[param0] = 8192;
        this.field_m[param0] = 0;
        this.field_D[param0] = 8192;
        this.a(0, param0);
        this.c(param0, 0);
        this.field_n[param0] = 0;
        var3 = 30 % ((param1 - 7) / 59);
        this.field_P[param0] = 32767;
        this.field_G[param0] = 256;
        this.field_y[param0] = 0;
        this.g(8192, 1010, param0);
        return;
    }

    final synchronized void b(int param0, int param1) {
        this.field_t = param0;
        if (param1 != -606970073) {
          this.b(-19, -107);
        }
    }

    private final void a(byte param0, int param1) {
        ka var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -86) {
          return;
        }
        var3 = (ka) (this.field_C.field_v.first(-28));
        while (var3 != null) {
          if (param1 < 0 ||
            var3.field_u == param1) {
            if (null != var3.field_y) {
              var3.field_y.g(tj.field_q / 100);
              if (var3.field_y.k()) {
                this.field_C.field_m.b(var3.field_y);
              }
              var3.a(-95);
            }
            if (var3.field_x < 0) {
              this.field_A[var3.field_u][var3.field_B] = null;
            }
            var3.unlink((byte) 111);
          }
          var3 = (ka) (this.field_C.field_v.next((byte) 116));
        }
    }

    final synchronized qd a() {
        return (qd) ((Object) this.field_C);
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != -1427) {
          ka var5 = (ka) null;
          this.a(-16, (int[]) null, -83, (ka) null, 92);
        }
    }

    final boolean a(ka param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_y) {
            var3_int = -48 / ((-62 - param1) / 50);
            return false;
          }
          if (param0.field_x >= 0) {
            param0.unlink((byte) 111);
            if (param0.field_q > 0 &&
              param0 == this.field_r[param0.field_u][param0.field_q]) {
              this.field_r[param0.field_u][param0.field_q] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ie.QA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -203445432) {
          ka var6 = (ka) null;
          this.a(-40, (int[]) null, 15, (ka) null, -126);
        }
        if (param1 != this.field_J[param2]) {
          this.field_J[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_r[param2][var4] = null;
          }
        }
    }

    final void a(boolean param0, ka param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_F.field_m.length;
          if (param2 &&
            param1.field_F.field_j) {
            var6 = var4_int - (-var4_int + param1.field_F.field_n);
            var5 = (int)((long)this.field_y[param1.field_u] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param1.field_y.b(true);
              var5 = var4_int + var4_int + (-1 - var5);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_y[param1.field_u] >> 6);
          }
          param1.field_y.h(var5);
          if (param0) {
            this.field_V = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ie.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8192) {
          return;
        }
        this.field_K.d();
        this.field_I = null;
        this.b(param1 ^ -8246, param0);
    }

    final synchronized boolean a(int param0, vm param1, int param2, mf param3, wp param4) {
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
        se var8 = null;
        int var9 = 0;
        int var11 = 0;
        pq var12 = null;
        pq var13 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          param1.b();
          var6_int = 1;
          var7 = null;
          if (param2 > 0) {
            var7 = new int[]{param2};
          }
          if (param0 > -110) {
            this.f(115, 34, -56);
          }
          var8 = (se) (param1.field_i.b(-15519));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.key;
            var12 = (pq) (this.field_w.a(-70, (long)var9));
            if (var12 == null) {
              var13 = mi.a(param3, var9, 8);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_w.a(34, var13, (long)var9);
                decompiledFrameRemainder0 = !(var13.a(var8.field_i, (byte) -73, param4, (int[]) (var7)));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.a(var8.field_i, (byte) -73, param4, (int[]) (var7)));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (se) (param1.field_i.a(true));
          }
          if (var6_int != 0) {
            param1.a();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ie.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized boolean d(int param0) {
        if (param0 != -1) {
          this.a(-73, true, 50, 118);
        }
        return this.field_K.c();
    }

    private final void b(int param0, boolean param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!param1) {
          this.d(-1, 0);
        } else {
          this.a((byte) -86, -1);
        }
        this.f(-1, 66);
        int var3 = 106 / ((-2 - param0) / 36);
        for (var4 = 0; var4 < 16; var4++) {
          this.field_J[var4] = this.field_R[var4];
        }
        int var6 = 0;
        var3 = var6;
        while (16 > var6) {
          this.field_p[var6] = ik.a(-128, this.field_R[var6]);
          var6++;
        }
    }

    private final void d(int param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 0) {
          this.field_P = (int[]) null;
        }
        ka var3 = (ka) (this.field_C.field_v.first(-36));
        while (var3 != null) {
          if ((0 > param0 || param0 == var3.field_u) &&
            !(var3.field_x >= 0)) {
            this.field_A[var3.field_u][var3.field_B] = null;
            var3.field_x = 0;
          }
          var3 = (ka) (this.field_C.field_v.next((byte) 116));
        }
    }

    private final int b(ka param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jm var9 = null;
        jm var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_S[param0.field_u] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.field_G;
          var10 = var9;
          var4 = 4096 + this.field_Q[param0.field_u] * this.field_s[param0.field_u] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_m * var4 >> 15;
          var4 = this.field_E * var4 + 128 >> 8;
          var4 = 128 + this.field_S[param0.field_u] * var4 >> 8;
          if (var10.field_j > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_j * ((double)param0.field_w * 0.00001953125)) * (double)var4);
          }
          if (param1 != -5723) {
            stackIn_8_0 = -126;
            return stackIn_8_0;
          }
          if (null != var10.field_g) {
            var5 = param0.field_s;
            var6 = var10.field_g[param0.field_A + 1];
            if (param0.field_A < -2 + var10.field_g.length) {
              var7 = var9.field_g[param0.field_A] << 8 & 65280;
              var8 = var10.field_g[param0.field_A + 2] << 8 & 65280;
              var6 = var6 + (-var7 + var5) * (-var6 + var10.field_g[param0.field_A + 3]) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> 6;
          }
          if (param0.field_x > 0 &&
            var10.field_c != null) {
            var5Lifetime1 = param0.field_x;
            var6Lifetime1 = var10.field_c[1 + param0.field_D];
            if (param0.field_D < var10.field_c.length - 2) {
              var7Lifetime1 = (255 & var9.field_c[param0.field_D]) << 8;
              var8Lifetime1 = (255 & var10.field_c[2 + param0.field_D]) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (-var6Lifetime1 + var10.field_c[param0.field_D + 3]) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ie.CA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
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
        var8 = BrickABrac.field_J ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = (32620 & param1) >> 8;
          var6 = param1 >> 16 & 127;
          this.a(-67, var5, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (32595 & param1) >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (var6Lifetime1 > 0) {
            this.a(var4Lifetime1, true, var5Lifetime1, var6Lifetime1);
          } else {
            this.a(-43, var5Lifetime1, var4Lifetime1, 64);
          }
          return;
        }
        if (param0 > -119) {
          this.field_t = -25;
        }
        if (160 == var3) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = 127 & param1 >> 8;
          var6Lifetime2 = param1 >> 16 & 127;
          this.a(var5Lifetime2, var4Lifetime2, (byte) 23, var6Lifetime2);
          return;
        }
        if (176 != var3) {
          if (var3 == 192) {
            var4Lifetime3 = param1 & 15;
            var5Lifetime3 = (param1 & 32532) >> 8;
            this.a(-203445432, var5Lifetime3 + this.field_p[var4Lifetime3], var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param1 & 15;
            var5Lifetime3Lifetime1 = param1 >> 8 & 127;
            this.c(-1427, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param1;
            var5Lifetime3Lifetime2 = (param1 >> 9 & 16256) + (127 & param1 >> 8);
            this.f(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 2);
            return;
          }
          var3 = 255 & param1;
          if (var3 != 255) {
            return;
          }
          this.b(-39, true);
          return;
        }
        var4Lifetime4 = 15 & param1;
        var5Lifetime4 = (32710 & param1) >> 8;
        var6Lifetime3 = (param1 & 8377946) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_p[var4Lifetime4] = ik.a(-2080769, this.field_p[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_p[var4Lifetime4] = ik.a(this.field_p[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.field_m[var4Lifetime4] = (var6Lifetime3 << 7) + ik.a(-16257, this.field_m[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.field_m[var4Lifetime4] = ik.a(-128, this.field_m[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_D[var4Lifetime4] = ik.a(this.field_D[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_D[var4Lifetime4] = var6Lifetime3 + ik.a(this.field_D[var4Lifetime4], -128);
        }
        if (7 == var5Lifetime4) {
          this.field_s[var4Lifetime4] = (var6Lifetime3 << 7) + ik.a(-16257, this.field_s[var4Lifetime4]);
        }
        if (39 == var5Lifetime4) {
          this.field_s[var4Lifetime4] = var6Lifetime3 + ik.a(this.field_s[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 10) {
          this.field_W[var4Lifetime4] = ik.a(this.field_W[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 42) {
          this.field_W[var4Lifetime4] = ik.a(this.field_W[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_Q[var4Lifetime4] = (var6Lifetime3 << 7) + ik.a(this.field_Q[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 43) {
          this.field_Q[var4Lifetime4] = var6Lifetime3 + ik.a(-128, this.field_Q[var4Lifetime4]);
        }
        if (64 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.field_n[var4Lifetime4] = LevelSelectScreen.d(this.field_n[var4Lifetime4], 1);
          } else {
            this.field_n[var4Lifetime4] = ik.a(this.field_n[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.field_n[var4Lifetime4] = LevelSelectScreen.d(this.field_n[var4Lifetime4], 2);
          } else {
            this.a(0, var4Lifetime4);
            this.field_n[var4Lifetime4] = ik.a(this.field_n[var4Lifetime4], -3);
          }
        }
        if (99 == var5Lifetime4) {
          this.field_P[var4Lifetime4] = (var6Lifetime3 << 7) + ik.a(127, this.field_P[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.field_P[var4Lifetime4] = ik.a(16256, this.field_P[var4Lifetime4]) + var6Lifetime3;
        }
        if (101 == var5Lifetime4) {
          this.field_P[var4Lifetime4] = 16384 + ik.a(127, this.field_P[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 100) {
          this.field_P[var4Lifetime4] = ik.a(16256, this.field_P[var4Lifetime4]) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.a((byte) -86, var4Lifetime4);
        }
        if (121 == var5Lifetime4) {
          this.f(var4Lifetime4, 98);
        }
        if (var5Lifetime4 == 123) {
          this.d(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_P[var4Lifetime4];
          if (var7 == 16384) {
            this.field_G[var4Lifetime4] = ik.a(-16257, this.field_G[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_P[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_G[var4Lifetime4] = var6Lifetime3 + ik.a(this.field_G[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_y[var4Lifetime4] = ik.a(this.field_y[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_y[var4Lifetime4] = var6Lifetime3 + ik.a(-128, this.field_y[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.field_n[var4Lifetime4] = LevelSelectScreen.d(this.field_n[var4Lifetime4], 4);
          } else {
            this.c(var4Lifetime4, 0);
            this.field_n[var4Lifetime4] = ik.a(this.field_n[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.g((-16257 & this.field_z[var4Lifetime4]) + (var6Lifetime3 << 7), 1010, var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.g(var6Lifetime3 + (this.field_z[var4Lifetime4] & -128), 1010, var4Lifetime4);
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.d(param2, param1, -128);
        if (param0 != 0) {
          this.field_s = (int[]) null;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_K.c()) {
            var4_int = this.field_K.field_d * this.field_t / tj.field_q;
            while (true) {
              var5 = this.field_F + (long)var4_int * (long)param2;
              if (-var5 + this.field_B >= 0L) {
                this.field_F = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.field_F + this.field_B) - 1L) / (long)var4_int);
              this.field_F = this.field_F + (long)var4_int * (long)var7;
              this.field_C.b(param0, param1, var7);
              param2 = param2 - var7;
              this.e(-2);
              param1 = param1 + var7;
              if (this.field_K.c()) {
                continue;
              }
              this.field_C.b(param0, param1, param2);
              return;
            }
          }
          this.field_C.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ie.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, vm param1, int param2, boolean param3, int param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.field_K.c()) {
          this.a(param1, -61, param3);
          return;
        }
        try {
          this.field_N = param3 ? true : false;
          this.field_L = param5 ? true : false;
          this.field_I = param1;
          var7_int = this.field_K.b(this.field_F) * param0;
          var8 = param2 * this.field_K.field_d;
          var7_int = var8 * ((param4 + var8 + var7_int) / var8);
          this.field_M = (var7_int + (param0 >> 1)) / param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ie.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -1) {
          String var2 = (String) null;
          ie.a((String) null, false);
        }
        field_u = null;
        field_q = null;
        field_v = null;
        field_o = null;
    }

    final synchronized void f(int param0) {
        this.a(true, param0 ^ -16582);
        if (param0 != -24774) {
          this.field_y = (int[]) null;
        }
    }

    private final int a(int param0, ka param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        jm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_p + (param1.field_r * param1.field_o >> 12);
          var3_int = var3_int + (this.field_G[param1.field_u] * (-8192 + this.field_V[param1.field_u]) >> 12);
          var4 = param1.field_G;
          if (0 < var4.field_d && (!(var4.field_a <= 0) ||
            this.field_m[param1.field_u] > 0)) {
            var5 = var4.field_a << 2;
            var6 = var4.field_e << 1;
            if (param1.field_v < var6) {
              var5 = var5 * param1.field_v / var6;
            }
            var5 = var5 + (this.field_m[param1.field_u] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_i & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          if (param0 != -11) {
            this.field_N = true;
          }
          var5Lifetime1 = (int)((double)(param1.field_F.field_l * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)tj.field_q + 0.5);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ie.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final synchronized void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (0 > param1) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_S[var4] = param0;
          }
        } else {
          this.field_S[param1] = param0;
        }
        if (param2 != 16) {
          this.c(-83, 39, -63);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ka var7 = null;
        int var8 = BrickABrac.field_J ? 1 : 0;
        ka var9 = this.field_A[param2][param1];
        int var6 = -89 / ((param0 - 16) / 58);
        if (var9 == null) {
          return;
        }
        this.field_A[param2][param1] = null;
        if ((this.field_n[param2] & 2) == 0) {
          var9.field_x = 0;
        } else {
          var7 = (ka) (this.field_C.field_v.first(-26));
          while (var7 != null) {
            if (var9.field_u == var7.field_u && var7.field_x < 0 &&
              var7 != var9) {
              var9.field_x = 0;
              break;
            }
            var7 = (ka) (this.field_C.field_v.next((byte) 116));
          }
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (this.field_K.c()) {
          var2 = this.field_K.field_d * this.field_t / tj.field_q;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_F;
            if (-var3 + this.field_B >= 0L) {
              this.field_F = var3;
              break;
            }
            var5 = (int)((-1L + (-this.field_F + this.field_B) + (long)var2) / (long)var2);
            this.field_F = this.field_F + (long)var5 * (long)var2;
            this.field_C.a(var5);
            param0 = param0 - var5;
            this.e(-2);
            if (!this.field_K.c()) {
              break;
            }
          }
        }
        this.field_C.a(param0);
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, vm param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
          this.a(param0, 8192);
          this.field_K.a(param3.field_j);
          this.field_F = 0L;
          this.field_N = param2 ? true : false;
          var5_int = this.field_K.e();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_K.a(var6);
            this.field_K.f(var6);
            this.field_K.b(var6);
          }
          if (!param1) {
            field_u = (String) null;
          }
          this.field_x = this.field_K.a();
          this.field_O = this.field_K.field_f[this.field_x];
          this.field_B = this.field_K.c(this.field_O);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ie.W(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, RgbSprite[] param1, RgbSprite[] param2, int param3, RgbSprite[] param4, int param5, int param6, dh param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        int var16 = 0;
        try {
          if (param10 < 87) {
            field_q = (String) null;
          }
          var15_int = param7.field_P + param7.field_B;
          var16 = param7.field_B;
          ja.a(param12, param9, var15_int, param3, param7, param13, var15_int, -111, param5, var16, param1, param7, param8, 480, param0, param6, var16, param11, param14, param2, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("ie.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(')').toString());
        }
    }

    public ie() {
        this.field_n = new int[16];
        this.field_S = new int[16];
        this.field_m = new int[16];
        this.field_V = new int[16];
        this.field_G = new int[16];
        this.field_W = new int[16];
        this.field_p = new int[16];
        this.field_y = new int[16];
        this.field_A = new ka[16][128];
        this.field_z = new int[16];
        this.field_P = new int[16];
        this.field_D = new int[16];
        this.field_U = new int[16];
        this.field_E = 256;
        this.field_t = 1000000;
        this.field_Q = new int[16];
        this.field_r = new ka[16][128];
        this.field_R = new int[16];
        this.field_J = new int[16];
        this.field_s = new int[16];
        this.field_K = new hr();
        this.field_C = new lk(this);
        this.field_w = new si(128);
        this.e(256, -1, 16);
        this.b(-38, true);
    }

    static {
        field_o = "Creating your account";
        field_v = new NodeDeque();
        field_u = "Tips";
        field_q = "Create your own free Jagex account";
    }
}
