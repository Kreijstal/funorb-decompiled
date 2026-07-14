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
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o var7 = null;
        o var7_ref = null;
        o var8 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        mi.g(243, 197, 369, 143, 16777215);
        mi.b(244, 198, 367, 141, 0);
        if (null == jb.field_d) {
          L0: {
            if (sk.field_n != null) {
              int discarded$4 = sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var6 = jb.field_d[we.field_h];
            var7 = var6;
            var7 = var6;
            if (var6 == null) {
              if (null == sk.field_n) {
                break L1;
              } else {
                int discarded$5 = sk.field_n.a(te.field_J, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L1;
              }
            } else {
              var6.d(245, 199);
              break L1;
            }
          }
          L2: {
            if (ti.field_e < uc.field_e) {
              var7_ref = jb.field_d[vb.field_g];
              if (var7_ref == null) {
                break L2;
              } else {
                var2_int = (var7_ref.field_q - -60) * ti.field_e / uc.field_e;
                var3 = -30 + var2_int;
                if (!fh.field_g) {
                  fl.a(var3 * -256 / 30, 256 * (-var3 + var7_ref.field_q) / 30, 245, 51, 199, var7_ref);
                  break L2;
                } else {
                  fl.a(256 * (var7_ref.field_q + -var3) / 30, -256 * var3 / 30, 245, -128, 199, var7_ref);
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (sk.field_n != null) {
              var2 = null;
              var5 = 0;
              var3 = var5;
              L4: while (true) {
                if (var5 >= jb.field_d.length) {
                  if (var2 == null) {
                    break L3;
                  } else {
                    int discarded$6 = sk.field_n.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L3;
                  }
                } else {
                  var8 = jb.field_d[var5];
                  if (var8 != null) {
                    L5: {
                      if (365 != var8.field_q) {
                        break L5;
                      } else {
                        if ((var8.field_r ^ -1) != -140) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    if (var2 != null) {
                      var2 = var2 + ", " + var5;
                      var5++;
                      continue L4;
                    } else {
                      var2 = Integer.toString(var5);
                      var5++;
                      continue L4;
                    }
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L6: {
            if (param0 < -110) {
              break L6;
            } else {
              int discarded$7 = ac.a(61, false);
              break L6;
            }
          }
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
            return -57;
        }
        param0--;
        param0 = param0 | param0 >>> 1664989313;
        param0 = param0 | param0 >>> 1943770146;
        param0 = param0 | param0 >>> -1869216828;
        param0 = param0 | param0 >>> -1103602104;
        param0 = param0 | param0 >>> 325046672;
        return param0 - -1;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (0 < param0) {
            var2 = 1;
            if (!(param0 <= 65535)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(param0 <= 255)) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (-16 > param0) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (-4 < param0) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (1 < param0) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param1 < 123) {
            return -17;
        }
        if (!(param0 >= -256)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(15 >= (param0 ^ -1))) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (!((param0 ^ -1) <= 3)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press the left mouse button to fire";
    }
}
