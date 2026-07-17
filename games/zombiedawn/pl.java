/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        pk.field_N = param0;
        b.field_l = param1;
        if (e.field_S != null) {
            e.field_S.b(param1, false, param0);
        }
    }

    final int b(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ZombieDawn.field_J;
          if (param0) {
            break L0;
          } else {
            field_r = 67;
            break L0;
          }
        }
        param1 = param1 - vh.field_b;
        param2 = param2 - id.field_M;
        if (ce.field_p != 0) {
          return -1;
        } else {
          L1: {
            if (rg.field_F != -1) {
              L2: {
                L3: {
                  var4 = 178;
                  var5 = (-var4 + param2) / 29;
                  if (~param2 > ~var4) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var5 > 6) {
                        break L3;
                      } else {
                        if (param1 < 200) {
                          break L3;
                        } else {
                          if (param1 <= 440) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var5 = -1;
                break L2;
              }
              L4: {
                if (-1 == var5) {
                  break L4;
                } else {
                  if (!this.b(var5 - -3, rg.field_F, 16777215)) {
                    break L4;
                  } else {
                    return 3 + var5;
                  }
                }
              }
              if (wl.field_b - 11 >= param1) {
                break L1;
              } else {
                if (29 + wl.field_b <= param1) {
                  break L1;
                } else {
                  if (param2 <= 120) {
                    break L1;
                  } else {
                    if (param2 >= 160) {
                      break L1;
                    } else {
                      return 2;
                    }
                  }
                }
              }
            } else {
              param2 -= 80;
              var4 = -1;
              var5 = 0;
              L5: while (true) {
                if (var5 >= 4) {
                  if (var4 >= 0) {
                    return 2 + var4;
                  } else {
                    param2 += 80;
                    break L1;
                  }
                } else {
                  L6: {
                    if (!this.b(2 + var5, -1, 16777215)) {
                      break L6;
                    } else {
                      if (param1 <= sf.field_d[var5]) {
                        break L6;
                      } else {
                        if (fl.field_c[var5] + sf.field_d[var5] <= param1) {
                          break L6;
                        } else {
                          if (param2 <= gj.field_n[var5]) {
                            break L6;
                          } else {
                            if (~param2 <= ~(gj.field_n[var5] + pj.field_u[var5])) {
                              break L6;
                            } else {
                              var4 = var5;
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                  var5++;
                  continue L5;
                }
              }
            }
          }
          L7: {
            if (param2 <= ((pl) this).field_k) {
              break L7;
            } else {
              if (param2 >= ((pl) this).field_k + 34) {
                break L7;
              } else {
                if (param1 <= ((pl) this).field_g) {
                  break L7;
                } else {
                  if (~param1 <= ~(((pl) this).field_g - -((pl) this).field_i)) {
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

    private final void f(int param0, int param1) {
        i.field_T = new vn(640, 341);
        i.field_T.a();
        if (param1 != -257) {
            return;
        }
        bi.d();
        this.a(0, 0, param1 ^ 260);
        if (param0 >= 0) {
            bi.h(3, 3, 0, 0, 640, 341);
            this.a(0, 0, 0, param0);
        }
        cn.field_f.b(125);
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          if (b.field_q == param2) {
            bd.field_i[qd.field_e][param2].b(param3 - -sf.field_d[param2], param1 + gj.field_n[param2], 248, 16776960);
            qn.field_g.b(-10 + (sf.field_d[param2] + param3), param1 + (-10 + gj.field_n[param2]), sn.field_f[rk.field_a]);
            break L0;
          } else {
            if (param4) {
              jo.field_Tb[qd.field_e][param2].e(param3 - -sf.field_d[param2], gj.field_n[param2] + param1, 100);
              break L0;
            } else {
              bd.field_i[qd.field_e][param2].b(sf.field_d[param2] + param3, gj.field_n[param2] - -param1);
              break L0;
            }
          }
        }
        L1: {
          if (param4) {
            break L1;
          } else {
            if (n.field_k[param2] == 0) {
              break L1;
            } else {
              L2: {
                if (b.field_q == param2) {
                  stackOut_9_0 = 2;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var6 = stackIn_10_0;
              sg.field_jb.b(cj.field_a[qd.field_e][param2], te.field_T[param2] + param3, ag.field_b[param2] + param1, var6, -1, n.field_k[param2]);
              break L1;
            }
          }
        }
        L3: {
          if (b.field_q != param2) {
            break L3;
          } else {
            if (((pl) this).field_b.field_j) {
              break L3;
            } else {
              L4: {
                if (ki.field_X[param2] != -1) {
                  af.field_d.c(ki.field_X[param2], no.field_G[param2] + param1);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (cj.field_c[param2] == -1) {
                break L3;
              } else {
                if (this.b(param2 - -3, -1, 16777215)) {
                  af.field_d.b(cj.field_c[param2], param1 + no.field_G[param2]);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
        }
        L5: {
          if (param0 > 68) {
            break L5;
          } else {
            ((pl) this).a((byte) -30, 7, 28);
            break L5;
          }
        }
    }

    pl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
            ((pl) this).field_q = ((pl) this).field_b;
            ((pl) this).field_n = ((pl) this).field_h;
            ((pl) this).field_o = param7;
            ((pl) this).field_s = new jp(param7.length);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "pl.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + (param7 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jp stackIn_31_0 = null;
        jp stackIn_32_0 = null;
        jp stackIn_33_0 = null;
        jp stackIn_34_0 = null;
        jp stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        jp stackIn_53_0 = null;
        jp stackIn_54_0 = null;
        jp stackIn_55_0 = null;
        jp stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        jp stackIn_63_0 = null;
        jp stackIn_64_0 = null;
        jp stackIn_65_0 = null;
        jp stackIn_66_0 = null;
        jp stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        jp stackOut_52_0 = null;
        jp stackOut_53_0 = null;
        jp stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        jp stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        jp stackOut_62_0 = null;
        jp stackOut_63_0 = null;
        jp stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        jp stackOut_64_0 = null;
        jp stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        jp stackOut_30_0 = null;
        jp stackOut_31_0 = null;
        jp stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        jp stackOut_32_0 = null;
        jp stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          var2 = ((pl) this).field_b.field_d;
          if (param0 == -31645) {
            break L0;
          } else {
            field_m = -125;
            break L0;
          }
        }
        L1: {
          if (48 != kg.field_i) {
            break L1;
          } else {
            if (!bo.field_p[82]) {
              break L1;
            } else {
              if (2 > lo.field_j) {
                break L1;
              } else {
                to.field_b[qd.field_e] = 27;
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            if (-1 != rg.field_F) {
              L4: {
                L5: {
                  var3 = id.field_N;
                  if (kg.field_i == 99) {
                    break L5;
                  } else {
                    if (kg.field_i != 98) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (var2 == 1) {
                      break L6;
                    } else {
                      break L4;
                    }
                  }
                }
                id.field_N = var2;
                break L4;
              }
              L7: {
                if (kg.field_i != 98) {
                  break L7;
                } else {
                  if (0 <= var2) {
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (0 == ((pl) this).field_b.field_d) {
                            break L10;
                          } else {
                            if (((pl) this).field_b.field_d != 1) {
                              if (((pl) this).field_b.field_d == 2) {
                                L11: {
                                  L12: {
                                    stackOut_52_0 = ((pl) this).field_b;
                                    stackIn_55_0 = stackOut_52_0;
                                    stackIn_53_0 = stackOut_52_0;
                                    if (var3 == 0) {
                                      break L12;
                                    } else {
                                      stackOut_53_0 = (jp) (Object) stackIn_53_0;
                                      stackIn_55_0 = stackOut_53_0;
                                      stackIn_54_0 = stackOut_53_0;
                                      if (var3 == 1) {
                                        break L12;
                                      } else {
                                        stackOut_54_0 = (jp) (Object) stackIn_54_0;
                                        stackOut_54_1 = 0;
                                        stackIn_56_0 = stackOut_54_0;
                                        stackIn_56_1 = stackOut_54_1;
                                        break L11;
                                      }
                                    }
                                  }
                                  stackOut_55_0 = (jp) (Object) stackIn_55_0;
                                  stackOut_55_1 = var3;
                                  stackIn_56_0 = stackOut_55_0;
                                  stackIn_56_1 = stackOut_55_1;
                                  break L11;
                                }
                                ((jp) (Object) stackIn_56_0).b(stackIn_56_1, -111);
                                break L9;
                              } else {
                                ((pl) this).field_b.b(-1 + ((pl) this).field_b.field_d, 69);
                                break L9;
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((pl) this).field_b.b(-1 + ((pl) this).field_b.field_h, -102);
                        break L9;
                      }
                      if (!this.b(((pl) this).field_b.field_d, rg.field_F, 16777215)) {
                        continue L8;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    ((pl) this).field_b.b(0, 63);
                    break L7;
                  }
                }
              }
              L13: {
                if (kg.field_i == 99) {
                  if (var2 < 0) {
                    ((pl) this).field_b.b(0, -75);
                    break L13;
                  } else {
                    L14: while (true) {
                      L15: {
                        if (-1 + ((pl) this).field_b.field_h != ((pl) this).field_b.field_d) {
                          L16: {
                            if (((pl) this).field_b.field_d == 0) {
                              break L16;
                            } else {
                              if (((pl) this).field_b.field_d != 1) {
                                ((pl) this).field_b.b(((pl) this).field_b.field_d - -1, -76);
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          ((pl) this).field_b.b(2, param0 + 31557);
                          break L15;
                        } else {
                          L17: {
                            L18: {
                              stackOut_62_0 = ((pl) this).field_b;
                              stackIn_65_0 = stackOut_62_0;
                              stackIn_63_0 = stackOut_62_0;
                              if (var3 == 0) {
                                break L18;
                              } else {
                                stackOut_63_0 = (jp) (Object) stackIn_63_0;
                                stackIn_66_0 = stackOut_63_0;
                                stackIn_64_0 = stackOut_63_0;
                                if (var3 != 1) {
                                  stackOut_66_0 = (jp) (Object) stackIn_66_0;
                                  stackOut_66_1 = 0;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  break L17;
                                } else {
                                  stackOut_64_0 = (jp) (Object) stackIn_64_0;
                                  stackIn_65_0 = stackOut_64_0;
                                  break L18;
                                }
                              }
                            }
                            stackOut_65_0 = (jp) (Object) stackIn_65_0;
                            stackOut_65_1 = var3;
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_67_1 = stackOut_65_1;
                            break L17;
                          }
                          ((jp) (Object) stackIn_67_0).b(stackIn_67_1, param0 ^ 31699);
                          break L15;
                        }
                      }
                      if (!this.b(((pl) this).field_b.field_d, rg.field_F, 16777215)) {
                        continue L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              L19: {
                if (kg.field_i == 97) {
                  break L19;
                } else {
                  if (96 == kg.field_i) {
                    break L19;
                  } else {
                    break L3;
                  }
                }
              }
              if (var2 == 0) {
                ((pl) this).field_b.b(1, 126);
                break L3;
              } else {
                L20: {
                  if (var2 == 1) {
                    break L20;
                  } else {
                    if (var2 < 0) {
                      break L20;
                    } else {
                      ((pl) this).field_b.g(102);
                      break L2;
                    }
                  }
                }
                ((pl) this).field_b.b(0, 97);
                break L3;
              }
            } else {
              L21: {
                if (kg.field_i != 96) {
                  break L21;
                } else {
                  if (var2 < 2) {
                    ((pl) this).field_b.b(0, -125);
                    break L21;
                  } else {
                    if (2 < var2) {
                      ((pl) this).field_b.b(((pl) this).field_b.field_d - 1, 107);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L22: {
                if (kg.field_i == 97) {
                  if (var2 >= 2) {
                    if (var2 >= 5) {
                      break L22;
                    } else {
                      if (!this.b(var2 - -1, -1, 16777215)) {
                        break L22;
                      } else {
                        ((pl) this).field_b.b(1 + var2, -81);
                        break L22;
                      }
                    }
                  } else {
                    ((pl) this).field_b.b(0, -99);
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              L23: {
                if (kg.field_i == 99) {
                  L24: {
                    if (var2 >= 2) {
                      id.field_N = var2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ((pl) this).field_b.b(0, param0 ^ -31697);
                  break L23;
                } else {
                  break L23;
                }
              }
              if (kg.field_i != 98) {
                break L3;
              } else {
                if (-1 != var2) {
                  if (var2 >= 2) {
                    break L3;
                  } else {
                    L25: {
                      L26: {
                        stackOut_30_0 = ((pl) this).field_b;
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (id.field_N <= 1) {
                          break L26;
                        } else {
                          stackOut_31_0 = (jp) (Object) stackIn_31_0;
                          stackIn_34_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (6 > id.field_N) {
                            stackOut_34_0 = (jp) (Object) stackIn_34_0;
                            stackOut_34_1 = id.field_N;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            break L25;
                          } else {
                            stackOut_32_0 = (jp) (Object) stackIn_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            break L26;
                          }
                        }
                      }
                      stackOut_33_0 = (jp) (Object) stackIn_33_0;
                      stackOut_33_1 = 2;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L25;
                    }
                    ((jp) (Object) stackIn_35_0).b(stackIn_35_1, 120);
                    break L3;
                  }
                } else {
                  ((pl) this).field_b.b(0, param0 + 31733);
                  break L3;
                }
              }
            }
          }
          ((pl) this).field_b.g(102);
          break L2;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hi stackIn_30_0 = null;
        hi stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        hi stackIn_31_0 = null;
        hi stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        hi stackIn_32_0 = null;
        hi stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        hi stackOut_29_0 = null;
        hi stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        hi stackOut_31_0 = null;
        hi stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        hi stackOut_30_0 = null;
        hi stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        var7 = ZombieDawn.field_J;
        if (((pl) this).field_h.length > param1) {
          L0: {
            var4 = ((pl) this).field_h[param1];
            var5 = var4;
            if (var5 == 26) {
              if (!((pl) this).field_b.d(-120)) {
                break L0;
              } else {
                this.e(50, -1);
                break L0;
              }
            } else {
              L1: {
                if (var5 != 22) {
                  if (var5 != 23) {
                    if (var5 != 24) {
                      if (25 != var5) {
                        L2: {
                          if (27 != var5) {
                            if (28 != var5) {
                              if (var5 != 29) {
                                if (30 == var5) {
                                  break L2;
                                } else {
                                  if (var5 != 31) {
                                    if (var5 == 32) {
                                      break L2;
                                    } else {
                                      if (33 == var5) {
                                        break L2;
                                      } else {
                                        super.a(param0, param1, -8512);
                                        break L0;
                                      }
                                    }
                                  } else {
                                    break L2;
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
                        if (!((pl) this).field_b.d(-121)) {
                          break L0;
                        } else {
                          L3: {
                            var5 = rg.field_F - -(4 * qd.field_e);
                            var6 = var4 - 27;
                            stackOut_29_0 = null;
                            stackOut_29_1 = null;
                            stackOut_29_2 = var5;
                            stackIn_31_0 = stackOut_29_0;
                            stackIn_31_1 = stackOut_29_1;
                            stackIn_31_2 = stackOut_29_2;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            stackIn_30_2 = stackOut_29_2;
                            if (var6 != 6) {
                              stackOut_31_0 = null;
                              stackOut_31_1 = null;
                              stackOut_31_2 = stackIn_31_2;
                              stackOut_31_3 = var6;
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              stackIn_32_2 = stackOut_31_2;
                              stackIn_32_3 = stackOut_31_3;
                              break L3;
                            } else {
                              stackOut_30_0 = null;
                              stackOut_30_1 = null;
                              stackOut_30_2 = stackIn_30_2;
                              stackOut_30_3 = -1;
                              stackIn_32_0 = stackOut_30_0;
                              stackIn_32_1 = stackOut_30_1;
                              stackIn_32_2 = stackOut_30_2;
                              stackIn_32_3 = stackOut_30_3;
                              break L3;
                            }
                          }
                          L4: {
                            vl.field_b = new hi(stackIn_32_2, stackIn_32_3);
                            if (var6 != 0) {
                              break L4;
                            } else {
                              if (var5 != 0) {
                                break L4;
                              } else {
                                ((kl) (Object) jj.c(12, 81)).e(-124);
                                ca.a(true, true, 12);
                                break L0;
                              }
                            }
                          }
                          ca.a(true, true, 0);
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (((pl) this).field_b.d(-122)) {
                this.e(param2 + 8562, var4 - 22);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L5: {
            if (param2 == -8512) {
              break L5;
            } else {
              field_t = null;
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        hm.field_J = -1;
        b.field_q = -1;
        if (param0 < 83) {
            this.a(114, -11, -24, -34);
        }
        if (!(!param1)) {
            rg.field_F = -1;
            ((pl) this).field_b = ((pl) this).field_q;
            ((pl) this).field_h = ((pl) this).field_n;
        }
        for (var3 = 0; 4 > var3; var3++) {
            n.field_k[var3] = 128;
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
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
                    if (param0.length() == 0) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    qe.a("document.cookie=\"" + var5 + "\"", param2, (byte) 116);
                } catch (Throwable throwable) {
                }
                int var3_int = 60 % ((6 - param1) / 62);
                int discarded$0 = 1;
                hl.a(param2);
            } catch (RuntimeException runtimeException) {
                throw sh.a((Throwable) (Object) runtimeException, "pl.J(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        super.a((byte) -68);
        if (rg.field_F == -1) {
            this.a(80 + id.field_M, vh.field_b, -5);
        } else {
            this.a(0, vh.field_b, 80 + id.field_M, rg.field_F);
        }
        if (param0 > -35) {
            field_r = 53;
        }
        if (0 != ce.field_p) {
            var2 = ce.field_p << 4;
            var3 = var2 * 2;
            if (!(var3 <= 256)) {
                var3 = 256;
            }
            var4 = var2 < 128 ? 0 : var2 * 2 - 256;
            i.field_T.c(vh.field_b, id.field_M + 80, var3, var4);
        }
        hk.field_H.b(vh.field_b, 80 + id.field_M);
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = -99 % ((-61 - param0) / 34);
    }

    private final void a(int param0, int param1, int param2) {
        dc.field_a[qd.field_e].b(param1 - param2, 5 + param0);
        this.a(70, param0, 0, param1, !this.b(2, -1, param2 + 16777220) ? true : false);
        this.a(82, param0, 1, param1, !this.b(3, -1, 16777215) ? true : false);
        this.a(69, param0, 3, param1, !this.b(5, -1, 16777215) ? true : false);
        this.a(115, param0, 2, param1, !this.b(4, -1, 16777215) ? true : false);
    }

    final void c(int param0) {
        if (param0 != -26931) {
            ((pl) this).b((byte) -31, true);
        }
        if (!(ce.field_p == 0)) {
            return;
        }
        if (rg.field_F != -1) {
            this.e(50, -1);
        } else {
            ca.a(false, true, be.field_j > 0 ? 13 : 1);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        tj stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        tj stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        tj stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        tj stackIn_18_0 = null;
        String stackIn_18_1 = null;
        tj stackIn_19_0 = null;
        String stackIn_19_1 = null;
        tj stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        tj stackOut_17_0 = null;
        String stackOut_17_1 = null;
        tj stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        tj stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        tj stackOut_13_0 = null;
        String stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        tj stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        tj stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        L0: {
          var17 = ZombieDawn.field_J;
          if (hm.field_J != -2) {
            stackOut_2_0 = 8912896;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16711680;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (hm.field_J != -2) {
            stackOut_5_0 = 15658734;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 16777215;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          var7 = 13421721;
          var8 = 10079351;
          var9 = 16777215;
          i.field_T.e(param1, param2);
          var10 = 1;
          bi.a(param1 + qo.field_s, 35 + param2, bm.field_c, 280, 0, 128);
          if (nc.field_k.field_r >= bm.field_c) {
            nc.field_k.b(param1 - -195, 30 + param2);
            break L2;
          } else {
            bi.f(0, 0, 320 + param1, nh.field_P);
            nc.field_k.b(qo.field_s + param1, 30 + param2);
            bi.f(320 + param1, 0, bd.field_e, nh.field_P);
            nc.field_k.b(param1 - (-j.field_d + nc.field_k.field_r), 30 + param2);
            bi.c();
            break L2;
          }
        }
        L3: {
          bi.g(param1 - -wl.field_b, param2 + 47, 23, 23, 3, var5);
          if (hm.field_J == -2) {
            bi.e(wl.field_b + param1, 47 + param2, 23, 23, 3, 16764108);
            break L3;
          } else {
            break L3;
          }
        }
        bj.field_q.a("X", 11 + (param1 + wl.field_b), param2 + 64, var6, 65793);
        if (9 != param3) {
          L4: {
            stackOut_17_0 = sg.field_jb;
            stackOut_17_1 = gn.field_c[qd.field_e][param3];
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 != 3) {
              stackOut_19_0 = (tj) (Object) stackIn_19_0;
              stackOut_19_1 = (String) (Object) stackIn_19_1;
              stackOut_19_2 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (tj) (Object) stackIn_18_0;
              stackOut_18_1 = (String) (Object) stackIn_18_1;
              stackOut_18_2 = 5;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          ((tj) (Object) stackIn_20_0).a(stackIn_20_1, -stackIn_20_2 + (310 + param1), param2 - -85, 2, 65793);
          var11 = param3 - -(qd.field_e * 4);
          var12 = param0;
          L5: while (true) {
            if (var12 >= 7) {
              return;
            } else {
              L6: {
                if (hm.field_J != var12) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L6;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L6;
                }
              }
              L7: {
                var13 = stackIn_25_0;
                if (this.b(3 + var12, param3, 16777215)) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                } else {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L7;
                }
              }
              L8: {
                var14 = stackIn_28_0;
                var15 = null;
                if (var14 != 0) {
                  var15 = (Object) (Object) o.field_n;
                  break L8;
                } else {
                  if (var12 != 6) {
                    if (var12 >= 6) {
                      break L8;
                    } else {
                      var15 = (Object) (Object) gj.field_w[var11][var12];
                      break L8;
                    }
                  } else {
                    L9: {
                      if (param3 != 3) {
                        stackOut_32_0 = te.field_S;
                        stackIn_33_0 = stackOut_32_0;
                        break L9;
                      } else {
                        stackOut_31_0 = hm.field_M;
                        stackIn_33_0 = stackOut_31_0;
                        break L9;
                      }
                    }
                    var15 = (Object) (Object) stackIn_33_0;
                    break L8;
                  }
                }
              }
              L10: {
                var15 = (Object) (Object) s.a(param0 + 1938762664, dk.field_Zb, new String[2]);
                var16 = 0;
                if (var13 == 0) {
                  if (var14 == 0) {
                    L11: {
                      if (var10 == 0) {
                        stackOut_43_0 = var8;
                        stackIn_44_0 = stackOut_43_0;
                        break L11;
                      } else {
                        stackOut_42_0 = var7;
                        stackIn_44_0 = stackOut_42_0;
                        break L11;
                      }
                    }
                    var16 = stackIn_44_0;
                    break L10;
                  } else {
                    var16 = 7829367;
                    break L10;
                  }
                } else {
                  var16 = var9;
                  break L10;
                }
              }
              L12: {
                if (var13 != 0) {
                  bi.c(5 + qo.field_s + param1, param2 + 93 + var12 * 29, bm.field_c - 10, 20, 0, 26112);
                  bi.c(5 + qo.field_s + param1, 29 * var12 + (param2 + 113), -10 + bm.field_c, 20, 26112, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var10 != 0) {
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  break L13;
                } else {
                  stackOut_49_0 = 1;
                  stackIn_51_0 = stackOut_49_0;
                  break L13;
                }
              }
              var10 = stackIn_51_0;
              bj.field_q.c((String) var15, 220 + param1, param2 + (118 + var12 * 29), var16, 65793);
              var12++;
              continue L5;
            }
          }
        } else {
          L14: {
            stackOut_13_0 = sg.field_jb;
            stackOut_13_1 = kf.field_Y;
            stackOut_13_2 = param1 - -310;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            if (3 == param3) {
              stackOut_15_0 = (tj) (Object) stackIn_15_0;
              stackOut_15_1 = (String) (Object) stackIn_15_1;
              stackOut_15_2 = stackIn_15_2;
              stackOut_15_3 = 5;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              break L14;
            } else {
              stackOut_14_0 = (tj) (Object) stackIn_14_0;
              stackOut_14_1 = (String) (Object) stackIn_14_1;
              stackOut_14_2 = stackIn_14_2;
              stackOut_14_3 = 0;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_16_3 = stackOut_14_3;
              break L14;
            }
          }
          ((tj) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2 - stackIn_16_3, 85 + param2, 2, 65793);
          int discarded$1 = bj.field_q.a(jk.field_h, param1 + 210, 118 + param2, -30 + nc.field_k.field_r, 120, 16777215, 65793, 1, 1, 20);
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          super.a((byte) -113, param1);
          if (ce.field_p == 0) {
            break L0;
          } else {
            if (!fm.field_F) {
              ce.field_p = ce.field_p - 1;
              return;
            } else {
              ce.field_p = ce.field_p + 1;
              if (ce.field_p == 16) {
                rg.field_F = wm.field_b;
                this.f(-1, -257);
                i.field_T.a();
                bi.h(3, 3, 0, 0, 640, 341);
                cn.field_f.b(-128);
                ce.field_p = 0;
                break L0;
              } else {
                return;
              }
            }
          }
        }
        if (rg.field_F != -1) {
          var3 = ((pl) this).field_b.field_d;
          hm.field_J = -1;
          if (var3 != 2) {
            L1: {
              if (var3 > 2) {
                hm.field_J = var3 - 3;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            hm.field_J = -2;
            return;
          }
        } else {
          L2: {
            if (be.field_j > 0) {
              break L2;
            } else {
              int fieldTemp$2 = te.field_db + 1;
              te.field_db = te.field_db + 1;
              if (50 == fieldTemp$2) {
                te.field_db = 0;
                break L2;
              } else {
                break L2;
              }
            }
          }
          var3 = 0;
          L3: while (true) {
            if (var3 >= 4) {
              L4: {
                var4 = 87 % ((param0 - -39) / 61);
                int fieldTemp$3 = rk.field_a + 1;
                rk.field_a = rk.field_a + 1;
                if (fieldTemp$3 >= 50) {
                  rk.field_a = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var3 = ((pl) this).field_b.field_d;
                if (var3 < 2) {
                  b.field_q = -1;
                  break L5;
                } else {
                  if (var3 - 2 == b.field_q) {
                    break L5;
                  } else {
                    ub.a(-2 + var3, (byte) -31);
                    break L5;
                  }
                }
              }
              return;
            } else {
              L6: {
                if (var3 != b.field_q) {
                  n.field_k[var3] = n.field_k[var3] - 30;
                  break L6;
                } else {
                  n.field_k[var3] = n.field_k[var3] + 30;
                  break L6;
                }
              }
              L7: {
                if (n.field_k[var3] >= 128) {
                  break L7;
                } else {
                  n.field_k[var3] = 128;
                  break L7;
                }
              }
              L8: {
                if (n.field_k[var3] <= 256) {
                  break L8;
                } else {
                  n.field_k[var3] = 256;
                  break L8;
                }
              }
              var3++;
              continue L3;
            }
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          ((pl) this).b((byte) 107, false);
          if (param0 == 50) {
            break L0;
          } else {
            ((pl) this).field_o = null;
            break L0;
          }
        }
        L1: {
          if (param1 == -1) {
            var3 = rg.field_F + 2;
            this.f(rg.field_F, -257);
            ((pl) this).field_h = ((pl) this).field_n;
            ((pl) this).field_b = ((pl) this).field_q;
            fm.field_F = false;
            ce.field_p = 15;
            ((pl) this).field_b.a(((pl) this).field_s.field_j, (byte) -125, ((pl) this).b(true, ha.field_b, ei.field_K), var3);
            rg.field_F = -1;
            break L1;
          } else {
            L2: {
              wm.field_b = param1;
              fm.field_F = true;
              ((pl) this).field_h = ((pl) this).field_o;
              ((pl) this).field_b = ((pl) this).field_s;
              ce.field_p = 1;
              ((pl) this).field_b.a(((pl) this).field_q.field_j, (byte) -114, ((pl) this).b(true, ha.field_b, ei.field_K), 3);
              if (param1 != 9) {
                stackOut_5_0 = sg.field_jb.b(gn.field_c[qd.field_e][param1]) + 80;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              bm.field_c = stackIn_6_0;
              if (nc.field_k.field_r > bm.field_c) {
                bm.field_c = nc.field_k.field_r;
                break L3;
              } else {
                break L3;
              }
            }
            j.field_d = 320 - -(bm.field_c >> 1);
            qo.field_s = 320 - (bm.field_c >> 1);
            wl.field_b = j.field_d + -34;
            this.f(param1, param0 ^ -307);
            break L1;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          if (param2 == 16777215) {
            break L0;
          } else {
            ((pl) this).field_o = null;
            break L0;
          }
        }
        var4 = to.field_b[qd.field_e];
        if (param1 != -1) {
          if (param0 > 3) {
            L1: {
              param0 -= 3;
              var5 = param0 - -(7 * param1);
              if (~var5 < ~var4) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L1;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L1;
              }
            }
            return stackIn_23_0 != 0;
          } else {
            return true;
          }
        } else {
          L2: {
            if (param0 == 0) {
              break L2;
            } else {
              if (param0 == 1) {
                break L2;
              } else {
                if (param0 == 2) {
                  break L2;
                } else {
                  L3: {
                    param0 = -2 + param0;
                    var5 = var4 / 7;
                    if (var5 >= 8) {
                      var5 = 7;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (be.field_j > 0) {
                      break L4;
                    } else {
                      if (param0 <= 3) {
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  L5: {
                    if (~var5 > ~param0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  return stackIn_17_0 != 0;
                }
              }
            }
          }
          return true;
        }
    }

    public static void d() {
        field_t = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 6080;
        field_m = 0;
    }
}
