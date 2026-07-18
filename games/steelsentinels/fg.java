/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends k implements ae {
    static ul field_Ub;
    private boolean field_Nb;
    private vi field_Zb;
    static uf field_Tb;
    static String field_Pb;
    static volatile int field_Rb;
    static String field_Qb;
    private boolean field_Sb;
    static rf field_Yb;
    static String field_Vb;
    static String field_Wb;
    static int field_Ob;
    static int[] field_Xb;

    final static void n(int param0) {
    }

    final static pc a(int param0, int param1, int param2, sk param3) {
        RuntimeException var4 = null;
        pc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = on.a(em.b(param3, 100, param0, param1), -48);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("fg.FB(").append(param0).append(',').append(param1).append(',').append(248).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void o(byte param0) {
        field_Xb = null;
        field_Tb = null;
        field_Yb = null;
        field_Pb = null;
        field_Ub = null;
        field_Vb = null;
        field_Wb = null;
        field_Qb = null;
    }

    private final void a(int param0, boolean param1, e param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        bm var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ((fg) this).field_Nb = true;
              if (!param2.field_d) {
                if (param2.field_c == null) {
                  var4_ref = param2.field_e;
                  if (248 == param2.field_a) {
                    L2: {
                      if (!param1) {
                        ud.a(true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = ec.field_g;
                    ((fg) this).field_Sb = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = field_Qb;
                  if (((fg) this).field_Zb == null) {
                    break L1;
                  } else {
                    ((fg) this).field_Zb.a((byte) 86);
                    break L1;
                  }
                }
              } else {
                var4_ref = lk.field_Z;
                break L1;
              }
            }
            L3: {
              L4: {
                var5 = new bm((k) this, gf.field_d, var4_ref);
                if (param2.field_d) {
                  if (!param2.field_f) {
                    oa discarded$2 = var5.a(-122, (tn) this, ah.field_Sb);
                    break L4;
                  } else {
                    ((fg) this).c((lh) (Object) new nj((fg) this), -22908735);
                    return;
                  }
                } else {
                  L5: {
                    if (!((fg) this).field_Sb) {
                      if (param2.field_a == 5) {
                        var5.a(11, cl.field_c, 107);
                        var5.a(17, qe.field_b, 74);
                        break L5;
                      } else {
                        var5.a(-1, le.field_J, 75);
                        break L5;
                      }
                    } else {
                      oa discarded$3 = var5.a(-110, (tn) this, ah.field_Sb);
                      break L5;
                    }
                  }
                  if (3 != param2.field_a) {
                    if (param2.field_a == 6) {
                      var5.a(9, rn.field_s, 74);
                      break L4;
                    } else {
                      ((fg) this).c((lh) (Object) var5, -22908735);
                      break L3;
                    }
                  } else {
                    var5.a(7, vg.field_d, 76);
                    break L4;
                  }
                }
              }
              ((fg) this).c((lh) (Object) var5, -22908735);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("fg.UA(").append(5).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_int = 8 + param4 + (485 + param3 + 10);
              vg.field_g.a(0, 3, -6 + qc.field_V.field_Lb, 3, -6 + var6_int);
              var7 = -5 + vg.field_g.field_Lb;
              ee.field_H.a(0, var7 - param1, param1, 5, param3 + 487 - -param4);
              vd.field_d.a(0, 0, param1, param3, -wh.field_e.field_zb + (-param3 + ee.field_H.field_zb));
              wh.field_e.a(0, 0, param1, vd.field_d.field_zb + param3, wh.field_e.field_zb);
              var7 = var7 - (2 + param1);
              sn.field_j.a(param4 + param3 + 487, -2048, param4, var7 + -5, 2, 5, 5);
              if (ve.field_b != null) {
                ve.field_b.a(sn.field_j.field_Y, (byte) -92, sn.field_j.field_eb, sn.field_j.field_zb, sn.field_j.field_Lb);
                break L1;
              } else {
                break L1;
              }
            }
            var8 = -param3 + (qc.field_V.field_zb - var6_int);
            var9 = var8 / 2;
            var10 = param3 + (param2 + var9);
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (5 <= var12) {
                      break L4;
                    } else {
                      if (ah.field_Yb[var12] == null) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var13 = 3 - -(var11 * (2 + (-6 + qc.field_V.field_Lb)) / (1 + c.field_u));
                  var11++;
                  var7 = var11 * (-4 + qc.field_V.field_Lb) / (1 + c.field_u) + 1 + -var13;
                  if (var12 < 5) {
                    ah.field_Yb[var12].a(0, var13, var7, var6_int, var8);
                    en.field_b[var12].a(0, 0, var7, param3, -param3 + var9);
                    jk.field_a[var12].a(0, param5, var7 - param5 - param5, var9, param2);
                    gb.field_f[var12].a(0, param5, -param5 + (var7 + -param5), var10, -var10 + (-param3 + var8));
                    break L3;
                  } else {
                    fm.field_b.a(0, var13, var7, var6_int, var8);
                    break L3;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var6, "fg.BB(" + 10 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean i(int param0) {
        e var2 = null;
        if (((fg) this).field_Q) {
            if (!(((fg) this).field_Nb)) {
                var2 = al.b((byte) 73);
                if (!(var2 == null)) {
                    this.a(5, false, var2);
                }
            }
        }
        if (param0 != -8350) {
            boolean discarded$0 = fg.p((byte) -108);
        }
        return super.i(param0);
    }

    final static hl a(int param0, int param1) {
        hl var2 = new hl();
        if (param1 != 19999) {
            hl discarded$0 = fg.a(125, 90);
        }
        ic.field_D.a(3, (ck) (Object) var2);
        eh.a(param0, -17274);
        return var2;
    }

    final static boolean p(byte param0) {
        int var1 = 77 / ((param0 - 28) / 44);
        return null != tj.field_f ? true : false;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -21) {
                break L1;
              } else {
                field_Tb = null;
                break L1;
              }
            }
            stackOut_2_0 = bi.a(true, 10, false, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fg.CB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        if (!(!((fg) this).field_Sb)) {
            ok.a(false, true, 95);
            return;
        }
        try {
            lc.a(0);
            ((fg) this).m(112);
            int var6_int = -27 / ((param1 - -85) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "fg.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    fg(ka param0, vi param1) {
        super(param0, gf.field_d, hk.field_Jc, false, false);
        try {
            ((fg) this).field_Zb = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void o(int param0) {
        this.a(5, true, fi.a(123, ec.field_g, 248));
        if (param0 < 77) {
            field_Yb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "That name is not available";
        field_Rb = 0;
        field_Pb = "or";
        field_Ub = new ul();
        field_Vb = "Detail: Low";
        field_Yb = new rf();
        field_Wb = "Mission Complete";
        field_Ob = 1;
        field_Xb = new int[]{0, 5, 10, 1, 6, 11, 2, 7, 12, 33, 32, 26, 18, 21, 28, 29, 36, 27, 24, 3, 8, 13, 9, 4, 14, 42, 15, 39, 40, 20, 30, 35, 38, 37, 44, 41};
    }
}
