/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static ec field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
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
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                        stackIn_24_0 = var6.toString();
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$3 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var6.append("null");
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
                  stackIn_10_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4_ref);

            stackIn_27_1 = new StringBuilder().append("kl.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
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
        field_a = null;
        if (!param0) {
            CharSequence[] var2 = (CharSequence[]) null;
            kl.a((CharSequence[]) null, 11, -126, false);
        }
    }

    static {
        field_a = new ec(2);
    }
}
