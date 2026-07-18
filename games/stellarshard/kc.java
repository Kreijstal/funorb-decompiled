/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static String[] field_a;
    static int field_b;
    static String field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
    }

    final static void a() {
        RuntimeException var1 = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        pb var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            ti.b(243, 197, 369, 143, 16777215);
            ti.f(244, 198, 367, 141, 0);
            if (ed.field_a != null) {
              L1: {
                var6 = ed.field_a[nk.field_c];
                var7 = var6;
                var7 = var6;
                if (var6 == null) {
                  if (fj.field_f != null) {
                    int discarded$3 = fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var6.e(245, 199);
                  break L1;
                }
              }
              L2: {
                if (cj.field_c <= ha.field_w) {
                  break L2;
                } else {
                  var7 = ed.field_a[tc.field_w];
                  if (var7 == null) {
                    break L2;
                  } else {
                    var2_int = (var7.field_w - -60) * ha.field_w / cj.field_c;
                    var3 = -30 + var2_int;
                    if (!nj.field_g) {
                      ua.a((-var3 + var7.field_w) * 256 / 30, -256 * var3 / 30, var7, 0, 245, 199);
                      break L2;
                    } else {
                      ua.a(var3 * -256 / 30, 256 * (-var3 + var7.field_w) / 30, var7, 0, 245, 199);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (fj.field_f != null) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L4: while (true) {
                    if (var5 >= ed.field_a.length) {
                      if (var2 == null) {
                        break L3;
                      } else {
                        int discarded$4 = fj.field_f.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L3;
                      }
                    } else {
                      L5: {
                        var8 = ed.field_a[var5];
                        if (var8 == null) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              L6: {
                if (fj.field_f != null) {
                  int discarded$5 = fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "kc.A(" + 36 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
