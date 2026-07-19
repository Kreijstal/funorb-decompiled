/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends af {
    static String field_n;
    private String field_d;
    static je field_h;
    static String field_k;
    static int field_l;
    static String field_e;
    static String field_g;
    static String[] field_m;
    static String field_i;
    static String field_j;
    private String field_f;

    final void a(vh param0, int param1) {
        RuntimeException runtimeException = null;
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
              param0.a(this.field_f, 413740432);
              param0.a(-33, this.field_d);
              if (param1 == -11436) {
                break L1;
              } else {
                this.field_d = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("eq.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_8_1 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > 125) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            param3 = param3 | param3 << -1078621656;
            var8_int = param3 ^ param3 >> -786723327;
            var11 = 0;
            L2: while (true) {
              if (-5 >= (var11 ^ -1)) {
                break L0;
              } else {
                var9 = -44 + bm.field_y[var11][0] + (param6 - -(7 & var8_int));
                var10 = -64 + (param0 - -bm.field_y[var11][1] + (param3 & 3));
                if (var12 == 0) {
                  L3: {
                    stackOut_7_0 = param1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var10 <= param0 + -60) {
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  L4: {
                    if (stackIn_10_0 ^ stackIn_10_1 != 0) {
                      nr.field_c[0 + param3 % 6].b(var9, var10, param4, param7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var8_int = var8_int >> 1;
                  param3 = param3 >> 1;
                  var11++;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var8), "eq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final h a(byte param0) {
        int var2 = -87 / ((param0 - -63) / 45);
        return pt.field_db;
    }

    public static void a(boolean param0) {
        field_n = null;
        field_m = null;
        if (!param0) {
          eq.a(0, true, (byte) 4, 16, -48, false, 102, -124);
          field_h = null;
          field_g = null;
          field_j = null;
          field_e = null;
          field_i = null;
          field_k = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_j = null;
          field_e = null;
          field_i = null;
          field_k = null;
          return;
        }
    }

    eq(String param0, String param1) {
        try {
            this.field_d = param1;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "eq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Create a free account to start using this feature";
        field_l = 0;
        field_e = "Return to Main Menu";
        field_k = "This item can only be used on a Kalphite Queen.";
        field_m = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_g = "This unit has not moved yet.";
        field_j = "Withdraw request to join <%0>'s game";
        field_i = "Account created successfully!";
    }
}
