/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != -1102) {
          field_a = (int[]) null;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var19 = TrackController.field_F ? 1 : 0;
        try {
          if (param1 >= 0 &&
            ig.field_d > param8) {
            if (param0 < 0 &&
              param4 < 0 &&
              0 > param5) {
              return;
            }
            if (param7 != -26361) {
              e.a(64, -25, 3);
            }
            if (ig.field_g <= param0 &&
              param4 >= ig.field_g &&
              ig.field_g <= param5) {
              return;
            }
            var14 = param1 - param8;
            if (param8 == param3) {
              if (param1 != param8) {
                var15 = param1 - param3;
                if (param0 < param4) {
                  var12 = (-param4 + param5 << 16) / var15;
                  var9_int = param0 << 16;
                  var11 = (param5 - param0 << 16) / var14;
                  var10 = param4 << 16;
                } else {
                  var10 = param0 << 16;
                  var11 = (-param4 + param5 << 16) / var15;
                  var9_int = param4 << 16;
                  var12 = (param5 - param0 << 16) / var14;
                }
              } else {
                var10 = param4 << 16;
                var11 = 0;
                var9_int = param0 << 16;
                var12 = 0;
              }
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param3);
                var10 = var10 + var12 * param8;
                var9_int = var9_int + param8 * var11;
                param8 = 0;
              }
              var13 = 0;
            } else {
              var10 = param0 << 16;
              var9_int = param0 << 16;
              var15 = -param8 + param3;
              var11 = (param4 - param0 << 16) / var15;
              var12 = (param5 - param0 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (param3 < 0) {
                  param8 = -param8 + param3;
                  var10 = var10 + param8 * var12;
                  var9_int = var9_int + param8 * var11;
                  param8 = param3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var10 = var10 + var12 * param8;
                  var9_int = var9_int + var11 * param8;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ig.field_i[param8];
                while (param3 > param8) {
                  var17 = var9_int >> 16;
                  if (var17 < ig.field_g) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < ig.field_g) {
                        ta.a(param6, param7 ^ -19323, param2, var17 + var16Lifetime2, var18);
                      }
                    } else {
                      if (ig.field_g <= var17 + var18) {
                        var18 = -1 - var17 + ig.field_g;
                      }
                      if (0 <= var17) {
                        ta.a(param6, 11650, param2, var16Lifetime2 + var17, var18);
                      } else {
                        ta.a(param6, 11650, param2, var16Lifetime2, var17 + var18);
                      }
                    }
                  }
                  param8++;
                  if (ig.field_d <= param8) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ll.field_d;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = param1 - param3;
              if (0 != var16Lifetime3) {
                if (var13 == 0) {
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                }
                var17Lifetime2 = param5 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (0 > param8) {
              param8 = -param8;
              var9_int = var9_int + param8 * var11;
              var10 = var10 + var12 * param8;
              param8 = 0;
            }
            var15Lifetime1 = ig.field_i[param8];
            while (param1 > param8) {
              var16Lifetime1 = var9_int >> 16;
              if (ig.field_g > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 != 0) {
                  if (ig.field_g <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (ig.field_g - var16Lifetime1);
                  }
                  if (var16Lifetime1 >= 0) {
                    ta.a(param6, 11650, param2, var16Lifetime1 + var15Lifetime1, var17Lifetime1);
                  } else {
                    ta.a(param6, 11650, param2, var15Lifetime1, var17Lifetime1 + var16Lifetime1);
                  }
                } else {
                  if (0 <= var16Lifetime1 &&
                    var16Lifetime1 < ig.field_g) {
                    ta.a(param6, param7 + 38011, param2, var15Lifetime1 + var16Lifetime1, var17Lifetime1);
                  }
                }
              }
              param8++;
              if (param8 >= ig.field_d) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + ll.field_d;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("e.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        if (param1 != -1932340400) {
          return 21;
        }
        var3 = param2;
        if (512 == var3) {
          if ((1 & field_a[param0]) != 0) {
            return 4096;
          }
          stackIn_13_0 = ((field_a[param0] & 8) == 0) ? 16384 : 2048;
          return stackIn_13_0;
        }
        if (var3 == 1024) {
          stackIn_19_0 = ((16 & field_a[param0]) != 0) ? 4096 : 2048;
          return stackIn_19_0;
        }
        if (var3 == 128) {
          return 4096;
        }
        throw new IllegalArgumentException();
    }

    static {
        field_a = new int[38];
        field_a[19] = 17;
        field_a[24] = 1;
        field_a[15] = 4;
        field_a[16] = 9;
        field_a[28] = 26;
        field_a[11] = 36;
        field_a[33] = 49;
        field_a[14] = 8;
        field_a[36] = 7;
        field_a[30] = 13;
        field_a[13] = 32;
        field_a[23] = 34;
        field_a[12] = 16;
        field_a[34] = 35;
        field_a[32] = 42;
        field_a[10] = 24;
        field_a[20] = 6;
        field_a[8] = 2;
        field_a[21] = 18;
        field_a[29] = 38;
        field_a[7] = 1;
        field_a[26] = 37;
        field_a[37] = 19;
        field_a[27] = 25;
        field_a[17] = 5;
        field_a[9] = 3;
        field_a[25] = 2;
        field_a[18] = 33;
        field_a[35] = 11;
        field_a[31] = 22;
        field_a[22] = 10;
    }
}
