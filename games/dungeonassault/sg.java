/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static int[] field_c;
    static String field_f;
    static int[] field_d;
    static cn field_b;
    static String field_a;
    static String[] field_e;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != param0) {
          return true;
        }
        int var3 = tg.field_f[3][param2];
        if (var3 == 23) {
          return ak.field_o[0] <= gm.field_d.field_m ? true : false;
        }
        return true;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var42 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = DungeonAssault.field_K;
        try {
          if (param3 >= 0 &&
            re.field_i > param9) {
            if (param14 < 0 &&
              param5 < 0 &&
              param16 < 0) {
              return;
            }
            if (param14 >= re.field_b &&
              re.field_b <= param5 &&
              re.field_b <= param16) {
              return;
            }
            if (param8 != -13) {
              field_e = (String[]) null;
            }
            var34 = -param9 + param3;
            if (param9 == param7) {
              if (param3 != param9) {
                var35 = param3 - param7;
                if (param5 <= param14) {
                  var30 = param13 << 16;
                  var24 = (param15 - param10 << 16) / var34;
                  var31 = (-param4 + param6 << 16) / var35;
                  var22 = param10 << 16;
                  var28 = (param1 - param2 << 16) / var34;
                  var21 = param11 << 16;
                  var20 = (-param14 + param16 << 16) / var34;
                  var23 = (param15 - param11 << 16) / var35;
                  var25 = param12 << 16;
                  var17_int = param5 << 16;
                  var19 = (param16 - param5 << 16) / var35;
                  var18 = param14 << 16;
                  var29 = param4 << 16;
                  var32 = (-param13 + param6 << 16) / var34;
                  var26 = param2 << 16;
                  var27 = (param1 - param12 << 16) / var35;
                } else {
                  var21 = param10 << 16;
                  var28 = (-param12 + param1 << 16) / var35;
                  var27 = (-param2 + param1 << 16) / var34;
                  var23 = (param15 - param10 << 16) / var34;
                  var30 = param4 << 16;
                  var19 = (param16 - param14 << 16) / var34;
                  var31 = (param6 - param13 << 16) / var34;
                  var25 = param2 << 16;
                  var29 = param13 << 16;
                  var26 = param12 << 16;
                  var22 = param11 << 16;
                  var20 = (param16 - param5 << 16) / var35;
                  var17_int = param14 << 16;
                  var24 = (-param11 + param15 << 16) / var35;
                  var32 = (-param4 + param6 << 16) / var35;
                  var18 = param5 << 16;
                }
              } else {
                var28 = 0;
                var26 = param12;
                var31 = 0;
                var27 = 0;
                var23 = 0;
                var24 = 0;
                var29 = param13;
                var32 = 0;
                var25 = param2;
                var18 = param5 << 16;
                var21 = param10;
                var17_int = param14 << 16;
                var22 = param11;
                var30 = param4;
                var20 = 0;
                var19 = 0;
              }
              if (0 > param9) {
                param9 = Math.min(-param9, -param9 + param7);
                var17_int = var17_int + var19 * param9;
                var22 = var22 + var24 * param9;
                var21 = var21 + param9 * var23;
                var29 = var29 + param9 * var31;
                var25 = var25 + param9 * var27;
                var26 = var26 + var28 * param9;
                var30 = var30 + param9 * var32;
                var18 = var18 + var20 * param9;
                param9 = 0;
              }
              var33 = 0;
            } else {
              var26 = param2 << 16;
              var25 = param2 << 16;
              var22 = param10 << 16;
              var21 = param10 << 16;
              var18 = param14 << 16;
              var17_int = param14 << 16;
              var30 = param13 << 16;
              var29 = param13 << 16;
              var35 = -param9 + param7;
              var19 = (-param14 + param5 << 16) / var35;
              var20 = (param16 - param14 << 16) / var34;
              if (var20 > var19) {
                var27 = (param12 - param2 << 16) / var35;
                var33 = 0;
                var32 = (param6 - param13 << 16) / var34;
                var24 = (param15 - param10 << 16) / var34;
                var28 = (-param2 + param1 << 16) / var34;
                var31 = (param4 - param13 << 16) / var35;
                var23 = (-param10 + param11 << 16) / var35;
              } else {
                var31 = (param6 - param13 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var28 = (-param2 + param12 << 16) / var35;
                var27 = (param1 - param2 << 16) / var34;
                var24 = (-param10 + param11 << 16) / var35;
                var32 = (-param13 + param4 << 16) / var35;
                var23 = (param15 - param10 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param9) {
                if (0 > param7) {
                  param9 = -param9 + param7;
                  var18 = var18 + param9 * var20;
                  var29 = var29 + var31 * param9;
                  var25 = var25 + var27 * param9;
                  var30 = var30 + var32 * param9;
                  var21 = var21 + param9 * var23;
                  var17_int = var17_int + var19 * param9;
                  var22 = var22 + var24 * param9;
                  var26 = var26 + var28 * param9;
                  param9 = param7;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param9 = -param9;
                  var17_int = var17_int + param9 * var19;
                  var25 = var25 + param9 * var27;
                  var30 = var30 + var32 * param9;
                  var22 = var22 + param9 * var24;
                  var21 = var21 + var23 * param9;
                  var26 = var26 + param9 * var28;
                  var29 = var29 + param9 * var31;
                  var18 = var18 + param9 * var20;
                  param9 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = re.field_e[param9];
                while (param7 > param9) {
                  var37 = var17_int >> 16;
                  if (var37 < re.field_b) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 == 0) {
                      if (var37 >= 0 &&
                        re.field_b > var37) {
                        lo.a(var38, var37 + var36Lifetime2, 0, var25, 0, var21, param0, 0, var29, 0);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var38 + var37 >= re.field_b) {
                        var38 = -1 + (re.field_b - var37);
                      }
                      if (var37 < 0) {
                        lo.a(var37 + var38, var36Lifetime2, var41, var25 - var40 * var37, 0, var21 - var39 * var37, param0, var39, var29 - var37 * var41, var40);
                      } else {
                        lo.a(var38, var36Lifetime2 + var37, var41, var25, 0, var21, param0, var39, var29, var40);
                      }
                    }
                  }
                  param9++;
                  if (param9 >= re.field_i) {
                    return;
                  }
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                  var36Lifetime2 = var36Lifetime2 + gf.field_i;
                  var29 = var29 + var31;
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                }
              }
              var36Lifetime3 = -param7 + param3;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param16 << 16;
                var38Lifetime2 = param15 << 16;
                var39Lifetime2 = param1 << 16;
                var40Lifetime2 = param6 << 16;
                if (var33 != 0) {
                  var18 = param5 << 16;
                  var22 = param11 << 16;
                  var30 = param4 << 16;
                  var26 = param12 << 16;
                } else {
                  var29 = param4 << 16;
                  var25 = param12 << 16;
                  var17_int = param5 << 16;
                  var21 = param11 << 16;
                }
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
              } else {
                var27 = 0;
                var19 = 0;
                var23 = 0;
                var20 = 0;
                var31 = 0;
                var28 = 0;
                var24 = 0;
                var32 = 0;
              }
            }
            if (param9 < 0) {
              param9 = -param9;
              var17_int = var17_int + param9 * var19;
              var21 = var21 + var23 * param9;
              var30 = var30 + var32 * param9;
              var25 = var25 + var27 * param9;
              var22 = var22 + var24 * param9;
              var18 = var18 + var20 * param9;
              var26 = var26 + var28 * param9;
              var29 = var29 + param9 * var31;
              param9 = 0;
            }
            var35Lifetime1 = re.field_e[param9];
            while (param9 < param3) {
              var36Lifetime1 = var17_int >> 16;
              if (re.field_b > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= re.field_b) {
                    var37Lifetime1 = -1 + (-var36Lifetime1 + re.field_b);
                  }
                  if (0 <= var36Lifetime1) {
                    lo.a(var37Lifetime1, var35Lifetime1 + var36Lifetime1, var40Lifetime1, var25, 0, var21, param0, var38Lifetime1, var29, var39Lifetime1);
                  } else {
                    lo.a(var37Lifetime1 + var36Lifetime1, var35Lifetime1, var40Lifetime1, var25 - var39Lifetime1 * var36Lifetime1, 0, -(var36Lifetime1 * var38Lifetime1) + var21, param0, var38Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, var39Lifetime1);
                  }
                } else {
                  if (0 <= var36Lifetime1 &&
                    var36Lifetime1 < re.field_b) {
                    lo.a(var37Lifetime1, var36Lifetime1 + var35Lifetime1, 0, var25, 0, var21, param0, 0, var29, 0);
                  }
                }
              }
              param9++;
              if (param9 >= re.field_i) {
                return;
              }
              var29 = var29 + var31;
              var30 = var30 + var32;
              var21 = var21 + var23;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + gf.field_i;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var22 = var22 + var24;
              var26 = var26 + var28;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("sg.B(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_d = null;
        int var1 = -90 % ((3 - param0) / 42);
    }

    static {
        field_c = new int[46];
        field_f = "Daemonette";
        field_a = "These work in the same way as trap rooms, but the consequences of a failed roll are that any monsters in the dungeon will be much harder to surprise when starting combat. Some guardians require a raider to make a successful Sneak roll (against the Guardian's Detect), while others require a Dodge roll (against the Guardian's Snare)";
        field_d = new int[46];
        field_d[0] = 1;
        field_c[0] = 100;
        field_d[1] = 1;
        field_c[1] = 100;
        field_d[2] = 1;
        field_c[2] = 100;
        field_d[3] = 1;
        field_c[3] = 100;
        field_d[4] = 2;
        field_d[5] = 2;
        field_c[4] = 200;
        field_c[5] = 200;
        field_d[6] = 3;
        field_c[6] = 300;
        field_d[7] = 2;
        field_d[8] = 1;
        field_c[7] = 200;
        field_c[8] = 100;
        field_d[9] = 1;
        field_c[9] = 100;
        field_d[10] = 2;
        field_d[11] = 2;
        field_c[10] = 200;
        field_d[12] = 2;
        field_c[11] = 200;
        field_c[12] = 200;
        field_d[13] = 3;
        field_d[14] = 3;
        field_c[13] = 300;
        field_d[15] = 1;
        field_c[14] = 300;
        field_c[15] = 100;
        field_d[16] = 1;
        field_c[16] = 100;
        field_d[17] = 1;
        field_d[18] = 3;
        field_c[17] = 100;
        field_d[19] = 1;
        field_c[18] = 300;
        field_d[20] = 1;
        field_c[19] = 100;
        field_d[21] = 1;
        field_c[20] = 100;
        field_d[22] = 10;
        field_c[21] = 100;
        field_d[23] = 5;
        field_c[22] = 1000;
        field_c[23] = 500;
        field_d[24] = 5;
        field_c[24] = 500;
        field_d[25] = 3;
        field_c[25] = 300;
        field_d[26] = 3;
        field_c[26] = 300;
        field_d[27] = 3;
        field_d[28] = 3;
        field_c[27] = 300;
        field_c[28] = 300;
        field_d[29] = 3;
        field_d[30] = 5;
        field_c[29] = 300;
        field_c[30] = 500;
        field_d[31] = 10;
        field_d[32] = 10;
        field_c[31] = 1000;
        field_c[32] = 1000;
        field_d[33] = 5;
        field_d[34] = 3;
        field_c[33] = 500;
        field_c[34] = 300;
        field_d[35] = 5;
        field_d[36] = 3;
        field_c[35] = 500;
        field_d[37] = 10;
        field_c[36] = 300;
        field_d[38] = 3;
        field_c[37] = 1000;
        field_c[38] = 300;
        field_d[39] = 5;
        field_c[39] = 500;
        field_d[40] = 5;
        field_c[40] = 500;
        field_d[41] = 10;
        field_d[42] = 10;
        field_c[41] = 1000;
        field_d[43] = 3;
        field_c[42] = 1000;
        field_c[43] = 300;
        field_d[44] = 5;
        field_d[45] = 10;
        field_c[44] = 500;
        field_c[45] = 1000;
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
