/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static cn[] field_d;
    static cn[] field_a;
    static cn field_g;
    static cn field_f;
    static String field_c;
    static String[] field_e;
    static String field_b;

    final static boolean c(int param0) {
        int var1 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var1 = -28 % ((param0 - -5) / 62);
        if (kh.field_n >= 10) {
          if (tl.field_l) {
            return false;
          } else {
            L0: {
              if (dh.a((byte) -125)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static String a() {
        String var1 = "";
        if (null != wo.field_e) {
            var1 = wo.field_e.a(-16);
        }
        if (!(0 != var1.length())) {
            var1 = dc.a(-118);
        }
        int var2 = 0;
        if (!(0 != var1.length())) {
            var1 = fb.field_a;
        }
        return var1;
    }

    final static void a(md param0, int[] param1, int param2, int param3, int param4, int param5) {
        a var6 = null;
        RuntimeException var6_ref = null;
        a var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (bo.field_Jb.a(param5, (byte) 97)) {
              if (param2 <= param1[param4]) {
                param1[param4] = param2;
                var6 = new a(param4);
                var7 = (a) (Object) param0.e(-24172);
                var8 = -120 / ((74 - param3) / 46);
                L1: while (true) {
                  L2: {
                    if (var7 == null) {
                      break L2;
                    } else {
                      if (param1[var7.field_j] > param2) {
                        so.a((byte) 60, (ne) (Object) var7, (ne) (Object) var6);
                        break L2;
                      } else {
                        var7 = (a) (Object) param0.a(4);
                        continue L1;
                      }
                    }
                  }
                  if (var7 != null) {
                    break L0;
                  } else {
                    param0.a((ne) (Object) var6, false);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6_ref;
            stackOut_14_1 = new StringBuilder().append("dm.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void b() {
        field_g = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"First Strike", "Always attacks first."};
        field_c = "Blinded";
        field_b = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";
    }
}
