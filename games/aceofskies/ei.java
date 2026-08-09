/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ei {
    static w field_d;
    static int field_a;
    private java.util.zip.Inflater field_b;
    static String field_c;

    final static void a(int param0) {
        int fieldTemp$2 = 0;
        int var1_int = 0;
        dl var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = -36 % ((-50 - param0) / 48);
            var2 = q.field_p;
            L1: while (true) {
              if (!sa.a(true)) {
                break L0;
              } else {
                var2.g(65, 8);
                fieldTemp$2 = var2.field_g + 1;
                var2.field_g = var2.field_g + 1;
                var3 = fieldTemp$2;
                hb.a(var2, 24732);
                q.field_p.b(var2.field_g + -var3, (byte) 118);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "ei.C(" + param0 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            if (param0 < 95) {
                ei.a(true);
            }
            param1.setFocusTraversalKeysEnabled(false);
            param1.addKeyListener(ua.field_d);
            param1.addFocusListener(ua.field_d);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ei.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -16) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = es.a(ln.class, -106, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ei.E(");

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte[] param0, int param1, rb param2) {
        try {
            try {
                if (31 != param2.field_f[param2.field_g] || 116 != (param2.field_f[param2.field_g - -1] ^ -1)) {
                    throw new RuntimeException("");
                }
                if (this.field_b == null) {
                    this.field_b = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_b.setInput(param2.field_f, param1 + param2.field_g, param2.field_f.length - (8 + param2.field_g + 10));
                    this.field_b.inflate(param0);
                } catch (Exception exception) {
                    this.field_b.reset();
                    throw new RuntimeException("");
                }
                this.field_b.reset();
            } catch (RuntimeException runtimeException) {
                throw pn.a((Throwable) ((Object) runtimeException), "ei.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ei() {
        this(-1, 1000000, 1000000);
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    private ei(int param0, int param1, int param2) {
    }

    static {
        field_c = "Loading music";
        field_d = new w();
    }
}
