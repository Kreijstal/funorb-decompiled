/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uh extends cr {
    cr field_pc;
    cr[] field_Zb;
    int field_uc;
    cr field_Ob;
    boolean field_qc;
    boolean field_Sb;
    int field_Yb;
    cr field_Kb;
    cr field_bc;
    cr field_Rb;
    cr field_ec;
    cr field_ac;
    int field_Qb;
    static mi field_Wb;
    long field_Pb;
    int field_ic;
    boolean field_Tb;
    cr field_rc;
    boolean field_dc;
    cr field_Vb;
    String[] field_Hb;
    static int field_oc;
    boolean field_vc;
    long field_hc;
    int field_Lb;
    cr field_jc;
    cr field_Jb;
    boolean field_Mb;
    cr field_cc;
    cr field_nc;
    cr field_gc;
    boolean field_kc;
    int field_tc;
    int field_Ub;
    byte[] field_fc;
    static int field_mc;
    String field_Nb;
    static vi field_Xb;
    cr field_Ib;
    static String field_lc;
    cr field_wc;
    static volatile boolean field_sc;
    int field_xc;

    final static String a(byte param0, long param1) {
        wq.field_K.setTime(new Date(param1));
        int var3 = wq.field_K.get(7);
        if (param0 != -66) {
            uh.b((byte) 22);
        }
        int var4 = wq.field_K.get(5);
        int var5 = wq.field_K.get(2);
        int var6 = wq.field_K.get(1);
        int var7 = wq.field_K.get(11);
        int var8 = wq.field_K.get(12);
        int var9 = wq.field_K.get(13);
        return ao.field_Q[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + nh.field_l[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    uh(int param0) {
        super(0L, (cr) null);
        ((uh) this).field_fc = new byte[param0];
    }

    final boolean k(int param0) {
        if (param0 != 4043) {
            boolean discarded$0 = ((uh) this).k(22);
        }
        return !((uh) this).e(param0 ^ -3977) ? true : false;
    }

    final static void a(boolean param0, er param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (0 == (3 & (param1.field_z | (param1.field_C | (param1.field_y | param1.field_t))))) {
              return;
            } else {
              var2_int = (3 & param1.field_C) + param1.field_y;
              var3 = param1.field_t - -(3 & param1.field_z);
              var2_int = var2_int - (-4 - -(3 & var2_int));
              var3 = var3 - ((var3 & 3) + -4);
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = (3 & param1.field_z) * var2_int + (3 & param1.field_C);
              var7 = 0;
              L1: while (true) {
                if (var7 >= param1.field_t) {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      String discarded$3 = uh.a((byte) 113, 97L);
                      break L2;
                    }
                  }
                  param1.field_z = param1.field_z & -4;
                  param1.field_t = var3;
                  param1.field_F = var4;
                  param1.field_y = var2_int;
                  param1.field_C = param1.field_C & -4;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= param1.field_y) {
                      var6 = var6 + (-param1.field_y + var2_int);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$4 = var6;
                      var6++;
                      int incrementValue$5 = var5;
                      var5++;
                      var4[incrementValue$4] = param1.field_F[incrementValue$5];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("uh.F(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final boolean a(boolean param0, uh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_21_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_23_1 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_34_0 = false;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_22_0 = false;
        int stackOut_22_1 = 0;
        boolean stackOut_21_0 = false;
        int stackOut_21_1 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        boolean stackOut_33_0 = false;
        boolean stackOut_35_0 = false;
        int stackOut_35_1 = 0;
        boolean stackOut_34_0 = false;
        int stackOut_34_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        try {
          L0: {
            L1: {
              if (!((uh) this).field_Sb) {
                if (((uh) this).field_Lb == 6) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_6_0;
              if (!param1.field_Sb) {
                if (6 == param1.field_Lb) {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_12_0 = stackOut_9_0;
                  break L2;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_12_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_12_0;
              if (var4 != 0) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L3;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L3;
              }
            }
            if (stackIn_15_0 != var3_int) {
              L4: {
                if (var3_int == 0) {
                  L5: {
                    stackOut_20_0 = param1.field_dc;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (((uh) this).field_dc) {
                      stackOut_22_0 = stackIn_22_0;
                      stackOut_22_1 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L5;
                    } else {
                      stackOut_21_0 = stackIn_21_0;
                      stackOut_21_1 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L5;
                    }
                  }
                  if ((stackIn_23_0 ? 1 : 0) == stackIn_23_1) {
                    stackOut_25_0 = ((uh) this).field_dc;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0;
                  } else {
                    if (!((uh) this).field_dc) {
                      break L4;
                    } else {
                      if (((uh) this).field_Ub == param1.field_Ub) {
                        break L4;
                      } else {
                        L6: {
                          if (((uh) this).field_Ub >= param1.field_Ub) {
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
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                stackOut_33_0 = ((uh) this).field_kc;
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (param1.field_kc) {
                  stackOut_35_0 = stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L7;
                } else {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  break L7;
                }
              }
              if ((stackIn_36_0 ? 1 : 0) != stackIn_36_1) {
                L8: {
                  if (param0) {
                    break L8;
                  } else {
                    uh.b((byte) -114);
                    break L8;
                  }
                }
                if (((uh) this).field_kc) {
                  L9: {
                    if (((uh) this).field_vc) {
                      stackOut_52_0 = 1;
                      stackIn_54_0 = stackOut_52_0;
                      break L9;
                    } else {
                      if (-3 == ((uh) this).field_xc) {
                        stackOut_51_0 = 1;
                        stackIn_54_0 = stackOut_51_0;
                        break L9;
                      } else {
                        stackOut_50_0 = 0;
                        stackIn_54_0 = stackOut_50_0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var5 = stackIn_54_0;
                    if (!param1.field_vc) {
                      if (-3 == param1.field_xc) {
                        stackOut_58_0 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        break L10;
                      } else {
                        stackOut_57_0 = 0;
                        stackIn_60_0 = stackOut_57_0;
                        break L10;
                      }
                    } else {
                      stackOut_55_0 = 1;
                      stackIn_60_0 = stackOut_55_0;
                      break L10;
                    }
                  }
                  var6 = stackIn_60_0;
                  if (var6 == var5) {
                    L11: {
                      if (~((uh) this).field_Pb >= ~param1.field_Pb) {
                        stackOut_65_0 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        break L11;
                      } else {
                        stackOut_64_0 = 1;
                        stackIn_66_0 = stackOut_64_0;
                        break L11;
                      }
                    }
                    break L0;
                  } else {
                    stackOut_61_0 = var5;
                    stackIn_62_0 = stackOut_61_0;
                    return stackIn_62_0 != 0;
                  }
                } else {
                  L12: {
                    if (((uh) this).field_Pb >= param1.field_Pb) {
                      stackOut_46_0 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      break L12;
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L12;
                    }
                  }
                  return stackIn_47_0 != 0;
                }
              } else {
                L13: {
                  if (((uh) this).field_kc) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L13;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L13;
                  }
                }
                return stackIn_40_0 != 0;
              }
            } else {
              stackOut_16_0 = var3_int;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var3;
            stackOut_67_1 = new StringBuilder().append("uh.E(").append(param0).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L14;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L14;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 41);
        }
        return stackIn_66_0 != 0;
    }

    final int a(byte param0) {
        if (param0 != -38) {
            int discarded$0 = ((uh) this).a((byte) -33);
        }
        return (int)((uh) this).f(113);
    }

    public static void b(byte param0) {
        field_Wb = null;
        if (param0 != -69) {
            return;
        }
        field_Xb = null;
        field_lc = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mc = 20;
        field_lc = "You got to level <%0> out of 30!";
        field_Xb = null;
        field_sc = true;
    }
}
