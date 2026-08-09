/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vn {
    static tf field_c;
    static boolean[][] field_e;
    static long field_b;
    static int field_g;
    private float field_a;
    private int field_f;
    static String field_d;

    final void a(int param0) {
        this.field_a = this.field_a - 1.600000023841858f;
        if (param0 < 91) {
          L0: {
            field_d = (String) null;
            if (this.field_a < -20.0f) {
              this.b(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_a < -20.0f) {
              this.b(false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, String param3) {
        uj.j(param0 + -705633292);
        wa.field_c.e((byte) 54);
        nf.field_b = new be(h.field_U, (String) null, to.field_s, param1, param2);
        ph.field_l = new on(wa.field_c, nf.field_b);
        if (param0 != -20) {
            return;
        }
        try {
            wa.field_c.b(-6183, ph.field_l);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "vn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_e = (boolean[][]) null;
        field_d = null;
        field_c = null;
        if (param0) {
            field_c = (tf) null;
        }
    }

    final static ob a(fm param0, String param1, String param2, fm param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ob stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 22510) {
                break L1;
              } else {
                field_c = (tf) null;
                break L1;
              }
            }
            var5_int = param0.a(122, param1);
            var6 = param0.a((byte) -95, param2, var5_int);
            stackIn_3_0 = jf.a(param3, var5_int, param0, var6, (byte) 126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vn.A(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    private final void b(boolean param0) {
        this.field_f = 90 + ok.a(ea.field_b, -112, 340);
        this.field_a = 480.0f;
        if (param0) {
            field_e = (boolean[][]) null;
        }
    }

    final void a(byte param0) {
        hn.field_b.b(this.field_f, (int)this.field_a);
        if (param0 < 122) {
            field_g = -53;
        }
    }

    vn(int param0) {
        this.b(false);
        this.field_a = (float)param0;
    }

    static {
        field_e = new boolean[][]{new boolean[]{true, true, true, true}, new boolean[]{false, false, false, false}, new boolean[]{true, true, false, false}, new boolean[]{true, false, false, false}, new boolean[]{true, true, true, false}, new boolean[]{true, false, false, true}};
        field_d = "Rated game";
    }
}
