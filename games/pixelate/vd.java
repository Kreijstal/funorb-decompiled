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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = fl.field_b.a((byte) 24, param0, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("vd.E(");

            if (param0 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0, aa param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if ((var2_int ^ -1) <= -4) {
                var2_int = 0;
                L2: while (true) {
                  if (var2_int >= sd.field_L) {
                    dupTemp$0 = param1.a((byte) -87);
                    tm.field_O[dupTemp$0] = tm.field_O[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= sd.field_L) {
                        sd.field_L = var2_int;
                        if (!param0) {
                          fieldTemp$1 = sd.field_L;
                          sd.field_L = sd.field_L + 1;
                          de.field_e[fieldTemp$1] = param1;
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
                          incrementValue$2 = var2_int;
                          var2_int++;
                          de.field_e[incrementValue$2] = de.field_e[var3];
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
                        dupTemp$3 = de.field_e[var2_int].a((byte) 123);
                        tm.field_O[dupTemp$3] = tm.field_O[dupTemp$3] + 1;
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
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("vd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
        int var1_int = 0;
        int var2 = 0;
        String var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
                    vd.a((String) null, 91);
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
