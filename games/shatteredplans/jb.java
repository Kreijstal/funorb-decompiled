/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static int field_c;
    static String field_e;
    static int field_d;
    static String field_f;
    static String field_h;
    static int field_b;
    static String field_a;
    static int field_g;

    public static void a(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 <= 20) {
            return;
        }
        field_h = null;
    }

    final static void a(boolean param0, byte param1) {
        ta.a(param0, 121);
        im.a(true, param0);
    }

    final static void a(byte param0, long param1) {
        if (0L >= param1) {
          return;
        } else {
          if (param0 <= -89) {
            if (param1 % 10L != 0L) {
              he.a(true, param1);
              return;
            } else {
              he.a(true, -1L + param1);
              he.a(true, 1L);
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_e = "Expires in <%0> turns";
        field_f = "<%PROJECT_ENERGY> - (<%Resource2>) A <%project_energy> causes devastating flares that destroy <%highlight>half of the fleet</col> in the target <%glossary>system</col>. If the target system has a <%project_metal>, the net will be destroyed instead. Additionally, any <%highlight>fleet moving out of the system is stopped</col>. This project <%highlight>may not be used against an ally</col> and you must control a system with a <%glossary>wormhole</col> link to the target.";
        field_h = "Project executed";
        field_g = field_c;
        field_a = "<%0> has signed a Non-Aggression Pact with you.";
    }
}
