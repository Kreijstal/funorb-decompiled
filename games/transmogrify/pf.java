/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pf implements Iterable {
    static byte[][] field_a;
    static int field_b;
    static ti[] field_h;
    static int field_g;
    ri field_e;
    static String field_c;
    static String field_f;
    static ti field_d;
    static String field_i;

    final ri a(boolean param0) {
        ri var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          return null;
        }
        if (!param0) {
          var2.b((byte) -74);
          return var2;
        }
        ri var3 = (ri) null;
        this.a(true, (ri) null);
        var2.b((byte) -74);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wg(this));
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_a = (byte[][]) null;
        field_i = null;
        if (param0 == 17205) {
          field_d = null;
          return;
        }
        field_h = (ti[]) null;
        field_d = null;
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, ri param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_g) {
            param1.b((byte) -116);
          }
          param1.field_g = this.field_e.field_g;
          param1.field_h = this.field_e;
          param1.field_g.field_h = param1;
          param1.field_h.field_g = param1;
          if (!param0) {
            return;
          }
          this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_a = new byte[1000][];
        field_g = -2147483648;
        field_f = "Sound: ";
        field_c = "Email: ";
        field_i = "Confirm Email:";
    }
}
