/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static ij[] field_a;
    static int field_b;
    static int field_f;
    static String field_e;
    static String field_d;
    static String[] field_c;

    final static void a(int param0, int param1, int param2, int[] param3, byte param4, int param5) {
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        gf.a();
        if (param4 < 0) {
          gf.a(param3, 0, param3.length);
          gf.c();
          L0: while (true) {
            if (!gf.d()) {
              return;
            } else {
              tc.c(gf.field_g - -param2, gf.field_a - -param5, gf.field_b - gf.field_g, param0, param1);
              continue L0;
            }
          }
        } else {
          field_f = -105;
          gf.a(param3, 0, param3.length);
          gf.c();
          L1: while (true) {
            if (!gf.d()) {
              return;
            } else {
              tc.c(gf.field_g - -param2, gf.field_a - -param5, gf.field_b - gf.field_g, param0, param1);
              continue L1;
            }
          }
        }
    }

    final static void a(byte param0) {
        we var1 = null;
        we var1_ref = null;
        L0: {
          var1 = (we) (Object) fl.field_i.a((byte) 74);
          if (var1 == null) {
            var1_ref = new we();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > -100) {
          field_f = 101;
          var1_ref.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
          ug.field_g.a((byte) -84, (hl) (Object) var1_ref);
          return;
        } else {
          var1_ref.a(tc.field_i, tc.field_d, tc.field_b, tc.field_e, -1, tc.field_c, tc.field_a, tc.field_j);
          ug.field_g.a((byte) -84, (hl) (Object) var1_ref);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -29208) {
          field_e = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Type your email address again to make sure it's correct";
        field_d = "Save Progress?";
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
