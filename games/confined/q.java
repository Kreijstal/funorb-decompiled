/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends jg {
    private long[] field_i;
    private long field_m;
    private long field_p;
    private long field_h;
    static String field_j;
    private int field_o;
    static String field_n;
    private int field_l;
    static String field_k;

    private final long c(byte param0) {
        int var9 = 0;
        int var10 = Confined.field_J ? 1 : 0;
        int var6 = -30 % ((-28 - param0) / 63);
        long var2 = System.nanoTime();
        long var4 = -((q) this).field_h + var2;
        ((q) this).field_h = var2;
        if (4999999999L > (var4 ^ -1L)) {
            if (!(5000000000L <= var4)) {
                ((q) this).field_i[((q) this).field_o] = var4;
                ((q) this).field_o = (1 + ((q) this).field_o) % 10;
                if (!((((q) this).field_l ^ -1) <= -2)) {
                    ((q) this).field_l = ((q) this).field_l + 1;
                }
            }
        }
        long var7 = 0L;
        for (var9 = 1; var9 <= ((q) this).field_l; var9++) {
            var7 = var7 + ((q) this).field_i[(10 + (((q) this).field_o - var9)) % 10];
        }
        return var7 / (long)((q) this).field_l;
    }

    final int a(int param0, long param1) {
        int var5 = Confined.field_J ? 1 : 0;
        if (param0 != -25) {
            return -74;
        }
        if (((q) this).field_m < ((q) this).field_p) {
            ((q) this).field_h = ((q) this).field_h + (-((q) this).field_m + ((q) this).field_p);
            ((q) this).field_m = ((q) this).field_m + (((q) this).field_p + -((q) this).field_m);
            ((q) this).field_p = ((q) this).field_p + param1;
            return 1;
        }
        int var4 = 0;
        do {
            ((q) this).field_p = ((q) this).field_p + param1;
            var4++;
            // if_icmpge L121
        } while ((((q) this).field_p ^ -1L) > (((q) this).field_m ^ -1L));
        if (!(((q) this).field_p >= ((q) this).field_m)) {
            ((q) this).field_p = ((q) this).field_m;
        }
        return var4;
    }

    final long a(int param0) {
        if (param0 != 10) {
            field_n = null;
        }
        ((q) this).field_m = ((q) this).field_m + this.c((byte) 105);
        if (((q) this).field_m < ((q) this).field_p) {
            return (((q) this).field_p + -((q) this).field_m) / 1000000L;
        }
        return 0L;
    }

    public static void c(int param0) {
        field_j = null;
        field_n = null;
        int var1 = 23 % ((param0 - 49) / 55);
        field_k = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
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
        int stackIn_86_0 = 0;
        String stackIn_86_1 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_88_2 = 0;
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
        int stackOut_85_0 = 0;
        String stackOut_85_1 = null;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        L0: {
          var9 = Confined.field_J ? 1 : 0;
          ea.field_a = param0;
          in.field_h = true;
          if (-1 != (ea.field_a ^ -1)) {
            if (ea.field_a == 1) {
              var3 = ri.a(cf.field_cb, 21, hd.field_c, rn.field_e, wg.field_a);
              var4 = var3 + 2;
              la.field_T = new int[var4];
              dl.field_c = new String[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  uc.field_ab = new int[1];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      dl.field_c[-2 + var4] = "";
                      dl.field_c[var4 + -1] = s.field_J;
                      la.field_T[-1 + var4] = 0;
                      uc.field_ab[0] = 5;
                      break L0;
                    } else {
                      dl.field_c[var5] = cf.field_cb[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  la.field_T[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if ((ea.field_a ^ -1) == -3) {
                var3 = ri.a(cf.field_cb, 58, b.a(new String[1], ld.field_j, 1177), rn.field_e, wg.field_a);
                var4 = -1;
                var5 = 0;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if (!"<%0>".equals((Object) (Object) cf.field_cb[var5])) {
                        var5++;
                        continue L3;
                      } else {
                        var4 = var5;
                        break L4;
                      }
                    }
                  }
                  if (-1 == var4) {
                    throw new IllegalStateException();
                  } else {
                    jc.field_d = new String[var4];
                    lj.a((Object[]) (Object) cf.field_cb, 0, (Object[]) (Object) jc.field_d, 0, var4);
                    tf.field_d = new String[-var4 + var3 - 1];
                    lj.a((Object[]) (Object) cf.field_cb, 1 + var4, (Object[]) (Object) tf.field_d, 0, -1 + -var4 + var3);
                    var3 = ri.a(cf.field_cb, 112, b.a(new String[1], kj.field_d, 1177), rn.field_e, wg.field_a);
                    var4 = -1;
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3) {
                          break L6;
                        } else {
                          if ("<%0>".equals((Object) (Object) cf.field_cb[var5])) {
                            var4 = var5;
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        L7: {
                          fj.field_s = new String[var4];
                          lj.a((Object[]) (Object) cf.field_cb, 0, (Object[]) (Object) fj.field_s, 0, var4);
                          tk.field_e = new String[-var4 + (var3 - 1)];
                          lj.a((Object[]) (Object) cf.field_cb, var4 - -1, (Object[]) (Object) tk.field_e, 0, -var4 + var3 + -1);
                          if (fj.field_s.length > jc.field_d.length) {
                            stackOut_56_0 = fj.field_s.length;
                            stackIn_57_0 = stackOut_56_0;
                            break L7;
                          } else {
                            stackOut_55_0 = jc.field_d.length;
                            stackIn_57_0 = stackOut_55_0;
                            break L7;
                          }
                        }
                        L8: {
                          var5 = stackIn_57_0;
                          if (tk.field_e.length > tf.field_d.length) {
                            stackOut_59_0 = tk.field_e.length;
                            stackIn_60_0 = stackOut_59_0;
                            break L8;
                          } else {
                            stackOut_58_0 = tf.field_d.length;
                            stackIn_60_0 = stackOut_58_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_60_0;
                        var7 = var5 + 7 - -var6;
                        la.field_T = new int[var7];
                        dl.field_c = new String[var7];
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            dl.field_c[1] = in.field_d;
                            uc.field_ab = new int[2];
                            la.field_T[1] = 0;
                            dl.field_c[0] = qa.field_d;
                            la.field_T[3] = 1;
                            uc.field_ab[1] = 2;
                            dl.field_c[2] = hm.field_mb;
                            dl.field_c[5] = "";
                            dl.field_c[4] = em.field_c;
                            dl.field_c[3] = sb.field_i;
                            uc.field_ab[0] = 5;
                            var8 = 0;
                            L10: while (true) {
                              if (var5 <= var8) {
                                dl.field_c[var5 + 6] = null;
                                la.field_T[6 + var5] = -2;
                                var8 = 0;
                                L11: while (true) {
                                  if (var6 <= var8) {
                                    ga.field_M = ri.a(-3);
                                    break L0;
                                  } else {
                                    L12: {
                                      stackOut_71_0 = dl.field_c;
                                      stackOut_71_1 = var8 + (var5 + 7);
                                      stackIn_73_0 = stackOut_71_0;
                                      stackIn_73_1 = stackOut_71_1;
                                      stackIn_72_0 = stackOut_71_0;
                                      stackIn_72_1 = stackOut_71_1;
                                      if (tk.field_e.length <= var8) {
                                        stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = "";
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        stackIn_74_2 = stackOut_73_2;
                                        break L12;
                                      } else {
                                        stackOut_72_0 = (String[]) (Object) stackIn_72_0;
                                        stackOut_72_1 = stackIn_72_1;
                                        stackOut_72_2 = tk.field_e[var8];
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
                                  stackOut_65_0 = dl.field_c;
                                  stackOut_65_1 = 6 + var8;
                                  stackIn_67_0 = stackOut_65_0;
                                  stackIn_67_1 = stackOut_65_1;
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  if (var8 + (fj.field_s.length - var5) < 0) {
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
                                    stackOut_66_2 = fj.field_s[-var5 + var8 - -fj.field_s.length];
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
                            la.field_T[var8] = -1;
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
                if (3 == ea.field_a) {
                  L14: {
                    if (ki.field_d.field_p) {
                      var3 = ri.a(cf.field_cb, 106, cd.field_n, rn.field_e, wg.field_a);
                      break L14;
                    } else {
                      var3 = ri.a(cf.field_cb, -113, gh.field_d, rn.field_e, wg.field_a);
                      break L14;
                    }
                  }
                  var4 = 2 + var3;
                  la.field_T = new int[var4];
                  dl.field_c = new String[var4];
                  var5 = 0;
                  L15: while (true) {
                    if (var5 >= var4) {
                      uc.field_ab = new int[1];
                      var5 = 0;
                      L16: while (true) {
                        if (var3 <= var5) {
                          dl.field_c[var4 + -2] = "";
                          dl.field_c[var4 + -1] = s.field_J;
                          la.field_T[var4 - 1] = 0;
                          uc.field_ab[0] = 5;
                          break L0;
                        } else {
                          dl.field_c[var5] = cf.field_cb[var5];
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      la.field_T[var5] = -1;
                      var5++;
                      continue L15;
                    }
                  }
                } else {
                  if (ea.field_a != 4) {
                    if ((ea.field_a ^ -1) != -6) {
                      throw new IllegalArgumentException();
                    } else {
                      var3 = ri.a(cf.field_cb, -120, ql.field_A, rn.field_e, wg.field_a);
                      var4 = 3 + var3;
                      la.field_T = new int[var4];
                      dl.field_c = new String[var4];
                      var5 = 0;
                      L17: while (true) {
                        if (var4 <= var5) {
                          uc.field_ab = new int[2];
                          var5 = 0;
                          L18: while (true) {
                            if (var3 <= var5) {
                              dl.field_c[var4 + -3] = "";
                              dl.field_c[-2 + var4] = tm.field_a;
                              la.field_T[-2 + var4] = 0;
                              uc.field_ab[0] = 3;
                              dl.field_c[-1 + var4] = s.field_J;
                              la.field_T[var4 - 1] = 1;
                              uc.field_ab[1] = 5;
                              break L0;
                            } else {
                              dl.field_c[var5] = cf.field_cb[var5];
                              var5++;
                              continue L18;
                            }
                          }
                        } else {
                          la.field_T[var5] = -1;
                          var5++;
                          continue L17;
                        }
                      }
                    }
                  } else {
                    var3 = ri.a(cf.field_cb, 118, sf.field_s, rn.field_e, wg.field_a);
                    var4 = 2 + var3;
                    la.field_T = new int[var4];
                    dl.field_c = new String[var4];
                    var5 = 0;
                    L19: while (true) {
                      if (var5 >= var4) {
                        uc.field_ab = new int[1];
                        var5 = 0;
                        L20: while (true) {
                          if (var3 <= var5) {
                            dl.field_c[-2 + var4] = "";
                            dl.field_c[-1 + var4] = s.field_J;
                            la.field_T[-1 + var4] = 0;
                            uc.field_ab[0] = 5;
                            break L0;
                          } else {
                            dl.field_c[var5] = cf.field_cb[var5];
                            var5++;
                            continue L20;
                          }
                        }
                      } else {
                        la.field_T[var5] = -1;
                        var5++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var3 = ri.a(cf.field_cb, 69, hd.field_c, rn.field_e, wg.field_a);
            var4 = 3 - -var3;
            dl.field_c = new String[var4];
            la.field_T = new int[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                uc.field_ab = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    dl.field_c[var4 + -3] = "";
                    dl.field_c[-2 + var4] = nl.field_e;
                    la.field_T[var4 + -2] = 0;
                    uc.field_ab[0] = 4;
                    dl.field_c[var4 - 1] = s.field_J;
                    la.field_T[var4 - 1] = 1;
                    uc.field_ab[1] = 5;
                    break L0;
                  } else {
                    dl.field_c[var5] = cf.field_cb[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                la.field_T[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        ij.field_q.field_k = uc.field_ab.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (dl.field_c.length <= var4) {
            L24: {
              if (2 != ea.field_a) {
                break L24;
              } else {
                var10 = jc.field_d;
                var5 = 0;
                L25: while (true) {
                  if (var5 >= var10.length) {
                    var11 = tf.field_d;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var11.length) {
                        break L24;
                      } else {
                        var13 = var11[var5];
                        var7 = cl.a(-3, var13, false);
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
                    var7 = cl.a(-3, var12, false);
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
              }
            }
            v.field_Eb = -(var3 >> -1026400703) + (var3 + ef.field_vb);
            if (param2 < -94) {
              nh.field_b = ij.field_q.field_k * (n.field_d + kb.field_b << -528128927);
              ef.field_sb = -(var3 >> -655990015) + ef.field_vb;
              var4 = 0;
              L27: while (true) {
                if (var4 >= dl.field_c.length) {
                  uh.field_c = pe.field_q + -(nh.field_b >> 1488067553);
                  tj.field_l = new int[dl.field_c.length][];
                  var4 = 0;
                  var5 = uh.field_c;
                  L28: while (true) {
                    if (var4 >= dl.field_c.length) {
                      L29: {
                        if (2 != ea.field_a) {
                          ij.field_q.a(param1, 0, 0, ab.a(0, ld.field_l, jh.field_R));
                          break L29;
                        } else {
                          ij.field_q.a(param1, 0, -1, -1);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = la.field_T[var4];
                      if ((var6 ^ -1) > -1) {
                        var5 = var5 + wm.field_bb;
                        var4++;
                        continue L28;
                      } else {
                        var7 = cl.a(-3, dl.field_c[var4], true);
                        var5 = var5 + kb.field_b;
                        var8 = ef.field_vb - (var7 >> -1062341311);
                        tj.field_l[var4] = new int[4];
                        tj.field_l[var4][0] = var8 - jd.field_g;
                        tj.field_l[var4][1] = var5;
                        tj.field_l[var4][2] = (jd.field_g << -479650815) + var7;
                        var5 = var5 + (af.field_Z + kb.field_b + (n.field_d << -1514389279));
                        tj.field_l[var4][3] = (n.field_d << -1763034143) + af.field_Z;
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_106_0 = nh.field_b;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_107_0 = stackOut_106_0;
                    if (la.field_T[var4] < 0) {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = wm.field_bb;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      break L30;
                    } else {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = af.field_Z;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_109_1 = stackOut_107_1;
                      break L30;
                    }
                  }
                  nh.field_b = stackIn_109_0 + stackIn_109_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              return;
            }
          } else {
            L31: {
              stackOut_85_0 = -3;
              stackOut_85_1 = dl.field_c[var4];
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              if (0 > la.field_T[var4]) {
                stackOut_87_0 = stackIn_87_0;
                stackOut_87_1 = (String) (Object) stackIn_87_1;
                stackOut_87_2 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                stackIn_88_2 = stackOut_87_2;
                break L31;
              } else {
                stackOut_86_0 = stackIn_86_0;
                stackOut_86_1 = (String) (Object) stackIn_86_1;
                stackOut_86_2 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_88_2 = stackOut_86_2;
                break L31;
              }
            }
            var5 = cl.a(stackIn_88_0, stackIn_88_1, stackIn_88_2 != 0);
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
    }

    q() {
        ((q) this).field_i = new long[10];
        ((q) this).field_h = 0L;
        ((q) this).field_m = 0L;
        ((q) this).field_p = 0L;
        ((q) this).field_o = 0;
        ((q) this).field_l = 1;
        ((q) this).field_m = System.nanoTime();
        ((q) this).field_p = System.nanoTime();
    }

    final void a(byte param0) {
        ((q) this).field_h = 0L;
        if (((q) this).field_p > ((q) this).field_m) {
            ((q) this).field_m = ((q) this).field_m + (-((q) this).field_m + ((q) this).field_p);
        }
        if (param0 != 31) {
            ((q) this).a((byte) -34);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Extra life";
        field_k = "Or <col=FFFFFF>click on the game</col> for mouse control (see next page).";
    }
}
