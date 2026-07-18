/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ub {
    static int field_a;

    final static String a(String param0, int param1, String param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
                  if (var8_int >= 0) {
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
                StringBuilder discarded$3 = var8.append(param0.substring(var9));
                stackOut_10_0 = var8.toString();
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                StringBuilder discarded$4 = var8.append(param0.substring(var9, var10));
                StringBuilder discarded$5 = var8.append(param2);
                var9 = var10 - -1;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ub.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, String param3) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_36_0 = null;
            java.net.URL stackIn_38_0 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_35_0 = null;
            java.net.URL stackOut_37_0 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            var9 = Pixelate.field_H ? 1 : 0;
            try {
              var5_ref = param1.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      break L2;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      break L3;
                    } else {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param2 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
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
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      if (param3 == null) {
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
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    if (param2 == null) {
                      break L7;
                    } else {
                      if (param2.length() > 0) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param2);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param3 == null) {
                      break L8;
                    } else {
                      if (param3.length() <= 0) {
                        break L8;
                      } else {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param3);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() > var6) {
                      StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append('/');
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_35_0 = new java.net.URL(param1, var7.toString());
                      stackIn_36_0 = stackOut_35_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_37_0 = (java.net.URL) param1;
                    stackIn_38_0 = stackOut_37_0;
                    return stackIn_38_0;
                  }
                  return stackIn_36_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_39_0 = (RuntimeException) var5;
                stackOut_39_1 = new StringBuilder().append("ub.B(").append(-102).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param1 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L11;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L11;
                }
              }
              L12: {
                stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
                stackIn_44_0 = stackOut_42_0;
                stackIn_44_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (param2 == null) {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "null";
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  break L12;
                } else {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "{...}";
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  break L12;
                }
              }
              L13: {
                stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param3 == null) {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L13;
                } else {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L13;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + -1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
