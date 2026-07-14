/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new rgb[param1];
    }

    final static void a(int param0, boolean param1) {
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = dpa.field_p;
        var2.h(24335, param0);
        if (!param1) {
          bh.a(-30, true);
          var2.field_e = var2.field_e + 1;
          var3 = var2.field_e;
          var2.c(0, 5);
          var2.c(0, lqa.field_o.field_Fb);
          var4 = lqa.field_o.field_Cb - -(lqa.field_o.field_Bb << -1295663930);
          var2.c(0, var4);
          var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
          var2.e(-var3 + var2.field_e, -129);
          return;
        } else {
          var2.field_e = var2.field_e + 1;
          var3 = var2.field_e;
          var2.c(0, 5);
          var2.c(0, lqa.field_o.field_Fb);
          var4 = lqa.field_o.field_Cb - -(lqa.field_o.field_Bb << -1295663930);
          var2.c(0, var4);
          var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
          var2.e(-var3 + var2.field_e, -129);
          return;
        }
    }

    final static apb[] a(faa param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        apb[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        apb var6_ref = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        var2 = param0.i(0, 8);
        if (var2 <= 0) {
          if (param1 > -31) {
            return null;
          } else {
            var3 = param0.i(0, 12);
            var4 = new apb[var3];
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (!kv.a(false, param0)) {
                  var6 = param0.i(0, iia.a(-97, var5 + -1));
                  var4[var5] = var4[var6];
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new apb();
                  int discarded$6 = param0.i(0, 24);
                  int discarded$7 = param0.i(0, 24);
                  var6_ref.field_c = param0.i(0, 24);
                  int discarded$8 = param0.i(0, 9);
                  int discarded$9 = param0.i(0, 12);
                  int discarded$10 = param0.i(0, 12);
                  int discarded$11 = param0.i(0, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public final tv a(byte param0) {
        int var2 = 15 / ((param0 - -64) / 50);
        return (tv) (Object) new rgb();
    }

    static {
    }
}
