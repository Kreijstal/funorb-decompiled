/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha {
    String field_g;
    String field_b;
    static int field_e;
    boolean field_a;
    static int[] field_f;
    static String[] field_d;
    static int[] field_c;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 11) {
          var2 = null;
          byte[] discarded$2 = ha.a((String) null, (byte) -33);
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 < 15) {
            field_d = null;
            return bh.field_a.a(125, "", param0);
        }
        return bh.field_a.a(125, "", param0);
    }

    final static String a(long param0, int param1) {
        jg.field_c.setTime(new Date(param0));
        int var3 = jg.field_c.get(7);
        int var4 = jg.field_c.get(5);
        int var5 = jg.field_c.get(2);
        int var6 = jg.field_c.get(1);
        int var7 = jg.field_c.get(11);
        int var8 = jg.field_c.get(12);
        int var9 = jg.field_c.get(param1);
        return nn.field_p[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + oi.field_s[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_f = new int[]{10, 1, 1};
        field_c = new int[4];
    }
}
