/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends kd {
    private int[] field_u;
    private cg field_D;
    private int field_s;
    private vk field_w;
    private int field_I;
    private int field_t;
    private boolean field_A;
    static tg[] field_y;
    private vk field_z;
    static String field_r;
    private int[] field_C;
    private boolean field_G;
    private cg field_v;
    private cg field_E;
    private int field_F;
    private vk field_p;
    private static ko field_q;
    static vh field_x;
    static String[] field_H;
    static int[] field_B;

    final static void c(int param0) {
        if (param0 != 946) {
          return;
        }
        pj.field_H = new ko();
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Pool.field_O;
        try {
          if (this.field_F <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_G) {
            if (0 < this.field_s &&
              !this.field_z.d(-11414)) {
              this.field_s = -this.field_s;
              this.field_D = null;
              this.field_G = false;
            } else {
              if (this.field_s < 0 &&
                !this.field_w.d(-11414)) {
                this.field_E = null;
                this.field_s = -this.field_s;
                this.field_G = false;
              }
            }
          }
          var4_int = this.field_F * (this.field_t >> 12) / 256;
          var5 = -var4_int + this.field_F;
          if (0 != this.field_s) {
            this.field_t = this.field_t + param2 * this.field_s;
            if (this.field_t >= 1048576) {
              this.field_t = 1048576;
              if (!this.field_G) {
                this.field_s = 0;
                if (!this.field_A) {
                  if (this.field_E != null) {
                    this.field_w.e(-1);
                  }
                  this.field_E = null;
                }
              }
            } else {
              if (0 >= this.field_t) {
                this.field_t = 0;
                if (!this.field_G) {
                  this.field_s = 0;
                  if (!this.field_A) {
                    if (this.field_D != null) {
                      this.field_z.e(-1);
                    }
                    this.field_D = null;
                  }
                }
              }
            }
          }
          if (bp.field_r) {
            stackIn_36_0 = param2 << 1;
          } else {
            stackIn_36_0 = param2;
          }
          var6 = stackIn_36_0;
          if (this.field_I < 256 && (null != this.field_D ||
            null != this.field_E)) {
            if (256 != var4_int) {
              if (var5 != 256) {
                if (null != this.field_u &&
                  this.field_u.length >= var6) {
                  qn.a(this.field_u, 0, var6);
                  qn.a(this.field_C, 0, var6);
                } else {
                  this.field_C = new int[var6];
                  this.field_u = new int[var6];
                }
                this.field_z.a(this.field_u, 0, param2);
                this.field_w.a(this.field_C, 0, param2);
                if (!bp.field_r) {
                  stackIn_50_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_50_0 = localTemp$0;
                }
                var7 = stackIn_50_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_C[var8] * var5 + var4_int * this.field_u[var8] >> 8);
                }
              } else {
                this.field_w.a(param0, param1, param2);
              }
            } else {
              this.field_z.a(param0, param1, param2);
            }
          }
          if (null != this.field_v) {
            if (0 == this.field_I) {
              return;
            }
            if (null != this.field_u &&
              var6 <= this.field_u.length) {
              qn.a(this.field_u, 0, var6);
            } else {
              this.field_u = new int[var6];
              this.field_C = new int[var6];
            }
            this.field_p.a(this.field_u, 0, param2);
            if (!bp.field_r) {
              stackIn_65_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_65_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_65_0;
            var8Lifetime1 = this.field_I * this.field_F / 256;
            var9 = this.field_F - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = var9 * param0[var10 + var7Lifetime1] + var8Lifetime1 * this.field_u[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_71_0 = var4;
          stackIn_71_1 = new StringBuilder().append("rq.E(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static kf a(int param0, nb param1) {
        kf var2 = null;
        RuntimeException var2_ref = null;
        kf stackIn_2_0 = null;
        kf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new kf(param1, param1);
          if (param0 < 93) {
            stackIn_2_0 = (kf) null;
            return stackIn_2_0;
          }
          mp.field_R.b((byte) -108, var2);
          wm.field_Xb.b(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        String dupTemp$0 = null;
        uf stackIn_8_0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_16_1 = null;
        uf var2;
        String var3;
        int var4;
        String var5;
        String var6;
        String var3Lifetime1;
        if (param0 != 0) {
          rq.c(-63);
        }
        if (ok.field_pb.length > param1 &&
          0L != (1L << param1 & pd.field_i)) {
          if (null == ba.field_ub) {
            stackIn_8_0 = am.field_e;
          } else {
            stackIn_8_0 = ba.field_ub;
          }
          var2 = stackIn_8_0;
          if (var2 != null) {
            var6 = new String(new char[]{(char)65, (char)108, (char)116, (char)32});
            var3 = var6;
            var4 = param1 / 10;
            if (0 != (2 & var4)) {
              var3 = var6 + "Ctrl ";
            }
            if ((1 & var4) != 0) {
              var3 = var3 + "Shift ";
            }
            stackIn_15_0 = new StringBuilder().append(var3);
            if (param1 % 10 < 9) {
              stackIn_16_1 = Integer.toString(param1 % 10 + 1);
            } else {
              stackIn_16_1 = "0";
            }
            dupTemp$0 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_16_1).toString();
            var5 = dupTemp$0;
            var3Lifetime1 = dupTemp$0;
            gj.a(true, 0, var5 + ": " + ok.field_pb[param1][0], ok.field_pb[param1][1]);
          }
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_H = null;
        field_q = null;
        field_y = null;
        field_r = null;
        if (param0 < 42) {
          return;
        }
        field_B = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        wg.field_Nb[jh.field_c] = param1;
        ep.field_H[jh.field_c] = jh.field_c;
        kb.field_g[jh.field_c] = param3;
        if (q.field_a < param3) {
          jl.field_c = param3;
        }
        if (!(gr.field_z <= param3)) {
          rn.field_d = param3;
        }
        ob.field_y[jh.field_c] = param4;
        om.field_s[jh.field_c] = param5;
        gd.field_d[jh.field_c] = param0;
        if (!param2) {
          return;
        }
        int var6 = param5 + (param4 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param4 / var6;
        ah.field_c[jh.field_c] = var7;
        if (var7 < rn.field_d) {
          rn.field_d = var7;
        }
        if (!(var7 <= jl.field_c)) {
          jl.field_c = var7;
        }
        jh.field_c = jh.field_c + 1;
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = Pool.field_O;
        if (this.field_t > 0) {
          if (null != this.field_D) {
            this.field_z.a(param0);
            if (this.field_t >= 1048576) {
              if ((!(this.field_I <= 0)) &&
                ((null != this.field_v))) {
                this.field_p.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_E) {
                if ((!(this.field_I <= 0)) &&
                  ((null != this.field_v))) {
                  this.field_p.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_w.a(param0);
              }
            }
          } else {
            if (this.field_t >= 1048576) {
              if ((!(this.field_I <= 0)) &&
                ((null != this.field_v))) {
                this.field_p.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_E) {
                if ((!(this.field_I <= 0)) &&
                  ((null != this.field_v))) {
                  this.field_p.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_w.a(param0);
              }
            }
          }
        } else {
          if (this.field_t >= 1048576) {
            if ((!(this.field_I <= 0)) &&
              ((null != this.field_v))) {
              this.field_p.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.field_E) {
              if ((!(this.field_I <= 0)) &&
                ((null != this.field_v))) {
                this.field_p.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_w.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_I > 0 &&
          null != this.field_v)) {
          this.field_p.a(param0);
        }
        if (this.field_G) {
          if (this.field_s > 0 &&
            !this.field_z.d(-11414)) {
            this.field_G = false;
            this.field_s = -this.field_s;
            this.field_D = null;
          } else {
            if (this.field_s < 0 &&
              !this.field_w.d(-11414)) {
              this.field_E = null;
              this.field_s = -this.field_s;
              this.field_G = false;
            }
          }
        }
        if (this.field_s != 0) {
          this.field_t = this.field_t + param0 * this.field_s;
          if (this.field_t < 1048576) {
            if (this.field_t <= 0) {
              this.field_t = 0;
              if (!this.field_G) {
                this.field_s = 0;
                if (!this.field_A) {
                  if (this.field_D != null) {
                    this.field_z.e(-1);
                  }
                  this.field_D = null;
                }
              }
            }
          } else {
            this.field_t = 1048576;
            if (!this.field_G) {
              this.field_s = 0;
              if (!this.field_A) {
                if (null != this.field_E) {
                  this.field_w.e(-1);
                }
                this.field_E = null;
              }
            }
          }
        }
    }

    final static boolean a(int param0, int param1, boolean param2, double param3, int param4, double[] param5, int[] param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = param4 - 320;
          var9 = param1 - 240;
          var10 = -param3 * (double)((float)param6[6] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[9]) * -param3 + (double)((float)var8_int * ((float)param6[3] * 0.0000152587890625f)) * -param3 / 512.0);
          var12 = (double)(0.0000152587890625f * (float)param6[10]) * -param3 + (double)((float)var8_int * ((float)param6[4] * 0.0000152587890625f)) * -param3 / 512.0 + (double)((float)var9 * ((float)param6[7] * 0.0000152587890625f)) * -param3 / 512.0;
          var14 = -param3 * (double)((float)param6[8] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[11]) * -param3 + (double)((float)var8_int * (0.0000152587890625f * (float)param6[5])) * -param3 / 512.0);
          var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
          var14 = var14 / var16;
          var12 = var12 / var16;
          var10 = var10 / var16;
          var18 = (double)(-param6[2] + param0) / var14;
          if (param2) {
            rq.a((byte) -106, -122);
          }
          param5[0] = ((double)param6[0] + var10 * var18) / 8.0;
          param5[1] = ((double)param6[1] + var12 * var18) / 8.0;
          return ((0.0 > var14));
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        fr var6_ref_fr = null;
        int var7 = 0;
        byte[] var8 = null;
        fr var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        fr var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = Pool.field_O;
        try {
          if (ld.field_c != 0) {
            var2_long = rl.a((byte) -94);
            var4 = ld.field_c;
            if (u.field_b != 0.0) {
              var4 = (int)((double)var4 + lc.field_P.nextGaussian() * u.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            if (0 < ej.field_j.field_v) {
              var14 = new byte[ej.field_j.field_v];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var6 < var14.length; var6++) {
                var8[var6] = ej.field_j.field_t[var6];
              }
              var6_ref_fr = new fr((long)var4 + var2_long, ej.field_j.field_v, var17);
              field_q.b((byte) 90, var6_ref_fr);
              ej.field_j.field_v = 0;
            }
            var9 = (fr) (field_q.c((byte) -73));
            var13 = var9;
            if (var13 != null &&
              var13.field_p < var2_long) {
              var13.a((byte) -117);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.field_r) {
                ej.field_j.field_t[var10] = var9.field_l[var10];
                var10++;
              }
              ej.field_j.field_v = var13.field_r;
            }
          }
          if (param0 >= -16) {
            rq.a((byte) -17, -81);
          }
          de.a(param1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "rq.L(" + param0 + ',' + param1 + ')');
        }
    }

    final kd a() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_F = param0;
        if (param1 != 11557) {
          field_H = (String[]) null;
        }
    }

    final synchronized int d() {
        return 2;
    }

    final kd b() {
        return null;
    }

    private rq() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_y = new tg[255];
        field_r = "This is your RuneScape clan if you have one.";
        for (var0 = 0; var0 < field_y.length; var0++) {
          field_y[var0] = new tg();
        }
        field_B = new int[]{20, 21, 49, 6, 8};
    }
}
