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
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -40) {
                break L1;
              } else {
                mv.a(6, (byte) -96, -115, -102, -81);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= 7) {
                if (param3 < 0) {
                  return;
                } else {
                  L3: {
                    if (cu.field_a) {
                      var5_int = -128;
                      L4: while (true) {
                        if (var5_int >= 16) {
                          break L3;
                        } else {
                          L5: {
                            var6 = var5_int;
                            var7 = var5_int;
                            if (var7 > 0) {
                              var7 = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            var7 = var7 >> 5;
                            if (var6 < 0) {
                              var6 = 256 + (var6 << 1);
                              break L6;
                            } else {
                              var6 = -(var6 << 4) + 256;
                              break L6;
                            }
                          }
                          ds.field_a[param3].f(param0 - 5 + (int)((double)var7 * Math.sin((double)(var5_int + param2) * 3.141592653589793 / 236.0)), param4 - -var5_int, var6 >> 2);
                          ds.field_a[param3].f(param0 + (-20 - -(int)((double)var7 * Math.sin(3.141592653589793 * (double)(5 + (param2 + var5_int)) / 256.0))), param4 - -var5_int, var6 >> 2);
                          ds.field_a[param3].f((int)(Math.sin((double)(var5_int + (param2 + 10)) * 3.141592653589793 / 216.0) * (double)var7) + 10 + param0, param4 - -var5_int, var6 >> 2);
                          var5_int++;
                          continue L4;
                        }
                      }
                    } else {
                      pv.field_e.b();
                      qn.b();
                      hh.field_d.d(0, hh.field_d.field_v >> 1, op.field_c[0][param3]);
                      so.field_b.a(5605);
                      pv.field_e.d(-20 + param0, -200 + param4, 75, 210, 255);
                      pv.field_e.c();
                      pv.field_e.d(-20 + param0, param4 - -10, 75, 50, 255);
                      break L3;
                    }
                  }
                  break L0;
                }
              } else {
                L7: {
                  var6 = 16 - (param2 + 20 * var5_int) % 144;
                  var7 = var6;
                  var8 = var6;
                  if (0 >= var8) {
                    break L7;
                  } else {
                    var8 = 0;
                    break L7;
                  }
                }
                L8: {
                  var8 = var8 >> 3;
                  if (var7 < 0) {
                    var7 = (var7 << 1) + 256;
                    break L8;
                  } else {
                    var7 = -(var7 << 4) + 256;
                    break L8;
                  }
                }
                L9: {
                  var9 = 0;
                  var10 = var5_int % 3;
                  if (var10 == 0) {
                    var9 = -5;
                    break L9;
                  } else {
                    if (var10 != 1) {
                      if (var10 != 2) {
                        break L9;
                      } else {
                        var9 = 10;
                        break L9;
                      }
                    } else {
                      var9 = -20;
                      break L9;
                    }
                  }
                }
                L10: {
                  if (param3 >= 0) {
                    le.field_c[param3].f(param0 - (-10 - var9) - -(int)((double)var8 * Math.sin((double)(10 + var6 - -(param2 * 3)) * 3.141592653589793 / (double)(230 - -(4 * var5_int)))), param4 - -var6, var7 >> 1);
                    break L10;
                  } else {
                    im.field_y.f(var9 + 10 + (param0 + (int)(Math.sin((double)(var6 - -(param2 * 3) - -10) * 3.141592653589793 / (double)(var5_int * 4 + 230)) * (double)var8)), var6 + param4, var7 >> 1);
                    break L10;
                  }
                }
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "mv.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a() {
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
