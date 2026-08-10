/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    int[] field_g;
    int[] field_G;
    int field_H;
    int field_d;
    int field_o;
    static String field_e;
    static int field_A;
    int field_n;
    boolean[] field_I;
    static boolean field_p;
    byte[][] field_z;
    static int[] field_J;
    static ao field_w;
    static String field_L;
    byte[] field_C;
    int field_x;
    int[][] field_O;
    byte[] field_t;
    int field_D;
    int field_q;
    int[][] field_c;
    byte[] field_l;
    int field_K;
    int[] field_a;
    byte[] field_v;
    int[][] field_h;
    int field_b;
    byte[] field_r;
    int field_N;
    int field_P;
    boolean[] field_E;
    int field_F;
    byte field_j;
    int field_u;
    int field_s;
    static cj field_B;
    byte[] field_k;
    int field_f;
    int[] field_m;
    static int field_M;
    static String field_i;
    static String field_y;

    final static boolean a(byte param0, char param1) {
        int var2;
        int stackIn_7_0 = 0;
        L0: {
          L1: {
            var2 = 24 / ((param0 - -12) / 58);
            if (160 == param1) {
              break L1;
            } else {
              if (param1 == 32) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (param1 != 45) {
                    stackIn_7_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_7_0 = 1;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    final static ja[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        ja[] var1 = new ja[qc.field_v];
        for (var2 = 0; var2 < qc.field_v; var2++) {
            var3 = vj.field_p[var2] * oq.field_w[var2];
            var4 = qp.field_t[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = tp.field_t[tq.b((int) var4[var6], 255)];
            }
            var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var5);
        }
        if (param0 <= 2) {
            eb.a(true, false, -9);
        }
        fd.h((byte) 127);
        return var1;
    }

    final static String a(int param0, boolean param1, boolean param2) {
        if (param2) {
          L0: {
            if (!param1) {
              break L0;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                return gm.a(param0, param1, 10, -1);
              }
            }
          }
          return Integer.toString(param0);
        } else {
          return (String) null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        String stackIn_75_2 = null;
        int stackIn_88_0 = 0;
        String stackIn_88_1 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              ho.field_q = param2;
              bq.field_c = true;
              if (ho.field_q == 0) {
                var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                var4 = 3 + var3_int;
                hq.field_m = new String[var4];
                wd.field_Q = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    v.field_b = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        hq.field_m[-3 + var4] = "";
                        hq.field_m[-2 + var4] = p.field_b;
                        wd.field_Q[var4 - 2] = 0;
                        v.field_b[0] = 4;
                        hq.field_m[var4 + -1] = ic.field_f;
                        wd.field_Q[var4 + -1] = 1;
                        v.field_b[1] = 5;
                        break L1;
                      } else {
                        hq.field_m[var5] = cq.field_e[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    wd.field_Q[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if ((ho.field_q ^ -1) != -2) {
                  if (ho.field_q == 2) {
                    var3_int = mb.a(uq.field_f, param0, vl.a(ba.field_l, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                    var4 = -1;
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!"<%0>".equals(cq.field_e[var5])) {
                            var5++;
                            continue L4;
                          } else {
                            var4 = var5;
                            break L5;
                          }
                        }
                      }
                      if ((var4 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        aa.field_n = new String[var4];
                        d.a(cq.field_e, 0, aa.field_n, 0, var4);
                        ik.field_a = new String[var3_int - var4 - 1];
                        d.a(cq.field_e, var4 + 1, ik.field_a, 0, var3_int + -var4 + -1);
                        var4 = -1;
                        var3_int = mb.a(uq.field_f, false, vl.a(rn.field_g, new String[]{"<br><%0><br>"}, 2), cq.field_e, ib.field_b);
                        var5 = 0;
                        L6: while (true) {
                          L7: {
                            if (var5 >= var3_int) {
                              break L7;
                            } else {
                              if (!"<%0>".equals(cq.field_e[var5])) {
                                var5++;
                                continue L6;
                              } else {
                                var4 = var5;
                                break L7;
                              }
                            }
                          }
                          if ((var4 ^ -1) != 0) {
                            L8: {
                              q.field_a = new String[var4];
                              d.a(cq.field_e, 0, q.field_a, 0, var4);
                              ud.field_N = new String[var3_int + -var4 + -1];
                              d.a(cq.field_e, var4 + 1, ud.field_N, 0, var3_int + (-var4 + -1));
                              if (aa.field_n.length >= q.field_a.length) {
                                stackIn_57_0 = aa.field_n.length;
                                break L8;
                              } else {
                                stackIn_57_0 = q.field_a.length;
                                break L8;
                              }
                            }
                            L9: {
                              var5 = stackIn_57_0;
                              if (ud.field_N.length <= ik.field_a.length) {
                                stackIn_60_0 = ik.field_a.length;
                                break L9;
                              } else {
                                stackIn_60_0 = ud.field_N.length;
                                break L9;
                              }
                            }
                            var6 = stackIn_60_0;
                            var7 = var6 + var5 + 7;
                            hq.field_m = new String[var7];
                            wd.field_Q = new int[var7];
                            var8 = 0;
                            L10: while (true) {
                              if (var7 <= var8) {
                                v.field_b = new int[2];
                                wd.field_Q[1] = 0;
                                hq.field_m[1] = rb.field_b;
                                hq.field_m[0] = mq.field_q;
                                hq.field_m[3] = dd.field_e;
                                v.field_b[1] = 2;
                                v.field_b[0] = 5;
                                hq.field_m[2] = cq.field_a;
                                hq.field_m[4] = wj.field_h;
                                hq.field_m[5] = "";
                                wd.field_Q[3] = 1;
                                var8 = 0;
                                L11: while (true) {
                                  if (var5 <= var8) {
                                    hq.field_m[6 + var5] = null;
                                    wd.field_Q[var5 + 6] = -2;
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var6 <= var8) {
                                        so.field_s = bl.a((byte) 41);
                                        break L1;
                                      } else {
                                        stackIn_72_0 = hq.field_m;
                                        stackIn_72_1 = var5 + 7 + var8;
                                        stackIn_72_2 = var8 ^ -1;
                                        stackIn_72_3 = ud.field_N.length ^ -1;
                                        L13: {




                                          if (stackIn_72_2 > stackIn_72_3) {
                                            stackIn_72_0 = (String[]) ((Object) stackIn_72_0);

                                            stackIn_75_2 = ud.field_N[var8];
                                            break L13;
                                          } else {
                                            stackIn_72_0 = (String[]) ((Object) stackIn_72_0);

                                            stackIn_75_2 = "";
                                            break L13;
                                          }
                                        }
                                        stackIn_72_0[stackIn_72_1] = stackIn_75_2;
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    L14: {
                                      stackIn_67_0 = hq.field_m;

                                      stackIn_67_1 = 6 + var8;

                                      if (0 > var8 + (q.field_a.length + -var5)) {
                                        stackIn_68_0 = (String[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = "";
                                        break L14;
                                      } else {
                                        stackIn_68_0 = (String[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = q.field_a[var8 - -q.field_a.length + -var5];
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L11;
                                  }
                                }
                              } else {
                                wd.field_Q[var8] = -1;
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
                    if (ho.field_q != 3) {
                      if (ho.field_q == 4) {
                        var3_int = mb.a(uq.field_f, false, on.field_cb, cq.field_e, ib.field_b);
                        var4 = 2 - -var3_int;
                        hq.field_m = new String[var4];
                        wd.field_Q = new int[var4];
                        var5 = 0;
                        L15: while (true) {
                          if (var5 >= var4) {
                            v.field_b = new int[1];
                            var5 = 0;
                            L16: while (true) {
                              if (var5 >= var3_int) {
                                hq.field_m[var4 - 2] = "";
                                hq.field_m[var4 - 1] = ic.field_f;
                                wd.field_Q[var4 - 1] = 0;
                                v.field_b[0] = 5;
                                break L1;
                              } else {
                                hq.field_m[var5] = cq.field_e[var5];
                                var5++;
                                continue L16;
                              }
                            }
                          } else {
                            wd.field_Q[var5] = -1;
                            var5++;
                            continue L15;
                          }
                        }
                      } else {
                        if (ho.field_q == 5) {
                          var3_int = mb.a(uq.field_f, false, ga.field_t, cq.field_e, ib.field_b);
                          var4 = 3 + var3_int;
                          wd.field_Q = new int[var4];
                          hq.field_m = new String[var4];
                          var5 = 0;
                          L17: while (true) {
                            if (var4 <= var5) {
                              v.field_b = new int[2];
                              var5 = 0;
                              L18: while (true) {
                                if (var5 >= var3_int) {
                                  hq.field_m[-3 + var4] = "";
                                  hq.field_m[-2 + var4] = ei.field_d;
                                  wd.field_Q[-2 + var4] = 0;
                                  v.field_b[0] = 3;
                                  hq.field_m[var4 - 1] = ic.field_f;
                                  wd.field_Q[-1 + var4] = 1;
                                  v.field_b[1] = 5;
                                  break L1;
                                } else {
                                  hq.field_m[var5] = cq.field_e[var5];
                                  var5++;
                                  continue L18;
                                }
                              }
                            } else {
                              wd.field_Q[var5] = -1;
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    } else {
                      L19: {
                        if (pl.field_J.field_d) {
                          var3_int = mb.a(uq.field_f, param0, hg.field_sb, cq.field_e, ib.field_b);
                          break L19;
                        } else {
                          var3_int = mb.a(uq.field_f, false, aa.field_j, cq.field_e, ib.field_b);
                          break L19;
                        }
                      }
                      var4 = 2 - -var3_int;
                      wd.field_Q = new int[var4];
                      hq.field_m = new String[var4];
                      var5 = 0;
                      L20: while (true) {
                        if (var5 >= var4) {
                          v.field_b = new int[1];
                          var5 = 0;
                          L21: while (true) {
                            if (var5 >= var3_int) {
                              hq.field_m[-2 + var4] = "";
                              hq.field_m[-1 + var4] = ic.field_f;
                              wd.field_Q[-1 + var4] = 0;
                              v.field_b[0] = 5;
                              break L1;
                            } else {
                              hq.field_m[var5] = cq.field_e[var5];
                              var5++;
                              continue L21;
                            }
                          }
                        } else {
                          wd.field_Q[var5] = -1;
                          var5++;
                          continue L20;
                        }
                      }
                    }
                  }
                } else {
                  var3_int = mb.a(uq.field_f, false, oi.field_e, cq.field_e, ib.field_b);
                  var4 = var3_int + 2;
                  wd.field_Q = new int[var4];
                  hq.field_m = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var4 <= var5) {
                      v.field_b = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          hq.field_m[var4 - 2] = "";
                          hq.field_m[var4 - 1] = ic.field_f;
                          wd.field_Q[var4 - 1] = 0;
                          v.field_b[0] = 5;
                          break L1;
                        } else {
                          hq.field_m[var5] = cq.field_e[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      wd.field_Q[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            aq.field_B.field_c = v.field_b.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (hq.field_m.length <= var4) {
                L25: {
                  if (-3 != (ho.field_q ^ -1)) {
                    break L25;
                  } else {
                    var10 = aa.field_n;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var10.length <= var5) {
                        var4_ref_String__ = ik.field_a;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = hn.a(0, var12, false);
                            if ((var7 ^ -1) < (var3_int ^ -1)) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        L28: {
                          var11 = var10[var5];
                          var7 = hn.a(0, var11, false);
                          if (var3_int < var7) {
                            var3_int = var7;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  }
                }
                qk.field_j = aq.field_B.field_c * (al.field_bb + wk.field_G << -2095370847);
                ZombieDawnMulti.field_H = am.field_c - (var3_int >> 1283362145);
                fl.field_a = -(var3_int >> -641415647) + (am.field_c - -var3_int);
                var4 = 0;
                L29: while (true) {
                  if (hq.field_m.length <= var4) {
                    L30: {
                      ce.field_k = bp.field_r - (qk.field_j >> 952257185);
                      uf.field_b = new int[hq.field_m.length][];
                      if (!param0) {
                        break L30;
                      } else {
                        field_M = -108;
                        break L30;
                      }
                    }
                    var4 = 0;
                    var5 = ce.field_k;
                    L31: while (true) {
                      if (var4 >= hq.field_m.length) {
                        L32: {
                          if (ho.field_q != 2) {
                            aq.field_B.a(0, param1, -31458, iq.a(bo.field_d, -1, bd.field_g));
                            break L32;
                          } else {
                            aq.field_B.a(-1, param1, -31458, -1);
                            break L32;
                          }
                        }
                        break L0;
                      } else {
                        L33: {
                          var6 = wd.field_Q[var4];
                          if (-1 < (var6 ^ -1)) {
                            var5 = var5 + se.field_C;
                            break L33;
                          } else {
                            var7 = hn.a(0, hq.field_m[var4], true);
                            var8 = am.field_c + -(var7 >> -573694047);
                            var5 = var5 + al.field_bb;
                            uf.field_b[var4] = new int[4];
                            uf.field_b[var4][0] = var8 + -no.field_Gb;
                            uf.field_b[var4][1] = var5;
                            uf.field_b[var4][2] = var7 - -(no.field_Gb << 290203713);
                            uf.field_b[var4][3] = (wk.field_G << -1501645247) + me.field_h;
                            var5 = var5 + ((wk.field_G << 2035462817) - (-al.field_bb + -me.field_h));
                            break L33;
                          }
                        }
                        var4++;
                        continue L31;
                      }
                    }
                  } else {
                    L34: {
                      stackIn_109_0 = qk.field_j;

                      if ((wd.field_Q[var4] ^ -1) <= -1) {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = me.field_h;
                        break L34;
                      } else {
                        stackIn_110_0 = stackIn_109_0;
                        stackIn_110_1 = se.field_C;
                        break L34;
                      }
                    }
                    qk.field_j = stackIn_110_0 + stackIn_110_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L35: {
                  stackIn_88_0 = 0;

                  stackIn_88_1 = hq.field_m[var4];

                  if (0 > wd.field_Q[var4]) {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = (String) ((Object) stackIn_88_1);
                    stackIn_89_2 = 0;
                    break L35;
                  } else {
                    stackIn_89_0 = stackIn_88_0;
                    stackIn_89_1 = (String) ((Object) stackIn_88_1);
                    stackIn_89_2 = 1;
                    break L35;
                  }
                }
                L36: {
                  var5 = hn.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
                  if (var3_int < var5) {
                    var3_int = var5;
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
          throw fa.a((Throwable) ((Object) var3), "eb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_L = null;
        if (!param0) {
            eb.a(-18, false, true);
        }
        field_e = null;
        field_w = null;
        field_J = null;
        field_y = null;
        field_i = null;
        field_B = null;
    }

    eb() {
        this.field_z = new byte[6][258];
        this.field_c = new int[6][258];
        this.field_I = new boolean[256];
        this.field_O = new int[6][258];
        this.field_b = 0;
        this.field_l = new byte[18002];
        this.field_C = new byte[256];
        this.field_t = new byte[18002];
        this.field_E = new boolean[16];
        this.field_D = 0;
        this.field_g = new int[16];
        this.field_v = new byte[4096];
        this.field_h = new int[6][258];
        this.field_G = new int[257];
        this.field_a = new int[6];
        this.field_m = new int[256];
    }

    static {
        field_e = "Field Marshal";
        field_L = "This game option has not yet been unlocked for use.";
        field_A = 2;
        field_J = new int[8192];
        field_w = new ao(15, 0, 1, 0);
        field_i = "Strong zombie is strong.";
        field_y = "Password is valid";
    }
}
