/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rb {
    static String field_c;
    static String field_d;
    va[] field_b;
    static sd field_a;

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param1;
            int discarded$2 = -11133;
            stackOut_0_0 = dd.field_p.equals((Object) (Object) r.a(var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("rb.I(").append(false).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        va var5 = null;
        int var6 = TrackController.field_F ? 1 : 0;
        va[] var7 = ((rb) this).field_b;
        va[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (!(param1 >= var5.field_b.length)) {
                return var5.field_b[param1];
            }
            param1 = param1 - (var5.field_b.length - 1);
        }
        if (param0 != 111) {
            return 56;
        }
        return 0;
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-var4 + var2_int - 1] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("rb.B(").append(22479).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static String a(long param0, byte param1) {
        ki.field_e.setTime(new Date(param0));
        int var3 = ki.field_e.get(7);
        if (param1 > -95) {
            field_a = null;
        }
        int var4 = ki.field_e.get(5);
        int var5 = ki.field_e.get(2);
        int var6 = ki.field_e.get(1);
        int var7 = ki.field_e.get(11);
        int var8 = ki.field_e.get(12);
        int var9 = ki.field_e.get(13);
        return fg.field_b[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ej.field_f[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            if (param2 == 5) {
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (var5_int <= 0) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_15_0 = (param3 - param0 << 8) / var5_int;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if (var9 == 60) {
                      var6 = 1;
                      break L2;
                    } else {
                      if (var9 != 62) {
                        L3: {
                          if (var6 != 0) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L1;
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 14;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 12323) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((rb) this).field_b == null) {
              break L2;
            } else {
              if (((rb) this).field_b.length <= 0) {
                break L2;
              } else {
                stackOut_4_0 = -((rb) this).field_b[0].field_c + ((rb) this).field_b[-1 + ((rb) this).field_b.length].field_f;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        va var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          if (null == ((rb) this).field_b) {
            break L0;
          } else {
            if (((rb) this).field_b.length == 0) {
              break L0;
            } else {
              if (((rb) this).field_b[0].field_c <= param2) {
                if (((rb) this).field_b[-1 + ((rb) this).field_b.length].field_f >= param2) {
                  if (((rb) this).field_b.length != 1) {
                    if (!param1) {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (((rb) this).field_b.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = ((rb) this).field_b[var5];
                            if (param2 < var6.field_c) {
                              break L2;
                            } else {
                              if (var6.field_f >= param2) {
                                var7 = var6.b(param0, (byte) -85);
                                if (var7 == -1) {
                                  return -1;
                                } else {
                                  return var7 + var4;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_b.length);
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return ((rb) this).field_b[0].b(param0, (byte) -85);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    public static void b() {
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        va var4 = null;
        int var5 = TrackController.field_F ? 1 : 0;
        if (param1 != -36) {
            int discarded$0 = ((rb) this).c(65);
        }
        for (var3 = 0; ((rb) this).field_b.length > var3; var3++) {
            var4 = ((rb) this).field_b[var3];
            if (var4.field_b.length > param0) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_b.length);
        }
        return ((rb) this).field_b.length;
    }

    final int c(int param0) {
        int var2 = 0;
        va[] var3 = null;
        int var4 = 0;
        va var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var2 = param0;
          if (((rb) this).field_b != null) {
            var3 = ((rb) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(0);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This entry doesn't match";
        field_d = "Names cannot contain consecutive spaces";
    }
}
