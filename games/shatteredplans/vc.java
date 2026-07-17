/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vc {
    static ej field_a;
    static String field_e;
    static bi field_b;
    static String[] field_c;
    static sr[] field_d;

    final static int a(byte param0, int param1) {
        if (param0 != -39) {
            vc.a(-12);
            int discarded$0 = -11;
            return hi.a(param1, tg.field_b);
        }
        int discarded$1 = -11;
        return hi.a(param1, tg.field_b);
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        int var1 = 120 % ((-3 - param0) / 62);
        field_e = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Welcome to Shattered Plans. <col=FF8080>Before playing the game, we recommend you first select 'Tutorial' from the main menu.</col><br><br><%highlight>BACKGROUND</col><br><br>You have been placed in command of the forces defending a colony of human survivors, following the disaster that rendered Earth uninhabitable.<br><br>It is your job to ensure your colony prospers and triumphs in the power struggle that has ensued after the colonies regained the power of spaceflight. To do so, you must <%highlight>capture resources</col> to <%highlight>build your ships</col>, maintain a flow of fleets to the front lines, and keep enough in reserve to <%highlight>maintain order</col> in your central systems. You also have access to powerful research <%highlight>projects</col> that may help you tip the balance.";
    }
}
