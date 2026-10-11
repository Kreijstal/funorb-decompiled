/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ma extends ce implements ra {
    static w field_J;
    static String[] field_H;
    static w field_G;
    static int field_I;
    ce field_L;
    static ck field_K;

    void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        boolean discarded$1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param1 != 64) {
            discarded$1 = this.a((ce) null, (byte) -1);
          }
          if (this.field_L != null) {
            this.field_L.a(param0, 64, param2 + this.field_u, param3, this.field_D + param4, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("ma.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 == 0 &&
            this.field_p != null) {
            this.field_p.a(true, param0, param3, (byte) -98, (ce) (this));
          }
          if (this.field_L != null) {
            this.field_L.a(param0 + this.field_u, -119, param2, param3 + this.field_D);
          }
          if (param1 > -103) {
            field_G = (w) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "ma.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
          super.b(param0, param1, param2, param3, param4);
          this.b(true);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ma.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 99 / ((36 - param0) / 51);
          if (this.field_L == null) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = this.field_L.d(125);
          }
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.DC(" + param0 + ')');
        }
    }

    String c(byte param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = super.c(param0);
          if (this.field_L != null) {
            var3 = this.field_L.c((byte) 113);
            if (var3 != null) {
              stackIn_5_0 = var3;
              return stackIn_5_0;
            }
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "ma.R(" + param0 + ')');
        }
    }

    ce a(int param0) {
        ce var2 = null;
        RuntimeException var2_ref = null;
        ce stackIn_7_0 = null;
        ce stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = this.field_L;
          if (var2 != null &&
            var2.a(true)) {
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          if (param0 == 14) {
            stackIn_12_0 = null;
            return (ce) (stackIn_12_0);
          }
          stackIn_10_0 = (ce) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "ma.N(" + param0 + ')');
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, 119, param2, param3);
          if (this.field_L != null) {
            this.field_L.a(param0, 110, param2 + this.field_D, this.field_u + param3);
          }
          if (param1 <= 38) {
            this.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ma.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(ce param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -112) {
            this.a(112, -42, (ce) null, -60, 72, 122, (byte) 63);
          }
          stackIn_13_0 = (this.field_L != null) && (!this.field_L.a(true)) && (this.field_L.a(false, param0));
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ma.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, ce param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return true;
          }
          stackIn_10_0 = (null != this.field_L) && (this.field_L.a(false, param1));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ma.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        RuntimeException var8 = null;
        ce stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6) {
            this.field_L = (ce) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_L != null) {
            stackIn_9_0 = this.field_L;
            stackIn_10_1 = !(param6);
            if (((ce) (Object) stackIn_9_0).a(stackIn_10_1) &&
              this.field_L.a(param0, param1, param2, param3, param4, param5, false)) {
              stackIn_17_0 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = false;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_21_0 = var8;
          stackIn_21_1 = new StringBuilder().append("ma.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static wb a(int param0, boolean param1, byte param2) {
        nm stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        boolean stackIn_8_4 = false;
        wb stackIn_21_0 = null;
        w stackIn_44_0 = null;
        String stackIn_45_1 = null;
        w stackIn_48_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_92_0 = null;
        Object stackIn_100_0 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_20_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        vj var4 = null;
        Object var5 = null;
        Object var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        pf var17 = null;
        String var18 = null;
        int var19 = 0;
        pf var17Lifetime1;
        String var18Lifetime1;
        var19 = client.field_A ? 1 : 0;
        try {
          if (param2 <= 54) {
            ma.e((byte) -34);
          }
          stackIn_7_0 = k.field_b.field_Rb;
          stackIn_7_1 = kf.field_O + 2;
          stackIn_7_2 = (kf.field_O + 2) * (3 * param0);
          stackIn_7_3 = -15230;
          stackIn_8_4 = (k.field_b.field_Rb == ki.field_w);
          boolean decompiledFrameRemainder0 = true;
          var3_int = ((nm) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4, 2, param1) ? 1 : 0;
          var4 = k.field_b.field_Sb.field_M;
          var5 = null;
          if (jj.field_b != 2) {
            tb.field_c.field_Hb = false;
            jc.field_c.field_Y = wm.field_k;
            if (1 == jj.field_b) {
              k.field_b.field_Rb.field_Rb.field_Y = si.field_m;
              if (var19 != 0) {
                k.field_b.field_Rb.field_Rb.field_Y = wf.field_m;
              }
            } else {
              k.field_b.field_Rb.field_Rb.field_Y = wf.field_m;
            }
            gk.a(k.field_b.field_Sb, true);
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            tb.field_c.field_Hb = true;
            jc.field_c.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(98, ve.field_cc, new String[]{f.field_w});
            k.field_b.field_Rb.field_Rb.field_Y = null;
            var6 = null;
            var7 = (wb) (var4.c((byte) -108));
            while (true) {
              if (null != var7) {
                var8 = 0;
                stackOut_20_0 = var7;
                stackIn_92_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (var19 == 0) {
                  if (stackIn_21_0.field_M == null) {
                    var7.field_Sb = new w(0L, gg.field_G);
                    var7.a(var7.field_Sb, -16834);
                    var7.field_Yb = new w(0L, fc.field_f);
                    var7.a(var7.field_Yb, -16834);
                    var7.field_Wb = new w(0L, gg.field_G);
                    var7.a(var7.field_Wb, -16834);
                    var7.field_Yb.field_X = 2;
                    var7.d(-112);
                    var8 = 1;
                  }
                  var7.field_mb = k.field_b.field_Sb.field_mb;
                  var9 = 0;
                  if (var7.field_Vb == null) {
                    var10 = 13369344;
                    var11 = 16737894;
                  } else if (f.field_w == var7.field_Vb) {
                    var10 = 52224;
                    var11 = 6750054;
                  } else {
                    var11 = 16777062;
                    var10 = 13421568;
                  }
                  var12 = 0;
                  if (var7.field_Tb != null &&
                    !var7.field_Tb.equals("")) {
                    var7.field_Wb.field_Bb = var11;
                    var7.field_Wb.field_I = a.field_p;
                    var7.field_Wb.a(3 + a.field_p.field_K, 0, var9, kf.field_O, 0);
                    var12 = 1;
                  }
                  var7.field_Yb.field_G = var10;
                  var7.field_Sb.field_G = var10;
                  var7.field_Yb.field_fb = var11;
                  var7.field_Sb.field_fb = var11;
                  var7.field_Yb.field_rb = var11;
                  var7.field_Sb.field_rb = var11;
                  var7.field_Yb.field_Bb = var11;
                  var7.field_Sb.field_Bb = var11;
                  var13 = 0;
                  var14 = -2 + (var7.field_mb - 80);
                  if (var12 != 0) {
                    var13 = a.field_p.field_K + 3;
                    var14 = var14 - var13;
                  }
                  stackIn_44_0 = var7.field_Sb;
                  if (0 >= var14) {
                    stackIn_45_1 = var7.field_Ob;
                  } else {
                    stackIn_45_1 = mm.a(var7.field_Sb.field_J, var7.field_Ob, var14);
                  }
                  stackIn_44_0.field_Y = stackIn_45_1;
                  var7.field_Sb.a(var14, 0, var9, kf.field_O, var13);
                  stackIn_48_0 = var7.field_Yb;
                  if (null != var7.field_Vb) {
                    stackIn_49_1 = var7.field_Vb;
                  } else {
                    stackIn_49_1 = rg.field_b;
                  }
                  stackIn_48_0.field_Y = stackIn_49_1;
                  var7.field_Yb.a(80, 0, var9, kf.field_O, var7.field_mb - 80);
                  stackIn_53_0 = (var7.field_Sb.field_Y.equals(var7.field_Ob)) ? 0 : 1;
                  var15 = stackIn_53_0;
                  var9 = var9 + kf.field_O;
                  if (var3_int == 0) {
                    var7.field_F = var9 - var7.field_N;
                  }
                  if (var8 != 0) {
                    k.field_b.field_Sb.a((w) (var6), var7, 2, 0);
                  }
                  if (var7.field_Wb == null ||
                    !var7.field_Wb.field_jb) {
                    if (var7.field_ob != 0) {
                      var16 = var7.field_Ob;
                      sl.$cfr$intArgs$a$2862dfd4c01c(var16, (int[]) null, 101, k.field_b.field_Rb, var7, (String) null, 0L, -1, -1);
                      var5 = var7;
                      if (var7.field_Vb != null &&
                        !wi.a(-103, w.field_H.field_b) &&
                        !wc.field_n) {
                        if (!wl.field_p) {
                          var17 = w.field_H;
                          var18 = cm.$cfr$intArgs$a$53ce4ab4c593(111, ai.field_M, new String[]{var16});
                          var17.field_h.a(var18, 8, 80);
                        }
                        var17Lifetime1 = w.field_H;
                        var18Lifetime1 = cm.$cfr$intArgs$a$53ce4ab4c593(99, wa.field_e, new String[]{var16});
                        var17Lifetime1.field_h.a(var18Lifetime1, 18, 65);
                      }
                    } else if (var7.field_Sb.field_jb &&
                      var15 != 0) {
                      sl.field_g = var7.field_Ob;
                    }
                  } else {
                    sl.field_g = var7.field_Tb;
                  }
                  var6 = var7;
                  var7 = (wb) (var4.d(true));
                  continue;
                }
              } else {
                stackIn_92_0 = k.field_b.field_Ob;
              }
              if (((w) (stackIn_92_0)).field_ob != 0) {
                vh.field_h = new hb(k.field_b.field_Ob.field_E, k.field_b.field_Ob.field_pb, k.field_b.field_Ob.field_mb, k.field_b.field_Ob.field_N, h.field_g, ah.field_h, ua.field_H, ua.field_H);
                of.field_d = 0;
              }
              if (k.field_b.field_Nb.field_ob == 0) {
                break;
              }
              vh.field_h = new hb(k.field_b.field_Nb.field_E, k.field_b.field_Nb.field_pb, k.field_b.field_Nb.field_mb, k.field_b.field_Nb.field_N, fj.field_b, ah.field_h, ua.field_H, ua.field_H);
              of.field_d = 1;
              break;
            }
          }
          stackIn_100_0 = var5;
          return (wb) (stackIn_100_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "ma.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a(-67, 8, (ce) null, -37, -30, 67, (byte) -40);
          }
          stackIn_7_0 = (null != this.a(14));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.TB(" + param0 + ')');
        }
    }

    final static pi a(ji param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        pi stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 21828) {
            ma.a(-121, true, (byte) -35);
          }
          if (gb.a(param1, param0, param2, 78)) {
            stackIn_7_0 = a.b(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (pi) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ma.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_L != null &&
            this.field_L.a(true) &&
            this.field_L.a(-125, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            var5_int = 24 / ((param0 + 22) / 49);
            return false;
          }
          if (bj.field_d[81]) {
            stackIn_16_0 = this.a(param2, (byte) -112);
          } else {
            stackIn_16_0 = this.b(false, param2);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ma.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(boolean param0, ce param1) {
        RuntimeException var3 = null;
        ce stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_L) {
            stackIn_9_0 = this.field_L;
            stackIn_10_1 = !(param0);
            if (!((ce) (Object) stackIn_9_0).a(stackIn_10_1) &&
              this.field_L.a(false, param1)) {
              stackIn_17_0 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = false;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static tj a(int param0, long param1) {
        RuntimeException var3 = null;
        tj stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -98) {
            field_G = (w) null;
          }
          stackIn_4_0 = (tj) (ob.field_i.a(24710, param1));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "ma.O(" + param0 + ',' + param1 + ')');
        }
    }

    ma(int param0, int param1, int param2, int param3, gl param4, kg param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          discarded$12 = param2.append('\n');
          if (param0 > -37) {
            this.a(36, -51, (ce) null, -111, 8, 107, (byte) -44);
          }
          var5_int = 0;
          do {
            if (var5_int > param1) {
              if (this.field_L == null) {
                discarded$14 = param2.append("null");
                if (var6 == 0) {
                  return;
                }
              }
              break;
            }
            discarded$13 = param2.append(' ');
            var5_int++;
          } while (var6 == 0);
          this.field_L.a(param3, param1 + 1, param2, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ma.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.field_L) {
            this.field_L.f(112);
          }
          if (!param0) {
            this.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.KB(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 != -95) {
          return;
        }
        try {
          if (this.field_L != null) {
            this.field_L.d((byte) -95);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ma.WB(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 >= -78) {
            field_H = (String[]) null;
          }
          field_J = null;
          field_G = null;
          field_H = null;
          field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "ma.I(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -55) {
            this.a(59);
          }
          stackIn_10_0 = (this.field_L != null) && (this.field_L.a(param0, param1, param2, param3, this.field_D + param4, this.field_u + param5, (byte) -55));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ma.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(0, param1, param0, param2)) {
            this.a((byte) 72, param2, param0, param1);
            this.a((byte) -116, param1, param2, param0);
          }
          if (param3) {
            stackIn_8_0 = (StringBuilder) (param2);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ma.MB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        try {
          if (0 == param0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param0 > 0) {
            var2_int = 1;
            if (param0 > 65535) {
              param0 = param0 >> 16;
              var2_int += 16;
            }
            if (param0 > 255) {
              param0 = param0 >> 8;
              var2_int += 8;
            }
            if (param0 > 15) {
              param0 = param0 >> 4;
              var2_int += 4;
            }
            if (param0 > 3) {
              var2_int += 2;
              param0 = param0 >> 2;
            }
            if (1 < param0) {
              param0 = param0 >> 1;
              var2_int++;
            }
            stackIn_29_0 = var2_int;
            return stackIn_29_0;
          }
          if (param1 < 46) {
            stackIn_32_0 = 45;
            return stackIn_32_0;
          }
          var2_intLifetime1 = 2;
          if (param0 < -65536) {
            param0 = param0 >> 16;
            var2_intLifetime1 += 16;
          }
          if (param0 < -256) {
            param0 = param0 >> 8;
            var2_intLifetime1 += 8;
          }
          if (param0 < -16) {
            var2_intLifetime1 += 4;
            param0 = param0 >> 4;
          }
          if (param0 < -4) {
            var2_intLifetime1 += 2;
            param0 = param0 >> 2;
          }
          if (param0 < -2) {
            param0 = param0 >> 1;
            var2_intLifetime1++;
          }
          stackIn_46_0 = var2_intLifetime1;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "ma.L(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_H = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
