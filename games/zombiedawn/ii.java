/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterable {
    static int field_d;
    static rb field_a;
    nb field_c;
    static String[] field_b;

    public final Iterator iterator() {
        return (Iterator) (Object) new ag((ii) this);
    }

    public static void a(byte param0) {
        if (param0 >= -102) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, int param1, byte[] param2) {
        if (param0 != 8099) {
            field_b = null;
            return ij.a(param1, param2, (byte) 108, 0);
        }
        return ij.a(param1, param2, (byte) 108, 0);
    }

    final nb a(int param0) {
        nb var2 = null;
        var2 = ((ii) this).field_c.field_i;
        if (param0 >= 46) {
          if (var2 == ((ii) this).field_c) {
            return null;
          } else {
            var2.c((byte) -34);
            return var2;
          }
        } else {
          field_d = 104;
          if (var2 == ((ii) this).field_c) {
            return null;
          } else {
            var2.c((byte) -34);
            return var2;
          }
        }
    }

    final void a(int param0, nb param1) {
        Object var4 = null;
        L0: {
          if (param1.field_h != null) {
            param1.c((byte) -12);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_i = ((ii) this).field_c;
        param1.field_h = ((ii) this).field_c.field_h;
        param1.field_h.field_i = param1;
        if (param0 != 0) {
          var4 = null;
          int discarded$2 = ii.a(-82, 33, (byte[]) null);
          param1.field_i.field_h = param1;
          return;
        } else {
          param1.field_i.field_h = param1;
          return;
        }
    }

    private ii() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
