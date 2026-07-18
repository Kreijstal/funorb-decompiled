/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oaa {
    static ee field_a;
    static vr field_b;

    final static void a(int param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (sd.field_b.length >= param2) {
                break L1;
              } else {
                param2 = sd.field_b.length;
                break L1;
              }
            }
            var4_int = param3;
            var5 = sd.field_b.length + -param2;
            var6 = 255;
            var7 = -114 % ((param1 - -76) / 35);
            L2: while (true) {
              if (var4_int <= param3 - param2) {
                break L0;
              } else {
                dg.h(param0, var4_int, sd.field_b[var5], var6);
                var4_int--;
                var5++;
                var6 -= 3;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "oaa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        if (param0 <= -66) {
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (var2.equals((Object) (Object) "")) {
            return -1;
          } else {
            return ((ji) (Object) me.field_t.a(true, (long)var2.hashCode())).field_h;
          }
        } else {
          int discarded$2 = oaa.a(84, -6);
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (var2.equals((Object) (Object) "")) {
            return -1;
          } else {
            return ((ji) (Object) me.field_t.a(true, (long)var2.hashCode())).field_h;
          }
        }
    }

    static {
    }
}
