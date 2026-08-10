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
        if (param0 != -5183) {
            return 32;
        }
        int var2 = this.field_C;
        if (-3 != (var2 ^ -1) && var2 != 4) {
            if (!(6 == var2)) {
                return eb.field_A;
            }
        }
        return n.field_i;
    }

    public static void o(int param0) {
        if (param0 != 24461) {
            field_ob = (String) null;
        }
        field_pb = null;
        field_ob = null;
    }

    private final void p(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = this.g(-96);
        int var3 = this.h(70);
        int var4 = 0;
        if (param0 < 113) {
            return;
        }
        while (var4 < -1 + this.field_fb) {
            this.field_cb[var4] = var2 + jk.field_l[var4];
            this.field_hb[var4] = jk.field_b[var4] + var3;
            var4++;
        }
        this.field_cb[this.field_fb + -1] = var2;
        this.field_hb[this.field_fb + -1] = var3;
    }

    gm(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
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
        if (this.m(15684)) {
            this.field_mb = hp.a((byte) -119, g.field_a, 4) + 49;
        } else {
            this.field_mb = 26 - -hp.a((byte) 124, g.field_a, 3);
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
        ja stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ja stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
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
                  if (this.field_U.k()) {
                    this.field_U = null;
                    break L1;
                  } else {
                    this.field_U.h(sd.b(124, var4, var3_int));
                    this.field_U.f(pb.a(var4, var3_int, false));
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (i.field_b) {
                  this.a(param1, (byte) 80);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!io.a(var3_int, var4, (byte) -112, param1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if ((this.field_K ^ -1) != -33) {
                    break L3;
                  } else {
                    L4: {
                      if ((this.field_qb ^ -1) != 0) {
                        break L4;
                      } else {
                        this.field_qb = wf.field_m;
                        break L4;
                      }
                    }
                    var5 = -this.field_qb + wf.field_m;
                    if ((var5 ^ -1) < -151) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var5 = (int)(128.0 * Math.sin((double)var5 / 10.0 * (1.0 + (double)var5 / 33.3)));
                      if (-1 >= (var5 ^ -1)) {
                        break L3;
                      } else {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                L5: {
                  if (this.field_K != 17) {
                    L6: {
                      stackIn_27_0 = ig.field_d[1];

                      stackIn_27_1 = 12;

                      if (this.field_F != 3) {
                        stackIn_28_0 = (ja) ((Object) stackIn_27_0);
                        stackIn_28_1 = stackIn_27_1;
                        stackIn_28_2 = -3 + var3_int;
                        break L6;
                      } else {
                        stackIn_28_0 = (ja) ((Object) stackIn_27_0);
                        stackIn_28_1 = stackIn_27_1;
                        stackIn_28_2 = var3_int - 2;
                        break L6;
                      }
                    }
                    g.a(stackIn_28_0, stackIn_28_1 + stackIn_28_2, 43 + var4);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  var5 = this.field_ab;
                  if (gg.field_i[this.field_K] == null) {
                    break L7;
                  } else {
                    var5 = gg.field_i[this.field_K][this.field_ab];
                    break L7;
                  }
                }
                var6 = var5 + gg.field_l[this.field_K];
                if (param0 == -10136) {
                  L8: {
                    L9: {
                      var7 = wq.field_c[this.field_C];
                      if ((this.field_K ^ -1) == -11) {
                        break L9;
                      } else {
                        if ((this.field_K ^ -1) != -12) {
                          if (-22 != (this.field_K ^ -1)) {
                            L10: {
                              var8 = 3 + var4;
                              var9 = wf.field_m / 4 % aa.field_h.length;
                              var10 = null;
                              if (-26 != (this.field_K ^ -1)) {
                                if (30 == this.field_K) {
                                  var10 = sh.field_N[var9];
                                  break L10;
                                } else {
                                  break L10;
                                }
                              } else {
                                var10 = aa.field_h[var9];
                                break L10;
                              }
                            }
                            L11: {
                              if (var10 == null) {
                                break L11;
                              } else {
                                ((ri) (var10)).a(var3_int, var8);
                                break L11;
                              }
                            }
                            L12: {
                              if ((var6 ^ -1) > -1) {
                                break L12;
                              } else {
                                if (var6 < var7.length) {
                                  L13: {
                                    if ((this.field_F ^ -1) != -2) {
                                      stackIn_60_0 = 0;
                                      break L13;
                                    } else {
                                      stackIn_60_0 = 1;
                                      break L13;
                                    }
                                  }
                                  var11 = stackIn_60_0;
                                  if (0 < this.field_G) {
                                    L14: {
                                      if (var11 != 0) {
                                        g.a(var7[var6]);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var7[var6].d(var3_int, var4, 142);
                                    if (var11 != 0) {
                                      g.a(var7[var6]);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    if (var11 != 0) {
                                      var7[var6].b(var3_int, var4);
                                      break L12;
                                    } else {
                                      var7[var6].g(var3_int, var4);
                                      break L12;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (var10 == null) {
                              break L8;
                            } else {
                              g.c();
                              oo.h(var3_int, ((ri) (var10)).field_b / 2 + var8, 640, ((ri) (var10)).field_b + var8);
                              ((ri) (var10)).a(var3_int, var8);
                              g.b();
                              break L8;
                            }
                          } else {
                            var7[var6].c(var3_int, var4, this.field_N);
                            break L8;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    if ((this.field_F ^ -1) == -3) {
                      var7[var6 + 2].g(var3_int, var4);
                      break L8;
                    } else {
                      if (this.field_F == 0) {
                        var7[4 + var6].g(var3_int, var4);
                        break L8;
                      } else {
                        if ((this.field_F ^ -1) != -4) {
                          if (1 == this.field_F) {
                            var7[var6].b(var3_int, var4);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          var7[var6].g(var3_int, var4);
                          break L8;
                        }
                      }
                    }
                  }
                  L15: {
                    if (this.field_jb) {
                      ig.field_d[0].e(var3_int, var4, 128, 16711680);
                      break L15;
                    } else {
                      break L15;
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
          L16: {
            var3 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var3);

            stackIn_78_1 = new StringBuilder().append("gm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L16;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L16;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
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
        int var4;
        int var5;
        char[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        char[] var11;
        char[] var12;
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
                        var12 = new char[var4];
                        var11 = var12;
                        var6 = var11;
                        var6[0] = (char)43;
                        var7 = var4 + param3;
                        L3: while (true) {
                          if ((var7 ^ -1) >= -1) {
                            return new String(var12);
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int var2;
        br var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        super.f((byte) -95);
        this.c(30818, this.field_K);
        if (param0 <= -79) {
          L0: {
            if (-33 == (this.field_K ^ -1)) {
              L1: {
                if (this.field_qb != -1) {
                  break L1;
                } else {
                  this.field_qb = wf.field_m;
                  break L1;
                }
              }
              var2 = wf.field_m + -this.field_qb;
              if (150 < var2) {
                this.b(false);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          L2: {
            L3: {
              if (this.field_K == 0) {
                L4: {
                  fieldTemp$0 = this.field_eb + 1;
                  this.field_eb = this.field_eb + 1;
                  if (this.field_ib < fieldTemp$0) {
                    L5: {
                      stackIn_49_0 = this;

                      if (this.field_gb) {
                        stackIn_50_0 = this;
                        stackIn_50_1 = 0;
                        break L5;
                      } else {
                        stackIn_50_0 = this;
                        stackIn_50_1 = 1;
                        break L5;
                      }
                    }
                    ((gm) (this)).field_gb = stackIn_50_1 != 0;
                    this.field_eb = 0;
                    if (this.field_gb) {
                      this.field_ib = 53;
                      break L4;
                    } else {
                      L6: {
                        stackIn_53_0 = this;

                        if (!this.field_gb) {
                          stackIn_54_0 = this;
                          stackIn_54_1 = 20 + hp.a((byte) -67, g.field_a, 200);
                          break L6;
                        } else {
                          stackIn_54_0 = this;
                          stackIn_54_1 = 65;
                          break L6;
                        }
                      }
                      ((gm) (this)).field_ib = stackIn_54_1;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (!this.field_gb) {
                  this.field_ab = 0;
                  break L3;
                } else {
                  break L2;
                }
              } else {
                if (this.field_K == 2) {
                  this.i(5197);
                  if (4 <= this.field_ab) {
                    L7: {
                      if (-5 != (this.field_ab ^ -1)) {
                        if ((this.field_ab ^ -1) != -7) {
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        L8: {
                          this.field_Q = 0;
                          fieldTemp$1 = this.field_nb;
                          this.field_nb = this.field_nb + 1;
                          if (400 > fieldTemp$1) {
                            break L8;
                          } else {
                            this.field_ab = this.field_ab + 1;
                            break L8;
                          }
                        }
                        this.field_S = 0;
                        this.field_X = 0;
                        break L7;
                      }
                    }
                    return;
                  } else {
                    this.field_Q = this.field_Q + 1;
                    return;
                  }
                } else {
                  if (-2 != (this.field_K ^ -1)) {
                    if ((this.field_K ^ -1) != -4) {
                      if ((this.field_K ^ -1) != -17) {
                        if (20 != this.field_K) {
                          break L3;
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
                    L9: {
                      fieldTemp$2 = this.field_lb;
                      this.field_lb = this.field_lb + 1;
                      if ((fieldTemp$2 ^ -1) > -6) {
                        break L9;
                      } else {
                        this.field_lb = 0;
                        var2 = 0;
                        var3 = op.field_m.field_A.c(103);
                        L10: while (true) {
                          if (!(var3 instanceof cg)) {
                            L11: {
                              L12: {
                                if (this.field_db) {
                                  break L12;
                                } else {
                                  if (var2 != 0) {
                                    this.d(6, this.field_bb >> 1235455810);
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (!this.field_db) {
                                break L11;
                              } else {
                                if (var2 == 0) {
                                  this.d(6, this.field_bb);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L13: {
                              stackIn_26_0 = this;

                              if (var2 == 0) {
                                stackIn_27_0 = this;
                                stackIn_27_1 = 0;
                                break L13;
                              } else {
                                stackIn_27_0 = this;
                                stackIn_27_1 = 1;
                                break L13;
                              }
                            }
                            ((gm) (this)).field_db = stackIn_27_1 != 0;
                            break L9;
                          } else {
                            var2 = var2 != 0 | ((cg) ((Object) var3)).a((gm) (this), false) ? 1 : 0;
                            var3 = var3.field_d;
                            continue L10;
                          }
                        }
                      }
                    }
                    this.i(5197);
                    if (!this.k(-125)) {
                      break L2;
                    } else {
                      this.b(0, -27655);
                      break L2;
                    }
                  }
                }
              }
            }
            break L2;
          }
          return;
        } else {
          return;
        }
    }

    final void n(int param0) {
        this.b(param0, -27655);
    }

    final boolean m(int param0) {
        int stackIn_37_0 = 0;
        int var2;
        int var3;
        L0: {
          L1: {
            var3 = ZombieDawnMulti.field_E ? 1 : 0;
            var2 = this.field_C;
            if (var2 == 0) {
              break L1;
            } else {
              if (var2 != 1) {
                if (-3 != (var2 ^ -1)) {
                  L2: {
                    if ((var2 ^ -1) != -4) {
                      if ((var2 ^ -1) != -5) {
                        if (-6 != (var2 ^ -1)) {
                          if (-7 == (var2 ^ -1)) {
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
                                    if ((var2 ^ -1) != -12) {
                                      L3: {
                                        if (-13 == (var2 ^ -1)) {
                                          break L3;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (14 != var2) {
                                              if (var2 == 15) {
                                                return true;
                                              } else {
                                                if ((var2 ^ -1) == -17) {
                                                  return true;
                                                } else {
                                                  if (-19 != (var2 ^ -1)) {
                                                    if ((var2 ^ -1) != -20) {
                                                      if (-21 == (var2 ^ -1)) {
                                                        return true;
                                                      } else {
                                                        if (-22 != (var2 ^ -1)) {
                                                          if (-23 != (var2 ^ -1)) {
                                                            L4: {
                                                              if (param0 == 15684) {
                                                                break L4;
                                                              } else {
                                                                this.l(127);
                                                                break L4;
                                                              }
                                                            }
                                                            return true;
                                                          } else {
                                                            stackIn_37_0 = 1;
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
          stackIn_37_0 = 0;
          break L0;
        }
        return stackIn_37_0 != 0;
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
