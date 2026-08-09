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
        int var1;
        int stackIn_6_0 = 0;
        var1 = -28 % ((param0 - -5) / 62);
        if ((kh.field_n ^ -1) <= -11) {
          if (tl.field_l) {
            return false;
          } else {
            L0: {
              if (dh.a((byte) -125)) {
                stackIn_6_0 = 0;
                break L0;
              } else {
                stackIn_6_0 = 1;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != wo.field_e) {
            var1 = wo.field_e.a(-16);
        }
        if (!(0 != var1.length())) {
            var1 = dc.a(-118);
        }
        int var2 = 28 % ((-38 - param0) / 38);
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          L0: {
            if (bo.field_Jb.a(param5, (byte) 97)) {
              if (param2 <= param1[param4]) {
                param1[param4] = param2;
                var6 = new a(param4);
                var7 = (a) ((Object) param0.e(-24172));
                var8 = -120 / ((74 - param3) / 46);
                L1: while (true) {
                  L2: {
                    if (var7 == null) {
                      break L2;
                    } else {
                      if (param1[var7.field_j] > param2) {
                        so.a((byte) 60, var7, var6);
                        break L2;
                      } else {
                        var7 = (a) ((Object) param0.a(4));
                        continue L1;
                      }
                    }
                  }
                  if (var7 != null) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    param0.a(var6, false);
                    return;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6_ref);

            stackIn_16_1 = new StringBuilder().append("dm.D(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_c = (String) null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    static {
        field_e = new String[]{"First Strike", "Always attacks first."};
        field_c = "Blinded";
        field_b = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";
    }
}
