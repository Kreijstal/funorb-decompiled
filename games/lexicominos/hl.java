/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lk {
    private int[] field_E;
    private ek field_n;
    int[] field_O;
    private int field_H;
    int[] field_u;
    private int[] field_C;
    private int[] field_v;
    private int[] field_l;
    static String field_p;
    private int[] field_J;
    private int[] field_M;
    private int[] field_T;
    private int[] field_x;
    static boolean field_F;
    private na field_A;
    private cb[][] field_R;
    private int field_K;
    private int[] field_r;
    private cb[][] field_L;
    static int field_B;
    private int[] field_S;
    private int[] field_G;
    static int[] field_N;
    private int[] field_w;
    int[] field_q;
    static byte[][] field_o;
    private int[] field_t;
    private long field_P;
    private kj field_y;
    private int field_z;
    private boolean field_D;
    private int field_m;
    private long field_U;
    private boolean field_I;
    private int field_Q;
    private ih field_s;

    private final void a(int param0, byte param1, int param2) {
        this.field_G[param2] = param0;
        this.field_t[param2] = vg.a(param0, -128);
        if (param1 <= 30) {
          return;
        }
        this.a(param2, 2, param0);
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_M[param2] = param1;
        if (param0) {
          return;
        }
        this.field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
    }

    final boolean b(cb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_J = (int[]) null;
          }
          if (param0.field_C != null) {
            return false;
          }
          if (param0.field_h < 0) {
            return true;
          }
          param0.b((byte) -128);
          if (param0.field_u > 0 &&
            this.field_L[param0.field_z][param0.field_u] == param0) {
            this.field_L[param0.field_z][param0.field_u] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hl.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void b(int param0, int param1) {
        this.field_K = param1;
        if (param0 != -180) {
          this.a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_o = (byte[][]) null;
        if (!param0) {
          hl.d(-92);
        }
        field_N = null;
    }

    final static boolean a(boolean param0, th param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            hl.f(53, 103);
          }
          stackIn_5_0 = (param1.g(1, 26527) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("hl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 <= 39) {
          this.field_I = false;
        }
        var3 = (cb) (this.field_y.field_n.a(true));
        while (var3 != null) {
          if (var4 == 0) {
            if (param1 < 0 ||
              var3.field_z == param1) {
              if (null != var3.field_C) {
                var3.field_C.h(b.field_r / 100);
                if (var3.field_C.h()) {
                  this.field_y.field_m.a(var3.field_C);
                }
                var3.c(0);
              }
              if (var3.field_h < 0) {
                this.field_R[var3.field_z][var3.field_q] = null;
              }
              var3.b((byte) -116);
            }
            var3 = (cb) (this.field_y.field_n.f(2));
            continue;
          }
          break;
        }
    }

    final synchronized boolean a(int param0, ih param1, byte param2, ja param3, sh param4) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        cj var8 = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          param1.b();
          var6_int = 1;
          if (param2 != 102) {
            return false;
          }
          var7 = null;
          if (0 < param0) {
            var7 = new int[]{param0};
          }
          var8 = (cj) (param1.field_i.c((byte) -111));
          L2: while (true) {
            if (var8 != null) {
              var9 = (int)var8.field_d;
              var10 = (wj) (this.field_A.a((long)var9, (byte) 120));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var10 == null) {
                  var10 = ug.a(param4, var9, true);
                  if (var10 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_A.a(var10, (byte) -48, (long)var9);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!var10.a(var8.field_h, param3, (byte) 116, (int[]) (var7)))) {
                  var6_int = 0;
                }
                var8 = (cj) (param1.field_i.a((byte) -91));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break L2;
              }
            }
            param1.a();
            break;
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("hl.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(byte param0, cb param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.field_w.field_i.length;
          if (param0 != 92) {
            this.field_v = (int[]) null;
          }
          boolean decompiledSharedTail0 = (!(param2) ||
            !(param1.field_w.field_l));
          if (!decompiledSharedTail0) {
            var6 = -param1.field_w.field_k + var4_int + var4_int;
            var5 = (int)((long)var6 * (long)this.field_u[param1.field_z] >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param1.field_C.c(true);
              var5 = var4_int + (var4_int - (1 + var5));
            }
            decompiledSharedTail0 = (Lexicominos.field_L);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.field_u[param1.field_z] >> 6);
          }
          param1.field_C.b(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_n.g();
        this.field_s = null;
        this.a(param0, (byte) -87);
        if (param1 != 43) {
          this.a(-117);
        }
    }

    final synchronized void d(boolean param0) {
        if (param0) {
          field_B = -22;
        }
        this.a(true, 43);
    }

    private final void g(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var5Lifetime1Lifetime3;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var4Lifetime1Lifetime2Lifetime1;
        int var4Lifetime1Lifetime2Lifetime2;
        int var5Lifetime1Lifetime2Lifetime1;
        int var5Lifetime1Lifetime2Lifetime2;
        var8 = Lexicominos.field_L ? 1 : 0;
        var3 = 240 & param1;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = param1 >> 8 & 127;
          var6 = (8341718 & param1) >> 16;
          this.a(var6, var5, var4, 0);
          return;
        }
        L0: {
          if (var3 == 144) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = (32699 & param1) >> 8;
            var6Lifetime1 = (param1 & 8384220) >> 16;
            if (var6Lifetime1 <= 0) {
              this.a(64, var5Lifetime1, var4Lifetime1, 0);
              if (var8 == 0) {
                break L0;
              }
            }
            this.a(var4Lifetime1, var6Lifetime1, (byte) -111, var5Lifetime1);
            return;
          }
          if (var3 == 160) {
            var4Lifetime1Lifetime1 = 15 & param1;
            var5Lifetime1Lifetime1 = 127 & param1 >> 8;
            var6Lifetime1Lifetime1 = 127 & param1 >> 16;
            this.a((byte) -103, var6Lifetime1Lifetime1, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1);
            return;
          }
          if (param0 > -21) {
            this.field_n = (ek) null;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1Lifetime2 = 15 & param1;
              var5Lifetime1Lifetime2 = 127 & param1 >> 8;
              this.a(var4Lifetime1Lifetime2, 2, var5Lifetime1Lifetime2 + this.field_t[var4Lifetime1Lifetime2]);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1Lifetime2Lifetime1 = 15 & param1;
              var5Lifetime1Lifetime2Lifetime1 = 127 & param1 >> 8;
              this.c(120, var4Lifetime1Lifetime2Lifetime1, var5Lifetime1Lifetime2Lifetime1);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1Lifetime2Lifetime2 = 15 & param1;
              var5Lifetime1Lifetime2Lifetime2 = (param1 >> 9 & 16256) + ((32570 & param1) >> 8);
              this.b(var5Lifetime1Lifetime2Lifetime2, -16257, var4Lifetime1Lifetime2Lifetime2);
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.a(true, (byte) -87);
            return;
          }
          var4Lifetime1Lifetime3 = 15 & param1;
          var5Lifetime1Lifetime3 = param1 >> 8 & 127;
          var6Lifetime1Lifetime2 = (8388315 & param1) >> 16;
          if (0 == var5Lifetime1Lifetime3) {
            this.field_t[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 14) + vg.a(this.field_t[var4Lifetime1Lifetime3], -2080769);
          }
          if (32 == var5Lifetime1Lifetime3) {
            this.field_t[var4Lifetime1Lifetime3] = vg.a(-16257, this.field_t[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 1) {
            this.field_x[var4Lifetime1Lifetime3] = vg.a(-16257, this.field_x[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 33) {
            this.field_x[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + vg.a(-128, this.field_x[var4Lifetime1Lifetime3]);
          }
          if (5 == var5Lifetime1Lifetime3) {
            this.field_S[var4Lifetime1Lifetime3] = vg.a(this.field_S[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 37) {
            this.field_S[var4Lifetime1Lifetime3] = vg.a(this.field_S[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
          }
          if (7 == var5Lifetime1Lifetime3) {
            this.field_J[var4Lifetime1Lifetime3] = vg.a(-16257, this.field_J[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (39 == var5Lifetime1Lifetime3) {
            this.field_J[var4Lifetime1Lifetime3] = vg.a(this.field_J[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
          }
          if (var5Lifetime1Lifetime3 == 10) {
            this.field_C[var4Lifetime1Lifetime3] = vg.a(this.field_C[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 42) {
            this.field_C[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + vg.a(-128, this.field_C[var4Lifetime1Lifetime3]);
          }
          if (11 == var5Lifetime1Lifetime3) {
            this.field_l[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + vg.a(-16257, this.field_l[var4Lifetime1Lifetime3]);
          }
          if (43 == var5Lifetime1Lifetime3) {
            this.field_l[var4Lifetime1Lifetime3] = vg.a(-128, this.field_l[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
          }
          switch (var5Lifetime1Lifetime3) {
            case 64:
              if (var6Lifetime1Lifetime2 >= 64) {
                this.field_q[var4Lifetime1Lifetime3] = tb.a(this.field_q[var4Lifetime1Lifetime3], 1);
                if (var8 != 0) {
                  this.field_q[var4Lifetime1Lifetime3] = vg.a(this.field_q[var4Lifetime1Lifetime3], -2);
                }
              } else {
                this.field_q[var4Lifetime1Lifetime3] = vg.a(this.field_q[var4Lifetime1Lifetime3], -2);
              }
              break;
            case 65:
              if (64 > var6Lifetime1Lifetime2) {
                this.a(var4Lifetime1Lifetime3, 16384);
                this.field_q[var4Lifetime1Lifetime3] = vg.a(this.field_q[var4Lifetime1Lifetime3], -3);
                if (var8 != 0) {
                  this.field_q[var4Lifetime1Lifetime3] = tb.a(this.field_q[var4Lifetime1Lifetime3], 2);
                }
              } else {
                this.field_q[var4Lifetime1Lifetime3] = tb.a(this.field_q[var4Lifetime1Lifetime3], 2);
              }
              break;
            case 99:
              this.field_v[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + vg.a(127, this.field_v[var4Lifetime1Lifetime3]);
              break;
            case 98:
              this.field_v[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + vg.a(16256, this.field_v[var4Lifetime1Lifetime3]);
              break;
            case 101:
              this.field_v[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + vg.a(this.field_v[var4Lifetime1Lifetime3], 127) + 16384;
              break;
            case 100:
              this.field_v[var4Lifetime1Lifetime3] = vg.a(16256, this.field_v[var4Lifetime1Lifetime3]) + 16384 + var6Lifetime1Lifetime2;
              break;
            case 120:
              this.e(99, var4Lifetime1Lifetime3);
              break;
            case 121:
              this.h(var4Lifetime1Lifetime3, 16645);
              break;
            case 123:
              this.d(112, var4Lifetime1Lifetime3);
              break;
            case 6:
              var7 = this.field_v[var4Lifetime1Lifetime3];
              if (var7 == 16384) {
                this.field_r[var4Lifetime1Lifetime3] = vg.a(this.field_r[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
              }
              break;
            case 38:
              var7Lifetime1 = this.field_v[var4Lifetime1Lifetime3];
              if (16384 == var7Lifetime1) {
                this.field_r[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + vg.a(this.field_r[var4Lifetime1Lifetime3], -128);
              }
              break;
            case 16:
              this.field_u[var4Lifetime1Lifetime3] = vg.a(-16257, this.field_u[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
              break;
            case 48:
              this.field_u[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + vg.a(this.field_u[var4Lifetime1Lifetime3], -128);
              break;
            case 81:
              if (var6Lifetime1Lifetime2 >= 64) {
                this.field_q[var4Lifetime1Lifetime3] = tb.a(this.field_q[var4Lifetime1Lifetime3], 4);
                if (var8 != 0) {
                  this.c(-785046068, var4Lifetime1Lifetime3);
                  this.field_q[var4Lifetime1Lifetime3] = vg.a(this.field_q[var4Lifetime1Lifetime3], -5);
                }
              } else {
                this.c(-785046068, var4Lifetime1Lifetime3);
                this.field_q[var4Lifetime1Lifetime3] = vg.a(this.field_q[var4Lifetime1Lifetime3], -5);
              }
              break;
            case 17:
              this.a(false, (var6Lifetime1Lifetime2 << 7) + (-16257 & this.field_M[var4Lifetime1Lifetime3]), var4Lifetime1Lifetime3);
              break;
            case 49:
              this.a(false, (this.field_M[var4Lifetime1Lifetime3] & -128) + var6Lifetime1Lifetime2, var4Lifetime1Lifetime3);
              return;
            default:
              break;
          }
        }
    }

    final synchronized lk b() {
        return null;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -32) {
          return false;
        }
        return this.field_n.d();
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 120) {
          this.field_y = (kj) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var6 = null;
        int var7 = 0;
        cb var8 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        if (param3 != 0) {
          this.field_q = (int[]) null;
        }
        var8 = this.field_R[param2][param1];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_R[param2][param1] = null;
        if ((2 & this.field_q[param2]) == 0) {
          var8.field_h = 0;
          decompiledFrameRemainder0 = (var7 != 0);
        }
        if (decompiledFrameRemainder0) {
          var6 = (cb) (this.field_y.field_n.a(true));
          while (var6 != null) {
            if (var7 != 0) {
              break;
            }
            if (~var8.field_z == ~var6.field_z &&
              0 > var6.field_h &&
              var6 != var8) {
              var8.field_h = 0;
            } else {
              var6 = (cb) (this.field_y.field_n.f(param3 ^ 2));
              continue;
            }
            break;
          }
        }

    }

    private final int a(cb param0, int param1) {
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
          var3_int = this.field_C[param0.field_z];
          var4 = -57 / ((param1 - 21) / 32);
          if (var3_int >= 8192) {
            stackIn_4_0 = -(32 + (-param0.field_k + 128) * (-var3_int + 16384) >> 6) + 16384;
            return stackIn_4_0;
          }
          stackIn_2_0 = 32 + param0.field_k * var3_int >> 6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hl.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(int param0, int param1) {
        int var3 = 0;
        wa var4 = null;
        mc var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = (wa) (ki.field_b.a(true));
          do {
            if (var4 == null) {
              if (param1 != -2212) {
                return;
              }
              break;
            }
            na.a((byte) -126, var4, param0);
            var4 = (wa) (ki.field_b.f(2));
          } while (var3 == 0);
          var5 = (mc) (vh.field_a.a(true));
          while (var5 != null) {
            fj.a(param0, var5, false);
            var5 = (mc) (vh.field_a.f(param1 ^ -2210));
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "hl.K(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 0) {
          var4 = 0;
          while (var4 < 16) {
            this.field_w[var4] = param1;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5 != 0)) {
            this.field_w[param0] = param1;
          }
        } else {
          this.field_w[param0] = param1;
        }
        if (param2) {
          this.field_u = (int[]) null;
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          this.a(param2, 43);
          this.field_n.a(param0.field_h);
          if (param3 != -5953) {
            this.field_t = (int[]) null;
          }
          stackIn_6_1 = (param1);
          this.field_D = stackIn_6_1;
          this.field_P = 0L;
          var5_int = this.field_n.e();
          var6 = 0;
          while (var5_int > var6) {
            this.field_n.c(var6);
            this.field_n.a(var6);
            this.field_n.b(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_z = this.field_n.a();
          this.field_m = this.field_n.field_a[this.field_z];
          this.field_U = this.field_n.d(this.field_m);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("hl.P(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void d(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        sj var4 = null;
        int var5 = 0;
        nc var6_ref_nc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        th var27 = null;
        th var28 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != 0) {
            return;
          }
          var27 = ig.field_a;
          var28 = var27;
          var2 = var28.d(true);
          if (var2 != 0) {
            if (var2 != 1) {
              uj.a("HS1: " + qj.h(param0 - 117), (Throwable) null, 1);
              ck.$cfr$intArgs$b$e683eeaaf5b5(-70);
              if (var26 == 0) {
                return;
              }
            }
            var3 = var28.b(-1698573656);
            var4_long = var28.f((byte) -102);
            var6_ref_nc = (nc) (ok.field_b.a(true));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var6_ref_nc != null) {
                stackIn_14_0 = ~var3;
                decompiledFrameRemainder0 = (var26 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_14_0 != ~var6_ref_nc.field_j)) {
                  var6_ref_nc = (nc) (ok.field_b.f(param0 + 2));
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var6_ref_nc != null) {
                  var6_ref_nc.field_h = var4_long;
                  var6_ref_nc.b((byte) -118);
                  if (var26 == 0) {
                    return;
                  }
                  break;
                }
                stackIn_14_0 = -95;
              }
              ck.$cfr$intArgs$b$e683eeaaf5b5(stackIn_14_0);
              return;
            }
          }
          var3Lifetime1 = var28.b(param0 - 1698573656);
          var4 = (sj) (il.field_b.a(true));
          L7: while (true) {
            if (var4 != null) {
              stackIn_27_0 = ~var3Lifetime1;
              if (var26 != 0) {
                break L7;
              }
              if (stackIn_27_0 != ~var4.field_h ||
                var26 != 0) {
                var4 = (sj) (il.field_b.f(param0 + 2));
                continue;
              }
            }
            if (var4 != null) {
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var5 = var28.d(true);
              if (var5 != 0) {
                var6 = var4.field_o;
                var7 = var4.field_m;
                f.field_l[0].field_b = false;
                f.field_l[0].field_f = null;
                f.field_l[0].field_d = og.field_c;
                var8_int = 1;
                while (var5 > var8_int) {
                  f.field_l[var8_int].field_d = var27.c(false);
                  f.field_l[var8_int].field_b = false;
                  if (var26 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (var28.d(true) == 1) {
                    f.field_l[var8_int].field_f = var28.c(false);
                  } else {
                    f.field_l[var8_int].field_f = null;
                  }
                  var8_int++;
                }
                if (decompiledFrameCompleted1) {
                  dupTemp$0 = new String[3][var6];
                  var4.field_j = dupTemp$0;
                  var8 = dupTemp$0;
                  var9 = new String[3][var6];
                  dupTemp$1 = new long[3][var6];
                  var4.field_i = dupTemp$1;
                  var10 = dupTemp$1;
                  dupTemp$2 = new int[3][var7 * var6];
                  var4.field_n = dupTemp$2;
                  var11 = dupTemp$2;
                  var12 = 0;
                  var13 = 0;
                  var14 = 0;
                  var15 = 0;
                  var16 = 0;
                  var17 = 0;
                  var18 = var28.d(true);
                  if (var18 > 0) {
                    var19 = 0;
                    while (var19 < var18) {
                      var20 = var27.d(true);
                      var21 = f.field_l[var20].field_d;
                      var22 = var28.f((byte) -86);
                      var24 = var28.field_h;
                      if (var26 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (var19 < var6) {
                        var8[0][var12] = var21;
                        var9[0][var12] = f.field_l[var20].field_f;
                        var10[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        while (var7 > var25) {
                          incrementValue$3 = var15;
                          var15++;
                          var11[0][incrementValue$3] = var27.d((byte) 19);
                          var25++;
                        }
                      }
                      if (var21 != null &&
                        md.a(var21, -105)) {
                        var8[1][var13] = og.field_c;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var13++;
                        var28.field_h = var24;
                        var25Lifetime1 = 0;
                        while (var25Lifetime1 < var7) {
                          incrementValue$4 = var16;
                          var16++;
                          var11[1][incrementValue$4] = var27.d((byte) 19);
                          var25Lifetime1++;
                        }
                      }
                      if (var14 < var6 &&
                        !f.field_l[var20].field_b) {
                        f.field_l[var20].field_b = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = f.field_l[var20].field_f;
                        var10[2][var14] = var22;
                        var28.field_h = var24;
                        var14++;
                        var25Lifetime2 = 0;
                        while (var25Lifetime2 < var7) {
                          incrementValue$5 = var17;
                          var17++;
                          var11[2][incrementValue$5] = var27.d((byte) 19);
                          var25Lifetime2++;
                        }
                      }
                      var19++;
                    }
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var4.field_k = true;
              }
              var4.b((byte) -117);
              return;
            }
            stackIn_27_0 = -32;
            break;
          }
          ck.$cfr$intArgs$b$e683eeaaf5b5(stackIn_27_0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "hl.O(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          this.d(-33, -1);
        }
        if (param0 ||
          var4 != 0) {
          this.e(71, -1);
        }
        this.h(-1, 16645);
        if (param1 != -87) {
          return;
        }
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.field_E[var3] = this.field_G[var3];
          var3++;
        } while (var4 == 0);
        while (16 > var3) {
          this.field_t[var3] = vg.a(this.field_G[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    private final void d(int param0, int param1) {
        cb var3;
        int var4;
        int var5;
        int stackIn_11_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = (cb) (this.field_y.field_n.a(true));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_11_0 = param1;
          if (var5 == 0) {
            if ((stackIn_11_0 < 0 ||
              var3.field_z == param1) &&
              0 > var3.field_h) {
              this.field_R[var3.field_z][var3.field_q] = null;
              var3.field_h = 0;
            }
            var3 = (cb) (this.field_y.field_n.f(2));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = -29 % ((param0 - 60) / 51);
        }
        var4 = stackIn_11_0;
        return;
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -83) {
          this.field_S = (int[]) null;
        }
    }

    final boolean a(int[] param0, int param1, cb param2, int param3, int param4) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          param2.field_m = b.field_r / 100;
          if (param2.field_h >= 0 && (param2.field_C == null ||
            param2.field_C.f())) {
            param2.c(0);
            param2.b((byte) -123);
            if (param2.field_u > 0 &&
              this.field_L[param2.field_z][param2.field_u] == param2) {
              this.field_L[param2.field_z][param2.field_u] = null;
              return true;
            }
            return true;
          }
          var6_int = param2.field_v;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_S[param2.field_z] * 0.0004921259842519685) * 16.0);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param2.field_v = var6_int;
          }
          param2.field_C.g(this.a((byte) -120, param2));
          var7 = param2.field_r;
          param2.field_x = param2.field_x + 1;
          if (param4 < 54) {
            return true;
          }
          param2.field_i = param2.field_i + var7.field_d;
          var8 = 0;
          var9 = (double)((param2.field_l * param2.field_v >> 12) + (-60 + param2.field_q << 8)) * 0.000005086263020833333;
          if (var7.field_e > 0) {
            if (0 < var7.field_b) {
              param2.field_j = param2.field_j + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
              if (var11 != 0) {
                param2.field_j = param2.field_j + 128;
              }
            } else {
              param2.field_j = param2.field_j + 128;
            }
            if (var7.field_e * param2.field_j >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_c) {
            if (0 < var7.field_j) {
              param2.field_F = param2.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_j));
              if (var11 != 0) {
                param2.field_F = param2.field_F + 128;
              }
            } else {
              param2.field_F = param2.field_F + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var7.field_c.length - 2 > param2.field_B) {
                stackIn_37_0 = param2.field_F;
                stackIn_37_1 = var7.field_c[param2.field_B + 2] << 8 & 65280;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_37_0 > stackIn_37_1)) {
                  param2.field_B = param2.field_B + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_37_0 = ~param2.field_B;
                stackIn_37_1 = ~(-2 + var7.field_c.length);
              }
              if (stackIn_37_0 != stackIn_37_1) {
                break;
              }
              if (0 != var7.field_c[param2.field_B + 1]) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param2.field_h >= 0 &&
            var7.field_g != null &&
            (1 & this.field_q[param2.field_z]) == 0 && (!(param2.field_u >= 0) ||
            param2 != this.field_L[param2.field_z][param2.field_u])) {
            if (var7.field_l > 0) {
              param2.field_h = param2.field_h + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
              if (var11 != 0) {
                param2.field_h = param2.field_h + 128;
              }
            } else {
              param2.field_h = param2.field_h + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if ((var7.field_g.length - 2) > param2.field_y) {
                stackIn_56_0 = (var7.field_g[param2.field_y + 2] & 255) << 8;
                stackIn_56_1 = param2.field_h;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_56_0 < stackIn_56_1)) {
                  param2.field_y = param2.field_y + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_56_0 = var7.field_g.length - 2;
                stackIn_56_1 = param2.field_y;
              }
              if (stackIn_56_0 != stackIn_56_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param2.field_C.a(param2.field_m, this.c(param2, 1554), this.a(param2, 87));
            return false;
          }
          param2.field_C.h(param2.field_m);
          if (param0 != null) {
            param2.field_C.b(param0, param1, param3);
            if (var11 != 0) {
              param2.field_C.a(param3);
            }
          } else {
            param2.field_C.a(param3);
          }
          if (param2.field_C.h()) {
            this.field_y.field_m.a(param2.field_C);
          }
          param2.c(0);
          if (param2.field_h >= 0) {
            param2.b((byte) -118);
            if (param2.field_u > 0 &&
              this.field_L[param2.field_z][param2.field_u] == param2) {
              this.field_L[param2.field_z][param2.field_u] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("hl.C(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int c(cb param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rc var9 = null;
        rc var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_w[param0.field_z] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.field_r;
          var10 = var9;
          var4 = 4096 + this.field_J[param0.field_z] * this.field_l[param0.field_z] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = var4 * param0.field_s + 16384 >> 15;
          var4 = this.field_H * var4 + 128 >> 8;
          var4 = var4 * this.field_w[param0.field_z] + 128 >> 8;
          if (var10.field_e > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
          }
          if (param1 != 1554) {
            this.a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
          }
          if (var10.field_c != null) {
            var5 = param0.field_F;
            var6 = var10.field_c[1 + param0.field_B];
            if (-2 + var10.field_c.length > param0.field_B) {
              var7 = var9.field_c[param0.field_B] << 8 & 65280;
              var8 = (var10.field_c[2 + param0.field_B] & 255) << 8;
              var6 = var6 + (-var7 + var5) * (-var6 + var10.field_c[3 + param0.field_B]) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (param0.field_h > 0 &&
            var10.field_g != null) {
            var5Lifetime1 = param0.field_h;
            var6Lifetime1 = var10.field_g[1 + param0.field_y];
            if (param0.field_y < (-2 + var10.field_g.length)) {
              var7Lifetime1 = var9.field_g[param0.field_y] << 8 & 65280;
              var8Lifetime1 = (255 & var10.field_g[2 + param0.field_y]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_g[param0.field_y + 3]) * (var5Lifetime1 - var7Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("hl.AA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -785046068) {
          return;
        }
        if (0 != (4 & this.field_q[param1])) {
          var3 = (cb) (this.field_y.field_n.a(true));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~var3.field_z == ~param1) {
              var3.field_E = 0;
            }
            var3 = (cb) (this.field_y.field_n.f(2));
          }
        }
    }

    private final void a(int param0, int param1) {
        cb var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 16384) {
          return;
        }
        if ((this.field_q[param0] & 2) != 0) {
          var3 = (cb) (this.field_y.field_n.a(true));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (var3.field_z == param0 &&
              this.field_R[param0][var3.field_q] == null &&
              var3.field_h < 0) {
              var3.field_h = 0;
            }
            var3 = (cb) (this.field_y.field_n.f(param1 - 16382));
          }
        }
    }

    final synchronized lk d() {
        return (lk) ((Object) this.field_y);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_n.d()) {
            var4_int = this.field_n.field_e * this.field_K / b.field_r;
            while (true) {
              var5 = this.field_P + (long)param2 * (long)var4_int;
              if (this.field_U - var5 >= 0L) {
                this.field_P = var5;
                if (var8 != 0) {
                  return;
                }
                break;
              }
              var7 = (int)((this.field_U - this.field_P - (-(long)var4_int + 1L)) / (long)var4_int);
              this.field_P = this.field_P + (long)var4_int * (long)var7;
              this.field_y.b(param0, param1, var7);
              param1 = param1 + var7;
              this.b(-11);
              param2 = param2 - var7;
              if (!this.field_n.d()) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_y.b(param0, param1, param2);
              return;
            }
          }
          this.field_y.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("hl.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
        try {
          this.a(param2, param1, true, -5953);
          if (param0 < 26) {
            this.a(-128, false, -53);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "hl.JA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (this.field_n.d()) {
          var2 = this.field_n.field_e * this.field_K / b.field_r;
          while (true) {
            var3 = this.field_P + (long)param0 * (long)var2;
            if (this.field_U - var3 >= 0L) {
              this.field_P = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((-1L + this.field_U - (this.field_P - (long)var2)) / (long)var2);
            this.field_P = this.field_P + (long)var2 * (long)var5;
            this.field_y.a(var5);
            param0 = param0 - var5;
            this.b(-11);
            if (!this.field_n.d() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_y.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_y.a(param0);
        }

    }

    private final void h(int param0, int param1) {
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 0) {
          param0 = 0;
          do {
            if (16 <= param0) {
              return;
            }
            this.h(param0, param1 ^ 0);
            param0++;
          } while (var4 == 0);
          return;
        }
        this.field_J[param0] = 12800;
        this.field_C[param0] = 8192;
        this.field_l[param0] = 16383;
        this.field_T[param0] = 8192;
        this.field_x[param0] = 0;
        this.field_S[param0] = 8192;
        this.a(param0, 16384);
        if (param1 != 16645) {
          this.field_L = (cb[][]) null;
        }
        this.c(param1 - 785062713, param0);
        this.field_q[param0] = 0;
        this.field_v[param0] = 32767;
        this.field_r[param0] = 256;
        this.field_u[param0] = 0;
        this.a(false, 8192, param0);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -16257) {
          return;
        }
        this.field_T[param2] = param0;
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        cb stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_20_1 = 0;
        cb stackIn_20_2 = null;
        boolean stackIn_21_3 = false;
        cb stackOut_3_0;
        cb var5;
        int var6_int;
        ke var6;
        cb var7;
        cb var8;
        int var9;
        wj var10;
        wj var11;
        boolean decompiledFrameCompleted0 = true;
        var9 = Lexicominos.field_L ? 1 : 0;
        this.a(64, param3, param0, 0);
        if ((this.field_q[param0] & 2) != 0) {
          var5 = (cb) (this.field_y.field_n.c(2));
          while (var5 != null) {
            stackOut_3_0 = var5;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_4_0.field_z == param0 &&
              var5.field_h < 0) {
              this.field_R[param0][var5.field_q] = null;
              this.field_R[param0][param3] = var5;
              var6_int = var5.field_o + (var5.field_l * var5.field_v >> 12);
              var5.field_o = var5.field_o + (param3 - var5.field_q << 8);
              var5.field_q = param3;
              var5.field_v = 4096;
              var5.field_l = var6_int - var5.field_o;
              return;
            }
            var5 = (cb) (this.field_y.field_n.d(0));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_9_0 = this.field_A.a((long)this.field_E[param0], (byte) 118);
        }
        var10 = (wj) (stackIn_9_0);
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_l[param3];
        if (var6 == null) {
          return;
        }
        var7 = new cb();
        var7.field_w = var6;
        var7.field_z = param0;
        var7.field_p = var10;
        var7.field_r = var10.field_h[param3];
        var7.field_u = var10.field_r[param3];
        var7.field_q = param3;
        var7.field_s = 1024 + var10.field_n[param3] * var11.field_m * (param1 * param1) >> 11;
        var7.field_k = var10.field_q[param3] & 255;
        var7.field_o = (param3 << 8) - (32767 & var10.field_k[param3]);
        var7.field_j = 0;
        if (param2 >= -78) {
          return;
        }
        var7.field_h = -1;
        var7.field_y = 0;
        var7.field_F = 0;
        var7.field_B = 0;
        if (0 != this.field_u[param0]) {
          var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
          stackIn_20_1 = 92;
          stackIn_20_2 = var7;
          stackIn_21_3 = !(0 <= var10.field_k[param3]);
          this.a((byte) stackIn_20_1, stackIn_20_2, stackIn_21_3);
          if (var9 != 0) {
            var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
          }
        } else {
          var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
        }
        if (0 > var10.field_k[param3]) {
          var7.field_C.e(-1);
        }
        if (var7.field_u >= 0) {
          var8 = this.field_L[param0][var7.field_u];
          if (var8 != null &&
            0 > var8.field_h) {
            this.field_R[param0][var8.field_q] = null;
            var8.field_h = 0;
          }
          this.field_L[param0][var7.field_u] = var7;
        }
        this.field_y.field_n.b(115, var7);
        this.field_R[param0][param3] = var7;
        return;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 2) {
          return;
        }
        if (param2 != this.field_E[param0]) {
          this.field_E[param0] = param2;
          var4 = 0;
          while (var4 < 128) {
            this.field_L[param0][var4] = null;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        wj var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > -73) {
          return;
        }
        var4 = (wj) (this.field_A.c((byte) -95));
        while (var4 != null) {
          var4.a(-122);
          var4 = (wj) (this.field_A.a((byte) -91));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int discarded$0 = 0;
        this.a(param0, (byte) 90, param2);
        if (!param1) {
          discarded$0 = this.c((cb) null, -91);
        }
    }

    private final int a(byte param0, cb param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_v * param1.field_l >> 12) + param1.field_o;
          var3_int = var3_int + (this.field_r[param1.field_z] * (-8192 + this.field_T[param1.field_z]) >> 12);
          if (param0 >= -105) {
            this.d();
          }
          var4 = param1.field_r;
          if (var4.field_d > 0 && (!(0 >= var4.field_k) ||
            this.field_x[param1.field_z] > 0)) {
            var5 = var4.field_k << 2;
            var6 = var4.field_h << 1;
            if (var6 > param1.field_x) {
              var5 = param1.field_x * var5 / var6;
            }
            var5 = var5 + (this.field_x[param1.field_z] >> 7);
            var7 = Math.sin((double)(511 & param1.field_i) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(param1.field_w.field_m * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)b.field_r + 0.5);
          stackIn_12_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = this.field_z;
        var3 = this.field_m;
        var4 = this.field_U;
        if (null != this.field_s &&
          this.field_Q == var3) {
          this.a(this.field_s, this.field_D, this.field_I, param0 ^ 5962);
          this.b(param0 ^ 0);
          return;
        }
        while (true) {
          stackIn_5_0 = ~var3;
          stackIn_5_1 = ~this.field_m;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_5_0 == stackIn_5_1) {
            while (true) {
              stackIn_25_0 = var3;
              stackIn_25_1 = this.field_n.field_a[var2];
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_25_0 == stackIn_25_1) {
                this.field_n.c(var2);
                var6 = this.field_n.f(var2);
                stackIn_5_0 = -2;
                stackIn_5_1 = ~var6;
                if (stackIn_5_0 == stackIn_5_1) {
                  this.field_n.f();
                  this.field_n.b(var2);
                  if (this.field_n.c()) {
                    if (this.field_s != null) {
                      this.a(111, this.field_D, this.field_s);
                      this.b(param0 + 0);
                      return;
                    }
                    if (this.field_D &&
                      0 != var3) {
                      this.field_n.a(var4);
                    } else {
                      this.a(true, (byte) -87);
                      this.field_n.g();
                      return;
                    }
                  }
                } else {
                  if (0 != (128 & var6)) {
                    this.g(param0 - 112, var6);
                  }
                  this.field_n.a(var2);
                  this.field_n.b(var2);
                  continue;
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              var2 = this.field_n.a();
              var3 = this.field_n.field_a[var2];
              var4 = this.field_n.d(var3);
              continue;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_z = var2;
            this.field_U = var4;
            this.field_m = var3;
            stackIn_25_0 = param0;
            stackIn_25_1 = -11;
          }
          if (stackIn_25_0 != stackIn_25_1) {
            this.field_m = -105;
          }
          if (this.field_s != null &&
            var3 > this.field_Q) {
            this.field_z = -1;
            this.field_m = this.field_Q;
            this.field_U = this.field_n.d(this.field_m);
          }
          return;
        }
    }

    public hl() {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj(this);
        this.field_A = new na(128);
        this.a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    hl(hl param0) {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj(this);
        try {
          this.field_A = param0.field_A;
          this.a(-1, 256, false);
          this.a(true, (byte) -87);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Try again";
    }
}
