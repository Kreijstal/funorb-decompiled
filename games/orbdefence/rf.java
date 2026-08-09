/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends ta implements ff, ai, bf {
    we field_M;
    static String field_H;
    static boolean field_N;
    private of field_P;
    private oc field_O;
    static int field_C;
    private oc field_G;
    private te field_L;
    private oc field_D;
    private s field_K;
    private s field_F;
    private oc field_E;
    static String field_A;
    private oc field_J;
    private oc field_B;

    private final String d(byte param0) {
        if (param0 < 24) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(int param0, int param1, String param2, int param3, String param4, byte param5, pj param6) {
        RuntimeException var8 = null;
        kk var9 = null;
        h var10 = null;
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
            var10 = new h(20, param1, 120 - -param3, 25, param6, false, 120, 3, lm.field_f, 16777215, param4);
            if (param5 == -81) {
              this.a(var10, (byte) 74);
              var9 = new kk(((ib) ((Object) param6)).a((byte) -115), param2, 126, param1 + var10.field_r, 50 + param3, param0);
              var9.field_h = (ag) (this);
              this.a(var9, (byte) 74);
              stackIn_4_0 = var9.field_r + var10.field_r;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 5;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("rf.R(").append(param0).append(',').append(param1).append(',');

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public rf() {
        super(0, 0, 496, 0, (td) null);
        this.field_B = new oc("", (ag) null, 12);
        this.field_O = new oc("", (ag) null, 100);
        this.field_G = new oc("", (ag) null, 100);
        this.field_D = new oc("", (ag) null, 20);
        this.field_J = new oc("", (ag) null, 20);
        this.field_E = new oc("", (ag) null, 3);
        int var1 = 1;
        this.field_P = new of("", (ag) null, var1 != 0);
        this.field_K = new s(vd.field_f, (ag) null);
        this.field_F = new s(bi.field_b, (ag) null);
        this.field_B.field_i = bg.field_b;
        this.field_O.field_i = ce.field_b;
        this.field_G.field_i = bc.field_s;
        this.field_D.field_i = ba.field_g;
        this.field_J.field_i = fk.field_a;
        this.field_E.field_i = df.field_c;
        this.field_P.field_i = OrbDefence.field_C;
        this.field_B.a(new bc(this.field_B), 67);
        this.field_O.a(new wg(this.field_O), 45);
        this.field_G.a(new b(this.field_G, this.field_O), 79);
        this.field_D.a(new em(this.field_D, this.field_B, this.field_O), 34);
        this.field_J.a(new ug(this.field_J, this.field_D), 53);
        this.field_E.a(new nb(this.field_E), 33);
        this.field_K.field_F = false;
        this.field_K.field_j = (td) ((Object) new vk());
        this.field_F.field_j = (td) ((Object) new qc());
        this.field_B.field_j = (td) ((Object) new fg(10000536));
        fg dupTemp$0 = new fg(10000536);
        this.field_G.field_j = (td) ((Object) dupTemp$0);
        this.field_O.field_j = (td) ((Object) dupTemp$0);
        this.field_E.field_j = (td) ((Object) new fg(10000536));
        this.field_P.field_j = (td) ((Object) new fi());
        eg dupTemp$1 = new eg(10000536);
        this.field_J.field_j = (td) ((Object) dupTemp$1);
        this.field_D.field_j = (td) ((Object) dupTemp$1);
        String var2 = t.a(-415993727, new String[]{this.d((byte) 105), this.e((byte) -128)}, nb.field_n);
        int var3 = 20;
        var3 = var3 + this.a(var3, this.field_O, 170, (byte) -82, ef.field_h);
        var3 = var3 + (this.a(20, var3, "", 170, a.field_u, (byte) -81, this.field_G) - -5);
        var3 = var3 + this.a(var3, this.field_D, 170, (byte) -82, hi.field_h);
        var3 = var3 + (this.a(170, var3, pf.field_c, lm.field_b, this.field_J, false) - -5);
        var3 = var3 + (this.a(170, var3, bh.field_a, ja.field_b, this.field_B, false) - -5);
        var3 = var3 + this.a(var3, 170, pi.field_c, this.field_E, 25);
        h var4 = new h(46, var3, -90 + this.field_m, 25, this.field_P, true, this.field_m - 120, 5, pc.field_bb, 11579568, rh.field_d);
        this.a(var4, (byte) 74);
        var3 = var3 + var4.field_r;
        jc var5 = new jc(lm.field_f, 0, 0, 0, 0, 16777215, -1, 0, 0, lm.field_f.field_H, -1, 2147483647, true);
        this.field_L = new te(var2, var5);
        this.field_L.field_i = "";
        this.field_L.a(0, b.field_p, 2);
        this.field_L.a(1, b.field_p, 2);
        this.field_L.field_h = (ag) (this);
        this.field_L.a(var3, (byte) 53, -90 + this.field_m, 46);
        var3 = var3 + (this.field_L.field_r - -15);
        this.a(this.field_L, (byte) 74);
        int var6 = 4;
        int var7 = 200;
        this.field_K.a(-var7 + 496 >> -547514431, var3, 40, (byte) -90, var7);
        this.field_F.a(3 + var6, var3 - -15, 40, (byte) -90, 60);
        this.field_F.field_h = (ag) (this);
        this.field_K.field_h = (ag) (this);
        this.a(this.field_K, (byte) 74);
        this.a(this.field_F, (byte) 74);
        this.field_M = new we((bf) (this));
        this.field_M.a(this.field_B.field_m + (this.field_B.field_s + 60), this.field_B.field_n + 20, 150, (byte) -90, this.field_m - (this.field_B.field_s + this.field_B.field_m + 60));
        this.a(this.field_M, (byte) 74);
        this.a(0, 0, var6 + var3 + 55, (byte) -90, 496);
    }

    private final String e(byte param0) {
        int var2 = -43 % ((-69 - param0) / 52);
        return "</col></u>";
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
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
              if (98 == param1) {
                stackIn_7_0 = this.a(param2, false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 == 99) {
                  stackIn_11_0 = this.b(param2, false);
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

            stackIn_14_1 = new StringBuilder().append("rf.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
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

    final static boolean l(int param0) {
        int var1 = 68 % ((param0 - 46) / 52);
        return 250 < ji.field_b ? true : false;
    }

    public final void a(int param0, String param1) {
        oc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        pj var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_B;
            var4 = param1;
            ((vi) ((Object) var3)).a(0, false, var4);
            if (param0 >= 104) {
              break L0;
            } else {
              var5 = (pj) null;
              this.a('k', 11, (pj) null, -124);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("rf.P(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final int a(int param0, int param1, String param2, pj param3, int param4) {
        RuntimeException var6 = null;
        jf var7 = null;
        h var8 = null;
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
            var8 = new h(20, param0, param1 + 120, param4, param3, false, 120, 3, lm.field_f, 16777215, param2);
            this.a(var8, (byte) 74);
            var7 = new jf(((ib) ((Object) param3)).a((byte) -113));
            this.a(var7, (byte) 74);
            var7.a(3 + (var8.field_m + var8.field_s), var8.field_n + (var8.field_r + -15 >> 413039617), 15, (byte) -90, 15);
            stackIn_1_0 = var8.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("rf.S(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        boolean discarded$3 = false;
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_F == param3) {
                  break L2;
                } else {
                  if (this.field_K == param3) {
                    discarded$3 = this.e(false);
                    if (!OrbDefence.field_D) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              qd.a((byte) 122);
              break L1;
            }
            var6_int = 18 / ((-3 - param0) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("rf.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
    }

    private final boolean e(boolean param0) {
        boolean discarded$1 = false;
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        if (this.k(20)) {
          var2 = -1;
          try {
            L0: {
              var2 = Integer.parseInt(this.field_E.field_l);
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0) {
            discarded$1 = this.e(false);
            return ie.a(var2, -10031, this.field_B.field_l, this.field_O.field_l, (rf) (this), this.field_P.field_D, this.field_D.field_l);
          } else {
            return ie.a(var2, -10031, this.field_B.field_l, this.field_O.field_l, (rf) (this), this.field_P.field_D, this.field_D.field_l);
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, int param1, String param2, String param3, pj param4, boolean param5) {
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
              if (!param5) {
                break L1;
              } else {
                field_C = 113;
                break L1;
              }
            }
            stackIn_3_0 = this.a(35, param1, param3, param0, param2, (byte) -81, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("rf.G(").append(param0).append(',').append(param1).append(',');

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(byte param0) {
        int discarded$0 = 0;
        ((bc) ((Object) this.field_B.a((byte) 65))).b((byte) 77);
        if (param0 != -8) {
            String var3 = (String) null;
            discarded$0 = this.a(-125, (pj) null, 66, (byte) 102, (String) null);
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_K.field_F = this.k(20);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "rf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean k(int param0) {
        int discarded$0 = 0;
        pj var3;
        if (param0 == 20) {
          if (this.a(this.field_B, -94)) {
            if (this.a(this.field_O, param0 ^ 73)) {
              if (this.a(this.field_G, param0 ^ 59)) {
                if (this.a(this.field_D, -98)) {
                  if (this.a(this.field_J, -112)) {
                    if (!this.a(this.field_E, -118)) {
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
          var3 = (pj) null;
          discarded$0 = this.a(77, -40, (String) null, (String) null, (pj) null, false);
          if (this.a(this.field_B, -94)) {
            if (this.a(this.field_O, param0 ^ 73)) {
              if (this.a(this.field_G, param0 ^ 59)) {
                if (this.a(this.field_D, -98)) {
                  if (this.a(this.field_J, -112)) {
                    if (!this.a(this.field_E, -118)) {
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

    public static void c(boolean param0) {
        field_H = null;
        if (param0) {
            return;
        }
        field_A = null;
    }

    private final boolean a(ib param0, int param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        qd var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
            var3 = param0.a((byte) 89);
            if (var3 != null) {
              var4 = var3.d(-7847);
              var5 = -60 % ((-34 - param1) / 60);
              if (var4 != vh.field_h) {
                if (var4 == ml.field_a) {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (fm.field_a != var4) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = 0;
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
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("rf.W(");

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
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
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

    private final int a(int param0, pj param1, int param2, byte param3, String param4) {
        h var6 = null;
        RuntimeException var6_ref = null;
        te var7 = null;
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
              var6 = new h(20, param0, param2 + 120, 25, param1, false, 120, 3, lm.field_f, 16777215, param4);
              this.a(var6, (byte) 74);
              if (param3 == -82) {
                break L1;
              } else {
                var7 = (te) null;
                this.a(-72, -9, (byte) -113, (te) null);
                break L1;
              }
            }
            stackIn_3_0 = var6.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("rf.U(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, byte param2, te param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != param1) {
                  break L2;
                } else {
                  ol.a("terms.ws", 1);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (1 != param1) {
                  break L3;
                } else {
                  ol.a("privacy.ws", 1);
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 != 2) {
                break L1;
              } else {
                ol.a("conduct.ws", 1);
                break L1;
              }
            }
            if (param2 == 101) {
              break L0;
            } else {
              rf.c(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("rf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void d(boolean param0) {
        String var2;
        if (param0) {
          field_C = 44;
          var2 = (String) null;
          ed.a((String) null, 0, sk.field_G);
          return;
        } else {
          var2 = (String) null;
          ed.a((String) null, 0, sk.field_G);
          return;
        }
    }

    static {
        field_H = "<%0>.<%1>k";
        field_A = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_N = false;
    }
}
