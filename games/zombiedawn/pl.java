/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends al {
    static int field_r;
    int[] field_o;
    static lm[] field_t;
    private jp field_s;
    private jp field_q;
    static int field_m;
    private int[] field_n;
    static vn field_p;

    final static void a(int param0, int param1, byte param2) {
        if (param2 != 50) {
            return;
        }
        try {
            pk.field_N = param0;
            b.field_l = param1;
            if (e.field_S != null) {
                e.field_S.b(param1, false, param0);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pl.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_r = 67;
                break L1;
              }
            }
            param1 = param1 - vh.field_b;
            param2 = param2 - id.field_M;
            if (ce.field_p != 0) {
              stackIn_7_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((rg.field_F ^ -1) != 0) {
                  L3: {
                    L4: {
                      var4_int = 178;
                      var5 = (-var4_int + param2) / 29;
                      if (param2 < var4_int) {
                        break L4;
                      } else {
                        if (-1 < (var5 ^ -1)) {
                          break L4;
                        } else {
                          if ((var5 ^ -1) < -7) {
                            break L4;
                          } else {
                            if (-201 < (param1 ^ -1)) {
                              break L4;
                            } else {
                              if ((param1 ^ -1) >= -441) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    var5 = -1;
                    break L3;
                  }
                  L5: {
                    if (-1 == var5) {
                      break L5;
                    } else {
                      if (!this.b(var5 - -3, rg.field_F, 16777215)) {
                        break L5;
                      } else {
                        stackIn_38_0 = 3 + var5;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  if (wl.field_b - 11 >= param1) {
                    break L2;
                  } else {
                    if (29 + wl.field_b <= param1) {
                      break L2;
                    } else {
                      if (-121 <= (param2 ^ -1)) {
                        break L2;
                      } else {
                        if (param2 >= 160) {
                          break L2;
                        } else {
                          stackIn_44_0 = 2;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  param2 -= 80;
                  var4_int = -1;
                  var5 = 0;
                  L6: while (true) {
                    if ((var5 ^ -1) <= -5) {
                      if ((var4_int ^ -1) <= -1) {
                        stackIn_26_0 = 2 + var4_int;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        param2 += 80;
                        break L2;
                      }
                    } else {
                      if (this.b(2 + var5, -1, 16777215)) {
                        if (param1 > sf.field_d[var5]) {
                          if (fl.field_c[var5] + sf.field_d[var5] > param1) {
                            if (param2 > gj.field_n[var5]) {
                              if (param2 < gj.field_n[var5] + pj.field_u[var5]) {
                                var4_int = var5;
                                var5++;
                                continue L6;
                              } else {
                                var5++;
                                continue L6;
                              }
                            } else {
                              var5++;
                              continue L6;
                            }
                          } else {
                            var5++;
                            continue L6;
                          }
                        } else {
                          var5++;
                          continue L6;
                        }
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (param2 <= this.field_k) {
                  break L7;
                } else {
                  if (param2 >= this.field_k + 29 + 5) {
                    break L7;
                  } else {
                    if (param1 <= this.field_g) {
                      break L7;
                    } else {
                      if (param1 >= this.field_g - -this.field_i) {
                        break L7;
                      } else {
                        return 0;
                      }
                    }
                  }
                }
              }
              stackIn_53_0 = -1;
              decompiledRegionSelector0 = 4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_44_0;
              } else {
                return stackIn_53_0;
              }
            }
          }
        }
    }

    private final void f(int param0, int param1) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            i.field_T = new vn(640, 341);
            i.field_T.a();
            if (param1 == -257) {
              L1: {
                bi.d();
                this.a(0, 0, param1 ^ 260);
                if (param0 >= 0) {
                  bi.h(3, 3, 0, 0, 640, 341);
                  this.a(0, 0, 0, param0);
                  cn.field_f.b(125);
                  break L1;
                } else {
                  cn.field_f.b(125);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (b.field_q == param2) {
                bd.field_i[qd.field_e][param2].b(param3 - -sf.field_d[param2], param1 + gj.field_n[param2], 248, 16776960);
                qn.field_g.b(-10 + (sf.field_d[param2] + param3), param1 + (-10 + gj.field_n[param2]), sn.field_f[rk.field_a]);
                break L1;
              } else {
                if (param4) {
                  jo.field_Tb[qd.field_e][param2].e(param3 - -sf.field_d[param2], gj.field_n[param2] + param1, 100);
                  break L1;
                } else {
                  bd.field_i[qd.field_e][param2].b(sf.field_d[param2] + param3, gj.field_n[param2] - -param1);
                  break L1;
                }
              }
            }
            L2: {
              if (param4) {
                break L2;
              } else {
                if (-1 == (n.field_k[param2] ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (b.field_q == param2) {
                      stackIn_14_0 = 2;
                      break L3;
                    } else {
                      stackIn_14_0 = 0;
                      break L3;
                    }
                  }
                  var6_int = stackIn_14_0;
                  sg.field_jb.b(cj.field_a[qd.field_e][param2], te.field_T[param2] + param3, ag.field_b[param2] + param1, var6_int, -1, n.field_k[param2]);
                  break L2;
                }
              }
            }
            L4: {
              if (b.field_q != param2) {
                break L4;
              } else {
                if (this.field_b.field_j) {
                  break L4;
                } else {
                  L5: {
                    if (0 != (ki.field_X[param2] ^ -1)) {
                      af.field_d.c(ki.field_X[param2], no.field_G[param2] + param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (cj.field_c[param2] == -1) {
                    break L4;
                  } else {
                    if (this.b(param2 - -3, -1, 16777215)) {
                      af.field_d.b(cj.field_c[param2], param1 + no.field_G[param2]);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 > 68) {
                break L6;
              } else {
                this.a((byte) -30, 7, 28);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6), "pl.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    pl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_q = this.field_b;
            this.field_n = this.field_h;
            this.field_o = param7;
            this.field_s = new jp(param7.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {
            stackIn_10_0 = (RuntimeException) ((Object) stackIn_7_0);

            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param7 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(int param0) {
        jp stackIn_40_0 = null;
        jp stackIn_42_0 = null;
        jp stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_58_0 = 0;
        jp stackIn_70_0 = null;
        jp stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        jp stackIn_81_0 = null;
        jp stackIn_83_0 = null;
        jp stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var2_int = this.field_b.field_d;
              if (param0 == -31645) {
                break L1;
              } else {
                field_m = -125;
                break L1;
              }
            }
            L2: {
              if (48 != kg.field_i) {
                break L2;
              } else {
                if (!bo.field_p[82]) {
                  break L2;
                } else {
                  if (2 > lo.field_j) {
                    break L2;
                  } else {
                    to.field_b[qd.field_e] = 27;
                    break L2;
                  }
                }
              }
            }
            L3: {
              L4: {
                if (-1 != rg.field_F) {
                  L5: {
                    L6: {
                      var3 = id.field_N;
                      if ((kg.field_i ^ -1) == -100) {
                        break L6;
                      } else {
                        if (kg.field_i != 98) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (-1 == (var2_int ^ -1)) {
                        break L7;
                      } else {
                        if ((var2_int ^ -1) == -2) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    id.field_N = var2_int;
                    break L5;
                  }
                  L8: {
                    if (-99 != (kg.field_i ^ -1)) {
                      break L8;
                    } else {
                      if (0 <= var2_int) {
                        stackIn_58_0 = 0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (stackIn_58_0 == this.field_b.field_d) {
                                break L11;
                              } else {
                                if (-2 != (this.field_b.field_d ^ -1)) {
                                  if ((this.field_b.field_d ^ -1) == -3) {
                                    L12: {
                                      L13: {
                                        stackIn_70_0 = this.field_b;

                                        if (var3 == 0) {
                                          break L13;
                                        } else {
                                          stackIn_70_0 = (jp) ((Object) stackIn_70_0);

                                          if (var3 == 1) {
                                            break L13;
                                          } else {
                                            stackIn_71_0 = (jp) ((Object) stackIn_70_0);
                                            stackIn_71_1 = 0;
                                            break L12;
                                          }
                                        }
                                      }
                                      stackIn_71_0 = (jp) ((Object) stackIn_70_0);
                                      stackIn_71_1 = var3;
                                      break L12;
                                    }
                                    ((jp) (Object) stackIn_71_0).b(stackIn_71_1, -111);
                                    break L10;
                                  } else {
                                    this.field_b.b(-1 + this.field_b.field_d, 69);
                                    break L10;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            this.field_b.b(-1 + this.field_b.field_h, -102);
                            break L10;
                          }
                          if (!this.b(this.field_b.field_d, rg.field_F, 16777215)) {
                            stackIn_58_0 = 0;
                            continue L9;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        this.field_b.b(0, 63);
                        break L8;
                      }
                    }
                  }
                  L14: {
                    if (-100 == (kg.field_i ^ -1)) {
                      if (-1 < (var2_int ^ -1)) {
                        this.field_b.b(0, -75);
                        break L14;
                      } else {
                        L15: while (true) {
                          L16: {
                            if (-1 + this.field_b.field_h != this.field_b.field_d) {
                              L17: {
                                if (-1 == (this.field_b.field_d ^ -1)) {
                                  break L17;
                                } else {
                                  if (-2 != (this.field_b.field_d ^ -1)) {
                                    this.field_b.b(this.field_b.field_d - -1, -76);
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              this.field_b.b(2, param0 + 31557);
                              break L16;
                            } else {
                              L18: {
                                L19: {
                                  stackIn_81_0 = this.field_b;

                                  if (-1 == (var3 ^ -1)) {
                                    break L19;
                                  } else {
                                    stackIn_83_0 = (jp) ((Object) stackIn_81_0);

                                    if (-2 != (var3 ^ -1)) {
                                      stackIn_84_0 = (jp) ((Object) stackIn_83_0);
                                      stackIn_84_1 = 0;
                                      break L18;
                                    } else {
                                      stackIn_81_0 = (jp) ((Object) stackIn_81_0);
                                      break L19;
                                    }
                                  }
                                }
                                stackIn_84_0 = (jp) ((Object) stackIn_81_0);
                                stackIn_84_1 = var3;
                                break L18;
                              }
                              ((jp) (Object) stackIn_84_0).b(stackIn_84_1, param0 ^ 31699);
                              break L16;
                            }
                          }
                          if (!this.b(this.field_b.field_d, rg.field_F, 16777215)) {
                            continue L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  L20: {
                    if (-98 == (kg.field_i ^ -1)) {
                      break L20;
                    } else {
                      if (96 == kg.field_i) {
                        break L20;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2_int == 0) {
                    this.field_b.b(1, 126);
                    break L4;
                  } else {
                    L21: {
                      if ((var2_int ^ -1) == -2) {
                        break L21;
                      } else {
                        if (var2_int < 0) {
                          break L21;
                        } else {
                          this.field_b.g(102);
                          break L3;
                        }
                      }
                    }
                    this.field_b.b(0, 97);
                    break L4;
                  }
                } else {
                  L22: {
                    if (-97 != (kg.field_i ^ -1)) {
                      break L22;
                    } else {
                      if (-3 < (var2_int ^ -1)) {
                        this.field_b.b(0, -125);
                        break L22;
                      } else {
                        if (2 < var2_int) {
                          this.field_b.b(this.field_b.field_d - 1, 107);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L23: {
                    if ((kg.field_i ^ -1) == -98) {
                      if (-3 >= (var2_int ^ -1)) {
                        if ((var2_int ^ -1) <= -6) {
                          break L23;
                        } else {
                          if (!this.b(var2_int - -1, -1, 16777215)) {
                            break L23;
                          } else {
                            this.field_b.b(1 + var2_int, -81);
                            break L23;
                          }
                        }
                      } else {
                        this.field_b.b(0, -99);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (-100 == (kg.field_i ^ -1)) {
                      L25: {
                        if (var2_int >= 2) {
                          id.field_N = var2_int;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      this.field_b.b(0, param0 ^ -31697);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  if (kg.field_i != 98) {
                    break L4;
                  } else {
                    if (-1 != var2_int) {
                      if (var2_int >= 2) {
                        break L4;
                      } else {
                        L26: {
                          L27: {
                            stackIn_40_0 = this.field_b;

                            if ((id.field_N ^ -1) >= -2) {
                              break L27;
                            } else {
                              stackIn_42_0 = (jp) ((Object) stackIn_40_0);

                              if (6 > id.field_N) {
                                stackIn_43_0 = (jp) ((Object) stackIn_42_0);
                                stackIn_43_1 = id.field_N;
                                break L26;
                              } else {
                                stackIn_40_0 = (jp) ((Object) stackIn_40_0);
                                break L27;
                              }
                            }
                          }
                          stackIn_43_0 = (jp) ((Object) stackIn_40_0);
                          stackIn_43_1 = 2;
                          break L26;
                        }
                        ((jp) (Object) stackIn_43_0).b(stackIn_43_1, 120);
                        break L4;
                      }
                    } else {
                      this.field_b.b(0, param0 + 31733);
                      break L4;
                    }
                  }
                }
              }
              this.field_b.g(102);
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.F(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        hi stackIn_44_0 = null;
        hi stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        hi stackIn_45_0 = null;
        hi stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.field_h.length > param1) {
              L1: {
                var4_int = this.field_h[param1];
                var5 = var4_int;
                if (var5 == 26) {
                  if (!this.field_b.d(-120)) {
                    break L1;
                  } else {
                    this.e(50, -1);
                    break L1;
                  }
                } else {
                  L2: {
                    if (var5 != 22) {
                      if ((var5 ^ -1) != -24) {
                        if (-25 != (var5 ^ -1)) {
                          if (25 != var5) {
                            L3: {
                              if (27 != var5) {
                                if (28 != var5) {
                                  if (-30 != (var5 ^ -1)) {
                                    if (30 == var5) {
                                      break L3;
                                    } else {
                                      if (var5 != 31) {
                                        if ((var5 ^ -1) == -33) {
                                          break L3;
                                        } else {
                                          if (33 == var5) {
                                            break L3;
                                          } else {
                                            super.a(param0, param1, -8512);
                                            break L1;
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                            if (!this.field_b.d(-121)) {
                              break L1;
                            } else {
                              L4: {
                                var5 = rg.field_F - -(4 * qd.field_e);
                                var6 = var4_int - 27;
                                stackIn_44_0 = null;

                                stackIn_44_1 = null;

                                stackIn_44_2 = var5;

                                if (-7 != (var6 ^ -1)) {
                                  stackIn_45_0 = null;
                                  stackIn_45_1 = null;
                                  stackIn_45_2 = stackIn_44_2;
                                  stackIn_45_3 = var6;
                                  break L4;
                                } else {
                                  stackIn_45_0 = null;
                                  stackIn_45_1 = null;
                                  stackIn_45_2 = stackIn_44_2;
                                  stackIn_45_3 = -1;
                                  break L4;
                                }
                              }
                              L5: {
                                vl.field_b = new hi(stackIn_45_2, stackIn_45_3);
                                if (var6 != 0) {
                                  break L5;
                                } else {
                                  if (-1 != (var5 ^ -1)) {
                                    break L5;
                                  } else {
                                    ((kl) ((Object) jj.c(12, 81))).e(-124);
                                    ca.a(true, true, 12);
                                    break L1;
                                  }
                                }
                              }
                              ca.a(true, true, 0);
                              break L1;
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
                    } else {
                      break L2;
                    }
                  }
                  if (this.field_b.d(-122)) {
                    this.e(param2 + 8562, var4_int - 22);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L6: {
                if (param2 == -8512) {
                  break L6;
                } else {
                  field_t = (lm[]) null;
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, boolean param1) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              hm.field_J = -1;
              b.field_q = -1;
              if (param0 >= 83) {
                break L1;
              } else {
                this.a(114, -11, -24, -34);
                break L1;
              }
            }
            L2: {
              if (param1) {
                rg.field_F = -1;
                this.field_b = this.field_q;
                this.field_h = this.field_n;
                break L2;
              } else {
                break L2;
              }
            }
            var3_int = 0;
            L3: while (true) {
              if (4 <= var3_int) {
                break L0;
              } else {
                n.field_k[var3_int] = 128;
                var3_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            int var3_int = 0;
            g.field_H = param0;
            try {
                var6 = param2.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                var5 = var7;
                if (param0.length() == 0) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                qe.a("document.cookie=\"" + var5 + "\"", param2, (byte) 116);
            } catch (Throwable throwable) {
            }
            var3_int = 60 % ((6 - param1) / 62);
            hl.a(param2, 1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          L0: {
            L1: {
              super.a((byte) -68);
              if (0 != (rg.field_F ^ -1)) {
                this.a(0, vh.field_b, 80 + id.field_M, rg.field_F);
                break L1;
              } else {
                this.a(80 + id.field_M, vh.field_b, -5);
                break L1;
              }
            }
            L2: {
              if (param0 <= -35) {
                break L2;
              } else {
                field_r = 53;
                break L2;
              }
            }
            L3: {
              if (0 == ce.field_p) {
                break L3;
              } else {
                L4: {
                  var2_int = ce.field_p << -1269621244;
                  var3 = var2_int * 2;
                  if ((var3 ^ -1) < -257) {
                    var3 = 256;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var2_int >= 128) {
                    stackIn_15_0 = var2_int * 2 - 256;
                    break L5;
                  } else {
                    stackIn_15_0 = 0;
                    break L5;
                  }
                }
                var4 = stackIn_15_0;
                i.field_T.c(vh.field_b, id.field_M + 80, var3, var4);
                break L3;
              }
            }
            hk.field_H.b(vh.field_b + 0, 80 + id.field_M);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.B(" + param0 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        try {
            int var4_int = -99 % ((-61 - param0) / 34);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pl.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        Object stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        Object stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        Object stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_15_4;
        Object stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_16_5;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              dc.field_a[qd.field_e].b(param1 - param2, 5 + param0);
              stackIn_3_0 = this;

              stackIn_3_1 = 70;

              stackIn_3_2 = param0;

              stackIn_3_3 = 0;

              stackIn_3_4 = param1;

              if (this.b(2, -1, param2 + 16777220)) {
                stackIn_4_0 = this;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = stackIn_3_4;
                stackIn_4_5 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = stackIn_3_4;
                stackIn_4_5 = 1;
                break L1;
              }
            }
            L2: {
              this.a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5 != 0);
              stackIn_7_0 = this;

              stackIn_7_1 = 82;

              stackIn_7_2 = param0;

              stackIn_7_3 = 1;

              stackIn_7_4 = param1;

              if (this.b(3, -1, 16777215)) {
                stackIn_8_0 = this;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = 0;
                break L2;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = stackIn_7_1;
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = 1;
                break L2;
              }
            }
            L3: {
              this.a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5 != 0);
              stackIn_11_0 = this;

              stackIn_11_1 = 69;

              stackIn_11_2 = param0;

              stackIn_11_3 = 3;

              stackIn_11_4 = param1;

              if (this.b(5, -1, 16777215)) {
                stackIn_12_0 = this;
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = stackIn_11_2;
                stackIn_12_3 = stackIn_11_3;
                stackIn_12_4 = stackIn_11_4;
                stackIn_12_5 = 0;
                break L3;
              } else {
                stackIn_12_0 = this;
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = stackIn_11_2;
                stackIn_12_3 = stackIn_11_3;
                stackIn_12_4 = stackIn_11_4;
                stackIn_12_5 = 1;
                break L3;
              }
            }
            L4: {
              this.a(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5 != 0);
              stackIn_15_0 = this;

              stackIn_15_1 = 115;

              stackIn_15_2 = param0;

              stackIn_15_3 = 2;

              stackIn_15_4 = param1;

              if (this.b(4, -1, 16777215)) {
                stackIn_16_0 = this;
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = stackIn_15_2;
                stackIn_16_3 = stackIn_15_3;
                stackIn_16_4 = stackIn_15_4;
                stackIn_16_5 = 0;
                break L4;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = stackIn_15_2;
                stackIn_16_3 = stackIn_15_3;
                stackIn_16_4 = stackIn_15_4;
                stackIn_16_5 = 1;
                break L4;
              }
            }
            this.a(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_16_4, stackIn_16_5 != 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -26931) {
                break L1;
              } else {
                this.b((byte) -31, true);
                break L1;
              }
            }
            if (ce.field_p != 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (rg.field_F == -1) {
                  L3: {
                    stackIn_12_0 = 0;

                    stackIn_12_1 = 1;

                    if (be.field_j <= 0) {
                      stackIn_13_0 = stackIn_12_0;
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = 1;
                      break L3;
                    } else {
                      stackIn_13_0 = stackIn_12_0;
                      stackIn_13_1 = stackIn_12_1;
                      stackIn_13_2 = 13;
                      break L3;
                    }
                  }
                  ca.a(stackIn_13_0 != 0, stackIn_13_1 != 0, stackIn_13_2);
                  break L2;
                } else {
                  this.e(50, -1);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "pl.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        tj stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        tj stackIn_22_0;
        String stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        tj stackIn_27_0 = null;
        String stackIn_27_1 = null;
        tj stackIn_28_0 = null;
        String stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_44_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int var16 = 0;
        int var17 = 0;
        var17 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if ((hm.field_J ^ -1) != 1) {
                stackIn_5_0 = 8912896;
                break L1;
              } else {
                stackIn_5_0 = 16711680;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_5_0;
              if ((hm.field_J ^ -1) != 1) {
                stackIn_9_0 = 15658734;
                break L2;
              } else {
                stackIn_9_0 = 16777215;
                break L2;
              }
            }
            L3: {
              var6 = stackIn_9_0;
              var7 = 13421721;
              var8 = 10079351;
              var9 = 16777215;
              i.field_T.e(param1, param2);
              var10 = 1;
              bi.a(param1 + qo.field_s, 35 + param2, bm.field_c, 280, 0, 128);
              if (nc.field_k.field_r >= bm.field_c) {
                nc.field_k.b(param1 - -195, 30 + param2);
                break L3;
              } else {
                bi.f(0, 0, 320 + param1, nh.field_P);
                nc.field_k.b(qo.field_s + param1, 30 + param2);
                bi.f(320 + param1, 0, bd.field_e, nh.field_P);
                nc.field_k.b(param1 - (-j.field_d + nc.field_k.field_r), 30 + param2);
                bi.c();
                break L3;
              }
            }
            L4: {
              bi.g(param1 - -wl.field_b, param2 + 47, 23, 23, 3, var5_int);
              if ((hm.field_J ^ -1) == 1) {
                bi.e(wl.field_b + param1, 47 + param2, 23, 23, 3, 16764108);
                break L4;
              } else {
                break L4;
              }
            }
            bj.field_q.a("X", 11 + (param1 + wl.field_b), param2 + 64, var6, 65793);
            if (9 != param3) {
              L5: {
                stackIn_27_0 = sg.field_jb;

                stackIn_27_1 = gn.field_c[qd.field_e][param3];

                if (-4 != (param3 ^ -1)) {
                  stackIn_28_0 = (tj) ((Object) stackIn_27_0);
                  stackIn_28_1 = (String) ((Object) stackIn_27_1);
                  stackIn_28_2 = 0;
                  break L5;
                } else {
                  stackIn_28_0 = (tj) ((Object) stackIn_27_0);
                  stackIn_28_1 = (String) ((Object) stackIn_27_1);
                  stackIn_28_2 = 5;
                  break L5;
                }
              }
              ((tj) (Object) stackIn_28_0).a(stackIn_28_1, -stackIn_28_2 + (310 + param1), param2 - -85, 2, 65793);
              var11 = param3 - -(qd.field_e * 4);
              var12 = param0;
              L6: while (true) {
                if (-8 >= (var12 ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L7: {
                    if (hm.field_J == var12) {
                      stackIn_34_0 = 1;
                      break L7;
                    } else {
                      stackIn_34_0 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var13 = stackIn_34_0;
                    if (this.b(3 + var12, param3, 16777215)) {
                      stackIn_38_0 = 0;
                      break L8;
                    } else {
                      stackIn_38_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = stackIn_38_0;
                    var15 = null;
                    if (var14 != 0) {
                      var15 = o.field_n;
                      break L9;
                    } else {
                      if (var12 != 6) {
                        if (-7 >= (var12 ^ -1)) {
                          break L9;
                        } else {
                          var15 = gj.field_w[var11][var12];
                          break L9;
                        }
                      } else {
                        L10: {
                          if (param3 != 3) {
                            stackIn_44_0 = te.field_S;
                            break L10;
                          } else {
                            stackIn_44_0 = hm.field_M;
                            break L10;
                          }
                        }
                        var15 = stackIn_44_0;
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var15 = s.a(param0 + 1938762664, dk.field_Zb, new String[]{Integer.toString(1 + var12), (String) (var15)});
                    var16 = 0;
                    if (var13 == 0) {
                      if (var14 == 0) {
                        L12: {
                          if (var10 == 0) {
                            stackIn_56_0 = var8;
                            break L12;
                          } else {
                            stackIn_56_0 = var7;
                            break L12;
                          }
                        }
                        var16 = stackIn_56_0;
                        break L11;
                      } else {
                        var16 = 7829367;
                        break L11;
                      }
                    } else {
                      var16 = var9;
                      break L11;
                    }
                  }
                  L13: {
                    if (var13 != 0) {
                      bi.c(5 + qo.field_s + param1, param2 + 118 + -25 + var12 * 29, bm.field_c - 10, 20, 0, 26112);
                      bi.c(5 + qo.field_s + param1, 29 * var12 + (param2 + 113), -10 + bm.field_c, 20, 26112, 0);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var10 != 0) {
                      stackIn_65_0 = 0;
                      break L14;
                    } else {
                      stackIn_65_0 = 1;
                      break L14;
                    }
                  }
                  var10 = stackIn_65_0;
                  bj.field_q.c((String) (var15), 220 + param1, param2 + (118 + var12 * 29), var16, 65793);
                  var12++;
                  continue L6;
                }
              }
            } else {
              L15: {
                stackIn_21_0 = sg.field_jb;

                stackIn_21_1 = kf.field_Y;

                stackIn_21_2 = param1 - -310;

                if (3 == param3) {
                  stackIn_22_0 = (tj) ((Object) stackIn_21_0);
                  stackIn_22_1 = (String) ((Object) stackIn_21_1);
                  stackIn_22_2 = stackIn_21_2;
                  stackIn_22_3 = 5;
                  break L15;
                } else {
                  stackIn_22_0 = (tj) ((Object) stackIn_21_0);
                  stackIn_22_1 = (String) ((Object) stackIn_21_1);
                  stackIn_22_2 = stackIn_21_2;
                  stackIn_22_3 = 0;
                  break L15;
                }
              }
              ((tj) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2 - stackIn_22_3, 85 + param2, 2, 65793);
              bj.field_q.a(jk.field_h, param1 + 210, 118 + param2, -30 + nc.field_k.field_r, 120, 16777215, 65793, 1, 1, 20);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "pl.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              super.a((byte) -113, param1);
              if (-1 == (ce.field_p ^ -1)) {
                break L1;
              } else {
                if (!fm.field_F) {
                  ce.field_p = ce.field_p - 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ce.field_p = ce.field_p + 1;
                  if (-17 == (ce.field_p ^ -1)) {
                    rg.field_F = wm.field_b;
                    this.f(-1, -257);
                    i.field_T.a();
                    bi.h(3, 3, 0, 0, 640, 341);
                    cn.field_f.b(-128);
                    ce.field_p = 0;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            if ((rg.field_F ^ -1) != 0) {
              L2: {
                var3_int = this.field_b.field_d;
                hm.field_J = -1;
                if (var3_int != 2) {
                  if (var3_int > 2) {
                    hm.field_J = var3_int - 3;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  hm.field_J = -2;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L3: {
                if (be.field_j > 0) {
                  break L3;
                } else {
                  fieldTemp$0 = te.field_db + 1;
                  te.field_db = te.field_db + 1;
                  if (50 == fieldTemp$0) {
                    te.field_db = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var3_int = 0;
              L4: while (true) {
                if (var3_int >= 4) {
                  L5: {
                    var4 = 87 % ((param0 - -39) / 61);
                    fieldTemp$1 = rk.field_a + 1;
                    rk.field_a = rk.field_a + 1;
                    if (fieldTemp$1 >= 50) {
                      rk.field_a = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var3_int = this.field_b.field_d;
                    if (var3_int < 2) {
                      b.field_q = -1;
                      break L6;
                    } else {
                      if (var3_int - 2 == b.field_q) {
                        break L6;
                      } else {
                        ub.a(-2 + var3_int, (byte) -31);
                        break L6;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L7: {
                    if (var3_int != b.field_q) {
                      n.field_k[var3_int] = n.field_k[var3_int] - 30;
                      break L7;
                    } else {
                      n.field_k[var3_int] = n.field_k[var3_int] + 30;
                      break L7;
                    }
                  }
                  L8: {
                    if ((n.field_k[var3_int] ^ -1) <= -129) {
                      break L8;
                    } else {
                      n.field_k[var3_int] = 128;
                      break L8;
                    }
                  }
                  if ((n.field_k[var3_int] ^ -1) < -257) {
                    n.field_k[var3_int] = 256;
                    var3_int++;
                    continue L4;
                  } else {
                    var3_int++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.S(" + param0 + ',' + param1 + ')');
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
              return;
            }
          }
        }
    }

    private final void e(int param0, int param1) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.b((byte) 107, false);
              if (param0 == 50) {
                break L1;
              } else {
                this.field_o = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (0 == (param1 ^ -1)) {
                var3_int = rg.field_F + 2;
                this.f(rg.field_F, -257);
                this.field_h = this.field_n;
                this.field_b = this.field_q;
                fm.field_F = false;
                ce.field_p = 15;
                this.field_b.a(this.field_s.field_j, (byte) -125, this.b(true, ha.field_b, ei.field_K), var3_int);
                rg.field_F = -1;
                break L2;
              } else {
                L3: {
                  wm.field_b = param1;
                  fm.field_F = true;
                  this.field_h = this.field_o;
                  this.field_b = this.field_s;
                  ce.field_p = 1;
                  this.field_b.a(this.field_q.field_j, (byte) -114, this.b(true, ha.field_b, ei.field_K), 3);
                  if (-10 != (param1 ^ -1)) {
                    stackIn_7_0 = sg.field_jb.b(gn.field_c[qd.field_e][param1]) + 80;
                    break L3;
                  } else {
                    stackIn_7_0 = 0;
                    break L3;
                  }
                }
                L4: {
                  bm.field_c = stackIn_7_0;
                  if (nc.field_k.field_r > bm.field_c) {
                    bm.field_c = nc.field_k.field_r;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                j.field_d = 320 - -(bm.field_c >> 684009921);
                qo.field_s = 320 - (bm.field_c >> -596855359);
                wl.field_b = j.field_d + -34;
                this.f(param1, param0 ^ -307);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "pl.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 == 16777215) {
                break L1;
              } else {
                this.field_o = (int[]) null;
                break L1;
              }
            }
            var4_int = to.field_b[qd.field_e];
            if ((param1 ^ -1) != 0) {
              if ((param0 ^ -1) < -4) {
                L2: {
                  param0 -= 3;
                  var5 = param0 - -(7 * param1);
                  if (var5 > var4_int) {
                    stackIn_31_0 = 0;
                    break L2;
                  } else {
                    stackIn_31_0 = 1;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_26_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  if (-2 == (param0 ^ -1)) {
                    break L3;
                  } else {
                    if (-3 == (param0 ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        param0 = -2 + param0;
                        var5 = var4_int / 7;
                        if (var5 >= 8) {
                          var5 = 7;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (be.field_j > 0) {
                          break L5;
                        } else {
                          if (-4 <= (param0 ^ -1)) {
                            break L5;
                          } else {
                            return false;
                          }
                        }
                      }
                      L6: {
                        if (var5 < param0) {
                          stackIn_23_0 = 0;
                          break L6;
                        } else {
                          stackIn_23_0 = 1;
                          break L6;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "pl.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_26_0 != 0;
            } else {
              return stackIn_31_0 != 0;
            }
          }
        }
    }

    public static void d(byte param0) {
        try {
            field_t = null;
            field_p = null;
            if (param0 > -78) {
                field_m = -95;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pl.N(" + param0 + ')');
        }
    }

    static {
        field_r = 6080;
        field_m = 0;
    }
}
