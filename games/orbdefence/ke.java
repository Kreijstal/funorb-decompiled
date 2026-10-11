/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static int[] field_d;
    static int field_b;
    static hj field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -80) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ke.a((String) null, false, (byte) 42, (java.applet.Applet) null);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
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
        var42 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param12 >= 0 &&
            wi.field_a > param14) {
            if (0 > param6 &&
              param0 < 0 &&
              param1 < 0) {
              return;
            }
            if (wi.field_c <= param6 &&
              param0 >= wi.field_c &&
              param1 >= wi.field_c) {
              return;
            }
            var34 = -param14 + param12;
            if (param14 == param2) {
              if (param12 != param14) {
                var35 = -param2 + param12;
                if (param0 > param6) {
                  var22 = param15 << 16;
                  var17_int = param6 << 16;
                  var23 = (-param10 + param11 << 16) / var34;
                  var19 = (-param6 + param1 << 16) / var34;
                  var21 = param10 << 16;
                  var32 = (-param8 + param4 << 16) / var35;
                  var28 = (param3 - param13 << 16) / var35;
                  var31 = (param4 - param5 << 16) / var34;
                  var18 = param0 << 16;
                  var27 = (-param7 + param3 << 16) / var34;
                  var29 = param5 << 16;
                  var26 = param13 << 16;
                  var30 = param8 << 16;
                  var20 = (-param0 + param1 << 16) / var35;
                  var25 = param7 << 16;
                  var24 = (-param15 + param11 << 16) / var35;
                } else {
                  var17_int = param0 << 16;
                  var31 = (param4 - param8 << 16) / var35;
                  var32 = (-param5 + param4 << 16) / var34;
                  var24 = (param11 - param10 << 16) / var34;
                  var19 = (param1 - param0 << 16) / var35;
                  var30 = param5 << 16;
                  var20 = (-param6 + param1 << 16) / var34;
                  var27 = (param3 - param13 << 16) / var35;
                  var22 = param10 << 16;
                  var25 = param13 << 16;
                  var21 = param15 << 16;
                  var29 = param8 << 16;
                  var28 = (param3 - param7 << 16) / var34;
                  var26 = param7 << 16;
                  var18 = param6 << 16;
                  var23 = (-param15 + param11 << 16) / var35;
                }
              } else {
                var26 = param13;
                var18 = param0 << 16;
                var21 = param10;
                var25 = param7;
                var27 = 0;
                var19 = 0;
                var24 = 0;
                var32 = 0;
                var22 = param15;
                var23 = 0;
                var28 = 0;
                var31 = 0;
                var20 = 0;
                var17_int = param6 << 16;
                var29 = param5;
                var30 = param8;
              }
              var33 = 0;
              if (param14 < 0) {
                param14 = Math.min(-param14, param2 - param14);
                var17_int = var17_int + param14 * var19;
                var25 = var25 + param14 * var27;
                var30 = var30 + var32 * param14;
                var21 = var21 + var23 * param14;
                var22 = var22 + param14 * var24;
                var18 = var18 + var20 * param14;
                var26 = var26 + param14 * var28;
                var29 = var29 + param14 * var31;
                param14 = 0;
              }
            } else {
              var22 = param10 << 16;
              var21 = param10 << 16;
              var26 = param7 << 16;
              var25 = param7 << 16;
              var18 = param6 << 16;
              var17_int = param6 << 16;
              var30 = param5 << 16;
              var29 = param5 << 16;
              var35 = param2 - param14;
              var19 = (-param6 + param0 << 16) / var35;
              var20 = (param1 - param6 << 16) / var34;
              if (var19 < var20) {
                var24 = (-param10 + param11 << 16) / var34;
                var28 = (param3 - param7 << 16) / var34;
                var23 = (param15 - param10 << 16) / var35;
                var33 = 0;
                var32 = (-param5 + param4 << 16) / var34;
                var31 = (-param5 + param8 << 16) / var35;
                var27 = (-param7 + param13 << 16) / var35;
              } else {
                var31 = (param4 - param5 << 16) / var34;
                var28 = (-param7 + param13 << 16) / var35;
                var32 = (param8 - param5 << 16) / var35;
                var23 = (-param10 + param11 << 16) / var34;
                var24 = (param15 - param10 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (-param7 + param3 << 16) / var34;
                var33 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param14) {
                if (param2 < 0) {
                  param14 = param2 - param14;
                  var26 = var26 + var28 * param14;
                  var22 = var22 + param14 * var24;
                  var30 = var30 + var32 * param14;
                  var25 = var25 + var27 * param14;
                  var29 = var29 + param14 * var31;
                  var18 = var18 + param14 * var20;
                  var21 = var21 + var23 * param14;
                  var17_int = var17_int + param14 * var19;
                  param14 = param2;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param14 = -param14;
                  var18 = var18 + param14 * var20;
                  var21 = var21 + var23 * param14;
                  var25 = var25 + param14 * var27;
                  var26 = var26 + var28 * param14;
                  var30 = var30 + var32 * param14;
                  var22 = var22 + var24 * param14;
                  var29 = var29 + var31 * param14;
                  var17_int = var17_int + var19 * param14;
                  param14 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = wi.field_i[param14];
                while (param14 < param2) {
                  var37 = var17_int >> 16;
                  if (wi.field_c > var37) {
                    var38 = (var18 >> 16) - (var17_int >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (wi.field_c <= var38 + var37) {
                        var38 = wi.field_c - var37 - 1;
                      }
                      if (0 > var37) {
                        ik.a(var37 + var38, var36Lifetime2, -(var40 * var37) + var25, var40, -73, var39, var21 - var37 * var39, param9, -(var41 * var37) + var29, var41);
                      } else {
                        ik.a(var38, var37 + var36Lifetime2, var25, var40, param16 ^ -1551567563, var39, var21, param9, var29, var41);
                      }
                    } else {
                      if (var37 >= 0 &&
                        wi.field_c > var37) {
                        ik.a(var38, var36Lifetime2 + var37, var25, 0, -84, 0, var21, param9, var29, 0);
                      }
                    }
                  }
                  param14++;
                  if (param14 >= wi.field_a) {
                    return;
                  }
                  var22 = var22 + var24;
                  var18 = var18 + var20;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + ul.field_f;
                  var26 = var26 + var28;
                  var25 = var25 + var27;
                  var30 = var30 + var32;
                  var17_int = var17_int + var19;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = param12 - param2;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param1 << 16;
                var38Lifetime2 = param11 << 16;
                var39Lifetime2 = param3 << 16;
                if (var33 != 0) {
                  var30 = param8 << 16;
                  var26 = param13 << 16;
                  var18 = param0 << 16;
                  var22 = param15 << 16;
                } else {
                  var25 = param13 << 16;
                  var21 = param15 << 16;
                  var29 = param8 << 16;
                  var17_int = param0 << 16;
                }
                var40Lifetime2 = param4 << 16;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
              } else {
                var19 = 0;
                var32 = 0;
                var27 = 0;
                var20 = 0;
                var24 = 0;
                var28 = 0;
                var23 = 0;
                var31 = 0;
              }
            }
            if (param16 != 1551567504) {
              ke.a(-111);
            }
            if (0 > param14) {
              param14 = -param14;
              var30 = var30 + param14 * var32;
              var21 = var21 + var23 * param14;
              var17_int = var17_int + var19 * param14;
              var22 = var22 + var24 * param14;
              var26 = var26 + param14 * var28;
              var18 = var18 + var20 * param14;
              var29 = var29 + param14 * var31;
              var25 = var25 + var27 * param14;
              param14 = 0;
            }
            var35Lifetime1 = wi.field_i[param14];
            while (param14 < param12) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < wi.field_c) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (wi.field_c <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + (wi.field_c - 1);
                  }
                  if (var36Lifetime1 >= 0) {
                    ik.a(var37Lifetime1, var36Lifetime1 + var35Lifetime1, var25, var39Lifetime1, -62, var38Lifetime1, var21, param9, var29, var40Lifetime1);
                  } else {
                    ik.a(var36Lifetime1 + var37Lifetime1, var35Lifetime1, var25 - var39Lifetime1 * var36Lifetime1, var39Lifetime1, -73, var38Lifetime1, var21 - var36Lifetime1 * var38Lifetime1, param9, -(var40Lifetime1 * var36Lifetime1) + var29, var40Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    wi.field_c > var36Lifetime1) {
                    ik.a(var37Lifetime1, var36Lifetime1 + var35Lifetime1, var25, 0, param16 ^ -1551567530, 0, var21, param9, var29, 0);
                  }
                }
              }
              param14++;
              if (wi.field_a <= param14) {
                return;
              }
              var18 = var18 + var20;
              var25 = var25 + var27;
              var35Lifetime1 = var35Lifetime1 + ul.field_f;
              var22 = var22 + var24;
              var17_int = var17_int + var19;
              var29 = var29 + var31;
              var26 = var26 + var28;
              var30 = var30 + var32;
              var21 = var21 + var23;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("ke.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2, String param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              if (param0 != 849743536) {
                ke.a(67);
              }
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param1 + "=" + param3 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param4 >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + dh.a(-15591, ji.b(105) + 1000L * param4) + "; Max-Age=" + param4;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              gm.a((byte) -17, "document.cookie=\"" + var7Lifetime4 + "\"", param2);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("ke.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, byte param2, java.applet.Applet param3) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (be.field_c.startsWith("win") &&
              tk.a(true, param0)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
              if (param2 > -33) {
                field_a = (String) null;
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              pe.a((byte) -13, (Throwable) null, "MGR1: " + param0);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("ke.B(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var1 = 45 % ((param0 - 31) / 54);
    }

    static {
        field_a = "SCORE: <%0>";
    }
}
