/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends qb {
    int field_j;
    static String field_g;
    qb field_i;
    li field_h;

    public static void a(int param0) {
        if (param0 != 1159353185) {
            field_g = (String) null;
        }
        field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Main.field_T;
        try {
          L0: {
            L1: while (true) {
              param7--;
              if ((param7 ^ -1) > -1) {
                L2: {
                  if (param3 == 8355711) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var17 = param6;
                var10 = var17;
                var11 = param0;
                var12 = param2;
                var13 = param1;
                var14 = param4;
                var15 = 8355711 & var17[var11] >> -1726087775;
                var10[var11] = var15 - -(bc.a(var12, 33423360) >> 1159353185) + ((bc.a(var13, 33423391) >> 1029062761) + bc.a(var14 >> -2029655855, 255));
                param2 = param2 + param8;
                param4 = param4 + param9;
                param0++;
                param1 = param1 + param5;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var10_ref);

            stackIn_8_1 = new StringBuilder().append("gi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = gi.a(124, param2);
            if (param1 < -122) {
              if (0 != (param0.indexOf(param2) ^ -1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (0 == (param0.indexOf(var3) ^ -1)) {
                  L1: {
                    L2: {
                      if (param0.startsWith(param2)) {
                        break L2;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L2;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L2;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackIn_15_0 = 0;
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    stackIn_15_0 = 1;
                    break L1;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("gi.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            if (param0 > 89) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_8_0 = new String(var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[-var4 + var2_int - 1] = param1.charAt(var4);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("gi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    gi(li param0, qb param1) {
        try {
            this.field_h = param0;
            this.field_j = param0.g();
            this.field_i = param1;
            this.field_h.f(this.field_j * mf.field_i / 80);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        L0: {
          var17 = Main.field_T;
          if (param9 == 0) {
            break L0;
          } else {
            field_g = (String) null;
            break L0;
          }
        }
        L1: {
          if (param10 > param7) {
            if (param10 >= param11) {
              if (param11 > param7) {
                e.a(param7, param4, param6, param0, param15, param13, param5, vj.field_j, param11, param14, param12, param10, (byte) 88, param1, param3, param8, param2);
                break L1;
              } else {
                e.a(param11, param0, param13, param4, param3, param6, param5, vj.field_j, param7, param14, param2, param10, (byte) 96, param1, param15, param8, param12);
                break L1;
              }
            } else {
              e.a(param7, param4, param6, param5, param15, param14, param0, vj.field_j, param10, param13, param12, param11, (byte) 104, param3, param1, param2, param8);
              break L1;
            }
          } else {
            if (param7 < param11) {
              e.a(param10, param5, param14, param4, param1, param6, param0, vj.field_j, param7, param13, param8, param11, (byte) 13, param3, param15, param2, param12);
              break L1;
            } else {
              if (param10 < param11) {
                e.a(param10, param5, param14, param0, param1, param13, param4, vj.field_j, param11, param6, param8, param7, (byte) 62, param15, param3, param12, param2);
                break L1;
              } else {
                e.a(param11, param0, param13, param5, param3, param14, param4, vj.field_j, param10, param6, param2, param7, (byte) 83, param15, param1, param12, param8);
                break L1;
              }
            }
          }
        }
    }

    static {
        field_g = "Email is valid";
    }
}
