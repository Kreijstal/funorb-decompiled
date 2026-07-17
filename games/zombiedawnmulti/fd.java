/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends id {
    static int field_F;
    boolean field_K;
    static cj field_O;
    static ef field_G;
    boolean field_H;
    static th field_M;
    private boolean field_J;
    private int field_P;
    static java.applet.Applet field_L;
    static String field_N;
    static String field_I;

    fd(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((fd) this).field_J = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((((fd) this).field_C & 1073741824) == 0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((fd) this).field_H = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((((fd) this).field_C & 536870912) == 0) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((fd) this).field_K = stackIn_6_1 != 0;
        ((fd) this).field_P = ((fd) this).field_C;
        ((fd) this).field_P = ((fd) this).field_P & -1610612737;
        ((fd) this).field_P = ((fd) this).field_P - 1;
        var10 = rb.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        var5 = 0;
        L2: while (true) {
          if (var5 >= var10.length) {
            return;
          } else {
            var6 = var10[var5];
            if (((fd) this).field_P == var6) {
              ((fd) this).field_J = true;
              var5++;
              continue L2;
            } else {
              var5++;
              continue L2;
            }
          }
        }
    }

    public static void g() {
        field_G = null;
        field_M = null;
        field_L = null;
        field_I = null;
        field_N = null;
        field_O = null;
    }

    final void a(int param0, nm param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -10136) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            var3_int = param1.c(((fd) this).g(param0 ^ 10195), -20126);
            var4 = -24 + param1.d(((fd) this).h(param0 ^ -10230), 127);
            if (!io.a(var3_int, var4, (byte) -110, param1)) {
              return;
            } else {
              L2: {
                if (!((fd) this).field_J) {
                  break L2;
                } else {
                  if (io.a(var3_int, -24 + var4, (byte) -114, param1)) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              L3: {
                var5 = ((fd) this).g(-128) / 24;
                var6 = ((fd) this).h(-51) / 24;
                if (he.field_a) {
                  break L3;
                } else {
                  if (var5 < 0) {
                    break L3;
                  } else {
                    if (var5 >= fb.field_e.field_u.field_k[0].length) {
                      break L3;
                    } else {
                      if (var6 < 0) {
                        break L3;
                      } else {
                        if (var6 >= fb.field_e.field_u.field_k.length) {
                          break L3;
                        } else {
                          if (fb.field_e.field_u.field_k[var6][var5]) {
                            return;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (!((fd) this).field_H) {
                    break L5;
                  } else {
                    if (!((fd) this).field_K) {
                      break L5;
                    } else {
                      od.field_Ab[((fd) this).field_P].d(var3_int, var4);
                      break L4;
                    }
                  }
                }
                if (((fd) this).field_H) {
                  od.field_Ab[((fd) this).field_P].b(var3_int, var4);
                  break L4;
                } else {
                  if (!((fd) this).field_K) {
                    od.field_Ab[((fd) this).field_P].g(var3_int, var4);
                    break L4;
                  } else {
                    od.field_Ab[((fd) this).field_P].a(var3_int, var4);
                    break L4;
                  }
                }
              }
              L6: {
                if (!((fd) this).field_J) {
                  break L6;
                } else {
                  if (!((fd) this).field_H) {
                    if (!((fd) this).field_K) {
                      od.field_Ab[-8 + ((fd) this).field_P].g(var3_int, -24 + var4);
                      break L6;
                    } else {
                      od.field_Ab[-8 + ((fd) this).field_P].a(var3_int, -24 + var4);
                      break L6;
                    }
                  } else {
                    od.field_Ab[-8 + ((fd) this).field_P].b(var3_int, var4 + -24);
                    break L6;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var3;
            stackOut_32_1 = new StringBuilder().append("fd.H(").append(param0).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    final void f(byte param0) {
        if (param0 > -79) {
            ((fd) this).f((byte) 89);
        }
    }

    final static void h(byte param0) {
        oq.field_w = null;
        qp.field_t = null;
        qj.field_o = null;
        vj.field_p = null;
        k.field_i = null;
        if (param0 <= 124) {
            field_G = null;
        }
        tp.field_t = null;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            Object var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_6_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_53_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_111_0 = 0;
            int stackIn_113_0 = 0;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            String stackIn_117_2 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            RuntimeException stackIn_120_0 = null;
            StringBuilder stackIn_120_1 = null;
            String stackIn_120_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_51_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_87_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_110_0 = 0;
            int stackOut_112_0 = 0;
            RuntimeException stackOut_114_0 = null;
            StringBuilder stackOut_114_1 = null;
            RuntimeException stackOut_116_0 = null;
            StringBuilder stackOut_116_1 = null;
            String stackOut_116_2 = null;
            RuntimeException stackOut_115_0 = null;
            StringBuilder stackOut_115_1 = null;
            String stackOut_115_2 = null;
            RuntimeException stackOut_117_0 = null;
            StringBuilder stackOut_117_1 = null;
            RuntimeException stackOut_119_0 = null;
            StringBuilder stackOut_119_1 = null;
            String stackOut_119_2 = null;
            RuntimeException stackOut_118_0 = null;
            StringBuilder stackOut_118_1 = null;
            String stackOut_118_2 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ki.field_h == null) {
                    int discarded$14 = 0;
                    if (!ee.a(param1)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ud.field_cb != vo.field_l) {
                    break L2;
                  } else {
                    L3: {
                      if (!param1) {
                        int discarded$15 = 0;
                        ki.field_a = cn.a((byte) 125, param4, param3);
                        break L3;
                      } else {
                        var10 = null;
                        ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
                        break L3;
                      }
                    }
                    ma.field_a.field_j = 0;
                    ma.field_a.a(-94, 14);
                    ma.field_a.a(126, ki.field_a.b(7).field_d);
                    cb.a(-1, false);
                    vo.field_l = de.field_h;
                    break L2;
                  }
                }
                L4: {
                  if (de.field_h == vo.field_l) {
                    if (fa.b(10, 1)) {
                      var6_int = s.field_e.g(31365);
                      s.field_e.field_j = 0;
                      if (var6_int == 0) {
                        vo.field_l = ul.field_n;
                        break L4;
                      } else {
                        hd.field_q = -1;
                        vo.field_l = gn.field_K;
                        op.field_i = var6_int;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (ul.field_n != vo.field_l) {
                    break L5;
                  } else {
                    if (!fa.b(10, 8)) {
                      break L5;
                    } else {
                      nm.field_c = s.field_e.a((byte) -30);
                      s.field_e.field_j = 0;
                      pi.a((byte) -59, param2, param1, ki.field_a, param5);
                      vo.field_l = lc.field_l;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (vo.field_l == lc.field_l) {
                    if (!fa.b(10, 1)) {
                      break L6;
                    } else {
                      L7: {
                        var6_int = s.field_e.g(31365);
                        s.field_e.field_j = 0;
                        oe.field_f = null;
                        op.field_i = var6_int;
                        if (var6_int == 0) {
                          break L7;
                        } else {
                          if (var6_int == 1) {
                            break L7;
                          } else {
                            if (var6_int != 8) {
                              hd.field_q = -1;
                              vo.field_l = gn.field_K;
                              break L6;
                            } else {
                              ak.a((byte) -111);
                              sk.field_j = false;
                              stackOut_29_0 = var6_int;
                              stackIn_30_0 = stackOut_29_0;
                              return stackIn_30_0;
                            }
                          }
                        }
                      }
                      hd.field_q = -1;
                      vo.field_l = qb.field_e;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  if (vo.field_l == qb.field_e) {
                    if (!dd.a(0)) {
                      break L8;
                    } else {
                      L9: {
                        ii.field_d = s.field_e.a((byte) -30);
                        ci.field_f = param3;
                        kj.field_q = s.field_e.g(31365);
                        am.field_b = s.field_e.g(31365);
                        vl.field_h = s.field_e.d((byte) 69);
                        var11 = s.field_e.g((byte) -89);
                        var7 = s.field_e.g(31365);
                        if ((var7 & 1) != 0) {
                          int discarded$16 = 85;
                          fj.a();
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (!param1) {
                          L11: {
                            if (0 == (4 & var7)) {
                              stackOut_49_0 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              break L11;
                            } else {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L11;
                            }
                          }
                          L12: {
                            fj.field_M = stackIn_50_0 != 0;
                            if ((2 & var7) == 0) {
                              stackOut_52_0 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              break L12;
                            } else {
                              stackOut_51_0 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              break L12;
                            }
                          }
                          L13: {
                            sh.field_L = stackIn_53_0 != 0;
                            if ((var7 & 8) == 0) {
                              stackOut_55_0 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              break L13;
                            } else {
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
                              break L13;
                            }
                          }
                          L14: {
                            nh.field_m = stackIn_56_0 != 0;
                            if (!nh.field_m) {
                              break L14;
                            } else {
                              sh.field_L = true;
                              break L14;
                            }
                          }
                          L15: {
                            if ((var7 & 16) == 0) {
                              stackOut_60_0 = 0;
                              stackIn_61_0 = stackOut_60_0;
                              break L15;
                            } else {
                              stackOut_59_0 = 1;
                              stackIn_61_0 = stackOut_59_0;
                              break L15;
                            }
                          }
                          tm.field_b = stackIn_61_0 != 0;
                          if (!gj.field_e) {
                            break L10;
                          } else {
                            int discarded$17 = s.field_e.g(31365);
                            int discarded$18 = s.field_e.g(31365);
                            int discarded$19 = s.field_e.i(-1478490344);
                            vn.field_f = s.field_e.d((byte) 69);
                            kq.field_b = new byte[vn.field_f];
                            var8 = 0;
                            L16: while (true) {
                              if (var8 >= vn.field_f) {
                                break L10;
                              } else {
                                kq.field_b[var8] = s.field_e.d(vg.a(14, -249699574));
                                var8++;
                                continue L16;
                              }
                            }
                          }
                        } else {
                          L17: {
                            if ((var7 & 16) == 0) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L17;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L17;
                            }
                          }
                          tm.field_b = stackIn_43_0 != 0;
                          if (!gj.field_e) {
                            break L10;
                          } else {
                            int discarded$20 = s.field_e.g(31365);
                            int discarded$21 = s.field_e.g(31365);
                            int discarded$22 = s.field_e.i(-1478490344);
                            vn.field_f = s.field_e.d((byte) 69);
                            kq.field_b = new byte[vn.field_f];
                            var8 = 0;
                            L18: while (true) {
                              if (var8 >= vn.field_f) {
                                break L10;
                              } else {
                                kq.field_b[var8] = s.field_e.d(vg.a(14, -249699574));
                                var8++;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        ta.field_lb = s.field_e.f((byte) -48);
                        var12 = (CharSequence) (Object) ta.field_lb;
                        int discarded$23 = 0;
                        kf.field_k = tg.a(var12);
                        qq.field_a = s.field_e.g(31365);
                        vo.field_l = pi.field_a;
                        if (ki.field_a.b(7) != uq.field_b) {
                          if (ki.field_a.b(7) == pl.field_G) {
                            l.field_c.a(-100, jl.b(0));
                            break L19;
                          } else {
                            break L19;
                          }
                        } else {
                          wp.field_b.a(-108, jl.b(0));
                          break L19;
                        }
                      }
                      L20: {
                        sk.field_j = false;
                        if (var11 == null) {
                          break L20;
                        } else {
                          jh.a(jl.b(0), -1, var11);
                          break L20;
                        }
                      }
                      L21: {
                        L22: {
                          if (vl.field_h > 0) {
                            break L22;
                          } else {
                            if (fj.field_M) {
                              break L22;
                            } else {
                              try {
                                L23: {
                                  Object discarded$24 = fo.b(jl.b(0), 13093, "unzap");
                                  break L23;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L24: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L24;
                                }
                              }
                              break L21;
                            }
                          }
                        }
                        try {
                          L25: {
                            int discarded$25 = 26;
                            Object discarded$26 = fo.a(jl.b(0), "zap", (byte) 23, new Object[1]);
                            break L25;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L26: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L26;
                          }
                        }
                        break L21;
                      }
                      L27: {
                        if (vl.field_h > 0) {
                          cm.field_e = true;
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      ma.field_a.a((byte) -77, mj.field_Fb);
                      var8 = 0;
                      L28: while (true) {
                        if (4 <= var8) {
                          s.field_e.a((byte) -116, mj.field_Fb);
                          stackOut_87_0 = op.field_i;
                          stackIn_88_0 = stackOut_87_0;
                          return stackIn_88_0;
                        } else {
                          mj.field_Fb[var8] = mj.field_Fb[var8] + 50;
                          var8++;
                          continue L28;
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L29: {
                  if (vo.field_l == gn.field_K) {
                    if (dd.a(0)) {
                      L30: {
                        ak.a((byte) -124);
                        if (op.field_i != 7) {
                          break L30;
                        } else {
                          if (!sk.field_j) {
                            sk.field_j = true;
                            stackOut_101_0 = -1;
                            stackIn_102_0 = stackOut_101_0;
                            return stackIn_102_0;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        if (op.field_i == 7) {
                          op.field_i = 3;
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ol.field_q = s.field_e.f((byte) -31);
                      sk.field_j = false;
                      stackOut_99_0 = op.field_i;
                      stackIn_100_0 = stackOut_99_0;
                      return stackIn_100_0;
                    } else {
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                L32: {
                  if (ki.field_h == null) {
                    if (sk.field_j) {
                      L33: {
                        int discarded$27 = -22;
                        if (he.b() > 30000L) {
                          ol.field_q = aj.field_l;
                          break L33;
                        } else {
                          ol.field_q = ga.field_w;
                          break L33;
                        }
                      }
                      sk.field_j = false;
                      stackOut_110_0 = 3;
                      stackIn_111_0 = stackOut_110_0;
                      return stackIn_111_0;
                    } else {
                      var6_int = jo.field_b;
                      jo.field_b = ff.field_s;
                      sk.field_j = true;
                      ff.field_s = var6_int;
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                stackOut_112_0 = -1;
                stackIn_113_0 = stackOut_112_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L34: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_114_0 = (RuntimeException) var6;
                stackOut_114_1 = new StringBuilder().append("fd.I(").append(14).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_116_0 = stackOut_114_0;
                stackIn_116_1 = stackOut_114_1;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                if (param3 == null) {
                  stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
                  stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                  stackOut_116_2 = "null";
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  break L34;
                } else {
                  stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
                  stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                  stackOut_115_2 = "{...}";
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  break L34;
                }
              }
              L35: {
                stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
                stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(44);
                stackIn_119_0 = stackOut_117_0;
                stackIn_119_1 = stackOut_117_1;
                stackIn_118_0 = stackOut_117_0;
                stackIn_118_1 = stackOut_117_1;
                if (param4 == null) {
                  stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
                  stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
                  stackOut_119_2 = "null";
                  stackIn_120_0 = stackOut_119_0;
                  stackIn_120_1 = stackOut_119_1;
                  stackIn_120_2 = stackOut_119_2;
                  break L35;
                } else {
                  stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
                  stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
                  stackOut_118_2 = "{...}";
                  stackIn_120_0 = stackOut_118_0;
                  stackIn_120_1 = stackOut_118_1;
                  stackIn_120_2 = stackOut_118_2;
                  break L35;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 44 + param5 + 41);
            }
            return stackIn_113_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = -1;
        field_M = new th();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
