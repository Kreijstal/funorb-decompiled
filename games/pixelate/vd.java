/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ak field_a;
    static String[] field_d;
    static String field_b;
    static ak field_c;

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_3_0 = fl.field_b.a((byte) 24, param0, "");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("vd.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0, aa param1) {
        int dupTemp$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= sd.field_L) {
                    dupTemp$4 = param1.a((byte) -87);
                    tm.field_O[dupTemp$4] = tm.field_O[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= sd.field_L) {
                        sd.field_L = var2_int;
                        if (!param0) {
                          fieldTemp$5 = sd.field_L;
                          sd.field_L = sd.field_L + 1;
                          de.field_e[fieldTemp$5] = param1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        L4: {
                          L5: {
                            if (de.field_e[var3].field_j != param1.field_j) {
                              break L5;
                            } else {
                              var4 = de.field_e[var3].a((byte) -27);
                              if (tm.field_O[var4] > ee.field_d) {
                                tm.field_O[var4] = tm.field_O[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          incrementValue$6 = var2_int;
                          var2_int++;
                          de.field_e[incrementValue$6] = de.field_e[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param1.field_j != de.field_e[var2_int].field_j) {
                        break L6;
                      } else {
                        dupTemp$7 = de.field_e[var2_int].a((byte) 123);
                        tm.field_O[dupTemp$7] = tm.field_O[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                tm.field_O[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("vd.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = -58 % ((-2 - param0) / 49);
        field_d = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, int param2, byte param3) {
        a.a(param0, 99);
        if (param3 != -86) {
            field_d = (String[]) null;
        }
        ra.a(param2, param1, param0, -32268);
    }

    final static void a(boolean param0) {
        byte[] discarded$2 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if ((var1_int ^ -1) <= -25) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    var3 = (String) null;
                    discarded$2 = vd.a((String) null, 91);
                    break L2;
                  }
                }
                break L0;
              } else {
                jm.field_d[var1_int] = new ck();
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
    }

    static {
        field_b = "Show all private chat";
        field_d = new String[]{"The marker at the bottom  of the screen will slide towards the player with the <col=FF9900>highest score</col>. Each match consists of 5, 10, or 20 pictures; the player with the highest score after all pictures are finished is declared the winner.", "You", "Opponent", null};
    }
}
