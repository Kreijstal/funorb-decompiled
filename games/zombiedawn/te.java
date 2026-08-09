/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends id {
    static wj field_kb;
    private int[] field_Y;
    private int field_ib;
    static int field_eb;
    static int field_db;
    private int field_U;
    static int field_bb;
    private int field_cb;
    static String field_R;
    private int[] field_W;
    static String[] field_Q;
    private int field_fb;
    private int field_Z;
    private int[] field_jb;
    private int field_ab;
    private int field_gb;
    static String field_S;
    private g field_hb;
    private int[] field_V;
    private int[] field_X;
    private int field_H;
    static int[] field_T;

    public static void f(byte param0) {
        if (param0 != 105) {
            return;
        }
        field_Q = null;
        field_kb = null;
        field_T = null;
        field_S = null;
        field_R = null;
    }

    final void a(byte param0, wk param1) {
        wk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        wk stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_28_2;
        int stackIn_28_3;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_29_4;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vn var9_ref_vn = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vn var13 = null;
        int var14 = 0;
        String var15 = null;
        vn var16 = null;
        vn var17 = null;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param1.a(this.a(true), (byte) -125);
              var4 = param1.a(this.f(237239984), 0);
              var5 = param1.a(this.field_Z, (byte) -123);
              var6 = param1.a(this.field_gb, 0);
              var7 = -1;
              var8 = 0;
              if (this.field_hb == null) {
                break L1;
              } else {
                L2: {
                  stackIn_4_0 = (wk) (param1);

                  stackIn_4_1 = this.field_hb.a(true);

                  if (this.field_P) {
                    stackIn_5_0 = (wk) ((Object) stackIn_4_0);
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = 17;
                    break L2;
                  } else {
                    stackIn_5_0 = (wk) ((Object) stackIn_4_0);
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = 77;
                    break L2;
                  }
                }
                var3_int = ((wk) (Object) stackIn_5_0).a(stackIn_5_1 + -stackIn_5_2, (byte) -59);
                var4 = param1.a(-40 + this.field_hb.f(237239984), 0);
                break L1;
              }
            }
            L3: {
              var9 = this.field_fb;
              if (var9 == 0) {
                break L3;
              } else {
                if ((var9 ^ -1) == -5) {
                  break L3;
                } else {
                  if (-2 == (var9 ^ -1)) {
                    var7 = 0;
                    break L3;
                  } else {
                    if (-3 != (var9 ^ -1)) {
                      if (-4 != (var9 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (null == this.field_hb) {
                            break L4;
                          } else {
                            if (!(this.field_hb instanceof ah)) {
                              break L4;
                            } else {
                              var7 = 2;
                              break L3;
                            }
                          }
                        }
                        var7 = 0;
                        break L3;
                      }
                    } else {
                      var7 = 1;
                      break L3;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 < -76) {
                break L5;
              } else {
                var15 = (String) null;
                te.a((String) null, -53, 120);
                break L5;
              }
            }
            L6: {
              if (this.field_fb == 0) {
                break L6;
              } else {
                if (dk.field_Tb[this.field_ab].length <= this.field_H) {
                  break L6;
                } else {
                  L7: {
                    stackIn_25_0 = var6 + -256;

                    stackIn_25_1 = 99;

                    stackIn_25_2 = var5;

                    if (!this.field_P) {
                      stackIn_26_0 = stackIn_25_0;
                      stackIn_26_1 = stackIn_25_1;
                      stackIn_26_2 = stackIn_25_2;
                      stackIn_26_3 = this.field_cb - -99;
                      break L7;
                    } else {
                      stackIn_26_0 = stackIn_25_0;
                      stackIn_26_1 = stackIn_25_1;
                      stackIn_26_2 = stackIn_25_2;
                      stackIn_26_3 = 0;
                      break L7;
                    }
                  }
                  L8: {




                    stackIn_28_2 = stackIn_26_2 + stackIn_26_3;

                    stackIn_28_3 = var6 + 256;

                    if (!this.field_P) {


                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = stackIn_28_3;
                      stackIn_29_4 = 0;
                      break L8;
                    } else {


                      stackIn_29_2 = stackIn_28_2;
                      stackIn_29_3 = stackIn_28_3;
                      stackIn_29_4 = -99 + -this.field_cb;
                      break L8;
                    }
                  }
                  g.a(stackIn_26_0, (byte) stackIn_26_1, stackIn_29_2, stackIn_29_3, stackIn_29_4 + var5);
                  var9 = 0;
                  L9: while (true) {
                    if (3 <= var9) {
                      L10: {
                        if (this.field_hb == null) {
                          break L10;
                        } else {
                          if (this.field_hb.field_J) {
                            this.field_hb.field_J = false;
                            this.field_hb.a((byte) -124, param1);
                            this.field_hb.field_J = true;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if ((this.field_fb ^ -1) != -5) {
                          var7 = dk.field_Tb[this.field_ab][this.field_H][2];
                          var8 = dk.field_Tb[this.field_ab][this.field_H][1];
                          var9_ref_vn = wh.field_a[var8][var7 - 1];
                          if (!this.field_P) {
                            var9_ref_vn.b(var3_int, var4);
                            break L11;
                          } else {
                            var9_ref_vn.c(var3_int, var4);
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      var9 = 1;
                      L12: while (true) {
                        if (3 <= var9) {
                          pa.a(-21189);
                          break L6;
                        } else {
                          L13: {
                            var10 = this.field_jb[var9];
                            if (-1 != (var10 ^ -1)) {
                              var11 = this.field_X[var9];
                              if (dk.field_Tb[var10].length <= var11) {
                                break L13;
                              } else {
                                var8 = dk.field_Tb[var10][var11][1];
                                var12 = dk.field_Tb[var10][var11][2];
                                var17 = wh.field_a[var8][-1 + var12];
                                var13 = var17;
                                if (this.field_P) {
                                  var13.c(var5 + -this.field_Y[var9] - 100, this.field_W[var9] + var6);
                                  break L13;
                                } else {
                                  var17.b(this.field_Y[var9] + var5, var6 + this.field_W[var9]);
                                  break L13;
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                          var9 += 2;
                          continue L12;
                        }
                      }
                    } else {
                      L14: {
                        var10 = this.field_jb[var9];
                        if (-1 != (var10 ^ -1)) {
                          var11 = this.field_X[var9];
                          if (dk.field_Tb[var10].length > var11) {
                            var8 = dk.field_Tb[var10][var11][1];
                            var12 = dk.field_Tb[var10][var11][2];
                            var16 = wh.field_a[var8][-1 + var12];
                            var13 = var16;
                            if (this.field_P) {
                              var13.c(-100 + (var5 - this.field_Y[var9]), var6 - -this.field_W[var9]);
                              break L14;
                            } else {
                              var16.b(var5 - -this.field_Y[var9], var6 + this.field_W[var9]);
                              break L14;
                            }
                          } else {
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                      var9 += 2;
                      continue L9;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var3);

            stackIn_61_1 = new StringBuilder().append("te.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L15;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L15;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
        }
    }

    private final void c(int param0, int param1) {
        this.field_U = param0;
        this.field_H = 0;
        this.field_ab = param1;
    }

    final static eo a(String param0, int param1, int param2) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        eo stackIn_2_0 = null;
        eo stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new eo(false);
            var3.field_a = param2;
            var3.field_e = param0;
            if (param1 == -13466) {
              stackIn_4_0 = (eo) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (eo) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("te.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        g stackIn_70_0 = null;
        g stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        g stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        g stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int var2;
        int var3;
        g var3_ref_g;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[][] var12;
        L0: {
          var7 = ZombieDawn.field_J;
          var2 = 0;
          if (this.field_fb == 0) {
            break L0;
          } else {
            if ((this.field_fb ^ -1) != -5) {
              this.field_U = this.field_U + 1;
              if (2 + this.field_U <= dk.field_Tb[this.field_ab][this.field_H][0]) {
                break L0;
              } else {
                L1: {
                  this.field_H = this.field_H + 1;
                  this.field_U = 0;
                  if (this.field_H < dk.field_Tb[this.field_ab].length) {
                    stackIn_7_0 = 0;
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    break L1;
                  }
                }
                var2 = stackIn_7_0;
                if (var2 == 0) {
                  break L0;
                } else {
                  this.field_H = 0;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param0 > 95) {
          var3 = 0;
          L2: while (true) {
            if (-4 >= (var3 ^ -1)) {
              L3: {
                var3 = this.field_fb;
                if (0 == var3) {
                  var3_ref_g = (g) ((Object) this.a((byte) -74, 96, 3));
                  L4: while (true) {
                    if (var3_ref_g == null) {
                      break L3;
                    } else {
                      L5: {
                        if (var3_ref_g.field_V) {
                          break L5;
                        } else {
                          if (var3_ref_g.field_F == 9) {
                            break L5;
                          } else {
                            if (-19 != (var3_ref_g.field_F ^ -1)) {
                              var4 = this.f(237239984) - var3_ref_g.f(237239984);
                              var5 = this.a(true) + -var3_ref_g.a(true);
                              if ((var4 ^ -1) >= -1) {
                                break L5;
                              } else {
                                if ((var4 ^ -1) > -59) {
                                  L6: {
                                    if (this.field_P) {
                                      if (-77 > (var5 ^ -1)) {
                                        break L5;
                                      } else {
                                        if (18 <= var5) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    } else {
                                      if (-85 > var5) {
                                        break L5;
                                      } else {
                                        if (25 <= (var5 ^ -1)) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  L7: {
                                    this.field_gb = var3_ref_g.f(237239984) - 60;
                                    this.field_hb = var3_ref_g;
                                    this.field_hb.j(81);
                                    this.field_fb = 1;
                                    this.field_cb = Math.abs(var5);
                                    kh.a(126, false);
                                    stackIn_54_0 = this;

                                    stackIn_54_1 = 0;

                                    if (!(this.field_hb instanceof kd)) {
                                      stackIn_55_0 = this;
                                      stackIn_55_1 = stackIn_54_1;
                                      stackIn_55_2 = 1;
                                      break L7;
                                    } else {
                                      stackIn_55_0 = this;
                                      stackIn_55_1 = stackIn_54_1;
                                      stackIn_55_2 = 0;
                                      break L7;
                                    }
                                  }
                                  this.c(stackIn_55_1, stackIn_55_2);
                                  var8 = 0;
                                  var6 = var8;
                                  L8: while (true) {
                                    if ((var8 ^ -1) <= -4) {
                                      break L3;
                                    } else {
                                      if (-1 == (this.field_jb[var8] ^ -1)) {
                                        L9: {
                                          this.field_jb[var8] = 6;
                                          this.field_Y[var8] = -so.c(30) + -50;
                                          this.field_W[var8] = so.c(6);
                                          if (-1 != (var8 % 2 ^ -1)) {
                                            break L9;
                                          } else {
                                            this.field_W[var8] = -this.field_W[var8];
                                            break L9;
                                          }
                                        }
                                        this.field_W[var8] = this.field_W[var8] + 10;
                                        this.field_X[var8] = so.c(10);
                                        this.field_V[var8] = so.c(10);
                                        var8++;
                                        continue L8;
                                      } else {
                                        var8++;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  var3_ref_g = (g) ((Object) this.e((byte) 32));
                                  continue L4;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var3_ref_g = (g) ((Object) this.e((byte) 32));
                      continue L4;
                    }
                  }
                } else {
                  if (1 == var3) {
                    if (var2 == 0) {
                      break L3;
                    } else {
                      L10: {
                        stackIn_67_0 = this;

                        stackIn_67_1 = 0;

                        if (!(this.field_hb instanceof kd)) {
                          stackIn_68_0 = this;
                          stackIn_68_1 = stackIn_67_1;
                          stackIn_68_2 = 3;
                          break L10;
                        } else {
                          stackIn_68_0 = this;
                          stackIn_68_1 = stackIn_67_1;
                          stackIn_68_2 = 2;
                          break L10;
                        }
                      }
                      L11: {
                        this.c(stackIn_68_1, stackIn_68_2);
                        this.field_hb.f((byte) -85);
                        stackIn_70_0 = this.field_hb;

                        if (!(this.field_hb instanceof ah ^ this.field_P)) {
                          stackIn_71_0 = (g) ((Object) stackIn_70_0);
                          stackIn_71_1 = 1;
                          break L11;
                        } else {
                          stackIn_71_0 = (g) ((Object) stackIn_70_0);
                          stackIn_71_1 = 3;
                          break L11;
                        }
                      }
                      stackIn_71_0.field_S = stackIn_71_1;
                      this.field_fb = 2;
                      kh.a(124, false);
                      break L3;
                    }
                  } else {
                    if ((var3 ^ -1) != -3) {
                      if (-4 == (var3 ^ -1)) {
                        var3 = 0;
                        L12: while (true) {
                          if ((var3 ^ -1) <= -4) {
                            L13: {
                              if (var2 != 0) {
                                this.field_H = 0;
                                this.field_U = 0;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (null == this.field_hb) {
                                break L14;
                              } else {
                                L15: {
                                  stackIn_89_0 = this.field_hb;

                                  stackIn_89_1 = this.field_hb.field_y;

                                  if (!this.field_P) {
                                    stackIn_90_0 = (g) ((Object) stackIn_89_0);
                                    stackIn_90_1 = stackIn_89_1;
                                    stackIn_90_2 = -2;
                                    break L15;
                                  } else {
                                    stackIn_90_0 = (g) ((Object) stackIn_89_0);
                                    stackIn_90_1 = stackIn_89_1;
                                    stackIn_90_2 = 2;
                                    break L15;
                                  }
                                }
                                stackIn_90_0.field_y = stackIn_90_1 + (stackIn_90_2 << -2107936944);
                                break L14;
                              }
                            }
                            this.field_cb = this.field_cb - 2;
                            if (this.field_cb > -24) {
                              break L3;
                            } else {
                              var3 = 0;
                              L16: while (true) {
                                if (3 <= var3) {
                                  L17: {
                                    L18: {
                                      this.field_ib = 70;
                                      this.field_hb.k(0);
                                      if (!(this.field_hb instanceof kd)) {
                                        break L18;
                                      } else {
                                        if (!((kd) ((Object) this.field_hb)).i((byte) -126)) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    stackIn_102_0 = uc.field_c;
                                    stackIn_102_1 = 1;
                                    uc.field_c = stackIn_102_0 + stackIn_102_1;
                                    break L17;
                                  }
                                  L19: {
                                    if (16 == this.field_hb.field_t) {
                                      dj.field_e.a(234, 21, (byte) -23);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (uc.field_c == 20) {
                                      dj.field_e.a(235, 20, (byte) -23);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ck.a(-10, 6836);
                                  kh.a(151, false);
                                  this.field_fb = 4;
                                  break L3;
                                } else {
                                  if ((this.field_jb[var3] ^ -1) != -9) {
                                    this.field_jb[var3] = 8;
                                    this.field_X[var3] = 0;
                                    var3++;
                                    continue L16;
                                  } else {
                                    var3++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          } else {
                            if (-1 == (this.field_X[var3] ^ -1)) {
                              this.field_jb[var3] = 8;
                              this.field_X[var3] = 0;
                              var3++;
                              continue L12;
                            } else {
                              var3++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        if (var3 == 4) {
                          fieldTemp$0 = this.field_ib - 1;
                          this.field_ib = this.field_ib - 1;
                          if (0 < fieldTemp$0) {
                            break L3;
                          } else {
                            kh.a(125, false);
                            this.field_fb = 0;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      if (var2 != 0) {
                        L21: {
                          stackIn_76_0 = this;

                          stackIn_76_1 = 0;

                          if (this.field_hb instanceof kd) {
                            stackIn_77_0 = this;
                            stackIn_77_1 = stackIn_76_1;
                            stackIn_77_2 = 4;
                            break L21;
                          } else {
                            stackIn_77_0 = this;
                            stackIn_77_1 = stackIn_76_1;
                            stackIn_77_2 = 5;
                            break L21;
                          }
                        }
                        this.c(stackIn_77_1, stackIn_77_2);
                        this.field_fb = 3;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              var4 = this.field_jb[var3];
              if (0 != var4) {
                L22: {
                  if (8 == var4) {
                    this.field_Y[var3] = this.field_Y[var3] - 1;
                    if ((this.field_Y[var3] ^ -1) >= 65) {
                      this.field_jb[var3] = 0;
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    if (6 == var4) {
                      this.field_Y[var3] = this.field_Y[var3] + 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                var12 = dk.field_Tb[var4];
                var6 = this.field_X[var3];
                dupTemp$1 = this.field_V[var3] + 1;
                this.field_V[var3] = dupTemp$1;
                if (dupTemp$1 > var12[var6][0]) {
                  this.field_V[var3] = 0;
                  dupTemp$2 = this.field_X[var3] + 1;
                  this.field_X[var3] = dupTemp$2;
                  if (dupTemp$2 >= var12.length + -1) {
                    this.field_X[var3] = 0;
                    if (-7 == (this.field_jb[var3] ^ -1)) {
                      this.field_jb[var3] = 7;
                      this.field_X[var3] = 0;
                      var3++;
                      continue L2;
                    } else {
                      var3++;
                      continue L2;
                    }
                  } else {
                    var3++;
                    continue L2;
                  }
                } else {
                  var3++;
                  continue L2;
                }
              } else {
                var3++;
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    te(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        this.field_W = new int[3];
        this.field_jb = new int[3];
        this.field_Y = new int[3];
        this.field_X = new int[3];
        this.field_V = new int[3];
        this.field_fb = 0;
        this.field_P = param3 ? true : false;
        this.field_Z = this.a(true);
        this.field_gb = -48 + this.f(237239984);
        this.field_cb = 90;
        uc.field_c = 0;
        int var5 = 0;
        this.field_jb[var5] = 7;
        this.field_Y[var5] = -50;
        this.field_W[var5] = 10;
        this.field_V[var5] = 0;
        this.field_X[var5] = 0;
    }

    static {
        field_Q = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_R = "Reload game";
        field_S = "BONUS LEVEL";
        field_db = 0;
        field_T = new int[]{171, 197, 410, 443};
    }
}
