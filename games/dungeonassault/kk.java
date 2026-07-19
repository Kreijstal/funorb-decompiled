/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends ne {
    of[] field_n;
    static gp field_l;
    static String field_s;
    byte[] field_p;
    private int[] field_q;
    static String field_i;
    va[] field_k;
    int field_j;
    short[] field_r;
    byte[] field_m;
    static String field_t;
    byte[] field_o;

    final static boolean d(int param0) {
        if (param0 != 0) {
            field_l = (gp) null;
        }
        return sl.b(15000);
    }

    final boolean a(byte param0, lc param1, int[] param2, byte[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 1;
            if (param0 == 45) {
              var6 = 0;
              var7 = null;
              var8 = 0;
              L1: while (true) {
                if (-129 >= (var8 ^ -1)) {
                  stackOut_22_0 = var5_int;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param3 == null) {
                      break L2;
                    } else {
                      if (-1 != (param3[var8] ^ -1)) {
                        break L2;
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    var9 = this.field_q[var8];
                    if (-1 != (var9 ^ -1)) {
                      L4: {
                        if (var6 == var9) {
                          break L4;
                        } else {
                          L5: {
                            var6 = var9;
                            var9--;
                            if (-1 == (1 & var9 ^ -1)) {
                              var7 = param1.a(param2, var9 >> -548155134, -31164);
                              break L5;
                            } else {
                              var7 = param1.a(param2, (byte) -97, var9 >> -944245278);
                              break L5;
                            }
                          }
                          if (var7 != null) {
                            break L4;
                          } else {
                            var5_int = 0;
                            break L4;
                          }
                        }
                      }
                      if (var7 != null) {
                        this.field_k[var8] = (va) (var7);
                        this.field_q[var8] = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final void a(byte param0) {
        this.field_q = null;
        if (param0 != -97) {
            kk.a(95);
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_t = null;
        field_s = null;
        if (param0 != 0) {
            field_s = (String) null;
        }
        field_l = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param3 == 48) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            var4_int = param0.length();
            var5 = param1.length();
            var6 = param2.length();
            if (var5 == 0) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L2: {
                var7 = var4_int;
                var8 = var6 - var5;
                if (var8 == 0) {
                  break L2;
                } else {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param0.indexOf(param1, var9_int);
                    if (0 > var9_int) {
                      break L2;
                    } else {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L3;
                    }
                  }
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param0.indexOf(param1, var10);
                if (0 > var11) {
                  discarded$3 = var9.append(param0.substring(var10));
                  stackOut_13_0 = var9.toString();
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  discarded$4 = var9.append(param0.substring(var10, var11));
                  discarded$5 = var9.append(param2);
                  var10 = var11 - -var5;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("kk.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final static tj a(nh param0, nh param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        tj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5_int = param1.a(param4, param3 + 1000);
            var6 = param1.a(param3, param2, var5_int);
            stackOut_0_0 = ef.a(param3 + 61, var5_int, param1, var6, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5);
            stackOut_2_1 = new StringBuilder().append("kk.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(nh param0, int param1, int param2, int param3) {
        boolean discarded$2 = false;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        nh var5 = null;
        byte[] var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var6 = param0.b(5, param2, param3);
            var4 = var6;
            if (var6 != null) {
              tn.a(param1 + 105, var6);
              if (param1 == 1) {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = (nh) null;
                discarded$2 = kk.a((nh) null, -46, 0, -57);
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4_ref);
            stackOut_7_1 = new StringBuilder().append("kk.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    kk(byte[] param0) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        of dupTemp$17 = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        of[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        of var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        ec var38 = null;
        byte[] var39 = null;
        of var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        of var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        of var48 = null;
        of var49 = null;
        of var50 = null;
        of var51 = null;
        of var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        String stackIn_207_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_41_0 = null;
        byte[] stackOut_40_0 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        String stackOut_206_2 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        String stackOut_205_2 = null;
        try {
          L0: {
            this.field_o = new byte[128];
            this.field_q = new int[128];
            this.field_k = new va[128];
            this.field_n = new of[128];
            this.field_r = new short[128];
            this.field_m = new byte[128];
            this.field_p = new byte[128];
            var38 = new ec(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_m[var38.field_o - -var3] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var3) {
                    var3++;
                    var38.field_o = var38.field_o + 1;
                    var5 = var38.field_o;
                    var38.field_o = var38.field_o + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (var38.field_m[var38.field_o + var6] == 0) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var38.field_o = var38.field_o + 1;
                            var6++;
                            var8 = var38.field_o;
                            var38.field_o = var38.field_o + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_m[var38.field_o - -var9] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var11_int >= var9) {
                                    L7: {
                                      var38.field_o = var38.field_o + 1;
                                      var9++;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (var9 > 1) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var14 >= var9) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.c(true);
                                              if (var15_int != 0) {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              } else {
                                                incrementValue$9 = var12;
                                                var12++;
                                                var13_int = incrementValue$9;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = var9;
                                        break L7;
                                      }
                                    }
                                    var13 = new of[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.c(true);
                                          if ((var14 ^ -1) < -1) {
                                            stackOut_38_0 = new byte[var14 * 2];
                                            stackIn_39_0 = stackOut_38_0;
                                            break L12;
                                          } else {
                                            stackOut_37_0 = null;
                                            stackIn_39_0 = (byte[]) ((Object) stackOut_37_0);
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15_array = var46;
                                          var14 = var38.c(true);
                                          if (-1 <= (var14 ^ -1)) {
                                            stackOut_41_0 = null;
                                            stackIn_42_0 = (byte[]) ((Object) stackOut_41_0);
                                            break L13;
                                          } else {
                                            stackOut_40_0 = new byte[2 * var14];
                                            stackIn_42_0 = stackOut_40_0;
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_m[var17 + var38.field_o] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var17 <= var19) {
                                                var17++;
                                                var38.field_o = var38.field_o + 1;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if ((var20 ^ -1) <= -129) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (var20 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (-129 >= (var23 ^ -1)) {
                                                            var21 = 0;
                                                            var20 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if ((var24 ^ -1) <= -129) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if (var26 >= 128) {
                                                                        var21 = 0;
                                                                        var20 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if ((var27 ^ -1) <= -129) {
                                                                            this.field_j = 1 + var38.c(true);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var27 >= var12) {
                                                                                L24: {
                                                                                  if (var15_array == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var58.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15_array[var27] = var38.a((byte) 2);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var47.length <= var27) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.a((byte) 2);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var27 >= var12) {
                                                                                        L30: {
                                                                                          if (var15_array == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.c(true);
                                                                                            var15_array[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var58.length) {
                                                                                                var27 = var58[0];
                                                                                                var28 = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var58.length <= var29) {
                                                                                                        var15_array = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_m[var30] = (byte)(32 + this.field_m[var30] * var28 >> 280799750);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15_array[var29 + 1];
                                                                                                        var32 = (-var27 + var30) / 2 + var28 * (-var27 + var30);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = cp.f(105, -var27 + var30, var32);
                                                                                                            var32 = var32 + (var31 - var28);
                                                                                                            this.field_m[var33] = (byte)(var34 * this.field_m[var33] - -32 >> 203718694);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_m[var29] = (byte)(32 + this.field_m[var29] * var28 >> -984101306);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = var38.c(true) + (1 + var19);
                                                                                                var15_array[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 != null) {
                                                                                            var19 = var38.c(true);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 293865633;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var29 >= var47.length) {
                                                                                                        var16 = null;
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if ((var30 ^ -1) <= -129) {
                                                                                                            var27 = 0;
                                                                                                            L41: while (true) {
                                                                                                              if (var12 <= var27) {
                                                                                                                break L36;
                                                                                                              } else {
                                                                                                                var13[var27].field_c = var38.c(true);
                                                                                                                var27++;
                                                                                                                continue L41;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            L42: {
                                                                                                              var31 = var28 + (this.field_p[var30] & 255);
                                                                                                              if (-1 >= (var31 ^ -1)) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            L43: {
                                                                                                              if (-129 <= (var31 ^ -1)) {
                                                                                                                break L43;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L43;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_p[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 + 1] << 1205199905;
                                                                                                        var32 = (var30 + -var27) / 2 + var28 * (-var27 + var30);
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L44: while (true) {
                                                                                                          if (var30 <= var37) {
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            var29 += 2;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L45: {
                                                                                                              var34 = cp.f(-63, var30 + -var27, var32);
                                                                                                              var35 = (255 & this.field_p[var37]) - -var34;
                                                                                                              if (0 <= var35) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            L46: {
                                                                                                              if (128 >= var35) {
                                                                                                                break L46;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L46;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_p[var37] = (byte)var35;
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            var37++;
                                                                                                            continue L44;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L47: {
                                                                                                      var30 = (this.field_p[var29] & 255) - -var28;
                                                                                                      if (-1 >= (var30 ^ -1)) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    L48: {
                                                                                                      if (128 >= var30) {
                                                                                                        break L48;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L48;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_p[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + var19 + var38.c(true);
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                break L36;
                                                                                              } else {
                                                                                                var13[var27].field_c = var38.c(true);
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L50: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L51: while (true) {
                                                                                              if (var12 <= var27) {
                                                                                                var27 = 0;
                                                                                                L52: while (true) {
                                                                                                  if (var27 >= var12) {
                                                                                                    var27 = 0;
                                                                                                    L53: while (true) {
                                                                                                      if (var27 >= var12) {
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var52 = var13[var27];
                                                                                                          if (-1 <= (var52.field_h ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var52.field_a = var38.c(true);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L53;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L55: {
                                                                                                      var51 = var13[var27];
                                                                                                      if (var51.field_i <= 0) {
                                                                                                        break L55;
                                                                                                      } else {
                                                                                                        var51.field_h = var38.c(true);
                                                                                                        break L55;
                                                                                                      }
                                                                                                    }
                                                                                                    var27++;
                                                                                                    continue L52;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var13[var27].field_i = var38.c(true);
                                                                                                var27++;
                                                                                                continue L51;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            L56: {
                                                                                              var50 = var13[var27];
                                                                                              if (null == var50.field_n) {
                                                                                                break L56;
                                                                                              } else {
                                                                                                var50.field_e = var38.c(true);
                                                                                                break L56;
                                                                                              }
                                                                                            }
                                                                                            L57: {
                                                                                              if (null == var50.field_o) {
                                                                                                break L57;
                                                                                              } else {
                                                                                                var50.field_m = var38.c(true);
                                                                                                break L57;
                                                                                              }
                                                                                            }
                                                                                            L58: {
                                                                                              if (var50.field_c <= 0) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var50.field_b = var38.c(true);
                                                                                                break L58;
                                                                                              }
                                                                                            }
                                                                                            var27++;
                                                                                            continue L50;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L59: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_n == null) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L60: while (true) {
                                                                                              if (var29 >= var49.field_n.length) {
                                                                                                break L59;
                                                                                              } else {
                                                                                                var19 = 1 + (var19 - -var38.c(true));
                                                                                                var49.field_n[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L60;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L61: {
                                                                                      var48 = var13[var27];
                                                                                      if (var48.field_o == null) {
                                                                                        break L61;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L62: while (true) {
                                                                                          if (var29 >= var48.field_o.length) {
                                                                                            break L61;
                                                                                          } else {
                                                                                            var19 = var38.c(true) + var19 + 1;
                                                                                            var48.field_o[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L62;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L63: {
                                                                                  var45 = var13[var27];
                                                                                  if (var45.field_n == null) {
                                                                                    break L63;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L64: while (true) {
                                                                                      if (var45.field_n.length <= var29) {
                                                                                        break L63;
                                                                                      } else {
                                                                                        var45.field_n[var29] = var38.a((byte) 2);
                                                                                        var29 += 2;
                                                                                        continue L64;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L65: {
                                                                                  if (var45.field_o == null) {
                                                                                    break L65;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L66: while (true) {
                                                                                      if (-2 + var45.field_o.length <= var29) {
                                                                                        break L65;
                                                                                      } else {
                                                                                        var45.field_o[var29] = var38.a((byte) 2);
                                                                                        var29 += 2;
                                                                                        continue L66;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L67: {
                                                                              if (0 != var20) {
                                                                                break L67;
                                                                              } else {
                                                                                L68: {
                                                                                  if (var54.length > var21) {
                                                                                    incrementValue$10 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$10];
                                                                                    break L68;
                                                                                  } else {
                                                                                    var20 = -1;
                                                                                    break L68;
                                                                                  }
                                                                                }
                                                                                if (0 >= this.field_q[var27]) {
                                                                                  break L67;
                                                                                } else {
                                                                                  var26 = var38.c(true) + 1;
                                                                                  break L67;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_m[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L69: {
                                                                          if (-1 == (this.field_q[var26] ^ -1)) {
                                                                            break L69;
                                                                          } else {
                                                                            L70: {
                                                                              if (-1 != (var20 ^ -1)) {
                                                                                break L70;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var21 < var57.length) {
                                                                                  incrementValue$11 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$11];
                                                                                  break L70;
                                                                                } else {
                                                                                  var20 = -1;
                                                                                  break L70;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_n[var26] = (of) (var25);
                                                                            var20--;
                                                                            break L69;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L71: {
                                                                      if (this.field_q[var25_int] == 0) {
                                                                        break L71;
                                                                      } else {
                                                                        L72: {
                                                                          if (var20 != 0) {
                                                                            break L72;
                                                                          } else {
                                                                            incrementValue$12 = var8;
                                                                            var8++;
                                                                            var24 = var38.field_m[incrementValue$12] - -16 << 808109474;
                                                                            if (var56.length > var21) {
                                                                              incrementValue$13 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$13];
                                                                              break L72;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L72;
                                                                            }
                                                                          }
                                                                        }
                                                                        this.field_p[var25_int] = (byte)var24;
                                                                        var20--;
                                                                        break L71;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L73: {
                                                                  if (0 == this.field_q[var24]) {
                                                                    break L73;
                                                                  } else {
                                                                    L74: {
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L74;
                                                                      } else {
                                                                        incrementValue$14 = var5;
                                                                        var5++;
                                                                        var23 = var38.field_m[incrementValue$14] - 1;
                                                                        if (var21 >= var55.length) {
                                                                          var20 = -1;
                                                                          break L74;
                                                                        } else {
                                                                          incrementValue$15 = var21;
                                                                          var21++;
                                                                          var20 = var4[incrementValue$15];
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                    var20--;
                                                                    this.field_o[var24] = (byte)var23;
                                                                    break L73;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (var20 != 0) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 < var54.length) {
                                                                    incrementValue$16 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$16];
                                                                    break L76;
                                                                  } else {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.e(-651413500);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_r[var23] = (short)(this.field_r[var23] + (nb.a(-1 + var22, 2) << -729190578));
                                                            this.field_q[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.c(true);
                                                        this.field_r[var20] = (short)(this.field_r[var20] + (var19 << -68982072));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.c(true);
                                                    this.field_r[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.a((byte) 2);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$17 = new of();
                                          var13[var14] = dupTemp$17;
                                          var40 = dupTemp$17;
                                          var15 = var40;
                                          var16_int = var38.c(true);
                                          if ((var16_int ^ -1) >= -1) {
                                            break L77;
                                          } else {
                                            var15.field_n = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.c(true);
                                          if (var16_int <= 0) {
                                            break L78;
                                          } else {
                                            var15.field_o = new byte[var16_int * 2 + 2];
                                            var40.field_o[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.a((byte) 2);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.a((byte) 2);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.a((byte) 2);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackOut_204_0 = (RuntimeException) (var2);
            stackOut_204_1 = new StringBuilder().append("kk.<init>(");
            stackIn_206_0 = stackOut_204_0;
            stackIn_206_1 = stackOut_204_1;
            stackIn_205_0 = stackOut_204_0;
            stackIn_205_1 = stackOut_204_1;
            if (param0 == null) {
              stackOut_206_0 = (RuntimeException) ((Object) stackIn_206_0);
              stackOut_206_1 = (StringBuilder) ((Object) stackIn_206_1);
              stackOut_206_2 = "null";
              stackIn_207_0 = stackOut_206_0;
              stackIn_207_1 = stackOut_206_1;
              stackIn_207_2 = stackOut_206_2;
              break L79;
            } else {
              stackOut_205_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackOut_205_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackOut_205_2 = "{...}";
              stackIn_207_0 = stackOut_205_0;
              stackIn_207_1 = stackOut_205_1;
              stackIn_207_2 = stackOut_205_2;
              break L79;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_207_0), stackIn_207_2 + ')');
        }
    }

    static {
        field_s = "Renown: <col=DB0100><%0></col>";
        field_i = "Pit Demon";
        field_t = "Please try again in a few minutes.";
    }
}
