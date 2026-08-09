/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static db[] field_c;
    static od field_b;
    static o field_a;

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
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            if (param3 <= -60) {
              if (param0 == 0) {
                stackIn_7_0 = "";
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-2 != (param0 ^ -1)) {
                  var4_int = param0 + param2;
                  var5 = 0;
                  var6_int = param2;
                  L1: while (true) {
                    if (var4_int <= var6_int) {
                      var6 = new StringBuilder(var5);
                      var7 = param2;
                      L2: while (true) {
                        if (var7 >= var4_int) {
                          stackIn_26_0 = var6.toString();
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var8 = param1[var7];
                            if (var8 == null) {
                              discarded$3 = var6.append("null");
                              break L3;
                            } else {
                              discarded$4 = var6.append(var8);
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
                  var10 = param1[param2];
                  var4 = var10;
                  if (var4 == null) {
                    stackIn_12_0 = "null";
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return var10.toString();
                  }
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
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("s.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 540) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_a = new o(540, 140);
    }
}
