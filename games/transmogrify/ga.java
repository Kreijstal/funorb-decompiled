/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static volatile int field_b;
    static rj field_a;

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (param1 == 3336) {
          var2 = 0;
          L0: while (true) {
            if (param0.length() > var2) {
              var3 = param0.charAt(var2);
              if (k.a((char) var3, -37)) {
                var2++;
                var2++;
                var2++;
                continue L0;
              } else {
                if (!dj.a((char) var3, true)) {
                  return true;
                } else {
                  var2++;
                  var2++;
                  continue L0;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          field_a = null;
          var2 = 0;
          if (param0.length() > var2) {
            var3 = param0.charAt(var2);
            if (!k.a((char) var3, -37)) {
              if (!dj.a((char) var3, true)) {
                return true;
              } else {
                var2++;
                var2++;
                var2++;
                var2++;
                return false;
              }
            } else {
              var2++;
              var2++;
              var2++;
              var2++;
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static kh a(int param0, java.applet.Applet param1) {
        String var2 = null;
        kh[] var3 = null;
        int var4 = 0;
        kh var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 > 58) {
          var2 = lj.a(true, "jagex-last-login-method", param1);
          if (var2 == null) {
            return qe.field_x;
          } else {
            var3 = hd.b((byte) 87);
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(var2, 0)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return qe.field_x;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = -87;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        Object var2 = null;
        if (si.field_l != 0 + -tf.field_a) {
          if (si.field_l != 250 - tf.field_a) {
            if (param0 != 94) {
              var2 = null;
              kh discarded$3 = ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          } else {
            if (param0 != 94) {
              var2 = null;
              kh discarded$4 = ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          }
        } else {
          if (param0 != 94) {
            var2 = null;
            kh discarded$5 = ga.a(49, (java.applet.Applet) null);
            si.field_l = si.field_l + 1;
            return;
          } else {
            si.field_l = si.field_l + 1;
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -35) {
            field_a = null;
            if (!(param0 != 16711935)) {
                return 0;
            }
            return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
        }
        if (!(param0 != 16711935)) {
            return 0;
        }
        return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
