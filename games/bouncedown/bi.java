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
            Object discarded$1 = null;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                discarded$1 = ac.a(true, new Object[]{new Integer(param1)}, vi.b(param0 ^ param0), "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, int param2, String param3, String param4) {
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
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            java.net.URL stackOut_41_0 = null;
            java.net.URL stackOut_2_0 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            var9 = Bounce.field_N;
            try {
              L0: {
                var5_ref = param0.getFile();
                var6 = 0;
                if (param1 < -6) {
                  L1: while (true) {
                    L2: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (0 > var7_int) {
                          break L2;
                        } else {
                          if ((param2 ^ -1) <= -1) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
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
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (var7_int < 0) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                          var7_int = var5_ref.indexOf('/', 1 + var6);
                          if (-1 < (var7_int ^ -1)) {
                            break L5;
                          } else {
                            if (param3 == null) {
                              break L4;
                            } else {
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              continue L1;
                            }
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
                            if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (0 <= var7_int) {
                          if (param4 == null) {
                            break L4;
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
                        if (0 < param2) {
                          discarded$10 = var7.append("/l=");
                          discarded$11 = var7.append(Integer.toString(param2));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (param3 == null) {
                          break L9;
                        } else {
                          if (-1 <= (param3.length() ^ -1)) {
                            break L9;
                          } else {
                            discarded$12 = var7.append("/p=");
                            discarded$13 = var7.append(param3);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (param4 == null) {
                          break L10;
                        } else {
                          if (param4.length() <= 0) {
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
                          stackOut_39_0 = new java.net.URL(param0, var7.toString());
                          stackIn_40_0 = stackOut_39_0;
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackOut_41_0 = (java.net.URL) (param0);
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
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
                stackOut_43_0 = (RuntimeException) (var5);
                stackOut_43_1 = new StringBuilder().append("bi.B(");
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L13;
                } else {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L13;
                }
              }
              L14: {
                stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param3 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L14;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L14;
                }
              }
              L15: {
                stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param4 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L15;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L15;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_40_0;
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
