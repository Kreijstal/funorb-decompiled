/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pe {
    static String field_d;
    static int field_e;
    static oa field_b;
    static int[] field_g;
    static String field_c;
    static int field_f;
    static int[] field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            var4_int = param0 / 2;
            var5 = param0 * 15 / 16;
            var6 = param0 / 32;
            var7 = param0 * 15 / 16;
            var8 = param0 * 115 / 128;
            var9 = 0;
            L1: while (true) {
              if (var8 <= var9) {
                L2: {
                  if (param1 == 4209) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var10 = var4_int - -((-var4_int + var6) * var9 / var8);
                var11 = var5 + var9 * (var7 - var5) / var8;
                var12 = -96 * var9 / var8 + 160;
                tc.c(var10 + (-(param0 / 2) + param2), -(param0 / 2) + param3 + var9, var11 - var10, 16777088, var12);
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var4, "pe.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_46_2 = null;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String stackIn_52_2 = null;
        String stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        String[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String stackOut_51_2 = null;
        String[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        String stackOut_50_2 = null;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        String stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        L0: {
          var10 = HoldTheLine.field_D;
          oi.field_f = true;
          pa.field_h = param0;
          if (pa.field_h != 0) {
            if (pa.field_h != 1) {
              if (pa.field_h != 2) {
                if (pa.field_h == 3) {
                  L1: {
                    if (wi.field_b.field_f) {
                      var3_int = mg.a(sj.field_G, sj.field_J, an.field_c, (byte) -60, p.field_j);
                      break L1;
                    } else {
                      var3_int = mg.a(sj.field_G, ek.field_w, an.field_c, (byte) -70, p.field_j);
                      break L1;
                    }
                  }
                  var4 = var3_int + 2;
                  cd.field_f = new int[var4];
                  ii.field_b = new String[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      ii.field_e = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          ii.field_b[-2 + var4] = "";
                          ii.field_b[-1 + var4] = h.field_f;
                          cd.field_f[-1 + var4] = 0;
                          ii.field_e[0] = 5;
                          break L0;
                        } else {
                          ii.field_b[var5] = an.field_c[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      cd.field_f[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (pa.field_h == 4) {
                    var3_int = mg.a(sj.field_G, dk.field_m, an.field_c, (byte) 106, p.field_j);
                    var4 = 2 + var3_int;
                    cd.field_f = new int[var4];
                    ii.field_b = new String[var4];
                    var5 = 0;
                    L4: while (true) {
                      if (var4 <= var5) {
                        ii.field_e = new int[1];
                        var5 = 0;
                        L5: while (true) {
                          if (var3_int <= var5) {
                            ii.field_b[var4 - 2] = "";
                            ii.field_b[var4 - 1] = h.field_f;
                            cd.field_f[-1 + var4] = 0;
                            ii.field_e[0] = 5;
                            break L0;
                          } else {
                            ii.field_b[var5] = an.field_c[var5];
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        cd.field_f[var5] = -1;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (5 == pa.field_h) {
                      var3_int = mg.a(sj.field_G, hc.field_c, an.field_c, (byte) 119, p.field_j);
                      var4 = var3_int + 3;
                      ii.field_b = new String[var4];
                      cd.field_f = new int[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var4 <= var5) {
                          ii.field_e = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var3_int <= var5) {
                              ii.field_b[var4 + -3] = "";
                              ii.field_b[-2 + var4] = vk.field_i;
                              cd.field_f[var4 - 2] = 0;
                              ii.field_e[0] = 3;
                              ii.field_b[-1 + var4] = h.field_f;
                              cd.field_f[-1 + var4] = 1;
                              ii.field_e[1] = 5;
                              break L0;
                            } else {
                              ii.field_b[var5] = an.field_c[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          cd.field_f[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                }
              } else {
                var3_int = mg.a(sj.field_G, sd.a(qg.field_a, new String[1], true), an.field_c, (byte) -59, p.field_j);
                var4 = -1;
                var5 = 0;
                L8: while (true) {
                  L9: {
                    if (var5 >= var3_int) {
                      break L9;
                    } else {
                      if ("<%0>".equals((Object) (Object) an.field_c[var5])) {
                        var4 = var5;
                        break L9;
                      } else {
                        var5++;
                        continue L8;
                      }
                    }
                  }
                  if (var4 != -1) {
                    qg.field_b = new String[var4];
                    bc.a((Object[]) (Object) an.field_c, 0, (Object[]) (Object) qg.field_b, 0, var4);
                    aa.field_j = new String[-1 + (var3_int + -var4)];
                    bc.a((Object[]) (Object) an.field_c, var4 + 1, (Object[]) (Object) aa.field_j, 0, -var4 + var3_int - 1);
                    var3_int = mg.a(sj.field_G, sd.a(b.field_b, new String[1], true), an.field_c, (byte) 118, p.field_j);
                    var4 = -1;
                    var5 = 0;
                    L10: while (true) {
                      L11: {
                        if (var5 >= var3_int) {
                          break L11;
                        } else {
                          if (!"<%0>".equals((Object) (Object) an.field_c[var5])) {
                            var5++;
                            continue L10;
                          } else {
                            var4 = var5;
                            break L11;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L12: {
                          dg.field_b = new String[var4];
                          bc.a((Object[]) (Object) an.field_c, 0, (Object[]) (Object) dg.field_b, 0, var4);
                          pb.field_a = new String[-1 + (-var4 + var3_int)];
                          bc.a((Object[]) (Object) an.field_c, 1 + var4, (Object[]) (Object) pb.field_a, 0, var3_int + -var4 - 1);
                          if (dg.field_b.length > qg.field_b.length) {
                            stackOut_34_0 = dg.field_b.length;
                            stackIn_35_0 = stackOut_34_0;
                            break L12;
                          } else {
                            stackOut_33_0 = qg.field_b.length;
                            stackIn_35_0 = stackOut_33_0;
                            break L12;
                          }
                        }
                        L13: {
                          var5 = stackIn_35_0;
                          if (pb.field_a.length > aa.field_j.length) {
                            stackOut_37_0 = pb.field_a.length;
                            stackIn_38_0 = stackOut_37_0;
                            break L13;
                          } else {
                            stackOut_36_0 = aa.field_j.length;
                            stackIn_38_0 = stackOut_36_0;
                            break L13;
                          }
                        }
                        var6 = stackIn_38_0;
                        var7 = var5 + (7 - -var6);
                        ii.field_b = new String[var7];
                        cd.field_f = new int[var7];
                        var8 = 0;
                        L14: while (true) {
                          if (var8 >= var7) {
                            ii.field_e = new int[2];
                            ii.field_b[1] = eb.field_k;
                            cd.field_f[1] = 0;
                            ii.field_b[0] = rc.field_b;
                            cd.field_f[3] = 1;
                            ii.field_b[2] = mg.field_k;
                            ii.field_e[0] = 5;
                            ii.field_b[5] = "";
                            ii.field_b[3] = d.field_d;
                            ii.field_e[1] = 2;
                            ii.field_b[4] = wl.field_d;
                            var8 = 0;
                            L15: while (true) {
                              if (var5 <= var8) {
                                ii.field_b[6 - -var5] = null;
                                cd.field_f[var5 + 6] = -2;
                                var8 = 0;
                                L16: while (true) {
                                  if (var8 >= var6) {
                                    cg.field_g = bb.b(-1);
                                    break L0;
                                  } else {
                                    L17: {
                                      stackOut_49_0 = ii.field_b;
                                      stackOut_49_1 = var5 + 7 + var8;
                                      stackIn_51_0 = stackOut_49_0;
                                      stackIn_51_1 = stackOut_49_1;
                                      stackIn_50_0 = stackOut_49_0;
                                      stackIn_50_1 = stackOut_49_1;
                                      if (var8 < pb.field_a.length) {
                                        stackOut_51_0 = (String[]) (Object) stackIn_51_0;
                                        stackOut_51_1 = stackIn_51_1;
                                        stackOut_51_2 = pb.field_a[var8];
                                        stackIn_52_0 = stackOut_51_0;
                                        stackIn_52_1 = stackOut_51_1;
                                        stackIn_52_2 = stackOut_51_2;
                                        break L17;
                                      } else {
                                        stackOut_50_0 = (String[]) (Object) stackIn_50_0;
                                        stackOut_50_1 = stackIn_50_1;
                                        stackOut_50_2 = "";
                                        stackIn_52_0 = stackOut_50_0;
                                        stackIn_52_1 = stackOut_50_1;
                                        stackIn_52_2 = stackOut_50_2;
                                        break L17;
                                      }
                                    }
                                    stackIn_52_0[stackIn_52_1] = stackIn_52_2;
                                    var8++;
                                    continue L16;
                                  }
                                }
                              } else {
                                L18: {
                                  stackOut_43_0 = ii.field_b;
                                  stackOut_43_1 = var8 + 6;
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_45_1 = stackOut_43_1;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  if (-var5 + (var8 + dg.field_b.length) < 0) {
                                    stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                    stackOut_45_1 = stackIn_45_1;
                                    stackOut_45_2 = "";
                                    stackIn_46_0 = stackOut_45_0;
                                    stackIn_46_1 = stackOut_45_1;
                                    stackIn_46_2 = stackOut_45_2;
                                    break L18;
                                  } else {
                                    stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                    stackOut_44_1 = stackIn_44_1;
                                    stackOut_44_2 = dg.field_b[-var5 + var8 - -dg.field_b.length];
                                    stackIn_46_0 = stackOut_44_0;
                                    stackIn_46_1 = stackOut_44_1;
                                    stackIn_46_2 = stackOut_44_2;
                                    break L18;
                                  }
                                }
                                stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                var8++;
                                continue L15;
                              }
                            }
                          } else {
                            cd.field_f[var8] = -1;
                            var8++;
                            continue L14;
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
              var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) -95, p.field_j);
              var4 = 2 - -var3_int;
              cd.field_f = new int[var4];
              ii.field_b = new String[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  ii.field_e = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var3_int <= var5) {
                      ii.field_b[var4 - 2] = "";
                      ii.field_b[-1 + var4] = h.field_f;
                      cd.field_f[var4 + -1] = 0;
                      ii.field_e[0] = 5;
                      break L0;
                    } else {
                      ii.field_b[var5] = an.field_c[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  cd.field_f[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = mg.a(sj.field_G, fm.field_c, an.field_c, (byte) 115, p.field_j);
            var4 = var3_int + 3;
            cd.field_f = new int[var4];
            ii.field_b = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var4 <= var5) {
                ii.field_e = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var3_int) {
                    ii.field_b[var4 + -3] = "";
                    ii.field_b[var4 + -2] = mg.field_e;
                    cd.field_f[-2 + var4] = 0;
                    ii.field_e[0] = 4;
                    ii.field_b[-1 + var4] = h.field_f;
                    cd.field_f[var4 - 1] = 1;
                    ii.field_e[1] = 5;
                    break L0;
                  } else {
                    ii.field_b[var5] = an.field_c[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                cd.field_f[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        kl.field_q.field_b = ii.field_e.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= ii.field_b.length) {
            L24: {
              if (2 == pa.field_h) {
                var11 = qg.field_b;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var11.length) {
                    var12 = aa.field_j;
                    var5 = 0;
                    L26: while (true) {
                      if (var12.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var14 = var12[var5];
                          var7 = h.a(var14, (byte) -113, false);
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
                      var13 = var11[var5];
                      var7 = h.a(var13, (byte) -113, false);
                      if (var7 > var3_int) {
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
            var4 = 95 / ((-38 - param2) / 48);
            mk.field_d = mk.field_i - (var3_int >> 1);
            vf.field_t = var3_int + (mk.field_i + -(var3_int >> 1));
            lb.field_v = (vf.field_w + dc.field_bb << 1) * kl.field_q.field_b;
            var5 = 0;
            L29: while (true) {
              if (var5 >= ii.field_b.length) {
                ie.field_j = in.field_i - (lb.field_v >> 1);
                fi.field_lb = new int[ii.field_b.length][];
                var5 = 0;
                var6 = ie.field_j;
                L30: while (true) {
                  if (var5 >= ii.field_b.length) {
                    L31: {
                      if (pa.field_h == 2) {
                        kl.field_q.a(-1, 0, param1, -1);
                        break L31;
                      } else {
                        kl.field_q.a(cm.a((byte) 110, rf.field_X, nc.field_g), 0, param1, 0);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var7 = cd.field_f[var5];
                      if (0 <= var7) {
                        var8 = h.a(ii.field_b[var5], (byte) -113, true);
                        var6 = var6 + dc.field_bb;
                        var9 = -(var8 >> 1) + mk.field_i;
                        fi.field_lb[var5] = new int[4];
                        fi.field_lb[var5][0] = var9 + -pg.field_G;
                        fi.field_lb[var5][1] = var6;
                        fi.field_lb[var5][2] = (pg.field_G << 1) + var8;
                        fi.field_lb[var5][3] = (vf.field_w << 1) + w.field_b;
                        var6 = var6 + (dc.field_bb + ((vf.field_w << 1) - -w.field_b));
                        break L32;
                      } else {
                        var6 = var6 + hn.field_M;
                        break L32;
                      }
                    }
                    var5++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_103_0 = lb.field_v;
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_104_0 = stackOut_103_0;
                  if (0 <= cd.field_f[var5]) {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = w.field_b;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    break L33;
                  } else {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = hn.field_M;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    break L33;
                  }
                }
                lb.field_v = stackIn_106_0 + stackIn_106_1;
                var5++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_84_0 = ii.field_b[var4];
              stackOut_84_1 = -113;
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (cd.field_f[var4] < 0) {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L34;
              } else {
                stackOut_85_0 = (String) (Object) stackIn_85_0;
                stackOut_85_1 = stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L34;
              }
            }
            L35: {
              var5 = h.a(stackIn_87_0, (byte) stackIn_87_1, stackIn_87_2 != 0);
              if (var5 <= var3_int) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<col=1><%0></col><br><br>Power: <%1><br>Speed: <%2><br>Grip: <%3>";
        field_e = 480;
        field_f = 2;
        field_a = new int[8192];
    }
}
