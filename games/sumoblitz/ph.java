/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static ri[] field_a;
    static qu field_b;
    static String field_d;
    private pj field_e;
    private ro field_g;
    private int field_f;
    static String field_h;
    private te field_c;

    final pj a(byte param0, long param1) {
        pj var4 = (pj) (this.field_c.a(param0 ^ -60, param1));
        if (param0 != -88) {
          this.a((byte) -122, 80L);
        }
        if (var4 != null) {
          this.field_g.a(var4, (byte) -114);
        }
        return var4;
    }

    final void a(long param0, pj param1, int param2) {
        pj var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (this.field_f != 0) {
            this.field_f = this.field_f - 1;
          } else {
            var5 = this.field_g.b((byte) 72);
            var5.b(false);
            var5.c(-5106);
            if (this.field_e == var5) {
              var5 = this.field_g.b((byte) 72);
              var5.b(false);
              var5.c(-5106);
            }
          }
          this.field_c.a(param1, -1, param0);
          if (param2 >= -114) {
            this.field_g = (ro) null;
          }
          this.field_g.a(param1, (byte) -109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ph.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1882049616) {
          return;
        }
        field_b = null;
        field_h = null;
        field_d = null;
        field_a = null;
    }

    final static void a(byte param0) {
        f.field_s = null;
        if (param0 > -77) {
          field_h = (String) null;
        }
        gf.field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, byte param14, int param15, int param16) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        var42 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param12 >= 0 &&
            param13 < nk.field_c) {
            if (param0 < 0 &&
              param9 < 0 &&
              param10 < 0) {
              return;
            }
            if (nk.field_i <= param0 &&
              nk.field_i <= param9 &&
              param10 >= nk.field_i) {
              return;
            }
            if (param14 != -48) {
              field_d = (String) null;
            }
            var34 = -param13 + param12;
            if (param13 == param16) {
              if (param13 == param12) {
                var29 = param6;
                var31 = 0;
                var26 = param8;
                var19 = 0;
                var18 = param9 << 16;
                var30 = param5;
                var28 = 0;
                var25 = param11;
                var24 = 0;
                var17_int = param0 << 16;
                var21 = param15;
                var27 = 0;
                var23 = 0;
                var32 = 0;
                var20 = 0;
                var22 = param7;
              } else {
                var35 = -param16 + param12;
                if (param0 >= param9) {
                  var27 = (param2 - param8 << 16) / var35;
                  var30 = param6 << 16;
                  var31 = (-param5 + param1 << 16) / var35;
                  var28 = (param2 - param11 << 16) / var34;
                  var23 = (param3 - param7 << 16) / var35;
                  var22 = param15 << 16;
                  var26 = param11 << 16;
                  var24 = (param3 - param15 << 16) / var34;
                  var18 = param0 << 16;
                  var21 = param7 << 16;
                  var32 = (param1 - param6 << 16) / var34;
                  var19 = (-param9 + param10 << 16) / var35;
                  var25 = param8 << 16;
                  var20 = (param10 - param0 << 16) / var34;
                  var17_int = param9 << 16;
                  var29 = param5 << 16;
                } else {
                  var21 = param15 << 16;
                  var31 = (param1 - param6 << 16) / var34;
                  var17_int = param0 << 16;
                  var28 = (param2 - param8 << 16) / var35;
                  var25 = param11 << 16;
                  var22 = param7 << 16;
                  var26 = param8 << 16;
                  var32 = (param1 - param5 << 16) / var35;
                  var24 = (param3 - param7 << 16) / var35;
                  var23 = (-param15 + param3 << 16) / var34;
                  var30 = param5 << 16;
                  var27 = (param2 - param11 << 16) / var34;
                  var20 = (-param9 + param10 << 16) / var35;
                  var18 = param9 << 16;
                  var29 = param6 << 16;
                  var19 = (-param0 + param10 << 16) / var34;
                }
              }
              var33 = 0;
              if (param13 < 0) {
                param13 = Math.min(-param13, -param13 + param16);
                var22 = var22 + param13 * var24;
                var21 = var21 + var23 * param13;
                var30 = var30 + param13 * var32;
                var17_int = var17_int + var19 * param13;
                var26 = var26 + param13 * var28;
                var18 = var18 + param13 * var20;
                var25 = var25 + var27 * param13;
                var29 = var29 + var31 * param13;
                param13 = 0;
              }
            } else {
              var30 = param6 << 16;
              var29 = param6 << 16;
              var22 = param15 << 16;
              var21 = param15 << 16;
              var26 = param11 << 16;
              var25 = param11 << 16;
              var18 = param0 << 16;
              var17_int = param0 << 16;
              var35 = -param13 + param16;
              var19 = (-param0 + param9 << 16) / var35;
              var20 = (param10 - param0 << 16) / var34;
              if (var19 >= var20) {
                var28 = (-param11 + param8 << 16) / var35;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
                var31 = (-param6 + param1 << 16) / var34;
                var27 = (-param11 + param2 << 16) / var34;
                var23 = (-param15 + param3 << 16) / var34;
                var32 = (param5 - param6 << 16) / var35;
                var24 = (-param15 + param7 << 16) / var35;
              } else {
                var27 = (-param11 + param8 << 16) / var35;
                var32 = (param1 - param6 << 16) / var34;
                var23 = (-param15 + param7 << 16) / var35;
                var28 = (-param11 + param2 << 16) / var34;
                var24 = (-param15 + param3 << 16) / var34;
                var31 = (-param6 + param5 << 16) / var35;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param13 < 0) {
                if (0 > param16) {
                  param13 = param16 - param13;
                  var25 = var25 + param13 * var27;
                  var21 = var21 + var23 * param13;
                  var22 = var22 + param13 * var24;
                  var30 = var30 + var32 * param13;
                  var29 = var29 + var31 * param13;
                  var18 = var18 + param13 * var20;
                  var17_int = var17_int + param13 * var19;
                  var26 = var26 + param13 * var28;
                  param13 = param16;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param13 = -param13;
                  var21 = var21 + param13 * var23;
                  var30 = var30 + var32 * param13;
                  var25 = var25 + var27 * param13;
                  var17_int = var17_int + var19 * param13;
                  var26 = var26 + var28 * param13;
                  var29 = var29 + param13 * var31;
                  var22 = var22 + var24 * param13;
                  var18 = var18 + param13 * var20;
                  param13 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = nk.field_d[param13];
                while (param13 < param16) {
                  var37 = var17_int >> 16;
                  if (var37 < nk.field_i) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (0 <= var37 &&
                        nk.field_i > var37) {
                        mn.a(0, 0, param4, var38, 0, var25, var21, var37 + var36Lifetime2, true, var29);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (nk.field_i <= var38 + var37) {
                        var38 = -var37 + (nk.field_i - 1);
                      }
                      if (0 > var37) {
                        mn.a(var40, var39, param4, var37 + var38, var41, var25 - var37 * var40, var21 - var39 * var37, var36Lifetime2, true, -(var37 * var41) + var29);
                      } else {
                        mn.a(var40, var39, param4, var38, var41, var25, var21, var37 + var36Lifetime2, true, var29);
                      }
                    }
                  }
                  param13++;
                  if (nk.field_c <= param13) {
                    return;
                  }
                  var29 = var29 + var31;
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var36Lifetime2 = var36Lifetime2 + lk.field_b;
                  var30 = var30 + var32;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                }
              }
              var36Lifetime3 = -param16 + param12;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param10 << 16;
                var38Lifetime2 = param3 << 16;
                var39Lifetime2 = param2 << 16;
                if (var33 != 0) {
                  var18 = param9 << 16;
                  var30 = param5 << 16;
                  var26 = param8 << 16;
                  var22 = param7 << 16;
                } else {
                  var25 = param8 << 16;
                  var17_int = param9 << 16;
                  var21 = param7 << 16;
                  var29 = param5 << 16;
                }
                var40Lifetime2 = param1 << 16;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
              } else {
                var27 = 0;
                var31 = 0;
                var20 = 0;
                var28 = 0;
                var19 = 0;
                var23 = 0;
                var32 = 0;
                var24 = 0;
              }
            }
            if (0 > param13) {
              param13 = -param13;
              var17_int = var17_int + param13 * var19;
              var21 = var21 + var23 * param13;
              var26 = var26 + param13 * var28;
              var29 = var29 + param13 * var31;
              var25 = var25 + var27 * param13;
              var18 = var18 + param13 * var20;
              var30 = var30 + param13 * var32;
              var22 = var22 + param13 * var24;
              param13 = 0;
            }
            var35Lifetime1 = nk.field_d[param13];
            while (param13 < param12) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < nk.field_i) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 == 0) {
                  if (var36Lifetime1 >= 0 &&
                    nk.field_i > var36Lifetime1) {
                    mn.a(0, 0, param4, var37Lifetime1, 0, var25, var21, var35Lifetime1 + var36Lifetime1, true, var29);
                  }
                } else {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (var26 - var25) / var37Lifetime1;
                  var40Lifetime1 = (-var29 + var30) / var37Lifetime1;
                  if (nk.field_i <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + (nk.field_i - var36Lifetime1);
                  }
                  if (var36Lifetime1 >= 0) {
                    mn.a(var39Lifetime1, var38Lifetime1, param4, var37Lifetime1, var40Lifetime1, var25, var21, var35Lifetime1 + var36Lifetime1, true, var29);
                  } else {
                    mn.a(var39Lifetime1, var38Lifetime1, param4, var36Lifetime1 + var37Lifetime1, var40Lifetime1, var25 - var39Lifetime1 * var36Lifetime1, var21 - var38Lifetime1 * var36Lifetime1, var35Lifetime1, true, var29 - var40Lifetime1 * var36Lifetime1);
                  }
                }
              }
              param13++;
              if (param13 >= nk.field_c) {
                return;
              }
              var29 = var29 + var31;
              var26 = var26 + var28;
              var25 = var25 + var27;
              var30 = var30 + var32;
              var21 = var21 + var23;
              var35Lifetime1 = var35Lifetime1 + lk.field_b;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var17_int = var17_int + var19;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_76_0 = var17;
          stackIn_76_1 = new StringBuilder().append("ph.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    ph(int param0) {
        int var2 = 0;
        this.field_e = new pj();
        this.field_g = new ro();
        this.field_f = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_c = new te(var2);
    }

    static {
        field_h = "Username: ";
        field_d = "You have <%0> unread messages!";
    }
}
