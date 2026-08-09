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
            field_ob = (String) null;
        }
        nh.field_n = kd.field_c[param1];
    }

    final void b(int param0, int param1) {
        if (this.field_K == 0 && -2 == (param0 ^ -1) && hp.a((byte) 29, g.field_a, 4) == 0) {
            this.field_U = pb.a((byte) 62, this.field_mb);
        }
        super.b(param0, param1);
    }

    abstract void a(nm param0, byte param1);

    final int q(int param0) {
        int var2;
        if (param0 == -5183) {
          var2 = this.field_C;
          if (-3 != (var2 ^ -1)) {
            if (var2 != 4) {
              if (6 == var2) {
                if (ZombieDawnMulti.field_E) {
                  return eb.field_A;
                } else {
                  return n.field_i;
                }
              } else {
                return eb.field_A;
              }
            } else {
              return n.field_i;
            }
          } else {
            return n.field_i;
          }
        } else {
          return 32;
        }
    }

    public static void o(int param0) {
        if (param0 != 24461) {
            field_ob = (String) null;
        }
        field_pb = null;
        field_ob = null;
    }

    private final void p(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = this.g(-96);
                    var3 = this.h(70);
                    var4 = 0;
                    if (param0 < 113) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (var4 >= -1 + this.field_fb) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_cb[var4] = var2 + jk.field_l[var4];
                    this.field_hb[var4] = jk.field_b[var4] + var3;
                    var4++;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_cb[this.field_fb + -1] = var2;
                    this.field_hb[this.field_fb + -1] = var3;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    gm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        L0: {
          L1: {
            this.field_fb = 61;
            this.field_gb = false;
            this.field_ib = 0;
            this.field_nb = 0;
            this.field_db = false;
            this.field_eb = 0;
            this.field_jb = false;
            this.field_qb = -1;
            this.field_ib = hp.a((byte) 89, g.field_a, 200);
            this.field_cb = new int[61];
            this.field_hb = new int[61];
            this.p(118);
            this.field_lb = hp.a((byte) -122, g.field_a, 5);
            if (!this.m(15684)) {
              break L1;
            } else {
              this.field_mb = hp.a((byte) -119, g.field_a, 4) + 49;
              if (!ZombieDawnMulti.field_E) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_mb = 26 - -hp.a((byte) 124, g.field_a, 3);
          break L0;
        }
    }

    final void b(boolean param0) {
        if (!(this.field_K != 18)) {
            return;
        }
        this.b(18, -27655);
        fb.field_e.f(127);
        if (param0) {
            this.field_kb = -115;
        }
        op.field_m.a(-112, (ff) (this));
    }

    final void a(int param0, nm param1) {
        ja stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        ja stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ja[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_K == 20) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = -24 + param1.c(this.g(109), -20126);
                var4 = param1.d(this.h(param0 ^ -10222), 127) + -48;
                if (null != this.field_U) {
                  L2: {
                    if (this.field_U.k()) {
                      break L2;
                    } else {
                      this.field_U.h(sd.b(124, var4, var3_int));
                      this.field_U.f(pb.a(var4, var3_int, false));
                      if (var12 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.field_U = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              L3: {
                if (i.field_b) {
                  this.a(param1, (byte) 80);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (!io.a(var3_int, var4, (byte) -112, param1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if ((this.field_K ^ -1) != -33) {
                    break L4;
                  } else {
                    L5: {
                      if ((this.field_qb ^ -1) != 0) {
                        break L5;
                      } else {
                        this.field_qb = wf.field_m;
                        break L5;
                      }
                    }
                    var5 = -this.field_qb + wf.field_m;
                    if ((var5 ^ -1) < -151) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var5 = (int)(128.0 * Math.sin((double)var5 / 10.0 * (1.0 + (double)var5 / 33.3)));
                      if (-1 >= (var5 ^ -1)) {
                        break L4;
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                L6: {
                  if (this.field_K != 17) {
                    L7: {
                      stackIn_28_0 = ig.field_d[1];

                      stackIn_28_1 = 12;

                      if (this.field_F != 3) {
                        stackIn_29_0 = (ja) ((Object) stackIn_28_0);
                        stackIn_29_1 = stackIn_28_1;
                        stackIn_29_2 = -3 + var3_int;
                        break L7;
                      } else {
                        stackIn_29_0 = (ja) ((Object) stackIn_28_0);
                        stackIn_29_1 = stackIn_28_1;
                        stackIn_29_2 = var3_int - 2;
                        break L7;
                      }
                    }
                    g.a(stackIn_29_0, stackIn_29_1 + stackIn_29_2, 43 + var4);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L8: {
                  var5 = this.field_ab;
                  if (gg.field_i[this.field_K] == null) {
                    break L8;
                  } else {
                    var5 = gg.field_i[this.field_K][this.field_ab];
                    break L8;
                  }
                }
                var6 = var5 + gg.field_l[this.field_K];
                if (param0 == -10136) {
                  L9: {
                    L10: {
                      L11: {
                        var7 = wq.field_c[this.field_C];
                        if ((this.field_K ^ -1) == -11) {
                          break L11;
                        } else {
                          if ((this.field_K ^ -1) != -12) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if ((this.field_F ^ -1) == -3) {
                          break L12;
                        } else {
                          L13: {
                            if (this.field_F == 0) {
                              break L13;
                            } else {
                              L14: {
                                if ((this.field_F ^ -1) != -4) {
                                  break L14;
                                } else {
                                  var7[var6].g(var3_int, var4);
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              if (1 == this.field_F) {
                                var7[var6].b(var3_int, var4);
                                if (var12 == 0) {
                                  break L9;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          var7[4 + var6].g(var3_int, var4);
                          if (var12 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7[var6 + 2].g(var3_int, var4);
                      if (var12 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                    L15: {
                      if (-22 != (this.field_K ^ -1)) {
                        break L15;
                      } else {
                        var7[var6].c(var3_int, var4, this.field_N);
                        if (var12 == 0) {
                          break L9;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      var8 = 3 + var4;
                      var9 = wf.field_m / 4 % aa.field_h.length;
                      var10 = null;
                      if (-26 != (this.field_K ^ -1)) {
                        if (30 == this.field_K) {
                          var10 = sh.field_N[var9];
                          break L16;
                        } else {
                          break L16;
                        }
                      } else {
                        var10 = aa.field_h[var9];
                        break L16;
                      }
                    }
                    L17: {
                      if (var10 == null) {
                        break L17;
                      } else {
                        ((ri) (var10)).a(var3_int, var8);
                        break L17;
                      }
                    }
                    L18: {
                      if ((var6 ^ -1) > -1) {
                        break L18;
                      } else {
                        if (var6 < var7.length) {
                          L19: {
                            if ((this.field_F ^ -1) != -2) {
                              stackIn_65_0 = 0;
                              break L19;
                            } else {
                              stackIn_65_0 = 1;
                              break L19;
                            }
                          }
                          L20: {
                            var11 = stackIn_65_0;
                            if (0 < this.field_G) {
                              break L20;
                            } else {
                              L21: {
                                if (var11 != 0) {
                                  break L21;
                                } else {
                                  var7[var6].g(var3_int, var4);
                                  if (var12 == 0) {
                                    break L18;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              var7[var6].b(var3_int, var4);
                              if (var12 == 0) {
                                break L18;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L22: {
                            if (var11 != 0) {
                              g.a(var7[var6]);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          var7[var6].d(var3_int, var4, 142);
                          if (var11 != 0) {
                            g.a(var7[var6]);
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (var10 == null) {
                      break L9;
                    } else {
                      g.c();
                      oo.h(var3_int, ((ri) (var10)).field_b / 2 + var8, 640, ((ri) (var10)).field_b + var8);
                      ((ri) (var10)).a(var3_int, var8);
                      g.b();
                      break L9;
                    }
                  }
                  L23: {
                    if (this.field_jb) {
                      ig.field_d[0].e(var3_int, var4, 128, 16711680);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackIn_85_0 = (RuntimeException) (var3);

            stackIn_85_1 = new StringBuilder().append("gm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L24;
            } else {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L24;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
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
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param2 < 2) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if ((param2 ^ -1) >= -37) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    throw new IllegalArgumentException("" + param2);
                }
                case 4: {
                    if (!param1) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (0 > param0) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return Integer.toString(param0, param2);
                }
                case 8: {
                    var4 = 2;
                    var5 = param0 / param2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == (var5 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4++;
                    stackIn_13_0 = var5 / param2;
                    stackIn_11_0 = stackIn_13_0;
                    if (var10 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var5 = stackIn_11_0;
                    if (var10 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = var4;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var12 = new char[stackIn_13_0];
                    var11 = var12;
                    var6 = var11;
                    var6[0] = (char)43;
                    var7 = var4 + param3;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if ((var7 ^ -1) >= -1) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var8 = param0;
                    param0 = param0 / param2;
                    var9 = var8 + -(param0 * param2);
                    if ((var9 ^ -1) > -11) {
                        statePc = 18;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var6[var7] = (char)(var9 + 87);
                    if (var10 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6[var7] = (char)(48 + var9);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var7--;
                    if (var10 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return new String(var12);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int statePc = 0;
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    super.f((byte) -95);
                    this.c(30818, this.field_K);
                    if (param0 <= -79) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (-33 == (this.field_K ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_qb != -1) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_qb = wf.field_m;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var2 = wf.field_m + -this.field_qb;
                    if (150 < var2) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    this.b(false);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (this.field_K != 0) {
                        statePc = 25;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    fieldTemp$0 = this.field_eb + 1;
                    this.field_eb = this.field_eb + 1;
                    if (this.field_ib < fieldTemp$0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = this;
                    stackIn_13_0 = stackIn_14_0;
                    if (this.field_gb) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = this;
                    stackIn_15_1 = 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = this;
                    stackIn_15_1 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ((gm) (this)).field_gb = stackIn_15_1 != 0;
                    this.field_eb = 0;
                    if (this.field_gb) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = this;
                    stackIn_17_0 = stackIn_18_0;
                    if (!this.field_gb) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = this;
                    stackIn_19_1 = 65;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = this;
                    stackIn_19_1 = 20 + hp.a((byte) -67, g.field_a, 200);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    ((gm) (this)).field_ib = stackIn_19_1;
                    if (var4 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    this.field_ib = 53;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (!this.field_gb) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    this.field_ab = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                case 25: {
                    if (this.field_K == 2) {
                        statePc = 58;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-2 != (this.field_K ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    fieldTemp$1 = this.field_lb;
                    this.field_lb = this.field_lb + 1;
                    if ((fieldTemp$1 ^ -1) > -6) {
                        statePc = 45;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_lb = 0;
                    var2 = 0;
                    var3 = op.field_m.field_A.c(103);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (!(var3 instanceof cg)) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var2 = var2 != 0 | ((cg) ((Object) var3)).a((gm) (this), false) ? 1 : 0;
                    var3 = var3.field_d;
                    if (var4 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var4 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (this.field_db) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var2 != 0) {
                        statePc = 40;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (!this.field_db) {
                        statePc = 41;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (var2 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.d(6, this.field_bb);
                    if (var4 == 0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.d(6, this.field_bb >> 1235455810);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    stackIn_43_0 = this;
                    stackIn_42_0 = stackIn_43_0;
                    if (var2 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = this;
                    stackIn_44_1 = 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = this;
                    stackIn_44_1 = 0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    ((gm) (this)).field_db = stackIn_44_1 != 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    this.i(5197);
                    if (this.k(-125)) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return;
                }
                case 47: {
                    this.b(0, -27655);
                    if (var4 != 0) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                case 50: {
                    if ((this.field_K ^ -1) != -4) {
                        statePc = 52;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((this.field_K ^ -1) != -17) {
                        statePc = 54;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (20 == this.field_K) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    return;
                }
                case 58: {
                    this.i(5197);
                    if (4 > this.field_ab) {
                        statePc = 66;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (-5 != (this.field_ab ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    this.field_Q = 0;
                    fieldTemp$2 = this.field_nb;
                    this.field_nb = this.field_nb + 1;
                    if (400 > fieldTemp$2) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    this.field_ab = this.field_ab + 1;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    this.field_S = 0;
                    this.field_X = 0;
                    if (var4 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if ((this.field_ab ^ -1) != -7) {
                        statePc = 65;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return;
                }
                case 66: {
                    this.field_Q = this.field_Q + 1;
                    if (var4 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    return;
                }
                case 68: {
                    if (-5 != (this.field_ab ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.field_Q = 0;
                    fieldTemp$3 = this.field_nb;
                    this.field_nb = this.field_nb + 1;
                    if (400 > fieldTemp$3) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_ab = this.field_ab + 1;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    this.field_S = 0;
                    this.field_X = 0;
                    if (var4 == 0) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if ((this.field_ab ^ -1) != -7) {
                        statePc = 74;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    return;
                }
                case 76: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void n(int param0) {
        this.b(param0, -27655);
    }

    final boolean m(int param0) {
        int var2;
        int var3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_C;
        if (var2 != 0) {
          L0: {
            if (var2 != 1) {
              break L0;
            } else {
              if (var3 != 0) {
                break L0;
              } else {
                return false;
              }
            }
          }
          L1: {
            if (-3 != (var2 ^ -1)) {
              break L1;
            } else {
              if (var3 != 0) {
                break L1;
              } else {
                return false;
              }
            }
          }
          L2: {
            if ((var2 ^ -1) != -4) {
              break L2;
            } else {
              if (var3 != 0) {
                break L2;
              } else {
                return true;
              }
            }
          }
          L3: {
            if ((var2 ^ -1) != -5) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                return true;
              }
            }
          }
          L4: {
            if (-6 != (var2 ^ -1)) {
              break L4;
            } else {
              if (var3 != 0) {
                break L4;
              } else {
                return true;
              }
            }
          }
          if (-7 != (var2 ^ -1)) {
            if (var2 != 7) {
              L5: {
                if (-9 != (var2 ^ -1)) {
                  break L5;
                } else {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    return true;
                  }
                }
              }
              if (9 != var2) {
                L6: {
                  if (var2 != 10) {
                    break L6;
                  } else {
                    if (var3 != 0) {
                      break L6;
                    } else {
                      return true;
                    }
                  }
                }
                L7: {
                  if ((var2 ^ -1) != -12) {
                    break L7;
                  } else {
                    if (var3 != 0) {
                      break L7;
                    } else {
                      return false;
                    }
                  }
                }
                if (-13 != (var2 ^ -1)) {
                  L8: {
                    if ((var2 ^ -1) != -14) {
                      break L8;
                    } else {
                      if (var3 != 0) {
                        break L8;
                      } else {
                        return true;
                      }
                    }
                  }
                  L9: {
                    if (14 != var2) {
                      break L9;
                    } else {
                      if (var3 != 0) {
                        break L9;
                      } else {
                        return true;
                      }
                    }
                  }
                  if (var2 != 15) {
                    if ((var2 ^ -1) != -17) {
                      L10: {
                        if (-19 != (var2 ^ -1)) {
                          break L10;
                        } else {
                          if (var3 != 0) {
                            break L10;
                          } else {
                            return true;
                          }
                        }
                      }
                      L11: {
                        if ((var2 ^ -1) != -20) {
                          break L11;
                        } else {
                          if (var3 != 0) {
                            break L11;
                          } else {
                            return true;
                          }
                        }
                      }
                      if (-21 != (var2 ^ -1)) {
                        L12: {
                          if (-22 != (var2 ^ -1)) {
                            break L12;
                          } else {
                            if (var3 != 0) {
                              break L12;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (-23 == (var2 ^ -1)) {
                          if (var3 != 0) {
                            return false;
                          } else {
                            return true;
                          }
                        } else {
                          L13: {
                            if (param0 == 15684) {
                              break L13;
                            } else {
                              this.l(127);
                              break L13;
                            }
                          }
                          return true;
                        }
                      } else {
                        return true;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void l(int param0) {
        int var2 = -57 % ((0 - param0) / 33);
        this.b(0, -27655);
    }

    final static void a(long param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
            va.field_a = 2;
            if (param2 != -1) {
                field_ob = (String) null;
            }
            qf.field_g = param1;
            var5 = (CharSequence) ((Object) param1);
            ql.field_a = tg.a(var5, false);
            sq.field_N = true;
            jj.field_M = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "gm.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_pb = new String[]{"Prepare your forces!", "Get ready to grumble!", "Get ready to mumble!", "Get ready!", "He who scares, wins!", "Ready, set, groan!", "Let's get shuffling!", "To arms!", "Break a leg!", "Dinner is served...", "Rattle 'em bones!", "Get ready to fright!", "Not by force, by bile!", "Unsteady, set, shuffle!", "Time to greet and eat!", "Go eat 'em!", "Moan-bilise your troops!", "Get ready to outbreak!", "It's goo time.", "Got the fright stuff?", "Here come the hordes.", "First rule of Overlord club...", "Grah rarr growwwl!", "It's time to take over!", "It's a good day to undie.", "Undead and loving it...", "Stop! Zombie time."};
        field_ob = "This game is full.";
    }
}
