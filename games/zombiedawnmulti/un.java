/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class un extends gf implements fi {
    private pm field_m;
    static String field_n;
    static String field_p;
    static int field_k;
    static String field_o;
    static String field_l;

    un(pm param0) {
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "un.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        if (param0 < 74) {
          un.a((int[]) null, 70, 11, -98, -57, -82, -73, -16, 0, -9, 113, -26, 31, 38, 49, 83, -9);
        }
        if (param1) {
          if (lb.field_c[param2] < lb.field_c[param3]) {
            return true;
          }
          if (lb.field_c[param2] > lb.field_c[param3]) {
            return false;
          }
          if (hn.field_f[param3] > hn.field_f[param2]) {
            return true;
          }
          if (hn.field_f[param3] < hn.field_f[param2]) {
            return false;
          }
        } else {
          if (hn.field_f[param2] < hn.field_f[param3]) {
            return true;
          }
          if (hn.field_f[param2] > hn.field_f[param3]) {
            return false;
          }
          if (lb.field_c[param2] < lb.field_c[param3]) {
            return true;
          }
          if (lb.field_c[param3] < lb.field_c[param2]) {
            return false;
          }
        }
        var4 = ie.field_ob[param2] + (kj.field_p[param2] + vk.field_J[param2]);
        var5 = ie.field_ob[param3] + (vk.field_J[param3] + kj.field_p[param3]);
        if (var4 < var5) {
          return true;
        }
        if (var4 > var5) {
          return false;
        }
        return !(param2 >= param3);
    }

    abstract re a(boolean param0, String param1);

    public final void a(pm param0, boolean param1) {
        try {
          if (!param1) {
            this.field_m = (pm) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "un.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract String a(String param0, int param1);

    public static void g(int param0) {
        field_n = null;
        field_l = null;
        field_o = null;
        field_p = null;
        if (param0 != -1317848592) {
          un.g(-41);
        }
    }

    public final boolean b(int param0) {
        pm var3;
        boolean stackIn_7_0 = false;
        if (param0 != -3) {
          var3 = (pm) null;
          this.a((pm) null, true);
        }
        stackIn_7_0 = (this.field_m.field_j == null) || (this.field_m.field_j.length() == 0);
        return stackIn_7_0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
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
        var42 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (0 <= param4 &&
            ep.field_h > param9) {
            if (0 > param11 &&
              param12 < 0 &&
              0 > param1) {
              return;
            }
            if (ep.field_i <= param11 &&
              ep.field_i <= param12 &&
              ep.field_i <= param1) {
              return;
            }
            var34 = param4 - param9;
            if (param3 != -10423) {
              return;
            }
            if (param9 != param7) {
              var30 = param13 << 16;
              var29 = param13 << 16;
              var18 = param11 << 16;
              var17_int = param11 << 16;
              var26 = param6 << 16;
              var25 = param6 << 16;
              var22 = param5 << 16;
              var21 = param5 << 16;
              var35 = param7 - param9;
              var19 = (-param11 + param12 << 16) / var35;
              var20 = (param1 - param11 << 16) / var34;
              if (var19 >= var20) {
                var32 = (-param13 + param2 << 16) / var35;
                var31 = (param10 - param13 << 16) / var34;
                var23 = (param15 - param5 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var27 = (-param6 + param16 << 16) / var34;
                var28 = (-param6 + param14 << 16) / var35;
                var24 = (param8 - param5 << 16) / var35;
                var33 = 1;
              } else {
                var27 = (-param6 + param14 << 16) / var35;
                var33 = 0;
                var32 = (-param13 + param10 << 16) / var34;
                var24 = (-param5 + param15 << 16) / var34;
                var31 = (-param13 + param2 << 16) / var35;
                var28 = (-param6 + param16 << 16) / var34;
                var23 = (param8 - param5 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param9 < 0) {
                if (0 > param7) {
                  param9 = param7 - param9;
                  var21 = var21 + param9 * var23;
                  var22 = var22 + var24 * param9;
                  var18 = var18 + var20 * param9;
                  var25 = var25 + param9 * var27;
                  var26 = var26 + param9 * var28;
                  var17_int = var17_int + var19 * param9;
                  var29 = var29 + param9 * var31;
                  var30 = var30 + var32 * param9;
                  param9 = param7;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param9 = -param9;
                  var18 = var18 + param9 * var20;
                  var25 = var25 + var27 * param9;
                  var22 = var22 + var24 * param9;
                  var29 = var29 + param9 * var31;
                  var21 = var21 + param9 * var23;
                  var30 = var30 + param9 * var32;
                  var17_int = var17_int + param9 * var19;
                  var26 = var26 + param9 * var28;
                  param9 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = ep.field_a[param9];
                while (param9 < param7) {
                  var37 = var17_int >> 16;
                  if (var37 < ep.field_i) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (ep.field_i <= var37 + var38) {
                        var38 = -1 + (ep.field_i - var37);
                      }
                      if (var37 >= 0) {
                        ub.a(var38, var21, var29, (byte) 116, param0, var40, var41, var25, var37 + var36Lifetime2, var39);
                      } else {
                        ub.a(var37 + var38, var21 - var39 * var37, var29 - var37 * var41, (byte) -126, param0, var40, var41, -(var37 * var40) + var25, var36Lifetime2, var39);
                      }
                    } else {
                      if (0 <= var37 &&
                        var37 < ep.field_i) {
                        ub.a(var38, var21, var29, (byte) 102, param0, 0, 0, var25, var37 + var36Lifetime2, 0);
                      }
                    }
                  }
                  param9++;
                  if (param9 >= ep.field_h) {
                    return;
                  }
                  var25 = var25 + var27;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + oo.field_b;
                  var21 = var21 + var23;
                  var29 = var29 + var31;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var18 = var18 + var20;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = param4 - param7;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param1 << 16;
                var38Lifetime2 = param15 << 16;
                var39Lifetime2 = param16 << 16;
                if (var33 == 0) {
                  var25 = param14 << 16;
                  var21 = param8 << 16;
                  var17_int = param12 << 16;
                  var29 = param2 << 16;
                } else {
                  var30 = param2 << 16;
                  var18 = param12 << 16;
                  var22 = param8 << 16;
                  var26 = param14 << 16;
                }
                var40Lifetime2 = param10 << 16;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var27 = (-var25 + var39Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var19 = (var37Lifetime2 - var17_int) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var28 = (var39Lifetime2 - var26) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
              } else {
                var23 = 0;
                var20 = 0;
                var32 = 0;
                var24 = 0;
                var31 = 0;
                var19 = 0;
                var28 = 0;
                var27 = 0;
              }
            } else {
              if (param9 != param4) {
                var35 = param4 - param7;
                if (param12 > param11) {
                  var31 = (param10 - param13 << 16) / var34;
                  var26 = param14 << 16;
                  var25 = param6 << 16;
                  var17_int = param11 << 16;
                  var22 = param8 << 16;
                  var32 = (param10 - param2 << 16) / var35;
                  var27 = (param16 - param6 << 16) / var34;
                  var29 = param13 << 16;
                  var18 = param12 << 16;
                  var24 = (param15 - param8 << 16) / var35;
                  var30 = param2 << 16;
                  var23 = (-param5 + param15 << 16) / var34;
                  var28 = (-param14 + param16 << 16) / var35;
                  var19 = (-param11 + param1 << 16) / var34;
                  var21 = param5 << 16;
                  var20 = (-param12 + param1 << 16) / var35;
                } else {
                  var20 = (param1 - param11 << 16) / var34;
                  var29 = param2 << 16;
                  var22 = param5 << 16;
                  var27 = (-param14 + param16 << 16) / var35;
                  var28 = (-param6 + param16 << 16) / var34;
                  var31 = (-param2 + param10 << 16) / var35;
                  var32 = (param10 - param13 << 16) / var34;
                  var30 = param13 << 16;
                  var17_int = param12 << 16;
                  var24 = (-param5 + param15 << 16) / var34;
                  var25 = param14 << 16;
                  var26 = param6 << 16;
                  var19 = (-param12 + param1 << 16) / var35;
                  var23 = (-param8 + param15 << 16) / var35;
                  var18 = param11 << 16;
                  var21 = param8 << 16;
                }
              } else {
                var18 = param12 << 16;
                var25 = param6;
                var21 = param5;
                var27 = 0;
                var28 = 0;
                var23 = 0;
                var24 = 0;
                var17_int = param11 << 16;
                var30 = param2;
                var22 = param8;
                var26 = param14;
                var20 = 0;
                var19 = 0;
                var31 = 0;
                var29 = param13;
                var32 = 0;
              }
              if (param9 < 0) {
                param9 = Math.min(-param9, param7 - param9);
                var29 = var29 + var31 * param9;
                var17_int = var17_int + param9 * var19;
                var21 = var21 + var23 * param9;
                var25 = var25 + var27 * param9;
                var26 = var26 + var28 * param9;
                var22 = var22 + var24 * param9;
                var18 = var18 + param9 * var20;
                var30 = var30 + var32 * param9;
                param9 = 0;
              }
              var33 = 0;
            }
            if (param9 < 0) {
              param9 = -param9;
              var29 = var29 + param9 * var31;
              var21 = var21 + var23 * param9;
              var22 = var22 + param9 * var24;
              var17_int = var17_int + var19 * param9;
              var30 = var30 + param9 * var32;
              var18 = var18 + param9 * var20;
              var25 = var25 + param9 * var27;
              var26 = var26 + var28 * param9;
              param9 = 0;
            }
            var35Lifetime1 = ep.field_a[param9];
            while (param9 < param4) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < ep.field_i) {
                var37Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var36Lifetime1 + var37Lifetime1 >= ep.field_i) {
                    var37Lifetime1 = -1 + (ep.field_i - var36Lifetime1);
                  }
                  if (var36Lifetime1 >= 0) {
                    ub.a(var37Lifetime1, var21, var29, (byte) -24, param0, var39Lifetime1, var40Lifetime1, var25, var35Lifetime1 + var36Lifetime1, var38Lifetime1);
                  } else {
                    ub.a(var37Lifetime1 + var36Lifetime1, var21 - var38Lifetime1 * var36Lifetime1, var29 - var36Lifetime1 * var40Lifetime1, (byte) 81, param0, var39Lifetime1, var40Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, var35Lifetime1, var38Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    ep.field_i > var36Lifetime1) {
                    ub.a(var37Lifetime1, var21, var29, (byte) -84, param0, 0, 0, var25, var35Lifetime1 + var36Lifetime1, 0);
                  }
                }
              }
              param9++;
              if (param9 >= ep.field_h) {
                return;
              }
              var35Lifetime1 = var35Lifetime1 + oo.field_b;
              var22 = var22 + var24;
              var26 = var26 + var28;
              var18 = var18 + var20;
              var21 = var21 + var23;
              var25 = var25 + var27;
              var29 = var29 + var31;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_81_0 = var17;
          stackIn_81_1 = new StringBuilder().append("un.S(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public final void a(pm param0, int param1) {
        try {
          this.a(-1306);
          if (param1 != 0) {
            un.g(78);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "un.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final re f(int param0) {
        if (param0 != -3) {
          un.g(38);
        }
        return this.a(false, this.field_m.field_j);
    }

    final String e(int param0) {
        if (param0 != -3) {
          un.a((int[]) null, -99, -31, 9, -3, 10, 88, -54, -105, 27, -84, -122, -1, -93, -21, -86, 107);
        }
        return this.a(this.field_m.field_j, -1276425040);
    }

    static {
        field_n = "Cloak your zombies in pure fear.";
        field_k = 1;
        field_o = "Nimble Fingers";
        field_l = "<%0> has lost connection.";
    }
}
