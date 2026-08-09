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
        this.field_fc = new byte[param0];
    }

    final boolean k(int param0) {
        if (param0 != 4043) {
            this.k(22);
        }
        return !this.e(param0 ^ -3977) ? true : false;
    }

    final static void a(boolean param0, er param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (0 == (3 & (param1.field_z | (param1.field_C | (param1.field_y | param1.field_t))))) {
              decompiledRegionSelector0 = 0;
              break L0;
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
                      uh.a((byte) 113, 97L);
                      break L2;
                    }
                  }
                  param1.field_z = param1.field_z & -4;
                  param1.field_t = var3;
                  param1.field_F = var4;
                  param1.field_y = var2_int;
                  param1.field_C = param1.field_C & -4;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= param1.field_y) {
                      var6 = var6 + (-param1.field_y + var2_int);
                      var7++;
                      continue L1;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      incrementValue$1 = var5;
                      var5++;
                      var4[incrementValue$0] = param1.field_F[incrementValue$1];
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("uh.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(boolean param0, uh param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_0 = false;
        int stackIn_23_1 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        int stackIn_36_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
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
              if (!this.field_Sb) {
                if (-7 == (this.field_Lb ^ -1)) {
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
              if (!param1.field_Sb) {
                if (6 == param1.field_Lb) {
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
            if (stackIn_15_0 != var3_int) {
              L4: {
                if (var3_int == 0) {
                  L5: {
                    stackIn_22_0 = param1.field_dc;

                    if (this.field_dc) {
                      stackIn_23_0 = stackIn_22_0;
                      stackIn_23_1 = 0;
                      break L5;
                    } else {
                      stackIn_23_0 = stackIn_22_0;
                      stackIn_23_1 = 1;
                      break L5;
                    }
                  }
                  if ((stackIn_23_0 ? 1 : 0) == stackIn_23_1) {
                    stackIn_26_0 = this.field_dc;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_dc) {
                      break L4;
                    } else {
                      if (this.field_Ub == param1.field_Ub) {
                        break L4;
                      } else {
                        L6: {
                          if (this.field_Ub >= param1.field_Ub) {
                            stackIn_32_0 = 0;
                            break L6;
                          } else {
                            stackIn_32_0 = 1;
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                stackIn_35_0 = this.field_kc;

                if (param1.field_kc) {
                  stackIn_36_0 = stackIn_35_0;
                  stackIn_36_1 = 0;
                  break L7;
                } else {
                  stackIn_36_0 = stackIn_35_0;
                  stackIn_36_1 = 1;
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
                if (this.field_kc) {
                  L9: {
                    if (this.field_vc) {
                      stackIn_54_0 = 1;
                      break L9;
                    } else {
                      if (-3 == (this.field_xc ^ -1)) {
                        stackIn_54_0 = 1;
                        break L9;
                      } else {
                        stackIn_54_0 = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var5 = stackIn_54_0;
                    if (!param1.field_vc) {
                      if (-3 == (param1.field_xc ^ -1)) {
                        stackIn_60_0 = 1;
                        break L10;
                      } else {
                        stackIn_60_0 = 0;
                        break L10;
                      }
                    } else {
                      stackIn_60_0 = 1;
                      break L10;
                    }
                  }
                  var6 = stackIn_60_0;
                  if (var6 == var5) {
                    L11: {
                      if ((this.field_Pb ^ -1L) >= (param1.field_Pb ^ -1L)) {
                        stackIn_66_0 = 0;
                        break L11;
                      } else {
                        stackIn_66_0 = 1;
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    stackIn_62_0 = var5;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  L12: {
                    if (this.field_Pb >= param1.field_Pb) {
                      stackIn_47_0 = 0;
                      break L12;
                    } else {
                      stackIn_47_0 = 1;
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                L13: {
                  if (this.field_kc) {
                    stackIn_40_0 = 0;
                    break L13;
                  } else {
                    stackIn_40_0 = 1;
                    break L13;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackIn_17_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var3);

            stackIn_69_1 = new StringBuilder().append("uh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L14;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L14;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_26_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_47_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_62_0 != 0;
                  } else {
                    return stackIn_66_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != -38) {
            this.a((byte) -33);
        }
        return (int)this.f(113);
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
        field_mc = 20;
        field_lc = "You got to level <%0> out of 30!";
        field_Xb = null;
        field_sc = true;
    }
}
