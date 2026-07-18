/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int var6 = 0;
        long var2 = System.nanoTime();
        long var4 = -((q) this).field_h + var2;
        ((q) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                ((q) this).field_i[((q) this).field_o] = var4;
                ((q) this).field_o = (1 + ((q) this).field_o) % 10;
                if (!(((q) this).field_l >= 1)) {
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
        int var4 = 0;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        if (param0 == -25) {
          if (((q) this).field_m >= ((q) this).field_p) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((q) this).field_p = ((q) this).field_p + param1;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((q) this).field_p > ~((q) this).field_m) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((q) this).field_p < ((q) this).field_m) {
                  ((q) this).field_p = ((q) this).field_m;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((q) this).field_h = ((q) this).field_h + (-((q) this).field_m + ((q) this).field_p);
            ((q) this).field_m = ((q) this).field_m + (((q) this).field_p + -((q) this).field_m);
            ((q) this).field_p = ((q) this).field_p + param1;
            return 1;
          }
        } else {
          return -74;
        }
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
        int var1 = 1;
        field_k = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
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
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        int stackIn_87_0 = 0;
        String stackIn_87_1 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        String[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        String[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        String[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        String stackOut_68_2 = null;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_86_0 = 0;
        String stackOut_86_1 = null;
        int stackOut_88_0 = 0;
        String stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_87_0 = 0;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ea.field_a = param0;
              in.field_h = true;
              if (ea.field_a != 0) {
                if (ea.field_a == 1) {
                  var3_int = ri.a(cf.field_cb, 21, hd.field_c, rn.field_e, wg.field_a);
                  var4 = var3_int + 2;
                  la.field_T = new int[var4];
                  dl.field_c = new String[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      uc.field_ab = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          dl.field_c[-2 + var4] = "";
                          dl.field_c[var4 + -1] = s.field_J;
                          la.field_T[-1 + var4] = 0;
                          uc.field_ab[0] = 5;
                          break L1;
                        } else {
                          dl.field_c[var5] = cf.field_cb[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      la.field_T[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (ea.field_a == 2) {
                    var3_int = ri.a(cf.field_cb, 58, b.a(new String[1], ld.field_j, 1177), rn.field_e, wg.field_a);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!"<%0>".equals((Object) (Object) cf.field_cb[var5])) {
                            var5++;
                            continue L4;
                          } else {
                            var4 = var5;
                            break L5;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        jc.field_d = new String[var4];
                        lj.a((Object[]) (Object) cf.field_cb, 0, (Object[]) (Object) jc.field_d, 0, var4);
                        tf.field_d = new String[-var4 + var3_int - 1];
                        lj.a((Object[]) (Object) cf.field_cb, 1 + var4, (Object[]) (Object) tf.field_d, 0, -1 + -var4 + var3_int);
                        var3_int = ri.a(cf.field_cb, 112, b.a(new String[1], kj.field_d, 1177), rn.field_e, wg.field_a);
                        var4 = -1;
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var5 >= var3_int) {
                              break L7;
                            } else {
                              if ("<%0>".equals((Object) (Object) cf.field_cb[var5])) {
                                var4 = var5;
                                break L7;
                              } else {
                                var5++;
                                continue L6;
                              }
                            }
                          }
                          if (var4 != -1) {
                            L8: {
                              fj.field_s = new String[var4];
                              lj.a((Object[]) (Object) cf.field_cb, 0, (Object[]) (Object) fj.field_s, 0, var4);
                              tk.field_e = new String[-var4 + (var3_int - 1)];
                              lj.a((Object[]) (Object) cf.field_cb, var4 - -1, (Object[]) (Object) tk.field_e, 0, -var4 + var3_int + -1);
                              if (fj.field_s.length > jc.field_d.length) {
                                stackOut_57_0 = fj.field_s.length;
                                stackIn_58_0 = stackOut_57_0;
                                break L8;
                              } else {
                                stackOut_56_0 = jc.field_d.length;
                                stackIn_58_0 = stackOut_56_0;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_58_0;
                              if (tk.field_e.length > tf.field_d.length) {
                                stackOut_60_0 = tk.field_e.length;
                                stackIn_61_0 = stackOut_60_0;
                                break L9;
                              } else {
                                stackOut_59_0 = tf.field_d.length;
                                stackIn_61_0 = stackOut_59_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_61_0;
                            var7 = var5 + 7 - -var6;
                            la.field_T = new int[var7];
                            dl.field_c = new String[var7];
                            var8 = 0;
                            L10: while (true) {
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
                                L11: while (true) {
                                  if (var5 <= var8) {
                                    dl.field_c[var5 + 6] = null;
                                    la.field_T[6 + var5] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var6 <= var8) {
                                        ga.field_M = ri.a(-3);
                                        break L1;
                                      } else {
                                        L13: {
                                          stackOut_72_0 = dl.field_c;
                                          stackOut_72_1 = var8 + (var5 + 7);
                                          stackIn_74_0 = stackOut_72_0;
                                          stackIn_74_1 = stackOut_72_1;
                                          stackIn_73_0 = stackOut_72_0;
                                          stackIn_73_1 = stackOut_72_1;
                                          if (tk.field_e.length <= var8) {
                                            stackOut_74_0 = (String[]) (Object) stackIn_74_0;
                                            stackOut_74_1 = stackIn_74_1;
                                            stackOut_74_2 = "";
                                            stackIn_75_0 = stackOut_74_0;
                                            stackIn_75_1 = stackOut_74_1;
                                            stackIn_75_2 = stackOut_74_2;
                                            break L13;
                                          } else {
                                            stackOut_73_0 = (String[]) (Object) stackIn_73_0;
                                            stackOut_73_1 = stackIn_73_1;
                                            stackOut_73_2 = tk.field_e[var8];
                                            stackIn_75_0 = stackOut_73_0;
                                            stackIn_75_1 = stackOut_73_1;
                                            stackIn_75_2 = stackOut_73_2;
                                            break L13;
                                          }
                                        }
                                        stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackOut_66_0 = dl.field_c;
                                      stackOut_66_1 = 6 + var8;
                                      stackIn_68_0 = stackOut_66_0;
                                      stackIn_68_1 = stackOut_66_1;
                                      stackIn_67_0 = stackOut_66_0;
                                      stackIn_67_1 = stackOut_66_1;
                                      if (var8 + (fj.field_s.length - var5) < 0) {
                                        stackOut_68_0 = (String[]) (Object) stackIn_68_0;
                                        stackOut_68_1 = stackIn_68_1;
                                        stackOut_68_2 = "";
                                        stackIn_69_0 = stackOut_68_0;
                                        stackIn_69_1 = stackOut_68_1;
                                        stackIn_69_2 = stackOut_68_2;
                                        break L14;
                                      } else {
                                        stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = fj.field_s[-var5 + var8 - -fj.field_s.length];
                                        stackIn_69_0 = stackOut_67_0;
                                        stackIn_69_1 = stackOut_67_1;
                                        stackIn_69_2 = stackOut_67_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                la.field_T[var8] = -1;
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
                    if (3 == ea.field_a) {
                      L15: {
                        if (ki.field_d.field_p) {
                          var3_int = ri.a(cf.field_cb, 106, cd.field_n, rn.field_e, wg.field_a);
                          break L15;
                        } else {
                          var3_int = ri.a(cf.field_cb, -113, gh.field_d, rn.field_e, wg.field_a);
                          break L15;
                        }
                      }
                      var4 = 2 + var3_int;
                      la.field_T = new int[var4];
                      dl.field_c = new String[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var5 >= var4) {
                          uc.field_ab = new int[1];
                          var5 = 0;
                          L17: while (true) {
                            if (var3_int <= var5) {
                              dl.field_c[var4 + -2] = "";
                              dl.field_c[var4 + -1] = s.field_J;
                              la.field_T[var4 - 1] = 0;
                              uc.field_ab[0] = 5;
                              break L1;
                            } else {
                              dl.field_c[var5] = cf.field_cb[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          la.field_T[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      if (ea.field_a != 4) {
                        if (ea.field_a != 5) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = ri.a(cf.field_cb, -120, ql.field_A, rn.field_e, wg.field_a);
                          var4 = 3 + var3_int;
                          la.field_T = new int[var4];
                          dl.field_c = new String[var4];
                          var5 = 0;
                          L18: while (true) {
                            if (var4 <= var5) {
                              uc.field_ab = new int[2];
                              var5 = 0;
                              L19: while (true) {
                                if (var3_int <= var5) {
                                  dl.field_c[var4 + -3] = "";
                                  dl.field_c[-2 + var4] = tm.field_a;
                                  la.field_T[-2 + var4] = 0;
                                  uc.field_ab[0] = 3;
                                  dl.field_c[-1 + var4] = s.field_J;
                                  la.field_T[var4 - 1] = 1;
                                  uc.field_ab[1] = 5;
                                  break L1;
                                } else {
                                  dl.field_c[var5] = cf.field_cb[var5];
                                  var5++;
                                  continue L19;
                                }
                              }
                            } else {
                              la.field_T[var5] = -1;
                              var5++;
                              continue L18;
                            }
                          }
                        }
                      } else {
                        var3_int = ri.a(cf.field_cb, 118, sf.field_s, rn.field_e, wg.field_a);
                        var4 = 2 + var3_int;
                        la.field_T = new int[var4];
                        dl.field_c = new String[var4];
                        var5 = 0;
                        L20: while (true) {
                          if (var5 >= var4) {
                            uc.field_ab = new int[1];
                            var5 = 0;
                            L21: while (true) {
                              if (var3_int <= var5) {
                                dl.field_c[-2 + var4] = "";
                                dl.field_c[-1 + var4] = s.field_J;
                                la.field_T[-1 + var4] = 0;
                                uc.field_ab[0] = 5;
                                break L1;
                              } else {
                                dl.field_c[var5] = cf.field_cb[var5];
                                var5++;
                                continue L21;
                              }
                            }
                          } else {
                            la.field_T[var5] = -1;
                            var5++;
                            continue L20;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var3_int = ri.a(cf.field_cb, 69, hd.field_c, rn.field_e, wg.field_a);
                var4 = 3 - -var3_int;
                dl.field_c = new String[var4];
                la.field_T = new int[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    uc.field_ab = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        dl.field_c[var4 + -3] = "";
                        dl.field_c[-2 + var4] = nl.field_e;
                        la.field_T[var4 + -2] = 0;
                        uc.field_ab[0] = 4;
                        dl.field_c[var4 - 1] = s.field_J;
                        la.field_T[var4 - 1] = 1;
                        uc.field_ab[1] = 5;
                        break L1;
                      } else {
                        dl.field_c[var5] = cf.field_cb[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    la.field_T[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            ij.field_q.field_k = uc.field_ab.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (dl.field_c.length <= var4) {
                L25: {
                  if (2 != ea.field_a) {
                    break L25;
                  } else {
                    var10 = jc.field_d;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var11 = tf.field_d;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var11.length) {
                            break L25;
                          } else {
                            L28: {
                              var13 = var11[var5];
                              var7 = cl.a(-3, var13, false);
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
                          var7 = cl.a(-3, var12, false);
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
                  }
                }
                v.field_Eb = -(var3_int >> 1) + (var3_int + ef.field_vb);
                if (param2 < -94) {
                  nh.field_b = ij.field_q.field_k * (n.field_d + kb.field_b << 1);
                  ef.field_sb = -(var3_int >> 1) + ef.field_vb;
                  var4 = 0;
                  L30: while (true) {
                    if (var4 >= dl.field_c.length) {
                      uh.field_c = pe.field_q + -(nh.field_b >> 1);
                      tj.field_l = new int[dl.field_c.length][];
                      var4 = 0;
                      var5 = uh.field_c;
                      L31: while (true) {
                        if (var4 >= dl.field_c.length) {
                          L32: {
                            if (2 != ea.field_a) {
                              ij.field_q.a(param1, 0, 0, ab.a(0, ld.field_l, jh.field_R));
                              break L32;
                            } else {
                              ij.field_q.a(param1, 0, -1, -1);
                              break L32;
                            }
                          }
                          break L0;
                        } else {
                          L33: {
                            var6 = la.field_T[var4];
                            if (var6 < 0) {
                              var5 = var5 + wm.field_bb;
                              break L33;
                            } else {
                              var7 = cl.a(-3, dl.field_c[var4], true);
                              var5 = var5 + kb.field_b;
                              var8 = ef.field_vb - (var7 >> 1);
                              tj.field_l[var4] = new int[4];
                              tj.field_l[var4][0] = var8 - jd.field_g;
                              tj.field_l[var4][1] = var5;
                              tj.field_l[var4][2] = (jd.field_g << 1) + var7;
                              var5 = var5 + (af.field_Z + kb.field_b + (n.field_d << 1));
                              tj.field_l[var4][3] = (n.field_d << 1) + af.field_Z;
                              break L33;
                            }
                          }
                          var4++;
                          continue L31;
                        }
                      }
                    } else {
                      L34: {
                        stackOut_109_0 = nh.field_b;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_110_0 = stackOut_109_0;
                        if (la.field_T[var4] < 0) {
                          stackOut_111_0 = stackIn_111_0;
                          stackOut_111_1 = wm.field_bb;
                          stackIn_112_0 = stackOut_111_0;
                          stackIn_112_1 = stackOut_111_1;
                          break L34;
                        } else {
                          stackOut_110_0 = stackIn_110_0;
                          stackOut_110_1 = af.field_Z;
                          stackIn_112_0 = stackOut_110_0;
                          stackIn_112_1 = stackOut_110_1;
                          break L34;
                        }
                      }
                      nh.field_b = stackIn_112_0 + stackIn_112_1;
                      var4++;
                      continue L30;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L35: {
                  stackOut_86_0 = -3;
                  stackOut_86_1 = dl.field_c[var4];
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_88_1 = stackOut_86_1;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  if (0 > la.field_T[var4]) {
                    stackOut_88_0 = stackIn_88_0;
                    stackOut_88_1 = (String) (Object) stackIn_88_1;
                    stackOut_88_2 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    break L35;
                  } else {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = (String) (Object) stackIn_87_1;
                    stackOut_87_2 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    stackIn_89_2 = stackOut_87_2;
                    break L35;
                  }
                }
                L36: {
                  var5 = cl.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "q.E(" + param0 + ',' + param1 + ',' + param2 + ')');
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
