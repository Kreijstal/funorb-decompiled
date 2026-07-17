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

    private final void a() {
        int discarded$0 = 2;
        int discarded$1 = 0;
        this.b();
    }

    final void b(int param0, int param1, int param2) {
        L0: {
          if (be.field_j > 0) {
            break L0;
          } else {
            if (sh.field_a == -1) {
              L1: {
                L2: {
                  param2 -= 80;
                  if (qg.field_a[2] >= param0) {
                    break L2;
                  } else {
                    if (param0 >= qg.field_a[2] + u.field_d[2]) {
                      break L2;
                    } else {
                      if (to.field_c[2] >= param2) {
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
                    if (to.field_c[3] >= param2) {
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
              int discarded$4 = 4;
              int discarded$5 = 0;
              this.a();
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
            field_o = null;
            break L3;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = -44 / ((param2 - 48) / 57);
        return param0 < 4 ? true : false;
    }

    final int b(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        param2 = param2 - id.field_M;
        param1 = param1 - vh.field_b;
        if (qn.field_b != 0) {
          return -1;
        } else {
          L0: {
            if (-1 != sh.field_a) {
              L1: {
                L2: {
                  var4 = 178;
                  var5 = (param2 + -var4) / 29;
                  if (~param2 > ~var4) {
                    break L2;
                  } else {
                    if (var5 < 0) {
                      break L2;
                    } else {
                      if (var5 > 6) {
                        break L2;
                      } else {
                        if (200 > param1) {
                          break L2;
                        } else {
                          if (param1 > 440) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                var5 = -1;
                break L1;
              }
              L3: {
                if (var5 == -1) {
                  break L3;
                } else {
                  if (!this.a(3 + var5, sh.field_a, 126)) {
                    break L3;
                  } else {
                    return var5 + 3;
                  }
                }
              }
              if (~param1 >= ~(wi.field_c + -11)) {
                break L0;
              } else {
                if (~(wi.field_c - -29) >= ~param1) {
                  break L0;
                } else {
                  if (param2 <= 120) {
                    break L0;
                  } else {
                    if (param2 >= 160) {
                      break L0;
                    } else {
                      return 2;
                    }
                  }
                }
              }
            } else {
              param2 -= 80;
              var4 = -1;
              var5 = 3;
              L4: while (true) {
                if (0 > var5) {
                  if (0 <= var4) {
                    return 2 + var4;
                  } else {
                    param2 += 80;
                    break L0;
                  }
                } else {
                  L5: {
                    var6 = 80;
                    var7 = 130;
                    if (!this.a(var5 + 2, -1, 110)) {
                      break L5;
                    } else {
                      if (-var6 + qg.field_a[var5] >= param1) {
                        break L5;
                      } else {
                        if (~(var6 + qg.field_a[var5]) >= ~param1) {
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
                  continue L4;
                }
              }
            }
          }
          L6: {
            if (param0) {
              break L6;
            } else {
              boolean discarded$1 = ac.d(-64);
              break L6;
            }
          }
          L7: {
            if (((ac) this).field_k >= param2) {
              break L7;
            } else {
              if (~param2 <= ~(((ac) this).field_k + 34)) {
                break L7;
              } else {
                if (((ac) this).field_g >= param1) {
                  break L7;
                } else {
                  if (param1 >= ((ac) this).field_g - -((ac) this).field_i) {
                    break L7;
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          super.a((byte) -127, param1);
          if (qn.field_b != 0) {
            if (!qn.field_h) {
              qn.field_b = qn.field_b - 1;
              return;
            } else {
              qn.field_b = qn.field_b + 1;
              if (16 == qn.field_b) {
                sh.field_a = kd.field_Db;
                this.a(-1, (byte) -115);
                cc.field_k.a();
                bi.h(3, 3, 0, 0, 640, 341);
                cn.field_f.b(-124);
                qn.field_b = 0;
                break L0;
              } else {
                return;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          int fieldTemp$2 = wm.field_e + 1;
          wm.field_e = wm.field_e + 1;
          if (fieldTemp$2 == 50) {
            wm.field_e = 0;
            break L1;
          } else {
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (4 <= var3) {
            L3: {
              int fieldTemp$3 = ti.field_b + 1;
              ti.field_b = ti.field_b + 1;
              if (50 <= fieldTemp$3) {
                ti.field_b = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var3 = ((ac) this).field_b.field_d;
              if (2 > var3) {
                bn.field_i = -1;
                break L4;
              } else {
                if (var3 + -2 != bn.field_i) {
                  kl.e(var3 + -2, 16777045);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var4 = -54 % ((-39 - param0) / 61);
            return;
          } else {
            L5: {
              if (bn.field_i != var3) {
                aa.field_a[var3] = aa.field_a[var3] - 30;
                break L5;
              } else {
                aa.field_a[var3] = aa.field_a[var3] + 30;
                break L5;
              }
            }
            L6: {
              if (aa.field_a[var3] > -129) {
                aa.field_a[var3] = 128;
                break L6;
              } else {
                break L6;
              }
            }
            if (-257 < aa.field_a[var3]) {
              aa.field_a[var3] = 256;
              var3++;
              continue L2;
            } else {
              var3++;
              continue L2;
            }
          }
        }
    }

    ac(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
            ((ac) this).field_p = ((ac) this).field_h;
            ((ac) this).field_n = ((ac) this).field_b;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ac.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + (param7 != null ? "{...}" : "null") + 41);
        }
    }

    private final void e(int param0, int param1) {
        np.field_E.b(vh.field_b, param1 + (id.field_M + 5));
        this.a(!this.a(2, -1, 123) ? true : false, 0, 82, param1);
        this.a(!this.a(3, -1, 123) ? true : false, 1, 82, param1);
        if (1 == bn.field_i) {
            if (to.field_b[0] > -14) {
                if (-1 == to.field_b[1]) {
                    int discarded$0 = bj.field_q.a(ch.field_c, qg.field_a[1] + (vh.field_b - 90), 170 + (to.field_c[1] + id.field_M), 240, 180, 16777215, 0, 1, 1, 0);
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
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          var10 = f.field_d;
          var11 = var10;
          var6 = jb.field_a[param1 - -1];
          jb.field_a[0].e(qg.field_a[param1] + vh.field_b, 73 + to.field_c[param1] + (id.field_M + param3), 96);
          if (param1 != bn.field_i) {
            if (!param0) {
              var11.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
              var6.d(qg.field_a[param1] + (vh.field_b - -2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
              break L0;
            } else {
              var11.d(qg.field_a[param1] + vh.field_b, param3 + (to.field_c[param1] + id.field_M), 100);
              break L0;
            }
          } else {
            var10.b(qg.field_a[param1] + vh.field_b, param3 + to.field_c[param1] + id.field_M, 248, 16776960);
            var6.d(2 + (vh.field_b + qg.field_a[param1]), 1 + (param3 + id.field_M + to.field_c[param1]), 256);
            cc.field_b.b(qg.field_a[param1] + (vh.field_b - 10), id.field_M + to.field_c[param1] + (-10 - -param3), wd.field_z[ti.field_b]);
            break L0;
          }
        }
        L1: {
          if (param0) {
            break L1;
          } else {
            if (aa.field_a[param1] != 0) {
              L2: {
                if (bn.field_i == param1) {
                  stackOut_10_0 = 2;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              var7 = stackIn_11_0;
              sg.field_jb.b(q.field_G[param1], 8 + vh.field_b + qg.field_a[param1], var11.field_t + (param3 + to.field_c[param1] + (id.field_M - -20)), var7, -1, aa.field_a[param1]);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            if (param1 != ((ac) this).b(true, ha.field_b, ei.field_K)) {
              break L3;
            } else {
              sg.field_jb.b(q.field_G[param1], 8 + (qg.field_a[param1] + vh.field_b), to.field_c[param1] + (id.field_M + param3) + (var11.field_t + 20), 0, -1, aa.field_a[param1]);
              break L3;
            }
          }
        }
        L4: {
          if (param1 != bn.field_i) {
            break L4;
          } else {
            if (!((ac) this).field_b.field_j) {
              L5: {
                if (-1 != hn.field_q[param1]) {
                  ah.field_tb.c(-20 + vh.field_b - -qg.field_a[param1], param3 + id.field_M + to.field_c[param1] - -17);
                  break L5;
                } else {
                  break L5;
                }
              }
              if (pd.field_a[param1] == -1) {
                break L4;
              } else {
                if (this.a(param1 + 3, -1, 117)) {
                  ah.field_tb.b(vh.field_b - (-qg.field_a[param1] - 55), id.field_M - (-to.field_c[param1] - param3 + -17));
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              break L4;
            }
          }
        }
        L6: {
          if (be.field_j <= 0) {
            L7: {
              var7 = wm.field_e;
              var8 = 12 + wm.field_e;
              if (param1 != 1) {
                break L7;
              } else {
                wd.field_y.b(vh.field_b + (qg.field_a[param1] - -2), param3 + (id.field_M + to.field_c[param1]) + -17, 50 + wd.field_z[var7] / 2);
                break L7;
              }
            }
            L8: {
              if (var8 >= 50) {
                var8 -= 50;
                break L8;
              } else {
                break L8;
              }
            }
            if (param1 != 2) {
              break L6;
            } else {
              wd.field_y.b(2 + qg.field_a[param1] + vh.field_b, -17 + (param3 + id.field_M) - -to.field_c[param1], 50 + wd.field_z[var8] / 2);
              break L6;
            }
          } else {
            break L6;
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
        jp stackIn_35_0 = null;
        jp stackIn_36_0 = null;
        jp stackIn_37_0 = null;
        jp stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        jp stackIn_54_0 = null;
        jp stackIn_55_0 = null;
        jp stackIn_56_0 = null;
        jp stackIn_57_0 = null;
        jp stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        jp stackIn_70_0 = null;
        jp stackIn_71_0 = null;
        jp stackIn_72_0 = null;
        jp stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        jp stackOut_53_0 = null;
        jp stackOut_54_0 = null;
        jp stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        jp stackOut_55_0 = null;
        jp stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        jp stackOut_69_0 = null;
        jp stackOut_70_0 = null;
        jp stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        jp stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        jp stackOut_34_0 = null;
        jp stackOut_35_0 = null;
        jp stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        jp stackOut_37_0 = null;
        int stackOut_37_1 = 0;
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
          var2 = ((ac) this).field_b.field_d;
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
            if (sh.field_a != -1) {
              L5: {
                L6: {
                  var3 = ao.field_J;
                  if (99 == kg.field_i) {
                    break L6;
                  } else {
                    if (kg.field_i == 98) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (var2 == 0) {
                    break L7;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                ao.field_J = var2;
                break L5;
              }
              L8: {
                if (kg.field_i != 98) {
                  break L8;
                } else {
                  if (var2 >= 0) {
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (((ac) this).field_b.field_d == 0) {
                            break L11;
                          } else {
                            if (((ac) this).field_b.field_d == 1) {
                              break L11;
                            } else {
                              if (((ac) this).field_b.field_d == 2) {
                                L12: {
                                  L13: {
                                    stackOut_53_0 = ((ac) this).field_b;
                                    stackIn_56_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (0 == var3) {
                                      break L13;
                                    } else {
                                      stackOut_54_0 = (jp) (Object) stackIn_54_0;
                                      stackIn_57_0 = stackOut_54_0;
                                      stackIn_55_0 = stackOut_54_0;
                                      if (var3 != 1) {
                                        stackOut_57_0 = (jp) (Object) stackIn_57_0;
                                        stackOut_57_1 = 0;
                                        stackIn_58_0 = stackOut_57_0;
                                        stackIn_58_1 = stackOut_57_1;
                                        break L12;
                                      } else {
                                        stackOut_55_0 = (jp) (Object) stackIn_55_0;
                                        stackIn_56_0 = stackOut_55_0;
                                        break L13;
                                      }
                                    }
                                  }
                                  stackOut_56_0 = (jp) (Object) stackIn_56_0;
                                  stackOut_56_1 = var3;
                                  stackIn_58_0 = stackOut_56_0;
                                  stackIn_58_1 = stackOut_56_1;
                                  break L12;
                                }
                                ((jp) (Object) stackIn_58_0).b(stackIn_58_1, 116);
                                break L10;
                              } else {
                                ((ac) this).field_b.b(((ac) this).field_b.field_d - 1, -89);
                                break L10;
                              }
                            }
                          }
                        }
                        ((ac) this).field_b.b(-1 + ((ac) this).field_b.field_h, 120);
                        break L10;
                      }
                      if (!this.a(((ac) this).field_b.field_d, sh.field_a, 108)) {
                        continue L9;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    ((ac) this).field_b.b(0, 50);
                    break L8;
                  }
                }
              }
              L14: {
                if (99 != kg.field_i) {
                  break L14;
                } else {
                  if (var2 >= 0) {
                    L15: while (true) {
                      L16: {
                        if (~((ac) this).field_b.field_d == ~(((ac) this).field_b.field_h + -1)) {
                          L17: {
                            L18: {
                              stackOut_69_0 = ((ac) this).field_b;
                              stackIn_72_0 = stackOut_69_0;
                              stackIn_70_0 = stackOut_69_0;
                              if (var3 == 0) {
                                break L18;
                              } else {
                                stackOut_70_0 = (jp) (Object) stackIn_70_0;
                                stackIn_72_0 = stackOut_70_0;
                                stackIn_71_0 = stackOut_70_0;
                                if (var3 == 1) {
                                  break L18;
                                } else {
                                  stackOut_71_0 = (jp) (Object) stackIn_71_0;
                                  stackOut_71_1 = 0;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_73_1 = stackOut_71_1;
                                  break L17;
                                }
                              }
                            }
                            stackOut_72_0 = (jp) (Object) stackIn_72_0;
                            stackOut_72_1 = var3;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            break L17;
                          }
                          ((jp) (Object) stackIn_73_0).b(stackIn_73_1, param0 + 31524);
                          break L16;
                        } else {
                          L19: {
                            if (((ac) this).field_b.field_d == 0) {
                              break L19;
                            } else {
                              if (((ac) this).field_b.field_d == 1) {
                                break L19;
                              } else {
                                ((ac) this).field_b.b(((ac) this).field_b.field_d - -1, 57);
                                break L16;
                              }
                            }
                          }
                          ((ac) this).field_b.b(2, param0 + 31538);
                          break L16;
                        }
                      }
                      if (!this.a(((ac) this).field_b.field_d, sh.field_a, -119)) {
                        continue L15;
                      } else {
                        break L14;
                      }
                    }
                  } else {
                    ((ac) this).field_b.b(0, param0 ^ 31739);
                    break L14;
                  }
                }
              }
              L20: {
                if (kg.field_i == 97) {
                  break L20;
                } else {
                  if (kg.field_i == 96) {
                    break L20;
                  } else {
                    ((ac) this).field_b.g(26);
                    break L3;
                  }
                }
              }
              if (var2 != 0) {
                L21: {
                  if (var2 == 1) {
                    break L21;
                  } else {
                    if (0 <= var2) {
                      break L4;
                    } else {
                      break L21;
                    }
                  }
                }
                ((ac) this).field_b.b(0, 101);
                break L4;
              } else {
                ((ac) this).field_b.b(1, param0 ^ 31701);
                break L4;
              }
            } else {
              L22: {
                if (kg.field_i == 96) {
                  if (var2 >= 2) {
                    if (var2 > 2) {
                      ((ac) this).field_b.b(((ac) this).field_b.field_d + -1, 60);
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    ((ac) this).field_b.b(0, -92);
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              L23: {
                if (kg.field_i != 97) {
                  break L23;
                } else {
                  if (var2 < 2) {
                    ((ac) this).field_b.b(0, -76);
                    break L23;
                  } else {
                    if (5 <= var2) {
                      break L23;
                    } else {
                      if (this.a(var2 - -1, -1, -23)) {
                        ((ac) this).field_b.b(var2 - -1, param0 + 31525);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                }
              }
              L24: {
                if (kg.field_i != 99) {
                  break L24;
                } else {
                  L25: {
                    if (var2 < 2) {
                      break L25;
                    } else {
                      ao.field_J = var2;
                      break L25;
                    }
                  }
                  ((ac) this).field_b.b(0, 86);
                  break L24;
                }
              }
              if (98 == kg.field_i) {
                if (var2 != -1) {
                  if (var2 >= 2) {
                    break L4;
                  } else {
                    L26: {
                      L27: {
                        stackOut_34_0 = ((ac) this).field_b;
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (ao.field_J <= 1) {
                          break L27;
                        } else {
                          stackOut_35_0 = (jp) (Object) stackIn_35_0;
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (ao.field_J >= 6) {
                            break L27;
                          } else {
                            stackOut_36_0 = (jp) (Object) stackIn_36_0;
                            stackOut_36_1 = ao.field_J;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            break L26;
                          }
                        }
                      }
                      stackOut_37_0 = (jp) (Object) stackIn_37_0;
                      stackOut_37_1 = 2;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L26;
                    }
                    ((jp) (Object) stackIn_38_0).b(stackIn_38_1, 46);
                    break L4;
                  }
                } else {
                  ((ac) this).field_b.b(0, 56);
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
          ((ac) this).field_b.g(26);
          break L3;
        }
    }

    final static void a(ec param0, boolean param1, java.awt.Component param2, rj param3) {
        RuntimeException var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$6 = -112;
            int discarded$7 = 1;
            int discarded$8 = 22050;
            wn.a(22050, param3, 1024, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ac.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 22050 + 44 + -97 + 41);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        super.a((byte) -65);
        this.e(-124, 80);
        if (!(qn.field_b == 0)) {
            var2 = qn.field_b << 4;
            var3 = var2 * 2;
            if (var3 > 256) {
                var3 = 256;
            }
            var4 = var2 >= 128 ? 2 * (-128 + var2) : 0;
            cc.field_k.c(0, 80, var3, var4);
        }
        hk.field_H.b(vh.field_b, 80 + id.field_M);
        if (param0 >= -35) {
            ((ac) this).field_s = null;
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 9;
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
        if (((ac) this).field_h.length > param1) {
          L0: {
            if (param2 == -8512) {
              break L0;
            } else {
              ((ac) this).a(false, -61, -49);
              break L0;
            }
          }
          L1: {
            var4 = ((ac) this).field_h[param1];
            var5 = var4;
            if (var5 != 46) {
              if (var5 == 45) {
                if (!((ac) this).field_b.d(-123)) {
                  break L1;
                } else {
                  ed.a(-11325, 0);
                  ca.a(param0, true, 9);
                  break L1;
                }
              } else {
                super.a(param0, param1, -8512);
                break L1;
              }
            } else {
              if (!((ac) this).field_b.d(-125)) {
                break L1;
              } else {
                if (be.field_j > 0) {
                  ed.a(-11325, 1);
                  ca.a(param0, true, 9);
                  break L1;
                } else {
                  return;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void c() {
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
        }
    }

    private final void b() {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        bn.field_i = -1;
        for (var3 = 0; var3 < 4; var3++) {
            aa.field_a[var3] = 128;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_r = false;
        field_q = null;
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
