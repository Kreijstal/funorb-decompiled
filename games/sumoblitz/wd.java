/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se {
    private String field_i;
    static hb field_e;
    private String field_g;
    static ki field_j;
    static String field_h;
    static du field_f;

    final static ki a(int param0, byte param1) {
        if (param1 != 125) {
          field_e = (hb) null;
          return ng.a(1, -74, true, param0, false, false);
        } else {
          return ng.a(1, -74, true, param0, false, false);
        }
    }

    final void a(fs param0, byte param1) {
        RuntimeException runtimeException = null;
        fs var4 = null;
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
              param0.b(this.field_i, (byte) -105);
              param0.a(this.field_g, 46);
              if (param1 < -107) {
                break L1;
              } else {
                var4 = (fs) null;
                this.a((fs) null, (byte) 29);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wd.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = -16 / ((18 - param0) / 60);
        fq.field_f.a(-3388, param1);
    }

    final nb a(byte param0) {
        nb discarded$0 = null;
        if (param0 < 80) {
            discarded$0 = this.a((byte) -128);
            return pb.field_b;
        }
        return pb.field_b;
    }

    public static void b(byte param0) {
        if (param0 != 88) {
          field_h = (String) null;
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var1_ref = field_e;
        synchronized (var1_ref) {
          L0: {
            L1: {
              if (param0 <= -20) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            if (ua.field_a != bj.field_a) {
              tg.field_a = cp.field_c[bj.field_a];
              np.field_c = aa.field_c[bj.field_a];
              bj.field_a = bj.field_a - -1 & 127;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    wd(String param0, String param1) {
        try {
            this.field_i = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new hb();
        field_h = "Continue";
    }
}
