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
        String var2;
        if (param0 != 11) {
          var2 = (String) null;
          ha.a((String) null, (byte) -33);
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
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 15) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = bh.field_a.a(125, "", param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ha.C(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_f = new int[]{10, 1, 1};
        field_c = new int[4];
    }
}
