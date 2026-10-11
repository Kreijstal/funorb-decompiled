/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static da field_g;
    String field_d;
    boolean field_c;
    String[] field_a;
    boolean field_f;
    int field_b;
    static int field_e;

    final static void a(byte param0) {
        if (param0 != -128) {
          wg.a(false);
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
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
          java.net.URL stackIn_44_0 = null;
          java.net.URL stackIn_46_0 = null;
          RuntimeException stackIn_49_0 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          StringBuilder stackIn_55_1 = null;
          String stackIn_56_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = SolKnight.field_L ? 1 : 0;
          try {
            var5 = param4.getFile();
            if (param1 != -7362) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if ((0 <= var7_int) &&
                  (decompiledFrameRemainder0 = !(param3 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  decompiledFrameRemainder0 = !(0 <= var7_int);
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if ((var7_int >= 0) &&
                      (decompiledFrameRemainder0 = (param0 != null))) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5.regionMatches(var6, "/s=", 0, 3) ||
                      var5.regionMatches(var6, "/c=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        if (param2 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue;
                        }
                        var6 = var7_int;
                        continue;
                      }
                    }
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if (param3 > 0) {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param3));
                    }
                    if (param0 != null &&
                      param0.length() > 0) {
                      discarded$3 = var7.append("/p=");
                      discarded$4 = var7.append(param0);
                    }
                    if (param2 != null &&
                      0 < param2.length()) {
                      discarded$5 = var7.append("/s=");
                      discarded$6 = var7.append(param2);
                    }
                    if (var5.length() <= var6) {
                      discarded$7 = var7.append('/');
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                    }
                    try {
                      stackIn_44_0 = new java.net.URL(param4, var7.toString());
                      return stackIn_44_0;
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_46_0 = (java.net.URL) (param4);
                      return stackIn_46_0;
                    }
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_49_0 = var5_ref;
            stackIn_49_1 = new StringBuilder().append("wg.B(");
            if (param0 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_56_2 = "null";
            } else {
              stackIn_56_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od a(byte param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        od stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!l.a(param0 + 62, param3, param2, param1)) {
            stackIn_2_0 = null;
            return (od) (stackIn_2_0);
          }
          if (param0 != 47) {
            wg.a('￧', (byte) -104);
          }
          stackIn_6_0 = ea.e((byte) 113);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        }
        if (param1 <= -104) {
          if (gb.a(param0, 121)) {
            return true;
          }
          if (param0 != 45 &&
            param0 != 160 &&
            param0 != 32 &&
            param0 != 95) {
            return false;
          }
          return true;
        }
        field_e = 70;
        if (gb.a(param0, 121)) {
          return true;
        }
        if (param0 == 45) {
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        return false;
    }

    wg(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_g = null;
          return;
        }
        java.net.URL var2 = (java.net.URL) null;
        wg.a((String) null, -62, (String) null, -119, (java.net.URL) null);
        field_g = null;
    }

    static {
        field_e = -480;
    }
}
