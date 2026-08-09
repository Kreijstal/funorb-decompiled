/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qj {
    private java.util.zip.Inflater field_b;
    static long[] field_a;
    static nf field_c;
    static tj field_d;

    public qj() {
        this(-1, 1000000, 1000000);
    }

    final void a(wi param0, byte[] param1, byte param2) {
        try {
            try {
                if (param0.field_i[param0.field_h] != 31 || -117 != param0.field_i[1 + param0.field_h]) {
                    throw new RuntimeException("");
                }
                if (!(null != this.field_b)) {
                    this.field_b = new java.util.zip.Inflater(true);
                }
                int var4_int = 61 / ((param2 - -40) / 55);
                try {
                    this.field_b.setInput(param0.field_i, param0.field_h - -10, -10 + (-param0.field_h - 8) + param0.field_i.length);
                    this.field_b.inflate(param1);
                } catch (Exception exception) {
                    this.field_b.reset();
                    throw new RuntimeException("");
                }
                this.field_b.reset();
            } catch (RuntimeException runtimeException) {
                throw ii.a((Throwable) ((Object) runtimeException), "qj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -29 % ((43 - param0) / 38);
    }

    private qj(int param0, int param1, int param2) {
    }

    final static rg a(boolean param0, String[] param1) {
        rg var2 = null;
        RuntimeException var2_ref = null;
        rg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new rg(param0);
            var2.field_d = param1;
            stackIn_1_0 = (rg) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("qj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static fe a(byte param0) {
        L0: {
          if (null == ca.field_b) {
            ca.field_b = new fe();
            ca.field_b.a(32, sg.field_a);
            ca.field_b.field_m = 2763306;
            ca.field_b.field_f = 5;
            ca.field_b.field_n = 14;
            ca.field_b.field_q = 7697781;
            ca.field_b.field_d = field_d;
            ca.field_b.field_k = 6;
            ca.field_b.field_o = 0;
            ca.field_b.field_h = 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 67) {
          field_a = (long[]) null;
          return ca.field_b;
        } else {
          return ca.field_b;
        }
    }

    static {
        field_a = new long[32];
        field_c = new nf();
    }
}
