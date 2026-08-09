/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ok {
    static int field_Gb;

    private aj() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    final static short[] a(wj param0, short[] param1, byte param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] var9 = null;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            var4_int = param0.j(param2 ^ 116, param3);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (param1.length == var4_int) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.j(84, 4);
                if (param2 == 31) {
                  break L3;
                } else {
                  var9 = (short[]) null;
                  aj.a((wj) null, (short[]) null, (byte) 18, -27);
                  break L3;
                }
              }
              L4: {
                var6 = (short)param0.j(-93, 16);
                if (0 >= var5) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (short)(param0.j(87, var5) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (short[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (short[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    static {
        field_Gb = 0;
    }
}
