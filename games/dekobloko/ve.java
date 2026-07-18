/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends w {
    int field_Ub;
    String field_Vb;
    w field_Tb;
    w field_Ec;
    static ck[][] field_uc;
    static String field_Gc;
    boolean field_Cc;
    static int[] field_ic;
    static int field_hc;
    boolean field_Zb;
    int field_mc;
    w field_Pb;
    long field_tc;
    w field_ec;
    int field_Nb;
    w field_yc;
    w field_bc;
    boolean field_wc;
    int field_Wb;
    w field_Sb;
    w field_Fc;
    static boolean field_Qb;
    static boolean field_Hc;
    int field_rc;
    boolean field_lc;
    w field_jc;
    w field_pc;
    boolean field_gc;
    boolean field_Ob;
    static w field_vc;
    String[] field_xc;
    w field_Yb;
    int field_oc;
    w field_Bc;
    w field_zc;
    w field_Ac;
    static String field_cc;
    static boolean field_ac;
    boolean field_Ic;
    w[] field_fc;
    w field_Dc;
    int field_qc;
    long field_Xb;
    static ck field_dc;
    int field_Rb;
    byte[] field_kc;
    w field_sc;
    static int field_nc;

    public static void h(byte param0) {
        field_uc = null;
        field_cc = null;
        field_Gc = null;
        field_vc = null;
        field_dc = null;
        field_ic = null;
    }

    final static boolean g(byte param0) {
        int var1 = 0;
        var1 = -89 % ((76 - param0) / 36);
        if (vh.field_h != null) {
          if (!vh.field_h.f(261)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean i(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 98) {
          L0: {
            boolean discarded$8 = ve.g((byte) 106);
            if (((ve) this).d((byte) -68)) {
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
            if (((ve) this).d((byte) -68)) {
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

    final int e(int param0) {
        int var2 = 113 / ((param0 - 24) / 54);
        return (int)((ve) this).c((byte) 57);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            param5--;
            L1: while (true) {
              if (param5 < 0) {
                break L0;
              } else {
                var17 = param7;
                var10_array = var17;
                var11 = param1;
                var12 = param4;
                var13 = param0;
                var14 = param8;
                var15 = 8355711 & var17[var11] >> 1;
                var10_array[var11] = var15 + lb.a(65280, var13 >> 9) + (lb.a(var12 >> 1, 16711680) + lb.a(var14 >> 17, 255));
                param4 = param4 + param3;
                param1++;
                param8 = param8 + param9;
                param0 = param0 + param2;
                param5--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var10;
            stackOut_6_1 = new StringBuilder().append("ve.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(9).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param7 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param8 + ',' + param9 + ')');
        }
    }

    ve(int param0) {
        super(0L, (w) null);
        ((ve) this).field_kc = new byte[param0];
    }

    final static String c(int param0, int param1) {
        return param0 + 1 + "/" + 4;
    }

    final boolean a(ve param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_37_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_25_0 = false;
        boolean stackOut_34_0 = false;
        boolean stackOut_36_0 = false;
        int stackOut_36_1 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_35_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (!((ve) this).field_Zb) {
                  if (((ve) this).field_oc == 6) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var3_int = stackIn_9_0;
                if (!param0.field_Zb) {
                  if (param0.field_oc == 6) {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L2;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_15_0 = stackOut_12_0;
                    break L2;
                  }
                } else {
                  stackOut_10_0 = 1;
                  stackIn_15_0 = stackOut_10_0;
                  break L2;
                }
              }
              var4 = stackIn_15_0;
              if (var4 != var3_int) {
                stackOut_17_0 = var3_int;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                L3: {
                  if (var3_int == 0) {
                    L4: {
                      if (param0.field_gc) {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        break L4;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L4;
                      }
                    }
                    if (stackIn_24_0 != (((ve) this).field_gc ? 1 : 0)) {
                      if (!((ve) this).field_gc) {
                        break L3;
                      } else {
                        if (param0.field_Wb != ((ve) this).field_Wb) {
                          L5: {
                            if (((ve) this).field_Wb >= param0.field_Wb) {
                              stackOut_32_0 = 0;
                              stackIn_33_0 = stackOut_32_0;
                              break L5;
                            } else {
                              stackOut_31_0 = 1;
                              stackIn_33_0 = stackOut_31_0;
                              break L5;
                            }
                          }
                          return stackIn_33_0 != 0;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      stackOut_25_0 = ((ve) this).field_gc;
                      stackIn_26_0 = stackOut_25_0;
                      return stackIn_26_0;
                    }
                  } else {
                    break L3;
                  }
                }
                L6: {
                  stackOut_34_0 = ((ve) this).field_lc;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_35_0 = stackOut_34_0;
                  if (param0.field_lc) {
                    stackOut_36_0 = stackIn_36_0;
                    stackOut_36_1 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L6;
                  } else {
                    stackOut_35_0 = stackIn_35_0;
                    stackOut_35_1 = 1;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    break L6;
                  }
                }
                if ((stackIn_37_0 ? 1 : 0) == stackIn_37_1) {
                  L7: {
                    if (((ve) this).field_lc) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L7;
                    } else {
                      stackOut_40_0 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      break L7;
                    }
                  }
                  return stackIn_42_0 != 0;
                } else {
                  if (((ve) this).field_lc) {
                    L8: {
                      if (((ve) this).field_wc) {
                        stackOut_52_0 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        break L8;
                      } else {
                        if (((ve) this).field_qc == 2) {
                          stackOut_51_0 = 1;
                          stackIn_54_0 = stackOut_51_0;
                          break L8;
                        } else {
                          stackOut_50_0 = 0;
                          stackIn_54_0 = stackOut_50_0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var5 = stackIn_54_0;
                      if (!param0.field_wc) {
                        if (param0.field_qc == 2) {
                          stackOut_58_0 = 1;
                          stackIn_60_0 = stackOut_58_0;
                          break L9;
                        } else {
                          stackOut_57_0 = 0;
                          stackIn_60_0 = stackOut_57_0;
                          break L9;
                        }
                      } else {
                        stackOut_55_0 = 1;
                        stackIn_60_0 = stackOut_55_0;
                        break L9;
                      }
                    }
                    L10: {
                      var6 = stackIn_60_0;
                      if (var5 != 0) {
                        stackOut_62_0 = 0;
                        stackIn_63_0 = stackOut_62_0;
                        break L10;
                      } else {
                        stackOut_61_0 = 1;
                        stackIn_63_0 = stackOut_61_0;
                        break L10;
                      }
                    }
                    if (stackIn_63_0 == var6) {
                      stackOut_65_0 = var5;
                      stackIn_66_0 = stackOut_65_0;
                      return stackIn_66_0 != 0;
                    } else {
                      L11: {
                        if (~param0.field_tc <= ~((ve) this).field_tc) {
                          stackOut_69_0 = 0;
                          stackIn_70_0 = stackOut_69_0;
                          break L11;
                        } else {
                          stackOut_68_0 = 1;
                          stackIn_70_0 = stackOut_68_0;
                          break L11;
                        }
                      }
                      break L0;
                    }
                  } else {
                    L12: {
                      if (param0.field_tc <= ((ve) this).field_tc) {
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
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var3;
            stackOut_71_1 = new StringBuilder().append("ve.D(");
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param0 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L13;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L13;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param1 + ')');
        }
        return stackIn_70_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hc = 10;
        field_uc = new ck[8][];
        field_cc = "You are on <%0>";
        field_ic = new int[]{0, 0, 5, 9, 12, 14, 15, 15, 14, 12, 8, 4, 2, 1};
        field_nc = 1;
    }
}
