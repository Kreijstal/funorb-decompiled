/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static String field_c;
    static int field_a;
    static String field_b;

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = fleas.field_A ? 1 : 0;
        var2 = 0;
        var3 = vg.field_z;
        if (var3 < 5) {
          var2 = var3 * (var3 * 8192) / 1100;
        } else {
          if (var3 < 105) {
            var2 = (var3 * 16384 - 40960) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
              var4 = 1;
              if (param1) {
                return;
              }
              var5 = 0;
              if (3 == param0) {
                var4 = -1;
              }
              if (param0 == 1) {
                var5 = 1;
              }
              if (param0 == 4) {
                var5 = 1;
                var4 = 1;
              }
              if (5 == param0) {
                var4 = -1;
                var5 = 1;
              }
              if (param0 == 6) {
                var5 = -1;
                var4 = 1;
              }
              if (param0 == 7) {
                var5 = -1;
                var4 = -1;
              } else {
                if (param0 == 8) {
                  var5 = -1;
                  var4 = -1;
                }
              }
              if (param0 == 11) {
                var4 = -1;
              }
              if (param0 == 12) {
                var4 = -1;
                var5 = -1;
              }
              if (13 == param0) {
                var5 = -1;
                var4 = 1;
              }
              if (param0 == 14) {
                var4 = -1;
                var5 = 1;
              }
              if (param0 == 15) {
                var5 = 1;
                var4 = 1;
              }
              nl.field_a = g.a((byte) -74, var2 * var5, var4 * var2);
              return;
            }
          }
        }
        var4Lifetime1 = 1;
        if (param1) {
          return;
        }
        var5Lifetime1 = 0;
        if (3 == param0) {
          var4Lifetime1 = -1;
        }
        if (param0 == 1) {
          var5Lifetime1 = 1;
        }
        if (param0 == 4) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        if (5 == param0) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 6) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param0 == 7) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        } else {
          if (param0 == 8) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime1 = -1;
        }
        if (param0 == 12) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (13 == param0) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param0 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param0 == 15) {
          var5Lifetime1 = 1;
          var4Lifetime1 = 1;
        }
        nl.field_a = g.a((byte) -74, var2 * var5Lifetime1, var4Lifetime1 * var2);
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5 = 0;
        int var4 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (param2) {
          var4 += 4;
          if (!param1) {
            var5 = 53 % ((param0 - 77) / 33);
            if (!param3) {
              return ol.field_a[var4];
            }
            var4++;
            return ol.field_a[var4];
          }
          var4 += 2;
          var5Lifetime3 = 53 % ((param0 - 77) / 33);
          if (param3) {
            var4++;
            return ol.field_a[var4];
          }
          return ol.field_a[var4];
        }
        if (param1) {
          var4 += 2;
          var5Lifetime1 = 53 % ((param0 - 77) / 33);
          if (!param3) {
            return ol.field_a[var4];
          }
          var4++;
          return ol.field_a[var4];
        }
        var5Lifetime2 = 53 % ((param0 - 77) / 33);
        if (!param3) {
          return ol.field_a[var4];
        }
        var4++;
        return ol.field_a[var4];
    }

    final static char a(byte param0, int param1) {
        int var4 = 0;
        int var3 = 76 / ((63 - param1) / 45);
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var4 = fh.field_e[var2 - 128];
          if (var4 == 0) {
            var4 = 63;
          }
          var2 = var4;
          return (char)var2;
        }
        return (char)var2;
    }

    final static String b(byte param0) {
        if (cb.field_v == wi.field_f) {
          return ag.field_e;
        }
        if (ui.field_kb == wi.field_f) {
          return li.field_d;
        }
        if (!uc.field_c.a(param0 ^ 87)) {
          return li.field_d;
        }
        if (param0 == -55) {
          return aa.field_s;
        }
        return (String) null;
    }

    public static void a(byte param0) {
        if (param0 <= 2) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void c(byte param0) {
        cg.a((byte) -105, 17);
        if (param0 >= -77) {
          vi.b((byte) -17);
        }
    }

    static {
        field_a = -1;
        field_c = "Unpacking levels";
        field_b = null;
    }
}
