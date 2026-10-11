/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    int field_f;
    static int field_e;
    static String field_d;
    int field_g;
    int field_a;
    int field_h;
    int field_k;
    byte[] field_i;
    static bh[] field_b;
    int field_l;
    byte[] field_c;
    int field_j;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -113 % ((param0 + 9) / 60);
        field_d = null;
    }

    final static String a(int param0, char param1, byte param2) {
        char[] var6 = null;
        int var4 = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param2 == 20) {
          var6 = new char[param0];
          char[] var3 = var6;
          for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = param1;
          }
          return new String(var6);
        }
        return (String) null;
    }

    final static void a(int param0, na param1, int param2, int param3, int param4, na param5) {
        try {
          of.field_f = param0;
          mk.field_a = param5;
          int var6_int = 43 % ((49 - param3) / 32);
          mb.field_c = param4;
          na.field_e = param2;
          nh.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "uh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          var3_int = 1;
          while (param0 > 1) {
            if ((1 & param0) != 0) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param0 = param0 >> 1;
          }
          if (param0 == 1) {
            stackIn_8_0 = var3_int * param2;
            return stackIn_8_0;
          }
          if (param1 < 15) {
            uh.a(4, (byte) 36, 66);
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var3), "uh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "to return to the normal view.";
        field_b = new bh[13];
    }
}
