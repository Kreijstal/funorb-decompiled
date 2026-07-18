/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jm {
    static String field_l;
    int field_d;
    int field_h;
    byte[] field_c;
    int field_e;
    int field_j;
    int field_b;
    int field_a;
    static tq field_f;
    byte[] field_g;
    static String field_i;
    int field_k;

    final static nb a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            nb var5 = null;
            jo var5_ref = null;
            nb stackIn_4_0 = null;
            jo stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            nb stackOut_3_0 = null;
            jo stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                if (param2 == -2414) {
                  break L0;
                } else {
                  nb discarded$2 = jm.a((java.awt.Component) null, 85, -118, 37);
                  break L0;
                }
              }
              try {
                L1: {
                  var4 = Class.forName("le");
                  var5 = (nb) var4.newInstance();
                  var5.a(param0, param3, true, param1);
                  stackOut_3_0 = (nb) var5;
                  stackIn_4_0 = stackOut_3_0;
                  break L1;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new jo();
                ((nb) (Object) var5_ref).a(param0, param3, true, param1);
                stackOut_5_0 = (jo) var5_ref;
                stackIn_6_0 = stackOut_5_0;
                return (nb) (Object) stackIn_6_0;
              }
              return stackIn_4_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref2;
                stackOut_7_1 = new StringBuilder().append("jm.A(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vl var4 = null;
        Object var5 = null;
        mp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nn var12 = null;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        mm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        boolean stackIn_2_5 = false;
        mm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        boolean stackIn_4_5 = false;
        mm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        boolean stackIn_5_5 = false;
        int stackIn_5_6 = 0;
        mh stackIn_29_0 = null;
        mh stackIn_31_0 = null;
        mh stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        boolean stackOut_1_5 = false;
        mm stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        boolean stackOut_4_5 = false;
        int stackOut_4_6 = 0;
        mm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        boolean stackOut_2_5 = false;
        int stackOut_2_6 = 0;
        mh stackOut_28_0 = null;
        mh stackOut_31_0 = null;
        String stackOut_31_1 = null;
        mh stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = f.field_c.field_Qb;
              stackOut_1_1 = 2;
              stackOut_1_2 = param2 * (np.field_a * 3 - -6);
              stackOut_1_3 = np.field_a + 2;
              stackOut_1_4 = 22676;
              stackOut_1_5 = param0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_4_4 = stackOut_1_4;
              stackIn_4_5 = stackOut_1_5;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              if (o.field_b != f.field_c.field_Qb) {
                stackOut_4_0 = (mm) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = stackIn_4_4;
                stackOut_4_5 = stackIn_4_5;
                stackOut_4_6 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                stackIn_5_5 = stackOut_4_5;
                stackIn_5_6 = stackOut_4_6;
                break L1;
              } else {
                stackOut_2_0 = (mm) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                stackIn_5_5 = stackOut_2_5;
                stackIn_5_6 = stackOut_2_6;
                break L1;
              }
            }
            var3_int = ((mm) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_5_6 != 0) ? 1 : 0;
            var4 = f.field_c.field_Xb.field_bb;
            if (param1) {
              L2: {
                L3: {
                  if (wk.field_m == 2) {
                    break L3;
                  } else {
                    if (wk.field_m == 1) {
                      break L3;
                    } else {
                      f.field_c.field_eb = false;
                      f.field_c.field_Qb.field_Qb.field_Mb = cm.field_t;
                      jh.a(param1, f.field_c.field_Xb);
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                f.field_c.field_eb = true;
                f.field_c.field_Qb.field_Qb.field_Mb = null;
                var5 = null;
                var6 = (mp) (Object) var4.d(-57);
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var6 == null) {
                        break L6;
                      } else {
                        var7 = 0;
                        if (var15 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (null != var6.field_bb) {
                              break L7;
                            } else {
                              var6.field_Xb = new mh(0L, vb.field_K);
                              var6.a(var6.field_Xb, 0);
                              var6.field_Yb = new mh(0L, vb.field_K);
                              var6.a(var6.field_Yb, 0);
                              var6.c(param1);
                              var7 = 1;
                              break L7;
                            }
                          }
                          L8: {
                            var6.field_Ib = f.field_c.field_Xb.field_Ib;
                            var6.field_Xb.a(np.field_a, 0, 0, var6.field_Ib, (byte) 64);
                            var8 = 0;
                            if (null == var6.field_Qb) {
                              break L8;
                            } else {
                              if (var6.field_Qb.equals((Object) (Object) "")) {
                                break L8;
                              } else {
                                var6.field_Yb.field_wb = ok.field_g;
                                var6.field_Yb.field_Y = 16737894;
                                var8 = 1;
                                var6.field_Yb.a(np.field_a, 0, 0, ok.field_g.field_x + 3, (byte) 64);
                                break L8;
                              }
                            }
                          }
                          L9: {
                            var9 = 0;
                            var10 = var6.field_Ib;
                            if (var8 == 0) {
                              break L9;
                            } else {
                              var9 = ok.field_g.field_x + 3;
                              var10 = var10 - var9;
                              break L9;
                            }
                          }
                          L10: {
                            stackOut_28_0 = var6.field_Xb;
                            stackIn_31_0 = stackOut_28_0;
                            stackIn_29_0 = stackOut_28_0;
                            if (0 < var10) {
                              stackOut_31_0 = (mh) (Object) stackIn_31_0;
                              stackOut_31_1 = dh.a(var6.field_Xb.field_O, var6.field_Rb, var10);
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              break L10;
                            } else {
                              stackOut_29_0 = (mh) (Object) stackIn_29_0;
                              stackOut_29_1 = var6.field_Rb;
                              stackIn_32_0 = stackOut_29_0;
                              stackIn_32_1 = stackOut_29_1;
                              break L10;
                            }
                          }
                          L11: {
                            stackIn_32_0.field_Mb = stackIn_32_1;
                            if (var6.field_Xb.field_Mb.equals((Object) (Object) var6.field_Rb)) {
                              stackOut_35_0 = 0;
                              stackIn_36_0 = stackOut_35_0;
                              break L11;
                            } else {
                              stackOut_33_0 = 1;
                              stackIn_36_0 = stackOut_33_0;
                              break L11;
                            }
                          }
                          L12: {
                            var11 = stackIn_36_0;
                            var6.field_Xb.a(np.field_a, 0, var9, var10, (byte) 64);
                            if (var3_int != 0) {
                              break L12;
                            } else {
                              var6.field_C = np.field_a + -var6.field_cb;
                              break L12;
                            }
                          }
                          L13: {
                            if (var7 == 0) {
                              break L13;
                            } else {
                              f.field_c.field_Xb.a((mh) var5, 2, (mh) (Object) var6, 17290);
                              break L13;
                            }
                          }
                          L14: {
                            L15: {
                              L16: {
                                if (null == var6.field_Yb) {
                                  break L16;
                                } else {
                                  if (var6.field_Yb.field_kb) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (!var6.field_Xb.field_kb) {
                                break L14;
                              } else {
                                if (var11 == 0) {
                                  break L14;
                                } else {
                                  ep.field_e = var6.field_Rb;
                                  if (var15 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            ep.field_e = var6.field_Qb;
                            break L14;
                          }
                          L17: {
                            if (var6.field_L != 0) {
                              mn.a(-1, (mh) (Object) var6, f.field_c.field_Qb, (int[]) null, var6.field_ac, -1, (byte) -58, 0L, var6.field_Rb);
                              var12 = bm.field_d;
                              var13_ref_String = ng.field_e;
                              var12.field_d.a(var13_ref_String, 7, (byte) 126);
                              var12 = bm.field_d;
                              var13 = tb.field_fb;
                              var14 = qo.field_O;
                              var12.field_d.a(var14, -126, 0, 0, var13);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          var5 = (Object) (Object) var6;
                          var6 = (mp) (Object) var4.a((byte) 116);
                          if (var15 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (f.field_c.field_Tb.field_L == 0) {
                      break L5;
                    } else {
                      tn.field_m = new gq(f.field_c.field_Tb.field_Eb, f.field_c.field_Tb.field_db, f.field_c.field_Tb.field_Ib, f.field_c.field_Tb.field_cb, kg.field_e, ij.field_c, ad.field_l, ad.field_l);
                      ij.field_d = 2;
                      break L5;
                    }
                  }
                  if (0 != f.field_c.field_Wb.field_L) {
                    tn.field_m = new gq(f.field_c.field_Wb.field_Eb, f.field_c.field_Wb.field_db, f.field_c.field_Wb.field_Ib, f.field_c.field_Wb.field_cb, gn.field_A, ij.field_c, ad.field_l, ad.field_l);
                    ij.field_d = 3;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "jm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static mb a(byte[] param0, byte param1) {
        mb var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        mb stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        mb stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (null == param0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (mb) (Object) stackIn_4_0;
            } else {
              if (param1 < -7) {
                var2 = new mb(param0, ag.field_K, dl.field_d, jh.field_b, gg.field_t, qp.field_c, cn.field_a);
                ee.d((byte) 96);
                stackOut_8_0 = (mb) var2;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (mb) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("jm.C(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static String a(boolean param0, char param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            stackOut_3_0 = String.valueOf(param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "jm.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        pi var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        pe var4_ref_pe = null;
        int var4 = 0;
        pn var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_40_0 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = jl.field_e;
              if (param0 == 22) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var1_ref.l(255);
                var3 = var1_ref.l(param0 + 233);
                if (var2 != 0) {
                  break L3;
                } else {
                  var4_ref_pe = (pe) (Object) ob.field_F.d(-37);
                  if (null != var4_ref_pe) {
                    L4: {
                      var5_int = ga.field_j - var1_ref.field_l;
                      var6 = var4_ref_pe.field_m;
                      if (var6.length << 459713250 < var5_int) {
                        var5_int = var6.length << 654617634;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5_int <= var7) {
                            break L7;
                          } else {
                            var6[var7 >> 504877794] = var6[var7 >> 504877794] + (var1_ref.l(255) << (ik.a(3, var7) << -1489173016));
                            var7++;
                            if (var8 != 0) {
                              break L6;
                            } else {
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var4_ref_pe.field_v = true;
                        var4_ref_pe.b((byte) 111);
                        break L6;
                      }
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    hn.a((byte) 57);
                    return;
                  }
                }
              }
              L8: {
                if (var2 == 1) {
                  break L8;
                } else {
                  rk.a("LR1: " + eq.c((byte) -96), (Throwable) null, 53);
                  hn.a((byte) 52);
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L8;
                  }
                }
              }
              var4 = var1_ref.c(-1342);
              var5 = (pn) (Object) qa.field_t.d(-19);
              L9: while (true) {
                L10: {
                  L11: {
                    if (var5 == null) {
                      break L11;
                    } else {
                      stackOut_28_0 = var3;
                      stackIn_42_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var8 != 0) {
                        break L10;
                      } else {
                        L12: {
                          if (stackIn_29_0 != var5.field_p) {
                            break L12;
                          } else {
                            if (var4 != var5.field_n) {
                              break L12;
                            } else {
                              if (var8 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        var5 = (pn) (Object) qa.field_t.a((byte) 116);
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  if (null != var5) {
                    var5.b((byte) 111);
                    break L2;
                  } else {
                    stackOut_40_0 = 110;
                    stackIn_42_0 = stackOut_40_0;
                    break L10;
                  }
                }
                hn.a((byte) stackIn_42_0);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jm.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_f = null;
            field_i = null;
            field_l = null;
            if (param0 != 31) {
                field_l = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jm.E(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The following settings need to be changed:  ";
        field_f = new tq();
        field_i = "Please enter your date of birth to enable chat:";
    }
}
