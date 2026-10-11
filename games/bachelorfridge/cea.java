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
        if (param0 == 65536) {
          field_i = null;
          field_h = null;
          field_a = null;
          return;
        }
        field_i = (kv) null;
        field_i = null;
        field_h = null;
        field_a = null;
    }

    final static pia a(byte[] param0, int param1) {
        pia var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        pia stackIn_5_0 = null;
        pia stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (pia) (stackIn_2_0);
          }
          if (param1 != 28450) {
            stackIn_5_0 = (pia) null;
            return stackIn_5_0;
          }
          var2 = new pia(param0, fl.field_j, fd.field_D, lq.field_A, eha.field_s, hk.field_f, baa.field_P);
          al.b(-18073);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("cea.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    cea(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = param2;
        this.field_f = param1;
        int var4 = 65535 & this.field_f - this.field_e;
        int var5 = this.field_e - this.field_f & 65535;
        if (var4 <= var5) {
          this.field_g = (double)var4 / (double)this.field_c;
        } else {
          this.field_g = 0.0 - (double)var5 / (double)this.field_c;
        }
    }

    final int a(int param0, byte param1) {
        double var3 = 0.0;
        double var3Lifetime1;
        if (param1 == -52) {
          var3 = (double)this.field_e + (double)param0 * this.field_g;
          var3 = var3 % 65536.0;
          return (int)Math.round(var3);
        }
        field_b = (raa) null;
        var3Lifetime1 = (double)this.field_e + (double)param0 * this.field_g;
        var3Lifetime1 = var3Lifetime1 % 65536.0;
        return (int)Math.round(var3Lifetime1);
    }

    static {
        field_a = "You cannot add yourself!";
    }
}
