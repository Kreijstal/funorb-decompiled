/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oaa {
    static ee field_a;
    static vr field_b;

    final static void a(int param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BachelorFridge.field_y;
        try {
          if (sd.field_b.length < param2) {
            param2 = sd.field_b.length;
          }
          var4_int = param3;
          var5 = sd.field_b.length - param2;
          var6 = 255;
          var7 = -114 % ((param1 + 76) / 35);
          while (var4_int > param3 - param2) {
            dg.h(param0, var4_int, sd.field_b[var5], var6);
            var4_int--;
            var5++;
            var6 -= 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "oaa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -3681) {
          field_b = (vr) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 > -66) {
          oaa.a(84, -6);
          var2 = lka.field_E[param1][17];
          var2 = var2.trim();
          var2 = var2.toLowerCase();
          if (!var2.equals("")) {
            return ((ji) (me.field_t.a(true, (long)var2.hashCode()))).field_h;
          }
          return -1;
        }
        var2Lifetime1 = lka.field_E[param1][17];
        var2Lifetime1 = var2Lifetime1.trim();
        var2Lifetime1 = var2Lifetime1.toLowerCase();
        if (!var2Lifetime1.equals("")) {
          return ((ji) (me.field_t.a(true, (long)var2Lifetime1.hashCode()))).field_h;
        }
        return -1;
    }

    static {
    }
}
