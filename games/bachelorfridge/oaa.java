/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oaa {
    static ee field_a;
    static vr field_b;

    final static void a(int param0, byte param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        if (sd.field_b.length < param2) {
            param2 = sd.field_b.length;
        }
        int var4 = param3;
        int var5 = sd.field_b.length + -param2;
        int var6 = 255;
        int var7 = -114 % ((param1 - -76) / 35);
        while (var4 > param3 - param2) {
            dg.h(param0, var4, sd.field_b[var5], var6);
            var4--;
            var5++;
            var6 -= 3;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -3681) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        String var2_ref = null;
        if (param0 <= -66) {
          var2 = lka.field_E[param1][17];
          var2_ref = var2.trim();
          var2_ref = var2_ref.toLowerCase();
          if (var2_ref.equals((Object) (Object) "")) {
            return -1;
          } else {
            return ((ji) (Object) me.field_t.a(true, (long)var2_ref.hashCode())).field_h;
          }
        } else {
          int discarded$2 = oaa.a(84, -6);
          var2 = lka.field_E[param1][17];
          var2_ref = var2.trim();
          var2_ref = var2_ref.toLowerCase();
          if (var2_ref.equals((Object) (Object) "")) {
            return -1;
          } else {
            return ((ji) (Object) me.field_t.a(true, (long)var2_ref.hashCode())).field_h;
          }
        }
    }

    static {
    }
}
