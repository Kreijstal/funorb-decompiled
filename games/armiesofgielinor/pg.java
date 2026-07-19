/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    static int field_f;
    static bq[] field_a;
    static int field_e;
    static hm field_d;
    static wk field_c;
    static String[] field_b;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -10) {
          return false;
        } else {
          L0: {
            if ((param0 & -param0) != param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static qb a(int param0, int param1, boolean param2, int param3) {
        int[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_25_0 = 0;
        boolean stackOut_30_0 = false;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < 0) {
            param0 = 0;
            break L0;
          } else {
            if ((param0 ^ -1) > -10) {
              break L0;
            } else {
              param0 = 0;
              var13 = aw.field_j[param3][param0];
              var11 = var13;
              var10 = var11;
              var4 = var10;
              var5 = var10[ns.a(false, var13.length, gg.field_J)];
              if ((var5 ^ -1) > -1) {
                if (param1 == 176) {
                  var17 = var4;
                  var7 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var7 >= var17.length) {
                          break L3;
                        } else {
                          var8 = var17[var7];
                          stackOut_8_0 = 0;
                          stackIn_14_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            if (stackIn_9_0 <= var8) {
                              return ck.field_e[sf.field_P[param3]][var8];
                            } else {
                              var7++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      stackOut_13_0 = param2;
                      stackIn_14_0 = stackOut_13_0 ? 1 : 0;
                      break L2;
                    }
                    if (stackIn_14_0 == 0) {
                      return null;
                    } else {
                      return ck.field_e[sf.field_P[param3]][aw.field_j[param3][0][0]];
                    }
                  }
                } else {
                  return (qb) null;
                }
              } else {
                return ck.field_e[sf.field_P[param3]][var5];
              }
            }
          }
        }
        var13 = aw.field_j[param3][param0];
        var11 = var13;
        var10 = var11;
        var4 = var10;
        var5 = var10[ns.a(false, var13.length, gg.field_J)];
        if ((var5 ^ -1) > -1) {
          if (param1 == 176) {
            var18 = var4;
            var7 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var7 >= var18.length) {
                    break L6;
                  } else {
                    var8 = var18[var7];
                    stackOut_25_0 = 0;
                    stackIn_31_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var9 != 0) {
                      break L5;
                    } else {
                      if (stackIn_26_0 <= var8) {
                        return ck.field_e[sf.field_P[param3]][var8];
                      } else {
                        var7++;
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                stackOut_30_0 = param2;
                stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                break L5;
              }
              if (stackIn_31_0 == 0) {
                return null;
              } else {
                return ck.field_e[sf.field_P[param3]][aw.field_j[param3][0][0]];
              }
            }
          } else {
            return (qb) null;
          }
        } else {
          return ck.field_e[sf.field_P[param3]][var5];
        }
    }

    final static void a(boolean param0) {
        ck.b(-111);
        if (si.field_b == null) {
          L0: {
            hi.a((byte) 41);
            pf.a(-15291);
            tj.j(-118);
            if (fh.b((byte) -88)) {
              vl.field_n.h(32161, 1);
              hb.a((byte) 124, 0);
              break L0;
            } else {
              break L0;
            }
          }
          dj.a((byte) -126);
          if (param0) {
            field_d = (hm) null;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            dt.a(si.field_b, 23678);
            hi.a((byte) 41);
            pf.a(-15291);
            tj.j(-118);
            if (fh.b((byte) -88)) {
              vl.field_n.h(32161, 1);
              hb.a((byte) 124, 0);
              break L1;
            } else {
              break L1;
            }
          }
          dj.a((byte) -126);
          if (!param0) {
            return;
          } else {
            field_d = (hm) null;
            return;
          }
        }
    }

    final static void a(int param0, mo param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        tg var5 = null;
        String var6 = null;
        tg var7 = null;
        String var8 = null;
        tg var9 = null;
        String var10 = null;
        tg var11 = null;
        String var12 = null;
        tg var13 = null;
        Object stackIn_1_0 = null;
        je stackIn_1_1 = null;
        Object stackIn_1_2 = null;
        String stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        je stackIn_2_1 = null;
        Object stackIn_2_2 = null;
        String stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        je stackIn_3_1 = null;
        Object stackIn_3_2 = null;
        String stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        je stackOut_0_1 = null;
        Object stackOut_0_2 = null;
        String stackOut_0_3 = null;
        Object stackOut_2_0 = null;
        je stackOut_2_1 = null;
        Object stackOut_2_2 = null;
        String stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_1_0 = null;
        je stackOut_1_1 = null;
        Object stackOut_1_2 = null;
        String stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = null;
              stackOut_0_1 = param1.field_u;
              stackOut_0_2 = null;
              stackOut_0_3 = param1.field_q;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_2_3 = stackOut_0_3;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              stackIn_1_3 = stackOut_0_3;
              if ((param1.field_b ^ -1) == -2) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = (je) ((Object) stackIn_2_1);
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = (String) ((Object) stackIn_2_3);
                stackOut_2_4 = param1.field_v;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                stackIn_3_4 = stackOut_2_4;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = (je) ((Object) stackIn_1_1);
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = (String) ((Object) stackIn_1_3);
                stackOut_1_4 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                stackIn_3_4 = stackOut_1_4;
                break L1;
              }
            }
            L2: {
              ng.a((dn) ((Object) stackIn_3_0), stackIn_3_1, (int[]) ((Object) stackIn_3_2), stackIn_3_3, stackIn_3_4, 1, param1.field_b, param1.field_m, param1.field_n);
              if (-1 != (param1.field_b ^ -1)) {
                break L2;
              } else {
                if (bn.a(false)) {
                  break L2;
                } else {
                  if (null != vu.field_M) {
                    break L2;
                  } else {
                    if (no.field_K != null) {
                      break L2;
                    } else {
                      L3: {
                        if (!vi.field_d) {
                          var5 = tn.field_Z;
                          var6 = wh.field_b;
                          var5.field_i.a(14, var6, (byte) -128);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = tn.field_Z;
                      var8 = wq.field_g;
                      var7.field_i.a(20, var8, (byte) -115);
                      break L2;
                    }
                  }
                }
              }
            }
            L4: {
              if (1 != param1.field_b) {
                break L4;
              } else {
                if (bn.a(false)) {
                  break L4;
                } else {
                  if (vu.field_M == null) {
                    break L4;
                  } else {
                    if (param1.field_v != vu.field_M.d((byte) -88)) {
                      break L4;
                    } else {
                      L5: {
                        if (!vi.field_d) {
                          var9 = tn.field_Z;
                          var10 = cv.field_q;
                          var9.field_i.a(14, var10, (byte) -108);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = tn.field_Z;
                      var12 = cq.field_E;
                      var11.field_i.a(20, var12, (byte) -117);
                      break L4;
                    }
                  }
                }
              }
            }
            tn.field_Z.a((byte) 68);
            tn.field_Z.a(param0 + 23899, false);
            tn.field_Z.a(param1.field_d, 7, param1.field_b);
            tn.field_Z.b((byte) 92);
            tn.field_Z.a(param1, 0);
            var13 = tn.field_Z;
            var3 = iu.field_t;
            var4 = ur.field_z;
            var13.field_i.a(0, var4, param0, (byte) -118, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("pg.E(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
            return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_e = 0;
        field_f = field_e;
        field_b = new String[]{"melee", "ranged", "magic", "fire", "aerial"};
    }
}
