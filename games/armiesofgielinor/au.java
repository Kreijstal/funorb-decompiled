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

    public static void e(byte param0) {
        if (param0 > -52) {
            return;
        }
        field_Jb = null;
        field_Kb = null;
    }

    final boolean k(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -7) {
          L0: {
            this.d((byte) -65);
            if (this.a((byte) 90)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.a((byte) 90)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int d(byte param0) {
        int var2 = -52 / ((35 - param0) / 38);
        return (int)this.a(116);
    }

    au(int param0) {
        super(0L, (je) null);
        this.field_pc = new byte[param0];
    }

    final boolean a(byte param0, au param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_38_0 = 0;
        boolean stackIn_41_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
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
              if (param0 <= -13) {
                break L1;
              } else {
                this.field_pc = (byte[]) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_Nb) {
                if (-7 == (this.field_mc ^ -1)) {
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
              if (!param1.field_Nb) {
                if (-7 == (param1.field_mc ^ -1)) {
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
              if (var3_int != 0) {
                stackIn_17_0 = 0;
                break L4;
              } else {
                stackIn_17_0 = 1;
                break L4;
              }
            }
            if (stackIn_17_0 == var4) {
              stackIn_20_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L5: {
                if (var3_int != 0) {
                  break L5;
                } else {
                  L6: {
                    if (this.field_Sb) {
                      stackIn_25_0 = 0;
                      break L6;
                    } else {
                      stackIn_25_0 = 1;
                      break L6;
                    }
                  }
                  L7: {


                    if (param1.field_Sb) {

                      stackIn_28_1 = 0;
                      break L7;
                    } else {

                      stackIn_28_1 = 1;
                      break L7;
                    }
                  }
                  if (stackIn_25_0 != stackIn_28_1) {
                    stackIn_31_0 = this.field_Sb;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_Sb) {
                      break L5;
                    } else {
                      if (param1.field_Tb != this.field_Tb) {
                        L8: {
                          if (this.field_Tb >= param1.field_Tb) {
                            stackIn_38_0 = 0;
                            break L8;
                          } else {
                            stackIn_38_0 = 1;
                            break L8;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              L9: {
                stackIn_41_0 = param1.field_kc;

                if (this.field_kc) {
                  stackIn_42_0 = stackIn_41_0;
                  stackIn_42_1 = 0;
                  break L9;
                } else {
                  stackIn_42_0 = stackIn_41_0;
                  stackIn_42_1 = 1;
                  break L9;
                }
              }
              if ((stackIn_42_0 ? 1 : 0) == stackIn_42_1) {
                L10: {
                  if (this.field_kc) {
                    stackIn_47_0 = 0;
                    break L10;
                  } else {
                    stackIn_47_0 = 1;
                    break L10;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!this.field_kc) {
                  L11: {
                    if ((this.field_Mb ^ -1L) <= (param1.field_Mb ^ -1L)) {
                      stackIn_71_0 = 0;
                      break L11;
                    } else {
                      stackIn_71_0 = 1;
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  L12: {
                    if (this.field_tc) {
                      stackIn_55_0 = 1;
                      break L12;
                    } else {
                      if (this.field_ac == 2) {
                        stackIn_55_0 = 1;
                        break L12;
                      } else {
                        stackIn_55_0 = 0;
                        break L12;
                      }
                    }
                  }
                  L13: {
                    var5 = stackIn_55_0;
                    if (!param1.field_tc) {
                      if (param1.field_ac == 2) {
                        stackIn_61_0 = 1;
                        break L13;
                      } else {
                        stackIn_61_0 = 0;
                        break L13;
                      }
                    } else {
                      stackIn_61_0 = 1;
                      break L13;
                    }
                  }
                  var6 = stackIn_61_0;
                  if (var5 == var6) {
                    L14: {
                      if ((param1.field_Mb ^ -1L) <= (this.field_Mb ^ -1L)) {
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var3);

            stackIn_74_1 = new StringBuilder().append("au.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_47_0 != 0;
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

    static {
        field_Jb = "Invite more players, or alternatively try changing the following settings:  ";
        field_Ob = 0;
    }
}
