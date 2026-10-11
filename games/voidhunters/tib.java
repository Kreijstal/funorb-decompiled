/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tib extends eca {
    private String field_f;
    private boolean field_g;
    static mma field_h;
    static byte[] field_i;

    tib(uf param0) {
        super(param0);
        this.field_g = false;
    }

    final qrb a(String param0, int param1) {
        tpa var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qrb stackIn_3_0 = null;
        qrb stackIn_12_0 = null;
        qrb stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!oc.a(var4, 0)) {
            stackIn_3_0 = cca.field_o;
            return stackIn_3_0;
          }
          if (param1 != 16384) {
            field_i = (byte[]) null;
          }
          if (!param0.equals(this.field_f)) {
            var3 = qua.a(false, param0);
            if (var3 != null &&
              null == var3.field_f) {
              this.field_f = param0;
              this.field_g = var3.field_g;
            } else {
              stackIn_12_0 = dsa.field_q;
              return stackIn_12_0;
            }
          }
          if (this.field_g) {
            stackIn_17_0 = lea.field_o;
          } else {
            stackIn_17_0 = cca.field_o;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("tib.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        this.field_f = null;
        if (param0 < 7) {
          field_h = (mma) null;
        }
    }

    final String b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        tpa var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        Object stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = igb.a(var5, (byte) 119);
          if (var3 != null) {
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (!param0.equals(this.field_f)) {
            var4 = qua.a(false, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_f) {
              stackIn_13_0 = null;
              return (String) (stackIn_13_0);
            }
            this.field_g = var4.field_g;
            this.field_f = param0;
          }
          if (this.field_g) {
            stackIn_19_0 = uc.field_a;
            return stackIn_19_0;
          }
          stackIn_17_0 = ks.field_p;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("tib.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
          field_h = (mma) null;
          if (!li.field_i) {
            return ita.a(param1, 7988).field_k;
          }
          return de.a(param1, 300).field_c;
        }
        if (!li.field_i) {
          return ita.a(param1, 7988).field_k;
        }
        return de.a(param1, 300).field_c;
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -596) {
            field_h = (mma) null;
          }
          stackIn_3_0 = ua.a(true, param1, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tib.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 == 6312) {
          field_i = null;
          field_h = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        tib.a(46, (CharSequence) null, 2);
        field_i = null;
        field_h = null;
    }

    static {
        field_h = new mma();
    }
}
