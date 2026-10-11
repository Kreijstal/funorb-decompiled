/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends ai {
    static String[] field_l;
    static tg field_j;
    static String field_i;
    static int field_g;
    static int field_h;
    static String field_k;

    private bi() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_l = null;
        field_j = null;
        field_i = null;
        if (param0) {
          field_j = (tg) null;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            ac.a(true, new Object[]{new Integer(param1)}, vi.b(param0 ^ param0), "resizing");
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, int param2, String param3, String param4) {
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
          int var9 = 0;
          var9 = Bounce.field_N;
          try {
            var5 = param0.getFile();
            var6 = 0;
            if (param1 >= -6) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param2 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = (param3 != null))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/s=", 0, 3) ||
                  var5.regionMatches(var6, "/c=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((0 <= var7_int) &&
                    (decompiledFrameRemainder0 = (param4 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (0 < param2) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param2));
                  }
                  if (param3 != null &&
                    param3.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param3);
                  }
                  if (param4 != null &&
                    param4.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param4);
                  }
                  if (var6 < var5.length()) {
                    discarded$7 = var7.append(var5.substring(var6, var5.length()));
                  } else {
                    discarded$8 = var7.append('/');
                  }
                  try {
                    stackIn_40_0 = new java.net.URL(param0, var7.toString());
                    return stackIn_40_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_42_0 = (java.net.URL) (param0);
                    return stackIn_42_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_45_0 = var5_ref;
            stackIn_45_1 = new StringBuilder().append("bi.B(");
            if (param0 == null) {
              stackIn_46_2 = "null";
            } else {
              stackIn_46_2 = "{...}";
            }
            stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
            if (param4 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = new tg(540, 140);
        field_k = "Log in";
        field_i = "Just play";
    }
}
