/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj {
    static String field_a;
    static java.awt.Frame field_c;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
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
        var42 = client.field_A ? 1 : 0;
        try {
          if (param14 >= 0 &&
            param11 < qg.field_e) {
            if (0 > param10 &&
              param4 < 0 &&
              param5 < 0) {
              return;
            }
            if (qg.field_a <= param10 &&
              qg.field_a <= param4 &&
              qg.field_a <= param5) {
              return;
            }
            if (param7 >= -32) {
              oj.a(false, 33);
            }
            var34 = param14 - param11;
            if (param11 == param3) {
              if (param11 != param14) {
                var35 = -param3 + param14;
                if (param4 <= param10) {
                  var28 = (param9 - param2 << 16) / var34;
                  var27 = (param9 - param6 << 16) / var35;
                  var31 = (-param1 + param13 << 16) / var35;
                  var21 = param8 << 16;
                  var29 = param1 << 16;
                  var22 = param15 << 16;
                  var24 = (param0 - param15 << 16) / var34;
                  var20 = (-param10 + param5 << 16) / var34;
                  var23 = (param0 - param8 << 16) / var35;
                  var26 = param2 << 16;
                  var32 = (param13 - param16 << 16) / var34;
                  var30 = param16 << 16;
                  var17_int = param4 << 16;
                  var25 = param6 << 16;
                  var19 = (param5 - param4 << 16) / var35;
                  var18 = param10 << 16;
                } else {
                  var24 = (param0 - param8 << 16) / var35;
                  var25 = param2 << 16;
                  var18 = param4 << 16;
                  var22 = param8 << 16;
                  var31 = (-param16 + param13 << 16) / var34;
                  var27 = (param9 - param2 << 16) / var34;
                  var17_int = param10 << 16;
                  var28 = (param9 - param6 << 16) / var35;
                  var23 = (param0 - param15 << 16) / var34;
                  var19 = (-param10 + param5 << 16) / var34;
                  var26 = param6 << 16;
                  var20 = (param5 - param4 << 16) / var35;
                  var21 = param15 << 16;
                  var30 = param1 << 16;
                  var32 = (-param1 + param13 << 16) / var35;
                  var29 = param16 << 16;
                }
              } else {
                var31 = 0;
                var32 = 0;
                var29 = param16;
                var30 = param1;
                var23 = 0;
                var26 = param6;
                var22 = param8;
                var18 = param4 << 16;
                var21 = param15;
                var25 = param2;
                var17_int = param10 << 16;
                var24 = 0;
                var20 = 0;
                var27 = 0;
                var28 = 0;
                var19 = 0;
              }
              if (param11 < 0) {
                param11 = Math.min(-param11, param3 - param11);
                var26 = var26 + param11 * var28;
                var30 = var30 + param11 * var32;
                var18 = var18 + param11 * var20;
                var17_int = var17_int + param11 * var19;
                var21 = var21 + var23 * param11;
                var22 = var22 + var24 * param11;
                var29 = var29 + param11 * var31;
                var25 = var25 + param11 * var27;
                param11 = 0;
              }
              var33 = 0;
            } else {
              var18 = param10 << 16;
              var17_int = param10 << 16;
              var30 = param16 << 16;
              var29 = param16 << 16;
              var22 = param15 << 16;
              var21 = param15 << 16;
              var26 = param2 << 16;
              var25 = param2 << 16;
              var35 = -param11 + param3;
              var19 = (param4 - param10 << 16) / var35;
              var20 = (param5 - param10 << 16) / var34;
              if (var20 > var19) {
                var33 = 0;
                var27 = (-param2 + param6 << 16) / var35;
                var32 = (param13 - param16 << 16) / var34;
                var24 = (-param15 + param0 << 16) / var34;
                var28 = (-param2 + param9 << 16) / var34;
                var31 = (-param16 + param1 << 16) / var35;
                var23 = (param8 - param15 << 16) / var35;
              } else {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (-param2 + param9 << 16) / var34;
                var32 = (-param16 + param1 << 16) / var35;
                var31 = (param13 - param16 << 16) / var34;
                var33 = 1;
                var28 = (param6 - param2 << 16) / var35;
                var23 = (param0 - param15 << 16) / var34;
                var24 = (-param15 + param8 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param11 < 0) {
                if (param3 < 0) {
                  param11 = param3 - param11;
                  var26 = var26 + var28 * param11;
                  var17_int = var17_int + var19 * param11;
                  var29 = var29 + var31 * param11;
                  var30 = var30 + var32 * param11;
                  var21 = var21 + param11 * var23;
                  var22 = var22 + param11 * var24;
                  var25 = var25 + var27 * param11;
                  var18 = var18 + param11 * var20;
                  param11 = param3;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param11 = -param11;
                  var25 = var25 + param11 * var27;
                  var26 = var26 + var28 * param11;
                  var22 = var22 + var24 * param11;
                  var18 = var18 + var20 * param11;
                  var17_int = var17_int + param11 * var19;
                  var30 = var30 + param11 * var32;
                  var29 = var29 + param11 * var31;
                  var21 = var21 + var23 * param11;
                  param11 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = qg.field_d[param11];
                while (param3 > param11) {
                  var37 = var17_int >> 16;
                  if (qg.field_a > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= qg.field_a) {
                        var38 = -1 + (qg.field_a - var37);
                      }
                      if (var37 >= 0) {
                        ve.a(var25, var37 + var36Lifetime2, var40, var39, var21, var38, 9, param12, var29, var41);
                      } else {
                        ve.a(var25 - var37 * var40, var36Lifetime2, var40, var39, var21 - var37 * var39, var38 + var37, 9, param12, var29 - var37 * var41, var41);
                      }
                    } else {
                      if (var37 >= 0 &&
                        var37 < qg.field_a) {
                        ve.a(var25, var37 + var36Lifetime2, 0, 0, var21, var38, 9, param12, var29, 0);
                      }
                    }
                  }
                  param11++;
                  if (param11 >= qg.field_e) {
                    return;
                  }
                  var18 = var18 + var20;
                  var21 = var21 + var23;
                  var30 = var30 + var32;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var36Lifetime2 = var36Lifetime2 + hk.field_j;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = -param3 + param14;
              if (var36Lifetime3 == 0) {
                var23 = 0;
                var19 = 0;
                var32 = 0;
                var20 = 0;
                var31 = 0;
                var24 = 0;
                var27 = 0;
                var28 = 0;
              } else {
                var37Lifetime2 = param5 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param9 << 16;
                var40Lifetime2 = param13 << 16;
                if (var33 == 0) {
                  var21 = param8 << 16;
                  var25 = param6 << 16;
                  var29 = param1 << 16;
                  var17_int = param4 << 16;
                } else {
                  var26 = param6 << 16;
                  var22 = param8 << 16;
                  var30 = param1 << 16;
                  var18 = param4 << 16;
                }
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
              }
            }
            if (param11 < 0) {
              param11 = -param11;
              var25 = var25 + param11 * var27;
              var21 = var21 + param11 * var23;
              var18 = var18 + param11 * var20;
              var17_int = var17_int + param11 * var19;
              var30 = var30 + var32 * param11;
              var29 = var29 + var31 * param11;
              var26 = var26 + param11 * var28;
              var22 = var22 + var24 * param11;
              param11 = 0;
            }
            var35Lifetime1 = qg.field_d[param11];
            while (param11 < param14) {
              var36Lifetime1 = var17_int >> 16;
              if (qg.field_a > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    qg.field_a > var36Lifetime1) {
                    ve.a(var25, var36Lifetime1 + var35Lifetime1, 0, 0, var21, var37Lifetime1, 9, param12, var29, 0);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (qg.field_a <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + qg.field_a - 1;
                  }
                  if (var36Lifetime1 >= 0) {
                    ve.a(var25, var35Lifetime1 + var36Lifetime1, var39Lifetime1, var38Lifetime1, var21, var37Lifetime1, 9, param12, var29, var40Lifetime1);
                  } else {
                    ve.a(var25 - var39Lifetime1 * var36Lifetime1, var35Lifetime1, var39Lifetime1, var38Lifetime1, -(var36Lifetime1 * var38Lifetime1) + var21, var37Lifetime1 + var36Lifetime1, 9, param12, var29 - var40Lifetime1 * var36Lifetime1, var40Lifetime1);
                  }
                }
              }
              param11++;
              if (param11 >= qg.field_e) {
                return;
              }
              var29 = var29 + var31;
              var35Lifetime1 = var35Lifetime1 + hk.field_j;
              var26 = var26 + var28;
              var18 = var18 + var20;
              var25 = var25 + var27;
              var22 = var22 + var24;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("oj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static int b(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_25_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          wl var2 = null;
          if (4 <= ta.field_k.field_j) {
            if (ta.field_k.field_o == -1) {
              return 3;
            }
            if (ta.field_k.field_o != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (param0 == hd.field_n) {
              d.field_f = bl.field_U.a(124, pe.field_b, cb.field_c);
              hd.field_n = hd.field_n + 1;
            }
            if (hd.field_n == 1) {
              if (2 == d.field_f.field_c) {
                stackIn_15_0 = al.a(0, -1);
                return stackIn_15_0;
              }
              if (d.field_f.field_c == 1) {
                hd.field_n = hd.field_n + 1;
              }
            }
            if (hd.field_n == 2) {
              rk.field_L = new qk((java.net.Socket) (d.field_f.field_b), bl.field_U);
              var2 = new wl(13);
              gi.a(hh.field_f, fh.field_f, 17, var2, cn.field_U);
              var2.a(true, 15);
              var2.a(vm.field_w, false);
              rk.field_L.a(0, 13, param0 + 1, var2.field_r);
              hd.field_n = hd.field_n + 1;
              me.field_E = 30000L + ik.a(param0 ^ 4);
            }
            if (hd.field_n == 3) {
              if (rk.field_L.b(0) > 0) {
                var1_int = rk.field_L.c((byte) 8);
                if (var1_int != 0) {
                  stackIn_28_0 = al.a(0, var1_int);
                  return stackIn_28_0;
                }
                hd.field_n = hd.field_n + 1;
              } else {
                if (me.field_E < ik.a(param0 ^ 4)) {
                  stackIn_25_0 = al.a(0, -2);
                  return stackIn_25_0;
                }
              }
            }
            if (hd.field_n != 4) {
              stackIn_34_0 = -1;
              return stackIn_34_0;
            }
            ta.field_k.a(rk.field_L, (byte) -128, ta.field_f);
            rk.field_L = null;
            d.field_f = null;
            hd.field_n = 0;
            stackIn_32_0 = 0;
            return stackIn_32_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return al.a(0, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 != 3805) {
          field_b = (String) null;
        }
    }

    final static ke a(boolean param0, int param1) {
        ec var6 = null;
        ec var4 = null;
        ec var7 = null;
        ke var5 = new ke(3);
        ke var8 = var5;
        if (!ph.n(-30146)) {
          var5.a(new ec(23, vh.field_b[0], a.field_t), 117);
          var5.a(new ec(23, vh.field_b[1], a.field_t), param1 - 299);
          var5.field_f[1].field_n = 200;
          var6 = var5.field_f[0];
          ec var3 = var6;
          var6.field_n = 200;
          var5.field_f[0].field_l = 320 + (-var5.field_f[0].field_n - 10);
          var5.field_f[1].field_l = 330;
          var5.field_f[1].field_m = 372;
          var4 = var5.field_f[0];
          var4.field_m = 372;
        } else {
          var7 = new ec(20, qn.field_rb, a.field_t);
          var7.field_l = 320 - var7.field_n / 2;
          var7.field_m = 372;
          var8.a(var7, 112);
        }
        ec var9 = new ec(13, pc.field_f, a.field_t);
        var9.field_l = -(var9.field_n / 2) + 320;
        var9.field_m = param1;
        var8.a(var9, 102);
        var8.field_w = 70;
        var8.field_y = 500;
        var8.field_z = 76;
        var8.field_q = 272;
        var8.a(cj.field_c, param0, -129);
        return var8;
    }

    static {
        field_a = "Remove <%0> from ignore list";
        field_b = "To <%0>: ";
    }
}
