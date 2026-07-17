/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends ci {
    static boolean field_m;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
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
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param3 == 1) {
                var10 = param1[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_10_0 = ((Object) (Object) var10).toString();
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                var4_int = param3;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var4_int <= var7) {
                        stackOut_26_0 = var6.toString();
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param1[var7];
                          if (var8 != null) {
                            StringBuilder discarded$5 = var6.append(var8);
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append("null");
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4_ref;
            stackOut_28_1 = new StringBuilder().append("qga.B(").append(125).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_27_0;
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
            qga.c(97);
        }
        return ht.field_Fb;
    }

    final static void c(int param0) {
        int var1 = 0;
        if (ot.field_v > 32) {
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
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 < -107) {
                break L1;
              } else {
                var17 = null;
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
                var15 = 8355711 & var18[var11] >> 1;
                var10_array[var11] = (sea.c(33478545, var14) >> 17) - -(sea.c(var13, 33423539) >> 9) - (-(sea.c(33423360, var12) >> 1) - var15);
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
            var10 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var10;
            stackOut_8_1 = new StringBuilder().append("qga.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = true;
    }
}
