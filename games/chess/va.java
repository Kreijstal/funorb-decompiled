/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class va {
    static String field_b;
    static ci field_d;
    static String field_e;
    static String[] field_c;
    static int field_a;

    final static java.net.URL a(String param0, int param1, java.net.URL param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_47_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_46_0 = null;
            var9 = Chess.field_G;
            if (param1 == -148) {
              var5 = param2.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (-1 < (var7_int ^ -1)) {
                      break L1;
                    } else {
                      if (0 > param3) {
                        var6 = var7_int;
                        continue L0;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (-1 >= (var7_int ^ -1)) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int ^ -1) <= -1) {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                  if (-1 > (param3 ^ -1)) {
                    StringBuilder discarded$14 = var7.append("/l=");
                    StringBuilder discarded$15 = var7.append(Integer.toString(param3));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param0 != null) {
                    if (param0.length() > 0) {
                      StringBuilder discarded$16 = var7.append("/p=");
                      StringBuilder discarded$17 = var7.append(param0);
                      if (param4 == null) {
                        break L7;
                      } else {
                        if ((param4.length() ^ -1) >= -1) {
                          break L7;
                        } else {
                          StringBuilder discarded$18 = var7.append("/s=");
                          StringBuilder discarded$19 = var7.append(param4);
                          break L7;
                        }
                      }
                    } else {
                      if (param4 == null) {
                        break L7;
                      } else {
                        if ((param4.length() ^ -1) >= -1) {
                          break L7;
                        } else {
                          StringBuilder discarded$20 = var7.append("/s=");
                          StringBuilder discarded$21 = var7.append(param4);
                          break L7;
                        }
                      }
                    }
                  } else {
                    if (param4 == null) {
                      break L7;
                    } else {
                      if ((param4.length() ^ -1) >= -1) {
                        break L7;
                      } else {
                        StringBuilder discarded$22 = var7.append("/s=");
                        StringBuilder discarded$23 = var7.append(param4);
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (var6 < var5.length()) {
                    StringBuilder discarded$24 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$25 = var7.append(47);
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_46_0 = new java.net.URL(param2, var7.toString());
                    stackIn_47_0 = stackOut_46_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  return param2;
                }
                return stackIn_47_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -19554) {
          L0: {
            field_c = null;
            if (hh.a(-15024, param0) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (hh.a(-15024, param0) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
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
        if (param0 == 26447) {
          if (pi.field_c.b((byte) 108)) {
            if (param1.equals((Object) (Object) pi.field_c.a((byte) -91))) {
              return pi.field_c;
            } else {
              pi.field_c = la.a(true, param1);
              return pi.field_c;
            }
          } else {
            return pi.field_c;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Scamming";
        field_c = new String[]{"menu_select", "chess_01_place_piece_large", "chess_02_place_piece_med", "chess_03_place_piece_small", "chess_04_select_piece", "chess_05_deselect_piece", "chess_06_illegal_move", "chess_07_queening _fanfare-L", "chess_08_take_piece", "chess_09_game_win", "chess_10_game_loose", "chess_11_coin_spin", "chess_07_queening _fanfare-R"};
        field_b = "Show private chat from my friends and opponents";
    }
}
