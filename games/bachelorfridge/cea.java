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

    public static void a(int param0) {
        field_b = null;
        field_d = (byte[][]) null;
        if (param0 != 65536) {
          field_i = (kv) null;
          field_i = null;
          field_h = null;
          field_a = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          field_a = null;
          return;
        }
    }

    final static pia a(byte[] param0, int param1) {
        pia var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        pia stackIn_5_0 = null;
        pia stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pia stackOut_6_0 = null;
        pia stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 == 28450) {
                var2 = new pia(param0, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
                al.b(-18073);
                stackOut_6_0 = (pia) (var2);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (pia) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("cea.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pia) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    cea(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = param2;
        this.field_f = param1;
        int var4 = 65535 & this.field_f - this.field_e;
        int var5 = this.field_e + -this.field_f & 65535;
        if (var4 <= var5) {
            this.field_g = (double)var4 / (double)this.field_c;
        } else {
            this.field_g = 0.0 - (double)var5 / (double)this.field_c;
        }
    }

    final int a(int param0, byte param1) {
        double var3 = 0.0;
        if (param1 != -52) {
          field_b = (raa) null;
          var3 = (double)this.field_e + (double)param0 * this.field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        } else {
          var3 = (double)this.field_e + (double)param0 * this.field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        }
    }

    static {
        field_a = "You cannot add yourself!";
    }
}
