/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    static mf field_b;
    static int field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
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
        Object var10 = null;
        CharSequence var11 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_28_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = "";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param2 != 1) {
                L1: {
                  if (param3) {
                    break L1;
                  } else {
                    var10 = null;
                    String discarded$3 = oq.a((CharSequence[]) null, 104, -45, false);
                    break L1;
                  }
                }
                var4_int = param1 + param2;
                var5 = 0;
                var6_int = param1;
                L2: while (true) {
                  if (~var4_int >= ~var6_int) {
                    L3: {
                      var6 = new StringBuilder(var5);
                      var7 = param1;
                      if (~var4_int >= ~var7) {
                        break L3;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            StringBuilder discarded$4 = var6.append(var8);
                            var7++;
                            break L4;
                          } else {
                            StringBuilder discarded$5 = var6.append("null");
                            var7++;
                            break L4;
                          }
                        }
                        var7++;
                        var7++;
                        break L3;
                      }
                    }
                    stackOut_28_0 = var6.toString();
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    var7_ref_CharSequence = param0[var6_int];
                    if (var7_ref_CharSequence != null) {
                      var5 = var5 + var7_ref_CharSequence.length();
                      var6_int++;
                      var6_int++;
                      continue L2;
                    } else {
                      var5 += 4;
                      var6_int++;
                      var6_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var11 = param0[param1];
                var4_ref = var11;
                if (var4_ref == null) {
                  stackOut_8_0 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  return ((Object) (Object) var11).toString();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("oq.A(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(boolean param0) {
        ge.field_L = false;
        ge.a(320, 8, param0, (po) (Object) aha.field_D, 2, 8, (aha.field_D.field_v + aha.field_D.field_B) * 3 / 2, (kv[]) null, aha.field_D.field_v, (byte) 91, 240, (kv[]) null);
        if (null != kga.field_c) {
            eh discarded$0 = ju.field_r.a((java.awt.Component) (Object) kga.field_c, false, 127);
        }
    }

    public static void a() {
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 48;
    }
}
