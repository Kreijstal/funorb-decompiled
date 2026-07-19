/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    private mi field_h;
    private int field_s;
    static String field_v;
    static String field_p;
    private wk[] field_j;
    private int field_o;
    static String field_i;
    private wk[] field_k;
    static String field_l;
    private int field_u;
    private boolean field_q;
    gh field_a;
    private int field_n;
    private int field_g;
    static int field_d;
    private int field_m;
    static String field_b;
    static int field_t;
    private boolean field_w;
    static String field_f;
    private int field_e;
    private String field_c;
    private wk field_r;

    final void b(int param0) {
        if (param0 != -40) {
            this.a((byte) 57);
        }
        int var2 = ak.a(this.field_r, this.field_g, this.field_c, this.field_u, this.field_o, param0 + 38, this.field_e, 1071146, this.field_q ? al.field_f : null, false);
        if (-1 >= (var2 ^ -1)) {
            if (!(this.field_w)) {
                ee.c(-2483, 97);
            }
            this.field_w = true;
        } else {
            this.field_w = false;
        }
        gh var3 = this.b((byte) 65);
        if (var3 != null) {
            if (!(this.field_j != null)) {
                this.field_j = var3.field_I;
            }
            var3.field_I = 16 <= a.field_c % 32 ? this.field_k : this.field_j;
        }
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        bc.field_ub.a(param3, param0);
        if (param2) {
            var4 = 2 * (ik.field_e % bc.field_ub.field_A);
            if (var4 >= bc.field_ub.field_A) {
                var4 = bc.field_ub.field_A + (-var4 + bc.field_ub.field_A);
            }
            if (var4 < 10) {
                var4 = 10;
            } else {
                if (!(-40 + bc.field_ub.field_A >= var4)) {
                    var4 = -40 + bc.field_ub.field_A;
                }
            }
            tk.a(param0, 80, 30, 0, 0, -30456, bc.field_ub, param3, var4);
        }
        var4 = -105 % ((param1 - 74) / 35);
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = SteelSentinels.field_G;
            var3 = this.field_s;
            if (4 == var3) {
              break L1;
            } else {
              if ((var3 ^ -1) == -7) {
                break L1;
              } else {
                if ((var3 ^ -1) != -12) {
                  if ((var3 ^ -1) != -16) {
                    break L0;
                  } else {
                    if (!df.field_K) {
                      break L0;
                    } else {
                      this.field_q = true;
                      this.a(-6);
                      break L0;
                    }
                  }
                } else {
                  this.field_q = true;
                  this.a(-67);
                  break L0;
                }
              }
            }
          }
          this.field_q = true;
          this.a(-67);
          break L0;
        }
        L2: {
          if (param1 <= -110) {
            break L2;
          } else {
            this.a(77);
            break L2;
          }
        }
        return true;
    }

    private final gh b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = this.field_s;
        if (3 == var2) {
          return vb.field_a[1];
        } else {
          if ((var2 ^ -1) == -6) {
            return vb.field_a[2];
          } else {
            if (10 != var2) {
              if (14 != var2) {
                L0: {
                  if (param0 == 65) {
                    break L0;
                  } else {
                    field_f = (String) null;
                    break L0;
                  }
                }
                return this.field_a;
              } else {
                return vb.field_a[0];
              }
            } else {
              return vb.field_a[3];
            }
          }
        }
    }

    sf(int param0, int param1, int param2, int param3, int param4, wk param5, boolean param6) {
        this(jm.field_u[param0], param1, param2, param3, param4, param5, param6);
        try {
            this.field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "sf.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final void a(byte param0) {
        kf.field_s = true;
        lg.field_l = true;
        if (param0 <= 57) {
            field_d = 94;
        }
        gh var4 = this.b((byte) 65);
        gh var5 = var4;
        if (var5 != null) {
            if (null != this.field_j) {
                var5.field_I = this.field_j;
            }
        }
        this.field_j = null;
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_d = 20;
        }
        field_l = null;
        field_b = null;
        field_p = null;
        field_i = null;
        field_v = null;
    }

    final boolean c(int param0) {
        kf.field_s = true;
        lg.field_l = true;
        if (param0 <= 9) {
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2) {
        mg.field_kc = param1;
        int var3 = 78 % ((param0 - -41) / 56);
        kb.field_a = param2;
    }

    final static void a(int param0, int param1, int param2, wk param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var10 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = SteelSentinels.field_G;
        try {
            param1 = param1 & 255;
            param2 = param2 & 255;
            var6_int = param3.field_z;
            var7 = param4 * var6_int;
            for (var10 = param4; var10 < param0; var10++) {
                var8 = (param2 * (param0 + -var10) + (-param4 + var10) * param1) / (-param4 + param0);
                var8 = var8 * 65793;
                for (var9 = 0; var6_int > var9; var9++) {
                    if (!(0 == param3.field_E[var7 + var9])) {
                        param3.field_E[var9 + var7] = var8;
                    }
                }
                var7 = var7 + var6_int;
            }
            int var11 = -52 % ((35 - param5) / 37);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "sf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0) {
        this.field_e = 2 * this.field_n;
        if (this.field_r != null) {
            this.field_e = this.field_e + (2 + this.field_r.field_F);
        }
        if (param0 >= -2) {
            field_b = (String) null;
        }
        if (this.field_c != null) {
            this.field_e = this.field_e + this.field_h.a(this.field_c, this.field_u + -(2 * this.field_m), 0);
        }
        if (!(!this.field_q)) {
            this.field_e = this.field_e + 40;
        }
    }

    final static dm a(String param0, int param1) {
        RuntimeException var2 = null;
        dm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 16) {
                break L1;
              } else {
                sf.a(-116, (byte) 30, true, -66);
                break L1;
              }
            }
            stackOut_2_0 = new dm(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("sf.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(rm param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kg var7 = null;
        kg var8 = null;
        gh var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              lg.field_l = true;
              kf.field_s = true;
              if (!this.field_q) {
                break L1;
              } else {
                if (this.field_w) {
                  ee.c(-2483, 95);
                  rc.a(false);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if ((param0.field_e ^ -1) == -4) {
              this.a((byte) 69);
              dc.field_g = -1;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == 23123) {
                  break L2;
                } else {
                  discarded$1 = this.a(115, -6);
                  break L2;
                }
              }
              L3: {
                var7 = bi.field_f;
                if (var7 == null) {
                  break L3;
                } else {
                  if (null == var7.field_Sb) {
                    break L3;
                  } else {
                    if (!var7.field_Sb.field_kb) {
                      break L3;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              L4: {
                var8 = vd.field_a;
                if (var8 == null) {
                  break L4;
                } else {
                  if (var8.field_Sb == null) {
                    break L4;
                  } else {
                    if (!var8.field_Sb.field_kb) {
                      break L4;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
              L5: {
                var9 = this.b((byte) 65);
                if (var9 != null) {
                  if (var9.field_kb) {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    break L5;
                  } else {
                    stackOut_24_0 = 0;
                    stackIn_27_0 = stackOut_24_0;
                    break L5;
                  }
                } else {
                  stackOut_22_0 = 0;
                  stackIn_27_0 = stackOut_22_0;
                  break L5;
                }
              }
              L6: {
                var4 = stackIn_27_0;
                var5 = this.field_s;
                if (-2 == (var5 ^ -1)) {
                  if (var4 != 0) {
                    rc.a(false);
                    stackOut_42_0 = 1;
                    stackIn_43_0 = stackOut_42_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    break L6;
                  }
                } else {
                  if ((var5 ^ -1) != -4) {
                    if (5 != var5) {
                      if ((var5 ^ -1) != -8) {
                        if (8 == var5) {
                          L7: {
                            if (null != lj.field_h) {
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              break L7;
                            } else {
                              stackOut_56_0 = 0;
                              stackIn_58_0 = stackOut_56_0;
                              break L7;
                            }
                          }
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          if (-11 == (var5 ^ -1)) {
                            if (var4 == 0) {
                              break L6;
                            } else {
                              rc.a(false);
                              stackOut_60_0 = 1;
                              stackIn_61_0 = stackOut_60_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          } else {
                            if ((var5 ^ -1) == -13) {
                              if (df.field_K) {
                                rc.a(false);
                                stackOut_64_0 = 1;
                                stackIn_65_0 = stackOut_64_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                break L6;
                              }
                            } else {
                              if (14 == var5) {
                                if (var4 != 0) {
                                  rc.a(false);
                                  stackOut_68_0 = 1;
                                  stackIn_69_0 = stackOut_68_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              } else {
                                if (var5 == 16) {
                                  if (448 <= pi.field_c) {
                                    stackOut_72_0 = 1;
                                    stackIn_73_0 = stackOut_72_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (var4 != 0) {
                          rc.a(false);
                          stackOut_53_0 = 1;
                          stackIn_54_0 = stackOut_53_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if (var4 != 0) {
                        rc.a(false);
                        stackOut_49_0 = 1;
                        stackIn_50_0 = stackOut_49_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    if (var4 == 0) {
                      break L6;
                    } else {
                      rc.a(false);
                      stackOut_45_0 = 1;
                      stackIn_46_0 = stackOut_45_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
              stackOut_74_0 = 0;
              stackIn_75_0 = stackOut_74_0;
              decompiledRegionSelector0 = 12;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) (var3);
            stackOut_76_1 = new StringBuilder().append("sf.L(");
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L8;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_43_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_46_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_50_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_54_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_58_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_61_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_65_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_69_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_73_0 != 0;
                              } else {
                                return stackIn_75_0 != 0;
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
    }

    private sf(String param0, int param1, int param2, int param3, int param4, wk param5, boolean param6) {
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        this.field_h = (mi) ((Object) ff.field_lb);
        this.field_m = 8;
        this.field_k = bl.field_d;
        this.field_n = 5;
        this.field_s = -1;
        try {
          L0: {
            L1: {
              this.field_g = param2;
              this.field_o = param1;
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
            L2: {
              ((sf) (this)).field_q = stackIn_4_1 != 0;
              this.field_c = param0;
              this.field_r = param5;
              this.field_u = param3;
              this.field_e = param4;
              if (this.field_e != 0) {
                break L2;
              } else {
                this.a(-120);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("sf.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param6 + ')');
        }
    }

    static {
        field_i = "to keep fullscreen or";
        field_p = "Achieved";
        field_d = 0;
        field_v = "EMP";
        field_b = "Advertising websites";
        field_l = "Rating";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
