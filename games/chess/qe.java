/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends uk {
    static String field_R;
    private int[] field_H;
    private double field_T;
    private int field_I;
    private double field_w;
    private int[] field_r;
    private double field_t;
    static dd[] field_u;
    private int field_C;
    private double field_s;
    static java.applet.Applet field_B;
    static String field_O;
    private int field_Q;
    static String field_y;
    private km field_M;
    private km field_A;
    private km field_S;
    private dd field_v;
    private km field_F;
    private km field_p;
    private double[] field_D;
    private km[] field_N;
    private int[] field_G;
    private km field_q;
    private int[] field_x;
    private km[] field_z;
    qe field_K;
    private int field_P;
    String[] field_L;

    private final void a(int param0, int param1, int param2, int[] param3) {
        int var15 = 0;
        int var5;
        int var6;
        int var7;
        km[] var8_ref_km__;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var14;
        int var16;
        int var17;
        int var18;
        int var19;
        dd var20;
        dd var21;
        dd var22;
        int[] var23;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var5 = hn.field_k;
        var6 = rf.field_b;
        this.field_j = -1;
        if (qk.field_k == null) {
          qk.field_k = new km(0, 0);
        }
        qk.field_k.field_x = wb.field_d;
        qk.field_k.field_w = wb.field_h;
        qk.field_k.field_t = wb.field_c;
        if (hd.field_f != null) {
          hd.field_f.e();
          wb.b();
        } else {
          hd.field_f = new km(wb.field_h, wb.field_c);
          hd.field_f.e();
        }
        this.a(param3, param1, 64, -13147);
        if (rn.field_b != 0 &&
          t.field_Q) {
          this.field_A.e();
          wb.b();
        }
        wb.a(qk.field_k.field_x, qk.field_k.field_w, qk.field_k.field_t);
        if (t.field_Q) {
          for (var7 = 0; var7 < this.field_z.length; var7++) {
            var8_ref_km__ = this.field_z;
            var9 = var7;
            this.field_N[var7] = null;
            var8_ref_km__[var9] = null;
          }
        }
        var7Lifetime1 = 0;
        var8 = this.d(-1);
        var9Lifetime1 = this.m(94);
        var14 = new int[]{640, 480, 0, 0};
        for (var15 = 63; var15 >= 0; var15--) {
          var16 = this.field_r[var15];
          var17 = this.field_f[var16];
          if (var16 == var8) {
            var17 = this.field_f[var9Lifetime1];
          }
          var18 = var17 & 16773120;
          var19 = var17 & -16773121;
          if (var18 != 0) {
            var20 = ad.field_f[var19];
            var21 = ig.field_f[var19];
            var22 = pj.field_c[var19];
          } else {
            var20 = se.field_N[var19];
            var21 = jj.field_c[var19];
            var22 = q.field_b[var19];
          }
          boolean decompiledFrameRemainder0 = true;
          if (var20 != null) {
            param0 = var16 % 8;
            param2 = var16 / 8;
            param0 -= 4;
            param2 -= 4;
            var23 = new int[]{64 + (param0 << 7), param1 << 7, 64 + (param2 << 7), 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
            if (rn.field_b != 0 &&
              t.field_Q &&
              var16 != var8) {
              this.field_A.e();
              var21.a(param3, var23);
              this.field_M.e();
              var22.a(param3, var23);
              var22.a();
              var11 = dd.field_x;
              var13 = dd.field_D;
              var10 = dd.field_Z;
              var12 = dd.field_eb;
              if (var14[0] > var11) {
                var14[0] = var11;
              }
              if (var14[1] > var13) {
                var14[1] = var13;
              }
              if (var14[2] > var10) {
                var14[2] = var10;
              }
              if (var14[3] > var12) {
                var14[3] = var12;
              }
              this.field_N[var7Lifetime1] = new km(var10 - var11 + 2, var12 - var13 + 2);
              this.field_N[var7Lifetime1].e();
              this.field_M.b(1 - var11, 1 - var13);
              this.field_N[var7Lifetime1].field_s = var11;
              this.field_N[var7Lifetime1].field_r = var13;
              this.field_N[var7Lifetime1].a(64, 64, 64);
              this.field_M.e();
              wb.b(var11, var13, var10, var12);
              wb.f(0, 0, 640, 480, 0);
            }
            if (t.field_Q) {
              this.field_M.e();
              var20.a(param3, var23);
              var20.a();
              var10Lifetime1 = dd.field_Z;
              var11Lifetime1 = dd.field_x;
              var12Lifetime1 = dd.field_eb;
              var13Lifetime1 = dd.field_D;
              this.field_z[var7Lifetime1] = new km(var10Lifetime1 - var11Lifetime1 + 2, var12Lifetime1 - var13Lifetime1 + 2);
              this.field_z[var7Lifetime1].e();
              this.field_M.b(1 - var11Lifetime1, 1 - var13Lifetime1);
              this.field_z[var7Lifetime1].field_s = var11Lifetime1;
              this.field_z[var7Lifetime1].field_r = var13Lifetime1;
              this.field_M.e();
              wb.b(var11Lifetime1, var13Lifetime1, var10Lifetime1, var12Lifetime1);
              wb.f(0, 0, 640, 480, 0);
              decompiledFrameRemainder0 = (jc.field_f == -1);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (this.field_z[var7Lifetime1] != null))) {
                decompiledFrameRemainder0 = !(!this.field_z[var7Lifetime1].c(0, 0, var5, var6));
              }
            } else {
              decompiledFrameRemainder0 = (jc.field_f == -1);
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (this.field_z[var7Lifetime1] != null))) {
                decompiledFrameRemainder0 = !(!this.field_z[var7Lifetime1].c(0, 0, var5, var6));
              }
            }
            if (decompiledFrameRemainder0) {
              this.field_j = var16;
            }
          }
          var7Lifetime1++;
        }
        wb.a(qk.field_k.field_x, qk.field_k.field_w, qk.field_k.field_t);
        wb.a();
        this.g(-1, var8);
        t.field_Q = false;
    }

    private final void b(int param0, int param1, byte param2) {
        int var4;
        int var5;
        km var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        km var12;
        km var13;
        km var14;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        km var6Lifetime1;
        km var6Lifetime2;
        km var13Lifetime1;
        km var13Lifetime2;
        var11 = Chess.field_G;
        this.e(-73);
        this.field_S.b(0, 0);
        if (rn.field_b != 0) {
          this.field_A.b(0, 0, 128);
        }
        var4 = 0;
        if (param2 < 19) {
          return;
        }
        while (this.field_z.length > var4) {
          var5 = this.field_r[-var4 - 1 + this.field_z.length];
          var12 = this.field_z[var4];
          var13 = var12;
          var6 = var13;
          var13Lifetime1 = var12;
          var6Lifetime1 = var13Lifetime1;
          var6Lifetime2 = var12;
          if (var12 != null) {
            if (param0 == var5) {
              var7 = (int)(Math.sin((double)qb.field_a / 10.0) * 32.0);
              var8 = var7;
              var9 = -var7 / 4;
              var10 = -3 * var7 / 4;
              var13Lifetime2 = var12.c();
              var6Lifetime2 = var13Lifetime2;
              var13Lifetime2.a(var8, var9, var10);
            }
            var7Lifetime1 = 192 + (int)(Math.sin((double)qb.field_a / 10.0) * 63.0);
            if (var5 == this.field_m) {
              var14 = var6Lifetime2.c();
              var6Lifetime2 = var14;
              var14.f(16711680);
            }
            if (var5 != this.field_j) {
              if (param1 == var5) {
                var6Lifetime2.b(0, 0, (-128 + var7Lifetime1) / 2);
              } else {
                var6Lifetime2.b(0, 0);
              }
            } else {
              if (this.field_f[var5] == 0) {
                var9Lifetime1 = pj.field_b[var5];
              } else {
                var9Lifetime1 = this.field_f[var5] & 16773120;
              }
              var8Lifetime1 = (var9Lifetime1 == 0) ? 0 : 8421504;
              if (var5 == param1) {
                var6Lifetime2.b(0, 0, (var7Lifetime1 - 128) / 2);
              } else {
                var6Lifetime2.b(0, 0, var7Lifetime1, var8Lifetime1);
              }
            }
          }
          var4++;
        }
    }

    private final void e(int param0) {
        int[] var5 = wb.field_d;
        int[] var2 = var5;
        if (param0 >= -36) {
          return;
        }
        int var3 = wb.field_h;
        int var4 = wb.field_c;
        this.field_S.e();
        wb.b(this.field_x);
        this.field_p.e(0, 0);
        wb.a(this.field_x);
        wb.a(var5, var3, var4);
    }

    private final int d(int param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        for (var2 = param0 + this.field_h.length; 0 <= var2; var2--) {
          if (null == this.field_h[var2]) {
            continue;
          }
          break;
        }
        if (var2 == -1) {
          return -1;
        }
        return this.field_h[var2].field_f;
    }

    private final void c(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        bn var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var12_intLifetime1;
        var13 = Chess.field_G;
        try {
          if (this.d(-1) != -1 &&
            this.m(79) != -1) {
            var5_int = this.d(-1) / 8;
            var6 = this.d(-1) % 8;
            var7 = this.m(81) / 8;
            var5_int = var5_int * 132;
            var6 = var6 * 132;
            var8 = this.m(89) % 8;
            var5_int -= 528;
            var7 = var7 * 132;
            var6 -= 528;
            var8 = var8 * 132;
            var8 -= 528;
            var7 -= 528;
            if (var6 != 2147483647 &&
              var8 != 2147483647) {
              var9 = (byte)(int)(33.0 * Math.sin((double)r.field_Eb / 10.0) + 64.0);
              var16 = (int[]) ((Object) this.field_H.clone());
              var15 = var16;
              var10 = var15;
              se.a(var8, var16, 45, (byte) 49, var5_int, var7, var6);
              var11 = new bn(var16.length >> 1, 5, 0);
              for (var12_int = 0; var16.length > var12_int; var12_int += 2) {
                var11.a(var16[var12_int], 0, var10[1 + var12_int]);
              }
              var11.a(0, 6, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
              var11.a(2, 1, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
              var11.a(1, 5, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
              var11.a(5, 4, 3, (byte) 1, (byte) -1, (short) 960, (short) -1);
              var11.a(6, 5, 1, (byte) 1, (byte) -1, (short) 960, (short) -1);
              for (var12_intLifetime1 = 0; var11.field_D.length > var12_intLifetime1; var12_intLifetime1++) {
                var11.field_D[var12_intLifetime1] = (byte)var9;
              }
              this.field_v = (dd) (var11.a(100, 131072, 10, 10, 10));
              var12 = new int[]{param3, param2 << 7, param3, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
              this.field_v.a(param0, var12);
            }
          }
          if (param1 >= -85) {
            var14 = (int[]) null;
            this.a((int[]) null, 52, 43, 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("qe.U(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        double var4;
        int var6;
        double var6_double;
        double var8;
        int var10;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        double var4Lifetime1;
        var10 = Chess.field_G;
        for (var2 = 0; var2 < 8; var2++) {
          for (var3 = 0; 8 > var3; var3++) {
            var4 = (double)(this.field_I + (4 - var2));
            var6_double = (double)this.field_C;
            var8 = (double)(-var3 + (4 + this.field_Q));
            this.field_D[8 * var3 + var2] = var8 * var8 + (var6_double * var6_double + var4 * var4);
          }
        }
        for (var2Lifetime1 = 63; 0 <= var2Lifetime1; var2Lifetime1--) {
          this.field_G[var2Lifetime1] = var2Lifetime1;
        }
        if (param0 > -77) {
          this.field_Q = 62;
        }
        var2Lifetime2 = 1;
        while (var2Lifetime2 != 0) {
          var2Lifetime2 = 0;
          for (var3Lifetime1 = 63; var3Lifetime1 > 0; var3Lifetime1--) {
            if (this.field_D[var3Lifetime1] < this.field_D[var3Lifetime1 - 1]) {
              var4Lifetime1 = this.field_D[var3Lifetime1];
              var6 = this.field_G[var3Lifetime1];
              this.field_D[var3Lifetime1] = this.field_D[-1 + var3Lifetime1];
              this.field_D[-1 + var3Lifetime1] = var4Lifetime1;
              this.field_G[var3Lifetime1] = this.field_G[-1 + var3Lifetime1];
              var2Lifetime2 = 1;
              this.field_G[var3Lifetime1 - 1] = var6;
            }
          }
        }
        this.field_r = this.field_G;
    }

    qe(boolean param0) {
        this.field_w = 0.5;
        this.field_H = new int[]{-2, 0, -2, 35, -6, 35, 0, 45, 6, 35, 2, 35, 2, 0};
        this.field_t = 0.5;
        this.field_T = 0.5;
        this.field_r = new int[64];
        this.field_s = 0.5;
        this.field_M = new km(640, 480);
        this.field_A = new km(640, 480);
        this.field_S = new km(640, 480);
        this.field_p = new km(640, 480);
        this.field_D = new double[64];
        this.field_N = new km[64];
        this.field_G = new int[64];
        this.field_x = new int[4];
        this.field_z = new km[64];
        this.field_q = new km(640, 480);
        this.field_P = -1;
        this.c((byte) -110);
        this.a(-0.7853981633974483, param0 ? 3.141592653589793 : 0.0, true);
    }

    final boolean b(byte param0) {
        if (param0 != 15) {
          this.field_S = (km) null;
        }
        return this.a(this.field_s, (byte) 42, this.field_w);
    }

    qe() {
        this(true);
    }

    private final void a(int[] param0, int param1, int param2, int param3) {
        int var11 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var12 = null;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        var15 = Chess.field_G;
        try {
          if (param3 != -13147) {
            this.field_G = (int[]) null;
          }
          var19 = wb.field_d;
          var8 = wb.field_h;
          var9 = wb.field_c;
          this.field_S.e();
          wb.b();
          var10 = -1;
          if (oc.field_p != null) {
            if (oc.field_p.field_b) {
              if (oc.field_p.field_B.field_l == oc.field_p.field_a) {
                var10 = oc.field_p.field_C;
              }
            } else {
              var10 = oc.field_p.field_C;
            }
          }
          for (var11 = 0; var11 < pj.field_b.length; var11++) {
            var5_int = var11 % 8;
            var6 = var11 / 8;
            var6 -= 4;
            var5_int -= 4;
            var12 = new int[]{param2 + (var5_int << 7), param1 << 7, param2 + (var6 << 7), 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
            var14 = this.a(var10, var11, -103) ? 1 : 0;
            if (pj.field_b[var11] == 0) {
              if (var14 != 0) {
                var13 = mm.field_a;
              } else {
                var13 = rm.field_H;
              }
            } else {
              if (var14 == 0) {
                var13 = bd.field_b;
              } else {
                var13 = mh.field_f;
              }
            }
            var13.a(param0, var12);
            if (jc.field_f == -1 &&
              this.field_j == -1 &&
              this.field_S.c(0, 0, hn.field_k, rf.field_b)) {
              this.field_j = var11;
            }
          }
          this.c(param0, -119, param1, param2);
          wb.a(var19, var8, var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("qe.M(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        jh.field_e.a(true, 0, 0);
        if (param0 != -31) {
          field_O = (String) null;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        double[] var5 = new double[]{(double)(-this.field_I), (double)(-this.field_C), (double)(-this.field_Q)};
        if (param0 > -60) {
          field_R = (String) null;
        }
        double[] var6 = new double[]{0.0, 1.0, 0.0};
        double[] var7 = new double[]{1.0, 0.0, 0.0};
        int[] var11 = this.a(var7, var6, var5, (byte) -40);
        int[] var10 = var11;
        int[] var8 = var10;
        int var9 = -420 + (int)((-this.field_t + 3.141592653589793) * 400.0 / 3.141592653589793);
        var8[0] = (int)((double)var8[0] - (double)var9 * qn.a(-17513, this.field_T));
        var8[2] = (int)((double)var8[2] - mn.a(this.field_T, 2278) * (double)var9);
        if (this.field_F == null) {
          this.field_F = new km(640, 480);
          vk.field_e = true;
        }
        if (vk.field_e) {
          this.b(var11, var2, 0, var4);
        }
        this.field_F.d(0, 0);
        this.a(var2, var3, var4, var11);
        this.b(this.m(93), this.d(-1), (byte) 122);
    }

    public static void k(int param0) {
        field_B = null;
        if (param0 != 2) {
          field_R = (String) null;
        }
        field_O = null;
        field_R = null;
        field_u = null;
        field_y = null;
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_6_3 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        int[] var11 = null;
        int var12 = 0;
        dd var13 = null;
        dd var14 = null;
        dd var14Lifetime1;
        dd var14Lifetime2;
        var12 = Chess.field_G;
        try {
          qk.field_k.field_t = wb.field_c;
          qk.field_k.field_w = wb.field_h;
          vk.field_e = false;
          qk.field_k.field_x = wb.field_d;
          this.field_F.e();
          var5_int = 170 + ((int)(500.0 * this.field_t) + ec.c((byte) -63) / 2);
          wb.b();
          if (ph.field_f != null) {
            var6_int = -(int)((double)ph.field_f.field_w * this.field_T / 6.283185307179586);
            var7 = var5_int - 120;
            ph.field_f.b(var6_int, var7);
            ph.field_f.b(-ph.field_f.field_w + var6_int, var7);
            ph.field_f.b(var6_int + ph.field_f.field_w, var7);
          }
          stackIn_5_0 = 0;
          stackIn_5_1 = var5_int;
          stackIn_5_2 = 640;
          if (rn.field_b == 2) {
            stackIn_6_3 = 126;
          } else {
            stackIn_6_3 = 480 - var5_int;
          }
          wb.f(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_6_3, rh.field_a[qm.field_g]);
          if (0 != rn.field_b) {
            for (var6_int = -16; var6_int <= 16; var6_int += 4) {
              for (var7 = -16; var7 <= 16; var7 += 4) {
                var8_ref_int__ = new int[]{var7 + param1 << 7, 42, var6_int + param3 << 7, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                ei.field_q.a(param0, var8_ref_int__);
              }
            }
          }
          if (2 == rn.field_b) {
            for (var6_int = 0; var6_int < 2; var6_int++) {
              for (var7 = -16; var7 <= 16; var7++) {
                for (var8 = -16; var8 <= 16; var8++) {
                  if (!(6 > Math.abs(var7)) ||
                    !(Math.abs(var8) < 6)) {
                    var9 = wc.field_z[qm.field_g][16 + var8][var7 + 16];
                    if ((0 != var6_int ||
                      11 > var9) && (var6_int != 1 ||
                      var9 >= 11) && (var9 > 0 &&
                      var9 < dn.field_h[qm.field_g])) {
                      var13 = am.field_c[var9];
                      var14 = var13;
                      var14Lifetime1 = var13;
                      var11 = new int[]{var8 + param1 << 7, 42, var7 + param3 << 7, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                      if (var13 != null) {
                        var13.a(param0, var11);
                      }
                      var14Lifetime2 = field_u[var9];
                      if (var14Lifetime2 != null) {
                        var14Lifetime2.a(param0, var11);
                      }
                    }
                  }
                }
              }
            }
          }
          var6 = new int[]{param2, -6, 0, 63488, 0, 0, 0, 63488, 0, 0, 0, 63488};
          if (rn.field_b != 0) {
            sl.field_g.a(param0, var6);
          }
          qk.field_k.e();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_53_0 = var5;
          stackIn_53_1 = new StringBuilder().append("qe.K(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String a(int param0, byte param1) {
        int var3 = -16773121 & param0;
        if (param1 <= 2) {
          this.a(true, false, 105, 28, (byte) -18, false);
        }
        return jf.field_c[var3];
    }

    final void g(int param0) {
        int discarded$0 = 0;
        this.field_w = this.field_T;
        this.field_s = this.field_t;
        if (param0 != 1) {
          discarded$0 = this.d(-31);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4;
        int stackIn_16_0 = 0;
        if (param2 >= -74) {
          return false;
        }
        if (!this.field_d[param1]) {
          if (this.field_f[param1] != 0) {
            if (this.field_m == -1) {
              if (-1 != param0) {
                if (param0 == (this.field_f[param1] & 16773120)) {
                  stackIn_16_0 = (this.a(param0, param1, (byte) -12)) ? 1 : 0;
                } else {
                  stackIn_16_0 = 0;
                }
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
          } else {
            stackIn_16_0 = 0;
          }
        } else {
          stackIn_16_0 = 1;
        }
        var4 = stackIn_16_0;
        return var4 != 0;
    }

    final void f(int param0) {
        this.a(0.04908738521234052 + this.field_t, this.field_T, true);
        if (param0 != -4083) {
          int[] var3 = (int[]) null;
          this.a(64, 34, -72, (int[]) null);
        }
    }

    private final String h(int param0, int param1) {
        int var3 = param1 / 8;
        int var4 = param1 % 8;
        int var5 = -65 % ((55 - param0) / 50);
        return sj.field_j[var4] + (1 + var3);
    }

    final int a(boolean param0, boolean param1, int param2, int param3, byte param4, boolean param5) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        c stackIn_75_0 = null;
        String[] stackIn_75_1 = null;
        int stackIn_76_2 = 0;
        c stackIn_78_0 = null;
        int stackIn_79_1 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13_int;
        String[] var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        km var25;
        km var26;
        int[] var30;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime2Lifetime1;
        var24 = Chess.field_G;
        qk.field_k.field_w = wb.field_h;
        qk.field_k.field_x = wb.field_d;
        qk.field_k.field_t = wb.field_c;
        hd.field_f.e();
        if (!param5) {
          wb.b();
        } else {
          ob.field_B.b(0, param3);
        }
        var7 = -1;
        if (null != oc.field_p &&
          param5) {
          if (oc.field_p.field_b) {
            if (oc.field_p.field_B.field_l == oc.field_p.field_a) {
              var7 = oc.field_p.field_C;
            }
          } else {
            var7 = oc.field_p.field_C;
          }
        }
        var8 = this.d(-1);
        var9 = this.m(71);
        if (param4 > -74) {
          qe.k(-34);
        }
        var10 = 370 + param3;
        var11 = 140;
        var12 = var10 - 315;
        for (var13_int = 0; var13_int < 4; var13_int++) {
          wb.d(var11 - var13_int, var12 - var13_int, 360 + 2 * var13_int, 2 * var13_int + 360, 10983537);
        }
        for (var13_intLifetime1 = 4; var13_intLifetime1 < 9; var13_intLifetime1++) {
          wb.d(var11 - var13_intLifetime1, -var13_intLifetime1 + var12, 360 + var13_intLifetime1 * 2, 360 + 2 * var13_intLifetime1, 3288622);
        }
        for (var13_intLifetime2 = 9; 15 > var13_intLifetime2; var13_intLifetime2++) {
          wb.d(-var13_intLifetime2 + var11, -var13_intLifetime2 + var12, 360 + 2 * var13_intLifetime2, var13_intLifetime2 * 2 + 360, 4998726);
        }
        this.field_j = -1;
        for (var13_intLifetime3 = 7; var13_intLifetime3 >= 0; var13_intLifetime3--) {
          for (var14 = 0; 8 > var14; var14++) {
            var11Lifetime1 = 320 - (-(45 * var14) + 180);
            var15 = var14 + 8 * var13_intLifetime3;
            var12Lifetime1 = var10 - var13_intLifetime3 * 45;
            if (param0) {
              var12Lifetime1 = var10 - 315 + var13_intLifetime3 * 45;
              var11Lifetime1 = -(45 * var14) + 455;
            }
            var16 = this.field_f[var15];
            var17 = var16 & 16773120;
            var18 = var16 & -16773121;
            stackIn_30_0 = (0 != var17) ? 0 : 1;
            var19 = stackIn_30_0;
            stackIn_33_0 = (0 != pj.field_b[var15]) ? 3100495 : 16444375;
            var20 = stackIn_33_0;
            if (this.field_d[var15]) {
              stackIn_38_0 = (pj.field_b[var15] == 0) ? 14101529 : 4525064;
              var20 = stackIn_38_0;
            }
            wb.f(var11Lifetime1, var12Lifetime1, 45, 45, var20);
            if (var15 != this.field_m) {
              stackIn_49_0 = (!this.a(var7, var15, -80)) ? 0 : 1;
              var22 = stackIn_49_0;
              stackIn_52_0 = (pj.field_b[var15] != 4096) ? 1 : 0;
              var23 = stackIn_52_0;
              cl.field_c[var22][var23][var19][var18].d(var11Lifetime1, var12Lifetime1);
            } else {
              if (rn.field_b != 0) {
                var26 = rl.field_d[var19][var18].c();
                for (var22 = 0; 4 > var22; var22++) {
                  var26.f(16711680);
                }
                var26.a(var11Lifetime1, var12Lifetime1);
              } else {
                var25 = hb.field_b[var19][var18].c();
                var25.f(16711680);
                var25.b(var11Lifetime1, var12Lifetime1);
              }
            }
            if (param1 &&
              hn.field_k >= var11Lifetime1 &&
              hn.field_k < 45 + var11Lifetime1 &&
              rf.field_b >= var12Lifetime1 &&
              45 + var12Lifetime1 > rf.field_b) {
              this.field_j = var15;
              var21 = 128 + (int)(63.0 * Math.sin((double)qb.field_a / 10.0));
              wb.b(var11Lifetime1, var12Lifetime1, 45, 45, var20, var21);
            }
          }
        }
        var13 = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        for (var14Lifetime1 = 0; var14Lifetime1 < 8; var14Lifetime1++) {
          var11Lifetime2 = -180 + 45 * var14Lifetime1 + 320;
          var12Lifetime2 = 45 + var10;
          stackIn_75_0 = jj.field_b;
          stackIn_75_1 = var13;
          if (param0) {
            stackIn_76_2 = 7 - var14Lifetime1;
          } else {
            stackIn_76_2 = var14Lifetime1;
          }
          ((c) (Object) stackIn_75_0).b(stackIn_75_1[stackIn_76_2], 22 + var11Lifetime2, var12Lifetime2 + 14, 15794175, 1);
          var12Lifetime2Lifetime1 = var10 - 45 * var14Lifetime1;
          var11Lifetime2Lifetime1 = 140;
          stackIn_78_0 = jj.field_b;
          if (!param0) {
            stackIn_79_1 = var14Lifetime1 + 1;
          } else {
            stackIn_79_1 = -var14Lifetime1 + 8;
          }
          ((c) (Object) stackIn_78_0).c(Integer.toString(stackIn_79_1), var11Lifetime2Lifetime1 - 5, 22 + var12Lifetime2Lifetime1, 15794175, 1);
        }
        var14Lifetime2 = var8 / 8;
        var15Lifetime1 = var8 % 8;
        var16Lifetime1 = var9 / 8;
        var17Lifetime1 = var9 % 8;
        if (!param0) {
          var19Lifetime1 = var10 - 45 * var14Lifetime2;
          var21Lifetime1 = var10 - var16Lifetime1 * 45;
          var18Lifetime1 = 320 + 45 * (-4 + var15Lifetime1);
          var20Lifetime1 = 140 + 45 * var17Lifetime1;
        } else {
          var19Lifetime1 = var10 - (-var14Lifetime2 + 7) * 45;
          var18Lifetime1 = 320 + (135 - var15Lifetime1 * 45);
          var20Lifetime1 = 45 * (-var17Lifetime1 + 3) + 320;
          var21Lifetime1 = -(45 * (7 - var16Lifetime1)) + var10;
        }
        var21Lifetime1 += 22;
        var18Lifetime1 += 22;
        var19Lifetime1 += 22;
        var20Lifetime1 += 22;
        var22Lifetime1 = (int)(33.0 * Math.sin((double)param2 / 10.0)) + 64;
        var30 = (int[]) ((Object) this.field_H.clone());
        se.a(var20Lifetime1, var30, 45, (byte) 44, var19Lifetime1, var21Lifetime1, var18Lifetime1);
        wa.b(var30, 16711680, var22Lifetime1);
        qk.field_k.e();
        if (param5) {
          if (jc.field_f == -1) {
            hd.field_f.b(0, 0, 64);
          } else {
            hd.field_f.d(0, 0);
          }
        } else {
          hd.field_f.d(0, 0);
        }
        return var10 - 315;
    }

    final boolean a(double param0, byte param1, double param2) {
        int var6;
        int var7;
        var7 = Chess.field_G;
        if (param1 != 42) {
          field_B = (java.applet.Applet) null;
        }
        var6 = 0;
        if (!(param2 < this.field_T)) {
          if (this.field_T < param2) {
            this.field_T = this.field_T + 0.04908738521234052;
            if (param2 < this.field_T) {
              this.field_T = param2;
            }
            var6 = 1;
          }
        } else {
          this.field_T = this.field_T - 0.04908738521234052;
          if (param2 > this.field_T) {
            this.field_T = param2;
          }
          var6 = 1;
        }
        if (!(param0 < this.field_t)) {
          if (param0 > this.field_t) {
            this.field_t = this.field_t + 0.04908738521234052;
            if (param0 < this.field_t) {
              this.field_t = param0;
            }
            var6 = 1;
          }
        } else {
          this.field_t = this.field_t - 0.04908738521234052;
          var6 = 1;
          if (this.field_t < param0) {
            this.field_t = param0;
          }
        }
        this.a(this.field_t, this.field_T, true);
        return var6 != 0;
    }

    final void j(int param0) {
        String discarded$0 = null;
        if (param0 <= 83) {
          discarded$0 = this.a(false, -127, -34, -39, -63);
        }
        this.a(-0.04908738521234052 + this.field_t, this.field_T, true);
    }

    final void f(int param0, int param1) {
        String[] stackIn_12_0;
        int stackIn_12_1;
        StringBuilder stackIn_12_2;
        qe stackIn_12_3;
        boolean stackIn_13_4 = false;
        int stackIn_16_0 = 0;
        String[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        int var10;
        String[] var11;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime1;
        var10 = Chess.field_G;
        if (param1 != -1) {
          this.f(-101, 67);
        }
        if (this.field_P != param0) {
          this.field_K = new qe();
          this.field_P = param0;
          var11 = new String[(this.a((byte) -124) + 1) / 2];
          var3 = var11;
          for (var4 = 0; this.field_h.length > var4; var4++) {
            if (this.field_P > var4 &&
              this.field_h[var4] != null) {
              this.field_K.a(this.field_h[var4].field_f, false, param1 + 0);
              var5 = this.field_h[var4].field_f;
              var6 = this.field_h[var4].field_d;
              var7 = this.field_h[var4].field_e;
              if ((1 & var4) == 0) {
                var8 = var4 / 2 + 1 + ".";
              } else {
                var8 = var3[var4 / 2];
              }
              stackIn_12_0 = var3;
              stackIn_12_1 = var4 / 2;
              stackIn_12_2 = new StringBuilder().append(var8).append(" ");
              stackIn_12_3 = this.field_K;
              stackIn_13_4 = (ce.a(1, var4) == 0);
              stackIn_12_0[stackIn_12_1] = ((StringBuilder) (Object) stackIn_12_2).append(((qe) (Object) stackIn_12_3).a(stackIn_13_4, var7, var6, dm.a(param1, -33), var5)).toString();
              this.field_K.a((byte) 19, this.field_h[var4].field_e, this.field_h[var4].field_f, this.field_h[var4].field_d);
              stackIn_16_0 = ((1 & var4) != 0) ? 0 : 4096;
              var9 = stackIn_16_0;
              if (!this.field_K.a((byte) 61, var9)) {
                if (this.field_K.e(var9, 100)) {
                  var3[var4 / 2] = var3[var4 / 2] + "+";
                }
              } else {
                var3[var4 / 2] = var3[var4 / 2] + "#";
              }
              continue;
            }
            break;
          }
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var5Lifetime1 < var11.length; var5Lifetime1++) {
            if (null != var11[var5Lifetime1]) {
              var4Lifetime1++;
              continue;
            }
            break;
          }
          this.field_L = new String[var4Lifetime1];
          for (var5Lifetime2 = 0; var4Lifetime1 > var5Lifetime2; var5Lifetime2++) {
            this.field_L[var5Lifetime2] = var11[var5Lifetime2];
          }
        }
    }

    final void a(double param0, double param1, boolean param2) {
        t.field_Q = true;
        vk.field_e = param2 ? true : false;
        this.field_T = param1 % 6.283185307179586;
        this.field_t = param0 % 6.283185307179586;
        if (this.field_t > -0.1) {
          this.field_t = -0.1;
        }
        if (6.283185307179586 < this.field_T ||
          0.0 > this.field_T) {
          this.field_T = this.field_T % 6.283185307179586;
        }
        if (this.field_t < -1.5607963267948965) {
          this.field_t = -1.5607963267948965;
        }
        this.field_C = (int)(1280.0 * Math.sin(this.field_t));
        double var6 = Math.cos(this.field_t);
        this.field_I = (int)(var6 * (Math.sin(this.field_T) * 1280.0));
        this.field_Q = (int)(var6 * (Math.cos(this.field_T) * 1280.0));
        this.field_C = this.field_C - 200;
        this.field_C = this.field_C + (int)(Math.sin(this.field_t * 2.0) * 320.0);
        this.c((byte) -85);
    }

    final int a(boolean param0, int param1, int param2) {
        if (!param0) {
          this.field_H = (int[]) null;
        }
        this.f(param2, -1);
        int[] var8 = wb.field_d;
        int[] var4 = var8;
        int var5 = wb.field_h;
        int var6 = wb.field_c;
        this.field_q.e();
        int var7 = 0;
        if (this.field_K != null) {
          var7 = this.field_K.a(false, false, param1, 0, (byte) -100, false);
        }
        wb.a(var8, var5, var6);
        this.field_q.b(120, ec.c((byte) -63) / 2 - 21, 196);
        return var7;
    }

    private final void g(int param0, int param1) {
        int var6 = 0;
        int[] var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int[] var9;
        var8 = Chess.field_G;
        var9 = wb.field_d;
        var3 = var9;
        var4 = wb.field_h;
        var5 = wb.field_c;
        this.field_p.e();
        wb.b();
        if (param0 != -1) {
          return;
        }
        for (var6 = 0; var6 < this.field_z.length; var6++) {
          var7 = this.field_r[this.field_z.length + (-var6 - 1)];
          if (rn.field_b != 0 &&
            this.field_N[var6] != null &&
            param1 != var7) {
            this.field_N[var6].b(0, 0);
          }
        }
        wb.a(var9, var4, var5);
    }

    private final int[] a(double[] param0, double[] param1, double[] param2, byte param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var13 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          da.a(param1, 0, param2, 0, 0, -2, param0);
          da.a(param2, 0, param0, 0, 0, -2, param1);
          jn.a(param0, 0, param3 + 16841);
          jn.a(param1, 0, 16801);
          jn.a(param2, 0, 16801);
          if (param3 != -40) {
            this.field_K = (qe) null;
          }
          var13 = rd.a(16, param3 ^ 39, param0);
          var10 = var13;
          var9 = var10;
          var5 = var9;
          var18 = rd.a(16, -1, param1);
          var19 = rd.a(16, -1, param2);
          var8 = new int[]{this.field_I, this.field_C, this.field_Q, var13[0], var13[1], var13[2], var18[0], var18[1], var18[2], var19[0], var19[1], var19[2]};
          stackIn_3_0 = var8;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("qe.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void l(int param0) {
        this.a(this.field_t, -0.04908738521234052 + this.field_T, true);
        if (param0 != -28628) {
          this.field_L = (String[]) null;
        }
    }

    private final String a(boolean param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        StringBuilder stackIn_35_0 = null;
        String stackIn_36_1 = null;
        StringBuilder stackIn_38_0 = null;
        String stackIn_39_1 = null;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = Chess.field_G;
        var6 = this.field_f[param4];
        var7 = this.field_f[param2];
        var8 = var6 & -16773121;
        var9 = param4 / 8;
        var10 = param4 % 8;
        if (param3 <= 8) {
          return (String) null;
        }
        var11 = param2 % 8;
        stackIn_5_0 = (var7 == 0) ? 0 : 1;
        var12 = stackIn_5_0;
        var13 = -1;
        if (param0 &&
          this.field_l != -1) {
          var13 = this.field_l;
        } else {
          if (!param0 &&
            this.field_k != -1) {
            var13 = this.field_k;
          }
        }
        if (-1 != var13) {
          var14 = var10 - var13;
          if (var14 == 1 ||
            var14 == -1) {
            var15 = -1;
            if (param0 &&
              var9 == 4) {
              var15 = 1 + var9;
            } else {
              if (!param0 &&
                var9 == 3) {
                var15 = -1 + var9;
              }
            }
            if (var15 != -1 &&
              param2 == var13 + 8 * var15) {
              var12 = 1;
            }
          }
        }
        if (var8 == 6 &&
          -2 == var11 - var10) {
          return "0-0-0";
        }
        if (var8 == 6 &&
          -var10 + var11 == 2) {
          return "0-0";
        }
        stackIn_35_0 = new StringBuilder().append(this.a(var6, (byte) 124)).append(this.h(-106, param4));
        if (var12 != 0) {
          stackIn_36_1 = "x";
        } else {
          stackIn_36_1 = "";
        }
        stackIn_38_0 = ((StringBuilder) (Object) stackIn_35_0).append(stackIn_36_1).append(this.h(109, param2));
        if (0 != param1) {
          stackIn_39_1 = this.a(param1, (byte) 30);
        } else {
          stackIn_39_1 = "";
        }
        return ((StringBuilder) (Object) stackIn_38_0).append(stackIn_39_1).toString();
    }

    final void i(int param0) {
        this.a(this.field_t, 0.04908738521234052 + this.field_T, true);
        if (param0 <= 15) {
          this.field_G = (int[]) null;
        }
    }

    private final int m(int param0) {
        int var2;
        int var3;
        var3 = Chess.field_G;
        for (var2 = -1 + this.field_h.length; var2 >= 0; var2--) {
          if (this.field_h[var2] == null) {
            continue;
          }
          break;
        }
        if (var2 == -1) {
          return -1;
        }
        if (param0 >= 35) {
          return this.field_h[var2].field_d;
        }
        return -46;
    }

    static {
        field_R = "Who can join";
        field_O = "Unpacking music";
        field_y = "Played";
    }
}
