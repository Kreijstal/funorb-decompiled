/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationRequiredException extends IOException {
    static RgbSprite field_d;
    static int[] field_e;
    static int field_f;
    static String[] field_c;
    static IntrusiveDeque field_a;
    static String field_b;
    private static String field_z;

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 > 68) {
          field_d = null;
          field_a = null;
          return;
        }
        ProxyAuthenticationRequiredException.clearStaticReferences(-114);
        field_d = null;
        field_a = null;
    }

    ProxyAuthenticationRequiredException(String param0) {
        super(param0);
    }

    static {
        field_z = "wl.A(";
        field_c = new String[]{"Death", "<%highlight>Your raider has perished!</col> Some more advanced traps and monsters, such as <%lastroom>, as well as the dragon in the hoard room, are capable of killing raiders outright. You will need to hire a new raider."};
        field_b = "You must raid by <%0> to preserve your streak which started on <%1>";
        field_f = -1;
        field_a = new IntrusiveDeque();
    }
}
