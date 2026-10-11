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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = DungeonAssault.field_K;
        try {
          if (!mk.a(param1, param2, (byte) 64)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (param2.length() <= var3_int) {
              var4 = 108 % ((param0 - 72) / 33);
              return true;
            }
            if (rp.a(param2.charAt(var3_int), (byte) -107)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
        field_d = null;
        field_c = null;
        if (param0 == 103) {
          field_b = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ua.a((byte) 109, true, (CharSequence) null);
        field_b = null;
    }

    static {
        field_a = 0;
        field_c = new String[]{"Fickle", "Leaves stable if fail any raid."};
        field_d = "Cave Troll";
    }
}
