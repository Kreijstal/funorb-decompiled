/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nm {
    nm field_b;
    nm field_e;
    static th field_c;
    static String field_a;
    static jp[] field_f;
    static jp field_d;
    static int[] field_h;
    long field_g;

    final boolean b(int param0) {
        if (param0 == 0) {
          if (null == ((nm) this).field_b) {
            return false;
          } else {
            return true;
          }
        } else {
          ((nm) this).b((byte) 95);
          if (null == ((nm) this).field_b) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static String a(CharSequence[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = ao.a(0, param0.length, 19166, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("nm.DB(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 1 + 41);
        }
        return stackIn_3_0;
    }

    final void b(byte param0) {
        if (((nm) this).field_b == null) {
          return;
        } else {
          if (param0 != 111) {
            field_a = null;
            ((nm) this).field_b.field_e = ((nm) this).field_e;
            ((nm) this).field_e.field_b = ((nm) this).field_b;
            ((nm) this).field_b = null;
            ((nm) this).field_e = null;
            return;
          } else {
            ((nm) this).field_b.field_e = ((nm) this).field_e;
            ((nm) this).field_e.field_b = ((nm) this).field_b;
            ((nm) this).field_b = null;
            ((nm) this).field_e = null;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new th(1, 2, 2, 0);
        field_a = "Waiting for <%0> to start the game...";
        field_h = new int[]{26679, 10200253, 12658477, 16494651, 16711935};
    }
}
