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
        int var7 = 0;
        fn var8_ref_fn = null;
        int var8 = 0;
        fn var9 = null;
        int var10 = Kickabout.field_G;
        up var11 = ((sp) param1).field_Sb;
        up var12 = var11;
        up var5 = ((sp) param2).field_Sb;
        int var6 = var12.field_h.length;
        for (var7 = 0; var7 < var12.field_h.length; var7++) {
            var8_ref_fn = pa.field_g[var11.field_h[var7]];
            var6 = var6 + (var8_ref_fn.field_h + var8_ref_fn.field_k);
        }
        var7 = var5.field_h.length;
        if (param0 != 2) {
            field_n = null;
        }
        for (var8 = 0; var5.field_h.length > var8; var8++) {
            var9 = pa.field_g[var5.field_h[var8]];
            var7 = var7 + (var9.field_k - -var9.field_h);
        }
        return ((ba) this).field_i << -1049731489 ^ var6 - var7;
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
        int var3 = 0;
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
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
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
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
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
            var3 = lu.a(cv.field_f, tt.field_a, -46, ta.field_C, vp.field_k);
            var4 = 3 + var3;
            dk.field_g = new int[var4];
            eq.field_c = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                sh.field_f = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
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
            if (-2 == (ck.field_a ^ -1)) {
              var3 = lu.a(cv.field_f, tt.field_a, param1 ^ -44, ta.field_C, vp.field_k);
              var4 = 2 + var3;
              eq.field_c = new String[var4];
              dk.field_g = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  sh.field_f = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var3 <= var5) {
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
                    var3 = lu.a(cv.field_f, je.field_n, -46, ta.field_C, vp.field_k);
                    var4 = var3 + 2;
                    dk.field_g = new int[var4];
                    eq.field_c = new String[var4];
                    var5 = 0;
                    L5: while (true) {
                      if (var4 <= var5) {
                        sh.field_f = new int[1];
                        var5 = 0;
                        L6: while (true) {
                          if (var3 <= var5) {
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
                    if (-6 != (ck.field_a ^ -1)) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = lu.a(cv.field_f, dr.field_b, -46, ta.field_C, vp.field_k);
                      var4 = 3 + var3;
                      eq.field_c = new String[var4];
                      dk.field_g = new int[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var4 <= var5) {
                          sh.field_f = new int[2];
                          var5 = 0;
                          L8: while (true) {
                            if (var3 <= var5) {
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
                      var3 = lu.a(cv.field_f, mr.field_bb, -46, ta.field_C, vp.field_k);
                      break L9;
                    } else {
                      var3 = lu.a(cv.field_f, fu.field_a, param1 + -52, ta.field_C, vp.field_k);
                      break L9;
                    }
                  }
                  var4 = 2 - -var3;
                  eq.field_c = new String[var4];
                  dk.field_g = new int[var4];
                  var5 = 0;
                  L10: while (true) {
                    if (var4 <= var5) {
                      sh.field_f = new int[1];
                      var5 = 0;
                      L11: while (true) {
                        if (var3 <= var5) {
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
                var3 = lu.a(cv.field_f, vo.a((byte) -18, vg.field_Kb, new String[1]), -46, ta.field_C, vp.field_k);
                var4 = -1;
                var5 = 0;
                L12: while (true) {
                  L13: {
                    if (var3 <= var5) {
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
                  if ((var4 ^ -1) != 0) {
                    dn.field_Eb = new String[var4];
                    dv.a((Object[]) (Object) ta.field_C, 0, (Object[]) (Object) dn.field_Eb, 0, var4);
                    pg.field_a = new String[-1 + (-var4 + var3)];
                    dv.a((Object[]) (Object) ta.field_C, var4 + 1, (Object[]) (Object) pg.field_a, 0, -var4 + (var3 + -1));
                    var4 = -1;
                    var3 = lu.a(cv.field_f, vo.a((byte) -18, lr.field_o, new String[1]), -46, ta.field_C, vp.field_k);
                    var5 = 0;
                    L14: while (true) {
                      L15: {
                        if (var3 <= var5) {
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
                      if (0 != (var4 ^ -1)) {
                        L16: {
                          pn.field_D = new String[var4];
                          dv.a((Object[]) (Object) ta.field_C, 0, (Object[]) (Object) pn.field_D, 0, var4);
                          cg.field_E = new String[var3 + -var4 - 1];
                          dv.a((Object[]) (Object) ta.field_C, 1 + var4, (Object[]) (Object) cg.field_E, 0, -var4 + (var3 - 1));
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
                                  if (-1 < (pn.field_D.length + var8 - var5 ^ -1)) {
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
        var3 = 0;
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
                          var13 = var11[var5];
                          var7 = ud.a(10, var13, false);
                          if (var7 > var3) {
                            var3 = var7;
                            var5++;
                            continue L26;
                          } else {
                            var5++;
                            continue L26;
                          }
                        }
                      }
                    } else {
                      var12 = var10[var5];
                      var7 = ud.a(10, var12, false);
                      if (var7 > var3) {
                        var3 = var7;
                        var5++;
                        continue L25;
                      } else {
                        var5++;
                        continue L25;
                      }
                    }
                  }
                }
              }
              bh.field_j = ll.field_k.field_a * (pr.field_d - -aj.field_a << 230504641);
              ka.field_a = -(var3 >> -1358135359) + ta.field_A;
              bh.field_l = var3 + (ta.field_A - (var3 >> -1445202943));
              var4 = 0;
              L27: while (true) {
                if (var4 >= eq.field_c.length) {
                  uq.field_c = -(bh.field_j >> -470152895) + tb.field_s;
                  ld.field_j = new int[eq.field_c.length][];
                  var4 = 0;
                  var5 = uq.field_c;
                  L28: while (true) {
                    if (eq.field_c.length <= var4) {
                      L29: {
                        if (ck.field_a == 2) {
                          ll.field_k.a(-1, 0, -1, param0);
                          break L29;
                        } else {
                          ll.field_k.a(sj.a(el.field_A, n.field_m, (byte) -127), param1 ^ 6, 0, param0);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = dk.field_g[var4];
                      if ((var6 ^ -1) > -1) {
                        var5 = var5 + la.field_c;
                        var4++;
                        continue L28;
                      } else {
                        var7 = ud.a(10, eq.field_c[var4], true);
                        var8 = ta.field_A - (var7 >> 115574785);
                        var5 = var5 + aj.field_a;
                        ld.field_j[var4] = new int[4];
                        ld.field_j[var4][0] = -eb.field_d + var8;
                        ld.field_j[var4][1] = var5;
                        ld.field_j[var4][2] = (eb.field_d << 851868001) + var7;
                        var5 = var5 + (nr.field_j + ((pr.field_d << -591897311) + aj.field_a));
                        ld.field_j[var4][3] = nr.field_j - -(pr.field_d << -1383188191);
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_105_0 = bh.field_j;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if (dk.field_g[var4] >= 0) {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = nr.field_j;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      break L30;
                    } else {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = la.field_c;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      break L30;
                    }
                  }
                  bh.field_j = stackIn_108_0 + stackIn_108_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              L31: {
                stackOut_86_0 = 10;
                stackOut_86_1 = eq.field_c[var4];
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                if (-1 < (dk.field_g[var4] ^ -1)) {
                  stackOut_88_0 = stackIn_88_0;
                  stackOut_88_1 = (String) (Object) stackIn_88_1;
                  stackOut_88_2 = 0;
                  stackIn_89_0 = stackOut_88_0;
                  stackIn_89_1 = stackOut_88_1;
                  stackIn_89_2 = stackOut_88_2;
                  break L31;
                } else {
                  stackOut_87_0 = stackIn_87_0;
                  stackOut_87_1 = (String) (Object) stackIn_87_1;
                  stackOut_87_2 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  stackIn_89_1 = stackOut_87_1;
                  stackIn_89_2 = stackOut_87_2;
                  break L31;
                }
              }
              var5 = ud.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
              if (var3 < var5) {
                var3 = var5;
                var4++;
                continue L23;
              } else {
                var4++;
                continue L23;
              }
            }
          }
        } else {
          return;
        }
    }

    ba() {
    }

    final static void a(int param0, boolean param1) {
        if (!n.a(false)) {
            return;
        }
        if (param1) {
            on.a(0, 0, on.field_g, on.field_f, 0, 192);
        }
        mr.field_Z.a(0, 0, (byte) -103);
        if (param0 <= 108) {
            field_n = null;
        }
    }

    public static void c(byte param0) {
        field_n = null;
        field_q = null;
        field_p = null;
        if (param0 != -35) {
            ut[] discarded$0 = ba.a(27, -30, 62, (byte) -107);
        }
        field_o = null;
    }

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Kickabout.field_G;
                        if (null != gt.field_t) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        gt.field_t.b((byte) 109);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (null != e.field_i) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        e.field_i.b(109);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (ao.field_h == null) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ao.field_h.c(1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (u.field_j != null) {
                            statePc = 12;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (u.field_j.length <= var1) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (u.field_j[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            u.field_j[var1].c(param0 + -43);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 20: {
                        if (param0 == 44) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        field_n = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
