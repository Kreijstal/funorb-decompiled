/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    wo[] field_l;
    int field_c;
    private boolean field_B;
    static String field_o;
    private boolean field_b;
    int field_t;
    static int field_p;
    int field_h;
    int field_f;
    int field_e;
    bh field_r;
    int field_j;
    int field_d;
    static String field_A;
    private int field_y;
    int field_u;
    static int field_k;
    private bh field_n;
    static ne field_m;
    String[] field_w;
    int field_i;
    boolean field_a;
    private int field_s;
    int field_z;
    private int field_v;
    private int field_x;
    int field_g;
    int field_q;

    final int b(int param0) {
        if (param0 != -6133) {
            this.a(9, 18);
        }
        return 53188834 ^ this.field_s;
    }

    final void a(int param0, boolean param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        wo var5_ref_wo = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        bh stackIn_26_0 = null;
        bh stackIn_27_0 = null;
        bh stackIn_28_0 = null;
        bh stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        bh stackOut_25_0 = null;
        bh stackOut_26_0 = null;
        bh stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        bh stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          var3 = this.b(-6133);
          if (param0 == 30113) {
            break L0;
          } else {
            discarded$1 = this.b((byte) 31);
            break L0;
          }
        }
        L1: {
          if (param1) {
            break L1;
          } else {
            var3++;
            this.a(var3, 53188834);
            break L1;
          }
        }
        if (this.c(param0 + -33430)) {
          return;
        } else {
          var4 = this.field_l.length - 1;
          L2: while (true) {
            if (-1 < (var4 ^ -1)) {
              L3: {
                if (this.field_B) {
                  break L3;
                } else {
                  if (-3 == (this.field_j ^ -1)) {
                    break L3;
                  } else {
                    if (0 != this.field_j) {
                      break L3;
                    } else {
                      if (var3 >= t.field_l) {
                        L4: {
                          var4 = df.field_k;
                          var8 = var3;
                          var9 = rg.field_f % 4;
                          var10 = 4 * (var8 + -t.field_l);
                          if (-1 == (var9 ^ -1)) {
                            var11 = var10 / 2;
                            f.field_B = f.field_B + var11;
                            hj.field_c = hj.field_c + (var10 - var11);
                            break L4;
                          } else {
                            if (-2 == (var9 ^ -1)) {
                              var11 = var10 / 3;
                              f.field_B = f.field_B + (var10 + -var11);
                              hj.field_c = hj.field_c + var11;
                              break L4;
                            } else {
                              if (2 == var9) {
                                f.field_B = f.field_B + var10;
                                break L4;
                              } else {
                                if (var9 == 3) {
                                  hj.field_c = hj.field_c + var10;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        t.field_l = var8;
                        var5 = f.field_B;
                        var6 = hj.field_c;
                        var7 = ca.field_g;
                        oh.field_D.a(new ub(this.field_j, var3, var4, var5, var6, var7), false);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                L6: {
                  this.field_r.a((byte) -31, var3, kn.field_h[this.field_j][var3]);
                  stackOut_25_0 = this.field_r;
                  stackIn_28_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (-1 != (this.field_j ^ -1)) {
                    break L6;
                  } else {
                    stackOut_26_0 = (bh) ((Object) stackIn_26_0);
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (-50 != (var3 ^ -1)) {
                      break L6;
                    } else {
                      stackOut_27_0 = (bh) ((Object) stackIn_27_0);
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L5;
                    }
                  }
                }
                stackOut_28_0 = (bh) ((Object) stackIn_28_0);
                stackOut_28_1 = 0;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                break L5;
              }
              L7: {
                stackIn_29_0.field_m = stackIn_29_1 != 0;
                if (null == this.field_n) {
                  this.field_n = this.c((byte) -116);
                  break L7;
                } else {
                  break L7;
                }
              }
              this.field_n.a(false, this.field_r);
              return;
            } else {
              var5_ref_wo = this.field_l[var4];
              var5_ref_wo.d(false);
              var4--;
              continue L2;
            }
          }
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -3317) {
          L0: {
            L1: {
              if (this.b(param0 ^ 6912) >= kn.field_h[this.field_j].length) {
                break L1;
              } else {
                L2: {
                  if (this.field_j == 0) {
                    break L2;
                  } else {
                    if (this.field_c > this.field_v) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void a(mi param0, byte param1) {
        try {
            this.field_r.a(param0, 0);
            if (param1 <= 66) {
                this.field_r = (bh) null;
            }
            this.field_r.i(-10);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "lj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        if (param0 > -9) {
            return -5;
        }
        if (-1 == (this.field_y ^ -1)) {
            return this.field_l[0].g((byte) 121);
        }
        if (this.field_y == 1) {
            return this.field_l[1].g((byte) 121);
        }
        return 0;
    }

    final static void a(byte param0) {
        e.a(12899, hb.field_D, ji.field_s, ee.field_b, ua.field_c);
        if (param0 >= -114) {
            lj.d(80);
        }
    }

    final int b(byte param0) {
        if (param0 <= 105) {
            this.field_i = -107;
        }
        return this.field_x;
    }

    final void a(byte param0, int param1) {
        this.field_x = param1;
        int var3 = 15 % ((78 - param0) / 35);
        this.field_a = true;
    }

    final void e(int param0) {
        if (!((this.field_j ^ -1) == param0)) {
            return;
        }
        this.field_b = true;
    }

    public static void d(int param0) {
        field_o = null;
        if (param0 != 1) {
            return;
        }
        field_m = null;
        field_A = null;
    }

    private final void a(int param0, int param1) {
        this.field_s = param0 ^ param1;
    }

    final void a(int[] param0, int param1, boolean[] param2) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_r == null) {
                  break L2;
                } else {
                  if (this.field_r.field_w != 1) {
                    break L2;
                  } else {
                    if (!this.field_r.field_f[0].f((byte) 39)) {
                      break L2;
                    } else {
                      if (!this.field_r.field_f[1].f((byte) 97)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_q = this.field_q + 1;
              break L1;
            }
            if (!this.field_a) {
              L3: {
                if (0 >= this.field_r.field_p) {
                  break L3;
                } else {
                  if (-1 != (this.field_y ^ -1)) {
                    break L3;
                  } else {
                    this.field_h = this.field_h + this.field_r.field_p;
                    this.field_r.field_p = 0;
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 <= (this.field_r.field_d ^ -1)) {
                  break L4;
                } else {
                  if (-2 == (this.field_y ^ -1)) {
                    this.field_h = this.field_h + this.field_r.field_d;
                    this.field_r.field_d = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (0 != this.field_j) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L5;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var4_int = stackIn_19_0;
                  stackOut_19_0 = this;
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (this.field_b) {
                    break L7;
                  } else {
                    stackOut_20_0 = this;
                    stackIn_23_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (this.field_r.a(true, param2, 128, param0, var4_int == 0)) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L6;
                    } else {
                      stackOut_21_0 = this;
                      stackIn_22_0 = stackOut_21_0;
                      break L7;
                    }
                  }
                }
                stackOut_22_0 = this;
                stackOut_22_1 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                break L6;
              }
              L8: {
                ((lj) (this)).field_b = stackIn_24_1 != 0;
                if (this.field_b) {
                  var5 = 0;
                  L9: while (true) {
                    if (this.field_l.length <= var5) {
                      L10: {
                        this.field_r.a(false, this.field_n);
                        if (-3 == (this.field_j ^ -1)) {
                          break L10;
                        } else {
                          if ((this.field_j ^ -1) != -4) {
                            var5 = 0;
                            L11: while (true) {
                              if (this.field_l.length <= var5) {
                                break L10;
                              } else {
                                discarded$1 = this.b(-6133);
                                var5++;
                                continue L11;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      this.field_b = false;
                      break L8;
                    } else {
                      if ((this.field_j ^ -1) != -3) {
                        L12: {
                          if (this.field_j != 3) {
                            this.field_n.field_f[var5].a(true, -1 + this.field_l[var5].l(param1 ^ -32748));
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var5++;
                        continue L9;
                      } else {
                        var5++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              L13: {
                if (this.field_j != 3) {
                  break L13;
                } else {
                  if (!this.field_r.f(17940)) {
                    break L13;
                  } else {
                    L14: {
                      var5 = ln.field_d.field_s % 3;
                      if (var5 == 0) {
                        field_k = field_k + 1;
                        break L14;
                      } else {
                        mc.field_e = mc.field_e + 1;
                        break L14;
                      }
                    }
                    this.field_l[0].field_H = this.field_l[0].field_H + 1;
                    break L13;
                  }
                }
              }
              var5 = 0;
              L15: while (true) {
                L16: {
                  if (this.field_l.length <= var5) {
                    break L16;
                  } else {
                    if (!this.field_l[var5].a(false)) {
                      var5++;
                      continue L15;
                    } else {
                      this.field_n.a(false, this.field_r);
                      var6 = 0;
                      L17: while (true) {
                        if (var6 >= this.field_n.field_f.length) {
                          break L16;
                        } else {
                          this.field_n.field_f[var6].field_c = 0;
                          this.field_n.field_f[var6].field_O = 0;
                          var6++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
                L18: {
                  var5 = this.field_r.d((byte) -114);
                  if (-2 != var5) {
                    L19: {
                      if (var5 == 0) {
                        this.field_f = this.field_f + 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (1 != var5) {
                        break L20;
                      } else {
                        this.field_g = this.field_g + 1;
                        break L20;
                      }
                    }
                    L21: {
                      this.field_v = this.field_v + 1;
                      if (-1 == var5) {
                        break L21;
                      } else {
                        if (-3 != (this.field_j ^ -1)) {
                          break L21;
                        } else {
                          if (!this.field_B) {
                            break L21;
                          } else {
                            if (!on.a((byte) -121, 0)) {
                              break L21;
                            } else {
                              if (this.field_l[var5].k((byte) 72)) {
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                      }
                    }
                    L22: {
                      if (this.c(-3317)) {
                        L23: {
                          var6 = -1;
                          if (this.field_j == 2) {
                            L24: {
                              if (this.field_g < this.field_f) {
                                stackOut_75_0 = 0;
                                stackIn_76_0 = stackOut_75_0;
                                break L24;
                              } else {
                                if (this.field_f >= this.field_g) {
                                  stackOut_74_0 = -1;
                                  stackIn_76_0 = stackOut_74_0;
                                  break L24;
                                } else {
                                  stackOut_73_0 = 1;
                                  stackIn_76_0 = stackOut_73_0;
                                  break L24;
                                }
                              }
                            }
                            var6 = stackIn_76_0;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L25: {
                          if (this.field_u == 3) {
                            break L25;
                          } else {
                            if (0 != this.field_u) {
                              var6 = -this.field_u + 2;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (this.field_j == 1) {
                            var6 = 0;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        this.a((byte) 114, var6);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if ((this.field_j ^ -1) == -4) {
                      dh.a(this.field_e, this.field_l[0].field_H, true);
                      gj.a((byte) 91, false, am.field_n, 20);
                      break L18;
                    } else {
                      this.a(param1 + 30093, false);
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                L27: {
                  if (param1 == 20) {
                    break L27;
                  } else {
                    this.field_f = -75;
                    break L27;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var4 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) (var4);
            stackOut_91_1 = new StringBuilder().append("lj.A(");
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param0 == null) {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L28;
            } else {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L28;
            }
          }
          L29: {
            stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
            stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(',').append(param1).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param2 == null) {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L29;
            } else {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L29;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (param1) {
            return 127;
        }
        int var3 = param0 >>> -1798389089;
        return (var3 + param0) / param2 - var3;
    }

    final bh c(byte param0) {
        int var3_int = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        wo[] var5 = new wo[this.field_l.length];
        wo[] var2 = var5;
        if (param0 != -116) {
            return (bh) null;
        }
        for (var3_int = 0; var3_int < this.field_l.length; var3_int++) {
            var5[var3_int] = new wo(this.field_l[var3_int].field_l, this.field_B, var3_int, 1 < this.field_l.length ? true : false, -3 == (this.field_j ^ -1) ? true : false, true);
        }
        bh var3 = new bh(this.field_j, var2, this.field_B, false);
        var3.a(false, this.field_r);
        return var3;
    }

    lj(String[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wo[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        wo stackIn_7_2 = null;
        wo stackIn_7_3 = null;
        wo[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        wo stackIn_8_2 = null;
        wo stackIn_8_3 = null;
        wo[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wo stackIn_9_2 = null;
        wo stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        wo[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        wo stackIn_10_2 = null;
        wo stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        boolean stackIn_10_5 = false;
        int stackIn_10_6 = 0;
        wo[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wo stackIn_11_2 = null;
        wo stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        boolean stackIn_11_5 = false;
        int stackIn_11_6 = 0;
        wo[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wo stackIn_12_2 = null;
        wo stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        boolean stackIn_12_5 = false;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        wo[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        wo stackIn_13_2 = null;
        wo stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        boolean stackIn_13_5 = false;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        wo[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wo stackIn_14_2 = null;
        wo stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        boolean stackIn_14_5 = false;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        wo[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wo stackIn_15_2 = null;
        wo stackIn_15_3 = null;
        int stackIn_15_4 = 0;
        boolean stackIn_15_5 = false;
        int stackIn_15_6 = 0;
        int stackIn_15_7 = 0;
        int stackIn_15_8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        wo[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        wo stackOut_6_2 = null;
        wo stackOut_6_3 = null;
        wo[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        wo stackOut_8_2 = null;
        wo stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        wo[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wo stackOut_7_2 = null;
        wo stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        wo[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        wo stackOut_9_2 = null;
        wo stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        boolean stackOut_9_5 = false;
        int stackOut_9_6 = 0;
        wo[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        wo stackOut_11_2 = null;
        wo stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        boolean stackOut_11_5 = false;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        wo[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wo stackOut_10_2 = null;
        wo stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        boolean stackOut_10_5 = false;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        wo[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        wo stackOut_12_2 = null;
        wo stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        boolean stackOut_12_5 = false;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        wo[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        wo stackOut_14_2 = null;
        wo stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        boolean stackOut_14_5 = false;
        int stackOut_14_6 = 0;
        int stackOut_14_7 = 0;
        int stackOut_14_8 = 0;
        wo[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        wo stackOut_13_2 = null;
        wo stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        boolean stackOut_13_5 = false;
        int stackOut_13_6 = 0;
        int stackOut_13_7 = 0;
        int stackOut_13_8 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        this.field_x = -2;
        try {
          L0: {
            L1: {
              this.field_y = param1;
              this.field_z = param0.length;
              this.field_w = param0;
              this.a(param4, 53188834);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param6) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((lj) (this)).field_B = stackIn_4_1 != 0;
            this.field_c = param5;
            this.field_j = param2;
            this.field_i = 4012 ^ param3;
            this.field_l = new wo[this.field_z];
            this.field_e = param3;
            var9_int = 0;
            L2: while (true) {
              if (var9_int >= this.field_z) {
                oo.field_i = false;
                this.field_r = new bh(this.field_j, this.field_l, this.field_B, param7);
                this.a(30113, true);
                break L0;
              } else {
                L3: {
                  stackOut_6_0 = this.field_l;
                  stackOut_6_1 = var9_int;
                  stackOut_6_2 = null;
                  stackOut_6_3 = null;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  if (-1 != (b.a(1, var9_int) ^ -1)) {
                    stackOut_8_0 = (wo[]) ((Object) stackIn_8_0);
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = null;
                    stackOut_8_3 = null;
                    stackOut_8_4 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    stackIn_9_4 = stackOut_8_4;
                    break L3;
                  } else {
                    stackOut_7_0 = (wo[]) ((Object) stackIn_7_0);
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = null;
                    stackOut_7_3 = null;
                    stackOut_7_4 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    break L3;
                  }
                }
                L4: {
                  stackOut_9_0 = (wo[]) ((Object) stackIn_9_0);
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = null;
                  stackOut_9_3 = null;
                  stackOut_9_4 = stackIn_9_4;
                  stackOut_9_5 = this.field_B;
                  stackOut_9_6 = var9_int;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_11_4 = stackOut_9_4;
                  stackIn_11_5 = stackOut_9_5;
                  stackIn_11_6 = stackOut_9_6;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  stackIn_10_4 = stackOut_9_4;
                  stackIn_10_5 = stackOut_9_5;
                  stackIn_10_6 = stackOut_9_6;
                  if (this.field_l.length <= 1) {
                    stackOut_11_0 = (wo[]) ((Object) stackIn_11_0);
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackOut_11_4 = stackIn_11_4;
                    stackOut_11_5 = stackIn_11_5;
                    stackOut_11_6 = stackIn_11_6;
                    stackOut_11_7 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    stackIn_12_5 = stackOut_11_5;
                    stackIn_12_6 = stackOut_11_6;
                    stackIn_12_7 = stackOut_11_7;
                    break L4;
                  } else {
                    stackOut_10_0 = (wo[]) ((Object) stackIn_10_0);
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = stackIn_10_4;
                    stackOut_10_5 = stackIn_10_5;
                    stackOut_10_6 = stackIn_10_6;
                    stackOut_10_7 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_12_6 = stackOut_10_6;
                    stackIn_12_7 = stackOut_10_7;
                    break L4;
                  }
                }
                L5: {
                  stackOut_12_0 = (wo[]) ((Object) stackIn_12_0);
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = null;
                  stackOut_12_3 = null;
                  stackOut_12_4 = stackIn_12_4;
                  stackOut_12_5 = stackIn_12_5;
                  stackOut_12_6 = stackIn_12_6;
                  stackOut_12_7 = stackIn_12_7;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  stackIn_14_3 = stackOut_12_3;
                  stackIn_14_4 = stackOut_12_4;
                  stackIn_14_5 = stackOut_12_5;
                  stackIn_14_6 = stackOut_12_6;
                  stackIn_14_7 = stackOut_12_7;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  stackIn_13_4 = stackOut_12_4;
                  stackIn_13_5 = stackOut_12_5;
                  stackIn_13_6 = stackOut_12_6;
                  stackIn_13_7 = stackOut_12_7;
                  if (2 != this.field_j) {
                    stackOut_14_0 = (wo[]) ((Object) stackIn_14_0);
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = null;
                    stackOut_14_3 = null;
                    stackOut_14_4 = stackIn_14_4;
                    stackOut_14_5 = stackIn_14_5;
                    stackOut_14_6 = stackIn_14_6;
                    stackOut_14_7 = stackIn_14_7;
                    stackOut_14_8 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    stackIn_15_4 = stackOut_14_4;
                    stackIn_15_5 = stackOut_14_5;
                    stackIn_15_6 = stackOut_14_6;
                    stackIn_15_7 = stackOut_14_7;
                    stackIn_15_8 = stackOut_14_8;
                    break L5;
                  } else {
                    stackOut_13_0 = (wo[]) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = null;
                    stackOut_13_3 = null;
                    stackOut_13_4 = stackIn_13_4;
                    stackOut_13_5 = stackIn_13_5;
                    stackOut_13_6 = stackIn_13_6;
                    stackOut_13_7 = stackIn_13_7;
                    stackOut_13_8 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_15_5 = stackOut_13_5;
                    stackIn_15_6 = stackOut_13_6;
                    stackIn_15_7 = stackOut_13_7;
                    stackIn_15_8 = stackOut_13_8;
                    break L5;
                  }
                }
                stackIn_15_0[stackIn_15_1] = new wo(stackIn_15_4, stackIn_15_5, stackIn_15_6, stackIn_15_7 != 0, stackIn_15_8 != 0, false);
                var9_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var9);
            stackOut_18_1 = new StringBuilder().append("lj.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_o = "Find opponent";
        field_A = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
