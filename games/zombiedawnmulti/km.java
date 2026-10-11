/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sq {
    static ao field_W;
    private j field_Y;
    static boolean[] field_ab;
    private String field_bb;
    private ja field_Z;
    private int field_X;
    static int field_cb;

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        re var6;
        int var13;
        rk var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ja var15;
        ja var16;
        ja var17;
        ja var18;
        int var11Lifetime1;
        int var12Lifetime1;
        re var6Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var6 = this.field_Y.d(102);
        if (var6 != h.field_H &&
          var6 != ua.field_I) {
          var5 = this.field_Y.c(-120);
          if (var5 == null) {
            var5 = this.field_bb;
          }
        } else {
          var5 = ki.field_n;
        }
        if (!var5.equals(this.field_j)) {
          this.field_j = var5;
          this.a((byte) 94);
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime1 = this.field_Y.d(97);
        var8 = (rk) ((Object) this.field_h);
        var9 = this.field_y + param3;
        var10 = var8.a((cf) (this), 0, param1) + (var8.a((cf) (this), param0 - 99).a((byte) -111) >> 1);
        if (h.field_H == var6Lifetime1) {
          var18 = rj.field_I[0];
          var11 = var18.field_z << 1;
          var12 = var18.field_u << 1;
          if (this.field_Z == null) {
            this.field_Z = new ja(var11, var12);
            r.a(0, this.field_Z);
          } else {
            if (this.field_Z.field_x < var11) {
              this.field_Z = new ja(var11, var12);
              r.a(0, this.field_Z);
            } else {
              if (this.field_Z.field_w < var12) {
                this.field_Z = new ja(var11, var12);
                r.a(0, this.field_Z);
              } else {
                r.a(0, this.field_Z);
                oo.b();
              }
            }
          }
          var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -this.field_X << 10, 4096);
          ql.a(true);
          this.field_Z.e(var9 - (var18.field_z >> 1), var10 - var18.field_u, 256);
          return;
        }
        if (ua.field_I != var6Lifetime1) {
          if (jq.field_b == var6Lifetime1) {
            var15 = rj.field_I[2];
            var15.e(var9, var10 - (var15.field_w >> 1), 256);
            return;
          }
          if (var6Lifetime1 == db.field_b) {
            var16 = rj.field_I[1];
            var16.e(var9, -(var16.field_w >> 1) + var10, 256);
          }
          return;
        }
        var17 = rj.field_I[0];
        var11Lifetime1 = var17.field_z << 1;
        var12Lifetime1 = var17.field_u << 1;
        if (this.field_Z == null) {
          this.field_Z = new ja(var11Lifetime1, var12Lifetime1);
          r.a(0, this.field_Z);
        } else {
          if (this.field_Z.field_x < var11Lifetime1) {
            this.field_Z = new ja(var11Lifetime1, var12Lifetime1);
            r.a(0, this.field_Z);
          } else {
            if (this.field_Z.field_w < var12Lifetime1) {
              this.field_Z = new ja(var11Lifetime1, var12Lifetime1);
              r.a(0, this.field_Z);
            } else {
              r.a(0, this.field_Z);
              oo.b();
            }
          }
        }
        var17.a(112, 144, var17.field_z << 4, var17.field_u << 4, -this.field_X << 10, 4096);
        ql.a(true);
        this.field_Z.e(var9 - (var17.field_z >> 1), var10 - var17.field_u, 256);
        return;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        ab var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = (ab) (ig.field_a.c(92));
          while (var5 != null) {
            ih.a((byte) 99, var5, param0);
            var5 = (ab) (ig.field_a.b(6));
          }
          var2_int = -37 / ((-63 - param1) / 58);
          var3 = so.field_j.c(48);
          while (var3 != null) {
            qo.b(true, param0);
            var3 = so.field_j.b(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
          this.field_X = this.field_X + 1;
          if (param0 != -5407) {
            km.i(56);
          }
          super.a(param0 ^ 0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "km.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
          return;
        }
        field_W = null;
        field_ab = null;
    }

    final static void a(ul param0, byte param1) {
        cj var5 = null;
        cj var6 = null;
        cj var3 = null;
        try {
          pa.field_T = fl.a("basic", "display_name_changed", param0, 11091);
          eg.field_B = new cd(0L, oj.field_Q, iq.field_a, dg.field_I);
          gl.field_L = new cd(0L, oj.field_Q, kg.field_i, qh.field_d);
          pa.field_O = new cj(0L, (cj) null);
          dp.field_b = new cj(0L, vo.field_m);
          dp.field_b.field_R = 1;
          bi.field_f = new cj(0L, vd.field_a, qd.field_r);
          jb.field_c = new cj(0L, pn.field_g, ko.field_h);
          lk.field_J = new cj(0L, cm.field_b);
          if (param1 > -106) {
            km.h(-103);
          }
          pa.field_O.a((byte) 50, dp.field_b);
          pa.field_O.a((byte) 50, bi.field_f);
          pa.field_O.a((byte) 50, jb.field_c);
          pa.field_O.a((byte) 50, eg.field_B);
          pa.field_O.a((byte) 50, lk.field_J);
          eg.field_B.field_Jb.field_Jb.b((byte) -32, vo.field_m);
          eg.field_B.field_Jb.field_Jb.field_lb = 1;
          var5 = eg.field_B.field_Jb.field_Jb;
          var6 = var5;
          var6.field_R = 1;
          gl.field_L.field_Jb.field_Jb.b((byte) -32, vo.field_m);
          gl.field_L.field_Jb.field_Jb.field_lb = 1;
          var3 = gl.field_L.field_Jb.field_Jb;
          var3.field_R = 1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "km.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        int var2 = 82 / ((param0 - 53) / 57);
        return null;
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("km.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (!og.field_N) {
          throw new IllegalStateException();
        }
        hh.field_m = true;
        sc.a(-86, false);
        a.field_b = param0;
    }

    final static ka b(int param0, int param1, int param2, int param3) {
        boolean stackIn_43_0 = false;
        boolean stackIn_47_0 = false;
        boolean stackIn_56_0 = false;
        boolean stackIn_60_0 = false;
        boolean stackIn_68_0 = false;
        boolean stackIn_72_0 = false;
        boolean stackIn_79_0 = false;
        boolean stackIn_83_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ka var8_ref_ka;
        int var9;
        ka var9_ref_ka;
        int var10;
        String var10_ref_String;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime1Lifetime1;
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = null;
        tn.field_A.field_Gb.field_Cb.e(-30986);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + uf.field_g; var7 >= 0; var7--) {
          var8_ref_ka = uk.field_M[var7];
          var9 = 0;
          if (!nh.field_m &&
            var5 < sj.field_m) {
            var10 = ga.a(var8_ref_ka.field_l, true);
            if (var8_ref_ka.a(true) >= var10 && (var8_ref_ka.field_k ||
              !hp.a(var8_ref_ka.field_e, 1020))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (var8_ref_ka.field_q == null ||
              bn.field_b) {
              if (null == var8_ref_ka.field_q) {
                id.field_D = id.field_D + 1;
              }
              var10_ref_String = bh.a(-126, var8_ref_ka);
              var11 = var10_ref_String + fm.c(var8_ref_ka.field_d);
              var12 = cj.a(var8_ref_ka, (byte) -63);
              var8_ref_ka.field_q = new cj(0L, qq.field_f, var11);
              var6 = var6 + param2;
              var8_ref_ka.field_q.field_xb = (8355711 & qq.field_f.field_xb >> 1) + var12 - ((var12 & 16711422) >> 1);
              var8_ref_ka.field_q.field_ob = (8355711 & qq.field_f.field_ob >> 1) + (var12 - ((var12 & 16711422) >> 1));
              var8_ref_ka.field_q.field_yb = w.field_A;
              var8_ref_ka.field_q.field_M = var12;
            }
            var5++;
          } else {
            var8_ref_ka.field_q = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; uf.field_g > var8; var8++) {
          var9_ref_ka = uk.field_M[var8];
          if (var9_ref_ka.field_q != null) {
            tn.field_A.field_Gb.a((byte) 50, var9_ref_ka.field_q);
            var9_ref_ka.field_q.a(param2, var7Lifetime1, var9_ref_ka.field_q.e(0), param3, -3344);
            var7Lifetime1 = var7Lifetime1 + param2;
            if (0 != var9_ref_ka.field_q.field_T) {
              var4 = var9_ref_ka;
            }
          }
        }
        var8Lifetime1 = -var7Lifetime1 - (-var6 - (tn.field_A.field_Gb.field_z + tn.field_A.field_Gb.field_I));
        tn.field_A.field_Gb.field_Q = tn.field_A.field_Gb.field_Q + var8Lifetime1;
        var9Lifetime1 = -121 / ((-54 - param0) / 40);
        tn.field_A.field_Gb.field_z = tn.field_A.field_Gb.field_z - var8Lifetime1;
        if (bn.field_b) {
          tn.field_A.field_Gb.field_z = var7Lifetime1;
        }
        tn.field_A.field_Gb.field_I = var7Lifetime1 - tn.field_A.field_Gb.field_z;
        if (!bn.field_b) {
          if (sq.field_N) {
            if (null == lj.field_v) {
              var10Lifetime1 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z - tn.field_A.field_Gb.field_I);
              if (!sp.field_h) {
                tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                stackIn_68_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime1);
                sp.field_h = stackIn_68_0;
              } else {
                tn.field_A.field_Gb.field_mb = var10Lifetime1 - tn.field_A.field_Gb.field_Q;
                tn.field_A.a(2 * (param2 * param1), 112, param2, true);
                stackIn_72_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime1);
                sp.field_h = stackIn_72_0;
              }
              return (ka) (var4);
            }
            sp.field_h = true;
          }
          var10Lifetime1Lifetime1 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z - tn.field_A.field_Gb.field_I);
          if (!sp.field_h) {
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_79_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime1Lifetime1);
            sp.field_h = stackIn_79_0;
          } else {
            tn.field_A.field_Gb.field_mb = var10Lifetime1Lifetime1 - tn.field_A.field_Gb.field_Q;
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_83_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime1Lifetime1);
            sp.field_h = stackIn_83_0;
          }
          return (ka) (var4);
        }
        tn.field_A.field_Gb.field_mb = 0;
        bn.field_b = false;
        tn.field_A.field_Gb.field_Q = -tn.field_A.field_Gb.field_z + tn.field_A.field_Jb.field_z;
        sp.field_h = true;
        if (!sq.field_N) {
          var10Lifetime2 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z - tn.field_A.field_Gb.field_I);
          if (!sp.field_h) {
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_43_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime2);
            sp.field_h = stackIn_43_0;
          } else {
            tn.field_A.field_Gb.field_mb = var10Lifetime2 - tn.field_A.field_Gb.field_Q;
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_47_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime2);
            sp.field_h = stackIn_47_0;
          }
        } else {
          if (null != lj.field_v) {
            sp.field_h = true;
          }
          var10Lifetime2 = tn.field_A.field_Jb.field_z + (-tn.field_A.field_Gb.field_z - tn.field_A.field_Gb.field_I);
          if (!sp.field_h) {
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_60_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime2);
            sp.field_h = stackIn_60_0;
          } else {
            tn.field_A.field_Gb.field_mb = var10Lifetime2 - tn.field_A.field_Gb.field_Q;
            tn.field_A.a(2 * (param2 * param1), 112, param2, true);
            stackIn_56_0 = (tn.field_A.field_Gb.field_Q + tn.field_A.field_Gb.field_mb == var10Lifetime2);
            sp.field_h = stackIn_56_0;
          }
        }
        return (ka) (var4);
    }

    km(j param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pa.g((byte) 120));
        try {
          this.field_bb = param1;
          this.field_Y = param0;
          this.b(param2, param3, 28972, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_W = new ao(4, 1, 1, 1);
        field_cb = 480;
    }
}
