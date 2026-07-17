/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ae {
    private int field_k;
    static String[] field_a;
    static String field_h;
    private int field_d;
    int field_i;
    int field_b;
    private int field_j;
    private boolean field_f;
    private int field_g;
    static String field_c;
    static String field_e;

    final void d(int param0) {
        ((ae) this).field_d = 0;
        ((ae) this).field_k = 0;
        if (((ae) this).field_g == 0) {
            if (!(mm.field_t != 98)) {
                if (!(0 < ((ae) this).field_b)) {
                    ((ae) this).field_b = ((ae) this).field_i;
                }
                ((ae) this).field_b = ((ae) this).field_b - 1;
                ((ae) this).field_f = false;
            }
        }
        if (((ae) this).field_g == 0) {
            ((ae) this).field_d = mm.field_t;
        }
        if (param0 == ((ae) this).field_g) {
            if (99 == mm.field_t) {
                ((ae) this).field_b = ((ae) this).field_b + 1;
                if (((ae) this).field_b >= ((ae) this).field_i) {
                    ((ae) this).field_b = 0;
                }
                ((ae) this).field_f = false;
            }
        }
    }

    final boolean b(int param0) {
        if (param0 != -1) {
            ((ae) this).field_k = -104;
        }
        return ((ae) this).field_d == 102 ? true : false;
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        to.field_g = sj.field_cb[param0];
        if (param1 != -5) {
            return;
        }
        ec.field_r = lc.field_k[param0];
        ki.field_c = qh.field_R[param0];
    }

    final void a(int param0, byte param1) {
        L0: {
          ((ae) this).field_d = 0;
          ((ae) this).field_k = 0;
          if (((ae) this).field_g != 0) {
            break L0;
          } else {
            if (mm.field_t != 96) {
              break L0;
            } else {
              L1: {
                if (((ae) this).field_b <= 0) {
                  ((ae) this).field_b = ((ae) this).field_i;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((ae) this).field_f = false;
              ((ae) this).field_b = ((ae) this).field_b - 1;
              break L0;
            }
          }
        }
        L2: {
          if (((ae) this).field_g == 0) {
            ((ae) this).field_d = mm.field_t;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((ae) this).field_g != 0) {
            break L3;
          } else {
            if (mm.field_t != 97) {
              break L3;
            } else {
              L4: {
                ((ae) this).field_b = ((ae) this).field_b + 1;
                if (((ae) this).field_i <= ((ae) this).field_b) {
                  ((ae) this).field_b = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              ((ae) this).field_f = false;
              break L3;
            }
          }
        }
        if (param1 == -107) {
          L5: {
            if (((ae) this).field_g != 0) {
              break L5;
            } else {
              L6: {
                if (98 == mm.field_t) {
                  break L6;
                } else {
                  if (mm.field_t == 99) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (((ae) this).field_b < 0) {
                  ((ae) this).field_b = param0;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((ae) this).field_f = false;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        int var2 = -93 / ((param0 - 59) / 62);
        return ((ae) this).field_g != 0 ? true : false;
    }

    final boolean c(byte param0) {
        int var2 = -70 % ((param0 - -30) / 56);
        return ((ae) this).field_d == 97 ? true : false;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            ((ae) this).d(43);
        }
        return ((ae) this).field_d == 96 ? true : false;
    }

    final void a(boolean param0, boolean param1, int param2, int param3) {
        ((ae) this).field_f = param1 ? true : false;
        ((ae) this).field_g = 0;
        if (((ae) this).field_f) {
            ((ae) this).field_b = param3;
        } else {
            ((ae) this).field_b = param2;
        }
        if (param0) {
            boolean discarded$0 = ((ae) this).c((byte) 33);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            ae.a(53, 54);
        }
        return ((ae) this).field_d == 103 ? true : false;
    }

    final void b(int param0, int param1) {
        if (param1 != 3) {
            field_e = null;
        }
        if (((ae) this).field_g == 0) {
            ((ae) this).field_b = param0;
            ((ae) this).field_f = false;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
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
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        int stackIn_90_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String stackOut_47_2 = null;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          nk.field_Hb = true;
          kh.field_t = param1;
          if (kh.field_t != 0) {
            if (kh.field_t == 1) {
              var3_int = og.a(n.field_c, (byte) -114, qj.field_e, wa.field_l, ql.field_k);
              var4 = var3_int + 2;
              to.field_c = new int[var4];
              go.field_A = new String[var4];
              var5 = 0;
              L1: while (true) {
                if (~var4 >= ~var5) {
                  n.field_g = new int[1];
                  var5 = 0;
                  L2: while (true) {
                    if (~var5 <= ~var3_int) {
                      go.field_A[-2 + var4] = "";
                      go.field_A[var4 + -1] = sp.field_b;
                      to.field_c[var4 - 1] = 0;
                      n.field_g[0] = 5;
                      break L0;
                    } else {
                      go.field_A[var5] = qj.field_e[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  to.field_c[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (kh.field_t != 2) {
                if (kh.field_t != 3) {
                  if (kh.field_t != 4) {
                    if (kh.field_t != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = og.a(n.field_c, (byte) -68, qj.field_e, wa.field_l, id.field_g);
                      var4 = 3 + var3_int;
                      to.field_c = new int[var4];
                      go.field_A = new String[var4];
                      var5 = 0;
                      L3: while (true) {
                        if (~var4 >= ~var5) {
                          n.field_g = new int[2];
                          var5 = 0;
                          L4: while (true) {
                            if (~var3_int >= ~var5) {
                              go.field_A[var4 - 3] = "";
                              go.field_A[-2 + var4] = fc.field_j;
                              to.field_c[var4 + -2] = 0;
                              n.field_g[0] = 3;
                              go.field_A[-1 + var4] = sp.field_b;
                              to.field_c[-1 + var4] = 1;
                              n.field_g[1] = 5;
                              break L0;
                            } else {
                              go.field_A[var5] = qj.field_e[var5];
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          to.field_c[var5] = -1;
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var3_int = og.a(n.field_c, (byte) 101, qj.field_e, wa.field_l, jg.field_b);
                    var4 = var3_int + 2;
                    to.field_c = new int[var4];
                    go.field_A = new String[var4];
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= var4) {
                        n.field_g = new int[1];
                        var5 = 0;
                        L6: while (true) {
                          if (~var5 <= ~var3_int) {
                            go.field_A[var4 + -2] = "";
                            go.field_A[var4 - 1] = sp.field_b;
                            to.field_c[var4 - 1] = 0;
                            n.field_g[0] = 5;
                            break L0;
                          } else {
                            go.field_A[var5] = qj.field_e[var5];
                            var5++;
                            continue L6;
                          }
                        }
                      } else {
                        to.field_c[var5] = -1;
                        var5++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  L7: {
                    if (i.field_A.field_j) {
                      var3_int = og.a(n.field_c, (byte) 120, qj.field_e, wa.field_l, fg.field_g);
                      break L7;
                    } else {
                      var3_int = og.a(n.field_c, (byte) -46, qj.field_e, wa.field_l, oh.field_a);
                      break L7;
                    }
                  }
                  var4 = 2 - -var3_int;
                  go.field_A = new String[var4];
                  to.field_c = new int[var4];
                  var5 = 0;
                  L8: while (true) {
                    if (~var5 <= ~var4) {
                      n.field_g = new int[1];
                      var5 = 0;
                      L9: while (true) {
                        if (var3_int <= var5) {
                          go.field_A[var4 - 2] = "";
                          go.field_A[-1 + var4] = sp.field_b;
                          to.field_c[-1 + var4] = 0;
                          n.field_g[0] = 5;
                          break L0;
                        } else {
                          go.field_A[var5] = qj.field_e[var5];
                          var5++;
                          continue L9;
                        }
                      }
                    } else {
                      to.field_c[var5] = -1;
                      var5++;
                      continue L8;
                    }
                  }
                }
              } else {
                var3_int = og.a(n.field_c, (byte) 125, qj.field_e, wa.field_l, jk.a(new String[1], ef.field_b, 30496));
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (var3_int <= var5) {
                      break L11;
                    } else {
                      if ("<%0>".equals((Object) (Object) qj.field_e[var5])) {
                        var4 = var5;
                        break L11;
                      } else {
                        var5++;
                        continue L10;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    sn.field_a = new String[var4];
                    cj.a((Object[]) (Object) qj.field_e, 0, (Object[]) (Object) sn.field_a, 0, var4);
                    cp.field_Q = new String[-1 + (-var4 + var3_int)];
                    cj.a((Object[]) (Object) qj.field_e, var4 - -1, (Object[]) (Object) cp.field_Q, 0, var3_int - var4 - 1);
                    var4 = -1;
                    var3_int = og.a(n.field_c, (byte) 84, qj.field_e, wa.field_l, jk.a(new String[1], bn.field_i, 30496));
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var5 >= var3_int) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) qj.field_e[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L14: {
                          mo.field_g = new String[var4];
                          cj.a((Object[]) (Object) qj.field_e, 0, (Object[]) (Object) mo.field_g, 0, var4);
                          fd.field_b = new String[-1 + -var4 + var3_int];
                          cj.a((Object[]) (Object) qj.field_e, var4 + 1, (Object[]) (Object) fd.field_b, 0, -1 + var3_int - var4);
                          if (sn.field_a.length < mo.field_g.length) {
                            stackOut_30_0 = mo.field_g.length;
                            stackIn_31_0 = stackOut_30_0;
                            break L14;
                          } else {
                            stackOut_29_0 = sn.field_a.length;
                            stackIn_31_0 = stackOut_29_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_31_0;
                          if (~cp.field_Q.length > ~fd.field_b.length) {
                            stackOut_33_0 = fd.field_b.length;
                            stackIn_34_0 = stackOut_33_0;
                            break L15;
                          } else {
                            stackOut_32_0 = cp.field_Q.length;
                            stackIn_34_0 = stackOut_32_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_34_0;
                        var7 = var6 + (7 + var5);
                        go.field_A = new String[var7];
                        to.field_c = new int[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (~var7 >= ~var8) {
                            to.field_c[1] = 0;
                            go.field_A[0] = mj.field_b;
                            n.field_g = new int[2];
                            go.field_A[1] = lg.field_l;
                            go.field_A[5] = "";
                            n.field_g[0] = 5;
                            go.field_A[2] = ef.field_c;
                            to.field_c[3] = 1;
                            go.field_A[3] = jg.field_d;
                            n.field_g[1] = 2;
                            go.field_A[4] = qp.field_e;
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var5) {
                                go.field_A[6 - -var5] = null;
                                to.field_c[6 - -var5] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    kg.field_d = kd.c(-2456);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_45_0 = go.field_A;
                                      stackOut_45_1 = 7 - (-var5 - var8);
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_47_1 = stackOut_45_1;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      if (fd.field_b.length <= var8) {
                                        stackOut_47_0 = (String[]) (Object) stackIn_47_0;
                                        stackOut_47_1 = stackIn_47_1;
                                        stackOut_47_2 = "";
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        stackIn_48_2 = stackOut_47_2;
                                        break L19;
                                      } else {
                                        stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = fd.field_b[var8];
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        stackIn_48_2 = stackOut_46_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_39_0 = go.field_A;
                                  stackOut_39_1 = var8 + 6;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  if (mo.field_g.length + (var8 + -var5) >= 0) {
                                    stackOut_41_0 = (String[]) (Object) stackIn_41_0;
                                    stackOut_41_1 = stackIn_41_1;
                                    stackOut_41_2 = mo.field_g[mo.field_g.length + var8 + -var5];
                                    stackIn_42_0 = stackOut_41_0;
                                    stackIn_42_1 = stackOut_41_1;
                                    stackIn_42_2 = stackOut_41_2;
                                    break L20;
                                  } else {
                                    stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = "";
                                    stackIn_42_0 = stackOut_40_0;
                                    stackIn_42_1 = stackOut_40_1;
                                    stackIn_42_2 = stackOut_40_2;
                                    break L20;
                                  }
                                }
                                stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            to.field_c[var8] = -1;
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            var3_int = og.a(n.field_c, (byte) 96, qj.field_e, wa.field_l, ql.field_k);
            var4 = var3_int + 3;
            go.field_A = new String[var4];
            to.field_c = new int[var4];
            var5 = 0;
            L21: while (true) {
              if (~var5 <= ~var4) {
                n.field_g = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (~var3_int >= ~var5) {
                    go.field_A[var4 + -3] = "";
                    go.field_A[var4 - 2] = mn.field_a;
                    to.field_c[var4 - 2] = 0;
                    n.field_g[0] = 4;
                    go.field_A[-1 + var4] = sp.field_b;
                    to.field_c[var4 + -1] = 1;
                    n.field_g[1] = 5;
                    break L0;
                  } else {
                    go.field_A[var5] = qj.field_e[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                to.field_c[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        d.field_g.field_i = n.field_g.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (~var4 <= ~go.field_A.length) {
            L24: {
              if (kh.field_t != 2) {
                break L24;
              } else {
                var10 = sn.field_a;
                var5 = 0;
                L25: while (true) {
                  if (~var10.length >= ~var5) {
                    var11 = cp.field_Q;
                    var5 = 0;
                    L26: while (true) {
                      if (~var5 <= ~var11.length) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = og.a(false, var13, -30633);
                          if (~var3_int > ~var7) {
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
                      var7 = og.a(false, var12, -30633);
                      if (~var7 < ~var3_int) {
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
              }
            }
            d.field_e = vo.field_r - (-var3_int - -(var3_int >> 1));
            jn.field_d = (ci.field_j + h.field_q << 1) * d.field_g.field_i;
            bf.field_b = -(var3_int >> 1) + vo.field_r;
            var4 = 0;
            L29: while (true) {
              if (~go.field_A.length >= ~var4) {
                jm.field_c = -(jn.field_d >> 1) + bl.field_p;
                dg.field_L = new int[go.field_A.length][];
                var4 = 0;
                var5 = jm.field_c;
                L30: while (true) {
                  if (~go.field_A.length >= ~var4) {
                    L31: {
                      if (kh.field_t == 2) {
                        d.field_g.a(false, param0, -1, -1);
                        break L31;
                      } else {
                        d.field_g.a(false, param0, 0, ab.a(-776726687, hj.field_S, eh.field_h));
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = to.field_c[var4];
                      if (0 <= var6) {
                        var7 = og.a(true, go.field_A[var4], -30633);
                        var8 = -(var7 >> 1) + vo.field_r;
                        var5 = var5 + ci.field_j;
                        dg.field_L[var4] = new int[4];
                        dg.field_L[var4][0] = -oh.field_t + var8;
                        dg.field_L[var4][1] = var5;
                        dg.field_L[var4][2] = var7 + (oh.field_t << 1);
                        var5 = var5 + (mj.field_g + ((h.field_q << 1) + ci.field_j));
                        dg.field_L[var4][3] = (h.field_q << 1) + mj.field_g;
                        break L32;
                      } else {
                        var5 = var5 + ag.field_a;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_109_0 = jn.field_d;
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_110_0 = stackOut_109_0;
                  if (to.field_c[var4] < 0) {
                    stackOut_111_0 = stackIn_111_0;
                    stackOut_111_1 = ag.field_a;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    break L33;
                  } else {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = mj.field_g;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    break L33;
                  }
                }
                jn.field_d = stackIn_112_0 + stackIn_112_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              if (to.field_c[var4] < 0) {
                stackOut_89_0 = 0;
                stackIn_90_0 = stackOut_89_0;
                break L34;
              } else {
                stackOut_88_0 = 1;
                stackIn_90_0 = stackOut_88_0;
                break L34;
              }
            }
            L35: {
              var5 = og.a(stackIn_90_0 != 0, go.field_A[var4], -30633);
              if (~var5 < ~var3_int) {
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

    final void e(int param0) {
        ((ae) this).field_d = 0;
        if (param0 < 88) {
            ((ae) this).field_g = -80;
        }
        ((ae) this).field_k = 0;
        if (!(((ae) this).field_g != 0)) {
            ((ae) this).field_d = mm.field_t;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= ((ae) this).field_i) {
          throw new IllegalArgumentException();
        } else {
          L0: {
            if (param0 == -7734) {
              break L0;
            } else {
              ((ae) this).field_f = true;
              break L0;
            }
          }
          if (~((ae) this).field_i < ~param1) {
            L1: {
              ((ae) this).field_d = 0;
              ((ae) this).field_k = 0;
              if (0 != no.field_d) {
                ((ae) this).field_g = no.field_d;
                ((ae) this).field_f = true;
                ((ae) this).field_b = param1;
                ((ae) this).field_k = no.field_d;
                ((ae) this).field_j = e.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((ae) this).field_g == 0) {
                break L2;
              } else {
                if (la.field_g != 0) {
                  L3: {
                    if (((ae) this).field_j <= 0) {
                      ((ae) this).field_j = r.field_c;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((ae) this).field_j = ((ae) this).field_j - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (no.field_d != 0) {
                break L4;
              } else {
                if (la.field_g != 0) {
                  break L4;
                } else {
                  ((ae) this).field_g = 0;
                  break L4;
                }
              }
            }
            L5: {
              if (((ae) this).field_g != 0) {
                break L5;
              } else {
                L6: {
                  L7: {
                    if (((ae) this).field_f) {
                      break L7;
                    } else {
                      if (!cp.field_U) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (param2 < 0) {
                    if (((ae) this).field_f) {
                      ((ae) this).field_b = -1;
                      break L6;
                    } else {
                      break L5;
                    }
                  } else {
                    L8: {
                      if (((ae) this).field_b == param2) {
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((ae) this).field_f = true;
                    ((ae) this).field_b = param2;
                    break L5;
                  }
                }
                break L5;
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var2 = -24 / ((param0 - -29) / 40);
            if (((ae) this).field_k != 0) {
              break L1;
            } else {
              if (((ae) this).field_d == 84) {
                break L1;
              } else {
                if (83 != ((ae) this).field_d) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    ae(int param0) {
        ((ae) this).field_b = 0;
        ((ae) this).field_f = false;
        ((ae) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "Dwarf Renegade";
        field_e = "HEAL";
    }
}
