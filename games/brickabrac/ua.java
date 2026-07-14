/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String[] field_b;
    static wg field_d;
    static String field_e;
    static vl field_c;
    static String field_a;

    final static void a(j param0, int param1, int param2, int param3, int param4, int param5, ak param6) {
        if (param3 >= -53) {
          field_e = null;
          km.a(param6, param0, 3 + (param4 + (param5 - 75) / 2), (param2 - 75) / 2 + param1, true, 4, 3);
          return;
        } else {
          km.a(param6, param0, 3 + (param4 + (param5 - 75) / 2), (param2 - 75) / 2 + param1, true, 4, 3);
          return;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        field_d = null;
        if (param0 != 2) {
          var2 = null;
          ua.a((jp) null, 90, -100, 66, (jp) null, 58, (jp) null, 15, 124, -102, (jp) null, 52);
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(jp param0, int param1, int param2, int param3, jp param4, int param5, jp param6, int param7, int param8, int param9, jp param10, int param11) {
        param6.d((param7 * 5 >> 1755723248) + ((-param6.field_x + param2) / 2 + param1), param3);
        param10.c(param1 + ((-param10.field_x + param2) / 2 - -(param7 * 5 >> -600353904) + 10), param11 + (-(23 / param9) + (-param10.field_z + param3) - -480));
        param4.c((param2 - param4.field_x) / 2 + param1 - -(param7 * 10 >> -130902320), param11 + -(43 / param9) + -param4.field_z + (480 + param3));
        param0.c(param1 + ((param2 - param0.field_x) / 2 - -(param7 * 20 >> 1371704688)), param11 + 47 / param9 + (-param0.field_z + param3 - -480));
        int var12 = 115 / ((5 - param5) / 61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = "Play rated game";
    }
}
