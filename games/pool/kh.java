/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends vh {
    int field_Fc;
    boolean field_wc;
    int field_mc;
    vh field_hc;
    int field_Yb;
    byte[] field_tc;
    String[] field_bc;
    vh field_Lb;
    int field_ac;
    vh field_jc;
    vh field_cc;
    vh field_xc;
    static boolean field_Ac;
    boolean field_Dc;
    vh field_Rb;
    vh field_nc;
    boolean field_ic;
    static int field_yc;
    vh field_Sb;
    long field_Zb;
    String field_Ob;
    static int field_Pb;
    vh field_Bc;
    static int field_vc;
    int field_Mb;
    vh field_kc;
    boolean field_Xb;
    static int field_oc;
    int field_pc;
    vh field_Tb;
    vh field_Ec;
    vh field_zc;
    static oo field_gc;
    static boolean[] field_rc;
    boolean field_Qb;
    vh field_lc;
    boolean field_ec;
    long field_sc;
    boolean field_fc;
    vh[] field_Ub;
    vh field_Cc;
    int field_Nb;
    static int field_Gc;
    vh field_dc;
    int field_qc;
    static vh field_Vb;
    static int field_Wb;
    static int field_uc;

    final static short[] a(int param0, short[] param1, byte param2, oq param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        short[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 88) {
                break L1;
              } else {
                var8 = null;
                short[] discarded$2 = kh.a(8, (short[]) null, (byte) 40, (oq) null);
                break L1;
              }
            }
            var4_int = param3.e(param0, 89);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (param1.length == var4_int) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L2;
              }
              L4: {
                var5 = param3.e(4, 45);
                var6 = (short)param3.e(16, 18);
                if (var5 > 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (short)(var6 + param3.e(var5, 103));
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_16_0 = (short[]) param1;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final static void f(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          ep.field_z = false;
          oa.field_d = null;
          var1 = -42 % ((-1 - param0) / 38);
          if (!ro.field_e) {
            var2 = no.field_l;
            if (var2 > 0) {
              if (1 == var2) {
                oa.field_d = vd.field_m;
                oa.field_d = aq.a(-54, new CharSequence[3]);
                d.field_d.k(17);
                ci.d((byte) -126);
                break L0;
              } else {
                oa.field_d = nr.a(new String[1], -1, sa.field_d);
                oa.field_d = aq.a(-54, new CharSequence[3]);
                d.field_d.k(17);
                ci.d((byte) -126);
                break L0;
              }
            } else {
              d.field_d.k(17);
              ci.d((byte) -126);
              break L0;
            }
          } else {
            d.field_d.m((byte) -33);
            break L0;
          }
        }
    }

    final boolean f(int param0) {
        if (param0 != -14144) {
            field_Gc = -5;
        }
        return !((kh) this).d(param0 ^ -14186) ? true : false;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 > 18) {
          L0: {
            L1: {
              if (param0 < 48) {
                break L1;
              } else {
                if (57 < param0) {
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
          return false;
        }
    }

    kh(int param0) {
        super(0L, (vh) null);
        ((kh) this).field_tc = new byte[param0];
    }

    public static void g() {
        field_rc = null;
        field_gc = null;
        field_Vb = null;
    }

    final static boolean a(int param0, eg param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        eg stackIn_5_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_3_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        eg stackOut_4_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            var3_int = 0;
            stackOut_3_0 = (eg) param1;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              if (stackIn_5_0.field_K <= var3_int) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    if (param1.field_Q == null) {
                      break L3;
                    } else {
                      if (param1.field_Q[var3_int] == 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param2 == param1.field_N[var3_int]) {
                      break L4;
                    } else {
                      if (param2 == param1.field_v[var3_int]) {
                        break L4;
                      } else {
                        if (param2 != param1.field_X[var3_int]) {
                          break L2;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                }
                var3_int++;
                stackOut_4_0 = (eg) param1;
                stackIn_5_0 = stackOut_4_0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("kh.F(").append(-3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static qb a(int param0, int param1, byte param2, di param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          var4_int = -89;
          if (vj.a(param1, param3, param0, (byte) 121)) {
            return fo.a((byte) -23);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("kh.U(").append(param0).append(',').append(param1).append(',').append(-97).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != 20872) {
            ((kh) this).field_Dc = true;
        }
        return (int)((kh) this).a(-127);
    }

    final boolean a(kh param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((kh) this).field_Zb = 52L;
                break L1;
              }
            }
            L2: {
              if (!((kh) this).field_Xb) {
                if (6 == ((kh) this).field_Fc) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_8_0;
              if (!param0.field_Xb) {
                if (param0.field_Fc == 6) {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_14_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_14_0;
              if (var4 != 0) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            if (stackIn_17_0 != var3_int) {
              L5: {
                if (var3_int == 0) {
                  if (((kh) this).field_ic != param0.field_ic) {
                    stackOut_24_0 = ((kh) this).field_ic;
                    stackIn_25_0 = stackOut_24_0;
                    return stackIn_25_0;
                  } else {
                    if (!((kh) this).field_ic) {
                      break L5;
                    } else {
                      if (((kh) this).field_ac != param0.field_ac) {
                        L6: {
                          if (((kh) this).field_ac >= param0.field_ac) {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            break L6;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L6;
                          }
                        }
                        return stackIn_32_0 != 0;
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              L7: {
                if (param0.field_ec) {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L7;
                } else {
                  stackOut_34_0 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  break L7;
                }
              }
              L8: {
                stackOut_36_0 = stackIn_36_0;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (((kh) this).field_ec) {
                  stackOut_38_0 = stackIn_38_0;
                  stackOut_38_1 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  break L8;
                } else {
                  stackOut_37_0 = stackIn_37_0;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L8;
                }
              }
              if (stackIn_39_0 != stackIn_39_1) {
                L9: {
                  if (((kh) this).field_ec) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L9;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L9;
                  }
                }
                return stackIn_44_0 != 0;
              } else {
                if (!((kh) this).field_ec) {
                  L10: {
                    if (~((kh) this).field_sc <= ~param0.field_sc) {
                      stackOut_70_0 = 0;
                      stackIn_71_0 = stackOut_70_0;
                      break L10;
                    } else {
                      stackOut_69_0 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      break L10;
                    }
                  }
                  break L0;
                } else {
                  L11: {
                    if (((kh) this).field_Dc) {
                      stackOut_50_0 = 1;
                      stackIn_52_0 = stackOut_50_0;
                      break L11;
                    } else {
                      if (2 == ((kh) this).field_Yb) {
                        stackOut_49_0 = 1;
                        stackIn_52_0 = stackOut_49_0;
                        break L11;
                      } else {
                        stackOut_48_0 = 0;
                        stackIn_52_0 = stackOut_48_0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    var5 = stackIn_52_0;
                    if (!param0.field_Dc) {
                      if (2 == param0.field_Yb) {
                        stackOut_56_0 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        break L12;
                      } else {
                        stackOut_55_0 = 0;
                        stackIn_58_0 = stackOut_55_0;
                        break L12;
                      }
                    } else {
                      stackOut_53_0 = 1;
                      stackIn_58_0 = stackOut_53_0;
                      break L12;
                    }
                  }
                  L13: {
                    var6 = stackIn_58_0;
                    if (var6 != 0) {
                      stackOut_60_0 = 0;
                      stackIn_61_0 = stackOut_60_0;
                      break L13;
                    } else {
                      stackOut_59_0 = 1;
                      stackIn_61_0 = stackOut_59_0;
                      break L13;
                    }
                  }
                  if (stackIn_61_0 != var5) {
                    L14: {
                      if (((kh) this).field_sc <= param0.field_sc) {
                        stackOut_66_0 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        break L14;
                      } else {
                        stackOut_65_0 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        break L14;
                      }
                    }
                    return stackIn_67_0 != 0;
                  } else {
                    stackOut_62_0 = var5;
                    stackIn_63_0 = stackOut_62_0;
                    return stackIn_63_0 != 0;
                  }
                }
              }
            } else {
              stackOut_18_0 = var3_int;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var3;
            stackOut_72_1 = new StringBuilder().append("kh.E(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L15;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L15;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ')');
        }
        return stackIn_71_0 != 0;
    }

    final static void a(String param0, vj param1, int param2, int param3, lr param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (param0.length() <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = param0.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> 8) + param1.field_h[0] - -param4.b(param0.substring(0, var7));
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var6 == -1) {
                    L4: {
                      if (var8 == 32) {
                        var5_int = var5_int + param3;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1.field_h[var7] = param1.field_h[0] + (var5_int >> 8) - -param4.b(param0.substring(0, 1 + var7)) - param4.a((char) var8);
                    break L3;
                  } else {
                    param1.field_h[var7] = var6;
                    break L3;
                  }
                }
                L5: {
                  if (var8 != 62) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("kh.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(6110).append(',').append(param3).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vc = 450;
        field_oc = 4;
        field_Pb = 200;
        field_Gc = -1;
        field_Vb = null;
    }
}
