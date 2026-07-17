/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends kj {
    private int field_f;
    static ok field_g;

    final boolean b(int param0) {
        int fieldTemp$4 = ((ob) this).field_f - 1;
        ((ob) this).field_f = ((ob) this).field_f - 1;
        if (0 <= fieldTemp$4) {
          if (param0 <= 21) {
            boolean discarded$5 = ((ob) this).b(-23);
            return false;
          } else {
            return false;
          }
        } else {
          ((ob) this).field_e.field_h.d(-1, ((ob) this).field_c, ((ob) this).field_d);
          return true;
        }
    }

    final static void a(long param0, byte param1, int param2, int param3, String param4) {
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
              oa.field_vb = param3;
              el.field_h = param2;
              wg.field_g = true;
              we.field_b = param0;
              hda.field_l = param4;
              if (param1 == -47) {
                break L1;
              } else {
                ob.c(0);
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
            stackOut_3_1 = new StringBuilder().append("ob.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            boolean discarded$0 = ((ob) this).b(1);
        }
    }

    ob(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            ((ob) this).field_f = 100;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void c(int param0) {
        field_g = null;
    }

    final static void a(String param0, int param1, int[] param2, String param3, int param4, byte param5, int param6, String param7, kga param8, int[] param9) {
        try {
            gfa.field_a[param4] = new wca(param6, param0, param7, param2, param9, param1, param8, param3);
            if (param5 != 22) {
                Object var11 = null;
                ob.a(-114L, (byte) -127, -69, -33, (String) null);
            }
            param4++;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ob.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + (param7 != null ? "{...}" : "null") + 44 + (param8 != null ? "{...}" : "null") + 44 + (param9 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          return;
        } else {
          co.field_b[4].a(param2, -64 + param0, (100 + -((ob) this).field_f) * 192 / 100);
          return;
        }
    }

    static {
    }
}
