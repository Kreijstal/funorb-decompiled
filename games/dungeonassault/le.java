/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static String field_a;
    static cn field_d;
    static cn field_f;
    static String[] field_c;
    static gn[][] field_b;
    static pp field_g;
    static String field_e;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = jm.a((byte) 59, var5);
            if (param2 < -22) {
              L1: {
                var6 = (CharSequence) ((Object) param1);
                var4 = jm.a((byte) 59, var6);
                if (var3 != null) {
                  break L1;
                } else {
                  if (var4 == null) {
                    stackIn_7_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3 == null) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (var4 != null) {
                  stackIn_14_0 = var3.equals(var4);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("le.B(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = (gn[][]) null;
        field_d = null;
        if (param0 < 97) {
            field_b = (gn[][]) null;
        }
    }

    static {
        field_a = "<%0> of your Renown will be lost if you fail to reach the hoard room in a raid.";
        field_e = "The heavy armour of the <%0> deflects the blow!";
        field_c = new String[]{null, "There are a number of different strategies a raider can employ against a monster, displayed in the bottom-right, below the room's statistics. For now, we'll use <%advance>.<br><br><%command>Click the shield icon - <%advance> - to begin combat.</col>"};
    }
}
