/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends cj {
    private mi field_Hb;
    static String field_Ib;
    private cj[] field_Jb;
    static ja[][] field_Qb;
    private cj field_Rb;
    static String field_Ob;
    private cj field_Pb;
    static ja field_Tb;
    private cj field_Sb;
    private cj field_Kb;
    long field_Fb;
    private int field_Lb;
    private StringBuilder field_Nb;
    static String field_Gb;
    private cj field_Vb;
    static String field_Ub;
    private cj field_Mb;

    final boolean k(int param0) {
        L0: {
          if (param0 >= 99) {
            break L0;
          } else {
            field_Ub = (String) null;
            break L0;
          }
        }
        if (-2 == this.field_Lb) {
          if (sj.field_p == 13) {
            this.field_Lb = -1;
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        mi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_13_0 = null;
        cj stackIn_16_0 = null;
        cj stackIn_17_0 = null;
        cj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_31_0 = null;
        mi stackOut_6_0 = null;
        mi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_12_0 = null;
        cj stackOut_15_0 = null;
        cj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_30_0 = null;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -58) {
            break L0;
          } else {
            this.field_Mb = (cj) null;
            break L0;
          }
        }
        L1: {
          L2: {
            this.a(-11838, param1);
            if (null == this.field_Sb) {
              break L2;
            } else {
              L3: {
                this.field_Sb.field_wb = this.field_Nb.toString();
                this.field_Sb.field_x = (this.field_zb - this.field_Sb.field_yb.a(this.field_Sb.field_wb)) / 2;
                this.field_Sb.field_zb = this.field_zb + -this.field_Sb.field_x;
                if (this.field_Hb != null) {
                  if (this.field_Hb.field_T == 0) {
                    break L3;
                  } else {
                    L4: {
                      stackOut_6_0 = this.field_Hb;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (this.field_Hb.field_Ab) {
                        stackOut_8_0 = (mi) ((Object) stackIn_8_0);
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L4;
                      } else {
                        stackOut_7_0 = (mi) ((Object) stackIn_7_0);
                        stackOut_7_1 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L4;
                      }
                    }
                    stackIn_9_0.field_Ab = stackIn_9_1 != 0;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var3 = 0;
              L5: while (true) {
                if (var3 >= mo.field_Kb) {
                  break L2;
                } else {
                  stackOut_12_0 = this;
                  stackIn_31_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L6: {
                      if (((fa) (this)).field_Jb[var3] != null) {
                        L7: {
                          stackOut_15_0 = this.field_Jb[var3];
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if ((this.field_Nb.length() ^ -1) >= -1) {
                            stackOut_17_0 = (cj) ((Object) stackIn_17_0);
                            stackOut_17_1 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            break L7;
                          } else {
                            stackOut_16_0 = (cj) ((Object) stackIn_16_0);
                            stackOut_16_1 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            break L7;
                          }
                        }
                        stackIn_18_0.field_Z = stackIn_18_1 != 0;
                        if (!this.field_Jb[var3].field_Z) {
                          break L6;
                        } else {
                          if (this.field_Jb[var3].field_T != 0) {
                            return var3;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    var3++;
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          if (-1 == (this.field_Mb.field_T ^ -1)) {
            L8: {
              if (!param1) {
                break L8;
              } else {
                if (kd.field_b == 0) {
                  break L8;
                } else {
                  if (-1 == (this.field_T ^ -1)) {
                    return -1;
                  } else {
                    break L8;
                  }
                }
              }
            }
            stackOut_30_0 = this;
            stackIn_31_0 = stackOut_30_0;
            break L1;
          } else {
            return -1;
          }
        }
        return ((fa) (this)).field_Lb;
    }

    final static int d(boolean param0) {
        if (param0) {
            return -111;
        }
        return fl.field_a + -ZombieDawnMulti.field_H;
    }

    final String h(int param0) {
        if (param0 != -26895) {
            return (String) null;
        }
        return this.field_Nb.toString();
    }

    final boolean i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -23217) {
            break L0;
          } else {
            this.field_Nb = (StringBuilder) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Hb) {
              break L2;
            } else {
              if (!this.field_Hb.field_Ab) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final int a(String param0, int param1, int param2, cj param3, cj param4, int param5) {
        cj var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param5 > 95) {
              var7 = new cj(0L, param4, 0, param1, param2, 24, param0);
              param1 += 32;
              param3.a((byte) 50, var7);
              stackOut_3_0 = param1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 20;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7_ref);
            stackOut_5_1 = new StringBuilder().append("fa.CA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static fn a(Throwable param0, String param1) {
        fn var2 = null;
        if (param0 instanceof fn) {
            var2 = (fn) ((Object) param0);
            var2.field_k = var2.field_k + ' ' + param1;
        } else {
            var2 = new fn(param0, param1);
        }
        return var2;
    }

    final static boolean b(int param0, int param1) {
        try {
            if (param1 <= s.field_e.field_j) {
                return true;
            }
            if (null == ki.field_h) {
                return false;
            }
            int var2_int = ki.field_h.a(124);
            if (0 < var2_int) {
                if (!(var2_int <= -s.field_e.field_j + param1)) {
                    var2_int = param1 + -s.field_e.field_j;
                }
                ki.field_h.a(var2_int, s.field_e.field_j, s.field_e.field_m, 120);
                mo.field_Gb = bl.a((byte) 80);
                s.field_e.field_j = s.field_e.field_j + var2_int;
                if (s.field_e.field_j < param1) {
                    return false;
                }
                s.field_e.field_j = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (param0 != 10) {
                    field_Gb = (String) null;
                }
                if ((var2_int ^ -1) <= -1) {
                    if (-30001L <= (he.b((byte) -22) ^ -1L)) {
                        return false;
                    }
                }
                ak.a((byte) -124);
            } catch (IOException iOException) {
                ak.a((byte) -111);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_Qb = (ja[][]) null;
        field_Gb = null;
        int var1 = -52 % ((-4 - param0) / 45);
        field_Tb = null;
        field_Ub = null;
        field_Ob = null;
        field_Ib = null;
    }

    final static String a(int param0, int param1, int param2) {
        int var3 = -124 % ((55 - param0) / 63);
        return param2 + "/" + param1;
    }

    fa(int param0, int param1, int param2, int param3, int param4, cj param5, cj param6, cj param7, cj param8, mi param9, cj param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        cj[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        cj[] var28 = null;
        Object stackIn_6_0 = null;
        mi stackIn_6_1 = null;
        mi stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        mi stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        mi stackIn_7_1 = null;
        mi stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        mi stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        mi stackIn_8_1 = null;
        mi stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        mi stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        mi stackIn_9_1 = null;
        mi stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        mi stackIn_9_4 = null;
        String stackIn_9_5 = null;
        cj stackIn_15_0 = null;
        cj stackIn_16_0 = null;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        mi stackOut_5_1 = null;
        mi stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        mi stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        mi stackOut_6_1 = null;
        mi stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        mi stackOut_6_4 = null;
        Object stackOut_8_0 = null;
        mi stackOut_8_1 = null;
        mi stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        mi stackOut_8_4 = null;
        String stackOut_8_5 = null;
        Object stackOut_7_0 = null;
        mi stackOut_7_1 = null;
        mi stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        mi stackOut_7_4 = null;
        String stackOut_7_5 = null;
        cj stackOut_14_0 = null;
        cj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var27 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Lb = -2;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Fb = param12;
                this.field_Kb = new cj(0L, param6, vc.field_g.toUpperCase());
                this.field_Kb.field_R = 1;
                this.a((byte) 50, this.field_Kb);
                this.field_Mb = new cj(0L, param7);
                this.field_Kb.a((byte) 50, this.field_Mb);
                this.field_Rb = new cj(0L, (cj) null);
                this.a((byte) 50, this.field_Rb);
                if (param11 != null) {
                  break L2;
                } else {
                  this.field_Vb = new cj(0L, param8, ng.field_f);
                  this.field_Vb.field_R = 1;
                  this.field_Vb.field_M = 11184810;
                  this.field_Rb.a((byte) 50, this.field_Vb);
                  var15_int = 226;
                  var16 = 10;
                  var17 = this.field_Vb.field_yb.b(this.field_Vb.field_wb, var15_int);
                  this.field_Vb.a(var17 * jk.field_f, var16, var15_int, 13, -3344);
                  var16 = var16 + var17 * jk.field_f;
                  this.field_Rb.a(10 - -var16, 24, 13 + (var15_int + 13), 0, -3344);
                  this.field_Rb.field_ab = tg.a(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 92);
                  var18 = 13 - (-var15_int - 13);
                  var19 = 34 - -var16;
                  var20 = qp.a(param0, (byte) 25, var18, param2);
                  var21 = br.a(true, param1, param3, var19);
                  this.a(var19, var21, var18, var20, -3344);
                  if (var27 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  this.field_Vb = new cj(0L, param8, wg.field_a);
                  this.field_Vb.field_M = 11184810;
                  this.field_Vb.field_R = 1;
                  this.field_Rb.a((byte) 50, this.field_Vb);
                  this.field_Pb = new cj(0L, param8, bf.field_q);
                  this.field_Pb.field_M = 11184810;
                  this.field_Pb.field_R = 1;
                  this.field_Rb.a((byte) 50, this.field_Pb);
                  this.field_Sb = new cj(0L, param8);
                  this.field_Sb.field_M = 16764006;
                  this.field_Rb.a((byte) 50, this.field_Sb);
                  this.field_Sb.field_vb = "|";
                  if (5 <= am.field_b) {
                    break L4;
                  } else {
                    if ((kj.field_q ^ -1) > -3) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = 0L;
                    stackOut_5_4 = (mi) (param9);
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    if (am.field_b >= 7) {
                      break L6;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (mi) ((Object) stackIn_6_4);
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      if ((kj.field_q ^ -1) > -3) {
                        stackOut_8_0 = this;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = stackIn_8_3;
                        stackOut_8_4 = (mi) ((Object) stackIn_8_4);
                        stackOut_8_5 = dk.field_Kb;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        stackIn_9_4 = stackOut_8_4;
                        stackIn_9_5 = stackOut_8_5;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_7_0 = this;
                  stackOut_7_1 = null;
                  stackOut_7_2 = null;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = (mi) ((Object) stackIn_7_4);
                  stackOut_7_5 = jj.field_I;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  break L5;
                }
                ((fa) (this)).field_Hb = new mi(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                this.field_Rb.a((byte) 50, this.field_Hb);
                break L3;
              }
              var28 = new cj[3];
              var15_array = var28;
              var28[0] = new cj(0L, (cj) null);
              this.field_Rb.a((byte) 50, var28[0]);
              var28[1] = new cj(0L, (cj) null);
              this.field_Rb.a((byte) 50, var28[1]);
              var28[2] = new cj(0L, (cj) null);
              this.field_Rb.a((byte) 50, var28[2]);
              this.field_Jb = new cj[mo.field_Kb];
              var16 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (mo.field_Kb <= var16) {
                      break L9;
                    } else {
                      if (var27 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (nk.field_n[var16] == null) {
                            break L10;
                          } else {
                            L11: {
                              this.field_Jb[var16] = new cj(0L, param10, nk.field_n[var16]);
                              this.field_Jb[var16].field_R = 0;
                              stackOut_14_0 = this.field_Jb[var16];
                              stackIn_16_0 = stackOut_14_0;
                              stackIn_15_0 = stackOut_14_0;
                              if (param11 == null) {
                                stackOut_16_0 = (cj) ((Object) stackIn_16_0);
                                stackOut_16_1 = 0;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                break L11;
                              } else {
                                stackOut_15_0 = (cj) ((Object) stackIn_15_0);
                                stackOut_15_1 = 1;
                                stackIn_17_0 = stackOut_15_0;
                                stackIn_17_1 = stackOut_15_1;
                                break L11;
                              }
                            }
                            stackIn_17_0.field_Z = stackIn_17_1 != 0;
                            this.field_Rb.a((byte) 50, this.field_Jb[var16]);
                            break L10;
                          }
                        }
                        var16++;
                        if (var27 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  this.field_Nb = new StringBuilder(12);
                  break L8;
                }
                L12: {
                  if (param11 == null) {
                    break L12;
                  } else {
                    discarded$1 = this.field_Nb.append(param11);
                    break L12;
                  }
                }
                L13: {
                  var16 = 0;
                  var17 = param6.field_yb.a(mn.field_q);
                  if (var17 <= var16) {
                    break L13;
                  } else {
                    var16 = var17;
                    break L13;
                  }
                }
                L14: {
                  var17 = param6.field_yb.a(ho.field_p);
                  if (var16 >= var17) {
                    break L14;
                  } else {
                    var16 = var17;
                    break L14;
                  }
                }
                L15: {
                  var17 = param6.field_yb.a(ki.field_p);
                  if (var16 >= var17) {
                    break L15;
                  } else {
                    var16 = var17;
                    break L15;
                  }
                }
                var17 = 0;
                L16: while (true) {
                  L17: {
                    L18: {
                      L19: {
                        if (var17 >= mo.field_Kb) {
                          break L19;
                        } else {
                          if (var27 != 0) {
                            break L18;
                          } else {
                            L20: {
                              if (null == this.field_Jb[var17]) {
                                break L20;
                              } else {
                                var18 = this.field_Jb[var17].e(0);
                                if (var16 >= var18) {
                                  break L20;
                                } else {
                                  var16 = var18;
                                  break L20;
                                }
                              }
                            }
                            var17++;
                            if (var27 == 0) {
                              continue L16;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      if (140 >= var16) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                    var16 = 140;
                    break L17;
                  }
                  L21: {
                    var17 = 0;
                    var18 = 0;
                    var18 = 0;
                    var18 = this.a(mn.field_q, var18, var16, var28[0], param6, 113);
                    var18 = this.a(var28[0], var16, this.field_Jb[6], var18, (byte) -55);
                    var18 = this.a(var28[0], var16, this.field_Jb[9], var18, (byte) -55);
                    var18 = this.a(var28[0], var16, this.field_Jb[5], var18, (byte) -55);
                    var18 = this.a(var28[0], var16, this.field_Jb[7], var18, (byte) -55);
                    var18 = this.a(var28[0], var16, this.field_Jb[15], var18, (byte) -55);
                    var18 = this.a(var28[0], var16, this.field_Jb[4], var18, (byte) -55);
                    if (var18 <= var17) {
                      break L21;
                    } else {
                      var17 = var18;
                      break L21;
                    }
                  }
                  L22: {
                    var18 = 0;
                    var18 = this.a(ho.field_p, var18, var16, var28[1], param6, 114);
                    var18 = this.a(var28[1], var16, this.field_Jb[16], var18, (byte) -55);
                    var18 = this.a(var28[1], var16, this.field_Jb[17], var18, (byte) -55);
                    var18 = this.a(var28[1], var16, this.field_Jb[18], var18, (byte) -55);
                    var18 = this.a(var28[1], var16, this.field_Jb[19], var18, (byte) -55);
                    var18 = this.a(var28[1], var16, this.field_Jb[20], var18, (byte) -55);
                    if (var17 >= var18) {
                      break L22;
                    } else {
                      var17 = var18;
                      break L22;
                    }
                  }
                  L23: {
                    var18 = 0;
                    var18 = this.a(ki.field_p, var18, var16, var28[2], param6, 119);
                    var18 = this.a(var28[2], var16, this.field_Jb[13], var18, (byte) -55);
                    var18 = this.a(var28[2], var16, this.field_Jb[21], var18, (byte) -55);
                    var18 = this.a(var28[2], var16, this.field_Jb[11], var18, (byte) -55);
                    if (var17 >= var18) {
                      break L23;
                    } else {
                      var17 = var18;
                      break L23;
                    }
                  }
                  L24: {
                    var19 = 3 * var16 + 26;
                    var20 = this.field_Kb.e(0);
                    if (var20 <= var19) {
                      break L24;
                    } else {
                      var19 = var20;
                      break L24;
                    }
                  }
                  L25: {
                    if (null == this.field_Hb) {
                      break L25;
                    } else {
                      var20 = this.field_Hb.a((byte) 122, 4);
                      if (var19 >= var20) {
                        break L25;
                      } else {
                        var19 = var20;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    this.field_Kb.a(24, 0, 13 + var19 + 13, 0, -3344);
                    this.field_Mb.a(15, 5, 15, this.field_Kb.field_zb - 20, -3344);
                    var21 = 10;
                    this.field_Vb.a(jk.field_f * 2, var21, var19, 13, -3344);
                    var21 = var21 + 2 * jk.field_f;
                    this.field_Pb.a(jk.field_f * 2, var21, var19, 13, -3344);
                    var21 = var21 + (10 + 2 * jk.field_f);
                    this.field_Sb.a(jk.field_f, var21, 0, 0, -3344);
                    var21 = var21 + (10 + jk.field_f);
                    if (null == this.field_Hb) {
                      break L26;
                    } else {
                      var20 = this.field_Hb.a((byte) 102, 4);
                      this.field_Hb.a(var21, (byte) -96, 4, var20, 13 - -((-var20 + var19) / 2), jk.field_f);
                      var21 = var21 + (10 + jk.field_f);
                      break L26;
                    }
                  }
                  var28[0].a(var17, var21, var16, 13, -3344);
                  var28[1].a(var17, var21, var16, 13 + (13 - -var16), -3344);
                  var28[2].a(var17, var21, var16, 2 * var16 + 13 - -26, -3344);
                  var22 = var21;
                  this.field_Rb.a(var22 - -var17 + 10, 24, 13 + (var19 - -13), 0, -3344);
                  this.field_Rb.field_ab = tg.a(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 30);
                  var23 = 13 + (13 - -var19);
                  var24 = var22 + 24 - -var17 + 10;
                  var25 = qp.a(param0, (byte) 109, var23, param2);
                  var26 = br.a(true, param1, param3, var24);
                  this.a(var24, var26, var23, var25, -3344);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var15 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var15);
            stackOut_52_1 = new StringBuilder().append("fa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param5 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L27;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L27;
            }
          }
          L28: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param6 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L28;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L28;
            }
          }
          L29: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param7 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L29;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L29;
            }
          }
          L30: {
            stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param8 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L30;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L30;
            }
          }
          L31: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param9 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L31;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L31;
            }
          }
          L32: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param10 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L32;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L32;
            }
          }
          L33: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param11 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L33;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L33;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param12 + ')');
        }
    }

    private final int a(cj param0, int param1, cj param2, int param3, byte param4) {
        int discarded$2 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        cj var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              param3 += 8;
              var6_int = param2.field_yb.a(param2.field_wb, -(2 * param2.field_V) + param1, param2.field_J);
              param2.a(var6_int, param3, param1, 0, -3344);
              param3 = param3 + (0 + var6_int);
              if (param4 == -55) {
                break L1;
              } else {
                var7 = (cj) null;
                discarded$2 = this.a((cj) null, 103, (cj) null, -43, (byte) -6);
                break L1;
              }
            }
            param0.a((byte) 50, param2);
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var6);
            stackOut_4_1 = new StringBuilder().append("fa.EA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Qb = new ja[5][];
        field_Ob = "Stunning is not enough.";
        field_Gb = "Email: ";
        field_Ub = "This game option is only available to members.";
    }
}
