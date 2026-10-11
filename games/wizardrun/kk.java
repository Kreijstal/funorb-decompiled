/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends mh implements qd {
    private nk field_wb;
    static int field_xb;
    static boolean field_yb;
    private boolean field_Cb;
    static String field_vb;
    static o[] field_Bb;
    static int field_zb;
    private boolean field_Ab;

    final void p(int param0) {
        this.a(true, hf.a(param0 + 20320, tk.field_f, 248), 3899);
        if (param0 == -20371) {
          return;
        }
        field_xb = 66;
    }

    kk(wi param0, nk param1) {
        super(param0, va.field_i, sc.field_o, false, false);
        try {
          this.field_wb = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, wd param1, int param2) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vc var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          this.field_Cb = true;
          if (param1.field_i) {
            var4 = jl.field_v;
          } else {
            if (param1.field_c == null) {
              var4 = param1.field_h;
              if (param1.field_b == 248) {
                if (!param0) {
                  kb.j((byte) 63);
                }
                var4 = tk.field_f;
                this.field_Ab = true;
              }
            } else {
              var4 = uc.field_e;
              if (null != this.field_wb) {
                this.field_wb.a(param2 ^ 2147479748);
              }
            }
          }
          var5 = new vc((mh) (this), va.field_i, var4);
          if (!param1.field_i) {
            if (!this.field_Ab) {
              if (param1.field_b != 5) {
                var5.a((byte) -31, ti.field_h, -1);
              } else {
                var5.a((byte) -31, da.field_j, 11);
                var5.a((byte) -31, pk.field_q, 17);
              }
            } else {
              var5.a(0, e.field_e, (ce) (this));
            }
            if (3 == param1.field_b) {
              var5.a((byte) -31, vl.field_g, 7);
            } else {
              if (param1.field_b == 6) {
                var5.a((byte) -31, ka.field_h, 9);
              }
            }
          } else {
            if (param1.field_d) {
              this.c(new re(this), -128);
              return;
            }
            var5.a(0, e.field_e, (ce) (this));
          }
          if (param2 != 3899) {
            this.p(-101);
          }
          this.c(var5, -121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_35_0 = var4_ref;
          stackIn_35_1 = new StringBuilder().append("kk.CC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_vb = null;
        field_Bb = null;
        if (param0 > 99) {
          return;
        }
        field_zb = -101;
    }

    final static void o(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        of var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mg var14 = null;
        int[][] var18 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = wizardrun.field_H;
        try {
          var14 = nk.field_N;
          var2 = var14.f(255);
          var3 = (of) (bh.field_b.b((byte) 53));
          if (param0 > -111) {
            kk.j((byte) -83);
          }
          while (var3 != null) {
            if (var2 != var3.field_j) {
              var3 = (of) (bh.field_b.d(8192));
              continue;
            }
            break;
          }
          if (var3 == null) {
            ql.a(-93);
            return;
          }
          var4 = var14.f(255);
          if (var4 != 0) {
            var5 = var3.field_i;
            ld.field_c[0] = d.field_a;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              ld.field_c[var6_int] = var14.d(0);
            }
            bc.a((byte) -69, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              ci.a(2026380485, var14);
              if (var6_intLifetime1 != 0) {
                rd.a(var6_intLifetime1, ki.field_M, lj.field_a, -82, ia.field_j, bi.field_a);
              } else {
                rd.a(var6_intLifetime1, ki.field_M, lj.field_a, -121, ia.field_j, bi.field_a);
              }
            }
            fl.f(var5, 16);
            var6 = new String[2][var5];
            var18 = new int[2][4 * var5];
            var8 = lg.field_d;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = sj.field_m[var9];
              var6[0][var10] = ld.field_c[var11];
              var18[0][4 * var10] = ug.field_I[var11];
              var18[0][1 + 4 * var10] = sk.field_B[var11];
              var18[0][var10 * 4 + 2] = tf.field_c[var11];
              var18[0][3 + var10 * 4] = mk.field_c[var11];
              if (qj.a(ld.field_c[var11], 110) &&
                mk.field_c[var11] + (sk.field_B[var11] + tf.field_c[var11]) == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = sj.field_m[var5 + var9Lifetime1];
              var6[1][var13] = ld.field_c[var11Lifetime1];
              var18[1][4 * var13] = ug.field_I[var11Lifetime1];
              var18[1][1 + var13 * 4] = sk.field_B[var11Lifetime1];
              var18[1][4 * var13 + 2] = tf.field_c[var11Lifetime1];
              var18[1][4 * var13 + 3] = mk.field_c[var11Lifetime1];
              if (qj.a(ld.field_c[var11Lifetime1], 81) &&
                0 == mk.field_c[var11Lifetime1] + sk.field_B[var11Lifetime1] + tf.field_c[var11Lifetime1]) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
            var3.a(false);
            return;
          }
          var3.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "kk.DC(" + param0 + ')');
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        if (this.field_Ab) {
          di.a(true, false, param0 + 19029);
          return;
        }
        try {
          hc.f(92682);
          if (param0 != -18905) {
            this.field_Ab = false;
          }
          this.l(param0 ^ 9704);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "kk.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean g(int param0) {
        if (!this.field_H) {
          if (param0 == 1) {
            return super.g(1);
          }
          kk.j((byte) -27);
          return super.g(1);
        }
        if (this.field_Cb) {
          if (param0 == 1) {
            return super.g(1);
          }
          kk.j((byte) -27);
          return super.g(1);
        }
        wd var2 = ti.a((byte) -123);
        if (var2 != null) {
          this.a(false, var2, 3899);
          if (param0 == 1) {
            return super.g(1);
          }
          kk.j((byte) -27);
          return super.g(1);
        }
        if (param0 == 1) {
          return super.g(1);
        }
        kk.j((byte) -27);
        return super.g(1);
    }

    static {
        field_vb = "The Demon Fortress";
        field_zb = 500;
    }
}
