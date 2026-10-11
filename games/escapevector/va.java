/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private fl field_c;
    static long field_b;
    private fl field_a;

    final boolean b(int param0) {
        if (param0 != -182442704) {
          this.field_a = (fl) null;
        }
        return this.field_c.field_j == this.field_c ? true : false;
    }

    final static void d(int param0) {
        od.field_j.field_g = param0;
        od.field_j.field_d = 0;
    }

    final int c(int param0) {
        int var4 = EscapeVector.field_A;
        int var2 = param0;
        fl var3 = this.field_c.field_j;
        while (this.field_c != var3) {
          var3 = var3.field_j;
          var2++;
        }
        return var2;
    }

    final fl b(byte param0) {
        fl var2 = this.field_c.field_j;
        if (this.field_c != var2) {
          if (param0 != -75) {
            this.field_a = (fl) null;
          }
          var2.d(110);
          return var2;
        }
        return null;
    }

    final void a(int param0, fl param1) {
        try {
          if (null != param1.field_i) {
            param1.d(109);
          }
          if (param0 != -1) {
            field_b = 29L;
          }
          param1.field_j = this.field_c;
          param1.field_i = this.field_c.field_i;
          param1.field_i.field_j = param1;
          param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "va.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(n param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.e(0);
          if (!param1) {
            return true;
          }
          stackIn_6_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_6_0;
          stackIn_7_0 = var3;
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("va.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, boolean param11, int param12, int param13, int param14, int param15, int param16) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
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
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
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
        var42 = EscapeVector.field_A;
        try {
          if (param10 >= 0 &&
            param8 < bi.field_f) {
            if (param7 < 0 &&
              0 > param5 &&
              0 > param13) {
              return;
            }
            if (bi.field_c <= param7 &&
              bi.field_c <= param5 &&
              bi.field_c <= param13) {
              return;
            }
            if (!param11) {
              va.d(-74);
            }
            var34 = param10 - param8;
            if (param9 == param8) {
              if (param10 != param8) {
                var35 = param10 - param9;
                if (param5 <= param7) {
                  var21 = param1 << 16;
                  var25 = param6 << 16;
                  var20 = (-param7 + param13 << 16) / var34;
                  var19 = (-param5 + param13 << 16) / var35;
                  var30 = param2 << 16;
                  var18 = param7 << 16;
                  var17_int = param5 << 16;
                  var27 = (param15 - param6 << 16) / var35;
                  var23 = (param0 - param1 << 16) / var35;
                  var22 = param12 << 16;
                  var31 = (-param3 + param16 << 16) / var35;
                  var26 = param14 << 16;
                  var32 = (param16 - param2 << 16) / var34;
                  var29 = param3 << 16;
                  var24 = (-param12 + param0 << 16) / var34;
                  var28 = (-param14 + param15 << 16) / var34;
                } else {
                  var26 = param6 << 16;
                  var31 = (param16 - param2 << 16) / var34;
                  var30 = param3 << 16;
                  var17_int = param7 << 16;
                  var28 = (-param6 + param15 << 16) / var35;
                  var27 = (-param14 + param15 << 16) / var34;
                  var19 = (param13 - param7 << 16) / var34;
                  var21 = param12 << 16;
                  var18 = param5 << 16;
                  var22 = param1 << 16;
                  var25 = param14 << 16;
                  var29 = param2 << 16;
                  var32 = (-param3 + param16 << 16) / var35;
                  var23 = (-param12 + param0 << 16) / var34;
                  var24 = (param0 - param1 << 16) / var35;
                  var20 = (-param5 + param13 << 16) / var35;
                }
              } else {
                var22 = param1;
                var30 = param3;
                var27 = 0;
                var32 = 0;
                var18 = param5 << 16;
                var28 = 0;
                var17_int = param7 << 16;
                var23 = 0;
                var20 = 0;
                var24 = 0;
                var19 = 0;
                var31 = 0;
                var26 = param6;
                var25 = param14;
                var29 = param2;
                var21 = param12;
              }
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param9);
                var21 = var21 + param8 * var23;
                var25 = var25 + param8 * var27;
                var17_int = var17_int + var19 * param8;
                var29 = var29 + param8 * var31;
                var26 = var26 + var28 * param8;
                var22 = var22 + param8 * var24;
                var30 = var30 + var32 * param8;
                var18 = var18 + param8 * var20;
                param8 = 0;
              }
              var33 = 0;
            } else {
              var22 = param12 << 16;
              var21 = param12 << 16;
              var30 = param2 << 16;
              var29 = param2 << 16;
              var26 = param14 << 16;
              var25 = param14 << 16;
              var18 = param7 << 16;
              var17_int = param7 << 16;
              var35 = param9 - param8;
              var20 = (param13 - param7 << 16) / var34;
              var19 = (-param7 + param5 << 16) / var35;
              if (var20 <= var19) {
                var23 = (-param12 + param0 << 16) / var34;
                var27 = (-param14 + param15 << 16) / var34;
                var24 = (param1 - param12 << 16) / var35;
                var33 = 1;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (param3 - param2 << 16) / var35;
                var28 = (param6 - param14 << 16) / var35;
                var31 = (-param2 + param16 << 16) / var34;
              } else {
                var23 = (param1 - param12 << 16) / var35;
                var24 = (param0 - param12 << 16) / var34;
                var32 = (-param2 + param16 << 16) / var34;
                var27 = (-param14 + param6 << 16) / var35;
                var31 = (-param2 + param3 << 16) / var35;
                var33 = 0;
                var28 = (-param14 + param15 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (0 > param9) {
                  param8 = param9 - param8;
                  var30 = var30 + param8 * var32;
                  var25 = var25 + param8 * var27;
                  var22 = var22 + var24 * param8;
                  var26 = var26 + var28 * param8;
                  var29 = var29 + var31 * param8;
                  var18 = var18 + var20 * param8;
                  var21 = var21 + param8 * var23;
                  var17_int = var17_int + var19 * param8;
                  param8 = param9;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var29 = var29 + param8 * var31;
                  var25 = var25 + param8 * var27;
                  var26 = var26 + param8 * var28;
                  var22 = var22 + var24 * param8;
                  var30 = var30 + var32 * param8;
                  var18 = var18 + var20 * param8;
                  var21 = var21 + param8 * var23;
                  var17_int = var17_int + var19 * param8;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = bi.field_a[param8];
                while (param8 < param9) {
                  var37 = var17_int >> 16;
                  if (bi.field_c > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (bi.field_c <= var37 + var38) {
                        var38 = -1 + bi.field_c - var37;
                      }
                      if (var37 < 0) {
                        ha.a(var25 - var40 * var37, var36Lifetime2, var41, (byte) -114, var29 - var37 * var41, var39, var40, var38 + var37, param4, var21 - var39 * var37);
                      } else {
                        ha.a(var25, var37 + var36Lifetime2, var41, (byte) -121, var29, var39, var40, var38, param4, var21);
                      }
                    } else {
                      if (var37 >= 0 &&
                        bi.field_c > var37) {
                        ha.a(var25, var37 + var36Lifetime2, 0, (byte) -116, var29, 0, 0, var38, param4, var21);
                      }
                    }
                  }
                  param8++;
                  if (param8 >= bi.field_f) {
                    return;
                  }
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + em.field_l;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param9 + param10;
              if (var36Lifetime3 == 0) {
                var20 = 0;
                var27 = 0;
                var32 = 0;
                var31 = 0;
                var23 = 0;
                var19 = 0;
                var28 = 0;
                var24 = 0;
              } else {
                var37Lifetime2 = param13 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param15 << 16;
                var40Lifetime2 = param16 << 16;
                if (var33 != 0) {
                  var18 = param5 << 16;
                  var26 = param6 << 16;
                  var22 = param1 << 16;
                  var30 = param3 << 16;
                } else {
                  var25 = param6 << 16;
                  var17_int = param5 << 16;
                  var29 = param3 << 16;
                  var21 = param1 << 16;
                }
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var17_int = var17_int + var19 * param8;
              var25 = var25 + param8 * var27;
              var29 = var29 + param8 * var31;
              var21 = var21 + var23 * param8;
              var18 = var18 + var20 * param8;
              var26 = var26 + param8 * var28;
              var30 = var30 + var32 * param8;
              var22 = var22 + var24 * param8;
              param8 = 0;
            }
            var35Lifetime1 = bi.field_a[param8];
            while (param8 < param10) {
              var36Lifetime1 = var17_int >> 16;
              if (bi.field_c > var36Lifetime1) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (bi.field_c <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + (bi.field_c - var36Lifetime1);
                  }
                  if (var36Lifetime1 >= 0) {
                    ha.a(var25, var36Lifetime1 + var35Lifetime1, var40Lifetime1, (byte) -109, var29, var38Lifetime1, var39Lifetime1, var37Lifetime1, param4, var21);
                  } else {
                    ha.a(var25 - var39Lifetime1 * var36Lifetime1, var35Lifetime1, var40Lifetime1, (byte) -103, -(var40Lifetime1 * var36Lifetime1) + var29, var38Lifetime1, var39Lifetime1, var36Lifetime1 + var37Lifetime1, param4, -(var38Lifetime1 * var36Lifetime1) + var21);
                  }
                } else {
                  if (0 <= var36Lifetime1 &&
                    var36Lifetime1 < bi.field_c) {
                    ha.a(var25, var35Lifetime1 + var36Lifetime1, 0, (byte) -114, var29, 0, 0, var37Lifetime1, param4, var21);
                  }
                }
              }
              param8++;
              if (param8 >= bi.field_f) {
                return;
              }
              var35Lifetime1 = var35Lifetime1 + em.field_l;
              var17_int = var17_int + var19;
              var22 = var22 + var24;
              var30 = var30 + var32;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_81_0 = var17;
          stackIn_81_1 = new StringBuilder().append("va.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          try {
            wi.field_i = param0;
            try {
              if (param1 > -110) {
                field_b = 2L;
              }
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (0 == param0.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              sd.a((byte) -111, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            gl.a((byte) 15, param2);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "va.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fl a(byte param0) {
        int var2 = -2 / ((param0 - 48) / 32);
        fl var3 = this.field_a;
        if (var3 != this.field_c) {
          this.field_a = var3.field_j;
          return var3;
        }
        this.field_a = null;
        return null;
    }

    public va() {
        this.field_c = new fl();
        this.field_c.field_i = this.field_c;
        this.field_c.field_j = this.field_c;
    }

    final fl a(int param0) {
        fl var2 = this.field_c.field_j;
        if (var2 == this.field_c) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_j;
        if (param0 != 0) {
          field_b = 88L;
        }
        return var2;
    }

    static {
    }
}
