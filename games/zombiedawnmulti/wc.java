/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends id {
    static int field_N;
    static int field_O;
    static ja[] field_M;
    private uj field_R;
    static String field_G;
    static boolean field_J;
    private String field_P;
    private int field_F;
    static th field_K;
    static char field_I;
    private uj field_L;
    static cj field_H;

    final static uj b(int param0, int param1) {
        wj var2 = new wj(param1);
        var2.field_m.g(param0);
        fd.field_M.a(var2, false);
        return var2.field_m;
    }

    final static void i(int param0) {
        dm var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ej.field_n = null;
          mh.field_c = null;
          la.field_k = false;
          if (cg.field_i != null) {
            cg.field_i.e(-30986);
            cg.field_i = null;
          }
          hq.field_c = null;
          if (tn.field_C != null) {
            tn.field_C.e(-30986);
            tn.field_C = null;
          }
          af.field_h = null;
          if (null != nh.field_g) {
            nh.field_g.e(-30986);
            nh.field_g = null;
          }
          kp.field_o = null;
          if (hq.field_c != null) {
            var1 = (dm) (hq.field_c.a((byte) 7));
            while (var1 != null) {
              var1.a(param0 ^ 32692);
              var1 = (dm) (hq.field_c.c((byte) 97));
            }
            hq.field_c = null;
          }
          if (param0 != -28264) {
            field_M = (ja[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "wc.L(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 == -66) {
          field_H = null;
          field_M = null;
          field_K = null;
          field_G = null;
          return;
        }
        wc.a(62, false);
        field_H = null;
        field_M = null;
        field_K = null;
        field_G = null;
    }

    final static void a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_2 = false;
        int stackIn_17_0 = 0;
        boolean stackIn_20_1 = false;
        boolean stackIn_21_2 = false;
        boolean stackIn_33_1 = false;
        boolean stackIn_34_2 = false;
        int stackIn_50_0 = 0;
        boolean stackIn_50_1 = false;
        boolean stackIn_53_2 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_66_1 = false;
        boolean stackIn_67_2 = false;
        boolean stackIn_79_1 = false;
        boolean stackIn_80_2 = false;
        int stackIn_94_0 = 0;
        boolean stackIn_94_1 = false;
        boolean stackIn_97_2 = false;
        int stackIn_107_0 = 0;
        boolean stackIn_110_1 = false;
        boolean stackIn_111_2 = false;
        boolean stackIn_123_1 = false;
        boolean stackIn_124_2 = false;
        int stackIn_138_0 = 0;
        boolean stackIn_138_1 = false;
        boolean stackIn_141_2 = false;
        int stackIn_151_0 = 0;
        boolean stackIn_154_1 = false;
        boolean stackIn_155_2 = false;
        boolean stackIn_167_1 = false;
        boolean stackIn_168_2 = false;
        int var2;
        hi.h(2);
        if (null == mh.field_c) {
          var2 = 0;
          stackIn_17_0 = 1;
          if (hh.field_b) {
            stackIn_4_0 = stackIn_17_0;
            stackIn_4_1 = true;
            stackIn_7_2 = (ib.field_a <= 50) ? false : true;
            df.a(stackIn_4_0 != 0, stackIn_4_1, stackIn_7_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
          } else {
            if (cp.field_K) {
              stackIn_33_1 = true;
              stackIn_34_2 = (ib.field_a <= 50) ? false : true;
              df.a(stackIn_17_0 != 0, stackIn_33_1, stackIn_34_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
            } else {
              stackIn_20_1 = false;
              stackIn_21_2 = (ib.field_a <= 50) ? false : true;
              df.a(stackIn_17_0 != 0, stackIn_20_1, stackIn_21_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
            }
          }
        } else {
          if (mh.field_c.field_cc == 2) {
            var2 = 1;
            stackIn_151_0 = 1;
            if (hh.field_b) {
              stackIn_138_0 = stackIn_151_0;
              stackIn_138_1 = true;
              stackIn_141_2 = (ib.field_a <= 50) ? false : true;
              df.a(stackIn_138_0 != 0, stackIn_138_1, stackIn_141_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
            } else {
              if (cp.field_K) {
                stackIn_167_1 = true;
                stackIn_168_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_151_0 != 0, stackIn_167_1, stackIn_168_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              } else {
                stackIn_154_1 = false;
                stackIn_155_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_151_0 != 0, stackIn_154_1, stackIn_155_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              }
            }
            if (cf.field_r) {
              ma.field_a.b((byte) -35, 57);
              cf.field_r = false;
            }
            if (uk.field_N) {
              ma.field_a.b((byte) -35, 10);
              uk.field_N = false;
            }
            if (pb.field_f) {
              qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
              pb.field_f = false;
            }
            return;
          }
          if (mh.field_c.field_cc == 4) {
            var2 = 1;
            stackIn_107_0 = 1;
            if (hh.field_b) {
              stackIn_94_0 = stackIn_107_0;
              stackIn_94_1 = true;
              stackIn_97_2 = (ib.field_a <= 50) ? false : true;
              df.a(stackIn_94_0 != 0, stackIn_94_1, stackIn_97_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
            } else {
              if (cp.field_K) {
                stackIn_123_1 = true;
                stackIn_124_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_107_0 != 0, stackIn_123_1, stackIn_124_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              } else {
                stackIn_110_1 = false;
                stackIn_111_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_107_0 != 0, stackIn_110_1, stackIn_111_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              }
            }
          } else {
            var2 = 0;
            stackIn_63_0 = 1;
            if (hh.field_b) {
              stackIn_50_0 = stackIn_63_0;
              stackIn_50_1 = true;
              stackIn_53_2 = (ib.field_a <= 50) ? false : true;
              df.a(stackIn_50_0 != 0, stackIn_50_1, stackIn_53_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
            } else {
              if (cp.field_K) {
                stackIn_79_1 = true;
                stackIn_80_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_63_0 != 0, stackIn_79_1, stackIn_80_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              } else {
                stackIn_66_1 = false;
                stackIn_67_2 = (ib.field_a <= 50) ? false : true;
                df.a(stackIn_63_0 != 0, stackIn_66_1, stackIn_67_2, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              }
            }
          }
        }
        if (cf.field_r) {
          ma.field_a.b((byte) -35, 57);
          cf.field_r = false;
        }
        if (uk.field_N) {
          ma.field_a.b((byte) -35, 10);
          uk.field_N = false;
        }
        if (pb.field_f) {
          qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
          pb.field_f = false;
        }
    }

    final void f(byte param0) {
        if (param0 >= -79) {
          wc.a(8, false);
          if (0 >= this.field_F) {
            this.a(true);
            return;
          }
          this.field_F = this.field_F - 7;
          this.field_E = this.field_E - 131072;
          if (0 > this.field_F) {
            this.field_F = 0;
            return;
          }
          return;
        }
        if (0 >= this.field_F) {
          this.a(true);
          return;
        }
        this.field_F = this.field_F - 7;
        this.field_E = this.field_E - 131072;
        if (0 > this.field_F) {
          this.field_F = 0;
          return;
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.c(this.g(param0 ^ -10199), -20126);
          var4 = param1.d(this.h(-109), 116);
          ah.field_e.a(this.field_P, var3_int, var4, 3, -1, this.field_F);
          if (null != this.field_R) {
            if (this.field_R.k()) {
              this.field_R = null;
              this.field_L = null;
            } else {
              var5 = sd.b(125, var4, var3_int);
              this.field_R.h(var5);
              if (this.field_L != null) {
                this.field_L.h(var5);
              }
            }
          }
          if (param0 != -10136) {
            field_H = (cj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        if (param0 <= 88) {
          return false;
        }
        return og.field_N;
    }

    wc(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        this.field_R = null;
        this.field_L = null;
        this.field_P = Integer.toString(param2);
        this.field_F = 255;
        if (!param3) {
          this.field_R = nm.b(-128, 55);
        }
    }

    static {
        field_J = false;
        field_I = '/';
        field_K = null;
        field_G = "achievements to collect";
        field_O = 131072;
    }
}
