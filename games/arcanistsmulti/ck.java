/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_f;
    static String field_c;
    static kc field_d;
    static String field_e;
    static kc field_a;
    static eg field_b;
    static String field_g;

    final static kc a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, dj param7, int param8, int param9, int param10, int param11, int param12) {
        kc var13 = null;
        Object var14 = null;
        var13 = new kc(0L, (kc) null);
        var13.field_v = fk.a(param0, 43, param4);
        if (param8 < 56) {
          var14 = null;
          kc discarded$1 = ck.a(-51, 34, -67, 14, 71, -24, 60, (dj) null, 32, -82, -98, 65, 2);
          var13.field_Ab = fk.a(param11, 58, param3);
          var13.field_xb = fk.a(param12, 38, param10);
          var13.field_hb = fk.a(param5, 110, param1);
          var13.field_K = fk.a(param6, 58, param2);
          var13.field_Z = param7;
          var13.field_ob = param9;
          return var13;
        } else {
          var13.field_Ab = fk.a(param11, 58, param3);
          var13.field_xb = fk.a(param12, 38, param10);
          var13.field_hb = fk.a(param5, 110, param1);
          var13.field_K = fk.a(param6, 58, param2);
          var13.field_Z = param7;
          var13.field_ob = param9;
          return var13;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 <= 84) {
          ck.a((byte) -85);
          field_a = null;
          field_d = null;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        if (ul.field_A < 224) {
          var1 = ul.field_A % 32;
          eb.a(32 + ul.field_A + -var1, false);
          var1 = 50 % ((47 - param0) / 38);
          return;
        } else {
          eb.a(256, false);
          var1 = 50 % ((47 - param0) / 38);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Game full";
        field_c = "Sky Castles";
        field_g = "You have fallen into the water! Choose a location to teleport to. If you fail to do this within the time limit, you will lose half of your health! (<%0>)";
        field_e = "<br>You will also earn less wands within games, with an average rating under <%0>!";
    }
}
