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
            field_b = null;
            return;
          }
        } else {
          gf.a();
          un.a(param2, (byte) -106);
          if (!param0) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 78 % ((param1 - 20) / 32);
        return null != ll.a(param0, (byte) -47) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Click";
        field_c = "Legend says that those who hear the screams of the banshee are marked for death.<br><br>If this monster detects a raider, its wail will alert monsters in adjacent rooms, increasing their <%detect> by 2.<br><br>Defeated raiders permanently lose 1 <%attack>.";
    }
}
