/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    public static void a(int param0) {
        if (param0 != -15180) {
          ac.a((byte) 86);
        }
        field_a = null;
    }

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o var7 = null;
        o var8 = null;
        o var7Lifetime1;
        o var7Lifetime2;
        int var3Lifetime1;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          mi.g(243, 197, 369, 143, 16777215);
          mi.b(244, 198, 367, 141, 0);
          if (null == jb.field_d) {
            if (sk.field_n != null) {
              sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = jb.field_d[we.field_h];
          var7 = var6;
          var7Lifetime1 = var6;
          if (var6 == null) {
            if (null != sk.field_n) {
              sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.d(245, 199);
          }
          if (ti.field_e < uc.field_e) {
            var7Lifetime2 = jb.field_d[vb.field_g];
            if (var7Lifetime2 != null) {
              var2_int = (var7Lifetime2.field_q + 60) * ti.field_e / uc.field_e;
              var3 = -30 + var2_int;
              if (!fh.field_g) {
                fl.a(var3 * -256 / 30, 256 * (-var3 + var7Lifetime2.field_q) / 30, 245, 51, 199, var7Lifetime2);
              } else {
                fl.a(256 * (var7Lifetime2.field_q - var3) / 30, -256 * var3 / 30, 245, -128, 199, var7Lifetime2);
              }
            }
          }
          if (sk.field_n != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < jb.field_d.length) {
              var8 = jb.field_d[var5];
              if (var8 != null && (365 != var8.field_q ||
                var8.field_r != 139)) {
                if (var2 != null) {
                  var2 = (String) (var2) + ", " + var5;
                } else {
                  var2 = Integer.toString(var5);
                }
              }
              var5++;
            }
            if (var2 != null) {
              sk.field_n.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
            }
          }
          if (param0 >= -110) {
            ac.a(61, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ac.D(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
          return -57;
        }
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (0 < param0) {
          var2 = 1;
          if (param0 > 65535) {
            param0 = param0 >> 16;
            var2 += 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            param0 = param0 >> 2;
            var2 += 2;
          }
          if (1 < param0) {
            var2++;
            param0 = param0 >> 1;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param1 < 123) {
          return -17;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (param0 < -16) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 < -4) {
          param0 = param0 >> 2;
          var2Lifetime1 += 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    static {
        field_a = "Press the left mouse button to fire";
    }
}
