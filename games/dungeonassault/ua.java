/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static ph[] field_b;
    static volatile int field_a;
    static String[] field_c;
    static String field_d;

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            if (mk.a(param1, param2, (byte) 64)) {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  var4 = 108 % ((param0 - 72) / 33);
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (rp.a(param2.charAt(var3_int), (byte) -107)) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static java.awt.Container a(int param0) {
        if (null != ad.field_d) {
            return (java.awt.Container) ((Object) ad.field_d);
        }
        if (param0 != 0) {
            ua.a(-74);
            return (java.awt.Container) ((Object) m.c(true));
        }
        return (java.awt.Container) ((Object) m.c(true));
    }

    public static void a(byte param0) {
        CharSequence var2;
        field_d = null;
        field_c = null;
        if (param0 != 103) {
          var2 = (CharSequence) null;
          ua.a((byte) 109, true, (CharSequence) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        field_a = 0;
        field_c = new String[]{"Fickle", "Leaves stable if fail any raid."};
        field_d = "Cave Troll";
    }
}
