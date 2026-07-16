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

    public static void a(int param0) {
        field_e = null;
        if (param0 > -92) {
            field_c = null;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
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
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
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
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        L0: {
          var9 = Chess.field_G;
          kb.field_S = true;
          gm.field_f = param2;
          if (-1 != (gm.field_f ^ -1)) {
            if ((gm.field_f ^ -1) != -2) {
              if (-3 == (gm.field_f ^ -1)) {
                var3 = vm.a(oc.a(i.field_a, new String[1], (byte) -110), -9224, vj.field_d, n.field_d, mk.field_a);
                var4 = -1;
                var5 = 0;
                L1: while (true) {
                  L2: {
                    if (var5 >= var3) {
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
                  if (0 == (var4 ^ -1)) {
                    throw new IllegalStateException();
                  } else {
                    ik.field_a = new String[var4];
                    ne.a((Object[]) (Object) n.field_d, 0, (Object[]) (Object) ik.field_a, 0, var4);
                    tj.field_p = new String[-var4 + (var3 - 1)];
                    ne.a((Object[]) (Object) n.field_d, 1 + var4, (Object[]) (Object) tj.field_p, 0, var3 + -var4 + -1);
                    var4 = -1;
                    var3 = vm.a(oc.a(tb.field_e, new String[1], (byte) -105), -9224, vj.field_d, n.field_d, mk.field_a);
                    var5 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3) {
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
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        L5: {
                          hj.field_l = new String[var4];
                          ne.a((Object[]) (Object) n.field_d, 0, (Object[]) (Object) hj.field_l, 0, var4);
                          em.field_m = new String[-1 + -var4 + var3];
                          ne.a((Object[]) (Object) n.field_d, 1 + var4, (Object[]) (Object) em.field_m, 0, -1 + (-var4 + var3));
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
                  if ((gm.field_f ^ -1) != -5) {
                    if ((gm.field_f ^ -1) != -6) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = vm.a(vd.field_Gb, -9224, vj.field_d, n.field_d, mk.field_a);
                      var4 = 3 + var3;
                      cb.field_k = new int[var4];
                      ka.field_g = new String[var4];
                      var5 = 0;
                      L12: while (true) {
                        if (var4 <= var5) {
                          fi.field_c = new int[2];
                          var5 = 0;
                          L13: while (true) {
                            if (var5 >= var3) {
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
                    var3 = vm.a(le.field_c, -9224, vj.field_d, n.field_d, mk.field_a);
                    var4 = var3 + 2;
                    cb.field_k = new int[var4];
                    ka.field_g = new String[var4];
                    var5 = 0;
                    L14: while (true) {
                      if (var5 >= var4) {
                        fi.field_c = new int[1];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var3) {
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
                      var3 = vm.a(hl.field_a, -9224, vj.field_d, n.field_d, mk.field_a);
                      break L16;
                    } else {
                      var3 = vm.a(Chess.field_D, -9224, vj.field_d, n.field_d, mk.field_a);
                      break L16;
                    }
                  }
                  var4 = 2 - -var3;
                  cb.field_k = new int[var4];
                  ka.field_g = new String[var4];
                  var5 = 0;
                  L17: while (true) {
                    if (var4 <= var5) {
                      fi.field_c = new int[1];
                      var5 = 0;
                      L18: while (true) {
                        if (var5 >= var3) {
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
              var3 = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
              var4 = var3 + 2;
              cb.field_k = new int[var4];
              ka.field_g = new String[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  fi.field_c = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3) {
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
            var3 = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
            var4 = 3 - -var3;
            cb.field_k = new int[var4];
            ka.field_g = new String[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                fi.field_c = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
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
          var3 = 0;
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
                          var13 = var11[var5];
                          var7 = kn.a(false, param0, var13);
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
                      var7 = kn.a(false, false, var12);
                      if (var3 < var7) {
                        var3 = var7;
                        var5++;
                        continue L25;
                      } else {
                        var5++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  break L24;
                }
              }
              ca.field_j = -(var3 >> -59772959) + (var3 + ob.field_C);
              ai.field_j = ob.field_C + -(var3 >> 1265168993);
              in.field_i = (kl.field_i - -ek.field_b << 1832534305) * ol.field_R.field_f;
              var4 = 0;
              L27: while (true) {
                if (ka.field_g.length <= var4) {
                  ak.field_j = kd.field_Hb + -(in.field_i >> 839518049);
                  cb.field_h = new int[ka.field_g.length][];
                  var4 = 0;
                  var5 = ak.field_j;
                  L28: while (true) {
                    if (var4 >= ka.field_g.length) {
                      L29: {
                        if (-3 == (gm.field_f ^ -1)) {
                          ol.field_R.a(-1, -1, param1, 0);
                          break L29;
                        } else {
                          ol.field_R.a(0, fe.a(hn.field_k, 1, rf.field_b), param1, 0);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = cb.field_k[var4];
                      if (-1 >= (var6 ^ -1)) {
                        var7 = kn.a(true, param0, ka.field_g[var4]);
                        var5 = var5 + ek.field_b;
                        var8 = ob.field_C + -(var7 >> 789507585);
                        cb.field_h[var4] = new int[4];
                        cb.field_h[var4][0] = -m.field_d + var8;
                        cb.field_h[var4][1] = var5;
                        cb.field_h[var4][2] = (m.field_d << 1630349665) + var7;
                        var5 = var5 + ((kl.field_i << 1608816481) - (-ek.field_b + -vh.field_c));
                        cb.field_h[var4][3] = vh.field_c - -(kl.field_i << -1250452511);
                        var4++;
                        continue L28;
                      } else {
                        var5 = var5 + fd.field_n;
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_108_0 = in.field_i;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if (-1 < (cb.field_k[var4] ^ -1)) {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = fd.field_n;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L30;
                    } else {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = vh.field_c;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L30;
                    }
                  }
                  in.field_i = stackIn_111_0 + stackIn_111_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              L31: {
                if (-1 < (cb.field_k[var4] ^ -1)) {
                  stackOut_90_0 = 0;
                  stackIn_91_0 = stackOut_90_0;
                  break L31;
                } else {
                  stackOut_89_0 = 1;
                  stackIn_91_0 = stackOut_89_0;
                  break L31;
                }
              }
              var5 = kn.a(stackIn_91_0 != 0, false, ka.field_g[var4]);
              if (var5 > var3) {
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

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var3 = (((qh) this).field_f.length >> 1772092705) + -1;
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
          if ((var5 ^ -1) == 0) {
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
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> 1003391457) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((qh) this).field_f = new int[var2 + var2];
        for (var3 = 0; var3 < var2 - -var2; var3++) {
            ((qh) this).field_f[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = var2 + -1 & param0[var3];
            while ((((qh) this).field_f[var4 + var4 + 1] ^ -1) != 0) {
                var4 = -1 + var2 & 1 + var4;
            }
            ((qh) this).field_f[var4 + var4] = param0[var3];
            ((qh) this).field_f[1 + var4 + var4] = var3;
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
