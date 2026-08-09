/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class al {
    static java.util.zip.CRC32 field_e;
    private String field_f;
    static String field_a;
    static String field_b;
    static int field_d;
    static String field_c;

    final void a(java.applet.Applet param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kn.a(126, param0, 31536000L, this.field_f, "jagex-last-login-method");
              if (param1 == 49) {
                break L1;
              } else {
                field_e = (java.util.zip.CRC32) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("al.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 == -5851) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_f.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("al.C(");

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
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0) {
        int var1 = -81 % ((21 - param0) / 63);
        if (sa.field_R) {
            return null;
        }
        if (kc.field_t > hm.field_qb) {
            return null;
        }
        if (!(hm.field_qb >= kc.field_t - -hm.field_nb)) {
            return vf.field_o;
        }
        return null;
    }

    al(String param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 <= 9) {
          field_e = (java.util.zip.CRC32) null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        field_b = "Good old-fashioned physical#explosives, these missiles can#add an edge to your attack.";
        field_a = "Yes";
        field_e = new java.util.zip.CRC32();
        field_c = "Quit to website";
    }
}
