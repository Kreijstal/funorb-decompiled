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
        param0.a(((eq) this).field_f, 413740432);
        param0.a(-33, ((eq) this).field_d);
        if (param1 != -11436) {
            ((eq) this).field_d = null;
        }
    }

    final static void a(int param0, boolean param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_18_1 = 0;
        boolean stackOut_15_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_17_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        boolean stackOut_3_0 = false;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= 125) {
          field_g = null;
          param3 = param3 | param3 << -1078621656;
          var8 = param3 ^ param3 >> -786723327;
          var11 = 0;
          L0: while (true) {
            if (-5 < var11) {
              L1: {
                var9 = -44 + bm.field_y[var11][0] + (param6 - -(7 & var8));
                var10 = -64 + (param0 - -bm.field_y[var11][1] + (param3 & 3));
                stackOut_15_0 = param1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (var10 <= param0 + -60) {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L1;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L1;
                }
              }
              L2: {
                if (stackIn_18_0 ^ stackIn_18_1 != 0) {
                  nr.field_c[0 + param3 % 6].b(var9, var10, param4, param7);
                  break L2;
                } else {
                  break L2;
                }
              }
              var8 = var8 >> 1;
              param3 = param3 >> 1;
              var11++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          param3 = param3 | param3 << -1078621656;
          var8 = param3 ^ param3 >> -786723327;
          var11 = 0;
          L3: while (true) {
            if (-5 >= (var11 ^ -1)) {
              return;
            } else {
              L4: {
                var9 = -44 + bm.field_y[var11][0] + (param6 - -(7 & var8));
                var10 = -64 + (param0 - -bm.field_y[var11][1] + (param3 & 3));
                stackOut_3_0 = param1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var10 <= param0 + -60) {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L4;
                } else {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L4;
                }
              }
              L5: {
                if (stackIn_6_0 ^ stackIn_6_1 != 0) {
                  nr.field_c[0 + param3 % 6].b(var9, var10, param4, param7);
                  break L5;
                } else {
                  break L5;
                }
              }
              var8 = var8 >> 1;
              param3 = param3 >> 1;
              var11++;
              continue L3;
            }
          }
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
        ((eq) this).field_d = param1;
        ((eq) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
