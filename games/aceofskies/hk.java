/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends rf {
    private int[] field_r;
    private int[] field_A;
    static int[] field_i;
    private ft[][] field_E;
    private int[] field_F;
    private int field_C;
    private int[] field_w;
    private int[] field_B;
    private int[] field_p;
    int[] field_m;
    private int field_t;
    private int[] field_o;
    int[] field_z;
    private int[] field_D;
    int[] field_G;
    private ph field_n;
    private ft[][] field_K;
    private int[] field_I;
    private int[] field_s;
    private int[] field_N;
    private k field_M;
    private int[] field_J;
    private int[] field_l;
    private long field_j;
    private boolean field_k;
    private int field_q;
    private long field_u;
    private um field_L;
    private int field_H;
    private ap field_x;
    private boolean field_v;
    private int field_y;

    private final void a(int param0, int param1, byte param2) {
        int var4 = 47 % ((param2 - 51) / 61);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.field_M.c()) {
            var4_int = this.field_M.field_e * this.field_C / tk.field_f;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_j;
              if (0L <= this.field_u - var5) {
                this.field_j = var5;
                if (var8 != 0) {
                  return;
                }
                break;
              }
              var7 = (int)((this.field_u - this.field_j + ((long)var4_int - 1L)) / (long)var4_int);
              this.field_j = this.field_j + (long)var4_int * (long)var7;
              this.field_L.b(param0, param1, var7);
              param1 = param1 + var7;
              this.a((byte) 53);
              param2 = param2 - var7;
              if (!this.field_M.c() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_L.b(param0, param1, param2);
              return;
            }
          }
          this.field_L.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("hk.M(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(ft param0, boolean param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.field_x.field_g.length;
          boolean decompiledSharedTail0 = (param1 &&
            param0.field_x.field_f);
          if (!decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.field_z[param0.field_m] >> 6);
            decompiledSharedTail0 = (AceOfSkies.field_G);
          }
          if (decompiledSharedTail0) {
            var6 = var4_int + (var4_int - param0.field_x.field_h);
            var5 = (int)((long)var6 * (long)this.field_z[param0.field_m] >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param0.field_e.a(true);
              var5 = -var5 + (-1 + var4_int + var4_int);
            }
          }
          if (!param2) {
            this.field_y = -43;
          }
          param0.field_e.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("hk.OA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 126) {
          this.field_k = false;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 127) {
          return;
        }
        this.field_N[param2] = param1;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
          this.b(-1, (byte) 67);
        }
        if (!param0 ||
          var4 != 0) {
          this.a(true, -1);
        }
        if (param1 != 12705) {
          this.b(-31, -4);
        }
        this.c(-1, false);
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.field_I[var3] = this.field_F[var3];
          var3++;
        } while (var4 == 0);
        while (var3 < 16) {
          this.field_s[var3] = pg.a(-128, this.field_F[var3]);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final synchronized rf a() {
        return null;
    }

    private final void a(boolean param0, int param1) {
        ft var3;
        int var4;
        int stackIn_10_0 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) (this.field_L.field_k.d(268435455));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_10_0 = param1;
          if (var4 == 0) {
            if ((stackIn_10_0 < 0 ||
              ~var3.field_m == ~param1) &&
              var3.field_p < 0) {
              this.field_E[var3.field_m][var3.field_n] = null;
              var3.field_p = 0;
            }
            var3 = (ft) (this.field_L.field_k.b((byte) 103));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param0 ? 1 : 0;
        }
        if (stackIn_10_0 != 1) {
          this.field_s = (int[]) null;
        }
        return;
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ft var6 = null;
        int var7 = 0;
        ft var8 = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var8 = this.field_E[param3][param1];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_E[param3][param1] = null;
        if (param2 == (this.field_G[param3] & 2)) {
          var8.field_p = 0;
          decompiledFrameRemainder0 = (var7 != 0);
        }
        if (decompiledFrameRemainder0) {
          var6 = (ft) (this.field_L.field_k.d(268435455));
          while (var6 != null) {
            if (var7 != 0) {
              break;
            }
            if (~var6.field_m == ~var8.field_m &&
              0 > var6.field_p &&
              var8 != var6) {
              var8.field_p = 0;
            } else {
              var6 = (ft) (this.field_L.field_k.b((byte) 103));
              continue;
            }
            break;
          }
        }

    }

    final synchronized void g(int param0) {
        int var3 = 0;
        ml var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 0) {
          return;
        }
        var4 = (ml) (this.field_n.a(false));
        while (var4 != null) {
          var4.a(true);
          var4 = (ml) (this.field_n.a(0));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_M.c()) {
          var2 = this.field_C * this.field_M.field_e / tk.field_f;
          while (true) {
            var3 = this.field_j + (long)param0 * (long)var2;
            if (this.field_u - var3 >= 0L) {
              this.field_j = var3;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              break;
            }
            var5 = (int)((this.field_u - this.field_j + (long)var2 - 1L) / (long)var2);
            this.field_j = this.field_j + (long)var5 * (long)var2;
            this.field_L.a(var5);
            param0 = param0 - var5;
            this.a((byte) 54);
            if (!this.field_M.c() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_L.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          this.field_L.a(param0);
        }

    }

    private final void a(byte param0, int param1) {
        ft var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= -111) {
          return;
        }
        if ((2 & this.field_G[param1]) != 0) {
          var3 = (ft) (this.field_L.field_k.d(268435455));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~var3.field_m == ~param1 &&
              null == this.field_E[param1][var3.field_n] &&
              0 > var3.field_p) {
              var3.field_p = 0;
            }
            var3 = (ft) (this.field_L.field_k.b((byte) 103));
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        ft stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        ft stackIn_20_1 = null;
        boolean stackIn_21_2 = false;
        ft stackOut_4_0;
        ft var5;
        int var6_int;
        al var6;
        ft var7;
        int var8;
        ft var9;
        int var10;
        ml var11;
        ml var12;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          this.a(64, param2, 0, param3);
          if (0 != (2 & this.field_G[param3])) {
            var5 = (ft) (this.field_L.field_k.a((byte) -70));
            while (var5 != null) {
              stackOut_4_0 = var5;
              stackIn_10_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var10 != 0) {
                break L0;
              }
              if (~stackIn_5_0.field_m == ~param3 &&
                0 > var5.field_p) {
                this.field_E[param3][var5.field_n] = null;
                this.field_E[param3][param2] = var5;
                var6_int = var5.field_w + (var5.field_q * var5.field_u >> 12);
                var5.field_w = var5.field_w + (-var5.field_n + param2 << 8);
                var5.field_q = 4096;
                var5.field_n = param2;
                var5.field_u = -var5.field_w + var6_int;
                return;
              }
              var5 = (ft) (this.field_L.field_k.a(110));
            }
          }
          stackIn_10_0 = this.field_n.a((byte) 106, (long)this.field_I[param3]);
        }
        var11 = (ml) (stackIn_10_0);
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_f[param2];
        if (var6 == null) {
          return;
        }
        var8 = 5 / ((-31 - param0) / 43);
        var7 = new ft();
        var7.field_y = var12;
        var7.field_m = param3;
        var7.field_x = var6;
        var7.field_r = var11.field_o[param2];
        var7.field_f = var11.field_e[param2];
        var7.field_n = param2;
        var7.field_h = 1024 + var11.field_k[param2] * var12.field_i * (param1 * param1) >> 11;
        var7.field_v = var11.field_q[param2] & 255;
        var7.field_w = (param2 << 8) - (var11.field_n[param2] & 32767);
        var7.field_g = 0;
        var7.field_p = -1;
        var7.field_A = 0;
        var7.field_s = 0;
        var7.field_k = 0;
        if (this.field_z[param3] == 0) {
          var7.field_e = su.a(var6, this.b((byte) -113, var7), this.a((byte) -67, var7), this.b(77, var7));
          if (var10 != 0) {
            var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
            stackIn_20_1 = var7;
            stackIn_21_2 = !(var11.field_n[param2] >= 0);
            this.a(stackIn_20_1, stackIn_21_2, true);
          }
        } else {
          var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
          stackIn_20_1 = var7;
          stackIn_21_2 = !(var11.field_n[param2] >= 0);
          this.a(stackIn_20_1, stackIn_21_2, true);
        }
        if (var11.field_n[param2] < 0) {
          var7.field_e.d(-1);
        }
        if (var7.field_f >= 0) {
          var9 = this.field_K[param3][var7.field_f];
          if (var9 != null &&
            var9.field_p < 0) {
            this.field_E[param3][var9.field_n] = null;
            var9.field_p = 0;
          }
          this.field_K[param3][var7.field_f] = var7;
        }
        this.field_L.field_k.a(120, var7);
        this.field_E[param3][param2] = var7;
        return;
    }

    private final void c(int param0, int param1, int param2) {
        int discarded$0 = 0;
        this.field_o[param0] = param1;
        if (param2 != 3830) {
          discarded$0 = this.b((byte) 103, (ft) null);
        }
        this.field_m[param0] = (int)(0.5 + Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    final synchronized rf b() {
        return (rf) ((Object) this.field_L);
    }

    private final void a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var2 = this.field_H;
        var3 = this.field_q;
        var4 = this.field_u;
        if (null != this.field_x &&
          this.field_y == var3) {
          this.a(122, this.field_v, this.field_k, this.field_x);
          this.a((byte) 92);
          return;
        }
        while (true) {
          stackIn_5_0 = ~var3;
          stackIn_5_1 = ~this.field_q;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_5_0 == stackIn_5_1) {
            while (true) {
              stackIn_29_0 = var3;
              stackIn_29_1 = this.field_M.field_f[var2];
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_29_0 == stackIn_29_1) {
                this.field_M.a(var2);
                var6 = this.field_M.e(var2);
                stackIn_5_0 = -2;
                stackIn_5_1 = ~var6;
                if (stackIn_5_0 != stackIn_5_1) {
                  if ((128 & var6) != 0) {
                    this.b(-128, var6);
                  }
                  this.field_M.c(var2);
                  this.field_M.f(var2);
                  continue;
                } else {
                  this.field_M.a();
                  this.field_M.f(var2);
                  if (this.field_M.g()) {
                    if (this.field_x != null) {
                      this.a(this.field_k, -2029711608, this.field_x);
                      this.a((byte) 122);
                      return;
                    }
                    if (this.field_k &&
                      var3 != 0) {
                      this.field_M.a(var4);
                    } else {
                      this.b(true, 12705);
                      this.field_M.d();
                      return;
                    }
                  }
                }
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              var2 = this.field_M.e();
              var3 = this.field_M.field_f[var2];
              var4 = this.field_M.d(var3);
              continue;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_H = var2;
            this.field_q = var3;
            this.field_u = var4;
            if (this.field_x != null &&
              var3 > this.field_y) {
              this.field_q = this.field_y;
              this.field_H = -1;
              this.field_u = this.field_M.d(this.field_q);
            }
            stackIn_29_0 = param0;
            stackIn_29_1 = 16;
          }
          if (stackIn_29_0 < stackIn_29_1) {
            this.a(-128, (ft) null);
          }
          return;
        }
    }

    private final void c(int param0, boolean param1) {
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (0 > param0) {
          param0 = 0;
          do {
            if (param0 >= 16) {
              return;
            }
            this.c(param0, false);
            param0++;
          } while (var4 == 0);
          return;
        }
        if (param1) {
          this.field_N = (int[]) null;
        }
        this.field_J[param0] = 12800;
        this.field_p[param0] = 8192;
        this.field_w[param0] = 16383;
        this.field_N[param0] = 8192;
        this.field_A[param0] = 0;
        this.field_r[param0] = 8192;
        this.a((byte) -116, param0);
        this.a(param0, (byte) 4);
        this.field_G[param0] = 0;
        this.field_D[param0] = 32767;
        this.field_B[param0] = 256;
        this.field_z[param0] = 0;
        this.c(param0, 8192, 3830);
    }

    final synchronized void a(int param0, int param1) {
        this.field_C = param0;
        if (param1 > -102) {
          this.field_J = (int[]) null;
        }
    }

    final synchronized void d(int param0) {
        if (param0 >= -125) {
          this.field_r = (int[]) null;
        }
        this.a(2097152, true);
    }

    final synchronized void a(boolean param0, int param1, ap param2) {
        try {
          this.a(param1 ^ -2029711495, true, param0, param2);
          if (param1 != -2029711608) {
            this.a(43);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hk.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, ap param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          this.a(2097152, param1);
          this.field_M.a(param3.field_e);
          this.field_j = 0L;
          stackIn_4_1 = (param2);
          this.field_k = stackIn_4_1;
          var5_int = this.field_M.f();
          var6 = 0;
          do {
            if (var6 >= var5_int) {
              this.field_H = this.field_M.e();
              break;
            }
            this.field_M.a(var6);
            this.field_M.c(var6);
            this.field_M.f(var6);
            var6++;
          } while (var7 == 0);
          if (param0 <= 110) {
            this.a(-102, (byte) -90);
          }
          this.field_q = this.field_M.field_f[this.field_H];
          this.field_u = this.field_M.d(this.field_q);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("hk.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param2 != this.field_I[param0]) {
          this.field_I[param0] = param2;
          var4 = 0;
          while (128 > var4) {
            this.field_K[param0][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param1 < 50)) {
          this.b();
        }

    }

    final boolean a(int param0, ft param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_e) {
            if (param0 == 0) {
              return false;
            }
            return false;
          }
          if (param1.field_p < 0) {
            return true;
          }
          param1.c(-125);
          if (0 < param1.field_f &&
            this.field_K[param1.field_m][param1.field_f] == param1) {
            this.field_K[param1.field_m][param1.field_f] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("hk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, int param1, ap param2, gk param3, ob param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ub var8 = null;
        int var9 = 0;
        int var11 = 0;
        ml var12 = null;
        ml var13 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          param2.b();
          var6_int = 1;
          var7 = null;
          if (~param1 < param0) {
            var7 = new int[]{param1};
          }
          var8 = (ub) (param2.field_f.a(false));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 == null))) {
            var9 = (int)var8.field_b;
            var12 = (ml) (this.field_n.a((byte) 106, (long)var9));
            if (var11 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (var12 == null) {
                var13 = gu.a(var9, param3, 16652);
                if (var13 == null) {
                  var6_int = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_n.a(param0 ^ -98, (long)var9, var13);
                  decompiledFrameRemainder0 = !(var13.a(var8.field_e, (int[]) (var7), param4, 5193));
                }
              } else {
                decompiledFrameRemainder0 = !(var12.a(var8.field_e, (int[]) (var7), param4, 5193));
              }
              if (decompiledFrameRemainder0) {
                var6_int = 0;
              }
              var8 = (ub) (param2.field_f.a(param0 + 1));
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (var6_int != 0)) {
            param2.a();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("hk.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final synchronized void b(int param0, boolean param1) {
        if (param1) {
          this.field_v = false;
        }
        this.field_t = param0;
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= -115) {
          this.field_o = (int[]) null;
        }
        if (param2 >= 0) {
          this.field_l[param2] = param1;
        }
        if (param2 < 0 ||
          var5 != 0) {
          var4 = 0;
          while (var4 < 16) {
            this.field_l[var4] = param1;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final int b(int param0, ft param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_p[param1.field_m];
          if (param0 <= 54) {
            stackIn_2_0 = -42;
            return stackIn_2_0;
          }
          if (var3_int >= 8192) {
            stackIn_7_0 = -((-param1.field_v + 128) * (16384 - var3_int) + 32 >> 6) + 16384;
            return stackIn_7_0;
          }
          stackIn_5_0 = var3_int * param1.field_v + 32 >> 6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hk.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(byte param0, ft param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dh var9 = null;
        dh var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_l[param1.field_m] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param1.field_r;
          var10 = var9;
          var4 = 4096 + this.field_w[param1.field_m] * this.field_J[param1.field_m] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param1.field_h >> 15;
          var4 = 128 + this.field_t * var4 >> 8;
          var4 = this.field_l[param1.field_m] * var4 + 128 >> 8;
          if (param0 != -67) {
            this.field_u = 112L;
          }
          if (0 < var10.field_b) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * ((double)param1.field_A * 0.00001953125)) * (double)var4);
          }
          if (var10.field_g != null) {
            var5 = param1.field_s;
            var6 = var10.field_g[param1.field_g + 1];
            if (param1.field_g < var10.field_g.length - 2) {
              var7 = 65280 & var9.field_g[param1.field_g] << 8;
              var8 = (var10.field_g[2 + param1.field_g] & 255) << 8;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[param1.field_g + 3]) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (0 < param1.field_p &&
            var10.field_e != null) {
            var5Lifetime1 = param1.field_p;
            var6Lifetime1 = var10.field_e[param1.field_k + 1];
            if (param1.field_k < (var10.field_e.length - 2)) {
              var7Lifetime1 = (255 & var9.field_e[param1.field_k]) << 8;
              var8Lifetime1 = (255 & var10.field_e[param1.field_k + 2]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_e[param1.field_k + 3]) * (var5Lifetime1 - var7Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("hk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_M.d();
        this.field_x = null;
        this.b(param1, 12705);
        if (param0 != 2097152) {
          this.a(-3, true);
        }
    }

    private final void b(int param0, int param1) {
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
        var8 = AceOfSkies.field_G ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = (param1 & 32672) >> 8;
          var6 = (8343301 & param1) >> 16;
          this.a(var6, var5, 0, var4);
          return;
        }
        L0: {
          if (144 == var3) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = 127 & param1 >> 8;
            var6Lifetime1 = 127 & param1 >> 16;
            if (var6Lifetime1 > 0) {
              this.b(35, var6Lifetime1, var5Lifetime1, var4Lifetime1);
              if (var8 == 0) {
                break L0;
              }
            }
            this.a(64, var5Lifetime1, param0 + 128, var4Lifetime1);
            return;
          }
          if (var3 == 160) {
            var4Lifetime1Lifetime1 = 15 & param1;
            var5Lifetime1Lifetime1 = param1 >> 8 & 127;
            var6Lifetime1Lifetime1 = (param1 & 8337132) >> 16;
            this.a(var6Lifetime1Lifetime1, (byte) 127, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1);
            return;
          }
          if (param0 != -128) {
            this.field_s = (int[]) null;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1Lifetime2 = 15 & param1;
              var5Lifetime1Lifetime2 = (32710 & param1) >> 8;
              this.a(var4Lifetime1Lifetime2, (byte) 101, this.field_s[var4Lifetime1Lifetime2] + var5Lifetime1Lifetime2);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1Lifetime2Lifetime1 = param1 & 15;
              var5Lifetime1Lifetime2Lifetime1 = (32723 & param1) >> 8;
              this.a(var4Lifetime1Lifetime2Lifetime1, var5Lifetime1Lifetime2Lifetime1, (byte) -34);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1Lifetime2Lifetime2 = 15 & param1;
              var5Lifetime1Lifetime2Lifetime2 = (param1 >> 9 & 16256) + (127 & param1 >> 8);
              this.a(param0 + 255, var5Lifetime1Lifetime2Lifetime2, var4Lifetime1Lifetime2Lifetime2);
              return;
            }
            var3 = 255 & param1;
            if (var3 != 255) {
              return;
            }
            this.b(true, param0 + 12833);
            return;
          }
          var4Lifetime1Lifetime3 = param1 & 15;
          var5Lifetime1Lifetime3 = 127 & param1 >> 8;
          var6Lifetime1Lifetime2 = param1 >> 16 & 127;
          if (var5Lifetime1Lifetime3 == 0) {
            this.field_s[var4Lifetime1Lifetime3] = pg.a(this.field_s[var4Lifetime1Lifetime3], -2080769) + (var6Lifetime1Lifetime2 << 14);
          }
          if (32 == var5Lifetime1Lifetime3) {
            this.field_s[var4Lifetime1Lifetime3] = pg.a(-16257, this.field_s[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (1 == var5Lifetime1Lifetime3) {
            this.field_A[var4Lifetime1Lifetime3] = pg.a(-16257, this.field_A[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 33) {
            this.field_A[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_A[var4Lifetime1Lifetime3], -128);
          }
          if (var5Lifetime1Lifetime3 == 5) {
            this.field_r[var4Lifetime1Lifetime3] = pg.a(-16257, this.field_r[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 37) {
            this.field_r[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_r[var4Lifetime1Lifetime3], -128);
          }
          if (7 == var5Lifetime1Lifetime3) {
            this.field_J[var4Lifetime1Lifetime3] = pg.a(this.field_J[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 39) {
            this.field_J[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_J[var4Lifetime1Lifetime3], -128);
          }
          if (var5Lifetime1Lifetime3 == 10) {
            this.field_p[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(-16257, this.field_p[var4Lifetime1Lifetime3]);
          }
          if (var5Lifetime1Lifetime3 == 42) {
            this.field_p[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_p[var4Lifetime1Lifetime3], -128);
          }
          if (var5Lifetime1Lifetime3 == 11) {
            this.field_w[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(-16257, this.field_w[var4Lifetime1Lifetime3]);
          }
          if (43 == var5Lifetime1Lifetime3) {
            this.field_w[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_w[var4Lifetime1Lifetime3], -128);
          }
          switch (var5Lifetime1Lifetime3) {
            case 64:
              if (var6Lifetime1Lifetime2 >= 64) {
                this.field_G[var4Lifetime1Lifetime3] = vo.a(this.field_G[var4Lifetime1Lifetime3], 1);
                if (var8 != 0) {
                  this.field_G[var4Lifetime1Lifetime3] = pg.a(this.field_G[var4Lifetime1Lifetime3], -2);
                }
              } else {
                this.field_G[var4Lifetime1Lifetime3] = pg.a(this.field_G[var4Lifetime1Lifetime3], -2);
              }
              break;
            case 65:
              if (var6Lifetime1Lifetime2 < 64) {
                this.a((byte) -126, var4Lifetime1Lifetime3);
                this.field_G[var4Lifetime1Lifetime3] = pg.a(this.field_G[var4Lifetime1Lifetime3], -3);
                if (var8 != 0) {
                  this.field_G[var4Lifetime1Lifetime3] = vo.a(this.field_G[var4Lifetime1Lifetime3], 2);
                }
              } else {
                this.field_G[var4Lifetime1Lifetime3] = vo.a(this.field_G[var4Lifetime1Lifetime3], 2);
              }
              break;
            case 99:
              this.field_D[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(this.field_D[var4Lifetime1Lifetime3], 127);
              break;
            case 98:
              this.field_D[var4Lifetime1Lifetime3] = pg.a(16256, this.field_D[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
              break;
            case 101:
              this.field_D[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(this.field_D[var4Lifetime1Lifetime3], 127) + 16384;
              break;
            case 100:
              this.field_D[var4Lifetime1Lifetime3] = pg.a(16256, this.field_D[var4Lifetime1Lifetime3]) + 16384 + var6Lifetime1Lifetime2;
              break;
            case 120:
              this.b(var4Lifetime1Lifetime3, (byte) 95);
              break;
            case 121:
              this.c(var4Lifetime1Lifetime3, false);
              break;
            case 123:
              this.a(true, var4Lifetime1Lifetime3);
              break;
            case 6:
              var7 = this.field_D[var4Lifetime1Lifetime3];
              if (16384 == var7) {
                this.field_B[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(this.field_B[var4Lifetime1Lifetime3], -16257);
              }
              break;
            case 38:
              var7Lifetime1 = this.field_D[var4Lifetime1Lifetime3];
              if (var7Lifetime1 == 16384) {
                this.field_B[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + pg.a(this.field_B[var4Lifetime1Lifetime3], -128);
              }
              break;
            case 16:
              this.field_z[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + pg.a(this.field_z[var4Lifetime1Lifetime3], -16257);
              break;
            case 48:
              this.field_z[var4Lifetime1Lifetime3] = pg.a(-128, this.field_z[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
              break;
            case 81:
              if (64 <= var6Lifetime1Lifetime2) {
                this.field_G[var4Lifetime1Lifetime3] = vo.a(this.field_G[var4Lifetime1Lifetime3], 4);
                if (var8 != 0) {
                  this.a(var4Lifetime1Lifetime3, (byte) 4);
                  this.field_G[var4Lifetime1Lifetime3] = pg.a(this.field_G[var4Lifetime1Lifetime3], -5);
                }
              } else {
                this.a(var4Lifetime1Lifetime3, (byte) 4);
                this.field_G[var4Lifetime1Lifetime3] = pg.a(this.field_G[var4Lifetime1Lifetime3], -5);
              }
              break;
            case 17:
              this.c(var4Lifetime1Lifetime3, (this.field_o[var4Lifetime1Lifetime3] & -16257) + (var6Lifetime1Lifetime2 << 7), 3830);
              break;
            case 49:
              this.c(var4Lifetime1Lifetime3, var6Lifetime1Lifetime2 + (-128 & this.field_o[var4Lifetime1Lifetime3]), param0 ^ -3722);
              return;
            default:
              break;
          }
        }
    }

    private final int b(byte param0, ft param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        dh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_u * param1.field_q >> 12) + param1.field_w;
          var3_int = var3_int + (this.field_B[param1.field_m] * (-8192 + this.field_N[param1.field_m]) >> 12);
          var4 = param1.field_r;
          if (param0 > -56) {
            this.b(-101, (byte) 115);
          }
          if (var4.field_i > 0 && (!(var4.field_j <= 0) ||
            this.field_A[param1.field_m] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_a << 1;
            if (param1.field_j < var6) {
              var5 = param1.field_j * var5 / var6;
            }
            var5 = var5 + (this.field_A[param1.field_m] >> 7);
            var7 = Math.sin((double)(511 & param1.field_z) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_x.field_i) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)tk.field_f + 0.5);
          stackIn_13_0 = (1 <= var5Lifetime1) ? var5Lifetime1 : 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("hk.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, ft param3, int[] param4) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        dh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          param3.field_i = tk.field_f / 100;
          if (0 <= param3.field_p && (null == param3.field_e ||
            param3.field_e.f())) {
            param3.a(11821);
            param3.c(-127);
            if (param3.field_f > 0) {
              if (param3 != this.field_K[param3.field_m][param3.field_f]) {
                return true;
              }
              this.field_K[param3.field_m][param3.field_f] = null;
            }
            return true;
          }
          var6_int = param3.field_q;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_r[param3.field_m] * 0.0004921259842519685) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_q = var6_int;
          }
          param3.field_e.g(this.b((byte) -76, param3));
          var7 = param3.field_r;
          param3.field_j = param3.field_j + 1;
          var8 = param2 ? 1 : 0;
          param3.field_z = param3.field_z + var7.field_i;
          var9 = 0.000005086263020833333 * (double)((param3.field_n - 60 << 8) + (param3.field_q * param3.field_u >> 12));
          if (var7.field_b > 0) {
            if (var7.field_f > 0) {
              param3.field_A = param3.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
              if (var11 != 0) {
                param3.field_A = param3.field_A + 128;
              }
            } else {
              param3.field_A = param3.field_A + 128;
            }
            if (819200 <= var7.field_b * param3.field_A) {
              var8 = 1;
            }
          }
          if (var7.field_g != null) {
            boolean decompiledSharedTail1 = !(0 >= var7.field_h);
            if (!decompiledSharedTail1) {
              param3.field_s = param3.field_s + 128;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              param3.field_s = param3.field_s + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param3.field_g < (-2 + var7.field_g.length)) {
                stackIn_34_0 = ~((255 & var7.field_g[2 + param3.field_g]) << 8);
                stackIn_34_1 = ~param3.field_s;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_34_0 > stackIn_34_1)) {
                  param3.field_g = param3.field_g + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_34_0 = param3.field_g;
                stackIn_34_1 = var7.field_g.length - 2;
              }
              if (stackIn_34_0 != stackIn_34_1) {
                break;
              }
              if (var7.field_g[param3.field_g + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (0 <= param3.field_p &&
            var7.field_e != null &&
            0 == (1 & this.field_G[param3.field_m]) && (!(param3.field_f >= 0) ||
            param3 != this.field_K[param3.field_m][param3.field_f])) {
            boolean decompiledSharedTail0 = !(var7.field_l <= 0);
            if (!decompiledSharedTail0) {
              param3.field_p = param3.field_p + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_p = param3.field_p + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if ((-2 + var7.field_e.length) > param3.field_k) {
                stackIn_54_0 = ~param3.field_p;
                stackIn_54_1 = ~(65280 & var7.field_e[param3.field_k + 2] << 8);
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_54_0 < stackIn_54_1)) {
                  param3.field_k = param3.field_k + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_54_0 = ~(-2 + var7.field_e.length);
                stackIn_54_1 = ~param3.field_k;
              }
              if (stackIn_54_0 != stackIn_54_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param3.field_e.a(param3.field_i, this.a((byte) -67, param3), this.b(67, param3));
            return false;
          }
          param3.field_e.h(param3.field_i);
          if (param4 == null) {
            param3.field_e.a(param0);
            if (var11 != 0) {
              param3.field_e.b(param4, param1, param0);
            }
          } else {
            param3.field_e.b(param4, param1, param0);
          }
          if (param3.field_e.j()) {
            this.field_L.field_i.b(param3.field_e);
          }
          param3.a(11821);
          if (param3.field_p >= 0) {
            param3.c(-123);
            if (param3.field_f > 0 &&
              this.field_K[param3.field_m][param3.field_f] == param3) {
              this.field_K[param3.field_m][param3.field_f] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("hk.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param4 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (param1) {
          return;
        }
        this.b(2993, param0, param2);
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -543142776) {
          field_i = (int[]) null;
        }
    }

    final synchronized boolean f(int param0) {
        if (param0 != 32119) {
          this.field_z = (int[]) null;
        }
        return this.field_M.c();
    }

    private final void b(int param0, int param1, int param2) {
        this.field_F[param2] = param1;
        this.field_s[param2] = pg.a(-128, param1);
        this.a(param2, (byte) 100, param1);
        if (param0 != 2993) {
          this.a(-27, (byte) -89, -25);
        }
    }

    private final void b(int param0, byte param1) {
        ft var3;
        int var4;
        int stackIn_16_0 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) (this.field_L.field_k.d(268435455));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_16_0 = param0;
          if (var4 == 0) {
            if (stackIn_16_0 < 0 ||
              var3.field_m == param0) {
              if (var3.field_e != null) {
                var3.field_e.h(tk.field_f / 100);
                if (var3.field_e.j()) {
                  this.field_L.field_i.b(var3.field_e);
                }
                var3.a(11821);
              }
              if (var3.field_p < 0) {
                this.field_E[var3.field_m][var3.field_n] = null;
              }
              var3.c(-124);
            }
            var3 = (ft) (this.field_L.field_k.b((byte) 103));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_16_0 = param1;
        }
        if (stackIn_16_0 <= 65) {
          this.field_w = (int[]) null;
        }
        return;
    }

    private final void a(int param0, byte param1) {
        ft var3;
        int var4;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param1 != 4) {
          this.a(6, 126, (ap) null, (gk) null, (ob) null);
        }
        if (0 != (4 & this.field_G[param0])) {
          var3 = (ft) (this.field_L.field_k.d(268435455));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (~var3.field_m == ~param0) {
              var3.field_t = 0;
            }
            var3 = (ft) (this.field_L.field_k.b((byte) 103));
          }
        }
    }

    public hk() {
        this.field_r = new int[16];
        this.field_A = new int[16];
        this.field_F = new int[16];
        this.field_w = new int[16];
        this.field_p = new int[16];
        this.field_B = new int[16];
        this.field_o = new int[16];
        this.field_D = new int[16];
        this.field_t = 256;
        this.field_m = new int[16];
        this.field_z = new int[16];
        this.field_G = new int[16];
        this.field_K = new ft[16][128];
        this.field_N = new int[16];
        this.field_J = new int[16];
        this.field_l = new int[16];
        this.field_s = new int[16];
        this.field_E = new ft[16][128];
        this.field_I = new int[16];
        this.field_C = 1000000;
        this.field_M = new k();
        this.field_L = new um(this);
        this.field_n = new ph(128);
        this.a((byte) -122, 256, -1);
        this.b(true, 12705);
    }

    static {
        field_i = new int[8192];
    }
}
