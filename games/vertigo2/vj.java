/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static er[] field_b;
    static nj field_d;
    static int field_c;
    static int[] field_f;
    static boolean field_h;
    static String field_a;
    static String field_e;
    static fe[] field_g;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 > param9) {
          if (param15 <= param0) {
            if (param15 > param9) {
              pq.a(param6, param10, param5, param0, param3, param7, param4, param9, param8, param12, param2, param14, param11, bi.field_l, true, param13, param15);
              if (param1 != -122) {
                field_d = (nj) null;
                return;
              }
              return;
            }
            pq.a(param10, param6, param11, param0, param3, param12, param13, param15, param8, param7, param2, param14, param5, bi.field_l, true, param4, param9);
            if (param1 != -122) {
              field_d = (nj) null;
              return;
            }
            return;
          }
          pq.a(param6, param14, param5, param15, param12, param7, param2, param9, param11, param3, param4, param10, param8, bi.field_l, true, param13, param0);
          if (param1 != -122) {
            field_d = (nj) null;
            return;
          }
          return;
        }
        if (param9 < param15) {
          pq.a(param14, param6, param8, param15, param12, param3, param13, param0, param11, param7, param4, param10, param5, bi.field_l, true, param2, param9);
          if (param1 != -122) {
            field_d = (nj) null;
            return;
          }
          return;
        }
        if (param0 < param15) {
          pq.a(param14, param10, param8, param9, param7, param3, param4, param0, param5, param12, param13, param6, param11, bi.field_l, true, param2, param15);
          if (param1 != -122) {
            field_d = (nj) null;
            return;
          }
          return;
        }
        pq.a(param10, param14, param11, param9, param7, param12, param2, param15, param5, param3, param13, param6, param8, bi.field_l, true, param4, param0);
        if (param1 != -122) {
          field_d = (nj) null;
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 != -11590) {
          CharSequence var2 = (CharSequence) null;
          vj.a((CharSequence) null, (byte) 1);
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8) {
            var3 = (CharSequence) null;
            vj.a((CharSequence) null, (byte) -56);
          }
          var2 = eq.a(0, kq.a((byte) 85, param0));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("vj.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, String param3, java.net.URL param4) {
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
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = Vertigo2.field_L ? 1 : 0;
          try {
            var5 = param4.getFile();
            var6 = 0;
            if (param2 > -112) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param0 < 0) {
                    var6 = var7_int;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime2) {
                  if (param3 != null) {
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
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
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
            if (var6 < var5.length()) {
              discarded$7 = var7.append(var5.substring(var6, var5.length()));
            } else {
              discarded$8 = var7.append('/');
            }
            try {
              stackIn_42_0 = new java.net.URL(param4, var7.toString());
              return stackIn_42_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_44_0 = (java.net.URL) (param4);
              return stackIn_44_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("vj.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -32) {
            return;
          }
          if (null != vd.field_b) {
            vd.field_b.field_V.a(param1, -1546);
          }
          if (null == lj.field_m) {
            return;
          }
          lj.field_m.field_K.a(param1, -1546);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("vj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_e = "Send private message";
        field_a = "Waiting for extra data";
    }
}
