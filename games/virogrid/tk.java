/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static ml[] field_c;
    static rm[] field_d;
    static qh field_b;
    static String field_a;

    final static boolean a(int param0, hg param1) {
        RuntimeException var2 = null;
        hg var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var3 = (hg) null;
            tk.a(34, (hg) null);
          }
          stackIn_5_0 = (1 == param1.c((byte) -78, 1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("tk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
        hg var2 = (hg) null;
        tk.a(89, (hg) null);
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static java.net.URL a(java.net.URL param0, String param1, String param2, int param3, byte param4) {
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
          java.net.URL stackIn_37_0 = null;
          java.net.URL stackIn_39_0 = null;
          RuntimeException stackIn_42_0 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          StringBuilder stackIn_45_1 = null;
          String stackIn_46_2 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          int var8 = 0;
          Exception var9 = null;
          int var10 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var10 = Virogrid.field_F ? 1 : 0;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (0 <= param3) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime1) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime2 >= 0) {
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime3 >= 0) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
            var8 = -46 % ((-83 - param4) / 41);
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param3 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param3));
            }
            if (param1 != null &&
              param1.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param1);
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
              stackIn_37_0 = new java.net.URL(param0, var7.toString());
              return stackIn_37_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (Exception) (Object) decompiledCaughtException;
              var9.printStackTrace();
              stackIn_39_0 = (java.net.URL) (param0);
              return stackIn_39_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_42_0 = var5_ref;
            stackIn_42_1 = new StringBuilder().append("tk.A(");
            if (param0 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
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
            throw kg.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Game options";
    }
}
