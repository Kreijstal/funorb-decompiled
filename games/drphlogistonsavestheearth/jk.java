/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jk extends si {
    static String[] field_K;
    static he field_L;
    static he[] field_I;
    static int field_J;
    static he[] field_H;

    final void a(int param0, int param1, int param2, vg param3, int param4, boolean param5) {
        pi var7 = null;
        RuntimeException var7_ref = null;
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
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = oh.field_b;
              if (var7 == null) {
                break L1;
              } else {
                if (!((jk) this).a(param1, param0, false, param4, param2)) {
                  break L1;
                } else {
                  if (((jk) this).field_u instanceof hk) {
                    ((hk) (Object) ((jk) this).field_u).a((byte) 70, var7, (jk) this);
                    oh.field_b = null;
                    break L1;
                  } else {
                    if (var7.field_u instanceof hk) {
                      ((hk) (Object) var7.field_u).a((byte) 70, var7, (jk) this);
                      oh.field_b = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7_ref;
            stackOut_8_1 = new StringBuilder().append("jk.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static Object a(boolean param0, byte[] param1, byte param2) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        jc stackOut_6_0 = null;
        Object stackOut_3_0 = null;
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
            L1: {
              if (param2 <= -120) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            if (param1 != null) {
              if (param1.length <= 136) {
                stackOut_8_0 = qd.a((byte) 111, param1);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var3 = new jc();
                ((bh) (Object) var3).a(param1, (byte) -125);
                stackOut_6_0 = (jc) var3;
                stackIn_7_0 = stackOut_6_0;
                return (Object) (Object) stackIn_7_0;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("jk.A(").append(0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return (Object) (Object) stackIn_9_0;
    }

    public static void j() {
        field_H = null;
        field_K = null;
        field_I = null;
        field_L = null;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            jk.b((byte) 71, param1);
            nc.a(j.field_Y, false, (byte) 92);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jk.E(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    private jk(int param0, int param1, int param2, int param3, cg param4, fd param5, vg param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((jk) this).field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "jk.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String stackIn_74_2 = null;
        String stackIn_86_0 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        String[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String stackOut_72_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_85_0 = null;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          re.field_g = param2;
          sh.field_e = true;
          if (re.field_g == 0) {
            int discarded$12 = 14074;
            var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i);
            var4 = 3 - -var3_int;
            lg.field_a = new int[var4];
            sg.field_f = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                mi.field_g = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var3_int <= var5) {
                    sg.field_f[-3 + var4] = "";
                    sg.field_f[var4 + -2] = qa.field_N;
                    lg.field_a[var4 + -2] = 0;
                    mi.field_g[0] = 4;
                    sg.field_f[-1 + var4] = ei.field_h;
                    lg.field_a[-1 + var4] = 1;
                    mi.field_g[1] = 5;
                    break L0;
                  } else {
                    sg.field_f[var5] = pj.field_A[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                lg.field_a[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (re.field_g != 1) {
              if (2 == re.field_g) {
                int discarded$13 = 14074;
                var3_int = ab.a(ol.field_h, a.a(5044, mk.field_b, new String[1]), pj.field_A, uj.field_i);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3_int) {
                      break L4;
                    } else {
                      if ("<%0>".equals((Object) (Object) pj.field_A[var5])) {
                        var4 = var5;
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  if (-1 == var4) {
                    throw new IllegalStateException();
                  } else {
                    lk.field_i = new String[var4];
                    kg.a((Object[]) (Object) pj.field_A, 0, (Object[]) (Object) lk.field_i, 0, var4);
                    wg.field_h = new String[var3_int + (-var4 + -1)];
                    kg.a((Object[]) (Object) pj.field_A, var4 - -1, (Object[]) (Object) wg.field_h, 0, var3_int + -var4 - 1);
                    var4 = -1;
                    int discarded$14 = 14074;
                    var3_int = ab.a(ol.field_h, a.a(5044, dl.field_I, new String[1]), pj.field_A, uj.field_i);
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          break L6;
                        } else {
                          if (!"<%0>".equals((Object) (Object) pj.field_A[var5])) {
                            var5++;
                            continue L5;
                          } else {
                            var4 = var5;
                            break L6;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L7: {
                          ng.field_d = new String[var4];
                          kg.a((Object[]) (Object) pj.field_A, 0, (Object[]) (Object) ng.field_d, 0, var4);
                          ga.field_i = new String[var3_int - var4 + -1];
                          kg.a((Object[]) (Object) pj.field_A, var4 + 1, (Object[]) (Object) ga.field_i, 0, -var4 + var3_int + -1);
                          if (lk.field_i.length >= ng.field_d.length) {
                            stackOut_56_0 = lk.field_i.length;
                            stackIn_57_0 = stackOut_56_0;
                            break L7;
                          } else {
                            stackOut_55_0 = ng.field_d.length;
                            stackIn_57_0 = stackOut_55_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_57_0;
                          if (wg.field_h.length >= ga.field_i.length) {
                            stackOut_59_0 = wg.field_h.length;
                            stackIn_60_0 = stackOut_59_0;
                            break L8;
                          } else {
                            stackOut_58_0 = ga.field_i.length;
                            stackIn_60_0 = stackOut_58_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_60_0;
                        var7 = var6 + 7 + var5;
                        lg.field_a = new int[var7];
                        sg.field_f = new String[var7];
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            sg.field_f[0] = na.field_d;
                            mi.field_g = new int[2];
                            lg.field_a[1] = 0;
                            sg.field_f[1] = wk.field_h;
                            sg.field_f[4] = sl.field_B;
                            sg.field_f[2] = ph.field_d;
                            lg.field_a[3] = 1;
                            sg.field_f[3] = ff.field_K;
                            mi.field_g[0] = 5;
                            mi.field_g[1] = 2;
                            sg.field_f[5] = "";
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= var5) {
                                sg.field_f[var5 + 6] = null;
                                lg.field_a[var5 + 6] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var6 <= var8) {
                                    aa.field_d = la.a(false);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_71_0 = sg.field_f;
                                      stackOut_71_1 = var5 + 7 + var8;
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      stackIn_72_0 = stackOut_71_0;
                                      stackIn_72_1 = stackOut_71_1;
                                      if (ga.field_i.length > var8) {
                                        stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = ga.field_i[var8];
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        stackIn_74_2 = stackOut_73_2;
                                        break L12;
                                      } else {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = "";
                                        stackIn_74_0 = stackOut_72_0;
                                        stackIn_74_1 = stackOut_72_1;
                                        stackIn_74_2 = stackOut_72_2;
                                        break L12;
                                      }
                                    }
                                    stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                L13: {
                                  stackOut_65_0 = sg.field_f;
                                  stackOut_65_1 = 6 - -var8;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  if (0 > -var5 + (var8 - -ng.field_d.length)) {
                                    stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = "";
                                    stackIn_68_0 = stackOut_67_0;
                                    stackIn_68_1 = stackOut_67_1;
                                    stackIn_68_2 = stackOut_67_2;
                                    break L13;
                                  } else {
                                    stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                    stackOut_66_1 = stackIn_66_1;
                                    stackOut_66_2 = ng.field_d[ng.field_d.length + (var8 + -var5)];
                                    stackIn_68_0 = stackOut_66_0;
                                    stackIn_68_1 = stackOut_66_1;
                                    stackIn_68_2 = stackOut_66_2;
                                    break L13;
                                  }
                                }
                                stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            lg.field_a[var8] = -1;
                            var8++;
                            continue L9;
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              } else {
                if (re.field_g == 3) {
                  L14: {
                    if (sb.field_d.field_o) {
                      int discarded$15 = 14074;
                      var3_int = ab.a(ol.field_h, rc.field_h, pj.field_A, uj.field_i);
                      break L14;
                    } else {
                      int discarded$16 = 14074;
                      var3_int = ab.a(ol.field_h, of.field_u, pj.field_A, uj.field_i);
                      break L14;
                    }
                  }
                  var4 = var3_int + 2;
                  sg.field_f = new String[var4];
                  lg.field_a = new int[var4];
                  var5 = 0;
                  L15: while (true) {
                    if (var5 >= var4) {
                      mi.field_g = new int[1];
                      var5 = 0;
                      L16: while (true) {
                        if (var3_int <= var5) {
                          sg.field_f[-2 + var4] = "";
                          sg.field_f[var4 - 1] = ei.field_h;
                          lg.field_a[-1 + var4] = 0;
                          mi.field_g[0] = 5;
                          break L0;
                        } else {
                          sg.field_f[var5] = pj.field_A[var5];
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      lg.field_a[var5] = -1;
                      var5++;
                      continue L15;
                    }
                  }
                } else {
                  if (4 != re.field_g) {
                    if (re.field_g != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      int discarded$17 = 14074;
                      var3_int = ab.a(ol.field_h, de.field_z, pj.field_A, uj.field_i);
                      var4 = var3_int + 3;
                      lg.field_a = new int[var4];
                      sg.field_f = new String[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var5 >= var4) {
                          mi.field_g = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var5 >= var3_int) {
                              sg.field_f[var4 + -3] = "";
                              sg.field_f[var4 - 2] = hi.field_h;
                              lg.field_a[-2 + var4] = 0;
                              mi.field_g[0] = 3;
                              sg.field_f[var4 - 1] = ei.field_h;
                              lg.field_a[var4 + -1] = 1;
                              mi.field_g[1] = 5;
                              break L0;
                            } else {
                              sg.field_f[var5] = pj.field_A[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          lg.field_a[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    }
                  } else {
                    int discarded$18 = 14074;
                    var3_int = ab.a(ol.field_h, o.field_f, pj.field_A, uj.field_i);
                    var4 = var3_int + 2;
                    sg.field_f = new String[var4];
                    lg.field_a = new int[var4];
                    var5 = 0;
                    L19: while (true) {
                      if (var5 >= var4) {
                        mi.field_g = new int[1];
                        var5 = 0;
                        L20: while (true) {
                          if (var3_int <= var5) {
                            sg.field_f[-2 + var4] = "";
                            sg.field_f[var4 + -1] = ei.field_h;
                            lg.field_a[var4 - 1] = 0;
                            mi.field_g[0] = 5;
                            break L0;
                          } else {
                            sg.field_f[var5] = pj.field_A[var5];
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        lg.field_a[var5] = -1;
                        var5++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            } else {
              int discarded$19 = 14074;
              var3_int = ab.a(ol.field_h, kc.field_j, pj.field_A, uj.field_i);
              var4 = var3_int + 2;
              lg.field_a = new int[var4];
              sg.field_f = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var4 <= var5) {
                  mi.field_g = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var3_int) {
                      sg.field_f[var4 + -2] = "";
                      sg.field_f[var4 + -1] = ei.field_h;
                      lg.field_a[-1 + var4] = 0;
                      mi.field_g[0] = 5;
                      break L0;
                    } else {
                      sg.field_f[var5] = pj.field_A[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  lg.field_a[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        wg.field_k.field_e = mi.field_g.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= sg.field_f.length) {
            L24: {
              if (re.field_g == 2) {
                var10 = lk.field_i;
                var5 = 0;
                L25: while (true) {
                  if (var10.length <= var5) {
                    var11 = wg.field_h;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var6_ref_String = var11[var5];
                          int discarded$20 = 1;
                          var7 = u.a(var6_ref_String, false);
                          if (var3_int >= var7) {
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
                      var6_ref_String = var10[var5];
                      int discarded$21 = 1;
                      var7 = u.a(var6_ref_String, false);
                      if (var3_int < var7) {
                        var3_int = var7;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            li.field_k = -(var3_int >> 1) + var3_int + ji.field_f;
            si.field_B = ji.field_f + -(var3_int >> 1);
            vi.field_e = wg.field_k.field_e * (ig.field_h + wa.field_N << 1);
            var4 = 0;
            L29: while (true) {
              if (var4 >= sg.field_f.length) {
                jd.field_N = sa.field_f + -(vi.field_e >> 1);
                cj.field_f = new int[sg.field_f.length][];
                var4 = 0;
                var5 = jd.field_N;
                L30: while (true) {
                  if (var4 >= sg.field_f.length) {
                    L31: {
                      if (re.field_g == 2) {
                        wg.field_k.a(-1, -1, param1, 49);
                        break L31;
                      } else {
                        wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), param1, 63);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = lg.field_a[var4];
                      if (var6 >= 0) {
                        int discarded$22 = 1;
                        var7 = u.a(sg.field_f[var4], true);
                        var8 = -(var7 >> 1) + ji.field_f;
                        var5 = var5 + ig.field_h;
                        cj.field_f[var4] = new int[4];
                        cj.field_f[var4][0] = -dg.field_d + var8;
                        cj.field_f[var4][1] = var5;
                        cj.field_f[var4][2] = var7 + (dg.field_d << 1);
                        var5 = var5 + (ni.field_p + (wa.field_N << 1) - -ig.field_h);
                        cj.field_f[var4][3] = (wa.field_N << 1) + ni.field_p;
                        break L32;
                      } else {
                        var5 = var5 + s.field_g;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_106_0 = vi.field_e;
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_107_0 = stackOut_106_0;
                  if (0 > lg.field_a[var4]) {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = s.field_g;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    break L33;
                  } else {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = ni.field_p;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    break L33;
                  }
                }
                vi.field_e = stackIn_109_0 + stackIn_109_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_85_0 = sg.field_f[var4];
              stackIn_87_0 = stackOut_85_0;
              stackIn_86_0 = stackOut_85_0;
              if (lg.field_a[var4] < 0) {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                break L34;
              } else {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                break L34;
              }
            }
            L35: {
              int discarded$23 = 1;
              var5 = u.a(stackIn_88_0, stackIn_88_1 != 0);
              if (var5 > var3_int) {
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
    }

    final static void a(int param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param4 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param2 >= 0L) {
                        int discarded$1 = -29;
                        var7 = var9 + "; Expires=" + bf.a(param2 * 1000L + la.a(false)) + "; Max-Age=" + param2;
                        break L2;
                      } else {
                        var7 = var9 + "; Discard;";
                        break L2;
                      }
                    }
                    pb.a(true, "document.cookie=\"" + var7 + "\"", param3);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var6 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("jk.F(").append(0).append(44);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
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
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final static void b(byte param0, String param1) {
        try {
            int var2_int = 0;
            cj.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "jk.C(" + 71 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Destroy at least 15 death gliders", "Destroy at least 15 assault bots", "Destroy at least 15 tanks", "Destroy at least 15 barracks", "Complete at least one stage without firing any weapons", "Receive no damage in at least one stage", "Lose no lives in at least one stage", "Collect all powerups in at least one stage", "Collect no powerups in at least one stage", "Destroy all enemies in at least one stage", "Complete Earth levels", "Complete Space levels", "Complete Alien levels", "Destroy no human structures in at least one stage", "Complete the game on Hard"};
    }
}
