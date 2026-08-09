/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends vd implements nk, qk, kn {
    static String field_Q;
    private vf field_G;
    private sf field_P;
    static int field_H;
    static boolean[] field_O;
    static volatile int field_I;
    private ph field_S;
    private sf field_M;
    private cj field_T;
    static nc field_L;
    private sf field_N;
    private sf field_F;
    static bn field_K;
    private sf field_E;
    private ph field_R;
    private sf field_U;
    mc field_J;

    private final boolean k(int param0) {
        boolean discarded$0 = false;
        if (!(this.c(true))) {
            return false;
        }
        int var2 = -1;
        try {
            if (param0 != -12037) {
                discarded$0 = this.k(105);
            }
            var2 = Integer.parseInt(this.field_F.field_n);
        } catch (NumberFormatException numberFormatException) {
        }
        return ng.a((mk) (this), var2, this.field_G.field_A, this.field_E.field_n, this.field_P.field_n, param0 ^ 3764, this.field_M.field_n);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = -37 / ((-63 - param4) / 52);
            if (param3 != this.field_R) {
              if (this.field_S == param3) {
                discarded$1 = this.k(-12037);
                break L0;
              } else {
                return;
              }
            } else {
              mn.a((byte) -126);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("mk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
    }

    private final int a(String param0, int param1, int param2, ag param3, int param4, String param5) {
        RuntimeException var7 = null;
        ph var8 = null;
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
              if (param4 == 20) {
                break L1;
              } else {
                var8 = (ph) null;
                this.a(-36, 119, 30, (ph) null, (byte) 55);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param2, 3, param0, param5, 35, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("mk.U(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final String j(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.k(59);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String b(boolean param0) {
        if (!param0) {
            ag var3 = (ag) null;
            this.a(76, (ag) null, 126, 'ﾅ');
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(boolean param0, String param1) {
        sf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ph var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_P;
            var4 = param1;
            ((ig) ((Object) var3)).a((byte) 88, false, var4);
            if (param0) {
              break L0;
            } else {
              var5 = (ph) null;
              this.a(-85, -107, 29, (ph) null, (byte) 13);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("mk.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final boolean a(byte param0, sk param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        bm var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
            var3 = param1.a((byte) -121);
            if (var3 != null) {
              if (param0 < -53) {
                var4 = var3.b(-67);
                if (var4 != bi.field_d) {
                  if (var4 != wl.field_c) {
                    if (var4 != bm.field_g) {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 1;
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
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("mk.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0 != 0;
                } else {
                  return stackIn_16_0 != 0;
                }
              }
            }
          }
        }
    }

    final static ca a(boolean param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        Object var7 = null;
        CharSequence var8 = null;
        ca stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = 56 / ((-1 - param2) / 53);
              var5 = 0L;
              var7 = null;
              if (param3.indexOf('@') == -1) {
                var8 = (CharSequence) ((Object) param3);
                var5 = l.a(var8, (byte) 123);
                break L1;
              } else {
                var7 = param3;
                break L1;
              }
            }
            stackIn_4_0 = ul.a(param0, (String) (var7), var5, param1, -115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("mk.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    private final boolean c(boolean param0) {
        if (param0) {
          if (this.a((byte) -118, (sk) (this.field_P))) {
            if (this.a((byte) -114, (sk) (this.field_M))) {
              if (this.a((byte) -96, (sk) (this.field_N))) {
                if (this.a((byte) -108, (sk) (this.field_E))) {
                  if (this.a((byte) -118, (sk) (this.field_U))) {
                    if (!this.a((byte) -63, (sk) (this.field_F))) {
                      return false;
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

    public mk() {
        super(0, 0, 496, 0, (nn) null);
        this.field_P = new sf("", (mh) null, 12);
        this.field_M = new sf("", (mh) null, 100);
        this.field_N = new sf("", (mh) null, 100);
        this.field_E = new sf("", (mh) null, 20);
        this.field_U = new sf("", (mh) null, 20);
        this.field_F = new sf("", (mh) null, 3);
        int var1 = 1;
        this.field_G = new vf("", (mh) null, var1 != 0);
        this.field_S = new ph(ri.field_i, (mh) null);
        this.field_R = new ph(dk.field_l, (mh) null);
        this.field_P.field_i = u.field_g;
        this.field_M.field_i = ul.field_M;
        this.field_N.field_i = db.field_u;
        this.field_E.field_i = qj.field_m;
        this.field_U.field_i = ke.field_x;
        this.field_F.field_i = s.field_h;
        this.field_G.field_i = ql.field_b;
        this.field_P.a(new n(this.field_P), (byte) -77);
        this.field_M.a(new ka(this.field_M), (byte) -52);
        this.field_N.a(new hd(this.field_N, this.field_M), (byte) -84);
        this.field_E.a(new db(this.field_E, this.field_P, this.field_M), (byte) -87);
        this.field_U.a(new li(this.field_U, this.field_E), (byte) -75);
        this.field_F.a(new ld(this.field_F), (byte) -91);
        this.field_S.field_D = false;
        this.field_S.field_h = (nn) ((Object) new ke());
        this.field_R.field_h = (nn) ((Object) new ti());
        this.field_P.field_h = (nn) ((Object) new sd(10000536));
        sd dupTemp$0 = new sd(10000536);
        this.field_N.field_h = (nn) ((Object) dupTemp$0);
        this.field_M.field_h = (nn) ((Object) dupTemp$0);
        this.field_F.field_h = (nn) ((Object) new sd(10000536));
        this.field_G.field_h = (nn) ((Object) new f());
        km dupTemp$1 = new km(10000536);
        this.field_U.field_h = (nn) ((Object) dupTemp$1);
        this.field_E.field_h = (nn) ((Object) dupTemp$1);
        String var2 = vg.a(new String[]{this.j(0), this.b(true)}, 26, bj.field_e);
        int var3 = 20;
        var3 = var3 + this.a(ic.field_o, this.field_M, -99, var3, 170);
        var3 = var3 + (5 + this.a(170, var3, 3, "", wj.field_K, 20, this.field_N));
        var3 = var3 + this.a(qh.field_x, this.field_E, -124, var3, 170);
        var3 = var3 + (5 + this.a(he.field_w, 170, var3, this.field_U, 20, um.field_h));
        var3 = var3 + (this.a(vg.field_f, 170, var3, this.field_P, 20, ua.field_a) + 5);
        var3 = var3 + this.a(this.field_F, 120, gg.field_E, var3, 170);
        nh var4 = new nh(46, var3, this.field_s + -90, 25, this.field_G, true, this.field_s + -120, 5, jn.field_G, 11579568, hm.field_o);
        this.a(51448, var4);
        var3 = var3 + var4.field_x;
        cn var5 = new cn(jd.field_s, 0, 0, 0, 0, 16777215, -1, 0, 0, jd.field_s.field_y, -1, 2147483647, true);
        this.field_T = new cj(var2, var5);
        this.field_T.field_i = "";
        this.field_T.a(-1, jg.field_e, 0);
        this.field_T.a(-1, jg.field_e, 1);
        this.field_T.field_p = (mh) (this);
        this.field_T.a(true, -90 + this.field_s, 46, var3);
        var3 = var3 + (15 + this.field_T.field_x);
        this.a(51448, this.field_T);
        int var6 = 4;
        int var7 = 200;
        this.field_S.a(var7, var3, 0, 496 + -var7 >> -1336240831, 40);
        this.field_R.a(60, var3 - -15, 0, 3 + var6, 40);
        this.field_R.field_p = (mh) (this);
        this.field_S.field_p = (mh) (this);
        this.a(51448, this.field_S);
        this.a(51448, this.field_R);
        this.field_J = new mc((kn) (this));
        this.field_J.a(-this.field_P.field_v + this.field_s + (-this.field_P.field_s - 60), 20 + this.field_P.field_m, 0, this.field_P.field_v + this.field_P.field_s + 60, 150);
        this.a(51448, this.field_J);
        this.a(496, 0, 0, 0, var3 + 55 - -var6);
    }

    public static void l(int param0) {
        field_L = null;
        field_O = null;
        field_Q = null;
        field_K = null;
        if (param0 != 0) {
            String var2 = (String) null;
            mk.b((String) null, (byte) 119);
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
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
                stackIn_7_0 = this.a(param1, (byte) -79);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param2 ^ -1)) {
                  stackIn_11_0 = this.b((byte) -82, param1);
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

            stackIn_14_1 = new StringBuilder().append("mk.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
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

    public final void a(boolean param0) {
        int discarded$0 = 0;
        ((n) ((Object) this.field_P.a((byte) 100))).f(-2);
        if (param0) {
            String var3 = (String) null;
            discarded$0 = this.a((String) null, -114, 4, (ag) null, -112, (String) null);
        }
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_S.field_D = this.c(true);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mk.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, cj param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                field_H = -115;
                break L1;
              }
            }
            if (0 != param1) {
              if ((param1 ^ -1) != -2) {
                if (2 != param1) {
                  break L0;
                } else {
                  l.a("conduct.ws", (byte) -83);
                  return;
                }
              } else {
                l.a("privacy.ws", (byte) 97);
                return;
              }
            } else {
              l.a("terms.ws", (byte) -104);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("mk.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final static byte[] b(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -118) {
                break L1;
              } else {
                field_L = (nc) null;
                break L1;
              }
            }
            stackIn_3_0 = ll.field_e.a(param0, "", 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mk.O(");

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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(ag param0, int param1, String param2, int param3, int param4) {
        RuntimeException var6 = null;
        wj var7 = null;
        nh var8 = null;
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
            var8 = new nh(20, param3, param1 + param4, 25, param0, false, 120, 3, jd.field_s, 16777215, param2);
            this.a(param1 ^ 51328, var8);
            var7 = new wj(((sk) ((Object) param0)).a((byte) 114));
            this.a(param1 + 51328, var7);
            var7.a(15, (var8.field_x + -15 >> 319751713) + var8.field_m, 0, var8.field_v + (var8.field_s - -3), 15);
            stackIn_1_0 = var8.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("mk.P(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(int param0, int param1, int param2, String param3, String param4, int param5, ag param6) {
        RuntimeException var8 = null;
        al var9 = null;
        nh var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new nh(20, param1, 120 + param0, 25, param6, false, 120, param2, jd.field_s, 16777215, param4);
            this.a(51448, var10);
            var9 = new al(((sk) ((Object) param6)).a((byte) 90), param3, 126, param1 + var10.field_x, 50 + param0, param5);
            var9.field_p = (mh) (this);
            this.a(51448, var9);
            stackIn_1_0 = var9.field_x + var10.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("mk.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(String param0, ag param1, int param2, int param3, int param4) {
        nh var6 = null;
        RuntimeException var6_ref = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = new nh(20, param3, param4 + 120, 25, param1, false, 120, 3, jd.field_s, 16777215, param0);
            if (param2 < -97) {
              this.a(51448, var6);
              stackIn_4_0 = var6.field_x;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -86;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("mk.CA(");

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
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_O = new boolean[64];
        field_Q = "You have <%0> unread messages!";
        field_H = 0;
        field_I = 0;
    }
}
