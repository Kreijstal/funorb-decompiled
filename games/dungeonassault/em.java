/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vf {
    ec field_D;
    static volatile int field_C;
    byte field_E;
    static String field_F;
    int field_G;

    public static void c(boolean param0) {
        field_F = null;
        if (!param0) {
            field_C = 45;
        }
    }

    final static String e(int param0) {
        if (ol.field_i == ql.field_f) {
            return td.field_d;
        }
        if (param0 != 7142) {
            String discarded$0 = em.e(-19);
            return ek.field_i;
        }
        return ek.field_i;
    }

    final int d(byte param0) {
        if (param0 >= 98) {
          if (((em) this).field_D == null) {
            return 0;
          } else {
            return 100 * ((em) this).field_D.field_o / (-((em) this).field_E + ((em) this).field_D.field_m.length);
          }
        } else {
          ((em) this).field_G = -32;
          if (((em) this).field_D == null) {
            return 0;
          } else {
            return 100 * ((em) this).field_D.field_o / (-((em) this).field_E + ((em) this).field_D.field_m.length);
          }
        }
    }

    final static vk a(String[] args, int param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        vk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vk stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new vk(false);
            var2.field_c = args;
            stackOut_0_0 = (vk) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("em.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (args == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 8082 + 41);
        }
        return stackIn_1_0;
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (!((em) this).field_v) {
            if (((em) this).field_D.field_o < ((em) this).field_D.field_m.length + -((em) this).field_E) {
              throw new RuntimeException();
            } else {
              return ((em) this).field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          em.c(false);
          if (!((em) this).field_v) {
            if (((em) this).field_D.field_o < ((em) this).field_D.field_m.length + -((em) this).field_E) {
              throw new RuntimeException();
            } else {
              return ((em) this).field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    em() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
        field_F = "Select a goblin to sacrifice";
    }
}
