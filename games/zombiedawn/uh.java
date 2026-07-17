/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_h;
    private int field_n;
    private int field_l;
    private boolean field_j;
    private boolean field_i;
    private int field_d;
    static boolean field_g;
    private int field_m;
    private boolean field_e;
    private boolean field_f;
    private boolean field_c;
    private boolean field_p;
    static rj field_o;
    private cc[] field_b;
    private int field_a;
    private int field_k;

    final void g(int param0) {
        int var2 = 0;
        wk var3 = null;
        ej var4 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = ZombieDawn.field_J;
        if (param0 == -1293) {
          L0: {
            var2 = this.c(64);
            if (var2 != -1) {
              if (!((uh) this).field_c) {
                break L0;
              } else {
                if (((uh) this).field_a == 0) {
                  break L0;
                } else {
                  var3 = dj.field_e.field_S;
                  var4 = dj.field_e.field_H;
                  if (!((uh) this).field_p) {
                    var5 = ha.field_b;
                    var6 = ei.field_K;
                    bi.d(var5, var6, ((uh) this).field_a, ((uh) this).field_l, 128);
                    break L0;
                  } else {
                    L1: {
                      var5 = var3.a(-(int)((float)(24 * ((uh) this).field_a) / 1.0f) + ha.field_b, false);
                      var6 = var3.b(ei.field_K + -(int)((float)(24 * ((uh) this).field_a) / 1.0f), true);
                      var7 = var5 / 24;
                      var8 = var6 / 24;
                      var9 = var8 + ((uh) this).field_a * 2;
                      var10 = ((uh) this).field_a * 2 + var7;
                      if (var9 <= var4.field_A.field_r) {
                        break L1;
                      } else {
                        var9 = var4.field_A.field_r;
                        break L1;
                      }
                    }
                    L2: {
                      if (var8 < 0) {
                        var8 = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var7 >= 0) {
                        break L3;
                      } else {
                        var7 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (var4.field_A.field_k >= var10) {
                        break L4;
                      } else {
                        var10 = var4.field_A.field_k;
                        break L4;
                      }
                    }
                    var11 = var3.a(24 * var7, (byte) -66);
                    var12 = var3.a(24 * var8, 0);
                    var13 = var3.a(var10 * 24, (byte) -95);
                    var14 = var3.a(var9 * 24, 0);
                    g.a(var12, (byte) 99, var13, var14, var11);
                    var15 = var8;
                    L5: while (true) {
                      if (var15 >= var9) {
                        pa.a(-21189);
                        break L0;
                      } else {
                        var16 = var7;
                        L6: while (true) {
                          if (var16 >= var10) {
                            var15++;
                            continue L5;
                          } else {
                            var17 = var3.a(24 * var16, (byte) -66);
                            var18 = var3.a(var15 * 24, 0);
                            bi.a(var17, var18, 24, 24, ((uh) this).field_l, 128);
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static java.awt.Canvas e(int param0) {
        return cn.field_b != null ? (java.awt.Canvas) (Object) cn.field_b : cj.field_d;
    }

    private final int c(int param0) {
        int var2 = 0;
        L0: {
          var2 = -40 % ((param0 - -59) / 44);
          if (((uh) this).field_k == -1) {
            break L0;
          } else {
            if (((uh) this).field_b[((uh) this).field_k] != null) {
              return ((uh) this).field_b[((uh) this).field_k].b((byte) -111);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final boolean a(byte param0) {
        if (param0 <= 39) {
            ((uh) this).field_a = 115;
        }
        return ((uh) this).field_f;
    }

    final static boolean a(byte param0, de param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.d((byte) -124);
              if (param0 == -36) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            L2: {
              if (var2_int == 1) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("uh.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawn.field_J;
          ((uh) this).field_k = -1;
          if (8 + param1 <= 16) {
            break L0;
          } else {
            param1 = 8;
            break L0;
          }
        }
        ((uh) this).field_b = new cc[8];
        ((uh) this).field_n = 0;
        var3 = -121 / ((param0 - 58) / 63);
        var4 = 0;
        L1: while (true) {
          if (8 <= var4) {
            return;
          } else {
            if (null != qp.a(param1 + var4, 95)) {
              boolean discarded$1 = ((uh) this).b(-4149, var4 + param1);
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void b(byte param0) {
        cc[] var2_ref_cc__ = null;
        int var2 = 0;
        int var3 = 0;
        cc var4 = null;
        int var5 = 0;
        Object var6 = null;
        cc[] var7 = null;
        L0: {
          var5 = ZombieDawn.field_J;
          if (param0 == -55) {
            break L0;
          } else {
            var6 = null;
            ((uh) this).a(87, (g) null);
            break L0;
          }
        }
        var7 = ((uh) this).field_b;
        var2_ref_cc__ = var7;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var7.length) {
            L2: {
              if (((uh) this).field_m != -1) {
                if (!((uh) this).field_e) {
                  var2 = nh.field_P + -27;
                  so.a(qp.field_c[((uh) this).field_m], -100 + ((uh) this).field_d, var2);
                  mk.field_a[((uh) this).field_m].b(((uh) this).field_d + -100, var2);
                  break L2;
                } else {
                  bj.field_q.a(mc.field_j, bd.field_d, -10 + nh.field_P, 15658734, 1);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!((uh) this).field_f) {
                if (!((uh) this).field_i) {
                  if (((uh) this).field_c) {
                    this.a(param0 ^ -90, md.field_tb, tb.field_G);
                    break L3;
                  } else {
                    if (((uh) this).field_j) {
                      this.a(105, eb.field_b, rc.field_v);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  this.a(param0 + 181, cn.field_i, fk.field_K);
                  break L3;
                }
              } else {
                this.a(103, hn.field_h, al.field_f);
                break L3;
              }
            }
            L4: {
              var2 = this.c(param0 + -66);
              if (-1 == var2) {
                break L4;
              } else {
                kb.field_i[var2].b(3 + ha.field_b, ei.field_K - -12);
                break L4;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.a((byte) 123);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, vn param1, vn param2) {
        try {
            if (param0 <= 82) {
                this.f(35);
            }
            param2.b(-(param2.field_w / 2) + bd.field_d, 400);
            so.a(param1, bd.field_d - param1.field_w / 2, 400);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "uh.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        hi stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        hi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        hi stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        hi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        hi stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        hi stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        hi stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        hi stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        hi stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        hi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        hi stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        hi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        var5 = ZombieDawn.field_J;
        var4 = this.c(-116);
        if (var4 != -1) {
          L0: {
            if (var4 != 9) {
              if (var4 != 10) {
                if (var4 != 13) {
                  if (var4 == 15) {
                    L1: {
                      stackOut_14_0 = dj.field_e;
                      stackOut_14_1 = param0;
                      stackOut_14_2 = param1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      if (param2) {
                        stackOut_16_0 = (hi) (Object) stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = stackIn_16_2;
                        stackOut_16_3 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        stackIn_17_3 = stackOut_16_3;
                        break L1;
                      } else {
                        stackOut_15_0 = (hi) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = stackIn_15_2;
                        stackOut_15_3 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        stackIn_17_3 = stackOut_15_3;
                        break L1;
                      }
                    }
                    ((hi) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, 120);
                    break L0;
                  } else {
                    if (var4 != 12) {
                      break L0;
                    } else {
                      dj.field_e.f((byte) 9);
                      break L0;
                    }
                  }
                } else {
                  L2: {
                    stackOut_7_0 = dj.field_e;
                    stackOut_7_1 = 1;
                    stackOut_7_2 = param0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    if (param2) {
                      stackOut_9_0 = (hi) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = stackIn_9_2;
                      stackOut_9_3 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      break L2;
                    } else {
                      stackOut_8_0 = (hi) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      break L2;
                    }
                  }
                  boolean discarded$3 = ((hi) (Object) stackIn_10_0).b(stackIn_10_1, stackIn_10_2, stackIn_10_3 != 0, param1);
                  break L0;
                }
              } else {
                dj.field_e.a(false, -6355, param1, param0);
                break L0;
              }
            } else {
              dj.field_e.a(true, -6355, param1, param0);
              break L0;
            }
          }
          L3: {
            if (!param2) {
              break L3;
            } else {
              ((uh) this).field_a = 83;
              break L3;
            }
          }
          this.b(-92);
          return;
        } else {
          return;
        }
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = ZombieDawn.field_J;
            var3 = param0;
            if (var3 != 10) {
              if (9 == var3) {
                break L1;
              } else {
                if (var3 == 15) {
                  ((uh) this).field_a = 120;
                  ((uh) this).field_l = 3158064;
                  ((uh) this).field_p = false;
                  break L0;
                } else {
                  if (var3 == 13) {
                    ((uh) this).field_p = false;
                    ((uh) this).field_l = 10522624;
                    ((uh) this).field_a = 130;
                    break L0;
                  } else {
                    ((uh) this).field_a = 0;
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((uh) this).field_p = true;
          ((uh) this).field_a = 3;
          ((uh) this).field_l = 3390259;
          break L0;
        }
        L2: {
          if (param1 == -6126) {
            break L2;
          } else {
            uh.c((byte) -49);
            break L2;
          }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        cc[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        cc[] var9 = null;
        cc[] var10 = null;
        int var11 = 0;
        cc var12 = null;
        cc var13 = null;
        var8 = ZombieDawn.field_J;
        var9 = ((uh) this).field_b;
        var4 = var9;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var9.length) {
            L1: {
              if (!((uh) this).field_e) {
                break L1;
              } else {
                param1 = param1 - vh.field_b;
                break L1;
              }
            }
            L2: {
              ((uh) this).field_m = -1;
              if (param2) {
                break L2;
              } else {
                ((uh) this).field_m = 100;
                break L2;
              }
            }
            if (param0 < nh.field_P + -80) {
              return;
            } else {
              L3: {
                if (!((uh) this).field_e) {
                  break L3;
                } else {
                  if (param0 <= nh.field_P - 25) {
                    break L3;
                  } else {
                    return;
                  }
                }
              }
              var10 = ((uh) this).field_b;
              var4 = var10;
              var11 = 0;
              var5 = var11;
              L4: while (true) {
                if (var10.length <= var11) {
                  return;
                } else {
                  var13 = var10[var11];
                  if (var13 != null) {
                    var7 = var13.a(param1, (byte) -128);
                    if (var7 != -1) {
                      ((uh) this).field_m = var7;
                      ((uh) this).field_d = 20 + var13.field_l;
                      var11++;
                      continue L4;
                    } else {
                      var11++;
                      continue L4;
                    }
                  } else {
                    var11++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var12 = var9[var5];
            var13 = var12;
            var13 = var12;
            if (var12 != null) {
              var12.a((byte) 117, param0, param1);
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, g param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        kd var6 = null;
        g stackIn_6_0 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        g stackOut_4_0 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 == 67) {
              L1: {
                if (!(param1 instanceof kd)) {
                  stackOut_5_0 = null;
                  stackIn_6_0 = (g) (Object) stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = (g) param1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var6 = (kd) (Object) stackIn_6_0;
              var4 = this.c(98);
              if (var4 == -1) {
                return;
              } else {
                L2: {
                  if (var4 != 0) {
                    if (var4 == 1) {
                      if (!var6.o(70)) {
                        return;
                      } else {
                        break L2;
                      }
                    } else {
                      if (var4 == 2) {
                        if (var6.t(100)) {
                          break L2;
                        } else {
                          return;
                        }
                      } else {
                        if (var4 != 3) {
                          if (4 != var4) {
                            if (var4 != 5) {
                              if (var4 != 6) {
                                if (var4 != 14) {
                                  if (var4 != 7) {
                                    break L2;
                                  } else {
                                    ((ah) (Object) param1).o(-6253);
                                    dj.field_e.a(0, (ah) (Object) param1, (byte) 60, true, (kk) null);
                                    break L2;
                                  }
                                } else {
                                  var6.b(true);
                                  break L2;
                                }
                              } else {
                                if (var6.m((byte) 124)) {
                                  break L2;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              if (var6.p((byte) 6)) {
                                break L2;
                              } else {
                                return;
                              }
                            }
                          } else {
                            if (!var6.p(param0 ^ 11379)) {
                              return;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          if (var6.C(-73)) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    boolean discarded$3 = var6.y(98);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (var4 == 4) {
                      break L4;
                    } else {
                      if (5 == var4) {
                        break L4;
                      } else {
                        if (var4 == 1) {
                          break L4;
                        } else {
                          if (0 != var4) {
                            fn discarded$4 = kh.a(46, false);
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  fn discarded$5 = kh.a(67, false);
                  break L3;
                }
                this.b(-58);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var3;
            stackOut_45_1 = new StringBuilder().append("uh.H(").append(param0).append(44);
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L5;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 41);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((uh) this).field_c;
    }

    public static void c(byte param0) {
        field_o = null;
        field_h = null;
        if (param0 <= 59) {
            field_h = null;
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (param0 == 118) {
          L0: {
            var4 = (-190 + param2) / 40;
            if (var4 < 0) {
              break L0;
            } else {
              if (((uh) this).field_n <= var4) {
                break L0;
              } else {
                if (null == ((uh) this).field_b[var4]) {
                  break L0;
                } else {
                  if (((uh) this).field_b[var4].a(false, param1, param2)) {
                    ((uh) this).a(3158064, var4);
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    final boolean d(int param0) {
        if (param0 < 111) {
            return false;
        }
        return ((uh) this).field_j;
    }

    private final void f(int param0) {
        ((uh) this).field_k = param0;
        ((uh) this).field_i = false;
        ((uh) this).field_j = false;
        ((uh) this).field_c = false;
        ((uh) this).field_f = false;
    }

    final boolean b(int param0, int param1) {
        if (((uh) this).field_n == 8) {
            return false;
        }
        int fieldTemp$0 = ((uh) this).field_n;
        ((uh) this).field_n = ((uh) this).field_n + 1;
        ((uh) this).field_b[fieldTemp$0] = new cc(190 - (40 + -(40 * ((uh) this).field_n)), param1, ((uh) this).field_e);
        ((uh) this).field_b[-1 + ((uh) this).field_n].c(28497);
        if (param0 != -4149) {
            this.c(-64, 61);
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        int var4_int = 0;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param3.getGraphics();
                cn.field_f.a(var4, param1, param2, (byte) 58);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            var4_int = 22 / ((-53 - param0) / 57);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref2;
            stackOut_5_1 = new StringBuilder().append("uh.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        var2 = ((uh) this).field_k;
        L0: while (true) {
          if (var2 >= -1 + ((uh) this).field_b.length) {
            L1: {
              if (param0 <= -16) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            int fieldTemp$1 = ((uh) this).field_n - 1;
            ((uh) this).field_n = ((uh) this).field_n - 1;
            ((uh) this).field_b[fieldTemp$1] = null;
            this.f(-1);
            return;
          } else {
            ((uh) this).field_b[var2] = ((uh) this).field_b[1 + var2];
            if (null != ((uh) this).field_b[var2]) {
              ((uh) this).field_b[var2].field_i = ((uh) this).field_b[var2].field_l + -40;
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 >= -77) {
            field_g = false;
        }
        return ((uh) this).field_i;
    }

    final void a(int param0, int param1) {
        cc[] var3_ref_cc__ = null;
        int var3 = 0;
        int var4 = 0;
        cc var5 = null;
        int var6 = 0;
        cc[] var7 = null;
        L0: {
          var6 = ZombieDawn.field_J;
          if (param1 < 0) {
            break L0;
          } else {
            if (~((uh) this).field_b.length > ~param1) {
              break L0;
            } else {
              if (null != ((uh) this).field_b[param1]) {
                L1: {
                  if (param0 == 3158064) {
                    break L1;
                  } else {
                    ((uh) this).field_d = -14;
                    break L1;
                  }
                }
                L2: {
                  if (((uh) this).field_b[param1].a(false)) {
                    ((uh) this).d((byte) -83);
                    break L2;
                  } else {
                    var7 = ((uh) this).field_b;
                    var3_ref_cc__ = var7;
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= var7.length) {
                        this.f(-1);
                        ((uh) this).field_k = param1;
                        ((uh) this).field_b[param1].b(false);
                        var3 = ((uh) this).field_b[param1].b((byte) -126);
                        if (7 != var3) {
                          if (9 == var3) {
                            ((uh) this).field_c = true;
                            this.c(var3, -6126);
                            break L2;
                          } else {
                            if (var3 == 10) {
                              ((uh) this).field_c = true;
                              this.c(var3, -6126);
                              break L2;
                            } else {
                              if (var3 == 13) {
                                ((uh) this).field_c = true;
                                this.c(var3, -6126);
                                break L2;
                              } else {
                                if (var3 == 15) {
                                  ((uh) this).field_c = true;
                                  this.c(var3, -6126);
                                  break L2;
                                } else {
                                  if (var3 == 12) {
                                    ((uh) this).field_j = true;
                                    break L2;
                                  } else {
                                    ((uh) this).field_f = true;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((uh) this).field_i = true;
                          break L2;
                        }
                      } else {
                        L4: {
                          var5 = var7[var4];
                          if (var5 == null) {
                            break L4;
                          } else {
                            var5.b(2);
                            break L4;
                          }
                        }
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
        }
    }

    final void d(byte param0) {
        if (!(((uh) this).field_k >= 0)) {
            return;
        }
        if (((uh) this).field_b[((uh) this).field_k] != null) {
            ((uh) this).field_b[((uh) this).field_k].b(2);
        }
        if (param0 != -83) {
            return;
        }
        this.f(param0 ^ 82);
    }

    uh() {
        ((uh) this).field_d = 0;
        ((uh) this).field_m = -1;
        ((uh) this).field_j = false;
        ((uh) this).field_i = false;
        ((uh) this).field_c = false;
        ((uh) this).field_f = false;
        ((uh) this).field_b = new cc[8];
        ((uh) this).field_n = 0;
        ((uh) this).field_k = -1;
    }

    uh(boolean param0) {
        ((uh) this).field_d = 0;
        ((uh) this).field_m = -1;
        ((uh) this).field_j = false;
        ((uh) this).field_i = false;
        ((uh) this).field_c = false;
        ((uh) this).field_f = false;
        ((uh) this).field_n = 0;
        ((uh) this).field_e = param0 ? true : false;
        ((uh) this).field_b = new cc[8];
        ((uh) this).field_k = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Username: ";
        field_g = false;
    }
}
