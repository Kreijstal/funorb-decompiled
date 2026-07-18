/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends bj {
    static int field_sb;
    static int field_rb;
    static int field_tb;

    final static boolean j(byte param0) {
        if (!kn.field_L) {
            return false;
        }
        if (vk.field_g != 0) {
            return false;
        }
        return true;
    }

    final static aj b(String param0, boolean param1) {
        RuntimeException var2 = null;
        aj stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        aj stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (ci.field_ub != vl.field_A) {
              L1: {
                if (vl.field_A != kn.field_D) {
                  break L1;
                } else {
                  if (!param0.equals((Object) (Object) lc.field_e)) {
                    break L1;
                  } else {
                    vl.field_A = ji.field_T;
                    stackOut_5_0 = kf.field_j;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              lc.field_e = param0;
              kf.field_j = null;
              vl.field_A = ci.field_ub;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("sb.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + true + ')');
        }
        return (aj) (Object) stackIn_8_0;
    }

    final static void a(String param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (-1 != ac.field_k) {
                break L1;
              } else {
                if (kj.field_c == -1) {
                  ac.field_k = hn.field_k;
                  kj.field_c = rf.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                ei.field_u = ei.field_u + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) eg.field_j)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (eg.field_j != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!uk.field_e) {
                  if (ei.field_u >= be.field_f) {
                    if (ei.field_u < sj.field_n + be.field_f) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  ei.field_u = 0;
                  break L5;
                } else {
                  if (uk.field_e) {
                    ei.field_u = be.field_f;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      ei.field_u = be.field_f;
                      break L5;
                    } else {
                      ei.field_u = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                vn.field_Db = kj.field_c;
                if (param0 != null) {
                  uk.field_e = false;
                  break L6;
                } else {
                  if (var2_int != 0) {
                    uk.field_e = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              fm.field_S = ac.field_k;
              break L2;
            }
            L7: {
              if (uk.field_e) {
                break L7;
              } else {
                if (ei.field_u >= be.field_f) {
                  break L7;
                } else {
                  if (lf.field_O) {
                    fm.field_S = ac.field_k;
                    ei.field_u = 0;
                    vn.field_Db = kj.field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              eg.field_j = param0;
              if (!uk.field_e) {
                break L8;
              } else {
                if (ei.field_u != ae.field_k) {
                  break L8;
                } else {
                  uk.field_e = false;
                  ei.field_u = 0;
                  break L8;
                }
              }
            }
            kj.field_c = -1;
            ac.field_k = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("sb.H(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + true + ')');
        }
    }

    final void c(mf param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.c(param0, 117);
              if (param1 >= 45) {
                break L1;
              } else {
                field_sb = -34;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sb.T(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void d(int param0, int param1, int param2) {
        ac.field_k = param2;
        kj.field_c = param1;
    }

    sb(fm param0, mf param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_tb = 360;
    }
}
