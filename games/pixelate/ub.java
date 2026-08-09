/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static int field_a;

    final static String a(String param0, int param1, String param2, char param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (0 != var7) {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param0.indexOf((int) param3, var8_int);
                  if ((var8_int ^ -1) <= -1) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = param1;
            L3: while (true) {
              var10 = param0.indexOf((int) param3, var9);
              if (0 > var10) {
                discarded$0 = var8.append(param0.substring(var9));
                stackIn_11_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param0.substring(var9, var10));
                discarded$2 = var8.append(param2);
                var9 = var10 - -1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ub.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3, int param4) {
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
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                var5 = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        if (0 <= param4) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (0 <= var7_int) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (param2 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 >= (var7_int ^ -1)) {
                        if (param3 == null) {
                          break L3;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if (param0 <= -40) {
                        break L8;
                      } else {
                        field_a = -31;
                        break L8;
                      }
                    }
                    L9: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param4 <= 0) {
                        break L9;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param4));
                        break L9;
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if (-1 > (param2.length() ^ -1)) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param3 == null) {
                        break L11;
                      } else {
                        if ((param3.length() ^ -1) >= -1) {
                          break L11;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param3);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L12;
                      } else {
                        discarded$8 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackIn_42_0 = new java.net.URL(param1, var7.toString());
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_44_0 = (java.net.URL) (param1);
                      return stackIn_44_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("ub.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

                if (param2 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L15;
                }
              }
              L16: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

                if (param3 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L16;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L16;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ',' + param4 + ')');
            }
            return stackIn_42_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
