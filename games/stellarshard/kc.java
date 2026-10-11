/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static String[] field_a;
    static int field_b;
    static String field_c;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        pb var8 = null;
        pb var7Lifetime1;
        pb var7Lifetime2;
        int var3Lifetime1;
        var4 = stellarshard.field_B;
        try {
          ti.b(243, 197, 369, 143, 16777215);
          ti.f(244, 198, 367, 141, 0);
          if (ed.field_a == null) {
            if (fj.field_f != null) {
              fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = ed.field_a[nk.field_c];
          var7 = var6;
          var7Lifetime1 = var6;
          if (var6 == null) {
            if (fj.field_f != null) {
              fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.e(245, 199);
          }
          if (param0 < 18) {
            return;
          }
          if (cj.field_c > ha.field_w) {
            var7Lifetime2 = ed.field_a[tc.field_w];
            if (var7Lifetime2 != null) {
              var2_int = (var7Lifetime2.field_w + 60) * ha.field_w / cj.field_c;
              var3 = -30 + var2_int;
              if (!nj.field_g) {
                ua.a((-var3 + var7Lifetime2.field_w) * 256 / 30, -256 * var3 / 30, var7Lifetime2, 0, 245, 199);
              } else {
                ua.a(var3 * -256 / 30, 256 * (-var3 + var7Lifetime2.field_w) / 30, var7Lifetime2, 0, 245, 199);
              }
            }
          }
          if (fj.field_f != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < ed.field_a.length) {
              var8 = ed.field_a[var5];
              if (var8 != null && (var8.field_w != 365 ||
                var8.field_x != 139)) {
                if (var2 == null) {
                  var2 = Integer.toString(var5);
                } else {
                  var2 = (String) (var2) + ", " + var5;
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            fj.field_f.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "kc.A(" + param0 + ')');
        }
    }

    static {
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
