/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi implements td {
    static String field_a;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        hj var9 = null;
        hj var10 = null;
        var6 = param1 + param2.field_s;
        var7 = param0 + param2.field_n;
        if (param3 == -4394) {
          tl.a(param2.field_r, var7, var6, param2.field_m, 127);
          var10 = wd.field_C[1];
          if (param2 instanceof s) {
            if (!((s) (Object) param2).field_D) {
              L0: {
                if (param2.d(-81)) {
                  wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.e((-var10.field_s + param2.field_m >> 149414625) + 1 + var6, (-var10.field_t + param2.field_r >> -249748127) + var7 + 1, 256);
                if (param2.d(-81)) {
                  wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param2.d(-81)) {
                wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          fi.a(-11);
          tl.a(param2.field_r, var7, var6, param2.field_m, 127);
          var9 = wd.field_C[1];
          if (param2 instanceof s) {
            if (!((s) (Object) param2).field_D) {
              L3: {
                if (param2.d(-81)) {
                  wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var9.e((-var9.field_s + param2.field_m >> 149414625) + 1 + var6, (-var9.field_t + param2.field_r >> -249748127) + var7 + 1, 256);
                if (param2.d(-81)) {
                  wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param2.d(-81)) {
                wh.a(-4 + param2.field_m, false, var6 + 2, param2.field_r - 4, var7 + 2);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        var3 = rg.a(param2, param1, 0);
        if (var3 == null) {
          var4 = 0;
          L0: while (true) {
            if (param1.length() <= var4) {
              if (param0 == 1) {
                return null;
              } else {
                field_a = null;
                return null;
              }
            } else {
              if (!vg.a(param1.charAt(var4), -22118)) {
                return pl.field_i;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return var3;
        }
    }

    public static void a(int param0) {
        if (param0 != -8601) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
