/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eca extends sc implements en {
    static int field_e;
    static String field_d;
    private uf field_c;

    final String d(int param0) {
        Object var3 = null;
        if (param0 != 16384) {
          var3 = null;
          qrb discarded$2 = ((eca) this).a((String) null, -101);
          return ((eca) this).b(((eca) this).field_c.field_j, -1);
        } else {
          return ((eca) this).b(((eca) this).field_c.field_j, -1);
        }
    }

    final qrb b(int param0) {
        if (param0 != -1) {
          field_d = null;
          return ((eca) this).a(((eca) this).field_c.field_j, 16384);
        } else {
          return ((eca) this).a(((eca) this).field_c.field_j, 16384);
        }
    }

    public final void a(uf param0, byte param1) {
        if (param1 != 100) {
            return;
        }
        try {
            ((eca) this).a(20);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "eca.L(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -100) {
          if (((eca) this).field_c.field_j != null) {
            if (((eca) this).field_c.field_j.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((eca) this).field_c = null;
          if (((eca) this).field_c.field_j == null) {
            return true;
          } else {
            L0: {
              if (((eca) this).field_c.field_j.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void e(int param0) {
        field_d = null;
    }

    public final void a(int param0, uf param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param0 == -12409) {
                break L1;
              } else {
                var4 = null;
                ((eca) this).a((uf) null, (byte) 43);
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
            stackOut_3_1 = new StringBuilder().append("eca.I(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    eca(uf param0) {
        try {
            ((eca) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "eca.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    abstract qrb a(String param0, int param1);

    abstract String b(String param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Halve custom variables";
        field_e = 16384;
    }
}
