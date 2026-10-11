/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends kca {
    private boolean field_k;
    private String field_j;

    tf(tra param0) {
        super(param0);
        this.field_k = false;
    }

    final it a(byte param0, String param1) {
        jua var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        it stackIn_4_0 = null;
        it stackIn_10_0 = null;
        it stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14) {
            this.field_j = (String) null;
          }
          var4 = (CharSequence) ((Object) param1);
          if (!pta.a(var4, 0)) {
            stackIn_4_0 = fp.field_c;
            return stackIn_4_0;
          }
          if (!param1.equals(this.field_j)) {
            var3 = hd.a(param0 ^ 112, param1);
            if (var3 != null &&
              var3.field_b == null) {
              this.field_j = param1;
              this.field_k = var3.field_e;
            } else {
              stackIn_10_0 = tea.field_b;
              return stackIn_10_0;
            }
          }
          if (this.field_k) {
            stackIn_15_0 = uh.field_k;
          } else {
            stackIn_15_0 = fp.field_c;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        jua var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = ina.a((byte) -16, var5);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_j)) {
            var4 = hd.a(120, param1);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_b) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_j = param1;
            this.field_k = var4.field_e;
          }
          if (!this.field_k) {
            stackIn_13_0 = qma.field_f;
            return stackIn_13_0;
          }
          if (param0 != -1) {
            this.field_k = false;
          }
          stackIn_17_0 = jla.field_B;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_j = null;
        if (param0 != -69) {
          this.b((byte) -119);
        }
    }

    static {
    }
}
