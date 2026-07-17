/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class k {
    static ef field_e;
    static cf field_f;
    k field_d;
    String field_g;
    static eh field_c;
    String field_i;
    static String field_b;
    static c field_h;
    static String[] field_a;

    k(String param0, String param1, k param2) {
        try {
            ((k) this).field_g = param0;
            ((k) this).field_d = param2;
            ((k) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "k.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(byte param0, int param1, int param2, int param3) {
        long var4 = 0L;
        String var6 = null;
        if (param0 != -122) {
          String discarded$2 = k.a((byte) 65, -82, -76, 109);
          var4 = 60000L * ((long)param3 + 16912800L);
          var6 = java.text.DateFormat.getDateTimeInstance(param2, param1).format(new Date(var4));
          return var6;
        } else {
          var4 = 60000L * ((long)param3 + 16912800L);
          var6 = java.text.DateFormat.getDateTimeInstance(param2, param1).format(new Date(var4));
          return var6;
        }
    }

    public static void a() {
        field_f = null;
        field_a = null;
        field_h = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ef();
        field_a = new String[]{null, "Remember that you will need a varied set of raiders: some with good <%sneak> and <%dodge> levels to handle <%traps>, and some with good <%attack> and <%defence> levels to deal with <%monsters>.<br><br><%command>Recruit a party of raiders, then save your stable and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
    }
}
