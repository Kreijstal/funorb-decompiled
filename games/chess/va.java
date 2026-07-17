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
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            Object stackIn_3_0 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            Object stackOut_2_0 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            var9 = Chess.field_G;
            try {
              if (param1 == -148) {
                var5_ref = param2.getFile();
                var6 = 0;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int < 0) {
                          break L2;
                        } else {
                          if (0 > param3) {
                            break L1;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L0;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (var7_int < 0) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L0;
                        }
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 + 1);
                        if (var7_int >= 0) {
                          if (param0 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L0;
                          } else {
                            var6 = var7_int;
                            continue L0;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        if (param4 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      var7 = new StringBuilder(var6);
                      StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                      if (param3 > 0) {
                        StringBuilder discarded$10 = var7.append("/l=");
                        StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param0 == null) {
                        break L8;
                      } else {
                        if (param0.length() <= 0) {
                          break L8;
                        } else {
                          StringBuilder discarded$12 = var7.append("/p=");
                          StringBuilder discarded$13 = var7.append(param0);
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param4 == null) {
                        break L9;
                      } else {
                        if (param4.length() <= 0) {
                          break L9;
                        } else {
                          StringBuilder discarded$14 = var7.append("/s=");
                          StringBuilder discarded$15 = var7.append(param4);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var6 < var5_ref.length()) {
                        StringBuilder discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L10;
                      } else {
                        StringBuilder discarded$17 = var7.append(47);
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackOut_41_0 = new java.net.URL(param2, var7.toString());
                        stackIn_42_0 = stackOut_41_0;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_43_0 = (java.net.URL) param2;
                      stackIn_44_0 = stackOut_43_0;
                      return stackIn_44_0;
                    }
                    return stackIn_42_0;
                  }
                  var6 = var7_int;
                  continue L0;
                }
              } else {
                stackOut_2_0 = null;
                stackIn_3_0 = stackOut_2_0;
                return (java.net.URL) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) var5;
                stackOut_45_1 = new StringBuilder().append("va.B(");
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param0 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L12;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L12;
                }
              }
              L13: {
                stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44).append(param1).append(44);
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param2 == null) {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L13;
                } else {
                  stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                  stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L13;
                }
              }
              L14: {
                stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44).append(param3).append(44);
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L14;
                } else {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L14;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        return hh.a(-15024, param0) != null;
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static mh a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        mh stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 26447) {
              L1: {
                if (!pi.field_c.b((byte) 108)) {
                  break L1;
                } else {
                  if (param1.equals((Object) (Object) pi.field_c.a((byte) -91))) {
                    break L1;
                  } else {
                    pi.field_c = la.a(true, param1);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = pi.field_c;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("va.D(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
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
