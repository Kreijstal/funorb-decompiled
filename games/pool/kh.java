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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oq var8 = null;
        short[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 > 88) {
                break L1;
              } else {
                var8 = (oq) null;
                kh.a(8, (short[]) null, (byte) 40, (oq) null);
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
                if (-1 > (var5 ^ -1)) {
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
              stackIn_17_0 = (short[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("kh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final static void f(byte param0) {
        int var1;
        int var2;
        int var3;
        L0: {
          var3 = Pool.field_O;
          ep.field_z = false;
          oa.field_d = null;
          var1 = -42 % ((-1 - param0) / 38);
          if (!ro.field_e) {
            var2 = no.field_l;
            if ((var2 ^ -1) < -1) {
              if (1 == var2) {
                oa.field_d = vd.field_m;
                oa.field_d = aq.a(-54, new CharSequence[]{(CharSequence) ((Object) oa.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) kk.field_E)});
                d.field_d.k(17);
                ci.d((byte) -126);
                break L0;
              } else {
                oa.field_d = nr.a(new String[]{Integer.toString(var2)}, -1, sa.field_d);
                oa.field_d = aq.a(-54, new CharSequence[]{(CharSequence) ((Object) oa.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) kk.field_E)});
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
        return !this.d(param0 ^ -14186) ? true : false;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_6_0 = 0;
        if (param1 > 18) {
          L0: {
            L1: {
              if (param0 < 48) {
                break L1;
              } else {
                if (57 < param0) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    kh(int param0) {
        super(0L, (vh) null);
        this.field_tc = new byte[param0];
    }

    public static void g(byte param0) {
        field_rc = null;
        field_gc = null;
        field_Vb = null;
        if (param0 != -124) {
            field_Vb = (vh) null;
        }
    }

    final static boolean a(int param0, eg param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        eg stackIn_6_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0 == -3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    stackIn_6_0 = (eg) (param1);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackIn_6_0 = (eg) (param1);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0.field_K <= var3_int) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1.field_Q == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param1.field_Q[var3_int] ^ -1) == -3) {
                            statePc = 16;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param2 == param1.field_N[var3_int]) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 == param1.field_v[var3_int]) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param2 != param1.field_X[var3_int]) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3_int++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var3);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("kh.F(").append(param0).append(',');
                    stackIn_20_1 = stackIn_21_1;
                    if (param1 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw wm.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static qb a(int param0, int param1, byte param2, di param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -89 / ((-33 - param2) / 51);
          if (vj.a(param1, param3, param0, (byte) 121)) {
            return fo.a((byte) -23);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("kh.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != 20872) {
            this.field_Dc = true;
        }
        return (int)this.a(-127);
    }

    final boolean a(kh param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.field_Zb = 52L;
                break L1;
              }
            }
            L2: {
              if (!this.field_Xb) {
                if (6 == this.field_Fc) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_8_0;
              if (!param0.field_Xb) {
                if (param0.field_Fc == 6) {
                  stackIn_14_0 = 1;
                  break L3;
                } else {
                  stackIn_14_0 = 0;
                  break L3;
                }
              } else {
                stackIn_14_0 = 1;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_14_0;
              if (var4 != 0) {
                stackIn_17_0 = 0;
                break L4;
              } else {
                stackIn_17_0 = 1;
                break L4;
              }
            }
            if (stackIn_17_0 != var3_int) {
              L5: {
                if (var3_int == 0) {
                  if (this.field_ic != param0.field_ic) {
                    stackIn_25_0 = this.field_ic;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_ic) {
                      break L5;
                    } else {
                      if (this.field_ac != param0.field_ac) {
                        L6: {
                          if (this.field_ac >= param0.field_ac) {
                            stackIn_32_0 = 0;
                            break L6;
                          } else {
                            stackIn_32_0 = 1;
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
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
                  stackIn_36_0 = 0;
                  break L7;
                } else {
                  stackIn_36_0 = 1;
                  break L7;
                }
              }
              L8: {


                if (this.field_ec) {

                  stackIn_39_1 = 0;
                  break L8;
                } else {

                  stackIn_39_1 = 1;
                  break L8;
                }
              }
              if (stackIn_36_0 != stackIn_39_1) {
                L9: {
                  if (this.field_ec) {
                    stackIn_44_0 = 0;
                    break L9;
                  } else {
                    stackIn_44_0 = 1;
                    break L9;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!this.field_ec) {
                  L10: {
                    if ((this.field_sc ^ -1L) <= (param0.field_sc ^ -1L)) {
                      stackIn_71_0 = 0;
                      break L10;
                    } else {
                      stackIn_71_0 = 1;
                      break L10;
                    }
                  }
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  L11: {
                    if (this.field_Dc) {
                      stackIn_52_0 = 1;
                      break L11;
                    } else {
                      if (2 == this.field_Yb) {
                        stackIn_52_0 = 1;
                        break L11;
                      } else {
                        stackIn_52_0 = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    var5 = stackIn_52_0;
                    if (!param0.field_Dc) {
                      if (2 == param0.field_Yb) {
                        stackIn_58_0 = 1;
                        break L12;
                      } else {
                        stackIn_58_0 = 0;
                        break L12;
                      }
                    } else {
                      stackIn_58_0 = 1;
                      break L12;
                    }
                  }
                  L13: {
                    var6 = stackIn_58_0;
                    if (var6 != 0) {
                      stackIn_61_0 = 0;
                      break L13;
                    } else {
                      stackIn_61_0 = 1;
                      break L13;
                    }
                  }
                  if (stackIn_61_0 != var5) {
                    L14: {
                      if (this.field_sc <= param0.field_sc) {
                        stackIn_67_0 = 0;
                        break L14;
                      } else {
                        stackIn_67_0 = 1;
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    stackIn_63_0 = var5;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_19_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var3);

            stackIn_74_1 = new StringBuilder().append("kh.E(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L15;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L15;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_44_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_63_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_67_0 != 0;
                  } else {
                    return stackIn_71_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, vj param1, int param2, int param3, lr param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param2 == 6110) {
                break L1;
              } else {
                kh.g((byte) -86);
                break L1;
              }
            }
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (param0.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param0.charAt(var7);
                  if (var8 == 60) {
                    var6 = (var5_int >> 541678536) + param1.field_h[0] - -param4.b(param0.substring(0, var7));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 == -1) {
                    L5: {
                      if (var8 == 32) {
                        var5_int = var5_int + param3;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    param1.field_h[var7] = param1.field_h[0] + (var5_int >> 1924636424) - -param4.b(param0.substring(0, 1 + var7)) - param4.a((char) var8);
                    break L4;
                  } else {
                    param1.field_h[var7] = var6;
                    break L4;
                  }
                }
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  continue L2;
                } else {
                  var7++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("kh.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    static {
        field_vc = 450;
        field_oc = 4;
        field_Pb = 200;
        field_Gc = -1;
        field_Vb = null;
    }
}
