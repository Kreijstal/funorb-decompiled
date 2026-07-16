/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qc {
    static boolean field_b;
    static boolean field_a;
    private pb[] field_c;

    final static int a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = stellarshard.field_B;
        sl.field_b = sl.field_b + 65536;
        L0: while (true) {
          if (65536 > wi.a(sl.field_b, (byte) 98, cj.field_d)) {
            if (param0 <= -110) {
              L1: {
                var2 = -1;
                if (null != ed.field_a) {
                  var2 = ed.field_a.length;
                  break L1;
                } else {
                  if (null != dl.field_C) {
                    var2 = dl.field_C.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var2 == -1) {
                  break L2;
                } else {
                  L3: {
                    if (ha.field_w < cj.field_a) {
                      L4: {
                        ha.field_w = ha.field_w + 1;
                        if (cj.field_c >= ha.field_w) {
                          break L4;
                        } else {
                          L5: {
                            if (ed.field_a == null) {
                              break L5;
                            } else {
                              if (null != ed.field_a[nk.field_c]) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ha.field_w = ha.field_w - 1;
                          break L3;
                        }
                      }
                      if (ha.field_w < cj.field_a) {
                        break L3;
                      } else {
                        if (ed.field_a[(1 + nk.field_c) % var2] == null) {
                          ha.field_w = ha.field_w - 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (cj.field_a <= ha.field_w) {
                      L7: {
                        tc.field_w = nk.field_c;
                        if (nj.field_g) {
                          nk.field_c = nk.field_c + 1;
                          if (var2 > nk.field_c) {
                            break L7;
                          } else {
                            nk.field_c = nk.field_c - var2;
                            break L7;
                          }
                        } else {
                          nk.field_c = nk.field_c - 1;
                          if (nk.field_c < 0) {
                            nk.field_c = nk.field_c + var2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ha.field_w = ha.field_w - cj.field_a;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (ha.field_w <= cj.field_c) {
                    break L2;
                  } else {
                    nj.field_g = true;
                    break L2;
                  }
                }
              }
              L8: {
                if (ea.field_l != null) {
                  L9: {
                    var3 = -(ea.field_l.field_x / 2) + 357;
                    var4 = 0;
                    if (0 == gh.field_c) {
                      break L9;
                    } else {
                      if (var3 >= oc.field_e) {
                        break L9;
                      } else {
                        if (oc.field_e >= ea.field_l.field_y + var3) {
                          break L9;
                        } else {
                          L10: {
                            if (-ea.field_l.field_v + 269 >= di.field_b) {
                              break L10;
                            } else {
                              if (269 <= di.field_b) {
                                break L10;
                              } else {
                                nj.field_g = false;
                                var4 = 1;
                                ha.field_w = cj.field_a;
                                break L10;
                              }
                            }
                          }
                          if ((di.field_b ^ -1) >= -587) {
                            break L9;
                          } else {
                            if (di.field_b < ea.field_l.field_v + 586) {
                              var4 = 1;
                              ha.field_w = cj.field_a;
                              nj.field_g = true;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L8;
                  } else {
                    if (ha.field_w <= cj.field_c) {
                      break L8;
                    } else {
                      if (eb.field_a <= var3) {
                        break L8;
                      } else {
                        if (ea.field_l.field_y + var3 > eb.field_a) {
                          L11: {
                            if (ni.field_e <= 269 - ea.field_l.field_v) {
                              break L11;
                            } else {
                              if ((ni.field_e ^ -1) > -270) {
                                ha.field_w = cj.field_c;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (ni.field_e <= 586) {
                            break L8;
                          } else {
                            if (586 - -ea.field_l.field_v > ni.field_e) {
                              ha.field_w = cj.field_c;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (param1) {
                L12: {
                  cd.field_L.a(af.a(1, ni.field_e, eb.field_a), af.a(1, di.field_b, oc.field_e), -1);
                  if (!cd.field_L.c(-18)) {
                    break L12;
                  } else {
                    if (0 != cd.field_L.field_f) {
                      if (-2 == (cd.field_L.field_f ^ -1)) {
                        return 2;
                      } else {
                        break L12;
                      }
                    } else {
                      return 3;
                    }
                  }
                }
                L13: while (true) {
                  if (!qh.c(107)) {
                    return 0;
                  } else {
                    L14: {
                      cd.field_L.a(0, 84);
                      if (!cd.field_L.c(-10)) {
                        break L14;
                      } else {
                        if (-1 == cd.field_L.field_f) {
                          return 3;
                        } else {
                          if (-2 == cd.field_L.field_f) {
                            return 1;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (-14 != (gi.field_f ^ -1)) {
                      continue L13;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                return 0;
              }
            } else {
              return -72;
            }
          } else {
            gj.field_v = gj.field_v + 1;
            sl.field_b = sl.field_b - cj.field_d;
            continue L0;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
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
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        String[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        String[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String stackIn_60_2 = null;
        String[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        String[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_66_2 = null;
        int stackIn_85_0 = 0;
        String stackIn_85_1 = null;
        int stackIn_86_0 = 0;
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        String[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_65_2 = null;
        String[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        String stackOut_64_2 = null;
        String[] stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String stackOut_59_2 = null;
        String[] stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        String stackOut_58_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_84_0 = 0;
        String stackOut_84_1 = null;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        L0: {
          var9 = stellarshard.field_B;
          qh.field_g = true;
          rb.field_s = param0;
          if ((rb.field_s ^ -1) == -1) {
            var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
            var4 = 3 + var3;
            sj.field_J = new int[var4];
            stellarshard.field_L = new String[var4];
            var5 = 0;
            L1: while (true) {
              if ((var5 ^ -1) <= (var4 ^ -1)) {
                pk.field_j = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    stellarshard.field_L[-3 + var4] = "";
                    stellarshard.field_L[-2 + var4] = kk.field_l;
                    sj.field_J[-2 + var4] = 0;
                    pk.field_j[0] = 4;
                    stellarshard.field_L[-1 + var4] = td.field_a;
                    sj.field_J[var4 + -1] = 1;
                    pk.field_j[1] = 5;
                    break L0;
                  } else {
                    stellarshard.field_L[var5] = hc.field_m[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                sj.field_J[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (-2 == (rb.field_s ^ -1)) {
              var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ii.field_G);
              var4 = 2 - -var3;
              stellarshard.field_L = new String[var4];
              sj.field_J = new int[var4];
              var5 = 0;
              L3: while (true) {
                if ((var4 ^ -1) >= (var5 ^ -1)) {
                  pk.field_j = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if ((var5 ^ -1) <= (var3 ^ -1)) {
                      stellarshard.field_L[-2 + var4] = "";
                      stellarshard.field_L[var4 - 1] = td.field_a;
                      sj.field_J[var4 + -1] = 0;
                      pk.field_j[0] = 5;
                      break L0;
                    } else {
                      stellarshard.field_L[var5] = hc.field_m[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  sj.field_J[var5] = -1;
                  var5++;
                  continue L3;
                }
              }
            } else {
              if ((rb.field_s ^ -1) == -3) {
                var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(le.field_q, 0, new String[1]));
                var4 = -1;
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3) {
                      break L6;
                    } else {
                      if (!"<%0>".equals((Object) (Object) hc.field_m[var5])) {
                        var5++;
                        continue L5;
                      } else {
                        var4 = var5;
                        break L6;
                      }
                    }
                  }
                  if ((var4 ^ -1) != 0) {
                    pd.field_g = new String[var4];
                    ri.a((Object[]) (Object) hc.field_m, 0, (Object[]) (Object) pd.field_g, 0, var4);
                    fb.field_e = new String[-var4 + (var3 + -1)];
                    ri.a((Object[]) (Object) hc.field_m, var4 - -1, (Object[]) (Object) fb.field_e, 0, var3 + (-var4 + -1));
                    var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, h.a(dl.field_K, 0, new String[1]));
                    var4 = -1;
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var3 ^ -1) >= (var5 ^ -1)) {
                          break L8;
                        } else {
                          if ("<%0>".equals((Object) (Object) hc.field_m[var5])) {
                            var4 = var5;
                            break L8;
                          } else {
                            var5++;
                            continue L7;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        L9: {
                          bb.field_k = new String[var4];
                          ri.a((Object[]) (Object) hc.field_m, 0, (Object[]) (Object) bb.field_k, 0, var4);
                          o.field_g = new String[-var4 + (var3 + -1)];
                          ri.a((Object[]) (Object) hc.field_m, 1 + var4, (Object[]) (Object) o.field_g, 0, -var4 + (var3 + -1));
                          if (pd.field_g.length < bb.field_k.length) {
                            stackOut_48_0 = bb.field_k.length;
                            stackIn_49_0 = stackOut_48_0;
                            break L9;
                          } else {
                            stackOut_47_0 = pd.field_g.length;
                            stackIn_49_0 = stackOut_47_0;
                            break L9;
                          }
                        }
                        L10: {
                          var5 = stackIn_49_0;
                          if (o.field_g.length <= fb.field_e.length) {
                            stackOut_51_0 = fb.field_e.length;
                            stackIn_52_0 = stackOut_51_0;
                            break L10;
                          } else {
                            stackOut_50_0 = o.field_g.length;
                            stackIn_52_0 = stackOut_50_0;
                            break L10;
                          }
                        }
                        var6 = stackIn_52_0;
                        var7 = var5 + 7 + var6;
                        sj.field_J = new int[var7];
                        stellarshard.field_L = new String[var7];
                        var8 = 0;
                        L11: while (true) {
                          if ((var7 ^ -1) >= (var8 ^ -1)) {
                            sj.field_J[1] = 0;
                            stellarshard.field_L[1] = am.field_b;
                            pk.field_j = new int[2];
                            stellarshard.field_L[0] = oa.field_B;
                            pk.field_j[0] = 5;
                            pk.field_j[1] = 2;
                            sj.field_J[3] = 1;
                            stellarshard.field_L[2] = vl.field_i;
                            stellarshard.field_L[5] = "";
                            stellarshard.field_L[4] = tk.field_a;
                            stellarshard.field_L[3] = wf.field_c;
                            var8 = 0;
                            L12: while (true) {
                              if ((var5 ^ -1) >= (var8 ^ -1)) {
                                stellarshard.field_L[6 - -var5] = null;
                                sj.field_J[6 + var5] = -2;
                                var8 = 0;
                                L13: while (true) {
                                  if (var6 <= var8) {
                                    jj.field_p = ih.a((byte) -98);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_63_0 = stellarshard.field_L;
                                      stackOut_63_1 = var8 + (7 - -var5);
                                      stackIn_65_0 = stackOut_63_0;
                                      stackIn_65_1 = stackOut_63_1;
                                      stackIn_64_0 = stackOut_63_0;
                                      stackIn_64_1 = stackOut_63_1;
                                      if ((var8 ^ -1) <= (o.field_g.length ^ -1)) {
                                        stackOut_65_0 = (String[]) (Object) stackIn_65_0;
                                        stackOut_65_1 = stackIn_65_1;
                                        stackOut_65_2 = "";
                                        stackIn_66_0 = stackOut_65_0;
                                        stackIn_66_1 = stackOut_65_1;
                                        stackIn_66_2 = stackOut_65_2;
                                        break L14;
                                      } else {
                                        stackOut_64_0 = (String[]) (Object) stackIn_64_0;
                                        stackOut_64_1 = stackIn_64_1;
                                        stackOut_64_2 = o.field_g[var8];
                                        stackIn_66_0 = stackOut_64_0;
                                        stackIn_66_1 = stackOut_64_1;
                                        stackIn_66_2 = stackOut_64_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_57_0 = stellarshard.field_L;
                                  stackOut_57_1 = var8 + 6;
                                  stackIn_59_0 = stackOut_57_0;
                                  stackIn_59_1 = stackOut_57_1;
                                  stackIn_58_0 = stackOut_57_0;
                                  stackIn_58_1 = stackOut_57_1;
                                  if (-var5 + (bb.field_k.length + var8) >= 0) {
                                    stackOut_59_0 = (String[]) (Object) stackIn_59_0;
                                    stackOut_59_1 = stackIn_59_1;
                                    stackOut_59_2 = bb.field_k[-var5 + bb.field_k.length + var8];
                                    stackIn_60_0 = stackOut_59_0;
                                    stackIn_60_1 = stackOut_59_1;
                                    stackIn_60_2 = stackOut_59_2;
                                    break L15;
                                  } else {
                                    stackOut_58_0 = (String[]) (Object) stackIn_58_0;
                                    stackOut_58_1 = stackIn_58_1;
                                    stackOut_58_2 = "";
                                    stackIn_60_0 = stackOut_58_0;
                                    stackIn_60_1 = stackOut_58_1;
                                    stackIn_60_2 = stackOut_58_2;
                                    break L15;
                                  }
                                }
                                stackIn_60_0[stackIn_60_1] = stackIn_60_2;
                                var8++;
                                continue L12;
                              }
                            }
                          } else {
                            sj.field_J[var8] = -1;
                            var8++;
                            continue L11;
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
              } else {
                if (rb.field_s != 3) {
                  if ((rb.field_s ^ -1) != -5) {
                    if ((rb.field_s ^ -1) != -6) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, df.field_k);
                      var4 = var3 + 3;
                      stellarshard.field_L = new String[var4];
                      sj.field_J = new int[var4];
                      var5 = 0;
                      L16: while (true) {
                        if ((var5 ^ -1) <= (var4 ^ -1)) {
                          pk.field_j = new int[2];
                          var5 = 0;
                          L17: while (true) {
                            if ((var5 ^ -1) <= (var3 ^ -1)) {
                              stellarshard.field_L[var4 + -3] = "";
                              stellarshard.field_L[var4 + -2] = ha.field_v;
                              sj.field_J[var4 - 2] = 0;
                              pk.field_j[0] = 3;
                              stellarshard.field_L[var4 + -1] = td.field_a;
                              sj.field_J[-1 + var4] = 1;
                              pk.field_j[1] = 5;
                              break L0;
                            } else {
                              stellarshard.field_L[var5] = hc.field_m[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          sj.field_J[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, wh.field_d);
                    var4 = var3 + 2;
                    sj.field_J = new int[var4];
                    stellarshard.field_L = new String[var4];
                    var5 = 0;
                    L18: while (true) {
                      if (var5 >= var4) {
                        pk.field_j = new int[1];
                        var5 = 0;
                        L19: while (true) {
                          if ((var3 ^ -1) >= (var5 ^ -1)) {
                            stellarshard.field_L[var4 - 2] = "";
                            stellarshard.field_L[var4 + -1] = td.field_a;
                            sj.field_J[-1 + var4] = 0;
                            pk.field_j[0] = 5;
                            break L0;
                          } else {
                            stellarshard.field_L[var5] = hc.field_m[var5];
                            var5++;
                            continue L19;
                          }
                        }
                      } else {
                        sj.field_J[var5] = -1;
                        var5++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L20: {
                    if (ic.field_d.field_p) {
                      var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ei.field_E);
                      break L20;
                    } else {
                      var3 = nj.a(gg.field_d, pe.field_c, hc.field_m, (byte) -128, ld.field_D);
                      break L20;
                    }
                  }
                  var4 = var3 + 2;
                  stellarshard.field_L = new String[var4];
                  sj.field_J = new int[var4];
                  var5 = 0;
                  L21: while (true) {
                    if (var4 <= var5) {
                      pk.field_j = new int[1];
                      var5 = 0;
                      L22: while (true) {
                        if ((var5 ^ -1) <= (var3 ^ -1)) {
                          stellarshard.field_L[var4 + -2] = "";
                          stellarshard.field_L[-1 + var4] = td.field_a;
                          sj.field_J[var4 + -1] = 0;
                          pk.field_j[0] = 5;
                          break L0;
                        } else {
                          stellarshard.field_L[var5] = hc.field_m[var5];
                          var5++;
                          continue L22;
                        }
                      }
                    } else {
                      sj.field_J[var5] = -1;
                      var5++;
                      continue L21;
                    }
                  }
                }
              }
            }
          }
        }
        ua.field_i.field_i = pk.field_j.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (var4 >= stellarshard.field_L.length) {
            L24: {
              if (2 != rb.field_s) {
                break L24;
              } else {
                var10 = pd.field_g;
                var5 = 0;
                L25: while (true) {
                  if ((var5 ^ -1) <= (var10.length ^ -1)) {
                    var11 = fb.field_e;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = qe.a((byte) -40, var13, false);
                          if (var7 > var3) {
                            var3 = var7;
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
                      var7 = qe.a((byte) -33, var12, false);
                      if (var7 > var3) {
                        var3 = var7;
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
            dd.field_e = s.field_b - -var3 + -(var3 >> 1376987009);
            od.field_r = -(var3 >> 1007842369) + s.field_b;
            fl.field_a = ua.field_i.field_i * (nh.field_h + nh.field_f << -1047165823);
            var4 = 0;
            L29: while (true) {
              if ((var4 ^ -1) <= (stellarshard.field_L.length ^ -1)) {
                rg.field_F = -(fl.field_a >> -1909383359) + eh.field_g;
                vl.field_o = new int[stellarshard.field_L.length][];
                var4 = param2;
                var5 = rg.field_F;
                L30: while (true) {
                  if (var4 >= stellarshard.field_L.length) {
                    L31: {
                      if (rb.field_s != 2) {
                        ua.field_i.a(eb.a(eb.field_a, ni.field_e, -112), 0, param1, false);
                        break L31;
                      } else {
                        ua.field_i.a(-1, -1, param1, false);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = sj.field_J[var4];
                      if (-1 >= (var6 ^ -1)) {
                        var7 = qe.a((byte) -21, stellarshard.field_L[var4], true);
                        var5 = var5 + nh.field_f;
                        var8 = s.field_b - (var7 >> 649888929);
                        vl.field_o[var4] = new int[4];
                        vl.field_o[var4][0] = var8 - le.field_k;
                        vl.field_o[var4][1] = var5;
                        vl.field_o[var4][2] = var7 - -(le.field_k << -1219928895);
                        vl.field_o[var4][3] = na.field_a - -(nh.field_h << 2147056673);
                        var5 = var5 + (nh.field_f + ((nh.field_h << -2038768511) - -na.field_a));
                        break L32;
                      } else {
                        var5 = var5 + l.field_e;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_105_0 = fl.field_a;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (sj.field_J[var4] >= 0) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = na.field_a;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L33;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = l.field_e;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L33;
                  }
                }
                fl.field_a = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              stackOut_84_0 = -39;
              stackOut_84_1 = stellarshard.field_L[var4];
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              if (sj.field_J[var4] < 0) {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = (String) (Object) stackIn_86_1;
                stackOut_86_2 = 0;
                stackIn_87_0 = stackOut_86_0;
                stackIn_87_1 = stackOut_86_1;
                stackIn_87_2 = stackOut_86_2;
                break L34;
              } else {
                stackOut_85_0 = stackIn_85_0;
                stackOut_85_1 = (String) (Object) stackIn_85_1;
                stackOut_85_2 = 1;
                stackIn_87_0 = stackOut_85_0;
                stackIn_87_1 = stackOut_85_1;
                stackIn_87_2 = stackOut_85_2;
                break L34;
              }
            }
            L35: {
              var5 = qe.a((byte) stackIn_87_0, stackIn_87_1, stackIn_87_2 != 0);
              if (var5 <= var3) {
                break L35;
              } else {
                var3 = var5;
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
            field_b = false;
        }
        ed.a(-6313, param4, param3, ((qc) this).field_c, param1, param2);
    }

    final static int a(int param0) {
        if (param0 != 1) {
            field_a = true;
        }
        return gj.field_t;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == -1750942672) {
            break L0;
          } else {
            field_a = true;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    qc(pb[] param0) {
        ((qc) this).field_c = param0;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, byte param12, int param13, int param14, int param15, int param16) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var42 = 0;
        var42 = stellarshard.field_B;
        if (param7 < 0) {
          return;
        } else {
          if (cc.field_c > param9) {
            L0: {
              if (param5 >= 0) {
                break L0;
              } else {
                if (param16 >= 0) {
                  break L0;
                } else {
                  if (param0 < 0) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (param5 < cc.field_m) {
                break L1;
              } else {
                if (param16 < cc.field_m) {
                  break L1;
                } else {
                  if (param0 >= cc.field_m) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param12 == 127) {
                break L2;
              } else {
                field_a = false;
                break L2;
              }
            }
            L3: {
              L4: {
                var34 = param7 - param9;
                if (param9 != param10) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if (param9 == param7) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var35 = -param10 + param7;
                            if (param16 <= param5) {
                              break L8;
                            } else {
                              var26 = param14 << -2106991408;
                              var29 = param15 << -237426608;
                              var27 = (-param11 + param6 << 406224272) / var34;
                              var23 = (param4 - param13 << -473814064) / var34;
                              var21 = param13 << 848199536;
                              var20 = (-param16 + param0 << 317707536) / var35;
                              var28 = (-param14 + param6 << -572736656) / var35;
                              var19 = (-param5 + param0 << 789735696) / var34;
                              var30 = param3 << 586566864;
                              var18 = param16 << -293581360;
                              var17 = param5 << -2118830672;
                              var22 = param8 << -1492632784;
                              var31 = (-param15 + param1 << -364333648) / var34;
                              var32 = (param1 + -param3 << 785398960) / var35;
                              var25 = param11 << 1787870576;
                              var24 = (-param8 + param4 << -1649838128) / var35;
                              if (0 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var25 = param14 << 29579632;
                          var27 = (param6 - param14 << -119128560) / var35;
                          var30 = param15 << 2116339216;
                          var20 = (param0 - param5 << -471082992) / var34;
                          var31 = (param1 + -param3 << -285502416) / var35;
                          var18 = param5 << 550808752;
                          var29 = param3 << -1279118768;
                          var23 = (param4 - param8 << 49015088) / var35;
                          var28 = (param6 - param11 << 552673584) / var34;
                          var19 = (-param16 + param0 << 1557465232) / var35;
                          var17 = param16 << -521508656;
                          var32 = (-param15 + param1 << -375397616) / var34;
                          var22 = param13 << 1577431312;
                          var21 = param8 << 1198180528;
                          var24 = (param4 - param13 << -1690789424) / var34;
                          var26 = param11 << -1487466896;
                          break L7;
                        }
                        if (0 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var25 = param11;
                    var28 = 0;
                    var24 = 0;
                    var20 = 0;
                    var27 = 0;
                    var18 = param16 << 686300048;
                    var17 = param5 << 1155782288;
                    var31 = 0;
                    var30 = param3;
                    var19 = 0;
                    var32 = 0;
                    var23 = 0;
                    var22 = param8;
                    var29 = param15;
                    var21 = param13;
                    var26 = param14;
                    break L5;
                  }
                  var33 = 0;
                  if (param9 >= 0) {
                    break L3;
                  } else {
                    param9 = Math.min(-param9, param10 + -param9);
                    var25 = var25 + var27 * param9;
                    var30 = var30 + param9 * var32;
                    var17 = var17 + param9 * var19;
                    var22 = var22 + var24 * param9;
                    var21 = var21 + param9 * var23;
                    var29 = var29 + var31 * param9;
                    var18 = var18 + param9 * var20;
                    var26 = var26 + param9 * var28;
                    param9 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L9: {
                L10: {
                  var18 = param5 << -115094736;
                  var17 = param5 << -115094736;
                  var26 = param11 << -966312176;
                  var25 = param11 << -966312176;
                  var22 = param13 << 1547614320;
                  var21 = param13 << 1547614320;
                  var30 = param15 << -201912944;
                  var29 = param15 << -201912944;
                  var35 = param10 - param9;
                  var20 = (-param5 + param0 << -94475920) / var34;
                  var19 = (param16 + -param5 << 1429641040) / var35;
                  if (var19 < var20) {
                    break L10;
                  } else {
                    var24 = (-param13 + param8 << -1529493808) / var35;
                    var32 = (-param15 + param3 << 2020555312) / var35;
                    var28 = (param14 - param11 << -917602448) / var35;
                    var31 = (-param15 + param1 << 423936784) / var34;
                    var27 = (-param11 + param6 << 1362168464) / var34;
                    var36 = var19;
                    var19 = var20;
                    var20 = var36;
                    var23 = (-param13 + param4 << 490510224) / var34;
                    var33 = 1;
                    if (0 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var27 = (param14 + -param11 << -755541680) / var35;
                var33 = 0;
                var23 = (param8 - param13 << -475864976) / var35;
                var31 = (param3 - param15 << 465507504) / var35;
                var32 = (-param15 + param1 << 896768272) / var34;
                var28 = (param6 + -param11 << -627476624) / var34;
                var24 = (param4 + -param13 << 923490864) / var34;
                break L9;
              }
              L11: {
                L12: {
                  if (param9 < 0) {
                    L13: {
                      if (param10 < 0) {
                        break L13;
                      } else {
                        param9 = -param9;
                        var25 = var25 + var27 * param9;
                        var17 = var17 + param9 * var19;
                        var18 = var18 + param9 * var20;
                        var22 = var22 + var24 * param9;
                        var29 = var29 + param9 * var31;
                        var26 = var26 + param9 * var28;
                        var30 = var30 + var32 * param9;
                        var21 = var21 + param9 * var23;
                        param9 = 0;
                        if (0 == 0) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    param9 = -param9 + param10;
                    var29 = var29 + var31 * param9;
                    var22 = var22 + param9 * var24;
                    var25 = var25 + var27 * param9;
                    var21 = var21 + var23 * param9;
                    var18 = var18 + param9 * var20;
                    var30 = var30 + var32 * param9;
                    var26 = var26 + param9 * var28;
                    var17 = var17 + param9 * var19;
                    param9 = param10;
                    if (0 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                var36 = cc.field_i[param9];
                L14: while (true) {
                  if (param10 <= param9) {
                    break L11;
                  } else {
                    L15: {
                      var37 = var17 >> -2075844688;
                      if ((cc.field_m ^ -1) < (var37 ^ -1)) {
                        var38 = (var18 >> -838533584) + -(var17 >> -92806160);
                        if (var38 == 0) {
                          if (var37 < 0) {
                            break L15;
                          } else {
                            if (var37 >= cc.field_m) {
                              break L15;
                            } else {
                              vk.a(var25, 0, var29, 0, param2, (byte) 96, var36 + var37, var21, var38, 0);
                              break L15;
                            }
                          }
                        } else {
                          if (var37 < 0) {
                            break L15;
                          } else {
                            if (var37 >= cc.field_m) {
                              break L15;
                            } else {
                              vk.a(var25, 0, var29, 0, param2, (byte) 96, var36 + var37, var21, var38, 0);
                              break L15;
                            }
                          }
                        }
                      } else {
                        break L15;
                      }
                    }
                    param9++;
                    if (cc.field_c <= param9) {
                      return;
                    } else {
                      var22 = var22 + var24;
                      var17 = var17 + var19;
                      var25 = var25 + var27;
                      var26 = var26 + var28;
                      var29 = var29 + var31;
                      var36 = var36 + ti.field_i;
                      var30 = var30 + var32;
                      var18 = var18 + var20;
                      var21 = var21 + var23;
                      if (0 == 0) {
                        continue L14;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
              }
              L16: {
                var36 = -param10 + param7;
                if (var36 == 0) {
                  break L16;
                } else {
                  L17: {
                    L18: {
                      var37 = param0 << 1199163536;
                      var38 = param4 << -1998707632;
                      var39 = param6 << -331900112;
                      if (var33 == 0) {
                        break L18;
                      } else {
                        var22 = param8 << 1111685712;
                        var30 = param3 << 2118641008;
                        var18 = param16 << -1825383408;
                        var26 = param14 << 1480885040;
                        if (0 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var17 = param16 << -1940582064;
                    var29 = param3 << 1295057008;
                    var21 = param8 << -1345078800;
                    var25 = param14 << -1750942672;
                    break L17;
                  }
                  var40 = param1 << -1358049712;
                  var31 = (var40 + -var29) / var36;
                  var23 = (-var21 + var38) / var36;
                  var24 = (-var22 + var38) / var36;
                  var20 = (var37 - var18) / var36;
                  var27 = (-var25 + var39) / var36;
                  var28 = (-var26 + var39) / var36;
                  var32 = (var40 - var30) / var36;
                  var19 = (-var17 + var37) / var36;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L16;
                  }
                }
              }
              var23 = 0;
              var28 = 0;
              var31 = 0;
              var24 = 0;
              var32 = 0;
              var20 = 0;
              var27 = 0;
              var19 = 0;
              break L3;
            }
            L19: {
              if (0 > param9) {
                param9 = -param9;
                var21 = var21 + param9 * var23;
                var25 = var25 + param9 * var27;
                var26 = var26 + param9 * var28;
                var22 = var22 + var24 * param9;
                var17 = var17 + var19 * param9;
                var29 = var29 + var31 * param9;
                var18 = var18 + var20 * param9;
                var30 = var30 + param9 * var32;
                param9 = 0;
                break L19;
              } else {
                break L19;
              }
            }
            var35 = cc.field_i[param9];
            L20: while (true) {
              L21: {
                if (param7 <= param9) {
                  break L21;
                } else {
                  L22: {
                    var36 = var17 >> 167021616;
                    if (var36 >= cc.field_m) {
                      break L22;
                    } else {
                      L23: {
                        var37 = (var18 >> -191974224) + -(var17 >> 182121744);
                        if (var37 != 0) {
                          break L23;
                        } else {
                          if (var36 < 0) {
                            break L22;
                          } else {
                            if (cc.field_m <= var36) {
                              break L22;
                            } else {
                              vk.a(var25, 0, var29, 0, param2, (byte) 94, var36 - -var35, var21, var37, 0);
                              if (0 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                      L24: {
                        var38 = (var22 + -var21) / var37;
                        var39 = (-var25 + var26) / var37;
                        var40 = (var30 - var29) / var37;
                        if (cc.field_m > var37 + var36) {
                          break L24;
                        } else {
                          var37 = -var36 + (cc.field_m - 1);
                          break L24;
                        }
                      }
                      L25: {
                        if (var36 < 0) {
                          break L25;
                        } else {
                          vk.a(var25, var40, var29, var39, param2, (byte) 77, var35 + var36, var21, var37, var38);
                          if (0 == 0) {
                            break L22;
                          } else {
                            break L25;
                          }
                        }
                      }
                      vk.a(var25 - var39 * var36, var40, -(var40 * var36) + var29, var39, param2, (byte) 92, var35, -(var38 * var36) + var21, var37 - -var36, var38);
                      break L22;
                    }
                  }
                  param9++;
                  if (param9 < cc.field_c) {
                    var26 = var26 + var28;
                    var21 = var21 + var23;
                    var30 = var30 + var32;
                    var18 = var18 + var20;
                    var35 = var35 + ti.field_i;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var17 = var17 + var19;
                    var29 = var29 + var31;
                    if (0 == 0) {
                      continue L20;
                    } else {
                      break L21;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = false;
    }
}
