/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends cj implements cm, ij, nc {
    private br field_L;
    private ck field_R;
    private br field_F;
    oj field_V;
    static String field_K;
    static String field_S;
    private br field_Q;
    static ka field_P;
    static int field_M;
    private br field_T;
    private br field_H;
    private d field_O;
    private pn field_N;
    private d field_I;
    private br field_U;
    static int field_E;
    static int field_G;
    static nj field_J;

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        boolean discarded$0 = false;
        try {
            if (this.field_O == param1) {
                sg.b((byte) 81);
            } else {
                if (param1 == this.field_I) {
                    discarded$0 = this.a((byte) 14);
                }
            }
            int var6_int = 17 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean a(ik param0, int param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ba var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a((byte) -5);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 71 % ((param1 - 44) / 48);
              var5 = var3.a(-23996);
              if (var5 != ir.field_a) {
                if (var5 != tk.field_n) {
                  if (var5 != nh.field_r) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("mk.L(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0 != 0;
              } else {
                return stackIn_14_0 != 0;
              }
            }
          }
        }
    }

    private final boolean a(byte param0) {
        if (!(this.l(param0 ^ -6553))) {
            return false;
        }
        int var2 = -1;
        if (param0 != 14) {
            return false;
        }
        try {
            var2 = Integer.parseInt(this.field_T.field_w);
        } catch (NumberFormatException numberFormatException) {
        }
        return bg.a(this.field_H.field_w, var2, this.field_F.field_w, this.field_R.field_G, this.field_U.field_w, (byte) 66, (mk) (this));
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        RuntimeException runtimeException = null;
        iq var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) 34, param1, param2, param3);
              this.field_I.field_F = this.l(-6551);
              if (param0 > 6) {
                break L1;
              } else {
                var6 = (iq) null;
                this.a('￳', -83, 76, (iq) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final int b(String param0, int param1, iq param2, int param3, int param4) {
        boolean discarded$1 = false;
        mg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 45) {
                break L1;
              } else {
                discarded$1 = this.l(115);
                break L1;
              }
            }
            var6 = new mg(20, param4, param3 + 120, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
            this.c((byte) 107, var6);
            stackIn_3_0 = var6.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("mk.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, int param1, iq param2, int param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        lr var7 = null;
        String var8 = null;
        mg var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 268) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a(107, -127, -24, (iq) null, (String) null, -91, (String) null);
                break L1;
              }
            }
            var9 = new mg(20, param3, 120 + param1, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
            this.c((byte) -75, var9);
            var7 = new lr(((ik) ((Object) param2)).a((byte) -5));
            this.c((byte) 79, var7);
            var7.a(false, var9.field_n + (var9.field_o - -3), var9.field_t + (-15 + var9.field_s >> -1300490943), 15, 15);
            stackIn_3_0 = var9.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("mk.J(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(pn param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        iq var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param3 == 70) {
              break L0;
            } else {
              var7 = (iq) null;
              this.a('', -23, 79, (iq) null);
              break L0;
            }
          }
          if (param1 == 0) {
            se.a("terms.ws", 12);
            return;
          } else {
            if ((param1 ^ -1) == -2) {
              se.a("privacy.ws", 12);
              return;
            } else {
              if (-3 == (param1 ^ -1)) {
                se.a("conduct.ws", 12);
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("mk.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String i(int param0) {
        if (param0 != 23559) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean l(int param0) {
        if (this.a(this.field_H, param0 ^ 6537)) {
          if (this.a(this.field_F, -44)) {
            if (this.a(this.field_L, -102)) {
              if (this.a(this.field_U, -61)) {
                if (this.a(this.field_Q, param0 ^ 6625)) {
                  if (this.a(this.field_T, -16)) {
                    if (param0 != -6551) {
                      mk.b(-8, -69);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final String j(int param0) {
        if (param0 != 10000536) {
            mk.b(8, -116);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param2) {
                stackIn_7_0 = this.a(param1 ^ 32340, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 == 99) {
                  stackIn_11_0 = this.b((byte) -72, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("mk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public mk() {
        super(0, 0, 496, 0, (ur) null);
        this.field_H = new br("", (uf) null, 12);
        this.field_F = new br("", (uf) null, 100);
        this.field_L = new br("", (uf) null, 100);
        this.field_U = new br("", (uf) null, 20);
        this.field_Q = new br("", (uf) null, 20);
        this.field_T = new br("", (uf) null, 3);
        int var1 = 1;
        this.field_R = new ck("", (uf) null, var1 != 0);
        this.field_I = new d(nq.field_K, (uf) null);
        this.field_O = new d(tc.field_a, (uf) null);
        this.field_H.field_q = ho.field_d;
        this.field_F.field_q = ak.field_f;
        this.field_L.field_q = df.field_i;
        this.field_U.field_q = dl.field_c;
        this.field_Q.field_q = jk.field_c;
        this.field_T.field_q = ed.field_s;
        this.field_R.field_q = pq.field_b;
        this.field_H.a(true, new hk(this.field_H));
        this.field_F.a(true, new dk(this.field_F));
        this.field_L.a(true, new oa(this.field_L, this.field_F));
        this.field_U.a(true, new wc(this.field_U, this.field_H, this.field_F));
        this.field_Q.a(true, new rf(this.field_Q, this.field_U));
        this.field_T.a(true, new na(this.field_T));
        this.field_I.field_F = false;
        this.field_I.field_B = (ur) ((Object) new vo());
        this.field_O.field_B = (ur) ((Object) new jc());
        this.field_H.field_B = (ur) ((Object) new ml(10000536));
        ml dupTemp$0 = new ml(10000536);
        this.field_L.field_B = (ur) ((Object) dupTemp$0);
        this.field_F.field_B = (ur) ((Object) dupTemp$0);
        this.field_T.field_B = (ur) ((Object) new ml(10000536));
        this.field_R.field_B = (ur) ((Object) new kb());
        om dupTemp$1 = new om(10000536);
        this.field_Q.field_B = (ur) ((Object) dupTemp$1);
        this.field_U.field_B = (ur) ((Object) dupTemp$1);
        String var2 = Vertigo2.a(new String[]{this.i(23559), this.j(10000536)}, k.field_b, -125);
        int var3 = 20;
        var3 = var3 + this.b(le.field_c, 48, this.field_F, 170, var3);
        var3 = var3 + (5 + this.a(27557, var3, 20, this.field_L, "", 170, re.field_f));
        var3 = var3 + this.b(uc.field_c, 125, this.field_U, 170, var3);
        var3 = var3 + (5 + this.a(ag.field_c, this.field_Q, var3, ln.field_a, 0, 170));
        var3 = var3 + (this.a(jg.field_m, this.field_H, var3, kd.field_q, 0, 170) - -5);
        var3 = var3 + this.a(po.field_b, 170, this.field_T, var3, 268);
        mg var4 = new mg(46, var3, this.field_n + -90, 25, this.field_R, true, -120 + this.field_n, 5, bl.field_N, 11579568, ll.field_d);
        this.c((byte) 88, var4);
        var3 = var3 + var4.field_s;
        va var5 = new va(qc.field_x, 0, 0, 0, 0, 16777215, -1, 0, 0, qc.field_x.field_z, -1, 2147483647, true);
        this.field_N = new pn(var2, var5);
        this.field_N.field_q = "";
        this.field_N.a(0, 0, fm.field_c);
        this.field_N.a(1, 0, fm.field_c);
        this.field_N.field_v = (uf) (this);
        this.field_N.b(46, var3, (byte) 119, this.field_n - 90);
        var3 = var3 + (15 + this.field_N.field_s);
        this.c((byte) 94, this.field_N);
        int var6 = 4;
        int var7 = 200;
        this.field_I.a(false, 496 - var7 >> 729213281, var3, 40, var7);
        this.field_O.a(false, 3 + var6, 15 + var3, 40, 60);
        this.field_O.field_v = (uf) (this);
        this.field_I.field_v = (uf) (this);
        this.c((byte) 119, this.field_I);
        this.c((byte) 110, this.field_O);
        this.field_V = new oj((nc) (this));
        this.field_V.a(false, 60 + this.field_H.field_n + this.field_H.field_o, 20 + this.field_H.field_t, 150, -this.field_H.field_n + -this.field_H.field_o + this.field_n + -60);
        this.c((byte) 116, this.field_V);
        this.a(false, 0, 0, var6 + (var3 + 55), 496);
    }

    final static void b(int param0, int param1) {
        mi var2;
        int var3;
        var2 = uh.field_Wb;
        var2.j(param1, 120);
        var2.field_u = var2.field_u + 1;
        var3 = var2.field_u;
        var2.f(2, 87);
        var2.a(0, -10140, qc.field_w, qc.field_w.length);
        var2.f(ua.field_a, 103);
        if (param0 >= -76) {
          mk.b(102, 66);
          var2.f(kg.field_y, 106);
          var2.a(0, -10140, dj.field_a, dj.field_a.length);
          var2.b((byte) 24, var2.field_u + -var3);
          return;
        } else {
          var2.f(kg.field_y, 106);
          var2.a(0, -10140, dj.field_a, dj.field_a.length);
          var2.b((byte) 24, var2.field_u + -var3);
          return;
        }
    }

    public static void k(int param0) {
        field_S = null;
        field_K = null;
        field_P = null;
        field_J = null;
        if (param0 != 4) {
            field_E = -33;
        }
    }

    public final void a(int param0) {
        ((hk) ((Object) this.field_H.a((byte) -5))).h(-1);
        if (param0 != -4384) {
            field_K = (String) null;
        }
    }

    private final int a(String param0, iq param1, int param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 == 0) {
              stackIn_4_0 = this.a(param4 ^ 27557, param2, 35, param1, param0, param5, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 85;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("mk.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(int param0, int param1, int param2, iq param3, String param4, int param5, String param6) {
        RuntimeException var8 = null;
        qe var9 = null;
        mg var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = new mg(20, param1, param5 + 120, 25, param3, false, 120, 3, qc.field_x, 16777215, param6);
              this.c((byte) -30, var10);
              var9 = new qe(((ik) ((Object) param3)).a((byte) -5), param4, 126, param1 + var10.field_s, param5 - -50, param2);
              var9.field_v = (uf) (this);
              this.c((byte) -110, var9);
              if (param0 == 27557) {
                break L1;
              } else {
                this.field_R = (ck) null;
                break L1;
              }
            }
            stackIn_3_0 = var9.field_s + var10.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("mk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(String param0, int param1) {
        br var3 = this.field_H;
        String var4 = param0;
        if (param1 != 4944) {
            return;
        }
        try {
            ((kp) ((Object) var3)).a(var4, -74, false);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_K = "Discard";
        field_E = 360;
    }
}
