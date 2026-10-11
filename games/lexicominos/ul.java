/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends kd {
    int field_i;
    int field_l;
    static boolean field_k;
    int field_n;
    int[] field_h;
    static int field_o;
    int field_p;
    int field_m;
    int field_j;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        var42 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1 >= 0 &&
            k.field_d > param3) {
            if (0 > param13 &&
              param9 < 0 &&
              0 > param16) {
              return;
            }
            if (k.field_f <= param13 &&
              k.field_f <= param9 &&
              param16 >= k.field_f) {
              return;
            }
            if (param12 != -1464114640) {
              return;
            }
            var34 = param1 - param3;
            if (param6 == param3) {
              if (param3 != param1) {
                var35 = param1 - param6;
                if (param9 <= param13) {
                  var26 = param11 << 16;
                  var17_int = param9 << 16;
                  var24 = (param0 - param5 << 16) / var34;
                  var18 = param13 << 16;
                  var20 = (param16 - param13 << 16) / var34;
                  var27 = (-param15 + param2 << 16) / var35;
                  var21 = param10 << 16;
                  var25 = param15 << 16;
                  var22 = param5 << 16;
                  var29 = param14 << 16;
                  var28 = (param2 - param11 << 16) / var34;
                  var19 = (-param9 + param16 << 16) / var35;
                  var23 = (-param10 + param0 << 16) / var35;
                  var32 = (-param7 + param8 << 16) / var34;
                  var31 = (param8 - param14 << 16) / var35;
                  var30 = param7 << 16;
                } else {
                  var24 = (param0 - param10 << 16) / var35;
                  var30 = param14 << 16;
                  var26 = param15 << 16;
                  var25 = param11 << 16;
                  var21 = param5 << 16;
                  var23 = (-param5 + param0 << 16) / var34;
                  var17_int = param13 << 16;
                  var28 = (param2 - param15 << 16) / var35;
                  var32 = (param8 - param14 << 16) / var35;
                  var29 = param7 << 16;
                  var22 = param10 << 16;
                  var27 = (param2 - param11 << 16) / var34;
                  var31 = (param8 - param7 << 16) / var34;
                  var18 = param9 << 16;
                  var19 = (param16 - param13 << 16) / var34;
                  var20 = (-param9 + param16 << 16) / var35;
                }
              } else {
                var18 = param9 << 16;
                var26 = param15;
                var28 = 0;
                var27 = 0;
                var25 = param11;
                var30 = param14;
                var31 = 0;
                var32 = 0;
                var23 = 0;
                var19 = 0;
                var20 = 0;
                var21 = param5;
                var24 = 0;
                var17_int = param13 << 16;
                var29 = param7;
                var22 = param10;
              }
              var33 = 0;
              if (param3 < 0) {
                param3 = Math.min(-param3, -param3 + param6);
                var30 = var30 + param3 * var32;
                var25 = var25 + param3 * var27;
                var22 = var22 + var24 * param3;
                var29 = var29 + param3 * var31;
                var18 = var18 + param3 * var20;
                var21 = var21 + param3 * var23;
                var17_int = var17_int + param3 * var19;
                var26 = var26 + param3 * var28;
                param3 = 0;
              }
            } else {
              var30 = param7 << 16;
              var29 = param7 << 16;
              var26 = param11 << 16;
              var25 = param11 << 16;
              var18 = param13 << 16;
              var17_int = param13 << 16;
              var22 = param5 << 16;
              var21 = param5 << 16;
              var35 = param6 - param3;
              var19 = (param9 - param13 << 16) / var35;
              var20 = (param16 - param13 << 16) / var34;
              if (var19 >= var20) {
                var27 = (param2 - param11 << 16) / var34;
                var31 = (-param7 + param8 << 16) / var34;
                var24 = (-param5 + param10 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var23 = (param0 - param5 << 16) / var34;
                var32 = (param14 - param7 << 16) / var35;
                var28 = (param15 - param11 << 16) / var35;
              } else {
                var32 = (param8 - param7 << 16) / var34;
                var23 = (param10 - param5 << 16) / var35;
                var27 = (param15 - param11 << 16) / var35;
                var31 = (-param7 + param14 << 16) / var35;
                var24 = (param0 - param5 << 16) / var34;
                var33 = 0;
                var28 = (param2 - param11 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param6 < 0) {
                  param3 = -param3 + param6;
                  var18 = var18 + var20 * param3;
                  var25 = var25 + var27 * param3;
                  var21 = var21 + param3 * var23;
                  var30 = var30 + var32 * param3;
                  var26 = var26 + var28 * param3;
                  var17_int = var17_int + param3 * var19;
                  var29 = var29 + param3 * var31;
                  var22 = var22 + var24 * param3;
                  param3 = param6;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var29 = var29 + var31 * param3;
                  var26 = var26 + param3 * var28;
                  var22 = var22 + var24 * param3;
                  var21 = var21 + param3 * var23;
                  var30 = var30 + var32 * param3;
                  var17_int = var17_int + param3 * var19;
                  var25 = var25 + param3 * var27;
                  var18 = var18 + param3 * var20;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = k.field_e[param3];
                while (param6 > param3) {
                  var37 = var17_int >> 16;
                  if (var37 < k.field_f) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (0 <= var37 &&
                        k.field_f > var37) {
                        vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 + var36Lifetime2, var29);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (var37 + var38 >= k.field_f) {
                        var38 = k.field_f - var37 - 1;
                      }
                      if (var37 < 0) {
                        vb.a(var39, -(var40 * var37) + var25, var38 + var37, var41, var21 - var37 * var39, (byte) -95, param4, var40, var36Lifetime2, var29 - var41 * var37);
                      } else {
                        vb.a(var39, var25, var38, var41, var21, (byte) -95, param4, var40, var36Lifetime2 + var37, var29);
                      }
                    }
                  }
                  param3++;
                  if (param3 >= k.field_d) {
                    return;
                  }
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + lf.field_f;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                }
              }
              var36Lifetime3 = param1 - param6;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param16 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param2 << 16;
                if (var33 != 0) {
                  var22 = param10 << 16;
                  var18 = param9 << 16;
                  var30 = param14 << 16;
                  var26 = param15 << 16;
                } else {
                  var21 = param10 << 16;
                  var29 = param14 << 16;
                  var17_int = param9 << 16;
                  var25 = param15 << 16;
                }
                var40Lifetime2 = param8 << 16;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
              } else {
                var24 = 0;
                var23 = 0;
                var27 = 0;
                var19 = 0;
                var32 = 0;
                var20 = 0;
                var28 = 0;
                var31 = 0;
              }
            }
            if (param3 < 0) {
              param3 = -param3;
              var26 = var26 + var28 * param3;
              var25 = var25 + var27 * param3;
              var18 = var18 + var20 * param3;
              var30 = var30 + var32 * param3;
              var21 = var21 + param3 * var23;
              var29 = var29 + param3 * var31;
              var17_int = var17_int + var19 * param3;
              var22 = var22 + var24 * param3;
              param3 = 0;
            }
            var35Lifetime1 = k.field_e[param3];
            while (param1 > param3) {
              var36Lifetime1 = var17_int >> 16;
              if (k.field_f > var36Lifetime1) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= k.field_f) {
                    var37Lifetime1 = k.field_f - var36Lifetime1 - 1;
                  }
                  if (var36Lifetime1 < 0) {
                    vb.a(var38Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var36Lifetime1 + var37Lifetime1, var40Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, (byte) -95, param4, var39Lifetime1, var35Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29);
                  } else {
                    vb.a(var38Lifetime1, var25, var37Lifetime1, var40Lifetime1, var21, (byte) -95, param4, var39Lifetime1, var35Lifetime1 + var36Lifetime1, var29);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < k.field_f) {
                    vb.a(0, var25, var37Lifetime1, 0, var21, (byte) -95, param4, 0, var36Lifetime1 + var35Lifetime1, var29);
                  }
                }
              }
              param3++;
              if (k.field_d <= param3) {
                return;
              }
              var25 = var25 + var27;
              var17_int = var17_int + var19;
              var29 = var29 + var31;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var30 = var30 + var32;
              var35Lifetime1 = var35Lifetime1 + lf.field_f;
              var26 = var26 + var28;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_78_0 = var17;
          stackIn_78_1 = new StringBuilder().append("ul.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static int a(nc param0, sj param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1 != null &&
            null != param1.field_n &&
            param0 != null &&
            param1.field_h == param0.field_k) {
            var4_int = param0.field_m.length;
            var5 = param1.field_n[param3].length / var4_int;
            if (param2 < 44) {
              ul.a(-76, -113, 52, -107, (int[]) null, 3, 112, 69, -116, -97, 14, -59, 65, 10, -40, 3, 50);
            }
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param0.field_h == param1.field_i[param3][var6] &&
                md.a(param1.field_j[param3][var6], -98)) {
                for (var7 = 0; var4_int > var7; var7++) {
                  if (param1.field_n[param3][var7 + var4_int * var6] != param0.field_m[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_21_0 = var6;
                  return stackIn_21_0;
                }
              }
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("ul.E(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_n = param3;
        if (param2 != 0) {
          return;
        }
        try {
          this.field_i = param4;
          this.field_j = param5;
          this.field_h = param0;
          this.field_l = param7;
          this.field_p = param1;
          this.field_m = param6;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ul.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(sh param0, sh param1, sh param2, byte param3) {
        db var18 = null;
        jb[] var5 = null;
        jb[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        jb[] var15 = null;
        int var11_int = 0;
        db var16 = null;
        db var19 = null;
        db var11 = null;
        db var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = Lexicominos.field_L ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ti.field_I = td.a("commonui", "frame_top", param0, 22306);
          we.field_i = td.a("commonui", "frame_bottom", param0, 22306);
          Lexicominos.field_I = df.a("commonui", "jagex_logo_grey", param0, (byte) -123);
          uc.field_hb = td.a("commonui", "button", param0, 22306);
          be.field_b = uk.a("validation", "commonui", -909811167, param0);
          cl.field_T = (le) ((Object) ee.a("commonui", "arezzo12", false, param1, param0));
          ql.field_Q = (le) ((Object) ee.a("commonui", "arezzo14", false, param1, param0));
          ra.field_c = (le) ((Object) ee.a("commonui", "arezzo14bold", false, param1, param0));
          var18 = new db(param2.a((byte) 127, "", "button.gif"), (java.awt.Component) ((Object) ug.field_y));
          nh.a("commonui", param0, false, "dropdown");
          var5 = wf.a(param0, "commonui", true, "screen_options");
          si.field_u = new jb[4];
          oc.field_d = new jb[4];
          uj.field_a = new jb[4];
          var6 = new jb[][]{uj.field_a, si.field_u, oc.field_d};
          var20 = new int[4][];
          var17 = var20;
          var7 = var17;
          var7[0] = var5[0].field_j;
          for (var8 = 1; var8 < var20.length; var8++) {
            var7[var8] = (int[]) ((Object) var20[0].clone());
          }
          var8Lifetime1 = var5[0].field_i[0];
          var20[2][var8Lifetime1] = 16777215;
          var20[1][var8Lifetime1] = 2394342;
          var20[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            jb[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
              var15[var11_int] = bf.a(var20[var11_int], var5[var9], 0);
            }
          }
          var9Lifetime1 = var18.field_u;
          ja.b((byte) -116);
          var18.b();
          lf.b(0, 0, lf.field_f, lf.field_a);
          var16 = new db(var9Lifetime1, var9Lifetime1);
          var19 = var16;
          var19.b();
          var18.b(0, 0);
          var11 = new db(var9Lifetime1, var9Lifetime1);
          var11.b();
          var18.b(-var18.field_p + var9Lifetime1, 0);
          int var12 = -33 / ((param3 - 38) / 59);
          var13 = new db(var18.field_p - var9Lifetime1 * 2, var9Lifetime1);
          var13.b();
          var18.b(-var9Lifetime1, 0);
          pd.a(-22949);
          uc.field_hb = new db[]{var16, var13, var11};
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ul.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1 != 14080) {
            return false;
          }
          try {
            if (!ab.field_b.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; var3 < param0.length(); var3++) {
              if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("ul.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    ul() {
    }

    static {
        field_k = true;
        field_o = 0;
    }
}
