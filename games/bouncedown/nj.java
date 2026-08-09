/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends al {
    static ph field_k;
    static rb field_l;
    static long field_n;
    static int field_p;
    static rd field_o;
    static int field_m;
    static String field_j;

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.b(param0, (byte) 54) == a.field_e) {
              stackIn_3_0 = ke.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -114) {
                  break L1;
                } else {
                  nj.a(false, -29, 82);
                  break L1;
                }
              }
              stackIn_7_0 = ha.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("nj.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final vf b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        vf stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        vf stackIn_8_0 = null;
        vf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 54) {
              L1: {
                if (null != hc.a(param0, 4011)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              var3_int = stackIn_6_0;
              if (var3_int != 0) {
                stackIn_10_0 = mc.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_8_0 = a.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (vf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("nj.B(");

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
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void d(int param0) {
        field_l = null;
        field_k = null;
        if (param0 != 22382) {
            nj.d(83);
        }
        field_o = null;
        field_j = null;
    }

    nj(ba param0) {
        super(param0);
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        int stackIn_91_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = Bounce.field_N;
        try {
          L0: {
            L1: {
              ea.field_f = true;
              ne.field_u = param2;
              if (-1 != (ne.field_u ^ -1)) {
                if (1 == ne.field_u) {
                  var3_int = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
                  var4 = var3_int + 2;
                  se.field_E = new String[var4];
                  m.field_a = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var4 <= var5) {
                      ii.field_n = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var3_int <= var5) {
                          se.field_E[var4 + -2] = "";
                          se.field_E[-1 + var4] = uk.field_b;
                          m.field_a[var4 - 1] = 0;
                          ii.field_n[0] = 5;
                          break L1;
                        } else {
                          se.field_E[var5] = ga.field_g[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      m.field_a[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (2 == ne.field_u) {
                    var3_int = r.a(ba.field_E, ga.field_g, jf.a(al.field_g, new String[]{"<br><%0><br>"}, (byte) -126), 1, gk.field_a);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!"<%0>".equals(ga.field_g[var5])) {
                            var5++;
                            continue L4;
                          } else {
                            var4 = var5;
                            break L5;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        eb.field_E = new String[var4];
                        cb.a(ga.field_g, 0, eb.field_E, 0, var4);
                        ll.field_E = new String[var3_int + -var4 - 1];
                        cb.a(ga.field_g, var4 - -1, ll.field_E, 0, -var4 + (var3_int + -1));
                        var4 = -1;
                        var3_int = r.a(ba.field_E, ga.field_g, jf.a(se.field_B, new String[]{"<br><%0><br>"}, (byte) -126), param1 ^ -25697, gk.field_a);
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var3_int <= var5) {
                              break L7;
                            } else {
                              if (!"<%0>".equals(ga.field_g[var5])) {
                                var5++;
                                continue L6;
                              } else {
                                var4 = var5;
                                break L7;
                              }
                            }
                          }
                          if (-1 != var4) {
                            L8: {
                              t.field_r = new String[var4];
                              cb.a(ga.field_g, 0, t.field_r, 0, var4);
                              vb.field_k = new String[-1 + (var3_int - var4)];
                              cb.a(ga.field_g, var4 + 1, vb.field_k, 0, var3_int + (-var4 - 1));
                              if (eb.field_E.length >= t.field_r.length) {
                                stackIn_57_0 = eb.field_E.length;
                                break L8;
                              } else {
                                stackIn_57_0 = t.field_r.length;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_57_0;
                              if (vb.field_k.length > ll.field_E.length) {
                                stackIn_60_0 = vb.field_k.length;
                                break L9;
                              } else {
                                stackIn_60_0 = ll.field_E.length;
                                break L9;
                              }
                            }
                            var6 = stackIn_60_0;
                            var7 = var6 + (7 - -var5);
                            se.field_E = new String[var7];
                            m.field_a = new int[var7];
                            var8 = 0;
                            L10: while (true) {
                              if (var7 <= var8) {
                                m.field_a[1] = 0;
                                se.field_E[0] = mg.field_l;
                                se.field_E[1] = eb.field_F;
                                ii.field_n = new int[2];
                                ii.field_n[0] = 5;
                                ii.field_n[1] = 2;
                                m.field_a[3] = 1;
                                se.field_E[4] = ma.field_u;
                                se.field_E[5] = "";
                                se.field_E[3] = ab.field_g;
                                se.field_E[2] = field_j;
                                var8 = 0;
                                L11: while (true) {
                                  if (var8 >= var5) {
                                    se.field_E[6 - -var5] = null;
                                    m.field_a[var5 + 6] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var6 <= var8) {
                                        gd.field_a = fa.a(109);
                                        break L1;
                                      } else {
                                        stackIn_72_0 = se.field_E;
                                        stackIn_72_1 = var8 + (7 - -var5);
                                        stackIn_72_2 = var8;
                                        stackIn_72_3 = vb.field_k.length;
                                        L13: {




                                          if (stackIn_72_2 >= stackIn_72_3) {
                                            stackIn_72_0 = (String[]) ((Object) stackIn_72_0);

                                            stackIn_75_2 = "";
                                            break L13;
                                          } else {
                                            stackIn_72_0 = (String[]) ((Object) stackIn_72_0);

                                            stackIn_75_2 = vb.field_k[var8];
                                            break L13;
                                          }
                                        }
                                        stackIn_72_0[stackIn_72_1] = stackIn_75_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackIn_67_0 = se.field_E;

                                      stackIn_67_1 = 6 - -var8;

                                      if ((-var5 + t.field_r.length + var8 ^ -1) > -1) {
                                        stackIn_68_0 = (String[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = "";
                                        break L14;
                                      } else {
                                        stackIn_68_0 = (String[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = t.field_r[-var5 + var8 - -t.field_r.length];
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                m.field_a[var8] = -1;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      }
                    }
                  } else {
                    if (ne.field_u != 3) {
                      if (-5 == (ne.field_u ^ -1)) {
                        var3_int = r.a(ba.field_E, ga.field_g, of.field_a, 1, gk.field_a);
                        var4 = var3_int + 2;
                        m.field_a = new int[var4];
                        se.field_E = new String[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var4) {
                            ii.field_n = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var3_int <= var5) {
                                se.field_E[var4 + -2] = "";
                                se.field_E[var4 + -1] = uk.field_b;
                                m.field_a[-1 + var4] = 0;
                                ii.field_n[0] = 5;
                                break L1;
                              } else {
                                se.field_E[var5] = ga.field_g[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            m.field_a[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        if (5 != ne.field_u) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = r.a(ba.field_E, ga.field_g, pe.field_g, param1 + 25699, gk.field_a);
                          var4 = 3 + var3_int;
                          se.field_E = new String[var4];
                          m.field_a = new int[var4];
                          var5 = 0;
                          L17: while (true) {
                            if (var5 >= var4) {
                              ii.field_n = new int[2];
                              var5 = 0;
                              L18: while (true) {
                                if (var5 >= var3_int) {
                                  se.field_E[-3 + var4] = "";
                                  se.field_E[var4 + -2] = wa.field_f;
                                  m.field_a[-2 + var4] = 0;
                                  ii.field_n[0] = 3;
                                  se.field_E[-1 + var4] = uk.field_b;
                                  m.field_a[var4 - 1] = 1;
                                  ii.field_n[1] = 5;
                                  break L1;
                                } else {
                                  se.field_E[var5] = ga.field_g[var5];
                                  var5++;
                                  continue L18;
                                }
                              }
                            } else {
                              m.field_a[var5] = -1;
                              var5++;
                              continue L17;
                            }
                          }
                        }
                      }
                    } else {
                      L19: {
                        if (ck.field_e.field_l) {
                          var3_int = r.a(ba.field_E, ga.field_g, vg.field_f, param1 + 25699, gk.field_a);
                          break L19;
                        } else {
                          var3_int = r.a(ba.field_E, ga.field_g, ra.field_f, param1 + 25699, gk.field_a);
                          break L19;
                        }
                      }
                      var4 = 2 - -var3_int;
                      se.field_E = new String[var4];
                      m.field_a = new int[var4];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var4) {
                          ii.field_n = new int[1];
                          var5 = 0;
                          L21: while (true) {
                            if (var3_int <= var5) {
                              se.field_E[-2 + var4] = "";
                              se.field_E[-1 + var4] = uk.field_b;
                              m.field_a[var4 + -1] = 0;
                              ii.field_n[0] = 5;
                              break L1;
                            } else {
                              se.field_E[var5] = ga.field_g[var5];
                              var5++;
                              continue L21;
                            }
                          }
                        } else {
                          m.field_a[var5] = -1;
                          var5++;
                          continue L20;
                        }
                      }
                    }
                  }
                }
              } else {
                var3_int = r.a(ba.field_E, ga.field_g, vg.field_g, 1, gk.field_a);
                var4 = 3 - -var3_int;
                se.field_E = new String[var4];
                m.field_a = new int[var4];
                var5 = 0;
                L22: while (true) {
                  if (var4 <= var5) {
                    ii.field_n = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        se.field_E[var4 + -3] = "";
                        se.field_E[-2 + var4] = tb.field_o;
                        m.field_a[var4 + -2] = 0;
                        ii.field_n[0] = 4;
                        se.field_E[-1 + var4] = uk.field_b;
                        m.field_a[var4 - 1] = 1;
                        ii.field_n[1] = 5;
                        break L1;
                      } else {
                        se.field_E[var5] = ga.field_g[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    m.field_a[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            L24: {
              cf.field_f.field_f = ii.field_n.length;
              if (param1 == -25698) {
                break L24;
              } else {
                nj.d(-32);
                break L24;
              }
            }
            var3_int = 0;
            var4 = 0;
            L25: while (true) {
              if (var4 >= se.field_E.length) {
                L26: {
                  if (ne.field_u == 2) {
                    var10 = eb.field_E;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L27: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = ll.field_E;
                        var5 = 0;
                        L28: while (true) {
                          if (var5 >= var4_ref_String__.length) {
                            break L26;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = vh.a(false, var12, true);
                            if (var3_int < var7) {
                              var3_int = var7;
                              var5++;
                              continue L28;
                            } else {
                              var5++;
                              continue L28;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = vh.a(false, var11, true);
                        if (var3_int < var7) {
                          var3_int = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                ef.field_a = (hj.field_a + cl.field_m << 2079012545) * cf.field_f.field_f;
                ui.field_p = var3_int + bi.field_h - (var3_int >> 469846241);
                bb.field_b = bi.field_h - (var3_int >> 900701377);
                var4 = 0;
                L29: while (true) {
                  if (var4 >= se.field_E.length) {
                    jl.field_a = uf.field_a - (ef.field_a >> 1951849121);
                    lf.field_r = new int[se.field_E.length][];
                    var4 = 0;
                    var5 = jl.field_a;
                    L30: while (true) {
                      if (se.field_E.length <= var4) {
                        L31: {
                          if (ne.field_u != 2) {
                            cf.field_f.a(param0, -125, qe.a(uc.field_C, (byte) -101, ll.field_y), 0);
                            break L31;
                          } else {
                            cf.field_f.a(param0, 99, -1, -1);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var6 = m.field_a[var4];
                          if ((var6 ^ -1) <= -1) {
                            var7 = vh.a(true, se.field_E[var4], true);
                            var5 = var5 + hj.field_a;
                            var8 = -(var7 >> -506967263) + bi.field_h;
                            lf.field_r[var4] = new int[4];
                            lf.field_r[var4][0] = -kk.field_z + var8;
                            lf.field_r[var4][1] = var5;
                            lf.field_r[var4][2] = (kk.field_z << 438568193) + var7;
                            lf.field_r[var4][3] = pb.field_j + (cl.field_m << -354945087);
                            var5 = var5 + (pb.field_j + (hj.field_a + (cl.field_m << 1943345889)));
                            break L32;
                          } else {
                            var5 = var5 + k.field_D;
                            break L32;
                          }
                        }
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackIn_111_0 = ef.field_a;

                      if (m.field_a[var4] >= 0) {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = pb.field_j;
                        break L33;
                      } else {
                        stackIn_112_0 = stackIn_111_0;
                        stackIn_112_1 = k.field_D;
                        break L33;
                      }
                    }
                    ef.field_a = stackIn_112_0 + stackIn_112_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  if ((m.field_a[var4] ^ -1) > -1) {
                    stackIn_91_0 = 0;
                    break L34;
                  } else {
                    stackIn_91_0 = 1;
                    break L34;
                  }
                }
                L35: {
                  var5 = vh.a(stackIn_91_0 != 0, se.field_E[var4], true);
                  if (var5 > var3_int) {
                    var3_int = var5;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var4++;
                continue L25;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "nj.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_k = new ph("email");
        field_m = 64;
        field_o = new rd();
        field_j = "to keep fullscreen or";
    }
}
