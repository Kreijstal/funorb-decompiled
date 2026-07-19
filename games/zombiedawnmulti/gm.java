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
        if (this.field_K == 0) {
            if (-2 == (param0 ^ -1)) {
                if (hp.a((byte) 29, g.field_a, 4) == 0) {
                    this.field_U = pb.a((byte) 62, this.field_mb);
                }
            }
        }
        super.b(param0, param1);
    }

    abstract void a(nm param0, byte param1);

    final int q(int param0) {
        int var2 = 0;
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
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.g(-96);
        var3 = this.h(70);
        var4 = 0;
        if (param0 < 113) {
          return;
        } else {
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= -1 + this.field_fb) {
                  break L2;
                } else {
                  this.field_cb[var4] = var2 + jk.field_l[var4];
                  this.field_hb[var4] = jk.field_b[var4] + var3;
                  var4++;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_cb[this.field_fb + -1] = var2;
              this.field_hb[this.field_fb + -1] = var3;
              break L1;
            }
            return;
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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ja[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        ja stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ja stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        ja stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        ja stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        ja stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
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
                      stackOut_26_0 = ig.field_d[1];
                      stackOut_26_1 = 12;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (this.field_F != 3) {
                        stackOut_28_0 = (ja) ((Object) stackIn_28_0);
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = -3 + var3_int;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        break L7;
                      } else {
                        stackOut_27_0 = (ja) ((Object) stackIn_27_0);
                        stackOut_27_1 = stackIn_27_1;
                        stackOut_27_2 = var3_int - 2;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
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
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L19;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
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
            stackOut_83_0 = (RuntimeException) (var3);
            stackOut_83_1 = new StringBuilder().append("gm.H(").append(param0).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param1 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L24;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
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
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
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
                      L3: {
                        L4: {
                          if (-1 == (var5 ^ -1)) {
                            break L4;
                          } else {
                            var4++;
                            stackOut_10_0 = var5 / param2;
                            stackIn_13_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              var5 = stackIn_11_0;
                              if (var10 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_12_0 = var4;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      }
                      var12 = new char[stackIn_13_0];
                      var11 = var12;
                      var6 = var11;
                      var6[0] = (char)43;
                      var7 = var4 + param3;
                      L5: while (true) {
                        L6: {
                          if ((var7 ^ -1) >= -1) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                var8 = param0;
                                param0 = param0 / param2;
                                var9 = var8 + -(param0 * param2);
                                if ((var9 ^ -1) > -11) {
                                  break L8;
                                } else {
                                  var6[var7] = (char)(var9 + 87);
                                  if (var10 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var6[var7] = (char)(48 + var9);
                              break L7;
                            }
                            var7--;
                            if (var10 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        return new String(var12);
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
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
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
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
          if (this.field_K != 0) {
            if (this.field_K == 2) {
              this.i(5197);
              if (4 > this.field_ab) {
                this.field_Q = this.field_Q + 1;
                if (var4 != 0) {
                  L2: {
                    L3: {
                      if (-5 != (this.field_ab ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          this.field_Q = 0;
                          fieldTemp$4 = this.field_nb;
                          this.field_nb = this.field_nb + 1;
                          if (400 > fieldTemp$4) {
                            break L4;
                          } else {
                            this.field_ab = this.field_ab + 1;
                            break L4;
                          }
                        }
                        this.field_S = 0;
                        this.field_X = 0;
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((this.field_ab ^ -1) != -7) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L5: {
                  L6: {
                    if (-5 != (this.field_ab ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        this.field_Q = 0;
                        fieldTemp$5 = this.field_nb;
                        this.field_nb = this.field_nb + 1;
                        if (400 > fieldTemp$5) {
                          break L7;
                        } else {
                          this.field_ab = this.field_ab + 1;
                          break L7;
                        }
                      }
                      this.field_S = 0;
                      this.field_X = 0;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if ((this.field_ab ^ -1) != -7) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              L8: {
                if (-2 != (this.field_K ^ -1)) {
                  break L8;
                } else {
                  L9: {
                    fieldTemp$6 = this.field_lb;
                    this.field_lb = this.field_lb + 1;
                    if ((fieldTemp$6 ^ -1) > -6) {
                      break L9;
                    } else {
                      this.field_lb = 0;
                      var2 = 0;
                      var3 = op.field_m.field_A.c(103);
                      L10: while (true) {
                        L11: {
                          L12: {
                            L13: {
                              L14: {
                                if (!(var3 instanceof cg)) {
                                  break L14;
                                } else {
                                  var2 = var2 != 0 | ((cg) ((Object) var3)).a((gm) (this), false) ? 1 : 0;
                                  var3 = var3.field_d;
                                  if (var4 != 0) {
                                    break L13;
                                  } else {
                                    if (var4 == 0) {
                                      continue L10;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              if (this.field_db) {
                                break L13;
                              } else {
                                if (var2 != 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (!this.field_db) {
                              break L11;
                            } else {
                              if (var2 == 0) {
                                this.d(6, this.field_bb);
                                if (var4 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                          this.d(6, this.field_bb >> 1235455810);
                          break L11;
                        }
                        L15: {
                          stackOut_41_0 = this;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (var2 == 0) {
                            stackOut_43_0 = this;
                            stackOut_43_1 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L15;
                          } else {
                            stackOut_42_0 = this;
                            stackOut_42_1 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L15;
                          }
                        }
                        ((gm) (this)).field_db = stackIn_44_1 != 0;
                        break L9;
                      }
                    }
                  }
                  this.i(5197);
                  if (this.k(-125)) {
                    this.b(0, -27655);
                    if (var4 != 0) {
                      break L8;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
              L16: {
                if ((this.field_K ^ -1) != -4) {
                  if ((this.field_K ^ -1) != -17) {
                    if (20 == this.field_K) {
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              return;
            }
          } else {
            L17: {
              fieldTemp$7 = this.field_eb + 1;
              this.field_eb = this.field_eb + 1;
              if (this.field_ib < fieldTemp$7) {
                L18: {
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (this.field_gb) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L18;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L18;
                  }
                }
                L19: {
                  ((gm) (this)).field_gb = stackIn_15_1 != 0;
                  this.field_eb = 0;
                  if (this.field_gb) {
                    break L19;
                  } else {
                    L20: {
                      stackOut_16_0 = this;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (!this.field_gb) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 20 + hp.a((byte) -67, g.field_a, 200);
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L20;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = 65;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L20;
                      }
                    }
                    ((gm) (this)).field_ib = stackIn_19_1;
                    if (var4 == 0) {
                      break L17;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_ib = 53;
                break L17;
              } else {
                break L17;
              }
            }
            L21: {
              if (!this.field_gb) {
                this.field_ab = 0;
                break L21;
              } else {
                break L21;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void n(int param0) {
        this.b(param0, -27655);
    }

    final boolean m(int param0) {
        int var2 = 0;
        int var3 = 0;
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
