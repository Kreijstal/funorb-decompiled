/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    String field_d;
    String field_a;
    static int field_g;
    static String field_f;
    boolean field_e;
    static String field_b;
    static String field_c;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 <= 44) {
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param2) {
          gf.b(0, 0, gf.field_i, gf.field_c, 0, 192);
          un.a(param2, (byte) -106);
          if (!param0) {
            return;
          } else {
            field_b = (String) null;
            return;
          }
        } else {
          gf.a();
          un.a(param2, (byte) -106);
          if (!param0) {
            return;
          } else {
            field_b = (String) null;
            return;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 78 % ((param1 - 20) / 32);
              if (null == ll.a(param0, (byte) -47)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mj.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_b = "Click";
        field_c = "Legend says that those who hear the screams of the banshee are marked for death.<br><br>If this monster detects a raider, its wail will alert monsters in adjacent rooms, increasing their <%detect> by 2.<br><br>Defeated raiders permanently lose 1 <%attack>.";
    }
}
