/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static String field_a;
    static String field_c;
    static long field_b;
    static String field_e;

    final static vh a(eh param0, int param1, String param2, String param3, eh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vh stackIn_1_0 = null;
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
            var5_int = param0.a(param1, param2);
            var6 = param0.a(-70, var5_int, param3);
            stackIn_1_0 = ie.a(false, var6, var5_int, param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("pc.B(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(mg param0, byte param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ij var2 = null;
        RuntimeException var2_ref = null;
        rm[] var3 = null;
        rm var4 = null;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              pj.a(param0, 256);
              if (!db.b((byte) 13, 0)) {
                break L1;
              } else {
                if (sh.a(4712, 100) != 0) {
                  df.b(0, 0, 200, 400, 0);
                  ul.b((byte) 96);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              df.b(0, 0, 200, 400, 8421504);
              if (param1 <= -24) {
                break L2;
              } else {
                pc.a(111);
                break L2;
              }
            }
            var2 = (ij) ((Object) sk.field_a.a((byte) -98));
            L3: while (true) {
              if (var2 == null) {
                ul.b((byte) 121);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  if (0 == var2.field_g) {
                    var3 = tk.field_d;
                    break L4;
                  } else {
                    if (1 != var2.field_g) {
                      var3 = wh.field_b;
                      break L4;
                    } else {
                      var3 = ic.field_y;
                      break L4;
                    }
                  }
                }
                L5: {
                  var4 = var3[var2.field_o / 3];
                  var4.field_m[1] = var2.field_l * 65793;
                  if (!var2.field_p) {
                    var4.b(-31, 200);
                    break L5;
                  } else {
                    var4.a(-31, 200);
                    break L5;
                  }
                }
                var2 = (ij) ((Object) sk.field_a.a(16213));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("pc.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 != -30114) {
            field_b = -39L;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_a = "Create a free account to";
        field_c = "Show all game chat";
        field_e = "Your opponent is <%0>.";
        field_d = "Email (Login):";
    }
}
