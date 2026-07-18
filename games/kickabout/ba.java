/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class ba extends sr {
    static dg field_p;
    static int[] field_q;
    static kk[] field_n;
    static String field_o;

    final int a(int param0, Object param1, Object param2) {
        RuntimeException var4 = null;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        fn var8_ref_fn = null;
        int var8 = 0;
        fn var9 = null;
        int var10 = 0;
        up var11 = null;
        up var12 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var11 = ((sp) param1).field_Sb;
            var12 = var11;
            var5 = ((sp) param2).field_Sb;
            var6 = var12.field_h.length;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var12.field_h.length) {
                L2: {
                  var7 = var5.field_h.length;
                  if (param0 == 2) {
                    break L2;
                  } else {
                    field_n = null;
                    break L2;
                  }
                }
                var8 = 0;
                L3: while (true) {
                  if (var5.field_h.length <= var8) {
                    stackOut_9_0 = ((ba) this).field_i << 31 ^ var6 - var7;
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    var9 = pa.field_g[var5.field_h[var8]];
                    var7 = var7 + (var9.field_k - -var9.field_h);
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var8_ref_fn = pa.field_g[var11.field_h[var7]];
                var6 = var6 + (var8_ref_fn.field_h + var8_ref_fn.field_k);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ba.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    final static ut[] a(int param0, int param1, int param2, byte param3) {
        int var4 = -62 / ((param3 - -13) / 55);
        return te.a(1, param2, param0, false, param1);
    }

    final int a(int param0) {
        if (param0 >= -69) {
            field_o = null;
        }
        return 2;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        String[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        String[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        String stackIn_32_2 = null;
        String[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_38_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_36_2 = null;
        String[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        String[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        String stackOut_31_2 = null;
        String[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        String stackOut_30_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        L0: {
          var9 = Kickabout.field_G;
          nn.field_D = true;
          ck.field_a = param2;
          if (ck.field_a == 0) {
            var3_int = lu.a(cv.field_f, tt.field_a, -46, ta.field_C, vp.field_k);
            var4 = 3 + var3_int;
            dk.field_g = new int[var4];
            eq.field_c = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                sh.field_f = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3_int) {
                    eq.field_c[-3 + var4] = "";
                    eq.field_c[var4 + -2] = tk.field_Jb;
                    dk.field_g[-2 + var4] = 0;
                    sh.field_f[0] = 4;
                    eq.field_c[var4 - 1] = pg.field_c;
                    dk.field_g[-1 + var4] = 1;
                    sh.field_f[1] = 5;
                    break L0;
                  } else {
                    eq.field_c[var5] = ta.field_C[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                dk.field_g[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (ck.field_a == 1) {
              var3_int = lu.a(cv.field_f, tt.field_a, param1 ^ -44, ta.field_C, vp.field_k);
              var4 = 2 + var3_int;
              eq.field_c = new String[var4];
              dk.field_g = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  sh.field_f = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var3_int <= var5) {
                      eq.field_c[-2 + var4] = "";
                      eq.field_c[var4 + -1] = pg.field_c;
                      dk.field_g[-1 + var4] = 0;
                      sh.field_f[0] = 5;
                      break L0;
                    } else {
                      eq.field_c[var5] = ta.field_C[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  dk.field_g[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if (2 != ck.field_a) {
                if (ck.field_a != 3) {
                  if (ck.field_a == 4) {
                    var3_int = lu.a(cv.field_f, je.field_n, -46, ta.field_C, vp.field_k);
                    var4 = var3_int + 2;
                    dk.field_g = new int[var4];
                    eq.field_c = new String[var4];
                    var5 = 0;
                    L5: while (true) {
                      if (var4 <= var5) {
                        sh.field_f = new int[1];
                        var5 = 0;
                        L6: while (true) {
                          if (var3_int <= var5) {
                            eq.field_c[var4 + -2] = "";
                            eq.field_c[var4 - 1] = pg.field_c;
                            dk.field_g[-1 + var4] = 0;
                            sh.field_f[0] = 5;
                            break L0;
                          } else {
                            eq.field_c[var5] = ta.field_C[var5];
                            var5++;
                            continue L6;
                          }
                        }
                      } else {
                        dk.field_g[var5] = -1;
                        var5++;
                        continue L5;
                      }
                    }
                  } else {
                    if (ck.field_a != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = lu.a(cv.field_f, dr.field_b, -46, ta.field_C, vp.field_k);
                      var4 = 3 + var3_int;
                      eq.field_c = new String[var4];
                      dk.field_g = new int[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var4 <= var5) {
                          sh.field_f = new int[2];
                          var5 = 0;
                          L8: while (true) {
                            if (var3_int <= var5) {
                              eq.field_c[-3 + var4] = "";
                              eq.field_c[var4 - 2] = mi.field_c;
                              dk.field_g[var4 - 2] = 0;
                              sh.field_f[0] = 3;
                              eq.field_c[-1 + var4] = pg.field_c;
                              dk.field_g[-1 + var4] = 1;
                              sh.field_f[1] = 5;
                              break L0;
                            } else {
                              eq.field_c[var5] = ta.field_C[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          dk.field_g[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  L9: {
                    if (!oo.field_c.field_l) {
                      var3_int = lu.a(cv.field_f, mr.field_bb, -46, ta.field_C, vp.field_k);
                      break L9;
                    } else {
                      var3_int = lu.a(cv.field_f, fu.field_a, param1 + -52, ta.field_C, vp.field_k);
                      break L9;
                    }
                  }
                  var4 = 2 - -var3_int;
                  eq.field_c = new String[var4];
                  dk.field_g = new int[var4];
                  var5 = 0;
                  L10: while (true) {
                    if (var4 <= var5) {
                      sh.field_f = new int[1];
                      var5 = 0;
                      L11: while (true) {
                        if (var3_int <= var5) {
                          eq.field_c[-2 + var4] = "";
                          eq.field_c[var4 + -1] = pg.field_c;
                          dk.field_g[-1 + var4] = 0;
                          sh.field_f[0] = 5;
                          break L0;
                        } else {
                          eq.field_c[var5] = ta.field_C[var5];
                          var5++;
                          continue L11;
                        }
                      }
                    } else {
                      dk.field_g[var5] = -1;
                      var5++;
                      continue L10;
                    }
                  }
                }
              } else {
                var3_int = lu.a(cv.field_f, vo.a((byte) -18, vg.field_Kb, new String[1]), -46, ta.field_C, vp.field_k);
                var4 = -1;
                var5 = 0;
                L12: while (true) {
                  L13: {
                    if (var3_int <= var5) {
                      break L13;
                    } else {
                      if ("<%0>".equals((Object) (Object) ta.field_C[var5])) {
                        var4 = var5;
                        break L13;
                      } else {
                        var5++;
                        continue L12;
                      }
                    }
                  }
                  if (var4 != -1) {
                    dn.field_Eb = new String[var4];
                    dv.a((Object[]) (Object) ta.field_C, 0, (Object[]) (Object) dn.field_Eb, 0, var4);
                    pg.field_a = new String[-1 + (-var4 + var3_int)];
                    dv.a((Object[]) (Object) ta.field_C, var4 + 1, (Object[]) (Object) pg.field_a, 0, -var4 + (var3_int + -1));
                    var4 = -1;
                    var3_int = lu.a(cv.field_f, vo.a((byte) -18, lr.field_o, new String[1]), -46, ta.field_C, vp.field_k);
                    var5 = 0;
                    L14: while (true) {
                      L15: {
                        if (var3_int <= var5) {
                          break L15;
                        } else {
                          if (!"<%0>".equals((Object) (Object) ta.field_C[var5])) {
                            var5++;
                            continue L14;
                          } else {
                            var4 = var5;
                            break L15;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L16: {
                          pn.field_D = new String[var4];
                          dv.a((Object[]) (Object) ta.field_C, 0, (Object[]) (Object) pn.field_D, 0, var4);
                          cg.field_E = new String[var3_int + -var4 - 1];
                          dv.a((Object[]) (Object) ta.field_C, 1 + var4, (Object[]) (Object) cg.field_E, 0, -var4 + (var3_int - 1));
                          if (pn.field_D.length > dn.field_Eb.length) {
                            stackOut_20_0 = pn.field_D.length;
                            stackIn_21_0 = stackOut_20_0;
                            break L16;
                          } else {
                            stackOut_19_0 = dn.field_Eb.length;
                            stackIn_21_0 = stackOut_19_0;
                            break L16;
                          }
                        }
                        L17: {
                          var5 = stackIn_21_0;
                          if (pg.field_a.length >= cg.field_E.length) {
                            stackOut_23_0 = pg.field_a.length;
                            stackIn_24_0 = stackOut_23_0;
                            break L17;
                          } else {
                            stackOut_22_0 = cg.field_E.length;
                            stackIn_24_0 = stackOut_22_0;
                            break L17;
                          }
                        }
                        var6 = stackIn_24_0;
                        var7 = var6 + 7 + var5;
                        dk.field_g = new int[var7];
                        eq.field_c = new String[var7];
                        var8 = 0;
                        L18: while (true) {
                          if (var8 >= var7) {
                            sh.field_f = new int[2];
                            eq.field_c[1] = mn.field_f;
                            eq.field_c[0] = ec.field_a;
                            dk.field_g[1] = 0;
                            dk.field_g[3] = 1;
                            eq.field_c[5] = "";
                            eq.field_c[2] = vj.field_d;
                            eq.field_c[4] = tv.field_k;
                            sh.field_f[1] = 2;
                            sh.field_f[0] = 5;
                            eq.field_c[3] = cr.field_g;
                            var8 = 0;
                            L19: while (true) {
                              if (var8 >= var5) {
                                eq.field_c[var5 + 6] = null;
                                dk.field_g[6 + var5] = -2;
                                var8 = 0;
                                L20: while (true) {
                                  if (var6 <= var8) {
                                    va.field_o = nj.a(90);
                                    break L0;
                                  } else {
                                    L21: {
                                      stackOut_35_0 = eq.field_c;
                                      stackOut_35_1 = var8 + var5 + 7;
                                      stackIn_37_0 = stackOut_35_0;
                                      stackIn_37_1 = stackOut_35_1;
                                      stackIn_36_0 = stackOut_35_0;
                                      stackIn_36_1 = stackOut_35_1;
                                      if (var8 < cg.field_E.length) {
                                        stackOut_37_0 = (String[]) (Object) stackIn_37_0;
                                        stackOut_37_1 = stackIn_37_1;
                                        stackOut_37_2 = cg.field_E[var8];
                                        stackIn_38_0 = stackOut_37_0;
                                        stackIn_38_1 = stackOut_37_1;
                                        stackIn_38_2 = stackOut_37_2;
                                        break L21;
                                      } else {
                                        stackOut_36_0 = (String[]) (Object) stackIn_36_0;
                                        stackOut_36_1 = stackIn_36_1;
                                        stackOut_36_2 = "";
                                        stackIn_38_0 = stackOut_36_0;
                                        stackIn_38_1 = stackOut_36_1;
                                        stackIn_38_2 = stackOut_36_2;
                                        break L21;
                                      }
                                    }
                                    stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                L22: {
                                  stackOut_29_0 = eq.field_c;
                                  stackOut_29_1 = var8 + 6;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_31_1 = stackOut_29_1;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  if (pn.field_D.length + var8 - var5 < 0) {
                                    stackOut_31_0 = (String[]) (Object) stackIn_31_0;
                                    stackOut_31_1 = stackIn_31_1;
                                    stackOut_31_2 = "";
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    stackIn_32_2 = stackOut_31_2;
                                    break L22;
                                  } else {
                                    stackOut_30_0 = (String[]) (Object) stackIn_30_0;
                                    stackOut_30_1 = stackIn_30_1;
                                    stackOut_30_2 = pn.field_D[-var5 + (var8 - -pn.field_D.length)];
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    stackIn_32_2 = stackOut_30_2;
                                    break L22;
                                  }
                                }
                                stackIn_32_0[stackIn_32_1] = stackIn_32_2;
                                var8++;
                                continue L19;
                              }
                            }
                          } else {
                            dk.field_g[var8] = -1;
                            var8++;
                            continue L18;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              }
            }
          }
        }
        ll.field_k.field_a = sh.field_f.length;
        var3_int = 0;
        if (param1 == 6) {
          var4 = 0;
          L23: while (true) {
            if (eq.field_c.length <= var4) {
              L24: {
                if (2 != ck.field_a) {
                  break L24;
                } else {
                  var10 = dn.field_Eb;
                  var5 = 0;
                  L25: while (true) {
                    if (var10.length <= var5) {
                      var11 = pg.field_a;
                      var5 = 0;
                      L26: while (true) {
                        if (var11.length <= var5) {
                          break L24;
                        } else {
                          L27: {
                            var13 = var11[var5];
                            var7 = ud.a(10, var13, false);
                            if (var7 <= var3_int) {
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          var5++;
                          continue L26;
                        }
                      }
                    } else {
                      L28: {
                        var12 = var10[var5];
                        var7 = ud.a(10, var12, false);
                        if (var7 <= var3_int) {
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      var5++;
                      continue L25;
                    }
                  }
                }
              }
              bh.field_j = ll.field_k.field_a * (pr.field_d - -aj.field_a << 1);
              ka.field_a = -(var3_int >> 1) + ta.field_A;
              bh.field_l = var3_int + (ta.field_A - (var3_int >> 1));
              var4 = 0;
              L29: while (true) {
                if (var4 >= eq.field_c.length) {
                  uq.field_c = -(bh.field_j >> 1) + tb.field_s;
                  ld.field_j = new int[eq.field_c.length][];
                  var4 = 0;
                  var5 = uq.field_c;
                  L30: while (true) {
                    if (eq.field_c.length <= var4) {
                      L31: {
                        if (ck.field_a == 2) {
                          ll.field_k.a(-1, 0, -1, param0);
                          break L31;
                        } else {
                          ll.field_k.a(sj.a(el.field_A, n.field_m, (byte) -127), param1 ^ 6, 0, param0);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = dk.field_g[var4];
                        if (var6 < 0) {
                          var5 = var5 + la.field_c;
                          break L32;
                        } else {
                          var7 = ud.a(10, eq.field_c[var4], true);
                          var8 = ta.field_A - (var7 >> 1);
                          var5 = var5 + aj.field_a;
                          ld.field_j[var4] = new int[4];
                          ld.field_j[var4][0] = -eb.field_d + var8;
                          ld.field_j[var4][1] = var5;
                          ld.field_j[var4][2] = (eb.field_d << 1) + var7;
                          var5 = var5 + (nr.field_j + ((pr.field_d << 1) + aj.field_a));
                          ld.field_j[var4][3] = nr.field_j - -(pr.field_d << 1);
                          break L32;
                        }
                      }
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  L33: {
                    stackOut_104_0 = bh.field_j;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (dk.field_g[var4] >= 0) {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = nr.field_j;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L33;
                    } else {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = la.field_c;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L33;
                    }
                  }
                  bh.field_j = stackIn_107_0 + stackIn_107_1;
                  var4++;
                  continue L29;
                }
              }
            } else {
              L34: {
                stackOut_86_0 = 10;
                stackOut_86_1 = eq.field_c[var4];
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                if (dk.field_g[var4] < 0) {
                  stackOut_88_0 = stackIn_88_0;
                  stackOut_88_1 = (String) (Object) stackIn_88_1;
                  stackOut_88_2 = 0;
                  stackIn_89_0 = stackOut_88_0;
                  stackIn_89_1 = stackOut_88_1;
                  stackIn_89_2 = stackOut_88_2;
                  break L34;
                } else {
                  stackOut_87_0 = stackIn_87_0;
                  stackOut_87_1 = (String) (Object) stackIn_87_1;
                  stackOut_87_2 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_89_1 = stackOut_87_1;
                  stackIn_89_2 = stackOut_87_2;
                  break L34;
                }
              }
              L35: {
                var5 = ud.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
                if (var3_int < var5) {
                  var3_int = var5;
                  break L35;
                } else {
                  break L35;
                }
              }
              var4++;
              continue L23;
            }
          }
        } else {
          return;
        }
    }

    ba() {
    }

    final static void a() {
        int discarded$2 = 0;
        if (!n.a()) {
            return;
        }
        on.a(0, 0, on.field_g, on.field_f, 0, 192);
        mr.field_Z.a(0, 0, (byte) -103);
    }

    public static void c() {
        field_n = null;
        field_q = null;
        field_p = null;
        field_o = null;
    }

    final static void b() {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = Kickabout.field_G;
            try {
              L0: {
                L1: {
                  if (null != gt.field_t) {
                    gt.field_t.b((byte) 109);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != e.field_i) {
                    e.field_i.b(109);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (ao.field_h == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        ao.field_h.c(1);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (u.field_j != null) {
                    var1_int = 0;
                    L7: while (true) {
                      if (u.field_j.length <= var1_int) {
                        break L6;
                      } else {
                        L8: {
                          if (u.field_j[var1_int] == null) {
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw nb.a((Throwable) (Object) var1, "ba.E(" + 44 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
        field_o = "Just play";
    }
}
