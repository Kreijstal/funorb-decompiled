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
        boolean discarded$1 = false;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_14_0 = 0;
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
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
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
              discarded$1 = ac.d(-64);
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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
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
          fieldTemp$2 = wm.field_e + 1;
          wm.field_e = wm.field_e + 1;
          if (fieldTemp$2 == 50) {
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
                stackOut_12_0 = bn.field_i;
                stackOut_12_1 = var3;
                stackIn_25_0 = stackOut_12_0;
                stackIn_25_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (var5 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (stackIn_13_0 != stackIn_13_1) {
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
            fieldTemp$3 = ti.field_b + 1;
            ti.field_b = ti.field_b + 1;
            stackOut_24_0 = 50;
            stackOut_24_1 = fieldTemp$3;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
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
        int discarded$0 = 0;
        np.field_E.b(vh.field_b, param1 + (id.field_M + 5));
        this.a(!this.a(2, -1, 123) ? true : false, 0, 82, param1);
        this.a(!this.a(3, -1, 123) ? true : false, 1, 82, param1);
        if (1 == bn.field_i) {
            if ((to.field_b[0] ^ -1) > -14) {
                if (-1 == (to.field_b[1] ^ -1)) {
                    discarded$0 = bj.field_q.a(ch.field_c, qg.field_a[1] + (vh.field_b - 90), 170 + (to.field_c[1] + id.field_M), 240, 180, 16777215, 0, 1, 1, 0);
                }
            }
        }
        int var3 = -98 % ((param0 - -19) / 51);
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        vn var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vn var10 = null;
        vn var11 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
                  stackOut_12_0 = 2;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_13_0 = stackOut_11_0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
        jp stackOut_36_0 = null;
        jp stackOut_37_0 = null;
        jp stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        jp stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        jp stackOut_57_0 = null;
        jp stackOut_58_0 = null;
        jp stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        jp stackOut_59_0 = null;
        jp stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_66_0 = 0;
        int stackOut_144_0 = 0;
        jp stackOut_132_0 = null;
        jp stackOut_133_0 = null;
        jp stackOut_127_0 = null;
        jp stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        jp stackOut_128_0 = null;
        jp stackOut_125_0 = null;
        jp stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        boolean stackOut_138_0 = false;
        int stackOut_145_0 = 0;
        jp stackOut_78_0 = null;
        jp stackOut_79_0 = null;
        jp stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        jp stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        boolean stackOut_83_0 = false;
        int stackOut_85_0 = 0;
        int stackOut_120_0 = 0;
        jp stackOut_114_0 = null;
        jp stackOut_115_0 = null;
        jp stackOut_109_0 = null;
        jp stackOut_110_0 = null;
        jp stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        jp stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        boolean stackOut_111_0 = false;
        int stackOut_121_0 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 == -31645) {
            break L0;
          } else {
            ac.d((byte) -3);
            break L0;
          }
        }
        L1: {
          var2 = this.field_b.field_d;
          if (kg.field_i != 48) {
            break L1;
          } else {
            if (!bo.field_p[82]) {
              break L1;
            } else {
              if (lo.field_j < 2) {
                break L1;
              } else {
                to.field_b[0] = 27;
                break L1;
              }
            }
          }
        }
        L2: {
          if (69 != kg.field_i) {
            break L2;
          } else {
            if (!bo.field_p[82]) {
              break L2;
            } else {
              if (2 > lo.field_j) {
                break L2;
              } else {
                to.field_b[0] = 0;
                break L2;
              }
            }
          }
        }
        L3: {
          L4: {
            L5: {
              if (0 != (sh.field_a ^ -1)) {
                break L5;
              } else {
                L6: {
                  if (-97 == (kg.field_i ^ -1)) {
                    L7: {
                      if (var2 >= 2) {
                        break L7;
                      } else {
                        this.field_b.b(0, -92);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (-3 > (var2 ^ -1)) {
                      this.field_b.b(this.field_b.field_d + -1, 60);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (-98 != (kg.field_i ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      if (var2 < 2) {
                        break L9;
                      } else {
                        if (5 <= var2) {
                          break L8;
                        } else {
                          if (this.a(var2 - -1, -1, -23)) {
                            this.field_b.b(var2 - -1, param0 + 31525);
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    this.field_b.b(0, -76);
                    break L8;
                  }
                }
                L10: {
                  if (-100 != (kg.field_i ^ -1)) {
                    break L10;
                  } else {
                    L11: {
                      if ((var2 ^ -1) > -3) {
                        break L11;
                      } else {
                        ao.field_J = var2;
                        break L11;
                      }
                    }
                    this.field_b.b(0, 86);
                    break L10;
                  }
                }
                if (98 == kg.field_i) {
                  L12: {
                    if ((var2 ^ -1) != 0) {
                      break L12;
                    } else {
                      this.field_b.b(0, 56);
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (-3 >= (var2 ^ -1)) {
                    break L4;
                  } else {
                    L13: {
                      L14: {
                        stackOut_36_0 = this.field_b;
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (ao.field_J <= 1) {
                          break L14;
                        } else {
                          stackOut_37_0 = (jp) ((Object) stackIn_37_0);
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_38_0 = stackOut_37_0;
                          if ((ao.field_J ^ -1) <= -7) {
                            break L14;
                          } else {
                            stackOut_38_0 = (jp) ((Object) stackIn_38_0);
                            stackOut_38_1 = ao.field_J;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            break L13;
                          }
                        }
                      }
                      stackOut_39_0 = (jp) ((Object) stackIn_39_0);
                      stackOut_39_1 = 2;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L13;
                    }
                    ((jp) (Object) stackIn_40_0).b(stackIn_40_1, 46);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L15: {
              L16: {
                var3 = ao.field_J;
                if (99 == kg.field_i) {
                  break L16;
                } else {
                  if (kg.field_i == 98) {
                    break L16;
                  } else {
                    break L15;
                  }
                }
              }
              L17: {
                if (var2 == 0) {
                  break L17;
                } else {
                  if ((var2 ^ -1) != -2) {
                    break L15;
                  } else {
                    break L17;
                  }
                }
              }
              ao.field_J = var2;
              break L15;
            }
            L18: {
              L19: {
                if ((kg.field_i ^ -1) != -99) {
                  break L19;
                } else {
                  L20: {
                    if ((var2 ^ -1) <= -1) {
                      break L20;
                    } else {
                      this.field_b.b(0, 50);
                      if (var4 == 0) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: while (true) {
                    L22: {
                      L23: {
                        if ((this.field_b.field_d ^ -1) == -1) {
                          break L23;
                        } else {
                          if (-2 == (this.field_b.field_d ^ -1)) {
                            break L23;
                          } else {
                            L24: {
                              if ((this.field_b.field_d ^ -1) == -3) {
                                break L24;
                              } else {
                                this.field_b.b(this.field_b.field_d - 1, -89);
                                if (var4 == 0) {
                                  break L22;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              L26: {
                                stackOut_57_0 = this.field_b;
                                stackIn_60_0 = stackOut_57_0;
                                stackIn_58_0 = stackOut_57_0;
                                if (0 == var3) {
                                  break L26;
                                } else {
                                  stackOut_58_0 = (jp) ((Object) stackIn_58_0);
                                  stackIn_61_0 = stackOut_58_0;
                                  stackIn_59_0 = stackOut_58_0;
                                  if (-2 != (var3 ^ -1)) {
                                    stackOut_61_0 = (jp) ((Object) stackIn_61_0);
                                    stackOut_61_1 = 0;
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    break L25;
                                  } else {
                                    stackOut_59_0 = (jp) ((Object) stackIn_59_0);
                                    stackIn_60_0 = stackOut_59_0;
                                    break L26;
                                  }
                                }
                              }
                              stackOut_60_0 = (jp) ((Object) stackIn_60_0);
                              stackOut_60_1 = var3;
                              stackIn_62_0 = stackOut_60_0;
                              stackIn_62_1 = stackOut_60_1;
                              break L25;
                            }
                            ((jp) (Object) stackIn_62_0).b(stackIn_62_1, 116);
                            if (var4 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      this.field_b.b(-1 + this.field_b.field_h, 120);
                      break L22;
                    }
                    stackOut_64_0 = this.a(this.field_b.field_d, sh.field_a, 108);
                    stackIn_65_0 = stackOut_64_0 ? 1 : 0;
                    L27: while (true) {
                      if (stackIn_65_0 == 0) {
                        continue L21;
                      } else {
                        stackOut_66_0 = 99;
                        stackIn_65_0 = stackOut_66_0;
                        stackIn_67_0 = stackOut_66_0;
                        if (var4 != 0) {
                          continue L27;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                }
              }
              L28: while (true) {
                stackOut_144_0 = 99;
                stackIn_142_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (var4 != 0) {
                  L29: while (true) {
                    if (stackIn_142_0 == 0) {
                      L30: {
                        L31: {
                          if ((this.field_b.field_d ^ -1) == -1) {
                            break L31;
                          } else {
                            if (-2 == (this.field_b.field_d ^ -1)) {
                              break L31;
                            } else {
                              L32: {
                                if ((this.field_b.field_d ^ -1) == -3) {
                                  break L32;
                                } else {
                                  this.field_b.b(this.field_b.field_d - 1, -89);
                                  if (var4 == 0) {
                                    break L30;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              L33: {
                                L34: {
                                  stackOut_132_0 = this.field_b;
                                  stackIn_131_0 = stackOut_132_0;
                                  stackIn_133_0 = stackOut_132_0;
                                  if (0 == var3) {
                                    break L34;
                                  } else {
                                    stackOut_133_0 = (jp) ((Object) stackIn_133_0);
                                    stackIn_127_0 = stackOut_133_0;
                                    stackOut_127_0 = (jp) ((Object) stackIn_127_0);
                                    stackIn_126_0 = stackOut_127_0;
                                    stackIn_128_0 = stackOut_127_0;
                                    if (-2 != (var3 ^ -1)) {
                                      stackOut_126_0 = (jp) ((Object) stackIn_126_0);
                                      stackOut_126_1 = 0;
                                      stackIn_129_0 = stackOut_126_0;
                                      stackIn_129_1 = stackOut_126_1;
                                      break L33;
                                    } else {
                                      stackOut_128_0 = (jp) ((Object) stackIn_128_0);
                                      stackIn_125_0 = stackOut_128_0;
                                      stackOut_125_0 = (jp) ((Object) stackIn_125_0);
                                      stackIn_131_0 = stackOut_125_0;
                                      break L34;
                                    }
                                  }
                                }
                                stackOut_131_0 = (jp) ((Object) stackIn_131_0);
                                stackOut_131_1 = var3;
                                stackIn_129_0 = stackOut_131_0;
                                stackIn_129_1 = stackOut_131_1;
                                break L33;
                              }
                              ((jp) (Object) stackIn_129_0).b(stackIn_129_1, 116);
                              if (var4 == 0) {
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                        }
                        this.field_b.b(-1 + this.field_b.field_h, 120);
                        break L30;
                      }
                      stackOut_138_0 = this.a(this.field_b.field_d, sh.field_a, 108);
                      stackIn_142_0 = stackOut_138_0 ? 1 : 0;
                      continue L29;
                    } else {
                      continue L28;
                    }
                  }
                } else {
                  stackOut_145_0 = stackIn_145_0;
                  stackIn_67_0 = stackOut_145_0;
                  break L18;
                }
              }
            }
            L35: {
              L36: {
                if (stackIn_67_0 != kg.field_i) {
                  break L36;
                } else {
                  L37: {
                    if (var2 >= 0) {
                      break L37;
                    } else {
                      this.field_b.b(0, param0 ^ 31739);
                      if (var4 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: while (true) {
                    L39: {
                      L40: {
                        if ((this.field_b.field_d ^ -1) == (this.field_b.field_h + -1 ^ -1)) {
                          break L40;
                        } else {
                          L41: {
                            if (this.field_b.field_d == 0) {
                              break L41;
                            } else {
                              if (-2 == (this.field_b.field_d ^ -1)) {
                                break L41;
                              } else {
                                this.field_b.b(this.field_b.field_d - -1, 57);
                                if (var4 == 0) {
                                  break L39;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                          this.field_b.b(2, param0 + 31538);
                          if (var4 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      L42: {
                        L43: {
                          stackOut_78_0 = this.field_b;
                          stackIn_81_0 = stackOut_78_0;
                          stackIn_79_0 = stackOut_78_0;
                          if (var3 == 0) {
                            break L43;
                          } else {
                            stackOut_79_0 = (jp) ((Object) stackIn_79_0);
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_80_0 = stackOut_79_0;
                            if (-2 == (var3 ^ -1)) {
                              break L43;
                            } else {
                              stackOut_80_0 = (jp) ((Object) stackIn_80_0);
                              stackOut_80_1 = 0;
                              stackIn_82_0 = stackOut_80_0;
                              stackIn_82_1 = stackOut_80_1;
                              break L42;
                            }
                          }
                        }
                        stackOut_81_0 = (jp) ((Object) stackIn_81_0);
                        stackOut_81_1 = var3;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        break L42;
                      }
                      ((jp) (Object) stackIn_82_0).b(stackIn_82_1, param0 + 31524);
                      break L39;
                    }
                    stackOut_83_0 = this.a(this.field_b.field_d, sh.field_a, -119);
                    stackIn_84_0 = stackOut_83_0 ? 1 : 0;
                    L44: while (true) {
                      if (stackIn_84_0 == 0) {
                        continue L38;
                      } else {
                        stackOut_85_0 = kg.field_i;
                        stackIn_84_0 = stackOut_85_0;
                        stackIn_86_0 = stackOut_85_0;
                        if (var4 != 0) {
                          continue L44;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                }
              }
              L45: while (true) {
                stackOut_120_0 = kg.field_i;
                stackIn_118_0 = stackOut_120_0;
                stackIn_121_0 = stackOut_120_0;
                if (var4 != 0) {
                  L46: while (true) {
                    if (stackIn_118_0 == 0) {
                      L47: {
                        L48: {
                          if ((this.field_b.field_d ^ -1) == (this.field_b.field_h + -1 ^ -1)) {
                            break L48;
                          } else {
                            L49: {
                              if (this.field_b.field_d == 0) {
                                break L49;
                              } else {
                                if (-2 == (this.field_b.field_d ^ -1)) {
                                  break L49;
                                } else {
                                  this.field_b.b(this.field_b.field_d - -1, 57);
                                  if (var4 == 0) {
                                    break L47;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                            this.field_b.b(2, param0 + 31538);
                            if (var4 == 0) {
                              break L47;
                            } else {
                              break L48;
                            }
                          }
                        }
                        L50: {
                          L51: {
                            stackOut_114_0 = this.field_b;
                            stackIn_113_0 = stackOut_114_0;
                            stackIn_115_0 = stackOut_114_0;
                            if (var3 == 0) {
                              break L51;
                            } else {
                              stackOut_115_0 = (jp) ((Object) stackIn_115_0);
                              stackIn_109_0 = stackOut_115_0;
                              stackOut_109_0 = (jp) ((Object) stackIn_109_0);
                              stackIn_113_0 = stackOut_109_0;
                              stackIn_110_0 = stackOut_109_0;
                              if (-2 == (var3 ^ -1)) {
                                break L51;
                              } else {
                                stackOut_110_0 = (jp) ((Object) stackIn_110_0);
                                stackIn_108_0 = stackOut_110_0;
                                stackOut_108_0 = (jp) ((Object) stackIn_108_0);
                                stackOut_108_1 = 0;
                                stackIn_112_0 = stackOut_108_0;
                                stackIn_112_1 = stackOut_108_1;
                                break L50;
                              }
                            }
                          }
                          stackOut_113_0 = (jp) ((Object) stackIn_113_0);
                          stackOut_113_1 = var3;
                          stackIn_112_0 = stackOut_113_0;
                          stackIn_112_1 = stackOut_113_1;
                          break L50;
                        }
                        ((jp) (Object) stackIn_112_0).b(stackIn_112_1, param0 + 31524);
                        break L47;
                      }
                      stackOut_111_0 = this.a(this.field_b.field_d, sh.field_a, -119);
                      stackIn_118_0 = stackOut_111_0 ? 1 : 0;
                      continue L46;
                    } else {
                      continue L45;
                    }
                  }
                } else {
                  stackOut_121_0 = stackIn_121_0;
                  stackIn_86_0 = stackOut_121_0;
                  break L35;
                }
              }
            }
            L52: {
              if (stackIn_86_0 == 97) {
                break L52;
              } else {
                if ((kg.field_i ^ -1) == -97) {
                  break L52;
                } else {
                  this.field_b.g(26);
                  break L3;
                }
              }
            }
            L53: {
              if (-1 != (var2 ^ -1)) {
                break L53;
              } else {
                this.field_b.b(1, param0 ^ 31701);
                if (var4 == 0) {
                  break L4;
                } else {
                  break L53;
                }
              }
            }
            L54: {
              if ((var2 ^ -1) == -2) {
                break L54;
              } else {
                if (0 <= var2) {
                  break L4;
                } else {
                  break L54;
                }
              }
            }
            this.field_b.b(0, 101);
            break L4;
          }
          this.field_b.g(26);
          break L3;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        if (vk.field_b != null) {
          return;
        } else {
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
          if (param0 == -32435) {
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
            return;
          } else {
            return;
          }
        }
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0) {
            sh.field_a = -1;
            this.field_h = this.field_p;
            this.field_b = this.field_n;
            break L0;
          } else {
            break L0;
          }
        }
        bn.field_i = -1;
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= -5) {
                break L3;
              } else {
                aa.field_a[var3] = 128;
                var3++;
                if (var4 != 0) {
                  break L2;
                } else {
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (param1 == 2) {
              break L2;
            } else {
              this.a(-128);
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_m = 0;
        field_r = false;
        field_q = null;
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
