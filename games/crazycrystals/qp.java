/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends jb {
    int field_h;
    static ko field_i;
    static boolean field_f;
    static String[] field_g;

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hd.a(false);
        kh.a(param0, param4, param2, param1);
        if (param3 != 73) {
          qp.a(90, 81, -14, (byte) -52, 17);
        }
    }

    private qp() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 1095153680) {
          return;
        }
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = CrazyCrystals.field_B;
        try {
          if (0 <= param3 &&
            param5 < nb.field_b) {
            if (param7 < 0 &&
              param1 < 0 &&
              0 > param2) {
              return;
            }
            if (param7 >= nb.field_d &&
              nb.field_d <= param1 &&
              nb.field_d <= param2) {
              return;
            }
            if (param0 != 99) {
              field_g = (String[]) null;
            }
            var14 = param3 - param5;
            if (param8 == param5) {
              if (param3 == param5) {
                var11 = 0;
                var9_int = param7 << 16;
                var10 = param1 << 16;
                var12 = 0;
              } else {
                var15 = -param8 + param3;
                if (param1 <= param7) {
                  var12 = (-param7 + param2 << 16) / var14;
                  var11 = (-param1 + param2 << 16) / var15;
                  var9_int = param1 << 16;
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                  var12 = (-param1 + param2 << 16) / var15;
                  var11 = (param2 - param7 << 16) / var14;
                  var10 = param1 << 16;
                }
              }
              if (param5 < 0) {
                param5 = Math.min(-param5, -param5 + param8);
                var10 = var10 + param5 * var12;
                var9_int = var9_int + var11 * param5;
                param5 = 0;
              }
              var13 = 0;
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param8 - param5;
              var12 = (-param7 + param2 << 16) / var14;
              var11 = (-param7 + param1 << 16) / var15;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param5) {
                if (param8 < 0) {
                  param5 = param8 - param5;
                  var10 = var10 + param5 * var12;
                  var9_int = var9_int + var11 * param5;
                  param5 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param5 = -param5;
                  var10 = var10 + param5 * var12;
                  var9_int = var9_int + param5 * var11;
                  param5 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = nb.field_a[param5];
                while (param5 < param8) {
                  var17 = var9_int >> 16;
                  if (nb.field_d > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        nb.field_d > var17) {
                        ui.a(param4, var18, param6, -109, var16Lifetime2 + var17);
                      }
                    } else {
                      if (var18 + var17 >= nb.field_d) {
                        var18 = -1 + nb.field_d - var17;
                      }
                      if (0 <= var17) {
                        ui.a(param4, var18, param6, param0 ^ -59, var17 + var16Lifetime2);
                      } else {
                        ui.a(param4, var17 + var18, param6, -39, var16Lifetime2);
                      }
                    }
                  }
                  param5++;
                  if (param5 >= nb.field_b) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + kh.field_l;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param8 + param3;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param2 << 16;
                if (var13 == 0) {
                  var9_int = param1 << 16;
                } else {
                  var10 = param1 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              } else {
                var11 = 0;
                var12 = 0;
              }
            }
            if (0 > param5) {
              param5 = -param5;
              var10 = var10 + param5 * var12;
              var9_int = var9_int + var11 * param5;
              param5 = 0;
            }
            var15Lifetime1 = nb.field_a[param5];
            while (param3 > param5) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < nb.field_d) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    nb.field_d > var16Lifetime1) {
                    ui.a(param4, var17Lifetime1, param6, -122, var16Lifetime1 + var15Lifetime1);
                  }
                } else {
                  if (nb.field_d <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = nb.field_d - (var16Lifetime1 + 1);
                  }
                  if (var16Lifetime1 >= 0) {
                    ui.a(param4, var17Lifetime1, param6, -107, var16Lifetime1 + var15Lifetime1);
                  } else {
                    ui.a(param4, var16Lifetime1 + var17Lifetime1, param6, -47, var15Lifetime1);
                  }
                }
              }
              param5++;
              if (nb.field_b <= param5) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + kh.field_l;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_81_0 = var9;
          stackIn_81_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(byte param0) {
        pl.e(-119);
        qd.field_q = true;
        int var1 = 91 % ((-59 - param0) / 58);
        ne.field_d = true;
        qe.field_g.g((byte) -122);
        ke.a(gg.field_b, false, -13);
    }

    static {
        field_g = new String[]{"Basics", "Rolling", "Shuffles", "Spiders", "Sticky Balls"};
    }
}
