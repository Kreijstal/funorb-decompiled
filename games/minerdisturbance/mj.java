/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends pi {
    static int[] field_n;
    static fj field_o;
    int field_r;
    static int field_p;
    int field_q;

    final static void a(boolean param0, bj param1, int param2, bj param3, bj param4) {
        wm.field_f = al.a(-10218, "");
        if (param2 < 34) {
          return;
        }
        try {
          wm.field_f.a(false, false);
          jf.a(param1, param3, (byte) 18, param4);
          im.a((byte) 79);
          bd.field_h = mc.field_t;
          ic.field_l = mc.field_t;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "mj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -96) {
          return;
        }
        field_o = null;
        field_n = null;
    }

    final static java.net.URL a(String param0, int param1, boolean param2, String param3, java.net.URL param4) {
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
          java.net.URL stackIn_3_0 = null;
          java.net.URL stackIn_43_0 = null;
          java.net.URL stackIn_45_0 = null;
          RuntimeException stackIn_48_0 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          StringBuilder stackIn_54_1 = null;
          String stackIn_55_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = MinerDisturbance.field_ab;
          try {
            var5 = param4.getFile();
            var6 = 0;
            if (param2) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if ((0 <= var7_int) &&
                  (decompiledFrameRemainder0 = !(param1 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
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
                      if ((var7_int >= 0) &&
                        (decompiledFrameRemainder0 = (param0 != null))) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param1 > 0) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param1));
                      }
                      if (param3 != null &&
                        param3.length() > 0) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param3);
                      }
                      if (param0 != null &&
                        param0.length() > 0) {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param0);
                      }
                      if (var6 < var5.length()) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                      } else {
                        discarded$8 = var7.append('/');
                      }
                      try {
                        stackIn_43_0 = new java.net.URL(param4, var7.toString());
                        return stackIn_43_0;
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_45_0 = (java.net.URL) (param4);
                        return stackIn_45_0;
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
            stackIn_48_0 = var5_ref;
            stackIn_48_1 = new StringBuilder().append("mj.C(");
            if (param0 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
            if (param4 == null) {
              stackIn_55_2 = "null";
            } else {
              stackIn_55_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private mj() throws Throwable {
        throw new Error();
    }

    static {
        field_n = new int[8192];
    }
}
