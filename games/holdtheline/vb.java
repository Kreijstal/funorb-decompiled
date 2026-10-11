/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static int field_d;
    static String field_c;
    static boolean field_b;
    static ud[] field_a;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        var8 = HoldTheLine.field_D;
        if (cf.field_q < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = -35 + param1;
        var5 = 256;
        if (param0 < ~cf.field_q) {
          var5 = (cf.field_q << 8) / 75;
        }
        if (cf.field_q > 200) {
          var5 = (250 - cf.field_q << 8) / 50;
        }
        hf.a(kj.field_p, -1);
        li.c();
        tc.c();
        td.a((byte) -111);
        if (var5 < 256) {
          tc.c(0, 0, tc.field_j, tc.field_c, 0, -var5 + 256);
        }
        dm.b((byte) -10);
        if (cf.field_q >= 150) {
          w.field_c.d(15 + var3, 10 + var4, var5);
          var6 = -125 + cf.field_q;
          if (var6 <= 0) {
            var6 = -140 + cf.field_q;
            if (var6 > 0) {
              var7 = 256;
              if (var6 < 20) {
                var7 = 256 * var6 / 20;
              }
              kh.field_l.d(var3 + 15, var4 + 10, var5 * var7 >> 8);
            }
          } else {
            if (50 <= var6) {
              var6 = -140 + cf.field_q;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = 256 * var6 / 20;
                }
                kh.field_l.d(var3 + 15, var4 + 10, var5 * var7 >> 8);
              }
            } else {
              if (var6 < 20) {
                var7 = var6 * 256 / 20;
                wj.field_o.b(var3, var4, var7);
                var6 = -140 + cf.field_q;
                if (var6 > 0) {
                  var7 = 256;
                  if (var6 < 20) {
                    var7 = 256 * var6 / 20;
                  }
                  kh.field_l.d(var3 + 15, var4 + 10, var5 * var7 >> 8);
                }
              } else {
                if (var6 < 30) {
                  wj.field_o.b(var3, var4, 256);
                  var6 = -140 + cf.field_q;
                  if (var6 > 0) {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                    }
                    kh.field_l.d(var3 + 15, var4 + 10, var5 * var7 >> 8);
                  }
                } else {
                  var7 = 256 * (-var6 + 50) / 20;
                  wj.field_o.b(var3, var4, var7);
                  var6 = -140 + cf.field_q;
                  if (var6 > 0) {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                    }
                    kh.field_l.d(var3 + 15, var4 + 10, var5 * var7 >> 8);
                  }
                }
              }
            }
          }
          return;
        }
        kj.field_p.c(var3, var4);
        var6Lifetime1 = -125 + cf.field_q;
        if (var6Lifetime1 > 0 &&
          50 > var6Lifetime1) {
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
            wj.field_o.b(var3, var4, var7Lifetime1);
          } else {
            if (var6Lifetime1 < 30) {
              wj.field_o.b(var3, var4, 256);
            } else {
              var7Lifetime1 = 256 * (-var6Lifetime1 + 50) / 20;
              wj.field_o.b(var3, var4, var7Lifetime1);
            }
          }
        }
        var6Lifetime2 = -140 + cf.field_q;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = 256 * var6Lifetime2 / 20;
          }
          kh.field_l.d(var3 + 15, var4 + 10, var5 * var7Lifetime2 >> 8);
        }
        return;
    }

    final static void a(int param0, hj param1) {
        try {
          ok.a(32381);
          if (param0 > -44) {
            vb.a(51);
          }
          param1.f();
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "vb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 332243496) {
          return false;
        }
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (dg.a((byte) -68, param1)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 != 95) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -1) {
          field_d = 13;
        }
    }

    static {
        field_c = "Select Course Type";
    }
}
