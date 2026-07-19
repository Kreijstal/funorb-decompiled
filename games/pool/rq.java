/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends kd {
    private int[] field_u;
    private cg field_D;
    private int field_s;
    private vk field_w;
    private int field_I;
    private int field_t;
    private boolean field_A;
    static tg[] field_y;
    private vk field_z;
    static String field_r;
    private int[] field_C;
    private boolean field_G;
    private cg field_v;
    private cg field_E;
    private int field_F;
    private vk field_p;
    private static ko field_q;
    static vh field_x;
    static String[] field_H;
    static int[] field_B;

    final static void c(int param0) {
        if (param0 != 946) {
            return;
        }
        pj.field_H = new ko();
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_36_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            if ((this.field_F ^ -1) >= -1) {
              this.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_G) {
                  L2: {
                    if (0 >= this.field_s) {
                      break L2;
                    } else {
                      if (!this.field_z.d(-11414)) {
                        this.field_s = -this.field_s;
                        this.field_D = null;
                        this.field_G = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_s >= 0) {
                    break L1;
                  } else {
                    if (!this.field_w.d(-11414)) {
                      this.field_E = null;
                      this.field_s = -this.field_s;
                      this.field_G = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = this.field_F * (this.field_t >> 1725067180) / 256;
                var5 = -var4_int + this.field_F;
                if (0 != this.field_s) {
                  this.field_t = this.field_t + param2 * this.field_s;
                  if ((this.field_t ^ -1) <= -1048577) {
                    this.field_t = 1048576;
                    if (this.field_G) {
                      break L3;
                    } else {
                      this.field_s = 0;
                      if (!this.field_A) {
                        L4: {
                          if (this.field_E != null) {
                            this.field_w.e(-1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.field_E = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (0 < this.field_t) {
                      break L3;
                    } else {
                      this.field_t = 0;
                      if (!this.field_G) {
                        this.field_s = 0;
                        if (this.field_A) {
                          break L3;
                        } else {
                          L5: {
                            if (this.field_D != null) {
                              this.field_z.e(-1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_D = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (bp.field_r) {
                  stackOut_35_0 = param2 << 1182626785;
                  stackIn_36_0 = stackOut_35_0;
                  break L6;
                } else {
                  stackOut_34_0 = param2;
                  stackIn_36_0 = stackOut_34_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_36_0;
                if (this.field_I >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (null != this.field_D) {
                      break L8;
                    } else {
                      if (null == this.field_E) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (256 != var4_int) {
                    if ((var5 ^ -1) == -257) {
                      this.field_w.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (null == this.field_u) {
                            break L10;
                          } else {
                            if (this.field_u.length < var6) {
                              break L10;
                            } else {
                              qn.a(this.field_u, 0, var6);
                              qn.a(this.field_C, 0, var6);
                              break L9;
                            }
                          }
                        }
                        this.field_C = new int[var6];
                        this.field_u = new int[var6];
                        break L9;
                      }
                      L11: {
                        this.field_z.a(this.field_u, 0, param2);
                        this.field_w.a(this.field_C, 0, param2);
                        if (!bp.field_r) {
                          stackOut_49_0 = param1;
                          stackIn_50_0 = stackOut_49_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_48_0 = param1 << 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_50_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (this.field_C[var8] * var5 + var4_int * this.field_u[var8] >> -623326776);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    this.field_z.a(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (null == this.field_v) {
                  break L13;
                } else {
                  if (0 != this.field_I) {
                    L14: {
                      L15: {
                        if (null == this.field_u) {
                          break L15;
                        } else {
                          if (var6 <= this.field_u.length) {
                            qn.a(this.field_u, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_u = new int[var6];
                      this.field_C = new int[var6];
                      break L14;
                    }
                    L16: {
                      this.field_p.a(this.field_u, 0, param2);
                      if (!bp.field_r) {
                        stackOut_64_0 = param1;
                        stackIn_65_0 = stackOut_64_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_63_0 = param1 << 1;
                        stackIn_65_0 = stackOut_63_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_65_0;
                    var8 = this.field_I * this.field_F / 256;
                    var9 = this.field_F + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] - -(var8 * this.field_u[var10]) >> -1937225080;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var4);
            stackOut_69_1 = new StringBuilder().append("rq.E(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L18;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static kf a(int param0, nb param1) {
        kf var2 = null;
        RuntimeException var2_ref = null;
        kf stackIn_2_0 = null;
        kf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_3_0 = null;
        kf stackOut_1_0 = null;
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
            var2 = new kf(param1, param1);
            if (param0 >= 93) {
              mp.field_R.b((byte) -108, var2);
              wm.field_Xb.b(param1);
              stackOut_3_0 = (kf) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (kf) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("rq.K(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1) {
        ij discarded$2 = null;
        uf var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        uf stackIn_8_0 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_16_1 = null;
        uf stackOut_7_0 = null;
        uf stackOut_6_0 = null;
        StringBuilder stackOut_13_0 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_15_1 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            rq.c(-63);
            break L0;
          }
        }
        L1: {
          if (ok.field_pb.length <= param1) {
            break L1;
          } else {
            if (0L != (1L << param1 & pd.field_i)) {
              L2: {
                if (null == ba.field_ub) {
                  stackOut_7_0 = am.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ba.field_ub;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              var2 = stackIn_8_0;
              if (var2 == null) {
                break L1;
              } else {
                L3: {
                  var6 = new String(new char[]{(char)65, (char)108, (char)116, (char)32});
                  var3 = var6;
                  var4 = param1 / 10;
                  if (0 == (2 & var4)) {
                    break L3;
                  } else {
                    var3 = var6 + "Ctrl ";
                    break L3;
                  }
                }
                L4: {
                  if ((1 & var4) == 0) {
                    break L4;
                  } else {
                    var3 = var3 + "Shift ";
                    break L4;
                  }
                }
                L5: {
                  stackOut_13_0 = new StringBuilder().append(var3);
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if ((param1 % 10 ^ -1) > -10) {
                    stackOut_15_0 = (StringBuilder) ((Object) stackIn_15_0);
                    stackOut_15_1 = Integer.toString(param1 % 10 + 1);
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L5;
                  } else {
                    stackOut_14_0 = (StringBuilder) ((Object) stackIn_14_0);
                    stackOut_14_1 = "0";
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L5;
                  }
                }
                var5 = stackIn_16_1;
                var3 = stackIn_16_1;
                discarded$2 = gj.a(true, 0, var5 + ": " + ok.field_pb[param1][0], ok.field_pb[param1][1]);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_H = null;
        field_q = null;
        field_y = null;
        field_r = null;
        if (param0 < 42) {
            return;
        }
        field_B = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        wg.field_Nb[jh.field_c] = param1;
        ep.field_H[jh.field_c] = jh.field_c;
        kb.field_g[jh.field_c] = param3;
        if (q.field_a < param3) {
            jl.field_c = param3;
        }
        if (!(gr.field_z <= param3)) {
            rn.field_d = param3;
        }
        ob.field_y[jh.field_c] = param4;
        om.field_s[jh.field_c] = param5;
        gd.field_d[jh.field_c] = param0;
        if (!param2) {
            return;
        }
        int var6 = param5 + (param4 + param0);
        int var7 = var6 == 0 ? 0 : 1000 * param4 / var6;
        ah.field_c[jh.field_c] = var7;
        if (var7 < rn.field_d) {
            rn.field_d = var7;
        }
        if (!(var7 <= jl.field_c)) {
            jl.field_c = var7;
        }
        jh.field_c = jh.field_c + 1;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (this.field_t > 0) {
            if (null == this.field_D) {
              if (-1048577 < (this.field_t ^ -1)) {
                if (null != this.field_E) {
                  this.field_w.a(param0);
                  if ((this.field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == this.field_v) {
                      break L0;
                    } else {
                      this.field_p.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((this.field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == this.field_v) {
                      break L0;
                    } else {
                      this.field_p.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((this.field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == this.field_v) {
                    break L0;
                  } else {
                    this.field_p.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if ((this.field_I ^ -1) >= -1) {
                break L0;
              } else {
                if (null == this.field_v) {
                  break L0;
                } else {
                  this.field_p.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 < (this.field_t ^ -1)) {
              if (null == this.field_E) {
                if ((this.field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == this.field_v) {
                    break L0;
                  } else {
                    this.field_p.a(param0);
                    break L0;
                  }
                }
              } else {
                if ((this.field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == this.field_v) {
                    break L0;
                  } else {
                    this.field_p.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if ((this.field_I ^ -1) >= -1) {
                break L0;
              } else {
                if (null == this.field_v) {
                  break L0;
                } else {
                  this.field_p.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (this.field_G) {
            L2: {
              if (this.field_s <= 0) {
                break L2;
              } else {
                if (!this.field_z.d(-11414)) {
                  this.field_G = false;
                  this.field_s = -this.field_s;
                  this.field_D = null;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (-1 >= (this.field_s ^ -1)) {
              break L1;
            } else {
              if (!this.field_w.d(-11414)) {
                this.field_E = null;
                this.field_s = -this.field_s;
                this.field_G = false;
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (-1 != (this.field_s ^ -1)) {
            this.field_t = this.field_t + param0 * this.field_s;
            if (-1048577 < (this.field_t ^ -1)) {
              if (this.field_t > 0) {
                break L3;
              } else {
                this.field_t = 0;
                if (!this.field_G) {
                  this.field_s = 0;
                  if (!this.field_A) {
                    L4: {
                      if (this.field_D == null) {
                        break L4;
                      } else {
                        this.field_z.e(-1);
                        break L4;
                      }
                    }
                    this.field_D = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            } else {
              this.field_t = 1048576;
              if (this.field_G) {
                break L3;
              } else {
                this.field_s = 0;
                if (!this.field_A) {
                  L5: {
                    if (null == this.field_E) {
                      break L5;
                    } else {
                      this.field_w.e(-1);
                      break L5;
                    }
                  }
                  this.field_E = null;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          } else {
            break L3;
          }
        }
    }

    final static boolean a(int param0, int param1, boolean param2, double param3, int param4, double[] param5, int[] param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var8_int = param4 + -320;
              var9 = param1 - 240;
              var10 = -param3 * (double)((float)param6[6] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[9]) * -param3 + (double)((float)var8_int * ((float)param6[3] * 0.0000152587890625f)) * -param3 / 512.0);
              var12 = (double)(0.0000152587890625f * (float)param6[10]) * -param3 + (double)((float)var8_int * ((float)param6[4] * 0.0000152587890625f)) * -param3 / 512.0 + (double)((float)var9 * ((float)param6[7] * 0.0000152587890625f)) * -param3 / 512.0;
              var14 = -param3 * (double)((float)param6[8] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[11]) * -param3 + (double)((float)var8_int * (0.0000152587890625f * (float)param6[5])) * -param3 / 512.0);
              var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
              var14 = var14 / var16;
              var12 = var12 / var16;
              var10 = var10 / var16;
              var18 = (double)(-param6[2] + param0) / var14;
              if (!param2) {
                break L1;
              } else {
                rq.a((byte) -106, -122);
                break L1;
              }
            }
            L2: {
              param5[0] = ((double)param6[0] + var10 * var18) / 8.0;
              param5[1] = ((double)param6[1] + var12 * var18) / 8.0;
              if (0.0 <= var14) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("rq.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        fr var6_ref_fr = null;
        int var7 = 0;
        byte[] var8 = null;
        fr var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        fr var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (ld.field_c != 0) {
                L2: {
                  var2_long = rl.a((byte) -94);
                  var4 = ld.field_c;
                  if (u.field_b != 0.0) {
                    var4 = (int)((double)var4 + lc.field_P.nextGaussian() * u.field_b);
                    if (-1 >= (var4 ^ -1)) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 >= ej.field_j.field_v) {
                    break L3;
                  } else {
                    var14 = new byte[ej.field_j.field_v];
                    var11 = var14;
                    var8 = var11;
                    var17 = var8;
                    var6 = 0;
                    L4: while (true) {
                      if (var6 >= var14.length) {
                        var6_ref_fr = new fr((long)var4 + var2_long, ej.field_j.field_v, var17);
                        field_q.b((byte) 90, var6_ref_fr);
                        ej.field_j.field_v = 0;
                        break L3;
                      } else {
                        var8[var6] = ej.field_j.field_t[var6];
                        var6++;
                        continue L4;
                      }
                    }
                  }
                }
                var9 = (fr) ((Object) field_q.c((byte) -73));
                var13 = var9;
                if (var13 == null) {
                  break L1;
                } else {
                  if ((var13.field_p ^ -1L) > (var2_long ^ -1L)) {
                    var13.a((byte) -117);
                    var10 = 0;
                    var6 = var10;
                    L5: while (true) {
                      if (var10 >= var13.field_r) {
                        ej.field_j.field_v = var13.field_r;
                        break L1;
                      } else {
                        ej.field_j.field_t[var10] = var9.field_l[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (param0 < -16) {
                break L6;
              } else {
                rq.a((byte) -17, -81);
                break L6;
              }
            }
            de.a(param1, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "rq.L(" + param0 + ',' + param1 + ')');
        }
    }

    final kd a() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_F = param0;
        if (param1 != 11557) {
            field_H = (String[]) null;
        }
    }

    final synchronized int d() {
        return 2;
    }

    final kd b() {
        return null;
    }

    private rq() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        field_y = new tg[255];
        field_r = "This is your RuneScape clan if you have one.";
        for (var0 = 0; var0 < field_y.length; var0++) {
            field_y[var0] = new tg();
        }
        field_B = new int[]{20, 21, 49, 6, 8};
    }
}
