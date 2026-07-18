/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cea {
    private int field_f;
    private int field_c;
    private int field_e;
    static byte[][] field_d;
    private double field_g;
    static wk field_h;
    static raa field_b;
    static kv field_i;
    static String field_a;

    public static void a() {
        field_b = null;
        field_d = null;
        field_i = null;
        field_h = null;
        field_a = null;
    }

    final static pia a(byte[] param0) {
        pia var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        pia stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        pia stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new pia(param0, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
              int discarded$2 = -18073;
              al.b();
              stackOut_4_0 = (pia) var2;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (pia) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("cea.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 28450 + ')');
        }
        return stackIn_5_0;
    }

    cea(int param0, int param1, int param2) {
        ((cea) this).field_e = param0;
        ((cea) this).field_c = param2;
        ((cea) this).field_f = param1;
        int var4 = 65535 & ((cea) this).field_f - ((cea) this).field_e;
        int var5 = ((cea) this).field_e + -((cea) this).field_f & 65535;
        if (var4 <= var5) {
            ((cea) this).field_g = (double)var4 / (double)((cea) this).field_c;
        } else {
            ((cea) this).field_g = 0.0 - (double)var5 / (double)((cea) this).field_c;
        }
    }

    final int a(int param0, byte param1) {
        double var3 = 0.0;
        if (param1 != -52) {
          field_b = null;
          var3 = (double)((cea) this).field_e + (double)param0 * ((cea) this).field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        } else {
          var3 = (double)((cea) this).field_e + (double)param0 * ((cea) this).field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You cannot add yourself!";
    }
}
