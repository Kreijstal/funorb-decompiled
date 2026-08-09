/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;
    static hj field_f;
    static int field_g;
    static boolean field_d;
    static qj field_b;
    static String field_e;
    static long field_c;

    final static int a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 3 % ((-74 - param0) / 40);
            if (!param1.equalsIgnoreCase("auto")) {
              var3 = (CharSequence) ((Object) param1);
              stackIn_4_0 = mo.a(var3, (byte) -116);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ka.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static float a(int param0, int param1, qm param2, wd[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        float stackIn_1_0 = 0.0f;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 21 % ((param1 - 4) / 58);
            stackIn_1_0 = hi.a(param3.length, 0.0f, 1, param3, -24659, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ka.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        uk.b(-114);
        ci.field_o = true;
        fi.field_nb = true;
        field_b.a(false);
        if (param0 != -1) {
          field_e = (String) null;
          da.a(false, we.field_t, 22676);
          return;
        } else {
          da.a(false, we.field_t, 22676);
          return;
        }
    }

    final static int a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.equals("<")) {
              if (!param1.equals("==")) {
                if (!param1.equals(">")) {
                  L1: {
                    if (param0 == 5) {
                      break L1;
                    } else {
                      field_d = false;
                      break L1;
                    }
                  }
                  if (param1.equals("<=")) {
                    stackIn_14_0 = 3;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1.equals(">=")) {
                      stackIn_18_0 = 6;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!param1.equals("!=")) {
                        throw new IllegalArgumentException();
                      } else {
                        stackIn_21_0 = 5;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_8_0 = 4;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 2;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("ka.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  return stackIn_21_0;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 5) {
            field_b = (qj) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        wd[] var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = hc.a(param2, (byte) 30);
              if (param1 >= 97) {
                break L1;
              } else {
                var4 = (wd[]) null;
                ka.a(82, -43, (qm) null, (wd[]) null);
                break L1;
              }
            }
            L2: {
              if (param0.indexOf(param2) != -1) {
                break L2;
              } else {
                if (param0.indexOf(var3) != -1) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param0.startsWith(param2)) {
                        break L4;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L4;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_14_0 = 0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackIn_14_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ka.E(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    static {
        field_g = 0;
        field_a = "<img=13>";
        field_e = "End Game";
    }
}
