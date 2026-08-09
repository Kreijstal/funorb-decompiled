/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wga implements dja {
    static lwa field_a;

    final static void a(boolean param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_a = (lwa) null;
                break L1;
              }
            }
            L2: while (true) {
              param3--;
              if (-1 < (param3 ^ -1)) {
                break L0;
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param1;
                var7 = param2;
                var9[var6] = dla.a(8355711, var9[var6] >> -233471167) + var7;
                param1++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("wga.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_a = (lwa) null;
            return (tv[]) ((Object) new wna[param1]);
        }
        return (tv[]) ((Object) new wna[param1]);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == -1) {
            return;
        }
        field_a = (lwa) null;
    }

    public final tv a(byte param0) {
        int var2 = 127 % ((-64 - param0) / 50);
        return (tv) ((Object) new wna());
    }

    static {
    }
}
