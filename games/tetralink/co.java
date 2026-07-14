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
        vb var3 = null;
        Object var4 = null;
        var3 = new vb();
        ((ca) (Object) var3).field_a = param1;
        ((ca) (Object) var3).field_e = param0;
        if (param2 != 118) {
          var4 = null;
          ca discarded$2 = co.a(101, (String) null, (byte) -45);
          return (ca) (Object) var3;
        } else {
          return (ca) (Object) var3;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_r = null;
        field_o = null;
        field_p = null;
        field_s = null;
        if (param0 != 22) {
          var2 = null;
          ca discarded$2 = co.a(-20, (String) null, (byte) 61);
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Email: ";
        field_n = 10;
        field_s = "Cancel rematch";
        field_r = new java.util.zip.CRC32();
        field_q = 22;
        field_o = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
