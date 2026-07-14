/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfb extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = 25;
          return new nc((Object) (Object) frb.a(107, 109));
        } else {
          return new nc((Object) (Object) frb.a(107, 109));
        }
    }

    final static void a(int param0) {
        faa var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if (param0 != 8) {
          field_o = 71;
          var1 = dpa.field_p;
          L0: while (true) {
            if (!apb.a(57)) {
              return;
            } else {
              var1.h(param0 + 24327, 8);
              var1.field_e = var1.field_e + 1;
              var2 = var1.field_e + 1;
              ida.a(var1, (byte) 127);
              dpa.field_p.e(var1.field_e + -var2, -129);
              continue L0;
            }
          }
        } else {
          var1 = dpa.field_p;
          L1: while (true) {
            if (!apb.a(57)) {
              return;
            } else {
              var1.h(param0 + 24327, 8);
              var1.field_e = var1.field_e + 1;
              var2 = var1.field_e + 1;
              ida.a(var1, (byte) 127);
              dpa.field_p.e(var1.field_e + -var2, -129);
              continue L1;
            }
          }
        }
    }

    qfb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
