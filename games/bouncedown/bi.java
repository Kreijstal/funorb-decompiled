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
              L0: {
                ac.a(true, new Object[]{new Integer(param1)}, vi.b(param0 ^ param0), "resizing");
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
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            StringBuilder stackIn_48_1 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            StringBuilder stackIn_51_1 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            int decompiledRegionSelector0 = 0;
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
              L0: {
                var5 = param0.getFile();
                var6 = 0;
                if (param1 < -6) {
                  L1: while (true) {
                    L2: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (0 > var7_int) {
                          break L2;
                        } else {
                          if ((param2 ^ -1) <= -1) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
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
                        if (var5.regionMatches(var6, "/p=", 0, 3)) {
                          var7_int = var5.indexOf('/', 1 + var6);
                          if (-1 < (var7_int ^ -1)) {
                            break L5;
                          } else {
                            if (param3 == null) {
                              break L4;
                            } else {
                              var5 = var5.substring(0, var6) + var5.substring(var7_int);
                              continue L1;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (var5.regionMatches(var6, "/s=", 0, 3)) {
                            break L7;
                          } else {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (0 <= var7_int) {
                          if (param4 == null) {
                            break L4;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L6;
                        }
                      }
                      L8: {
                        var7 = new StringBuilder(var6);
                        discarded$0 = var7.append(var5.substring(0, var6));
                        if (0 < param2) {
                          discarded$1 = var7.append("/l=");
                          discarded$2 = var7.append(Integer.toString(param2));
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
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param3);
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
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param4);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var6 < var5.length()) {
                          discarded$7 = var7.append(var5.substring(var6, var5.length()));
                          break L11;
                        } else {
                          discarded$8 = var7.append('/');
                          break L11;
                        }
                      }
                      try {
                        L12: {
                          stackIn_40_0 = new java.net.URL(param0, var7.toString());
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_42_0 = (java.net.URL) (param0);
                        return stackIn_42_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                    var6 = var7_int;
                    continue L1;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_45_0 = (RuntimeException) (var5_ref);

                stackIn_45_1 = new StringBuilder().append("bi.B(");

                if (param0 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L13;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L14;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

                if (param4 == null) {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "null";
                  break L15;
                } else {
                  stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackIn_52_2 = "{...}";
                  break L15;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_46_0), stackIn_52_2 + ')');
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
