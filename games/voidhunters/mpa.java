/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mpa extends rqa {
    static int[] field_o;
    static float[] field_p;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(77, 89));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mpa.A(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    mpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, float param1, float param2, float param3) {
        float stackIn_3_0 = 0.0f;
        float stackIn_6_0 = 0.0f;
        float stackIn_11_0 = 0.0f;
        float var4;
        float var5;
        float var6;
        L0: {
          if (param2 < 0.0f) {
            stackIn_3_0 = -param2;
            break L0;
          } else {
            stackIn_3_0 = param2;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (param1 >= 0.0f) {
            stackIn_6_0 = param1;
            break L1;
          } else {
            stackIn_6_0 = -param1;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        if (param0 <= -16) {
          L2: {
            if (0.0f <= param3) {
              stackIn_11_0 = param3;
              break L2;
            } else {
              stackIn_11_0 = -param3;
              break L2;
            }
          }
          var6 = stackIn_11_0;
          if (var4 >= var5) {
            if (var4 < var6) {
              if (var5 < var6) {
                if (0.0f >= param3) {
                  return 3;
                } else {
                  return 2;
                }
              } else {
                if (0.0f >= param2) {
                  return 5;
                } else {
                  return 4;
                }
              }
            } else {
              if (0.0f >= param2) {
                return 5;
              } else {
                return 4;
              }
            }
          } else {
            if (var6 < var5) {
              if (0.0f < param1) {
                return 0;
              } else {
                return 1;
              }
            } else {
              if (var4 < var6) {
                if (var5 < var6) {
                  if (0.0f >= param3) {
                    return 3;
                  } else {
                    return 2;
                  }
                } else {
                  if (0.0f >= param2) {
                    return 5;
                  } else {
                    return 4;
                  }
                }
              } else {
                if (0.0f >= param2) {
                  return 5;
                } else {
                  return 4;
                }
              }
            }
          }
        } else {
          return 87;
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != -27645) {
            return;
        }
        field_o = null;
    }

    static {
        field_o = new int[8192];
        field_p = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
