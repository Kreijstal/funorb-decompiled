/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_e;
    static java.awt.Canvas field_d;
    static int field_c;
    static rf field_f;
    static boolean field_b;
    static ed field_a;
    static fd field_g;
    static hh field_h;

    final static ed a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        ed var7 = new ed(param2, param2);
        ed var3 = var7;
        int var4 = 92 % ((param1 - 15) / 58);
        for (var5 = 0; var5 < var3.field_B.length; var5++) {
            var7.field_B[var5] = param0;
        }
        return var3;
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_10_0 = 0;
        L0: {
          if (param1 >= 28) {
            break L0;
          } else {
            of.a('ﾱ', (byte) 49);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (65 > param0) {
                break L3;
              } else {
                if (90 >= param0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (122 < param0) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 0;
            break L1;
          }
          stackIn_10_0 = 1;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(mf param0, mf param1, mf param2, byte param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.b(0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.a(0, "commonui")) {
                L1: {
                  if (!param1.b(0)) {
                    break L1;
                  } else {
                    if (!param1.a(0, "commonui")) {
                      break L1;
                    } else {
                      L2: {
                        if (!param2.b(0)) {
                          break L2;
                        } else {
                          if (!param2.a(0, "button.gif")) {
                            break L2;
                          } else {
                            L3: {
                              if (param3 <= -1) {
                                break L3;
                              } else {
                                field_h = (hh) null;
                                break L3;
                              }
                            }
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("of.F(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final static lm a(int param0, String param1) {
        RuntimeException var2 = null;
        lm stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 122) {
                break L1;
              } else {
                of.a('o', (byte) -83);
                break L1;
              }
            }
            if (ui.field_b != dg.field_o) {
              L2: {
                if (ia.field_y != ui.field_b) {
                  break L2;
                } else {
                  if (!param1.equals(tc.field_j)) {
                    break L2;
                  } else {
                    ui.field_b = vn.field_g;
                    stackIn_8_0 = co.field_a;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              tc.field_j = param1;
              co.field_a = null;
              ui.field_b = dg.field_o;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("of.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (lm) ((Object) stackIn_10_0);
        }
    }

    final static void a(boolean param0) {
        if (param0) {
            of.a(89);
        }
        gi.field_e = null;
        gn.field_k = null;
        qe.field_a = (byte[][]) null;
        bc.field_a = null;
        qk.field_f = null;
        qh.field_k = null;
    }

    final static int a(byte param0) {
        if (param0 >= -72) {
            of.a(-52);
        }
        return md.field_G;
    }

    public static void a(int param0) {
        if (param0 != 122) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_e = "Start Game";
        field_c = 70;
        field_f = new rf();
    }
}
