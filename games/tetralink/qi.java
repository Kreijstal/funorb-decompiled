/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends mc {
    int field_t;
    static hl field_n;
    int field_y;
    int field_w;
    int field_r;
    int field_x;
    int field_s;
    static int field_q;
    static a field_u;
    static a field_p;
    int field_v;
    static String field_o;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
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
        var19 = TetraLink.field_J;
        try {
          if (0 <= param5 &&
            param7 < vn.field_n) {
            if (param1 < 0 &&
              param3 < 0 &&
              param0 < 0) {
              return;
            }
            if (param1 >= vn.field_k &&
              vn.field_k <= param3 &&
              vn.field_k <= param0) {
              return;
            }
            var14 = param5 - param7;
            if (param7 == param4) {
              if (param5 != param7) {
                var15 = -param4 + param5;
                if (param1 < param3) {
                  var11 = (param0 - param1 << 16) / var14;
                  var12 = (param0 - param3 << 16) / var15;
                  var10 = param3 << 16;
                  var9_int = param1 << 16;
                } else {
                  var11 = (param0 - param3 << 16) / var15;
                  var10 = param1 << 16;
                  var12 = (param0 - param1 << 16) / var14;
                  var9_int = param3 << 16;
                }
              } else {
                var12 = 0;
                var11 = 0;
                var9_int = param1 << 16;
                var10 = param3 << 16;
              }
              if (param7 < 0) {
                param7 = Math.min(-param7, param4 - param7);
                var9_int = var9_int + var11 * param7;
                var10 = var10 + var12 * param7;
                param7 = 0;
              }
              var13 = 0;
            } else {
              var10 = param1 << 16;
              var9_int = param1 << 16;
              var15 = -param7 + param4;
              var12 = (-param1 + param0 << 16) / var14;
              var11 = (-param1 + param3 << 16) / var15;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (0 > param4) {
                  param7 = param4 - param7;
                  var9_int = var9_int + var11 * param7;
                  var10 = var10 + param7 * var12;
                  param7 = param4;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var10 = var10 + param7 * var12;
                  var9_int = var9_int + var11 * param7;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = vn.field_h[param7];
                while (param4 > param7) {
                  var17 = var9_int >> 16;
                  if (var17 < vn.field_k) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (var18 + var17 >= vn.field_k) {
                        var18 = -var17 + vn.field_k - 1;
                      }
                      if (var17 < 0) {
                        mh.a(param6, param8, param2 - 98, var17 + var18, var16Lifetime2);
                      } else {
                        mh.a(param6, param8, 0, var18, var17 + var16Lifetime2);
                      }
                    } else {
                      if (0 <= var17 &&
                        vn.field_k > var17) {
                        mh.a(param6, param8, 0, var18, var16Lifetime2 + var17);
                      }
                    }
                  }
                  param7++;
                  if (vn.field_n <= param7) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ra.field_f;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = -param4 + param5;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param3 << 16;
                } else {
                  var9_int = param3 << 16;
                }
                var17Lifetime2 = param0 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param7 < 0) {
              param7 = -param7;
              var10 = var10 + param7 * var12;
              var9_int = var9_int + param7 * var11;
              param7 = 0;
            }
            var15Lifetime1 = vn.field_h[param7];
            if (param2 != 98) {
              field_q = 100;
            }
            while (param5 > param7) {
              var16Lifetime1 = var9_int >> 16;
              if (vn.field_k > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (0 != var17Lifetime1) {
                  if (vn.field_k <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = -var16Lifetime1 + vn.field_k - 1;
                  }
                  if (var16Lifetime1 >= 0) {
                    mh.a(param6, param8, 0, var17Lifetime1, var16Lifetime1 + var15Lifetime1);
                  } else {
                    mh.a(param6, param8, param2 ^ 98, var16Lifetime1 + var17Lifetime1, var15Lifetime1);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < vn.field_k) {
                    mh.a(param6, param8, param2 - 98, var17Lifetime1, var16Lifetime1 + var15Lifetime1);
                  }
                }
              }
              param7++;
              if (param7 >= vn.field_n) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + ra.field_f;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("qi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void b(byte param0) {
        gg.c((byte) 43);
        rm.a(1731);
        if (param0 != -98) {
          int[] var2 = (int[]) null;
          qi.a(66, -36, (byte) 110, 18, -22, -126, (int[]) null, 17, -86);
        }
        mm.field_y = null;
        go.c((byte) 42);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            bm.field_s = param0;
            try {
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param0.length() != 0) {
                var5Lifetime6 = var7 + "; Expires=" + ei.a((byte) 2, 94608000000L + k.a(0)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ii.a(-19149, "document.cookie=\"" + var5Lifetime6 + "\"", param2);
              if (param1 != -7011) {
                field_n = (hl) null;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            q.a(param2, param1 + 7075);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref;
            stackIn_12_1 = new StringBuilder().append("qi.A(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_n = null;
        field_o = null;
        field_p = null;
        if (param0 != 19381) {
          field_u = (a) null;
        }
    }

    qi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_w = param5;
        this.field_s = param6;
        this.field_y = param2;
        this.field_t = param0;
        this.field_x = param3;
        this.field_r = param4;
        this.field_v = param1;
    }

    static {
        field_u = new a();
        field_o = "Please enter your age in years";
    }
}
