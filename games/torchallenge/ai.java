/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static int field_a;
    static ca field_b;
    static int field_c;
    static int field_d;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            if (param1 < 6144) {
              stackIn_19_0 = -k.field_d[-4096 + param1];
            } else {
              stackIn_19_0 = -k.field_d[-param1 + 8192];
            }
            return stackIn_19_0;
          }
          if (2048 > param1) {
            stackIn_15_0 = k.field_d[param1];
          } else {
            stackIn_15_0 = k.field_d[4096 - param1];
          }
          return stackIn_15_0;
        }
        ai.a(38);
        param1 = param1 & 8191;
        if (4096 <= param1) {
          if (param1 < 6144) {
            stackIn_9_0 = -k.field_d[-4096 + param1];
          } else {
            stackIn_9_0 = -k.field_d[-param1 + 8192];
          }
          return stackIn_9_0;
        }
        if (2048 > param1) {
          stackIn_5_0 = k.field_d[param1];
        } else {
          stackIn_5_0 = k.field_d[4096 - param1];
        }
        return stackIn_5_0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null != ef.field_h) {
            for (var1_int = 0; ef.field_h.length > var1_int; var1_int++) {
              if (ef.field_h[var1_int] != null) {
                for (var2 = 0; ef.field_h[var1_int].length > var2; var2++) {
                  if (ef.field_h[var1_int][var2] != null) {
                    ef.field_h[var1_int][var2].field_y = null;
                  }
                  ef.field_h[var1_int][var2] = null;
                }
                ef.field_h[var1_int] = null;
              }
            }
          }
          if (param0 != 0) {
            ai.a(68);
          }
          ef.field_h = (ka[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ai.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 2048) {
          return;
        }
        field_c = 60;
    }

    static {
        field_c = 0;
    }
}
