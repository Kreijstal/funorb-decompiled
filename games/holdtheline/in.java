/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in {
    float field_g;
    static int field_i;
    static Random field_c;
    static int field_e;
    static uf field_b;
    float field_j;
    static volatile int field_f;
    static int field_a;
    static String field_d;
    static int field_h;

    final in a(byte param0) {
        int var2 = -72 / ((param0 - 9) / 49);
        return new in(((in) this).field_g, -((in) this).field_j);
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -1) {
            field_h = 44;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final void a(in param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((in) this).field_j = ((in) this).field_j - param0.field_j;
              ((in) this).field_g = ((in) this).field_g - param0.field_g;
              if (param1 == 1180) {
                break L1;
              } else {
                ((in) this).field_j = 0.05897929519414902f;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("in.G(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final float a(in param0, byte param1) {
        RuntimeException var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_2_0 = 0.0f;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                field_f = -46;
                break L1;
              }
            }
            stackOut_2_0 = param0.field_g * ((in) this).field_g + param0.field_j * ((in) this).field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("in.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    in(float param0, float param1) {
        ((in) this).field_g = param1;
        ((in) this).field_j = param0;
    }

    final float a(in param0, boolean param1) {
        RuntimeException var3 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_2_0 = 0.0f;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((in) this).a(-0.7947180271148682f, 38);
                break L1;
              }
            }
            stackOut_2_0 = param0.field_g * ((in) this).field_j - ((in) this).field_g * param0.field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("in.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0) {
        float var2 = 0.0f;
        if (param0 != -1) {
          field_f = 38;
          var2 = (float)Math.sqrt((double)(((in) this).field_j * ((in) this).field_j + ((in) this).field_g * ((in) this).field_g));
          ((in) this).field_j = ((in) this).field_j / var2;
          ((in) this).field_g = ((in) this).field_g / var2;
          return;
        } else {
          var2 = (float)Math.sqrt((double)(((in) this).field_j * ((in) this).field_j + ((in) this).field_g * ((in) this).field_g));
          ((in) this).field_j = ((in) this).field_j / var2;
          ((in) this).field_g = ((in) this).field_g / var2;
          return;
        }
    }

    final void a(float param0, int param1) {
        ((in) this).field_g = ((in) this).field_g * param0;
        if (param1 != -1) {
            return;
        }
        ((in) this).field_j = ((in) this).field_j * param0;
    }

    in(qm param0, qm param1) {
        try {
            ((in) this).field_g = (float)(param1.field_f + -param0.field_f);
            ((in) this).field_j = (float)(-param0.field_h + param1.field_h);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "in.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    in(in param0) {
        try {
            ((in) this).field_g = param0.field_g;
            ((in) this).field_j = param0.field_j;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "in.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(float param0, byte param1) {
        ((in) this).field_j = (float)Math.cos((double)param0);
        ((in) this).field_g = -(float)Math.sin((double)param0);
        if (param1 != -54) {
            field_a = 45;
        }
    }

    in(float param0) {
        ((in) this).a(param0, (byte) -54);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_a = 0;
        field_c = new Random(42L);
        field_d = "Waiting for graphics";
    }
}
