/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc extends ib {
    static jp field_J;
    static int field_K;
    static boolean field_H;
    private int field_L;
    private cp field_I;
    static vl field_M;
    boolean field_N;

    private final int h() {
        return !((jc) this).field_N ? 0 : (Object) (Object) ((jc) this).field_I.g(-125) == this ? 256 : 0;
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int discarded$1 = 90;
        var2 = this.h();
        var3 = var2 - ((jc) this).field_L;
        if (var3 <= 0) {
          if (param0 > var3) {
            L0: {
              L1: {
                ((jc) this).field_L = ((jc) this).field_L + (1 + (-16 + var3)) / 16;
                if (((jc) this).field_L != 0) {
                  break L1;
                } else {
                  if (var2 != 0) {
                    break L1;
                  } else {
                    if (((jc) this).field_N) {
                      break L1;
                    } else {
                      stackOut_27_0 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      break L0;
                    }
                  }
                }
              }
              stackOut_28_0 = 0;
              stackIn_29_0 = stackOut_28_0;
              break L0;
            }
            return stackIn_29_0 != 0;
          } else {
            L2: {
              L3: {
                if (((jc) this).field_L != 0) {
                  break L3;
                } else {
                  if (var2 != 0) {
                    break L3;
                  } else {
                    if (((jc) this).field_N) {
                      break L3;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          ((jc) this).field_L = ((jc) this).field_L + (-1 + var3 + 8) / 8;
          if (param0 <= var3) {
            if (((jc) this).field_L == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L4: {
                  if (((jc) this).field_N) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L4;
                  }
                }
                return stackIn_14_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L5: {
              L6: {
                ((jc) this).field_L = ((jc) this).field_L + (1 + (-16 + var3)) / 16;
                if (((jc) this).field_L != 0) {
                  break L6;
                } else {
                  if (var2 != 0) {
                    break L6;
                  } else {
                    if (((jc) this).field_N) {
                      break L6;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L5;
                    }
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L5;
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_J = null;
        field_M = null;
        if (param0 != -17) {
            field_M = null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != ((jc) this).field_L) {
          if (((jc) this).field_L < 256) {
            if (nl.field_e != null) {
              if (((jc) this).field_t <= nl.field_e.field_D) {
                if (((jc) this).field_s <= nl.field_e.field_C) {
                  fc.a(-109, nl.field_e);
                  lb.d();
                  ((jc) this).b(0, param3 ^ -281, 0);
                  super.a(-param0 - ((jc) this).field_w, -param1 - ((jc) this).field_o, param2, param3);
                  sc.b(-117);
                  nl.field_e.b(param1 + ((jc) this).field_o, param0 + ((jc) this).field_w, ((jc) this).field_L);
                  return;
                } else {
                  nl.field_e = new jp(((jc) this).field_t, ((jc) this).field_s);
                  fc.a(-109, nl.field_e);
                  lb.d();
                  ((jc) this).b(0, param3 ^ -281, 0);
                  super.a(-param0 - ((jc) this).field_w, -param1 - ((jc) this).field_o, param2, param3);
                  sc.b(-117);
                  nl.field_e.b(param1 + ((jc) this).field_o, param0 + ((jc) this).field_w, ((jc) this).field_L);
                  return;
                }
              } else {
                nl.field_e = new jp(((jc) this).field_t, ((jc) this).field_s);
                fc.a(-109, nl.field_e);
                lb.d();
                ((jc) this).b(0, param3 ^ -281, 0);
                super.a(-param0 - ((jc) this).field_w, -param1 - ((jc) this).field_o, param2, param3);
                sc.b(-117);
                nl.field_e.b(param1 + ((jc) this).field_o, param0 + ((jc) this).field_w, ((jc) this).field_L);
                return;
              }
            } else {
              nl.field_e = new jp(((jc) this).field_t, ((jc) this).field_s);
              fc.a(-109, nl.field_e);
              lb.d();
              ((jc) this).b(0, param3 ^ -281, 0);
              super.a(-param0 - ((jc) this).field_w, -param1 - ((jc) this).field_o, param2, param3);
              sc.b(-117);
              nl.field_e.b(param1 + ((jc) this).field_o, param0 + ((jc) this).field_w, ((jc) this).field_L);
              return;
            }
          } else {
            if (0 != param2) {
              return;
            } else {
              ((jc) this).b(((jc) this).field_o + param1, 274, ((jc) this).field_w + param0);
              super.a(param0, param1, param2, (byte) -11);
              return;
            }
          }
        } else {
          return;
        }
    }

    final oc g(byte param0) {
        oc var2 = super.g(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (oc) this;
    }

    jc(cp param0, int param1, int param2) {
        super(mn.field_y + -param1 >> 1, -param2 + r.field_w >> 1, param1, param2, (ub) null);
        try {
            ((jc) this).field_N = false;
            ((jc) this).field_I = param0;
            ((jc) this).field_L = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_H = false;
          ((jc) this).a(param1, -param2 + mn.field_y >> 1, r.field_w - param1 >> 1, (byte) -119, param2);
          return;
        } else {
          ((jc) this).a(param1, -param2 + mn.field_y >> 1, r.field_w - param1 >> 1, (byte) -119, param2);
          return;
        }
    }

    abstract void b(int param0, int param1, int param2);

    final static void a(java.applet.Applet param0) {
        try {
            da.a("", 121, param0);
            mi.a((byte) -111, param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "jc.PB(" + (param0 != null ? "{...}" : "null") + ',' + 97 + ')');
        }
    }

    boolean a(int param0) {
        if (param0 <= -22) {
          int discarded$4 = 90;
          ((jc) this).field_L = this.h();
          if (((jc) this).field_L == 0) {
            if (((jc) this).field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((jc) this).field_L = 90;
          int discarded$5 = 90;
          ((jc) this).field_L = this.h();
          if (((jc) this).field_L == 0) {
            if (((jc) this).field_N) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param2 >= -84) {
          L0: {
            jc.a((byte) 8);
            if (0 == param1) {
              if (pp.field_a != 14) {
                if (pp.field_a == 0) {
                  if ((4 & param0) != 0) {
                    ga.field_i = 2;
                    pp.field_a = 2;
                    jl.field_a = 25;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (pp.field_a != 1) {
                    if (!ka.a((byte) 91)) {
                      break L0;
                    } else {
                      if (ga.field_i == 0) {
                        if (param0 != 0) {
                          L1: {
                            if ((param0 & 4) != 0) {
                              pp.field_a = 2;
                              jl.field_a = 25;
                              ga.field_i = 2;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                          im.b(-8);
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        L2: {
                          if (ga.field_i == 1) {
                            break L2;
                          } else {
                            if (ga.field_i == 12) {
                              break L2;
                            } else {
                              return;
                            }
                          }
                        }
                        if (0 == (param0 & 4)) {
                          break L0;
                        } else {
                          im.b(-8);
                          return;
                        }
                      }
                    }
                  } else {
                    if ((4 & param0) != 0) {
                      ga.field_i = 2;
                      pp.field_a = 2;
                      jl.field_a = 25;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (0 == (3 & param0)) {
                  if ((param0 & 4) != 0) {
                    pp.field_a = 2;
                    ga.field_i = 2;
                    jl.field_a = 25;
                    return;
                  } else {
                    return;
                  }
                } else {
                  pp.field_a = 0;
                  jl.field_a = 250;
                  ga.field_i = 0;
                  if ((param0 & 4) != 0) {
                    pp.field_a = 2;
                    ga.field_i = 2;
                    jl.field_a = 25;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (1 == param1) {
                ab.field_E = ab.field_E + 1;
                if ((param0 & 2) == 0) {
                  if (pp.field_a == 3) {
                    if (ab.field_E > 2) {
                      mn.field_v = de.field_x;
                      ga.field_i = 4;
                      tb.field_eb = o.field_a;
                      pp.field_a = -1;
                      return;
                    } else {
                      if (dj.field_d > 0) {
                        mn.field_v = de.field_x;
                        ga.field_i = 4;
                        tb.field_eb = o.field_a;
                        pp.field_a = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    dj.field_d = dj.field_d + 1;
                    if (pp.field_a == 3) {
                      if (ab.field_E > 2) {
                        mn.field_v = de.field_x;
                        ga.field_i = 4;
                        tb.field_eb = o.field_a;
                        pp.field_a = -1;
                        break L3;
                      } else {
                        if (dj.field_d > 0) {
                          mn.field_v = de.field_x;
                          ga.field_i = 4;
                          tb.field_eb = o.field_a;
                          pp.field_a = -1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  return;
                }
              } else {
                if (param1 == 2) {
                  if ((pi.field_q & 1 << param0) == 0) {
                    L4: {
                      L5: {
                        kf.field_k = param0;
                        ga.field_i = 6;
                        if (0 != pi.field_q) {
                          break L5;
                        } else {
                          if (!kb.field_Sb) {
                            ga.field_i = 5;
                            tb.field_eb = tb.field_db + "<br><br>" + sl.field_A[kf.field_k];
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      da.field_G = pp.field_a;
                      tb.field_eb = sl.field_A[kf.field_k];
                      break L4;
                    }
                    pp.field_a = -1;
                    pi.field_q = pi.field_q | 1 << param0;
                    kb.field_Sb = true;
                    mn.field_v = de.field_x;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (param1 == 3) {
                    if (pp.field_a == 5) {
                      ga.field_i = 8;
                      jl.field_a = 250;
                      pp.field_a = -1;
                      tb.field_eb = rd.a(kq.field_n, new String[1], (byte) 103);
                      wc.field_b = true;
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    if (4 == param1) {
                      if (pp.field_a == 5) {
                        ga.field_i = 9;
                        pp.field_a = -1;
                        jl.field_a = 250;
                        tb.field_eb = rd.a(tl.field_c, new String[1], (byte) 103);
                        wc.field_b = true;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      if (5 != param1) {
                        if (param1 == 6) {
                          if (pp.field_a == 11) {
                            if (!cm.field_s) {
                              ga.field_i = 12;
                              pp.field_a = -1;
                              tb.field_eb = rh.field_a;
                              mn.field_v = de.field_x;
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            return;
                          }
                        } else {
                          break L0;
                        }
                      } else {
                        if (pp.field_a != 5) {
                          if (!rf.field_f) {
                            if (!wl.field_N) {
                              da.field_G = pp.field_a;
                              ga.field_i = 10;
                              rf.field_f = true;
                              tb.field_eb = kb.field_Tb;
                              pp.field_a = -1;
                              break L0;
                            } else {
                              break L0;
                            }
                          } else {
                            return;
                          }
                        } else {
                          ga.field_i = 9;
                          jl.field_a = 250;
                          pp.field_a = -1;
                          tb.field_eb = rd.a(tl.field_c, new String[1], (byte) 103);
                          wc.field_b = true;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          L6: {
            if (0 == param1) {
              if (pp.field_a != 14) {
                if (pp.field_a == 0) {
                  if ((4 & param0) != 0) {
                    ga.field_i = 2;
                    pp.field_a = 2;
                    jl.field_a = 25;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (pp.field_a != 1) {
                    if (!ka.a((byte) 91)) {
                      break L6;
                    } else {
                      if (ga.field_i == 0) {
                        if (param0 != 0) {
                          L7: {
                            if ((param0 & 4) != 0) {
                              pp.field_a = 2;
                              jl.field_a = 25;
                              ga.field_i = 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          im.b(-8);
                          break L6;
                        } else {
                          return;
                        }
                      } else {
                        L8: {
                          if (ga.field_i == 1) {
                            break L8;
                          } else {
                            if (ga.field_i == 12) {
                              break L8;
                            } else {
                              return;
                            }
                          }
                        }
                        if (0 == (param0 & 4)) {
                          break L6;
                        } else {
                          im.b(-8);
                          return;
                        }
                      }
                    }
                  } else {
                    L9: {
                      if ((4 & param0) != 0) {
                        ga.field_i = 2;
                        pp.field_a = 2;
                        jl.field_a = 25;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                }
              } else {
                L10: {
                  if (0 == (3 & param0)) {
                    break L10;
                  } else {
                    pp.field_a = 0;
                    jl.field_a = 250;
                    ga.field_i = 0;
                    break L10;
                  }
                }
                if ((param0 & 4) != 0) {
                  pp.field_a = 2;
                  ga.field_i = 2;
                  jl.field_a = 25;
                  break L6;
                } else {
                  break L6;
                }
              }
            } else {
              if (1 == param1) {
                L11: {
                  ab.field_E = ab.field_E + 1;
                  if ((param0 & 2) == 0) {
                    break L11;
                  } else {
                    dj.field_d = dj.field_d + 1;
                    break L11;
                  }
                }
                if (pp.field_a == 3) {
                  if (ab.field_E > 2) {
                    mn.field_v = de.field_x;
                    ga.field_i = 4;
                    tb.field_eb = o.field_a;
                    pp.field_a = -1;
                    break L6;
                  } else {
                    if (dj.field_d > 0) {
                      mn.field_v = de.field_x;
                      ga.field_i = 4;
                      tb.field_eb = o.field_a;
                      pp.field_a = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                } else {
                  break L6;
                }
              } else {
                if (param1 == 2) {
                  if ((pi.field_q & 1 << param0) == 0) {
                    L12: {
                      L13: {
                        kf.field_k = param0;
                        ga.field_i = 6;
                        if (0 != pi.field_q) {
                          break L13;
                        } else {
                          if (!kb.field_Sb) {
                            ga.field_i = 5;
                            tb.field_eb = tb.field_db + "<br><br>" + sl.field_A[kf.field_k];
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      da.field_G = pp.field_a;
                      tb.field_eb = sl.field_A[kf.field_k];
                      break L12;
                    }
                    pp.field_a = -1;
                    pi.field_q = pi.field_q | 1 << param0;
                    kb.field_Sb = true;
                    mn.field_v = de.field_x;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  if (param1 == 3) {
                    if (pp.field_a != 5) {
                      break L6;
                    } else {
                      ga.field_i = 8;
                      jl.field_a = 250;
                      pp.field_a = -1;
                      tb.field_eb = rd.a(kq.field_n, new String[1], (byte) 103);
                      wc.field_b = true;
                      break L6;
                    }
                  } else {
                    if (4 == param1) {
                      if (pp.field_a == 5) {
                        ga.field_i = 9;
                        pp.field_a = -1;
                        jl.field_a = 250;
                        tb.field_eb = rd.a(tl.field_c, new String[1], (byte) 103);
                        wc.field_b = true;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      if (5 != param1) {
                        if (param1 == 6) {
                          if (pp.field_a != 11) {
                            break L6;
                          } else {
                            if (!cm.field_s) {
                              ga.field_i = 12;
                              pp.field_a = -1;
                              tb.field_eb = rh.field_a;
                              mn.field_v = de.field_x;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        if (pp.field_a != 5) {
                          if (rf.field_f) {
                            break L6;
                          } else {
                            if (!wl.field_N) {
                              da.field_G = pp.field_a;
                              ga.field_i = 10;
                              rf.field_f = true;
                              tb.field_eb = kb.field_Tb;
                              pp.field_a = -1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          ga.field_i = 9;
                          jl.field_a = 250;
                          pp.field_a = -1;
                          tb.field_eb = rd.a(tl.field_c, new String[1], (byte) 103);
                          wc.field_b = true;
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 4;
        field_M = null;
    }
}
