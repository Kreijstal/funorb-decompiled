/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf {
    private int field_B;
    private int field_h;
    private kj field_w;
    private kj[] field_x;
    boolean field_r;
    private hq field_c;
    static int field_X;
    private boolean field_Y;
    static String field_K;
    private boolean field_kb;
    private int[] field_F;
    int field_L;
    private int field_Z;
    private int field_N;
    private int field_p;
    private int field_d;
    int field_db;
    private String[] field_i;
    private int field_k;
    static int field_z;
    private int field_V;
    private int field_Q;
    private boolean field_T;
    private int field_m;
    al field_I;
    static String field_s;
    private boolean field_j;
    int field_S;
    private int field_l;
    private int field_e;
    mm field_eb;
    static String field_J;
    private int field_g;
    static int field_hb;
    private int field_t;
    static int field_jb;
    int field_f;
    kj field_G;
    private static int field_fb;
    private boolean field_bb;
    private boolean field_H;
    private int field_A;
    private int field_u;
    static int field_W;
    static wc field_gb;
    private boolean field_q;
    private kj field_b;
    static byte[][] field_y;
    private mm field_O;
    private int[] field_ib;
    private int field_E;
    private int field_o;
    private int field_a;
    private int field_C;
    private int field_n;
    int field_cb;
    int[] field_ab;
    private int field_P;
    private int field_R;
    private boolean field_D;
    private int field_M;
    private int field_v;
    private int field_U;

    private final void z(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_ib = new int[this.field_I.field_l.length];
          this.field_E = 16 * (-1 + this.field_I.field_l.length);
          if (param0 != 4476) {
            this.field_c = (hq) null;
          }
          this.field_U = this.field_E + qh.field_f >> 1;
          this.field_n = id.field_a[3].field_z + 18 + id.field_a[5].field_z;
          this.field_P = qh.field_f - this.field_E >> 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.WD(" + param0 + ')');
        }
    }

    private final String a(String param0, String param1, String param2, String param3, byte param4, int param5, String param6, String param7) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_7_0 = 0;
        Object stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        String stackIn_44_0 = null;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        String stackIn_70_0 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12_int = 0;
        StringBuilder var12 = null;
        int var13 = 0;
        try {
          if (0 != (param5 & 1 << this.field_db) &&
            0 != (this.field_L & hq.field_c)) {
            stackIn_7_0 = 1;
          } else {
            stackIn_7_0 = 0;
          }
          var9_int = stackIn_7_0;
          var10 = new int[this.field_I.field_n];
          var11 = 0;
          var12_int = 0;
          for (var13 = 0; var13 < this.field_I.field_n; var13++) {
            if ((param5 & 1 << var13) != 0) {
              if (this.field_db != var13 ||
                (this.field_L & hq.field_c) == 0) {
                var10[var12_int++] = var13;
              }
              var11++;
            }
          }
          if (param4 != 61) {
            this.field_Q = -77;
          }
          if (var11 == 0) {
            stackIn_28_0 = null;
            return (String) (stackIn_28_0);
          }
          if (var11 == 1) {
            if (var9_int != 0) {
              stackIn_36_0 = (String) (param7);
              return stackIn_36_0;
            }
            stackIn_34_0 = nr.a(new String[]{this.e(param4 ^ -30379, var10[0]), "<%1>", "<%2>"}, -1, param1);
            return stackIn_34_0;
          }
          if (var11 == 2) {
            if (var9_int != 0) {
              stackIn_44_0 = nr.a(new String[]{this.e(-30360, var10[0]), "<%1>", "<%2>"}, param4 - 62, param3);
              return stackIn_44_0;
            }
            stackIn_42_0 = nr.a(new String[]{this.e(-30360, var10[0]), this.e(-30360, var10[1]), "<%2>"}, -1, param2);
            return stackIn_42_0;
          }
          var12 = new StringBuilder(128);
          if (var9_int != 0) {
            var11--;
          }
          for (var13 = 0; var11 > var13; var13++) {
            if (0 == var13 &&
              var9_int == 0) {
              discarded$0 = var12.append(nr.a(new String[]{this.e(param4 ^ -30379, var10[var13]), "<%1>", "<%2>"}, param4 - 62, en.field_e));
            } else {
              if (~var13 == ~(-1 + var11)) {
                discarded$1 = var12.append(nr.a(new String[]{this.e(-30360, var10[var13]), "<%1>", "<%2>"}, -1, lq.field_N));
              } else {
                discarded$2 = var12.append(nr.a(new String[]{this.e(-30360, var10[var13]), "<%1>", "<%2>"}, -1, bc.field_h));
              }
            }
          }
          stackIn_68_0 = new String[]{var12.toString(), "<%1>", "<%2>"};
          stackIn_68_1 = -1;
          if (var9_int == 0) {
            stackIn_69_2 = (String) (param6);
          } else {
            stackIn_69_2 = (String) (param0);
          }
          stackIn_70_0 = nr.a(stackIn_68_0, stackIn_68_1, stackIn_69_2);
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_74_0 = var9;
          stackIn_74_1 = new StringBuilder().append("uf.OC(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',');
          if (param2 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',');
          if (param3 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param7 == null) {
            stackIn_95_2 = "null";
          } else {
            stackIn_95_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_4_0 = (iq.field_i) ? 1 : 0;
          var2_int = stackIn_4_0;
          tk.field_k.field_ab = dq.field_e[var2_int + 0];
          if (param0) {
            return;
          }
          tk.field_k.field_hb = dq.field_e[var2_int + 2];
          tk.field_k.field_xb = dq.field_e[4 + var2_int];
          tk.field_k.field_yb = dq.field_e[6 + var2_int];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.PC(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        int[] var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!param1) {
            field_s = (String) null;
          }
          if (param0 < 0) {
            param0 = 0;
          }
          if (param0 > 4096) {
            param0 = 4096;
          }
          if (~this.field_Q != ~param0) {
            var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, param0, (byte) 95, this.field_G.field_h);
            if (null != var3) {
              this.field_G.field_k = var3[0];
              this.field_G.field_d = var3[1];
              this.field_G.field_e = var3[2];
              this.field_Q = param0;
              id.field_c.field_g = true;
            } else {
              this.m(107);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.CA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        qe var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -122 % ((-69 - param0) / 45);
          var3 = this.field_I.j(92);
          if (var3.field_u != 0 &&
            this.field_Y) {
            ej.field_j.b(false, 72);
            var3.a(this.field_I, ej.field_j, -7478);
            if ((pd.field_i & 2097152L) != 0L) {
              System.out.println("->C2S_MANHANDLE_BALL: " + vi.a((byte) 108, 16, 4, (long)var3.field_P) + "," + vi.a((byte) 64, 16, 4, (long)var3.field_Q));
            }
            this.field_Y = false;
            this.field_d = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ')');
        }
    }

    private final boolean x(byte param0) {
        qe var2 = null;
        RuntimeException var2_ref = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -102) {
            this.c(5, true);
          }
          var2 = this.field_I.j(52);
          stackIn_16_0 = !(0 > var2.field_M) || !(this.field_I.field_y <= 0) || (var2.field_u != 0) || (var2.field_E);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.UA(" + param0 + ')');
        }
    }

    final void g(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_Y = true;
          }
          this.field_S = -1;
          this.s((byte) -37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.K(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        try {
          this.field_I.j(109).field_V = (short)param0;
          this.field_I.e((byte) -124);
          this.a(this.field_I.j(param0 + 126), 1);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.KD(" + param0 + ')');
        }
    }

    final void c(int param0, boolean param1) {
        int var3_int = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((hq.field_c & this.field_L) == 0) {
            if (hk.b(-119)) {
              if (!oe.a(false, hp.field_c) &&
                ti.field_d == null) {
                fq.a(param0 - 3661, 21, 0, param1);
              } else {
                var3_int = param1 ? 1 : 0;
                stackIn_30_0 = -3405;
                stackIn_30_1 = 19;
                if (mg.a(true)) {
                  stackIn_31_2 = 21;
                } else {
                  stackIn_31_2 = 0;
                }
                fq.a(stackIn_30_0, stackIn_30_1, stackIn_31_2, var3_int != 0);
              }
            } else {
              if (!oe.a(false, hp.field_c)) {
                if (null == ti.field_d) {
                  var3_int = param1 ? 1 : 0;
                  stackIn_21_0 = -3405;
                  stackIn_21_1 = 0;
                  if (!mg.a(true)) {
                    stackIn_22_2 = 0;
                  } else {
                    stackIn_22_2 = 21;
                  }
                  fq.a(stackIn_21_0, stackIn_21_1, stackIn_22_2, var3_int != 0);
                } else {
                  var3_int = param1 ? 1 : 0;
                  stackIn_16_0 = -3405;
                  stackIn_16_1 = 16;
                  if (!mg.a(true)) {
                    stackIn_17_2 = 0;
                  } else {
                    stackIn_17_2 = 21;
                  }
                  fq.a(stackIn_16_0, stackIn_16_1, stackIn_17_2, var3_int != 0);
                }
              } else {
                var3_int = param1 ? 1 : 0;
                stackIn_10_0 = -3405;
                stackIn_10_1 = 18;
                if (mg.a(true)) {
                  stackIn_11_2 = 21;
                } else {
                  stackIn_11_2 = 0;
                }
                fq.a(stackIn_10_0, stackIn_10_1, stackIn_11_2, var3_int != 0);
              }
            }
          }
          kh.field_gc.a(false);
          if (param0 != 256) {
            this.c(-75, -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.OD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2_int = -121 % ((48 - param0) / 36);
          if (this.field_S < 0 &&
            this.i(-1) &&
            this.field_I.field_l[this.field_e].field_s) {
            if ((524288L & pd.field_i) == 0L) {
              if (this.field_I.j(70).field_q != 0) {
                return;
              }
              if (this.field_I.j(55).field_u == 0) {
                return;
              }
              if (0 != this.field_e) {
                return;
              }
            }
            var3 = wn.field_i - vn.field_b;
            var4 = -up.field_m + gg.field_f;
            if (var3 >= -3 &&
              var3 <= 3 &&
              var4 >= -3 &&
              3 >= var4) {
              return;
            }
            this.field_V = this.field_e;
            this.field_H = false;
            if (this.field_V == 0 &&
              this.field_T) {
              this.e(-92);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.ND(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        double[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != 11) {
            this.field_x = (kj[]) null;
          }
          if (this.b(1, 2, false)) {
            var2 = new double[2];
            if (rq.a(64, ua.field_o, false, this.field_O.d(8), lq.field_W, var2, this.field_ab)) {
              this.field_O.field_f = var2[0];
              this.field_O.field_m = var2[1];
              this.field_O.c((byte) -40);
              this.field_R = -1;
              this.field_M = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.JD(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, boolean param2) {
        int stackIn_110_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (param0 != 9587) {
            this.field_k = -110;
          }
          var4_int = 0;
          if (!this.field_T) {
            if (param1 == 1 &&
              !vj.field_c[82] &&
              !vj.field_c[86] &&
              vj.field_c[81]) {
              var4_int = 2;
            }
            if (param1 == 2 &&
              !vj.field_c[82] &&
              !vj.field_c[86] &&
              !vj.field_c[81]) {
              var4_int = 1;
            }
            if ((param1 == 1) &&
              (vj.field_c[82]) &&
              (!vj.field_c[86]) &&
              (!vj.field_c[81])) {
              var4_int = 1;
              if (Pool.field_O != 0) {
                if (0 == this.field_I.j(102).field_q &&
                  param1 == 1 &&
                  !vj.field_c[82] &&
                  !vj.field_c[86] &&
                  vj.field_c[81]) {
                  var4_int = 4;
                }
                if (this.field_I.j(74).field_q == 0 &&
                  param1 == 2 &&
                  !vj.field_c[82] &&
                  !vj.field_c[86] &&
                  !vj.field_c[81]) {
                  var4_int = 3;
                }
                if (0 == this.field_I.j(75).field_q &&
                  param1 == 1 &&
                  vj.field_c[82] &&
                  !vj.field_c[86] &&
                  !vj.field_c[81]) {
                  var4_int = 3;
                }
              }
            }
          } else {
            if (0 == this.field_I.j(102).field_q &&
              param1 == 1 &&
              !vj.field_c[82] &&
              !vj.field_c[86] &&
              vj.field_c[81]) {
              var4_int = 4;
            }
            if (this.field_I.j(74).field_q == 0 &&
              param1 == 2 &&
              !vj.field_c[82] &&
              !vj.field_c[86] &&
              !vj.field_c[81]) {
              var4_int = 3;
            }
            if (0 == this.field_I.j(75).field_q &&
              param1 == 1 &&
              vj.field_c[82] &&
              !vj.field_c[86] &&
              !vj.field_c[81]) {
              var4_int = 3;
            }
          }
          if (param1 == 1 &&
            !vj.field_c[82] &&
            !vj.field_c[86] &&
            !vj.field_c[81] && (param2 &&
            this.field_t == 5 ||
            this.g((byte) 124) != -1)) {
            var4_int = 5;
          }
          stackIn_110_0 = var4_int;
          return stackIn_110_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.SC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != -69) {
            this.field_u = -13;
          }
          if (this.b(1, 4, false)) {
            var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, this.field_Q, (byte) 95, param1);
            if (var3 == null) {
              this.m(99);
            } else {
              this.field_G.field_k = var3[0];
              this.field_G.field_h = param1;
              this.field_G.field_d = var3[1];
              this.field_G.field_e = var3[2];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.DC(" + param0 + ',' + param1 + ')');
        }
    }

    private final static void a(di param0, int param1, di param2, di param3) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd var4 = null;
        RuntimeException var4_ref = null;
        qb[] var5 = null;
        qb[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        qb[] var10 = null;
        dd var10_ref = null;
        int var11_int = 0;
        dd var11 = null;
        dd var12 = null;
        int var13 = 0;
        var13 = Pool.field_O;
        try {
          gr.field_I = aj.a(0, "commonui", param2, "frame_top");
          rb.field_d = aj.a(0, "commonui", param2, "frame_bottom");
          me.field_p = pf.a("commonui", (byte) 124, "jagex_logo_grey", param2);
          jj.field_S = aj.a(0, "commonui", param2, "button");
          bo.field_a = ep.a(param1 ^ -22692, param2, "validation", "commonui");
          qk.field_a = (lr) ((Object) hn.a(param3, "commonui", "arezzo12", -25154, param2));
          lc.field_O = (lr) ((Object) hn.a(param3, "commonui", "arezzo14", -25154, param2));
          bi.field_e = (lr) ((Object) hn.a(param3, "commonui", "arezzo14bold", -25154, param2));
          var4 = new dd(param0.a(false, "", "button.gif"), (java.awt.Component) ((Object) pa.field_K));
          tl.a(param2, 3812, "dropdown", "commonui");
          var5 = gr.a(param2, "commonui", -24155, "screen_options");
          vl.field_l = new qb[4];
          la.field_c = new qb[4];
          sn.field_h = new qb[4];
          var6 = new qb[][]{vl.field_l, sn.field_h, la.field_c};
          var7 = new int[4][];
          var7[0] = var5[0].field_i;
          var8 = 1;
          do {
            if (var8 >= var7.length) {
              var8 = var5[0].field_j[0];
              var7[2][var8] = 16777215;
              var7[1][var8] = 2394342;
              var7[3][var8] = 4767999;
              break;
            }
            var7[var8] = (int[]) ((Object) var7[0].clone());
            var8++;
          } while (var13 == 0);
          var9 = 0;
          L3: while (true) {
            if (var9 < 3) {
              var10 = var6[var9];
              stackIn_20_0 = 0;
              if (var13 != 0) {
                break L3;
              }
              var11_int = stackIn_20_0;
              while (var10.length > var11_int) {
                var10[var11_int] = ud.a(var5[var9], (byte) 91, var7[var11_int]);
                var11_int++;
              }
              var9++;
              continue L3;
            }
            var9 = var4.field_A;
            uc.a((byte) 125);
            var4.e();
            stackIn_20_0 = 0;
            break;
          }
          qh.e(stackIn_20_0, 0, qh.field_l, qh.field_f);
          var10_ref = new dd(var9, var9);
          var10_ref.e();
          var4.a(0, 0);
          var11 = new dd(var9, var9);
          var11.e();
          var4.a(var9 - var4.field_z, 0);
          if (param1 != -22764) {
            uf.a(26, false, (di) null, (di) null, (di) null);
          }
          var12 = new dd(var4.field_z - var9 * 2, var9);
          var12.e();
          var4.a(-var9, 0);
          oc.a(112);
          jj.field_S = new dd[]{var10_ref, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("uf.PA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4Lifetime1;
        int var5Lifetime1;
        try {
          if (fe.a(oa.field_g, -13671, param1)) {
            return;
          }
          var4 = oa.field_g;
          var5 = param1;
          var4[var5 >> 5] = md.a(var4[var5 >> 5], 1 << rb.b(var5, 31));
          var4Lifetime1 = hp.field_c;
          var5Lifetime1 = param1;
          var4Lifetime1[var5Lifetime1 >> 5] = md.a(var4Lifetime1[var5Lifetime1 >> 5], 1 << rb.b(var5Lifetime1, 31));
          if (param0 != 104) {
            this.field_a = 100;
          }
          ui.field_U.b((byte) 115, new bq(param1));
          gj.a(true, 0, md.field_a[param1], ef.a((String) null, kc.field_d[param1], (byte) 4, (String) null));
          if (!this.field_q) {
            ad.field_l.b((byte) 84, new i(param1, param2, vm.field_f, wq.field_c, field_fb, dk.field_f + this.field_o));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.OB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -40) {
            this.c(45, -72, -20);
          }
          if (this.b(0, 6, false)) {
            this.a(false, (byte) -114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.G(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!param0) {
            this.K(35);
          }
          if (0 < this.field_l) {
            var2_int = -5 + il.field_f.field_w - 5;
            var3 = -14 + il.field_f.field_y;
            var4 = this.b(-16439);
            var5 = fl.field_q.field_ib - il.field_f.field_y >> 1;
            var6 = this.b(this.field_Q, 0, var3);
            qh.a(ho.field_s);
            qh.c(var4 + 5, -var6 + (7 + (var5 + var3)), var2_int + (var4 + 5), var5 - (-7 - var3));
            v.field_c.c(var4, var5);
            qh.b(ho.field_s);
            il.field_f.c(var4, var5);
            if ((2L & pd.field_i) != 0L) {
              sa.field_h.c("power=" + this.field_Q + ", bar_filled=" + var6, var4, var5, 16777215, 1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.L(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.i(-1) &&
            !this.field_I.field_o &&
            this.field_I.j(36).field_q == 0) {
            var2_int = -36 % ((param0 + 15) / 63);
            if (this.b(0, 3, false)) {
              this.u((byte) 117);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.BA(" + param0 + ')');
        }
    }

    private final void C(int param0) {
        hh.field_c = true;
        this.field_G = this.field_x[this.field_I.j(57).field_L];
        if (param0 < 15) {
          return;
        }
        try {
          this.field_Q = this.field_G.field_n;
          this.field_h = 0;
          if (null != this.field_b) {
            this.field_b.b((byte) 63);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_44_0 = false;
        boolean stackIn_72_0 = false;
        int stackIn_280_0 = 0;
        int stackIn_281_1 = 0;
        boolean stackIn_295_0 = false;
        int stackIn_396_0 = 0;
        int stackIn_400_0 = 0;
        int stackIn_479_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_294_0;
        long var4_long = 0L;
        int var4_int = 0;
        qe var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          var4_long = pd.field_i;
          var4_long = var4_long | var4_long >>> 32;
          var4_long = var4_long | var4_long << 16;
          var4_long = var4_long | var4_long << 8;
          wq.field_c = (int)((long)wq.field_c | var4_long >>> 16 & 65280L);
          vm.field_f = (int)((long)vm.field_f | -16777216L & var4_long);
          var6 = -117 % ((param2 + 60) / 47);
          var4_int = this.field_o;
          var5 = var4_int;
          var6 = var5 + dk.field_f;
          var7 = var6 % 7621;
          var6 = (var7 + 2) % 7621 + (-var7 + var6);
          dk.field_f = -var5 + var6;
          field_fb = ((field_fb >>> 16) + 2) % 30484 << 16 | field_fb & 65535;
          var4_int = pa.f(-1);
          if ((vm.field_f & 255) < var4_int) {
            stackIn_7_0 = -256 & vm.field_f;
            if (var4_int > 255) {
              stackIn_8_1 = 255;
            } else {
              stackIn_8_1 = var4_int;
            }
            vm.field_f = stackIn_7_0 + stackIn_8_1;
          }
          if ((sk.field_d & this.field_L) != 0) {
            this.field_c.f(25);
            if (!param0) {
              param0 = this.field_c.b(99);
            }
          }
          if ((this.field_L & hq.field_c) != 0) {
            if (lc.field_U != null) {
              if (ib.field_r > 0) {
                lc.field_U.field_hb = jh.field_e;
                if (var9 != 0) {
                  lc.field_U.field_hb = ta.field_e;
                }
              } else {
                lc.field_U.field_hb = ta.field_e;
              }
              lc.field_U.field_hb.field_B = 5;
              lc.field_U.field_hb.field_G = 9;
              lc.field_U.field_Db = lc.field_U.field_hb.field_A + 5 + 5;
              lc.field_U.field_gb = 9 + (lc.field_U.field_hb.field_z + 9);
              lc.field_U.field_eb = fl.field_q.field_ib - 5 - lc.field_U.field_hb.field_A - 5;
            }
            if (!un.field_b) {
            }
          }
          if ((this.field_L & hq.field_c) != 0 &&
            param1 &&
            !rg.field_p) {
            lc.field_U.a(true, false);
            if (lc.field_U.field_R == 1) {
              param0 = true;
              stackIn_44_0 = !(un.field_b);
              un.field_b = stackIn_44_0;
              if (-1 != this.field_M) {
                this.b(false, 22, this.field_M);
              }
            }
          }
          if (param1) {
            if ((0 == (this.field_L & hq.field_c) ||
              !rg.field_p) &&
              (this.i(-1) &&
              this.field_S < 0)) {
              this.J(0);
            }
            tk.field_k.a(true, false);
            if (!param0 &&
              tk.field_k.field_R == 1) {
              stackIn_72_0 = !(iq.field_i);
              iq.field_i = stackIn_72_0;
              param0 = true;
              this.e(false);
            }
            if (this.field_T) {
              if (wn.field_i != this.field_p ||
                this.field_g != gg.field_f) {
                this.f(false);
                if (this.field_e == 0) {
                  this.a(-119, gg.field_f, wn.field_i);
                }
              }
              if (0 != this.field_e) {
                discarded$0 = this.a(false, this.field_G.field_e * 3 / 4, this.field_G.field_d * 3 / 4);
              }
            }
            if (!param0 &&
              this.h(3460)) {
              param0 = true;
            }
            if (e.a(-19839, this)) {
              var4 = this.field_I.j(70);
              if ((hq.field_c & this.field_L) != 0) {
                ej.field_j.b(false, 71);
                var4.a(ej.field_j, (byte) 0);
              }
              if (!var4.d(126)) {
                this.field_I.f((byte) 38);
                this.b(127, var4);
              }
              param0 = true;
            }
            boolean decompiledFrameRemainder4 = true;
            if (!vj.field_c[82] &&
              !vj.field_c[86]) {
              if ((cd.field_b != 1) &&
                (decompiledFrameRemainder4 = (cd.field_b == 0))) {
                if (this.field_H &&
                  !this.field_T) {
                  this.f(false);
                }
                if (this.field_H) {
                  boolean decompiledFrameRemainder3 = true;
                  if (this.field_T) {
                    if (this.field_e != 0) {
                      this.e(-98);
                      this.e((byte) 11);
                      decompiledFrameRemainder3 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder3) {
                      this.A(1);
                      if (var9 != 0) {
                        if (this.field_S < 0 &&
                          0 == this.field_e) {
                          this.a((byte) 78);
                          this.e((byte) 11);
                        } else {
                          this.e((byte) 11);
                        }
                      }
                    }
                  } else {
                    if (this.field_S < 0 &&
                      0 == this.field_e) {
                      this.a((byte) 78);
                      if (var9 != 0) {
                        this.e((byte) 11);
                      }
                    } else {
                      this.e((byte) 11);
                    }
                  }
                  this.field_H = false;
                }
                this.field_V = -1;
                decompiledFrameRemainder4 = (var9 != 0);
              }
              if (decompiledFrameRemainder4) {
                var4_int = this.field_o;
                wq.field_c = ((65535 & wq.field_c) + 2) % 31676 | wq.field_c & -65536;
                var5 = var4_int;
                var6 = dk.field_f + var5;
                var7 = var6 % 7621;
                var8 = var6 / 7621;
                var6 = var7 + (var8 + 2) % 31676 * 7621;
                dk.field_f = -var5 + var6;
                var4_int = this.field_o;
                field_fb = 65535 & field_fb | (16 + (field_fb >>> 16)) % 30484 << 16;
                var5 = var4_int;
                var6 = dk.field_f + var5;
                var7 = var6 % 7621;
                var6 = -var7 + (var6 + (16 + var7) % 7621);
                dk.field_f = -var5 + var6;
                if (!param0 &&
                  (pd.field_i & 1L) != 0L &&
                  ti.a((byte) 94)) {
                  param0 = true;
                }
                if (!param0 &&
                  of.field_Ob < lq.field_W &&
                  (of.field_Ob + no.field_q.field_w) > lq.field_W &&
                  ua.field_o > fm.field_M &&
                  ua.field_o < (fm.field_M + no.field_q.field_y)) {
                  param0 = true;
                }
                if (!param0) {
                  if (1 == ne.field_s) {
                    if (!this.field_T) {
                      this.f(false);
                    }
                    if (this.field_e == -1) {
                      if (this.field_T) {
                        this.e(-69);
                      }
                      this.e((byte) 11);
                      decompiledFrameRemainder4 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      vn.field_b = wn.field_i;
                      this.field_H = true;
                      up.field_m = gg.field_f;
                      decompiledFrameRemainder4 = (var9 != 0);
                    }
                  }
                  if (decompiledFrameRemainder4) {
                    if (!this.field_H) {
                      if (this.field_V != -1) {
                        this.w((byte) 112);
                        if (var9 != 0) {
                          this.l(-72);
                        }
                      }
                    } else {
                      this.l(-72);
                    }
                  }
                }
              }
            }
            if (wp.field_d != 0 &&
              !fl.field_q.field_W) {
              var4_int = 0;
              if (this.i(-1)) {
                if (var4_int == 0 &&
                  (pd.field_i & 1L) != 0L &&
                  bi.a((byte) -92)) {
                  var4_int = 1;
                }
                if (var4_int == 0 &&
                  this.I(122)) {
                  var4_int = 1;
                }
              }
              if (var4_int == 0) {
                discarded$1 = this.b((byte) -118);
              }
            }
            if (this.i(-1) &&
              this.field_I.j(65).field_q == 0) {
              if (!this.field_I.a(this.field_G.field_e, this.field_G.field_h, this.field_G.field_k, 359, this.field_Q, this.field_G.field_d)) {
                var4_array = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, this.field_Q, (byte) 95, this.field_G.field_h);
                boolean decompiledSharedTail1 = (var4_array != null);
                if (!decompiledSharedTail1) {
                  this.m(110);
                  decompiledSharedTail1 = (var9 != 0);
                }
                if (decompiledSharedTail1) {
                  this.field_G.field_d = var4_array[1];
                  this.field_G.field_e = var4_array[2];
                  this.field_G.field_k = var4_array[0];
                }
              }
              this.d((byte) -47);
            }
          }
          if ((this.field_L & hq.field_c) != 0 &&
            !this.i(-1) &&
            this.field_b.a(false)) {
            this.field_G.c(255, this.field_b);
            if (this.field_G.a(-2043, this.field_b)) {
              this.field_b.b((byte) 94);
            }
            hh.field_c = true;
            id.field_c.field_g = true;
          }
          boolean decompiledSharedTail0 = (!(param1) ||
            !(this.field_T) ||
            this.field_e != 0 ||
            !(this.i(-1)));
          if (!decompiledSharedTail0) {
            lg.field_s.a(false, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -46)));
            decompiledSharedTail0 = (var9 != 0);
          }
          if (decompiledSharedTail0) {
            lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -83)));
          }
          this.u(-114);
          var4_int = f.field_g;
          if (var4_int > (vm.field_f & 255)) {
            stackIn_280_0 = vm.field_f & -256;
            if (var4_int <= 255) {
              stackIn_281_1 = var4_int;
            } else {
              stackIn_281_1 = 255;
            }
            vm.field_f = stackIn_280_0 + stackIn_281_1;
          }
          L47: {
            L48: {
              var4 = this.field_I.j(71);
              if (ne.field_r.c(0) &&
                (this.field_L & sk.field_d) == 0) {
                if (!this.field_I.field_o) {
                  var6 = 0;
                  var7 = 0;
                  while (this.field_I.field_n > var7) {
                    stackOut_294_0 = this.field_I.field_f.a((byte) 94, var7);
                    stackIn_396_0 = stackOut_294_0 ? 1 : 0;
                    stackIn_295_0 = stackOut_294_0;
                    if (var9 != 0) {
                      break L47;
                    }
                    if (!stackIn_295_0) {
                      var6 = var6 | 1 << var7;
                    }
                    var7++;
                  }
                  var5_ref_String = this.a(rk.field_e, qe.field_F, mg.field_a, sl.field_W, (byte) 61, var6, jl.field_b, vj.field_g);
                  if (var5_ref_String != null) {
                    em.$cfr$intArgs$a$c9c3307e6488(127, false, 1, var5_ref_String);
                  }
                  var5_ref_String = this.a(wj.field_U, ah.field_b, w.field_e, bl.field_j, (byte) 61, this.field_I.field_p & ~var6, dl.field_i, cd.field_c);
                  if (var5_ref_String != null) {
                    em.$cfr$intArgs$a$c9c3307e6488(124, false, 1, var5_ref_String);
                  }
                  var5_ref_String = this.a(jk.field_f, rn.field_h, rg.field_o, qp.field_bc, (byte) 61, this.field_I.field_x, fd.field_H, ae.field_f);
                  if (var5_ref_String != null) {
                    em.$cfr$intArgs$a$c9c3307e6488(119, false, 1, var5_ref_String);
                  }
                } else {
                  var5_ref_String = this.a(o.field_B, p.field_k, hp.field_e, pq.field_D, (byte) 61, this.field_I.field_b, ee.field_a, kb.field_f);
                  if (var5_ref_String != null) {
                    em.$cfr$intArgs$a$c9c3307e6488(122, false, 1, var5_ref_String);
                  }
                }
                if (0 == var4.field_q) {
                  if (!this.i(-1)) {
                    fieldTemp$2 = (1 + mk.field_b) % 4;
                    mk.field_b = (1 + mk.field_b) % 4;
                    var6 = fieldTemp$2;
                    if (var6 == 0 &&
                      var9 == 0) {
                      em.$cfr$intArgs$a$c9c3307e6488(119, true, 1, sm.field_B);
                      break L48;
                    } else {
                      if (1 != var6) {
                        break L48;
                      }
                    }
                    em.$cfr$intArgs$a$c9c3307e6488(119, true, 1, pm.field_o);
                    if (var9 == 0) {
                      break L48;
                    }
                  }
                  if (this.field_T) {
                    L59: {
                      L60: {
                        L61: {
                          L62: {
                            fieldTemp$3 = (mk.field_b + 1) % 5;
                            mk.field_b = (mk.field_b + 1) % 5;
                            var6 = fieldTemp$3;
                            if (var6 != 0 ||
                              var9 != 0) {
                              switch (var6) {
                                case 1:
                                  break L62;
                                case 2:
                                  break L61;
                                case 3:
                                  break L60;
                                default:
                                  break L48;
                                case 4:
                                  if (var9 == 0) {
                                    break L59;
                                  }
                                  break;
                              }
                            }
                            em.$cfr$intArgs$a$c9c3307e6488(118, true, 1, field_s);
                            if (var9 == 0) {
                              break L48;
                            }
                          }
                          em.$cfr$intArgs$a$c9c3307e6488(126, true, 1, gk.field_lb);
                          if (var9 == 0) {
                            break L48;
                          }
                        }
                        em.$cfr$intArgs$a$c9c3307e6488(119, true, 1, sf.field_z);
                        if (var9 == 0) {
                          break L48;
                        }
                      }
                      em.$cfr$intArgs$a$c9c3307e6488(117, true, 1, em.field_O);
                      if (var9 == 0) {
                        break L48;
                      }
                    }
                    if (var4.field_u == 0) {
                      break L48;
                    }
                    em.$cfr$intArgs$a$c9c3307e6488(119, true, 1, up.field_L);
                    if (var9 == 0) {
                      break L48;
                    }
                  }
                  boolean decompiledFrameRemainder2 = true;
                  boolean decompiledFrameRemainder1 = true;
                  fieldTemp$4 = (1 + mk.field_b) % 4;
                  mk.field_b = (1 + mk.field_b) % 4;
                  var6 = fieldTemp$4;
                  if (var6 == 0 &&
                    var9 == 0) {
                    em.$cfr$intArgs$a$c9c3307e6488(127, true, 1, ah.field_h);
                    break L48;
                  } else if (var6 != 1 ||
                    var9 != 0) {
                    decompiledFrameRemainder1 = (var6 != 2);
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder2 = (var6 != 3))) {
                      break L48;
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    em.$cfr$intArgs$a$c9c3307e6488(117, true, 1, sm.field_B);
                    break L48;
                  }
                  if (decompiledFrameRemainder2) {
                    em.$cfr$intArgs$a$c9c3307e6488(127, true, 1, pm.field_o);
                    if (var9 == 0) {
                      break L48;
                    }
                  }
                  em.$cfr$intArgs$a$c9c3307e6488(119, true, 1, sa.field_l);
                }
              }
            }
            ie.a(false, (no.field_q.field_y >> 1) + fm.field_M, 300);
            stackIn_396_0 = -1;
          }
          if (stackIn_396_0 <= ~this.field_o) {
            stackIn_400_0 = 0;
          } else {
            stackIn_400_0 = this.field_o;
          }
          var5 = stackIn_400_0;
          if (0 != (f.field_f & this.field_L) &&
            0 <= this.field_o &&
            !this.field_I.field_o) {
            this.field_o = this.field_o + 1;
          }
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder0 = true;
          var6 = var4.field_q;
          if (var6 == 0 &&
            var9 == 0) {
            this.b(var4, -17601);
            decompiledFrameRemainder5 = false;
          } else if (var6 != 1 ||
            var9 != 0) {
            decompiledFrameRemainder0 = (2 != var6);
            decompiledFrameRemainder5 = !(decompiledFrameRemainder0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder0)) {
            this.a(-65, var4);
            decompiledFrameRemainder5 = false;
          }
          if ((decompiledFrameRemainder5) && (0 != (hq.field_c & this.field_L) &&
            var4.d(116) &&
            1 < this.field_o)) {
            this.field_o = this.field_o - 1;
          }
          if (this.field_T) {
            this.field_O.a(this, 1);
            if (this.field_Q != 0 &&
              this.field_t != 5 &&
              this.field_t != 4) {
              if (this.field_I.j(112).field_q == 0) {
                this.b(this.field_G.field_n + (int)(0.5 + 192.0 * Math.sin(3.141592653589793 * (double)this.field_h * 2.0 / 150.0)), true);
              }
              if (0L != (pd.field_i & 1024L)) {
                this.field_h = 0;
                if (var9 != 0) {
                  this.field_h = this.field_h + 1;
                }
              } else {
                this.field_h = this.field_h + 1;
              }
            }
          }
          if (this.field_R != -1) {
            fieldTemp$5 = this.field_R + 1;
            this.field_R = this.field_R + 1;
            if (400 < fieldTemp$5) {
              this.field_R = 0;
            }
            this.field_O.b((double)this.field_R * 3.141592653589793 * 2.0 / 400.0, 2.356194490192345, (double)this.field_a, -6861);
            this.field_D = true;
          }
          if (this.field_eb.a(this.field_O, (byte) -78)) {
            this.field_D = true;
          }
          if (this.field_o > 0) {
            stackIn_479_0 = this.field_o;
          } else {
            stackIn_479_0 = 0;
          }
          var6 = stackIn_479_0;
          if (0 < this.field_S) {
            this.field_S = this.field_S - 1;
            if (this.field_S == 0) {
              if (0 != (hq.field_c & this.field_L)) {
                ej.field_j.b(false, 73);
                if (var9 != 0) {
                  this.s((byte) -101);
                  this.field_S = -1;
                }
              } else {
                this.s((byte) -101);
                this.field_S = -1;
              }
            }
          }
          var7 = -1;
          if ((this.field_L & sk.field_d) != 0) {
            var7 = pm.a(-27011);
          }
          if (var7 == -1) {
            var7 = this.f(1163);
            if (q.field_b.field_R != 0) {
              this.y((byte) 75);
            }
          }
          if (0 != (sk.field_d & this.field_L) &&
            -1 == var7) {
            this.field_c.field_h.c(-62);
            if (this.field_c.field_h.field_q != null) {
              var7 = 256 | this.field_c.field_h.field_q.field_p;
            }
          }
          se.field_l = 12;
          eo.field_Vb = 12;
          jo.g(0, var7);
          if (q.field_b.field_pb &&
            q.field_b.field_W &&
            -1 != dp.a(104)) {
            this.y((byte) -108);
          }
          ea.field_p = ea.field_p + 1;
          ea.field_p = ea.field_p & 31;
          this.m((byte) 127);
          kh.field_gc.a(10, this);
          dq.field_a.h(-56);
          ep.a((byte) -73, this);
          this.w(87);
          if (eo.field_Tb % 100 == 0) {
            this.d(0);
          }
          wc.b(127);
          if (var6 > var5) {
            dk.field_f = dk.field_f + (-var6 + var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.AD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(ge param0, boolean param1) {
        RuntimeException runtimeException = null;
        ge var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return;
          }
          var3 = param0;
          this.field_o = var3.d(-1034);
          this.field_I.a(2, param0);
          this.s((byte) -43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("uf.GB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(qe param0, byte param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((param0.field_s & ag.field_e) == 0) {
            if (0 != (param0.field_s & hm.field_e)) {
              kh.field_gc.a(11, 128, (byte) 96, 128);
            }
          } else {
            kh.field_gc.a(12, 128, (byte) -123, 128);
          }
          if (param1 != -28) {
            this.field_eb = (mm) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uf.NA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ge param0, int param1) {
        try {
          RuntimeException stackIn_45_0 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          RuntimeException decompiledCaughtException = null;
          qe var3 = null;
          RuntimeException var3_ref = null;
          int var4 = 0;
          int var5 = 0;
          var5 = Pool.field_O;
          try {
            var3 = this.field_I.j(62);
            if (param1 != 0) {
              this.field_I = (al) null;
            }
            L2: {
              L3: {
                var4 = var3.c((byte) -28, param0);
                switch (var4) {
                  case 1:
                    break L3;
                  default:
                    return;
                  case 2:
                    if (var5 == 0) {
                      break L2;
                    }
                  case 0:
                    if (1 > var3.field_q) {
                      if (var3.field_V <= 0) {
                        this.field_I.e((byte) 85);
                        if (var5 != 0) {
                          this.B((byte) 17);
                        }
                      } else {
                        this.B((byte) 17);
                      }
                    }
                    this.field_j = true;
                    if (var5 == 0) {
                      return;
                    }
                    break;
                }
              }
              tc.a(new Throwable(), "Wrong shot!", -8555);
              dn.c(-115);
              if (var5 == 0) {
                return;
              }
            }
            if (var3.field_q == 1) {
              gj.a(true, 0, "Just too late!", (String) null);
            }
            if (var3.field_V <= 0) {
              this.field_I.e((byte) -114);
              if (var5 == 0) {
                return;
              }
            }
            this.B((byte) 17);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = decompiledCaughtException;
            stackIn_45_0 = var3_ref;
            stackIn_45_1 = new StringBuilder().append("uf.BB(");
            if (param0 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.a(param0, true, wn.field_i, gg.field_f);
          if (this.field_H &&
            cd.field_b == 1 &&
            this.field_e != var2_int) {
            this.field_H = false;
          }
          this.field_e = var2_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.JE(" + param0 + ')');
        }
    }

    private final void c(qe param0, int param1) {
        ge stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        int stackIn_14_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge var3 = null;
        RuntimeException var3_ref = null;
        al var4 = null;
        ge var5 = null;
        int var6 = 0;
        int var6Lifetime1;
        try {
          this.b(param0, (byte) 93);
          var3 = new ge(this.field_I.a(-1) + 8);
          var3.a(true, f.field_g);
          var4 = this.field_I;
          var5 = var3;
          var5.a(var4.field_l.length, false);
          for (var6 = 0; var4.field_l.length > var6; var6++) {
            var4.field_l[var6].a(0, var5);
          }
          if (param1 >= -124) {
            return;
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < var4.field_w.length; var6Lifetime1++) {
            var4.field_w[var6Lifetime1].a(var5, 0);
          }
          stackIn_13_0 = var3;
          stackIn_13_1 = true;
          if (pq.field_B != null) {
            stackIn_14_2 = pq.field_B.length;
          } else {
            stackIn_14_2 = 0;
          }
          ((ge) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2);
          param0.field_x = ii.a(var3.field_t, var3.field_v, 0, 154302664);
          if ((this.field_L & hq.field_c) == 0 &&
            this.field_I.field_q != -1) {
            this.field_o = wn.field_f[this.field_I.field_q];
          }
          this.b((int) param0.field_V, true);
          if ((this.field_L & hq.field_c) == 0) {
            this.a(param0, 1);
          } else {
            ej.field_j.b(false, 69);
            ej.field_j.a(param0.field_x, (byte) -127);
          }
          id.field_c.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("uf.DD(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(String[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          hp.field_c = ek.a(120);
          var5_int = -61 / ((-59 - param2) / 38);
          this.field_I = new al(param3, param1, param0, -1);
          this.field_F = new int[this.field_I.field_h.length];
          this.field_i = new String[this.field_I.field_h.length];
          this.field_x = new kj[param0.length];
          for (var6 = 0; this.field_x.length > var6; var6++) {
            this.field_x[var6] = new kj();
          }
          this.z(4476);
          if (this.field_G == null) {
            this.field_G = this.field_x[0];
          }
          if (-1 != this.field_I.field_q) {
            this.field_o = wn.field_f[this.field_I.field_q];
          }
          oh.field_h = false;
          if (0 != (f.field_f & this.field_L)) {
            this.field_o = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("uf.QD(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -106 % ((param0 + 69) / 46);
          if (!this.b(1, 1, false)) {
            return false;
          }
          this.field_R = -1;
          var3 = Math.max(12.0, this.field_eb.d(8) * ((double)wp.field_d / 32.0 + 1.0));
          this.field_eb.a(true, var3);
          this.field_O.a(true, var3);
          this.field_D = true;
          this.field_M = -1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.GA(" + param0 + ')');
        }
    }

    private final void B(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        pq var4 = null;
        int var3Lifetime1;
        try {
          qh.a(bk.field_w);
          qh.c(t.field_e + gg.field_b[3].field_z, (fl.field_q.field_ib >> 1) - 240 + this.field_P - 16, t.field_e + gg.field_b[3].field_z + 18, -240 - (-(fl.field_q.field_ib >> 1) - 16) + this.field_U);
          fb.a();
          fb.b(320 + t.field_e, fl.field_q.field_ib >> 1);
          for (var2_int = 0; this.field_C > var2_int; var2_int++) {
            var3 = this.field_ib[var2_int];
            var4 = this.field_I.field_l[var3];
            if (var4.field_p) {
              var4.i(param0 ^ 34);
              dq.field_a.a(false, var4.field_G, var3);
            }
            dq.field_a.a(param0 - 1912602401, var3, var4.field_G, sa.field_m, false);
          }
          if (param0 != 32) {
            this.field_G = (kj) null;
          }
          qh.b(bk.field_w);
          fb.a();
          fb.b(320, 240);
          nj.a(id.field_a, (byte) -82, this.field_n, t.field_e, -240 + (fl.field_q.field_ib >> 1) - 8 + this.field_P - id.field_a[1].field_y, 16 + (this.field_E - (-id.field_a[1].field_y - id.field_a[7].field_y)));
          if (0L != (pd.field_i & 268435456L)) {
            var2 = null;
            for (var3Lifetime1 = 0; this.field_C > var3Lifetime1; var3Lifetime1++) {
              if (null != var2) {
                var2 = (String) (var2) + ", " + this.field_ib[var3Lifetime1];
              } else {
                var2 = "rack: " + this.field_ib[var3Lifetime1];
              }
            }
            if (var2 == null) {
              return;
            }
            sa.field_h.d((String) (var2), 40, 400, 13421772, 3355443);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (var2), "uf.HA(" + param0 + ')');
        }
    }

    final void d(int param0, ge param1) {
        qe var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 4096) {
            this.e(false);
          }
          var3 = this.field_I.j(param0 - 4029);
          var3.b((byte) 111, param1);
          if (!var3.d(param0 - 3985)) {
            this.field_I.f((byte) 78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("uf.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void s(byte param0) {
        oh.field_h = false;
        this.C(120);
        this.l((byte) -37);
        if (param0 > -23) {
          return;
        }
        try {
          this.r(-14034);
          this.y((byte) -99);
          if (dq.field_a instanceof ul) {
            ((ul) (dq.field_a)).a(this.field_I.j(108).field_I, (byte) -37, this.field_I.field_l);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.P(" + param0 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        Object stackIn_23_0 = null;
        int[] stackIn_26_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (param4 != 95) {
            this.b(false, 33, 64);
          }
          do {
            if (this.field_I.a(param0, param5, param2, 359, param3, param1)) {
              stackIn_26_0 = new int[]{param2, param1, param0};
              return stackIn_26_0;
            }
            var7_int = 1;
            if (param0 < 96) {
              var7_int = 0;
              param0++;
            }
            while (param0 * param0 + param1 * param1 > 9216) {
              if (param1 > 0) {
                var7_int = 0;
                param1--;
                continue;
              }
              if (param1 < 0) {
                param1++;
                var7_int = 0;
                continue;
              }
              var7_int = 1;
              break;
            }
            if (var7_int != 0 &&
              param2 < 768) {
              var7_int = 0;
              param2++;
            }
          } while (var7_int == 0);
          stackIn_23_0 = null;
          return (int[]) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var7), "uf.LD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_I.j(31).field_q != 0) {
            return;
          }
          this.field_p = param2;
          this.field_g = param1;
          var4_int = param2 - 320;
          var5 = -240 + param1;
          var6 = this.field_eb.d(8);
          var8 = -var6 * ((double)this.field_ab[9] * 0.0000152587890625) + 0.0000152587890625 * (double)this.field_ab[3] * (double)var4_int * -var6 / 512.0 + (double)var5 * ((double)this.field_ab[6] * 0.0000152587890625) * -var6 / 512.0;
          var10 = -var6 * (0.0000152587890625 * (double)this.field_ab[10]) + -var6 * (0.0000152587890625 * (double)this.field_ab[4] * (double)var4_int) / 512.0 + -var6 * (0.0000152587890625 * (double)this.field_ab[7] * (double)var5) / 512.0;
          if (param0 > -89) {
            return;
          }
          var12 = (double)this.field_ab[8] * 0.0000152587890625 * (double)var5 * -var6 / 512.0 + (-var6 * (0.0000152587890625 * (double)this.field_ab[11]) + (double)var4_int * ((double)this.field_ab[5] * 0.0000152587890625) * -var6 / 512.0);
          var14 = (double)(-((float)this.field_I.field_l[0].field_g / 8192.0f * (float)id.field_c.field_l[9] + (float)id.field_c.field_l[10] * ((float)this.field_I.field_l[0].field_k / 8192.0f) + (float)id.field_c.field_l[11] * ((float)this.field_I.field_l[0].field_j / 8192.0f))) * 0.0000152587890625;
          var16 = -((double)(id.field_c.field_l[11] * this.field_ab[2]) * 0.0000152587890625 + (0.0000152587890625 * (double)(this.field_ab[0] * id.field_c.field_l[9]) + var14 + 0.0000152587890625 * (double)(this.field_ab[1] * id.field_c.field_l[10]))) / (0.0000152587890625 * ((double)id.field_c.field_l[10] * var10 + (double)id.field_c.field_l[9] * var8 + (double)id.field_c.field_l[11] * var12));
          var18 = var8 * var16 + (double)this.field_ab[0];
          var20 = var10 * var16 + (double)this.field_ab[1];
          var22 = (double)this.field_ab[2] + var12 * var16;
          var18 = var18 - (double)this.field_I.field_l[0].field_g / 8192.0;
          var20 = -((double)this.field_I.field_l[0].field_k / 8192.0) + var20;
          var22 = -((double)this.field_I.field_l[0].field_j / 8192.0) + var22;
          var24 = var22 * ((double)id.field_c.field_l[5] / 65536.0) + (var20 * ((double)id.field_c.field_l[4] / 65536.0) + var18 * ((double)id.field_c.field_l[3] / 65536.0));
          var26 = var22 * ((double)id.field_c.field_l[8] / 65536.0) + ((double)id.field_c.field_l[7] / 65536.0 * var20 + var18 * ((double)id.field_c.field_l[6] / 65536.0));
          var24 = var24 * 2.0;
          var26 = var26 * 2.0;
          var28 = var26 * var26 + var24 * var24;
          if (var28 < 16384.0) {
            if (9216.0 < var28) {
              var26 = 96.0 * var26 / 128.0;
              var24 = 96.0 * var24 / 128.0;
            }
            if (this.a(false, (int)(0.5 + var26), (int)(0.5 + var24))) {
              id.field_c.field_g = true;
              hh.field_c = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1, int param2) {
        double[][] var4 = null;
        double[][] stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          this.field_M = param2;
          if (param1 <= 1) {
            this.field_C = -73;
          }
          if (un.field_b &&
            0 != (hq.field_c & this.field_L)) {
            stackIn_10_0 = f.field_a;
          } else {
            stackIn_10_0 = f.field_c;
          }
          var4 = stackIn_10_0;
          this.field_R = -1;
          this.field_O.a(var4[param2], (byte) -55);
          if (param0) {
            this.field_eb.a(var4[param2], (byte) -106);
          }
          this.field_D = true;
          this.e(-69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.CD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 < 0) {
            param1 = 0;
          }
          if (param1 > 4096) {
            param1 = 4096;
          }
          if (!param0) {
            return;
          }
          if (~param1 != ~this.field_G.field_n) {
            var3 = this.a(this.field_G.field_e, this.field_G.field_d, this.field_G.field_k, param1, (byte) 95, this.field_G.field_h);
            if (var3 == null) {
              this.m(97);
            } else {
              this.field_G.field_n = param1;
              kh.field_gc.b(99, this.field_G.field_n);
              this.field_G.field_e = var3[2];
              this.field_G.field_d = var3[1];
              this.field_G.field_k = var3[0];
              id.field_c.field_g = true;
              hh.field_c = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.UD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void t(int param0) {
        mm stackIn_4_0 = null;
        double[][] stackIn_7_1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_4_0 = this.field_O;
          if (un.field_b &&
            0 != (this.field_L & hq.field_c)) {
            stackIn_7_1 = f.field_a;
          } else {
            stackIn_7_1 = f.field_c;
          }
          ((mm) (Object) stackIn_4_0).a(stackIn_7_1[0], (byte) -117);
          this.field_D = true;
          this.field_M = param0;
          this.e(param0 - 96);
          this.field_R = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.HD(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_D) {
            this.field_eb.a(this.field_ab, true);
            kh.field_gc.a((byte) -123, this.field_ab);
            this.field_D = false;
            this.field_p = -1;
            this.field_g = -1;
          }
          if (param1 != -29423) {
            return;
          }
          kh.field_gc.a((byte) -55, this);
          if (this.field_I.j(param1 + 29476).field_q == 0 &&
            0 == this.field_e) {
            this.a(false);
          }
          if (0L == (131072L & pd.field_i)) {
            this.a(true, param0);
          }
          this.G(-9449);
          if ((pd.field_i & 4294967296L) == 0L) {
            re.a((byte) 121);
          }
          ua.b(true);
          if (this.field_I.field_n > 1) {
            boolean decompiledFrameRemainder0 = true;
            var3_int = 60;
            var4 = 55;
            if (!iq.field_i && (!(wn.field_i >= 0) ||
              !((qh.field_l >> 1) > wn.field_i) ||
              !(0 <= gg.field_f) ||
              !(gg.field_f < var4))) {
              if (!(0 >= lk.field_u)) {
                lk.field_u = lk.field_u - 16;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (lk.field_u < 256) {
                lk.field_u = lk.field_u + 16;
              }
            }
            var5 = this.h(true);
            var6 = 0;
            for (var7 = 0; var7 < var5.length; var7++) {
              var8 = sa.field_h.b(var5[var7]);
              if (var8 > var6) {
                var6 = var8;
              }
            }
            var7Lifetime1 = of.field_Ob;
            var8Lifetime1 = no.field_q.field_A + fm.field_M + 2;
            var9 = 16 + var6 - (-eq.field_Q[4].field_z - eq.field_Q[6].field_z);
            var10 = 4 + eq.field_Q[1].field_A + (var5.length * sa.field_h.field_G + eq.field_Q[7].field_A);
            var4Lifetime1 = var8Lifetime1 + eq.field_Q[1].field_A + sa.field_h.field_G;
            qh.a(var7Lifetime1, var8Lifetime1, var9, var10, 8, 4144959, 192 * lk.field_u >> 8);
            rk.a(114, var8Lifetime1, lk.field_u, var7Lifetime1, var9, var10, eq.field_Q);
            for (var11 = 0; var5.length > var11; var11++) {
              sa.field_h.b(var5[var11], var3_int, var4Lifetime1, 15658734, 2039583, lk.field_u);
              var4Lifetime1 = var4Lifetime1 + sa.field_h.field_G;
            }
          }
          if (0 != (this.field_L & sk.field_d)) {
            this.field_c.j(param1 + 29451);
          }
          if (param0) {
            var3_intLifetime1 = dp.a(104);
            if (var3_intLifetime1 >= 0) {
              if (0 != (256 & var3_intLifetime1)) {
                if ((this.field_L & sk.field_d) != 0 &&
                  this.field_c.field_h.field_q != null) {
                  this.field_c.field_h.a(15658734, 128, 9750);
                }
                pf.a(4144959, 15658734, param1 + 29427, sa.field_h, re.field_e[var3_intLifetime1 - 256]);
              } else {
                pf.a(4144959, 15658734, 4, sa.field_h, wj.field_S[var3_intLifetime1]);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.BD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        try {
          this.field_I.a(ga.a(512, true, ea.field_r), -1, 0, 0, 19063);
          if (param0 >= -67) {
            this.l((byte) 34);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.TA(" + param0 + ')');
        }
    }

    private final void b(byte param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 38) {
            this.n(48);
          }
          if (0 != this.field_I.j(117).field_q) {
            return;
          }
          if (this.b(1, 5, false)) {
            this.b(true, param1 + this.field_G.field_n);
            this.b(param1 + this.field_Q, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.HE(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        try {
          uo.c(false);
          this.field_T = false;
          this.field_Q = this.field_G.field_n;
          kh.field_gc.a((byte) 124, param0, 9);
          if (param1 >= -100) {
            this.field_m = -118;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16439) {
            this.c((qe) null, 120);
          }
          stackIn_4_0 = qh.field_l - ((65536 - hc.a(2047, this.field_l)) * (1 + il.field_f.field_w) >> 17);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.TB(" + param0 + ')');
        }
    }

    private final void B(byte param0) {
        RuntimeException runtimeException = null;
        qe var2 = null;
        oo stackIn_3_0;
        int stackIn_3_1;
        int[] stackIn_3_2;
        int stackIn_3_3;
        int[] stackIn_3_4;
        int stackIn_4_5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_I.j(69);
          hh.field_c = true;
          var2.field_q = 1;
          stackIn_3_0 = kh.field_gc;
          stackIn_3_1 = 1336449640;
          stackIn_3_2 = this.field_ab;
          stackIn_3_3 = 32 + 192 * this.field_G.field_n / 4096;
          stackIn_3_4 = id.field_c.field_l;
          if (this.field_G.field_n > 2048) {
            stackIn_4_5 = 7;
          } else {
            stackIn_4_5 = 8;
          }
          ((oo) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5);
          this.field_B = -37;
          this.a(true, (byte) -114);
          if (!this.i(-1)) {
            this.E(-24070);
          }
          vm.field_f = 2147483647 & vm.field_f + 1048576;
          if (param0 != 17) {
            this.o(50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.RB(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, di param2, di param3, di param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -11934) {
            uf.a(-105, true, (di) null, (di) null, (di) null);
          }
          ig.field_j = oh.a(-71, "");
          ig.field_j.a(false, (byte) 120);
          uf.a(param3, -22764, param2, param4);
          nd.b((byte) -124);
          pa.field_I = aa.field_c;
          wd.field_Lb = aa.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uf.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, int param2, int param3) {
        int var26 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var27 = 0;
        int[] stackIn_12_0 = null;
        double stackIn_16_0 = 0.0;
        double stackIn_23_0 = 0.0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        pq var28 = null;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        double var43 = 0.0;
        int[] var6Lifetime1;
        int[] var6Lifetime2;
        int var5_intLifetime1;
        try {
          param2 -= 320;
          var5_int = -240 + param3;
          var6 = this.field_ab;
          var7 = (double)((var6[9] << 9) + param2 * var6[3] + var6[6] * var5_int);
          var9 = (double)((var6[10] << 9) + var6[4] * param2 + var5_int * var6[7]);
          var11 = (double)(var6[8] * var5_int + (var6[5] * param2 + (var6[11] << 9)));
          var13 = Math.sqrt(var9 * var9 + var7 * var7 + var11 * var11);
          var11 = var11 / var13;
          var5_intLifetime1 = -(fl.field_q.field_ib >> 1) + param3;
          var6Lifetime1 = sa.field_m;
          var9 = var9 / var13;
          var7 = var7 / var13;
          var15 = (double)((var6Lifetime1[9] << 9) + var6Lifetime1[3] * param2 + var6Lifetime1[6] * var5_intLifetime1);
          var17 = (double)(var5_intLifetime1 * var6Lifetime1[7] + (var6Lifetime1[4] * param2 + (var6Lifetime1[10] << 9)));
          var19 = (double)(param2 * var6Lifetime1[5] + ((var6Lifetime1[11] << 9) + var6Lifetime1[8] * var5_intLifetime1));
          var21 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
          var15 = var15 / var21;
          var19 = var19 / var21;
          var17 = var17 / var21;
          var23 = -1.0;
          if (param0) {
            field_y = (byte[][]) null;
          }
          var25 = -1;
          for (var26 = 0; pd.field_f.length > var26; var26++) {
            var27 = pd.field_f[var26];
            if (var27 < this.field_I.field_l.length) {
              var28 = this.field_I.field_l[var27];
              if (!var28.field_o) {
                stackIn_12_0 = this.field_ab;
              } else {
                stackIn_12_0 = sa.field_m;
              }
              var6Lifetime2 = stackIn_12_0;
              var29 = (double)rj.e(-(var28.field_g >> 13) + var6Lifetime2[0], 3);
              var31 = (double)rj.e(var6Lifetime2[1] - (var28.field_k >> 13), 3);
              var33 = (double)rj.e(-(var28.field_j >> 13) + var6Lifetime2[2], 3);
              var35 = var31 * var17 + var15 * var29 + var19 * var33;
              var37 = var9 * var31 + var7 * var29 + var33 * var11;
              if (var28.field_o) {
                stackIn_16_0 = -var35;
              } else {
                stackIn_16_0 = -var37;
              }
              var39 = stackIn_16_0;
              if (0.0 < var39) {
                var41 = var33 * var33 + (var29 * var29 + var31 * var31);
                if (!var28.field_o) {
                  stackIn_23_0 = var41 + var39 * (var39 + var37 * 2.0);
                } else {
                  stackIn_23_0 = var41 + (var35 * 2.0 + var39) * var39;
                }
                var43 = stackIn_23_0;
                if (param1) {
                  if (!(var43 > 64.0)) {
                    stackIn_28_0 = var27;
                    return stackIn_28_0;
                  }
                } else {
                  if (var25 == -1 ||
                    var43 < var23) {
                    var23 = var43;
                    var25 = var27;
                  }
                }
              }
            }
          }
          stackIn_36_0 = var25;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5), "uf.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void w(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 24) {
            return;
          }
          boolean decompiledSharedTail0 = (!(wb.field_a) ||
            !(fm.field_M < 10));
          if (!decompiledSharedTail0) {
            ac.b(1, (byte) 103);
            decompiledSharedTail0 = (Pool.field_O != 0);
          }
          if ((decompiledSharedTail0) && (!wb.field_a &&
            -no.field_q.field_A < fm.field_M)) {
            ac.b(-1, (byte) 69);
          }
          tq.field_q = (sa.field_h.field_C + no.field_q.field_y >> 1) + fm.field_M;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.IB(" + param0 + ')');
        }
    }

    private final void A(int param0) {
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        qe var3 = null;
        kj var4 = null;
        oq var4_ref = null;
        qe var3Lifetime1;
        try {
          if (this.field_I.field_o) {
            return;
          }
          if (0 == this.field_Q) {
            return;
          }
          if (param0 != 1) {
            this.c((byte) -56);
          }
          if (this.i(-1) &&
            this.b(1, 7, false)) {
            var2 = this.field_I.j(96);
            if (var2.field_q >= 1) {
              return;
            }
            this.field_G.field_n = this.field_Q;
            this.field_j = false;
            var2.field_s = uk.field_a;
            var3 = var2;
            var4 = this.field_G;
            var3.field_C = (short)((1024 + var4.field_h) % 2048);
            var3.field_V = (short)var4.field_n;
            var3.field_D = (byte)var4.field_d;
            var3.field_A = (short)var4.field_k;
            var3.field_H = (byte)var4.field_e;
            if ((hq.field_c & this.field_L) != 0) {
              this.j((byte) -118);
              ej.field_j.b(false, 65);
              var3Lifetime1 = var2;
              var4_ref = ej.field_j;
              ((ge) ((Object) var4_ref)).a(var3Lifetime1.field_v, false);
              ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3Lifetime1.field_C);
              ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3Lifetime1.field_A);
              ((ge) ((Object) var4_ref)).a((byte) -81, (int) var3Lifetime1.field_V);
              ((ge) ((Object) var4_ref)).a((int) var3Lifetime1.field_D, false);
              ((ge) ((Object) var4_ref)).a((int) var3Lifetime1.field_H, false);
            }
            this.field_I.field_i = null;
            this.B((byte) 17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.Q(" + param0 + ')');
        }
    }

    final static void r(byte param0) {
        try {
          cr.a(16, hk.d(122));
          if (param0 != -80) {
            field_gb = (wc) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.VA(" + param0 + ')');
        }
    }

    private final void x(int param0) {
        int var8 = 0;
        int var12_int = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        long var6 = 0L;
        double var9 = 0.0;
        int var11 = 0;
        double var12 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          var2_double = 0.0;
          var4 = 0.0;
          var6 = 0L;
          for (var8 = 0; this.field_I.field_l.length > var8; var8++) {
            if (this.field_I.field_l[var8].field_s &&
              this.field_I.field_l[var8].field_v != 0) {
              var9 = Math.sqrt((double)(this.field_I.field_l[0].field_I * this.field_I.field_l[0].field_I + this.field_I.field_l[0].field_t * this.field_I.field_l[0].field_t) / 65536.0 / 65536.0);
              var11 = -1;
              for (var12_int = 0; this.field_I.field_w.length > var12_int; var12_int++) {
                var13 = -this.field_I.field_l[var8].field_g + this.field_I.field_w[var12_int].field_g;
                var14 = this.field_I.field_w[var12_int].field_f - this.field_I.field_l[var8].field_k;
                var15 = aj.a(var13, false, var13) + aj.a(var14, false, var14);
                if (var11 < 0 ||
                  var11 > var15) {
                  var11 = var15;
                }
              }
              var12 = Math.sqrt((double)var11 / 65536.0) * Math.max(0.0, -0.04998779296875 + var9);
              var2_double = var2_double + var12 * ((double)this.field_I.field_l[var8].field_g / 65536.0);
              var4 = var4 + var12 * ((double)this.field_I.field_l[var8].field_k / 65536.0);
              var6 = (long)((double)var6 + var12);
            }
          }
          if (var6 > 0L) {
            this.field_R = -1;
            this.field_O.field_m = var4 / (double)var6;
            this.field_O.field_f = var2_double / (double)var6;
          }
          if (param0 != 1) {
            field_X = 98;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.MB(" + param0 + ')');
        }
    }

    final void c(int param0, ge param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_I.a(param1, (byte) 123);
          if (param0 != 16915) {
            this.b(34, false);
          }
          kh.field_gc.b(this.field_I, 0);
          this.f((byte) 93);
          if ((hq.field_c & this.field_L) == 0 &&
            this.field_I.j(72).field_q == 0) {
            this.s((byte) -74);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uf.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, ko param1, byte param2) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        aa var5 = null;
        qe var6 = null;
        try {
          if (param2 != 27) {
            this.field_T = false;
          }
          var4_int = -sa.field_h.field_w + qh.field_f;
          var5 = new aa(param1);
          var6 = (qe) (var5.a(0));
          while (var6 != null) {
            if (var6.field_q >= 3) {
              sa.field_h.d(var6.a(true), param0, var4_int, 16724787, 1);
              var4_int = var4_int - 5 * (sa.field_h.field_w + sa.field_h.field_C) / 4;
              if (sa.field_h.field_C >= var4_int) {
                return;
              }
            }
            if (var6.field_q >= 2) {
              sa.field_h.d(var6.c(param2 ^ 26864), param0, var4_int, 16724787, 1);
              var4_int = var4_int - (sa.field_h.field_C + sa.field_h.field_w) * 5 / 4;
              if (sa.field_h.field_C >= var4_int) {
                return;
              }
            }
            if (!(1 > var6.field_q) ||
              var6.field_V != -1) {
              if (var6.field_q != 0) {
                sa.field_h.d(var6.e(0), param0, var4_int, 16750899, 1);
              } else {
                sa.field_h.b(var6.e(0), param0, var4_int, 16750899, 1, 128);
              }
              var4_int = var4_int - 5 * (sa.field_h.field_C + sa.field_h.field_w) / 4;
              if (var4_int <= sa.field_h.field_C) {
                return;
              }
            }
            if (var6.field_q >= 0) {
              sa.field_h.d(var6.a(param2 ^ 26, this.field_I), param0, var4_int, 10092339, 1);
              var4_int = var4_int - (sa.field_h.field_w + sa.field_h.field_C) * 5 / 4;
              if (sa.field_h.field_C >= var4_int) {
                return;
              }
            }
            var6 = (qe) (var5.c((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_41_0 = var4;
          stackIn_41_1 = new StringBuilder().append("uf.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = param1 + this.field_G.field_k;
          if (param0 <= param1) {
            if (param1 > 1024) {
              param1 = 1024;
            }
          } else {
            param1 = 512;
          }
          if (this.field_G.field_k != param1) {
            this.b(param0 - 511, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(qe param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        dn var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        try {
          if (null != param0.field_R &&
            !param0.field_R.c(0)) {
            var3 = (dn) (param0.field_R.c((byte) -54));
            while (var3 != null) {
              var4 = nr.a(new String[]{this.field_I.field_h[param0.field_L]}, -1, e.field_h[var3.field_q]);
              em.$cfr$intArgs$a$c9c3307e6488(120, false, 1, var4);
              var3 = (dn) (param0.field_R.f((byte) -5));
            }
          }
          if (param1 < 86) {
            discarded$1 = this.a(-95, 0, -15, (vh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uf.QC(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void J(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (!vj.field_c[bc.field_f] &&
            !vj.field_c[mb.field_a]) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = -1;
          }
          if (!vj.field_c[gn.field_c] &&
            !vj.field_c[di.field_b]) {
            stackIn_14_1 = 0;
          } else {
            stackIn_14_1 = 1;
          }
          var2_int = stackIn_7_0 + stackIn_14_1;
          stackIn_18_0 = (!vj.field_c[105]) ? 0 : -1;
          if (vj.field_c[104]) {
            stackIn_22_1 = 1;
          } else {
            stackIn_22_1 = 0;
          }
          var3 = stackIn_18_0 + stackIn_22_1;
          if (!vj.field_c[gp.field_b] &&
            !vj.field_c[fl.field_p]) {
            stackIn_29_0 = 0;
          } else {
            stackIn_29_0 = -1;
          }
          if (!vj.field_c[hm.field_j] &&
            !vj.field_c[kr.field_h]) {
            stackIn_36_1 = 0;
          } else {
            stackIn_36_1 = 1;
          }
          var4 = stackIn_29_0 + stackIn_36_1;
          if (param0 == this.field_I.j(72).field_q &&
            0 != var2_int) {
            if (this.b(1, 4, false)) {
              this.field_A = this.field_A - var2_int;
              this.c(param0 - 69, 2047 & this.field_A + this.field_G.field_h);
              hh.field_c = true;
              id.field_c.field_g = true;
            }
          } else {
            if (this.field_A != 0) {
              this.field_A = 0;
            }
          }
          if (0 == this.field_I.j(28).field_q &&
            var3 != 0) {
            this.f(512, var3 * 8);
            hh.field_c = true;
            id.field_c.field_g = true;
          }
          if (this.field_I.j(77).field_q == 0 &&
            var4 != 0) {
            if (!this.b(1, 5, false)) {
              return;
            }
            if (0 == this.field_u) {
              this.field_u = var4 << 16;
            } else {
              this.field_u = this.field_u + (var4 << 15);
            }
            this.field_G.field_n = this.field_Q;
            kh.field_gc.b(101, this.field_G.field_n);
            if (this.field_u >= 0) {
              this.field_h = 75;
            } else {
              this.field_h = 0;
            }
            this.b((byte) 74, -(this.field_u >> 16));
            id.field_c.field_g = true;
            hh.field_c = true;
            return;
          }
          if (this.field_u != 0) {
            this.field_u = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.VC(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_M = -1;
          this.field_O.a(105);
          if (param0 != -23095) {
            this.field_B = 121;
          }
          this.e(param0 ^ 23155);
          this.field_R = (int)(this.field_O.a(true) * 400.0 / 3.141592653589793 / 2.0) % 400;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, qe param1) {
        oo stackIn_34_0 = null;
        int stackIn_35_1 = 0;
        oo stackIn_41_0;
        int stackIn_41_1;
        int[] stackIn_41_2;
        int stackIn_41_3;
        int[] stackIn_41_4;
        int stackIn_42_5;
        int stackIn_59_0 = 0;
        boolean stackIn_85_0 = false;
        int stackIn_98_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_84_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ij var5 = null;
        aa var5_ref = null;
        int[] var6 = null;
        cr var6_ref = null;
        ij var7_ref_ij = null;
        int var7 = 0;
        dl var8 = null;
        int var9 = 0;
        ij var5Lifetime1;
        aa var5_refLifetime1;
        cr var6_refLifetime1;
        int var3_intLifetime1;
        var9 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((pd.field_i & 2048L) == 0L ||
            this.field_kb) {
            if (this.field_B < 0) {
              if ((this.field_B >= -12) &&
                (decompiledFrameRemainder0 = ((hq.field_c & this.field_L) == 0 ||
                this.field_j))) {
                id.field_c.field_g = true;
                this.field_f = -this.field_B * this.field_G.field_n * 228 / 4096 / 12;
                this.field_B = this.field_B + 1;
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.field_f = (this.field_B + 37) * this.field_G.field_n * 228 / 4096 / 25;
                id.field_c.field_g = true;
                this.field_B = this.field_B + 1;
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (0 == this.field_B) {
                this.field_f = 57;
                if (this.i(-1)) {
                  stackIn_34_0 = kh.field_gc;
                  if (this.field_G.field_n > 2048) {
                    stackIn_35_1 = 0;
                  } else {
                    stackIn_35_1 = 1;
                  }
                  ((oo) (Object) stackIn_34_0).a(stackIn_35_1, this.field_G.field_n * 128 / 4096 + 32, (byte) -115, 128);
                  if (var9 != 0) {
                    stackIn_41_0 = kh.field_gc;
                    stackIn_41_1 = 1336449640;
                    stackIn_41_2 = this.field_ab;
                    stackIn_41_3 = 32 + this.field_G.field_n * 128 / 4096;
                    stackIn_41_4 = id.field_c.field_l;
                    if (this.field_G.field_n > 2048) {
                      stackIn_42_5 = 0;
                    } else {
                      stackIn_42_5 = 1;
                    }
                    ((oo) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5);
                  }
                } else {
                  stackIn_41_0 = kh.field_gc;
                  stackIn_41_1 = 1336449640;
                  stackIn_41_2 = this.field_ab;
                  stackIn_41_3 = 32 + this.field_G.field_n * 128 / 4096;
                  stackIn_41_4 = id.field_c.field_l;
                  if (this.field_G.field_n > 2048) {
                    stackIn_42_5 = 0;
                  } else {
                    stackIn_42_5 = 1;
                  }
                  ((oo) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5);
                }
                this.field_I.i((byte) -51);
                if (this.i(-1)) {
                  this.E(-24070);
                }
                this.field_B = this.field_B + 1;
                decompiledFrameRemainder0 = ((f.field_f & this.field_L) != 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (this.field_o == -1))) {
                  this.field_o = 0;
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                this.field_kb = false;
                stackIn_59_0 = (param1.field_n == -1) ? 0 : 1;
                var3_int = stackIn_59_0;
                var4 = param1.field_t ? 1 : 0;
                this.field_I.g((byte) -126);
                if (var4 == 0) {
                  if (var3_int == 0 &&
                    param1.field_n != -1 &&
                    !this.field_I.field_f.c(param1, -110) &&
                    !nq.a((byte) 49, 4)) {
                    var5 = gj.a(true, 4, bq.field_s, (String) null);
                    var6 = wm.field_ac[0];
                    param1.field_t = true;
                    var5.field_D = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    var5.field_F = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    var5.field_p = new int[]{var6[0] >> 13, var6[1] >> 13, var6[2] >> 13};
                    if ((16711680 & wq.field_c) != 16711680) {
                      wq.field_c = wq.field_c + 65536;
                    }
                    var5.field_v = 5;
                  }
                  boolean decompiledFrameCompleted1 = true;
                  if (this.field_I.field_j > 0) {
                    var5_ref = new aa(param1.field_m);
                    var6_ref = (cr) (var5_ref.b((byte) -92));
                    while (null != var6_ref) {
                      stackOut_84_0 = this.field_I.field_f.a(var6_ref.field_n, (byte) 9, param1);
                      stackIn_98_0 = stackOut_84_0 ? 1 : 0;
                      stackIn_85_0 = stackOut_84_0;
                      if (var9 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      if (!stackIn_85_0 &&
                        !nq.a((byte) 95, 4)) {
                        var7_ref_ij = gj.a(true, 4, bq.field_s, (String) null);
                        var8 = this.field_I.field_w[var6_ref.field_r];
                        if ((16711680 & wq.field_c) != 16711680) {
                          wq.field_c = wq.field_c + 65536;
                        }
                        param1.field_t = true;
                        var7_ref_ij.field_v = 5;
                        var7_ref_ij.field_D = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                        var7_ref_ij.field_F = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                        var7_ref_ij.field_p = new int[]{var8.field_g >> 13, var8.field_f >> 13, 0};
                        break;
                      }
                      var6_ref = (cr) (var5_ref.b(-126));
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    stackIn_98_0 = param1.field_q;
                  }
                  if (stackIn_98_0 == 2 &&
                    param1.field_n == -1 &&
                    param1.field_t) {
                    var5Lifetime1 = gj.a(true, 4, bq.field_s, (String) null);
                    var5Lifetime1.field_v = 5;
                    var5Lifetime1.field_D = new int[]{this.field_I.field_l[0].field_g >> 13, this.field_I.field_l[0].field_k >> 13, this.field_I.field_l[0].field_j >> 13};
                    var5Lifetime1.field_F = new int[]{this.field_I.field_l[0].field_g >> 13, this.field_I.field_l[0].field_k >> 13, this.field_I.field_l[0].field_j >> 13};
                    var5Lifetime1.field_p = new int[]{this.field_I.field_l[0].field_g >> 13, this.field_I.field_l[0].field_k >> 13, this.field_I.field_l[0].field_j >> 13};
                  }
                }
                boolean decompiledFrameCompleted0 = true;
                if (this.field_I.field_j > 0) {
                  var5_refLifetime1 = new aa(param1.field_m);
                  var6_refLifetime1 = (cr) (var5_refLifetime1.a(0));
                  var7 = 0;
                  while (!(var7 >= this.field_I.field_j)) {
                    stackIn_121_0 = -1;
                    stackIn_121_1 = ~var6_refLifetime1.field_n;
                    if (var9 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_121_0 != stackIn_121_1) {
                      vm.field_f = vm.field_f + 65536;
                    }
                    var6_refLifetime1 = (cr) (var5_refLifetime1.c((byte) -71));
                    var7++;
                  }
                }
                if (decompiledFrameCompleted0) {
                  this.t((byte) -113);
                  stackIn_121_0 = this.field_L;
                  stackIn_121_1 = sk.field_d;
                }
                if ((stackIn_121_0 & stackIn_121_1) == 0) {
                  this.p(-709);
                }
                this.c(-118);
                if (param1.field_q == 2) {
                  this.c(param1, -128);
                }
                this.field_B = this.field_B + 1;
              }
            }
          }
          var3_intLifetime1 = 104 % ((-12 - param0) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_133_0 = var3;
          stackIn_133_1 = new StringBuilder().append("uf.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_134_2 = "null";
          } else {
            stackIn_134_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_133_0), ((StringBuilder) (Object) stackIn_133_1).append(stackIn_134_2).append(')').toString());
        }
    }

    private final void q(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_I.c((byte) -79);
          id.field_c.field_g = true;
          hh.field_c = true;
          if (param0 != 114) {
            this.field_bb = true;
          }
          this.K(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EA(" + param0 + ')');
        }
    }

    private final void b(int param0, qe param1) {
        int var6_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        af var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        ij var6 = null;
        try {
          if (!(this.field_I.field_f instanceof af)) {
            return;
          }
          var3 = (af) (this.field_I.field_f);
          var4 = dq.field_a.a(var3.f(22533, param1.field_L), (byte) 116);
          var5 = 0;
          for (var6_int = 0; var6_int < this.field_I.field_n; var6_int++) {
            if (~this.field_I.field_f.c(-107, var6_int) == ~this.field_I.field_f.c(-64, param1.field_L)) {
              var5 = var5 | 1 << var6_int;
            }
          }
          if (param0 <= 114) {
            this.field_f = 23;
          }
          var6 = gj.a(true, 10, nr.a(new String[]{null, null, var4}, -1, this.a(ij.field_A, sd.field_O, of.field_Qb, qq.field_zb, (byte) 61, var5, w.field_c, rj.field_g)), (String) null);
          var6.field_q = q.field_b;
          var6.field_r = 5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("uf.DE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void k(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == (this.field_L & hq.field_c)) {
            throw new IllegalStateException();
          }
          if (param0 > -89) {
            this.field_F = (int[]) null;
          }
          ej.field_j.b(false, 66);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.PD(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        pq var3 = null;
        try {
          if (0 != (hq.field_c & this.field_L)) {
            if (this.field_q | false) {
              gj.a(true, 0, "Sorry", "Redo not supported for networked multiplayer, you can still dump the state though.");
            }
            return;
          }
          if (this.field_I.field_o) {
            System.out.println("Can't redo: Game is finished.");
            return;
          }
          var2 = this.field_I.j(29);
          if (param0 <= 62) {
            this.b(8, true);
          }
          if (var2.field_q != 0) {
            System.out.println("Can't redo: Shot is waiting.");
            return;
          }
          if (0 > var2.field_V) {
            System.out.println("Can't redo: Power less than zero.");
            return;
          }
          if (var2.field_V == 0) {
            this.v(0);
            return;
          }
          if (-1 != var2.field_P &&
            var2.field_Q != -1) {
            var3 = this.field_I.field_l[0];
            var3.field_p = true;
            var3.field_g = var2.field_P;
            var3.field_k = var2.field_Q;
            System.out.println("moved cueball to " + var2.field_P + "," + var2.field_Q);
          }
          this.field_G.field_d = var2.field_D;
          this.field_G.field_e = var2.field_H;
          this.field_Q = var2.field_V;
          this.field_G.field_n = var2.field_V;
          this.field_G.field_h = (1024 + var2.field_C) % 2048;
          this.field_G.field_k = var2.field_A;
          System.out.println("Redoing shot: " + var2.e(0));
          this.B((byte) 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.IE(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        qe var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          var2 = this.field_I.j(58);
          if (var2 == null) {
            return;
          }
          var3 = var2.field_I;
          if (~var3 == param0) {
            return;
          }
          var4 = 0;
          while (this.field_I.field_l.length > var4) {
            if (var5 != 0) {
              return;
            }
            if (this.field_I.field_l[var4].field_s) {
              if (~var4 == ~var3) {
                ji.field_b[var4] = 32;
              }
            } else {
              ji.field_b[var4] = 0;
              no.field_n[var4] = 0;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.GC(" + param0 + ')');
        }
    }

    private final String e(int param0, int param1) {
        String dupTemp$2 = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_i[param1]) {
            var3 = this.field_i[param1];
          } else {
            dupTemp$2 = this.field_I.field_h[param1];
            this.field_i[param1] = dupTemp$2;
            var3 = dupTemp$2;
            this.field_F[param1] = sa.field_h.b(this.field_i[param1]);
          }
          if (param0 != -30360) {
            this.field_D = true;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.PB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void G(int param0) {
        int[] discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0L == (pd.field_i & 4294967296L) &&
            wn.field_i >= 0 &&
            0 <= gg.field_f) {
            var2_int = this.a(false, true, wn.field_i, gg.field_f);
            if (!this.field_T) {
              decompiledFrameRemainder0 = (-1 != var2_int);
            } else {
              decompiledFrameRemainder0 = !(var2_int <= 0);
            }
            if (decompiledFrameRemainder0) {
              var3 = dq.field_a.a(var2_int, this.field_I.field_f, (byte) -111);
              er.a(gg.field_f, var3, wn.field_i, 3355443, sa.field_h, true, dq.field_a.a(var2_int, true));
            }
          }
          if (param0 != -9449) {
            discarded$1 = this.a(27, -92, 8, -80, (byte) 101, -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.D(" + param0 + ')');
        }
    }

    final void a(int param0, ge param1) {
        try {
          RuntimeException runtimeException = null;
          qe var3 = null;
          ge var4 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          RuntimeException decompiledCaughtException = null;
          try {
            var3 = this.field_I.j(31);
            if (var3.field_q != 2) {
              if (this.i(-1) &&
                !this.field_j) {
                this.field_I.e((byte) 80);
              } else {
                tc.a(new Throwable(), "Reading end shot packet before we have finished this shot!", -8555);
                dn.c(54);
                return;
              }
            }
            var4 = param1;
            this.field_o = var4.d(-1034);
            if (param0 <= 55) {
              this.field_bb = false;
            }
            var3.a((byte) 112, param1);
            this.a(var3, 1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            runtimeException = decompiledCaughtException;
            stackIn_18_0 = runtimeException;
            stackIn_18_1 = new StringBuilder().append("uf.GE(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean b(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this.field_L & sk.field_d) != 0) {
            if ((1 << param1 & this.field_c.field_h.field_o) != 0) {
              this.field_c.g(-123);
              return false;
            }
            this.field_c.b(param0, param1, -28186);
          }
          if (param2) {
            this.field_g = -113;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.ED(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -35 % ((-34 - param0) / 42);
          if (null == ti.field_d &&
            0 < this.field_o &&
            !this.field_q &&
            0 != (this.field_L & f.field_f) &&
            this.field_I.field_m) {
            if (f.field_g > 0) {
              ti.field_d = new oj(0, 65535, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.field_o});
            } else {
              ti.field_d = new oj(1, 65534, vm.field_f, wq.field_c, field_fb, dk.field_f, new int[]{-this.field_o});
            }
            if (!hk.b(77)) {
              ml.a(25756, ti.field_d, 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.VB(" + param0 + ')');
        }
    }

    final void p(byte param0) {
        int stackIn_39_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = Pool.field_O;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = 3 + f.field_g;
          wq.field_c = wq.field_c & -65536 | (var2_int + (wq.field_c & 65535)) % 31676;
          if (-1 != qi.field_a &&
            !this.field_q) {
            if (59 == qi.field_a) {
              if (uh.field_r == null) {
                uh.field_r = new ge(30);
                decompiledFrameRemainder0 = (var7 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (uh.field_r.field_v == 30 &&
                  cp.a(uh.field_r.field_t, (byte) -83, 30) == 1099305073022L) {
                  this.field_q = true;
                  em.$cfr$intArgs$a$c9c3307e6488(121, false, 1, ec.a((byte) -119, 64525515431L));
                }
                uh.field_r = null;
                if (var7 != 0) {
                  if (null != uh.field_r &&
                    uh.field_r.field_v < 30) {
                    uh.field_r.a(qi.field_a, false);
                    uh.field_r = null;
                  } else {
                    uh.field_r = null;
                  }
                }
              }
            } else {
              if (null != uh.field_r &&
                uh.field_r.field_v < 30) {
                uh.field_r.a(qi.field_a, false);
                if (var7 != 0) {
                  uh.field_r = null;
                }
              } else {
                uh.field_r = null;
              }
            }
          }
          if (null != pq.field_B) {
            stackIn_39_0 = pq.field_B.length + 3;
          } else {
            stackIn_39_0 = 3;
          }
          var2_intLifetime1 = stackIn_39_0;
          var3 = this.field_o;
          var4 = dk.field_f + var3;
          var5 = var4 % 7621;
          var6 = var4 / 7621;
          var4Lifetime1 = 7621 * ((var2_intLifetime1 + var6) % 31676) + var5;
          dk.field_f = -var3 + var4Lifetime1;
          if (param0 <= 78) {
            this.c(61, 127, -6);
          }
          if (qi.field_a == 13) {
            L7: {
              if ((hq.field_c & this.field_L) == 0) {
                if ((oj.field_m & this.field_L) != 0 &&
                  this.field_I.field_o) {
                  var2_intLifetime2 = 9;
                  if (var7 == 0) {
                    break L7;
                  }
                }
                if ((this.field_L & f.field_f) != 0) {
                  var2_intLifetime2 = 3;
                  if (var7 == 0) {
                    break L7;
                  }
                }
                if ((this.field_L & sk.field_d) == 0) {
                  var2_intLifetime2 = 8;
                  if (var7 == 0) {
                    break L7;
                  }
                }
                var2_intLifetime2 = 24;
                if (var7 == 0) {
                  break L7;
                }
              }
              if (this.field_db >= 0) {
                if (!this.field_I.field_o) {
                  var2_intLifetime2 = 10;
                  if (var7 != 0) {
                    var2_intLifetime2 = 11;
                    var2_intLifetime2 = 12;
                  }
                } else {
                  var2_intLifetime2 = 11;
                  if (var7 != 0) {
                    var2_intLifetime2 = 12;
                  }
                }
              } else {
                var2_intLifetime2 = 12;
              }
            }
            var3Lifetime1 = var2_intLifetime2;
            stackIn_74_0 = -3405;
            stackIn_74_1 = var3Lifetime1;
            if (mg.a(true)) {
              stackIn_75_2 = 21;
            } else {
              stackIn_75_2 = 0;
            }
            fq.a(stackIn_74_0, stackIn_74_1, stackIn_75_2, false);
            lg.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) vj.a((byte) -100)));
            return;
          }
          if (!oj.c(-62)) {
            if (0 != (this.field_L & hq.field_c) &&
              rg.field_p) {
              return;
            }
            if (this.field_q &&
              !sm.d(-18791)) {
              this.n((byte) -116);
            }
            if (this.field_S < 0) {
              var2_intLifetime3 = qi.field_a;
              if (var2_intLifetime3 == 83 &&
                var7 == 0) {
                if (!this.field_T) {
                  if (this.field_I.j(101).field_q == 1) {
                    return;
                  }
                  if (!this.b(1, 3, false)) {
                    return;
                  }
                  this.a((byte) 79);
                  return;
                }
                if (!this.b(1, 6, false)) {
                  return;
                }
                this.t(0);
                return;
              } else {
                if (var2_intLifetime3 != 59) {
                  return;
                }
              }
              if (!this.field_q &&
                this.field_bb &&
                vj.field_c[82] &&
                vj.field_c[86] &&
                vj.field_c[81]) {
                this.field_q = true;
                em.$cfr$intArgs$a$c9c3307e6488(118, false, 1, "Cheat mode enabled.");
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.TD(" + param0 + ')');
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            uf.c(true);
          }
          stackIn_10_0 = (em.field_K) || (hk.b(-126));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "uf.AC(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        RuntimeException var2_ref = null;
        ij var3 = null;
        ij var3Lifetime1;
        try {
          if (this.field_I.field_n > 1) {
            if (this.field_I.j(param0 + 14107).field_k != this.field_I.field_u.field_e) {
              if (((qe) (this.field_I.j(85).field_k)).field_L != this.field_I.field_A) {
                var2 = (qe) (this.field_I.j(53).field_k);
                if ((sg.field_O & var2.field_s) != 0) {
                  var3 = gj.a(true, 3, nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, gr.field_A), (String) null);
                  var3.field_q = qo.field_F;
                  var3.field_r = 5;
                }
                if (0 != (var2.field_s & nr.field_Y)) {
                  var3Lifetime1 = gj.a(true, 8, nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, uo.field_Ob), (String) null);
                  var3Lifetime1.field_q = df.field_f;
                  var3Lifetime1.field_r = 5;
                }
              } else {
                stackIn_13_0 = true;
                stackIn_13_1 = 3;
                if (this.field_I.field_z <= 0 &&
                  0 >= this.field_I.field_y) {
                  stackIn_16_2 = this.e(-30360, this.field_I.field_A);
                } else {
                  stackIn_16_2 = nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, vp.field_e);
                }
                gj.a(stackIn_13_0, stackIn_13_1, stackIn_16_2, (String) null);
              }
            } else {
              gj.a(true, 3, this.e(-30360, this.field_I.field_A), (String) null);
            }
          }
          if (param0 != -14034) {
            this.field_x = (kj[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.RA(" + param0 + ')');
        }
    }

    private final void y(byte param0) {
        int var4 = 0;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var3 = 50 / ((18 - param0) / 54);
          var2_int = this.field_I.field_f.a(-1);
          if (var2_int == -1) {
            return;
          }
          for (var4 = 0; this.field_I.field_l.length > var4; var4++) {
            if (this.field_I.field_l[var4].field_s) {
              if (~var2_int == ~this.field_I.field_f.b(var4, 30554)) {
                ji.field_b[var4] = 32;
              }
            } else {
              ji.field_b[var4] = 0;
              no.field_n[var4] = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LC(" + param0 + ')');
        }
    }

    private final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 82) {
            stackIn_2_0 = -58;
            return stackIn_2_0;
          }
          if (this.field_l <= 0) {
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          var2_int = -5 + il.field_f.field_w - 5;
          var3 = -7 + (il.field_f.field_y - 7);
          var4 = this.b(-16439) + 5;
          var5 = (-il.field_f.field_A + fl.field_q.field_ib >> 1) + 7;
          var6 = wn.field_i - var4;
          if (var6 >= 0 &&
            var2_int >= var6) {
            var7 = -var5 + gg.field_f;
            if (0 <= var7 &&
              var3 >= var7) {
              stackIn_19_0 = this.b(var3, -var7 + var3, (byte) 30);
              return stackIn_19_0;
            }
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.AA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int discarded$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var7_ref_StringLifetime1;
        String var7_ref_StringLifetime2;
        try {
          if (-no.field_q.field_A < fm.field_M) {
            bq.field_n.a(of.field_Ob, fm.field_M, 128);
            no.field_q.c(of.field_Ob, fm.field_M);
            var3 = this.field_I.j(109);
            if (0 > this.field_I.field_A) {
              stackIn_5_0 = var3.field_L;
            } else {
              stackIn_5_0 = this.field_I.field_A;
            }
            var4 = stackIn_5_0;
            var5 = this.e(-30360, var4);
            var6 = 16 + of.field_Ob;
            if (this.field_I.field_n <= 1) {
              tk.field_k.field_pb = false;
            } else {
              var6 = this.a(-30818, var6, no.field_q.field_y / 2 + fm.field_M, tk.field_k);
            }
            if (!this.x((byte) -102) &&
              !this.field_I.field_f.f(114) &&
              !(this.field_I.field_f instanceof rj)) {
              sa.field_h.d(var5, var6, tq.field_q, 16777215, 0);
              var6 = var6 + this.field_F[var4];
            } else {
              var7_ref_String = nr.a(new String[]{var5}, -1, this.H(2));
              sa.field_h.d(var7_ref_String, var6, tq.field_q, 16777215, 0);
              var6 = var6 + sa.field_h.b(var7_ref_String);
            }
            if (this.field_I.field_f.f(119)) {
              q.field_b.field_hb = this.field_I.field_f.b(var3, 1);
              var6 = this.a(-30818, var6, fm.field_M + no.field_q.field_y / 2, q.field_b);
            }
            if (this.field_I.field_f instanceof rj) {
              var7_ref_StringLifetime1 = Integer.toString(((rj) (this.field_I.field_f)).field_e[var4]);
              sa.field_h.d(var7_ref_StringLifetime1, var6, tq.field_q, 16777215, 0);
              var6 = var6 + sa.field_h.b(var7_ref_StringLifetime1);
            }
            if (this.field_I.field_o) {
              if (param1 ||
                23 == ne.field_w) {
                if (0 > this.field_I.field_A) {
                  var7_ref_StringLifetime2 = no.field_b;
                } else {
                  if ((hq.field_c & this.field_L) != 0) {
                    var8_int = this.field_I.field_f.b((byte) -121, this.field_I.field_f.c(-59, this.field_I.field_A));
                    if (se.a(false, var8_int) <= 1) {
                      if (this.field_I.field_A != this.field_db) {
                        var7_ref_StringLifetime2 = nr.a(new String[]{this.e(-30360, this.field_I.field_A)}, -1, ge.field_r);
                      } else {
                        var7_ref_StringLifetime2 = il.field_h;
                      }
                    } else {
                      var7_ref_StringLifetime2 = this.a(jq.field_h, ge.field_r, gk.field_jb, nf.field_db, (byte) 61, var8_int, sk.field_e, il.field_h);
                    }
                  } else {
                    if ((f.field_f & this.field_L) != 0) {
                      if (this.field_I.field_m) {
                        var7_ref_StringLifetime2 = bc.field_a + "<br>" + lh.b(this.field_o, (byte) -80);
                      } else {
                        var7_ref_StringLifetime2 = ql.field_b;
                      }
                    } else {
                      if ((sk.field_d & this.field_L) == 0) {
                        var7_ref_StringLifetime2 = nr.a(new String[]{this.field_I.field_h[this.field_I.field_A]}, -1, ge.field_r);
                      } else {
                        if ((var3.field_s & ag.field_e) == 0) {
                          var7_ref_StringLifetime2 = nd.field_g;
                        } else {
                          var7_ref_StringLifetime2 = il.field_h;
                        }
                      }
                    }
                  }
                }
                if (sa.field_v != var7_ref_StringLifetime2 &&
                  !var7_ref_StringLifetime2.equals(sa.field_v)) {
                  sa.field_v = var7_ref_StringLifetime2;
                  ig.field_i = ic.a(1, param0, 320, var7_ref_StringLifetime2, 4);
                }
                ig.field_i.c(qh.field_l - ig.field_i.field_z >> 1, 80);
                if ((f.field_f & this.field_L) == 0) {
                  sa.field_h.a(nf.field_Z, bi.field_d);
                  sa.field_h.b(fl.field_m, qh.field_l >> 1, 150, 16777215, 0);
                }
              }
            } else {
              if (var4 >= 0) {
                discarded$0 = this.a(var6, no.field_q.field_y / 2 + fm.field_M, (byte) -51);
              }
            }
            if (-1 != this.field_I.field_q ||
              (f.field_f & this.field_L) != 0) {
              stackIn_81_0 = ((this.field_L & f.field_f) != 0) ? 0 : 49;
              var7 = (stackIn_81_0 + this.field_o) / 50;
              var9 = -1;
              if ((this.field_L & f.field_f) == 0) {
                var8 = Integer.toString(var7);
                if (this.field_o > 1 &&
                  this.field_o < 250 &&
                  this.field_I.j(72).field_q == 0) {
                  var9 = (-250 + this.field_o << 14) / 50;
                }
              } else {
                var10 = 150;
                var11 = this.field_v + 750;
                if (-1 != this.field_v &&
                  var10 > this.field_o - var11) {
                  var9 = (-var11 + this.field_o << 14) / 50;
                  var12 = this.field_v + (this.field_o - this.field_v) * (this.field_o - var11) / var10;
                  var7 = (var12 + 49) / 50;
                }
                if (var7 < 3600) {
                  var8 = ek.a(var7 / 60, var7 % 60, 10);
                } else {
                  var8 = p.a(var7 / 60 % 60, var7 % 60, 45, var7 / 60 / 60);
                }
              }
              var8 = nr.a(new String[]{var8}, -1, p.field_n);
              if (var9 == -1) {
                sa.field_h.d(var8, vk.field_H + 4, tq.field_q, 16777215, 0);
              } else {
                sa.field_h.b(var8, 4 + vk.field_H, tq.field_q, 16777215, 0, (o.a(var9, (byte) -64) >> 11) + 191);
              }
            }
            of.a(353, false, (no.field_q.field_y >> 1) + fm.field_M);
          }
          this.b(param0);
          if ((hq.field_c & this.field_L) != 0 &&
            lc.field_U != null) {
            lc.field_U.a((byte) -79, false);
          }
          if (!param0) {
            field_y = (byte[][]) null;
          }
          this.B(32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.HC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void A(byte param0) {
        int var5_int = 0;
        int var7 = 0;
        float[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        try {
          var2 = new float[640];
          var3 = mj.a(-31121);
          var4 = mj.a(-31121);
          for (var5_int = 0; var5_int < 640; var5_int++) {
            if (Float.isNaN(var2[var5_int])) {
              var2[var5_int] = 0.0f;
            }
            var3[2] = var5_int * 9216 / 640;
            ma.a(2, var3, var4);
            var2[var5_int] = (float)mn.field_g;
          }
          sa.field_h.d("audio falloff start=" + re.field_a + " speed=" + k.a((long)ap.field_G, 3, true, 8) + " (" + ap.field_G + ")" + ", slope=" + ue.field_e, 10, 50, 65280, 3355443);
          qh.d(0, 440, 0, 445, 65280);
          sa.field_h.d("camera", 1, 460, 65280, 1);
          qh.d(qh.field_l / 2, 440, qh.field_l / 2, 445, 65280);
          sa.field_h.b("table length dist", qh.field_l / 2, 460, 65280, 1);
          qh.d(-1 + qh.field_l, 440, qh.field_l - 1, 445, 65280);
          sa.field_h.c("2x table length dist", -1 + qh.field_l, 460, 65280, 1);
          var5 = -16.0f;
          var6 = 300.0f;
          for (var7 = 1; var7 < 640; var7++) {
            qh.d(var7 - 1, -(int)((-var5 + var2[-1 + var7]) * 480.0f / (-var5 + var6)) + 479, var7, 479 - (int)((var2[var7] - var5) * 480.0f / (var6 - var5)), 65280);
          }
          if (param0 < 43) {
            this.field_N = 27;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.FB(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -43) {
            this.field_S = 64;
          }
          if (al.field_B[param0] != dq.field_a) {
            dq.field_a.e(-26707);
            dq.field_a = al.field_B[param0];
            dq.field_a.a(2147483647, this.field_I);
            this.K(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.CB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_f = -56;
          }
          if (~this.field_G.field_d == ~param2 &&
            this.field_G.field_e == param1) {
            return true;
          }
          var4 = this.a(param1, param2, this.field_G.field_k, this.field_Q, (byte) 95, this.field_G.field_h);
          if (null == var4) {
            this.m(93);
            return false;
          }
          this.field_G.field_d = param2;
          this.field_G.field_k = var4[0];
          this.field_G.field_e = var4[2];
          this.field_G.field_d = var4[1];
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.WC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String H(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (gj.field_S != 2) {
            stackIn_7_0 = vl.field_r;
          } else {
            stackIn_7_0 = rc.field_g;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.LB(" + param0 + ')');
        }
    }

    private final boolean h(int param0) {
        double stackIn_71_0 = 0.0;
        int stackIn_72_1 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        double var5 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5_intLifetime1;
        double var5Lifetime1;
        int var4Lifetime2;
        var9 = Pool.field_O;
        try {
          if (0 != this.field_t) {
            if (this.a(9587, cd.field_b, true) != this.field_t) {
              this.field_t = 0;
              if (var9 != 0) {
                this.field_t = this.a(param0 ^ 10487, ne.field_s, false);
              }
            }
          } else {
            this.field_t = this.a(param0 ^ 10487, ne.field_s, false);
          }
          if (this.field_t != 0) {
            var2_int = this.field_o;
            var3 = var2_int;
            var4 = var3 + dk.field_f;
            var5_int = var4 % 7621;
            var6 = var4 / 7621;
            var4Lifetime2 = var5_int + 7621 * ((4 + var6) % 31676);
            dk.field_f = var4Lifetime2 - var3;
            wq.field_c = wq.field_c & -65536 | ((wq.field_c & 65535) + 4) % 31676;
          }
          var2_intLifetime1 = 0;
          if (param0 != 3460) {
            field_hb = -62;
          }
          boolean decompiledFrameRemainder3 = true;
          if (this.field_N != -1 &&
            this.field_k != -1) {
            boolean decompiledFrameRemainder2 = true;
            var5_intLifetime1 = this.field_t;
            if (var5_intLifetime1 != 2 ||
              var9 != 0) {
              if (var5_intLifetime1 == 1 &&
                var9 == 0) {
                if ((this.field_N != wn.field_i ||
                  gg.field_f != this.field_k) &&
                  this.b(1, 0, false)) {
                  this.field_R = -1;
                  var5 = this.field_eb.a(true);
                  var7 = this.field_eb.a((byte) 116);
                  if (this.field_k != gg.field_f) {
                    stackIn_71_0 = var7;
                    if (th.field_h) {
                      stackIn_72_1 = -(this.field_k - gg.field_f);
                    } else {
                      stackIn_72_1 = -gg.field_f + this.field_k;
                    }
                    var7 = stackIn_71_0 + (double)stackIn_72_1 * 3.141592653589793 / 2.0 / 480.0;
                  }
                  if (~wn.field_i != ~this.field_N) {
                    var5 = var5 + 3.141592653589793 * (double)((wn.field_i - this.field_N) * 2) / 640.0;
                  }
                  this.field_eb.a(var7, 1, var5);
                  this.field_O.a(144, this.field_eb);
                  this.field_D = true;
                  this.field_M = -1;
                }
                var2_intLifetime1 = 1;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (4 == var5_intLifetime1 &&
                  var9 == 0) {
                  this.field_R = -1;
                  var2_intLifetime1 = 1;
                  this.b((byte) 86, this.field_k - gg.field_f);
                  decompiledFrameRemainder3 = false;
                } else {
                  if ((3 != var5_intLifetime1) &&
                    (decompiledFrameRemainder3 = (var5_intLifetime1 == 5))) {
                    decompiledFrameRemainder1 = (var9 != 0);
                    decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  boolean decompiledFrameRemainder0 = true;
                  var3Lifetime1 = -(-this.field_N + wn.field_i);
                  this.field_R = -1;
                  if (-20 > var3Lifetime1) {
                    var3Lifetime1 = 3 * (var3Lifetime1 + 20) - 30;
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (-10 > var3Lifetime1) {
                      var3Lifetime1 = -10 + 2 * (var3Lifetime1 + 10);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (var3Lifetime1 <= 20) {
                        if (10 < var3Lifetime1) {
                          var3Lifetime1 = (-20 + var3Lifetime1) * 3 + 30;
                          if (var9 != 0) {
                            var3Lifetime1 = var3Lifetime1 * 2 - 20 + 10;
                          }
                        }
                      } else {
                        var3Lifetime1 = var3Lifetime1 * 2 - 20 + 10;
                      }
                    }
                  }
                  if (this.field_N != wn.field_i) {
                    this.c(param0 ^ -3521, this.field_G.field_h + var3Lifetime1);
                  }
                  if (~this.field_k != ~gg.field_f) {
                    stackIn_105_1 = 512;
                    if (th.field_h) {
                      stackIn_106_2 = -(-gg.field_f + this.field_k);
                    } else {
                      stackIn_106_2 = -gg.field_f + this.field_k;
                    }
                    this.f(stackIn_105_1, stackIn_106_2);
                  }
                  var2_intLifetime1 = 1;
                  id.field_c.field_g = true;
                  hh.field_c = true;
                  decompiledFrameRemainder3 = (var9 != 0);
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  this.field_R = -1;
                  var4Lifetime1 = this.g((byte) 113);
                  if ((-1 != var4Lifetime1)) {
                    this.b(var4Lifetime1, true);
                    this.b(true, var4Lifetime1);
                  }
                }
              }
              if (decompiledFrameRemainder3) {
                decompiledFrameRemainder3 = !(decompiledFrameRemainder2);
              }
            }
            if (decompiledFrameRemainder3) {
              var2_intLifetime1 = 1;
              if ((~this.field_N != ~wn.field_i ||
                ~this.field_k != ~gg.field_f) && this.b(1, 1, false)) {
                this.field_R = -1;
                var5Lifetime1 = Math.max(12.0, this.field_eb.d(8) * ((double)(-this.field_k + gg.field_f) / 256.0 + 1.0));
                this.field_eb.a(true, var5Lifetime1);
                this.field_O.a(true, var5Lifetime1);
                this.field_M = -1;
                this.field_D = true;
              }
            }
          }
          if (0 == this.field_t) {
            this.field_k = -1;
            this.field_N = -1;
            return false;
          }
          if (var2_intLifetime1 == 0 ||
            this.field_N == -1 ||
            this.field_k == -1) {
            this.field_k = gg.field_f;
            this.field_N = wn.field_i;
            if (var9 != 0) {
              lg.field_s.a((java.awt.Component) ((Object) vj.a((byte) -54)), this.field_N, -80, this.field_k);
            }
          } else {
            lg.field_s.a((java.awt.Component) ((Object) vj.a((byte) -54)), this.field_N, -80, this.field_k);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EE(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = (int)Math.round((double)param2 * Math.pow((double)param0 / 4096.0, 0.5));
            return stackIn_4_0;
          }
          stackIn_2_0 = 124;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void p(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        pq var3 = null;
        or var4 = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        int var6_int = 0;
        long var6 = 0L;
        aa var7 = null;
        cr var8_ref_cr = null;
        long var8 = 0L;
        long var10 = 0L;
        int var12 = 0;
        int stackIn_87_0Lifetime1;
        int stackIn_87_1Lifetime1;
        int var5Lifetime1;
        var12 = Pool.field_O;
        try {
          var2_int = 0;
          while (true) {
            stackIn_3_0 = var2_int;
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_3_0 < this.field_I.field_l.length) {
              var3 = this.field_I.field_l[var2_int];
              var4 = var3.field_q;
              if (var12 != 0) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              if ((null != var4 ||
                var12 != 0) && !var4.field_c) {
                if (1 != var4.field_n) {
                  if (var4.field_n != 5) {
                    if ((0 == var4.field_n)) {
                      var5 = 2;
                      L9: while (true) {
                        var4 = var4.field_f;
                        if (null == var4) {
                          while (true) {
                            stackIn_26_0 = var5;
                            break L9;
                          }
                        }
                        stackIn_26_0 = var4.field_c ? 1 : 0;
                        while (true) {
                          if (stackIn_26_0 == 0 && (var4.a(-5877, this.field_I.field_c) ||
                            var12 != 0)) {
                            var5--;
                            if (var5 > 0) {
                              continue L9;
                            }
                          }
                          stackIn_26_0 = var5;
                          break;
                        }
                        break;
                      }
                      if (stackIn_26_0 == 0) {
                        if (!kh.field_gc.a(param0 ^ -657)) {
                          kh.field_gc.a(13, 128, (byte) 125, 128);
                        }
                        var3.field_q.field_c = true;
                        decompiledFrameRemainder2 = false;
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    var5_ref_qe = this.field_I.j(param0 ^ -704);
                    if (!this.field_I.field_f.a(var5_ref_qe.field_z, (byte) 125, var2_int)) {
                      kh.field_gc.a(14, 128, (byte) 99, 128);
                      var3.field_q.field_c = true;
                    } else {
                      var6_int = 0;
                      var7 = new aa(var5_ref_qe.field_m);
                      var8_ref_cr = (cr) (var7.b((byte) -92));
                      while (null != var8_ref_cr) {
                        stackIn_87_0 = var2_int;
                        stackIn_87_1 = var8_ref_cr.field_n;
                        if (stackIn_87_0 != stackIn_87_1 &&
                          this.field_I.field_f.a(var5_ref_qe.field_z, (byte) 124, var8_ref_cr.field_n)) {
                          var6_int = 1;
                        } else {
                          var8_ref_cr = (cr) (var7.b(param0 ^ 697));
                          continue;
                        }
                        break;
                      }
                      boolean decompiledFrameRemainder0 = true;
                      if (!var5_ref_qe.field_t) {
                        if (var6_int == 0) {
                          if (!(kh.field_gc.a(124))) {
                            kh.field_gc.a(11, 128, (byte) -112, 128);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          kh.field_gc.a(12, 128, (byte) -106, 128);
                        }
                      }
                      var3.field_q.field_c = true;
                    }
                    decompiledFrameRemainder2 = false;
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  var5Lifetime1 = 0;
                  while (!(this.field_I.field_w.length <= var5Lifetime1)) {
                    var6 = (long)(-this.field_I.field_w[var5Lifetime1].field_g + var3.field_g);
                    var8 = (long)(-this.field_I.field_w[var5Lifetime1].field_f + var3.field_k);
                    var10 = var6 * var6 + var8 * var8 >> 16;
                    stackIn_3_0 = $cfr$lcmp(~var10, -75759617L);
                    if (stackIn_3_0 > 0) {
                      kh.field_gc.a(13, 128, (byte) -101, 128);
                      var3.field_q.field_c = true;
                      var3.field_q = null;
                      break;
                    }
                    var5Lifetime1++;
                  }
                }
              }
              if (decompiledFrameRemainder2) {
                var2_int++;
                continue;
              }
            }
            stackIn_87_0Lifetime1 = param0;
            stackIn_87_1Lifetime1 = -709;
            if (stackIn_87_0Lifetime1 != stackIn_87_1Lifetime1) {
              this.k((byte) 81);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.R(" + param0 + ')');
        }
    }

    final void d(int param0, boolean param1) {
        int stackIn_53_0 = 0;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        an stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        an stackIn_96_0 = null;
        String stackIn_97_1 = null;
        int stackIn_154_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        int stackIn_183_3 = 0;
        int stackIn_187_4 = 0;
        int stackIn_190_0 = 0;
        int stackIn_190_1 = 0;
        int stackIn_190_2 = 0;
        int stackIn_191_3 = 0;
        int stackIn_195_4;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        float[] var3 = null;
        String var3_ref = null;
        long var3_long = 0L;
        aa var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int[] var4_ref_int__ = null;
        bf var4_ref_bf = null;
        int var4 = 0;
        qe var4_ref_qe = null;
        af var4_ref_af = null;
        int var5 = 0;
        qe var5_ref_qe = null;
        String var5_ref_String = null;
        int var6 = 0;
        pq var6_ref_pq = null;
        kj var6_ref_kj = null;
        tc var6_ref_tc = null;
        df var6_ref_df = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qe var4_ref_qeLifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var3_intLifetime5;
        int var3_intLifetime6;
        int var3_intLifetime7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var3_intLifetime8;
        int var5Lifetime7;
        int var6Lifetime4;
        int var7Lifetime5;
        int var8Lifetime5;
        int var9Lifetime3;
        int var10Lifetime3;
        try {
          if ((2L & pd.field_i) != 0L) {
            cl.a(16751001, param0 ^ 301, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{432.0f, 144.0f, 0.0f});
            cl.a(10092441, 1, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 288.0f, 0.0f});
            cl.a(10066431, 1, this.field_ab, new float[]{288.0f, 144.0f, 0.0f}, new float[]{288.0f, 144.0f, 144.0f});
          }
          if ((pd.field_i & 16L) != 0L &&
            !this.field_I.a(this.field_G.field_e, this.field_G.field_h, this.field_G.field_k, 359, this.field_Q, this.field_G.field_d)) {
            sa.field_h.b("cue intersects something!", 320, 240, 16764142, 1);
          }
          if ((8192L & pd.field_i) != 0L) {
            for (var3_int = 0; var3_int < this.field_I.field_c.length; var3_int++) {
              var4_ref_bf = this.field_I.field_c[var3_int];
              var5 = -this.field_ab[0] + (var4_ref_bf.field_a + var4_ref_bf.field_f >> 14);
              var6 = (var4_ref_bf.field_l + var4_ref_bf.field_j >> 14) - this.field_ab[1];
              var7 = -64 - this.field_ab[2];
              var8 = var6 * this.field_ab[10] + var5 * this.field_ab[9] + var7 * this.field_ab[11] >> 16;
              if (var8 > 0) {
                var9 = 320 + (this.field_ab[3] * var5 + (var6 * this.field_ab[4] + this.field_ab[5] * var7) >> 7) / var8;
                var10 = (var6 * this.field_ab[7] + (this.field_ab[6] * var5 + var7 * this.field_ab[8]) >> 7) / var8 + 240;
                if (qh.field_b < var9 &&
                  var9 < qh.field_j &&
                  var10 > qh.field_c &&
                  qh.field_g > var10) {
                  sa.field_h.b("wall " + var3_int, var9, var10, 16768409, 3355443);
                  qh.d(-4 + var9, var10, var9 + 4, var10, 16768409);
                  qh.d(var9, -4 + var10, var9, var10 + 4, 16768409);
                }
              }
            }
            for (var3_intLifetime8 = 0; var3_intLifetime8 < this.field_I.field_e.length; var3_intLifetime8++) {
              var4_ref_int__ = this.field_I.field_e[var3_intLifetime8];
              var5Lifetime7 = (var4_ref_int__[0] >> 13) - this.field_ab[0];
              var6Lifetime4 = -this.field_ab[1] + (var4_ref_int__[1] >> 13);
              var7Lifetime5 = -64 - this.field_ab[2];
              var8Lifetime5 = this.field_ab[11] * var7Lifetime5 + this.field_ab[10] * var6Lifetime4 + this.field_ab[9] * var5Lifetime7 >> 16;
              if (0 < var8Lifetime5) {
                var9Lifetime3 = (this.field_ab[4] * var6Lifetime4 + (this.field_ab[3] * var5Lifetime7 + this.field_ab[5] * var7Lifetime5) >> 7) / var8Lifetime5 + 320;
                var10Lifetime3 = 240 + (var5Lifetime7 * this.field_ab[6] + var6Lifetime4 * this.field_ab[7] + var7Lifetime5 * this.field_ab[8] >> 7) / var8Lifetime5;
                if (qh.field_b < var9Lifetime3 &&
                  qh.field_j > var9Lifetime3 &&
                  var10Lifetime3 > qh.field_c &&
                  var10Lifetime3 < qh.field_g) {
                  sa.field_h.d("point " + var3_intLifetime8, var9Lifetime3, var10Lifetime3, 14522879, 3355443);
                  qh.d(-4 + var9Lifetime3, var10Lifetime3, var9Lifetime3 + 4, var10Lifetime3, 16768409);
                  qh.d(var9Lifetime3, var10Lifetime3 - 4, var9Lifetime3, var10Lifetime3 + 4, 16768409);
                }
              }
            }
          }
          if ((8L & pd.field_i) != 0L) {
            var3 = new float[3];
            for (var4 = -1 + pd.field_f.length; var4 >= 0; var4--) {
              var5Lifetime1 = pd.field_f[var4];
              if (var5Lifetime1 < this.field_I.field_l.length) {
                var6_ref_pq = this.field_I.field_l[var5Lifetime1];
                var3[0] = (float)(var6_ref_pq.field_g / 8192);
                var3[2] = (float)(var6_ref_pq.field_j / 8192);
                var3[1] = (float)(var6_ref_pq.field_k / 8192);
                ag.a(this.field_ab, var3, param0 ^ 293);
                var7Lifetime1 = (int)(0.5f + var3[0]);
                var8Lifetime1 = (int)(0.5f + var3[1]);
                stackIn_53_0 = var8Lifetime1;
                stackIn_53_1 = new StringBuilder();
                if (var6_ref_pq.field_s) {
                  stackIn_54_2 = "in play: ";
                } else {
                  stackIn_54_2 = "potted: ";
                }
                er.a(stackIn_53_0, ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(var6_ref_pq.b(param0 - 12350)).toString(), var7Lifetime1, 1, sa.field_h, true, 11193599);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.field_w + sa.field_h.field_C);
                if (ap.field_D != null &&
                  ap.field_D[var5Lifetime1] != null) {
                  er.a(var8Lifetime1, "finished: " + ap.field_D[var5Lifetime1].field_o.i(), var7Lifetime1, 1, sa.field_h, true, 11193599);
                  var8Lifetime1 = var8Lifetime1 - (sa.field_h.field_C + sa.field_h.field_w);
                }
                er.a(var8Lifetime1, "@" + var6_ref_pq.field_g + "," + var6_ref_pq.field_k, var7Lifetime1, 1, sa.field_h, true, 65535);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.field_C + sa.field_h.field_w);
                er.a(var8Lifetime1, Integer.toString(var5Lifetime1), var7Lifetime1, 1, sa.field_h, true, 11193599);
                var8Lifetime1 = var8Lifetime1 - (sa.field_h.field_w + sa.field_h.field_C);
              }
            }
          }
          if (0L != (32768L & pd.field_i)) {
            sa.field_h.d(kh.field_gc.b((byte) 123), 10, 50, 16772795, 1);
            sa.field_h.d(kh.field_gc.c((byte) 32), 10, 70, 16772795, 1);
            cl.a(16772795, 1, this.field_ab, new float[]{rj.e(2304, 3), rj.e(1152, param0 - 297), 0.0f}, new float[]{rj.e(kh.field_gc.field_q + 2304, 3), rj.e(1152 + kh.field_gc.field_e, 3), rj.e(0 + kh.field_gc.field_u, 3)});
          }
          if ((pd.field_i & 4194304L) != 0L) {
            var3_ref = "extra_model_dist=" + hf.field_a + "; extra_model_dist_scatter=" + fl.field_l + "; extra_model_z=" + kh.field_vc + "; num_extra_models=" + ek.field_a;
            sa.field_h.d(var3_ref, 10, 70, 15650047, 1);
          }
          if ((pd.field_i & 65536L) != 0L) {
            sa.field_h.d("Generated balls: Segments=" + ne.field_v + ", slices=" + hr.field_b + ", polys/ball=" + ne.field_v * (hr.field_b * 2), 10, 70, 16772795, 1);
            var3_intLifetime1 = -sa.field_h.field_w + 480 - 4;
            for (var4Lifetime1 = 0; var4Lifetime1 < pd.field_f.length; var4Lifetime1++) {
              sa.field_h.d(var4Lifetime1 + ": " + pd.field_f[var4Lifetime1] + " dist=" + tc.field_d[var4Lifetime1], 300, var3_intLifetime1, 16772829, 0);
              var3_intLifetime1 = var3_intLifetime1 - 3 * sa.field_h.field_C / 2;
            }
          }
          if (param0 != 300) {
            this.b((byte) -76, 91);
          }
          if ((1L & pd.field_i) != 0L) {
            rk.a((byte) 114);
          }
          if (0L != (8192L & pd.field_i)) {
            var3_intLifetime2 = 476 - sa.field_h.field_w;
            sa.field_h.d("currentplayer " + this.field_I.field_A + ", extra shots " + this.field_I.field_z + ", extra visits " + this.field_I.field_y, 300, var3_intLifetime2, 16772829, 0);
            var3_intLifetime2 = var3_intLifetime2 - sa.field_h.field_C * 3 / 2;
          }
          if ((2L & pd.field_i) != 0L) {
            var3_intLifetime3 = -4 - sa.field_h.field_w + 480;
            sa.field_h.d("cur cam ang " + (int)(this.field_eb.a(true) * 180.0 / 3.141592653589793) + ", " + (int)(180.0 * this.field_eb.a((byte) 106) / 3.141592653589793) + ", dist " + this.field_eb.d(param0 ^ 292), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("drag " + this.field_t + ", prev=" + this.field_N + ", " + this.field_k, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("cur tgt " + this.field_eb.field_f / 576.0 + ", " + this.field_eb.field_m / 288.0 + ", " + (this.field_eb.field_k + 8.0) / 512.0, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.field_C * 3 / 2;
            sa.field_h.d("cur pos " + this.field_eb.field_d / 576.0 + ", " + this.field_eb.field_a / 288.0 + ", " + this.field_eb.field_h / 512.0, 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.field_C / 2;
            var4_ref_qe = new qe();
            var5_ref_qe = var4_ref_qe;
            var6_ref_kj = this.field_G;
            var5_ref_qe.field_V = (short)var6_ref_kj.field_n;
            var5_ref_qe.field_A = (short)var6_ref_kj.field_k;
            var5_ref_qe.field_H = (byte)var6_ref_kj.field_e;
            var5_ref_qe.field_D = (byte)var6_ref_kj.field_d;
            var5_ref_qe.field_C = (short)((var6_ref_kj.field_h + 1024) % 2048);
            sa.field_h.d(var4_ref_qe.e(param0 - 300), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.field_C * 3 / 2;
            sa.field_h.d("cue ang " + this.field_G.field_h + ", " + this.field_G.field_k + ", power " + this.field_Q + ", loc " + id.field_c.field_l[0] + ",  " + id.field_c.field_l[1] + ", " + id.field_c.field_l[2], 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - sa.field_h.field_C * 3 / 2;
            stackIn_88_0 = sa.field_h;
            stackIn_88_1 = new StringBuilder().append("shot_camera_strategy  ").append(this.field_Z);
            if (this.field_T) {
              stackIn_89_2 = " tracking";
            } else {
              stackIn_89_2 = "";
            }
            ((an) (Object) stackIn_88_0).d(((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).toString(), 300, var3_intLifetime3, 16772829, 0);
            var3_intLifetime3 = var3_intLifetime3 - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("camera_location " + this.field_M, 300, var3_intLifetime3, 16772829, 0);
          }
          if ((2048L & pd.field_i) != 0L) {
            stackIn_96_0 = sa.field_h;
            if (!this.field_kb) {
              stackIn_97_1 = "||";
            } else {
              stackIn_97_1 = "|>";
            }
            ((an) (Object) stackIn_96_0).d(stackIn_97_1, -(sa.field_h.field_C * 2) + 640, -10 + (480 + (-(2 * sa.field_h.field_w) - sa.field_h.field_C)), 16777215, 1);
          }
          if ((128L & pd.field_i) != 0L) {
            this.h((byte) -28);
          }
          if ((16777216L & pd.field_i) != 0L) {
            if (tl.field_N.d(-11414)) {
              var3_long = tl.field_N.c((byte) -93);
              var5Lifetime2 = (int)(var3_long / 1000L);
              var6Lifetime1 = var5Lifetime2 / 1000;
              var5Lifetime2 = var5Lifetime2 % 1000;
              var7Lifetime2 = var6Lifetime1 / 60;
              sa.field_h.d("midip: ", 10, 380, 13421823, 1118515);
              var6Lifetime1 = var6Lifetime1 % 60;
              sa.field_h.c(Integer.toString(var7Lifetime2), 68, 380, 13421823, 1118515);
              sa.field_h.c(Integer.toString(var6Lifetime1), 85, 380, 13421823, 1118515);
              sa.field_h.c(Integer.toString(var5Lifetime2), 110, 380, 13421823, 1118515);
            } else {
              sa.field_h.d("midip: stopped", 10, 380, 13421823, 1118515);
            }
          }
          if ((1048576L & pd.field_i) != 0L) {
            var3_intLifetime4 = 320;
            var4Lifetime2 = 40;
            for (var5Lifetime3 = 0; this.field_I.field_w.length > var5Lifetime3; var5Lifetime3++) {
              var6_ref_tc = this.field_I.field_w[var5Lifetime3].field_c;
              if (null != var6_ref_tc &&
                var6_ref_tc.a((byte) 122) > 0) {
                var7_ref_String = "pocket " + var5Lifetime3 + ": " + var6_ref_tc.a(0, 2229);
                for (var8Lifetime2 = 1; var6_ref_tc.a((byte) 112) > var8Lifetime2; var8Lifetime2++) {
                  var7_ref_String = var7_ref_String + ", " + var6_ref_tc.a(var8Lifetime2, param0 + 1929);
                }
                sa.field_h.d(var7_ref_String, var3_intLifetime4, var4Lifetime2, 10066329, 8947848);
                var4Lifetime2 = var4Lifetime2 + sa.field_h.field_G;
              }
            }
          }
          if ((67108864L & pd.field_i) != 0L) {
            var3_intLifetime5 = 60;
            var4Lifetime3 = 0;
            while (!(qh.field_f <= var3_intLifetime5)) {
              if (md.field_a.length <= var4Lifetime3) {
                break;
              }
              var5_ref_String = md.field_a[var4Lifetime3];
              if (fe.a(oa.field_g, -13671, var4Lifetime3)) {
                var5_ref_String = var5_ref_String + " [all]";
              }
              if (fe.a(hp.field_c, -13671, var4Lifetime3)) {
                var5_ref_String = var5_ref_String + " [this game]";
              }
              if (md.field_a[var4Lifetime3] != var5_ref_String) {
                sa.field_h.d(var5_ref_String, 40, var3_intLifetime5, 16764074, 1);
                var3_intLifetime5 = var3_intLifetime5 + sa.field_h.field_G;
              }
              var4Lifetime3++;
            }
          }
          if ((134217728L & pd.field_i) != 0L) {
            var3_ref2 = new aa(this.field_I.field_u);
            var4_ref_qeLifetime1 = (qe) (var3_ref2.b((byte) -92));
            var5Lifetime4 = 0;
            var6Lifetime2 = 0;
            var7Lifetime3 = 60;
            var8Lifetime3 = 40;
            var9Lifetime1 = 80;
            while (qh.field_f > var7Lifetime3) {
              if (null != var4_ref_qeLifetime1) {
                if (null != var4_ref_qeLifetime1.field_U) {
                  var10Lifetime1 = 0;
                  stackIn_154_0 = ((1 & var4_ref_qeLifetime1.field_L) != 0) ? var9Lifetime1 : var8Lifetime3;
                  var11 = stackIn_154_0;
                  for (var12 = 0; var12 < var4_ref_qeLifetime1.field_U.length; var12++) {
                    var13 = "+" + var4_ref_qeLifetime1.field_U[var12];
                    sa.field_h.d(var13, var11, var7Lifetime3, 16777215, 1);
                    var11 = var11 + sa.field_h.b(var13);
                    var10Lifetime1 = var10Lifetime1 + var4_ref_qeLifetime1.field_U[var12];
                  }
                  sa.field_h.d(" =" + var10Lifetime1, var11, var7Lifetime3, 16764074, 1);
                  if ((1 & var4_ref_qeLifetime1.field_L) == 0) {
                    var5Lifetime4 = var5Lifetime4 + var10Lifetime1;
                  } else {
                    var6Lifetime2 = var6Lifetime2 + var10Lifetime1;
                  }
                  var7Lifetime3 = var7Lifetime3 + sa.field_h.field_G;
                }
                var4_ref_qeLifetime1 = (qe) (var3_ref2.b(-96));
                continue;
              }
              break;
            }
            sa.field_h.d("p1=" + var5Lifetime4, var8Lifetime3, var7Lifetime3, 16764074, 1);
            sa.field_h.d("p2=" + var6Lifetime2, var9Lifetime1, var7Lifetime3, 16764074, 1);
            var7Lifetime3 = var7Lifetime3 + sa.field_h.field_G;
          }
          if ((pd.field_i & 262144L) != 0L &&
            pq.field_i != null) {
            dn.a(0, param0 + 30109, 3, pq.field_i);
          }
          if ((pd.field_i & 16777216L) != 0L) {
            this.A((byte) 95);
          }
          if ((8388608L & pd.field_i) != 0L) {
            this.field_I.e(12226, 0);
            var3_intLifetime6 = this.field_I.field_l[0].field_g >> 13;
            var4Lifetime4 = this.field_I.field_l[0].field_k >> 13;
            for (var5Lifetime5 = 1; this.field_I.field_r.length > var5Lifetime5; var5Lifetime5++) {
              var6_ref_df = this.field_I.field_r[var5Lifetime5];
              if (var6_ref_df.a((byte) -8, 0, this.field_I)) {
                stackIn_182_0 = param0 - 293;
                stackIn_182_1 = var4Lifetime4;
                stackIn_182_2 = -64;
                if (var6_ref_df.field_j) {
                  stackIn_183_3 = 255;
                } else {
                  stackIn_183_3 = 64;
                }
                if (var6_ref_df.field_h) {
                  stackIn_187_4 = 16727871;
                } else {
                  stackIn_187_4 = 4145151;
                }
                co.a(stackIn_182_0, stackIn_182_1, stackIn_182_2, stackIn_183_3, stackIn_187_4, this.field_ab, var3_intLifetime6 + (o.a(var6_ref_df.field_k, (byte) -120) * (var6_ref_df.field_l >> 13) >> 16), -64, (af.c((byte) -128, var6_ref_df.field_k) * (var6_ref_df.field_l >> 13) >> 16) + var4Lifetime4, var3_intLifetime6);
                stackIn_190_0 = 7;
                stackIn_190_1 = var4Lifetime4;
                stackIn_190_2 = -64;
                if (!var6_ref_df.field_j) {
                  stackIn_191_3 = 64;
                } else {
                  stackIn_191_3 = 255;
                }
                if (var6_ref_df.field_h) {
                  stackIn_195_4 = 16744255;
                } else {
                  stackIn_195_4 = 4161535;
                }
                co.a(stackIn_190_0, stackIn_190_1, stackIn_190_2, stackIn_191_3, stackIn_195_4, this.field_ab, (o.a(var6_ref_df.field_d, (byte) 92) * (var6_ref_df.field_l >> 13) >> 16) + var3_intLifetime6, -64, var4Lifetime4 + (af.c((byte) -128, var6_ref_df.field_d) * (var6_ref_df.field_l >> 13) >> 16), var3_intLifetime6);
              }
            }
          }
          if ((pd.field_i & 536870912L) != 0L) {
            var3_intLifetime7 = 480 - sa.field_h.field_w - 4;
            if (this.field_I.field_f instanceof af) {
              var4_ref_af = (af) (this.field_I.field_f);
              sa.field_h.d("groups allocations: {" + var4_ref_af.field_g[0] + ", " + var4_ref_af.field_g[1] + "}", 300, var3_intLifetime7, 16772829, 0);
              var3_intLifetime7 = var3_intLifetime7 - sa.field_h.field_C * 3 / 2;
            }
            sa.field_h.d("shot mode: " + this.field_T, 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - 3 * sa.field_h.field_C / 2;
            sa.field_h.d("ruleset: " + this.field_I.field_f.getClass().getName(), 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - sa.field_h.field_C * 3 / 2;
            sa.field_h.d("cg.currentplayer: " + this.field_I.field_A, 300, var3_intLifetime7, 16772829, 0);
            var3_intLifetime7 = var3_intLifetime7 - 3 * sa.field_h.field_C / 2;
            var4Lifetime5 = 0;
            var5Lifetime6 = 0;
            var6Lifetime3 = 3456;
            var7Lifetime4 = 1152;
            for (var8Lifetime4 = 0; var8Lifetime4 < 2000; var8Lifetime4++) {
              var4Lifetime5 += 2048;
              if (var4Lifetime5 >= 262144) {
                var5Lifetime6 = var5Lifetime6 + dn.a(67108864 / (var4Lifetime5 >> 8), false);
              } else {
                var5Lifetime6 += 256;
              }
              var5Lifetime6 = var5Lifetime6 % 4096;
              var9Lifetime2 = (af.c((byte) -123, var5Lifetime6) >> 4) * (var4Lifetime5 >> 12);
              var10Lifetime2 = (o.a(var5Lifetime6, (byte) -67) >> 4) * (var4Lifetime5 >> 12);
              var11Lifetime1 = 3456 + (var9Lifetime2 >> 13);
              var12Lifetime1 = 1152 + (var10Lifetime2 >> 13);
              bb.a(var12Lifetime1, this.field_ab, var6Lifetime3, -28361, 13408614, var11Lifetime1, var7Lifetime4, 0, 0);
              cd.a(var11Lifetime1, var12Lifetime1, this.field_ab, 16764057, 10521, 0);
              var7Lifetime4 = var12Lifetime1;
              var6Lifetime3 = var11Lifetime1;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref3), "uf.AE(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_M = -1;
          this.field_O.a(this, 1);
          if (param0 != 117) {
            this.a(false, (byte) 49);
          }
          this.field_D = true;
          this.field_O.a(true, 1.0);
          this.field_T = true;
          uo.c(false);
          this.field_G.field_n = this.field_Q;
          this.field_R = -1;
          kh.field_gc.a(9, 256, (byte) -112, 128);
          kh.field_gc.b(-50, this.field_G.field_n);
          this.field_h = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.M(" + param0 + ')');
        }
    }

    final void a(int param0, String[] param1, hq param2) {
        pq[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        al var4 = null;
        RuntimeException var4_ref = null;
        al var5 = null;
        int var6 = 0;
        int var6Lifetime1;
        try {
          un.a(676);
          vi.a(-7414);
          this.field_c = param2;
          this.field_S = 200;
          this.field_c.field_a = this;
          this.a(param1, this.field_c.field_n, -115, -1);
          this.c((byte) -121);
          var4 = this.field_I;
          f.field_g = 12;
          var5 = var4;
          pq.field_B = new pq[12][];
          for (var6 = 0; var6 < pq.field_B.length; var6++) {
            array$0 = new pq[var5.field_l.length];
            pq.field_B[var6] = array$0;
            for (var7 = 0; var7 < pq.field_B[var6].length; var7++) {
              pq.field_B[var6][var7] = new pq();
            }
          }
          rb.field_e = new ar[pq.field_B.length * 12];
          if (param0 <= 25) {
            return;
          }
          for (var6Lifetime1 = 0; rb.field_e.length > var6Lifetime1; var6Lifetime1++) {
            rb.field_e[var6Lifetime1] = new ar();
          }
          wh.field_g = 0;
          this.c(0, 0, 126);
          this.field_c.a(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("uf.UC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var7Lifetime1;
        try {
          var2_long = 0L;
          var4 = 0L;
          var6 = 0;
          for (var7 = 0; this.field_I.field_l.length > var7; var7++) {
            if (this.field_I.field_l[var7].field_s &&
              this.field_I.field_l[var7].field_v != 0) {
              var2_long = var2_long + (long)this.field_I.field_l[var7].field_g;
              var4 = var4 + (long)this.field_I.field_l[var7].field_k;
              var6++;
            }
          }
          var7Lifetime1 = 45 % ((-21 - param0) / 58);
          this.field_R = -1;
          this.field_O.field_f = cr.a((byte) 89, var2_long) / (double)var6;
          this.field_O.field_m = cr.a((byte) 89, var4) / (double)var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.IC(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ij.field_G > 0) {
            if (ij.field_G > 25) {
              uo.c(false);
              ui.a(tn.field_p, 16729156, -6, false, 1);
              vj.a((String) null, (byte) 18, jd.field_f, 7);
            }
            ij.field_G = ij.field_G - 1;
            if (ij.field_G == 0) {
              qg.a((byte) 48, 7);
            }
          }
          if (param0 != -47) {
            this.c(-48, (ge) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.KC(" + param0 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          id.field_c.field_g = true;
          if (param0 != 0) {
            this.field_Q = -11;
          }
          hh.field_c = true;
          this.field_I.c(param0 ^ -88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.OA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ij.field_G < 50) {
            ij.field_G = ij.field_G + 2;
          }
          if (param0 <= 88) {
            this.f((byte) 65);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.BC(" + param0 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          tk.field_k = new vh();
          q.field_b = new vh();
          b.field_H = new vh();
          qo.field_F = new vh();
          df.field_f = new vh();
          ub.field_q = new vh();
          this.e(false);
          q.field_b.field_hb = mf.field_n;
          b.field_H.field_hb = iq.field_d;
          qo.field_F.field_hb = gd.field_e;
          df.field_f.field_hb = il.field_a;
          ub.field_q.field_hb = oo.field_D;
          if (kh.field_gc != nn.field_b[param1]) {
            if (null != kh.field_gc) {
              kh.field_gc.d(true);
            }
            kh.field_gc = nn.field_b[param1];
            kh.field_gc.a(this.field_I, 21894);
          }
          kh.field_gc.b(this.field_I, 0);
          kh.field_gc.b(false);
          if (al.field_B[param0] == dq.field_a) {
            if (dq.field_a.field_j == null ||
              dq.field_a.field_j.length != this.field_I.field_l.length) {
              dq.field_a.a(2147483647, this.field_I);
            }
          } else {
            if (dq.field_a != null) {
              dq.field_a.e(-26707);
            }
            dq.field_a = al.field_B[param0];
            dq.field_a.a(2147483647, this.field_I);
          }
          id.field_c = kh.field_gc.field_A;
          id.field_c.field_g = true;
          kh.field_gc.a((byte) -116, this.field_ab);
          this.field_I.field_f.c(-83);
          for (var4_int = 0; this.field_I.field_l.length > var4_int; var4_int++) {
            this.field_I.field_l[var4_int].a(120);
            this.field_I.field_l[var4_int].field_p = true;
          }
          am.field_q = 150;
          ff.field_c = true;
          this.field_g = -1;
          id.field_c.field_g = true;
          hh.field_c = true;
          wb.field_a = true;
          if (param2 <= 70) {
            this.field_eb = (mm) null;
          }
          this.field_p = -1;
          this.field_D = true;
          aq.b(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.CC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String d(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder stackIn_25_0 = null;
        String stackIn_29_1 = null;
        String stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        try {
          if (param1 != -22804) {
            this.field_T = true;
          }
          var3 = new StringBuilder(this.e(-30360, param0));
          var4 = 0;
          if (!(this.field_I.field_f instanceof rj)) {
            if ((this.field_I.field_p & 1 << param0) != 0) {
              if (var4 != 0) {
                discarded$0 = var3.append(' ');
              } else {
                var4 = 1;
                var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, -1, this.H(2)));
              }
              discarded$1 = var3.append(n.field_Q);
            }
          } else {
            var5 = ((rj) (this.field_I.field_f)).field_e[param0];
            if (var4 != 0) {
              discarded$2 = var3.append(' ');
            } else {
              var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, -1, this.H(2)));
              var4 = 1;
            }
            if (1 >= var5) {
              discarded$3 = var3.append("<col=ff9999>");
            } else {
              if (var5 == 2) {
                discarded$4 = var3.append("<col=ffff99>");
              } else {
                if (3 == var5) {
                  discarded$5 = var3.append("<col=99ff99>");
                } else {
                  if (var5 > 3) {
                    discarded$6 = var3.append("<col=99ffff>");
                  }
                }
              }
            }
            stackIn_25_0 = var3;
            if (this.field_I.field_f.a((byte) 50, param0)) {
              if ((this.field_I.field_p & 1 << param0) != 0) {
                stackIn_29_1 = n.field_Q;
              } else {
                stackIn_29_1 = Integer.toString(var5);
              }
            } else {
              stackIn_29_1 = rg.field_l;
            }
            discarded$7 = ((StringBuilder) (Object) stackIn_25_0).append(stackIn_29_1);
            discarded$8 = var3.append("</col>");
          }
          if (this.field_I.field_o &&
            (1 << param0 & this.field_I.field_b) != 0) {
            if (var4 != 0) {
              discarded$9 = var3.append(' ');
            } else {
              var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, param1 + 22803, this.H(2)));
              var4 = 1;
            }
            discarded$10 = var3.append(ge.field_n);
          } else {
            if ((this.field_I.field_x & 1 << param0) != 0) {
              if (var4 == 0) {
                var3 = new StringBuilder(nr.a(new String[]{var3.toString()}, param1 ^ 22803, this.H(param1 + 22806)));
                var4 = 1;
              } else {
                discarded$11 = var3.append(' ');
              }
              discarded$12 = var3.append(sh.field_R);
            }
          }
          stackIn_56_0 = var3.toString();
          return stackIn_56_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.VD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          id.field_c.field_g = true;
          hh.field_c = true;
          this.field_I.b(param0, 456);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.FD(" + param0 + ',' + param1 + ')');
        }
    }

    private final void w(byte param0) {
        RuntimeException decompiledCaughtException = null;
        pq var2 = null;
        RuntimeException var2_ref = null;
        double[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        al var7 = null;
        pq var8 = null;
        try {
          if (param0 < 106) {
            field_X = 61;
          }
          var2 = this.field_I.field_l[this.field_V];
          if (~wn.field_i == ~vn.field_b &&
            up.field_m == gg.field_f) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var3 = new double[]{(double)var2.field_g / 65536.0, (double)var2.field_k / 65536.0, (double)var2.field_j / 65536.0};
          rq.a(-64, gg.field_f, false, this.field_eb.d(8), wn.field_i, var3, this.field_ab);
          var4 = var2.field_g;
          var5 = var2.field_k;
          if (this.field_I.a((int)(65536.0 * var3[1] + 0.5), (int)(65536.0 * var3[0] + 0.5), -96, this.field_V, true)) {
            vm.field_f = vm.field_f | this.field_V;
            if (!this.b(1, 13, false)) {
              var2.field_g = var4;
              var2.field_k = var5;
              decompiledFrameRemainder0 = (Pool.field_O != 0);
            }
            if (decompiledFrameRemainder0) {
              var2.field_p = true;
              hh.field_c = true;
              var2.field_j = -524288;
              this.field_Y = true;
              if (this.field_V == 0) {
                id.field_c.field_g = true;
              }
              var6 = this.field_I.j(83);
              var7 = this.field_I;
              var8 = var7.field_l[0];
              var6.field_Q = var8.field_k;
              var6.field_P = var8.field_g;
            }
          }
          vn.field_b = wn.field_i;
          up.field_m = gg.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.BE(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < nn.field_b.length &&
            kh.field_gc != nn.field_b[param1]) {
            dq.field_a.e(param0 - 26831);
            kh.field_gc.d(true);
            kh.field_gc = nn.field_b[param1];
            id.field_c = kh.field_gc.field_A;
            id.field_c.field_g = true;
            dq.field_a = al.field_B[param1];
            dq.field_a.a(2147483647, this.field_I);
            kh.field_gc.a(this.field_I, 21894);
            kh.field_gc.a((byte) 115, this.field_ab);
            this.field_I.field_f.c(-42);
          }
          if (param0 != 124) {
            this.field_i = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.SD(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~(this.field_L & hq.field_c) != param0) {
            stackIn_7_0 = (this.field_db == this.field_I.field_A);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.TC(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0) {
            this.field_I = (al) null;
          }
          var2 = new float[]{(float)this.field_I.field_l[0].field_g / 65536.0f, (float)this.field_I.field_l[0].field_k / 65536.0f, (float)this.field_I.field_l[0].field_j / 65536.0f};
          var3 = (float)this.field_G.field_d / 128.0f;
          var4 = (float)this.field_G.field_e / 128.0f;
          var5 = (float)Math.sqrt((double)(-(var3 * var3) + 1.0f - var4 * var4));
          var2[1] = var2[1] + 8.0f * (var5 * (float)id.field_c.field_l[10] + ((float)id.field_c.field_l[7] * var4 + var3 * (float)id.field_c.field_l[4])) / 65536.0f;
          var2[0] = var2[0] + 8.0f * (var5 * (float)id.field_c.field_l[9] + (var3 * (float)id.field_c.field_l[3] + var4 * (float)id.field_c.field_l[6])) / 65536.0f;
          var2[2] = var2[2] + 8.0f * (var4 * (float)id.field_c.field_l[8] + var3 * (float)id.field_c.field_l[5] + (float)id.field_c.field_l[11] * var5) / 65536.0f;
          if (this.field_T) {
            hr.a(var2, 16724787, -114, this.field_ab);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.WA(" + param0 + ')');
        }
    }

    final void K(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          for (var2_int = param0; this.field_I.field_l.length > var2_int; var2_int++) {
            this.field_I.field_l[var2_int].field_p = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.V(" + param0 + ')');
        }
    }

    private final void m(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pq var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_54_0Lifetime1;
        int var7Lifetime1;
        var10 = Pool.field_O;
        try {
          var2_int = -240 + this.field_U << 16;
          if (param0 < 112) {
            this.w(-58);
          }
          var3 = 240 - (fl.field_q.field_ib >> 1);
          var4 = -var3 + this.field_U;
          var5 = this.field_P - var3;
          boolean decompiledSharedTail0 = (!(var5 <= gg.field_f) ||
            !(gg.field_f <= var4) ||
            !(wn.field_i < this.field_n));
          if (!decompiledSharedTail0) {
            ff.field_c = true;
            am.field_q = 150;
            decompiledSharedTail0 = (var10 != 0);
          }
          if ((decompiledSharedTail0) &&
            (am.field_q > 0)) {
            fieldTemp$0 = am.field_q - 1;
            am.field_q = am.field_q - 1;
            if (fieldTemp$0 == 0) {
              ff.field_c = false;
            }
          }
          if (!ff.field_c ||
            !(t.field_e < 0)) {
            if ((!ff.field_c) &&
              (!(-this.field_n >= t.field_e))) {
              t.field_e = t.field_e - 1;
              if (var10 != 0) {
                t.field_e = t.field_e + 2;
              }
            }
          } else {
            t.field_e = t.field_e + 2;
          }
          var6 = 0;
          while (this.field_C > var6) {
            var7 = this.field_ib[var6];
            if (var10 != 0) {
              return;
            }
            var8 = this.field_I.field_l[var7];
            L9: while (true) {
              if (var8.field_s) {
                var8.field_o = false;
                var8.d((byte) 87);
                stackIn_54_0 = 1 + var6;
                var9 = stackIn_54_0;
                while (var9 < this.field_C) {
                  this.field_ib[var9 - 1] = this.field_ib[var9];
                  var9++;
                }
                this.field_C = this.field_C - 1;
                if (~this.field_C == ~var6) {
                  return;
                }
                var7Lifetime1 = this.field_ib[var6];
                var8 = this.field_I.field_l[var7Lifetime1];
                continue L9;
              }
              break;
            }
            var8.field_p = true;
            stackIn_54_0Lifetime1 = var8.field_v;
            if (stackIn_54_0Lifetime1 != 0 ||
              !(var8.field_k >= var2_int)) {
              if (var8.field_t < 262144) {
                var8.field_t = var8.field_t + 4096;
                if (var8.field_v == 0) {
                  var8.field_v = 1;
                }
              }
              var8.a((byte) -124);
              var8.field_w = 0;
              var8.a(false);
            }
            if (var2_int <= var8.field_k) {
              var8.field_k = var2_int;
              var8.d((byte) 102);
            } else {
              var2_int = var8.field_k;
            }
            var2_int = var2_int - 1048576;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.UB(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_J = null;
          field_y = (byte[][]) null;
          field_K = null;
          field_gb = null;
          if (!param0) {
            field_y = (byte[][]) null;
          }
          field_s = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "uf.KB(" + param0 + ')');
        }
    }

    private final String[] h(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_1 = 0;
        String[] stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (!param0) {
            this.c(-32);
          }
          stackIn_7_0 = (~this.field_I.field_f.e(111) == ~this.field_I.field_n) ? 0 : 1;
          var2_int = stackIn_7_0;
          stackIn_10_0 = this.field_I.field_n;
          if (var2_int != 0) {
            stackIn_11_1 = this.field_I.field_f.e(119) - 1;
          } else {
            stackIn_11_1 = 0;
          }
          var3 = new String[stackIn_10_0 + stackIn_11_1];
          var4 = -1;
          var6 = 0;
          var7 = 0;
          while (var6 < var3.length) {
            if (var7 < this.field_I.field_n) {
              if (var2_int != 0) {
                var5 = this.field_I.field_f.c(-119, var7);
                if (var4 != -1 &&
                  ~var5 != ~var4) {
                  incrementValue$0 = var6;
                  var6++;
                  var3[incrementValue$0] = tp.field_a;
                }
                var4 = var5;
              }
              if (~this.field_I.field_A == ~var7) {
                incrementValue$1 = var6;
                var6++;
                var3[incrementValue$1] = "<col=9999ff>" + this.d(var7, -22804) + "</col>";
              } else {
                incrementValue$2 = var6;
                var6++;
                var3[incrementValue$2] = this.d(var7, -22804);
              }
              var7++;
              continue;
            }
            break;
          }
          stackIn_35_0 = var3;
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.QA(" + param0 + ')');
        }
    }

    final void E(int param0) {
        mm stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        Object stackIn_10_0;
        double[][] stackIn_10_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_R = -1;
          if (param0 != -24070) {
            this.h((byte) 96);
          }
          stackIn_7_1 = this.field_O;
          stackIn_7_2 = param0 ^ 29962;
          if (un.field_b &&
            (hq.field_c & this.field_L) != 0) {
            stackIn_10_0 = this;
            stackIn_10_3 = f.field_a;
          } else {
            stackIn_10_0 = this;
            stackIn_10_3 = f.field_c;
          }
          this.field_M = ((mm) (Object) stackIn_7_1).a(stackIn_7_2, stackIn_10_3);
          this.field_D = true;
          this.e(param0 + 23954);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.GD(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int var2_int = 0;
        int var4 = 0;
        dl var3 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 88) {
            this.field_eb = (mm) null;
          }
          this.z(4476);
          this.field_C = 0;
          for (var2_int = 0; var2_int < this.field_I.field_w.length; var2_int++) {
            var3 = this.field_I.field_w[var2_int];
            if (null != var3.field_c) {
              for (var4 = 0; var3.field_c.a((byte) 117) > var4; var4++) {
                var5 = var3.field_c.a(var4, 2229);
                this.field_I.field_l[var5].field_o = false;
                this.a(0, var5);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.KA(" + param0 + ')');
        }
    }

    final void o(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == (hq.field_c & this.field_L)) {
            throw new IllegalStateException();
          }
          if (param0 > -15) {
            this.d(63, true);
          }
          ej.field_j.b(false, 68);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.JC(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, vh param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param3.field_Db = param3.field_hb.field_y;
          param3.field_pb = true;
          if (param0 != -30818) {
            this.field_Q = -110;
          }
          param3.field_qb = param1;
          param3.field_eb = -(param3.field_hb.field_y >> 1) + param2;
          param3.field_gb = param3.field_hb.field_w;
          param3.a((byte) -79, false);
          stackIn_4_0 = param1 + param3.field_hb.field_w + 2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uf.ID(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void u(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_T) {
            if (this.field_l < 1024) {
              this.field_l = this.field_l + 64;
              if (1024 < this.field_l) {
                this.field_l = 1024;
                if (Pool.field_O != 0 &&
                  this.field_l > 0) {
                  this.field_l = this.field_l - 64;
                  if (this.field_l < 0) {
                    this.field_l = 0;
                  }
                }
              }
            }
          } else {
            if (this.field_l > 0) {
              this.field_l = this.field_l - 64;
              if (this.field_l < 0) {
                this.field_l = 0;
              }
            }
          }
          var2_int = -33 / ((20 - param0) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.WB(" + param0 + ')');
        }
    }

    final void z(byte param0) {
        int[] var2 = null;
        try {
          var2 = dq.field_a.b(0, param0 - 1);
          op.a(gd.field_a, 2, ci.field_s, 1, this.field_ab, (byte) 1, (var2.length - 1) / 4, var2, op.field_d, param0, kg.field_s);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.SA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > 768) {
            param1 = 768;
          }
          if (this.field_I.a(this.field_G.field_e, this.field_G.field_h, param1, 359, this.field_Q, this.field_G.field_d)) {
            this.field_G.field_k = param1;
          }
          if (param0 != 1) {
            this.b(10, (qe) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "uf.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void n(byte param0) {
        cg dupTemp$0 = null;
        cg dupTemp$1 = null;
        cg dupTemp$2 = null;
        cg dupTemp$3 = null;
        cg dupTemp$4 = null;
        oo stackIn_618_0 = null;
        boolean stackIn_619_1 = false;
        int stackIn_622_0 = 0;
        boolean stackIn_622_1 = false;
        int stackIn_622_2 = 0;
        String stackIn_623_3 = null;
        boolean stackIn_851_0 = false;
        boolean stackIn_858_0 = false;
        int stackIn_863_0 = 0;
        int stackIn_866_0 = 0;
        int stackIn_867_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        mm var2 = null;
        ij var2_ref = null;
        RuntimeException var2_ref2 = null;
        mm var3_ref_mm = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param0 >= -99) {
            this.a(1, -99, 85);
          }
          if (!vj.field_c[82]) {
            if (vj.field_c[86]) {
              L4: {
                L5: {
                  L6: {
                    boolean decompiledFrameRemainder79 = true;
                    boolean decompiledFrameRemainder78 = true;
                    boolean decompiledFrameRemainder77 = true;
                    boolean decompiledFrameRemainder76 = true;
                    boolean decompiledFrameRemainder75 = true;
                    boolean decompiledFrameRemainder74 = true;
                    boolean decompiledFrameRemainder73 = true;
                    boolean decompiledFrameRemainder72 = true;
                    boolean decompiledFrameRemainder71 = true;
                    boolean decompiledFrameRemainder70 = true;
                    boolean decompiledFrameRemainder69 = true;
                    boolean decompiledFrameRemainder68 = true;
                    boolean decompiledFrameRemainder67 = true;
                    boolean decompiledFrameRemainder66 = true;
                    boolean decompiledFrameRemainder65 = true;
                    boolean decompiledFrameRemainder64 = true;
                    boolean decompiledFrameRemainder63 = true;
                    boolean decompiledFrameRemainder62 = true;
                    boolean decompiledFrameRemainder61 = true;
                    boolean decompiledFrameRemainder60 = true;
                    boolean decompiledFrameRemainder59 = true;
                    boolean decompiledFrameRemainder58 = true;
                    boolean decompiledFrameRemainder57 = true;
                    boolean decompiledFrameRemainder56 = true;
                    boolean decompiledFrameRemainder55 = true;
                    var2_int = qi.field_a;
                    if ((var2_int != 32) &&
                      (decompiledFrameRemainder55 = (var2_int != 48 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder56 = (var2_int != 33 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder57 = (49 != var2_int)) &&
                      (decompiledFrameRemainder58 = (var2_int != 34 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder59 = (var2_int != 50)) &&
                      (decompiledFrameRemainder60 = (var2_int != 35)) &&
                      (decompiledFrameRemainder61 = (var2_int != 51)) &&
                      (decompiledFrameRemainder62 = (var2_int != 36 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder63 = (var2_int != 52)) &&
                      (decompiledFrameRemainder64 = (var2_int != 37)) &&
                      (decompiledFrameRemainder65 = (53 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder66 = (38 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder67 = (var2_int != 54 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder68 = (var2_int != 39 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder69 = (55 != var2_int)) &&
                      (decompiledFrameRemainder70 = (40 != var2_int)) &&
                      (decompiledFrameRemainder71 = (var2_int != 56 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder72 = (var2_int != 41)) &&
                      (decompiledFrameRemainder73 = (var2_int != 57 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder74 = (64 != var2_int)) &&
                      (decompiledFrameRemainder75 = (var2_int != 65)) &&
                      (decompiledFrameRemainder76 = (var2_int != 66 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder77 = (var2_int != 67)) &&
                      (decompiledFrameRemainder78 = (var2_int != 68 ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder79 = (var2_int != 69))) {
                      if (var2_int == 59 &&
                        var8 == 0) {
                        break L6;
                      }
                      if (var2_int == 87 &&
                        var8 == 0) {
                        break L5;
                      }
                      if (var2_int != 88) {
                        return;
                      }
                      if (var8 == 0) {
                        break L4;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57) &&
                      (decompiledFrameRemainder56) &&
                      (decompiledFrameRemainder55)) {
                      if (!vj.field_c[81]) {
                        kh.field_gc.field_C = kh.field_gc.field_C + 1;
                        if (var8 == 0) {
                          return;
                        }
                      }
                      kh.field_gc.field_d = kh.field_gc.field_d + 1;
                      this.K(0);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57) &&
                      (decompiledFrameRemainder56)) {
                      if (!vj.field_c[81]) {
                        kh.field_gc.field_C = kh.field_gc.field_C - 1;
                        if (var8 == 0) {
                          return;
                        }
                      }
                      kh.field_gc.field_d = kh.field_gc.field_d - 1;
                      this.K(0);
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58) &&
                      (decompiledFrameRemainder57)) {
                      if (vj.field_c[81]) {
                        kh.field_gc.field_m = kh.field_gc.field_m + 1;
                        this.K(0);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      kh.field_gc.field_x = kh.field_gc.field_x + 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59) &&
                      (decompiledFrameRemainder58)) {
                      if (vj.field_c[81]) {
                        kh.field_gc.field_m = kh.field_gc.field_m - 1;
                        this.K(0);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      kh.field_gc.field_x = kh.field_gc.field_x - 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60) &&
                      (decompiledFrameRemainder59)) {
                      kh.field_gc.field_j = kh.field_gc.field_j + 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61) &&
                      (decompiledFrameRemainder60)) {
                      kh.field_gc.field_j = kh.field_gc.field_j - 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62) &&
                      (decompiledFrameRemainder61)) {
                      kh.field_gc.field_p = kh.field_gc.field_p + 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63) &&
                      (decompiledFrameRemainder62)) {
                      kh.field_gc.field_p = kh.field_gc.field_p - 0.04908738521234052;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64) &&
                      (decompiledFrameRemainder63)) {
                      kh.field_gc.field_E = kh.field_gc.field_E * 1.0625;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65) &&
                      (decompiledFrameRemainder64)) {
                      kh.field_gc.field_E = kh.field_gc.field_E * 0.9375;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66) &&
                      (decompiledFrameRemainder65)) {
                      kh.field_gc.field_z = kh.field_gc.field_z * 1.0078125f;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67) &&
                      (decompiledFrameRemainder66)) {
                      kh.field_gc.field_z = kh.field_gc.field_z * 0.9921875f;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68) &&
                      (decompiledFrameRemainder67)) {
                      hf.field_a = 17 * hf.field_a / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69) &&
                      (decompiledFrameRemainder68)) {
                      hf.field_a = hf.field_a * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70) &&
                      (decompiledFrameRemainder69)) {
                      fl.field_l = fl.field_l * 17 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71) &&
                      (decompiledFrameRemainder70)) {
                      fl.field_l = fl.field_l * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72) &&
                      (decompiledFrameRemainder71)) {
                      kh.field_vc = kh.field_vc - 50;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73) &&
                      (decompiledFrameRemainder72)) {
                      kh.field_vc = kh.field_vc + 50;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74) &&
                      (decompiledFrameRemainder73)) {
                      ek.field_a = ek.field_a + 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75) &&
                      (decompiledFrameRemainder74)) {
                      ek.field_a = ek.field_a - 1;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76) &&
                      (decompiledFrameRemainder75)) {
                      if ((pd.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (re.field_a <= 16) {
                        return;
                      }
                      re.field_a = re.field_a - 8;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77) &&
                      (decompiledFrameRemainder76)) {
                      if ((16777216L & pd.field_i) == 0L) {
                        return;
                      }
                      if (2304 <= re.field_a) {
                        return;
                      }
                      re.field_a = re.field_a + 8;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78) &&
                      (decompiledFrameRemainder77)) {
                      if ((pd.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (ue.field_e <= 16) {
                        return;
                      }
                      ue.field_e = ue.field_e * 15 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((decompiledFrameRemainder79) &&
                      (decompiledFrameRemainder78)) {
                      if ((pd.field_i & 16777216L) == 0L) {
                        return;
                      }
                      if (ue.field_e >= 65536) {
                        return;
                      }
                      ue.field_e = ue.field_e * 17 / 16;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if (decompiledFrameRemainder79) {
                      if ((16777216L & pd.field_i) == 0L) {
                        return;
                      }
                      if (ap.field_G <= 4) {
                        return;
                      }
                      ap.field_G = ap.field_G - 4;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    if ((16777216L & pd.field_i) == 0L) {
                      return;
                    }
                    if (ap.field_G >= 65536) {
                      return;
                    }
                    ap.field_G = ap.field_G + 4;
                    if (var8 == 0) {
                      return;
                    }
                  }
                  this.o(3);
                  if (var8 == 0) {
                    return;
                  }
                }
                if ((pd.field_i & 65536L) == 0L) {
                  return;
                }
                if (hr.field_b >= 26) {
                  return;
                }
                ne.field_v = ne.field_v + 2;
                hr.field_b = hr.field_b + 1;
                this.j(46);
                if (var8 == 0) {
                  return;
                }
              }
              if ((65536L & pd.field_i) == 0L) {
                return;
              }
              if (hr.field_b <= 2) {
                return;
              }
              ne.field_v = ne.field_v - 2;
              hr.field_b = hr.field_b - 1;
              this.j(-93);
              if (var8 == 0) {
                return;
              }
            }
            L51: {
              L52: {
                L53: {
                  L54: {
                    L55: {
                      L56: {
                        L57: {
                          L58: {
                            boolean decompiledFrameRemainder54 = true;
                            boolean decompiledFrameRemainder53 = true;
                            boolean decompiledFrameRemainder52 = true;
                            boolean decompiledFrameRemainder51 = true;
                            boolean decompiledFrameRemainder50 = true;
                            boolean decompiledFrameRemainder49 = true;
                            boolean decompiledFrameRemainder48 = true;
                            boolean decompiledFrameRemainder47 = true;
                            var4 = qi.field_a;
                            if ((16 != var4) &&
                              (decompiledFrameRemainder47 = (17 != var4)) &&
                              (decompiledFrameRemainder48 = (18 != var4 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder49 = (var4 != 19 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder50 = (20 != var4)) &&
                              (decompiledFrameRemainder51 = (var4 != 21 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder52 = (var4 != 22 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder53 = (var4 != 23 ||
                              var8 != 0)) &&
                              (decompiledFrameRemainder54 = (var4 != 24 ||
                              var8 != 0))) {
                              switch (var4) {
                                case 25:
                                  break L58;
                                case 26:
                                  break L57;
                                case 43:
                                  break L56;
                                default:
                                  if (var4 == 85 &&
                                    var8 == 0) {
                                    break L55;
                                  }
                                  switch (var4) {
                                    case 64:
                                      break L54;
                                    case 65:
                                      break L53;
                                    case 66:
                                      break L52;
                                    default:
                                      return;
                                    case 67:
                                      if (var8 == 0) {
                                        break L51;
                                      }
                                      break;
                                  }
                                  break;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49) &&
                              (decompiledFrameRemainder48) &&
                              (decompiledFrameRemainder47)) {
                              this.b(vj.field_c[82], 6, 0);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49) &&
                              (decompiledFrameRemainder48)) {
                              this.b(vj.field_c[82], 115, 1);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50) &&
                              (decompiledFrameRemainder49)) {
                              this.b(vj.field_c[82], 14, 2);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51) &&
                              (decompiledFrameRemainder50)) {
                              this.b(vj.field_c[82], 56, 3);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52) &&
                              (decompiledFrameRemainder51)) {
                              this.b(vj.field_c[82], 100, 4);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53) &&
                              (decompiledFrameRemainder52)) {
                              this.b(vj.field_c[82], 78, 5);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if ((decompiledFrameRemainder54) &&
                              (decompiledFrameRemainder53)) {
                              this.b(vj.field_c[82], 42, 6);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            if (decompiledFrameRemainder54) {
                              this.b(vj.field_c[82], 19, 7);
                              if (var8 == 0) {
                                return;
                              }
                            }
                            this.b(vj.field_c[82], 33, 8);
                            if (var8 == 0) {
                              return;
                            }
                          }
                          this.b(vj.field_c[82], 106, 9);
                          if (var8 == 0) {
                            return;
                          }
                        }
                        this.b(vj.field_c[82], 99, 10);
                        if (var8 == 0) {
                          return;
                        }
                      }
                      this.field_kb = true;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    this.field_I.e(-51);
                    if (var8 == 0) {
                      return;
                    }
                  }
                  this.field_eb.field_d = this.field_eb.field_f;
                  this.field_O.a(144, this.field_eb);
                  this.field_D = true;
                  if (var8 == 0) {
                    return;
                  }
                }
                this.field_eb.field_a = this.field_eb.field_m;
                this.field_O.a(144, this.field_eb);
                this.field_D = true;
                if (var8 == 0) {
                  return;
                }
              }
              this.field_eb.field_f = 288.0;
              var2 = this.field_eb;
              var2.field_d = 288.0;
              this.field_O.a(144, this.field_eb);
              this.field_D = true;
              if (var8 == 0) {
                return;
              }
            }
            var3_ref_mm = this.field_eb;
            this.field_eb.field_m = 144.0;
            var3_ref_mm.field_a = 144.0;
            this.field_O.a(144, this.field_eb);
            this.field_D = true;
            if (var8 == 0) {
              return;
            }
          }
          if (!vj.field_c[81]) {
            boolean decompiledFrameRemainder46 = true;
            boolean decompiledFrameRemainder45 = true;
            boolean decompiledFrameRemainder44 = true;
            boolean decompiledFrameRemainder43 = true;
            boolean decompiledFrameRemainder42 = true;
            boolean decompiledFrameRemainder41 = true;
            boolean decompiledFrameRemainder40 = true;
            boolean decompiledFrameRemainder39 = true;
            boolean decompiledFrameRemainder38 = true;
            boolean decompiledFrameRemainder37 = true;
            boolean decompiledFrameRemainder36 = true;
            boolean decompiledFrameRemainder35 = true;
            boolean decompiledFrameRemainder34 = true;
            boolean decompiledFrameRemainder33 = true;
            boolean decompiledFrameRemainder32 = true;
            boolean decompiledFrameRemainder31 = true;
            boolean decompiledFrameRemainder30 = true;
            boolean decompiledFrameRemainder29 = true;
            boolean decompiledFrameRemainder28 = true;
            boolean decompiledFrameRemainder27 = true;
            boolean decompiledFrameRemainder26 = true;
            var2_int = qi.field_a;
            if (var2_int == 70 &&
              var8 == 0) {
              this.y(17);
              return;
            } else {
              if ((var2_int != 40) &&
                (decompiledFrameRemainder26 = (var2_int != 1)) &&
                (decompiledFrameRemainder27 = (2 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder28 = (var2_int != 3)) &&
                (decompiledFrameRemainder29 = (var2_int != 4 ||
                var8 != 0)) &&
                (decompiledFrameRemainder30 = (5 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder31 = (6 != var2_int)) &&
                (decompiledFrameRemainder32 = (var2_int != 7 ||
                var8 != 0)) &&
                (decompiledFrameRemainder33 = (8 != var2_int ||
                var8 != 0)) &&
                (decompiledFrameRemainder34 = (var2_int != 9 ||
                var8 != 0)) &&
                (decompiledFrameRemainder35 = (var2_int != 68))) {
                if (var2_int == 69 &&
                  var8 == 0) {
                  return;
                }
                decompiledFrameRemainder36 = (var2_int != 50 ||
                  var8 != 0);
                if ((decompiledFrameRemainder36) &&
                  (decompiledFrameRemainder37 = (var2_int != 71)) &&
                  (decompiledFrameRemainder38 = (var2_int != 72 ||
                  var8 != 0))) {
                  if (var2_int == 51) {
                    return;
                  }
                  if (52 == var2_int) {
                    return;
                  }
                  decompiledFrameRemainder39 = (var2_int != 67);
                  if ((decompiledFrameRemainder39) &&
                    (decompiledFrameRemainder40 = (var2_int != 59 ||
                    var8 != 0)) &&
                    (decompiledFrameRemainder41 = (41 != var2_int))) {
                    if (var2_int == 38 &&
                      var8 == 0) {
                      return;
                    }
                    if (39 == var2_int) {
                      return;
                    }
                    decompiledFrameRemainder42 = (var2_int != 32 ||
                      var8 != 0);
                    if ((decompiledFrameRemainder42) &&
                      (decompiledFrameRemainder43 = (64 != var2_int ||
                      var8 != 0)) &&
                      (decompiledFrameRemainder44 = (var2_int != 49))) {
                      if (var2_int == 56 &&
                        var8 == 0) {
                        return;
                      }
                      decompiledFrameRemainder45 = (36 != var2_int ||
                        var8 != 0);
                      if ((decompiledFrameRemainder45) &&
                        (decompiledFrameRemainder46 = (var2_int != 35))) {
                        return;
                      }
                    }
                  }
                }
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28) &&
              (decompiledFrameRemainder27) &&
              (decompiledFrameRemainder26)) {
              this.field_Z = (this.field_Z + 1) % 6;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28) &&
              (decompiledFrameRemainder27)) {
              this.a((byte) 124, 0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29) &&
              (decompiledFrameRemainder28)) {
              this.a((byte) 124, 1);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30) &&
              (decompiledFrameRemainder29)) {
              this.a((byte) 124, 2);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31) &&
              (decompiledFrameRemainder30)) {
              this.a((byte) 124, 3);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32) &&
              (decompiledFrameRemainder31)) {
              this.a((byte) 124, 4);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33) &&
              (decompiledFrameRemainder32)) {
              this.a((byte) 124, 5);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34) &&
              (decompiledFrameRemainder33)) {
              this.a((byte) 124, 6);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35) &&
              (decompiledFrameRemainder34)) {
              this.a((byte) 124, 7);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36) &&
              (decompiledFrameRemainder35)) {
              this.a((byte) 124, 8);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37) &&
              (decompiledFrameRemainder36)) {
              this.K(0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38) &&
              (decompiledFrameRemainder37)) {
              this.field_I.k(0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39) &&
              (decompiledFrameRemainder38)) {
              if ((hq.field_c & this.field_L) != 0) {
                return;
              }
              this.field_o = this.field_o - 1000;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40) &&
              (decompiledFrameRemainder39)) {
              if ((hq.field_c & this.field_L) != 0) {
                return;
              }
              this.field_o = this.field_o + 1000;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41) &&
              (decompiledFrameRemainder40)) {
              this.field_I.e(12226, 0);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42) &&
              (decompiledFrameRemainder41)) {
              dq.field_a.a(7096);
              dq.field_a.a(2147483647, this.field_I);
              kh.field_gc.i(25879);
              kh.field_gc.a(this.field_I, 21894);
              kh.field_gc.a((byte) -128, this.field_ab);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43) &&
              (decompiledFrameRemainder42)) {
              hh.field_c = true;
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44) &&
              (decompiledFrameRemainder43)) {
              stackIn_618_0 = kh.field_gc;
              stackIn_619_1 = !(kh.field_gc.field_h);
              stackIn_618_0.field_h = stackIn_619_1;
              stackIn_622_0 = 122;
              stackIn_622_1 = false;
              stackIn_622_2 = 1;
              if (!kh.field_gc.field_h) {
                stackIn_623_3 = "Linear sorting";
              } else {
                stackIn_623_3 = "Radial sorting";
              }
              em.$cfr$intArgs$a$c9c3307e6488(stackIn_622_0, stackIn_622_1, stackIn_622_2, stackIn_623_3);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45) &&
              (decompiledFrameRemainder44)) {
              this.q((byte) 114);
              if (var8 == 0) {
                return;
              }
            }
            if ((decompiledFrameRemainder46) &&
              (decompiledFrameRemainder45)) {
              li.a(2243, this.field_I);
              if (var8 == 0) {
                return;
              }
            }
            if (decompiledFrameRemainder46) {
              if ((this.field_L & sk.field_d) == 0) {
                return;
              }
              this.field_c.a(-1);
              if (var8 == 0) {
                return;
              }
            }
            this.field_I.e(-54);
            this.a(1 + ga.a(512, true, ea.field_r), false);
            if (!(this.field_I.field_f instanceof af)) {
              return;
            }
            this.field_I.field_f = (sq) ((Object) new af(this.field_I));
            if (var8 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder25 = true;
          boolean decompiledFrameRemainder24 = true;
          boolean decompiledFrameRemainder23 = true;
          boolean decompiledFrameRemainder22 = true;
          boolean decompiledFrameRemainder21 = true;
          boolean decompiledFrameRemainder20 = true;
          boolean decompiledFrameRemainder19 = true;
          boolean decompiledFrameRemainder18 = true;
          boolean decompiledFrameRemainder17 = true;
          boolean decompiledFrameRemainder16 = true;
          boolean decompiledFrameRemainder15 = true;
          boolean decompiledFrameRemainder14 = true;
          boolean decompiledFrameRemainder13 = true;
          boolean decompiledFrameRemainder12 = true;
          boolean decompiledFrameRemainder11 = true;
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3 = qi.field_a;
          if (var3 == 1 &&
            var8 == 0) {
            this.a(0, (byte) -43);
            return;
          } else {
            if ((var3 != 2) &&
              (decompiledFrameRemainder0 = (var3 != 3)) &&
              (decompiledFrameRemainder1 = (var3 != 4 ||
              var8 != 0)) &&
              (decompiledFrameRemainder2 = (var3 != 5 ||
              var8 != 0)) &&
              (decompiledFrameRemainder3 = (var3 != 6)) &&
              (decompiledFrameRemainder4 = (var3 != 7 ||
              var8 != 0)) &&
              (decompiledFrameRemainder5 = (var3 != 8 ||
              var8 != 0)) &&
              (decompiledFrameRemainder6 = (var3 != 16)) &&
              (decompiledFrameRemainder7 = (var3 != 17)) &&
              (decompiledFrameRemainder8 = (var3 != 18 ||
              var8 != 0)) &&
              (decompiledFrameRemainder9 = (19 != var3 ||
              var8 != 0)) &&
              (decompiledFrameRemainder10 = (var3 != 20)) &&
              (decompiledFrameRemainder11 = (21 != var3)) &&
              (decompiledFrameRemainder12 = (var3 != 64))) {
              if (var3 == 48 &&
                var8 == 0) {
                return;
              }
              decompiledFrameRemainder13 = (var3 != 40 ||
                var8 != 0);
              if ((decompiledFrameRemainder13) &&
                (decompiledFrameRemainder14 = (66 != var3 ||
                var8 != 0)) &&
                (decompiledFrameRemainder15 = (var3 != 36 ||
                var8 != 0)) &&
                (decompiledFrameRemainder16 = (var3 != 56 ||
                var8 != 0)) &&
                (decompiledFrameRemainder17 = (39 != var3)) &&
                (decompiledFrameRemainder18 = (var3 != 70)) &&
                (decompiledFrameRemainder19 = (var3 != 69 ||
                var8 != 0)) &&
                (decompiledFrameRemainder20 = (41 != var3 ||
                var8 != 0))) {
                if (49 == var3) {
                  return;
                }
                decompiledFrameRemainder21 = (var3 != 53);
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder22 = (var3 != 54 ||
                  var8 != 0)) &&
                  (decompiledFrameRemainder23 = (var3 != 51)) &&
                  (decompiledFrameRemainder24 = (var3 != 67)) &&
                  (decompiledFrameRemainder25 = (68 != var3))) {
                  return;
                }
              }
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            this.a(1, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            this.a(2, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.a(3, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.a(4, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.a(5, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            this.a(6, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            this.a(7, (byte) -43);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            ij.field_u = ul.field_m;
            ac.a(256, false, true, ul.field_m);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9) &&
            (decompiledFrameRemainder8)) {
            dupTemp$0 = nn.field_b[0].field_b;
            ij.field_u = dupTemp$0;
            ac.a(256, false, true, dupTemp$0);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10) &&
            (decompiledFrameRemainder9)) {
            dupTemp$1 = nn.field_b[1].field_b;
            ij.field_u = dupTemp$1;
            ac.a(256, false, true, dupTemp$1);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11) &&
            (decompiledFrameRemainder10)) {
            dupTemp$2 = nn.field_b[2].field_b;
            ij.field_u = dupTemp$2;
            ac.a(256, false, true, dupTemp$2);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12) &&
            (decompiledFrameRemainder11)) {
            dupTemp$3 = nn.field_b[3].field_b;
            ij.field_u = dupTemp$3;
            ac.a(256, false, true, dupTemp$3);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13) &&
            (decompiledFrameRemainder12)) {
            dupTemp$4 = nn.field_b[4].field_b;
            ij.field_u = dupTemp$4;
            ac.a(256, false, true, dupTemp$4);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14) &&
            (decompiledFrameRemainder13)) {
            this.s(72);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15) &&
            (decompiledFrameRemainder14)) {
            this.a(-23095);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16) &&
            (decompiledFrameRemainder15)) {
            hi.g(-128);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17) &&
            (decompiledFrameRemainder16)) {
            if (this.field_c == null) {
              return;
            }
            this.field_c.a(-1);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18) &&
            (decompiledFrameRemainder17)) {
            this.field_O.field_a = 144.0;
            this.field_O.field_h = -143.19449088;
            this.field_O.field_m = 144.0;
            this.field_O.field_k = 0.0;
            this.field_O.field_f = 379.3516416;
            this.field_O.field_d = 718.8717888;
            this.field_O.field_k = this.field_O.field_k - 8.0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19) &&
            (decompiledFrameRemainder18)) {
            this.y((byte) 99);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20) &&
            (decompiledFrameRemainder19)) {
            var2_ref = gj.a(true, 0, "Wowsers, penny!", (String) null);
            var2_ref.field_r = 8;
            var2_ref.field_v = 8;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21) &&
            (decompiledFrameRemainder20)) {
            em.$cfr$intArgs$a$c9c3307e6488(123, false, 2, "Test message in the ticker!");
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22) &&
            (decompiledFrameRemainder21)) {
            this.f((byte) 99);
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23) &&
            (decompiledFrameRemainder22)) {
            stackIn_851_0 = !(wb.field_a);
            wb.field_a = stackIn_851_0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24) &&
            (decompiledFrameRemainder23)) {
            stackIn_858_0 = !(ff.field_c);
            ff.field_c = stackIn_858_0;
            if (var8 == 0) {
              return;
            }
          }
          if ((decompiledFrameRemainder25) &&
            (decompiledFrameRemainder24)) {
            var3 = ((qe) (this.field_I.field_u.c((byte) -52))).field_M;
            var4 = f.field_g;
            if (pq.field_B != null) {
              stackIn_863_0 = pq.field_B.length;
            } else {
              stackIn_863_0 = 0;
            }
            var5 = stackIn_863_0;
            var6 = -var4 + var3 + 1465;
            var7 = var5 + (-var3 + 940);
            wq.field_c = 39595 + var6 | wq.field_c & -16777216;
            vm.field_f = vm.field_f & 65280;
            dk.field_f = var7 + 7621 * var6;
            field_fb = (var7 << 16) + 998899712;
            stackIn_866_0 = dk.field_f;
            if (this.field_o <= 0) {
              stackIn_867_1 = 0;
            } else {
              stackIn_867_1 = this.field_o;
            }
            dk.field_f = stackIn_866_0 - stackIn_867_1;
            if (var8 == 0) {
              return;
            }
          }
          if (decompiledFrameRemainder25) {
            var3 = this.field_o;
            field_fb = 65535 & field_fb | (100 + (field_fb >>> 16)) % 30484 << 16;
            var4 = var3;
            var5 = var4 + dk.field_f;
            var6 = var5 % 7621;
            var5 = (100 + var6) % 7621 - var6 + var5;
            dk.field_f = var5 - var4;
            if (var8 == 0) {
              return;
            }
          }
          var3 = this.field_o;
          var4 = var3;
          var5 = var4 + dk.field_f;
          var6 = var5 % 7621;
          var7 = var5 / 7621;
          var5 = 7621 * ((100 + var7) % 31676) + var6;
          dk.field_f = var5 - var4;
          wq.field_c = -65536 & wq.field_c | ((65535 & wq.field_c) + 100) % 31676;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref2), "uf.MD(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1, byte param2) {
        qe var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.field_I.j(122);
          if (var4.field_M < 0) {
            b.field_H.field_pb = false;
          } else {
            param0 = this.a(-30818, param0, param1, b.field_H);
          }
          if (param2 != -51) {
            this.field_Z = -70;
          }
          if (this.field_I.field_y <= 0) {
            qo.field_F.field_pb = false;
          } else {
            param0 = this.a(-30818, param0, param1, qo.field_F);
          }
          if (var4.field_u != 0) {
            param0 = this.a(-30818, param0, param1, df.field_f);
          } else {
            df.field_f.field_pb = false;
          }
          if (var4.field_E) {
            param0 = this.a(-30818, param0, param1, ub.field_q);
          } else {
            ub.field_q.field_pb = false;
          }
          stackIn_18_0 = param0;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4_ref), "uf.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (df.field_f.field_pb) {
            df.field_f.a(true, false);
          }
          if (b.field_H.field_pb) {
            b.field_H.a(true, false);
          }
          if (qo.field_F.field_pb) {
            qo.field_F.a(true, false);
          }
          if (ub.field_q.field_pb) {
            ub.field_q.a(true, false);
          }
          if (q.field_b.field_pb) {
            q.field_b.a(true, false);
          }
          if (df.field_f.field_pb &&
            df.field_f.field_W) {
            stackIn_24_0 = 4;
            return stackIn_24_0;
          }
          if (b.field_H.field_pb &&
            b.field_H.field_W) {
            stackIn_30_0 = 5;
            return stackIn_30_0;
          }
          if (qo.field_F.field_pb &&
            qo.field_F.field_W) {
            stackIn_38_0 = 6;
            return stackIn_38_0;
          }
          if (param0 != 1163) {
            uf.a((di) null, -44, (di) null, (di) null);
          }
          if (ub.field_q.field_pb &&
            ub.field_q.field_W) {
            stackIn_49_0 = 8;
            return stackIn_49_0;
          }
          if (q.field_b.field_pb &&
            q.field_b.field_W) {
            stackIn_55_0 = this.field_I.field_f.a(this.field_I.j(113), param0 ^ -1223);
            return stackIn_55_0;
          }
          stackIn_57_0 = -1;
          return stackIn_57_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.O(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        try {
          dq.field_a.a(7096);
          dq.field_a.a(2147483647, this.field_I);
          kh.field_gc.a(this.field_I, 21894);
          kh.field_gc.a((byte) 0, this.field_ab);
          int var2_int = 90 % ((-12 - param0) / 58);
          this.K(0);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "uf.W(" + param0 + ')');
        }
    }

    private final void a(qe param0, int param1) {
        int stackIn_60_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_81_1 = 0;
        String stackIn_82_2 = null;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        String stackIn_87_2 = null;
        boolean stackIn_91_0 = false;
        int stackIn_91_1 = 0;
        String stackIn_92_2 = null;
        int stackIn_118_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_196_2 = 0;
        Object stackIn_254_0 = null;
        StringBuilder stackIn_254_1 = null;
        String stackIn_255_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var3_int = 0;
        cr var4_ref_cr = null;
        int var4 = 0;
        aa var5_ref_aa = null;
        int var5 = 0;
        String var5_ref_String = null;
        qe var6 = null;
        aa var6_ref = null;
        int var6_int = 0;
        aa var7 = null;
        qe var8 = null;
        int var9 = 0;
        cr var10 = null;
        qe var8Lifetime1;
        try {
          if (param0.field_m != null &&
            !param0.field_m.c(0)) {
            var3 = new aa(param0.field_m);
            var4_ref_cr = (cr) (((aa) (var3)).b((byte) -92));
            while (var4_ref_cr != null) {
              if (0 != var4_ref_cr.field_n) {
                field_fb = field_fb + 1;
              }
              var4_ref_cr = (cr) (((aa) (var3)).b(-100));
            }
          }
          field_fb = 16 + field_fb & 65535 | -65536 & field_fb;
          if (param1 != 1) {
            this.A((byte) -46);
          }
          if (0 != (this.field_I.j(69).field_s & um.field_c)) {
            kh.field_gc.a(6, 256, (byte) 18, 128);
          }
          if ((sk.field_d & this.field_L) != 0 &&
            (hm.field_e & param0.field_s) != 0) {
            if (this.field_I.field_f instanceof af) {
              gj.a(true, 0, ph.field_a, c.field_a);
              this.field_I.a(9437184, (li) null, (byte) -114, 9437184, 8);
              param0.field_s = param0.field_s & ~hm.field_e;
              if (this.field_I.d((byte) 105)) {
                param0.field_s = param0.field_s | um.field_c;
              }
            }
            if (this.field_I.field_f instanceof fj) {
              gj.a(true, 0, ph.field_a, cr.field_q);
              this.field_I.a(9437184, (li) null, (byte) -108, 9437184, 9);
              param0.field_s = param0.field_s & ~hm.field_e;
              if (this.field_I.d((byte) 127)) {
                param0.field_s = param0.field_s | um.field_c;
              }
            }
          }
          if (this.field_I.h(param1 + 22041)) {
            if ((this.field_L & hq.field_c) == 0) {
              if ((ag.field_e & param0.field_s) != 0) {
                this.field_I.c(-14286, param0.field_L);
                if (0 != (f.field_f & this.field_L)) {
                  dk.field_f = dk.field_f - 1;
                  this.field_I.field_m = true;
                  this.i((byte) -102);
                  stackIn_118_0 = (9000 <= this.field_o) ? 0 : 1;
                  var3_int = stackIn_118_0;
                  var4 = 1;
                  var5_ref_aa = new aa(this.field_I.field_u);
                  var6 = (qe) (var5_ref_aa.b((byte) -92));
                  while (var6 != null) {
                    if (!var6.field_t &&
                      (var6.field_s & be.field_I) == 0) {
                      var6 = (qe) (var5_ref_aa.b(param1 - 106));
                      continue;
                    }
                    var4 = 0;
                    break;
                  }
                  var5 = 1;
                  var6_ref = new aa(this.field_I.field_u);
                  var7 = new aa();
                  var8 = (qe) (var6_ref.b((byte) -92));
                  var8Lifetime1 = (qe) (var6_ref.b(-97));
                  while (true) {
                    if (var8Lifetime1 != null) {
                      if (var8Lifetime1.field_m != null) {
                        var7.a(var8Lifetime1.field_m, false);
                        var9 = 0;
                        var10 = (cr) (var7.b((byte) -92));
                        while (var10 != null) {
                          if (var10.field_n == 0) {
                            var10 = (cr) (var7.b(-113));
                            continue;
                          }
                          var9 = 1;
                          break;
                        }
                        if (var9 != 0) {
                          var8Lifetime1 = (qe) (var6_ref.b(-125));
                          continue;
                        }
                        var5 = 0;
                      } else {
                        var5 = 0;
                      }
                    }
                    if (pq.field_B != null &&
                      pq.field_B.length > 0) {
                      if (var4 != 0 &&
                        t.a(0, oa.field_g, 21)) {
                        this.a((byte) 104, 21, 234);
                      }
                      if (var5 != 0 &&
                        t.a(param1 - 1, oa.field_g, 22)) {
                        this.a((byte) 104, 22, 233);
                      }
                      if (var3_int == 0) {
                        break;
                      }
                      if (!t.a(0, oa.field_g, 20)) {
                        break;
                      }
                      this.a((byte) 104, 20, 235);
                      break;
                    }
                    if (var4 != 0 &&
                      t.a(0, oa.field_g, 24)) {
                      this.a((byte) 104, 24, 231);
                    }
                    if (var5 != 0 &&
                      t.a(0, oa.field_g, 25)) {
                      this.a((byte) 104, 25, 230);
                    }
                    if (var3_int == 0) {
                      break;
                    }
                    if (!t.a(param1 ^ 1, oa.field_g, 23)) {
                      break;
                    }
                    this.a((byte) 104, 23, 232);
                    break;
                  }
                }
                kh.field_gc.a(17, 256, (byte) -100, 128);
              } else {
                if ((hm.field_e & param0.field_s) != 0) {
                  this.field_I.c(-14286, this.field_I.field_f.a(param0, (byte) 114));
                  if (0 != (this.field_L & f.field_f)) {
                    this.field_I.field_m = false;
                  }
                  if ((this.field_L & oj.field_m) == 0) {
                    kh.field_gc.a(18, 256, (byte) 98, 128);
                  } else {
                    kh.field_gc.a(17, 256, (byte) -103, 128);
                  }
                }
              }
              stackIn_195_0 = -3405;
              stackIn_195_1 = -1;
              if (mg.a(true)) {
                stackIn_196_2 = 21;
              } else {
                stackIn_196_2 = 0;
              }
              fq.a(stackIn_195_0, stackIn_195_1, stackIn_196_2, false);
              this.a(-23095);
              if ((this.field_L & f.field_f) != 0) {
                sq.field_b = 23;
                ne.field_w = 23;
              }
            }
          } else {
            if (this.field_I.field_f.a((byte) -83, param0.field_L)) {
              if (this.field_I.field_f instanceof rj &&
                0 == (this.field_I.field_p & 1 << param0.field_L)) {
                if (param0.field_L == this.field_db &&
                  (this.field_L & hq.field_c) != 0) {
                  stackIn_60_0 = 1;
                } else {
                  stackIn_60_0 = 0;
                }
                var3_int = stackIn_60_0;
                var4 = ((rj) (this.field_I.field_f)).field_e[param0.field_L];
                if (var3_int == 0) {
                  if (var4 != 1) {
                    var5_ref_String = nr.a(new String[]{this.e(-30360, param0.field_L), Integer.toString(var4)}, -1, cj.field_U);
                  } else {
                    var5_ref_String = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, kn.field_f);
                  }
                } else {
                  if (1 == var4) {
                    var5_ref_String = bh.field_d;
                  } else {
                    var5_ref_String = nr.a(new String[]{Integer.toString(var4)}, param1 ^ -2, hk.field_q);
                  }
                }
                var6_int = -param0.field_N + var4;
                if (var6_int != 1) {
                  if (var6_int == -1) {
                    stackIn_86_0 = true;
                    stackIn_86_1 = 0;
                    if (var3_int != 0) {
                      stackIn_87_2 = o.field_D;
                    } else {
                      stackIn_87_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, jk.field_c);
                    }
                    gj.a(stackIn_86_0, stackIn_86_1, stackIn_87_2, var5_ref_String);
                  } else {
                    if (-2 == var6_int) {
                      stackIn_91_0 = true;
                      stackIn_91_1 = 0;
                      if (var3_int == 0) {
                        stackIn_92_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, oh.field_f);
                      } else {
                        stackIn_92_2 = jk.field_j;
                      }
                      gj.a(stackIn_91_0, stackIn_91_1, stackIn_92_2, var5_ref_String);
                    }
                  }
                } else {
                  stackIn_81_0 = true;
                  stackIn_81_1 = 0;
                  if (var3_int != 0) {
                    stackIn_82_2 = oj.field_u;
                  } else {
                    stackIn_82_2 = nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, ad.field_b);
                  }
                  gj.a(stackIn_81_0, stackIn_81_1, stackIn_82_2, var5_ref_String);
                }
              }
            } else {
              gj.a(true, 0, nr.a(new String[]{this.e(-30360, param0.field_L)}, -1, qe.field_F), (String) null);
            }
          }
          if ((param0.field_s & i.field_m) != 0 &&
            (param0.field_s & oa.field_b) == 0) {
            this.b(124, param0);
          }
          if ((sk.field_d & this.field_L) == 0) {
            if (param0.field_w > -3) {
              if (param0.field_w != -2) {
                if (param0.field_w != -1) {
                  if (param0.field_w != 1) {
                    if (param0.field_w != 2) {
                      if (param0.field_w < 3) {
                        var3 = null;
                      } else {
                        var3 = wo.field_b;
                      }
                    } else {
                      var3 = pq.field_C;
                    }
                  } else {
                    var3 = v.field_k;
                  }
                } else {
                  var3 = qp.field_fc;
                }
              } else {
                var3 = he.field_d;
              }
            } else {
              var3 = jr.field_l;
            }
            if (null != var3) {
              gj.a(true, 5, (String) (((Object[]) (var3))[ga.a(java.lang.reflect.Array.getLength(var3), true, ea.field_r)]), (String) null);
            }
          }
          this.a(param0, (byte) -28);
          tn.a(this, -16813);
          if ((this.field_L & sk.field_d) != 0) {
            this.field_c.a(false, param0);
          }
          if ((f.field_f & this.field_L) != 0 &&
            (param0.field_s & be.field_I) != 0) {
            gj.a(true, 6, nr.a(new String[]{Integer.toString(15)}, -1, iq.field_b), (String) null);
            this.field_v = this.field_o;
            this.field_o = this.field_o + 750;
            if ((16711680 & wq.field_c) != 16711680) {
              wq.field_c = wq.field_c + 65536;
            }
          }
          if (0 == (this.field_L & hq.field_c) &&
            this.field_I.j(param1 + 114) != param0) {
            this.s((byte) -84);
            if (this.field_I.field_q != -1) {
              this.field_o = wn.field_f[this.field_I.field_q];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_254_0 = var3;
          stackIn_254_1 = new StringBuilder().append("uf.F(");
          if (param0 == null) {
            stackIn_255_2 = "null";
          } else {
            stackIn_255_2 = "{...}";
          }
          throw wm.a((Throwable) (stackIn_254_0), ((StringBuilder) (Object) stackIn_254_1).append(stackIn_255_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int fieldTemp$1 = 0;
        pq var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 != 0) {
            this.field_Z = 125;
          }
          var3 = this.field_I.field_l[param1];
          if (!var3.field_o) {
            var3.field_k = this.field_P - 264 << 16;
            var3.field_j = 33554432;
            var3.field_g = id.field_a[3].field_z + 9 - 320 << 16;
            var3.d((byte) 115);
            var3.field_o = true;
            var3.field_p = true;
            fieldTemp$1 = this.field_C;
            this.field_C = this.field_C + 1;
            this.field_ib[fieldTemp$1] = param1;
            am.field_q = 250;
            ff.field_c = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3_ref), "uf.QB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void y(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var2_int = 0;
          do {
            if (!(this.field_I.field_l.length > var2_int)) {
              dq.field_a.a(param0 ^ 2147483630, this.field_I);
              id.field_c.field_g = true;
              hh.field_c = true;
              break;
            }
            this.field_I.field_l[var2_int].a(118);
            this.field_I.field_l[var2_int].field_p = true;
            var2_int++;
          } while (var3 == 0);
          if (param0 != 17) {
            this.field_m = 107;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "uf.E(" + param0 + ')');
        }
    }

    final void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            return;
          }
          if (this.k(-38)) {
            if (id.field_c.field_g) {
              id.field_c.a(param0 + 1, this);
              this.field_p = -1;
              this.field_g = -1;
            }
            id.field_c.a(32624, this.field_ab);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.RD(" + param0 + ')');
        }
    }

    final void a(ge param0, boolean param1) {
        boolean discarded$1 = false;
        RuntimeException runtimeException = null;
        qe var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_I.j(23);
          if (0 != var3.field_q) {
            param0.field_v = param0.field_v + 8;
            return;
          }
          if (this.field_db == var3.field_L) {
            param0.field_v = param0.field_v + 8;
            return;
          }
          this.field_b.a(65280, param0);
          hh.field_c = true;
          id.field_c.field_g = true;
          if (param1) {
            discarded$1 = this.a(44, 37, -38, -117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("uf.N(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void D(int param0) {
        int dupTemp$0 = 0;
        boolean stackIn_52_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        qe var2 = null;
        int[] var2_array = null;
        RuntimeException var2_ref = null;
        qe var3_ref_qe = null;
        al var3_ref_al = null;
        int var3 = 0;
        kj var4_ref_kj = null;
        qe var4_ref_qe = null;
        int var4 = 0;
        al var5_ref_al = null;
        pq[] var5_ref_pq__ = null;
        int var5 = 0;
        qe var6_ref_qe = null;
        int var6 = 0;
        pq[] var6_ref_pq__ = null;
        int var7 = 0;
        qe var7_ref_qe = null;
        pq var8 = null;
        int var9 = 0;
        int var10_int = 0;
        pq var10 = null;
        int var11_int = 0;
        pq var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        long var19 = 0L;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        var27 = Pool.field_O;
        try {
          if (0 != this.field_I.j(43).field_q) {
            return;
          }
          if (hh.field_c) {
            var2 = new qe();
            var3_ref_qe = var2;
            var4_ref_kj = this.field_G;
            var3_ref_qe.field_H = (byte)var4_ref_kj.field_e;
            var3_ref_qe.field_C = (short)((1024 + var4_ref_kj.field_h) % 2048);
            var3_ref_qe.field_D = (byte)var4_ref_kj.field_d;
            var3_ref_qe.field_V = (short)var4_ref_kj.field_n;
            var3_ref_qe.field_A = (short)var4_ref_kj.field_k;
            var2.field_V = (short) 2048;
            var3_ref_al = this.field_I;
            var4_ref_qe = var2;
            o.field_y = 0;
            if (null != pq.field_B && (pq.field_B.length != 0 ||
              var27 != 0) && (!(var4_ref_qe.field_D * var4_ref_qe.field_D + var4_ref_qe.field_H * var4_ref_qe.field_H > 9216) ||
              var27 != 0)) {
              var5_ref_al = var3_ref_al;
              var6_ref_qe = var4_ref_qe;
              var7 = 0;
              do {
                if (!(var7 < var5_ref_al.field_l.length)) {
                  pc.field_a = pq.field_B[0];
                  break;
                }
                pq.field_B[0][var7].a(var5_ref_al.field_l[var7], (byte) -12);
                var7++;
              } while (var27 == 0);
              var7_ref_qe = var6_ref_qe;
              var8 = pq.field_B[0][0];
              var9 = var7_ref_qe.field_D * var7_ref_qe.field_D + var7_ref_qe.field_H * var7_ref_qe.field_H;
              if (var9 > 9216) {
                throw new IllegalStateException("Strike point out of range! " + var7_ref_qe.field_D + "," + var7_ref_qe.field_H);
              }
              var10_int = -rf.a(65536 - (var9 << 2), -125) >> 9;
              var11_int = ao.a((int) var7_ref_qe.field_A, true);
              var12 = hc.a(2047, (int) var7_ref_qe.field_A);
              var13 = ao.a((int) var7_ref_qe.field_C, true);
              var14 = hc.a(2047, (int) var7_ref_qe.field_C);
              var15 = var13;
              var16 = -var14;
              var17 = aj.a(var11_int, false, -var16);
              var18 = aj.a(var11_int, false, var15);
              var19_int = var12;
              var20 = -(var19_int * var16) + var18 * 0 >> 16;
              var21_int = -(var17 * 0) + var19_int * var15 >> 16;
              var22 = var17 * var16 - var18 * var15 >> 16;
              var23 = var20 * var7_ref_qe.field_H + (var15 * var7_ref_qe.field_D + var10_int * var17) >> 9;
              var24 = var16 * var7_ref_qe.field_D + (var18 * var10_int + var7_ref_qe.field_H * var21_int) >> 9;
              var25 = var10_int * var19_int + var7_ref_qe.field_D * 0 + var22 * var7_ref_qe.field_H >> 9;
              var8.field_I = lh.a(uh.field_q, (byte) -79, (long)(int)(od.a((long)(var7_ref_qe.field_V * var17), (long)kj.field_f, false) / 4096L));
              var8.field_t = lh.a(uh.field_q, (byte) -116, (long)(int)(od.a((long)(var7_ref_qe.field_V * var18), (long)kj.field_f, false) / 4096L));
              var8.field_v = 1;
              var26 = lh.a(uh.field_w, (byte) -93, (long)(int)(od.a((long)(var7_ref_qe.field_V * bl.field_g), (long)kj.field_f, false) / 4096L));
              var8.field_n = aj.a(-aj.a(var18, false, var25), false, var26);
              var8.field_b = aj.a(aj.a(var17, false, var25), false, var26);
              var8.field_K = aj.a(aj.a(var18, false, var23) - aj.a(var17, false, var24), false, var26);
              fn.f(-13164);
              L1: do {
                hb.field_s = -1;
                td.field_b = 0;
                or.field_l = 0;
                var5_ref_pq__ = pc.field_a;
                var6 = 0;
                while (var6 < var5_ref_pq__.length) {
                  var5_ref_pq__[var6].field_w = 0;
                  var6++;
                  if (var27 != 0) {
                    break L1;
                  }
                }
                var5 = 0;
                while (true) {
                  dupTemp$0 = oe.a(var3_ref_al.field_c, var5, pc.field_a, var3_ref_al.field_e, 0);
                  var5 = dupTemp$0;
                  if (dupTemp$0 != -1) {
                    if (fn.f(-13164)) {
                      continue;
                    }
                    break L1;
                  }
                  break;
                }
                var6_ref_pq__ = pc.field_a;
                var7 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (var6_ref_pq__.length <= var7))) {
                  stackIn_52_0 = var6_ref_pq__[var7].field_s;
                  if (var27 == 0) {
                    if (stackIn_52_0) {
                      var6_ref_pq__[var7].a(false);
                    }
                    var7++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var3_ref_al.a(6582, pc.field_a, var4_ref_qe);
                  stackIn_52_0 = fn.f(-13164);
                }
                if (!stackIn_52_0) {
                  break L1;
                }
              } while (bk.a(pc.field_a, (byte) 57));
            }
            hh.field_c = false;
          }
          if (param0 >= -120) {
            this.field_O = (mm) null;
          }
          var2_array = this.field_ab;
          wh.field_g = 0;
          if (0L != (pd.field_i & 16384L) &&
            var27 == 0) {
            return;
          }
          if (null != pq.field_B) {
            if (pq.field_B.length == 0 &&
              var27 == 0) {
              return;
            }
            var3 = 0;
            do {
              stackIn_75_0 = var3;
              stackIn_75_1 = $cfr$lcmp(~(pd.field_i & 8589934592L), -1L);
              L21: while (true) {
                if (stackIn_75_1 == 0) {
                  stackIn_80_1 = pc.field_a.length;
                } else {
                  stackIn_80_1 = 1;
                  if (var27 == 0) {
                  }
                }
                if (stackIn_75_0 >= stackIn_80_1) {
                  return;
                }
                var4 = ea.field_p << 11;
                var5 = 0;
                var8 = pq.field_B[0][var3];
                var9 = 1;
                while (o.field_y > var9) {
                  var10 = pq.field_B[-1 + var9][var3];
                  var11 = pq.field_B[var9][var3];
                  var6 = var5 + (var10.field_w & 65535);
                  stackIn_75_0 = 0;
                  stackIn_75_1 = var11.field_w;
                  if (var27 != 0) {
                    continue L21;
                  }
                  if (stackIn_75_0 == stackIn_75_1 ||
                    !(var11.field_w < 65536)) {
                    var7 = var5 + 65536;
                  } else {
                    var7 = var5 + var11.field_w;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  if (~var10.field_g == ~var11.field_g &&
                    ~var10.field_k == ~var11.field_k) {
                    var5 = var5 + 65536;
                  } else {
                    var12 = var4 + var5;
                    if (var12 >= var6 &&
                      var7 > var12 && ((0 != var10.field_v ||
                      0 != var11.field_v) &&
                      (var10.field_v != 2 ||
                      var11.field_v != 2))) {
                      var13 = (-var12 + (o.field_y << 16)) / o.field_y >> 8;
                      var14 = (var11.field_g - var10.field_g >> 13) * (var12 - var6) / (var7 - var6) + (var10.field_g >> 13);
                      var15 = (var10.field_k >> 13) + (-var10.field_k + var11.field_k >> 13) * (-var6 + var12) / (-var6 + var7);
                      var16 = -64;
                      var17 = -(var8.field_g >> 13) + var14;
                      var18 = -(var8.field_k >> 13) + var15;
                      var19 = (long)(var17 * var17 + var18 * var18);
                      var21 = bm.a(-127, var19 << 10) >> 13;
                      decompiledFrameRemainder0 = (!(var21 < 48L) ||
                        var27 != 0);
                      if (decompiledFrameRemainder0) {
                        if (80L > var21) {
                          var23 = (int)(-48L + var21);
                          var13 = var13 * var23 / 32;
                        }
                        var16 = var16 - var2_array[2];
                        var14 = var14 - var2_array[0];
                        var15 = var15 - var2_array[1];
                        var23 = var2_array[10] * var15 + var14 * var2_array[9] + var16 * var2_array[11] >> 16;
                        decompiledFrameRemainder0 = (!(0 >= var23) ||
                          var27 != 0);
                        if (decompiledFrameRemainder0) {
                          var24 = var2_array[5] * var16 + var2_array[3] * var14 + var2_array[4] * var15 >> 3;
                          var25 = var2_array[8] * var16 + (var2_array[6] * var14 + var2_array[7] * var15) >> 3;
                          if (var23 == 0) {
                            var23 = 1;
                          }
                          var24 = var24 / var23 + 5120;
                          var25 = 3840 + var25 / var23;
                          var13 = (var13 << 10) / var23;
                          if (4088 < var13) {
                            var13 = 4088;
                          }
                          rb.field_e[wh.field_g].field_c = var14;
                          rb.field_e[wh.field_g].field_e = var15;
                          rb.field_e[wh.field_g].field_a = var16;
                          rb.field_e[wh.field_g].field_h = var24;
                          rb.field_e[wh.field_g].field_f = var25;
                          rb.field_e[wh.field_g].field_b = var13;
                          rb.field_e[wh.field_g].field_d = var3;
                          wh.field_g = wh.field_g + 1;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder0) && (var11.field_w == 0 ||
                      !(var11.field_w < 65536))) {
                      var5 = var5 + 65536;
                    }
                  }
                  var9++;
                }
                break;
              }
              var3++;
            } while (var27 == 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.FA(" + param0 + ')');
        }
    }

    private final void t(byte param0) {
        int fieldTemp$0 = 0;
        oo stackIn_16_0;
        int stackIn_16_1;
        int[] stackIn_16_2;
        int stackIn_16_3;
        int[] stackIn_16_4;
        int stackIn_17_5 = 0;
        int stackIn_19_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        aa var2 = null;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        cr var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        var4 = Pool.field_O;
        try {
          boolean decompiledFrameCompleted1 = true;
          if (or.field_l > 0) {
            var2_int = 0;
            while (!(or.field_l <= var2_int)) {
              var3_int = wd.field_Qb[var2_int];
              stackIn_19_0 = $cfr$lcmp(16777216L & pd.field_i, 0L);
              if (var4 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_19_0 != 0) {
                System.out.println("bbmom: " + lo.a((long)var3_int, 7697781));
              }
              if (var3_int > 16777216) {
                var3_int = 192;
              } else {
                var3_int = 192 * var3_int >> 23;
              }
              stackIn_16_0 = kh.field_gc;
              stackIn_16_1 = 1336449640;
              stackIn_16_2 = this.field_ab;
              stackIn_16_3 = 32 + var3_int;
              stackIn_16_4 = new int[]{wm.field_ac[var2_int][0] >> 13, wm.field_ac[var2_int][1] >> 13, wm.field_ac[var2_int][2] >> 13};
              if (65536 >= var3_int) {
                stackIn_17_5 = 3;
              } else {
                stackIn_17_5 = 2;
              }
              ((oo) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_17_5);
              var2_int++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_19_0 = param0;
          }
          if (stackIn_19_0 >= -69) {
            this.field_q = true;
          }
          boolean decompiledFrameCompleted0 = true;
          if (td.field_b > 0) {
            var2_int = 0;
            while (!(td.field_b <= var2_int)) {
              var3_intLifetime1 = cf.field_g[var2_int];
              stackIn_38_0 = $cfr$lcmp(-1L, ~(16777216L & pd.field_i));
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_38_0 != 0) {
                System.out.println("bwmom: " + lo.a((long)var3_intLifetime1, 7697781));
              }
              if (var3_intLifetime1 <= 134217728) {
                var3_intLifetime1 = 192 * var3_intLifetime1 >> 26;
              } else {
                var3_intLifetime1 = 192;
              }
              kh.field_gc.a(1336449640, this.field_ab, 32 + var3_intLifetime1, new int[]{nn.field_e[var2_int][0] >> 13, nn.field_e[var2_int][1] >> 13, nn.field_e[var2_int][2] >> 13}, 5);
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_38_0 = 0;
          }
          if (stackIn_38_0 < this.field_I.field_j) {
            var2 = new aa(this.field_I.j(25).field_m);
            var3 = (cr) (var2.a(0));
            do {
              if (var3 == null) {
                return;
              }
              fieldTemp$0 = this.field_I.field_j;
              this.field_I.field_j = this.field_I.field_j - 1;
              if (fieldTemp$0 <= 0) {
                return;
              }
              kh.field_gc.a(this.field_ab, 4, -94, new int[]{this.field_I.field_w[var3.field_r].field_g >> 13, this.field_I.field_w[var3.field_r].field_f >> 13, -64});
              var3 = (cr) (var2.c((byte) -71));
            } while (var4 == 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "uf.MC(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, byte param2) {
        String discarded$1 = null;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 4) {
            discarded$1 = this.H(-68);
          }
          stackIn_4_0 = (int)Math.round(Math.pow((double)param1 / (double)param0, 2.0) * 4096.0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "uf.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void l(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -37) {
            this.J(53);
          }
          if (!this.i(-1)) {
            this.E(param0 ^ 24097);
          } else {
            if (0 <= this.field_I.j(param0 ^ -86).field_M) {
              this.field_G.field_h = 0;
            } else {
              if (this.field_M != 0) {
                this.field_G.a(this.field_eb, this.field_I.field_l[0], (byte) -106);
              }
            }
            this.a((byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.EC(" + param0 + ')');
        }
    }

    private final boolean v(byte param0) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = -79 % ((param0 + 33) / 60);
          for (var3 = 0; var3 < this.field_I.field_l.length; var3++) {
            if (this.field_I.field_l[var3].field_s &&
              this.field_I.field_l[var3].field_v != 0 &&
              !this.a(this.field_I.field_l[var3].field_j, this.field_I.field_l[var3].field_g, -98, this.field_I.field_l[var3].field_k)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.NC(" + param0 + ')');
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3) {
        float[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 82 / ((-30 - param2) / 57);
          var5 = new float[]{(float)(0 * param1), (float)(param3 * 0), (float)(param0 * 0)};
          ag.a(this.field_ab, var5, 9);
          stackIn_13_0 = (0.0f <= var5[0]) && (var5[0] <= 640.0f) && (var5[1] >= 0.0f) && (480.0f >= var5[1]);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var5_ref), "uf.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void F(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if ((hq.field_c & this.field_L) == 0) {
            throw new IllegalStateException();
          }
          if (param0 != 1791) {
            this.field_c = (hq) null;
          }
          ej.field_j.b(false, 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.C(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(sa.field_h.field_w, this.field_I.field_u, (byte) 27);
          if (this.field_I.field_i != null) {
            this.a(sa.field_h.field_w + 320, this.field_I.field_i, (byte) 27);
          }
          if (param0 != -28) {
            this.g(35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.U(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          kh.field_gc.b(122);
          if (param0 != 3) {
            field_W = -119;
          }
          kh.field_gc.c(true);
          while (true) {
            if (kh.field_gc.field_H < kh.field_gc.field_G) {
              kh.field_gc.j(2);
              if (var3 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          this.K(0);
          id.field_c.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.J(" + param0 + ')');
        }
    }

    private final boolean I(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 != this.field_I.j(66).field_q) {
            return false;
          }
          var2_int = this.g((byte) 102);
          var3 = -81 % ((-57 - param0) / 54);
          if (var2_int == -1 &&
            !this.field_T) {
            return false;
          }
          this.b((byte) 121, -wp.field_d << 7);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.CE(" + param0 + ')');
        }
    }

    final boolean k(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -38) {
            this.o((byte) 53);
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = this.field_I.j(52).field_q;
          if (var2_int != 0 && (1 != var2_int ||
            this.field_B >= 37)) {
            stackIn_13_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_13_0 = true;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.NB(" + param0 + ')');
        }
    }

    private final void b(qe param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        pq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          if (this.field_S < 0) {
            if ((hq.field_c & this.field_L) == 0) {
              if ((f.field_f & this.field_L) == 0 && !this.field_I.field_o && (this.field_I.field_i == null ||
                this.field_I.field_i.c(0)) && 0L == (512L & pd.field_i) && this.field_I.field_q != -1) {
                this.field_o = this.field_o - 1;
                if (0 == this.field_o) {
                  this.v(0);
                  if (var4 != 0 &&
                    this.field_o > 1) {
                    this.field_o = this.field_o - 1;
                  }
                }
              }
            } else {
              if (this.field_o > 1) {
                this.field_o = this.field_o - 1;
              }
            }
            if (0 != (this.field_L & hq.field_c) &&
              this.i(-1)) {
              fieldTemp$0 = this.field_m;
              this.field_m = this.field_m + 1;
              if (fieldTemp$0 >= 50) {
                if (this.field_w == null ||
                  !this.field_G.a(-2043, this.field_w)) {
                  ej.field_j.b(false, 70);
                  this.field_G.a(ej.field_j, (byte) 106);
                  if (this.field_w != null) {
                    this.field_w.b(param1 ^ -17639, this.field_G);
                    if (var4 != 0) {
                      this.field_w = this.field_G.a(-14513);
                    }
                  } else {
                    this.field_w = this.field_G.a(-14513);
                  }
                }
                this.field_m = 0;
              }
              if (param0.field_u != 0) {
                fieldTemp$1 = this.field_d;
                this.field_d = this.field_d + 1;
                if (fieldTemp$1 >= 50) {
                  this.j((byte) -8);
                }
              }
            }
          }
          if (param1 != -17601) {
            this.m(-67);
          }
          if (!this.i(-1)) {
            var3 = this.field_I.field_l[0];
            if (~param0.field_P == ~var3.field_g &&
              ~param0.field_Q == ~var3.field_k) {
              return;
            }
            var3.field_k = var3.field_k + (-var3.field_k + param0.field_Q >> 3);
            hh.field_c = true;
            var3.field_g = var3.field_g + (param0.field_P - var3.field_g >> 3);
            id.field_c.field_g = true;
            var3.field_p = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_80_0 = var3_ref;
          stackIn_80_1 = new StringBuilder().append("uf.FE(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, ge param1) {
        RuntimeException runtimeException = null;
        qe var3 = null;
        qe var4 = null;
        ge var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_I.j(23);
          var6 = 62 % ((-58 - param0) / 63);
          var4 = var3;
          var5 = param1;
          var4.field_P = var5.b(true);
          var4.field_Q = var5.b(true);
          if (0L != (pd.field_i & 2097152L)) {
            System.out.println("<-S2C_BALL_MANHANDLED: " + vi.a((byte) 111, 16, 4, (long)var3.field_P) + "," + vi.a((byte) 55, 16, 4, (long)var3.field_Q));
          }
          id.field_c.field_g = true;
          hh.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("uf.RC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        pq var10 = null;
        float var11 = 0.0f;
        int var12 = 0;
        try {
          var12 = this.field_Z;
          if (var12 != 0) {
            if (1 == var12) {
              this.x(1);
              var2_double = Math.abs(this.field_eb.field_d);
              var4 = Math.abs(576.0 - this.field_eb.field_d);
              var6 = Math.abs(this.field_eb.field_a);
              var8 = Math.abs(288.0 - this.field_eb.field_a);
              this.field_O.field_h = -256.0;
              if (var2_double < var4 &&
                var2_double < var6 &&
                var8 > var2_double) {
                this.field_O.field_d = -120.0;
              } else if (var6 > var4 &&
                var4 < var8) {
                this.field_O.field_d = 696.0;
              } else {
                if (!(var8 > var6)) {
                  this.field_O.field_a = 408.0;
                } else {
                  this.field_O.field_a = -120.0;
                }
              }
              this.field_R = -1;
            } else {
              if (var12 != 2) {
                if (var12 != 3) {
                  if (var12 == 4) {
                    this.t(0);
                  }
                } else {
                  var10 = this.field_I.field_l[0];
                  var11 = (float)var10.g(-8);
                  if (var10.field_s) {
                    this.field_O.field_f = (double)pf.b(127, var10.field_g);
                    this.field_O.field_m = (double)pf.b(126, var10.field_k);
                    this.field_O.field_k = (double)pf.b(127, var10.field_j);
                    this.field_O.field_d = (double)(pf.b(126, var10.field_g) - 80.0f * ((float)var10.field_I / var11));
                    this.field_O.field_a = (double)(pf.b(127, var10.field_k) - 80.0f * ((float)var10.field_t / var11));
                    this.field_O.field_h = (double)(-24.0f + pf.b(126, var10.field_j));
                  }
                }
              } else {
                this.g(124);
                if (this.v((byte) -96)) {
                }
              }
            }
          }
          if (param0 > -25) {
            this.a(false, -39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "uf.FC(" + param0 + ')');
        }
    }

    uf(int param0, int param1, int param2, int param3, int param4, boolean param5, String[] param6, int param7, boolean param8) {
        pq[] array$0 = null;
        pq[] array$1 = null;
        boolean stackIn_4_1 = false;
        String stackIn_20_0 = null;
        int stackIn_53_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_85_0 = 0;
        Object stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var10 = null;
        int var11 = 0;
        String var11_ref_String = null;
        al var11_ref_al = null;
        al var12_ref_al = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var11Lifetime1;
        var16 = Pool.field_O;
        this.field_h = 0;
        this.field_Y = false;
        this.field_kb = false;
        this.field_d = 0;
        this.field_V = -1;
        this.field_m = 0;
        this.field_T = false;
        this.field_p = -1;
        this.field_e = -1;
        this.field_k = -1;
        this.field_t = 0;
        this.field_H = false;
        this.field_g = -1;
        this.field_Q = 0;
        this.field_j = false;
        this.field_N = -1;
        this.field_A = 0;
        this.field_u = 0;
        this.field_f = 57;
        this.field_l = 0;
        this.field_q = false;
        this.field_Z = 0;
        this.field_eb = new mm();
        this.field_O = new mm();
        this.field_o = 0;
        this.field_ab = new int[12];
        this.field_a = 500;
        this.field_R = -1;
        this.field_D = true;
        this.field_M = -1;
        this.field_v = -1;
        this.field_C = 0;
        try {
          this.field_L = param0;
          this.field_db = param7;
          this.field_r = param8;
          stackIn_4_1 = !(hq.field_i < 2);
          this.field_bb = stackIn_4_1;
          un.a(676);
          vi.a(-7414);
          this.a(param6, param2, -112, param1);
          var10 = null;
          if ((f.field_f & this.field_L) != 0) {
            var10 = gj.a(true, 0, oo.field_c, Pool.field_M);
          } else {
            if (0 != (hq.field_c & this.field_L) &&
              im.field_ic[param2] != null) {
              var11 = 0;
              while (true) {
                if (var11 < this.field_I.field_n) {
                  stackIn_20_0 = this.e(-30360, var11);
                  if (var16 == 0) {
                    var11++;
                    continue;
                  }
                } else {
                  stackIn_20_0 = this.field_I.field_f.a(1, this.field_i);
                }
                break;
              }
              var11_ref_String = stackIn_20_0;
              if (null != var11_ref_String) {
                var10 = gj.a(true, 0, im.field_ic[param2], var11_ref_String);
              }
            }
          }
          this.field_S = 200;
          if (var10 != null) {
            ((ij) (var10)).field_B = 250;
          }
          if (0 == (hq.field_c & this.field_L)) {
            this.c((byte) -102);
          }
          boolean decompiledSharedTail0 = ((hq.field_c & this.field_L) != 0 &&
            -2 != this.field_db);
          if (!decompiledSharedTail0) {
            lc.field_U = null;
            decompiledSharedTail0 = (var16 != 0);
          }
          if (decompiledSharedTail0) {
            lc.field_U = new vh("chat_toggle", (vh) null, 0, 440, 60, 20, ua.field_n);
            lc.field_U.field_Gb = lb.field_O;
            lc.field_U.field_F = hm.field_l;
            lc.field_U.field_hb = ta.field_e;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param5) {
            var11_ref_al = this.field_I;
            f.field_g = 12;
            var12_ref_al = var11_ref_al;
            pq.field_B = new pq[12][];
            var13 = 0;
            L15: while (true) {
              if (var13 < pq.field_B.length) {
                array$0 = new pq[var12_ref_al.field_l.length];
                pq.field_B[var13] = array$0;
                stackIn_53_0 = 0;
                if (var16 != 0) {
                  break L15;
                }
                var14 = stackIn_53_0;
                while (pq.field_B[var13].length > var14) {
                  pq.field_B[var13][var14] = new pq();
                  var14++;
                }
                var13++;
                continue;
              }
              rb.field_e = new ar[12 * pq.field_B.length];
              stackIn_53_0 = 0;
              break;
            }
            var13 = stackIn_53_0;
            do {
              if (!(var13 < rb.field_e.length)) {
                wh.field_g = 0;
                break;
              }
              rb.field_e[var13] = new ar();
              var13++;
            } while (var16 == 0);
          }
          if (!param5 ||
            var16 != 0) {
            var11_ref_al = this.field_I;
            f.field_g = 0;
            var12_ref_al = var11_ref_al;
            pq.field_B = new pq[][]{};
            var13 = 0;
            L24: while (true) {
              if (pq.field_B.length > var13) {
                array$1 = new pq[var12_ref_al.field_l.length];
                pq.field_B[var13] = array$1;
                stackIn_73_0 = 0;
                if (var16 != 0) {
                  break L24;
                }
                var14 = stackIn_73_0;
                while (pq.field_B[var13].length > var14) {
                  pq.field_B[var13][var14] = new pq();
                  var14++;
                }
                var13++;
                continue;
              }
              rb.field_e = new ar[pq.field_B.length * 0];
              stackIn_73_0 = 0;
              break;
            }
            var13 = stackIn_73_0;
            while (rb.field_e.length > var13) {
              rb.field_e[var13] = new ar();
              var13++;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              wh.field_g = 0;
            }
          }
          if (decompiledFrameCompleted0) {
            this.c(param4, param3, 125);
          }
          var11Lifetime1 = this.field_I.j(97).field_M;
          var12 = f.field_g;
          if (null != pq.field_B) {
            stackIn_85_0 = pq.field_B.length;
          } else {
            stackIn_85_0 = 0;
          }
          var13 = stackIn_85_0;
          var14 = 1465 + var11Lifetime1 - var12;
          vm.field_f = vm.field_f & 65280;
          var15 = -var11Lifetime1 + 940 + var13;
          wq.field_c = -16777216 & wq.field_c | 39595 + var14;
          dk.field_f = 7621 * var14 + var15;
          field_fb = 998899712 + (var15 << 16);
          if ((this.field_L & hq.field_c) != 0) {
            this.field_b = new kj();
          }
          this.a(-23095);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_93_0 = var10;
          stackIn_93_1 = new StringBuilder().append("uf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          throw wm.a((Throwable) (stackIn_93_0), ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    uf(hq param0, String[] param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_Y = false;
        this.field_kb = false;
        this.field_d = 0;
        this.field_V = -1;
        this.field_m = 0;
        this.field_T = false;
        this.field_p = -1;
        this.field_e = -1;
        this.field_k = -1;
        this.field_t = 0;
        this.field_H = false;
        this.field_g = -1;
        this.field_Q = 0;
        this.field_j = false;
        this.field_N = -1;
        this.field_A = 0;
        this.field_u = 0;
        this.field_f = 57;
        this.field_l = 0;
        this.field_q = false;
        this.field_Z = 0;
        this.field_eb = new mm();
        this.field_O = new mm();
        this.field_o = 0;
        this.field_ab = new int[12];
        this.field_a = 500;
        this.field_R = -1;
        this.field_D = true;
        this.field_M = -1;
        this.field_v = -1;
        this.field_C = 0;
        try {
          stackIn_4_1 = !(hq.field_i < 2);
          this.field_bb = stackIn_4_1;
          this.field_db = 0;
          this.field_L = sk.field_d;
          this.a(76, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("uf.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_s = "Press <img=4> to leave shot mode for top-view.";
        field_J = "Type your age in years";
        field_X = 0;
        field_K = "Mouse Y-axis: Normal";
        field_fb = 0;
        field_y = new byte[1000][];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
