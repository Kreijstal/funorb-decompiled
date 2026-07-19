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
        int var7 = 0;
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
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_J = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (-1 == (this.field_C & 1073741824 ^ -1)) {
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
          ((fd) (this)).field_H = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((this.field_C & 536870912) == 0) {
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
        ((fd) (this)).field_K = stackIn_6_1 != 0;
        this.field_P = this.field_C;
        this.field_P = this.field_P & -1610612737;
        this.field_P = this.field_P - 1;
        var10 = rb.field_c;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        var5 = 0;
        L2: while (true) {
          L3: {
            if (var5 >= var10.length) {
              break L3;
            } else {
              var6 = var10[var5];
              if (var7 != 0) {
                break L3;
              } else {
                L4: {
                  if (this.field_P != var6) {
                    break L4;
                  } else {
                    this.field_J = true;
                    break L4;
                  }
                }
                var5++;
                if (var7 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          return;
        }
    }

    public static void g(byte param0) {
        field_G = null;
        field_M = null;
        field_L = null;
        if (param0 != 97) {
            return;
        }
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
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -10136) {
                break L1;
              } else {
                field_M = (th) null;
                break L1;
              }
            }
            var3_int = param1.c(this.g(param0 ^ 10195), -20126);
            var4 = -24 + param1.d(this.h(param0 ^ -10230), 127);
            if (!io.a(var3_int, var4, (byte) -110, param1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!this.field_J) {
                  break L2;
                } else {
                  if (io.a(var3_int, -24 + var4, (byte) -114, param1)) {
                    break L2;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                var5 = this.g(-128) / 24;
                var6 = this.h(-51) / 24;
                if (he.field_a) {
                  break L3;
                } else {
                  if ((var5 ^ -1) > -1) {
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
                            decompiledRegionSelector0 = 2;
                            break L0;
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
                  if (!this.field_H) {
                    break L5;
                  } else {
                    if (!this.field_K) {
                      break L5;
                    } else {
                      od.field_Ab[this.field_P].d(var3_int, var4);
                      if (var7 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (this.field_H) {
                    break L6;
                  } else {
                    L7: {
                      if (!this.field_K) {
                        break L7;
                      } else {
                        od.field_Ab[this.field_P].a(var3_int, var4);
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    od.field_Ab[this.field_P].g(var3_int, var4);
                    if (var7 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                od.field_Ab[this.field_P].b(var3_int, var4);
                break L4;
              }
              L8: {
                if (!this.field_J) {
                  break L8;
                } else {
                  L9: {
                    if (!this.field_H) {
                      break L9;
                    } else {
                      od.field_Ab[-8 + this.field_P].b(var3_int, var4 + -24);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (!this.field_K) {
                      break L10;
                    } else {
                      od.field_Ab[-8 + this.field_P].a(var3_int, -24 + var4);
                      if (var7 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  od.field_Ab[-8 + this.field_P].g(var3_int, -24 + var4);
                  break L8;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var3);
            stackOut_37_1 = new StringBuilder().append("fd.H(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
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

    final void f(byte param0) {
        if (param0 > -79) {
            this.f((byte) 89);
        }
    }

    final static void h(byte param0) {
        oq.field_w = null;
        qp.field_t = (byte[][]) null;
        qj.field_o = null;
        vj.field_p = null;
        k.field_i = null;
        if (param0 <= 124) {
            field_G = (ef) null;
        }
        tp.field_t = null;
    }

    final static int a(int param0, boolean param1, boolean param2, String param3, String param4, int param5) {
        try {
            int discarded$8 = 0;
            int discarded$9 = 0;
            int discarded$10 = 0;
            int discarded$11 = 0;
            int discarded$12 = 0;
            int discarded$13 = 0;
            Object discarded$14 = null;
            Object discarded$15 = null;
            RuntimeException var6 = null;
            int var6_int = 0;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            int stackIn_6_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_56_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_113_0 = 0;
            int stackIn_115_0 = 0;
            int stackIn_125_0 = 0;
            int stackIn_127_0 = 0;
            RuntimeException stackIn_129_0 = null;
            StringBuilder stackIn_129_1 = null;
            RuntimeException stackIn_130_0 = null;
            StringBuilder stackIn_130_1 = null;
            RuntimeException stackIn_131_0 = null;
            StringBuilder stackIn_131_1 = null;
            String stackIn_131_2 = null;
            RuntimeException stackIn_132_0 = null;
            StringBuilder stackIn_132_1 = null;
            RuntimeException stackIn_133_0 = null;
            StringBuilder stackIn_133_1 = null;
            RuntimeException stackIn_134_0 = null;
            StringBuilder stackIn_134_1 = null;
            String stackIn_134_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_54_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_57_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_100_0 = 0;
            int stackOut_114_0 = 0;
            int stackOut_112_0 = 0;
            int stackOut_124_0 = 0;
            int stackOut_126_0 = 0;
            int stackOut_14_0 = 0;
            RuntimeException stackOut_128_0 = null;
            StringBuilder stackOut_128_1 = null;
            RuntimeException stackOut_130_0 = null;
            StringBuilder stackOut_130_1 = null;
            String stackOut_130_2 = null;
            RuntimeException stackOut_129_0 = null;
            StringBuilder stackOut_129_1 = null;
            String stackOut_129_2 = null;
            RuntimeException stackOut_131_0 = null;
            StringBuilder stackOut_131_1 = null;
            RuntimeException stackOut_133_0 = null;
            StringBuilder stackOut_133_1 = null;
            String stackOut_133_2 = null;
            RuntimeException stackOut_132_0 = null;
            StringBuilder stackOut_132_1 = null;
            String stackOut_132_2 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ki.field_h == null) {
                    if (!ee.a(param1, false)) {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      decompiledRegionSelector1 = 0;
                      break L0;
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
                      L4: {
                        if (!param1) {
                          break L4;
                        } else {
                          var10 = (String) null;
                          ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ki.field_a = cn.a((byte) 125, param4, param3, false);
                      break L3;
                    }
                    ma.field_a.field_j = 0;
                    ma.field_a.a(-94, 14);
                    ma.field_a.a(126, ki.field_a.b(param0 + -7).field_d);
                    cb.a(-1, false);
                    vo.field_l = de.field_h;
                    break L2;
                  }
                }
                if (param0 == 14) {
                  L5: {
                    if (de.field_h == vo.field_l) {
                      if (fa.b(10, 1)) {
                        L6: {
                          var6_int = s.field_e.g(param0 ^ 31371);
                          s.field_e.field_j = 0;
                          if (-1 == (var6_int ^ -1)) {
                            break L6;
                          } else {
                            hd.field_q = -1;
                            vo.field_l = gn.field_K;
                            op.field_i = var6_int;
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        vo.field_l = ul.field_n;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (ul.field_n != vo.field_l) {
                      break L7;
                    } else {
                      if (!fa.b(10, 8)) {
                        break L7;
                      } else {
                        nm.field_c = s.field_e.a((byte) -30);
                        s.field_e.field_j = 0;
                        pi.a((byte) -59, param2, param1, ki.field_a, param5);
                        vo.field_l = lc.field_l;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (vo.field_l == lc.field_l) {
                      if (!fa.b(10, 1)) {
                        break L8;
                      } else {
                        L9: {
                          var6_int = s.field_e.g(31365);
                          s.field_e.field_j = 0;
                          oe.field_f = null;
                          op.field_i = var6_int;
                          if (var6_int == 0) {
                            break L9;
                          } else {
                            if (var6_int == 1) {
                              break L9;
                            } else {
                              if (-9 != (var6_int ^ -1)) {
                                hd.field_q = -1;
                                vo.field_l = gn.field_K;
                                if (var9 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              } else {
                                ak.a((byte) -111);
                                sk.field_j = false;
                                stackOut_33_0 = var6_int;
                                stackIn_34_0 = stackOut_33_0;
                                decompiledRegionSelector1 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                        hd.field_q = -1;
                        vo.field_l = qb.field_e;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L10: {
                    if (vo.field_l == qb.field_e) {
                      if (!dd.a(0)) {
                        break L10;
                      } else {
                        L11: {
                          ii.field_d = s.field_e.a((byte) -30);
                          ci.field_f = param3;
                          kj.field_q = s.field_e.g(31365);
                          am.field_b = s.field_e.g(31365);
                          vl.field_h = s.field_e.d((byte) 69);
                          var11 = s.field_e.g((byte) -89);
                          var7 = s.field_e.g(31365);
                          if ((var7 & 1) != 0) {
                            fj.a((byte) 85);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          L13: {
                            if (!param1) {
                              L14: {
                                if (0 == (4 & var7)) {
                                  stackOut_55_0 = 0;
                                  stackIn_56_0 = stackOut_55_0;
                                  break L14;
                                } else {
                                  stackOut_54_0 = 1;
                                  stackIn_56_0 = stackOut_54_0;
                                  break L14;
                                }
                              }
                              L15: {
                                fj.field_M = stackIn_56_0 != 0;
                                if ((2 & var7) == 0) {
                                  stackOut_58_0 = 0;
                                  stackIn_59_0 = stackOut_58_0;
                                  break L15;
                                } else {
                                  stackOut_57_0 = 1;
                                  stackIn_59_0 = stackOut_57_0;
                                  break L15;
                                }
                              }
                              L16: {
                                sh.field_L = stackIn_59_0 != 0;
                                if ((var7 & 8) == 0) {
                                  stackOut_61_0 = 0;
                                  stackIn_62_0 = stackOut_61_0;
                                  break L16;
                                } else {
                                  stackOut_60_0 = 1;
                                  stackIn_62_0 = stackOut_60_0;
                                  break L16;
                                }
                              }
                              L17: {
                                nh.field_m = stackIn_62_0 != 0;
                                if (!nh.field_m) {
                                  break L17;
                                } else {
                                  sh.field_L = true;
                                  break L17;
                                }
                              }
                              L18: {
                                if ((var7 & 16) == 0) {
                                  stackOut_66_0 = 0;
                                  stackIn_67_0 = stackOut_66_0;
                                  break L18;
                                } else {
                                  stackOut_65_0 = 1;
                                  stackIn_67_0 = stackOut_65_0;
                                  break L18;
                                }
                              }
                              tm.field_b = stackIn_67_0 != 0;
                              if (!gj.field_e) {
                                break L13;
                              } else {
                                discarded$8 = s.field_e.g(31365);
                                discarded$9 = s.field_e.g(param0 + 31351);
                                discarded$10 = s.field_e.i(-1478490344);
                                vn.field_f = s.field_e.d((byte) 69);
                                kq.field_b = new byte[vn.field_f];
                                var8 = 0;
                                L19: while (true) {
                                  if (var8 >= vn.field_f) {
                                    break L13;
                                  } else {
                                    kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                                    var8++;
                                    if (var9 != 0) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        continue L19;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L20: {
                                if ((var7 & 16) == 0) {
                                  stackOut_46_0 = 0;
                                  stackIn_47_0 = stackOut_46_0;
                                  break L20;
                                } else {
                                  stackOut_45_0 = 1;
                                  stackIn_47_0 = stackOut_45_0;
                                  break L20;
                                }
                              }
                              tm.field_b = stackIn_47_0 != 0;
                              if (!gj.field_e) {
                                break L13;
                              } else {
                                discarded$11 = s.field_e.g(31365);
                                discarded$12 = s.field_e.g(param0 + 31351);
                                discarded$13 = s.field_e.i(-1478490344);
                                vn.field_f = s.field_e.d((byte) 69);
                                kq.field_b = new byte[vn.field_f];
                                var8 = 0;
                                L21: while (true) {
                                  if (var8 >= vn.field_f) {
                                    break L13;
                                  } else {
                                    kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                                    var8++;
                                    if (var9 != 0) {
                                      break L12;
                                    } else {
                                      if (var9 == 0) {
                                        continue L21;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          ta.field_lb = s.field_e.f((byte) -48);
                          var12 = (CharSequence) ((Object) ta.field_lb);
                          kf.field_k = tg.a(var12, false);
                          qq.field_a = s.field_e.g(31365);
                          vo.field_l = pi.field_a;
                          break L12;
                        }
                        L22: {
                          L23: {
                            if (ki.field_a.b(7) != uq.field_b) {
                              break L23;
                            } else {
                              wp.field_b.a(-108, jl.b(0));
                              if (var9 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (ki.field_a.b(7) == pl.field_G) {
                            l.field_c.a(-100, jl.b(0));
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        L24: {
                          sk.field_j = false;
                          if (var11 == null) {
                            break L24;
                          } else {
                            jh.a(jl.b(0), param0 ^ -15, var11);
                            break L24;
                          }
                        }
                        L25: {
                          L26: {
                            if (-1 > (vl.field_h ^ -1)) {
                              break L26;
                            } else {
                              if (fj.field_M) {
                                break L26;
                              } else {
                                try {
                                  L27: {
                                    discarded$14 = fo.b(jl.b(0), 13093, "unzap");
                                    decompiledRegionSelector0 = 0;
                                    break L27;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L28: {
                                    var8_ref_Throwable = decompiledCaughtException;
                                    if (var9 == 0) {
                                      decompiledRegionSelector0 = 0;
                                      break L28;
                                    } else {
                                      decompiledRegionSelector0 = 1;
                                      break L28;
                                    }
                                  }
                                }
                                if (decompiledRegionSelector0 == 0) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                          try {
                            L29: {
                              discarded$15 = fo.a(jl.b(0), "zap", (byte) 23, new Object[]{mc.a(ii.field_d, (byte) 26)});
                              break L29;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L30: {
                              var8_ref_Throwable = decompiledCaughtException;
                              break L30;
                            }
                          }
                          break L25;
                        }
                        L31: {
                          if ((vl.field_h ^ -1) < -1) {
                            cm.field_e = true;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        ma.field_a.a((byte) -77, mj.field_Fb);
                        var8 = 0;
                        L32: while (true) {
                          L33: {
                            L34: {
                              if (4 <= var8) {
                                break L34;
                              } else {
                                mj.field_Fb[var8] = mj.field_Fb[var8] + 50;
                                var8++;
                                if (var9 != 0) {
                                  break L33;
                                } else {
                                  if (var9 == 0) {
                                    continue L32;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                            }
                            s.field_e.a((byte) -116, mj.field_Fb);
                            break L33;
                          }
                          stackOut_100_0 = op.field_i;
                          stackIn_101_0 = stackOut_100_0;
                          decompiledRegionSelector1 = 3;
                          break L0;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L35: {
                    if (vo.field_l == gn.field_K) {
                      if (dd.a(0)) {
                        L36: {
                          ak.a((byte) -124);
                          if (op.field_i != 7) {
                            break L36;
                          } else {
                            if (!sk.field_j) {
                              sk.field_j = true;
                              stackOut_114_0 = -1;
                              stackIn_115_0 = stackOut_114_0;
                              decompiledRegionSelector1 = 5;
                              break L0;
                            } else {
                              break L36;
                            }
                          }
                        }
                        L37: {
                          if ((op.field_i ^ -1) == -8) {
                            op.field_i = 3;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        ol.field_q = s.field_e.f((byte) -31);
                        sk.field_j = false;
                        stackOut_112_0 = op.field_i;
                        stackIn_113_0 = stackOut_112_0;
                        decompiledRegionSelector1 = 4;
                        break L0;
                      } else {
                        break L35;
                      }
                    } else {
                      break L35;
                    }
                  }
                  L38: {
                    if (ki.field_h == null) {
                      L39: {
                        if (sk.field_j) {
                          break L39;
                        } else {
                          var6_int = jo.field_b;
                          jo.field_b = ff.field_s;
                          sk.field_j = true;
                          ff.field_s = var6_int;
                          if (var9 == 0) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      L40: {
                        L41: {
                          if (-30001L > (he.b((byte) -22) ^ -1L)) {
                            break L41;
                          } else {
                            ol.field_q = ga.field_w;
                            if (var9 == 0) {
                              break L40;
                            } else {
                              break L41;
                            }
                          }
                        }
                        ol.field_q = aj.field_l;
                        break L40;
                      }
                      sk.field_j = false;
                      stackOut_124_0 = 3;
                      stackIn_125_0 = stackOut_124_0;
                      decompiledRegionSelector1 = 6;
                      break L0;
                    } else {
                      break L38;
                    }
                  }
                  stackOut_126_0 = -1;
                  stackIn_127_0 = stackOut_126_0;
                  decompiledRegionSelector1 = 7;
                  break L0;
                } else {
                  stackOut_14_0 = -97;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L42: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_128_0 = (RuntimeException) (var6);
                stackOut_128_1 = new StringBuilder().append("fd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_130_0 = stackOut_128_0;
                stackIn_130_1 = stackOut_128_1;
                stackIn_129_0 = stackOut_128_0;
                stackIn_129_1 = stackOut_128_1;
                if (param3 == null) {
                  stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
                  stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
                  stackOut_130_2 = "null";
                  stackIn_131_0 = stackOut_130_0;
                  stackIn_131_1 = stackOut_130_1;
                  stackIn_131_2 = stackOut_130_2;
                  break L42;
                } else {
                  stackOut_129_0 = (RuntimeException) ((Object) stackIn_129_0);
                  stackOut_129_1 = (StringBuilder) ((Object) stackIn_129_1);
                  stackOut_129_2 = "{...}";
                  stackIn_131_0 = stackOut_129_0;
                  stackIn_131_1 = stackOut_129_1;
                  stackIn_131_2 = stackOut_129_2;
                  break L42;
                }
              }
              L43: {
                stackOut_131_0 = (RuntimeException) ((Object) stackIn_131_0);
                stackOut_131_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_131_2).append(',');
                stackIn_133_0 = stackOut_131_0;
                stackIn_133_1 = stackOut_131_1;
                stackIn_132_0 = stackOut_131_0;
                stackIn_132_1 = stackOut_131_1;
                if (param4 == null) {
                  stackOut_133_0 = (RuntimeException) ((Object) stackIn_133_0);
                  stackOut_133_1 = (StringBuilder) ((Object) stackIn_133_1);
                  stackOut_133_2 = "null";
                  stackIn_134_0 = stackOut_133_0;
                  stackIn_134_1 = stackOut_133_1;
                  stackIn_134_2 = stackOut_133_2;
                  break L43;
                } else {
                  stackOut_132_0 = (RuntimeException) ((Object) stackIn_132_0);
                  stackOut_132_1 = (StringBuilder) ((Object) stackIn_132_1);
                  stackOut_132_2 = "{...}";
                  stackIn_134_0 = stackOut_132_0;
                  stackIn_134_1 = stackOut_132_1;
                  stackIn_134_2 = stackOut_132_2;
                  break L43;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_134_0), stackIn_134_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_34_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_101_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_113_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_115_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_125_0;
                        } else {
                          return stackIn_127_0;
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_F = -1;
        field_M = new th();
        field_I = "You have declined the invitation.";
        field_N = "Elapsed time";
    }
}
