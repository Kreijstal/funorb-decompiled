/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends sna {
    sna field_wb;
    sna field_xb;
    sna field_Ib;
    static String field_Vb;
    boolean field_Bb;
    boolean field_Fb;
    long field_Sb;
    int field_Pb;
    sna field_ac;
    sna field_Tb;
    sna field_Qb;
    sna field_yb;
    sna field_Hb;
    String[] field_Cb;
    sna field_cc;
    sna field_Ub;
    boolean field_gc;
    static kv[][] field_Xb;
    sna field_hc;
    byte[] field_Eb;
    long field_Ob;
    sna field_Yb;
    sna field_Gb;
    boolean field_Zb;
    sna field_vb;
    boolean field_dc;
    sna field_Db;
    String field_Jb;
    sna field_fc;
    int field_Rb;
    int field_Lb;
    boolean field_Wb;
    int field_Mb;
    int field_Kb;
    sna[] field_Ab;
    boolean field_zb;
    int field_ec;
    int field_bc;
    int field_Nb;

    public static void g(byte param0) {
        if (param0 <= 32) {
            field_Vb = null;
            field_Vb = null;
            field_Xb = null;
            return;
        }
        field_Vb = null;
        field_Xb = null;
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        mh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        mh stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var2 = qi.a(param0, (byte) 90);
              if (param1 == -7) {
                break L1;
              } else {
                uha.g((byte) 6);
                break L1;
              }
            }
            L2: {
              if (param0.b(16711935) == 1) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = new mh(var2, var3 != 0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("uha.BA(");
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
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return (pp) (Object) stackIn_6_0;
    }

    final boolean a(int param0, uha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
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
            L1: {
              if (!((uha) this).field_Wb) {
                if (-7 == ((uha) this).field_ec) {
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
              if (!param1.field_Wb) {
                if (-7 == param1.field_ec) {
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
              stackOut_12_0 = var4;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var3_int != 0) {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L3;
              } else {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L3;
              }
            }
            if (stackIn_15_0 == stackIn_15_1) {
              stackOut_17_0 = var3_int;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            } else {
              L4: {
                if (var3_int == 0) {
                  if (param1.field_zb == ((uha) this).field_zb) {
                    if (!((uha) this).field_zb) {
                      break L4;
                    } else {
                      if (((uha) this).field_Kb == param1.field_Kb) {
                        break L4;
                      } else {
                        L5: {
                          if (((uha) this).field_Kb >= param1.field_Kb) {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            break L5;
                          } else {
                            stackOut_27_0 = 1;
                            stackIn_29_0 = stackOut_27_0;
                            break L5;
                          }
                        }
                        return stackIn_29_0 != 0;
                      }
                    }
                  } else {
                    stackOut_22_0 = ((uha) this).field_zb;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (param1.field_Zb) {
                  stackOut_32_0 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                stackOut_33_0 = stackIn_33_0;
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (((uha) this).field_Zb) {
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
              if (stackIn_36_0 != stackIn_36_1) {
                L8: {
                  if (((uha) this).field_Zb) {
                    stackOut_40_0 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    break L8;
                  } else {
                    stackOut_39_0 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    break L8;
                  }
                }
                return stackIn_41_0 != 0;
              } else {
                L9: {
                  if (param0 == -7) {
                    break L9;
                  } else {
                    var7 = null;
                    pp discarded$1 = uha.b((lu) null, -6);
                    break L9;
                  }
                }
                if (((uha) this).field_Zb) {
                  L10: {
                    if (((uha) this).field_Fb) {
                      stackOut_53_0 = 1;
                      stackIn_55_0 = stackOut_53_0;
                      break L10;
                    } else {
                      if (2 == ((uha) this).field_Lb) {
                        stackOut_52_0 = 1;
                        stackIn_55_0 = stackOut_52_0;
                        break L10;
                      } else {
                        stackOut_51_0 = 0;
                        stackIn_55_0 = stackOut_51_0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var5 = stackIn_55_0;
                    if (!param1.field_Fb) {
                      if (2 == param1.field_Lb) {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L11;
                      } else {
                        stackOut_58_0 = 0;
                        stackIn_61_0 = stackOut_58_0;
                        break L11;
                      }
                    } else {
                      stackOut_56_0 = 1;
                      stackIn_61_0 = stackOut_56_0;
                      break L11;
                    }
                  }
                  L12: {
                    var6 = stackIn_61_0;
                    stackOut_61_0 = var5;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    if (var6 != 0) {
                      stackOut_63_0 = stackIn_63_0;
                      stackOut_63_1 = 0;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      break L12;
                    } else {
                      stackOut_62_0 = stackIn_62_0;
                      stackOut_62_1 = 1;
                      stackIn_64_0 = stackOut_62_0;
                      stackIn_64_1 = stackOut_62_1;
                      break L12;
                    }
                  }
                  if (stackIn_64_0 != stackIn_64_1) {
                    L13: {
                      if (((uha) this).field_Ob <= param1.field_Ob) {
                        stackOut_69_0 = 0;
                        stackIn_70_0 = stackOut_69_0;
                        break L13;
                      } else {
                        stackOut_68_0 = 1;
                        stackIn_70_0 = stackOut_68_0;
                        break L13;
                      }
                    }
                    break L0;
                  } else {
                    stackOut_65_0 = var5;
                    stackIn_66_0 = stackOut_65_0;
                    return stackIn_66_0 != 0;
                  }
                } else {
                  L14: {
                    if (((uha) this).field_Ob >= param1.field_Ob) {
                      stackOut_47_0 = 0;
                      stackIn_48_0 = stackOut_47_0;
                      break L14;
                    } else {
                      stackOut_46_0 = 1;
                      stackIn_48_0 = stackOut_46_0;
                      break L14;
                    }
                  }
                  return stackIn_48_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var3;
            stackOut_71_1 = new StringBuilder().append("uha.AA(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L15;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_70_0 != 0;
    }

    final int f(byte param0) {
        if (param0 >= -44) {
            return -126;
        }
        return (int)((uha) this).d(-115);
    }

    uha(int param0) {
        super(0L, (sna) null);
        ((uha) this).field_Eb = new byte[param0];
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 24) {
          L0: {
            ((uha) this).field_Zb = true;
            if (((uha) this).a(0)) {
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
            if (((uha) this).a(0)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = "Public";
    }
}
