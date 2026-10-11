/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends de {
    static jj field_o;
    static String field_p;
    static int field_q;

    public static void f(byte param0) {
        field_p = null;
        if (param0 > -120) {
          fq.g((byte) 46);
        }
        field_o = null;
    }

    final int b(int param0, int param1) {
        int var3 = -58 % ((-13 - param0) / 37);
        if (jg.a((byte) 88)) {
          return (this.field_i >> 1) + this.field_d;
        }
        if (param1 < 2) {
          return this.field_d;
        }
        return this.field_d + this.field_i;
    }

    fq(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final int a(int param0, byte param1) {
        if (param1 != 90) {
          return 74;
        }
        if (jg.a((byte) 62)) {
          return param0 != 0 ? 470 : 50;
        }
        int var3 = param0 > 1 ? -2 + param0 : param0;
        return this.field_m + var3 * 290;
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (jg.a((byte) 115)) {
          this.field_g.a(53, 0);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.field_g.c((byte) 35)) {
          var2 = this.field_g.field_j;
          var3 = ke.field_a;
          if (var2 == -1 && (var3 == 96 ||
            var3 == 97 ||
            98 == var3 ||
            var3 == 99)) {
            this.field_g.a(false, 0);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (ke.field_a == 96) {
              if (1 == var2 ||
                3 == var2) {
                this.field_g.a(false, var2 - 1);
              }
            } else {
              if (97 == ke.field_a) {
                if (var2 == 0 ||
                  var2 == 2) {
                  this.field_g.a(false, var2 + 1);
                }
              } else {
                if (ke.field_a == 99) {
                  if (var2 < 2) {
                    this.field_g.a(false, var2 + 2);
                  }
                } else {
                  if (ke.field_a == 98 &&
                    var2 > 1) {
                    this.field_g.a(false, var2 - 2);
                  }
                }
              }
            }
          }
        }
        if (param0 > -35) {
          return;
        }
        this.field_g.b((byte) -71);
    }

    final void a(byte param0, boolean param1, int param2) {
        int stackIn_5_1 = 0;
        tf stackIn_7_2 = null;
        if (param0 >= -116) {
          fq.g((byte) 97);
        }
        stackIn_5_1 = 35;
        if (jg.a((byte) 101) &&
          param2 == 0) {
          stackIn_7_2 = oc.field_S;
        } else {
          stackIn_7_2 = oc.field_N;
        }
        super.a((byte) stackIn_5_1, stackIn_7_2, param1, param2);
    }

    final static void a(aa param0, byte param1) {
        int var2_int = 0;
        aa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 != 64) {
            field_o = (jj) null;
          }
          if (null == param0.field_g) {
            return;
          }
          if (param0.field_d != 0 ||
            param0.field_e != 0) {
            for (var2_int = 0; var2_int < sd.field_L; var2_int++) {
              var3 = de.field_e[var2_int];
              if (var3.field_j == 2 &&
                var3.field_d == param0.field_d &&
                var3.field_e == param0.field_e) {
                return;
              }
            }
          }
          if (param0.field_l != null) {
            um.field_o = param0.field_n;
            vi.field_F = param0.field_k;
            up.field_h = param0.field_l;
            hm.field_b = param0.field_j;
          }
          vd.a(false, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("fq.I(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          field_q = -11;
        }
        int var3 = (-(2 * this.field_m) + 640) / 2;
        if (!jg.a((byte) 116)) {
          return this.a(param0, (byte) 90) + var3;
        }
        if (0 == param0) {
          return this.a(param0, (byte) 90) + 350;
        }
        return 100 + this.a(param0, (byte) 90);
    }

    final void c(byte param0) {
        la.a(this.field_l, nc.field_a, false, -25528);
        if (param0 >= -13) {
          field_q = -93;
        }
    }

    final static void g(byte param0) {
        ql.a(ao.a(13867), -7624);
        if (param0 >= -46) {
          fq.g((byte) -70);
        }
    }

    final void a(int param0) {
        int stackIn_15_0 = 0;
        String stackIn_28_0 = null;
        String var2;
        ob var3_ref_ob;
        int var3;
        ue var4;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var14;
        int var15;
        int var16;
        int[] var20;
        int var12Lifetime1;
        String var2Lifetime1;
        L0: {
          var16 = Pixelate.field_H ? 1 : 0;
          gj.field_W[5].b(0, 45);
          this.b((byte) -71);
          this.d((byte) -63);
          if (jg.a((byte) 74)) {
            var2 = wo.field_a;
          } else {
            if (aa.field_p == null) {
              aa.field_p = g.a(3, (byte) 103, 1, 10, 0);
            }
            var3_ref_ob = rk.field_e;
            var4 = aa.field_p;
            if (var4.field_n) {
              if (var4.field_r != null) {
                var2 = wo.field_a;
                var5 = var4.field_r[of.field_a];
                var20 = var4.field_l[of.field_a];
                var7 = ge.a(wh.field_p, var4, of.field_a, -7402);
                var8 = 16777215;
                var9 = 0;
                var10 = 16711680;
                var11 = var3_ref_ob.field_w + 150;
                var3_ref_ob.c(kh.field_b, 150, var11, 0, 0);
                var3_ref_ob.a(ij.field_q, 170, var11, 0, 0);
                var3_ref_ob.c(lo.field_Kb, 500, var11, 0, 0);
                var11 += 20;
                for (var12 = 0; var12 < 10; var12++) {
                  if (var5[var12] != null) {
                    var13 = var20[var12];
                    var14 = var5[var12];
                    stackIn_15_0 = (var12 == var7) ? var10 : var8;
                    var15 = stackIn_15_0;
                    qj.field_e.c(1 + var12 + ". ", 140, var11, var15, var9);
                    qj.field_e.a(var14, 180, var11, var15, var9);
                    qj.field_e.c(Integer.toString(var13), 480, var11, var15, var9);
                    var2 = "";
                  }
                  var11 += 15;
                }
                if (((null != wh.field_p)) &&
                  ((var7 == -1))) {
                  var12Lifetime1 = wh.field_p.field_k[0];
                  qj.field_e.a(kn.field_J, 180, var11, var8, var9);
                  qj.field_e.c(Integer.toString(var12Lifetime1), 480, var11, var8, var9);
                }
                break L0;
              }
              var2 = pf.field_l;
            } else {
              var2 = wd.field_b;
            }
          }
        }
        if (param0 != 11) {
          field_o = (jj) null;
        }
        var3 = 225 + rk.field_e.field_w;
        rk.field_e.b(var2, 330, var3, 0, 0);
        if (jg.a((byte) 96)) {
          stackIn_28_0 = mj.field_h;
        } else {
          stackIn_28_0 = pf.field_b;
        }
        var2Lifetime1 = stackIn_28_0;
        qj.field_e.b(var2Lifetime1, 320, 330 + (rk.field_e.field_w + 12), 14540253, 3355443);
    }

    static {
        field_p = "Waiting for music";
    }
}
