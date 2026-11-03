/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_a;
    static Sprite field_b;

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = PairedTextColumns.a(wo.field_h, (byte) 119, Js5NetworkRequest.field_I);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (param0 == var2_int) {
            param1 = "<img=1>" + param1;
          }
          stackIn_7_0 = (String) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("th.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -94) {
          field_b = (Sprite) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        param0 = param0 & param1;
        if (param0 >= 4096) {
          return param0 >= 6144 ? NanoTickClock.field_i[param0 - 6144] : -NanoTickClock.field_i[-param0 + 6144];
        }
        return param0 < 2048 ? NanoTickClock.field_i[2048 - param0] : -NanoTickClock.field_i[-2048 + param0];
    }

    final static void a(int param0) {
        if (param0 == 8191) {
          ByteStorage.a(Match.field_s, true, 32, nk.field_b);
          ke.field_d = true;
          return;
        }
        th.a(17);
        ByteStorage.a(Match.field_s, true, 32, nk.field_b);
        ke.field_d = true;
    }

    static {
        field_a = "Mouse over an icon for details";
    }
}
