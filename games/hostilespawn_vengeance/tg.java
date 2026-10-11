/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static fh field_b;
    static boolean field_a;

    final static void a(int param0, bd[] param1, int param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param1 != null &&
            0 < param2) {
            if (param0 <= 91) {
              field_a = true;
            }
            var5_int = param1[0].field_u;
            var6 = param1[2].field_u;
            var7 = param1[1].field_u;
            param1[0].e(param4, param3);
            param1[2].e(param2 + param4 - var6, param3);
            si.b(ia.field_i);
            si.f(param4 + var5_int, param3, param4 - (-param2 + var6), param1[1].field_r + param3);
            var8 = param4 + var5_int;
            var9 = param4 + param2 - var6;
            for (param4 = var8; param4 < var9; param4 = param4 + var7) {
              param1[1].e(param4, param3);
            }
            si.a(ia.field_i);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(int param0) {
        cl var1 = (cl) (ne.field_q.g(-64));
        if (param0 != -4309) {
          field_a = false;
        }
        if (var1 == null) {
          le.c((byte) 113);
          return;
        }
        en var2 = sc.field_g;
        var2.d(8195);
        var2.d(8195);
        var2.d(8195);
        var2.d(8195);
        var1.b(-96);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var42 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (param16 >= 0 &&
            param8 < ge.field_f) {
            if (0 > param15 &&
              param6 < 0 &&
              0 > param5) {
              return;
            }
            if (param15 >= ge.field_h &&
              param6 >= ge.field_h &&
              ge.field_h <= param5) {
              return;
            }
            if (param10 != 1299210768) {
              return;
            }
            var34 = param16 - param8;
            if (param4 == param8) {
              if (param8 == param16) {
                var23 = 0;
                var24 = 0;
                var31 = 0;
                var26 = param12;
                var30 = param7;
                var19 = 0;
                var28 = 0;
                var22 = param9;
                var20 = 0;
                var18 = param6 << 16;
                var21 = param3;
                var32 = 0;
                var17_int = param15 << 16;
                var29 = param1;
                var25 = param2;
                var27 = 0;
              } else {
                var35 = param16 - param4;
                if (param15 < param6) {
                  var18 = param6 << 16;
                  var30 = param7 << 16;
                  var32 = (param0 - param7 << 16) / var35;
                  var26 = param12 << 16;
                  var24 = (-param9 + param14 << 16) / var35;
                  var25 = param2 << 16;
                  var31 = (param0 - param1 << 16) / var34;
                  var22 = param9 << 16;
                  var20 = (-param6 + param5 << 16) / var35;
                  var23 = (param14 - param3 << 16) / var34;
                  var29 = param1 << 16;
                  var17_int = param15 << 16;
                  var28 = (-param12 + param13 << 16) / var35;
                  var27 = (-param2 + param13 << 16) / var34;
                  var19 = (param5 - param15 << 16) / var34;
                  var21 = param3 << 16;
                } else {
                  var25 = param12 << 16;
                  var21 = param9 << 16;
                  var32 = (-param1 + param0 << 16) / var34;
                  var29 = param7 << 16;
                  var19 = (-param6 + param5 << 16) / var35;
                  var31 = (-param7 + param0 << 16) / var35;
                  var28 = (param13 - param2 << 16) / var34;
                  var18 = param15 << 16;
                  var17_int = param6 << 16;
                  var26 = param2 << 16;
                  var22 = param3 << 16;
                  var24 = (param14 - param3 << 16) / var34;
                  var20 = (param5 - param15 << 16) / var34;
                  var27 = (param13 - param12 << 16) / var35;
                  var23 = (-param9 + param14 << 16) / var35;
                  var30 = param1 << 16;
                }
              }
              var33 = 0;
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param4);
                var18 = var18 + var20 * param8;
                var26 = var26 + param8 * var28;
                var29 = var29 + param8 * var31;
                var22 = var22 + var24 * param8;
                var21 = var21 + param8 * var23;
                var30 = var30 + param8 * var32;
                var25 = var25 + var27 * param8;
                var17_int = var17_int + var19 * param8;
                param8 = 0;
              }
            } else {
              var18 = param15 << 16;
              var17_int = param15 << 16;
              var22 = param3 << 16;
              var21 = param3 << 16;
              var30 = param1 << 16;
              var29 = param1 << 16;
              var26 = param2 << 16;
              var25 = param2 << 16;
              var35 = param4 - param8;
              var19 = (-param15 + param6 << 16) / var35;
              var20 = (param5 - param15 << 16) / var34;
              if (var20 <= var19) {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (-param2 + param13 << 16) / var34;
                var31 = (-param1 + param0 << 16) / var34;
                var32 = (-param1 + param7 << 16) / var35;
                var28 = (-param2 + param12 << 16) / var35;
                var23 = (-param3 + param14 << 16) / var34;
                var33 = 1;
                var24 = (-param3 + param9 << 16) / var35;
              } else {
                var24 = (-param3 + param14 << 16) / var34;
                var32 = (-param1 + param0 << 16) / var34;
                var28 = (-param2 + param13 << 16) / var34;
                var27 = (-param2 + param12 << 16) / var35;
                var31 = (-param1 + param7 << 16) / var35;
                var23 = (param9 - param3 << 16) / var35;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (0 > param4) {
                  param8 = param4 - param8;
                  var29 = var29 + param8 * var31;
                  var25 = var25 + var27 * param8;
                  var26 = var26 + param8 * var28;
                  var22 = var22 + var24 * param8;
                  var21 = var21 + param8 * var23;
                  var17_int = var17_int + var19 * param8;
                  var30 = var30 + var32 * param8;
                  var18 = var18 + param8 * var20;
                  param8 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var26 = var26 + param8 * var28;
                  var18 = var18 + param8 * var20;
                  var22 = var22 + param8 * var24;
                  var29 = var29 + param8 * var31;
                  var30 = var30 + param8 * var32;
                  var25 = var25 + param8 * var27;
                  var17_int = var17_int + param8 * var19;
                  var21 = var21 + param8 * var23;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ge.field_e[param8];
                while (param8 < param4) {
                  var37 = var17_int >> 16;
                  if (ge.field_h > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (0 == var38) {
                      if (0 <= var37 &&
                        var37 < ge.field_h) {
                        sb.a(param11, var21, var36Lifetime2 + var37, var38, var25, 0, 0, 0, var29, (byte) 3);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var38 + var37 >= ge.field_h) {
                        var38 = -1 - var37 + ge.field_h;
                      }
                      if (0 <= var37) {
                        sb.a(param11, var21, var36Lifetime2 + var37, var38, var25, var41, var39, var40, var29, (byte) 3);
                      } else {
                        sb.a(param11, var21 - var37 * var39, var36Lifetime2, var37 + var38, var25 - var40 * var37, var41, var39, var40, var29 - var37 * var41, (byte) 3);
                      }
                    }
                  }
                  param8++;
                  if (param8 >= ge.field_f) {
                    return;
                  }
                  var18 = var18 + var20;
                  var36Lifetime2 = var36Lifetime2 + si.field_e;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                }
              }
              var36Lifetime3 = param16 - param4;
              if (0 == var36Lifetime3) {
                var28 = 0;
                var19 = 0;
                var20 = 0;
                var24 = 0;
                var32 = 0;
                var31 = 0;
                var23 = 0;
                var27 = 0;
              } else {
                var37Lifetime2 = param5 << 16;
                var38Lifetime2 = param14 << 16;
                var39Lifetime2 = param13 << 16;
                var40Lifetime2 = param0 << 16;
                if (var33 != 0) {
                  var18 = param6 << 16;
                  var26 = param12 << 16;
                  var22 = param9 << 16;
                  var30 = param7 << 16;
                } else {
                  var29 = param7 << 16;
                  var17_int = param6 << 16;
                  var25 = param12 << 16;
                  var21 = param9 << 16;
                }
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
              }
            }
            if (0 > param8) {
              param8 = -param8;
              var30 = var30 + param8 * var32;
              var21 = var21 + var23 * param8;
              var26 = var26 + var28 * param8;
              var25 = var25 + param8 * var27;
              var29 = var29 + param8 * var31;
              var18 = var18 + param8 * var20;
              var22 = var22 + param8 * var24;
              var17_int = var17_int + var19 * param8;
              param8 = 0;
            }
            var35Lifetime1 = ge.field_e[param8];
            while (param8 < param16) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < ge.field_h) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (ge.field_h <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = ge.field_h - (var36Lifetime1 + 1);
                  }
                  if (var36Lifetime1 < 0) {
                    sb.a(param11, var21 - var36Lifetime1 * var38Lifetime1, var35Lifetime1, var36Lifetime1 + var37Lifetime1, var25 - var39Lifetime1 * var36Lifetime1, var40Lifetime1, var38Lifetime1, var39Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, (byte) 3);
                  } else {
                    sb.a(param11, var21, var35Lifetime1 + var36Lifetime1, var37Lifetime1, var25, var40Lifetime1, var38Lifetime1, var39Lifetime1, var29, (byte) 3);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    ge.field_h > var36Lifetime1) {
                    sb.a(param11, var21, var35Lifetime1 + var36Lifetime1, var37Lifetime1, var25, 0, 0, 0, var29, (byte) 3);
                  }
                }
              }
              param8++;
              if (ge.field_f <= param8) {
                return;
              }
              var22 = var22 + var24;
              var25 = var25 + var27;
              var29 = var29 + var31;
              var18 = var18 + var20;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var35Lifetime1 = var35Lifetime1 + si.field_e;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("tg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = -104 % ((36 - param0) / 62);
    }

    final static void a(byte param0) {
        if (param0 == 75) {
          tb.f((byte) -85);
          if (null != se.field_h) {
            v.a(67, se.field_h);
          }
          qc.c((byte) -118);
          lj.d((byte) 114);
          md.b(51);
          if (bj.c((byte) -29)) {
            s.field_b.i(19319, 1);
            mb.d(0, -22370);
          }
          le.c((byte) 99);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = ln.field_a.field_d;
          if (param1 != 30427) {
            return;
          }
          var3 = param0 % var2_int;
          var4 = var3;
          var5 = param0 / var2_int;
          var6 = var5;
          ln.field_a.field_f[param0] = 3;
          var7 = 0;
          while (var7 == 0) {
            var7 = 1;
            for (var8 = var3; var4 >= var8; var8++) {
              for (var9 = var5; var6 >= var9; var9++) {
                if (ln.field_a.field_f[var9 * var2_int + var8] == 3) {
                  if (-1 + var2_int > var6) {
                    var6++;
                  }
                  if (1 < var3) {
                    var3--;
                  }
                  if (var5 > 1) {
                    var5--;
                  }
                  if (var4 < var2_int - 1) {
                    var4++;
                  }
                  ln.field_a.field_f[var8 + var9 * var2_int] = 2;
                  if (ln.field_a.field_f[var8 - 1 + var9 * var2_int] == 1) {
                    ln.field_a.field_f[var2_int * var9 + var8 - 1] = 3;
                  }
                  if (ln.field_a.field_f[var9 * var2_int + var8 + 1] == 1) {
                    ln.field_a.field_f[1 + (var8 + var2_int * var9)] = 3;
                  }
                  if (ln.field_a.field_f[(-1 + var9) * var2_int + var8] == 1) {
                    ln.field_a.field_f[var8 + (var9 - 1) * var2_int] = 3;
                  }
                  if (1 == ln.field_a.field_f[(var9 + 1) * var2_int + var8]) {
                    ln.field_a.field_f[var2_int * (var9 + 1) + var8] = 3;
                  }
                  var7 = 0;
                }
              }
            }
          }
          pc.a(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "tg.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new fh();
    }
}
