/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static int[] field_f;
    static int[] field_e;
    static String field_d;
    static boolean field_b;
    static int field_c;
    static mh field_a;
    static String field_g;

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final static dl a(int param0, int param1, String param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        wi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new wi();
              if (param0 >= 17) {
                break L1;
              } else {
                var4 = null;
                dl discarded$2 = nd.a(19, -8, (String) null);
                break L1;
              }
            }
            ((dl) (Object) var3).field_c = param1;
            ((dl) (Object) var3).field_a = param2;
            stackOut_2_0 = (wi) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("nd.B(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (dl) (Object) stackIn_3_0;
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (param3) {
          if (ec.field_N[param1] <= ec.field_N[param2]) {
            if (ec.field_N[param2] > ec.field_N[param1]) {
              return false;
            } else {
              if (pj.field_b[param1] <= pj.field_b[param2]) {
                if (pj.field_b[param2] <= pj.field_b[param1]) {
                  if (param0) {
                    var4 = ib.field_D[param2] + (ao.field_p[param2] + lf.field_r[param2]);
                    var5 = ib.field_D[param1] + lf.field_r[param1] - -ao.field_p[param1];
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param1 <= param2) {
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            break L0;
                          } else {
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            break L0;
                          }
                        }
                        return stackIn_62_0 != 0;
                      }
                    }
                  } else {
                    field_c = -96;
                    var4 = ib.field_D[param2] + (ao.field_p[param2] + lf.field_r[param2]);
                    var5 = ib.field_D[param1] + lf.field_r[param1] - -ao.field_p[param1];
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param1 <= param2) {
                            stackOut_51_0 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            break L1;
                          } else {
                            stackOut_50_0 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            break L1;
                          }
                        }
                        return stackIn_52_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          if (pj.field_b[param1] <= pj.field_b[param2]) {
            if (pj.field_b[param1] < pj.field_b[param2]) {
              return false;
            } else {
              if (ec.field_N[param1] > ec.field_N[param2]) {
                return true;
              } else {
                if (ec.field_N[param2] <= ec.field_N[param1]) {
                  if (!param0) {
                    field_c = -96;
                    var4 = ib.field_D[param2] + (ao.field_p[param2] + lf.field_r[param2]);
                    var5 = ib.field_D[param1] + lf.field_r[param1] - -ao.field_p[param1];
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        if (param1 <= param2) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    var4 = ib.field_D[param2] + (ao.field_p[param2] + lf.field_r[param2]);
                    var5 = ib.field_D[param1] + lf.field_r[param1] - -ao.field_p[param1];
                    if (var5 > var4) {
                      return true;
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param1 <= param2) {
                            stackOut_21_0 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            break L2;
                          } else {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L2;
                          }
                        }
                        return stackIn_22_0 != 0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_e = new int[8192];
        field_d = "Just play";
    }
}
