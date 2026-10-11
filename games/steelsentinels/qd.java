/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    int field_w;
    int field_s;
    static de field_o;
    int field_k;
    String field_v;
    boolean field_u;
    int field_r;
    int field_i;
    int field_m;
    int field_e;
    int field_b;
    int field_n;
    int field_f;
    nk field_d;
    int field_q;
    static int[] field_t;
    int field_j;
    int field_p;
    int field_l;
    static dj field_h;
    static int field_g;
    static String field_a;
    static String field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int[] param15, int param16) {
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
        int var37 = 0;
        int var43 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var41Lifetime1;
        int var37Lifetime2;
        int var37Lifetime3;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        int var41Lifetime2;
        var43 = SteelSentinels.field_G;
        try {
          if (param13 >= 0 &&
            param1 < lf.field_h) {
            if (0 > param4 &&
              param10 < 0 &&
              param3 < 0) {
              return;
            }
            if (param4 >= lf.field_g &&
              lf.field_g <= param10 &&
              lf.field_g <= param3) {
              return;
            }
            var28 = 95 % ((47 - param12) / 45);
            var35 = param13 - param1;
            if (param8 == param1) {
              if (param1 != param13) {
                var36 = -param8 + param13;
                if (param10 <= param4) {
                  var17_int = param10 << 16;
                  var21 = param11 << 16;
                  var23 = (param2 - param11 << 16) / var36;
                  var26 = param6 << 16;
                  var20 = (-param4 + param3 << 16) / var35;
                  var18 = param4 << 16;
                  var27 = (param5 - param7 << 16) / var36;
                  var32 = (-param9 + param14 << 16) / var36;
                  var29 = (-param6 + param5 << 16) / var35;
                  var24 = (-param0 + param2 << 16) / var35;
                  var30 = param9 << 16;
                  var25 = param7 << 16;
                  var22 = param0 << 16;
                  var19 = (param3 - param10 << 16) / var36;
                  var31 = param16 << 16;
                  var33 = (param14 - param16 << 16) / var35;
                } else {
                  var24 = (param2 - param11 << 16) / var36;
                  var23 = (-param0 + param2 << 16) / var35;
                  var21 = param0 << 16;
                  var18 = param10 << 16;
                  var19 = (param3 - param4 << 16) / var35;
                  var27 = (param5 - param6 << 16) / var35;
                  var26 = param7 << 16;
                  var22 = param11 << 16;
                  var33 = (param14 - param9 << 16) / var36;
                  var20 = (param3 - param10 << 16) / var36;
                  var31 = param9 << 16;
                  var32 = (-param16 + param14 << 16) / var35;
                  var29 = (param5 - param7 << 16) / var36;
                  var30 = param16 << 16;
                  var17_int = param4 << 16;
                  var25 = param6 << 16;
                }
              } else {
                var30 = param16;
                var32 = 0;
                var21 = param0;
                var23 = 0;
                var33 = 0;
                var18 = param10 << 16;
                var25 = param6;
                var20 = 0;
                var26 = param7;
                var24 = 0;
                var22 = param11;
                var17_int = param4 << 16;
                var31 = param9;
                var29 = 0;
                var19 = 0;
                var27 = 0;
              }
              if (0 > param1) {
                param1 = Math.min(-param1, -param1 + param8);
                var17_int = var17_int + param1 * var19;
                var21 = var21 + var23 * param1;
                var18 = var18 + var20 * param1;
                var31 = var31 + param1 * var33;
                var26 = var26 + var29 * param1;
                var25 = var25 + var27 * param1;
                var30 = var30 + var32 * param1;
                var22 = var22 + param1 * var24;
                param1 = 0;
              }
              var34 = 0;
            } else {
              var22 = param0 << 16;
              var21 = param0 << 16;
              var18 = param4 << 16;
              var17_int = param4 << 16;
              var31 = param16 << 16;
              var30 = param16 << 16;
              var26 = param6 << 16;
              var25 = param6 << 16;
              var36 = param8 - param1;
              var19 = (-param4 + param10 << 16) / var36;
              var20 = (param3 - param4 << 16) / var35;
              if (var20 <= var19) {
                var23 = (param2 - param0 << 16) / var35;
                var24 = (-param0 + param11 << 16) / var36;
                var27 = (param5 - param6 << 16) / var35;
                var29 = (-param6 + param7 << 16) / var36;
                var32 = (-param16 + param14 << 16) / var35;
                var37 = var19;
                var19 = var20;
                var20 = var37;
                var33 = (param9 - param16 << 16) / var36;
                var34 = 1;
              } else {
                var32 = (-param16 + param9 << 16) / var36;
                var23 = (-param0 + param11 << 16) / var36;
                var29 = (-param6 + param5 << 16) / var35;
                var24 = (-param0 + param2 << 16) / var35;
                var34 = 0;
                var33 = (param14 - param16 << 16) / var35;
                var27 = (-param6 + param7 << 16) / var36;
              }
              boolean decompiledFrameRemainder0 = true;
              if (0 > param1) {
                if (param8 < 0) {
                  param1 = -param1 + param8;
                  var31 = var31 + param1 * var33;
                  var17_int = var17_int + param1 * var19;
                  var26 = var26 + var29 * param1;
                  var22 = var22 + param1 * var24;
                  var21 = var21 + param1 * var23;
                  var30 = var30 + var32 * param1;
                  var18 = var18 + var20 * param1;
                  var25 = var25 + var27 * param1;
                  param1 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param1 = -param1;
                  var18 = var18 + var20 * param1;
                  var30 = var30 + param1 * var32;
                  var26 = var26 + param1 * var29;
                  var25 = var25 + var27 * param1;
                  var31 = var31 + param1 * var33;
                  var17_int = var17_int + var19 * param1;
                  var22 = var22 + param1 * var24;
                  var21 = var21 + param1 * var23;
                  param1 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var37Lifetime2 = lf.field_c[param1];
                while (param1 < param8) {
                  var38 = var17_int >> 16;
                  if (var38 < lf.field_g) {
                    var39 = (var18 >> 16) - (var17_int >> 16);
                    if (var39 == 0) {
                      if (var38 >= 0 &&
                        lf.field_g > var38) {
                        lc.a(0, var21, var30, -75, 0, var37Lifetime2 + var38, param15, var39, var25, 0);
                      }
                    } else {
                      var40 = (var22 - var21) / var39;
                      var41 = (var26 - var25) / var39;
                      var42 = (var31 - var30) / var39;
                      if (lf.field_g <= var38 + var39) {
                        var39 = -1 + lf.field_g - var38;
                      }
                      if (0 <= var38) {
                        lc.a(var41, var21, var30, 113, var42, var37Lifetime2 + var38, param15, var39, var25, var40);
                      } else {
                        lc.a(var41, -(var40 * var38) + var21, var30 - var42 * var38, -47, var42, var37Lifetime2, param15, var38 + var39, var25 - var41 * var38, var40);
                      }
                    }
                  }
                  param1++;
                  if (lf.field_h <= param1) {
                    return;
                  }
                  var22 = var22 + var24;
                  var31 = var31 + var33;
                  var26 = var26 + var29;
                  var21 = var21 + var23;
                  var17_int = var17_int + var19;
                  var30 = var30 + var32;
                  var37Lifetime2 = var37Lifetime2 + pb.field_c;
                  var18 = var18 + var20;
                  var25 = var25 + var27;
                }
              }
              var37Lifetime3 = param13 - param8;
              if (var37Lifetime3 == 0) {
                var24 = 0;
                var20 = 0;
                var29 = 0;
                var23 = 0;
                var19 = 0;
                var32 = 0;
                var27 = 0;
                var33 = 0;
              } else {
                var38Lifetime2 = param3 << 16;
                var39Lifetime2 = param2 << 16;
                var40Lifetime2 = param5 << 16;
                var41Lifetime2 = param14 << 16;
                if (var34 == 0) {
                  var30 = param9 << 16;
                  var25 = param7 << 16;
                  var17_int = param10 << 16;
                  var21 = param11 << 16;
                } else {
                  var22 = param11 << 16;
                  var31 = param9 << 16;
                  var18 = param10 << 16;
                  var26 = param7 << 16;
                }
                var32 = (var41Lifetime2 - var30) / var37Lifetime3;
                var29 = (-var26 + var40Lifetime2) / var37Lifetime3;
                var19 = (var38Lifetime2 - var17_int) / var37Lifetime3;
                var24 = (-var22 + var39Lifetime2) / var37Lifetime3;
                var23 = (var39Lifetime2 - var21) / var37Lifetime3;
                var33 = (var41Lifetime2 - var31) / var37Lifetime3;
                var20 = (-var18 + var38Lifetime2) / var37Lifetime3;
                var27 = (-var25 + var40Lifetime2) / var37Lifetime3;
              }
            }
            if (0 > param1) {
              param1 = -param1;
              var31 = var31 + var33 * param1;
              var22 = var22 + param1 * var24;
              var30 = var30 + var32 * param1;
              var17_int = var17_int + param1 * var19;
              var21 = var21 + var23 * param1;
              var18 = var18 + var20 * param1;
              var26 = var26 + var29 * param1;
              var25 = var25 + param1 * var27;
              param1 = 0;
            }
            var36Lifetime1 = lf.field_c[param1];
            while (param1 < param13) {
              var37Lifetime1 = var17_int >> 16;
              if (lf.field_g > var37Lifetime1) {
                var38Lifetime1 = (var18 >> 16) - (var17_int >> 16);
                if (0 == var38Lifetime1) {
                  if (var37Lifetime1 >= 0 &&
                    lf.field_g > var37Lifetime1) {
                    lc.a(0, var21, var30, -43, 0, var36Lifetime1 + var37Lifetime1, param15, var38Lifetime1, var25, 0);
                  }
                } else {
                  var39Lifetime1 = (-var21 + var22) / var38Lifetime1;
                  var40Lifetime1 = (var26 - var25) / var38Lifetime1;
                  var41Lifetime1 = (var31 - var30) / var38Lifetime1;
                  if (var38Lifetime1 + var37Lifetime1 >= lf.field_g) {
                    var38Lifetime1 = -var37Lifetime1 + lf.field_g - 1;
                  }
                  if (var37Lifetime1 >= 0) {
                    lc.a(var40Lifetime1, var21, var30, -32, var41Lifetime1, var37Lifetime1 + var36Lifetime1, param15, var38Lifetime1, var25, var39Lifetime1);
                  } else {
                    lc.a(var40Lifetime1, -(var37Lifetime1 * var39Lifetime1) + var21, -(var41Lifetime1 * var37Lifetime1) + var30, 116, var41Lifetime1, var36Lifetime1, param15, var37Lifetime1 + var38Lifetime1, var25 - var37Lifetime1 * var40Lifetime1, var39Lifetime1);
                  }
                }
              }
              param1++;
              if (lf.field_h <= param1) {
                return;
              }
              var21 = var21 + var23;
              var26 = var26 + var29;
              var25 = var25 + var27;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var30 = var30 + var32;
              var17_int = var17_int + var19;
              var36Lifetime1 = var36Lifetime1 + pb.field_c;
              var31 = var31 + var33;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_80_0 = var17;
          stackIn_80_1 = new StringBuilder().append("qd.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param16).append(')').toString());
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, false);
    }

    final static boolean a(boolean param0) {
        int var2 = 0;
        ua var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ua var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          var4 = (ua) (rg.field_d.e(13058));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (!param0) {
            field_c = (String) null;
          }
          for (var2 = 0; var1.field_B > var2; var2++) {
            if (var4.field_y[var2] != null &&
              0 == var4.field_y[var2].field_a) {
              return false;
            }
            if (var4.field_K[var2] != null &&
              0 == var4.field_K[var2].field_a) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "qd.C(" + param0 + ')');
        }
    }

    qd(int param0, int param1, int param2, int param3, nk param4) {
        this(param0, param1, param2, param3, param4, false);
    }

    public static void a(byte param0) {
        field_o = null;
        field_c = null;
        if (param0 != 17) {
          field_t = (int[]) null;
        }
        field_h = null;
        field_a = null;
        field_t = null;
    }

    private final void a(byte param0, boolean param1, qd param2) {
        try {
          this.field_w = param2.field_w;
          this.field_p = param2.field_p;
          this.field_i = param2.field_i;
          if (param0 != 121) {
            this.field_u = false;
          }
          this.field_v = param2.field_v;
          this.field_q = param2.field_q;
          this.field_r = param2.field_r;
          this.field_s = param2.field_s;
          this.field_e = param2.field_e;
          this.field_b = param2.field_b;
          this.field_n = param2.field_n;
          if (param2.field_d != null) {
            this.field_d = new nk(param2.field_d, param1);
          } else {
            this.field_d = null;
          }
          this.field_u = param2.field_u;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qd.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qd(qd param0, boolean param1) {
        try {
          this.a((byte) 121, param1, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        dd var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var4 = 59 / ((param1 - 1) / 57);
        ah var3 = ic.a(param0, 18, param2);
        dd var5Lifetime1;
        if (var3 != null) {
          an.field_i.a(false, (byte) -87);
          var5 = an.field_i;
          var6_ref_String = cb.field_d;
          var5.field_j.a(2, 5, var6_ref_String);
          var5Lifetime1 = an.field_i;
          var6 = oa.field_S;
          var7 = rj.field_j;
          var5Lifetime1.field_j.a(0, 0, var7, (byte) -101, var6);
        }
        eh.a(param2, -1, param0);
    }

    qd(int param0, int param1, int param2, int param3, nk param4, boolean param5) {
        try {
          this.field_r = param1;
          this.field_d = param4;
          this.field_i = param3;
          this.field_s = param0;
          this.field_u = param5 ? true : false;
          this.field_n = param2;
          this.field_q = -1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    qd(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        this.field_r = param1;
        this.field_s = param0;
        this.field_d = null;
        this.field_u = param5 ? true : false;
        this.field_n = param2;
        this.field_i = param3;
        this.field_q = param4;
    }

    qd(String param0) {
        try {
          this.field_q = -1;
          this.field_v = param0;
          this.field_d = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    qd(int param0, int param1, int param2) {
        this.field_d = null;
        this.field_p = param1;
        this.field_q = -1;
        this.field_e = param0;
    }

    qd(int param0, int param1) {
        this.field_w = param0;
        this.field_q = -1;
        this.field_d = null;
        this.field_b = param1;
    }

    qd(int param0) {
        this.field_q = -1;
    }

    static {
        field_t = new int[]{6559605, 16752640, 65280};
        field_o = new de("email");
        field_h = new dj(0);
        field_g = 0;
        field_c = ", and plummeted like a stalled brick";
    }
}
