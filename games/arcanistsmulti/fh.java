/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh implements Iterator {
    static String field_d;
    private tf field_b;
    static String field_a;
    static int field_e;
    private tf field_c;
    static int field_g;
    private gb field_h;
    static String field_f;
    static ho field_i;

    public final void remove() {
        if (null == this.field_b) {
            throw new IllegalStateException();
        }
        this.field_b.a((byte) 88);
        this.field_b = null;
    }

    public static void a(byte param0) {
        if (param0 < 20) {
            return;
        }
        field_f = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (var1 != this.field_h.field_g) {
            this.field_c = ((tf) (var1)).field_l;
        } else {
            this.field_c = null;
            var1 = null;
        }
        this.field_b = (tf) (var1);
        return var1;
    }

    final static void a(int param0, dl param1, java.awt.Frame param2) {
        og var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 100) {
              L1: while (true) {
                var3 = param1.a(param2, 6);
                L2: while (true) {
                  if (var3.field_e != 0) {
                    if (-2 == (var3.field_e ^ -1)) {
                      param2.setVisible(false);
                      param2.dispose();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      ao.a(100L, 1);
                      continue L1;
                    }
                  } else {
                    ao.a(10L, 1);
                    continue L2;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("fh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        return this.field_c != this.field_h.field_g;
    }

    fh(gb param0) {
        this.field_b = null;
        try {
            this.field_h = param0;
            this.field_b = null;
            this.field_c = this.field_h.field_g.field_l;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
        field_a = "Enter name of player to add to list";
        field_d = "Book of Frost";
        field_f = "Asking to join <%0>'s game...";
    }
}
