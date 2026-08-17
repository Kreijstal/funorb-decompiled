/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends ki implements re, ka, ge {
    private tg field_L;
    private kj field_J;
    static String field_E;
    private qb field_K;
    private qb field_S;
    private pj field_R;
    static String[] field_H;
    private qb field_O;
    static String[] field_Q;
    static String[] field_N;
    private pj field_D;
    private qb field_I;
    private qb field_P;
    ua field_G;
    private qb field_M;
    static String field_F;

    final static int b(int param0, int param1, boolean param2, int param3) {
        if (param1 != 16711935) {
          if (param0 == 20) {
            if (param1 == 0) {
              if (!param2) {
                param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                return param1 << 8 * param3;
              } else {
                return param1;
              }
            } else {
              param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
              return param1 << 8 * param3;
            }
          } else {
            return 75;
          }
        } else {
          if (!param2) {
            if (param0 == 20) {
              if (param1 == 0) {
                if (param2) {
                  return param1;
                } else {
                  param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                  return param1 << 8 * param3;
                }
              } else {
                param1 = (15 & param1 >> -1480869756) + ((61440 & param1) >> -473835224);
                return param1 << 8 * param3;
              }
            } else {
              return 75;
            }
          } else {
            return param1;
          }
        }
    }

    private final String g(boolean param0) {
        if (param0) {
            this.field_K = (qb) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean f(boolean param0) {
        int discarded$0 = 0;
        rc var3;
        if (!param0) {
          if (this.a((wj) (this.field_P), (byte) 114)) {
            if (this.a((wj) (this.field_I), (byte) 96)) {
              if (this.a((wj) (this.field_M), (byte) 113)) {
                if (this.a((wj) (this.field_O), (byte) 105)) {
                  if (this.a((wj) (this.field_K), (byte) 121)) {
                    if (!this.a((wj) (this.field_S), (byte) 90)) {
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
          var3 = (rc) null;
          discarded$0 = this.a((String) null, -93, (byte) 14, (rc) null, -14);
          if (this.a((wj) (this.field_P), (byte) 114)) {
            if (this.a((wj) (this.field_I), (byte) 96)) {
              if (this.a((wj) (this.field_M), (byte) 113)) {
                if (this.a((wj) (this.field_O), (byte) 105)) {
                  if (this.a((wj) (this.field_K), (byte) 121)) {
                    if (!this.a((wj) (this.field_S), (byte) 90)) {
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
        }
    }

    private final int a(int param0, int param1, rc param2, String param3, String param4, int param5) {
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
            if (param1 == 35) {
              stackIn_4_0 = this.a((byte) 91, param0, 35, param5, param3, param4, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -87;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("rf.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void h(int param0) {
        h.a(17, true);
        if (param0 != 15) {
            field_N = (String[]) null;
        }
    }

    public final void a(int param0, int param1, int param2, kj param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                if (1 == param1) {
                  ud.a(11692, "privacy.ws");
                  break L1;
                } else {
                  if (-3 != (param1 ^ -1)) {
                    break L1;
                  } else {
                    ud.a(11692, "conduct.ws");
                    break L1;
                  }
                }
              } else {
                ud.a(11692, "terms.ws");
                break L1;
              }
            }
            if (param2 == 50) {
              break L0;
            } else {
              this.field_R = (pj) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("rf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    public rf() {
        super(0, 0, 496, 0, (j) null);
        this.field_P = new qb("", (dg) null, 12);
        this.field_I = new qb("", (dg) null, 100);
        this.field_M = new qb("", (dg) null, 100);
        this.field_O = new qb("", (dg) null, 20);
        this.field_K = new qb("", (dg) null, 20);
        this.field_S = new qb("", (dg) null, 3);
        int var1 = 1;
        this.field_L = new tg("", (dg) null, var1 != 0);
        this.field_R = new pj(qg.field_b, (dg) null);
        this.field_D = new pj(mf.field_F, (dg) null);
        this.field_P.field_z = ql.field_u;
        this.field_I.field_z = qh.field_d;
        this.field_M.field_z = pj.field_G;
        this.field_O.field_z = kj.field_K;
        this.field_K.field_z = wi.field_k;
        this.field_S.field_z = oa.field_i;
        this.field_L.field_z = wi.field_h;
        this.field_P.a(new df(this.field_P), false);
        this.field_I.a(new dc(this.field_I), false);
        this.field_M.a(new qa(this.field_M, this.field_I), false);
        this.field_O.a(new uk(this.field_O, this.field_P, this.field_I), false);
        this.field_K.a(new el(this.field_K, this.field_O), false);
        this.field_S.a(new cl(this.field_S), false);
        this.field_R.field_B = false;
        this.field_R.field_w = (j) ((Object) new gh());
        this.field_D.field_w = (j) ((Object) new ri());
        this.field_P.field_w = (j) ((Object) new uf(10000536));
        uf dupTemp$0 = new uf(10000536);
        this.field_M.field_w = (j) ((Object) dupTemp$0);
        this.field_I.field_w = (j) ((Object) dupTemp$0);
        this.field_S.field_w = (j) ((Object) new uf(10000536));
        this.field_L.field_w = (j) ((Object) new pb());
        bg dupTemp$1 = new bg(10000536);
        this.field_K.field_w = (j) ((Object) dupTemp$1);
        this.field_O.field_w = (j) ((Object) dupTemp$1);
        String var2 = bb.a(rk.field_a, new String[]{this.j(99), this.g(false)}, -63);
        int var3 = 20;
        var3 = var3 + this.a(el.field_j, var3, (byte) 119, this.field_I, 170);
        var3 = var3 + (5 + this.a((byte) 91, var3, 20, 170, "", rj.field_a, this.field_M));
        var3 = var3 + this.a(ld.field_O, var3, (byte) 44, this.field_O, 170);
        var3 = var3 + (this.a(var3, 35, this.field_K, uc.field_d, pk.field_X, 170) - -5);
        var3 = var3 + (this.a(var3, 35, this.field_P, uc.field_k, eb.field_a, 170) - -5);
        var3 = var3 + this.a(var3, this.field_S, 170, cb.field_b, true);
        ke var4 = new ke(46, var3, -90 + this.field_t, 25, this.field_L, true, this.field_t - 120, 5, jh.field_g, 11579568, h.field_e);
        this.a(var4, 5411);
        var3 = var3 + var4.field_x;
        af var5 = new af(ua.field_G, 0, 0, 0, 0, 16777215, -1, 0, 0, ua.field_G.field_F, -1, 2147483647, true);
        this.field_J = new kj(var2, var5);
        this.field_J.field_z = "";
        this.field_J.a(0, mj.field_a, 1);
        this.field_J.a(1, mj.field_a, 1);
        this.field_J.field_n = (dg) (this);
        this.field_J.b(46, var3, 1, this.field_t + -90);
        var3 = var3 + (15 + this.field_J.field_x);
        this.a(this.field_J, 5411);
        int var6 = 4;
        int var7 = 200;
        this.field_R.b(40, var7, 496 + -var7 >> -1595769247, 0, var3);
        this.field_D.b(40, 60, 3 + var6, 0, var3 + 15);
        this.field_D.field_n = (dg) (this);
        this.field_R.field_n = (dg) (this);
        this.a(this.field_R, 5411);
        this.a(this.field_D, 5411);
        this.field_G = new ua((ge) (this));
        this.field_G.b(150, -this.field_P.field_t + this.field_t - this.field_P.field_m + -60, this.field_P.field_t + (this.field_P.field_m + 60), 0, this.field_P.field_j + 20);
        this.a(this.field_G, 5411);
        this.b(var3 - (-55 - var6), 496, 0, 0, 0);
    }

    public final void a(byte param0) {
        ((df) ((Object) this.field_P.a(param0 + 95))).a(true);
        if (param0 != 22) {
            field_H = (String[]) null;
        }
    }

    public static void e(boolean param0) {
        field_E = null;
        if (param0) {
          rf.e(false);
          field_Q = null;
          field_N = null;
          field_H = null;
          field_F = null;
          return;
        } else {
          field_Q = null;
          field_N = null;
          field_H = null;
          field_F = null;
          return;
        }
    }

    private final boolean i(int param0) {
        if (param0 != 11608) {
            return false;
        }
        if (!this.f(false)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_S.field_i);
        } catch (NumberFormatException numberFormatException) {
        }
        return nf.a(var2, this.field_L.field_F, this.field_I.field_i, this.field_P.field_i, (rf) (this), this.field_O.field_i, (byte) 118);
    }

    private final int a(byte param0, int param1, int param2, int param3, String param4, String param5, rc param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        rc var10 = null;
        ke var11 = null;
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
              var11 = new ke(20, param1, 120 + param3, 25, param6, false, 120, 3, ua.field_G, 16777215, param5);
              this.a(var11, 5411);
              var9 = new pk(((wj) ((Object) param6)).a(56), param4, 126, param1 - -var11.field_x, param3 + 50, param2);
              var9.field_n = (dg) (this);
              this.a(var9, param0 + 5320);
              if (param0 == 91) {
                break L1;
              } else {
                var10 = (rc) null;
                this.a('|', (byte) -62, -94, (rc) null);
                break L1;
              }
            }
            stackIn_3_0 = var11.field_x + var9.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("rf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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

            if (param5 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, int param1, byte param2, rc param3, int param4) {
        int discarded$1 = 0;
        ke var6 = null;
        RuntimeException var6_ref = null;
        rc var7 = null;
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
              if (param2 > 29) {
                break L1;
              } else {
                var7 = (rc) null;
                discarded$1 = this.a((String) null, 47, (byte) 87, (rc) null, -94);
                break L1;
              }
            }
            var6 = new ke(20, param1, 120 - -param4, 25, param3, false, 120, 3, ua.field_G, 16777215, param0);
            this.a(var6, 5411);
            stackIn_3_0 = var6.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("rf.K(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(wj param0, byte param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        qf var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(93);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 >= 87) {
                  break L1;
                } else {
                  field_Q = (String[]) null;
                  break L1;
                }
              }
              var4 = var3.b(-9362);
              if (rg.field_f == var4) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4 == hg.field_E) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4 != rd.field_b) {
                    stackIn_18_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_16_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("rf.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    private final int a(int param0, rc param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        kc var7 = null;
        ke var8 = null;
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
            var8 = new ke(20, param0, 120 - -param2, 25, param1, false, 120, 3, ua.field_G, 16777215, param3);
            this.a(var8, 5411);
            var7 = new kc(((wj) ((Object) param1)).a(86));
            this.a(var7, 5411);
            if (param4) {
              var7.b(15, 15, var8.field_t + var8.field_m + 3, 0, (var8.field_x - 15 >> -1903468927) + var8.field_j);
              stackIn_4_0 = var8.field_x;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -52;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("rf.D(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, (byte) 125, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param2 ^ -1)) {
                if (99 != param2) {
                  var5_int = -101 % ((param1 - 31) / 56);
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b(117, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) -123, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("rf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    private final String j(int param0) {
        if (param0 != 99) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        kj var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_D == param3) {
                ig.a((byte) -79);
                break L1;
              } else {
                if (this.field_R != param3) {
                  break L1;
                } else {
                  discarded$1 = this.i(11608);
                  break L1;
                }
              }
            }
            if (param4) {
              break L0;
            } else {
              var7 = (kj) null;
              this.a(61, -5, -28, (kj) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("rf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_R.field_B = this.f(false);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rf.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(boolean param0, String param1) {
        qb var3 = null;
        String var4 = null;
        try {
            var3 = this.field_P;
            var4 = param1;
            if (!param0) {
                rc var5 = (rc) null;
                this.a('`', (byte) -72, -5, (rc) null);
            }
            ((vg) ((Object) var3)).a(109, false, var4);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "rf.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = "Unpacking music";
        field_N = new String[]{"Divide into multiple warheads in proximity to a target.", "Fly towards the mouse pointer for the first two seconds of flight.", "Slow to fire but explode damaging everything in a large radius near by.", "Fires very quickly but not too powerful. Focus on the important asteroids only.", "Can shoot through small asteroids and damage multiple targets. Target the centre of the asteroid for maximum damage.", "Fires streams of bolts before recharging.  The bolts home in on the mouse cursor at high speed.", "Takes a short time to charge before firing where you cannot move the gun. The beam causes massive damage to everything it hits."};
        field_H = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_Q = new String[]{"TODO Summary page of the goal and control mechanism.", "TODO Full controls.", "TODO Objective and/or plot. May want to go from this page to tutorial."};
    }
}
