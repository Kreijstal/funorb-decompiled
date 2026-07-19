/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends ci {
    static boolean field_m;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        CharSequence var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_30_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (-1 == (param3 ^ -1)) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 1) {
                var10 = param1[param2];
                var4_ref = var10;
                if (var4_ref != null) {
                  stackOut_10_0 = var10.toString();
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 + param2;
                var5 = 0;
                if (param0 > 121) {
                  var6_int = param2;
                  L1: while (true) {
                    L2: {
                      if (var6_int >= var4_int) {
                        break L2;
                      } else {
                        L3: {
                          var7_ref_CharSequence = param1[var6_int];
                          if (var7_ref_CharSequence != null) {
                            var5 = var5 + var7_ref_CharSequence.length();
                            if (var9 == 0) {
                              break L3;
                            } else {
                              var5 += 4;
                              break L3;
                            }
                          } else {
                            var5 += 4;
                            break L3;
                          }
                        }
                        var6_int++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L4: while (true) {
                      L5: {
                        if (var4_int <= var7) {
                          break L5;
                        } else {
                          L6: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L6;
                            } else {
                              discarded$4 = var6.append("null");
                              if (var9 == 0) {
                                break L6;
                              } else {
                                discarded$5 = var6.append(var8);
                                break L6;
                              }
                            }
                          }
                          var7++;
                          if (var9 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackOut_30_0 = var6.toString();
                      stackIn_31_0 = stackOut_30_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_13_0 = (String) null;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("qga.B(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L7;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                return stackIn_31_0;
              }
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
            qga.c(97);
            return ht.field_Fb;
        }
        return ht.field_Fb;
    }

    final static void c(int param0) {
        int var1 = 0;
        L0: {
          if ((ot.field_v ^ -1) >= -33) {
            break L0;
          } else {
            L1: {
              var1 = ot.field_v % 32;
              if (var1 != 0) {
                break L1;
              } else {
                var1 = 32;
                break L1;
              }
            }
            mp.a(2, ot.field_v - var1);
            if (!TombRacer.field_G) {
              if (param0 == -10794) {
                return;
              } else {
                field_m = false;
                return;
              }
            } else {
              break L0;
            }
          }
        }
        mp.a(2, 0);
        if (param0 == -10794) {
          return;
        } else {
          field_m = false;
          return;
        }
    }

    public qga() {
        super(0, true);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 < -107) {
                break L1;
              } else {
                var17 = (int[]) null;
                qga.a(30, -67, (int[]) null, -70, -115, -54, -31, -19, 111, 23);
                break L1;
              }
            }
            param6--;
            L2: while (true) {
              if (param6 < 0) {
                break L0;
              } else {
                var18 = param2;
                var10_array = var18;
                var11 = param4;
                var12 = param8;
                var13 = param1;
                var14 = param0;
                var15 = 8355711 & var18[var11] >> 1250374305;
                var10_array[var11] = (sea.c(33478545, var14) >> 189010993) - -(sea.c(var13, 33423539) >> -696668695) - (-(sea.c(33423360, var12) >> -77464319) - var15);
                param4++;
                param0 = param0 + param9;
                param8 = param8 + param3;
                param1 = param1 + param7;
                if (var16 == 0) {
                  param6--;
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var10);
            stackOut_11_1 = new StringBuilder().append("qga.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_m = true;
    }
}
