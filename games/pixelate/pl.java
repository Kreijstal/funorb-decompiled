/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends ch implements om, vo, pn {
    private gk field_U;
    private gk field_Q;
    private db field_M;
    private gk field_X;
    private qm field_K;
    private gk field_V;
    private gk field_P;
    static bb field_Y;
    private h field_T;
    static int field_S;
    private qm field_R;
    static String[] field_J;
    a field_W;
    static int field_O;
    private gk field_L;

    public final void a(byte param0) {
        ((ec) (Object) ((pl) this).field_U.a(1)).f(-112);
        if (param0 <= 12) {
            ((pl) this).field_X = null;
        }
    }

    private final String l() {
        return "</col></u>";
    }

    final void a(int param0, int param1, int param2, ng param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (param0 != 40) {
                ((pl) this).field_V = null;
            }
            ((pl) this).field_R.field_H = this.d(true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pl.L(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public pl() {
        super(0, 0, 496, 0, (eb) null);
        ((pl) this).field_U = new gk("", (fn) null, 12);
        ((pl) this).field_P = new gk("", (fn) null, 100);
        ((pl) this).field_L = new gk("", (fn) null, 100);
        ((pl) this).field_V = new gk("", (fn) null, 20);
        ((pl) this).field_X = new gk("", (fn) null, 20);
        ((pl) this).field_Q = new gk("", (fn) null, 3);
        int var1 = 1;
        ((pl) this).field_T = new h("", (fn) null, var1 != 0);
        ((pl) this).field_R = new qm(hm.field_d, (fn) null);
        ((pl) this).field_K = new qm(ii.field_v, (fn) null);
        ((pl) this).field_U.field_l = bg.field_i;
        ((pl) this).field_P.field_l = qp.field_N;
        ((pl) this).field_L.field_l = jf.field_b;
        ((pl) this).field_V.field_l = te.field_Eb;
        ((pl) this).field_X.field_l = dd.field_f;
        ((pl) this).field_Q.field_l = bb.field_d;
        ((pl) this).field_T.field_l = mc.field_o;
        ((pl) this).field_U.a((byte) 101, (ml) (Object) new ec((c) (Object) ((pl) this).field_U));
        ((pl) this).field_P.a((byte) 118, (ml) (Object) new bc((c) (Object) ((pl) this).field_P));
        ((pl) this).field_L.a((byte) 56, (ml) (Object) new kc((c) (Object) ((pl) this).field_L, (c) (Object) ((pl) this).field_P));
        ((pl) this).field_V.a((byte) 68, (ml) (Object) new g((c) (Object) ((pl) this).field_V, (c) (Object) ((pl) this).field_U, (c) (Object) ((pl) this).field_P));
        ((pl) this).field_X.a((byte) 29, (ml) (Object) new qo((c) (Object) ((pl) this).field_X, (c) (Object) ((pl) this).field_V));
        ((pl) this).field_Q.a((byte) 97, (ml) (Object) new ag((c) (Object) ((pl) this).field_Q));
        ((pl) this).field_R.field_H = false;
        ((pl) this).field_R.field_y = (eb) (Object) new ad();
        ((pl) this).field_K.field_y = (eb) (Object) new ia();
        ((pl) this).field_U.field_y = (eb) (Object) new gh(10000536);
        gh dupTemp$0 = new gh(10000536);
        ((pl) this).field_L.field_y = (eb) (Object) dupTemp$0;
        ((pl) this).field_P.field_y = (eb) (Object) dupTemp$0;
        ((pl) this).field_Q.field_y = (eb) (Object) new gh(10000536);
        ((pl) this).field_T.field_y = (eb) (Object) new jc();
        ip dupTemp$1 = new ip(10000536);
        ((pl) this).field_X.field_y = (eb) (Object) dupTemp$1;
        ((pl) this).field_V.field_y = (eb) (Object) dupTemp$1;
        int discarded$2 = 0;
        String var2 = sd.a(hk.field_f, 27, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(si.field_S, -21, (ng) (Object) ((pl) this).field_P, 170, var3);
        var3 = var3 + (5 + this.a(mp.field_d, (ng) (Object) ((pl) this).field_L, 20, 170, var3, 126, ""));
        var3 = var3 + this.a(vk.field_qb, -86, (ng) (Object) ((pl) this).field_V, 170, var3);
        var3 = var3 + (5 + this.a(pb.field_i, var3, (ng) (Object) ((pl) this).field_X, 35, 170, r.field_b));
        var3 = var3 + (this.a(na.field_a, var3, (ng) (Object) ((pl) this).field_U, 35, 170, mo.field_i) + 5);
        var3 = var3 + this.a((byte) 85, 170, (ng) (Object) ((pl) this).field_Q, var3, rl.field_O);
        qp var4 = new qp(46, var3, ((pl) this).field_E - 90, 25, (ng) (Object) ((pl) this).field_T, true, ((pl) this).field_E - 120, 5, ep.field_b, 11579568, ha.field_j);
        ((pl) this).b((ng) (Object) var4, 80);
        var3 = var3 + var4.field_C;
        uc var5 = new uc(he.field_d, 0, 0, 0, 0, 16777215, -1, 0, 0, he.field_d.field_w, -1, 2147483647, true);
        ((pl) this).field_M = new db(var2, (eb) (Object) var5);
        ((pl) this).field_M.field_l = "";
        ((pl) this).field_M.a(fa.field_g, 0, 0);
        ((pl) this).field_M.a(fa.field_g, 0, 1);
        ((pl) this).field_M.field_n = (fn) this;
        ((pl) this).field_M.a(46, -90 + ((pl) this).field_E, var3, -93);
        var3 = var3 + (15 + ((pl) this).field_M.field_C);
        ((pl) this).b((ng) (Object) ((pl) this).field_M, 80);
        int var6 = 4;
        int var7 = 200;
        ((pl) this).field_R.a(var7, (byte) 68, var3, -var7 + 496 >> 1, 40);
        ((pl) this).field_K.a(60, (byte) 23, var3 + 15, var6 + 3, 40);
        ((pl) this).field_K.field_n = (fn) this;
        ((pl) this).field_R.field_n = (fn) this;
        ((pl) this).b((ng) (Object) ((pl) this).field_R, 80);
        ((pl) this).b((ng) (Object) ((pl) this).field_K, 80);
        ((pl) this).field_W = new a((pn) this);
        ((pl) this).field_W.a(-((pl) this).field_U.field_E + -((pl) this).field_U.field_z + (((pl) this).field_E + -60), (byte) 100, 20 + ((pl) this).field_U.field_p, 60 + ((pl) this).field_U.field_z - -((pl) this).field_U.field_E, 150);
        ((pl) this).b((ng) (Object) ((pl) this).field_W, 80);
        ((pl) this).a(496, (byte) 28, 0, 0, var3 - -55 - -var6);
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4) {
        qp var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = new qp(20, param4, param3 + 120, 25, param2, false, 120, 3, he.field_d, 16777215, param0);
            ((pl) this).b((ng) (Object) var6, 80);
            if (param1 <= -6) {
              stackOut_3_0 = var6.field_C;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -103;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("pl.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(byte param0, int param1, ng param2, int param3, String param4) {
        qp var6 = null;
        RuntimeException var6_ref = null;
        vc var7 = null;
        int var8 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6 = new qp(20, param3, 290, 25, param2, false, 120, 3, he.field_d, 16777215, param4);
            ((pl) this).b((ng) (Object) var6, 80);
            var7 = new vc(((bp) (Object) param2).a(1));
            ((pl) this).b((ng) (Object) var7, 80);
            var7.a(15, (byte) 73, (var6.field_C - 15 >> 1) + var6.field_p, var6.field_E + (var6.field_z + 3), 15);
            var8 = -32;
            stackOut_0_0 = var6.field_C;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("pl.F(").append(85).append(44).append(170).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final static void c() {
        RuntimeException var1 = null;
        pc var1_ref = null;
        int var2 = 0;
        uj var3_ref_uj = null;
        long var3 = 0L;
        int var3_int = 0;
        eq var3_ref_eq = null;
        Object var4 = null;
        eq var4_ref = null;
        int var4_int = 0;
        String var5_ref_String = null;
        int var5 = 0;
        eq var5_ref_eq = null;
        uj var5_ref_uj = null;
        String var6 = null;
        uj var6_ref = null;
        eq var6_ref2 = null;
        String var7 = null;
        uj var7_ref = null;
        uj var8_ref_uj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_44_0 = 0;
        uj stackIn_49_0 = null;
        uj stackIn_50_0 = null;
        uj stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        uj stackIn_97_0 = null;
        uj stackIn_98_0 = null;
        uj stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_96_0 = null;
        uj stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        uj stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        uj stackOut_48_0 = null;
        uj stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        uj stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        var4 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var1_ref = vi.field_o;
                  var2 = ((we) (Object) var1_ref).f(255);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (2 == var2) {
                        break L3;
                      } else {
                        if (3 == var2) {
                          break L3;
                        } else {
                          if (var2 != 4) {
                            if (var2 != 5) {
                              if (6 == var2) {
                                var3 = ((we) (Object) var1_ref).a(false);
                                var5 = ((we) (Object) var1_ref).f(255);
                                var6_ref = gp.a(2, var3);
                                if (var6_ref == null) {
                                  break L2;
                                } else {
                                  L4: {
                                    if (var6_ref.field_Jb) {
                                      ka.field_X = ka.field_X - 1;
                                      var6_ref.field_Jb = false;
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 != 0) {
                                      var6_ref.field_Tb = mh.field_b;
                                      var6_ref.field_Eb = var5;
                                      break L5;
                                    } else {
                                      var6_ref.c(2779);
                                      break L5;
                                    }
                                  }
                                  var6_ref.e(17);
                                  break L2;
                                }
                              } else {
                                if (var2 != 7) {
                                  if (8 == var2) {
                                    L6: {
                                      var3_int = ((we) (Object) var1_ref).a((byte) -124);
                                      var4_ref = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                      if (var4_ref == null) {
                                        var4_ref = new eq(fj.field_b);
                                        dg.field_f.a(false, (lm) (Object) var4_ref, (long)var3_int);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    kd.a(true, var4_ref, (byte) 120, (we) (Object) var1_ref);
                                    w.a((byte) -48, var4_ref);
                                    break L1;
                                  } else {
                                    if (var2 == 9) {
                                      var3_int = ((we) (Object) var1_ref).a((byte) 124);
                                      var4_int = ((we) (Object) var1_ref).f(255);
                                      var5_ref_eq = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                      if (var5_ref_eq != null) {
                                        L7: {
                                          if (0 != var4_int) {
                                            var5_ref_eq.field_Rb = mh.field_b;
                                            var5_ref_eq.field_Qb = var4_int;
                                            break L7;
                                          } else {
                                            var5_ref_eq.c(2779);
                                            break L7;
                                          }
                                        }
                                        var5_ref_eq.e(17);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (10 == var2) {
                                        var3_ref_eq = (eq) (Object) nk.field_a.c(1504642273);
                                        L8: while (true) {
                                          if (var3_ref_eq == null) {
                                            break L2;
                                          } else {
                                            var3_ref_eq.c(2779);
                                            var3_ref_eq.e(17);
                                            var3_ref_eq = (eq) (Object) nk.field_a.f(1504642273);
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L9: {
                                          if (11 == var2) {
                                            break L9;
                                          } else {
                                            if (12 == var2) {
                                              break L9;
                                            } else {
                                              if (var2 != 13) {
                                                L10: {
                                                  if (var2 == 14) {
                                                    break L10;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L10;
                                                    } else {
                                                      L11: {
                                                        if (var2 == 15) {
                                                          break L11;
                                                        } else {
                                                          if (var2 == 17) {
                                                            break L11;
                                                          } else {
                                                            if (var2 == 18) {
                                                              L12: {
                                                                var3 = ((we) (Object) var1_ref).a(false);
                                                                var5_ref_String = ((we) (Object) var1_ref).h(5);
                                                                var6 = ((we) (Object) var1_ref).h(5);
                                                                var7_ref = ll.a(var3, 14428);
                                                                if (var7_ref == null) {
                                                                  var7_ref = new uj(var5_ref_String, var6, var3);
                                                                  eh.field_f.a(false, (lm) (Object) var7_ref, var3);
                                                                  io.field_c.field_mc = io.field_c.field_mc + 1;
                                                                  break L12;
                                                                } else {
                                                                  break L12;
                                                                }
                                                              }
                                                              L13: {
                                                                var7_ref.field_Rb = ((we) (Object) var1_ref).a((byte) 25);
                                                                var8 = ((we) (Object) var1_ref).j(127);
                                                                stackOut_96_0 = (uj) var7_ref;
                                                                stackIn_98_0 = stackOut_96_0;
                                                                stackIn_97_0 = stackOut_96_0;
                                                                if (0 == (1 & var8)) {
                                                                  stackOut_98_0 = (uj) (Object) stackIn_98_0;
                                                                  stackOut_98_1 = 0;
                                                                  stackIn_99_0 = stackOut_98_0;
                                                                  stackIn_99_1 = stackOut_98_1;
                                                                  break L13;
                                                                } else {
                                                                  stackOut_97_0 = (uj) (Object) stackIn_97_0;
                                                                  stackOut_97_1 = 1;
                                                                  stackIn_99_0 = stackOut_97_0;
                                                                  stackIn_99_1 = stackOut_97_1;
                                                                  break L13;
                                                                }
                                                              }
                                                              stackIn_99_0.field_Xb = stackIn_99_1 != 0;
                                                              var7_ref.field_Yb = var8 >> 1;
                                                              var7_ref.field_Qb = ((we) (Object) var1_ref).f(255);
                                                              var7_ref.field_Ib = ((we) (Object) var1_ref).f(255);
                                                              wi.field_a.a(22125, (fa) (Object) var7_ref);
                                                              break L1;
                                                            } else {
                                                              if (19 == var2) {
                                                                var3 = ((we) (Object) var1_ref).a(false);
                                                                var5 = ((we) (Object) var1_ref).f(255);
                                                                var6_ref = ll.a(var3, 14428);
                                                                if (var6_ref != null) {
                                                                  L14: {
                                                                    if (var5 != 0) {
                                                                      var6_ref.field_Eb = var5;
                                                                      var6_ref.field_Tb = mh.field_b;
                                                                      break L14;
                                                                    } else {
                                                                      var6_ref.c(2779);
                                                                      break L14;
                                                                    }
                                                                  }
                                                                  var6_ref.e(17);
                                                                  io.field_c.field_mc = io.field_c.field_mc - 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (20 == var2) {
                                                                  kd.a(false, io.field_c, (byte) 120, (we) (Object) var1_ref);
                                                                  break L1;
                                                                } else {
                                                                  if (var2 == 21) {
                                                                    var3_int = ((we) (Object) var1_ref).a((byte) -120);
                                                                    if (var3_int == 0) {
                                                                      bo.field_e = 0L;
                                                                      break L1;
                                                                    } else {
                                                                      bo.field_e = (long)var3_int + hm.a(64);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (var2 != 22) {
                                                                      if (var2 != 23) {
                                                                        jo.a(1, "L1: " + jm.b(-74), (Throwable) null);
                                                                        na.a(true);
                                                                        break L1;
                                                                      } else {
                                                                        hn.field_f = ((we) (Object) var1_ref).a(false);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      gi.field_a = ((we) (Object) var1_ref).a((byte) 63);
                                                                      ui.field_e = ((we) (Object) var1_ref).j(127);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L15: {
                                                        var3 = ((we) (Object) var1_ref).a(false);
                                                        var5 = ((we) (Object) var1_ref).f(255);
                                                        var6_ref = gp.a(2, var3);
                                                        if (var6_ref == null) {
                                                          break L15;
                                                        } else {
                                                          L16: {
                                                            if (15 != var2) {
                                                              if (!var6_ref.field_Jb) {
                                                                break L16;
                                                              } else {
                                                                ka.field_X = ka.field_X - 1;
                                                                var6_ref.field_Jb = false;
                                                                break L16;
                                                              }
                                                            } else {
                                                              var6_ref.field_Vb = false;
                                                              break L16;
                                                            }
                                                          }
                                                          L17: {
                                                            if (var5 == 0) {
                                                              break L17;
                                                            } else {
                                                              var6_ref.field_Tb = mh.field_b;
                                                              var6_ref.field_Eb = var5;
                                                              break L17;
                                                            }
                                                          }
                                                          il.a(-124, var6_ref);
                                                          break L15;
                                                        }
                                                      }
                                                      break L1;
                                                    }
                                                  }
                                                }
                                                L18: {
                                                  var3 = ((we) (Object) var1_ref).a(false);
                                                  var5_ref_uj = gp.a(2, var3);
                                                  if (var5_ref_uj == null) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (var2 == 14) {
                                                        var5_ref_uj.field_Vb = true;
                                                        break L19;
                                                      } else {
                                                        if (var5_ref_uj.field_Jb) {
                                                          break L19;
                                                        } else {
                                                          ka.field_X = ka.field_X + 1;
                                                          var5_ref_uj.field_Jb = true;
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    il.a(-97, var5_ref_uj);
                                                    break L18;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                var3_int = ((we) (Object) var1_ref).a((byte) 107);
                                                var4_int = ((we) (Object) var1_ref).f(255);
                                                var5_ref_eq = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                                if (var5_ref_eq != null) {
                                                  L20: {
                                                    var5_ref_eq.field_Ob = false;
                                                    var6_ref2 = var5_ref_eq;
                                                    if (var4_int != 0) {
                                                      var5_ref_eq.field_Rb = mh.field_b;
                                                      var5_ref_eq.field_Qb = var4_int;
                                                      break L20;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                  var6_ref2.field_cc = false;
                                                  w.a((byte) -48, var5_ref_eq);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var3_int = ((we) (Object) var1_ref).a((byte) -124);
                                        var4_ref = (eq) (Object) dg.field_f.a(-11434, (long)var3_int);
                                        if (var4_ref != null) {
                                          L21: {
                                            if (var2 != 11) {
                                              var4_ref.field_Ob = true;
                                              break L21;
                                            } else {
                                              var4_ref.field_cc = true;
                                              break L21;
                                            }
                                          }
                                          w.a((byte) -48, var4_ref);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3_ref_uj = (uj) (Object) i.field_n.c(1504642273);
                                  L22: while (true) {
                                    if (var3_ref_uj == null) {
                                      ka.field_X = 0;
                                      break L1;
                                    } else {
                                      var3_ref_uj.c(2779);
                                      var3_ref_uj.e(17);
                                      var3_ref_uj = (uj) (Object) i.field_n.f(1504642273);
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              L23: {
                                var3 = ((we) (Object) var1_ref).a(false);
                                var5_ref_String = ((we) (Object) var1_ref).h(5);
                                var6 = ((we) (Object) var1_ref).h(5);
                                var7 = ((we) (Object) var1_ref).h(5);
                                var8_ref_uj = gp.a(2, var3);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_43_0 = 0;
                                  stackIn_44_0 = stackOut_43_0;
                                  break L23;
                                } else {
                                  stackOut_42_0 = 1;
                                  stackIn_44_0 = stackOut_42_0;
                                  break L23;
                                }
                              }
                              L24: {
                                var9 = stackIn_44_0;
                                if (var8_ref_uj != null) {
                                  if (var9 == 0) {
                                    break L24;
                                  } else {
                                    var8_ref_uj.a(var7, var5_ref_String, false);
                                    break L24;
                                  }
                                } else {
                                  var8_ref_uj = new uj(var5_ref_String, var7, var3);
                                  il.field_d.a(false, (lm) (Object) var8_ref_uj, var3);
                                  break L24;
                                }
                              }
                              L25: {
                                var8_ref_uj.field_Pb = hm.a(64) - (long)((we) (Object) var1_ref).k(0);
                                var8_ref_uj.field_Rb = ((we) (Object) var1_ref).a((byte) 105);
                                var10 = ((we) (Object) var1_ref).j(127);
                                var8_ref_uj.field_Yb = var10 >> 1;
                                stackOut_48_0 = (uj) var8_ref_uj;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_49_0 = stackOut_48_0;
                                if ((var10 & 1) == 0) {
                                  stackOut_50_0 = (uj) (Object) stackIn_50_0;
                                  stackOut_50_1 = 0;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  break L25;
                                } else {
                                  stackOut_49_0 = (uj) (Object) stackIn_49_0;
                                  stackOut_49_1 = 1;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  break L25;
                                }
                              }
                              stackIn_51_0.field_Xb = stackIn_51_1 != 0;
                              var8_ref_uj.field_Qb = ((we) (Object) var1_ref).f(255);
                              var8_ref_uj.field_Ib = ((we) (Object) var1_ref).f(255);
                              il.a(-28, var8_ref_uj);
                              break L1;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_uj = (uj) (Object) wi.field_a.c(1504642273);
                L26: while (true) {
                  if (var3_ref_uj == null) {
                    var3_ref_uj = (uj) (Object) il.field_d.a(-110);
                    L27: while (true) {
                      if (var3_ref_uj == null) {
                        L28: {
                          if (var2 != 1) {
                            break L28;
                          } else {
                            if (null != io.field_c) {
                              wo.field_b = io.field_c.field_pc;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          if (var2 == 4) {
                            var3_int = ((we) (Object) var1_ref).a((byte) 49);
                            io.field_c = new eq(fj.field_b);
                            io.field_c.a((long)var3_int, 29574);
                            kd.a(false, io.field_c, (byte) 120, (we) (Object) var1_ref);
                            bo.field_e = 0L;
                            break L29;
                          } else {
                            io.field_c = null;
                            break L29;
                          }
                        }
                        L30: {
                          L31: {
                            if (var2 == 2) {
                              break L31;
                            } else {
                              if (var2 != 3) {
                                bn.field_S = null;
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                          if (bn.field_S != null) {
                            break L30;
                          } else {
                            bn.field_S = new eq(fj.field_b);
                            break L30;
                          }
                        }
                        if (var2 != 3) {
                          rl.field_r = false;
                          break L1;
                        } else {
                          rl.field_r = true;
                          var3_int = 0;
                          L32: while (true) {
                            if (~var3_int <= ~qm.field_J.length) {
                              ib.field_a = ((we) (Object) var1_ref).f(255);
                              mg.field_i = ((we) (Object) var1_ref).f(255);
                              var3_int = 0;
                              L33: while (true) {
                                if (k.field_k.length <= var3_int) {
                                  break L2;
                                } else {
                                  k.field_k[var3_int] = ((we) (Object) var1_ref).a(0);
                                  var3_int++;
                                  continue L33;
                                }
                              }
                            } else {
                              qm.field_J[var3_int] = ((we) (Object) var1_ref).a(0);
                              var3_int++;
                              continue L32;
                            }
                          }
                        }
                      } else {
                        L34: {
                          L35: {
                            if (var3_ref_uj.field_Vb) {
                              break L35;
                            } else {
                              if (!var3_ref_uj.field_Jb) {
                                break L34;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (!var3_ref_uj.field_Jb) {
                              break L36;
                            } else {
                              ka.field_X = ka.field_X - 1;
                              var3_ref_uj.field_Jb = false;
                              break L36;
                            }
                          }
                          var3_ref_uj.field_Vb = false;
                          il.a(-117, var3_ref_uj);
                          break L34;
                        }
                        var3_ref_uj = (uj) (Object) il.field_d.a((byte) 50);
                        continue L27;
                      }
                    }
                  } else {
                    var3_ref_uj.c(2779);
                    var3_ref_uj.e(17);
                    var3_ref_uj = (uj) (Object) wi.field_a.f(1504642273);
                    continue L26;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "pl.O(" + 1 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, db param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                if (param0 != 1) {
                  if (param0 != 2) {
                    break L1;
                  } else {
                    jc.a("conduct.ws", -120);
                    break L1;
                  }
                } else {
                  jc.a("privacy.ws", -27);
                  break L1;
                }
              } else {
                jc.a("terms.ws", -14);
                break L1;
              }
            }
            L2: {
              if (param2 == -8894) {
                break L2;
              } else {
                var7 = null;
                int discarded$2 = this.a((String) null, 66, (ng) null, -19, -43);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("pl.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                ((pl) this).field_K = null;
                break L1;
              }
            }
            L2: {
              if (((pl) this).field_K != param0) {
                if (param0 == ((pl) this).field_R) {
                  int discarded$4 = 10152;
                  boolean discarded$5 = this.a();
                  break L2;
                } else {
                  break L2;
                }
              } else {
                mj.c(24496);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("pl.Q(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final boolean a(bp param0) {
        ml var3 = null;
        RuntimeException var3_ref = null;
        dj var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3 = param0.a(1);
            if (var3 == null) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var4 = var3.a((byte) 112);
              if (sk.field_a != var4) {
                if (var4 != uo.field_b) {
                  if (var4 == wh.field_o) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    boolean discarded$2 = pl.m(-52);
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("pl.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 0 + 41);
        }
        return stackIn_15_0 != 0;
    }

    public final void a(String param0, byte param1) {
        gk var3 = null;
        String var5 = null;
        try {
            int var4 = 117 % ((34 - param1) / 59);
            var3 = ((pl) this).field_U;
            var5 = param0;
            ((c) (Object) var3).a(false, (byte) 87, var5);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pl.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final int a(String param0, ng param1, int param2, int param3, int param4, int param5, String param6) {
        qp var8 = null;
        RuntimeException var8_ref = null;
        md var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = new qp(20, param4, 290, 25, param1, false, 120, 3, he.field_d, 16777215, param0);
            ((pl) this).b((ng) (Object) var8, 80);
            var9 = new md(((bp) (Object) param1).a(1), param6, 126, var8.field_C + param4, 220, param2);
            var9.field_n = (fn) this;
            ((pl) this).b((ng) (Object) var9, 80);
            stackOut_0_0 = var8.field_C + var9.field_C;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8_ref;
            stackOut_2_1 = new StringBuilder().append("pl.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(170).append(44).append(param4).append(44).append(126).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    private final String n(int param0) {
        if (param0 != 3) {
            String discarded$0 = this.n(-59);
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 != 98) {
                if (99 != param0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((pl) this).b(10, param2);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((pl) this).a(param1 + -3, param2);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("pl.G(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final boolean a() {
        if (!this.d(true)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((pl) this).field_Q.field_q);
        } catch (NumberFormatException numberFormatException) {
        }
        return oi.a((pl) this, var2, ((pl) this).field_T.field_M, ((pl) this).field_P.field_q, (byte) -98, ((pl) this).field_V.field_q, ((pl) this).field_U.field_q);
    }

    private final boolean d(boolean param0) {
        L0: {
          int discarded$12 = 0;
          if (!this.a((bp) (Object) ((pl) this).field_U)) {
            break L0;
          } else {
            int discarded$13 = 0;
            if (!this.a((bp) (Object) ((pl) this).field_P)) {
              break L0;
            } else {
              int discarded$14 = 0;
              if (!this.a((bp) (Object) ((pl) this).field_L)) {
                break L0;
              } else {
                int discarded$15 = 0;
                if (!this.a((bp) (Object) ((pl) this).field_V)) {
                  break L0;
                } else {
                  int discarded$16 = 0;
                  if (!this.a((bp) (Object) ((pl) this).field_X)) {
                    break L0;
                  } else {
                    int discarded$17 = 0;
                    if (this.a((bp) (Object) ((pl) this).field_Q)) {
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    public static void e() {
        field_J = null;
        field_Y = null;
    }

    final static boolean m(int param0) {
        if (param0 != 99) {
            field_O = 123;
        }
        return hn.field_f == io.field_c.field_kc ? true : false;
    }

    private final int a(String param0, int param1, ng param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            stackOut_0_0 = this.a(param5, param2, 35, 170, param1, 126, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("pl.R(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(35).append(44).append(170).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new bb();
    }
}
