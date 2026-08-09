/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ih {
    private java.util.zip.Inflater field_c;
    static oi field_b;
    static int field_a;
    static String field_d;

    final void a(byte[] param0, ng param1, int param2) {
        try {
            if (-32 != (param1.field_h[param1.field_f] ^ -1) || -117 != param1.field_h[1 + param1.field_f]) {
                throw new RuntimeException("");
            }
            if (null == this.field_c) {
                this.field_c = new java.util.zip.Inflater(true);
            }
            try {
                this.field_c.setInput(param1.field_h, 10 + param1.field_f, -param1.field_f + -18 + param1.field_h.length);
                this.field_c.inflate(param0);
            } catch (Exception exception) {
                this.field_c.reset();
                throw new RuntimeException("");
            }
            if (param2 != -19515) {
                return;
            }
            try {
                this.field_c.reset();
            } catch (RuntimeException runtimeException) {
                throw dn.a((Throwable) ((Object) runtimeException), "ih.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ih() {
        this(-1, 1000000, 1000000);
    }

    final static void a(byte param0) {
        uo.field_i = new dc();
        jm.field_d.a((qm) (uo.field_i), (byte) -50);
        if (param0 != 63) {
            field_d = (String) null;
        }
    }

    private ih(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        if (param0 <= 39) {
            ih.a((byte) -111);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (-97 > (param1 ^ -1)) {
                gi.field_n.a();
                kh.a();
                go.field_l.a(param2, 0, 20, 16760896, -1);
                dk.field_o.a(param0 ^ -6963);
                gi.field_n.c(538, param3 + -20, 24576 / param1, 25);
                break L1;
              } else {
                go.field_l.a(param2, 538, param3, 16760896, -1);
                break L1;
              }
            }
            if (param0 == -20) {
              break L0;
            } else {
              field_b = (oi) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ih.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new oi();
        field_d = "Orb points: ";
        field_a = 50;
    }
}
