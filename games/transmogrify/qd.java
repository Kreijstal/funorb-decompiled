/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qd {
    private java.util.zip.Inflater field_b;
    static qj field_d;
    static String[] field_e;
    static int[] field_a;
    static String field_c;

    final void a(oa param0, int param1, byte[] param2) {
        try {
            try {
                if (-32 != (param0.field_g[param0.field_h] ^ -1) || (param0.field_g[1 + param0.field_h] ^ -1) != 116) {
                    throw new RuntimeException("");
                }
                if (param1 >= -106) {
                    qd.b(51);
                }
                if (null == this.field_b) {
                    this.field_b = new java.util.zip.Inflater(true);
                }
                try {
                    this.field_b.setInput(param0.field_g, param0.field_h + 10, param0.field_g.length + -10 + (-param0.field_h + -8));
                    this.field_b.inflate(param2);
                } catch (Exception exception) {
                    this.field_b.reset();
                    throw new RuntimeException("");
                }
                this.field_b.reset();
            } catch (RuntimeException runtimeException) {
                throw ch.a((Throwable) ((Object) runtimeException), "qd.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qd() {
        this(-1, 1000000, 1000000);
    }

    private qd(int param0, int param1, int param2) {
    }

    final static void a(int param0) {
        fd.field_h[4] = new int[]{5};
        int var1 = -67 / ((param0 - -11) / 43);
        ej.field_l[4] = new vg(4);
        tg.a(2, 43, new int[]{8, 9, 10, 5}, (byte) 98, 400, 30, 396);
        ej.field_l[2] = new vg(2);
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = uj.field_h.a(param1, (byte) 102, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qd.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        if (param0 <= 7) {
          field_a = (int[]) null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void b(int param0) {
        ci var2;
        if (null != ub.field_c) {
          gd.a(ub.field_c, (byte) 106);
          ub.field_c.a(-100, lk.field_b);
          if (param0 != 5) {
            L0: {
              var2 = (ci) null;
              qd.a((ci) null, (byte) 107);
              ub.field_c = null;
              if (vg.field_b != null) {
                vg.field_b.c((byte) -126);
                break L0;
              } else {
                break L0;
              }
            }
            gd.field_k.requestFocus();
            return;
          } else {
            L1: {
              ub.field_c = null;
              if (vg.field_b != null) {
                vg.field_b.c((byte) -126);
                break L1;
              } else {
                break L1;
              }
            }
            gd.field_k.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(ci param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -52 % ((-18 - param1) / 34);
            stackIn_1_0 = param0.c(32031);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("qd.D(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_d = new qj();
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = "Please try again in a few minutes.";
    }
}
