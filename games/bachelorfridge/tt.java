/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends aba {
    private String field_g;
    static String field_h;
    private boolean field_i;

    tt(lka param0) {
        super(param0);
        this.field_i = false;
    }

    final void d(int param0) {
        this.field_g = null;
        if (param0 >= -106) {
          this.field_i = false;
        }
    }

    public static void e(byte param0) {
        field_h = null;
        if (param0 != 84) {
          tt.e(110);
        }
    }

    final static String e(int param0) {
        if (ola.field_p == kq.field_j) {
          return sc.field_n;
        }
        if (!ut.field_m.a(false)) {
          return ut.field_m.b(25477);
        }
        if (param0 != 21240) {
          return (String) null;
        }
        if (kq.field_j == dka.field_G) {
          return ut.field_m.b(25477);
        }
        return dk.field_p;
    }

    final jg a(String param0, boolean param1) {
        eq var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!vq.a((byte) -60, var4)) {
            stackIn_3_0 = jt.field_f;
            return stackIn_3_0;
          }
          if (!param0.equals(this.field_g)) {
            var3 = du.a(param0, (byte) -43);
            if (var3 != null &&
              var3.field_g == null) {
              this.field_g = param0;
              this.field_i = var3.field_e;
            } else {
              stackIn_10_0 = ji.field_f;
              return stackIn_10_0;
            }
          }
          if (param1) {
            field_h = (String) null;
          }
          if (!this.field_i) {
            stackIn_17_0 = jt.field_f;
          } else {
            stackIn_17_0 = cm.field_u;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tt.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eq var4_ref_eq = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = hp.a(var5, 0);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_g)) {
            var4_ref_eq = du.a(param1, (byte) -43);
            if (var4_ref_eq == null) {
              return null;
            }
            if (null != var4_ref_eq.field_g) {
              return null;
            }
            this.field_i = var4_ref_eq.field_e;
            this.field_g = param1;
          }
          if (!this.field_i) {
            stackIn_12_0 = uga.field_A;
            return stackIn_12_0;
          }
          var4 = -59 % ((-8 - param0) / 45);
          stackIn_14_0 = su.field_a;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("tt.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_h = "Reload game";
    }
}
