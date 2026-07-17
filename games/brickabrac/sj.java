/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static String field_g;
    static ie field_f;
    static String field_e;
    static mh field_a;
    static String[] field_c;
    static mh field_d;
    static tb field_b;

    final static gb a(int param0, int param1, int param2, int param3) {
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gb var8_ref_gb = null;
        int var9 = 0;
        gb var9_ref_gb = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var13 = BrickABrac.field_J ? 1 : 0;
        var4 = null;
        i.field_q.field_Rb.field_bb.c((byte) -61);
        var5 = 0;
        var6 = 0;
        var7 = -1 + mm.field_Sb;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (mm.field_Sb <= var8) {
                L2: {
                  var8 = i.field_q.field_Rb.field_C + i.field_q.field_Rb.field_cb - (-var6 + var7);
                  i.field_q.field_Rb.field_cb = i.field_q.field_Rb.field_cb - var8;
                  i.field_q.field_Rb.field_zb = i.field_q.field_Rb.field_zb + var8;
                  if (oi.field_d) {
                    i.field_q.field_Rb.field_cb = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  i.field_q.field_Rb.field_C = var7 - i.field_q.field_Rb.field_cb;
                  if (!oi.field_d) {
                    break L3;
                  } else {
                    oi.field_d = false;
                    i.field_q.field_Rb.field_zb = i.field_q.field_Qb.field_cb - i.field_q.field_Rb.field_cb;
                    nd.field_b = true;
                    i.field_q.field_Rb.field_Db = 0;
                    break L3;
                  }
                }
                L4: {
                  if (param2 == -13294) {
                    break L4;
                  } else {
                    field_d = null;
                    break L4;
                  }
                }
                L5: {
                  if (!ld.field_s) {
                    break L5;
                  } else {
                    if (null != wp.field_k) {
                      nd.field_b = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = i.field_q.field_Qb.field_cb - (i.field_q.field_Rb.field_cb - -i.field_q.field_Rb.field_C);
                  if (!nd.field_b) {
                    break L6;
                  } else {
                    i.field_q.field_Rb.field_Db = var9 - i.field_q.field_Rb.field_zb;
                    break L6;
                  }
                }
                L7: {
                  i.field_q.a(true, param1, true, 2 * (param1 * param3));
                  if (var9 != i.field_q.field_Rb.field_Db + i.field_q.field_Rb.field_zb) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L7;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L7;
                  }
                }
                nd.field_b = stackIn_44_0 != 0;
                return (gb) var4;
              } else {
                var9_ref_gb = jk.field_s[var8];
                if (null != var9_ref_gb.field_b) {
                  L8: {
                    i.field_q.field_Rb.a(var9_ref_gb.field_b, 0);
                    var9_ref_gb.field_b.a(param1, var7, param0, var9_ref_gb.field_b.g(87), (byte) 64);
                    if (var9_ref_gb.field_b.field_L != 0) {
                      var4 = (Object) (Object) var9_ref_gb;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var7 = var7 + param1;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L9: {
              var8_ref_gb = jk.field_s[var7];
              var9 = 0;
              if (um.field_e) {
                break L9;
              } else {
                if (var5 >= eh.field_k) {
                  break L9;
                } else {
                  var10_int = tm.a(var8_ref_gb.field_c, (byte) 18);
                  if (var10_int <= var8_ref_gb.a(true)) {
                    L10: {
                      if (var8_ref_gb.field_e) {
                        break L10;
                      } else {
                        if (!af.a(125, var8_ref_gb.field_m)) {
                          break L10;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var9 = 1;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_gb.field_b = null;
              var7--;
              continue L0;
            } else {
              L11: {
                var5++;
                if (var8_ref_gb.field_b == null) {
                  break L11;
                } else {
                  if (oi.field_d) {
                    break L11;
                  } else {
                    var7--;
                    continue L0;
                  }
                }
              }
              L12: {
                if (null == var8_ref_gb.field_b) {
                  on.field_E = on.field_E + 1;
                  break L12;
                } else {
                  break L12;
                }
              }
              int discarded$1 = 91;
              var10 = kq.a(var8_ref_gb);
              var11 = var10 + dh.b(var8_ref_gb.field_j);
              var12 = ik.a(-31126, var8_ref_gb);
              var8_ref_gb.field_b = new mh(0L, field_a, var11);
              var8_ref_gb.field_b.field_Fb = var12 + (-((var12 & 16711422) >> 1) + (field_a.field_Fb >> 1 & 8355711));
              var8_ref_gb.field_b.field_Y = (field_a.field_Y >> 1 & 8355711) + -(8355711 & var12 >> 1) + var12;
              var8_ref_gb.field_b.field_X = var12;
              var8_ref_gb.field_b.field_O = jq.field_y;
              var6 = var6 + param1;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var6_ref2 = null;
            String var7 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                L1: {
                  if (param1 > 66) {
                    break L1;
                  } else {
                    gb discarded$2 = sj.a(-31, 62, -5, -79);
                    break L1;
                  }
                }
                try {
                  L2: {
                    L3: {
                      var6_ref2 = param0.getParameter("cookiehost");
                      var7 = var6_ref2;
                      var7 = var6_ref2;
                      var7 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var6_ref2;
                      if (0L > param4) {
                        var7 = var7 + "; Discard;";
                        break L3;
                      } else {
                        var7 = var7 + "; Expires=" + ke.a((byte) -75, ue.a(false) - -(param4 * 1000L)) + "; Max-Age=" + param4;
                        break L3;
                      }
                    }
                    int discarded$3 = 5797;
                    ne.a(param0, "document.cookie=\"" + var7 + "\"");
                    break L2;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var6_ref;
                stackOut_9_1 = new StringBuilder().append("sj.C(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param2 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              L7: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param3 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L7;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L7;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        pi var1_ref = null;
        int var2 = 0;
        id var3_ref_id = null;
        long var3 = 0L;
        int var3_int = 0;
        om var4_ref_om = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        id var5_ref = null;
        String var6 = null;
        id var6_ref = null;
        om var6_ref2 = null;
        String var7 = null;
        id var7_ref = null;
        id var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        id var16 = null;
        om var17 = null;
        Object var18 = null;
        Object var19 = null;
        om var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        om var21_ref = null;
        Object var22 = null;
        om var22_ref = null;
        id var23 = null;
        om var24 = null;
        id var25 = null;
        id stackIn_111_0 = null;
        id stackIn_112_0 = null;
        id stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_136_0 = 0;
        id stackIn_141_0 = null;
        id stackIn_142_0 = null;
        id stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        id stackOut_140_0 = null;
        id stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        id stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        id stackOut_110_0 = null;
        id stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        id stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        var21 = null;
        var18 = null;
        var22 = null;
        var19 = null;
        var20 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var1_ref = jl.field_e;
                  var2 = ((wq) (Object) var1_ref).l(255);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (4 != var2) {
                            if (var2 == 5) {
                              L4: {
                                var3 = ((wq) (Object) var1_ref).g(-32768);
                                var5 = ((wq) (Object) var1_ref).d(-1);
                                var6 = ((wq) (Object) var1_ref).d(-1);
                                var7 = ((wq) (Object) var1_ref).d(-1);
                                var8 = ab.a((byte) 96, var3);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_135_0 = 0;
                                  stackIn_136_0 = stackOut_135_0;
                                  break L4;
                                } else {
                                  stackOut_134_0 = 1;
                                  stackIn_136_0 = stackOut_134_0;
                                  break L4;
                                }
                              }
                              L5: {
                                var9 = stackIn_136_0;
                                if (var8 != null) {
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    var8.a(var7, var5, (byte) -121);
                                    break L5;
                                  }
                                } else {
                                  var8 = new id(var5, var7, var3);
                                  eq.field_m.a(var3, (tk) (Object) var8, 86);
                                  break L5;
                                }
                              }
                              L6: {
                                var8.field_Xb = ue.a(false) - (long)((wq) (Object) var1_ref).e(255);
                                var8.field_Wb = ((wq) (Object) var1_ref).i(65280);
                                var10 = ((wq) (Object) var1_ref).c((byte) 110);
                                var8.field_ac = var10 >> 1;
                                stackOut_140_0 = (id) var8;
                                stackIn_142_0 = stackOut_140_0;
                                stackIn_141_0 = stackOut_140_0;
                                if ((1 & var10) == 0) {
                                  stackOut_142_0 = (id) (Object) stackIn_142_0;
                                  stackOut_142_1 = 0;
                                  stackIn_143_0 = stackOut_142_0;
                                  stackIn_143_1 = stackOut_142_1;
                                  break L6;
                                } else {
                                  stackOut_141_0 = (id) (Object) stackIn_141_0;
                                  stackOut_141_1 = 1;
                                  stackIn_143_0 = stackOut_141_0;
                                  stackIn_143_1 = stackOut_141_1;
                                  break L6;
                                }
                              }
                              stackIn_143_0.field_ec = stackIn_143_1 != 0;
                              var8.field_Zb = ((wq) (Object) var1_ref).l(255);
                              var8.field_Ub = ((wq) (Object) var1_ref).l(255);
                              wl.a(var8, 17574);
                              break L2;
                            } else {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  var25 = (id) (Object) ua.field_c.d(-61);
                                  L7: while (true) {
                                    if (var25 == null) {
                                      uf.field_c = 0;
                                      break L1;
                                    } else {
                                      var25.b((byte) 111);
                                      var25.d(3);
                                      var25 = (id) (Object) ua.field_c.a((byte) 116);
                                      continue L7;
                                    }
                                  }
                                } else {
                                  if (var2 != 8) {
                                    if (9 != var2) {
                                      if (var2 != 10) {
                                        L8: {
                                          if (var2 == 11) {
                                            break L8;
                                          } else {
                                            if (var2 != 12) {
                                              if (var2 == 13) {
                                                L9: {
                                                  var3_int = ((wq) (Object) var1_ref).i(65280);
                                                  var4 = ((wq) (Object) var1_ref).l(255);
                                                  var19_ref = (om) (Object) pn.field_i.a((long)var3_int, -1);
                                                  if (var19_ref == null) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      var17 = var19_ref;
                                                      var6_ref2 = var17;
                                                      var19_ref.field_dc = false;
                                                      var17.field_Pb = false;
                                                      if (var4 == 0) {
                                                        break L10;
                                                      } else {
                                                        var19_ref.field_Zb = var4;
                                                        var19_ref.field_Wb = cm.field_o;
                                                        break L10;
                                                      }
                                                    }
                                                    ic.a(true, var19_ref);
                                                    break L9;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                L11: {
                                                  if (var2 == 14) {
                                                    break L11;
                                                  } else {
                                                    if (16 != var2) {
                                                      L12: {
                                                        if (var2 == 15) {
                                                          break L12;
                                                        } else {
                                                          if (var2 == 17) {
                                                            break L12;
                                                          } else {
                                                            if (18 == var2) {
                                                              L13: {
                                                                var3 = ((wq) (Object) var1_ref).g(-32768);
                                                                var5 = ((wq) (Object) var1_ref).d(-1);
                                                                var6 = ((wq) (Object) var1_ref).d(-1);
                                                                int discarded$2 = 2;
                                                                var7_ref = ac.a(var3);
                                                                if (var7_ref != null) {
                                                                  break L13;
                                                                } else {
                                                                  var7_ref = new id(var5, var6, var3);
                                                                  BrickABrac.field_F.a(var3, (tk) (Object) var7_ref, 48);
                                                                  o.field_e.field_cc = o.field_e.field_cc + 1;
                                                                  break L13;
                                                                }
                                                              }
                                                              L14: {
                                                                var7_ref.field_Wb = ((wq) (Object) var1_ref).i(65280);
                                                                var8_int = ((wq) (Object) var1_ref).c((byte) 127);
                                                                stackOut_110_0 = (id) var7_ref;
                                                                stackIn_112_0 = stackOut_110_0;
                                                                stackIn_111_0 = stackOut_110_0;
                                                                if (0 == (var8_int & 1)) {
                                                                  stackOut_112_0 = (id) (Object) stackIn_112_0;
                                                                  stackOut_112_1 = 0;
                                                                  stackIn_113_0 = stackOut_112_0;
                                                                  stackIn_113_1 = stackOut_112_1;
                                                                  break L14;
                                                                } else {
                                                                  stackOut_111_0 = (id) (Object) stackIn_111_0;
                                                                  stackOut_111_1 = 1;
                                                                  stackIn_113_0 = stackOut_111_0;
                                                                  stackIn_113_1 = stackOut_111_1;
                                                                  break L14;
                                                                }
                                                              }
                                                              stackIn_113_0.field_ec = stackIn_113_1 != 0;
                                                              var7_ref.field_ac = var8_int >> 1;
                                                              var7_ref.field_Zb = ((wq) (Object) var1_ref).l(255);
                                                              var7_ref.field_Ub = ((wq) (Object) var1_ref).l(255);
                                                              mp.field_Tb.a((nm) (Object) var7_ref, (byte) 3);
                                                              break L1;
                                                            } else {
                                                              if (var2 == 19) {
                                                                var3 = ((wq) (Object) var1_ref).g(-32768);
                                                                var5_int = ((wq) (Object) var1_ref).l(255);
                                                                int discarded$3 = 2;
                                                                var23 = ac.a(var3);
                                                                var23 = var23;
                                                                if (var23 != null) {
                                                                  L15: {
                                                                    if (0 == var5_int) {
                                                                      var23.b((byte) 111);
                                                                      break L15;
                                                                    } else {
                                                                      var23.field_ic = cm.field_o;
                                                                      var23.field_kc = var5_int;
                                                                      break L15;
                                                                    }
                                                                  }
                                                                  var23.d(3);
                                                                  o.field_e.field_cc = o.field_e.field_cc - 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (20 != var2) {
                                                                  if (var2 == 21) {
                                                                    var3_int = ((wq) (Object) var1_ref).i(65280);
                                                                    if (var3_int != 0) {
                                                                      ic.field_b = (long)var3_int + ue.a(false);
                                                                      break L1;
                                                                    } else {
                                                                      ic.field_b = 0L;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (22 != var2) {
                                                                      if (var2 != 23) {
                                                                        rk.a("L1: " + eq.c((byte) -121), (Throwable) null, 108);
                                                                        hn.a((byte) 84);
                                                                        break L1;
                                                                      } else {
                                                                        oc.field_p = ((wq) (Object) var1_ref).g(-32768);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      m.field_h = ((wq) (Object) var1_ref).i(65280);
                                                                      ko.field_s = ((wq) (Object) var1_ref).c((byte) 119);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  eb.a(o.field_e, (wq) (Object) var1_ref, 0, false);
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L16: {
                                                        var3 = ((wq) (Object) var1_ref).g(-32768);
                                                        var5_int = ((wq) (Object) var1_ref).l(255);
                                                        var16 = ab.a((byte) 96, var3);
                                                        var6_ref = var16;
                                                        if (var16 == null) {
                                                          break L16;
                                                        } else {
                                                          L17: {
                                                            if (15 != var2) {
                                                              if (var6_ref.field_fc) {
                                                                var6_ref.field_fc = false;
                                                                uf.field_c = uf.field_c - 1;
                                                                break L17;
                                                              } else {
                                                                break L17;
                                                              }
                                                            } else {
                                                              var16.field_Qb = false;
                                                              break L17;
                                                            }
                                                          }
                                                          L18: {
                                                            if (var5_int == 0) {
                                                              break L18;
                                                            } else {
                                                              var6_ref.field_ic = cm.field_o;
                                                              var6_ref.field_kc = var5_int;
                                                              break L18;
                                                            }
                                                          }
                                                          wl.a(var6_ref, 17574);
                                                          break L16;
                                                        }
                                                      }
                                                      break L1;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                var3 = ((wq) (Object) var1_ref).g(-32768);
                                                var5_ref = ab.a((byte) 96, var3);
                                                if (var5_ref != null) {
                                                  L19: {
                                                    if (var2 != 14) {
                                                      if (!var5_ref.field_fc) {
                                                        uf.field_c = uf.field_c + 1;
                                                        var5_ref.field_fc = true;
                                                        break L19;
                                                      } else {
                                                        break L19;
                                                      }
                                                    } else {
                                                      var5_ref.field_Qb = true;
                                                      break L19;
                                                    }
                                                  }
                                                  wl.a(var5_ref, 17574);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L20: {
                                          var3_int = ((wq) (Object) var1_ref).i(65280);
                                          var22_ref = (om) (Object) pn.field_i.a((long)var3_int, -1);
                                          var22_ref = var22_ref;
                                          if (var22_ref == null) {
                                            break L20;
                                          } else {
                                            L21: {
                                              if (var2 != 11) {
                                                var22_ref.field_dc = true;
                                                break L21;
                                              } else {
                                                var22_ref.field_Pb = true;
                                                break L21;
                                              }
                                            }
                                            ic.a(true, var22_ref);
                                            break L20;
                                          }
                                        }
                                        break L1;
                                      } else {
                                        var24 = (om) (Object) rq.field_a.d(-62);
                                        L22: while (true) {
                                          if (var24 == null) {
                                            break L2;
                                          } else {
                                            var24.b((byte) 111);
                                            var24.d(3);
                                            var24 = (om) (Object) rq.field_a.a((byte) 116);
                                            continue L22;
                                          }
                                        }
                                      }
                                    } else {
                                      var3_int = ((wq) (Object) var1_ref).i(65280);
                                      var4 = ((wq) (Object) var1_ref).l(255);
                                      var21_ref = (om) (Object) pn.field_i.a((long)var3_int, -1);
                                      var21_ref = var21_ref;
                                      if (var21_ref != null) {
                                        L23: {
                                          if (var4 == 0) {
                                            var21_ref.b((byte) 111);
                                            break L23;
                                          } else {
                                            var21_ref.field_Zb = var4;
                                            var21_ref.field_Wb = cm.field_o;
                                            break L23;
                                          }
                                        }
                                        var21_ref.d(3);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    L24: {
                                      var3_int = ((wq) (Object) var1_ref).i(65280);
                                      var4_ref_om = (om) (Object) pn.field_i.a((long)var3_int, -1);
                                      if (var4_ref_om != null) {
                                        break L24;
                                      } else {
                                        var4_ref_om = new om(cq.field_p);
                                        pn.field_i.a((long)var3_int, (tk) (Object) var4_ref_om, 47);
                                        break L24;
                                      }
                                    }
                                    eb.a(var4_ref_om, (wq) (Object) var1_ref, 0, true);
                                    ic.a(true, var4_ref_om);
                                    break L1;
                                  }
                                }
                              } else {
                                var3 = ((wq) (Object) var1_ref).g(-32768);
                                var5_int = ((wq) (Object) var1_ref).l(255);
                                var6_ref = ab.a((byte) 96, var3);
                                if (var6_ref != null) {
                                  L25: {
                                    if (var6_ref.field_fc) {
                                      uf.field_c = uf.field_c - 1;
                                      var6_ref.field_fc = false;
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    if (var5_int == 0) {
                                      var6_ref.b((byte) 111);
                                      break L26;
                                    } else {
                                      var6_ref.field_kc = var5_int;
                                      var6_ref.field_ic = cm.field_o;
                                      break L26;
                                    }
                                  }
                                  var6_ref.d(3);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_id = (id) (Object) mp.field_Tb.d(-8);
                L27: while (true) {
                  if (var3_ref_id == null) {
                    var3_ref_id = (id) (Object) eq.field_m.b((byte) 89);
                    L28: while (true) {
                      if (var3_ref_id == null) {
                        L29: {
                          if (var2 != 1) {
                            break L29;
                          } else {
                            if (o.field_e == null) {
                              break L29;
                            } else {
                              pk.field_g = o.field_e.field_Fc;
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if (4 == var2) {
                            var3_int = ((wq) (Object) var1_ref).i(65280);
                            o.field_e = new om(cq.field_p);
                            o.field_e.a((long)var3_int, -105);
                            eb.a(o.field_e, (wq) (Object) var1_ref, 0, false);
                            ic.field_b = 0L;
                            break L30;
                          } else {
                            o.field_e = null;
                            break L30;
                          }
                        }
                        L31: {
                          L32: {
                            if (var2 == 2) {
                              break L32;
                            } else {
                              if (3 == var2) {
                                break L32;
                              } else {
                                nl.field_f = null;
                                break L31;
                              }
                            }
                          }
                          if (null == nl.field_f) {
                            nl.field_f = new om(cq.field_p);
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        if (var2 != 3) {
                          fh.field_d = false;
                          break L1;
                        } else {
                          fh.field_d = true;
                          var3_int = 0;
                          L33: while (true) {
                            if (var3_int >= rh.field_d.length) {
                              bb.field_e = ((wq) (Object) var1_ref).l(255);
                              mf.field_c = ((wq) (Object) var1_ref).l(255);
                              var3_int = 0;
                              L34: while (true) {
                                if (var3_int >= lj.field_p.length) {
                                  break L2;
                                } else {
                                  lj.field_p[var3_int] = ((wq) (Object) var1_ref).b(true);
                                  var3_int++;
                                  continue L34;
                                }
                              }
                            } else {
                              rh.field_d[var3_int] = ((wq) (Object) var1_ref).b(true);
                              var3_int++;
                              continue L33;
                            }
                          }
                        }
                      } else {
                        L35: {
                          L36: {
                            if (var3_ref_id.field_Qb) {
                              break L36;
                            } else {
                              if (!var3_ref_id.field_fc) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            var3_ref_id.field_Qb = false;
                            if (!var3_ref_id.field_fc) {
                              break L37;
                            } else {
                              uf.field_c = uf.field_c - 1;
                              var3_ref_id.field_fc = false;
                              break L37;
                            }
                          }
                          wl.a(var3_ref_id, 17574);
                          break L35;
                        }
                        var3_ref_id = (id) (Object) eq.field_m.a(false);
                        continue L28;
                      }
                    }
                  } else {
                    var3_ref_id.b((byte) 111);
                    var3_ref_id.d(3);
                    var3_ref_id = (id) (Object) mp.field_Tb.a((byte) 116);
                    continue L27;
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
          throw qb.a((Throwable) (Object) var1, "sj.A(" + 33 + 41);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}
