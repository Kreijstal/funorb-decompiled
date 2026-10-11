/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static String field_b;
    static ci field_d;
    static String field_e;
    static String[] field_c;
    static int field_a;

    final static java.net.URL a(String param0, int param1, java.net.URL param2, int param3, String param4) {
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
          var9 = Chess.field_G;
          try {
            if (param1 != -148) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            var5 = param2.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(0 > param3))) {
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
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                    var6 = var7_int;
                    continue;
                  }
                }
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
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("va.B(");
            if (param0 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -19554) {
            field_c = (String[]) null;
          }
          stackIn_5_0 = (hh.a(-15024, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("va.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != 121) {
          return;
        }
        field_e = null;
    }

    final static mh a(int param0, String param1) {
        RuntimeException var2 = null;
        mh stackIn_2_0 = null;
        mh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 26447) {
            stackIn_2_0 = (mh) null;
            return stackIn_2_0;
          }
          if (pi.field_c.b((byte) 108) &&
            !param1.equals(pi.field_c.a((byte) -91))) {
            pi.field_c = la.a(true, param1);
          }
          stackIn_7_0 = pi.field_c;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("va.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_e = "Scamming";
        field_c = new String[]{"menu_select", "chess_01_place_piece_large", "chess_02_place_piece_med", "chess_03_place_piece_small", "chess_04_select_piece", "chess_05_deselect_piece", "chess_06_illegal_move", "chess_07_queening _fanfare-L", "chess_08_take_piece", "chess_09_game_win", "chess_10_game_loose", "chess_11_coin_spin", "chess_07_queening _fanfare-R"};
        field_b = "Show private chat from my friends and opponents";
    }
}
