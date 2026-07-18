/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Class;

final class cj {
    static int field_c;
    static ad field_s;
    int[] field_g;
    static boolean field_l;
    int field_n;
    static String field_q;
    String field_h;
    String field_i;
    boolean field_j;
    int field_k;
    km field_t;
    long field_p;
    String field_d;
    int field_e;
    static int[] field_o;
    static String field_f;
    static String[] field_b;
    int field_m;
    String field_r;
    int field_a;

    final int b(int param0) {
        if (!((cj) this).field_j) {
          if (2 == ((cj) this).field_n) {
            if (((cj) this).field_e > 0) {
              return 2;
            } else {
              if (param0 == -6761) {
                if (((cj) this).field_p != hh.field_d) {
                  L0: {
                    if (oa.field_q != 2) {
                      break L0;
                    } else {
                      int discarded$6 = -73;
                      if (!ch.a(((cj) this).field_i)) {
                        break L0;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              } else {
                int discarded$7 = ((cj) this).b(-36);
                if (((cj) this).field_p != hh.field_d) {
                  L1: {
                    if (oa.field_q != 2) {
                      break L1;
                    } else {
                      int discarded$8 = -73;
                      if (!ch.a(((cj) this).field_i)) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 == -6761) {
              if (((cj) this).field_p != hh.field_d) {
                L2: {
                  if (oa.field_q != 2) {
                    break L2;
                  } else {
                    int discarded$9 = -73;
                    if (!ch.a(((cj) this).field_i)) {
                      break L2;
                    } else {
                      return 1;
                    }
                  }
                }
                return 0;
              } else {
                return 1;
              }
            } else {
              int discarded$10 = ((cj) this).b(-36);
              if (((cj) this).field_p != hh.field_d) {
                if (oa.field_q == 2) {
                  int discarded$11 = -73;
                  if (ch.a(((cj) this).field_i)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_5_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (!param1.equals((Object) (Object) "I")) {
                if (!param1.equals((Object) (Object) "S")) {
                  var2_int = -46 % ((9 - param0) / 58);
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_12_0 = Long.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    if (param1.equals((Object) (Object) "Z")) {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (!param1.equals((Object) (Object) "F")) {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (!param1.equals((Object) (Object) "C")) {
                            stackOut_27_0 = Class.forName(param1);
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = Character.TYPE;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        } else {
                          stackOut_22_0 = Double.TYPE;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        }
                      } else {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = Short.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("cj.C(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_28_0;
    }

    public static void a() {
        field_s = null;
        field_o = null;
        field_b = null;
        field_q = null;
        field_f = null;
    }

    cj(boolean param0) {
        ((cj) this).field_p = hk.field_Kb;
        ((cj) this).field_j = ea.field_b;
        ((cj) this).field_h = aa.field_f;
        ((cj) this).field_i = vl.field_k;
        ((cj) this).field_r = vc.field_hb;
        ((cj) this).field_n = td.field_h;
        ((cj) this).field_a = pl.field_b;
        if (param0) {
            ((cj) this).field_g = ne.field_e;
        } else {
            ((cj) this).field_g = null;
        }
        ((cj) this).field_d = pb.field_l;
        ((cj) this).field_k = ef.field_b;
        ((cj) this).field_m = eb.field_d;
        ((cj) this).field_e = va.field_b;
    }

    cj(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((cj) this).field_i = param1;
            ((cj) this).field_e = 0;
            ((cj) this).field_g = null;
            ((cj) this).field_d = param3;
            ((cj) this).field_j = true;
            ((cj) this).field_h = param4;
            ((cj) this).field_p = 0L;
            ((cj) this).field_n = param0;
            ((cj) this).field_r = param1;
            ((cj) this).field_m = 0;
            ((cj) this).field_a = 0;
            ((cj) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "cj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Show chat (1 unread message)";
        field_o = new int[128];
        field_f = "Return to game";
    }
}
