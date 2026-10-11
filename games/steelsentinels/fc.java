/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static int field_d;
    static boolean[] field_e;
    static String field_f;
    static tb field_a;
    static String field_c;
    static int[][] field_b;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          return;
        }
        field_b = (int[][]) null;
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final static boolean a(cm param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -48) {
            field_c = (String) null;
          }
          stackIn_3_0 = param0.a(25);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fc.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(mn param0, int param1) {
        try {
          param0.field_F = new char[]{(char)63};
          param0.field_A = new int[]{-1};
          int var2_int = -47 / ((param1 - 27) / 61);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "fc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static pc a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        if (qj.field_q == null) {
          var3 = -3 % ((param0 + 20) / 47);
          return null;
        }
        if (qj.field_q[param1] == null) {
          var3Lifetime1 = -3 % ((param0 + 20) / 47);
          return null;
        }
        if (param2 == -1) {
          return fl.a((byte) 41, qj.field_q[param1], cm.field_e[param1]);
        }
        var3Lifetime2 = 0;
        if (fk.field_i != null) {
          var3Lifetime2 = fk.field_i.d(true, param2) - 320;
          var4 = Math.max(64, -(192 * Math.abs(var3Lifetime2) / 1280) + 256);
          var4 = cm.field_e[param1] * var4 / 256;
          var5 = Math.max(0, Math.min(256, var3Lifetime2 / 10 + 128));
          return fg.a(var4, var5, 248, qj.field_q[param1]);
        }
        if (null != si.field_A) {
          var3Lifetime2 = -320 + si.field_A.d(true, param2);
          var4Lifetime1 = Math.max(64, -(192 * Math.abs(var3Lifetime2) / 1280) + 256);
          var4Lifetime1 = cm.field_e[param1] * var4Lifetime1 / 256;
          var5Lifetime1 = Math.max(0, Math.min(256, var3Lifetime2 / 10 + 128));
          return fg.a(var4Lifetime1, var5Lifetime1, 248, qj.field_q[param1]);
        }
        var4Lifetime2 = Math.max(64, -(192 * Math.abs(var3Lifetime2) / 1280) + 256);
        var4Lifetime2 = cm.field_e[param1] * var4Lifetime2 / 256;
        var5Lifetime2 = Math.max(0, Math.min(256, var3Lifetime2 / 10 + 128));
        return fg.a(var4Lifetime2, var5Lifetime2, 248, qj.field_q[param1]);
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3, int param4) {
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
          var9 = SteelSentinels.obfuscationControl;
          try {
            var5 = param1.getFile();
            var6 = 0;
            if (param0 != -19571) {
              fc.a(false);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param4 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    var6 = var7_int;
                    continue;
                  }
                }
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
                    if (var7_int >= 0) {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param4 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param4));
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param2);
                  }
                  if (param3 != null &&
                    param3.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param3);
                  }
                  if (var6 < var5.length()) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  try {
                    stackIn_43_0 = new java.net.URL(param1, var7.toString());
                    return stackIn_43_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_45_0 = (java.net.URL) (param1);
                    return stackIn_45_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_48_0 = var5_ref;
            stackIn_48_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
            if (param2 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
            if (param3 == null) {
              stackIn_55_2 = "null";
            } else {
              stackIn_55_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static e a(byte param0, String[] param1) {
        e var2 = null;
        RuntimeException var2_ref = null;
        mn var3 = null;
        e stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -76) {
            var3 = (mn) null;
            fc.a((mn) null, 110);
          }
          var2 = new e(false);
          var2.field_c = param1;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("fc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_e = new boolean[112];
        field_f = "Play rated game";
        field_d = 22;
        field_c = "SPACE";
    }
}
