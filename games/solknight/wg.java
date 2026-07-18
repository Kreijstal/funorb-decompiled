/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class wg {
    static da field_g;
    String field_d;
    boolean field_c;
    String[] field_a;
    boolean field_f;
    int field_b;
    static int field_e;

    final static void a(byte param0) {
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            java.net.URL stackIn_45_0 = null;
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
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            java.net.URL stackOut_44_0 = null;
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
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            var9 = SolKnight.field_L ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        if (param0 == null) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                  L7: {
                    if (param0 == null) {
                      break L7;
                    } else {
                      if (param0.length() > 0) {
                        StringBuilder discarded$8 = var7.append("/p=");
                        StringBuilder discarded$9 = var7.append(param0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param2 == null) {
                      break L8;
                    } else {
                      if (0 >= param2.length()) {
                        break L8;
                      } else {
                        StringBuilder discarded$10 = var7.append("/s=");
                        StringBuilder discarded$11 = var7.append(param2);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5_ref.length() <= var6) {
                      StringBuilder discarded$12 = var7.append('/');
                      break L9;
                    } else {
                      StringBuilder discarded$13 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_42_0 = new java.net.URL(param4, var7.toString());
                      stackIn_43_0 = stackOut_42_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_44_0 = (java.net.URL) param4;
                    stackIn_45_0 = stackOut_44_0;
                    return stackIn_45_0;
                  }
                  return stackIn_43_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_46_0 = (RuntimeException) var5;
                stackOut_46_1 = new StringBuilder().append("wg.B(");
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param0 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L11;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L11;
                }
              }
              L12: {
                stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(-7362).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param2 == null) {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L12;
                } else {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L12;
                }
              }
              L13: {
                stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(-1).append(',');
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (param4 == null) {
                  stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                  stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                  stackOut_54_2 = "null";
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L13;
                } else {
                  stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                  stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                  stackOut_53_2 = "{...}";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L13;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od a(byte param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (l.a(109, param3, param2, param1)) {
              stackOut_3_0 = ea.e((byte) 113);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (od) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("wg.E(").append(47).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 <= -104) {
            if (!gb.a(param0, 121)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            field_e = 70;
            if (!gb.a(param0, 121)) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    wg(boolean param0) {
        ((wg) this).field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -480;
    }
}
