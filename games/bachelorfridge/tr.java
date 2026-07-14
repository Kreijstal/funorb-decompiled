/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr {
    final static void a(int param0) {
        wi.a(true, sc.field_n, wj.field_i, (byte) -68);
        int var1 = -114 % ((-65 - param0) / 32);
        sna.field_s = true;
    }

    final static void a(int param0, kv param1, int param2, int param3, kv param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        var8 = 0;
        L0: while (true) {
          if (param1.field_v.length <= var8) {
            if (param6 != -26512) {
              tr.a(-31);
              return;
            } else {
              return;
            }
          } else {
            var9 = var8 % param1.field_q;
            var10 = var8 / param1.field_q;
            if (16777215 != (-16777216 & param1.field_v[var8] ^ -1)) {
              var8++;
              var8++;
              var8++;
              continue L0;
            } else {
              rba.a(param2, param0 - -var10, var9 + param7, -1, param4.field_v[param3 + (var9 + (var10 + param5) * param4.field_q)]);
              var8++;
              var8++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
