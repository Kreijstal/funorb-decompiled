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
        ri var2;
        ri var3;
        var2 = this.field_e.field_h;
        if (this.field_e != var2) {
          if (param0) {
            var3 = (ri) null;
            this.a(true, (ri) null);
            var2.b((byte) -74);
            return var2;
          } else {
            var2.b((byte) -74);
            return var2;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wg((pf) (this)));
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_a = (byte[][]) null;
        field_i = null;
        if (param0 != 17205) {
          field_h = (ti[]) null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, ri param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_g) {
                break L1;
              } else {
                param1.b((byte) -116);
                break L1;
              }
            }
            param1.field_g = this.field_e.field_g;
            param1.field_h = this.field_e;
            param1.field_g.field_h = param1;
            param1.field_h.field_g = param1;
            if (!param0) {
              break L0;
            } else {
              this.a(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
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
