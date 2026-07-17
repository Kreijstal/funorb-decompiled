/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au extends je {
    int field_Ub;
    boolean field_vc;
    je field_ec;
    je field_Wb;
    int field_qc;
    static ih field_Kb;
    je field_sc;
    static String field_Jb;
    je field_hc;
    int field_mc;
    je field_Rb;
    je field_fc;
    int field_ac;
    byte[] field_pc;
    je field_Xb;
    int field_Lb;
    String[] field_jc;
    long field_dc;
    je field_ic;
    boolean field_Sb;
    je field_oc;
    boolean field_uc;
    int field_bc;
    je field_Pb;
    int field_nc;
    je field_cc;
    je[] field_Qb;
    je field_Zb;
    int field_Tb;
    boolean field_kc;
    String field_rc;
    long field_Mb;
    je field_Yb;
    je field_lc;
    static int field_Ob;
    boolean field_gc;
    boolean field_Nb;
    boolean field_tc;
    je field_Vb;
    je field_Ib;

    public static void e() {
        field_Jb = null;
        field_Kb = null;
    }

    final boolean k(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -7) {
          L0: {
            int discarded$10 = ((au) this).d((byte) -65);
            if (((au) this).a((byte) 90)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((au) this).a((byte) 90)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int d(byte param0) {
        int var2 = -52 / ((35 - param0) / 38);
        return (int)((au) this).a(116);
    }

    au(int param0) {
        super(0L, (je) null);
        ((au) this).field_pc = new byte[param0];
    }

    final boolean a(byte param0, au param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_38_0 = 0;
        boolean stackIn_40_0 = false;
        boolean stackIn_41_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
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
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        boolean stackOut_39_0 = false;
        boolean stackOut_41_0 = false;
        int stackOut_41_1 = 0;
        boolean stackOut_40_0 = false;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
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
              if (param0 <= -13) {
                break L1;
              } else {
                ((au) this).field_pc = null;
                break L1;
              }
            }
            L2: {
              if (!((au) this).field_Nb) {
                if (-7 == ((au) this).field_mc) {
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
              if (!param1.field_Nb) {
                if (-7 == param1.field_mc) {
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
              if (var3_int != 0) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              } else {
                stackOut_15_0 = 1;
                stackIn_17_0 = stackOut_15_0;
                break L4;
              }
            }
            if (stackIn_17_0 == var4) {
              stackOut_19_0 = var3_int;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            } else {
              L5: {
                if (var3_int != 0) {
                  break L5;
                } else {
                  L6: {
                    if (((au) this).field_Sb) {
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L6;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L6;
                    }
                  }
                  L7: {
                    stackOut_25_0 = stackIn_25_0;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (param1.field_Sb) {
                      stackOut_27_0 = stackIn_27_0;
                      stackOut_27_1 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      break L7;
                    } else {
                      stackOut_26_0 = stackIn_26_0;
                      stackOut_26_1 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      break L7;
                    }
                  }
                  if (stackIn_28_0 != stackIn_28_1) {
                    stackOut_30_0 = ((au) this).field_Sb;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  } else {
                    if (!((au) this).field_Sb) {
                      break L5;
                    } else {
                      if (param1.field_Tb != ((au) this).field_Tb) {
                        L8: {
                          if (((au) this).field_Tb >= param1.field_Tb) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            break L8;
                          } else {
                            stackOut_36_0 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            break L8;
                          }
                        }
                        return stackIn_38_0 != 0;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L9: {
                stackOut_39_0 = param1.field_kc;
                stackIn_41_0 = stackOut_39_0;
                stackIn_40_0 = stackOut_39_0;
                if (((au) this).field_kc) {
                  stackOut_41_0 = stackIn_41_0;
                  stackOut_41_1 = 0;
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  break L9;
                } else {
                  stackOut_40_0 = stackIn_40_0;
                  stackOut_40_1 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  break L9;
                }
              }
              if ((stackIn_42_0 ? 1 : 0) == stackIn_42_1) {
                L10: {
                  if (((au) this).field_kc) {
                    stackOut_46_0 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    break L10;
                  } else {
                    stackOut_45_0 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    break L10;
                  }
                }
                return stackIn_47_0 != 0;
              } else {
                if (!((au) this).field_kc) {
                  L11: {
                    if (~((au) this).field_Mb <= ~param1.field_Mb) {
                      stackOut_70_0 = 0;
                      stackIn_71_0 = stackOut_70_0;
                      break L11;
                    } else {
                      stackOut_69_0 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      break L11;
                    }
                  }
                  break L0;
                } else {
                  L12: {
                    if (((au) this).field_tc) {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L12;
                    } else {
                      if (((au) this).field_ac == 2) {
                        stackOut_52_0 = 1;
                        stackIn_55_0 = stackOut_52_0;
                        break L12;
                      } else {
                        stackOut_51_0 = 0;
                        stackIn_55_0 = stackOut_51_0;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    var5 = stackIn_55_0;
                    if (!param1.field_tc) {
                      if (param1.field_ac == 2) {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L13;
                      } else {
                        stackOut_58_0 = 0;
                        stackIn_61_0 = stackOut_58_0;
                        break L13;
                      }
                    } else {
                      stackOut_56_0 = 1;
                      stackIn_61_0 = stackOut_56_0;
                      break L13;
                    }
                  }
                  var6 = stackIn_61_0;
                  if (var5 == var6) {
                    L14: {
                      if (~param1.field_Mb <= ~((au) this).field_Mb) {
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var3;
            stackOut_72_1 = new StringBuilder().append("au.B(").append(param0).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 41);
        }
        return stackIn_71_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Invite more players, or alternatively try changing the following settings:  ";
        field_Ob = 0;
    }
}
