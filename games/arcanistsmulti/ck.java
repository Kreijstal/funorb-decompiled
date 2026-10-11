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
        RuntimeException var13_ref = null;
        dj var14 = null;
        kc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new kc(0L, (kc) null);
          var13.field_v = fk.a(param0, 43, param4);
          if (param8 < 56) {
            var14 = (dj) null;
            ck.a(-51, 34, -67, 14, 71, -24, 60, (dj) null, 32, -82, -98, 65, 2);
          }
          var13.field_Ab = fk.a(param11, 58, param3);
          var13.field_xb = fk.a(param12, 38, param10);
          var13.field_hb = fk.a(param5, 110, param1);
          var13.field_K = fk.a(param6, 58, param2);
          var13.field_Z = param7;
          var13.field_ob = param9;
          stackIn_3_0 = var13;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_6_0 = var13_ref;
          stackIn_6_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 > 84) {
          field_a = null;
          field_d = null;
          field_g = null;
          field_c = null;
          field_f = null;
          return;
        }
        ck.a((byte) -85);
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        if (ul.field_A >= 224) {
          eb.a(256, false);
          var1 = 50 % ((47 - param0) / 38);
          return;
        }
        var1Lifetime1 = ul.field_A % 32;
        eb.a(32 + ul.field_A - var1Lifetime1, false);
        var1Lifetime2 = 50 % ((47 - param0) / 38);
    }

    static {
        field_f = "Game full";
        field_c = "Sky Castles";
        field_g = "You have fallen into the water! Choose a location to teleport to. If you fail to do this within the time limit, you will lose half of your health! (<%0>)";
        field_e = "<br>You will also earn less wands within games, with an average rating under <%0>!";
    }
}
