/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends RuntimeException {
    static String field_a;
    String field_c;
    static String field_d;
    static long field_e;
    Throwable field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            var3 = (String) null;
            ec.a(89, (String) null, (java.net.URL) null, (String) null, 112);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (ra.a(var4, 119) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ec.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(jb param0, int param1) {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 1;
          if (da.field_e != param0 &&
            da.field_e.field_e > 0) {
            var2_int = var2_int != 0 & da.field_e.a(false) ? 1 : 0;
          }
          if (null != hh.field_d &&
            hh.field_d != param0 &&
            0 < hh.field_d.field_e) {
            var2_int = var2_int != 0 & hh.field_d.a(false) ? 1 : 0;
          }
          if (null != bg.field_a &&
            param0 != bg.field_a &&
            bg.field_a.field_e > 0) {
            var2_int = var2_int != 0 & bg.field_a.a(false) ? 1 : 0;
          }
          if (param1 != 0) {
            return;
          }
          if (ji.field_e != null &&
            param0 != ji.field_e &&
            ji.field_e.field_e > 0) {
            var2_int = var2_int != 0 & ji.field_e.a(false) ? 1 : 0;
          }
          if (null != va.field_b &&
            va.field_b != param0 &&
            va.field_b.field_e > 0) {
            var2_int = var2_int != 0 & va.field_b.a(false) ? 1 : 0;
          }
          if (var2_int != 0) {
            if (param0 != null &&
              param0.field_e < 14) {
              param0.field_e = param0.field_e + 1;
            }
            if (param0 != null &&
              param0.field_e > 14) {
              param0.field_e = param0.field_e - 1;
            }
          }
          if (null != bg.field_a &&
            !kc.field_o &&
            bg.field_a.field_e == 0) {
            bg.field_a = null;
          }
          if (null != ji.field_e &&
            !bj.field_m &&
            ji.field_e.field_e == 0) {
            ji.field_e = null;
          }
          if (va.field_b != null &&
            !gh.field_k &&
            va.field_b.field_e == 0) {
            va.field_b = null;
          }
          if (null != hh.field_d &&
            !qf.field_e) {
            if (hh.field_d.field_e != 0) {
              return;
            }
            hh.field_d = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("ec.D(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 3) {
          ec.a((byte) -71);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        im.a((byte) -77);
        if (param0 == 126) {
          jd.field_c = true;
          rk.field_f = true;
          vg.field_Z.g((byte) 109);
          r.a((byte) 97, false, wc.field_jc);
          return;
        }
        String var2 = (String) null;
        ec.a(19, (String) null, (java.net.URL) null, (String) null, -53);
        jd.field_c = true;
        rk.field_f = true;
        vg.field_Z.g((byte) 109);
        r.a((byte) 97, false, wc.field_jc);
    }

    final static java.net.URL a(int param0, String param1, java.net.URL param2, String param3, int param4) {
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
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = Confined.field_J ? 1 : 0;
          try {
            var5 = param2.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((0 <= var7_int) &&
                  (decompiledFrameRemainder0 = !(param0 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(var7_int >= 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param3 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5.regionMatches(var6, "/s=", 0, 3) ||
                      var5.regionMatches(var6, "/c=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((0 <= var7_int) &&
                        (decompiledFrameRemainder0 = (param1 != null))) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param0 > 0) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param0));
                      }
                      if (param3 != null &&
                        param3.length() > 0) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param3);
                      }
                      if (param1 != null &&
                        0 < param1.length()) {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param1);
                      }
                      if (var5.length() <= var6) {
                        discarded$7 = var7.append('/');
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      }
                      if (param4 != -1) {
                        ec.a((byte) -10);
                      }
                      try {
                        stackIn_42_0 = new java.net.URL(param2, var7.toString());
                        return stackIn_42_0;
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_44_0 = (java.net.URL) (param2);
                        return stackIn_44_0;
                      }
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("ec.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param2 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param3 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ec(Throwable param0, String param1) {
        this.field_b = param0;
        this.field_c = param1;
    }

    static {
        field_d = "Loading...";
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
