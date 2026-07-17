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
            ((sf) this).a((byte) 57);
        }
        int var2 = ak.a(((sf) this).field_r, ((sf) this).field_g, ((sf) this).field_c, ((sf) this).field_u, ((sf) this).field_o, param0 + 38, ((sf) this).field_e, 1071146, ((sf) this).field_q ? al.field_f : null, false);
        if (var2 >= 0) {
            if (!(((sf) this).field_w)) {
                ee.c(-2483, 97);
            }
            ((sf) this).field_w = true;
        } else {
            ((sf) this).field_w = false;
        }
        int discarded$0 = 65;
        gh var3 = this.b();
        if (var3 != null) {
            if (!(((sf) this).field_j != null)) {
                ((sf) this).field_j = var3.field_I;
            }
            var3.field_I = 16 <= a.field_c % 32 ? ((sf) this).field_k : ((sf) this).field_j;
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
            var3 = ((sf) this).field_s;
            if (4 == var3) {
              break L1;
            } else {
              if (var3 == 6) {
                break L1;
              } else {
                if (var3 != 11) {
                  if (var3 != 15) {
                    break L0;
                  } else {
                    if (!df.field_K) {
                      break L0;
                    } else {
                      ((sf) this).field_q = true;
                      this.a(-6);
                      break L0;
                    }
                  }
                } else {
                  ((sf) this).field_q = true;
                  this.a(-67);
                  break L0;
                }
              }
            }
          }
          ((sf) this).field_q = true;
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

    private final gh b() {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = ((sf) this).field_s;
        if (3 == var2) {
          return vb.field_a[1];
        } else {
          if (var2 == 5) {
            return vb.field_a[2];
          } else {
            if (10 != var2) {
              if (14 != var2) {
                return ((sf) this).field_a;
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
            ((sf) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "sf.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 41);
        }
    }

    final void a(byte param0) {
        kf.field_s = true;
        lg.field_l = true;
        if (param0 <= 57) {
            field_d = 94;
        }
        int discarded$0 = 65;
        gh var4 = this.b();
        gh var5 = var4;
        if (var5 != null) {
            if (null != ((sf) this).field_j) {
                var5.field_I = ((sf) this).field_j;
            }
        }
        ((sf) this).field_j = null;
    }

    public static void a() {
        field_f = null;
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
            var7 = 0 * var6_int;
            for (var10 = 0; var10 < 10; var10++) {
                var8 = (param2 * (10 + -var10) + var10 * param1) / 10;
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
            throw ci.a((Throwable) (Object) runtimeException, "sf.C(" + 10 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + 0 + 44 + param5 + 41);
        }
    }

    private final void a(int param0) {
        ((sf) this).field_e = 2 * ((sf) this).field_n;
        if (((sf) this).field_r != null) {
            ((sf) this).field_e = ((sf) this).field_e + (2 + ((sf) this).field_r.field_F);
        }
        if (param0 >= -2) {
            field_b = null;
        }
        if (((sf) this).field_c != null) {
            ((sf) this).field_e = ((sf) this).field_e + ((sf) this).field_h.a(((sf) this).field_c, ((sf) this).field_u + -(2 * ((sf) this).field_m), 0);
        }
        if (!(!((sf) this).field_q)) {
            ((sf) this).field_e = ((sf) this).field_e + 40;
        }
    }

    final static dm a(String param0) {
        RuntimeException var2 = null;
        dm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new dm(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sf.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 16 + 41);
        }
        return stackIn_1_0;
    }

    final boolean a(rm param0, int param1) {
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
        int stackIn_25_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_72_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              lg.field_l = true;
              kf.field_s = true;
              if (!((sf) this).field_q) {
                break L1;
              } else {
                if (((sf) this).field_w) {
                  ee.c(-2483, 95);
                  rc.a(false);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0.field_e == 3) {
              ((sf) this).a((byte) 69);
              dc.field_g = -1;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              L2: {
                if (param1 == 23123) {
                  break L2;
                } else {
                  boolean discarded$2 = ((sf) this).a(115, -6);
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
                      return stackIn_15_0 != 0;
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
                      return stackIn_20_0 != 0;
                    }
                  }
                }
              }
              L5: {
                L6: {
                  int discarded$3 = 65;
                  var9 = this.b();
                  if (var9 == null) {
                    break L6;
                  } else {
                    if (!var9.field_kb) {
                      break L6;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L5;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L5;
              }
              L7: {
                var4 = stackIn_25_0;
                var5 = ((sf) this).field_s;
                if (var5 == 1) {
                  if (var4 != 0) {
                    rc.a(false);
                    stackOut_40_0 = 1;
                    stackIn_41_0 = stackOut_40_0;
                    return stackIn_41_0 != 0;
                  } else {
                    break L7;
                  }
                } else {
                  if (var5 != 3) {
                    if (5 != var5) {
                      if (var5 != 7) {
                        if (8 == var5) {
                          L8: {
                            if (null != lj.field_h) {
                              stackOut_55_0 = 1;
                              stackIn_56_0 = stackOut_55_0;
                              break L8;
                            } else {
                              stackOut_54_0 = 0;
                              stackIn_56_0 = stackOut_54_0;
                              break L8;
                            }
                          }
                          return stackIn_56_0 != 0;
                        } else {
                          if (var5 == 10) {
                            if (var4 == 0) {
                              break L7;
                            } else {
                              rc.a(false);
                              stackOut_58_0 = 1;
                              stackIn_59_0 = stackOut_58_0;
                              return stackIn_59_0 != 0;
                            }
                          } else {
                            if (var5 == 12) {
                              if (df.field_K) {
                                rc.a(false);
                                stackOut_62_0 = 1;
                                stackIn_63_0 = stackOut_62_0;
                                return stackIn_63_0 != 0;
                              } else {
                                break L7;
                              }
                            } else {
                              if (14 == var5) {
                                if (var4 != 0) {
                                  rc.a(false);
                                  stackOut_66_0 = 1;
                                  stackIn_67_0 = stackOut_66_0;
                                  return stackIn_67_0 != 0;
                                } else {
                                  break L7;
                                }
                              } else {
                                if (var5 == 16) {
                                  if (448 <= pi.field_c) {
                                    stackOut_70_0 = 1;
                                    stackIn_71_0 = stackOut_70_0;
                                    return stackIn_71_0 != 0;
                                  } else {
                                    break L7;
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
                          stackOut_51_0 = 1;
                          stackIn_52_0 = stackOut_51_0;
                          return stackIn_52_0 != 0;
                        } else {
                          break L7;
                        }
                      }
                    } else {
                      if (var4 != 0) {
                        rc.a(false);
                        stackOut_47_0 = 1;
                        stackIn_48_0 = stackOut_47_0;
                        return stackIn_48_0 != 0;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    if (var4 == 0) {
                      break L7;
                    } else {
                      rc.a(false);
                      stackOut_43_0 = 1;
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0 != 0;
                    }
                  }
                }
              }
              stackOut_72_0 = 0;
              stackIn_73_0 = stackOut_72_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var3;
            stackOut_74_1 = new StringBuilder().append("sf.L(");
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L9;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param1 + 41);
        }
        return stackIn_73_0 != 0;
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
        ((sf) this).field_h = (mi) (Object) ff.field_lb;
        ((sf) this).field_m = 8;
        ((sf) this).field_k = bl.field_d;
        ((sf) this).field_n = 5;
        ((sf) this).field_s = -1;
        try {
          L0: {
            L1: {
              ((sf) this).field_g = param2;
              ((sf) this).field_o = param1;
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
              ((sf) this).field_q = stackIn_4_1 != 0;
              ((sf) this).field_c = param0;
              ((sf) this).field_r = param5;
              ((sf) this).field_u = param3;
              ((sf) this).field_e = param4;
              if (((sf) this).field_e != 0) {
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
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("sf.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "to keep fullscreen or";
        field_p = "Achieved";
        field_d = 0;
        field_v = "EMP";
        field_b = "Advertising websites";
        field_l = "Rating";
        field_f = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
