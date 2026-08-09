/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends ci {
    static boolean field_m;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (-1 == (param3 ^ -1)) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 1) {
                var10 = param1[param2];
                var4 = var10;
                if (var4 != null) {
                  stackIn_11_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 + param2;
                var5 = 0;
                if (param0 > 121) {
                  var6_int = param2;
                  L1: while (true) {
                    if (var6_int >= var4_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param2;
                      L2: while (true) {
                        if (var4_int <= var7) {
                          stackIn_28_0 = var6.toString();
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 != null) {
                              discarded$3 = var6.append(var8);
                              break L3;
                            } else {
                              discarded$4 = var6.append("null");
                              break L3;
                            }
                          }
                          var7++;
                          continue L2;
                        }
                      }
                    } else {
                      L4: {
                        var7_ref_CharSequence = param1[var6_int];
                        if (var7_ref_CharSequence == null) {
                          var5 += 4;
                          break L4;
                        } else {
                          var5 = var5 + var7_ref_CharSequence.length();
                          break L4;
                        }
                      }
                      var6_int++;
                      continue L1;
                    }
                  }
                } else {
                  stackIn_14_0 = (String) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("qga.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ',' + param3 + ')');
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
                return stackIn_28_0;
              }
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
            qga.c(97);
        }
        return ht.field_Fb;
    }

    final static void c(int param0) {
        int var1 = 0;
        if ((ot.field_v ^ -1) < -33) {
            var1 = ot.field_v % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            mp.a(2, ot.field_v - var1);
        } else {
            mp.a(2, 0);
        }
        if (param0 != -10794) {
            field_m = false;
        }
    }

    public qga() {
        super(0, true);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var18 = null;
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
                var10 = var18;
                var11 = param4;
                var12 = param8;
                var13 = param1;
                var14 = param0;
                var15 = 8355711 & var18[var11] >> 1250374305;
                var10[var11] = (sea.c(33478545, var14) >> 189010993) - -(sea.c(var13, 33423539) >> -696668695) - (-(sea.c(33423360, var12) >> -77464319) - var15);
                param4++;
                param0 = param0 + param9;
                param8 = param8 + param3;
                param1 = param1 + param7;
                param6--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var10_ref);

            stackIn_10_1 = new StringBuilder().append("qga.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_m = true;
    }
}
