/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        try {
            if (!(!param2)) {
                ae.a(true, param3.field_j, param3.field_o + param0, param3.field_v, param1 - -param3.field_t);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "id.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_46_2 = null;
        String stackIn_87_0 = null;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              sh.field_a = param0;
              sc.field_e = true;
              if (sh.field_a == 0) {
                var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
                var4 = 3 - -var3_int;
                ni.field_a = new int[var4];
                ee.field_g = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    ik.field_g = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var3_int) {
                        ee.field_g[var4 + -3] = "";
                        ee.field_g[-2 + var4] = l.field_E;
                        ni.field_a[-2 + var4] = 0;
                        ik.field_g[0] = 4;
                        ee.field_g[var4 + -1] = vk.field_d;
                        ni.field_a[-1 + var4] = 1;
                        ik.field_g[1] = 5;
                        break L1;
                      } else {
                        ee.field_g[var5] = ug.field_r[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ni.field_a[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 != (sh.field_a ^ -1)) {
                  if (-3 != (sh.field_a ^ -1)) {
                    if (sh.field_a == 3) {
                      L4: {
                        if (jh.field_a.field_e) {
                          var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qb.field_m, nb.field_x);
                          break L4;
                        } else {
                          var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, lb.field_a, nb.field_x);
                          break L4;
                        }
                      }
                      var4 = var3_int + 2;
                      ni.field_a = new int[var4];
                      ee.field_g = new String[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var4) {
                          ik.field_g = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var5 >= var3_int) {
                              ee.field_g[-2 + var4] = "";
                              ee.field_g[-1 + var4] = vk.field_d;
                              ni.field_a[var4 - 1] = 0;
                              ik.field_g[0] = 5;
                              break L1;
                            } else {
                              ee.field_g[var5] = ug.field_r[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          ni.field_a[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if ((sh.field_a ^ -1) == -5) {
                        var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pj.field_B, nb.field_x);
                        var4 = var3_int + 2;
                        ni.field_a = new int[var4];
                        ee.field_g = new String[var4];
                        var5 = 0;
                        L7: while (true) {
                          if (var5 >= var4) {
                            ik.field_g = new int[1];
                            var5 = 0;
                            L8: while (true) {
                              if (var3_int <= var5) {
                                ee.field_g[-2 + var4] = "";
                                ee.field_g[var4 + -1] = vk.field_d;
                                ni.field_a[var4 - 1] = 0;
                                ik.field_g[0] = 5;
                                break L1;
                              } else {
                                ee.field_g[var5] = ug.field_r[var5];
                                var5++;
                                continue L8;
                              }
                            }
                          } else {
                            ni.field_a[var5] = -1;
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        if (sh.field_a != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, qj.field_db, nb.field_x);
                          var4 = 3 - -var3_int;
                          ni.field_a = new int[var4];
                          ee.field_g = new String[var4];
                          var5 = 0;
                          L9: while (true) {
                            if (var4 <= var5) {
                              ik.field_g = new int[2];
                              var5 = 0;
                              L10: while (true) {
                                if (var5 >= var3_int) {
                                  ee.field_g[-3 + var4] = "";
                                  ee.field_g[var4 + -2] = hl.field_p;
                                  ni.field_a[-2 + var4] = 0;
                                  ik.field_g[0] = 3;
                                  ee.field_g[var4 + -1] = vk.field_d;
                                  ni.field_a[-1 + var4] = 1;
                                  ik.field_g[1] = 5;
                                  break L1;
                                } else {
                                  ee.field_g[var5] = ug.field_r[var5];
                                  var5++;
                                  continue L10;
                                }
                              }
                            } else {
                              ni.field_a[var5] = -1;
                              var5++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, pl.field_a, false), nb.field_x);
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var5 >= var3_int) {
                          break L12;
                        } else {
                          if (!"<%0>".equals(ug.field_r[var5])) {
                            var5++;
                            continue L11;
                          } else {
                            var4 = var5;
                            break L12;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        ed.field_t = new String[var4];
                        o.a(ug.field_r, 0, ed.field_t, 0, var4);
                        qc.field_e = new String[-1 + (-var4 + var3_int)];
                        o.a(ug.field_r, 1 + var4, qc.field_e, 0, -1 + var3_int + -var4);
                        var4 = -1;
                        var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, da.a(new String[]{"<br><%0><br>"}, mg.field_z, false), nb.field_x);
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var5 >= var3_int) {
                              break L14;
                            } else {
                              if ("<%0>".equals(ug.field_r[var5])) {
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
                              hf.field_b = new String[var4];
                              o.a(ug.field_r, 0, hf.field_b, 0, var4);
                              nl.field_a = new String[-1 + (-var4 + var3_int)];
                              o.a(ug.field_r, 1 + var4, nl.field_a, 0, -1 + var3_int - var4);
                              if (ed.field_t.length >= hf.field_b.length) {
                                stackIn_29_0 = ed.field_t.length;
                                break L15;
                              } else {
                                stackIn_29_0 = hf.field_b.length;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_29_0;
                              if (qc.field_e.length >= nl.field_a.length) {
                                stackIn_32_0 = qc.field_e.length;
                                break L16;
                              } else {
                                stackIn_32_0 = nl.field_a.length;
                                break L16;
                              }
                            }
                            var6 = stackIn_32_0;
                            var7 = var6 + 7 - -var5;
                            ni.field_a = new int[var7];
                            ee.field_g = new String[var7];
                            var8 = 0;
                            L17: while (true) {
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
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    ee.field_g[6 - -var5] = null;
                                    ni.field_a[6 - -var5] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        ug.field_x = rf.c(0);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackIn_45_0 = ee.field_g;

                                          stackIn_45_1 = var5 + (7 - -var8);

                                          if (var8 >= nl.field_a.length) {
                                            stackIn_46_0 = (String[]) ((Object) stackIn_45_0);
                                            stackIn_46_1 = stackIn_45_1;
                                            stackIn_46_2 = "";
                                            break L20;
                                          } else {
                                            stackIn_46_0 = (String[]) ((Object) stackIn_45_0);
                                            stackIn_46_1 = stackIn_45_1;
                                            stackIn_46_2 = nl.field_a[var8];
                                            break L20;
                                          }
                                        }
                                        stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackIn_39_0 = ee.field_g;

                                      stackIn_39_1 = 6 + var8;

                                      if (-var5 + var8 - -hf.field_b.length < 0) {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = "";
                                        break L21;
                                      } else {
                                        stackIn_40_0 = (String[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = hf.field_b[var8 + (hf.field_b.length - var5)];
                                        break L21;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                ni.field_a[var8] = -1;
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
                  var3_int = cg.a(ug.field_r, pb.field_i, (byte) 91, pc.field_m, nb.field_x);
                  var4 = var3_int + 2;
                  ni.field_a = new int[var4];
                  ee.field_g = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var4) {
                      ik.field_g = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var3_int <= var5) {
                          ee.field_g[-2 + var4] = "";
                          ee.field_g[-1 + var4] = vk.field_d;
                          ni.field_a[-1 + var4] = 0;
                          ik.field_g[0] = 5;
                          break L1;
                        } else {
                          ee.field_g[var5] = ug.field_r[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      ni.field_a[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            bc.field_H.field_h = ik.field_g.length;
            var3_int = 0;
            var4 = 114 / ((81 - param2) / 34);
            var5 = 0;
            L24: while (true) {
              if (var5 >= ee.field_g.length) {
                L25: {
                  if (sh.field_a == 2) {
                    var11 = ed.field_t;
                    var5_ref_String__ = var11;
                    var6 = 0;
                    L26: while (true) {
                      if (var11.length <= var6) {
                        var5_ref_String__ = qc.field_e;
                        var6 = 0;
                        L27: while (true) {
                          if (var5_ref_String__.length <= var6) {
                            break L25;
                          } else {
                            var13 = var5_ref_String__[var6];
                            var8 = ii.a(var13, false, 0);
                            if (var8 > var3_int) {
                              var3_int = var8;
                              var6++;
                              continue L27;
                            } else {
                              var6++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var12 = var11[var6];
                        var8 = ii.a(var12, false, 0);
                        if (var8 > var3_int) {
                          var3_int = var8;
                          var6++;
                          continue L26;
                        } else {
                          var6++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                me.field_v = -(var3_int >> 160953409) + uh.field_D;
                gd.field_o = -(var3_int >> 1846636033) + uh.field_D - -var3_int;
                ph.field_b = (oh.field_b + we.field_l << -1804445823) * bc.field_H.field_h;
                var5 = 0;
                L28: while (true) {
                  if (var5 >= ee.field_g.length) {
                    rf.field_c = ij.field_p - (ph.field_b >> -1073373023);
                    wd.field_a = new int[ee.field_g.length][];
                    var5 = 0;
                    var6 = rf.field_c;
                    L29: while (true) {
                      if (ee.field_g.length <= var5) {
                        L30: {
                          if ((sh.field_a ^ -1) == -3) {
                            bc.field_H.a(0, param1, -1, -1);
                            break L30;
                          } else {
                            bc.field_H.a(0, param1, rc.a(bk.field_b, 29532, sh.field_e), 0);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
                          var7 = ni.field_a[var5];
                          if ((var7 ^ -1) > -1) {
                            var6 = var6 + hc.field_fb;
                            break L31;
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
                            break L31;
                          }
                        }
                        var5++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackIn_108_0 = ph.field_b;

                      if (ni.field_a[var5] < 0) {
                        stackIn_109_0 = stackIn_108_0;
                        stackIn_109_1 = hc.field_fb;
                        break L32;
                      } else {
                        stackIn_109_0 = stackIn_108_0;
                        stackIn_109_1 = fb.field_g;
                        break L32;
                      }
                    }
                    ph.field_b = stackIn_109_0 + stackIn_109_1;
                    var5++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackIn_87_0 = ee.field_g[var5];

                  if (-1 < (ni.field_a[var5] ^ -1)) {
                    stackIn_88_0 = (String) ((Object) stackIn_87_0);
                    stackIn_88_1 = 0;
                    break L33;
                  } else {
                    stackIn_88_0 = (String) ((Object) stackIn_87_0);
                    stackIn_88_1 = 1;
                    break L33;
                  }
                }
                L34: {
                  var6 = ii.a(stackIn_88_0, stackIn_88_1 != 0, 0);
                  if (var6 > var3_int) {
                    var3_int = var6;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                var5++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "id.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 96) {
            field_w = (oj[]) null;
        }
        field_t = null;
        field_u = null;
        field_w = null;
    }

    static {
        field_u = "Please try again in a few minutes.";
        field_t = " <times>?";
    }
}
