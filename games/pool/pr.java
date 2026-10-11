/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr extends ma {
    int field_w;
    int field_A;
    int field_E;
    jg field_C;
    int field_G;
    static int field_l;
    int field_B;
    int field_y;
    g field_u;
    int field_s;
    int field_v;
    int field_m;
    int field_q;
    int field_z;
    int field_F;
    int field_t;
    int field_r;
    int field_D;
    nb field_o;
    int field_n;
    int field_p;
    kp field_x;

    final static void c(byte param0) {
        if (null != ta.field_h) {
          qf.field_d.a(ta.field_h);
        }
        ta.field_h = null;
        mp.field_R = null;
        int var1 = 107 / ((24 - param0) / 56);
        wm.field_Xb = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -23989) {
            return;
          }
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != td.a((byte) 52, var3)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("pr.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int[] param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        java.applet.Applet var7 = null;
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var6 = Pool.field_O;
        try {
          fo.field_c = new int[jd.field_h.length][5][3];
          var2_int = param0[9] >> 2;
          var3 = param0[10] >> 2;
          var4 = var2_int * var2_int + var3 * var3 >> 16;
          if (var4 <= 0) {
            var3 = 65536;
            var2_int = 0;
          } else {
            var5 = rf.a(var4, -127);
            var2_int = lh.a(var5, (byte) -81, (long)var2_int);
            var3 = lh.a(var5, (byte) -121, (long)var3);
          }
          if (param1) {
            var7 = (java.applet.Applet) null;
            pr.a(-15, (java.applet.Applet) null);
          }
          var2_int = var2_int >> 3;
          var3 = var3 >> 3;
          var8 = 0;
          var4Lifetime1 = var8;
          while (var8 < fo.field_c.length) {
            fo.field_c[var8][0][0] = var2_int;
            fo.field_c[var8][0][1] = var3;
            fo.field_c[var8][0][2] = jd.field_h[var8];
            fo.field_c[var8][1][0] = var2_int >> 1;
            fo.field_c[var8][1][1] = var3 >> 1;
            fo.field_c[var8][1][2] = jd.field_h[var8];
            fo.field_c[var8][2][0] = 0;
            fo.field_c[var8][2][1] = 0;
            fo.field_c[var8][2][2] = jd.field_h[var8];
            fo.field_c[var8][3][0] = -var2_int >> 1;
            fo.field_c[var8][3][1] = -var3 >> 1;
            fo.field_c[var8][3][2] = jd.field_h[var8];
            fo.field_c[var8][4][0] = -var2_int;
            fo.field_c[var8][4][1] = -var3;
            fo.field_c[var8][4][2] = jd.field_h[var8];
            ga.a(param0, fo.field_c[var8][0], false);
            ga.a(param0, fo.field_c[var8][1], param1);
            ga.a(param0, fo.field_c[var8][2], false);
            ga.a(param0, fo.field_c[var8][3], false);
            ga.a(param0, fo.field_c[var8][4], false);
            if (fo.field_c[var8][0][2] < 0) {
              fo.field_c[var8][0][1] = qh.field_f;
            }
            if (fo.field_c[var8][1][2] < 0) {
              fo.field_c[var8][1][1] = qh.field_f;
            }
            if (fo.field_c[var8][2][2] < 0) {
              fo.field_c[var8][2][1] = qh.field_f;
            }
            if (fo.field_c[var8][3][2] < 0) {
              fo.field_c[var8][3][1] = qh.field_f;
            }
            if (fo.field_c[var8][4][2] < 0) {
              fo.field_c[var8][4][1] = qh.field_f;
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("pr.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_u = null;
        if (param0 != 2) {
          this.a(-106);
        }
        this.field_x = null;
        this.field_C = null;
        this.field_o = null;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, byte param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_40_0 = null;
          java.net.URL stackIn_42_0 = null;
          RuntimeException stackIn_45_0 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          try {
            var5 = param1.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param0 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                decompiledFrameRemainder0 = !(var7_int >= 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param2 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param4 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var7 = new StringBuilder(var6);
                    if (param3 != 63) {
                      field_l = 117;
                    }
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param0 > 0) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param0));
                    }
                    if (param2 != null &&
                      param2.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param2);
                    }
                    if (param4 != null &&
                      0 < param4.length()) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param4);
                    }
                    if (var6 < var5.length()) {
                      discarded$7 = var7.append(var5.substring(var6, var5.length()));
                    } else {
                      discarded$8 = var7.append('/');
                    }
                    try {
                      stackIn_40_0 = new java.net.URL(param1, var7.toString());
                      return stackIn_40_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_42_0 = (java.net.URL) (param1);
                      return stackIn_42_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = var5_ref;
            stackIn_45_1 = new StringBuilder().append("pr.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
            if (param2 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    pr() {
    }

    static {
        field_l = 6348;
    }
}
