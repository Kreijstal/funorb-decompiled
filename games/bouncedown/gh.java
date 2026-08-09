/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends lc implements ki, rc, rf {
    private vc field_L;
    private ti field_A;
    private wd field_D;
    private ti field_C;
    private ti field_F;
    static int[] field_I;
    private ff field_G;
    private ti field_E;
    private wd field_K;
    private ti field_J;
    private ti field_B;
    static int field_H;
    nd field_z;

    private final int a(lk param0, String param1, int param2, int param3, int param4) {
        hb var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new hb(20, param2, param3 + param4, 25, param0, false, 120, 3, sg.field_a, 16777215, param1);
            this.b(var6, true);
            stackIn_1_0 = var6.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("gh.K(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(vc param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param3 != 0) {
                if (param3 == 1) {
                  eh.a("privacy.ws", (byte) 21);
                  break L1;
                } else {
                  if (2 != param3) {
                    break L1;
                  } else {
                    eh.a("conduct.ws", (byte) 21);
                    break L1;
                  }
                }
              } else {
                eh.a("terms.ws", (byte) 21);
                break L1;
              }
            }
            if (param1 == 125) {
              break L0;
            } else {
              this.field_A = (ti) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("gh.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(wc param0, int param1) {
        uh var3 = null;
        RuntimeException var3_ref = null;
        vf var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -5389) {
                break L1;
              } else {
                gh.b(true);
                break L1;
              }
            }
            var3 = param0.a(true);
            if (var3 != null) {
              var4 = var3.a((byte) 123);
              if (var4 != a.field_e) {
                if (var4 == ui.field_o) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4 != ha.field_l) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("gh.L(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    private final String e(byte param0) {
        if (param0 <= 3) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 6) {
              if (param4 == this.field_K) {
                oh.b(true);
                return;
              } else {
                if (param4 == this.field_D) {
                  discarded$1 = this.l(80);
                  return;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("gh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final int a(String param0, String param1, int param2, lk param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        s var9 = null;
        hb var10 = null;
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
              var10 = new hb(20, param6, 120 - -param2, 25, param3, false, 120, 3, sg.field_a, 16777215, param1);
              this.b(var10, true);
              var9 = new s(((wc) ((Object) param3)).a(true), param0, 126, param6 + var10.field_m, param2 + 50, param5);
              if (param4 == -123) {
                break L1;
              } else {
                this.field_B = (ti) null;
                break L1;
              }
            }
            var9.field_n = (sk) (this);
            this.b(var9, true);
            stackIn_3_0 = var10.field_m - -var9.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("gh.N(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    public gh() {
        super(0, 0, 496, 0, (fc) null);
        this.field_F = new ti("", (sk) null, 12);
        this.field_B = new ti("", (sk) null, 100);
        this.field_C = new ti("", (sk) null, 100);
        this.field_A = new ti("", (sk) null, 20);
        this.field_E = new ti("", (sk) null, 20);
        this.field_J = new ti("", (sk) null, 3);
        int var1 = 1;
        this.field_G = new ff("", (sk) null, var1 != 0);
        this.field_D = new wd(vg.field_l, (sk) null);
        this.field_K = new wd(rg.field_e, (sk) null);
        this.field_F.field_q = ej.field_e;
        this.field_B.field_q = ta.field_d;
        this.field_C.field_q = pc.field_c;
        this.field_A.field_q = rg.field_b;
        this.field_E.field_q = fd.field_o;
        this.field_J.field_q = jb.field_b;
        this.field_G.field_q = pb.field_g;
        this.field_F.a(new mg(this.field_F), true);
        this.field_B.a(new nj(this.field_B), true);
        this.field_C.a(new cl(this.field_C, this.field_B), true);
        this.field_A.a(new bf(this.field_A, this.field_F, this.field_B), true);
        this.field_E.a(new bd(this.field_E, this.field_A), true);
        this.field_J.a(new hg(this.field_J), true);
        this.field_D.field_y = false;
        this.field_D.field_j = (fc) ((Object) new jh());
        this.field_K.field_j = (fc) ((Object) new r());
        this.field_F.field_j = (fc) ((Object) new tc(10000536));
        tc dupTemp$0 = new tc(10000536);
        this.field_C.field_j = (fc) ((Object) dupTemp$0);
        this.field_B.field_j = (fc) ((Object) dupTemp$0);
        this.field_J.field_j = (fc) ((Object) new tc(10000536));
        this.field_G.field_j = (fc) ((Object) new pj());
        wg dupTemp$1 = new wg(10000536);
        this.field_E.field_j = (fc) ((Object) dupTemp$1);
        this.field_A.field_j = (fc) ((Object) dupTemp$1);
        String var2 = jf.a(mj.field_j, new String[]{this.e((byte) 103), this.a(false)}, (byte) -126);
        int var3 = 20;
        var3 = var3 + this.a(this.field_B, c.field_d, var3, 120, 170);
        var3 = var3 + (this.a("", l.field_a, 170, this.field_C, (byte) -123, 20, var3) - -5);
        var3 = var3 + this.a(this.field_A, ae.field_d, var3, 120, 170);
        var3 = var3 + (this.a(qh.field_d, ml.field_c, var3, (byte) -121, this.field_E, 170) - -5);
        var3 = var3 + (5 + this.a(dg.field_i, pe.field_b, var3, (byte) -121, this.field_F, 170));
        var3 = var3 + this.a(this.field_J, var3, 170, true, rj.field_h);
        hb var4 = new hb(46, var3, -90 + this.field_k, 25, this.field_G, true, -120 + this.field_k, 5, qj.field_d, 11579568, ll.field_D);
        this.b(var4, true);
        var3 = var3 + var4.field_m;
        jd var5 = new jd(sg.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, sg.field_a.field_s, -1, 2147483647, true);
        this.field_L = new vc(var2, var5);
        this.field_L.field_q = "";
        this.field_L.a(ud.field_b, 0, (byte) -77);
        this.field_L.a(ud.field_b, 1, (byte) 36);
        this.field_L.field_n = (sk) (this);
        this.field_L.a(var3, (byte) -65, 46, -90 + this.field_k);
        var3 = var3 + (15 + this.field_L.field_m);
        this.b(this.field_L, true);
        int var6 = 4;
        int var7 = 200;
        this.field_D.b(40, 80, var7, -var7 + 496 >> 750575329, var3);
        this.field_K.b(40, 80, 60, 3 + var6, 15 + var3);
        this.field_K.field_n = (sk) (this);
        this.field_D.field_n = (sk) (this);
        this.b(this.field_D, true);
        this.b(this.field_K, true);
        this.field_z = new nd((rf) (this));
        this.field_z.b(150, 80, -60 + -this.field_F.field_r + this.field_k - this.field_F.field_k, 60 + (this.field_F.field_r - -this.field_F.field_k), 20 + this.field_F.field_i);
        this.b(this.field_z, true);
        this.b(var6 + (var3 - -55), 80, 496, 0, 0);
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_D.field_y = this.k(2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "gh.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean l(int param0) {
        if (!this.k(2)) {
            return false;
        }
        int var2 = -1;
        if (param0 <= 55) {
            return true;
        }
        try {
            var2 = Integer.parseInt(this.field_J.field_h);
        } catch (NumberFormatException numberFormatException) {
        }
        return pg.a(2, (gh) (this), this.field_F.field_h, var2, this.field_B.field_h, this.field_A.field_h, this.field_G.field_z);
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 != param2) {
                if (-100 == (param2 ^ -1)) {
                  stackIn_9_0 = this.a(param0, param3 + 34320);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_5_0 = this.a((byte) -42, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("gh.E(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public final void a(String param0, byte param1) {
        ti var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_F;
            var4 = param0;
            ((ba) ((Object) var3)).a(false, var4, true);
            if (param1 == 43) {
              break L0;
            } else {
              this.a(-97);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("gh.M(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final int a(String param0, String param1, int param2, byte param3, lk param4, int param5) {
        RuntimeException var7 = null;
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
              if (param3 == -121) {
                break L1;
              } else {
                this.field_F = (ti) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, param1, param5, param4, (byte) -123, 35, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("gh.D(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_I = (int[]) null;
            field_I = null;
            return;
        }
        field_I = null;
    }

    private final int a(lk param0, int param1, int param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        la var7 = null;
        hb var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new hb(20, param1, 120 + param2, 25, param0, false, 120, 3, sg.field_a, 16777215, param4);
            this.b(var8, true);
            var7 = new la(((wc) ((Object) param0)).a(param3));
            this.b(var7, true);
            var7.b(15, 80, 15, 3 + (var8.field_r - -var8.field_k), (var8.field_m + -15 >> -2025240255) + var8.field_i);
            stackIn_1_0 = var8.field_m;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("gh.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    private final String a(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return "</col></u>";
    }

    public final void a(int param0) {
        int discarded$0 = 0;
        ((mg) ((Object) this.field_F.a(true))).i((byte) -122);
        if (param0 != -3814) {
            String var3 = (String) null;
            discarded$0 = this.a((lk) null, -19, -5, false, (String) null);
        }
    }

    private final boolean k(int param0) {
        if (this.a((wc) (this.field_F), -5389)) {
          if (this.a((wc) (this.field_B), -5389)) {
            if (this.a((wc) (this.field_C), -5389)) {
              if (this.a((wc) (this.field_A), -5389)) {
                if (this.a((wc) (this.field_E), param0 + -5391)) {
                  if (this.a((wc) (this.field_J), param0 + -5391)) {
                    if (param0 != 2) {
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

    static {
        field_I = new int[8192];
    }
}
