/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static int[] field_b;
    static int field_a;
    static char[] field_c;

    final static String a(int param0, int param1, int param2) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        char[] var4;
        int var5;
        vh var6;
        String var7;
        char[] var8;
        char[] var9;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        char[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        char[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        char[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        char[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        char[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        if (param0 >= 60) {
          return p.a(param0 % 60, param1, 45, param0 / 60);
        } else {
          var7 = lq.field_S;
          var9 = var7.toCharArray();
          var8 = var9;
          var4 = var8;
          if (param2 != 10) {
            L0: {
              var6 = (vh) null;
              ek.a((vh) null, (byte) 119, -128);
              var5 = var7.indexOf("mm");
              incrementValue$8 = var5;
              var5++;
              stackIn_19_0 = (char[]) (var4);

              stackIn_19_1 = incrementValue$8;

              if ((param0 ^ -1) > -1) {
                stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                stackIn_20_1 = stackIn_19_1;
                stackIn_20_2 = 45;
                break L0;
              } else {
                stackIn_20_0 = (char[]) ((Object) stackIn_19_0);
                stackIn_20_1 = stackIn_19_1;
                stackIn_20_2 = 48 + param0 / 10;
                break L0;
              }
            }
            L1: {
              stackIn_20_0[stackIn_20_1] = (char)stackIn_20_2;
              incrementValue$9 = var5;
              var5++;
              stackIn_22_0 = (char[]) (var4);

              stackIn_22_1 = incrementValue$9;

              if ((param0 ^ -1) <= -1) {
                stackIn_23_0 = (char[]) ((Object) stackIn_22_0);
                stackIn_23_1 = stackIn_22_1;
                stackIn_23_2 = param0 % 10 + 48;
                break L1;
              } else {
                stackIn_23_0 = (char[]) ((Object) stackIn_22_0);
                stackIn_23_1 = stackIn_22_1;
                stackIn_23_2 = 45;
                break L1;
              }
            }
            L2: {
              stackIn_23_0[stackIn_23_1] = (char)stackIn_23_2;
              var5 = var7.indexOf("ss");
              incrementValue$10 = var5;
              var5++;
              stackIn_25_0 = (char[]) (var4);

              stackIn_25_1 = incrementValue$10;

              if (0 > param1) {
                stackIn_26_0 = (char[]) ((Object) stackIn_25_0);
                stackIn_26_1 = stackIn_25_1;
                stackIn_26_2 = 45;
                break L2;
              } else {
                stackIn_26_0 = (char[]) ((Object) stackIn_25_0);
                stackIn_26_1 = stackIn_25_1;
                stackIn_26_2 = param1 / 10 + 48;
                break L2;
              }
            }
            L3: {
              stackIn_26_0[stackIn_26_1] = (char)stackIn_26_2;
              incrementValue$11 = var5;
              var5++;
              stackIn_28_0 = (char[]) (var4);

              stackIn_28_1 = incrementValue$11;

              if ((param1 ^ -1) <= -1) {
                stackIn_29_0 = (char[]) ((Object) stackIn_28_0);
                stackIn_29_1 = stackIn_28_1;
                stackIn_29_2 = param1 % 10 + 48;
                break L3;
              } else {
                stackIn_29_0 = (char[]) ((Object) stackIn_28_0);
                stackIn_29_1 = stackIn_28_1;
                stackIn_29_2 = 45;
                break L3;
              }
            }
            stackIn_29_0[stackIn_29_1] = (char)stackIn_29_2;
            return new String(var9);
          } else {
            L4: {
              var5 = var7.indexOf("mm");
              incrementValue$12 = var5;
              var5++;
              stackIn_6_0 = (char[]) (var4);

              stackIn_6_1 = incrementValue$12;

              if ((param0 ^ -1) > -1) {
                stackIn_7_0 = (char[]) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 45;
                break L4;
              } else {
                stackIn_7_0 = (char[]) ((Object) stackIn_6_0);
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = 48 + param0 / 10;
                break L4;
              }
            }
            L5: {
              stackIn_7_0[stackIn_7_1] = (char)stackIn_7_2;
              incrementValue$13 = var5;
              var5++;
              stackIn_9_0 = (char[]) (var4);

              stackIn_9_1 = incrementValue$13;

              if ((param0 ^ -1) <= -1) {
                stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = param0 % 10 + 48;
                break L5;
              } else {
                stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                stackIn_10_1 = stackIn_9_1;
                stackIn_10_2 = 45;
                break L5;
              }
            }
            L6: {
              stackIn_10_0[stackIn_10_1] = (char)stackIn_10_2;
              var5 = var7.indexOf("ss");
              incrementValue$14 = var5;
              var5++;
              stackIn_12_0 = (char[]) (var4);

              stackIn_12_1 = incrementValue$14;

              if (0 > param1) {
                stackIn_13_0 = (char[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 45;
                break L6;
              } else {
                stackIn_13_0 = (char[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = param1 / 10 + 48;
                break L6;
              }
            }
            L7: {
              stackIn_13_0[stackIn_13_1] = (char)stackIn_13_2;
              incrementValue$15 = var5;
              var5++;
              stackIn_15_0 = (char[]) (var4);

              stackIn_15_1 = incrementValue$15;

              if ((param1 ^ -1) <= -1) {
                stackIn_16_0 = (char[]) ((Object) stackIn_15_0);
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = param1 % 10 + 48;
                break L7;
              } else {
                stackIn_16_0 = (char[]) ((Object) stackIn_15_0);
                stackIn_16_1 = stackIn_15_1;
                stackIn_16_2 = 45;
                break L7;
              }
            }
            stackIn_16_0[stackIn_16_1] = (char)stackIn_16_2;
            return new String(var9);
          }
        }
    }

    final static int[] a(int param0) {
        int var1 = 53 % ((param0 - 72) / 37);
        return new int[8];
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -39) {
            field_a = 27;
        }
    }

    final static void a(vh param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        aa var3 = null;
        vh var4 = null;
        vh stackIn_5_0 = null;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -38) {
              L1: {
                L2: {
                  stackIn_5_0 = (vh) (param0);

                  if (0 == (param2 ^ -1)) {
                    break L2;
                  } else {
                    stackIn_5_0 = (vh) ((Object) stackIn_5_0);

                    if ((long)param2 != param0.field_c) {
                      break L2;
                    } else {
                      stackIn_6_0 = (vh) ((Object) stackIn_5_0);
                      stackIn_6_1 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_6_0 = (vh) ((Object) stackIn_5_0);
                stackIn_6_1 = 0;
                break L1;
              }
              L3: {
                stackIn_6_0.field_Ib = stackIn_6_1 != 0;
                if (null == param0.field_T) {
                  break L3;
                } else {
                  if (param0.field_T.c(0)) {
                    break L3;
                  } else {
                    var3 = new aa(param0.field_T);
                    var4 = (vh) ((Object) var3.b((byte) -92));
                    L4: while (true) {
                      if (var4 == null) {
                        break L3;
                      } else {
                        ek.a(var4, (byte) -69, param2);
                        var4 = (vh) ((Object) var3.b(-111));
                        continue L4;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("ek.C(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0, boolean param1, int param2, int param3) {
        if (param0 != -88) {
            field_b = (int[]) null;
            return ph.a((byte) -115);
        }
        return ph.a((byte) -115);
    }

    static {
        field_b = new int[12];
        field_a = 14;
        field_c = new char[128];
    }
}
