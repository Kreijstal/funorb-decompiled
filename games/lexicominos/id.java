/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class id extends ik {
    static oj[] field_w;
    static int field_v;
    static String field_u;
    static String field_t;

    id(le param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_E, -1, 2147483647, false);
    }

    id(int param0) {
        this(ql.field_Q, param0);
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        if (!(!param2)) {
            ae.a(true, param3.field_j, param3.field_o + param0, param3.field_v, param1 - -param3.field_t);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    final static void a(int param0, boolean param1, byte param2) {
        int var3 = 0;
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
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        String[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_39_2 = null;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String stackIn_45_2 = null;
        String stackIn_85_0 = null;
        String stackIn_86_0 = null;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        String[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String stackOut_43_2 = null;
        String[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_37_2 = null;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        String stackOut_84_0 = null;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        L0: {
          var10 = Lexicominos.field_L ? 1 : 0;
          sh.field_a = param0;
          sc.field_e = true;
          if (sh.field_a == 0) {
            var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
            var4 = 3 - -var3;
            ni.field_a = new int[var4];
            ee.field_g = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                ik.field_g = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    ee.field_g[var4 + -3] = "";
                    ee.field_g[-2 + var4] = l.field_E;
                    ni.field_a[-2 + var4] = 0;
                    ik.field_g[0] = 4;
                    ee.field_g[var4 + -1] = vk.field_d;
                    ni.field_a[-1 + var4] = 1;
                    ik.field_g[1] = 5;
                    break L0;
                  } else {
                    ee.field_g[var5] = ug.field_r[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ni.field_a[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (-2 != (sh.field_a ^ -1)) {
              if (-3 != (sh.field_a ^ -1)) {
                if (sh.field_a == 3) {
                  L3: {
                    if (jh.field_a.field_e) {
                      var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, qb.field_m, nb.field_x);
                      break L3;
                    } else {
                      var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, lb.field_a, nb.field_x);
                      break L3;
                    }
                  }
                  var4 = var3 + 2;
                  ni.field_a = new int[var4];
                  ee.field_g = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      ik.field_g = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3) {
                          ee.field_g[-2 + var4] = "";
                          ee.field_g[-1 + var4] = vk.field_d;
                          ni.field_a[var4 - 1] = 0;
                          ik.field_g[0] = 5;
                          break L0;
                        } else {
                          ee.field_g[var5] = ug.field_r[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      ni.field_a[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if ((sh.field_a ^ -1) == -5) {
                    var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, pj.field_B, nb.field_x);
                    var4 = var3 + 2;
                    ni.field_a = new int[var4];
                    ee.field_g = new String[var4];
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= var4) {
                        ik.field_g = new int[1];
                        var5 = 0;
                        L7: while (true) {
                          if (var3 <= var5) {
                            ee.field_g[-2 + var4] = "";
                            ee.field_g[var4 + -1] = vk.field_d;
                            ni.field_a[var4 - 1] = 0;
                            ik.field_g[0] = 5;
                            break L0;
                          } else {
                            ee.field_g[var5] = ug.field_r[var5];
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        ni.field_a[var5] = -1;
                        var5++;
                        continue L6;
                      }
                    }
                  } else {
                    if (sh.field_a != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, qj.field_db, nb.field_x);
                      var4 = 3 - -var3;
                      ni.field_a = new int[var4];
                      ee.field_g = new String[var4];
                      var5 = 0;
                      L8: while (true) {
                        if (var4 <= var5) {
                          ik.field_g = new int[2];
                          var5 = 0;
                          L9: while (true) {
                            if (var5 >= var3) {
                              ee.field_g[-3 + var4] = "";
                              ee.field_g[var4 + -2] = hl.field_p;
                              ni.field_a[-2 + var4] = 0;
                              ik.field_g[0] = 3;
                              ee.field_g[var4 + -1] = vk.field_d;
                              ni.field_a[-1 + var4] = 1;
                              ik.field_g[1] = 5;
                              break L0;
                            } else {
                              ee.field_g[var5] = ug.field_r[var5];
                              var5++;
                              continue L9;
                            }
                          }
                        } else {
                          ni.field_a[var5] = -1;
                          var5++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[1], pl.field_a, false), nb.field_x);
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var5 >= var3) {
                      break L11;
                    } else {
                      if (!"<%0>".equals((Object) (Object) ug.field_r[var5])) {
                        var5++;
                        continue L10;
                      } else {
                        var4 = var5;
                        break L11;
                      }
                    }
                  }
                  if (0 != (var4 ^ -1)) {
                    ed.field_t = new String[var4];
                    o.a((Object[]) (Object) ug.field_r, 0, (Object[]) (Object) ed.field_t, 0, var4);
                    qc.field_e = new String[-1 + (-var4 + var3)];
                    o.a((Object[]) (Object) ug.field_r, 1 + var4, (Object[]) (Object) qc.field_e, 0, -1 + var3 + -var4);
                    var4 = -1;
                    var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[1], mg.field_z, false), nb.field_x);
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) ug.field_r[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (-1 != var4) {
                        L14: {
                          hf.field_b = new String[var4];
                          o.a((Object[]) (Object) ug.field_r, 0, (Object[]) (Object) hf.field_b, 0, var4);
                          nl.field_a = new String[-1 + (-var4 + var3)];
                          o.a((Object[]) (Object) ug.field_r, 1 + var4, (Object[]) (Object) nl.field_a, 0, -1 + var3 - var4);
                          if (ed.field_t.length >= hf.field_b.length) {
                            stackOut_27_0 = ed.field_t.length;
                            stackIn_28_0 = stackOut_27_0;
                            break L14;
                          } else {
                            stackOut_26_0 = hf.field_b.length;
                            stackIn_28_0 = stackOut_26_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_28_0;
                          if (qc.field_e.length >= nl.field_a.length) {
                            stackOut_30_0 = qc.field_e.length;
                            stackIn_31_0 = stackOut_30_0;
                            break L15;
                          } else {
                            stackOut_29_0 = nl.field_a.length;
                            stackIn_31_0 = stackOut_29_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_31_0;
                        var7 = var6 + 7 - -var5;
                        ni.field_a = new int[var7];
                        ee.field_g = new String[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (var7 <= var8) {
                            ee.field_g[1] = pf.field_l;
                            ee.field_g[0] = n.field_c;
                            ik.field_g = new int[2];
                            ni.field_a[1] = 0;
                            ik.field_g[1] = 2;
                            ee.field_g[5] = "";
                            ee.field_g[3] = pa.field_c;
                            ik.field_g[0] = 5;
                            ee.field_g[4] = sb.field_b;
                            ni.field_a[3] = 1;
                            ee.field_g[2] = eg.field_F;
                            var8 = 0;
                            L17: while (true) {
                              if (var5 <= var8) {
                                ee.field_g[6 - -var5] = null;
                                ni.field_a[6 - -var5] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    ug.field_x = rf.c(0);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_42_0 = ee.field_g;
                                      stackOut_42_1 = var5 + (7 - -var8);
                                      stackIn_44_0 = stackOut_42_0;
                                      stackIn_44_1 = stackOut_42_1;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      if (var8 >= nl.field_a.length) {
                                        stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                        stackOut_44_1 = stackIn_44_1;
                                        stackOut_44_2 = "";
                                        stackIn_45_0 = stackOut_44_0;
                                        stackIn_45_1 = stackOut_44_1;
                                        stackIn_45_2 = stackOut_44_2;
                                        break L19;
                                      } else {
                                        stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                                        stackOut_43_1 = stackIn_43_1;
                                        stackOut_43_2 = nl.field_a[var8];
                                        stackIn_45_0 = stackOut_43_0;
                                        stackIn_45_1 = stackOut_43_1;
                                        stackIn_45_2 = stackOut_43_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_36_0 = ee.field_g;
                                  stackOut_36_1 = 6 + var8;
                                  stackIn_38_0 = stackOut_36_0;
                                  stackIn_38_1 = stackOut_36_1;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  if (-var5 + var8 - -hf.field_b.length < 0) {
                                    stackOut_38_0 = (String[]) (Object) stackIn_38_0;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = "";
                                    stackIn_39_0 = stackOut_38_0;
                                    stackIn_39_1 = stackOut_38_1;
                                    stackIn_39_2 = stackOut_38_2;
                                    break L20;
                                  } else {
                                    stackOut_37_0 = (String[]) (Object) stackIn_37_0;
                                    stackOut_37_1 = stackIn_37_1;
                                    stackOut_37_2 = hf.field_b[var8 + (hf.field_b.length - var5)];
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    stackIn_39_2 = stackOut_37_2;
                                    break L20;
                                  }
                                }
                                stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            ni.field_a[var8] = -1;
                            var8++;
                            continue L16;
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
              var3 = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
              var4 = var3 + 2;
              ni.field_a = new int[var4];
              ee.field_g = new String[var4];
              var5 = 0;
              L21: while (true) {
                if (var5 >= var4) {
                  ik.field_g = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var3 <= var5) {
                      ee.field_g[-2 + var4] = "";
                      ee.field_g[-1 + var4] = vk.field_d;
                      ni.field_a[-1 + var4] = 0;
                      ik.field_g[0] = 5;
                      break L0;
                    } else {
                      ee.field_g[var5] = ug.field_r[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  ni.field_a[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        bc.field_H.field_h = ik.field_g.length;
        var3 = 0;
        var4 = 114 / ((81 - param2) / 34);
        var5 = 0;
        L23: while (true) {
          if (var5 >= ee.field_g.length) {
            L24: {
              if (sh.field_a == 2) {
                var11 = ed.field_t;
                var6 = 0;
                L25: while (true) {
                  if (var11.length <= var6) {
                    var12 = qc.field_e;
                    var6 = 0;
                    L26: while (true) {
                      if (var12.length <= var6) {
                        break L24;
                      } else {
                        var14 = var12[var6];
                        var8 = ii.a(var14, false, 0);
                        if (var8 > var3) {
                          var3 = var8;
                          var6++;
                          continue L26;
                        } else {
                          var6++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var13 = var11[var6];
                    var8 = ii.a(var13, false, 0);
                    if (var8 > var3) {
                      var3 = var8;
                      var6++;
                      continue L25;
                    } else {
                      var6++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            me.field_v = -(var3 >> 160953409) + uh.field_D;
            gd.field_o = -(var3 >> 1846636033) + uh.field_D - -var3;
            ph.field_b = (oh.field_b + we.field_l << -1804445823) * bc.field_H.field_h;
            var5 = 0;
            L27: while (true) {
              if (var5 >= ee.field_g.length) {
                rf.field_c = ij.field_p - (ph.field_b >> -1073373023);
                wd.field_a = new int[ee.field_g.length][];
                var5 = 0;
                var6 = rf.field_c;
                L28: while (true) {
                  if (ee.field_g.length <= var5) {
                    L29: {
                      if ((sh.field_a ^ -1) == -3) {
                        bc.field_H.a(0, param1, -1, -1);
                        break L29;
                      } else {
                        bc.field_H.a(0, param1, rc.a(bk.field_b, 29532, sh.field_e), 0);
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var7 = ni.field_a[var5];
                    if ((var7 ^ -1) > -1) {
                      var6 = var6 + hc.field_fb;
                      var5++;
                      continue L28;
                    } else {
                      var8 = ii.a(ee.field_g[var5], true, 0);
                      var9 = -(var8 >> -449732159) + uh.field_D;
                      var6 = var6 + we.field_l;
                      wd.field_a[var5] = new int[4];
                      wd.field_a[var5][0] = -jh.field_e + var9;
                      wd.field_a[var5][1] = var6;
                      wd.field_a[var5][2] = (jh.field_e << 416478529) + var8;
                      var6 = var6 + (fb.field_g + we.field_l + (oh.field_b << 909045569));
                      wd.field_a[var5][3] = fb.field_g + (oh.field_b << -3921279);
                      var5++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_104_0 = ph.field_b;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_105_0 = stackOut_104_0;
                  if (ni.field_a[var5] < 0) {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = hc.field_fb;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    break L30;
                  } else {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = fb.field_g;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    break L30;
                  }
                }
                ph.field_b = stackIn_107_0 + stackIn_107_1;
                var5++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_84_0 = ee.field_g[var5];
              stackIn_86_0 = stackOut_84_0;
              stackIn_85_0 = stackOut_84_0;
              if (-1 < (ni.field_a[var5] ^ -1)) {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                break L31;
              } else {
                stackOut_85_0 = (String) (Object) stackIn_85_0;
                stackOut_85_1 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                break L31;
              }
            }
            var6 = ii.a(stackIn_87_0, stackIn_87_1 != 0, 0);
            if (var6 > var3) {
              var3 = var6;
              var5++;
              continue L23;
            } else {
              var5++;
              continue L23;
            }
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != 96) {
            field_w = null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Please try again in a few minutes.";
        field_t = " <times>?";
    }
}
