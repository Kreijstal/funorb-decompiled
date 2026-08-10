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
        int[] var4;
        int var5;
        int var6;
        int[] var8;
        int[] var9;
        int[] var10;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          this.field_J = false;
          stackIn_2_0 = this;

          if (-1 == (this.field_C & 1073741824 ^ -1)) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          ((fd) (this)).field_H = stackIn_3_1 != 0;
          stackIn_5_0 = this;

          if ((this.field_C & 536870912) == 0) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
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
          if (var5 >= var10.length) {
            return;
          } else {
            var6 = var10[var5];
            if (this.field_P == var6) {
              this.field_J = true;
              var5++;
              continue L2;
            } else {
              var5++;
              continue L2;
            }
          }
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
                      break L4;
                    }
                  }
                }
                if (this.field_H) {
                  od.field_Ab[this.field_P].b(var3_int, var4);
                  break L4;
                } else {
                  if (!this.field_K) {
                    od.field_Ab[this.field_P].g(var3_int, var4);
                    break L4;
                  } else {
                    od.field_Ab[this.field_P].a(var3_int, var4);
                    break L4;
                  }
                }
              }
              L6: {
                if (!this.field_J) {
                  break L6;
                } else {
                  if (!this.field_H) {
                    if (!this.field_K) {
                      od.field_Ab[-8 + this.field_P].g(var3_int, -24 + var4);
                      break L6;
                    } else {
                      od.field_Ab[-8 + this.field_P].a(var3_int, -24 + var4);
                      break L6;
                    }
                  } else {
                    od.field_Ab[-8 + this.field_P].b(var3_int, var4 + -24);
                    break L6;
                  }
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("fd.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L7;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
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
            int stackIn_6_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_45_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_55_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_90_0 = 0;
            int stackIn_102_0 = 0;
            int stackIn_104_0 = 0;
            int stackIn_113_0 = 0;
            int stackIn_115_0 = 0;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            RuntimeException stackIn_119_0 = null;
            StringBuilder stackIn_119_1 = null;
            String stackIn_119_2 = null;
            StringBuilder stackIn_121_1 = null;
            StringBuilder stackIn_122_1 = null;
            String stackIn_122_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            var9 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ki.field_h == null) {
                    if (!ee.a(param1, false)) {
                      stackIn_6_0 = -1;
                      decompiledRegionSelector0 = 0;
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
                      if (!param1) {
                        ki.field_a = cn.a((byte) 125, param4, param3, false);
                        break L3;
                      } else {
                        var10 = (String) null;
                        ki.field_a = eg.a(64, ii.field_d, (String) null, false, param3);
                        break L3;
                      }
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
                  L4: {
                    if (de.field_h == vo.field_l) {
                      if (fa.b(10, 1)) {
                        var6_int = s.field_e.g(param0 ^ 31371);
                        s.field_e.field_j = 0;
                        if (-1 == (var6_int ^ -1)) {
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
                              if (-9 != (var6_int ^ -1)) {
                                hd.field_q = -1;
                                vo.field_l = gn.field_K;
                                break L6;
                              } else {
                                ak.a((byte) -111);
                                sk.field_j = false;
                                stackIn_32_0 = var6_int;
                                decompiledRegionSelector0 = 2;
                                break L0;
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
                            fj.a((byte) 85);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (!param1) {
                            L11: {
                              if (0 == (4 & var7)) {
                                stackIn_52_0 = 0;
                                break L11;
                              } else {
                                stackIn_52_0 = 1;
                                break L11;
                              }
                            }
                            L12: {
                              fj.field_M = stackIn_52_0 != 0;
                              if ((2 & var7) == 0) {
                                stackIn_55_0 = 0;
                                break L12;
                              } else {
                                stackIn_55_0 = 1;
                                break L12;
                              }
                            }
                            L13: {
                              sh.field_L = stackIn_55_0 != 0;
                              if ((var7 & 8) == 0) {
                                stackIn_58_0 = 0;
                                break L13;
                              } else {
                                stackIn_58_0 = 1;
                                break L13;
                              }
                            }
                            L14: {
                              nh.field_m = stackIn_58_0 != 0;
                              if (!nh.field_m) {
                                break L14;
                              } else {
                                sh.field_L = true;
                                break L14;
                              }
                            }
                            L15: {
                              if ((var7 & 16) == 0) {
                                stackIn_63_0 = 0;
                                break L15;
                              } else {
                                stackIn_63_0 = 1;
                                break L15;
                              }
                            }
                            tm.field_b = stackIn_63_0 != 0;
                            if (!gj.field_e) {
                              break L10;
                            } else {
                              s.field_e.g(31365);
                              s.field_e.g(param0 + 31351);
                              s.field_e.i(-1478490344);
                              vn.field_f = s.field_e.d((byte) 69);
                              kq.field_b = new byte[vn.field_f];
                              var8 = 0;
                              L16: while (true) {
                                if (var8 >= vn.field_f) {
                                  break L10;
                                } else {
                                  kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                                  var8++;
                                  continue L16;
                                }
                              }
                            }
                          } else {
                            L17: {
                              if ((var7 & 16) == 0) {
                                stackIn_45_0 = 0;
                                break L17;
                              } else {
                                stackIn_45_0 = 1;
                                break L17;
                              }
                            }
                            tm.field_b = stackIn_45_0 != 0;
                            if (!gj.field_e) {
                              break L10;
                            } else {
                              s.field_e.g(31365);
                              s.field_e.g(param0 + 31351);
                              s.field_e.i(-1478490344);
                              vn.field_f = s.field_e.d((byte) 69);
                              kq.field_b = new byte[vn.field_f];
                              var8 = 0;
                              L18: while (true) {
                                if (var8 >= vn.field_f) {
                                  break L10;
                                } else {
                                  kq.field_b[var8] = s.field_e.d(vg.a(param0, -249699574));
                                  var8++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        }
                        L19: {
                          ta.field_lb = s.field_e.f((byte) -48);
                          var12 = (CharSequence) ((Object) ta.field_lb);
                          kf.field_k = tg.a(var12, false);
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
                            jh.a(jl.b(0), param0 ^ -15, var11);
                            break L20;
                          }
                        }
                        L21: {
                          L22: {
                            if (-1 > (vl.field_h ^ -1)) {
                              break L22;
                            } else {
                              if (fj.field_M) {
                                break L22;
                              } else {
                                try {
                                  L23: {
                                    fo.b(jl.b(0), 13093, "unzap");
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
                              fo.a(jl.b(0), "zap", (byte) 23, new Object[]{mc.a(ii.field_d, (byte) 26)});
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
                          if ((vl.field_h ^ -1) < -1) {
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
                            stackIn_90_0 = op.field_i;
                            decompiledRegionSelector0 = 3;
                            break L0;
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
                              stackIn_104_0 = -1;
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              break L30;
                            }
                          }
                        }
                        L31: {
                          if ((op.field_i ^ -1) == -8) {
                            op.field_i = 3;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        ol.field_q = s.field_e.f((byte) -31);
                        sk.field_j = false;
                        stackIn_102_0 = op.field_i;
                        decompiledRegionSelector0 = 4;
                        break L0;
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
                          if (-30001L > (he.b((byte) -22) ^ -1L)) {
                            ol.field_q = aj.field_l;
                            break L33;
                          } else {
                            ol.field_q = ga.field_w;
                            break L33;
                          }
                        }
                        sk.field_j = false;
                        stackIn_113_0 = 3;
                        decompiledRegionSelector0 = 6;
                        break L0;
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
                  stackIn_115_0 = -1;
                  decompiledRegionSelector0 = 7;
                  break L0;
                } else {
                  stackIn_14_0 = -97;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L34: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_118_0 = (RuntimeException) (var6);

                stackIn_118_1 = new StringBuilder().append("fd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_118_0);
                  stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
                  stackIn_119_2 = "null";
                  break L34;
                } else {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_118_0);
                  stackIn_119_1 = (StringBuilder) ((Object) stackIn_118_1);
                  stackIn_119_2 = "{...}";
                  break L34;
                }
              }
              L35: {


                stackIn_121_1 = ((StringBuilder) (Object) stackIn_119_1).append(stackIn_119_2).append(',');

                if (param4 == null) {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_119_0);
                  stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                  stackIn_122_2 = "null";
                  break L35;
                } else {
                  stackIn_119_0 = (RuntimeException) ((Object) stackIn_119_0);
                  stackIn_122_1 = (StringBuilder) ((Object) stackIn_121_1);
                  stackIn_122_2 = "{...}";
                  break L35;
                }
              }
              throw fa.a((Throwable) ((Object) stackIn_119_0), stackIn_122_2 + ',' + param5 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_6_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_90_0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_102_0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_104_0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_113_0;
                        } else {
                          return stackIn_115_0;
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
