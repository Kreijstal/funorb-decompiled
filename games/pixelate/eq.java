/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends ak {
    ak field_Jb;
    boolean field_Ob;
    static String field_Hb;
    static String field_Xb;
    ak field_Wb;
    boolean field_Mb;
    long field_Lb;
    boolean field_dc;
    ak field_ic;
    int field_nc;
    ak[] field_ac;
    ak field_jc;
    boolean field_cc;
    ak field_Kb;
    ak field_Nb;
    String field_pc;
    int field_ec;
    int field_Qb;
    int field_Rb;
    static String field_fc;
    ak field_Gb;
    ak field_Fb;
    boolean field_Pb;
    ak field_Yb;
    ak field_Zb;
    ak field_gc;
    long field_kc;
    String[] field_Ub;
    ak field_Vb;
    int field_bc;
    ak field_rc;
    boolean field_oc;
    int field_mc;
    int field_Ib;
    byte[] field_Eb;
    ak field_Sb;
    ak field_qc;
    int field_Tb;
    boolean field_hc;
    ak field_lc;

    final int c(byte param0) {
        if (param0 != 8) {
            this.field_Eb = (byte[]) null;
            return (int)this.a(true);
        }
        return (int)this.a(true);
    }

    eq(int param0) {
        super(0L, (ak) null);
        this.field_Eb = new byte[param0];
    }

    final boolean j(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 433) {
          L0: {
            this.field_Wb = (ak) null;
            if (this.f(0)) {
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
            if (this.f(0)) {
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

    public static void b(byte param0) {
        field_Xb = null;
        field_Hb = null;
        field_fc = null;
        int var1 = -86 / ((28 - param0) / 46);
    }

    final boolean a(byte param0, eq param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
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
              if (!this.field_cc) {
                if (6 == this.field_Qb) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_6_0;
              if (!param1.field_cc) {
                if (param1.field_Qb == 6) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  break L2;
                }
              } else {
                stackIn_12_0 = 1;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_12_0;
              if (var4 != 0) {
                stackIn_15_0 = 0;
                break L3;
              } else {
                stackIn_15_0 = 1;
                break L3;
              }
            }
            if (stackIn_15_0 == var3_int) {
              stackIn_18_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                if (param0 > 23) {
                  break L4;
                } else {
                  this.field_Qb = 92;
                  break L4;
                }
              }
              L5: {
                if (var3_int != 0) {
                  break L5;
                } else {
                  L6: {
                    if (this.field_hc) {
                      stackIn_25_0 = 0;
                      break L6;
                    } else {
                      stackIn_25_0 = 1;
                      break L6;
                    }
                  }
                  L7: {


                    if (param1.field_hc) {

                      stackIn_28_1 = 0;
                      break L7;
                    } else {

                      stackIn_28_1 = 1;
                      break L7;
                    }
                  }
                  if (stackIn_25_0 != stackIn_28_1) {
                    stackIn_31_0 = this.field_hc;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_hc) {
                      break L5;
                    } else {
                      if (this.field_Ib != param1.field_Ib) {
                        L8: {
                          if (param1.field_Ib <= this.field_Ib) {
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
                if (param1.field_dc) {
                  stackIn_42_0 = 0;
                  break L9;
                } else {
                  stackIn_42_0 = 1;
                  break L9;
                }
              }
              if (stackIn_42_0 == (this.field_dc ? 1 : 0)) {
                L10: {
                  if (this.field_dc) {
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
                if (!this.field_dc) {
                  L11: {
                    if (param1.field_Lb <= this.field_Lb) {
                      stackIn_75_0 = 0;
                      break L11;
                    } else {
                      stackIn_75_0 = 1;
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  L12: {
                    if (this.field_Mb) {
                      stackIn_55_0 = 1;
                      break L12;
                    } else {
                      if (2 == this.field_Tb) {
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
                    if (!param1.field_Mb) {
                      if (-3 == (param1.field_Tb ^ -1)) {
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
                  L14: {
                    var6 = stackIn_61_0;
                    stackIn_63_0 = var5;

                    if (var6 != 0) {
                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = 0;
                      break L14;
                    } else {
                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = 1;
                      break L14;
                    }
                  }
                  if (stackIn_64_0 == stackIn_64_1) {
                    stackIn_67_0 = var5;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L15: {
                      if (param1.field_Lb >= this.field_Lb) {
                        stackIn_71_0 = 0;
                        break L15;
                      } else {
                        stackIn_71_0 = 1;
                        break L15;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackIn_78_0 = (RuntimeException) (var3);

            stackIn_78_1 = new StringBuilder().append("eq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L16;
            } else {
              stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L16;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
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
                  return stackIn_67_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_71_0 != 0;
                  } else {
                    return stackIn_75_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_Xb = "Allow spectators?";
    }
}
