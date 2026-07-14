/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le extends di {
    static ad field_q;
    static rh field_n;
    static String field_m;
    static java.applet.Applet field_r;
    static String[] field_o;
    static int[] field_s;
    static bg field_p;

    final static String a(boolean param0) {
        if (qe.field_f == ua.field_d) {
            return cg.field_H;
        }
        if (param0) {
            field_m = null;
            return nh.field_D;
        }
        return nh.field_D;
    }

    final im b(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (!te.a(var4, true)) {
          return qf.field_d;
        } else {
          var5 = (CharSequence) (Object) param0;
          var3 = ta.a(var5, 121);
          if (var3 > param1) {
            if (-131 > (var3 ^ -1)) {
              return qf.field_d;
            } else {
              return dg.field_c;
            }
          } else {
            return qf.field_d;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        L0: {
          if (!param2) {
            break L0;
          } else {
            boolean discarded$1 = le.a(false, (byte) -3);
            break L0;
          }
        }
        L1: {
          L2: {
            if (lk.field_a == null) {
              break L2;
            } else {
              if (param0 > lk.field_a.length) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          lk.field_a = new int[2 * param0];
          break L1;
        }
        L3: {
          if (null == a.field_c) {
            break L3;
          } else {
            if (param0 <= a.field_c.length) {
              L4: {
                L5: {
                  if (null == oa.field_a) {
                    break L5;
                  } else {
                    if (oa.field_a.length < param0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                oa.field_a = new int[2 * param0];
                break L4;
              }
              if (null == oa.field_c) {
                L6: {
                  L7: {
                    oa.field_c = new int[2 * param0];
                    if (null == dd.field_L) {
                      break L7;
                    } else {
                      if (param0 > dd.field_L.length) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  dd.field_L = new int[2 * param0];
                  break L6;
                }
                if (al.field_bb == null) {
                  L8: {
                    L9: {
                      al.field_bb = new int[param0 * 2];
                      if (null == pf.field_b) {
                        break L9;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L8;
                  }
                  L10: {
                    if (dl.field_y == null) {
                      break L10;
                    } else {
                      if (dl.field_y.length >= param0) {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        break L10;
                      }
                    }
                  }
                  dl.field_y = new boolean[param0 * 2];
                  bd.field_a = 2147483647;
                  hm.field_L = 2147483647;
                  el.field_d = -2147483648;
                  pb.field_b = 0;
                  ok.field_j = -2147483648;
                  return;
                } else {
                  if (al.field_bb.length >= param0) {
                    L11: {
                      L12: {
                        if (null == pf.field_b) {
                          break L12;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L11;
                    }
                    if (dl.field_y == null) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      if (dl.field_y.length < param0) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    L13: {
                      L14: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L14;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L13;
                    }
                    L15: {
                      if (dl.field_y == null) {
                        break L15;
                      } else {
                        if (dl.field_y.length >= param0) {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          break L15;
                        }
                      }
                    }
                    dl.field_y = new boolean[param0 * 2];
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  }
                }
              } else {
                if (oa.field_c.length >= param0) {
                  L16: {
                    L17: {
                      if (null == dd.field_L) {
                        break L17;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L16;
                  }
                  if (al.field_bb == null) {
                    L18: {
                      L19: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L19;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L18;
                    }
                    if (dl.field_y == null) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      if (dl.field_y.length < param0) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    if (al.field_bb.length >= param0) {
                      L20: {
                        L21: {
                          if (null == pf.field_b) {
                            break L21;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L20;
                      }
                      if (dl.field_y == null) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        if (dl.field_y.length < param0) {
                          dl.field_y = new boolean[param0 * 2];
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L22: {
                        L23: {
                          al.field_bb = new int[param0 * 2];
                          if (null == pf.field_b) {
                            break L23;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L22;
                      }
                      if (dl.field_y == null) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        if (dl.field_y.length < param0) {
                          dl.field_y = new boolean[param0 * 2];
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L24: {
                    L25: {
                      oa.field_c = new int[2 * param0];
                      if (null == dd.field_L) {
                        break L25;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L24;
                  }
                  L26: {
                    L27: {
                      if (al.field_bb == null) {
                        break L27;
                      } else {
                        if (al.field_bb.length >= param0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    al.field_bb = new int[param0 * 2];
                    break L26;
                  }
                  L28: {
                    L29: {
                      if (null == pf.field_b) {
                        break L29;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L29;
                        } else {
                          break L28;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L28;
                  }
                  if (dl.field_y == null) {
                    dl.field_y = new boolean[param0 * 2];
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  } else {
                    if (dl.field_y.length < param0) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    }
                  }
                }
              }
            } else {
              break L3;
            }
          }
        }
        L30: {
          L31: {
            a.field_c = new int[2 * param0];
            if (null == oa.field_a) {
              break L31;
            } else {
              if (oa.field_a.length < param0) {
                break L31;
              } else {
                break L30;
              }
            }
          }
          oa.field_a = new int[2 * param0];
          break L30;
        }
        L32: {
          if (null == oa.field_c) {
            break L32;
          } else {
            if (oa.field_c.length < param0) {
              break L32;
            } else {
              L33: {
                L34: {
                  if (null == dd.field_L) {
                    break L34;
                  } else {
                    if (param0 > dd.field_L.length) {
                      break L34;
                    } else {
                      break L33;
                    }
                  }
                }
                dd.field_L = new int[2 * param0];
                break L33;
              }
              L35: {
                L36: {
                  if (al.field_bb == null) {
                    break L36;
                  } else {
                    if (al.field_bb.length >= param0) {
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                al.field_bb = new int[param0 * 2];
                break L35;
              }
              L37: {
                L38: {
                  if (null == pf.field_b) {
                    break L38;
                  } else {
                    if (param1 + param0 > pf.field_b.length) {
                      break L38;
                    } else {
                      break L37;
                    }
                  }
                }
                pf.field_b = new int[2 * (param1 + param0)];
                break L37;
              }
              L39: {
                if (dl.field_y == null) {
                  break L39;
                } else {
                  if (dl.field_y.length >= param0) {
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  } else {
                    break L39;
                  }
                }
              }
              dl.field_y = new boolean[param0 * 2];
              bd.field_a = 2147483647;
              hm.field_L = 2147483647;
              el.field_d = -2147483648;
              pb.field_b = 0;
              ok.field_j = -2147483648;
              return;
            }
          }
        }
        oa.field_c = new int[2 * param0];
        if (null != dd.field_L) {
          L40: {
            if (param0 > dd.field_L.length) {
              dd.field_L = new int[2 * param0];
              break L40;
            } else {
              break L40;
            }
          }
          L41: {
            L42: {
              if (al.field_bb == null) {
                break L42;
              } else {
                if (al.field_bb.length >= param0) {
                  break L41;
                } else {
                  break L42;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L41;
          }
          L43: {
            L44: {
              if (null == pf.field_b) {
                break L44;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L44;
                } else {
                  break L43;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L43;
          }
          L45: {
            if (dl.field_y == null) {
              break L45;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L45;
              }
            }
          }
          dl.field_y = new boolean[param0 * 2];
          bd.field_a = 2147483647;
          hm.field_L = 2147483647;
          el.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        } else {
          L46: {
            L47: {
              dd.field_L = new int[2 * param0];
              if (al.field_bb == null) {
                break L47;
              } else {
                if (al.field_bb.length >= param0) {
                  break L46;
                } else {
                  break L47;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L46;
          }
          L48: {
            L49: {
              if (null == pf.field_b) {
                break L49;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L49;
                } else {
                  break L48;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L48;
          }
          L50: {
            if (dl.field_y == null) {
              break L50;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L50;
              }
            }
          }
          dl.field_y = new boolean[param0 * 2];
          bd.field_a = 2147483647;
          hm.field_L = 2147483647;
          el.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        }
    }

    public static void e(byte param0) {
        field_m = null;
        field_r = null;
        field_q = null;
        field_n = null;
        field_p = null;
        field_o = null;
        field_s = null;
        if (param0 != -76) {
            le.e((byte) -47);
        }
    }

    le(ej param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        if (((le) this).b(param0, 0) == qf.field_d) {
            return field_m;
        }
        int var3 = -102 % ((26 - param1) / 56);
        return null;
    }

    final static void b(boolean param0) {
        if (param0) {
          L0: {
            ga.b((byte) 111);
            if (null != ae.field_G) {
              hk.a(ae.field_G, (byte) 6);
              break L0;
            } else {
              break L0;
            }
          }
          ab.a((byte) -128);
          rf.d((byte) 93);
          lf.a(param0);
          if (od.b(255)) {
            di.field_l.k(-17410, 1);
            bc.a(0, 0);
            gb.g(-17464);
            return;
          } else {
            gb.g(-17464);
            return;
          }
        } else {
          L1: {
            le.a(-62, 72, true);
            ga.b((byte) 111);
            if (null != ae.field_G) {
              hk.a(ae.field_G, (byte) 6);
              break L1;
            } else {
              break L1;
            }
          }
          ab.a((byte) -128);
          rf.d((byte) 93);
          lf.a(param0);
          if (!od.b(255)) {
            gb.g(-17464);
            return;
          } else {
            di.field_l.k(-17410, 1);
            bc.a(0, 0);
            gb.g(-17464);
            return;
          }
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException var2 = null;
            uc var4 = null;
            uc var5 = null;
            int stackIn_12_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != bd.field_k) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        bd.field_k = da.field_g.a(sb.field_i, wa.field_t, (byte) 60);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param1 > 82) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        String discarded$2 = le.a(false);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (bd.field_k.field_d == 0) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return false;
                    }
                    case 7: {
                        bl.field_h = ll.a(1000);
                        dm.field_c = ll.a(1000);
                        if (1 == bd.field_k.field_d) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        mh.field_a = ba.field_b;
                        bd.field_k = null;
                        return true;
                    }
                    case 9: {
                        try {
                            ig.field_e = new tf((java.net.Socket) bd.field_k.field_e, da.field_g);
                            di.field_l.field_k = 0;
                            var4 = mk.field_j;
                            var5 = var4;
                            mh.field_a = va.field_e;
                            if (!param0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = -2;
                            stackIn_12_0 = stackOut_10_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -1;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            wc.field_r = stackIn_12_0;
                            wf.field_n = stackIn_12_0;
                            uc.field_r = stackIn_12_0;
                            var5.field_k = 0;
                            ej.a(gi.field_v, -25563, (dh) (Object) di.field_l, ij.field_d, hb.field_i);
                            bc.a(-1, 0);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        bd.field_k = null;
                        return true;
                    }
                    case 14: {
                        var2 = (IOException) (Object) caughtException;
                        mh.field_a = ba.field_b;
                        bd.field_k = null;
                        return true;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please enter your age in years";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = new rh(14, 0, 4, 1);
        field_s = new int[]{3, 3, 3, 55, 7, 7, 7, -1, 8, 9, 10, 11, -1, -1, -1, -1, -1, -1, -1, -1, 23, 23, 23, 55, 27, 27, 27, -1, 31, 31, 31, 68, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, 47, -1, 51, 51, 51, -1, 55, 55, 55, -1, 59, 59, 59, -1, 63, 63, 63, -1, 67, 67, 67, -1, 71, 71, 71, -1, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
