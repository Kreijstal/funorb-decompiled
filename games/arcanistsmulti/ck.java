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
        kc discarded$1 = null;
        kc var13 = null;
        RuntimeException var13_ref = null;
        dj var14 = null;
        kc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var13 = new kc(0L, (kc) null);
              var13.field_v = fk.a(param0, 43, param4);
              if (param8 >= 56) {
                break L1;
              } else {
                var14 = (dj) null;
                discarded$1 = ck.a(-51, 34, -67, 14, 71, -24, 60, (dj) null, 32, -82, -98, 65, 2);
                break L1;
              }
            }
            var13.field_Ab = fk.a(param11, 58, param3);
            var13.field_xb = fk.a(param12, 38, param10);
            var13.field_hb = fk.a(param5, 110, param1);
            var13.field_K = fk.a(param6, 58, param2);
            var13.field_Z = param7;
            var13.field_ob = param9;
            stackOut_2_0 = (kc) (var13);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var13_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var13_ref);
            stackOut_4_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param7 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
        return stackIn_3_0;
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
        field_f = "Game full";
        field_c = "Sky Castles";
        field_g = "You have fallen into the water! Choose a location to teleport to. If you fail to do this within the time limit, you will lose half of your health! (<%0>)";
        field_e = "<br>You will also earn less wands within games, with an average rating under <%0>!";
    }
}
