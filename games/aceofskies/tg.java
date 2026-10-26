/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static MusicTrack[] field_a;

    final static vs a(ResourceArchive param0, int param1, String param2, String param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        vs stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.a(param2, (byte) -71, param3);
          var4 = var5;
          if (param1 != 8191) {
            tg.a(-91, 82);
          }
          if (var5 == null) {
            return null;
          }
          stackIn_6_0 = new vs(var5);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("tg.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if (~param0 > param1) {
          return 2048 <= param0 ? lp.field_c[-param0 + 4096] : lp.field_c[param0];
        }
        return param0 >= 6144 ? -lp.field_c[-param0 + 8192] : -lp.field_c[-4096 + param0];
    }

    final static boolean a(int param0) {
        if (param0 >= -87) {
          tg.a(120, -95);
          if (ft.field_l == null) {
            return false;
          }
          if (ca.field_f == wq.field_e) {
            return true;
          }
          return false;
        }
        if (ft.field_l == null) {
          return false;
        }
        if (ca.field_f == wq.field_e) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
          field_a = (MusicTrack[]) null;
        }
    }

    static {
    }
}
