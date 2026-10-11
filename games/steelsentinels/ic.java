/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends we {
    private int[] field_z;
    private int[] field_A;
    private int[] field_ab;
    private int[] field_Z;
    int[] field_u;
    private int field_W;
    private hj[][] field_x;
    static RgbSprite field_db;
    static me field_T;
    private NodeHashTable field_bb;
    private int[] field_I;
    private hj[][] field_U;
    private int[] field_w;
    private int[] field_t;
    static String field_cb;
    private int field_Q;
    private ab field_M;
    static NodeDeque field_B;
    private int[] field_J;
    int[] field_F;
    private int[] field_N;
    private int[] field_O;
    private int[] field_K;
    private int[] field_Y;
    private int[] field_R;
    int[] field_L;
    static String field_E;
    static NodeDeque field_D;
    static int[] field_eb;
    private boolean field_S;
    private int field_V;
    private ej field_v;
    static int field_P;
    private long field_y;
    private int field_s;
    private long field_X;
    private tg field_H;
    private int field_G;
    private boolean field_C;

    private final void d(int param0, int param1) {
        hj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param1 != 0) {
            field_cb = (String) null;
          }
          if ((4 & this.field_F[param0]) != 0) {
            var3 = (hj) (this.field_v.field_F.first(param1 + 13058));
            while (null != var3) {
              if (var4 != 0) {
                return;
              }
              if (param0 == var3.field_t) {
                var3.field_v = 0;
              }
              var3 = (hj) (this.field_v.field_F.next((byte) -116));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized we d() {
        ej stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = this.field_v;
          return (we) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.FA()");
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        hj var3 = null;
        int var4 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          var3 = (hj) (this.field_v.field_F.first(13058));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
            stackIn_18_0 = param1;
            if (var4 == 0) {
              if ((stackIn_18_0 < 0 ||
                ~var3.field_t == ~param1) &&
                var3.field_J < 0) {
                this.field_U[var3.field_t][var3.field_z] = null;
                var3.field_J = 0;
              }
              var3 = (hj) (this.field_v.field_F.next((byte) -107));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = param0;
          }
          if (stackIn_18_0 != 0) {
            this.c((byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ic.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, long param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != -23543) {
            field_eb = (int[]) null;
          }
          en.field_e = param2;
          ib.field_b = 2;
          bk.field_U = ui.a(1, (CharSequence) ((Object) param2));
          ti.field_p = param1;
          ba.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ic.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void g(int param0, int param1) {
        hj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param1 != 1418611526) {
            this.field_J = (int[]) null;
          }
          var3 = (hj) (this.field_v.field_F.first(param1 - 1418598468));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            if (0 > param0 ||
              param0 == var3.field_t) {
              if (var3.field_A != null) {
                var3.field_A.g(tb.field_g / 100);
                if (var3.field_A.l()) {
                  this.field_v.field_G.b(var3.field_A);
                }
                var3.d(4096);
              }
              if (var3.field_J < 0) {
                this.field_U[var3.field_t][var3.field_z] = null;
              }
              var3.unlink(4);
            }
            var3 = (hj) (this.field_v.field_F.next((byte) -94));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        hj var5 = null;
        hj var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var5 = this.field_U[param0][param2];
          if (null == var5) {
            return;
          }
          this.field_U[param0][param2] = null;
          if (param1 > -79) {
            field_eb = (int[]) null;
          }
          if ((2 & this.field_F[param0]) != 0) {
            var6 = (hj) (this.field_v.field_F.first(13058));
            while (true) {
              if (null != var6) {
                if (var7 != 0) {
                  return;
                }
                if (var5.field_t == var6.field_t &&
                  var6.field_J < 0 &&
                  var6 != var5) {
                  var5.field_J = 0;
                } else {
                  var6 = (hj) (this.field_v.field_F.next((byte) -61));
                  continue;
                }
              }
              break;
            }
            if (var7 == 0) {
              return;
            }
          }
          var5.field_J = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref), "ic.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void b(int param0, byte param1, int param2) {
        try {
          int var4_int = 15 % ((-72 - param1) / 46);
          this.c(-2043373017, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -13) {
            this.a(46, 71, (byte) 34);
          }
          this.a(true, 27830696);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.IA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
          this.field_Z[param0] = param1;
          this.field_u[param0] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
          if (param2 != -17) {
            this.a(-64, -124, -121);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, tg param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          this.a(param3, 27830696);
          this.field_M.a(param2.field_p);
          if (param0) {
            this.a(-78, false);
          }
          this.field_y = 0L;
          this.field_S = param1;
          var5_int = this.field_M.b();
          var6 = 0;
          while (var5_int > var6) {
            this.field_M.d(var6);
            this.field_M.c(var6);
            this.field_M.e(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_V = this.field_M.f();
          this.field_s = this.field_M.field_a[this.field_V];
          this.field_X = this.field_M.b(this.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ic.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, hj param3, int[] param4) {
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        bj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = SteelSentinels.obfuscationControl;
        try {
          param3.field_K = tb.field_g / 100;
          if (param3.field_J >= 0 && (null == param3.field_A ||
            param3.field_A.g())) {
            param3.d(param2 ^ 3043);
            param3.unlink(param2 - 7135);
            if (param3.field_p > 0 &&
              param3 == this.field_x[param3.field_t][param3.field_p]) {
              this.field_x[param3.field_t][param3.field_p] = null;
            }
            return true;
          }
          var6_int = param3.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_t[param3.field_t]) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_y = var6_int;
          }
          param3.field_A.f(this.a((byte) 68, param3));
          var7 = param3.field_E;
          var8 = 0;
          param3.field_C = param3.field_C + var7.field_q;
          param3.field_I = param3.field_I + 1;
          var9 = (double)((param3.field_z - 60 << 8) + (param3.field_x * param3.field_y >> 12)) * 0.000005086263020833333;
          if (var7.field_i > 0) {
            boolean decompiledSharedTail1 = !(var7.field_e <= 0);
            if (!decompiledSharedTail1) {
              param3.field_M = param3.field_M + 128;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              param3.field_M = param3.field_M + (int)(128.0 * Math.pow(2.0, (double)var7.field_e * var9) + 0.5);
            }
            if (var7.field_i * param3.field_M >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_m) {
            if (var7.field_k > 0) {
              param3.field_D = param3.field_D + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_k) + 0.5);
              if (var11 != 0) {
                param3.field_D = param3.field_D + 128;
              }
            } else {
              param3.field_D = param3.field_D + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param3.field_r < var7.field_m.length - 2) {
                stackIn_55_0 = param3.field_D;
                stackIn_55_1 = var7.field_m[2 + param3.field_r] << 8 & 65280;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_55_0 > stackIn_55_1)) {
                  param3.field_r = param3.field_r + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_55_0 = param3.field_r;
                stackIn_55_1 = -2 + var7.field_m.length;
              }
              if (stackIn_55_0 != stackIn_55_1) {
                break;
              }
              if (var7.field_m[param3.field_r + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param3.field_J >= 0 &&
            null != var7.field_p &&
            (this.field_F[param3.field_t] & 1) == 0 && (!(0 <= param3.field_p) ||
            param3 != this.field_x[param3.field_t][param3.field_p])) {
            boolean decompiledSharedTail0 = !(0 >= var7.field_g);
            if (!decompiledSharedTail0) {
              param3.field_J = param3.field_J + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_J = param3.field_J + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (-2 + var7.field_p.length > param3.field_B) {
                stackIn_92_0 = ~param3.field_J;
                stackIn_92_1 = ~((var7.field_p[2 + param3.field_B] & 255) << 8);
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_92_0 < stackIn_92_1)) {
                  param3.field_B = param3.field_B + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_92_0 = ~param3.field_B;
                stackIn_92_1 = ~(var7.field_p.length - 2);
              }
              if (stackIn_92_0 != stackIn_92_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            if (param2 != 7139) {
              this.c(118, 56);
            }
            param3.field_A.a(param3.field_K, this.a(true, param3), this.a(param3, (byte) -3));
            return false;
          }
          param3.field_A.g(param3.field_K);
          if (null != param4) {
            param3.field_A.a(param4, param1, param0);
            if (var11 != 0) {
              param3.field_A.d(param0);
            }
          } else {
            param3.field_A.d(param0);
          }
          if (param3.field_A.l()) {
            this.field_v.field_G.b(param3.field_A);
          }
          param3.d(4096);
          if (param3.field_J >= 0) {
            param3.unlink(param2 ^ 7143);
            if (param3.field_p > 0 &&
              this.field_x[param3.field_t][param3.field_p] == param3) {
              this.field_x[param3.field_t][param3.field_p] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_127_0 = var6;
          stackIn_127_1 = new StringBuilder().append("ic.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          stackIn_131_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',');
          if (param4 == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (!param1) {
            this.c(0, -1);
          }
          if (param1 ||
            var4 != 0) {
            this.g(-1, param0 + 1418611527);
          }
          this.e(param0, -7789);
          var3_int = 0;
          do {
            if (16 <= var3_int) {
              var3_int = 0;
              break;
            }
            this.field_J[var3_int] = this.field_z[var3_int];
            var3_int++;
          } while (var4 == 0);
          while (var3_int < 16) {
            this.field_A[var3_int] = ec.a(this.field_z[var3_int], -128);
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean d(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 90) {
            this.a(30, -72, -114, -17);
          }
          stackIn_4_0 = this.field_M.d();
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.KA(" + param0 + ')');
        }
    }

    private final int a(hj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_I[param0.field_t];
          if (param1 != -3) {
            this.a(99, (byte) 1, -65, -50);
          }
          if (var3_int < 8192) {
            stackIn_7_0 = var3_int * param0.field_O + 32 >> 6;
            return stackIn_7_0;
          }
          stackIn_5_0 = 16384 - (32 + (128 - param0.field_O) * (-var3_int + 16384) >> 6);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ic.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var4_int = 80 % ((17 - param0) / 50);
          if (~this.field_J[param2] != ~param1) {
            this.field_J[param2] = param1;
            var5 = 0;
            while (128 > var5) {
              this.field_x[param2][var5] = null;
              var5++;
              if (var6 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ic.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void d(int param0) {
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_M.d()) {
            var2_int = this.field_M.field_e * this.field_Q / tb.field_g;
            do {
              var3 = this.field_y + (long)var2_int * (long)param0;
              if (this.field_X - var3 >= 0L) {
                this.field_y = var3;
                if (var6 != 0) {
                  return;
                }
                break;
              }
              var5 = (int)(((long)var2_int + (-this.field_y + (this.field_X - 1L))) / (long)var2_int);
              this.field_y = this.field_y + (long)var5 * (long)var2_int;
              this.field_v.d(var5);
              param0 = param0 - var5;
              this.e(1463);
              if (!this.field_M.d()) {
                break;
              }
            } while (var6 == 0);
          }
          this.field_v.d(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.Q(" + param0 + ')');
        }
    }

    final synchronized void a(byte param0) {
        RuntimeException runtimeException = null;
        ca var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          var2 = (ca) (this.field_bb.first(0));
          if (param0 != 25) {
            return;
          }
          while (var2 != null) {
            var2.a((byte) 127);
            var2 = (ca) (this.field_bb.next((byte) 118));
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ic.GA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, byte param2) {
        try {
          if (param2 <= 12) {
            field_D = (NodeDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.TA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        try {
          this.field_O[param1] = param2;
          if (param0 != -27215) {
            this.b();
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, hj param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        int var6Lifetime1;
        try {
          var3_int = param1.field_o + (param1.field_x * param1.field_y >> 12);
          var3_int = var3_int + (this.field_w[param1.field_t] * (-8192 + this.field_O[param1.field_t]) >> 12);
          var4 = param1.field_E;
          if (var4.field_q > 0 && (!(0 >= var4.field_o) ||
            0 < this.field_N[param1.field_t])) {
            var5 = var4.field_o << 2;
            var6 = var4.field_n << 1;
            if (param1.field_I < var6) {
              var5 = param1.field_I * var5 / var6;
            }
            var5 = var5 + (this.field_N[param1.field_t] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_C & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var6Lifetime1 = 99 / ((-24 - param0) / 47);
          var5Lifetime1 = (int)(0.5 + (double)(256 * param1.field_q.field_p) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)tb.field_g);
          stackIn_16_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ic.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        try {
          this.field_W = param0;
          if (param1 != 1000000) {
            this.b(123, 3, -93, -39);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param0 < 0) {
            param0 = 0;
            while (param0 < 16) {
              this.e(param0, -7789);
              param0++;
              if (var4 == 0) {
                continue;
              }
              break;
            }
            return;
          }
          this.field_K[param0] = 12800;
          this.field_I[param0] = 8192;
          this.field_ab[param0] = 16383;
          this.field_O[param0] = 8192;
          this.field_N[param0] = 0;
          if (param1 != -7789) {
            this.field_J = (int[]) null;
          }
          this.field_t[param0] = 8192;
          this.f(-10931, param0);
          this.d(param0, 0);
          this.field_F[param0] = 0;
          this.field_R[param0] = 32767;
          this.field_w[param0] = 256;
          this.field_L[param0] = 0;
          this.a(param0, 8192, (byte) -17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized we b() {
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = null;
          return (we) (stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.SA()");
        }
    }

    final synchronized boolean a(int param0, tg param1, int param2, ub param3, cm param4) {
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ce var8 = null;
        int var9 = 0;
        ca var10 = null;
        int var11 = 0;
        var11 = SteelSentinels.obfuscationControl;
        try {
          param1.b();
          var6_int = 1;
          var7 = null;
          if (0 < param0) {
            var7 = new int[]{param0};
          }
          if (param2 != 21687) {
            this.e(-35);
          }
          var8 = (ce) (param1.field_o.first(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8))) {
            var9 = (int)var8.key;
            var10 = (ca) (this.field_bb.get((long)var9, param2 ^ 21706));
            if (var11 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (null == var10) {
                var10 = vl.a(param4, var9, 40);
                if (null == var10) {
                  var6_int = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_bb.put((long)var9, var10, -1816);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (!var10.a(var8.field_s, param2 - 34109, param3, (int[]) (var7)))) {
                var6_int = 0;
              }
              var8 = (ce) (param1.field_o.next((byte) 94));
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (var6_int != 0)) {
            param1.a();
          }
          stackIn_27_0 = var6_int;
          return stackIn_27_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("ic.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final synchronized void a(boolean param0, boolean param1, tg param2) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_4_1 = !(param0);
          this.a(stackIn_4_1, param1, param2, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ic.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          Throwable throwable = null;
          RuntimeException runtimeException = null;
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            ja.field_h = param1;
            try {
              var3 = param2.getParameter("cookieprefix");
              if (param0 > -123) {
                field_db = (RgbSprite) null;
              }
              var4 = param2.getParameter("cookiehost");
              var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param1.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              hn.a(param2, 27781, "document.cookie=\"" + var5 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            oh.a(param2, (byte) 119);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = runtimeException;
            stackIn_14_1 = new StringBuilder().append("ic.QA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        var8 = SteelSentinels.obfuscationControl;
        try {
          var3_int = param1 & 240;
          if (var3_int == 128) {
            var4 = 15 & param1;
            var5 = 127 & param1 >> 8;
            var6 = (param1 & 8382781) >> 16;
            this.a(var4, (byte) -125, var5, var6);
            return;
          }
          if (var3_int == 144) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = (param1 & 32570) >> 8;
            var6Lifetime1 = (8381338 & param1) >> 16;
            if (var6Lifetime1 <= 0) {
              this.a(var4Lifetime1, (byte) -122, var5Lifetime1, 64);
              if (var8 == 0) {
                return;
              }
            }
            this.b(var5Lifetime1, param0 ^ 21865, var4Lifetime1, var6Lifetime1);
            return;
          }
          if (param0 != 21766) {
            return;
          }
          if (var3_int == 160) {
            var4Lifetime2 = param1 & 15;
            var5Lifetime2 = param1 >> 8 & 127;
            var6Lifetime2 = param1 >> 16 & 127;
            this.a(115, var5Lifetime2, var6Lifetime2, var4Lifetime2);
            return;
          }
          if (var3_int != 176) {
            if (var3_int == 192) {
              var4Lifetime3 = 15 & param1;
              var5Lifetime3 = param1 >> 8 & 127;
              this.a(-36, var5Lifetime3 + this.field_A[var4Lifetime3], var4Lifetime3);
              return;
            }
            if (208 == var3_int) {
              var4Lifetime3Lifetime1 = param1 & 15;
              var5Lifetime3Lifetime1 = (32759 & param1) >> 8;
              this.b(var5Lifetime3Lifetime1, var4Lifetime3Lifetime1, (byte) 108);
              return;
            }
            if (224 == var3_int) {
              var4Lifetime3Lifetime2 = param1 & 15;
              var5Lifetime3Lifetime2 = (16256 & param1 >> 9) + (127 & param1 >> 8);
              this.b(-27215, var4Lifetime3Lifetime2, var5Lifetime3Lifetime2);
              return;
            }
            var3_int = 255 & param1;
            if (var3_int != 255) {
              return;
            }
            this.a(-1, true);
            return;
          }
          var4Lifetime4 = 15 & param1;
          var5Lifetime4 = param1 >> 8 & 127;
          var6Lifetime3 = param1 >> 16 & 127;
          if (var5Lifetime4 == 0) {
            this.field_A[var4Lifetime4] = ec.a(-2080769, this.field_A[var4Lifetime4]) + (var6Lifetime3 << 14);
          }
          if (var5Lifetime4 == 32) {
            this.field_A[var4Lifetime4] = ec.a(this.field_A[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
          if (var5Lifetime4 == 1) {
            this.field_N[var4Lifetime4] = ec.a(-16257, this.field_N[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
          if (33 == var5Lifetime4) {
            this.field_N[var4Lifetime4] = ec.a(-128, this.field_N[var4Lifetime4]) + var6Lifetime3;
          }
          if (var5Lifetime4 == 5) {
            this.field_t[var4Lifetime4] = ec.a(this.field_t[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
          if (37 == var5Lifetime4) {
            this.field_t[var4Lifetime4] = var6Lifetime3 + ec.a(-128, this.field_t[var4Lifetime4]);
          }
          if (var5Lifetime4 == 7) {
            this.field_K[var4Lifetime4] = ec.a(-16257, this.field_K[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
          if (var5Lifetime4 == 39) {
            this.field_K[var4Lifetime4] = ec.a(-128, this.field_K[var4Lifetime4]) + var6Lifetime3;
          }
          if (var5Lifetime4 == 10) {
            this.field_I[var4Lifetime4] = ec.a(this.field_I[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
          if (var5Lifetime4 == 42) {
            this.field_I[var4Lifetime4] = var6Lifetime3 + ec.a(this.field_I[var4Lifetime4], -128);
          }
          if (var5Lifetime4 == 11) {
            this.field_ab[var4Lifetime4] = (var6Lifetime3 << 7) + ec.a(this.field_ab[var4Lifetime4], -16257);
          }
          if (var5Lifetime4 == 43) {
            this.field_ab[var4Lifetime4] = var6Lifetime3 + ec.a(this.field_ab[var4Lifetime4], -128);
          }
          if (var5Lifetime4 == 64) {
            if (64 <= var6Lifetime3) {
              this.field_F[var4Lifetime4] = vn.a(this.field_F[var4Lifetime4], 1);
              if (var8 != 0) {
                this.field_F[var4Lifetime4] = ec.a(this.field_F[var4Lifetime4], -2);
              }
            } else {
              this.field_F[var4Lifetime4] = ec.a(this.field_F[var4Lifetime4], -2);
            }
          }
          if (var5Lifetime4 == 65) {
            if (64 <= var6Lifetime3) {
              this.field_F[var4Lifetime4] = vn.a(this.field_F[var4Lifetime4], 2);
              if (var8 != 0) {
                this.f(param0 ^ -32693, var4Lifetime4);
                this.field_F[var4Lifetime4] = ec.a(this.field_F[var4Lifetime4], -3);
              }
            } else {
              this.f(param0 ^ -32693, var4Lifetime4);
              this.field_F[var4Lifetime4] = ec.a(this.field_F[var4Lifetime4], -3);
            }
          }
          if (var5Lifetime4 == 99) {
            this.field_R[var4Lifetime4] = ec.a(127, this.field_R[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
          if (var5Lifetime4 == 98) {
            this.field_R[var4Lifetime4] = var6Lifetime3 + ec.a(this.field_R[var4Lifetime4], 16256);
          }
          if (var5Lifetime4 == 101) {
            this.field_R[var4Lifetime4] = (var6Lifetime3 << 7) + (ec.a(127, this.field_R[var4Lifetime4]) + 16384);
          }
          if (var5Lifetime4 == 100) {
            this.field_R[var4Lifetime4] = var6Lifetime3 + (ec.a(16256, this.field_R[var4Lifetime4]) + 16384);
          }
          if (120 == var5Lifetime4) {
            this.g(var4Lifetime4, param0 ^ 1418600000);
          }
          if (121 == var5Lifetime4) {
            this.e(var4Lifetime4, -7789);
          }
          if (123 == var5Lifetime4) {
            this.c(0, var4Lifetime4);
          }
          if (6 == var5Lifetime4) {
            var7 = this.field_R[var4Lifetime4];
            if (var7 == 16384) {
              this.field_w[var4Lifetime4] = (var6Lifetime3 << 7) + ec.a(this.field_w[var4Lifetime4], -16257);
            }
          }
          if (var5Lifetime4 == 38) {
            var7Lifetime1 = this.field_R[var4Lifetime4];
            if (var7Lifetime1 == 16384) {
              this.field_w[var4Lifetime4] = ec.a(this.field_w[var4Lifetime4], -128) + var6Lifetime3;
            }
          }
          if (var5Lifetime4 == 16) {
            this.field_L[var4Lifetime4] = ec.a(-16257, this.field_L[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
          if (var5Lifetime4 == 48) {
            this.field_L[var4Lifetime4] = ec.a(-128, this.field_L[var4Lifetime4]) + var6Lifetime3;
          }
          if (var5Lifetime4 == 81) {
            if (64 > var6Lifetime3) {
              this.d(var4Lifetime4, param0 ^ 21766);
              this.field_F[var4Lifetime4] = ec.a(this.field_F[var4Lifetime4], -5);
              if (var8 != 0) {
                this.field_F[var4Lifetime4] = vn.a(this.field_F[var4Lifetime4], 4);
              }
            } else {
              this.field_F[var4Lifetime4] = vn.a(this.field_F[var4Lifetime4], 4);
            }
          }
          if (var5Lifetime4 == 17) {
            this.a(var4Lifetime4, (this.field_Z[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), (byte) -17);
          }
          if (var5Lifetime4 == 49) {
            this.a(var4Lifetime4, (-128 & this.field_Z[var4Lifetime4]) + var6Lifetime3, (byte) -17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, hj param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 58 % ((55 - param1) / 51);
          var4_int = param2.field_q.field_r.length;
          boolean decompiledSharedTail0 = (param0 &&
            param2.field_q.field_s);
          if (!decompiledSharedTail0) {
            var6 = (int)((long)var4_int * (long)this.field_L[param2.field_t] >> 6);
            decompiledSharedTail0 = (SteelSentinels.obfuscationControl != 0);
          }
          if (decompiledSharedTail0) {
            var7 = var4_int - (-var4_int + param2.field_q.field_q);
            var4_int = var4_int << 8;
            var6 = (int)((long)this.field_L[param2.field_t] * (long)var7 >> 6);
            if (var6 >= var4_int) {
              var6 = -var6 - 1 + (var4_int + var4_int);
              param2.field_A.a(true);
            }
          }
          param2.field_A.i(var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ic.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static SceneWidget f(int param0) {
        RuntimeException var1 = null;
        SceneWidget stackIn_2_0 = null;
        SceneWidget stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3443) {
            stackIn_4_0 = ac.k(param0 ^ -8138);
            return stackIn_4_0;
          }
          stackIn_2_0 = (SceneWidget) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.A(" + param0 + ')');
        }
    }

    private final void f(int param0, int param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        hj var3 = null;
        RuntimeException var3_ref = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != -10931) {
            this.field_H = (tg) null;
          }
          if (0 != (this.field_F[param1] & 2)) {
            var3 = (hj) (this.field_v.field_F.first(param0 + 23989));
            while (null != var3) {
              if (var4 != 0) {
                return;
              }
              if (~var3.field_t == ~param1 &&
                this.field_U[param1][var3.field_z] == null &&
                var3.field_J < 0) {
                var3.field_J = 0;
              }
              var3 = (hj) (this.field_v.field_F.next((byte) -65));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ic.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final static ah a(int param0, int param1, boolean param2) {
        kg stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        boolean stackIn_5_4 = false;
        SceneWidget stackIn_37_0 = null;
        String stackIn_38_1 = null;
        SceneWidget stackIn_41_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        ah var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dd var17 = null;
        String var18 = null;
        int var19 = 0;
        dd var17Lifetime1;
        String var18Lifetime1;
        var19 = SteelSentinels.obfuscationControl;
        try {
          stackIn_4_0 = km.field_j.field_Xb;
          stackIn_4_1 = 2;
          stackIn_4_2 = db.field_b + 2;
          stackIn_4_3 = (6 + 3 * db.field_b) * param0;
          stackIn_5_4 = (km.field_j.field_Xb == la.field_c);
          var3_int = ((kg) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, param2, (byte) -41) ? 1 : 0;
          var4 = km.field_j.field_Wb.field_M;
          if (param1 <= 10) {
            field_T = (me) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = null;
          if (qc.field_P == 2) {
            ig.field_m.field_T = true;
            vc.field_h.field_S = db.a(eb.field_r, -66, new String[]{nn.field_f});
            km.field_j.field_Xb.field_Tb.field_S = null;
            var6 = null;
            var7 = (ah) (var4.first(13058));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7))) {
              var8 = 0;
              if (var19 == 0) {
                if (null == var7.field_M) {
                  var7.field_Ub = new SceneWidget(0L, bb.field_W);
                  var7.a(var7.field_Ub, 119);
                  var7.field_ec = new SceneWidget(0L, SteelSentinels.field_J);
                  var7.a(var7.field_ec, 125);
                  var7.field_cc = new SceneWidget(0L, bb.field_W);
                  var7.a(var7.field_cc, 125);
                  var7.field_ec.field_Kb = 2;
                  var7.h(109);
                  var8 = 1;
                }
                var7.field_zb = km.field_j.field_Wb.field_zb;
                var9 = 0;
                if (null != var7.field_ac) {
                  if (var7.field_ac != nn.field_f) {
                    var11 = 16777062;
                    var10 = 13421568;
                  } else {
                    var11 = 6750054;
                    var10 = 52224;
                  }
                } else {
                  var10 = 13369344;
                  var11 = 16737894;
                }
                var12 = 0;
                if (var7.field_Vb != null &&
                  !var7.field_Vb.equals("")) {
                  var7.field_cc.field_Pb = ce.field_p;
                  var7.field_cc.field_rb = var11;
                  var12 = 1;
                  var7.field_cc.a(0, var9, db.field_b, 0, 3 + ce.field_p.field_z);
                }
                var7.field_ec.field_rb = var11;
                var7.field_Ub.field_rb = var11;
                var7.field_ec.field_Mb = var11;
                var7.field_Ub.field_Mb = var11;
                var7.field_ec.field_nb = var10;
                var7.field_Ub.field_nb = var10;
                var7.field_ec.field_xb = var11;
                var7.field_Ub.field_xb = var11;
                var13 = 0;
                var14 = -82 + var7.field_zb;
                if (var12 != 0) {
                  var13 = ce.field_p.field_z + 3;
                  var14 = var14 - var13;
                }
                stackIn_37_0 = var7.field_Ub;
                if (var14 > 0) {
                  stackIn_38_1 = BitmapFont.a(var7.field_Ub.field_L, var7.field_dc, var14);
                } else {
                  stackIn_38_1 = var7.field_dc;
                }
                stackIn_37_0.field_S = stackIn_38_1;
                var7.field_Ub.a(0, var9, db.field_b, var13, var14);
                stackIn_41_0 = var7.field_ec;
                if (null == var7.field_ac) {
                  stackIn_42_1 = oc.field_c;
                } else {
                  stackIn_42_1 = var7.field_ac;
                }
                stackIn_41_0.field_S = stackIn_42_1;
                var7.field_ec.a(0, var9, db.field_b, -80 + var7.field_zb, 80);
                stackIn_46_0 = (var7.field_Ub.field_S.equals(var7.field_dc)) ? 0 : 1;
                var15 = stackIn_46_0;
                var9 = var9 + db.field_b;
                if (var3_int == 0) {
                  var7.field_lb = -var7.field_Lb + var9;
                }
                if (var8 != 0) {
                  km.field_j.field_Wb.a(2, (byte) 96, (SceneWidget) (var6), var7);
                }
                var6 = var7;
                if (var7.field_cc != null &&
                  var7.field_cc.field_kb) {
                  ll.field_i = var7.field_Vb;
                } else if (var7.field_Eb != 0) {
                  var16 = var7.field_dc;
                  kk.a(var7, -1, -1, (int[]) null, var16, (String) null, 1073741824, 0L, km.field_j.field_Xb);
                  var5 = var7;
                  if (null != var7.field_ac &&
                    !ob.a((byte) -38, an.field_i.field_k) &&
                    !fj.field_e) {
                    if (!uc.field_g) {
                      var17 = an.field_i;
                      var18 = db.a(rj.field_c, -67, new String[]{var16});
                      var17.field_j.a(2, 8, var18);
                    }
                    var17Lifetime1 = an.field_i;
                    var18Lifetime1 = db.a(dg.field_b, -96, new String[]{var16});
                    var17Lifetime1.field_j.a(2, 18, var18Lifetime1);
                  }
                } else {
                  if (var7.field_Ub.field_kb &&
                    var15 != 0) {
                    ll.field_i = var7.field_dc;
                  }
                }
                var7 = (ah) (var4.next((byte) -123));
                continue;
              }
              break;
            }
            if ((decompiledNaturalLoopExit0) &&
              (km.field_j.field_bc.field_Eb != 0)) {
              kc.field_y = new el(km.field_j.field_bc.field_Rb, km.field_j.field_bc.field_cb, km.field_j.field_bc.field_zb, km.field_j.field_bc.field_Lb, ij.field_S, kf.field_y, bd.field_f, bd.field_f);
              ol.field_bc = 0;
            }
            if (km.field_j.field_Sb.field_Eb != 0) {
              kc.field_y = new el(km.field_j.field_Sb.field_Rb, km.field_j.field_Sb.field_cb, km.field_j.field_Sb.field_zb, km.field_j.field_Sb.field_Lb, vk.field_b, kf.field_y, bd.field_f, bd.field_f);
              ol.field_bc = 1;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            vc.field_h.field_S = GameApplet.field_a;
            ig.field_m.field_T = false;
            if (qc.field_P == 1) {
              km.field_j.field_Xb.field_Tb.field_S = DualNode.field_q;
              if (var19 != 0) {
                km.field_j.field_Xb.field_Tb.field_S = eb.field_q;
              }
            } else {
              km.field_j.field_Xb.field_Tb.field_S = eb.field_q;
            }
            ue.a(0, km.field_j.field_Wb);
          }
          stackIn_104_0 = var5;
          return (ah) (stackIn_104_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(hj param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_A != null) {
            if (param1) {
              this.field_K = (int[]) null;
            }
            return false;
          }
          if (param0.field_J >= 0) {
            param0.unlink(4);
            if (param0.field_p > 0 &&
              param0 == this.field_x[param0.field_t][param0.field_p]) {
              this.field_x[param0.field_t][param0.field_p] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("ic.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(boolean param0, hj param1) {
        bj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_Y[param1.field_t] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var3 = param1.field_E;
          var4 = this.field_K[param1.field_t] * this.field_ab[param1.field_t] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param1.field_L >> 15;
          var4 = 128 + var4 * this.field_W >> 8;
          if (!param0) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var4 = 128 + this.field_Y[param1.field_t] * var4 >> 8;
          if (var3.field_i > 0) {
            var4 = (int)(Math.pow(0.5, (double)var3.field_i * (0.00001953125 * (double)param1.field_M)) * (double)var4 + 0.5);
          }
          if (var3.field_m != null) {
            var5 = param1.field_D;
            var6 = var3.field_m[param1.field_r + 1];
            if (var3.field_m.length - 2 > param1.field_r) {
              var7 = (var3.field_m[param1.field_r] & 255) << 8;
              var8 = (var3.field_m[2 + param1.field_r] & 255) << 8;
              var6 = var6 + (var5 - var7) * (var3.field_m[3 + param1.field_r] - var6) / (-var7 + var8);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (0 < param1.field_J &&
            null != var3.field_p) {
            var5Lifetime1 = param1.field_J;
            var6Lifetime1 = var3.field_p[param1.field_B + 1];
            if (param1.field_B < -2 + var3.field_p.length) {
              var7Lifetime1 = (255 & var3.field_p[param1.field_B]) << 8;
              var8Lifetime1 = (255 & var3.field_p[2 + param1.field_B]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var3.field_p[3 + param1.field_B]) * (var5Lifetime1 - var7Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          stackIn_24_0 = var4;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_28_0 = var3_ref;
          stackIn_28_1 = new StringBuilder().append("ic.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final synchronized void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 61) {
            this.a(-114, 85, 51, (hj) null, (int[]) null);
          }
          this.field_Q = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.E(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a() {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = 0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "ic.DB()");
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_36_1 = false;
        RuntimeException decompiledCaughtException = null;
        hj var5 = null;
        ca var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6_int = 0;
        sk var6 = null;
        hj var7 = null;
        hj var8 = null;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          boolean decompiledFrameCompleted0 = true;
          this.a(param2, (byte) -87, param0, 64);
          if (0 != (2 & this.field_F[param2])) {
            var5 = (hj) (this.field_v.field_F.b(1063677678));
            while (null != var5) {
              stackIn_17_0 = ~var5.field_t;
              stackIn_17_1 = ~param2;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_17_0 == stackIn_17_1 &&
                var5.field_J < 0) {
                this.field_U[param2][var5.field_z] = null;
                this.field_U[param2][param0] = var5;
                var6_int = (var5.field_y * var5.field_x >> 12) + var5.field_o;
                var5.field_o = var5.field_o + (-var5.field_z + param0 << 8);
                var5.field_y = 4096;
                var5.field_x = -var5.field_o + var6_int;
                var5.field_z = param0;
                return;
              }
              var5 = (hj) (this.field_v.field_F.a(-2137));
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_17_0 = param1;
            stackIn_17_1 = 60;
          }
          if (stackIn_17_0 <= stackIn_17_1) {
            this.field_Q = -42;
          }
          var5_ref = (ca) (this.field_bb.get((long)this.field_J[param2], 124));
          if (null == var5_ref) {
            return;
          }
          var6 = var5_ref.field_x[param0];
          if (null == var6) {
            return;
          }
          var7 = new hj();
          var7.field_t = param2;
          var7.field_q = var6;
          var7.field_N = var5_ref;
          var7.field_E = var5_ref.field_u[param0];
          var7.field_p = var5_ref.field_v[param0];
          var7.field_z = param0;
          var7.field_L = param3 * (param3 * var5_ref.field_t * var5_ref.field_q[param0]) + 1024 >> 11;
          var7.field_O = var5_ref.field_o[param0] & 255;
          var7.field_o = -(var5_ref.field_p[param0] & 32767) + (param0 << 8);
          var7.field_J = -1;
          var7.field_M = 0;
          var7.field_B = 0;
          var7.field_r = 0;
          var7.field_D = 0;
          boolean decompiledSharedTail0 = (0 != this.field_L[param2]);
          if (!decompiledSharedTail0) {
            var7.field_A = em.a(var6, this.a((byte) -78, var7), this.a(true, var7), this.a(var7, (byte) -3));
            decompiledSharedTail0 = (var9 != 0);
          }
          if (decompiledSharedTail0) {
            var7.field_A = em.a(var6, this.a((byte) 100, var7), 0, this.a(var7, (byte) -3));
            stackIn_36_1 = !(var5_ref.field_p[param0] >= 0);
            this.a(stackIn_36_1, -34, var7);
          }
          if (var5_ref.field_p[param0] < 0) {
            var7.field_A.h(-1);
          }
          if (0 <= var7.field_p) {
            var8 = this.field_x[param2][var7.field_p];
            if (var8 != null &&
              var8.field_J < 0) {
              this.field_U[param2][var8.field_z] = null;
              var8.field_J = 0;
            }
            this.field_x[param2][var7.field_p] = var7;
          }
          this.field_v.field_F.addLast(3, var7);
          this.field_U[param2][param0] = var7;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref2), "ic.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_M.g();
          this.field_H = null;
          if (param1 != 27830696) {
            this.field_S = true;
          }
          this.a(param1 ^ -27830697, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ic.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
          int var5_int = -77 / ((-55 - param0) / 46);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (param0 >= 0) {
            this.field_Y[param0] = param2;
          }
          if (param0 < 0 ||
            var5 != 0) {
            var4_int = 0;
            while (var4_int < 16) {
              this.field_Y[var4_int] = param2;
              var4_int++;
              if (var5 != 0) {
                return;
              }
            }
          }
          if (param1 < 2) {
            field_T = (me) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ic.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_M.d()) {
            var4_int = this.field_Q * this.field_M.field_e / tb.field_g;
            do {
              var5 = (long)param2 * (long)var4_int + this.field_y;
              if (-var5 + this.field_X >= 0L) {
                this.field_y = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)((-1L + (-this.field_y + this.field_X + (long)var4_int)) / (long)var4_int);
              this.field_y = this.field_y + (long)var7 * (long)var4_int;
              this.field_v.a(param0, param1, var7);
              this.e(1463);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (!this.field_M.d()) {
                break;
              }
            } while (var8 == 0);
          }
          this.field_v.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ic.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_T = null;
        field_D = null;
        if (param0) {
          return;
        }
        try {
          field_eb = null;
          field_B = null;
          field_E = null;
          field_db = null;
          field_cb = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.J(" + param0 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_z[param2] = param1;
        if (param0 != -2043373017) {
          return;
        }
        try {
          this.field_A[param2] = ec.a(param1, -128);
          this.a(94, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var2_int = this.field_V;
          var3 = this.field_s;
          var4 = this.field_X;
          if (null != this.field_H &&
            ~this.field_G == ~var3) {
            this.a(false, this.field_S, this.field_H, this.field_C);
            this.e(1463);
            return;
          }
          while (true) {
            stackIn_8_0 = var3;
            stackIn_8_1 = this.field_s;
            regionExit1: {
              if (stackIn_8_0 == stackIn_8_1) {
                scanLoop2: while (true) {
                  stackIn_39_0 = ~var3;
                  stackIn_39_1 = ~this.field_M.field_a[var2_int];
                  if (var7 != 0) {
                    break regionExit1;
                  }
                  if (stackIn_39_0 == stackIn_39_1) {
                    this.field_M.d(var2_int);
                    var6 = this.field_M.f(var2_int);
                    stackIn_8_0 = ~var6;
                    stackIn_8_1 = -2;
                    if (stackIn_8_0 == stackIn_8_1) {
                      this.field_M.e();
                      this.field_M.e(var2_int);
                      if (!this.field_M.c() &&
                        var7 == 0) {
                        break scanLoop2;
                      }
                      if (null != this.field_H) {
                        this.a(true, this.field_S, this.field_H);
                        this.e(1463);
                        return;
                      }
                      if (this.field_S &&
                        var3 != 0) {
                        this.field_M.a(var4);
                        break scanLoop2;
                      }
                      this.a(-1, true);
                      this.field_M.g();
                      return;
                    }
                    if ((var6 & 128) != 0) {
                      this.b(21766, var6);
                    }
                    this.field_M.c(var2_int);
                    this.field_M.e(var2_int);
                    continue;
                  }
                  break;
                }
                var2_int = this.field_M.f();
                var3 = this.field_M.field_a[var2_int];
                var4 = this.field_M.b(var3);
                continue;
              }
              this.field_V = var2_int;
              stackIn_39_0 = param0;
              stackIn_39_1 = 1463;
            }
            if (stackIn_39_0 != stackIn_39_1) {
              this.field_bb = (NodeHashTable) null;
            }
            this.field_X = var4;
            this.field_s = var3;
            if (this.field_H != null &&
              this.field_G < var3) {
              this.field_V = -1;
              this.field_s = this.field_G;
              this.field_X = this.field_M.b(this.field_s);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ic.F(" + param0 + ')');
        }
    }

    public ic() {
        this.field_Z = new int[16];
        this.field_w = new int[16];
        this.field_x = new hj[16][128];
        this.field_z = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_t = new int[16];
        this.field_K = new int[16];
        this.field_O = new int[16];
        this.field_Y = new int[16];
        this.field_U = new hj[16][128];
        this.field_Q = 1000000;
        this.field_W = 256;
        this.field_I = new int[16];
        this.field_L = new int[16];
        this.field_N = new int[16];
        this.field_R = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_ab = new int[16];
        this.field_M = new ab();
        this.field_v = new ej(this);
        try {
          this.field_bb = new NodeHashTable(128);
          this.a(-1, (byte) 109, 256);
          this.a(-1, true);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ic.<init>()");
        }
    }

    static {
        field_cb = "Please send me news and updates (I can unsubscribe at any time)";
        field_T = null;
        field_B = new NodeDeque();
        field_E = "CAMPAIGN TIME: ";
        field_D = new NodeDeque();
    }
}
