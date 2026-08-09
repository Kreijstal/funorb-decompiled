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
        if (param0 != 121) {
            return;
        }
        field_e = null;
        field_f = null;
        field_d = null;
    }

    final static dl a(int param0, int param1, String param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new wi();
              if (param0 >= 17) {
                break L1;
              } else {
                var4 = (String) null;
                nd.a(19, -8, (String) null);
                break L1;
              }
            }
            ((dl) ((Object) var3)).field_c = param1;
            ((dl) ((Object) var3)).field_a = param2;
            stackIn_3_0 = (wi) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (dl) ((Object) stackIn_3_0);
    }

    final static boolean a(boolean param0, int param1, int param2, boolean param3) {
        int stackIn_22_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int var4;
        int var5;
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
                            stackIn_62_0 = 0;
                            break L0;
                          } else {
                            stackIn_62_0 = 1;
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
                            stackIn_52_0 = 0;
                            break L1;
                          } else {
                            stackIn_52_0 = 1;
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
                            stackIn_22_0 = 0;
                            break L2;
                          } else {
                            stackIn_22_0 = 1;
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
        field_b = true;
        field_e = new int[8192];
        field_d = "Just play";
    }
}
