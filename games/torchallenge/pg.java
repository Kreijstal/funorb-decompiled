/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends qd {
    static int field_q;
    private kb field_t;
    static boolean field_s;
    sl field_o;
    static nc field_p;
    static int field_m;
    static int[] field_r;
    jk field_u;
    static int[][] field_n;

    final void a(int param0) {
        int var2;
        dl var3;
        int var4;
        boolean stackIn_3_0 = false;
        var4 = TorChallenge.field_F ? 1 : 0;
        this.field_u.a(param0);
        var3 = (dl) (this.field_o.c((byte) -128));
        while (var3 != null) {
          stackIn_3_0 = this.field_t.a(var3, (byte) 22);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_3_0) {
            var2 = param0;
            while (var3.field_z < var2) {
              this.a(var3.field_z, (byte) -45, var3);
              var2 = var2 - var3.field_z;
              if (this.field_t.a(0, (byte) -122, (int[]) null, var2, var3)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var2, (byte) -45, var3);
              var3.field_z = var3.field_z - var2;
            }
          }
          var3 = (dl) (this.field_o.c(-270));
        }
    }

    final static int e(int param0) {
        int var1 = -60 % ((param0 + 80) / 42);
        return vf.field_a;
    }

    final qd b() {
        dl var1;
        while (true) {
          var1 = (dl) (this.field_o.c(-270));
          if (var1 == null) {
            return null;
          }
          if (var1.field_K != null) {
            return (qd) ((Object) var1.field_K);
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        dl var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          this.field_u.b(param0, param1, param2);
          var6 = (dl) (this.field_o.c((byte) 112));
          while (var6 != null) {
            stackIn_4_0 = this.field_t.a(var6, (byte) 22);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_z) {
                this.a(var6, var4_int + var5, var6.field_z, (byte) 106, param0, var4_int);
                var5 = var5 - var6.field_z;
                var4_int = var4_int + var6.field_z;
                if (this.field_t.a(var4_int, (byte) 109, param0, var5, var6)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, var4_int + var5, var5, (byte) 72, param0, var4_int);
                var6.field_z = var6.field_z - var5;
              }
            }
            var6 = (dl) (this.field_o.c(-270));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pg.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        uf var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new uf(param1);
          if (param0 != -1048576) {
            pg.c(38);
          }
          var3 = var9.j(-107);
          var4 = var9.i(29);
          if (var4 >= 0 && (ai.field_c == 0 ||
            !(ai.field_c < var4))) {
            if (var3 == 0) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(param0 ^ -1048518, var13, var4, 0);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.i(92);
            if (var5_int >= 0 && (ai.field_c == 0 ||
              !(ai.field_c < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                nl.a(var12, var5_int, param1, var4, 9);
              } else {
                var7 = jd.field_b;
                synchronized (var7) {
                  jd.field_b.a(var12, (byte) -117, var9);
                }
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("pg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int a() {
        return 0;
    }

    private final void a(int param0, byte param1, dl param2) {
        kb stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_t.field_J[param2.field_G] & 4) != 0 &&
            param2.field_F < 0) {
            var4_int = this.field_t.field_N[param2.field_G] / kh.field_p;
            var5 = (var4_int + 1048575 - param2.field_x) / var4_int;
            param2.field_x = 1048575 & param0 * var4_int + param2.field_x;
            if (var5 <= param0) {
              if (0 == this.field_t.field_y[param2.field_G]) {
                param2.field_K = nc.b(param2.field_k, param2.field_K.e(), param2.field_K.f(), param2.field_K.i());
              } else {
                param2.field_K = nc.b(param2.field_k, param2.field_K.e(), 0, param2.field_K.i());
                stackIn_7_0 = this.field_t;
                stackIn_7_1 = param1 + 301;
                stackIn_8_2 = !(param2.field_q.field_j[param2.field_p] >= 0);
                ((kb) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2, param2);
              }
              if (param2.field_q.field_j[param2.field_p] < 0) {
                param2.field_K.e(-1);
              }
              param0 = param2.field_x / var4_int;
            }
          }
          if (param1 != -45) {
            return;
          }
          param2.field_K.a(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("pg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(dl param0, int param1, int param2, byte param3, int[] param4, int param5) {
        kb stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nc var11 = null;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 != (this.field_t.field_J[param0.field_G] & 4) &&
            param0.field_F < 0) {
            var7_int = this.field_t.field_N[param0.field_G] / kh.field_p;
            while (true) {
              var8 = (var7_int + 1048575 - param0.field_x) / var7_int;
              if (var8 > param2) {
                param0.field_x = param0.field_x + var7_int * param2;
                break;
              }
              param0.field_K.b(param4, param5, var8);
              param2 = param2 - var8;
              param5 = param5 + var8;
              param0.field_x = param0.field_x + (-1048576 + var7_int * var8);
              var9 = kh.field_p / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param0.field_K;
              if (this.field_t.field_y[param0.field_G] == 0) {
                param0.field_K = nc.b(param0.field_k, var11.e(), var11.f(), var11.i());
              } else {
                param0.field_K = nc.b(param0.field_k, var11.e(), 0, var11.i());
                stackIn_11_0 = this.field_t;
                stackIn_11_1 = 256;
                stackIn_12_2 = !(param0.field_q.field_j[param0.field_p] >= 0);
                ((kb) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_12_2, param0);
                param0.field_K.a(var9, var11.f());
              }
              if (param0.field_q.field_j[param0.field_p] < 0) {
                param0.field_K.e(-1);
              }
              var11.g(var9);
              var11.b(param4, param5, param1 - param5);
              if (!var11.l()) {
                continue;
              }
              this.field_u.a(var11);
            }
          }
          if (param3 <= 51) {
            this.c();
          }
          param0.field_K.b(param4, param5, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("pg.L(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    final qd c() {
        dl var1 = (dl) (this.field_o.c((byte) 112));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_K) {
          return (qd) ((Object) var1.field_K);
        }
        return this.b();
    }

    final static boolean d(int param0) {
        int var2 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = 0;
          for (var2 = param0; var2 < ea.field_g.length; var2++) {
            if (null != ea.field_g[var2] &&
              ea.field_g[var2].field_F == 19) {
              var1_int++;
            }
          }
          if (0 != var1_int) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "pg.C(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 16) {
          pg.e(93);
        }
        field_n = (int[][]) null;
        field_r = null;
        field_p = null;
    }

    final static gl a(int param0, String param1, int param2) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        fc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new fc();
          ((gl) ((Object) var3)).field_d = param0;
          if (param2 >= -16) {
            field_m = -121;
          }
          ((gl) ((Object) var3)).field_i = param1;
          stackIn_3_0 = var3;
          return (gl) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("pg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    pg(kb param0) {
        this.field_o = new sl();
        this.field_u = new jk();
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = 0;
        field_s = false;
        field_p = null;
        field_n = new int[][]{new int[]{16, 19}, new int[]{20, 23}, new int[]{24, 27}};
    }
}
