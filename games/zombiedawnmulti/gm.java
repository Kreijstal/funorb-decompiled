/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gm extends ti {
    private int field_mb;
    private int field_nb;
    private int field_ib;
    int field_fb;
    private boolean field_gb;
    int[] field_cb;
    static String field_ob;
    static String[] field_pb;
    private boolean field_db;
    private int field_qb;
    private int field_eb;
    int[] field_hb;
    boolean field_jb;
    private int field_lb;
    int field_kb;

    final static void f(int param0, int param1) {
        lo.field_f = aq.field_l[param1];
        ud.field_Y = bp.field_v[param1];
        if (param0 != -7733) {
            field_ob = null;
        }
        nh.field_n = kd.field_c[param1];
    }

    final void b(int param0, int param1) {
        if (((gm) this).field_K == 0) {
            if (-2 == (param0 ^ -1)) {
                if (hp.a((byte) 29, g.field_a, 4) == 0) {
                    ((gm) this).field_U = pb.a((byte) 62, ((gm) this).field_mb);
                }
            }
        }
        super.b(param0, param1);
    }

    abstract void a(nm param0, byte param1);

    final int q(int param0) {
        if (param0 != -5183) {
            return 32;
        }
        int var2 = ((gm) this).field_C;
        if (-3 != (var2 ^ -1)) {
            if (var2 != 4) {
                if (!(6 == var2)) {
                    return eb.field_A;
                }
            }
        }
        return n.field_i;
    }

    public static void o(int param0) {
        if (param0 != 24461) {
            field_ob = null;
        }
        field_pb = null;
        field_ob = null;
    }

    private final void p(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = ((gm) this).g(-96);
        int var3 = ((gm) this).h(70);
        int var4 = 0;
        if (param0 < 113) {
            return;
        }
        while (var4 < -1 + ((gm) this).field_fb) {
            ((gm) this).field_cb[var4] = var2 + jk.field_l[var4];
            ((gm) this).field_hb[var4] = jk.field_b[var4] + var3;
            var4++;
        }
        ((gm) this).field_cb[((gm) this).field_fb + -1] = var2;
        ((gm) this).field_hb[((gm) this).field_fb + -1] = var3;
    }

    gm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((gm) this).field_fb = 61;
        ((gm) this).field_gb = false;
        ((gm) this).field_ib = 0;
        ((gm) this).field_nb = 0;
        ((gm) this).field_db = false;
        ((gm) this).field_eb = 0;
        ((gm) this).field_jb = false;
        ((gm) this).field_qb = -1;
        ((gm) this).field_ib = hp.a((byte) 89, g.field_a, 200);
        ((gm) this).field_cb = new int[61];
        ((gm) this).field_hb = new int[61];
        this.p(118);
        ((gm) this).field_lb = hp.a((byte) -122, g.field_a, 5);
        if (((gm) this).m(15684)) {
            ((gm) this).field_mb = hp.a((byte) -119, g.field_a, 4) + 49;
        } else {
            ((gm) this).field_mb = 26 - -hp.a((byte) 124, g.field_a, 3);
        }
    }

    final void b(boolean param0) {
        if (!(((gm) this).field_K != 18)) {
            return;
        }
        ((gm) this).b(18, -27655);
        fb.field_e.f(127);
        if (param0) {
            ((gm) this).field_kb = -115;
        }
        op.field_m.a(-112, (ff) this);
    }

    final void a(int param0, nm param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ja[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        ri var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        ja stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        ja stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        ja stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_59_0 = 0;
        ja stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        ja stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        ja stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((gm) this).field_K == 20) {
          return;
        } else {
          L0: {
            var3 = -24 + param1.c(((gm) this).g(109), -20126);
            var4 = param1.d(((gm) this).h(param0 ^ -10222), 127) + -48;
            if (null != ((gm) this).field_U) {
              if (((gm) this).field_U.k()) {
                ((gm) this).field_U = null;
                break L0;
              } else {
                ((gm) this).field_U.h(sd.b(124, var4, var3));
                ((gm) this).field_U.f(pb.a(var4, var3, false));
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (i.field_b) {
              ((gm) this).a(param1, (byte) 80);
              break L1;
            } else {
              break L1;
            }
          }
          if (!io.a(var3, var4, (byte) -112, param1)) {
            return;
          } else {
            L2: {
              if ((((gm) this).field_K ^ -1) != -33) {
                break L2;
              } else {
                L3: {
                  if ((((gm) this).field_qb ^ -1) != 0) {
                    break L3;
                  } else {
                    ((gm) this).field_qb = wf.field_m;
                    break L3;
                  }
                }
                var5 = -((gm) this).field_qb + wf.field_m;
                if ((var5 ^ -1) < -151) {
                  return;
                } else {
                  var5 = (int)(128.0 * Math.sin((double)var5 / 10.0 * (1.0 + (double)var5 / 33.3)));
                  if (-1 >= (var5 ^ -1)) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
            }
            L4: {
              if (((gm) this).field_K != 17) {
                L5: {
                  stackOut_24_0 = ig.field_d[1];
                  stackOut_24_1 = 12;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (((gm) this).field_F != 3) {
                    stackOut_26_0 = (ja) (Object) stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = -3 + var3;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    break L5;
                  } else {
                    stackOut_25_0 = (ja) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = var3 - 2;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackIn_27_2 = stackOut_25_2;
                    break L5;
                  }
                }
                g.a(stackIn_27_0, stackIn_27_1 + stackIn_27_2, 43 + var4);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              var5 = ((gm) this).field_ab;
              if (gg.field_i[((gm) this).field_K] == null) {
                break L6;
              } else {
                var5 = gg.field_i[((gm) this).field_K][((gm) this).field_ab];
                break L6;
              }
            }
            var6 = var5 + gg.field_l[((gm) this).field_K];
            if (param0 == -10136) {
              L7: {
                L8: {
                  var7 = wq.field_c[((gm) this).field_C];
                  if ((((gm) this).field_K ^ -1) == -11) {
                    break L8;
                  } else {
                    if ((((gm) this).field_K ^ -1) != -12) {
                      if (-22 != (((gm) this).field_K ^ -1)) {
                        L9: {
                          var8 = 3 + var4;
                          var9 = wf.field_m / 4 % aa.field_h.length;
                          var10 = null;
                          if (-26 != (((gm) this).field_K ^ -1)) {
                            if (30 == ((gm) this).field_K) {
                              var10_ref = sh.field_N[var9];
                              break L9;
                            } else {
                              break L9;
                            }
                          } else {
                            var10_ref = aa.field_h[var9];
                            break L9;
                          }
                        }
                        L10: {
                          if (var10_ref == null) {
                            break L10;
                          } else {
                            var10_ref.a(var3, var8);
                            break L10;
                          }
                        }
                        L11: {
                          if ((var6 ^ -1) > -1) {
                            break L11;
                          } else {
                            if (var6 < var7.length) {
                              L12: {
                                if ((((gm) this).field_F ^ -1) != -2) {
                                  stackOut_58_0 = 0;
                                  stackIn_59_0 = stackOut_58_0;
                                  break L12;
                                } else {
                                  stackOut_57_0 = 1;
                                  stackIn_59_0 = stackOut_57_0;
                                  break L12;
                                }
                              }
                              var11 = stackIn_59_0;
                              if (0 < ((gm) this).field_G) {
                                L13: {
                                  if (var11 != 0) {
                                    g.a(var7[var6]);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                var7[var6].d(var3, var4, 142);
                                if (var11 != 0) {
                                  g.a(var7[var6]);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              } else {
                                if (var11 != 0) {
                                  var7[var6].b(var3, var4);
                                  break L11;
                                } else {
                                  var7[var6].g(var3, var4);
                                  break L11;
                                }
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (var10_ref == null) {
                          break L7;
                        } else {
                          g.c();
                          oo.h(var3, var10_ref.field_b / 2 + var8, 640, var10_ref.field_b + var8);
                          var10_ref.a(var3, var8);
                          g.b();
                          break L7;
                        }
                      } else {
                        var7[var6].c(var3, var4, ((gm) this).field_N);
                        break L7;
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                if ((((gm) this).field_F ^ -1) == -3) {
                  var7[var6 + 2].g(var3, var4);
                  break L7;
                } else {
                  if (((gm) this).field_F == 0) {
                    var7[4 + var6].g(var3, var4);
                    break L7;
                  } else {
                    if ((((gm) this).field_F ^ -1) != -4) {
                      if (1 == ((gm) this).field_F) {
                        var7[var6].b(var3, var4);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      var7[var6].g(var3, var4);
                      break L7;
                    }
                  }
                }
              }
              L14: {
                if (((gm) this).field_jb) {
                  ig.field_d[0].e(var3, var4, 128, 16711680);
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param2 < 2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -37) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  if (0 > param0) {
                    break L1;
                  } else {
                    var4 = 2;
                    var5 = param0 / param2;
                    L2: while (true) {
                      if (-1 == (var5 ^ -1)) {
                        var14 = new char[var4];
                        var13 = var14;
                        var12 = var13;
                        var11 = var12;
                        var6 = var11;
                        var6[0] = (char)43;
                        var7 = var4 + param3;
                        L3: while (true) {
                          if ((var7 ^ -1) >= -1) {
                            return new String(var14);
                          } else {
                            var8 = param0;
                            param0 = param0 / param2;
                            var9 = var8 + -(param0 * param2);
                            if ((var9 ^ -1) > -11) {
                              var6[var7] = (char)(48 + var9);
                              var7--;
                              continue L3;
                            } else {
                              var6[var7] = (char)(var9 + 87);
                              var7--;
                              continue L3;
                            }
                          }
                        }
                      } else {
                        var4++;
                        var5 = var5 / param2;
                        continue L2;
                      }
                    }
                  }
                }
              }
              return Integer.toString(param0, param2);
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    final void f(byte param0) {
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        super.f((byte) -95);
        ((gm) this).c(30818, ((gm) this).field_K);
        if (param0 <= -79) {
          L0: {
            if (-33 == (((gm) this).field_K ^ -1)) {
              L1: {
                if (((gm) this).field_qb != -1) {
                  break L1;
                } else {
                  ((gm) this).field_qb = wf.field_m;
                  break L1;
                }
              }
              var2 = wf.field_m + -((gm) this).field_qb;
              if (150 < var2) {
                ((gm) this).b(false);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (((gm) this).field_K == -1) {
              L3: {
                ((gm) this).field_eb = ((gm) this).field_eb + 1;
                if (((gm) this).field_ib < ((gm) this).field_eb + 1) {
                  L4: {
                    stackOut_47_0 = this;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_48_0 = stackOut_47_0;
                    if (((gm) this).field_gb) {
                      stackOut_49_0 = this;
                      stackOut_49_1 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      stackIn_50_1 = stackOut_49_1;
                      break L4;
                    } else {
                      stackOut_48_0 = this;
                      stackOut_48_1 = 1;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      break L4;
                    }
                  }
                  ((gm) this).field_gb = stackIn_50_1 != 0;
                  ((gm) this).field_eb = 0;
                  if (((gm) this).field_gb) {
                    ((gm) this).field_ib = 53;
                    break L3;
                  } else {
                    L5: {
                      stackOut_51_0 = this;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_52_0 = stackOut_51_0;
                      if (!((gm) this).field_gb) {
                        stackOut_53_0 = this;
                        stackOut_53_1 = 20 + hp.a((byte) -67, g.field_a, 200);
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        break L5;
                      } else {
                        stackOut_52_0 = this;
                        stackOut_52_1 = 65;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        break L5;
                      }
                    }
                    ((gm) this).field_ib = stackIn_54_1;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (!((gm) this).field_gb) {
                ((gm) this).field_ab = 0;
                break L2;
              } else {
                break L2;
              }
            } else {
              if (((gm) this).field_K == 2) {
                ((gm) this).i(5197);
                if (4 <= ((gm) this).field_ab) {
                  L6: {
                    if (-5 != (((gm) this).field_ab ^ -1)) {
                      if ((((gm) this).field_ab ^ -1) != -7) {
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      L7: {
                        ((gm) this).field_Q = 0;
                        ((gm) this).field_nb = ((gm) this).field_nb + 1;
                        if (400 > ((gm) this).field_nb) {
                          break L7;
                        } else {
                          ((gm) this).field_ab = ((gm) this).field_ab + 1;
                          break L7;
                        }
                      }
                      ((gm) this).field_S = 0;
                      ((gm) this).field_X = 0;
                      break L6;
                    }
                  }
                  return;
                } else {
                  ((gm) this).field_Q = ((gm) this).field_Q + 1;
                  return;
                }
              } else {
                if (-2 != ((gm) this).field_K) {
                  if ((((gm) this).field_K ^ -1) != -4) {
                    if ((((gm) this).field_K ^ -1) != -17) {
                      if (20 != ((gm) this).field_K) {
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  L8: {
                    ((gm) this).field_lb = ((gm) this).field_lb + 1;
                    if ((((gm) this).field_lb ^ -1) > -6) {
                      break L8;
                    } else {
                      ((gm) this).field_lb = 0;
                      var2 = 0;
                      var3 = op.field_m.field_A.c(103);
                      L9: while (true) {
                        if (!(var3 instanceof cg)) {
                          L10: {
                            L11: {
                              if (((gm) this).field_db) {
                                break L11;
                              } else {
                                if (var2 != 0) {
                                  ((gm) this).d(6, ((gm) this).field_bb >> 1235455810);
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (!((gm) this).field_db) {
                              break L10;
                            } else {
                              if (var2 == 0) {
                                ((gm) this).d(6, ((gm) this).field_bb);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L12: {
                            stackOut_24_0 = this;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (var2 == 0) {
                              stackOut_26_0 = this;
                              stackOut_26_1 = 0;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              break L12;
                            } else {
                              stackOut_25_0 = this;
                              stackOut_25_1 = 1;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              break L12;
                            }
                          }
                          ((gm) this).field_db = stackIn_27_1 != 0;
                          break L8;
                        } else {
                          var2 = var2 != 0 | ((cg) (Object) var3).a((gm) this, false) ? 1 : 0;
                          var3 = var3.field_d;
                          continue L9;
                        }
                      }
                    }
                  }
                  ((gm) this).i(5197);
                  if (!((gm) this).k(-125)) {
                    break L2;
                  } else {
                    ((gm) this).b(0, -27655);
                    break L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void n(int param0) {
        ((gm) this).b(param0, -27655);
    }

    final boolean m(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            var2 = ((gm) this).field_C;
            if (var2 == -1) {
              break L1;
            } else {
              if (var2 != 1) {
                if (-3 != var2) {
                  L2: {
                    if (var2 != -4) {
                      if (var2 != -5) {
                        if (-6 != var2) {
                          if (-7 == var2) {
                            return true;
                          } else {
                            if (var2 == 7) {
                              return true;
                            } else {
                              if (-9 != (var2 ^ -1)) {
                                if (9 == var2) {
                                  return false;
                                } else {
                                  if (var2 != 10) {
                                    if (var2 != -12) {
                                      L3: {
                                        if (-13 == var2) {
                                          break L3;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (14 != var2) {
                                              if (var2 == 15) {
                                                return true;
                                              } else {
                                                if (var2 == -17) {
                                                  return true;
                                                } else {
                                                  if (-19 != var2) {
                                                    if (var2 != -20) {
                                                      if (-21 == var2) {
                                                        return true;
                                                      } else {
                                                        if (-22 != var2) {
                                                          if (-23 != var2) {
                                                            L4: {
                                                              if (param0 == 15684) {
                                                                break L4;
                                                              } else {
                                                                ((gm) this).l(127);
                                                                break L4;
                                                              }
                                                            }
                                                            return true;
                                                          } else {
                                                            stackOut_35_0 = 1;
                                                            stackIn_37_0 = stackOut_35_0;
                                                            break L0;
                                                          }
                                                        } else {
                                                          return false;
                                                        }
                                                      }
                                                    } else {
                                                      return true;
                                                    }
                                                  } else {
                                                    return true;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L3;
                                            }
                                          } else {
                                            break L3;
                                          }
                                        }
                                      }
                                      return true;
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    return true;
                                  }
                                }
                              } else {
                                return true;
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  return true;
                } else {
                  break L1;
                }
              } else {
                return false;
              }
            }
          }
          stackOut_36_0 = 0;
          stackIn_37_0 = stackOut_36_0;
          break L0;
        }
        return stackIn_37_0 != 0;
    }

    final void l(int param0) {
        int var2 = -57 % ((0 - param0) / 33);
        ((gm) this).b(0, -27655);
    }

    final static void a(long param0, String param1, int param2) {
        va.field_a = 2;
        if (param2 != -1) {
            field_ob = null;
        }
        qf.field_g = param1;
        CharSequence var5 = (CharSequence) (Object) param1;
        ql.field_a = tg.a(var5, false);
        sq.field_N = true;
        jj.field_M = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = new String[]{"Prepare your forces!", "Get ready to grumble!", "Get ready to mumble!", "Get ready!", "He who scares, wins!", "Ready, set, groan!", "Let's get shuffling!", "To arms!", "Break a leg!", "Dinner is served...", "Rattle 'em bones!", "Get ready to fright!", "Not by force, by bile!", "Unsteady, set, shuffle!", "Time to greet and eat!", "Go eat 'em!", "Moan-bilise your troops!", "Get ready to outbreak!", "It's goo time.", "Got the fright stuff?", "Here come the hordes.", "First rule of Overlord club...", "Grah rarr growwwl!", "It's time to take over!", "It's a good day to undie.", "Undead and loving it...", "Stop! Zombie time."};
        field_ob = "This game is full.";
    }
}
