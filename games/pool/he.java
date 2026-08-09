/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static String field_a;
    static volatile boolean field_c;
    static di field_b;
    static String[] field_d;

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            em.a((java.awt.Component) ((Object) param0), (byte) -39);
            hj.a((java.awt.Component) ((Object) param0), false);
            if (param1 == 0) {
              if (oa.field_a != null) {
                oa.field_a.a((java.awt.Component) ((Object) param0), 84);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("he.D(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_39_0 = 0;
        int var4;
        int var5;
        java.awt.Canvas var6;
        L0: {
          if (param3 == 0) {
            break L0;
          } else {
            var6 = (java.awt.Canvas) null;
            he.a((java.awt.Canvas) null, -1);
            break L0;
          }
        }
        if (param1) {
          if (kb.field_g[param2] <= kb.field_g[param0]) {
            if (kb.field_g[param2] >= kb.field_g[param0]) {
              if (ah.field_c[param2] <= ah.field_c[param0]) {
                if (ah.field_c[param2] < ah.field_c[param0]) {
                  return false;
                } else {
                  var4 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
                  var5 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L1: {
                        if (param0 >= param2) {
                          stackIn_39_0 = 0;
                          break L1;
                        } else {
                          stackIn_39_0 = 1;
                          break L1;
                        }
                      }
                      return stackIn_39_0 != 0;
                    }
                  } else {
                    return true;
                  }
                }
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
          if (ah.field_c[param0] < ah.field_c[param2]) {
            return true;
          } else {
            if (ah.field_c[param2] >= ah.field_c[param0]) {
              if (kb.field_g[param2] <= kb.field_g[param0]) {
                if (kb.field_g[param2] >= kb.field_g[param0]) {
                  var4 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
                  var5 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L2: {
                        if (param0 >= param2) {
                          stackIn_20_0 = 0;
                          break L2;
                        } else {
                          stackIn_20_0 = 1;
                          break L2;
                        }
                      }
                      return stackIn_20_0 != 0;
                    }
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
              return false;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != -13) {
            field_c = false;
        }
    }

    final static boolean a(char param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ul.a(param0, (byte) 125)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == null) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == 15692) {
                    break L1;
                  } else {
                    he.a(-56);
                    break L1;
                  }
                }
                var3_int = param1.length();
                if (-13 >= (var3_int ^ -1)) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (qd.a(0, param0)) {
                    if (0 != var3_int) {
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_18_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("he.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    final static an a(di param0, String param1, int param2, di param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        an stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0.b(param4, -1);
            var6 = param0.a(var5_int, param2, param1);
            stackIn_1_0 = wc.a(param0, 43, var5_int, param3, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("he.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_c = true;
        field_a = "This game option is not available in rated games.";
        field_d = new String[]{"Terrible!", "Awful!", "Egad!"};
    }
}
