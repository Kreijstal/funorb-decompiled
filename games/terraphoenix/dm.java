/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static int[] field_b;
    static ci[] field_a;
    static int field_g;
    static long field_f;
    static fa field_d;
    static long field_c;
    static String field_e;

    public static void a() {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static q a(byte param0, String param1) {
        Object var2 = null;
        q var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_5_0 = null;
        q stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        q stackOut_15_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == -85) {
              break L0;
            } else {
              var6 = null;
              q discarded$2 = dm.a((byte) 0, (String) null);
              break L0;
            }
          }
          if (ai.field_f != null) {
            L1: {
              var7 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) hm.a((byte) 126, var7);
              if (var2 != null) {
                break L1;
              } else {
                var2 = (Object) (Object) var7;
                break L1;
              }
            }
            var3 = (q) (Object) ai.field_f.a(param0 + 203, (long)((String) var2).hashCode());
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var8 = (CharSequence) (Object) var3.field_Lb;
                  var4 = hm.a((byte) 65, var8);
                  if (var4 != null) {
                    break L3;
                  } else {
                    var4 = var3.field_Lb;
                    break L3;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_15_0 = (q) var3;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var3 = (q) (Object) ai.field_f.c((byte) -92);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_4_0 = null;
            stackIn_5_0 = stackOut_4_0;
            return (q) (Object) stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("dm.C(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void a(byte param0) {
        if (param0 >= -32) {
            dm.a((byte) 65);
            ke.a(dg.a(false), (byte) -110);
            return;
        }
        ke.a(dg.a(false), (byte) -110);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_f = 20000000L;
        field_b = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_e = "HEX-2";
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -306674912;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
