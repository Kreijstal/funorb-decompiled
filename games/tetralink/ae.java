/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ae extends na {
    boolean field_N;
    static hl field_J;
    private boolean field_O;
    boolean field_K;
    private boolean field_I;
    static String field_M;
    static int field_L;

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          L0: {
            we.a(0, ai.field_h, nd.field_Mb, param1, true, 0, eh.field_s);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int <= ~nd.field_Mb) {
                    break L3;
                  } else {
                    qd.field_W[var2_int - -param1] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                we.a(0, mh.field_d, param1 + nd.field_Mb, param1 + param1, false, param1, va.field_z);
                break L2;
              }
              L4: {
                if (~nd.field_Mb >= ~param1) {
                  break L4;
                } else {
                  nd.field_Mb = param1;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ae.BA(" + 94 + ',' + param1 + ')');
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 80) {
                break L1;
              } else {
                ((ae) this).field_O = true;
                break L1;
              }
            }
            L2: {
              if (null == ((ae) this).field_s) {
                break L2;
              } else {
                if (((ae) this).field_s instanceof dm) {
                  ((dm) (Object) ((ae) this).field_s).a((byte) -55, (ae) this, param3, param1, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var5, "ae.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (!((ae) this).field_K) {
                break L1;
              } else {
                if (((ae) this).field_I) {
                  L2: {
                    param0.f(-102);
                    ((ae) this).field_O = true;
                    if (null == ((ae) this).field_s) {
                      break L2;
                    } else {
                      if (!(((ae) this).field_s instanceof ub)) {
                        break L2;
                      } else {
                        ((ub) (Object) ((ae) this).field_s).a(param1 ^ 384161774, (na) this, ((ae) this).field_O);
                        break L2;
                      }
                    }
                  }
                  if (param1 == -384169950) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ae.EB(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(java.math.BigInteger param0, bh param1, bh param2, java.math.BigInteger param3, int param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param4 > 54) {
                break L1;
              } else {
                field_L = 109;
                break L1;
              }
            }
            ac.a((byte) 92, param2.field_u, param2.field_t, param1, 0, param0, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ae.EA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param4 + ')');
        }
    }

    ae(String param0, dn param1) {
        this(param0, dh.field_q.field_n, param1);
    }

    final static void d() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            bo.field_C = new je();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "ae.W(" + 82 + ')');
        }
    }

    final static ud a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        je var4 = null;
        Object var5 = null;
        Object var6 = null;
        ud var7 = null;
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
        rb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        boolean stackIn_2_4 = false;
        rb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        boolean stackIn_4_4 = false;
        rb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        boolean stackIn_5_4 = false;
        int stackIn_5_5 = 0;
        hl stackIn_42_0 = null;
        hl stackIn_44_0 = null;
        hl stackIn_45_0 = null;
        String stackIn_45_1 = null;
        hl stackIn_46_0 = null;
        hl stackIn_48_0 = null;
        hl stackIn_49_0 = null;
        String stackIn_49_1 = null;
        int stackIn_53_0 = 0;
        Object stackIn_102_0 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        boolean stackOut_1_4 = false;
        rb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        boolean stackOut_4_4 = false;
        int stackOut_4_5 = 0;
        rb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        boolean stackOut_2_4 = false;
        int stackOut_2_5 = 0;
        hl stackOut_41_0 = null;
        hl stackOut_44_0 = null;
        String stackOut_44_1 = null;
        hl stackOut_42_0 = null;
        String stackOut_42_1 = null;
        hl stackOut_45_0 = null;
        hl stackOut_48_0 = null;
        String stackOut_48_1 = null;
        hl stackOut_46_0 = null;
        String stackOut_46_1 = null;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        Object stackOut_101_0 = null;
        var19 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              stackOut_1_0 = pj.field_f.field_Rb;
              stackOut_1_1 = 2;
              stackOut_1_2 = qe.field_d + 2;
              stackOut_1_3 = -127;
              stackOut_1_4 = param0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_4_4 = stackOut_1_4;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              if (bi.field_d != pj.field_f.field_Rb) {
                stackOut_4_0 = (rb) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                break L1;
              } else {
                stackOut_2_0 = (rb) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                stackIn_5_5 = stackOut_2_5;
                break L1;
              }
            }
            var3_int = ((rb) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5 != 0, param1 * (6 + qe.field_d * 3)) ? 1 : 0;
            var4 = pj.field_f.field_Kb.field_fb;
            L2: {
              L3: {
                var5 = null;
                if (ji.field_Tb == 2) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      mi.field_Kb.field_jb = dg.field_m;
                      go.field_d.field_S = false;
                      if (ji.field_Tb == 1) {
                        break L5;
                      } else {
                        pj.field_f.field_Rb.field_Ob.field_jb = kl.field_f;
                        if (var19 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    pj.field_f.field_Rb.field_Ob.field_jb = oe.field_t;
                    break L4;
                  }
                  int discarded$2 = -104;
                  hd.a(pj.field_f.field_Kb);
                  if (var19 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              go.field_d.field_S = true;
              mi.field_Kb.field_jb = sk.a(new String[1], vc.field_a, 127);
              pj.field_f.field_Rb.field_Ob.field_jb = null;
              var6 = null;
              var7 = (ud) (Object) var4.c(false);
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var7) {
                      break L8;
                    } else {
                      var8 = 0;
                      if (var19 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (null != var7.field_fb) {
                            break L9;
                          } else {
                            var7.field_Tb = new hl(0L, sk.field_h);
                            var7.a((byte) -114, var7.field_Tb);
                            var7.field_Wb = new hl(0L, ga.field_c);
                            var7.a((byte) 94, var7.field_Wb);
                            var7.field_Kb = new hl(0L, sk.field_h);
                            var7.a((byte) -122, var7.field_Kb);
                            var7.field_Wb.field_xb = 2;
                            var8 = 1;
                            var7.c((byte) -43);
                            break L9;
                          }
                        }
                        L10: {
                          L11: {
                            var7.field_Hb = pj.field_f.field_Kb.field_Hb;
                            var9 = 0;
                            if (null == var7.field_Ub) {
                              break L11;
                            } else {
                              L12: {
                                if (ul.field_e == var7.field_Ub) {
                                  break L12;
                                } else {
                                  var11 = 16777062;
                                  var10 = 13421568;
                                  if (var19 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var11 = 6750054;
                              var10 = 52224;
                              if (var19 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var10 = 13369344;
                          var11 = 16737894;
                          break L10;
                        }
                        L13: {
                          var12 = 0;
                          if (var7.field_Vb == null) {
                            break L13;
                          } else {
                            if (var7.field_Vb.equals((Object) (Object) "")) {
                              break L13;
                            } else {
                              var7.field_Kb.field_vb = db.field_b;
                              var7.field_Kb.field_L = var11;
                              var7.field_Kb.a((byte) -120, 3 + db.field_b.field_t, var9, qe.field_d, 0);
                              var12 = 1;
                              break L13;
                            }
                          }
                        }
                        L14: {
                          var7.field_Wb.field_ib = var11;
                          var7.field_Tb.field_ib = var11;
                          var7.field_Wb.field_nb = var11;
                          var7.field_Tb.field_nb = var11;
                          var7.field_Wb.field_N = var10;
                          var7.field_Tb.field_N = var10;
                          var7.field_Wb.field_L = var11;
                          var7.field_Tb.field_L = var11;
                          var13 = 0;
                          var14 = var7.field_Hb - 82;
                          if (var12 != 0) {
                            var13 = db.field_b.field_t - -3;
                            var14 = var14 - var13;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          stackOut_41_0 = var7.field_Tb;
                          stackIn_44_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (var14 > 0) {
                            stackOut_44_0 = (hl) (Object) stackIn_44_0;
                            stackOut_44_1 = jb.a(var7.field_Tb.field_Ib, var7.field_Mb, var14);
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            break L15;
                          } else {
                            stackOut_42_0 = (hl) (Object) stackIn_42_0;
                            stackOut_42_1 = var7.field_Mb;
                            stackIn_45_0 = stackOut_42_0;
                            stackIn_45_1 = stackOut_42_1;
                            break L15;
                          }
                        }
                        L16: {
                          stackIn_45_0.field_jb = stackIn_45_1;
                          var7.field_Tb.a((byte) -93, var14, var9, qe.field_d, var13);
                          stackOut_45_0 = var7.field_Wb;
                          stackIn_48_0 = stackOut_45_0;
                          stackIn_46_0 = stackOut_45_0;
                          if (var7.field_Ub != null) {
                            stackOut_48_0 = (hl) (Object) stackIn_48_0;
                            stackOut_48_1 = var7.field_Ub;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L16;
                          } else {
                            stackOut_46_0 = (hl) (Object) stackIn_46_0;
                            stackOut_46_1 = j.field_t;
                            stackIn_49_0 = stackOut_46_0;
                            stackIn_49_1 = stackOut_46_1;
                            break L16;
                          }
                        }
                        L17: {
                          stackIn_49_0.field_jb = stackIn_49_1;
                          var7.field_Wb.a((byte) -108, 80, var9, qe.field_d, var7.field_Hb + -80);
                          if (var7.field_Tb.field_jb.equals((Object) (Object) var7.field_Mb)) {
                            stackOut_52_0 = 0;
                            stackIn_53_0 = stackOut_52_0;
                            break L17;
                          } else {
                            stackOut_50_0 = 1;
                            stackIn_53_0 = stackOut_50_0;
                            break L17;
                          }
                        }
                        L18: {
                          var15 = stackIn_53_0;
                          var9 = var9 + qe.field_d;
                          if (var3_int == 0) {
                            var7.field_mb = var9 + -var7.field_R;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (var8 == 0) {
                            break L19;
                          } else {
                            pj.field_f.field_Kb.a((hl) var6, true, (hl) (Object) var7, 2);
                            break L19;
                          }
                        }
                        L20: {
                          L21: {
                            L22: {
                              if (var7.field_Kb == null) {
                                break L22;
                              } else {
                                if (var7.field_Kb.field_Y) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (var7.field_F == 0) {
                                break L23;
                              } else {
                                L24: {
                                  var16 = var7.field_Mb;
                                  gd.a(var16, 255, (String) null, -1, pj.field_f.field_Rb, (int[]) null, 0L, (hl) (Object) var7, -1);
                                  if (null == var7.field_Ub) {
                                    break L24;
                                  } else {
                                    int discarded$3 = -80;
                                    if (cc.a(hd.field_s.field_b)) {
                                      break L24;
                                    } else {
                                      if (cd.field_a) {
                                        break L24;
                                      } else {
                                        L25: {
                                          if (!fn.field_K) {
                                            var17 = hd.field_s;
                                            var18 = sk.a(new String[1], jk.field_a, 123);
                                            var17.field_j.a(var18, 1, 8);
                                            break L25;
                                          } else {
                                            break L25;
                                          }
                                        }
                                        var17 = hd.field_s;
                                        var18 = sk.a(new String[1], pl.field_b, 125);
                                        var17.field_j.a(var18, 1, 18);
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                var5 = (Object) (Object) var7;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (!var7.field_Tb.field_Y) {
                              break L20;
                            } else {
                              if (var15 == 0) {
                                break L20;
                              } else {
                                re.field_P = var7.field_Mb;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          re.field_P = var7.field_Vb;
                          break L20;
                        }
                        var6 = (Object) (Object) var7;
                        var7 = (ud) (Object) var4.a((byte) -70);
                        if (var19 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  if (pj.field_f.field_Sb.field_F == 0) {
                    break L7;
                  } else {
                    lf.field_b = new vg(pj.field_f.field_Sb.field_eb, pj.field_f.field_Sb.field_z, pj.field_f.field_Sb.field_Hb, pj.field_f.field_Sb.field_R, qj.field_d, um.field_n, bk.field_i, bk.field_i);
                    ke.field_c = 0;
                    break L7;
                  }
                }
                if (pj.field_f.field_Pb.field_F != 0) {
                  lf.field_b = new vg(pj.field_f.field_Pb.field_eb, pj.field_f.field_Pb.field_z, pj.field_f.field_Pb.field_Hb, pj.field_f.field_Pb.field_R, wg.field_g, um.field_n, bk.field_i, bk.field_i);
                  ke.field_c = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_101_0 = var5;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ae.CA(" + param0 + ',' + param1 + ',' + -13047 + ')');
        }
        return (ud) (Object) stackIn_102_0;
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!((ae) this).c(3)) {
                break L1;
              } else {
                L2: {
                  if (param0 == 84) {
                    break L2;
                  } else {
                    if (param0 == 83) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((ae) this).b(-1, -1, 80, 1);
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L3: {
              if (param2 == 1) {
                break L3;
              } else {
                ((ae) this).field_K = true;
                break L3;
              }
            }
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("ae.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_J = null;
            field_M = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "ae.DA(" + true + ')');
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_13_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (((ae) this).a(param0, param2, 80, param1)) {
                L2: {
                  ((ae) this).a(-126, param1, param0, param2);
                  if (!((ae) this).field_N) {
                    break L2;
                  } else {
                    StringBuilder discarded$2 = param1.append(" active");
                    break L2;
                  }
                }
                if (!((ae) this).field_K) {
                  StringBuilder discarded$3 = param1.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param3 == -372494750) {
              stackOut_13_0 = (StringBuilder) param1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              return (StringBuilder) (Object) stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ae.WA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (null == ((ae) this).field_s) {
                  break L1;
                } else {
                  if (((ae) this).field_s instanceof tf) {
                    ((tf) (Object) ((ae) this).field_s).a(param0, param4, param3, (ae) this, param5, 126);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ((ae) this).field_x = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("ae.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == -32738) {
                break L1;
              } else {
                field_J = null;
                break L1;
              }
            }
            L2: {
              if (!((ae) this).field_K) {
                break L2;
              } else {
                if (((ae) this).b(param6, 1343807649, param1, param3, param5)) {
                  L3: {
                    boolean discarded$1 = ((ae) this).a(param0, -384169950);
                    ((ae) this).field_x = param2;
                    if (null == ((ae) this).field_s) {
                      break L3;
                    } else {
                      if (((ae) this).field_s instanceof tf) {
                        ((tf) (Object) ((ae) this).field_s).a(param3, param6, param1, 9294, param5, (ae) this, param2);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  break L2;
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var8;
            stackOut_20_1 = new StringBuilder().append("ae.PA(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_19_0 != 0;
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (0 == ((ae) this).field_x) {
                break L1;
              } else {
                if (ho.field_X != ((ae) this).field_x) {
                  L2: {
                    if (!((ae) this).b(aa.field_Nb, 1343807649, param1, param2, a.field_a)) {
                      break L2;
                    } else {
                      if (ho.field_X == 0) {
                        ((ae) this).b(-param2 + a.field_a, -param1 + aa.field_Nb, 80, ((ae) this).field_x);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((ae) this).a(a.field_a, false, param0, param2, aa.field_Nb, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ae.MA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ae(String param0, kg param1, dn param2) {
        super(param0, param1, param2);
        ((ae) this).field_K = true;
        ((ae) this).field_O = false;
        ((ae) this).field_I = true;
    }

    protected ae() {
        ((ae) this).field_K = true;
        ((ae) this).field_O = false;
        ((ae) this).field_I = true;
        try {
            ((ae) this).field_H = dh.field_q.field_t;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ae.<init>()");
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((ae) this).field_O) {
                break L1;
              } else {
                ((ae) this).field_O = false;
                if (((ae) this).field_s == null) {
                  break L1;
                } else {
                  if (!(((ae) this).field_s instanceof ub)) {
                    break L1;
                  } else {
                    ((ub) (Object) ((ae) this).field_s).a(-8244, (na) this, ((ae) this).field_O);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 <= -63) {
                break L2;
              } else {
                field_M = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ae.UA(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                ((ae) this).field_K = true;
                break L1;
              }
            }
            stackOut_3_0 = ((ae) this).field_O;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "ae.JA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "You need a rating of <%1> to play with the current options.";
        field_L = 0;
    }
}
