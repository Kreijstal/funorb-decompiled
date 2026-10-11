/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn implements uj {
    static boolean[] field_b;
    static we field_d;
    static int field_c;
    static String field_a;

    public final String a(byte param0) {
        int var2 = -71 / ((-33 - param0) / 62);
        return "Done Editing";
    }

    public final void a(boolean param0) {
        tb.field_a = 0;
        if (param0) {
          bn.a(126, 'ﾂ');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != 160) {
          bn.a(-15, '￬');
        }
    }

    final static boolean a(int param0, char param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if ((param1 <= 0 ||
            128 <= param1) &&
            (param1 < 160 ||
            param1 > 255)) {
            var2_int = -111 / ((param0 - 28) / 63);
            if (param1 == 0) {
              return false;
            }
            var3 = tk.field_e;
            var4 = 0;
            while (true) {
              if (var4 >= var3.length) {
                return false;
              }
              var5 = var3[var4];
              if (var5 != param1) {
                var4++;
                continue;
              }
              break;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "bn.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new boolean[21];
        field_a = "Ranking: Mega Miner";
    }
}
