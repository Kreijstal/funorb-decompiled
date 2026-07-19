/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kd extends g {
    static int field_pb;
    private int field_Eb;
    private int field_ub;
    boolean field_cb;
    private boolean field_ob;
    private nc field_rb;
    private qh field_yb;
    int field_fb;
    int field_sb;
    int field_Bb;
    static int field_Db;
    private int field_mb;
    private int field_xb;
    private boolean field_tb;
    boolean field_qb;
    int field_bb;
    private ah field_wb;
    private int field_Ab;
    static vn[][] field_Fb;
    private kk field_lb;
    boolean field_hb;
    private int field_jb;
    private int field_ib;
    private int field_vb;
    private boolean field_eb;
    private int field_zb;
    int field_gb;
    private int field_db;
    int field_Gb;
    private int field_Cb;
    private int field_kb;
    static int[] field_nb;

    private final void q(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = pb.a(so.field_a, 50, param0 ^ 0);
            if (var2 != param0) {
              break L1;
            } else {
              if (Math.abs(this.field_K + this.field_O) >= Math.abs(this.field_I)) {
                break L1;
              } else {
                if (Math.abs(this.field_R + this.field_T) >= Math.abs(this.field_M)) {
                  break L1;
                } else {
                  this.field_O = this.field_O + this.field_K;
                  this.field_T = this.field_T + this.field_R;
                  break L0;
                }
              }
            }
          }
          if (var2 != 2) {
            break L0;
          } else {
            if (Math.abs(this.field_O + -this.field_K) <= Math.abs(this.field_E)) {
              break L0;
            } else {
              if ((Math.abs(this.field_T + -this.field_R) ^ -1) < (Math.abs(this.field_ab) ^ -1)) {
                this.field_T = this.field_T - this.field_R;
                this.field_O = this.field_O - this.field_K;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
    }

    final boolean p(byte param0) {
        boolean discarded$0 = false;
        if (this.n((byte) 25)) {
            return false;
        }
        this.e(15, -6904);
        if (param0 != 6) {
            discarded$0 = this.o((byte) -114);
            return true;
        }
        return true;
    }

    private final String n(int param0) {
        if (param0 >= -26) {
            this.b(true);
        }
        return "";
    }

    final boolean t(int param0) {
        if (!(!this.n((byte) 25))) {
            return false;
        }
        if (param0 <= 14) {
            return true;
        }
        this.e(14, -6904);
        return true;
    }

    final void a(int param0, wk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            if (!this.field_J) {
              L1: {
                var3_int = param1.a(this.a(true), (byte) -75) + -24;
                var4 = param1.a(this.f(237239984), param0) - 48;
                if (this.field_cb) {
                  nb.field_k[0].b(var3_int, var4, 128, 16711680);
                  break L1;
                } else {
                  if (this.field_tb) {
                    nb.field_k[0].b(var3_int, var4);
                    break L1;
                  } else {
                    if (this.field_qb) {
                      nb.field_k[0].e(var3_int, var4, 96);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("kd.CA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void u(int param0) {
        if (param0 >= -99) {
            this.field_eb = true;
        }
        if (this.o((byte) -22)) {
            this.field_U = tp.b((byte) 59, 70 + pb.a(so.field_a, 2, 1));
        } else {
            this.field_U = tp.b((byte) 37, pb.a(so.field_a, 2, 1) + 72);
        }
    }

    private final void A(int param0) {
        boolean discarded$3 = false;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ej var6 = null;
        int var7 = 0;
        fb var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        kd var15 = null;
        Object var16 = null;
        ah var16_ref = null;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var16 = null;
        var14 = ZombieDawn.field_J;
        int fieldTemp$2 = this.field_vb;
        this.field_vb = this.field_vb + 1;
        if (-6 >= (fieldTemp$2 ^ -1)) {
          this.field_vb = 0;
          if (!this.field_V) {
            L0: {
              if (dj.field_e.field_q != 7) {
                break L0;
              } else {
                if (dj.field_e.field_h != 0) {
                  break L0;
                } else {
                  if (-12 < (this.field_u ^ -1)) {
                    break L0;
                  } else {
                    if ((this.field_B ^ -1) <= -7) {
                      break L0;
                    } else {
                      if (-9 <= (this.field_B ^ -1)) {
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            L1: {
              var2 = null;
              var6 = dj.field_e.field_H;
              var7 = 1;
              if (this.i((byte) -126)) {
                break L1;
              } else {
                var7 = var7 | 2;
                break L1;
              }
            }
            var8 = this.a((byte) -74, 80, var7);
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (param0 < -81) {
                    break L3;
                  } else {
                    discarded$3 = this.C(-127);
                    break L3;
                  }
                }
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    if (this.field_F == 7) {
                      break L4;
                    } else {
                      if ((this.field_Eb ^ -1) != -1) {
                        break L4;
                      } else {
                        if (this.field_ob) {
                          break L4;
                        } else {
                          this.field_Y = ((ah) (var2)).a(true);
                          this.field_X = ((ah) (var2)).f(237239984);
                          this.c(0, 114688);
                          this.e(7, -6904);
                          this.field_Eb = 0;
                          this.field_wb = (ah) (var2);
                          break L4;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (var8 instanceof ah) {
                    var5 = this.field_s;
                    var16_ref = (ah) ((Object) var8);
                    if (-19 == (var16_ref.field_F ^ -1)) {
                      break L5;
                    } else {
                      if (-21 == (var16_ref.field_F ^ -1)) {
                        break L5;
                      } else {
                        if (var16_ref.field_V) {
                          break L5;
                        } else {
                          if (var6.a(var16_ref.f(237239984), this.f(237239984), var16_ref.a(true), this.a(true), 125) == -1) {
                            break L5;
                          } else {
                            if (400 <= var5) {
                              var2 = var16_ref;
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  this.field_wb = var16_ref;
                                  var16_ref.r(20);
                                  this.e(8, -6904);
                                  this.field_zb = 70;
                                  this.field_kb = (var16_ref.a(true) + -this.a(true)) / 2;
                                  this.field_mb = (var16_ref.f(237239984) - this.f(237239984)) / 2;
                                  if (!var16_ref.t(10)) {
                                    break L7;
                                  } else {
                                    if (this.o((byte) -128)) {
                                      this.field_Cb = 0;
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (var16_ref.t(10)) {
                                    break L8;
                                  } else {
                                    if (!this.o((byte) 112)) {
                                      this.field_Cb = 4;
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                this.field_Cb = 8;
                                break L6;
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (var8 instanceof kd) {
                      L9: {
                        var15 = (kd) ((Object) var8);
                        if ((this.field_fb ^ -1) == 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L9;
                        } else {
                          stackOut_18_0 = this.field_fb;
                          stackIn_20_0 = stackOut_18_0;
                          break L9;
                        }
                      }
                      L10: {
                        var10 = stackIn_20_0;
                        if (-1 != var15.field_fb) {
                          stackOut_22_0 = var15.field_fb;
                          stackIn_23_0 = stackOut_22_0;
                          break L10;
                        } else {
                          stackOut_21_0 = 0;
                          stackIn_23_0 = stackOut_21_0;
                          break L10;
                        }
                      }
                      var11 = stackIn_23_0;
                      if ((var10 ^ -1) == (var11 ^ -1)) {
                        break L5;
                      } else {
                        if (!var15.field_ob) {
                          L11: {
                            L12: {
                              if (5 == var15.field_F) {
                                break L12;
                              } else {
                                if (var15.field_F == 6) {
                                  break L12;
                                } else {
                                  if (4 != var15.field_F) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            if (var15.field_V) {
                              break L11;
                            } else {
                              var3 = var15.a(true) - this.a(true);
                              var4 = var15.f(237239984) - this.f(237239984);
                              var5 = var4 * var4 + var3 * var3;
                              if (529 <= var5) {
                                break L11;
                              } else {
                                if (0 == (var6.a(var15.f(237239984), this.f(237239984), var15.a(true), this.a(true), 106) ^ -1)) {
                                  break L11;
                                } else {
                                  L13: {
                                    this.e(21, -6904);
                                    this.field_zb = 50;
                                    if (var15.field_ob) {
                                      break L13;
                                    } else {
                                      L14: {
                                        var15.e(21, -6904);
                                        if (0 >= var3) {
                                          var15.field_S = 1;
                                          this.field_S = 3;
                                          break L14;
                                        } else {
                                          var15.field_S = 3;
                                          this.field_S = 1;
                                          break L14;
                                        }
                                      }
                                      var15.field_zb = 50;
                                      break L13;
                                    }
                                  }
                                  L15: {
                                    var12 = var15.field_y + (var3 << -1249701841);
                                    var13 = var15.field_x + (var4 << 65612239);
                                    if ((var6.a(var13 >> 11885648, var15.f(237239984), var12 >> -1266297616, var15.a(true), 120) ^ -1) == 0) {
                                      var15.field_Y = var15.a(true);
                                      var15.field_X = var15.f(237239984);
                                      break L15;
                                    } else {
                                      var15.field_X = var13 >> 1139655472;
                                      var15.field_Y = var12 >> -92376752;
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    var13 = this.field_x - (var4 << -765637841);
                                    var12 = this.field_y - (var3 << 524977551);
                                    if ((var6.a(var13 >> -741354608, this.f(237239984), var12 >> -990564656, this.a(true), 108) ^ -1) == 0) {
                                      this.field_X = this.field_x >> 153273072;
                                      this.field_Y = this.field_y >> -643499600;
                                      break L16;
                                    } else {
                                      this.field_X = var13 >> 2127704880;
                                      this.field_Y = var12 >> 70040080;
                                      break L16;
                                    }
                                  }
                                  return;
                                }
                              }
                            }
                          }
                          break L5;
                        } else {
                          var8 = this.e((byte) 32);
                          continue L2;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                var8 = this.e((byte) 32);
                continue L2;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vn stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        vn stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        vn stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        vn stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        vn stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (this.field_J) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1.a(this.a(true), (byte) -112) + -24;
              var4 = param1.a(this.f(237239984), 0) + -48;
              if ((this.field_F ^ -1) == -9) {
                ki.a((byte) -99, md.field_vb);
                bi.d();
                nb.field_k[cg.field_d[8] - -this.field_G - -this.field_Cb].b(0, 0);
                pa.a(-21189);
                ho.a(md.field_vb, this.o((byte) -83), this.field_fb, -128);
                md.field_vb.b(this.field_kb + var3_int, var4 + this.field_mb);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 <= -76) {
                    break L1;
                  } else {
                    field_Fb = (vn[][]) null;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    L4: {
                      if (!this.field_tb) {
                        break L4;
                      } else {
                        if (5 == this.field_F) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (this.field_F == 7) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  lb.field_eb[7].e(param1.a(this.field_jb, (byte) -72), param1.a(this.field_ib, 0), this.field_ub);
                  break L2;
                }
                L5: {
                  if (!g.field_Q) {
                    break L5;
                  } else {
                    L6: {
                      bj.field_q.c(this.n(-30), var3_int, var4, 16777215, 0);
                      if (5 == this.field_F) {
                        break L6;
                      } else {
                        if (12 != this.field_F) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.a(param1, -1);
                    break L5;
                  }
                }
                L7: {
                  if (null != this.field_U) {
                    if (this.field_U.l()) {
                      this.field_U = null;
                      break L7;
                    } else {
                      this.field_U.h(pj.a(var4, 68, var3_int));
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if ((var3_int ^ -1) > 47) {
                    break L8;
                  } else {
                    if (-48 > var4) {
                      break L8;
                    } else {
                      if (qj.field_d < var3_int) {
                        break L8;
                      } else {
                        if ((me.field_Bb ^ -1) <= (var4 ^ -1)) {
                          L9: {
                            if ((this.field_F ^ -1) != -18) {
                              L10: {
                                stackOut_34_0 = nb.field_k[1];
                                stackOut_34_1 = 12;
                                stackIn_36_0 = stackOut_34_0;
                                stackIn_36_1 = stackOut_34_1;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                if (this.field_S == 3) {
                                  stackOut_36_0 = (vn) ((Object) stackIn_36_0);
                                  stackOut_36_1 = stackIn_36_1;
                                  stackOut_36_2 = -5 + var3_int;
                                  stackIn_37_0 = stackOut_36_0;
                                  stackIn_37_1 = stackOut_36_1;
                                  stackIn_37_2 = stackOut_36_2;
                                  break L10;
                                } else {
                                  stackOut_35_0 = (vn) ((Object) stackIn_35_0);
                                  stackOut_35_1 = stackIn_35_1;
                                  stackOut_35_2 = var3_int;
                                  stackIn_37_0 = stackOut_35_0;
                                  stackIn_37_1 = stackOut_35_1;
                                  stackIn_37_2 = stackOut_35_2;
                                  break L10;
                                }
                              }
                              so.a(stackIn_37_0, stackIn_37_1 + stackIn_37_2, var4 - -43);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L11: {
                            var5 = cg.field_d[this.field_F] + this.field_G;
                            if (!this.field_ob) {
                              break L11;
                            } else {
                              if (-15 >= (var5 ^ -1)) {
                                break L11;
                              } else {
                                var5 += 49;
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (!this.field_eb) {
                              break L12;
                            } else {
                              var5 = 30;
                              break L12;
                            }
                          }
                          L13: {
                            ki.a((byte) -100, md.field_vb);
                            bi.d();
                            if (-4 != (this.field_S ^ -1)) {
                              ad.field_g[this.field_t][var5].b(3, 3);
                              break L13;
                            } else {
                              ad.field_g[this.field_t][var5].c(3, 3);
                              break L13;
                            }
                          }
                          L14: {
                            ho.a(md.field_vb, this.o((byte) -101), this.field_fb, -111);
                            if (0 < this.field_Ab) {
                              if (this.field_Ab == 2) {
                                so.a(0, 0, 54, 54, 16755200);
                                so.a(0, 0, 54, 54, 16711680);
                                break L14;
                              } else {
                                so.a(0, 0, 54, 54, 16742144);
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            pa.a(-21189);
                            if (this.field_bb > 0) {
                              L16: {
                                var6 = 72;
                                if (-25 < (this.field_bb / 2 ^ -1)) {
                                  var6 = this.field_bb / 2 + 48;
                                  break L16;
                                } else {
                                  if ((this.field_bb ^ -1) < -953) {
                                    var6 = 48 - -((-this.field_bb + 1000) / 2);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              md.field_vb.a(-((-48 + var6) / 2) + var3_int, var4 - (-48 + var6), var6, var6, 128);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L17: {
                            if (0 >= this.field_Z) {
                              L18: {
                                if (!this.field_eb) {
                                  break L18;
                                } else {
                                  if (0L != (tp.field_p & 1L)) {
                                    break L18;
                                  } else {
                                    md.field_vb.h(-3 + var3_int, -3 + var4, 16777215);
                                    break L17;
                                  }
                                }
                              }
                              md.field_vb.b(var3_int - 3, var4 - 3);
                              break L17;
                            } else {
                              md.field_vb.d(var3_int + -3, -3 + var4, 142);
                              break L17;
                            }
                          }
                          L19: {
                            if (kc.field_Q) {
                              pc.field_k.a(s.a(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 24 + var3_int, var4 - 5, 16777215, 0);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L20: {
                            if (!nk.field_d) {
                              break L20;
                            } else {
                              var6 = param1.a(this.a(true), (byte) -96);
                              var7 = param1.a(this.f(237239984), 0);
                              bi.d(var6, var7, 3, 16711935);
                              break L20;
                            }
                          }
                          L21: {
                            if (!b.field_h) {
                              break L21;
                            } else {
                              pc.field_k.a(s.a(1938762664, "<%0>", new String[]{Integer.toString(this.field_gb)}), var3_int - -24, var4 + -5, 16777215, 0);
                              break L21;
                            }
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) (var3);
            stackOut_73_1 = new StringBuilder().append("kd.B(").append(param0).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param1 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L22;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L22;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ')');
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

    final void z(int param0) {
        int fieldTemp$2 = 0;
        L0: {
          fieldTemp$2 = this.field_Ab;
          this.field_Ab = this.field_Ab - 1;
          if ((fieldTemp$2 ^ -1) < -1) {
            break L0;
          } else {
            if ((this.field_F ^ -1) != -10) {
              L1: {
                if (param0 == 0) {
                  break L1;
                } else {
                  field_Db = -60;
                  break L1;
                }
              }
              L2: {
                if (-9 != (this.field_F ^ -1)) {
                  break L2;
                } else {
                  if (null == this.field_wb) {
                    break L2;
                  } else {
                    this.field_wb.q(118);
                    break L2;
                  }
                }
              }
              this.e(9, param0 + -6904);
              this.l((byte) -124);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    private final boolean o(byte param0) {
        int var2 = -105 / ((69 - param0) / 41);
        return (this.field_t ^ -1) == -1 ? true : false;
    }

    private final void l(byte param0) {
        if (0 < this.field_bb) {
            this.field_bb = 0;
        }
        if (param0 >= -118) {
            this.s(-3);
        }
    }

    final boolean C(int param0) {
        if (this.n((byte) 25)) {
          return false;
        } else {
          if (!this.field_ob) {
            this.e(19, -6904);
            if (param0 <= -57) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void e(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (this.field_F != 9) {
          L0: {
            super.e(param0, param1);
            if (7 != this.field_F) {
              if (9 == this.field_F) {
                if (!this.field_J) {
                  this.field_U = kh.a(66, false);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              if (this.o((byte) 112)) {
                this.field_U = tp.b((byte) 37, 15);
                break L0;
              } else {
                this.field_U = tp.b((byte) 89, 25);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(qh param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.a((byte) -118)) {
                  break L1;
                } else {
                  L2: {
                    this.field_db = 0;
                    this.field_lb = (kk) ((Object) param0.e(0));
                    this.field_yb = param0;
                    this.field_ub = 0;
                    if (null == this.field_lb) {
                      break L2;
                    } else {
                      this.field_ib = this.field_lb.field_h - 30;
                      this.field_jb = this.field_lb.field_l - 12;
                      break L2;
                    }
                  }
                  if (param1) {
                    L3: {
                      if (this.n((byte) 25)) {
                        break L3;
                      } else {
                        this.B(-122);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("kd.C(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void f(byte param0) {
        this.field_J = true;
        if (param0 != -85) {
            this.field_yb = (qh) null;
        }
        this.e(22, -6904);
        if (!(null == this.field_wb)) {
            this.field_wb.q(119);
        }
    }

    private final void s(int param0) {
        ej var2 = null;
        Object var3 = null;
        Object var4 = null;
        le var5 = null;
        ah var6 = null;
        qh var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        if (this.field_V) {
          return;
        } else {
          L0: {
            L1: {
              if (4 == this.field_F) {
                break L1;
              } else {
                if ((this.field_F ^ -1) == -6) {
                  break L1;
                } else {
                  if (this.field_F != 6) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (this.field_fb == 2) {
                break L2;
              } else {
                if (-1 == (pb.a(so.field_a, 2, 1) ^ -1)) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            var2 = dj.field_e.field_H;
            var3 = null;
            var4 = null;
            var5 = dj.field_e.field_R.field_b.field_b;
            L3: while (true) {
              if (var5 == dj.field_e.field_R.field_b) {
                if (var3 != null) {
                  this.a((qh) (var4), true);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                L4: {
                  if (var5 instanceof ah) {
                    var6 = (ah) ((Object) var5);
                    if (var6.field_F == 18) {
                      break L4;
                    } else {
                      if (var6.field_F == 20) {
                        break L4;
                      } else {
                        var7 = var2.a(true, this.a(true), var6.f(237239984), var6.a(true), this.f(237239984));
                        if (var7 == null) {
                          break L4;
                        } else {
                          L5: {
                            if (this.field_F != 4) {
                              break L5;
                            } else {
                              if (pb.a(so.field_a, 2, param0 + -17303) == 0) {
                                break L5;
                              } else {
                                var5 = var5.field_b;
                                continue L3;
                              }
                            }
                          }
                          L6: {
                            if (var4 == null) {
                              break L6;
                            } else {
                              if (((qh) (var4)).field_g <= var7.field_g) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 = var7;
                          var3 = var6;
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var5 = var5.field_b;
                continue L3;
              }
            }
          }
          L7: {
            if (param0 == 17304) {
              break L7;
            } else {
              this.q((byte) -65);
              break L7;
            }
          }
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          if (param1 <= param0) {
            break L0;
          } else {
            var6 = param1;
            param1 = param0;
            param0 = var6;
            break L0;
          }
        }
        L1: {
          if (param2 < param3) {
            var6 = param3;
            param3 = param2;
            param2 = var6;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param4) {
          L2: {
            L3: {
              var6 = this.a(true);
              var7 = -24 + this.f(237239984);
              if ((param1 ^ -1) <= (var6 ^ -1)) {
                break L3;
              } else {
                if (param0 <= var6) {
                  break L3;
                } else {
                  if ((param3 ^ -1) <= (var7 ^ -1)) {
                    break L3;
                  } else {
                    if ((var7 ^ -1) <= (param2 ^ -1)) {
                      break L3;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L2;
          }
          return stackIn_13_0 != 0;
        } else {
          return true;
        }
    }

    private final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        le var7 = null;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.a(this.a(true), (byte) -105);
              var4 = param0.a(this.f(param1 ^ -237239985), 0);
              var5 = param0.a(this.field_Y, (byte) -112);
              var6 = param0.a(this.field_X, 0);
              if (param1 == -1) {
                break L1;
              } else {
                this.field_qb = true;
                break L1;
              }
            }
            this.a(var4, 0, var3_int, var6, var5);
            if (null != this.field_yb) {
              var7 = this.field_yb.b((byte) 26);
              L2: while (true) {
                if (!(var7 instanceof kk)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = var5;
                  var4 = var6;
                  var5 = param0.a(((kk) ((Object) var7)).field_l, (byte) -90);
                  var6 = param0.a(((kk) ((Object) var7)).field_h, 0);
                  this.a(var4, 0, var3_int, var6, var5);
                  var7 = var7.field_b;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("kd.KA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void w(int param0) {
        field_Fb = (vn[][]) null;
        if (param0 != 54) {
            field_nb = (int[]) null;
        }
        field_nb = null;
    }

    final boolean y(int param0) {
        wk var3 = null;
        L0: {
          if (param0 >= 97) {
            break L0;
          } else {
            var3 = (wk) null;
            this.a((byte) 118, (wk) null);
            break L0;
          }
        }
        L1: {
          this.field_W = 8;
          if (5 == this.field_F) {
            this.c(0, 57344);
            break L1;
          } else {
            if (7 != this.field_F) {
              break L1;
            } else {
              this.c(0, 114688);
              break L1;
            }
          }
        }
        return true;
    }

    final boolean i(byte param0) {
        if (param0 != -126) {
            this.field_vb = 16;
        }
        return 0 == this.field_fb ? true : false;
    }

    final void k(byte param0) {
        if (!(null == this.field_wb)) {
            this.field_wb.field_kb = true;
        }
        int var2 = -123 % ((param0 - -31) / 37);
    }

    final boolean n(byte param0) {
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param0 == 25) {
            break L0;
          } else {
            this.field_Cb = 21;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((this.field_F ^ -1) == -9) {
              break L2;
            } else {
              if ((this.field_F ^ -1) == -10) {
                break L2;
              } else {
                if ((this.field_F ^ -1) == -23) {
                  break L2;
                } else {
                  if ((this.field_F ^ -1) == -13) {
                    break L2;
                  } else {
                    if (this.field_F == 7) {
                      break L2;
                    } else {
                      if (13 == this.field_F) {
                        break L2;
                      } else {
                        if (-15 == (this.field_F ^ -1)) {
                          break L2;
                        } else {
                          if (-16 == (this.field_F ^ -1)) {
                            break L2;
                          } else {
                            if ((this.field_F ^ -1) == -18) {
                              break L2;
                            } else {
                              if (19 == this.field_F) {
                                break L2;
                              } else {
                                if (!this.field_V) {
                                  stackOut_15_0 = 0;
                                  stackIn_16_0 = stackOut_15_0;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_14_0 = 1;
          stackIn_16_0 = stackOut_14_0;
          break L1;
        }
        return stackIn_16_0 != 0;
    }

    final void v(int param0) {
        if (param0 != -23221) {
            this.field_Ab = -49;
        }
        this.field_ob = true;
    }

    final void q(byte param0) {
        if (param0 > -91) {
            return;
        }
        this.field_tb = false;
        this.c((byte) -67);
    }

    final boolean m(byte param0) {
        if (0 < this.field_Ab) {
            return false;
        }
        this.field_Ab = 2;
        int var2 = 99 % ((param0 - 57) / 47);
        return true;
    }

    final void k(int param0) {
        this.z(param0);
    }

    kd(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, 57344);
        this.field_ub = 0;
        this.field_sb = 200;
        this.field_rb = null;
        this.field_ob = false;
        this.field_bb = 0;
        this.field_tb = false;
        this.field_xb = 0;
        this.field_Bb = 0;
        this.field_zb = 0;
        this.field_wb = null;
        this.field_hb = false;
        this.field_mb = 0;
        this.field_cb = false;
        this.field_Ab = 0;
        this.field_gb = 0;
        this.field_kb = 0;
        this.field_Gb = 0;
        this.field_T = 0;
        this.field_O = 0;
        this.field_fb = param3;
        this.field_vb = pb.a(so.field_a, 5, 1);
        this.field_db = pb.a(so.field_a, 120, 1);
        if (this.field_fb != 0) {
            this.field_gb = pb.a(so.field_a, this.field_sb, 1);
        }
    }

    final boolean x(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 24) {
          L0: {
            L1: {
              if (this.field_ob) {
                break L1;
              } else {
                if ((this.field_F ^ -1) == -10) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void c(int param0, int param1, int param2) {
        if (this.n((byte) 25)) {
            if (-8 != (this.field_F ^ -1)) {
                return;
            }
        }
        int var4 = 120;
        int var5 = -this.a(true) + param2;
        int var6 = -this.f(237239984) + param1;
        double var7 = (double)var4 / (double)so.b(var6 * var6 + var5 * var5);
        this.field_Y = -(int)(var7 * (double)var5) + this.a(true);
        this.field_X = -(int)(var7 * (double)var6) + this.f(237239984);
        int var9 = this.field_S;
        this.c(param0 ^ param0, 401408);
        this.field_S = var9;
        this.e(12, -6904);
    }

    kd(int param0, int param1, boolean param2, int param3) {
        this(param0, param1, param2 ? 0 : 1, param3);
        Object stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        Object stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        L0: {
          stackOut_0_0 = this;
          stackOut_0_1 = param0;
          stackOut_0_2 = param1;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        boolean discarded$0 = false;
        if (param2) {
            discarded$0 = this.C(-72);
        }
        if (this.field_V) {
            return;
        }
        this.field_X = param0;
        this.field_Y = param1;
        this.c(0, 28672);
        this.e(6, -6904);
    }

    final void b(boolean param0) {
        if (-1 <= (this.field_bb ^ -1)) {
        }
        if (!param0) {
            return;
        }
        this.field_bb = 1000;
        this.field_ob = false;
    }

    final void j(byte param0) {
        if (param0 != 82) {
            this.field_ib = -106;
        }
        if (null == this.field_lb) {
            return;
        }
        this.field_yb = dj.field_e.field_H.a(true, this.a(true), this.field_lb.field_h, this.field_lb.field_l, this.f(237239984));
    }

    final boolean o(int param0) {
        if (!(!this.n((byte) 25))) {
            return false;
        }
        if (param0 <= 33) {
            this.f((byte) -56);
        }
        this.e(17, -6904);
        return true;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 0) {
            this.a(-104, -36, -28, 47, -27);
        }
        int var6 = 16711935;
        bi.e(param2, param0, param4, param3, var6);
        bi.g(param4, param3, 1, var6);
    }

    final void r(int param0) {
        this.field_tb = true;
        this.field_ub = 0;
        if (param0 != -31340) {
            this.A(56);
        }
    }

    final void B(int param0) {
        kk var2 = null;
        int var3 = 0;
        L0: {
          if (null == this.field_yb) {
            break L0;
          } else {
            if (this.field_yb.a((byte) -122)) {
              break L0;
            } else {
              var2 = (kk) ((Object) this.field_yb.f(29));
              this.field_Y = var2.field_l;
              this.field_X = var2.field_h;
              var3 = -39 / ((-49 - param0) / 54);
              this.e(5, -6904);
              this.c(0, 57344);
              return;
            }
          }
        }
        this.field_yb = null;
        this.field_lb = null;
        this.e(4, -6904);
    }

    final void j(int param0) {
        super.j(87);
        if (param0 < 66) {
            this.field_Bb = 8;
        }
        this.e(4, -6904);
        this.q((byte) -125);
    }

    final void g(int param0) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        fn discarded$11 = null;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        boolean discarded$15 = false;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kc var8 = null;
        va var9 = null;
        int stackIn_87_0 = 0;
        hi stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        ah stackIn_116_2 = null;
        int stackIn_116_3 = 0;
        boolean stackIn_116_4 = false;
        hi stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        ah stackIn_117_2 = null;
        int stackIn_117_3 = 0;
        boolean stackIn_117_4 = false;
        hi stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        ah stackIn_118_2 = null;
        int stackIn_118_3 = 0;
        boolean stackIn_118_4 = false;
        kk stackIn_118_5 = null;
        hi stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        ah stackOut_115_2 = null;
        int stackOut_115_3 = 0;
        boolean stackOut_115_4 = false;
        hi stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        ah stackOut_117_2 = null;
        int stackOut_117_3 = 0;
        boolean stackOut_117_4 = false;
        Object stackOut_117_5 = null;
        hi stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        ah stackOut_116_2 = null;
        int stackOut_116_3 = 0;
        boolean stackOut_116_4 = false;
        kk stackOut_116_5 = null;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        L0: {
          var7 = ZombieDawn.field_J;
          var9 = this.m(91);
          this.d(this.field_F, -26109);
          if (-1 <= (this.field_bb ^ -1)) {
            break L0;
          } else {
            fieldTemp$8 = this.field_bb - 1;
            this.field_bb = this.field_bb - 1;
            if ((fieldTemp$8 ^ -1) < -1) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (0 >= this.field_fb) {
            break L1;
          } else {
            fieldTemp$9 = this.field_gb - 1;
            this.field_gb = this.field_gb - 1;
            if (fieldTemp$9 >= 0) {
              break L1;
            } else {
              this.field_gb = this.field_sb;
              this.s(17304);
              break L1;
            }
          }
        }
        L2: {
          if (!this.field_eb) {
            var8 = (kc) ((Object) rg.field_J.c((byte) 34));
            L3: while (true) {
              if (var8 == null) {
                break L2;
              } else {
                L4: {
                  if (var8.a(113, (kd) (this))) {
                    L5: {
                      if ((this.field_Ab ^ -1) >= -1) {
                        break L5;
                      } else {
                        fieldTemp$10 = this.field_Gb - 1;
                        this.field_Gb = this.field_Gb - 1;
                        if (fieldTemp$10 <= 0) {
                          this.field_Gb = 12;
                          this.field_Ab = this.field_Ab - 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (0 < this.field_Ab) {
                      break L4;
                    } else {
                      this.field_Gb = 0;
                      this.field_eb = true;
                      discarded$11 = kh.a(95, false);
                      this.z(0);
                      ck.a(-13, 6836);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var8 = (kc) ((Object) rg.field_J.a((byte) 116));
                continue L3;
              }
            }
          } else {
            break L2;
          }
        }
        L6: {
          if (param0 > 95) {
            break L6;
          } else {
            this.s(16);
            break L6;
          }
        }
        L7: {
          if ((this.field_F ^ -1) != -5) {
            if ((this.field_F ^ -1) == -6) {
              L8: {
                if ((this.field_Eb ^ -1) < -1) {
                  this.field_Eb = this.field_Eb - 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                this.q(1);
                this.g((byte) -127);
                if (var9 != null) {
                  L10: {
                    if ((var9.field_h * this.field_O ^ -1) > -1) {
                      break L10;
                    } else {
                      if (0 > var9.field_i * this.field_T) {
                        break L10;
                      } else {
                        L11: {
                          if (0 != var9.field_h) {
                            break L11;
                          } else {
                            if (-1 != (var9.field_i ^ -1)) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                        this.field_xb = this.field_xb + 1;
                        if (2250 >= this.field_xb) {
                          break L9;
                        } else {
                          dj.field_e.a(240, 15, (byte) -23);
                          break L9;
                        }
                      }
                    }
                  }
                  this.field_xb = 0;
                  break L9;
                } else {
                  break L9;
                }
              }
              L12: {
                L13: {
                  if (this.h((byte) -126)) {
                    break L13;
                  } else {
                    if (this.field_O != 0) {
                      break L12;
                    } else {
                      if (this.field_T != 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                this.B(123);
                break L12;
              }
              L14: {
                if (!this.field_tb) {
                  break L14;
                } else {
                  if (this.field_ub >= 128) {
                    break L14;
                  } else {
                    this.field_ub = this.field_ub + 8;
                    break L14;
                  }
                }
              }
              this.A(-128);
              break L7;
            } else {
              if (6 == this.field_F) {
                L15: {
                  if (-1 <= (this.field_Eb ^ -1)) {
                    break L15;
                  } else {
                    this.field_Eb = this.field_Eb - 1;
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    this.g((byte) 64);
                    if (this.h((byte) -100)) {
                      break L17;
                    } else {
                      if (0 != this.field_O) {
                        break L16;
                      } else {
                        if (-1 == (this.field_T ^ -1)) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  this.e(4, -6904);
                  break L16;
                }
                this.A(-96);
                break L7;
              } else {
                if (-22 == (this.field_F ^ -1)) {
                  L18: {
                    fieldTemp$12 = this.field_zb - 1;
                    this.field_zb = this.field_zb - 1;
                    if (-1 <= (fieldTemp$12 ^ -1)) {
                      this.field_zb = 35;
                      this.e(4, -6904);
                      this.j((byte) 82);
                      this.B(41);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var3 = 16384;
                    if ((this.field_X ^ -1) < (this.field_x >> -673452432 ^ -1)) {
                      this.field_x = this.field_x + var3;
                      break L19;
                    } else {
                      if ((this.field_X ^ -1) > (this.field_x >> 1717326992 ^ -1)) {
                        this.field_x = this.field_x - var3;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (this.field_y >> 1832641840 >= this.field_Y) {
                    if (this.field_Y < this.field_y >> -1074223408) {
                      this.field_y = this.field_y - var3;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    this.field_y = this.field_y + var3;
                    break L7;
                  }
                } else {
                  if (this.field_F == 7) {
                    L20: {
                      L21: {
                        if (this.field_wb.field_F == 18) {
                          break L21;
                        } else {
                          if ((this.field_wb.field_F ^ -1) == -21) {
                            break L21;
                          } else {
                            fieldTemp$13 = this.field_Eb;
                            this.field_Eb = this.field_Eb + 1;
                            if (-61 > (fieldTemp$13 ^ -1)) {
                              break L21;
                            } else {
                              if (!this.field_wb.field_V) {
                                L22: {
                                  if (-2 == (this.field_wb.field_F ^ -1)) {
                                    break L22;
                                  } else {
                                    if (2 != this.field_wb.field_F) {
                                      break L20;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                L23: {
                                  var3 = this.field_wb.a(true);
                                  var4 = this.field_wb.f(237239984);
                                  var5 = -var3 + this.a(true);
                                  var6 = this.f(237239984) - var4;
                                  if ((var6 * var6 + var5 * var5 ^ -1) < -6411) {
                                    break L23;
                                  } else {
                                    if ((dj.field_e.field_H.a(var4, this.f(237239984), var3, this.a(true), 114) ^ -1) != 0) {
                                      this.field_X = var4;
                                      this.field_Y = var3;
                                      this.c(0, 114688);
                                      break L20;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                this.j((byte) 82);
                                this.B(-128);
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                      }
                      this.field_wb = null;
                      this.j((byte) 82);
                      this.B(-118);
                      break L20;
                    }
                    this.g((byte) 44);
                    this.A(-88);
                    break L7;
                  } else {
                    if ((this.field_F ^ -1) == -9) {
                      L24: {
                        L25: {
                          this.field_ob = false;
                          if (-1 == (this.field_G ^ -1)) {
                            break L25;
                          } else {
                            if (2 != this.field_G) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        if (0 != this.field_N) {
                          break L24;
                        } else {
                          L26: {
                            var3 = 0;
                            if (0 == pb.a(so.field_a, 3, 1)) {
                              if (this.field_wb.t(10)) {
                                var3 = 40 - -pb.a(so.field_a, 4, 1);
                                break L26;
                              } else {
                                var3 = 37 + pb.a(so.field_a, 3, 1);
                                break L26;
                              }
                            } else {
                              var3 = pb.a(so.field_a, 5, 1) + 30;
                              break L26;
                            }
                          }
                          this.field_U = tp.b((byte) 71, var3);
                          break L24;
                        }
                      }
                      fieldTemp$14 = this.field_zb - 1;
                      this.field_zb = this.field_zb - 1;
                      if (0 >= fieldTemp$14) {
                        L27: {
                          this.field_wb.o(-6253);
                          stackOut_115_0 = dj.field_e;
                          stackOut_115_1 = this.field_fb;
                          stackOut_115_2 = this.field_wb;
                          stackOut_115_3 = 60;
                          stackOut_115_4 = this.field_tb;
                          stackIn_117_0 = stackOut_115_0;
                          stackIn_117_1 = stackOut_115_1;
                          stackIn_117_2 = stackOut_115_2;
                          stackIn_117_3 = stackOut_115_3;
                          stackIn_117_4 = stackOut_115_4;
                          stackIn_116_0 = stackOut_115_0;
                          stackIn_116_1 = stackOut_115_1;
                          stackIn_116_2 = stackOut_115_2;
                          stackIn_116_3 = stackOut_115_3;
                          stackIn_116_4 = stackOut_115_4;
                          if (null == this.field_yb) {
                            stackOut_117_0 = (hi) ((Object) stackIn_117_0);
                            stackOut_117_1 = stackIn_117_1;
                            stackOut_117_2 = (ah) ((Object) stackIn_117_2);
                            stackOut_117_3 = stackIn_117_3;
                            stackOut_117_4 = stackIn_117_4;
                            stackOut_117_5 = null;
                            stackIn_118_0 = stackOut_117_0;
                            stackIn_118_1 = stackOut_117_1;
                            stackIn_118_2 = stackOut_117_2;
                            stackIn_118_3 = stackOut_117_3;
                            stackIn_118_4 = stackOut_117_4;
                            stackIn_118_5 = (kk) ((Object) stackOut_117_5);
                            break L27;
                          } else {
                            stackOut_116_0 = (hi) ((Object) stackIn_116_0);
                            stackOut_116_1 = stackIn_116_1;
                            stackOut_116_2 = (ah) ((Object) stackIn_116_2);
                            stackOut_116_3 = stackIn_116_3;
                            stackOut_116_4 = stackIn_116_4;
                            stackOut_116_5 = this.field_lb;
                            stackIn_118_0 = stackOut_116_0;
                            stackIn_118_1 = stackOut_116_1;
                            stackIn_118_2 = stackOut_116_2;
                            stackIn_118_3 = stackOut_116_3;
                            stackIn_118_4 = stackOut_116_4;
                            stackIn_118_5 = stackOut_116_5;
                            break L27;
                          }
                        }
                        ((hi) (Object) stackIn_118_0).a(stackIn_118_1, stackIn_118_2, (byte) stackIn_118_3, stackIn_118_4, stackIn_118_5);
                        this.field_wb = null;
                        this.e(4, -6904);
                        if (null == this.field_lb) {
                          break L7;
                        } else {
                          this.a(dj.field_e.field_H.a(true, this.a(true), this.field_lb.field_h, this.field_lb.field_l, this.f(237239984)), true);
                          break L7;
                        }
                      } else {
                        if (-31 == (this.field_zb ^ -1)) {
                          dj.field_e.a(this.field_wb.f(237239984), false, 118, this.field_wb.a(true));
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      if ((this.field_F ^ -1) != -10) {
                        if (this.field_F == 12) {
                          L28: {
                            this.field_ob = false;
                            this.g((byte) 23);
                            if (dj.field_e.field_H.a(false, this.f(237239984), this.a(true), true)) {
                              stackOut_86_0 = 0;
                              stackIn_87_0 = stackOut_86_0;
                              break L28;
                            } else {
                              stackOut_85_0 = 1;
                              stackIn_87_0 = stackOut_85_0;
                              break L28;
                            }
                          }
                          L29: {
                            var3 = stackIn_87_0;
                            if (var3 != 0) {
                              L30: {
                                this.field_y = this.field_y - this.field_O;
                                var3 = 0;
                                this.field_x = this.field_x - this.field_T;
                                if (-1 == (this.field_O ^ -1)) {
                                  break L30;
                                } else {
                                  if (!dj.field_e.field_H.a(false, this.f(237239984), this.field_y + this.field_O >> 289721104, true)) {
                                    break L30;
                                  } else {
                                    this.field_T = 0;
                                    this.field_X = this.field_x >> -2094546096;
                                    this.field_y = this.field_y + this.field_O;
                                    break L29;
                                  }
                                }
                              }
                              L31: {
                                if (0 == this.field_T) {
                                  break L31;
                                } else {
                                  if (dj.field_e.field_H.a(false, this.field_T + this.field_x >> 1725909872, this.field_y >> -126292304, true)) {
                                    this.field_Y = this.field_y >> -1002347120;
                                    this.field_x = this.field_x + this.field_T;
                                    this.field_O = 0;
                                    break L29;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              var3 = 1;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L32: {
                            if (var3 != 0) {
                              break L32;
                            } else {
                              if (!this.h((byte) -11)) {
                                break L7;
                              } else {
                                break L32;
                              }
                            }
                          }
                          this.j((byte) 82);
                          this.B(27);
                          break L7;
                        } else {
                          if ((this.field_F ^ -1) == -14) {
                            L33: {
                              if (this.field_ob) {
                                this.field_G = 2;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            if (2 == this.field_G) {
                              this.field_G = 0;
                              this.field_ob = false;
                              discarded$15 = dj.field_e.b(0, this.f(237239984), true, this.a(true));
                              this.e(4, -6904);
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            if (14 == this.field_F) {
                              this.field_ob = false;
                              this.field_S = 1;
                              if (-5 == (this.field_G ^ -1)) {
                                dj.field_e.field_R.a(0, new vb(this.a(true), this.f(237239984), this.field_t));
                                this.e(4, -6904);
                                this.field_db = 2;
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              if (this.field_F == 15) {
                                if ((this.field_G ^ -1) != -5) {
                                  break L7;
                                } else {
                                  L34: {
                                    this.field_N = this.field_N - 1;
                                    this.field_ob = false;
                                    if (null != this.field_rb) {
                                      if (this.field_rb.field_m != this.a(true)) {
                                        this.field_rb.field_m = this.a(true);
                                        this.field_rb.field_q = this.f(237239984);
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    } else {
                                      this.field_rb = new nc(this.a(true), -30 + this.f(237239984));
                                      dj.field_e.field_e.a(0, this.field_rb);
                                      break L34;
                                    }
                                  }
                                  if (!this.field_rb.c(123)) {
                                    break L7;
                                  } else {
                                    this.field_rb.b(-27598);
                                    this.field_rb = null;
                                    this.e(4, -6904);
                                    break L7;
                                  }
                                }
                              } else {
                                if (17 == this.field_F) {
                                  L35: {
                                    if (this.field_G != 3) {
                                      break L35;
                                    } else {
                                      if (this.field_N != 0) {
                                        break L35;
                                      } else {
                                        dj.field_e.c(this.a(true), 54, this.f(237239984));
                                        break L35;
                                      }
                                    }
                                  }
                                  if (-8 != (this.field_G ^ -1)) {
                                    break L7;
                                  } else {
                                    dj.field_e.a((kd) (this), true);
                                    break L7;
                                  }
                                } else {
                                  if (-20 != (this.field_F ^ -1)) {
                                    break L7;
                                  } else {
                                    if (5 != this.field_G) {
                                      break L7;
                                    } else {
                                      this.field_ob = true;
                                      this.l((byte) -121);
                                      this.e(4, -6904);
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L36: {
                          if ((this.field_Gb ^ -1) != -1) {
                            this.field_y = this.field_y + (this.field_Gb << 1356554800);
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        if (this.field_G != 5) {
                          break L7;
                        } else {
                          dj.field_e.a(this.f(237239984), this.field_eb, 111, this.a(true));
                          dj.field_e.a((kd) (this), true);
                          if (this.field_rb != null) {
                            this.field_rb.c((byte) -64);
                            this.field_rb.b(-27598);
                            this.field_rb = null;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            L37: {
              if (!this.field_ob) {
                break L37;
              } else {
                if (this.field_G < 2) {
                  this.field_N = this.field_N + 3;
                  break L37;
                } else {
                  break L37;
                }
              }
            }
            L38: {
              if (0 < this.field_db) {
                this.field_db = this.field_db - 1;
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (this.field_Eb <= 0) {
                break L39;
              } else {
                this.field_Eb = this.field_Eb - 1;
                break L39;
              }
            }
            L40: {
              L41: {
                if ((this.field_db ^ -1) == -2) {
                  break L41;
                } else {
                  L42: {
                    if (this.field_W <= 4) {
                      break L42;
                    } else {
                      if (this.field_ob) {
                        break L42;
                      } else {
                        break L41;
                      }
                    }
                  }
                  if ((this.field_db ^ -1) != -1) {
                    break L40;
                  } else {
                    this.field_db = 60 - -pb.a(so.field_a, 60, 1);
                    break L40;
                  }
                }
              }
              var3 = this.a(true) - (-pb.a(so.field_a, 48, 1) - -24);
              var4 = this.f(237239984) + (pb.a(so.field_a, 48, 1) - 24);
              if (dj.field_e.field_H.a(false, var4, var3, true)) {
                this.a(var4, var3, false);
                break L40;
              } else {
                this.field_db = this.field_db + 1;
                break L40;
              }
            }
            this.A(-108);
            break L7;
          }
        }
    }

    final boolean p(int param0) {
        if (this.n((byte) 25)) {
            return false;
        }
        this.e(13, -6904);
        if (param0 != 11312) {
            this.field_ub = -65;
            return true;
        }
        return true;
    }

    static {
        field_Db = -1;
        field_Fb = new vn[10][];
        field_nb = new int[10];
    }
}
