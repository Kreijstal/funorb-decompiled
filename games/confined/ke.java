/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends ga implements ge, el, pg {
    private wh field_H;
    static String field_ab;
    static double field_Z;
    static bi field_cb;
    private wh field_R;
    ak field_O;
    private na field_T;
    static String field_L;
    private wh field_X;
    private fa field_bb;
    private wh field_U;
    private wh field_W;
    static int[] field_P;
    private rg field_Y;
    private wh field_V;
    private rg field_S;

    private final int a(fj param0, String param1, int param2, int param3, int param4) {
        la var6 = null;
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
            var6 = new la(20, param3, param2 + 120, 25, param0, false, param4, 3, gm.field_cb, 16777215, param1);
            this.b(var6, 10);
            stackIn_1_0 = var6.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6_ref);

            stackIn_4_1 = new StringBuilder().append("ke.A(");

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
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean c(boolean param0) {
        if (!(this.i((byte) -66))) {
            return false;
        }
        if (!param0) {
            String var4 = (String) null;
            this.a(-115, (String) null);
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_V.field_B);
        } catch (NumberFormatException numberFormatException) {
        }
        return qf.a(30692, this.field_U.field_B, this.field_bb.field_O, (ke) (this), this.field_H.field_B, this.field_R.field_B, var2);
    }

    public final void a(na param0, int param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        fj var7 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param1 ^ -1)) {
                if (1 == param1) {
                  tb.a(-15912, "privacy.ws");
                  break L1;
                } else {
                  if ((param1 ^ -1) == -3) {
                    tb.a(-15912, "conduct.ws");
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                tb.a(-15912, "terms.ws");
                break L1;
              }
            }
            if (!param3) {
              break L0;
            } else {
              var7 = (fj) null;
              discarded$0 = this.a(-104, 80, (String) null, (byte) -57, (fj) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("ke.LA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_S.field_L = this.i((byte) -66);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ke.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean i(byte param0) {
        fj var3;
        if (param0 == -66) {
          if (this.a((byte) -111, (j) (this.field_R))) {
            if (this.a((byte) -7, (j) (this.field_U))) {
              if (this.a((byte) 74, (j) (this.field_W))) {
                if (this.a((byte) -128, (j) (this.field_H))) {
                  if (this.a((byte) 37, (j) (this.field_X))) {
                    if (!this.a((byte) 23, (j) (this.field_V))) {
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
          var3 = (fj) null;
          this.a((fj) null, (byte) 14, -34, '￤');
          if (this.a((byte) -111, (j) (this.field_R))) {
            if (this.a((byte) -7, (j) (this.field_U))) {
              if (this.a((byte) 74, (j) (this.field_W))) {
                if (this.a((byte) -128, (j) (this.field_H))) {
                  if (this.a((byte) 37, (j) (this.field_X))) {
                    if (!this.a((byte) 23, (j) (this.field_V))) {
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

    private final String b(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean a(byte param0, j param1) {
        dm var3 = null;
        RuntimeException var3_ref = null;
        fi var4 = null;
        int var5 = 0;
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
            var3 = param1.a((byte) -9);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = var3.a(-3621);
              if (var4 != fb.field_e) {
                var5 = 26 % ((-60 - param0) / 47);
                if (var4 != ab.field_b) {
                  if (gi.field_bb != var4) {
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

            stackIn_17_1 = new StringBuilder().append("ke.IA(").append(param0).append(',');

            if (param1 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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

    public final void a(byte param0) {
        String discarded$0 = null;
        ((qg) ((Object) this.field_R.a((byte) -9))).e(639775169);
        if (param0 > -101) {
            discarded$0 = this.h((byte) -41);
        }
    }

    final static void g(byte param0) {
        dn.field_b.a((fj) (new tg()), (byte) -72);
        if (param0 > -7) {
            field_ab = (String) null;
        }
    }

    public ke() {
        super(0, 0, 496, 0, (fe) null);
        this.field_R = new wh("", (uk) null, 12);
        this.field_U = new wh("", (uk) null, 100);
        this.field_W = new wh("", (uk) null, 100);
        this.field_H = new wh("", (uk) null, 20);
        this.field_X = new wh("", (uk) null, 20);
        this.field_V = new wh("", (uk) null, 3);
        int var1 = 1;
        this.field_bb = new fa("", (uk) null, var1 != 0);
        this.field_S = new rg(he.field_c, (uk) null);
        this.field_Y = new rg(qn.field_m, (uk) null);
        this.field_R.field_C = ra.field_b;
        this.field_U.field_C = p.field_a;
        this.field_W.field_C = tf.field_g;
        this.field_H.field_C = oe.field_O;
        this.field_X.field_C = jl.field_m;
        this.field_V.field_C = rm.field_D;
        this.field_bb.field_C = hf.field_U;
        this.field_R.a(-18312, new qg(this.field_R));
        this.field_U.a(-18312, new bk(this.field_U));
        this.field_W.a(-18312, new qc(this.field_W, this.field_U));
        this.field_H.a(-18312, new gl(this.field_H, this.field_R, this.field_U));
        this.field_X.a(-18312, new lf(this.field_X, this.field_H));
        this.field_V.a(-18312, new hj(this.field_V));
        this.field_S.field_L = false;
        this.field_S.field_n = (fe) ((Object) new je());
        this.field_Y.field_n = (fe) ((Object) new hk());
        this.field_R.field_n = (fe) ((Object) new db(10000536));
        db dupTemp$0 = new db(10000536);
        this.field_W.field_n = (fe) ((Object) dupTemp$0);
        this.field_U.field_n = (fe) ((Object) dupTemp$0);
        this.field_V.field_n = (fe) ((Object) new db(10000536));
        this.field_bb.field_n = (fe) ((Object) new cj());
        qm dupTemp$1 = new qm(10000536);
        this.field_X.field_n = (fe) ((Object) dupTemp$1);
        this.field_H.field_n = (fe) ((Object) dupTemp$1);
        String var2 = b.a(new String[]{this.b(false), this.h((byte) -110)}, ui.field_e, 1177);
        int var3 = 20;
        var3 = var3 + this.a(this.field_U, oh.field_d, 170, var3, 120);
        var3 = var3 + (this.a(this.field_W, 170, var3, fj.field_A, "", 20, 20) - -5);
        var3 = var3 + this.a(this.field_H, sc.field_b, 170, var3, 120);
        var3 = var3 + (5 + this.a(hb.field_t, jj.field_hb, 150, 170, var3, this.field_X));
        var3 = var3 + (5 + this.a(rc.field_a, va.field_d, 150, 170, var3, this.field_R));
        var3 = var3 + this.a(170, var3, qi.field_j, (byte) 59, this.field_V);
        la var4 = new la(46, var3, -90 + this.field_F, 25, this.field_bb, true, -120 + this.field_F, 5, fa.field_Q, 11579568, ag.field_j);
        this.b(var4, 10);
        var3 = var3 + var4.field_z;
        vf var5 = new vf(gm.field_cb, 0, 0, 0, 0, 16777215, -1, 0, 0, gm.field_cb.field_C, -1, 2147483647, true);
        this.field_T = new na(var2, var5);
        this.field_T.field_C = "";
        this.field_T.a(0, (byte) 9, om.field_o);
        this.field_T.a(1, (byte) 9, om.field_o);
        this.field_T.field_t = (uk) (this);
        this.field_T.b(var3, 46, this.field_F - 90, 8888);
        var3 = var3 + (this.field_T.field_z + 15);
        this.b(this.field_T, 10);
        int var6 = 4;
        int var7 = 200;
        this.field_S.a(-116, var7, var3, 40, 496 + -var7 >> 943877697);
        this.field_Y.a(-119, 60, 15 + var3, 40, var6 - -3);
        this.field_Y.field_t = (uk) (this);
        this.field_S.field_t = (uk) (this);
        this.b(this.field_S, 10);
        this.b(this.field_Y, 10);
        this.field_O = new ak((pg) (this));
        this.field_O.a(-128, -60 + (this.field_F + -this.field_R.field_q) - this.field_R.field_F, 20 + this.field_R.field_m, 150, this.field_R.field_q - (-this.field_R.field_F - 60));
        this.b(this.field_O, 10);
        this.a(-124, 496, 0, 55 + (var3 - -var6), 0);
    }

    private final int a(fj param0, int param1, int param2, String param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        rh var9 = null;
        la var10 = null;
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
            var10 = new la(param5, param2, param1 + 120, 25, param0, false, 120, 3, gm.field_cb, 16777215, param3);
            this.b(var10, 10);
            var9 = new rh(((j) ((Object) param0)).a((byte) -9), param4, 126, param2 - -var10.field_z, param1 - -50, param6);
            var9.field_t = (uk) (this);
            this.b(var9, 10);
            stackIn_1_0 = var10.field_z - -var9.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("ke.MA(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param4 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
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
            if (super.a(param0, (byte) -66, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param2) {
                if ((param2 ^ -1) != -100) {
                  var5_int = -44 % ((47 - param1) / 43);
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(17731, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.c(param0, 32);
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

            stackIn_14_1 = new StringBuilder().append("ke.Q(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    private final int a(int param0, int param1, String param2, byte param3, fj param4) {
        RuntimeException var6 = null;
        ba var7 = null;
        la var8 = null;
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
              var8 = new la(20, param1, 120 - -param0, 25, param4, false, 120, 3, gm.field_cb, 16777215, param2);
              this.b(var8, 10);
              var7 = new ba(((j) ((Object) param4)).a((byte) -9));
              this.b(var7, 10);
              var7.a(-127, 15, var8.field_m - -(-15 + var8.field_z >> 866937601), 15, 3 + var8.field_q + var8.field_F);
              if (param3 == 59) {
                break L1;
              } else {
                this.field_W = (wh) null;
                break L1;
              }
            }
            stackIn_3_0 = var8.field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("ke.JA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, String param1, int param2, int param3, int param4, fj param5) {
        boolean discarded$1 = false;
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
              if (param2 == 150) {
                break L1;
              } else {
                discarded$1 = this.i((byte) 79);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param5, param3, param4, param0, param1, 20, 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ke.GA(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        String discarded$2 = null;
        boolean discarded$3 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                discarded$2 = this.h((byte) 75);
                break L1;
              }
            }
            if (this.field_Y == param3) {
              ke.g((byte) -107);
              return;
            } else {
              if (this.field_S != param3) {
                break L0;
              } else {
                discarded$3 = this.c(true);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("ke.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, String param1) {
        wh var3 = null;
        String var4 = null;
        try {
            if (param0 != 11579568) {
                this.field_bb = (fa) null;
            }
            var3 = this.field_R;
            var4 = param1;
            ((ul) ((Object) var3)).a(false, false, var4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ke.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void j(int param0) {
        field_ab = null;
        field_L = null;
        field_P = null;
        field_cb = null;
        if (param0 != -14508) {
            ke.g((byte) -49);
        }
    }

    private final String h(byte param0) {
        if (param0 >= -8) {
            ke.g((byte) -50);
            return "</col></u>";
        }
        return "</col></u>";
    }

    static {
        field_ab = "You already have 10 cluster missiles";
        field_P = new int[128];
        field_L = "Fly your ship in the confined space of the tunnel.#Take what you like. Blow up what you like.#Use their technology against them. Show no mercy.";
    }
}
