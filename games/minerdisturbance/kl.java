/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static ec field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
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
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        String stackOut_9_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 != 0) {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  kl.a(false);
                  break L1;
                }
              }
              if (1 != param1) {
                var4_int = param1 - -param2;
                var5 = 0;
                var6_int = param2;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param2;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_23_0 = var6.toString();
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$5 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$6 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var10 = param0[param2];
                var4 = var10;
                if (var4 == null) {
                  stackOut_9_0 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4_ref);
            stackOut_25_1 = new StringBuilder().append("kl.A(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    public static void a(boolean param0) {
        String discarded$0 = null;
        field_a = null;
        if (!param0) {
            CharSequence[] var2 = (CharSequence[]) null;
            discarded$0 = kl.a((CharSequence[]) null, 11, -126, false);
        }
    }

    static {
        field_a = new ec(2);
    }
}
