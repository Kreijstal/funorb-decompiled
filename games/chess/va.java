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
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_3_0 = null;
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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_2_0 = null;
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
              L0: {
                if (param1 == -148) {
                  var5_ref = param2.getFile();
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                          var7_int = var5_ref.indexOf('/', var6 - -1);
                          if (-1 < (var7_int ^ -1)) {
                            break L3;
                          } else {
                            if (0 > param3) {
                              break L2;
                            } else {
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              continue L1;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                          break L4;
                        } else {
                          var7_int = var5_ref.indexOf('/', var6 - -1);
                          if (var7_int < 0) {
                            break L4;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        }
                      }
                      L5: {
                        if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                          var7_int = var5_ref.indexOf('/', var6 + 1);
                          if (-1 >= (var7_int ^ -1)) {
                            if (param0 != null) {
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              continue L1;
                            } else {
                              var6 = var7_int;
                              continue L1;
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                            break L7;
                          } else {
                            if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7_int = var5_ref.indexOf('/', var6 + 1);
                        if ((var7_int ^ -1) <= -1) {
                          if (param4 == null) {
                            break L2;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        var7 = new StringBuilder(var6);
                        discarded$9 = var7.append(var5_ref.substring(0, var6));
                        if (-1 > (param3 ^ -1)) {
                          discarded$10 = var7.append("/l=");
                          discarded$11 = var7.append(Integer.toString(param3));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (param0 == null) {
                          break L9;
                        } else {
                          if (param0.length() <= 0) {
                            break L9;
                          } else {
                            discarded$12 = var7.append("/p=");
                            discarded$13 = var7.append(param0);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param4 == null) {
                          break L10;
                        } else {
                          if ((param4.length() ^ -1) >= -1) {
                            break L10;
                          } else {
                            discarded$14 = var7.append("/s=");
                            discarded$15 = var7.append(param4);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var6 < var5_ref.length()) {
                          discarded$16 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                          break L11;
                        } else {
                          discarded$17 = var7.append('/');
                          break L11;
                        }
                      }
                      try {
                        L12: {
                          stackOut_41_0 = new java.net.URL(param2, var7.toString());
                          stackIn_42_0 = stackOut_41_0;
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackOut_43_0 = (java.net.URL) (param2);
                        stackIn_44_0 = stackOut_43_0;
                        return stackIn_44_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                    var6 = var7_int;
                    continue L1;
                  }
                } else {
                  stackOut_2_0 = (java.net.URL) null;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_45_0 = (RuntimeException) (var5);
                stackOut_45_1 = new StringBuilder().append("va.B(");
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param0 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L13;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L13;
                }
              }
              L14: {
                stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',');
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (param2 == null) {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "null";
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L14;
                } else {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "{...}";
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L14;
                }
              }
              L15: {
                stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param3).append(',');
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param4 == null) {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L15;
                } else {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L15;
                }
              }
              throw fk.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_42_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -19554) {
                break L1;
              } else {
                field_c = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (hh.a(-15024, param0) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("va.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mh stackOut_6_0 = null;
        mh stackOut_1_0 = null;
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
                  if (param1.equals(pi.field_c.a((byte) -91))) {
                    break L1;
                  } else {
                    pi.field_c = la.a(true, param1);
                    break L1;
                  }
                }
              }
              stackOut_6_0 = pi.field_c;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (mh) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("va.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_e = "Scamming";
        field_c = new String[]{"menu_select", "chess_01_place_piece_large", "chess_02_place_piece_med", "chess_03_place_piece_small", "chess_04_select_piece", "chess_05_deselect_piece", "chess_06_illegal_move", "chess_07_queening _fanfare-L", "chess_08_take_piece", "chess_09_game_win", "chess_10_game_loose", "chess_11_coin_spin", "chess_07_queening _fanfare-R"};
        field_b = "Show private chat from my friends and opponents";
    }
}
