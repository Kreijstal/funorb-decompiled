/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends al {
    static String field_o;
    private jp field_n;
    private int[] field_p;
    static int field_t;
    static int field_m;
    private jp field_s;
    static boolean field_r;
    static ll field_q;

    private final void a(byte param0, int param1) {
        int var3 = 0;
        this.b(false, 2);
        if (param0 != 0) {
            this.a((byte) -7, true);
        }
        if (!(-1 != param1)) {
            var3 = sh.field_a - -2;
            this.a(sh.field_a, (byte) -126);
            qn.field_b = 15;
            this.field_h = this.field_p;
            this.field_b = this.field_n;
            qn.field_h = false;
            this.field_b.a(this.field_s.field_j, (byte) -95, this.b(true, ha.field_b, ei.field_K), var3);
            sh.field_a = -1;
        }
    }

    final void b(int param0, int param1, int param2) {
        L0: {
          if ((be.field_j ^ -1) < -1) {
            break L0;
          } else {
            if ((sh.field_a ^ -1) == 0) {
              L1: {
                L2: {
                  param2 -= 80;
                  if (qg.field_a[2] >= param0) {
                    break L2;
                  } else {
                    if (param0 >= qg.field_a[2] + u.field_d[2]) {
                      break L2;
                    } else {
                      if ((to.field_c[2] ^ -1) <= (param2 ^ -1)) {
                        break L2;
                      } else {
                        if (dd.field_a[2] + to.field_c[2] > param2) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                if (param0 <= qg.field_a[3]) {
                  break L0;
                } else {
                  if (param0 >= u.field_d[3] + qg.field_a[3]) {
                    break L0;
                  } else {
                    if ((to.field_c[3] ^ -1) <= (param2 ^ -1)) {
                      break L0;
                    } else {
                      if (to.field_c[3] + dd.field_a[3] > param2) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              this.a((byte) 0, 4);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L3: {
          if (param1 == 32526) {
            break L3;
          } else {
            field_o = (String) null;
            break L3;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = -44 / ((param2 - 48) / 57);
        return (param0 ^ -1) > -5 ? true : false;
    }

    final int b(boolean param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        boolean stackOut_6_0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = ZombieDawn.field_J;
        param2 = param2 - id.field_M;
        param1 = param1 - vh.field_b;
        if (qn.field_b != 0) {
          return -1;
        } else {
          L0: {
            L1: {
              if (-1 != sh.field_a) {
                break L1;
              } else {
                param2 -= 80;
                var4 = -1;
                var5 = 3;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (0 > var5) {
                        break L4;
                      } else {
                        var6 = 80;
                        var7 = 130;
                        stackOut_6_0 = this.a(var5 + 2, -1, 110);
                        stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              if (-var6 + qg.field_a[var5] >= param1) {
                                break L5;
                              } else {
                                if ((var6 + qg.field_a[var5] ^ -1) >= (param1 ^ -1)) {
                                  break L5;
                                } else {
                                  if (param2 <= to.field_c[var5]) {
                                    break L5;
                                  } else {
                                    if (param2 >= to.field_c[var5] + var7) {
                                      break L5;
                                    } else {
                                      var4 = var5;
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var5--;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackIn_15_0 = 0;
                    break L3;
                  }
                  if (stackIn_15_0 <= var4) {
                    return 2 + var4;
                  } else {
                    param2 += 80;
                    if (var8 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L6: {
              L7: {
                var4 = 178;
                var5 = (param2 + -var4) / 29;
                if ((param2 ^ -1) > (var4 ^ -1)) {
                  break L7;
                } else {
                  if ((var5 ^ -1) > -1) {
                    break L7;
                  } else {
                    if (-7 > (var5 ^ -1)) {
                      break L7;
                    } else {
                      if (200 > param1) {
                        break L7;
                      } else {
                        if (-441 > (param1 ^ -1)) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              var5 = -1;
              break L6;
            }
            L8: {
              if (var5 == -1) {
                break L8;
              } else {
                if (!this.a(3 + var5, sh.field_a, 126)) {
                  break L8;
                } else {
                  return var5 + 3;
                }
              }
            }
            if ((param1 ^ -1) >= (wi.field_c + -11 ^ -1)) {
              break L0;
            } else {
              if ((wi.field_c - -29 ^ -1) >= (param1 ^ -1)) {
                break L0;
              } else {
                if (-121 <= (param2 ^ -1)) {
                  break L0;
                } else {
                  if (-161 >= (param2 ^ -1)) {
                    break L0;
                  } else {
                    return 2;
                  }
                }
              }
            }
          }
          L9: {
            if (param0) {
              break L9;
            } else {
              ac.d(-64);
              break L9;
            }
          }
          L10: {
            if (this.field_k >= param2) {
              break L10;
            } else {
              if ((param2 ^ -1) <= (this.field_k + 34 ^ -1)) {
                break L10;
              } else {
                if (this.field_g >= param1) {
                  break L10;
                } else {
                  if (param1 >= this.field_g - -this.field_i) {
                    break L10;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
          return -1;
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = ZombieDawn.field_J;
          super.a((byte) -127, param1);
          if (-1 != (qn.field_b ^ -1)) {
            L1: {
              if (!qn.field_h) {
                break L1;
              } else {
                qn.field_b = qn.field_b + 1;
                if (16 == qn.field_b) {
                  sh.field_a = kd.field_Db;
                  this.a(-1, (byte) -115);
                  cc.field_k.a();
                  bi.h(3, 3, 0, 0, 640, 341);
                  cn.field_f.b(-124);
                  qn.field_b = 0;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  return;
                }
              }
            }
            qn.field_b = qn.field_b - 1;
            return;
          } else {
            break L0;
          }
        }
        L2: {
          fieldTemp$0 = wm.field_e + 1;
          wm.field_e = wm.field_e + 1;
          if (fieldTemp$0 == 50) {
            wm.field_e = 0;
            break L2;
          } else {
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            L5: {
              if (4 <= var3) {
                break L5;
              } else {
                stackIn_25_0 = bn.field_i;

                stackIn_25_1 = var3;

                if (var5 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (stackIn_25_0 != stackIn_25_1) {
                        break L7;
                      } else {
                        aa.field_a[var3] = aa.field_a[var3] + 30;
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    aa.field_a[var3] = aa.field_a[var3] - 30;
                    break L6;
                  }
                  L8: {
                    if ((aa.field_a[var3] ^ -1) > -129) {
                      aa.field_a[var3] = 128;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-257 > (aa.field_a[var3] ^ -1)) {
                      aa.field_a[var3] = 256;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            fieldTemp$1 = ti.field_b + 1;
            ti.field_b = ti.field_b + 1;
            stackIn_25_0 = 50;
            stackIn_25_1 = fieldTemp$1;
            break L4;
          }
          L10: {
            if (stackIn_25_0 <= stackIn_25_1) {
              ti.field_b = 0;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            L12: {
              var3 = this.field_b.field_d;
              if (2 > var3) {
                break L12;
              } else {
                if (var3 + -2 != bn.field_i) {
                  kl.e(var3 + -2, 16777045);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                } else {
                  break L11;
                }
              }
            }
            bn.field_i = -1;
            break L11;
          }
          var4 = -54 % ((-39 - param0) / 61);
          return;
        }
    }

    ac(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
            this.field_p = this.field_h;
            this.field_n = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ac.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0, int param1) {
        np.field_E.b(vh.field_b, param1 + (id.field_M + 5));
        this.a(!this.a(2, -1, 123) ? true : false, 0, 82, param1);
        this.a(!this.a(3, -1, 123) ? true : false, 1, 82, param1);
        if (1 == bn.field_i && (to.field_b[0] ^ -1) > -14 && -1 == (to.field_b[1] ^ -1)) {
            bj.field_q.a(ch.field_c, qg.field_a[1] + (vh.field_b - 90), 170 + (to.field_c[1] + id.field_M), 240, 180, 16777215, 0, 1, 1, 0);
        }
        int var3 = -98 % ((param0 - -19) / 51);
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        vn var6;
        int var7;
        int var8;
        int var9;
        vn var10;
        vn var11;
        L0: {
          L1: {
            var9 = ZombieDawn.field_J;
            var10 = f.field_d;
            var11 = var10;
            var6 = jb.field_a[param1 - -1];
            jb.field_a[0].e(qg.field_a[param1] + vh.field_b, 73 + to.field_c[param1] + (id.field_M + param3), 96);
            if ((param1 ^ -1) != (bn.field_i ^ -1)) {
              break L1;
            } else {
              var10.b(qg.field_a[param1] + vh.field_b, param3 + to.field_c[param1] + id.field_M, 248, 16776960);
              var6.d(2 + (vh.field_b + qg.field_a[param1]), 1 + (param3 + id.field_M + to.field_c[param1]), 256);
              cc.field_b.b(qg.field_a[param1] + (vh.field_b - 10), id.field_M + to.field_c[param1] + (-10 - -param3), wd.field_z[ti.field_b]);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!param0) {
              break L2;
            } else {
              var10.d(qg.field_a[param1] + vh.field_b, param3 + (to.field_c[param1] + id.field_M), 100);
              if (var9 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
          }
          var10.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
          var6.d(qg.field_a[param1] + (vh.field_b - -2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
          break L0;
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            if (aa.field_a[param1] != 0) {
              L4: {
                if (bn.field_i == param1) {
                  stackIn_13_0 = 2;
                  break L4;
                } else {
                  stackIn_13_0 = 0;
                  break L4;
                }
              }
              var7 = stackIn_13_0;
              sg.field_jb.b(q.field_G[param1], 8 + vh.field_b + qg.field_a[param1], var10.field_t + (param3 + to.field_c[param1] + (id.field_M - -20)), var7, -1, aa.field_a[param1]);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            if (param1 != this.b(true, ha.field_b, ei.field_K)) {
              break L5;
            } else {
              sg.field_jb.b(q.field_G[param1], 8 + (qg.field_a[param1] + vh.field_b), to.field_c[param1] + (id.field_M + param3) + (var11.field_t + 20), 0, -1, aa.field_a[param1]);
              break L5;
            }
          }
        }
        L6: {
          if (param2 == 82) {
            break L6;
          } else {
            field_o = (String) null;
            break L6;
          }
        }
        L7: {
          if (param1 != bn.field_i) {
            break L7;
          } else {
            if (!this.field_b.field_j) {
              L8: {
                if (-1 != hn.field_q[param1]) {
                  ah.field_tb.c(-20 + vh.field_b - -qg.field_a[param1], param3 + id.field_M + to.field_c[param1] - -17);
                  break L8;
                } else {
                  break L8;
                }
              }
              if (0 == (pd.field_a[param1] ^ -1)) {
                break L7;
              } else {
                if (this.a(param1 + 3, -1, 117)) {
                  ah.field_tb.b(vh.field_b - (-qg.field_a[param1] - 55), id.field_M - (-to.field_c[param1] - param3 + -17));
                  break L7;
                } else {
                  break L7;
                }
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          if (-1 <= (be.field_j ^ -1)) {
            L10: {
              var7 = wm.field_e;
              var8 = 12 + wm.field_e;
              if ((param1 ^ -1) != -2) {
                break L10;
              } else {
                wd.field_y.b(vh.field_b + (qg.field_a[param1] - -2), param3 + (id.field_M + to.field_c[param1]) + -17, 50 + wd.field_z[var7] / 2);
                break L10;
              }
            }
            L11: {
              if (var8 >= 50) {
                var8 -= 50;
                break L11;
              } else {
                break L11;
              }
            }
            if ((param1 ^ -1) != -3) {
              break L9;
            } else {
              wd.field_y.b(2 + qg.field_a[param1] + vh.field_b, -17 + (param3 + id.field_M) - -to.field_c[param1], 50 + wd.field_z[var8] / 2);
              break L9;
            }
          } else {
            break L9;
          }
        }
    }

    final void e(byte param0) {
        if (!(qn.field_b == 0)) {
            return;
        }
        int var2 = 22 / ((param0 - -83) / 42);
        ca.a(false, true, df.field_i);
    }

    final static boolean d(int param0) {
        if (param0 != 50) {
            field_r = true;
        }
        return dk.field_ac;
    }

    public static void d(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -90) {
            field_r = false;
        }
    }

    final void a(int param0) {
        jp stackIn_37_0 = null;
        jp stackIn_38_0 = null;
        jp stackIn_39_0 = null;
        jp stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        jp stackIn_58_0 = null;
        jp stackIn_59_0 = null;
        jp stackIn_60_0 = null;
        jp stackIn_61_0 = null;
        jp stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        jp stackIn_79_0 = null;
        jp stackIn_80_0 = null;
        jp stackIn_81_0 = null;
        jp stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        jp stackIn_108_0 = null;
        jp stackIn_109_0 = null;
        jp stackIn_110_0 = null;
        jp stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        jp stackIn_113_0 = null;
        jp stackIn_115_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        jp stackIn_125_0 = null;
        jp stackIn_126_0 = null;
        jp stackIn_127_0 = null;
        jp stackIn_128_0 = null;
        jp stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        jp stackIn_131_0 = null;
        jp stackIn_133_0 = null;
        int stackIn_142_0 = 0;
        int stackIn_145_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawn.field_J;
                    if (param0 == -31645) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ac.d((byte) -3);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = this.field_b.field_d;
                    if (kg.field_i != 48) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!bo.field_p[82]) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (lo.field_j < 2) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    to.field_b[0] = 27;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (69 != kg.field_i) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (!bo.field_p[82]) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (2 > lo.field_j) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    to.field_b[0] = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (0 != (sh.field_a ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-97 == (kg.field_i ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var2 >= 2) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_b.b(0, -92);
                    if (var4 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (-3 > (var2 ^ -1)) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_b.b(this.field_b.field_d + -1, 60);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (-98 != (kg.field_i ^ -1)) {
                        statePc = 26;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var2 < 2) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (5 <= var2) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (this.a(var2 - -1, -1, -23)) {
                        statePc = 24;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.field_b.b(var2 - -1, param0 + 31525);
                    if (var4 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_b.b(0, -76);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (-100 != (kg.field_i ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((var2 ^ -1) > -3) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ao.field_J = var2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    this.field_b.b(0, 86);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (98 == kg.field_i) {
                        statePc = 32;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if ((var2 ^ -1) != 0) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_b.b(0, 56);
                    if (var4 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (-3 >= (var2 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_39_0 = this.field_b;
                    stackIn_37_0 = stackIn_39_0;
                    if (ao.field_J <= 1) {
                        statePc = 39;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_39_0 = (jp) ((Object) stackIn_37_0);
                    stackIn_38_0 = stackIn_39_0;
                    if ((ao.field_J ^ -1) <= -7) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (jp) ((Object) stackIn_38_0);
                    stackIn_40_1 = ao.field_J;
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = (jp) ((Object) stackIn_39_0);
                    stackIn_40_1 = 2;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    ((jp) (Object) stackIn_40_0).b(stackIn_40_1, 46);
                    if (var4 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var3 = ao.field_J;
                    if (99 == kg.field_i) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (kg.field_i == 98) {
                        statePc = 44;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var2 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if ((var2 ^ -1) != -2) {
                        statePc = 48;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ao.field_J = var2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if ((kg.field_i ^ -1) != -99) {
                        statePc = 144;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((var2 ^ -1) <= -1) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_b.b(0, 50);
                    if (var4 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if ((this.field_b.field_d ^ -1) == -1) {
                        statePc = 63;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    if (-2 == (this.field_b.field_d ^ -1)) {
                        statePc = 63;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if ((this.field_b.field_d ^ -1) == -3) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_b.b(this.field_b.field_d - 1, -89);
                    if (var4 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_60_0 = this.field_b;
                    stackIn_58_0 = stackIn_60_0;
                    if (0 == var3) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (jp) ((Object) stackIn_58_0);
                    stackIn_59_0 = stackIn_61_0;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (jp) ((Object) stackIn_59_0);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_62_0 = (jp) ((Object) stackIn_60_0);
                    stackIn_62_1 = var3;
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (jp) ((Object) stackIn_61_0);
                    stackIn_62_1 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    ((jp) (Object) stackIn_62_0).b(stackIn_62_1, 116);
                    if (var4 == 0) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    this.field_b.b(-1 + this.field_b.field_h, 120);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = this.a(this.field_b.field_d, sh.field_a, 108) ? 1 : 0;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_65_0 = 99;
                    stackIn_67_0 = stackIn_65_0;
                    if (var4 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 != kg.field_i) {
                        statePc = 120;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var2 >= 0) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    this.field_b.b(0, param0 ^ 31739);
                    if (var4 == 0) {
                        statePc = 120;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if ((this.field_b.field_d ^ -1) == (this.field_b.field_h + -1 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (this.field_b.field_d == 0) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (-2 == (this.field_b.field_d ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    this.field_b.b(this.field_b.field_d - -1, 57);
                    if (var4 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    this.field_b.b(2, param0 + 31538);
                    if (var4 == 0) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = this.field_b;
                    stackIn_79_0 = stackIn_81_0;
                    if (var3 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackIn_81_0 = (jp) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_81_0;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_82_0 = (jp) ((Object) stackIn_80_0);
                    stackIn_82_1 = 0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackIn_82_0 = (jp) ((Object) stackIn_81_0);
                    stackIn_82_1 = var3;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    ((jp) (Object) stackIn_82_0).b(stackIn_82_1, param0 + 31524);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = this.a(this.field_b.field_d, sh.field_a, -119) ? 1 : 0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0 == 0) {
                        statePc = 71;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_84_0 = kg.field_i;
                    stackIn_86_0 = stackIn_84_0;
                    if (var4 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (stackIn_86_0 == 97) {
                        statePc = 89;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if ((kg.field_i ^ -1) == -97) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_b.g(26);
                    statePc = 97;
                    continue stateLoop;
                }
                case 89: {
                    if (-1 != (var2 ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    this.field_b.b(1, param0 ^ 31701);
                    if (var4 == 0) {
                        statePc = 96;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if ((var2 ^ -1) == -2) {
                        statePc = 95;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (0 <= var2) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    this.field_b.b(0, 101);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    this.field_b.g(26);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    return;
                }
                case 99: {
                    this.field_b.b(this.field_b.field_d - -1, 57);
                    if (var4 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (-2 == (this.field_b.field_d ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 104: {
                    this.field_b.b(2, param0 + 31538);
                    if (var4 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (this.field_b.field_d == 0) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackIn_112_0 = (jp) ((Object) stackIn_108_0);
                    stackIn_112_1 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_113_0 = (jp) ((Object) stackIn_109_0);
                    stackIn_110_0 = stackIn_113_0;
                    if (-2 == (var3 ^ -1)) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    stackIn_108_0 = (jp) ((Object) stackIn_110_0);
                    statePc = 108;
                    continue stateLoop;
                }
                case 111: {
                    stackIn_118_0 = this.a(this.field_b.field_d, sh.field_a, -119) ? 1 : 0;
                    statePc = 118;
                    continue stateLoop;
                }
                case 112: {
                    ((jp) (Object) stackIn_112_0).b(stackIn_112_1, param0 + 31524);
                    statePc = 111;
                    continue stateLoop;
                }
                case 113: {
                    stackIn_112_0 = (jp) ((Object) stackIn_113_0);
                    stackIn_112_1 = var3;
                    statePc = 112;
                    continue stateLoop;
                }
                case 114: {
                    stackIn_113_0 = this.field_b;
                    stackIn_115_0 = stackIn_113_0;
                    if (var3 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_109_0 = (jp) ((Object) stackIn_115_0);
                    statePc = 109;
                    continue stateLoop;
                }
                case 116: {
                    if ((this.field_b.field_d ^ -1) == (this.field_b.field_h + -1 ^ -1)) {
                        statePc = 114;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 == 0) {
                        statePc = 116;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_118_0 = kg.field_i;
                    stackIn_121_0 = stackIn_118_0;
                    if (var4 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackIn_86_0 = stackIn_121_0;
                    statePc = 86;
                    continue stateLoop;
                }
                case 123: {
                    this.field_b.b(this.field_b.field_d - 1, -89);
                    if (var4 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_131_0 = (jp) ((Object) stackIn_125_0);
                    statePc = 131;
                    continue stateLoop;
                }
                case 126: {
                    stackIn_129_0 = (jp) ((Object) stackIn_126_0);
                    stackIn_129_1 = 0;
                    statePc = 129;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_126_0 = (jp) ((Object) stackIn_127_0);
                    stackIn_128_0 = stackIn_126_0;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 126;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    stackIn_125_0 = (jp) ((Object) stackIn_128_0);
                    statePc = 125;
                    continue stateLoop;
                }
                case 129: {
                    ((jp) (Object) stackIn_129_0).b(stackIn_129_1, 116);
                    if (var4 == 0) {
                        statePc = 138;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_129_0 = (jp) ((Object) stackIn_131_0);
                    stackIn_129_1 = var3;
                    statePc = 129;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_131_0 = this.field_b;
                    stackIn_133_0 = stackIn_131_0;
                    if (0 == var3) {
                        statePc = 131;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackIn_127_0 = (jp) ((Object) stackIn_133_0);
                    statePc = 127;
                    continue stateLoop;
                }
                case 134: {
                    if ((this.field_b.field_d ^ -1) == -3) {
                        statePc = 132;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (-2 == (this.field_b.field_d ^ -1)) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackIn_142_0 = this.a(this.field_b.field_d, sh.field_a, 108) ? 1 : 0;
                    statePc = 142;
                    continue stateLoop;
                }
                case 139: {
                    this.field_b.b(-1 + this.field_b.field_h, 120);
                    statePc = 138;
                    continue stateLoop;
                }
                case 140: {
                    if ((this.field_b.field_d ^ -1) == -1) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (stackIn_142_0 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    stackIn_142_0 = 99;
                    stackIn_145_0 = stackIn_142_0;
                    if (var4 != 0) {
                        statePc = 142;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackIn_67_0 = stackIn_145_0;
                    statePc = 67;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(ec param0, boolean param1, java.awt.Component param2, rj param3, int param4, int param5) {
        try {
            wn.a(param4, param3, 1024, param2, param0, param4, param1, -112);
            if (param5 != -97) {
                field_t = 126;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ac.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        super.a((byte) -65);
        this.e(-124, 80);
        if (!(qn.field_b == 0)) {
            var2 = qn.field_b << 2104899396;
            var3 = var2 * 2;
            if ((var3 ^ -1) < -257) {
                var3 = 256;
            }
            var4 = (var2 ^ -1) <= -129 ? 2 * (-128 + var2) : 0;
            cc.field_k.c(0, 80, var3, var4);
        }
        hk.field_H.b(vh.field_b, 80 + id.field_M);
        if (param0 >= -35) {
            this.field_s = (jp) null;
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = -9 / ((param1 - -11) / 63);
        cc.field_k = new vn(640, 341);
        cc.field_k.a();
        bi.d();
        this.e(-122, 0);
        cn.field_f.b(13);
    }

    final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ZombieDawn.field_J;
        if (this.field_h.length > param1) {
          L0: {
            if (param2 == -8512) {
              break L0;
            } else {
              this.a(false, -61, -49);
              break L0;
            }
          }
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    var4 = this.field_h[param1];
                    var5 = var4;
                    if ((var5 ^ -1) != -47) {
                      break L5;
                    } else {
                      if (var6 == 0) {
                        if (!this.field_b.d(-125)) {
                          break L1;
                        } else {
                          if (-1 > (be.field_j ^ -1)) {
                            ed.a(-11325, 1);
                            ca.a(param0, true, 9);
                            if (var6 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var5 == 45) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
                if (!this.field_b.d(-123)) {
                  break L2;
                } else {
                  ed.a(-11325, 0);
                  ca.a(param0, true, 9);
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              super.a(param0, param1, -8512);
              break L1;
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final static void c(int param0) {
        if (!(vk.field_b == null)) {
            return;
        }
        f.field_j = new String[15];
        f.field_j[13] = vd.field_c;
        f.field_j[9] = fm.field_H;
        f.field_j[2] = uj.field_b;
        vk.field_b = new String[47];
        f.field_j[5] = qg.field_h;
        f.field_j[6] = vl.field_k;
        f.field_j[4] = uk.field_b;
        f.field_j[7] = gk.field_H;
        f.field_j[3] = p.field_c;
        vk.field_b[13] = co.field_a;
        vk.field_b[3] = uk.field_b;
        vk.field_b[14] = qg.field_h;
        vk.field_b[5] = ua.field_b;
        vk.field_b[11] = bg.field_n;
        vk.field_b[7] = ui.field_a;
        vk.field_b[2] = p.field_c;
        vk.field_b[1] = sh.field_c;
        vk.field_b[12] = wg.field_l;
        vk.field_b[15] = rc.field_r;
        vk.field_b[0] = po.field_Ab;
        vk.field_b[4] = kj.field_e;
        vk.field_b[16] = uk.field_c;
        vk.field_b[6] = ua.field_b;
        vk.field_b[43] = pa.field_A;
        vk.field_b[10] = ob.field_a[2];
        vk.field_b[39] = "Shouldn't See Me";
        vk.field_b[18] = oe.field_f;
        vk.field_b[38] = oh.field_jb;
        vk.field_b[42] = qc.field_b;
        vk.field_b[21] = pg.field_n;
        vk.field_b[8] = ob.field_a[0];
        vk.field_b[35] = sd.field_a;
        vk.field_b[44] = "";
        vk.field_b[40] = ha.field_c;
        if (param0 != -32435) {
            return;
        }
        vk.field_b[34] = md.field_qb[0];
        vk.field_b[46] = q.field_G[1];
        vk.field_b[37] = wl.field_a[0];
        vk.field_b[20] = vj.field_s;
        vk.field_b[9] = ob.field_a[1];
        vk.field_b[45] = q.field_G[0];
        vk.field_b[19] = hb.field_G;
        vk.field_b[36] = wg.field_o;
        vk.field_b[17] = dm.field_q;
        vk.field_b[41] = vd.field_c;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawn.field_J;
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    sh.field_a = -1;
                    this.field_h = this.field_p;
                    this.field_b = this.field_n;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    bn.field_i = -1;
                    var3 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((var3 ^ -1) <= -5) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    aa.field_a[var3] = 128;
                    var3++;
                    if (var4 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (param1 == 2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.a(-128);
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_m = 0;
        field_r = false;
        field_q = null;
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
