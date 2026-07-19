/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class co extends mc {
    static String field_t;
    static String field_s;
    static java.util.zip.CRC32 field_r;
    static int field_n;
    static int field_q;
    static String[] field_o;
    static String[] field_p;

    private co() throws Throwable {
        throw new Error();
    }

    final static ca a(int param0, String param1, byte param2) {
        ca discarded$2 = null;
        vb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new vb();
              ((ca) ((Object) var3)).field_a = param1;
              ((ca) ((Object) var3)).field_e = param0;
              if (param2 == 118) {
                break L1;
              } else {
                var4 = (String) null;
                discarded$2 = co.a(101, (String) null, (byte) -45);
                break L1;
              }
            }
            stackOut_2_0 = (vb) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("co.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (ca) ((Object) stackIn_3_0);
    }

    public static void a(int param0) {
        ca discarded$2 = null;
        String var2 = null;
        field_r = null;
        field_o = null;
        field_p = null;
        field_s = null;
        if (param0 != 22) {
          var2 = (String) null;
          discarded$2 = co.a(-20, (String) null, (byte) 61);
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    static {
        field_t = "Email: ";
        field_n = 10;
        field_s = "Cancel rematch";
        field_r = new java.util.zip.CRC32();
        field_q = 22;
        field_o = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
