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
        String var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        pb var7_ref = null;
        pb var8 = null;
        var4 = stellarshard.field_B;
        ti.b(243, 197, 369, 143, 16777215);
        ti.f(244, 198, 367, 141, 0);
        if (ed.field_a != null) {
          L0: {
            var6 = ed.field_a[nk.field_c];
            var7 = var6;
            var7 = var6;
            if (var6 == null) {
              if (fj.field_f != null) {
                int discarded$3 = fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            } else {
              var6.e(245, 199);
              break L0;
            }
          }
          if (param0 >= 18) {
            L1: {
              if (cj.field_c <= ha.field_w) {
                break L1;
              } else {
                var7_ref = ed.field_a[tc.field_w];
                if (var7_ref == null) {
                  break L1;
                } else {
                  var2_int = (var7_ref.field_w - -60) * ha.field_w / cj.field_c;
                  var3 = -30 + var2_int;
                  if (!nj.field_g) {
                    ua.a((-var3 + var7_ref.field_w) * 256 / 30, -256 * var3 / 30, var7_ref, 0, 245, 199);
                    break L1;
                  } else {
                    ua.a(var3 * -256 / 30, 256 * (-var3 + var7_ref.field_w) / 30, var7_ref, 0, 245, 199);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (fj.field_f != null) {
                var2 = null;
                var5 = 0;
                var3 = var5;
                L3: while (true) {
                  if (var5 >= ed.field_a.length) {
                    if (var2 == null) {
                      break L2;
                    } else {
                      int discarded$4 = fj.field_f.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                      break L2;
                    }
                  } else {
                    var8 = ed.field_a[var5];
                    if (var8 != null) {
                      L4: {
                        if (-366 != (var8.field_w ^ -1)) {
                          break L4;
                        } else {
                          if ((var8.field_x ^ -1) != -140) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      if (var2 == null) {
                        var2 = Integer.toString(var5);
                        var5++;
                        continue L3;
                      } else {
                        var2 = var2 + ", " + var5;
                        var5++;
                        continue L3;
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L5: {
            if (fj.field_f != null) {
              int discarded$5 = fj.field_f.a(fl.field_c, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
