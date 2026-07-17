/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gb {
    static int field_b;
    static int field_d;
    static String field_e;
    private int field_a;
    private qe field_c;
    static String field_h;
    static String[] field_g;
    private ek field_i;
    private int field_f;

    private final void a(nf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                param0.b(57);
                param0.c(-1);
                ((gb) this).field_f = ((gb) this).field_f + param0.field_m;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("gb.H(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        nf var6 = null;
        lc var6_ref = null;
        int var7 = OrbDefence.field_D ? 1 : 0;
        try {
            if (!(((gb) this).field_a >= param2)) {
                throw new IllegalStateException();
            }
            this.a(2, param3);
            ((gb) this).field_f = ((gb) this).field_f - param2;
            while (((gb) this).field_f < 0) {
                var6 = (nf) (Object) ((gb) this).field_c.a(-39);
                this.a(var6, param0);
            }
            var6_ref = new lc(param1, param2);
            ((gb) this).field_i.a((ca) (Object) var6_ref, param0 + -124, param3);
            ((gb) this).field_c.a((o) (Object) var6_ref, 21693);
            ((nf) (Object) var6_ref).field_h = (long)param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gb.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final Object a(long param0, int param1) {
        lc var6 = null;
        nf var7 = (nf) (Object) ((gb) this).field_i.a(param0, param1 + -1);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.f(param1);
        if (!(var5 != null)) {
            var7.b(57);
            var7.c(-1);
            ((gb) this).field_f = ((gb) this).field_f + var7.field_m;
            return null;
        }
        if (var7.g(param1 ^ 9)) {
            var6 = new lc(var5, var7.field_m);
            ((gb) this).field_i.a((ca) (Object) var6, -128, var7.field_d);
            ((gb) this).field_c.a((o) (Object) var6, 21693);
            ((nf) (Object) var6).field_h = 0L;
            var7.b(57);
            var7.c(-1);
        } else {
            ((gb) this).field_c.a((o) (Object) var7, 21693);
            var7.field_h = 0L;
        }
        return var5;
    }

    private final void a(int param0, long param1) {
        nf var4 = (nf) (Object) ((gb) this).field_i.a(param1, -1);
        if (param0 != 2) {
            ((gb) this).field_c = null;
        }
        this.a(var4, 0);
    }

    public static void a(int param0) {
        field_g = null;
        field_h = null;
        field_e = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
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
        int stackIn_3_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String stackIn_43_2 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String stackIn_49_2 = null;
        int stackIn_91_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_48_2 = null;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String stackOut_47_2 = null;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String stackOut_42_2 = null;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        L0: {
          var9 = OrbDefence.field_D ? 1 : 0;
          kg.field_m = param1;
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          pc.field_db = stackIn_3_0 != 0;
          if (kg.field_m == 0) {
            var3_int = th.a(jd.field_a, ta.field_y, li.field_c, vi.field_I, -60);
            var4 = var3_int + 3;
            ea.field_d = new String[var4];
            dd.field_B = new int[var4];
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4) {
                gg.field_O = new int[2];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var3_int) {
                    ea.field_d[-3 + var4] = "";
                    ea.field_d[-2 + var4] = p.field_f;
                    dd.field_B[-2 + var4] = 0;
                    gg.field_O[0] = 4;
                    ea.field_d[-1 + var4] = th.field_d;
                    dd.field_B[var4 - 1] = 1;
                    gg.field_O[1] = 5;
                    break L1;
                  } else {
                    ea.field_d[var5] = li.field_c[var5];
                    var5++;
                    continue L3;
                  }
                }
              } else {
                dd.field_B[var5] = -1;
                var5++;
                continue L2;
              }
            }
          } else {
            if (kg.field_m != 1) {
              if (kg.field_m != 2) {
                if (3 == kg.field_m) {
                  L4: {
                    if (wc.field_c.field_q) {
                      var3_int = th.a(jd.field_a, am.field_c, li.field_c, vi.field_I, -62);
                      break L4;
                    } else {
                      var3_int = th.a(jd.field_a, dg.field_C, li.field_c, vi.field_I, -98);
                      break L4;
                    }
                  }
                  var4 = 2 - -var3_int;
                  ea.field_d = new String[var4];
                  dd.field_B = new int[var4];
                  var5 = 0;
                  L5: while (true) {
                    if (var4 <= var5) {
                      gg.field_O = new int[1];
                      var5 = 0;
                      L6: while (true) {
                        if (var5 >= var3_int) {
                          ea.field_d[var4 + -2] = "";
                          ea.field_d[var4 + -1] = th.field_d;
                          dd.field_B[-1 + var4] = 0;
                          gg.field_O[0] = 5;
                          break L1;
                        } else {
                          ea.field_d[var5] = li.field_c[var5];
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      dd.field_B[var5] = -1;
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  if (4 != kg.field_m) {
                    if (kg.field_m == 5) {
                      var3_int = th.a(jd.field_a, lh.field_a, li.field_c, vi.field_I, -52);
                      var4 = var3_int + 3;
                      dd.field_B = new int[var4];
                      ea.field_d = new String[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var5 >= var4) {
                          gg.field_O = new int[2];
                          var5 = 0;
                          L8: while (true) {
                            if (var5 >= var3_int) {
                              ea.field_d[var4 - 3] = "";
                              ea.field_d[var4 + -2] = ge.field_o;
                              dd.field_B[-2 + var4] = 0;
                              gg.field_O[0] = 3;
                              ea.field_d[var4 - 1] = th.field_d;
                              dd.field_B[-1 + var4] = 1;
                              gg.field_O[1] = 5;
                              break L1;
                            } else {
                              ea.field_d[var5] = li.field_c[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          dd.field_B[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var3_int = th.a(jd.field_a, fi.field_a, li.field_c, vi.field_I, -89);
                    var4 = var3_int + 2;
                    ea.field_d = new String[var4];
                    dd.field_B = new int[var4];
                    var5 = 0;
                    L9: while (true) {
                      if (var5 >= var4) {
                        gg.field_O = new int[1];
                        var5 = 0;
                        L10: while (true) {
                          if (var5 >= var3_int) {
                            ea.field_d[-2 + var4] = "";
                            ea.field_d[-1 + var4] = th.field_d;
                            dd.field_B[var4 + -1] = 0;
                            gg.field_O[0] = 5;
                            break L1;
                          } else {
                            ea.field_d[var5] = li.field_c[var5];
                            var5++;
                            continue L10;
                          }
                        }
                      } else {
                        dd.field_B[var5] = -1;
                        var5++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                var3_int = th.a(jd.field_a, t.a(-415993727, new String[1], mc.field_f), li.field_c, vi.field_I, -105);
                var4 = -1;
                var5 = 0;
                L11: while (true) {
                  L12: {
                    if (var3_int <= var5) {
                      break L12;
                    } else {
                      if ("<%0>".equals((Object) (Object) li.field_c[var5])) {
                        var4 = var5;
                        break L12;
                      } else {
                        var5++;
                        continue L11;
                      }
                    }
                  }
                  if (var4 != -1) {
                    pj.field_o = new String[var4];
                    mk.a((Object[]) (Object) li.field_c, 0, (Object[]) (Object) pj.field_o, 0, var4);
                    bc.field_t = new String[var3_int + -var4 + -1];
                    mk.a((Object[]) (Object) li.field_c, 1 + var4, (Object[]) (Object) bc.field_t, 0, var3_int + (-var4 + -1));
                    var4 = -1;
                    var3_int = th.a(jd.field_a, t.a(-415993727, new String[1], qk.field_c), li.field_c, vi.field_I, -108);
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var5 >= var3_int) {
                          break L14;
                        } else {
                          if ("<%0>".equals((Object) (Object) li.field_c[var5])) {
                            var4 = var5;
                            break L14;
                          } else {
                            var5++;
                            continue L13;
                          }
                        }
                      }
                      if (-1 != var4) {
                        L15: {
                          fd.field_e = new String[var4];
                          mk.a((Object[]) (Object) li.field_c, 0, (Object[]) (Object) fd.field_e, 0, var4);
                          sj.field_u = new String[-1 + var3_int - var4];
                          mk.a((Object[]) (Object) li.field_c, var4 - -1, (Object[]) (Object) sj.field_u, 0, -1 + (-var4 + var3_int));
                          if (fd.field_e.length <= pj.field_o.length) {
                            stackOut_31_0 = pj.field_o.length;
                            stackIn_32_0 = stackOut_31_0;
                            break L15;
                          } else {
                            stackOut_30_0 = fd.field_e.length;
                            stackIn_32_0 = stackOut_30_0;
                            break L15;
                          }
                        }
                        L16: {
                          var5 = stackIn_32_0;
                          if (sj.field_u.length > bc.field_t.length) {
                            stackOut_34_0 = sj.field_u.length;
                            stackIn_35_0 = stackOut_34_0;
                            break L16;
                          } else {
                            stackOut_33_0 = bc.field_t.length;
                            stackIn_35_0 = stackOut_33_0;
                            break L16;
                          }
                        }
                        var6 = stackIn_35_0;
                        var7 = var6 + (var5 + 7);
                        dd.field_B = new int[var7];
                        ea.field_d = new String[var7];
                        var8 = 0;
                        L17: while (true) {
                          if (var7 <= var8) {
                            ea.field_d[0] = sa.field_g;
                            dd.field_B[1] = 0;
                            ea.field_d[1] = lc.field_s;
                            gg.field_O = new int[2];
                            ea.field_d[3] = mj.field_k;
                            dd.field_B[3] = 1;
                            ea.field_d[4] = te.field_J;
                            ea.field_d[2] = ii.field_a;
                            gg.field_O[1] = 2;
                            gg.field_O[0] = 5;
                            ea.field_d[5] = "";
                            var8 = 0;
                            L18: while (true) {
                              if (var8 >= var5) {
                                ea.field_d[var5 + 6] = null;
                                dd.field_B[6 + var5] = -2;
                                var8 = 0;
                                L19: while (true) {
                                  if (var8 >= var6) {
                                    am.field_a = ji.b(111);
                                    break L1;
                                  } else {
                                    L20: {
                                      stackOut_46_0 = ea.field_d;
                                      stackOut_46_1 = 7 + var5 + var8;
                                      stackIn_48_0 = stackOut_46_0;
                                      stackIn_48_1 = stackOut_46_1;
                                      stackIn_47_0 = stackOut_46_0;
                                      stackIn_47_1 = stackOut_46_1;
                                      if (sj.field_u.length > var8) {
                                        stackOut_48_0 = (String[]) (Object) stackIn_48_0;
                                        stackOut_48_1 = stackIn_48_1;
                                        stackOut_48_2 = sj.field_u[var8];
                                        stackIn_49_0 = stackOut_48_0;
                                        stackIn_49_1 = stackOut_48_1;
                                        stackIn_49_2 = stackOut_48_2;
                                        break L20;
                                      } else {
                                        stackOut_47_0 = (String[]) (Object) stackIn_47_0;
                                        stackOut_47_1 = stackIn_47_1;
                                        stackOut_47_2 = "";
                                        stackIn_49_0 = stackOut_47_0;
                                        stackIn_49_1 = stackOut_47_1;
                                        stackIn_49_2 = stackOut_47_2;
                                        break L20;
                                      }
                                    }
                                    stackIn_49_0[stackIn_49_1] = stackIn_49_2;
                                    var8++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L21: {
                                  stackOut_40_0 = ea.field_d;
                                  stackOut_40_1 = var8 + 6;
                                  stackIn_42_0 = stackOut_40_0;
                                  stackIn_42_1 = stackOut_40_1;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  if (0 <= fd.field_e.length + (var8 + -var5)) {
                                    stackOut_42_0 = (String[]) (Object) stackIn_42_0;
                                    stackOut_42_1 = stackIn_42_1;
                                    stackOut_42_2 = fd.field_e[var8 + fd.field_e.length - var5];
                                    stackIn_43_0 = stackOut_42_0;
                                    stackIn_43_1 = stackOut_42_1;
                                    stackIn_43_2 = stackOut_42_2;
                                    break L21;
                                  } else {
                                    stackOut_41_0 = (String[]) (Object) stackIn_41_0;
                                    stackOut_41_1 = stackIn_41_1;
                                    stackOut_41_2 = "";
                                    stackIn_43_0 = stackOut_41_0;
                                    stackIn_43_1 = stackOut_41_1;
                                    stackIn_43_2 = stackOut_41_2;
                                    break L21;
                                  }
                                }
                                stackIn_43_0[stackIn_43_1] = stackIn_43_2;
                                var8++;
                                continue L18;
                              }
                            }
                          } else {
                            dd.field_B[var8] = -1;
                            var8++;
                            continue L17;
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
            } else {
              var3_int = th.a(jd.field_a, ta.field_y, li.field_c, vi.field_I, -77);
              var4 = var3_int + 2;
              ea.field_d = new String[var4];
              dd.field_B = new int[var4];
              var5 = 0;
              L22: while (true) {
                if (var5 >= var4) {
                  gg.field_O = new int[1];
                  var5 = 0;
                  L23: while (true) {
                    if (var5 >= var3_int) {
                      ea.field_d[-2 + var4] = "";
                      ea.field_d[var4 + -1] = th.field_d;
                      dd.field_B[-1 + var4] = 0;
                      gg.field_O[0] = 5;
                      break L1;
                    } else {
                      ea.field_d[var5] = li.field_c[var5];
                      var5++;
                      continue L23;
                    }
                  }
                } else {
                  dd.field_B[var5] = -1;
                  var5++;
                  continue L22;
                }
              }
            }
          }
        }
        ab.field_j.field_i = gg.field_O.length;
        var3_int = 0;
        var4 = 0;
        L24: while (true) {
          if (var4 >= ea.field_d.length) {
            L25: {
              if (kg.field_m == 2) {
                var10 = pj.field_o;
                var5 = 0;
                L26: while (true) {
                  if (var5 >= var10.length) {
                    var11 = bc.field_t;
                    var5 = 0;
                    L27: while (true) {
                      if (var11.length <= var5) {
                        break L25;
                      } else {
                        L28: {
                          var13 = var11[var5];
                          var7 = hg.a(false, var13, 0);
                          if (var7 > var3_int) {
                            var3_int = var7;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var5++;
                        continue L27;
                      }
                    }
                  } else {
                    L29: {
                      var12 = var10[var5];
                      var7 = hg.a(false, var12, 0);
                      if (var3_int < var7) {
                        var3_int = var7;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var5++;
                    continue L26;
                  }
                }
              } else {
                break L25;
              }
            }
            ha.field_o = -(var3_int >> 1) + fd.field_c;
            lc.field_q = -(var3_int >> 1) + (fd.field_c - -var3_int);
            rf.field_C = (gg.field_N + ol.field_b << 1) * ab.field_j.field_i;
            var4 = 0;
            L30: while (true) {
              if (var4 >= ea.field_d.length) {
                sd.field_h = sf.field_T - (rf.field_C >> 1);
                qd.field_d = new int[ea.field_d.length][];
                var4 = 0;
                var5 = sd.field_h;
                L31: while (true) {
                  if (ea.field_d.length <= var4) {
                    L32: {
                      if (kg.field_m == 2) {
                        ab.field_j.a(-1, -1, 0, param2);
                        break L32;
                      } else {
                        ab.field_j.a(0, jc.a(ua.field_a, (byte) 71, vl.field_d), 0, param2);
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var6 = dd.field_B[var4];
                      if (var6 < 0) {
                        var5 = var5 + d.field_j;
                        break L33;
                      } else {
                        var7 = hg.a(true, ea.field_d[var4], 0);
                        var8 = fd.field_c + -(var7 >> 1);
                        var5 = var5 + gg.field_N;
                        qd.field_d[var4] = new int[4];
                        qd.field_d[var4][0] = var8 + -mj.field_f;
                        qd.field_d[var4][1] = var5;
                        qd.field_d[var4][2] = var7 - -(mj.field_f << 1);
                        var5 = var5 + ((ol.field_b << 1) - -gg.field_N - -el.field_D);
                        qd.field_d[var4][3] = el.field_D - -(ol.field_b << 1);
                        break L33;
                      }
                    }
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L34: {
                  stackOut_109_0 = rf.field_C;
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_110_0 = stackOut_109_0;
                  if (dd.field_B[var4] >= 0) {
                    stackOut_111_0 = stackIn_111_0;
                    stackOut_111_1 = el.field_D;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    break L34;
                  } else {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = d.field_j;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    break L34;
                  }
                }
                rf.field_C = stackIn_112_0 + stackIn_112_1;
                var4++;
                continue L30;
              }
            }
          } else {
            L35: {
              if (dd.field_B[var4] < 0) {
                stackOut_90_0 = 0;
                stackIn_91_0 = stackOut_90_0;
                break L35;
              } else {
                stackOut_89_0 = 1;
                stackIn_91_0 = stackOut_89_0;
                break L35;
              }
            }
            L36: {
              var5 = hg.a(stackIn_91_0 != 0, ea.field_d[var4], 0);
              if (var3_int >= var5) {
                break L36;
              } else {
                break L36;
              }
            }
            var4++;
            continue L24;
          }
        }
    }

    final void a(Object param0, byte param1, long param2) {
        try {
            this.a(0, param0, 1, param2);
            int var5_int = -24 % ((-26 - param1) / 63);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "gb.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void b(int param0) {
        field_h = cd.field_t.g(2);
        CharSequence var2 = (CharSequence) (Object) field_h;
        sg.field_E = ua.a(-88, var2);
        if (param0 > -27) {
            gb.b(-121);
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "WAVE";
        field_g = new String[]{"First Fight", "Pincer", "Breakout", "Dominion", "Gridlock", "Orb Central"};
    }
}
