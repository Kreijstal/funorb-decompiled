/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static ec field_c;
    static cn field_b;
    static ab field_d;
    static String field_h;
    static String field_g;
    static se field_e;
    static jk field_a;
    static md field_f;

    final static String a(se param0, int param1, int param2, String param3, int param4) {
        if (param4 <= 103) {
            return null;
        }
        return ia.a(param2, param0, pj.a((byte) 66, param1, param3), 0);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_f = null;
        if (param0 > -82) {
          return;
        } else {
          field_b = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0, int param1, kj param2) {
        wj var3 = null;
        Object var4 = null;
        if (param0 != 11) {
          var4 = null;
          String discarded$1 = ta.a((se) null, -96, -112, (String) null, -121);
          var3 = ac.field_B;
          var3.d((byte) -81, param1);
          var3.a(6, 2);
          var3.a(6, 0);
          var3.a(param0 ^ 13, param2.field_j);
          return;
        } else {
          var3 = ac.field_B;
          var3.d((byte) -81, param1);
          var3.a(6, 2);
          var3.a(6, 0);
          var3.a(param0 ^ 13, param2.field_j);
          return;
        }
    }

    final static void b(int param0) {
        wj var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        var1 = ac.field_B;
        if (param0 != 12841) {
          field_c = null;
          L0: while (true) {
            if (mo.b(-101)) {
              var1.d((byte) -102, 8);
              var1.field_o = var1.field_o + 1;
              var2 = var1.field_o + 1;
              ed.a(false, var1);
              ac.field_B.c(var1.field_o - var2, -1);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (mo.b(-101)) {
              var1.d((byte) -102, 8);
              var1.field_o = var1.field_o + 1;
              var2 = var1.field_o + 1;
              ed.a(false, var1);
              ac.field_B.c(var1.field_o - var2, -1);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ec(256);
        field_h = "After a string of unfortunate accidents led to his exile from the mountain home of the dwarves, the dwarven renegade seeks somewhere else to indulge his passion for explosives.";
        field_g = "Select an orc or goblin to sacrifice";
        field_d = new ab();
        field_f = new md();
    }
}
