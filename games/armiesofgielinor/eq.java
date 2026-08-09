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
        try {
            param0.a(this.field_f, 413740432);
            param0.a(-33, this.field_d);
            if (param1 != -11436) {
                this.field_d = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "eq.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        boolean stackIn_7_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_8_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
                L3: {
                  var9 = -44 + bm.field_y[var11][0] + (param6 - -(7 & var8_int));
                  var10 = -64 + (param0 - -bm.field_y[var11][1] + (param3 & 3));
                  stackIn_7_0 = param1;

                  if (var10 <= param0 + -60) {
                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (stackIn_8_0 ^ stackIn_8_1 != 0) {
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
