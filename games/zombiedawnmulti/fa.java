/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

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
        if (param0 < 99) {
            field_Ub = null;
        }
        if (-2 != ((fa) this).field_Lb) {
            return false;
        }
        if (sj.field_p == 13) {
            ((fa) this).field_Lb = -1;
            return true;
        }
        return true;
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        mi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cj stackIn_15_0 = null;
        cj stackIn_16_0 = null;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        mi stackOut_6_0 = null;
        mi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cj stackOut_14_0 = null;
        cj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -58) {
            break L0;
          } else {
            ((fa) this).field_Mb = null;
            break L0;
          }
        }
        L1: {
          ((fa) this).a(-11838, param1);
          if (null == ((fa) this).field_Sb) {
            break L1;
          } else {
            L2: {
              ((fa) this).field_Sb.field_wb = ((fa) this).field_Nb.toString();
              ((fa) this).field_Sb.field_x = (((fa) this).field_zb - ((fa) this).field_Sb.field_yb.a(((fa) this).field_Sb.field_wb)) / 2;
              ((fa) this).field_Sb.field_zb = ((fa) this).field_zb + -((fa) this).field_Sb.field_x;
              if (((fa) this).field_Hb != null) {
                if (((fa) this).field_Hb.field_T == 0) {
                  break L2;
                } else {
                  L3: {
                    stackOut_6_0 = ((fa) this).field_Hb;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (((fa) this).field_Hb.field_Ab) {
                      stackOut_8_0 = (mi) (Object) stackIn_8_0;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = (mi) (Object) stackIn_7_0;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  stackIn_9_0.field_Ab = stackIn_9_1 != 0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L4: while (true) {
              if (var3 >= mo.field_Kb) {
                break L1;
              } else {
                L5: {
                  if (((fa) this).field_Jb[var3] != null) {
                    L6: {
                      stackOut_14_0 = ((fa) this).field_Jb[var3];
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (((fa) this).field_Nb.length() <= 0) {
                        stackOut_16_0 = (cj) (Object) stackIn_16_0;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L6;
                      } else {
                        stackOut_15_0 = (cj) (Object) stackIn_15_0;
                        stackOut_15_1 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L6;
                      }
                    }
                    stackIn_17_0.field_Z = stackIn_17_1 != 0;
                    if (!((fa) this).field_Jb[var3].field_Z) {
                      break L5;
                    } else {
                      if (((fa) this).field_Jb[var3].field_T != 0) {
                        return var3;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                var3++;
                continue L4;
              }
            }
          }
        }
        if (((fa) this).field_Mb.field_T == 0) {
          L7: {
            if (!param1) {
              break L7;
            } else {
              if (kd.field_b == 0) {
                break L7;
              } else {
                if (((fa) this).field_T == 0) {
                  return -1;
                } else {
                  break L7;
                }
              }
            }
          }
          return ((fa) this).field_Lb;
        } else {
          return -1;
        }
    }

    final static int d(boolean param0) {
        return fl.field_a + -ZombieDawnMulti.field_H;
    }

    final String h(int param0) {
        if (param0 != -26895) {
            return null;
        }
        return ((fa) this).field_Nb.toString();
    }

    final boolean i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -23217) {
            break L0;
          } else {
            ((fa) this).field_Nb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((fa) this).field_Hb) {
              break L2;
            } else {
              if (!((fa) this).field_Hb.field_Ab) {
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
              break L0;
            } else {
              stackOut_1_0 = 20;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7_ref;
            stackOut_5_1 = new StringBuilder().append("fa.CA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param5 + 41);
        }
        return stackIn_4_0;
    }

    final static fn a(Throwable param0, String param1) {
        fn var2 = null;
        if (param0 instanceof fn) {
            var2 = (fn) (Object) param0;
            var2.field_k = var2.field_k + 32 + param1;
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
            {
                if (param0 != 10) {
                    field_Gb = null;
                }
                if (var2_int >= 0) {
                    if (he.b((byte) -22) <= 30000L) {
                        return false;
                    }
                }
                ak.a((byte) -124);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_Qb = null;
        field_Gb = null;
        int var1 = 0;
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
        int var15_int = 0;
        cj[] var15 = null;
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
        cj[] var28 = null;
        Object stackIn_5_0 = null;
        mi stackIn_5_1 = null;
        mi stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        mi stackIn_5_4 = null;
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
        String stackIn_8_5 = null;
        cj stackIn_13_0 = null;
        cj stackIn_14_0 = null;
        cj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_4_0 = null;
        mi stackOut_4_1 = null;
        mi stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        mi stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        mi stackOut_5_1 = null;
        mi stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        mi stackOut_5_4 = null;
        Object stackOut_7_0 = null;
        mi stackOut_7_1 = null;
        mi stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        mi stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_6_0 = null;
        mi stackOut_6_1 = null;
        mi stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        mi stackOut_6_4 = null;
        String stackOut_6_5 = null;
        cj stackOut_12_0 = null;
        cj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((fa) this).field_Lb = -2;
          ((fa) this).field_Fb = param12;
          ((fa) this).field_Kb = new cj(0L, param6, vc.field_g.toUpperCase());
          ((fa) this).field_Kb.field_R = 1;
          ((fa) this).a((byte) 50, ((fa) this).field_Kb);
          ((fa) this).field_Mb = new cj(0L, param7);
          ((fa) this).field_Kb.a((byte) 50, ((fa) this).field_Mb);
          ((fa) this).field_Rb = new cj(0L, (cj) null);
          ((fa) this).a((byte) 50, ((fa) this).field_Rb);
          if (param11 != null) {
            L1: {
              L2: {
                ((fa) this).field_Vb = new cj(0L, param8, wg.field_a);
                ((fa) this).field_Vb.field_M = 11184810;
                ((fa) this).field_Vb.field_R = 1;
                ((fa) this).field_Rb.a((byte) 50, ((fa) this).field_Vb);
                ((fa) this).field_Pb = new cj(0L, param8, bf.field_q);
                ((fa) this).field_Pb.field_M = 11184810;
                ((fa) this).field_Pb.field_R = 1;
                ((fa) this).field_Rb.a((byte) 50, ((fa) this).field_Pb);
                ((fa) this).field_Sb = new cj(0L, param8);
                ((fa) this).field_Sb.field_M = 16764006;
                ((fa) this).field_Rb.a((byte) 50, ((fa) this).field_Sb);
                ((fa) this).field_Sb.field_vb = "|";
                if (5 <= am.field_b) {
                  break L2;
                } else {
                  if (kj.field_q < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_4_0 = this;
                  stackOut_4_1 = null;
                  stackOut_4_2 = null;
                  stackOut_4_3 = 0L;
                  stackOut_4_4 = (mi) param9;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (am.field_b >= 7) {
                    break L4;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = (mi) (Object) stackIn_5_4;
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
                    if (kj.field_q < 2) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = null;
                      stackOut_7_2 = null;
                      stackOut_7_3 = stackIn_7_3;
                      stackOut_7_4 = (mi) (Object) stackIn_7_4;
                      stackOut_7_5 = dk.field_Kb;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      stackIn_8_4 = stackOut_7_4;
                      stackIn_8_5 = stackOut_7_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = null;
                stackOut_6_2 = null;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (mi) (Object) stackIn_6_4;
                stackOut_6_5 = jj.field_I;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                break L3;
              }
              ((fa) this).field_Hb = new mi(stackIn_8_3, stackIn_8_4, stackIn_8_5);
              ((fa) this).field_Rb.a((byte) 50, (cj) (Object) ((fa) this).field_Hb);
              break L1;
            }
            var28 = new cj[3];
            var15 = var28;
            var28[0] = new cj(0L, (cj) null);
            ((fa) this).field_Rb.a((byte) 50, var28[0]);
            var28[1] = new cj(0L, (cj) null);
            ((fa) this).field_Rb.a((byte) 50, var28[1]);
            var28[2] = new cj(0L, (cj) null);
            ((fa) this).field_Rb.a((byte) 50, var28[2]);
            ((fa) this).field_Jb = new cj[mo.field_Kb];
            var16 = 0;
            L5: while (true) {
              if (mo.field_Kb <= var16) {
                L6: {
                  ((fa) this).field_Nb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((fa) this).field_Nb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_yb.a(mn.field_q);
                  if (var17 <= var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_yb.a(ho.field_p);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_yb.a(ki.field_p);
                  if (var16 >= var17) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= mo.field_Kb) {
                    L11: {
                      if (140 >= var16) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a(mn.field_q, var18, var16, var28[0], param6, 113);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[6], var18, (byte) -55);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[9], var18, (byte) -55);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[5], var18, (byte) -55);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[7], var18, (byte) -55);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[15], var18, (byte) -55);
                      var18 = this.a(var28[0], var16, ((fa) this).field_Jb[4], var18, (byte) -55);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(ho.field_p, var18, var16, var28[1], param6, 114);
                      var18 = this.a(var28[1], var16, ((fa) this).field_Jb[16], var18, (byte) -55);
                      var18 = this.a(var28[1], var16, ((fa) this).field_Jb[17], var18, (byte) -55);
                      var18 = this.a(var28[1], var16, ((fa) this).field_Jb[18], var18, (byte) -55);
                      var18 = this.a(var28[1], var16, ((fa) this).field_Jb[19], var18, (byte) -55);
                      var18 = this.a(var28[1], var16, ((fa) this).field_Jb[20], var18, (byte) -55);
                      if (var17 >= var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(ki.field_p, var18, var16, var28[2], param6, 119);
                      var18 = this.a(var28[2], var16, ((fa) this).field_Jb[13], var18, (byte) -55);
                      var18 = this.a(var28[2], var16, ((fa) this).field_Jb[21], var18, (byte) -55);
                      var18 = this.a(var28[2], var16, ((fa) this).field_Jb[11], var18, (byte) -55);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 3 * var16 + 26;
                      var20 = ((fa) this).field_Kb.e(0);
                      if (var20 <= var19) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((fa) this).field_Hb) {
                        break L16;
                      } else {
                        var20 = ((fa) this).field_Hb.a((byte) 122, 4);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((fa) this).field_Kb.a(24, 0, 13 + var19 + 13, 0, -3344);
                      ((fa) this).field_Mb.a(15, 5, 15, ((fa) this).field_Kb.field_zb - 20, -3344);
                      var21 = 10;
                      ((fa) this).field_Vb.a(jk.field_f * 2, var21, var19, 13, -3344);
                      var21 = var21 + 2 * jk.field_f;
                      ((fa) this).field_Pb.a(jk.field_f * 2, var21, var19, 13, -3344);
                      var21 = var21 + (10 + 2 * jk.field_f);
                      ((fa) this).field_Sb.a(jk.field_f, var21, 0, 0, -3344);
                      var21 = var21 + (10 + jk.field_f);
                      if (null == ((fa) this).field_Hb) {
                        break L17;
                      } else {
                        var20 = ((fa) this).field_Hb.a((byte) 102, 4);
                        ((fa) this).field_Hb.a(var21, (byte) -96, 4, var20, 13 - -((-var20 + var19) / 2), jk.field_f);
                        var21 = var21 + (10 + jk.field_f);
                        break L17;
                      }
                    }
                    var28[0].a(var17, var21, var16, 13, -3344);
                    var28[1].a(var17, var21, var16, 13 + (13 - -var16), -3344);
                    var28[2].a(var17, var21, var16, 2 * var16 + 39, -3344);
                    var22 = var21;
                    ((fa) this).field_Rb.a(var22 - -var17 + 10, 24, 13 + (var19 - -13), 0, -3344);
                    ((fa) this).field_Rb.field_ab = tg.a(2105376, ((fa) this).field_Rb.field_z, 8421504, 3, 11579568, 30);
                    var23 = 13 + (13 - -var19);
                    var24 = var22 + 24 - -var17 + 10;
                    var25 = qp.a(param0, (byte) 109, var23, param2);
                    var26 = br.a(true, param1, param3, var24);
                    ((fa) this).a(var24, var26, var23, var25, -3344);
                    break L0;
                  } else {
                    L18: {
                      if (null == ((fa) this).field_Jb[var17]) {
                        break L18;
                      } else {
                        var18 = ((fa) this).field_Jb[var17].e(0);
                        if (var16 >= var18) {
                          break L18;
                        } else {
                          var16 = var18;
                          break L18;
                        }
                      }
                    }
                    var17++;
                    continue L10;
                  }
                }
              } else {
                L19: {
                  if (nk.field_n[var16] == null) {
                    break L19;
                  } else {
                    L20: {
                      ((fa) this).field_Jb[var16] = new cj(0L, param10, nk.field_n[var16]);
                      ((fa) this).field_Jb[var16].field_R = 0;
                      stackOut_12_0 = ((fa) this).field_Jb[var16];
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (param11 == null) {
                        stackOut_14_0 = (cj) (Object) stackIn_14_0;
                        stackOut_14_1 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L20;
                      } else {
                        stackOut_13_0 = (cj) (Object) stackIn_13_0;
                        stackOut_13_1 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L20;
                      }
                    }
                    stackIn_15_0.field_Z = stackIn_15_1 != 0;
                    ((fa) this).field_Rb.a((byte) 50, ((fa) this).field_Jb[var16]);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          } else {
            ((fa) this).field_Vb = new cj(0L, param8, ng.field_f);
            ((fa) this).field_Vb.field_R = 1;
            ((fa) this).field_Vb.field_M = 11184810;
            ((fa) this).field_Rb.a((byte) 50, ((fa) this).field_Vb);
            var15_int = 226;
            var16 = 10;
            var17 = ((fa) this).field_Vb.field_yb.b(((fa) this).field_Vb.field_wb, var15_int);
            ((fa) this).field_Vb.a(var17 * jk.field_f, var16, var15_int, 13, -3344);
            var16 = var16 + var17 * jk.field_f;
            ((fa) this).field_Rb.a(10 - -var16, 24, 13 + (var15_int + 13), 0, -3344);
            ((fa) this).field_Rb.field_ab = tg.a(2105376, ((fa) this).field_Rb.field_z, 8421504, 3, 11579568, 92);
            var18 = 13 - (-var15_int - 13);
            var19 = 34 - -var16;
            var20 = qp.a(param0, (byte) 25, var18, param2);
            var21 = br.a(true, param1, param3, var19);
            ((fa) this).a(var19, var21, var18, var20, -3344);
            break L0;
          }
        }
    }

    private final int a(cj param0, int param1, cj param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
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
              param3 = param3 + var6_int;
              if (param4 == -55) {
                break L1;
              } else {
                var7 = null;
                int discarded$2 = this.a((cj) null, 103, (cj) null, -43, (byte) -6);
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
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("fa.EA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = new ja[5][];
        field_Ob = "Stunning is not enough.";
        field_Gb = "Email: ";
        field_Ub = "This game option is only available to members.";
    }
}
