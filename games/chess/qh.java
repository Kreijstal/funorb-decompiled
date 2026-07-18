/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qh {
    static eb field_b;
    static int[] field_e;
    static String field_d;
    static wm field_c;
    static int field_g;
    private int[] field_f;
    static int field_a;

    public static void a() {
        field_e = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
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
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String stackIn_82_2 = null;
        int stackIn_91_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String stackOut_75_2 = null;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        L0: {
          var9 = Chess.field_G;
          kb.field_S = true;
          gm.field_f = param2;
          if (gm.field_f != 0) {
            if (gm.field_f != 1) {
              if (gm.field_f == 2) {
                var3_int = vm.a(oc.a(i.field_a, new String[1], (byte) -110), -9224, vj.field_d, n.field_d, mk.field_a);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3_int) {
                      break L2;
                    } else {
                      if (!"<%0>".equals((Object) (Object) n.field_d[var5])) {
                        var5++;
                        continue L1;
                      } else {
                        var4 = var5;
                        break L2;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    ik.field_a = new String[var4];
                    ne.a((Object[]) (Object) n.field_d, 0, (Object[]) (Object) ik.field_a, 0, var4);
                    tj.field_p = new String[-var4 + (var3_int - 1)];
                    ne.a((Object[]) (Object) n.field_d, 1 + var4, (Object[]) (Object) tj.field_p, 0, var3_int + -var4 + -1);
                    var4 = -1;
                    var3_int = vm.a(oc.a(tb.field_e, new String[1], (byte) -105), -9224, vj.field_d, n.field_d, mk.field_a);
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3_int) {
                          break L4;
                        } else {
                          if ("<%0>".equals((Object) (Object) n.field_d[var5])) {
                            var4 = var5;
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          hj.field_l = new String[var4];
                          ne.a((Object[]) (Object) n.field_d, 0, (Object[]) (Object) hj.field_l, 0, var4);
                          em.field_m = new String[-1 + -var4 + var3_int];
                          ne.a((Object[]) (Object) n.field_d, 1 + var4, (Object[]) (Object) em.field_m, 0, -1 + (-var4 + var3_int));
                          if (hj.field_l.length > ik.field_a.length) {
                            stackOut_64_0 = hj.field_l.length;
                            stackIn_65_0 = stackOut_64_0;
                            break L5;
                          } else {
                            stackOut_63_0 = ik.field_a.length;
                            stackIn_65_0 = stackOut_63_0;
                            break L5;
                          }
                        }
                        L6: {
                          var5 = stackIn_65_0;
                          if (em.field_m.length > tj.field_p.length) {
                            stackOut_67_0 = em.field_m.length;
                            stackIn_68_0 = stackOut_67_0;
                            break L6;
                          } else {
                            stackOut_66_0 = tj.field_p.length;
                            stackIn_68_0 = stackOut_66_0;
                            break L6;
                          }
                        }
                        var6 = stackIn_68_0;
                        var7 = var5 + 7 + var6;
                        ka.field_g = new String[var7];
                        cb.field_k = new int[var7];
                        var8 = 0;
                        L7: while (true) {
                          if (var7 <= var8) {
                            ka.field_g[1] = rf.field_a;
                            fi.field_c = new int[2];
                            ka.field_g[0] = sj.field_a;
                            cb.field_k[1] = 0;
                            cb.field_k[3] = 1;
                            ka.field_g[2] = rd.field_b;
                            ka.field_g[4] = bb.field_a;
                            fi.field_c[1] = 2;
                            ka.field_g[3] = ag.field_b;
                            fi.field_c[0] = 5;
                            ka.field_g[5] = "";
                            var8 = 0;
                            L8: while (true) {
                              if (var5 <= var8) {
                                ka.field_g[var5 + 6] = null;
                                cb.field_k[6 + var5] = -2;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var6) {
                                    jg.field_M = ud.a(2);
                                    break L0;
                                  } else {
                                    L10: {
                                      stackOut_79_0 = ka.field_g;
                                      stackOut_79_1 = var8 + 7 + var5;
                                      stackIn_81_0 = stackOut_79_0;
                                      stackIn_81_1 = stackOut_79_1;
                                      stackIn_80_0 = stackOut_79_0;
                                      stackIn_80_1 = stackOut_79_1;
                                      if (em.field_m.length <= var8) {
                                        stackOut_81_0 = (String[]) (Object) stackIn_81_0;
                                        stackOut_81_1 = stackIn_81_1;
                                        stackOut_81_2 = "";
                                        stackIn_82_0 = stackOut_81_0;
                                        stackIn_82_1 = stackOut_81_1;
                                        stackIn_82_2 = stackOut_81_2;
                                        break L10;
                                      } else {
                                        stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = em.field_m[var8];
                                        stackIn_82_0 = stackOut_80_0;
                                        stackIn_82_1 = stackOut_80_1;
                                        stackIn_82_2 = stackOut_80_2;
                                        break L10;
                                      }
                                    }
                                    stackIn_82_0[stackIn_82_1] = stackIn_82_2;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              } else {
                                L11: {
                                  stackOut_73_0 = ka.field_g;
                                  stackOut_73_1 = var8 + 6;
                                  stackIn_75_0 = stackOut_73_0;
                                  stackIn_75_1 = stackOut_73_1;
                                  stackIn_74_0 = stackOut_73_0;
                                  stackIn_74_1 = stackOut_73_1;
                                  if (0 > -var5 + hj.field_l.length + var8) {
                                    stackOut_75_0 = (String[]) (Object) stackIn_75_0;
                                    stackOut_75_1 = stackIn_75_1;
                                    stackOut_75_2 = "";
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    stackIn_76_2 = stackOut_75_2;
                                    break L11;
                                  } else {
                                    stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = hj.field_l[-var5 + (hj.field_l.length + var8)];
                                    stackIn_76_0 = stackOut_74_0;
                                    stackIn_76_1 = stackOut_74_1;
                                    stackIn_76_2 = stackOut_74_2;
                                    break L11;
                                  }
                                }
                                stackIn_76_0[stackIn_76_1] = stackIn_76_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            cb.field_k[var8] = -1;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                if (3 != gm.field_f) {
                  if (gm.field_f != 4) {
                    if (gm.field_f != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = vm.a(vd.field_Gb, -9224, vj.field_d, n.field_d, mk.field_a);
                      var4 = 3 + var3_int;
                      cb.field_k = new int[var4];
                      ka.field_g = new String[var4];
                      var5 = 0;
                      L12: while (true) {
                        if (var4 <= var5) {
                          fi.field_c = new int[2];
                          var5 = 0;
                          L13: while (true) {
                            if (var5 >= var3_int) {
                              ka.field_g[var4 + -3] = "";
                              ka.field_g[-2 + var4] = lk.field_d;
                              cb.field_k[var4 + -2] = 0;
                              fi.field_c[0] = 3;
                              ka.field_g[-1 + var4] = sj.field_m;
                              cb.field_k[var4 - 1] = 1;
                              fi.field_c[1] = 5;
                              break L0;
                            } else {
                              ka.field_g[var5] = n.field_d[var5];
                              var5++;
                              continue L13;
                            }
                          }
                        } else {
                          cb.field_k[var5] = -1;
                          var5++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    var3_int = vm.a(le.field_c, -9224, vj.field_d, n.field_d, mk.field_a);
                    var4 = var3_int + 2;
                    cb.field_k = new int[var4];
                    ka.field_g = new String[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= var4) {
                        fi.field_c = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var3_int) {
                            ka.field_g[var4 + -2] = "";
                            ka.field_g[-1 + var4] = sj.field_m;
                            cb.field_k[var4 - 1] = 0;
                            fi.field_c[0] = 5;
                            break L0;
                          } else {
                            ka.field_g[var5] = n.field_d[var5];
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        cb.field_k[var5] = -1;
                        var5++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  L16: {
                    if (oc.field_l.field_k) {
                      var3_int = vm.a(hl.field_a, -9224, vj.field_d, n.field_d, mk.field_a);
                      break L16;
                    } else {
                      var3_int = vm.a(Chess.field_D, -9224, vj.field_d, n.field_d, mk.field_a);
                      break L16;
                    }
                  }
                  var4 = 2 - -var3_int;
                  cb.field_k = new int[var4];
                  ka.field_g = new String[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (var4 <= var5) {
                      fi.field_c = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var5 >= var3_int) {
                          ka.field_g[var4 + -2] = "";
                          ka.field_g[-1 + var4] = sj.field_m;
                          cb.field_k[-1 + var4] = 0;
                          fi.field_c[0] = 5;
                          break L0;
                        } else {
                          ka.field_g[var5] = n.field_d[var5];
                          var5++;
                          continue L18;
                        }
                      }
                    } else {
                      cb.field_k[var5] = -1;
                      var5++;
                      continue L17;
                    }
                  }
                }
              }
            } else {
              var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
              var4 = var3_int + 2;
              cb.field_k = new int[var4];
              ka.field_g = new String[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  fi.field_c = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3_int) {
                      ka.field_g[-2 + var4] = "";
                      ka.field_g[var4 - 1] = sj.field_m;
                      cb.field_k[var4 - 1] = 0;
                      fi.field_c[0] = 5;
                      break L0;
                    } else {
                      ka.field_g[var5] = n.field_d[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  cb.field_k[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
            var4 = 3 - -var3_int;
            cb.field_k = new int[var4];
            ka.field_g = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                fi.field_c = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3_int <= var5) {
                    ka.field_g[-3 + var4] = "";
                    ka.field_g[-2 + var4] = ph.field_m;
                    cb.field_k[var4 - 2] = 0;
                    fi.field_c[0] = 4;
                    ka.field_g[var4 - 1] = sj.field_m;
                    cb.field_k[var4 + -1] = 1;
                    fi.field_c[1] = 5;
                    break L0;
                  } else {
                    ka.field_g[var5] = n.field_d[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                cb.field_k[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        ol.field_R.field_f = fi.field_c.length;
        if (!param0) {
          var3_int = 0;
          var4 = 0;
          L23: while (true) {
            if (ka.field_g.length <= var4) {
              L24: {
                if (2 == gm.field_f) {
                  var10 = ik.field_a;
                  var5 = 0;
                  L25: while (true) {
                    if (var5 >= var10.length) {
                      var11 = tj.field_p;
                      var5 = 0;
                      L26: while (true) {
                        if (var5 >= var11.length) {
                          break L24;
                        } else {
                          L27: {
                            var13 = var11[var5];
                            var7 = kn.a(false, param0, var13);
                            if (var7 > var3_int) {
                              var3_int = var7;
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
                        var7 = kn.a(false, false, var12);
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
              ca.field_j = -(var3_int >> 1) + (var3_int + ob.field_C);
              ai.field_j = ob.field_C + -(var3_int >> 1);
              in.field_i = (kl.field_i - -ek.field_b << 1) * ol.field_R.field_f;
              var4 = 0;
              L29: while (true) {
                if (ka.field_g.length <= var4) {
                  ak.field_j = kd.field_Hb + -(in.field_i >> 1);
                  cb.field_h = new int[ka.field_g.length][];
                  var4 = 0;
                  var5 = ak.field_j;
                  L30: while (true) {
                    if (var4 >= ka.field_g.length) {
                      L31: {
                        if (gm.field_f == 2) {
                          ol.field_R.a(-1, -1, param1, 0);
                          break L31;
                        } else {
                          ol.field_R.a(0, fe.a(hn.field_k, 1, rf.field_b), param1, 0);
                          break L31;
                        }
                      }
                      return;
                    } else {
                      L32: {
                        var6 = cb.field_k[var4];
                        if (var6 >= 0) {
                          var7 = kn.a(true, param0, ka.field_g[var4]);
                          var5 = var5 + ek.field_b;
                          var8 = ob.field_C + -(var7 >> 1);
                          cb.field_h[var4] = new int[4];
                          cb.field_h[var4][0] = -m.field_d + var8;
                          cb.field_h[var4][1] = var5;
                          cb.field_h[var4][2] = (m.field_d << 1) + var7;
                          var5 = var5 + ((kl.field_i << 1) - (-ek.field_b + -vh.field_c));
                          cb.field_h[var4][3] = vh.field_c - -(kl.field_i << 1);
                          break L32;
                        } else {
                          var5 = var5 + fd.field_n;
                          break L32;
                        }
                      }
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  L33: {
                    stackOut_109_0 = in.field_i;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (cb.field_k[var4] < 0) {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = fd.field_n;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L33;
                    } else {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = vh.field_c;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L33;
                    }
                  }
                  in.field_i = stackIn_112_0 + stackIn_112_1;
                  var4++;
                  continue L29;
                }
              }
            } else {
              L34: {
                if (cb.field_k[var4] < 0) {
                  stackOut_90_0 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  break L34;
                } else {
                  stackOut_89_0 = 1;
                  stackIn_91_0 = stackOut_89_0;
                  break L34;
                }
              }
              L35: {
                var5 = kn.a(stackIn_91_0 != 0, false, ka.field_g[var4]);
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
        } else {
          return;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (((qh) this).field_f.length >> 1) + -1;
          if (param1 == 17) {
            break L0;
          } else {
            qh.a(true, false, 96);
            break L0;
          }
        }
        var4 = param0 & var3;
        L1: while (true) {
          var5 = ((qh) this).field_f[var4 + (var4 - -1)];
          if (var5 == -1) {
            return -1;
          } else {
            if (((qh) this).field_f[var4 - -var4] == param0) {
              return var5;
            } else {
              var4 = var3 & var4 + 1;
              continue L1;
            }
          }
        }
    }

    qh(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if ((param0.length >> 1) + param0.length < var2_int) {
                ((qh) this).field_f = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int - -var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = var2_int + -1 & param0[var3];
                        L4: while (true) {
                          if (((qh) this).field_f[var4 + var4 + 1] == -1) {
                            ((qh) this).field_f[var4 + var4] = param0[var3];
                            ((qh) this).field_f[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    ((qh) this).field_f[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("qh.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Security";
        field_e = new int[8192];
    }
}
