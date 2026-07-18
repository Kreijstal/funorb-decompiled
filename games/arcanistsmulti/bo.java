/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bo {
    static volatile int field_e;
    static qb[] field_a;
    static int field_d;
    static boolean field_c;
    static String field_b;

    final static String a(String param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        ab var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_12_0 = null;
        String stackOut_16_0 = null;
        String stackOut_20_0 = null;
        Object stackOut_25_0 = null;
        String stackOut_23_0 = null;
        String stackOut_8_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            var6 = (CharSequence) (Object) param0;
            if (!vn.a(var6, 0)) {
              stackOut_2_0 = fn.field_h;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (jb.field_t == 2) {
                if (!je.a(16, param0)) {
                  if (kl.a(param0, 1)) {
                    stackOut_12_0 = tj.a(-30, new String[1], gj.field_e);
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    L1: {
                      if (rc.field_m < 100) {
                        break L1;
                      } else {
                        if (ah.field_c > 0) {
                          break L1;
                        } else {
                          stackOut_16_0 = rg.field_e;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0;
                        }
                      }
                    }
                    if (200 <= rc.field_m) {
                      stackOut_20_0 = rg.field_e;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    } else {
                      if (!sa.a(param0, 320)) {
                        var5 = he.field_e;
                        var5.b((byte) -63, param2);
                        var5.field_g = var5.field_g + 1;
                        var4 = var5.field_g;
                        var5.f(0, (byte) -80);
                        var5.a(param0, 23333);
                        var5.b(-var4 + var5.field_g, (byte) 43);
                        stackOut_25_0 = null;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        stackOut_23_0 = tj.a(125, new String[1], r.field_a);
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = sd.field_l;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = nm.field_e;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("bo.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + -26 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_26_0;
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (param0) {
          if (nf.field_z[param1] < nf.field_z[param3]) {
            return true;
          } else {
            if (nf.field_z[param1] > nf.field_z[param3]) {
              return false;
            } else {
              if (lm.field_i[param3] <= lm.field_i[param1]) {
                if (lm.field_i[param3] >= lm.field_i[param1]) {
                  if (param2 >= -32) {
                    boolean discarded$2 = bo.a(true, 73, (byte) 32, -114);
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param3 <= param1) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L0;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L0;
                          }
                        }
                        return stackIn_58_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param3 <= param1) {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            break L1;
                          } else {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L1;
                          }
                        }
                        return stackIn_49_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          if (lm.field_i[param1] < lm.field_i[param3]) {
            return true;
          } else {
            if (lm.field_i[param3] >= lm.field_i[param1]) {
              if (nf.field_z[param3] <= nf.field_z[param1]) {
                if (nf.field_z[param1] <= nf.field_z[param3]) {
                  if (param2 >= -32) {
                    boolean discarded$3 = bo.a(true, 73, (byte) 32, -114);
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param3 <= param1) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = tj.field_u[param1] + (hc.field_e[param1] - -ba.field_o[param1]);
                    var5 = tj.field_u[param3] + hc.field_e[param3] - -ba.field_o[param3];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param3 <= param1) {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            break L2;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            break L2;
                          }
                        }
                        return stackIn_20_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 100;
        field_e = 0;
        field_c = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
