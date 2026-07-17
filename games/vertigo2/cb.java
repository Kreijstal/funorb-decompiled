/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class cb extends cr {
    private cr field_Lb;
    private cr field_Jb;
    private cr field_Sb;
    static boolean field_Ib;
    private int field_Tb;
    private cr[] field_Qb;
    static String field_Pb;
    private cr field_Hb;
    private cr field_Nb;
    private sm field_Ob;
    private cr field_Rb;
    private StringBuilder field_Mb;
    long field_Kb;

    private final int a(int param0, cr param1, String param2, int param3, int param4, cr param5) {
        cr var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
        try {
          L0: {
            var7 = new cr((long)param4, param5, 0, param0, param3, 24, param2);
            param0 += 32;
            param1.b(var7, param4 + 121);
            stackOut_0_0 = param0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("cb.E(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    final boolean k(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 22719) {
            break L0;
          } else {
            ((cb) this).field_Lb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((cb) this).field_Ob) {
              break L2;
            } else {
              if (!((cb) this).field_Ob.field_V) {
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

    private final int a(int param0, int param1, cr param2, int param3, cr param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
        try {
          L0: {
            param3 += 8;
            var6_int = param2.field_z.a(param2.field_S, param0 - 2 * param2.field_R, param2.field_qb);
            param2.a(114, param0, var6_int, param3, 0);
            if (param1 >= 103) {
              param4.b(param2, 125);
              param3 = param3 + var6_int;
              stackOut_3_0 = param3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -25;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("cb.C(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        sm stackIn_6_0 = null;
        sm stackIn_7_0 = null;
        sm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cr stackIn_14_0 = null;
        cr stackIn_15_0 = null;
        cr stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        sm stackOut_5_0 = null;
        sm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cr stackOut_13_0 = null;
        cr stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cr stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          ((cb) this).a(0, param1);
          if (null != ((cb) this).field_Sb) {
            L1: {
              ((cb) this).field_Sb.field_S = ((cb) this).field_Mb.toString();
              ((cb) this).field_Sb.field_wb = (((cb) this).field_Fb + -((cb) this).field_Sb.field_z.c(((cb) this).field_Sb.field_S)) / 2;
              ((cb) this).field_Sb.field_Fb = ((cb) this).field_Fb + -((cb) this).field_Sb.field_wb;
              if (((cb) this).field_Ob == null) {
                break L1;
              } else {
                if (0 != ((cb) this).field_Ob.field_tb) {
                  L2: {
                    stackOut_5_0 = ((cb) this).field_Ob;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((cb) this).field_Ob.field_V) {
                      stackOut_7_0 = (sm) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (sm) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_V = stackIn_8_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (~var3 <= ~kq.field_Jb) {
                break L0;
              } else {
                L4: {
                  if (((cb) this).field_Qb[var3] != null) {
                    L5: {
                      stackOut_13_0 = ((cb) this).field_Qb[var3];
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (((cb) this).field_Mb.length() <= 0) {
                        stackOut_15_0 = (cr) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L5;
                      } else {
                        stackOut_14_0 = (cr) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L5;
                      }
                    }
                    stackIn_16_0.field_lb = stackIn_16_1 != 0;
                    if (!((cb) this).field_Qb[var3].field_lb) {
                      break L4;
                    } else {
                      if (((cb) this).field_Qb[var3].field_tb == 0) {
                        break L4;
                      } else {
                        return var3;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3++;
                continue L3;
              }
            }
          } else {
            break L0;
          }
        }
        if (((cb) this).field_Rb.field_tb != 0) {
          return -1;
        } else {
          L6: {
            if (!param1) {
              break L6;
            } else {
              if (kf.field_c == 0) {
                break L6;
              } else {
                if (((cb) this).field_tb == 0) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          if (param0 == 13721) {
            return ((cb) this).field_Tb;
          } else {
            return -105;
          }
        }
    }

    final String l(int param0) {
        if (param0 != 4) {
            return null;
        }
        return ((cb) this).field_Mb.toString();
    }

    final boolean c(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((cb) this).c(false);
        }
        if (!(((cb) this).field_Tb == -2)) {
            return false;
        }
        if (de.field_f != 13) {
            return true;
        }
        ((cb) this).field_Tb = -1;
        return true;
    }

    cb(int param0, int param1, int param2, int param3, int param4, cr param5, cr param6, cr param7, cr param8, sm param9, cr param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        cr[] var15 = null;
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
        cr[] var28 = null;
        Object stackIn_4_0 = null;
        sm stackIn_4_1 = null;
        sm stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        sm stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        sm stackIn_5_1 = null;
        sm stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        sm stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        sm stackIn_6_1 = null;
        sm stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        sm stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        sm stackIn_7_1 = null;
        sm stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        sm stackIn_7_4 = null;
        String stackIn_7_5 = null;
        cr stackIn_12_0 = null;
        cr stackIn_13_0 = null;
        cr stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        sm stackOut_3_1 = null;
        sm stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        sm stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        sm stackOut_4_1 = null;
        sm stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        sm stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        sm stackOut_6_1 = null;
        sm stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        sm stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        sm stackOut_5_1 = null;
        sm stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        sm stackOut_5_4 = null;
        String stackOut_5_5 = null;
        cr stackOut_11_0 = null;
        cr stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cr stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((cb) this).field_Tb = -2;
          ((cb) this).field_Kb = param12;
          ((cb) this).field_Hb = new cr(0L, param6, ol.field_z.toUpperCase());
          ((cb) this).field_Hb.field_O = 1;
          ((cb) this).b(((cb) this).field_Hb, 124);
          ((cb) this).field_Rb = new cr(0L, param7);
          ((cb) this).field_Hb.b(((cb) this).field_Rb, 127);
          ((cb) this).field_Nb = new cr(0L, (cr) null);
          ((cb) this).b(((cb) this).field_Nb, 120);
          if (param11 == null) {
            ((cb) this).field_Lb = new cr(0L, param8, sd.field_H);
            ((cb) this).field_Lb.field_O = 1;
            ((cb) this).field_Lb.field_A = 11184810;
            ((cb) this).field_Nb.b(((cb) this).field_Lb, 123);
            var15_int = 226;
            var16 = 10;
            var17 = ((cb) this).field_Lb.field_z.b(((cb) this).field_Lb.field_S, var15_int);
            ((cb) this).field_Lb.a(115, var15_int, var17 * r.field_f, var16, 13);
            var16 = var16 + r.field_f * var17;
            ((cb) this).field_Nb.a(109, 13 + (var15_int + 13), var16 + 10, 24, 0);
            ((cb) this).field_Nb.field_Bb = vl.a(((cb) this).field_Nb.field_db, 3, 0, 2105376, 11579568, 8421504);
            var18 = 13 + (var15_int + 13);
            var19 = var16 + 34;
            var20 = jf.a(var18, param2, param0, 1);
            var21 = dm.a(param3, 0, var19, param1);
            ((cb) this).a(83, var18, var19, var21, var20);
            break L0;
          } else {
            L1: {
              L2: {
                ((cb) this).field_Lb = new cr(0L, param8, oh.field_E);
                ((cb) this).field_Lb.field_A = 11184810;
                ((cb) this).field_Lb.field_O = 1;
                ((cb) this).field_Nb.b(((cb) this).field_Lb, 118);
                ((cb) this).field_Jb = new cr(0L, param8, tl.field_a);
                ((cb) this).field_Jb.field_O = 1;
                ((cb) this).field_Jb.field_A = 11184810;
                ((cb) this).field_Nb.b(((cb) this).field_Jb, 125);
                ((cb) this).field_Sb = new cr(0L, param8);
                ((cb) this).field_Sb.field_A = 16764006;
                ((cb) this).field_Nb.b(((cb) this).field_Sb, 126);
                ((cb) this).field_Sb.field_J = "|";
                if (uh.field_oc >= 5) {
                  break L2;
                } else {
                  if (fn.field_z < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (sm) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (uh.field_oc >= 7) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (sm) (Object) stackIn_4_4;
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
                    if (fn.field_z < 2) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (sm) (Object) stackIn_6_4;
                      stackOut_6_5 = hm.field_z;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (sm) (Object) stackIn_5_4;
                stackOut_5_5 = tb.field_c;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              ((cb) this).field_Ob = new sm(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((cb) this).field_Nb.b((cr) (Object) ((cb) this).field_Ob, 120);
              break L1;
            }
            var28 = new cr[3];
            var15 = var28;
            var28[0] = new cr(0L, (cr) null);
            ((cb) this).field_Nb.b(var28[0], 118);
            var28[1] = new cr(0L, (cr) null);
            ((cb) this).field_Nb.b(var28[1], 125);
            var28[2] = new cr(0L, (cr) null);
            ((cb) this).field_Nb.b(var28[2], 126);
            ((cb) this).field_Qb = new cr[kq.field_Jb];
            var16 = 0;
            L5: while (true) {
              if (~var16 <= ~kq.field_Jb) {
                L6: {
                  ((cb) this).field_Mb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((cb) this).field_Mb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_z.c(sk.field_c);
                  if (~var17 >= ~var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_z.c(lh.field_e);
                  if (~var17 >= ~var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_z.c(hl.field_o);
                  if (~var17 >= ~var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (~kq.field_Jb >= ~var17) {
                    L11: {
                      if (var16 <= 140) {
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
                      var18 = this.a(var18, var28[0], sk.field_c, var16, 0, param6);
                      var18 = this.a(var16, 116, ((cb) this).field_Qb[6], var18, var28[0]);
                      var18 = this.a(var16, 117, ((cb) this).field_Qb[9], var18, var28[0]);
                      var18 = this.a(var16, 119, ((cb) this).field_Qb[5], var18, var28[0]);
                      var18 = this.a(var16, 107, ((cb) this).field_Qb[7], var18, var28[0]);
                      var18 = this.a(var16, 107, ((cb) this).field_Qb[15], var18, var28[0]);
                      var18 = this.a(var16, 120, ((cb) this).field_Qb[4], var18, var28[0]);
                      if (~var18 >= ~var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(var18, var28[1], lh.field_e, var16, 0, param6);
                      var18 = this.a(var16, 107, ((cb) this).field_Qb[16], var18, var28[1]);
                      var18 = this.a(var16, 122, ((cb) this).field_Qb[17], var18, var28[1]);
                      var18 = this.a(var16, 110, ((cb) this).field_Qb[18], var18, var28[1]);
                      var18 = this.a(var16, 109, ((cb) this).field_Qb[19], var18, var28[1]);
                      var18 = this.a(var16, 120, ((cb) this).field_Qb[20], var18, var28[1]);
                      if (~var17 <= ~var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(var18, var28[2], hl.field_o, var16, 0, param6);
                      var18 = this.a(var16, 114, ((cb) this).field_Qb[13], var18, var28[2]);
                      var18 = this.a(var16, 112, ((cb) this).field_Qb[21], var18, var28[2]);
                      var18 = this.a(var16, 107, ((cb) this).field_Qb[11], var18, var28[2]);
                      if (~var18 >= ~var17) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 3 * var16 + 26;
                      var20 = ((cb) this).field_Hb.j(-21391);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((cb) this).field_Ob == null) {
                        break L16;
                      } else {
                        var20 = ((cb) this).field_Ob.c(4, 0);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((cb) this).field_Hb.a(111, var19 + 26, 24, 0, 0);
                      ((cb) this).field_Rb.a(97, 15, 15, 5, ((cb) this).field_Hb.field_Fb + -20);
                      var21 = 10;
                      ((cb) this).field_Lb.a(114, var19, r.field_f * 2, var21, 13);
                      var21 = var21 + r.field_f * 2;
                      ((cb) this).field_Jb.a(84, var19, 2 * r.field_f, var21, 13);
                      var21 = var21 + (2 * r.field_f + 10);
                      ((cb) this).field_Sb.a(101, 0, r.field_f, var21, 0);
                      var21 = var21 + (r.field_f - -10);
                      if (((cb) this).field_Ob == null) {
                        break L17;
                      } else {
                        var20 = ((cb) this).field_Ob.c(4, 0);
                        ((cb) this).field_Ob.a(var20, var21, r.field_f, -36, 4, 13 + (-var20 + var19) / 2);
                        var21 = var21 + (r.field_f - -10);
                        break L17;
                      }
                    }
                    var28[0].a(78, var16, var17, var21, 13);
                    var28[1].a(91, var16, var17, var21, var16 + 26);
                    var28[2].a(94, var16, var17, var21, 39 + 2 * var16);
                    var22 = var21;
                    ((cb) this).field_Nb.a(87, 13 - (-var19 - 13), 10 + var22 - -var17, 24, 0);
                    ((cb) this).field_Nb.field_Bb = vl.a(((cb) this).field_Nb.field_db, 3, 0, 2105376, 11579568, 8421504);
                    var23 = 13 - -var19 - -13;
                    var24 = var17 + (24 - -var22) + 10;
                    var25 = jf.a(var23, param2, param0, 1);
                    var26 = dm.a(param3, 0, var24, param1);
                    ((cb) this).a(92, var23, var24, var26, var25);
                    break L0;
                  } else {
                    L18: {
                      if (null == ((cb) this).field_Qb[var17]) {
                        break L18;
                      } else {
                        var18 = ((cb) this).field_Qb[var17].j(-21391);
                        if (var18 <= var16) {
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
                  if (wj.field_c[var16] == null) {
                    break L19;
                  } else {
                    L20: {
                      ((cb) this).field_Qb[var16] = new cr(0L, param10, wj.field_c[var16]);
                      ((cb) this).field_Qb[var16].field_O = 0;
                      stackOut_11_0 = ((cb) this).field_Qb[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (cr) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (cr) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_lb = stackIn_14_1 != 0;
                    ((cb) this).field_Nb.b(((cb) this).field_Qb[var16], 120);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_Pb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "This game has been updated! Please reload this page.";
    }
}
