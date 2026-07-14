/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends ie {
    static String field_N;
    private int field_R;
    private boolean field_O;
    static int[] field_Q;
    static int[] field_P;
    private int field_K;
    private int field_M;
    private String field_I;
    static String field_L;
    private jl field_J;

    final String b(byte param0) {
        int var2 = 0;
        String var3 = null;
        ng stackIn_2_0 = null;
        ng stackIn_3_0 = null;
        ng stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ng stackIn_6_0 = null;
        ng stackIn_7_0 = null;
        ng stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ng stackOut_5_0 = null;
        ng stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ng stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ng stackOut_1_0 = null;
        ng stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ng stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 < 16) {
          L0: {
            ((qp) this).field_O = false;
            var2 = ((qp) this).field_H.field_D ? 1 : 0;
            ((qp) this).field_H.field_D = ((qp) this).field_D;
            var3 = ((qp) this).field_H.b((byte) 70);
            stackOut_5_0 = ((qp) this).field_H;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (ng) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (ng) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_D = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            var2 = ((qp) this).field_H.field_D ? 1 : 0;
            ((qp) this).field_H.field_D = ((qp) this).field_D;
            var3 = ((qp) this).field_H.b((byte) 70);
            stackOut_1_0 = ((qp) this).field_H;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (ng) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (ng) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_D = stackIn_4_1 != 0;
          return var3;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_N = null;
        if (param0 != -84) {
          var2 = null;
          boolean discarded$2 = qp.a(true, 1L, (String) null);
          field_Q = null;
          field_P = null;
          field_L = null;
          return;
        } else {
          field_Q = null;
          field_P = null;
          field_L = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = param2 + ((qp) this).field_z;
        int var6 = param0 + ((qp) this).field_p;
        super.a(param0, param1, param2, (byte) 125);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        int var7 = !((qp) this).field_O ? 0 : -((qp) this).field_M + (((qp) this).field_E - ((qp) this).field_R * 2);
        int discarded$0 = ((qp) this).field_J.a(((qp) this).field_I, var7 + (var5 + ((qp) this).field_R), var6 - -((qp) this).field_R, ((qp) this).field_M + -((qp) this).field_R, ((qp) this).field_C - 2 * ((qp) this).field_R, ((qp) this).field_K, -1, !((qp) this).field_O ? 2 : 0, 1, ((qp) this).field_J.field_w);
        int var8 = -35 % ((70 - param3) / 49);
    }

    final static boolean a(boolean param0, long param1, String param2) {
        im var4 = null;
        int stackIn_22_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        var4 = re.a(param2, -1);
        if (param0) {
          if (var4 != null) {
            if (null != var4.field_Nb) {
              return true;
            } else {
              L0: {
                L1: {
                  if (null == io.field_c) {
                    break L1;
                  } else {
                    if (null == ll.a(param1, 14428)) {
                      break L1;
                    } else {
                      stackOut_26_0 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      break L0;
                    }
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              }
              return stackIn_28_0 != 0;
            }
          } else {
            L2: {
              L3: {
                if (null == io.field_c) {
                  break L3;
                } else {
                  if (null == ll.a(param1, 14428)) {
                    break L3;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                }
              }
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            return stackIn_22_0 != 0;
          }
        } else {
          qp.a((byte) 102);
          if (var4 != null) {
            if (null == var4.field_Nb) {
              if (null != io.field_c) {
                if (null == ll.a(param1, 14428)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (null != io.field_c) {
              if (null == ll.a(param1, 14428)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    qp(int param0, int param1, int param2, int param3, ng param4, boolean param5, int param6, int param7, jl param8, int param9, String param10) {
        super(param0, param1, param2, param3, (eb) null, (fn) null);
        ((qp) this).field_H = param4;
        ((qp) this).field_I = param10;
        ((qp) this).field_O = param5 ? true : false;
        ((qp) this).field_M = param6;
        ((qp) this).field_R = param7;
        ((qp) this).field_J = param8;
        ((qp) this).field_K = param9;
        int var12 = -((qp) this).field_R + ((qp) this).field_M;
        int var13 = ((qp) this).field_J.a(param10, var12, ((qp) this).field_J.field_w) - -(2 * ((qp) this).field_R);
        if (var13 > param3) {
            ((qp) this).a(param2, (byte) 20, param1, param0, var13);
        } else {
            var13 = param3;
        }
        int var14 = ((qp) this).field_O ? 0 : ((qp) this).field_M - -(2 * ((qp) this).field_R);
        ((qp) this).field_H.a(-((qp) this).field_M + (param2 - 3 * ((qp) this).field_R), (byte) 110, (var13 - param3 >> 1538837985) + ((qp) this).field_R, var14, -(((qp) this).field_R * 2) + param3);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (null != eg.field_n) {
          if (!eg.field_n.a(-105)) {
            if (null != hc.field_M) {
              if (!hc.field_M.j(-1)) {
                if (param0) {
                  if (!jg.k(1)) {
                    if (fl.a(param3, param1, param2, 0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  qp.a((byte) 0);
                  if (!jg.k(1)) {
                    if (fl.a(param3, param1, param2, 0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                hc.field_M = null;
                jp.a(62);
                return true;
              }
            } else {
              if (param0) {
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                qp.a((byte) 0);
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          } else {
            jp.a(-99);
            return true;
          }
        } else {
          if (null != hc.field_M) {
            if (!hc.field_M.j(-1)) {
              if (param0) {
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                qp.a((byte) 0);
                if (!jg.k(1)) {
                  if (fl.a(param3, param1, param2, 0)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              hc.field_M = null;
              jp.a(62);
              return true;
            }
          } else {
            if (param0) {
              if (jg.k(1)) {
                return true;
              } else {
                L0: {
                  if (fl.a(param3, param1, param2, 0)) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L0;
                  }
                }
                return stackIn_13_0 != 0;
              }
            } else {
              qp.a((byte) 0);
              if (!jg.k(1)) {
                if (!fl.a(param3, param1, param2, 0)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Your email address is used to identify this account";
        field_P = new int[5];
        field_Q = new int[128];
    }
}
