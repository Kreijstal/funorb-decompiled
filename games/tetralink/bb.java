/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String[] field_d;
    static String field_f;
    static String field_b;
    static String[] field_a;
    static oh field_c;
    static int field_e;
    static String field_g;

    final static int a(int param0) {
        if (param0 != 32032) {
          return 79;
        }
        return 1;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        bo.field_y = 50.0f;
        jl.field_e = 262144;
        s.field_c = 52.5f;
        hi.field_d[2] = 0.0;
        sk.field_c = 0;
        hi.field_d[0] = 1.0;
        var2 = param1 ? 1 : 0;
        var3 = pf.field_d;
        if (ed.field_O == 0) {
          var3 = ed.field_O;
          ac.a(param0, param0 - 120, var2 != 0, var3);
          if (tc.field_v == 0) {
            return;
          }
          if (10 > tc.field_v) {
            stackIn_7_0 = (tc.field_v < 15) ? 2 : 4;
            qe.field_g = stackIn_7_0;
            oi.field_c = stackIn_7_0;
          } else {
            if (20 > tc.field_v) {
              return;
            }
            stackIn_12_0 = (tc.field_v < 15) ? 2 : 4;
            qe.field_g = stackIn_12_0;
            oi.field_c = stackIn_12_0;
          }
        } else {
          if (kb.field_t == 2) {
            var3 = ed.field_O;
            ac.a(param0, param0 - 120, var2 != 0, var3);
            if (tc.field_v == 0) {
              return;
            }
            if (10 > tc.field_v) {
              stackIn_23_0 = (tc.field_v < 15) ? 2 : 4;
              qe.field_g = stackIn_23_0;
              oi.field_c = stackIn_23_0;
            } else {
              if (20 > tc.field_v) {
                return;
              }
              stackIn_29_0 = (tc.field_v < 15) ? 2 : 4;
              qe.field_g = stackIn_29_0;
              oi.field_c = stackIn_29_0;
            }
          } else {
            if (kb.field_t == 3 ||
              ed.field_O == 4 ||
              5 == ed.field_O) {
              var3 = ed.field_O;
            }
            ac.a(param0, param0 - 120, var2 != 0, var3);
            if (tc.field_v == 0) {
              return;
            }
            if (10 > tc.field_v) {
              stackIn_42_0 = (tc.field_v < 15) ? 2 : 4;
              qe.field_g = stackIn_42_0;
              oi.field_c = stackIn_42_0;
            } else {
              if (20 > tc.field_v) {
                return;
              }
              stackIn_48_0 = (tc.field_v < 15) ? 2 : 4;
              qe.field_g = stackIn_48_0;
              oi.field_c = stackIn_48_0;
            }
          }
        }
        wb.a(true, -7869);
    }

    public static void b(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        field_c = null;
        field_d = null;
        field_f = null;
        if (param0 != -578) {
          bb.a(1);
        }
    }

    final static void a(byte param0) {
        if (param0 != -63) {
          field_g = (String) null;
          t.a(17, 0);
          return;
        }
        t.a(17, 0);
    }

    static {
        field_f = "All games";
        field_b = "to return to the normal view.";
        field_a = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = 0;
        field_g = "Ask to join <%0>'s game";
    }
}
