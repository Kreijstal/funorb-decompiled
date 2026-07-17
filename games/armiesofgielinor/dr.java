/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dr extends ms {
    static String field_y;
    static String field_D;
    Class[] field_u;
    String field_A;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String field_B;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return ((dr) this).field_A;
    }

    abstract nd a(int param0, nd[] param1);

    public static void d(byte param0) {
        field_D = null;
        field_v = null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 96) {
                break L1;
              } else {
                var5 = null;
                dr.a(125, (byte) -9, 20, (nr) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dr.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean a(String param0, byte param1, nd[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Class var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!((dr) this).field_B.equals((Object) (Object) param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((dr) this).field_u.length == param2.length) {
                var4_int = -96 / ((-2 - param1) / 52);
                var5 = 0;
                L1: while (true) {
                  if (var5 >= ((dr) this).field_u.length) {
                    stackOut_29_0 = 1;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    L2: {
                      if (param2[var5].field_e) {
                        L3: {
                          var6 = cq.a(param2[var5].field_c, (byte) -75);
                          if (Boolean.TYPE != var6) {
                            break L3;
                          } else {
                            if (((dr) this).field_u[var5] != Boolean.TYPE) {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              return stackIn_18_0 != 0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (Character.TYPE != var6) {
                            break L4;
                          } else {
                            if (((dr) this).field_u[var5] == Character.TYPE) {
                              break L4;
                            } else {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              return stackIn_22_0 != 0;
                            }
                          }
                        }
                        if (!rt.a(false, var6)) {
                          break L2;
                        } else {
                          if (!rt.a(false, ((dr) this).field_u[var5])) {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (((dr) this).field_u[var5].isInstance(param2[var5].field_c)) {
                          break L2;
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          return stackIn_13_0 != 0;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("dr.E(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          L6: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44).append(param1).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        return stackIn_30_0 != 0;
    }

    dr(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        try {
            ((dr) this).field_u = param1;
            ((dr) this).field_B = param0;
            var7 = new StringBuilder(((dr) this).field_B).append(40);
            var8 = var7;
            for (var5 = 0; var5 < ((dr) this).field_u.length; var5++) {
                StringBuilder discarded$9 = var7.append(hw.a(640, ((dr) this).field_u[var5]));
                if (-1 + ((dr) this).field_u.length > var5) {
                    StringBuilder discarded$10 = var8.append(", ");
                }
            }
            StringBuilder discarded$15 = var8.append(41);
            if (param2 != null) {
                StringBuilder discarded$16 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            ((dr) this).field_A = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "dr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
            var1 = var0 - -1;
            field_z[var0] = Math.min(oe.c(oe.c(rn.a(var1 << 16, 16729482), rn.a(-2046820097, var1) << 8), rn.a(var1 << 2, 252)), 267583488);
            field_z[var0] = oe.c(rn.a(16515326, field_z[var0]), rn.a(32512, field_z[var0] >> 1));
            var2 = gq.a(field_z[var0]);
            var2 = var2 & 655359;
            var3 = 255 & var2;
            if (!(var3 <= 5)) {
                var3 = 5;
            }
            var2 = -256 & var2 | var3;
            field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
