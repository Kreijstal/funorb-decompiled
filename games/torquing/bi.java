/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static pc field_f;
    private boolean field_t;
    static String field_u;
    ei field_e;
    static String field_I;
    static int field_p;
    ei field_B;
    int field_n;
    private int field_j;
    private int[] field_m;
    private double field_h;
    private int field_E;
    kh field_i;
    private tl[] field_D;
    private int field_S;
    private int field_U;
    private int field_o;
    private int field_F;
    private double field_K;
    private int field_N;
    private String field_T;
    vg field_P;
    private boolean field_w;
    private sg field_C;
    private int field_H;
    private kg[] field_Q;
    int field_s;
    int field_L;
    private int field_r;
    private int field_x;
    private int field_l;
    private int field_G;
    private int field_c;
    private Torquing field_A;
    private int field_M;
    hc field_d;
    private int[] field_a;
    private int field_v;
    private boolean field_g;
    private int field_k;
    private boolean field_y;
    int[] field_b;
    int field_z;
    int field_q;
    private boolean field_J;

    private final void h(int param0) {
        int var7 = 0;
        int var6 = 0;
        boolean stackIn_30_1 = false;
        RuntimeException decompiledCaughtException = null;
        tl[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5_int = 0;
        pj var5 = null;
        kh[] var6_ref_kh__ = null;
        kh var8 = null;
        int var9 = 0;
        tl[] var10 = null;
        int var11 = 0;
        int var4_intLifetime1;
        int var5_intLifetime1;
        var9 = Torquing.field_u;
        try {
          fd.a(-109);
          re.field_d[1] = 80.0;
          this.field_x = 0;
          re.field_d[0] = 0.0;
          var10 = this.field_d.field_q;
          var2 = var10;
          this.field_D = new tl[var10.length];
          dk.a(var2, 0, this.field_D, 0, this.field_D.length);
          var3 = 0;
          for (var4_int = 0; var4_int < this.field_D.length; var4_int++) {
            if (this.field_D[var4_int].f(25468)) {
              var3++;
            }
          }
          this.field_m = new int[var3];
          var11 = 0;
          var4_intLifetime1 = var11;
          while (var11 < this.field_D.length) {
            if (this.field_D[var11].f(25468)) {
              var3--;
              this.field_m[var3] = var11;
            }
            var11++;
          }
          this.field_C = this.field_P.a(-63, this.field_d);
          this.field_P.b(0, this.field_i);
          var4 = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          var5_int = 42 % ((-34 - param0) / 44);
          var6_ref_kh__ = vc.field_c;
          for (var7 = 0; var7 < var6_ref_kh__.length; var7++) {
            var8 = var6_ref_kh__[var7];
            if (var8 != null) {
              this.field_C.a(var8, var4);
            }
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < this.field_C.field_y; var5_intLifetime1++) {
            this.field_C.a(var5_intLifetime1, 80, 1365, -1, -12, 12);
          }
          this.a(false, 0);
          this.field_w = false;
          this.field_T = ki.a("ff9040", "ffffff", 93, this.field_T);
          this.field_z = 0;
          this.field_k = this.field_d.a(-31648);
          this.field_r = 3000;
          this.field_c = 0;
          this.field_v = this.field_d.a(false);
          ap.a(gj.field_i, il.field_m[this.field_v]);
          stackIn_30_1 = (this.field_L == 18);
          this.field_y = stackIn_30_1;
          this.field_J = false;
          this.field_h = Double.NEGATIVE_INFINITY;
          this.field_K = -1.0;
          var5 = this.field_d.a(-100, false).field_k;
          for (var6 = var5.field_k - 1; var6 >= 0; var6--) {
            if (this.field_h < re.field_d[1] * (double)var5.field_y[var6]) {
              this.field_h = re.field_d[1] * (double)var5.field_y[var6];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "bi.Q(" + param0 + ')');
        }
    }

    final void g(int param0) {
        int dupTemp$0 = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        tl[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        qk var10 = null;
        int var6Lifetime1;
        var9 = Torquing.field_u;
        try {
          var10 = new qk(0, this.field_L, this.field_N, this.field_S, this.field_F, this.field_G);
          if (!je.a((byte) 77)) {
            le.a((byte) 83, 5, var10);
          } else {
            bo.field_l.a((byte) 54, var10);
          }
          if (1 + this.field_L > nh.field_k) {
            nh.field_k = this.field_L + 1;
          }
          if (wi.field_a.length - 1 != this.field_L) {
            stackIn_15_0 = (wi.field_a[this.field_L + 1] != wi.field_a[this.field_L]) ? 1 : 0;
          } else {
            stackIn_15_0 = 1;
          }
          var3 = stackIn_15_0;
          var4 = wi.field_a[this.field_L];
          if (var3 != 0) {
            if (var4 == 1) {
              this.a(0, (byte) 83, 255);
            } else {
              if (var4 == 2) {
                this.a(1, (byte) 9, 254);
              } else {
                if (var4 != 4) {
                  if (7 == var4) {
                    this.a(3, (byte) 125, 252);
                  }
                } else {
                  this.a(2, (byte) 78, 253);
                }
              }
            }
            var5_int = this.field_G & 63;
            if (var4 > 0 && (!(var4 <= wi.field_a[var5_int]) ||
              hg.field_d[var5_int] == 0)) {
              this.a(4, (byte) 118, 251);
            }
            if (0 == var5_int) {
              if (var4 != 2) {
                if (var4 == 4) {
                  this.a(6, (byte) 6, 249);
                } else {
                  if (var4 == 7) {
                    this.a(7, (byte) 112, 248);
                    if (-1 == this.field_T.indexOf("ffffff")) {
                      this.a(13, (byte) 25, 242);
                    }
                  }
                }
              } else {
                this.a(5, (byte) 71, 250);
              }
            }
          }
          if (-1 < this.field_T.indexOf("ff9040") &&
            this.field_T.indexOf("ffffff") == -1) {
            this.field_l = this.field_l + this.field_U;
            this.field_U = this.field_U * 2;
            this.field_s = this.field_U;
            this.a(12, (byte) 61, 243);
          }
          this.field_T = ki.a("ff9040", "ff0000", -104, this.field_T);
          var5 = this.field_d.field_q;
          for (var6 = 0; this.field_D.length > var6; var6++) {
            if (null == this.field_D[var6] &&
              var5[var6].field_r != 0 &&
              var5[var6].field_r != 7) {
              dupTemp$0 = wi.field_a[this.field_L];
              this.field_b[dupTemp$0] = this.field_b[dupTemp$0] + 1;
              this.field_G = this.field_G + 4096;
              this.field_S = this.field_S + (this.field_N << 12);
            }
          }
          if (var3 != 0 && (var4 == 1 ||
            var4 == 3)) {
            var6Lifetime1 = 0;
            var7 = 0;
            for (var8 = 0; var4 >= var8; var8++) {
              var7 = var7 + mh.field_k[var4];
              var6Lifetime1 = var6Lifetime1 + this.field_b[var4];
            }
            if (var6Lifetime1 >= var7 * 8 / 10) {
              if (1 != var4) {
                this.a(10, (byte) 13, 245);
              } else {
                this.a(8, (byte) 33, 247);
              }
            }
            if (var7 == var6Lifetime1) {
              if (var4 != 1) {
                this.a(11, (byte) 24, 244);
              } else {
                this.a(9, (byte) 23, 246);
              }
            }
          }
          dd.field_d = dd.field_d | this.field_z;
          if (dd.field_d == 255) {
            if (!ia.a(-22426, 0)) {
              this.a(15, (byte) 30, 240);
            } else {
              this.a(16, (byte) 11, 239);
            }
          }
          if (param0 < 25) {
            return;
          }
          if (wp.field_w <= 0 &&
            qc.field_ab.length > 1 &&
            qc.field_ab[1] + qc.field_ab[0] <= nh.field_k) {
            nh.field_k = -1 + (qc.field_ab[0] + qc.field_ab[1]);
          }
          this.field_J = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.T(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
          this.field_w = true;
          if (param0 != -7045) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            bi.a((java.applet.Applet) null, (byte) -76);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.N(" + param0 + ')');
        }
    }

    final void b(byte param0, int param1) {
        try {
          this.field_k = this.field_k + param1;
          if (param0 < 120) {
            this.field_k = -84;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        ti[] var2 = null;
        tl[] var2_array = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tl var4 = null;
        int var5 = 0;
        ti[] var6 = null;
        tl[] var7 = null;
        int var8 = 0;
        ti var9 = null;
        int var3Lifetime1;
        var5 = Torquing.field_u;
        try {
          this.field_e.a(0);
          if (null != this.field_d.field_k) {
            var6 = this.field_d.field_k;
            var2 = var6;
            for (var3 = 0; var3 < var6.length; var3++) {
              var9 = var6[var3];
              if (var9 != null) {
                var9.b((byte) 62);
              }
            }
          }
          if (param0 != 1) {
            return;
          }
          var7 = this.field_d.field_q;
          var2_array = var7;
          var8 = 0;
          var3Lifetime1 = var8;
          while (var7.length > var8) {
            var4 = var7[var8];
            var4.field_c = -1;
            var4.field_h = null;
            var8++;
          }
          if (this.field_d.field_m != null) {
            this.field_d = this.field_d.field_m;
            this.field_G = this.field_G + 64;
            this.field_L = this.field_L + 1;
            this.field_F = this.field_F + (this.field_N << 6);
            var2_int = wi.field_a[this.field_L];
            if (1 + var2_int != this.field_q) {
              this.field_i = tp.field_a;
              this.field_q = var2_int + 1;
            }
            if (!(ri.field_E >= 2) ||
              !la.field_k[this.field_q].e(17)) {
              la.field_k[this.field_q].g();
            }
            this.h(67);
          } else {
            this.b(param0 ^ 8);
            this.field_g = true;
            this.field_q = 9;
            this.field_d = ig.field_q;
            la.field_k[9].a(true);
            this.h(-83);
            this.field_r = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "bi.O(" + param0 + ')');
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -94 / ((23 - param1) / 43);
          stackIn_1_0 = new di(param0);
          return (af) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("bi.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        StringBuilder var3 = null;
        CharSequence var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = new StringBuilder(this.field_T);
          var4 = (CharSequence) ((Object) "ff9040");
          gd.a(-20980, var3, var4, 5 + 13 * param0);
          this.field_T = var3.toString();
          if (param1 >= -26) {
            this.field_Q = (kg[]) null;
          }
          if (this.field_T.indexOf("ffffff") != -1) {
            th.a(100, th.field_F[17]);
          } else {
            th.a(100, th.field_F[18]);
          }
          th.a(100, th.field_F[19]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3_ref), "bi.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        try {
          int var2_int = -38 % ((param0 - 62) / 48);
          this.field_x = Math.max(10, this.field_x);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.U(" + param0 + ')');
        }
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -68) {
            this.b((byte) 62);
          }
          this.field_H = param3;
          this.field_E = param2;
          this.field_P.b(0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("bi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        int var6Lifetime1;
        var8 = Torquing.field_u;
        try {
          var9 = new kg(param2, param3, param1);
          var5 = var9;
          var6 = 0;
          while (this.field_Q.length > var6) {
            if (this.field_Q[var6] != null &&
              this.field_Q[var6].field_a != null) {
              var6++;
              continue;
            }
            this.field_Q[var6] = var9;
            return;
          }
          var6Lifetime1 = this.field_Q.length;
          var7 = new kg[var6Lifetime1 + 1];
          dk.a(this.field_Q, 0, var7, 0, var6Lifetime1);
          if (param0 != 538) {
            this.field_L = -15;
          }
          var7[var6Lifetime1] = var9;
          this.field_Q = var7;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("bi.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        sm var3 = null;
        int stackIn_11_0 = 0;
        Torquing stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        int stackIn_15_2 = 0;
        Torquing stackIn_19_0 = null;
        boolean stackIn_19_1 = false;
        int stackIn_20_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -103) {
            var3 = (sm) null;
            bi.a((sm) null, -1);
          }
          this.b(9);
          this.field_g = true;
          if (!je.a((byte) 77)) {
            stackIn_19_0 = this.field_A;
            stackIn_19_1 = true;
            if (ao.field_f == 0) {
              stackIn_20_2 = 2;
            } else {
              stackIn_20_2 = 8;
            }
            ((Torquing) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_20_2, 1, false);
          } else {
            if (this.field_U == 0) {
              if (ao.field_f == 0) {
                stackIn_11_0 = (this.field_L != 0) ? 1 : 0;
              } else {
                stackIn_11_0 = 1;
              }
            } else {
              stackIn_11_0 = 1;
            }
            var2_int = stackIn_11_0;
            stackIn_14_0 = this.field_A;
            stackIn_14_1 = true;
            if (var2_int == 0) {
              stackIn_15_2 = 0;
            } else {
              stackIn_15_2 = 7;
            }
            ((Torquing) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, 1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.G(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        pj var6 = null;
        var7 = Torquing.field_u;
        try {
          var3 = this.field_D;
          var4 = 0;
          if (param0) {
            this.field_v = 112;
          }
          while (var4 < var3.length) {
            var5 = var3[var4];
            if (null != var5 &&
              31 == var5.field_r) {
              var6 = var5.d(-2).field_k;
              gq.a(var6.field_f, 4, param1);
              gq.a(var6.field_s, 4, param1);
              gq.a(var6.field_l, 4, param1);
              return;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3_ref), "bi.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final static we a(fj param0, byte param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            var3 = (java.applet.Applet) null;
            bi.a((java.applet.Applet) null, (byte) 44);
          }
          stackIn_3_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("bi.BA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 77) {
            field_f = (pc) null;
          }
          stackIn_6_0 = (qm.a(param1, (byte) 45) != null);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("bi.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        sg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_T.indexOf("ffffff") == -1 &&
            this.field_T.indexOf("ff9040") == -1) {
            param1 = param1 * 2;
          }
          this.field_j = this.field_j - param1;
          this.field_U = this.field_U + param1;
          this.field_s = this.field_U;
          if (param0 < 94) {
            var4 = (sg) null;
            this.a(91, -43, (sg) null, 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "bi.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        int fieldTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_c >= param5) {
            fieldTemp$3 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            if (fieldTemp$3 < 0) {
              this.field_P.a(param5 + 80);
              this.a(538, 16, param3, this.field_P.field_c);
              th.a(param5 ^ 100, th.field_F[14]);
              th.a(100, th.field_F[15]);
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            th.a(100, th.field_F[16]);
          }
          this.field_P.a(param1, param4, param5 + 1, param2);
          this.a(538, 0, param3, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_10_0 = var10;
          stackIn_10_1 = new StringBuilder().append("bi.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          this.field_c = this.field_c + 1;
          if (param0 != 0) {
            this.field_z = -49;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.K(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (param0 != 1000) {
            this.field_G = 31;
          }
          this.field_i = tp.field_a;
          this.field_c = 0;
          this.a((byte) -68, tp.field_a, 1365, 80);
          this.field_j = this.field_j + this.field_U;
          if (ri.field_E < 2) {
            var2_int = this.field_G & 63;
            this.field_S = this.field_S + (this.field_L - var2_int) * this.field_N;
            this.field_G = this.field_G + (this.field_L - var2_int);
          }
          this.field_U = 0;
          this.h(-116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.R(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        bm var4 = null;
        bm var5 = null;
        var3 = Torquing.field_u;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (ri.field_E >= 2 &&
            this.field_t) {
            this.field_M = 779830527;
            this.field_j = -this.field_U + 318907172;
            this.field_o = 1086213241;
            this.field_t = false;
            this.field_l = 2121488289;
          } else {
            if (0 < this.field_U &&
              gn.field_l == null) {
              if (this.field_U > 0 &&
                !je.a((byte) 85)) {
                var4 = vl.field_c;
                var5 = var4;
                if (var5 != null &&
                  null != var5.field_p &&
                  bn.a(var4.field_p[1][9], -17310) &&
                  var4.field_n[1][9] > this.field_U) {
                  gn.field_l = new wc(11, 65524, this.field_M, this.field_o, this.field_l, this.field_j, new int[]{this.field_U});
                } else {
                  gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
                  vl.field_c = null;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                return;
              }
            }
          }
          if (param0 != 9) {
            field_f = (pc) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.P(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        sm var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        qp var5 = null;
        try {
          if (param1 <= 1) {
            var6 = (sm) null;
            bi.a((sm) null, 34);
          }
          var4_int = 1 << param0;
          if ((var4_int & fa.field_b) != 0) {
            return;
          }
          ao.field_f = ao.field_f | var4_int;
          fa.field_b = fa.field_b | var4_int;
          this.field_B.a((byte) 54, new tj(param0));
          if (!this.field_t) {
            var5 = new qp(param0, param2, this.field_N, this.field_S, this.field_F, this.field_G);
            if (je.a((byte) 61)) {
              jh.field_y.a((byte) 54, var5);
            } else {
              wc.a(var5, (byte) 99, 4);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "bi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        try {
          if (param0 < 121) {
            this.a(-53);
          }
          this.field_P.e(66);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.S(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          int var2_int = 0;
          java.net.URL var3 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2 = null;
          RuntimeException var2_ref = null;
          try {
            try {
              var2_int = 35 % ((param1 + 53) / 50);
              var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (Exception) (Object) decompiledCaughtException;
              var2.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref;
            stackIn_7_1 = new StringBuilder().append("bi.A(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        sg discarded$0 = null;
        vn stackIn_60_0;
        String stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        int stackIn_61_4;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        String var3_ref_String = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        kh var10 = null;
        sb var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var4Lifetime2Lifetime1;
        var8 = Torquing.field_u;
        try {
          if (this.field_c < 0 &&
            this.field_c != -2147483648) {
            ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
            this.field_c = -2147483648;
            return;
          }
          var2_int = this.field_q - 1;
          if (var2_int >= 0 &&
            var2_int < 8) {
            if (1 == this.field_d.a(false) &&
              null != hi.field_h[var2_int]) {
              hi.field_h[var2_int].b(0, 0);
            } else {
              gm.field_r[var2_int].b(0, 0);
            }
          } else {
            gm.field_r[7].b(0, 0);
          }
          if (this.field_K < 0.0) {
            this.field_P.a(true, gj.field_i);
            var3 = vf.field_j[this.field_v][0];
            var4 = vf.field_j[this.field_v][1];
            var5_int = vf.field_j[this.field_v][2];
            gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> 16);
            gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 16);
            gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] + var4 * gj.field_i[8]) >> 16);
          } else {
            if (!ce.field_b) {
              gj.field_i[1] = (int)((double)gj.field_i[1] + this.field_K);
            }
          }
          this.field_C.a(this.field_P.field_c, this.field_H, this.field_E, -1, -12, 12);
          if (!this.field_J &&
            this.field_c >= 0) {
            this.field_P.b(1);
          }
          var13 = this.field_m;
          var12 = var13;
          var9 = var12;
          var3_ref_int__ = var9;
          for (var4Lifetime1 = 0; var13.length > var4Lifetime1; var4Lifetime1++) {
            var5_intLifetime1 = var13[var4Lifetime1];
            if (null != this.field_D[var5_intLifetime1]) {
              this.field_D[var5_intLifetime1].b(1);
              this.field_C.a(this.field_D[var5_intLifetime1].field_c, 80, 1365, -1, -12, 12);
            }
          }
          sg.a(this.field_C.field_g[this.field_P.field_c], 80, 1365, -1, -12, 12);
          sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
          if (param0) {
            this.e(14);
          }
          sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
          var10 = (kh) (on.field_e.c((byte) -122));
          while (var10 != null) {
            sg.a(var10, 80, 1365, -1, -12, 12);
            var10 = (kh) (on.field_e.b((byte) -110));
          }
          for (var3Lifetime1 = 9; var3Lifetime1 <= 16; var3Lifetime1++) {
            discarded$0 = this.field_C;
            sg.a(vc.field_c[var3Lifetime1], 80, 1365, -1, -12, 12);
          }
          this.field_C.a(gj.field_i);
          var11 = (sb) (this.field_e.b(0));
          while (var11 != null) {
            var11.c(-103);
            var11 = (sb) (this.field_e.f(-24059));
          }
          if (!ti.field_k) {
            bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
            var3_ref_String = wh.a(this.field_k, (byte) -119);
            if (this.field_d != ig.field_q) {
              dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
              if (10000 > this.field_k &&
                !this.field_J) {
                if (this.field_v == 0) {
                  dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                } else {
                  dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                }
              }
            }
            stackIn_60_0 = dd.field_c;
            stackIn_60_1 = Integer.toString(Math.abs(this.field_U));
            stackIn_60_2 = 628;
            stackIn_60_3 = 67;
            if (!this.field_t) {
              stackIn_61_4 = 16711680;
            } else {
              stackIn_61_4 = 16776960;
            }
            ((vn) (Object) stackIn_60_0).a(stackIn_60_1, stackIn_60_2, stackIn_60_3, stackIn_61_4, -1);
            var4Lifetime2 = 0;
            var5_intLifetime2 = 528;
            while (8 > var4Lifetime2) {
              boolean decompiledFrameRemainder0 = true;
              if ((dd.field_d >> var4Lifetime2 & 1) == 0 && ((1 & this.field_z >> var4Lifetime2) == 0 ||
                this.field_k % 1000 >= 500)) {
                ph.b(var5_intLifetime2, 118, ue.field_c[var4Lifetime2].field_w, ue.field_c[var4Lifetime2].field_u, 16777215, 118);
                ue.field_c[var4Lifetime2 + 8].e(var5_intLifetime2, 118, 81);
                decompiledFrameRemainder0 = false;
              }
              else {
                ue.field_c[var4Lifetime2].e(var5_intLifetime2, 118, 162);
              }
              var5_intLifetime2 = var5_intLifetime2 + ue.field_c[var4Lifetime2].field_w;
              var4Lifetime2++;
            }
            for (var4Lifetime2Lifetime1 = 0; this.field_c > var4Lifetime2Lifetime1; var4Lifetime2Lifetime1++) {
              kk.field_n.d(583 + var4Lifetime2Lifetime1 * 8, 143);
            }
            if (this.field_w) {
              ia.field_f.d(553, 143);
            }
            dd.field_c.b(this.field_T, 538, 102, 16711680, -1);
          }
          if (this.field_r > 0) {
            var3Lifetime2 = (this.field_r - 1) / 1000;
            var4Lifetime3 = -(1000 * var3Lifetime2) + this.field_r;
            var5 = hq.field_h[var3Lifetime2];
            var6 = var4Lifetime3 * var5.field_s / 1000;
            var7 = var5.field_t * var4Lifetime3 / 1000;
            var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.H(" + param0 + ')');
        }
    }

    final void i(int param0) {
        boolean stackIn_117_0 = false;
        double stackIn_185_0 = 0.0;
        vg stackIn_194_0;
        double[] stackIn_194_1;
        int stackIn_194_2;
        double stackIn_194_3;
        int stackIn_194_4;
        int stackIn_194_5;
        boolean stackIn_195_6 = false;
        int stackIn_210_0 = 0;
        Torquing stackIn_281_0 = null;
        boolean stackIn_281_1 = false;
        int stackIn_282_2 = 0;
        int stackIn_291_0 = 0;
        Torquing stackIn_294_0 = null;
        boolean stackIn_294_1 = false;
        int stackIn_295_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        double[] var7 = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        double var9_double = 0.0;
        Object var9 = null;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        double var14_double = 0.0;
        tl var14 = null;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        short[] var24 = null;
        ed var25 = null;
        double[] var26 = null;
        kg[] var29 = null;
        short[] var30 = null;
        double[] var31 = null;
        double[] var36 = null;
        int[] var37 = null;
        kh var38 = null;
        sb var39 = null;
        var22 = null;
        var23 = null;
        var21 = Torquing.field_u;
        try {
          if (!jb.a(110) &&
            !this.field_J) {
            np.a(la.field_k[this.field_q], false, 124);
          }
          this.field_j = this.field_j + 1;
          this.field_F = this.field_F - this.field_M;
          this.field_S = this.field_S + this.field_M;
          this.field_l = this.field_l + 1;
          this.field_s = this.field_U;
          if (ri.field_E >= 2 &&
            ce.field_b) {
            ko.field_b = false;
          }
          var2_int = 0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          var6 = 0;
          while (ak.c(-85)) {
            var7_int = po.field_z;
            switch (var7_int) {
              case 96:
                var4++;
                this.field_y = false;
                if (mm.field_h) {
                  this.field_P.field_g[0] = this.field_P.field_g[0] - 10.0;
                  this.field_M = this.field_M + 4;
                }
                break;
              case 97:
                this.field_y = false;
                var4--;
                if (mm.field_h) {
                  this.field_M = this.field_M + 8;
                  this.field_P.field_g[0] = this.field_P.field_g[0] + 10.0;
                }
                break;
              case 42:
                if (mm.field_h) {
                  this.field_M = this.field_M + 16;
                  this.field_P.field_g[1] = this.field_P.field_g[1] + 10.0;
                }
                break;
              case 13:
              default:
                if (var7_int != 100 &&
                  var7_int != 82) {
                  if (84 != var7_int &&
                    var7_int != 83) {
                    if (var7_int != 13) {
                      break;
                    }
                    var2_int = 1;
                    break;
                  }
                  var5 = 1;
                  break;
                }
                if (this.field_w) {
                  var6 = 1;
                }
                break;
              case 43:
                if (mm.field_h) {
                  this.field_P.field_g[1] = this.field_P.field_g[1] - 10.0;
                  this.field_M = this.field_M + 32;
                }
                break;
              case 103:
                var4++;
                this.field_y = false;
                var3--;
                break;
              case 105:
                this.field_y = false;
                var3--;
                var4--;
                break;
              case 104:
                this.field_y = false;
                var3++;
                var4--;
                break;
              case 102:
                this.field_y = false;
                var4++;
                var3++;
                break;
              case 99:
                var3--;
                if (mm.field_h) {
                  this.field_P.field_g[2] = this.field_P.field_g[2] - 10.0;
                  this.field_M = this.field_M + 2;
                }
                break;
              case 98:
                if (mm.field_h) {
                  this.field_P.field_g[2] = this.field_P.field_g[2] + 10.0;
                  this.field_M = this.field_M + 1;
                  var3++;
                } else {
                  var3++;
                }
                break;
            }
            if (2 > ri.field_E) {
              continue;
            }
            var7_int = po.field_z;
            if (var7_int == 70) {
              ti.field_k = ti.field_k ^ true;
              continue;
            }
            if (var7_int == 51) {
              ce.field_b = true;
              continue;
            }
            if (38 == var7_int) {
              ce.field_b = false;
              continue;
            }
            if (var7_int == 49) {
              if (!ce.field_b) {
                continue;
              }
              ko.field_b = true;
              continue;
            }
            if (var7_int == 101) {
              this.field_k = this.field_k + 30000;
              this.field_t = true;
              continue;
            }
            if (var7_int == 48) {
              this.field_k = this.field_k - 1000;
              continue;
            }
            if (var7_int != 80 &&
              var7_int != 69) {
              if (var7_int != 57) {
                continue;
              }
              stackIn_117_0 = !(i.field_P[81]);
              mm.field_h = stackIn_117_0;
              this.field_t = this.field_t | mm.field_h;
              continue;
            }
            this.field_k = 0;
            this.field_T = ki.a("ff9040", "ffffff", -93, this.field_T.toString());
            this.g(62);
            vl.field_c = null;
            if (!je.a((byte) 117)) {
              gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
            }
            this.field_l = this.field_l - this.field_U;
            this.field_U = 0;
            return;
          }
          var7_int = this.field_a[0];
          var8 = be.field_o[var7_int * 32 & 2047];
          var9_int = be.field_l[32 * var7_int & 2047];
          this.field_a[0] = 0;
          this.field_a[11] = var8;
          this.field_a[3] = var8;
          this.field_a[9] = var9_int;
          this.field_a[5] = -var9_int;
          this.field_P.field_h.a(vc.field_c[1], this.field_a);
          var38 = (kh) (on.field_e.c((byte) -119));
          while (var38 != null) {
            this.field_P.field_h.a(var38, this.field_a);
            var38 = (kh) (on.field_e.b((byte) 72));
          }
          for (var10 = 9; var10 <= 16; var10++) {
            this.field_P.field_h.a(vc.field_c[var10], this.field_a);
          }
          this.field_a[0] = 1 + var7_int;
          if (0 == (7 & var7_int)) {
            var30 = vc.field_c[9].field_l.field_m;
            var24 = var30;
            var10_ref_short__ = var24;
            var11_int = (short)(65535 & var30[0] + 1024);
            dk.a(var10_ref_short__, 0, var30.length, (short) var11_int);
            this.field_M = this.field_M ^ var11_int << 3;
            this.field_o = this.field_o ^ var11_int << 3;
          }
          this.a(false, var7_int);
          var39 = (sb) (this.field_e.b(0));
          while (var39 != null) {
            var39.a((byte) -114);
            var39 = (sb) (this.field_e.f(-24059));
          }
          if (var2_int != 0) {
            this.field_A.a(true, 1, 2, false);
            return;
          }
          if (ri.field_E >= 2 &&
            ce.field_b &&
            !ko.field_b) {
            return;
          }
          if (this.field_r > 0) {
            if (this.field_r != 1000) {
              if (this.field_r == 2000) {
                th.a(100, th.field_F[3]);
              } else {
                if (this.field_r == 3000) {
                  th.a(100, th.field_F[2]);
                } else {
                  if (this.field_r <= 20) {
                    qj.a(this.field_r, -5205, 96, th.field_F[5]);
                  }
                }
              }
            } else {
              th.a(100, th.field_F[4]);
            }
            this.field_r = this.field_r - 20;
            return;
          }
          if (this.field_x > 0 &&
            this.field_x < 512) {
            var25 = ql.field_u;
            this.field_x = Math.min(512, this.field_x + 10);
            bc.field_a.a(true);
            var25.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[this.field_v][2] * 2) / 2048.0);
            bc.field_a.a(var25, 65536);
            var25.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[this.field_v][0]) / 2048.0);
            bc.field_a.a(var25, 65536);
            var25.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[this.field_v][1] * 2) * 3.141592653589793 / 2048.0);
            bc.field_a.a(var25, 65536);
            var25.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -this.field_x) / 2048.0);
            bc.field_a.a(var25, 65536);
            bc.field_a.a(gj.field_i, (byte) 113);
            re.field_d[0] = 80.0 * (double)be.field_l[this.field_x] / 65535.0;
            re.field_d[1] = (double)be.field_o[this.field_x] * 80.0 / 65535.0;
            this.field_h = Double.NEGATIVE_INFINITY;
            var8_ref_pj = this.field_d.a(-100, false).field_k;
            for (var9_int = -1 + var8_ref_pj.field_k; var9_int >= 0; var9_int--) {
              this.field_h = Math.max(this.field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
            }
          }
          var3 = Math.min(Math.max(var3, -10), 10);
          var7 = new double[3];
          var7[0] = 2670.0 * (double)(be.field_o[this.field_x] * var3) / 65535.0;
          var7[1] = 2670.0 * (double)(-be.field_l[this.field_x] * var3) / 65535.0;
          var7[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
          if (this.field_c >= 0 &&
            !mm.field_h &&
            !this.field_J) {
            stackIn_194_0 = this.field_P;
            stackIn_194_1 = var7;
            stackIn_194_2 = var5;
            stackIn_194_3 = 0.08;
            stackIn_194_4 = var6;
            stackIn_194_5 = 0;
            stackIn_195_6 = (this.field_d == ig.field_q);
            var9_double = ((vg) (Object) stackIn_194_0).a(stackIn_194_1, stackIn_194_2 != 0, stackIn_194_3, stackIn_194_4 != 0, stackIn_194_5, stackIn_195_6);
            if (this.field_y &&
              this.field_P.field_g[2] <= 1400.0 &&
              0.0 <= this.field_P.field_g[5]) {
              this.a(14, (byte) 127, 241);
            }
            if (var9_double > this.field_h &&
              -1.0 == this.field_K) {
              this.field_K = 0.08 * this.field_P.field_g[4];
              th.a(100, th.field_F[22]);
            }
            stackIn_210_0 = (!(var9_double < 100000.0 + this.field_h)) ? 0 : 1;
            var8 = stackIn_210_0;
          } else {
            if (mm.field_h) {
              this.field_P.c(0);
            }
            var8 = 1;
            if (this.field_J) {
              var31 = new double[4];
              var26 = var31;
              var9 = var26;
              ap.a(this.field_P.field_g, 6, this.field_P.field_g, 10, (double[]) (var9), 0, 0.08);
              for (var10 = 0; var10 < 4; var10++) {
                this.field_P.field_g[var10 + 6] = this.field_P.field_g[var10 + 6] + var31[var10];
              }
              for (var10 = 0; var10 < 3; var10++) {
                this.field_P.field_g[10 + var10] = this.field_P.field_g[10 + var10] * 0.8;
              }
              var10_double = 0.1;
              var12_double = this.field_P.field_g[8];
              if (var12_double >= 1.0) {
                stackIn_185_0 = 0.0;
              } else {
                if (!(-1.0 >= var12_double)) {
                  stackIn_185_0 = Math.acos(var12_double);
                } else {
                  stackIn_185_0 = 3.141592653589793;
                }
              }
              var14_double = stackIn_185_0;
              var16 = ql.field_u;
              if (!(0.0001 > var14_double) &&
                !(3.141492653589793 < var14_double)) {
                var17 = Math.sin((-var10_double + 1.0) * var14_double);
                var19 = Math.sin(var14_double * var10_double);
              } else {
                var19 = var10_double;
                var17 = 1.0 - var10_double;
              }
              var16.field_b = var19 + var17 * this.field_P.field_g[8];
              var16.field_d = this.field_P.field_g[7] * var17;
              var16.field_a = var17 * this.field_P.field_g[6];
              var16.field_e = this.field_P.field_g[9] * var17;
              var16.a((byte) -123);
              this.field_P.field_g[8] = var16.field_b;
              this.field_P.field_g[6] = var16.field_a;
              this.field_P.field_g[7] = var16.field_d;
              this.field_P.field_g[9] = var16.field_e;
              this.field_P.c(0);
              this.field_P.field_h.a(this.field_P.field_h.field_g[this.field_P.field_c], this.field_P.field_f);
            }
          }
          if (ig.field_q == this.field_d) {
            var36 = this.field_d.f(14);
            this.field_P.field_g[0] = var36[0];
            this.field_P.field_g[2] = var36[2];
          }
          var37 = this.field_m;
          for (var10 = 0; var37.length > var10; var10++) {
            var11_int = var37[var10];
            if (this.field_D[var11_int] != null) {
              var12_double = this.field_D[var11_int].a(0, 0.08);
              if (var12_double > this.field_h + 100000.0) {
                var14 = this.field_D[var11_int];
                this.a(538, 0, var14.field_h, var14.field_c);
                if (null == ig.field_r[13]) {
                  ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                }
                if (!ig.field_r[13].e(17)) {
                  ig.field_r[13].c(0);
                  ni.a(ig.field_r[13], true);
                }
                this.field_D[var11_int] = null;
              }
            }
          }
          if (param0 <= 35) {
            return;
          }
          for (var9_int = 0; this.field_Q.length > var9_int; var9_int++) {
            if (this.field_Q[var9_int] != null) {
              this.field_Q[var9_int].a(true);
              if (this.field_Q[var9_int].field_a == null) {
                this.field_Q[var9_int] = null;
              }
            }
          }
          if (!this.field_J) {
            this.field_k = this.field_k - 20;
            if (this.field_d != ig.field_q &&
              10000 >= this.field_k &&
              0 < this.field_k &&
              (20 + (this.field_k - 1)) % 1000 < 20) {
              th.a(100, th.field_F[20]);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_J) {
            if (ig.field_q != this.field_d &&
              0 >= this.field_k &&
              this.field_k > -20) {
              this.b(12, 1);
              th.a(100, th.field_F[21]);
            } else {
              if (var8 != 0) {
                if (this.field_c < 0) {
                  var9_int = 1;
                  var29 = this.field_Q;
                  for (var11_int = 0; var29.length > var11_int; var11_int++) {
                    var12 = var29[var11_int];
                    if (var12 != null) {
                      var9_int = 0;
                    }
                  }
                  if ((var9_int != 0)) {
                    this.b(12, 2);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (0 > this.field_k) {
                    this.b(9);
                    this.field_g = true;
                    if (je.a((byte) 69)) {
                      if (this.field_U == 0) {
                        if (ao.field_f == 0) {
                          stackIn_291_0 = (this.field_L != 0) ? 1 : 0;
                        } else {
                          stackIn_291_0 = 1;
                        }
                      } else {
                        stackIn_291_0 = 1;
                      }
                      var9_int = stackIn_291_0;
                      stackIn_294_0 = this.field_A;
                      stackIn_294_1 = true;
                      if (var9_int == 0) {
                        stackIn_295_2 = 0;
                      } else {
                        stackIn_295_2 = 7;
                      }
                      ((Torquing) (Object) stackIn_294_0).a(stackIn_294_1, stackIn_295_2, 2, false);
                    } else {
                      stackIn_281_0 = this.field_A;
                      stackIn_281_1 = true;
                      if (0 != ao.field_f) {
                        stackIn_282_2 = 8;
                      } else {
                        stackIn_282_2 = 2;
                      }
                      ((Torquing) (Object) stackIn_281_0).a(stackIn_281_1, stackIn_282_2, 2, false);
                    }
                  }
                }
              } else {
                this.b(12, 0);
              }
            }
          } else {
            if (this.field_k <= 0) {
              if (this.field_d.field_m != null &&
                wi.field_a[this.field_L + 1] == wi.field_a[this.field_L]) {
                this.field_A.a(true, this.field_L + 1, 6, false);
              } else {
                this.field_A.a(true, wi.field_a[this.field_L], 8, false);
              }
            } else {
              var9_int = 300;
              if (this.field_k < var9_int) {
                var9_int = this.field_k;
              }
              this.field_k = this.field_k - var9_int;
              this.a((byte) 115, (1 + this.field_d.field_s) * var9_int / 100);
            }
          }
          if (!this.field_g &&
            !this.field_J) {
            var9 = null;
            for (var10 = 0; var10 < this.field_D.length; var10++) {
              var11 = this.field_D[var10];
              if (null != var11 &&
                var11.field_r != 3 && (!(var11.field_r >= 25) ||
                !(var11.field_r <= 31)) && var11.a(0, this.field_P.field_g)) {
                var11.field_t = (tl) (var9);
                var9 = var11;
                var11.a(80);
                this.field_D[var10] = null;
              }
            }
            while (null != var9) {
              ((tl) (var9)).a(this, 19);
              var9 = ((tl) (var9)).field_t;
            }
          }
          if (jb.field_d == 10 &&
            !la.field_k[10].e(17)) {
            np.a(la.field_k[this.field_q], false, 127);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.E(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
          field_u = null;
          field_I = null;
          field_f = null;
          if (param0 != -3) {
            sm var2 = (sm) null;
            bi.a((sm) null, 58);
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.V(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        try {
          this.b(param0 ^ 5);
          eq.field_b = param1;
          this.field_A.a(true, 5, 2, false);
          la.field_k[param0].a(false);
          jh.a(la.field_k[12], param0 ^ 12);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "bi.W(" + param0 + ',' + param1 + ')');
        }
    }

    bi(Torquing param0, int param1) {
        int var4 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        StringBuilder var6 = null;
        this.field_t = false;
        this.field_e = new ei();
        this.field_B = new ei();
        this.field_E = 1365;
        this.field_N = -17;
        this.field_S = -1878996731;
        this.field_L = 0;
        this.field_H = 80;
        this.field_w = false;
        this.field_F = 68616224;
        this.field_G = 0;
        this.field_i = tp.field_a;
        this.field_n = 0;
        this.field_v = 0;
        this.field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
        this.field_Q = new kg[1];
        this.field_c = 0;
        this.field_b = new int[qc.field_ab.length];
        this.field_z = 0;
        this.field_J = false;
        try {
          this.field_o = 50456792;
          this.field_A = param0;
          dd.field_d = 0;
          ao.field_f = 0;
          this.field_M = -1046390103;
          this.field_G = this.field_G + (param1 + (param1 << 6));
          this.field_S = this.field_S + this.field_N * ((param1 << 6) + param1);
          this.field_l = -547216422;
          this.field_j = 538264946;
          this.field_L = param1;
          if (null == gj.field_i) {
            gj.field_i = new int[12];
            ap.a(gj.field_i, il.field_m[this.field_v]);
          }
          if (this.field_T == null) {
            var6 = new StringBuilder(104);
            for (var4 = 0; var4 < 8; var4++) {
              discarded$0 = var6.append("<col=ffffff>");
              discarded$1 = var6.append(fh.field_s.charAt(var4));
            }
            this.field_T = var6.toString();
          }
          this.field_d = ol.field_f[param1];
          this.field_q = 1 + wi.field_a[param1];
          this.field_P = new vg();
          this.h(104);
          vl.field_c = null;
          gn.field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("bi.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
