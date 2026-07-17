/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class vj {
    static er[] field_b;
    static nj field_d;
    static int field_c;
    static int[] field_f;
    static boolean field_h;
    static String field_a;
    static String field_e;
    static fe[] field_g;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 <= param9) {
          if (param9 >= param15) {
            if (param0 < param15) {
              pq.a(param14, param10, param8, param9, param7, param3, param4, param0, param5, param12, param13, param6, param11, bi.field_l, true, param2, param15);
              return;
            } else {
              pq.a(param10, param14, param11, param9, param7, param12, param2, param15, param5, param3, param13, param6, param8, bi.field_l, true, param4, param0);
              return;
            }
          } else {
            pq.a(param14, param6, param8, param15, param12, param3, param13, param0, param11, param7, param4, param10, param5, bi.field_l, true, param2, param9);
            return;
          }
        } else {
          if (param15 <= param0) {
            if (param15 <= param9) {
              pq.a(param10, param6, param11, param0, param3, param12, param13, param15, param8, param7, param2, param14, param5, bi.field_l, true, param4, param9);
              return;
            } else {
              pq.a(param6, param10, param5, param0, param3, param7, param4, param9, param8, param12, param2, param14, param11, bi.field_l, true, param13, param15);
              return;
            }
          } else {
            pq.a(param6, param14, param5, param15, param12, param7, param2, param9, param11, param3, param4, param10, param8, bi.field_l, true, param13, param0);
            return;
          }
        }
    }

    public static void a() {
        field_b = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_e = null;
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
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
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                var3 = null;
                String discarded$2 = vj.a((CharSequence) null, (byte) -56);
                break L1;
              }
            }
            L2: {
              var2 = eq.a(0, kq.a((byte) 85, param0));
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("vj.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    final static java.net.URL a(int param0, String param1, int param2, String param3, java.net.URL param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_35_0 = null;
            java.net.URL stackIn_37_0 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_34_0 = null;
            java.net.URL stackOut_36_0 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            String stackOut_42_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            var9 = Vertigo2.field_L ? 1 : 0;
            try {
              var5_ref = param4.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    break L1;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 + 1);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L2: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param3 != null) {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L5;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param1 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
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
                  StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                  if (param3 == null) {
                    break L6;
                  } else {
                    if (param3.length() > 0) {
                      StringBuilder discarded$8 = var7.append("/p=");
                      StringBuilder discarded$9 = var7.append(param3);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (param1 == null) {
                    break L7;
                  } else {
                    if (0 >= param1.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/s=");
                      StringBuilder discarded$11 = var7.append(param1);
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var6 < var5_ref.length()) {
                    StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$13 = var7.append(47);
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_34_0 = new java.net.URL(param4, var7.toString());
                    stackIn_35_0 = stackOut_34_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_36_0 = (java.net.URL) param4;
                  stackIn_37_0 = stackOut_36_0;
                  return stackIn_37_0;
                }
                return stackIn_35_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_38_0 = (RuntimeException) var5;
                stackOut_38_1 = new StringBuilder().append("vj.D(").append(-1).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param1 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L10;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L10;
                }
              }
              L11: {
                stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(44).append(-116).append(44);
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (param3 == null) {
                  stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
                  stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
                  stackOut_43_2 = "null";
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L11;
                } else {
                  stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
                  stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
                  stackOut_42_2 = "{...}";
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L11;
                }
              }
              L12: {
                stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(44);
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param4 == null) {
                  stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                  stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L12;
                } else {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L12;
                }
              }
              throw wn.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 < -32) {
              L1: {
                if (null != vd.field_b) {
                  vd.field_b.field_V.a(param1, -1546);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (null != lj.field_m) {
                lj.field_m.field_K.a(param1, -1546);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("vj.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Send private message";
        field_a = "Waiting for extra data";
    }
}
