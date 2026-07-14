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
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (0 == (3 & (param1.field_z | (param1.field_C | (param1.field_y | param1.field_t))))) {
          return;
        } else {
          var2 = (3 & param1.field_C) + param1.field_y;
          var3 = param1.field_t - -(3 & param1.field_z);
          var2 = var2 - (-4 - -(3 & var2));
          var3 = var3 - ((var3 & 3) + -4);
          var4 = new int[var3 * var2];
          var5 = 0;
          var6 = (3 & param1.field_z) * var2 + (3 & param1.field_C);
          var7 = 0;
          L0: while (true) {
            if (var7 >= param1.field_t) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  String discarded$1 = uh.a((byte) 113, 97L);
                  break L1;
                }
              }
              param1.field_z = param1.field_z & -4;
              param1.field_t = var3;
              param1.field_F = var4;
              param1.field_y = var2;
              param1.field_C = param1.field_C & -4;
              return;
            } else {
              var8 = 0;
              L2: while (true) {
                if (var8 >= param1.field_y) {
                  var6 = var6 + (-param1.field_y + var2);
                  var7++;
                  continue L0;
                } else {
                  var6++;
                  var5++;
                  var4[var6] = param1.field_F[var5];
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0, uh param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_21_0 = false;
        boolean stackIn_22_0 = false;
        int stackIn_22_1 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_32_0 = false;
        boolean stackIn_33_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_19_0 = false;
        boolean stackOut_21_0 = false;
        int stackOut_21_1 = 0;
        boolean stackOut_20_0 = false;
        int stackOut_20_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        boolean stackOut_31_0 = false;
        boolean stackOut_33_0 = false;
        int stackOut_33_1 = 0;
        boolean stackOut_32_0 = false;
        int stackOut_32_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          if (!((uh) this).field_Sb) {
            if (-7 == (((uh) this).field_Lb ^ -1)) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_6_0;
          if (!param1.field_Sb) {
            if (6 == param1.field_Lb) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L1;
            }
          } else {
            stackOut_7_0 = 1;
            stackIn_12_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          var4 = stackIn_12_0;
          if (var4 != 0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L2;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L2;
          }
        }
        if (stackIn_15_0 != var3) {
          L3: {
            if (var3 == 0) {
              L4: {
                stackOut_19_0 = param1.field_dc;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (((uh) this).field_dc) {
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  break L4;
                } else {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L4;
                }
              }
              if ((stackIn_22_0 ? 1 : 0) == stackIn_22_1) {
                return ((uh) this).field_dc;
              } else {
                if (!((uh) this).field_dc) {
                  break L3;
                } else {
                  if (((uh) this).field_Ub == param1.field_Ub) {
                    break L3;
                  } else {
                    L5: {
                      if (((uh) this).field_Ub >= param1.field_Ub) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L5;
                      }
                    }
                    return stackIn_30_0 != 0;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L6: {
            stackOut_31_0 = ((uh) this).field_kc;
            stackIn_33_0 = stackOut_31_0;
            stackIn_32_0 = stackOut_31_0;
            if (param1.field_kc) {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = 0;
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              break L6;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = 1;
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              break L6;
            }
          }
          if ((stackIn_34_0 ? 1 : 0) != stackIn_34_1) {
            L7: {
              if (param0) {
                break L7;
              } else {
                uh.b((byte) -114);
                break L7;
              }
            }
            if (((uh) this).field_kc) {
              L8: {
                if (((uh) this).field_vc) {
                  stackOut_50_0 = 1;
                  stackIn_52_0 = stackOut_50_0;
                  break L8;
                } else {
                  if (-3 == (((uh) this).field_xc ^ -1)) {
                    stackOut_49_0 = 1;
                    stackIn_52_0 = stackOut_49_0;
                    break L8;
                  } else {
                    stackOut_48_0 = 0;
                    stackIn_52_0 = stackOut_48_0;
                    break L8;
                  }
                }
              }
              L9: {
                var5 = stackIn_52_0;
                if (!param1.field_vc) {
                  if (-3 == (param1.field_xc ^ -1)) {
                    stackOut_56_0 = 1;
                    stackIn_58_0 = stackOut_56_0;
                    break L9;
                  } else {
                    stackOut_55_0 = 0;
                    stackIn_58_0 = stackOut_55_0;
                    break L9;
                  }
                } else {
                  stackOut_53_0 = 1;
                  stackIn_58_0 = stackOut_53_0;
                  break L9;
                }
              }
              var6 = stackIn_58_0;
              if (var6 == var5) {
                L10: {
                  if ((((uh) this).field_Pb ^ -1L) >= (param1.field_Pb ^ -1L)) {
                    stackOut_62_0 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    break L10;
                  } else {
                    stackOut_61_0 = 1;
                    stackIn_63_0 = stackOut_61_0;
                    break L10;
                  }
                }
                return stackIn_63_0 != 0;
              } else {
                return var5 != 0;
              }
            } else {
              L11: {
                if (((uh) this).field_Pb >= param1.field_Pb) {
                  stackOut_44_0 = 0;
                  stackIn_45_0 = stackOut_44_0;
                  break L11;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  break L11;
                }
              }
              return stackIn_45_0 != 0;
            }
          } else {
            L12: {
              if (((uh) this).field_kc) {
                stackOut_37_0 = 0;
                stackIn_38_0 = stackOut_37_0;
                break L12;
              } else {
                stackOut_36_0 = 1;
                stackIn_38_0 = stackOut_36_0;
                break L12;
              }
            }
            return stackIn_38_0 != 0;
          }
        } else {
          return var3 != 0;
        }
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
