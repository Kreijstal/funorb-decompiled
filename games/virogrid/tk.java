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
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var3 = (hg) null;
                tk.a(34, (hg) null);
                break L1;
              }
            }
            L2: {
              if (1 != param1.c((byte) -78, 1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("tk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void a(int param0) {
        hg var2;
        if (param0 != 0) {
          var2 = (hg) null;
          tk.a(89, (hg) null);
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          field_d = null;
          return;
        }
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
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            StringBuilder stackIn_45_1 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            StringBuilder stackIn_48_1 = null;
            StringBuilder stackIn_49_1 = null;
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
            var10 = Virogrid.field_F ? 1 : 0;
            try {
              L0: {
                var5 = param0.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if ((var7_int ^ -1) > -1) {
                        break L2;
                      } else {
                        if (0 <= param3) {
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
                      if (0 <= var7_int) {
                        var6 = var7_int;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 < (var7_int ^ -1)) {
                        break L4;
                      } else {
                        if (param1 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L5;
                    } else {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    }
                  }
                  L7: {
                    var8 = -46 % ((-83 - param4) / 41);
                    var7 = new StringBuilder(var6);
                    discarded$0 = var7.append(var5.substring(0, var6));
                    if ((param3 ^ -1) >= -1) {
                      break L7;
                    } else {
                      discarded$1 = var7.append("/l=");
                      discarded$2 = var7.append(Integer.toString(param3));
                      break L7;
                    }
                  }
                  L8: {
                    if (param1 == null) {
                      break L8;
                    } else {
                      if (-1 > (param1.length() ^ -1)) {
                        discarded$3 = var7.append("/p=");
                        discarded$4 = var7.append(param1);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (param2 == null) {
                      break L9;
                    } else {
                      if (0 >= param2.length()) {
                        break L9;
                      } else {
                        discarded$5 = var7.append("/s=");
                        discarded$6 = var7.append(param2);
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var5.length() <= var6) {
                      discarded$7 = var7.append('/');
                      break L10;
                    } else {
                      discarded$8 = var7.append(var5.substring(var6, var5.length()));
                      break L10;
                    }
                  }
                  try {
                    L11: {
                      stackIn_37_0 = new java.net.URL(param0, var7.toString());
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var9 = (Exception) (Object) decompiledCaughtException;
                    var9.printStackTrace();
                    stackIn_39_0 = (java.net.URL) (param0);
                    return stackIn_39_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_42_0 = (RuntimeException) (var5_ref);

                stackIn_42_1 = new StringBuilder().append("tk.A(");

                if (param0 == null) {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L12;
                } else {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

                if (param1 == null) {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L13;
                } else {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

                if (param2 == null) {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "null";
                  break L14;
                } else {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackIn_49_2 = "{...}";
                  break L14;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_43_0), stackIn_49_2 + ',' + param3 + ',' + param4 + ')');
            }
            return stackIn_37_0;
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
