/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    static sa field_c;
    static boolean field_b;
    static wk[] field_a;
    static String field_d;
    static String field_e;

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 < -40) {
            break L0;
          } else {
            mv.a(6, (byte) -96, -115, -102, -81);
            break L0;
          }
        }
        var5 = 0;
        L1: while (true) {
          if (-8 >= (var5 ^ -1)) {
            if (param3 < 0) {
              return;
            } else {
              L2: {
                if (cu.field_a) {
                  var5 = -128;
                  L3: while (true) {
                    if (var5 >= 16) {
                      break L2;
                    } else {
                      L4: {
                        var6 = var5;
                        var7 = var5;
                        if (var7 > 0) {
                          var7 = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var7 = var7 >> 5;
                        if ((var6 ^ -1) > -1) {
                          var6 = 256 + (var6 << 1148962625);
                          break L5;
                        } else {
                          var6 = -(var6 << 692930276) + 256;
                          break L5;
                        }
                      }
                      ds.field_a[param3].f(param0 - 5 + (int)((double)var7 * Math.sin((double)(var5 + param2) * 3.141592653589793 / 236.0)), param4 - -var5, var6 >> 1206293410);
                      ds.field_a[param3].f(param0 + (-20 - -(int)((double)var7 * Math.sin(3.141592653589793 * (double)(5 + (param2 + var5)) / 256.0))), param4 - -var5, var6 >> -146068158);
                      ds.field_a[param3].f((int)(Math.sin((double)(var5 + (param2 + 10)) * 3.141592653589793 / 216.0) * (double)var7) + 10 + param0, param4 - -var5, var6 >> -366058654);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  pv.field_e.b();
                  qn.b();
                  hh.field_d.d(0, hh.field_d.field_v >> 888526305, op.field_c[0][param3]);
                  so.field_b.a(5605);
                  pv.field_e.d(-20 + param0, -200 + param4, 75, 210, 255);
                  pv.field_e.c();
                  pv.field_e.d(-20 + param0, param4 - -10, 75, 50, 255);
                  break L2;
                }
              }
              return;
            }
          } else {
            L6: {
              var6 = 16 - (param2 + 20 * var5) % 144;
              var7 = var6;
              var8 = var6;
              if (0 >= var8) {
                break L6;
              } else {
                var8 = 0;
                break L6;
              }
            }
            L7: {
              var8 = var8 >> 3;
              if (var7 < 0) {
                var7 = (var7 << 1444769057) + 256;
                break L7;
              } else {
                var7 = -(var7 << 519045956) + 256;
                break L7;
              }
            }
            L8: {
              var9 = 0;
              var10 = var5 % 3;
              if (var10 == -1) {
                var9 = -5;
                break L8;
              } else {
                if (-2 != var10) {
                  if (var10 != 2) {
                    break L8;
                  } else {
                    var9 = 10;
                    break L8;
                  }
                } else {
                  var9 = -20;
                  break L8;
                }
              }
            }
            if (param3 >= 0) {
              le.field_c[param3].f(param0 - (-10 - var9) - -(int)((double)var8 * Math.sin((double)(10 + var6 - -(param2 * 3)) * 3.141592653589793 / (double)(230 - -(4 * var5)))), param4 - -var6, var7 >> 185912161);
              var5++;
              continue L1;
            } else {
              im.field_y.f(var9 + 10 + (param0 + (int)(Math.sin((double)(var6 - -(param2 * 3) - -10) * 3.141592653589793 / (double)(var5 * 4 + 230)) * (double)var8)), var6 + param4, var7 >> -684576415);
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -48) {
            return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new sa();
        field_e = "You can ask to join this game";
    }
}
