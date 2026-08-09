/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sr implements Iterable {
    gp field_b;
    static int field_a;
    static String field_d;
    static String field_c;

    public final Iterator iterator() {
        return (Iterator) ((Object) new cf((sr) (this)));
    }

    final gp a(int param0) {
        gp var2;
        var2 = this.field_b.field_p;
        if (param0 < -3) {
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(-120);
            return var2;
          }
        } else {
          return (gp) null;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final void a(byte param0, gp param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_o != null) {
                param1.a(-120);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_p = this.field_b;
            param1.field_o = this.field_b.field_o;
            param1.field_o.field_p = param1;
            param1.field_p.field_o = param1;
            if (param0 >= 7) {
              break L0;
            } else {
              this.iterator();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("sr.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    sr() {
        this.field_b = new gp();
        this.field_b.field_p = this.field_b;
        this.field_b.field_o = this.field_b;
    }

    static {
        field_d = "Please check if address is correct";
        field_c = "game over";
    }
}
